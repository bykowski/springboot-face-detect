package pl.bykowski.springbootfacedetect;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import pl.bykowski.springbootfacedetect.model.FaceObject;


@Route
public class FaceGui extends VerticalLayout {


    public FaceGui(FaceApiClient faceApiClient) {

        TextField textField = new TextField("Image:");
        Button button = new Button("Show info");
        Grid<FaceObject> grid = new Grid<>(FaceObject.class);
        grid.removeAllColumns();
        button.addClickListener(click -> {
            grid.setItems(faceApiClient.getInfoByPhotoUrl(textField.getValue()));
            grid.addColumn(c -> c.getFaceAttributes().getGender()).setHeader("Gender");
            grid.addColumn(c -> c.getFaceAttributes().getAge()).setHeader("Age");
            grid.addColumn(c -> c.getFaceAttributes().getEmotion()).setHeader("Emotion").setWidth("1000px");
            Image image = new Image(textField.getValue(), textField.getValue());
            add(image);
        });
        add(textField, button, grid);
    }
}
