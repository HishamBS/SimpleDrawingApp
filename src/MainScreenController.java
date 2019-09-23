/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

/**
 *
 * @author MSI GT72 DRAGON
 */
public class MainScreenController implements Initializable
{
    
    
    @FXML
    private TextField Line_BX;
    @FXML
    private TextField Line_EY;
    @FXML
    private TextField Line_EX;
    @FXML
    private TextField Line_BY;
    @FXML
    private Button Line_DRAW;
    @FXML
    private Button CLL;
    @FXML
    private Canvas canvas;
    @FXML
    private ColorPicker Line_CP;
    @FXML
    private ColorPicker Rect_CP;
    @FXML
    private Button Rect_DRAW;
    @FXML
    private TextField Rect_Y;
    @FXML
    private TextField Rect_WIDTH;
    @FXML
    private TextField Rect_HEIGHT;
    @FXML
    private TextField Rect_X;
    
    @FXML
    private ColorPicker Polyline_CP;
    @FXML
    private Button Polyline_DRAW;
    @FXML
    private Button Polygon_DRAW;
    @FXML
    private ColorPicker Polygon_CP;
    
    @FXML
    private TextField Polyline_X1;
    @FXML
    private TextField Polyline_Y1;
    @FXML
    private TextField Polyline_Y2;
    @FXML
    private TextField Polyline_X2;
    @FXML
    private TextField Polyline_Y3;
    @FXML
    private TextField Polyline_X3;
    @FXML
    private TextField Polyline_X4;
    @FXML
    private TextField Polyline_Y4;
    @FXML
    private TextField Polygon_Y4;
    @FXML
    private TextField Polygon_X4;
    @FXML
    private TextField Polygon_X3;
    @FXML
    private TextField Polygon_Y3;
    @FXML
    private TextField Polygon_X2;
    @FXML
    private TextField Polygon_Y2;
    @FXML
    private TextField Polygon_Y1;
    @FXML
    private TextField Polygon_X1;
    @FXML
    private TextField Triangle_X1;
    @FXML
    private TextField Triangle_Y1;
    @FXML
    private TextField Triangle_Y2;
    @FXML
    private TextField Triangle_X2;
    @FXML
    private TextField Triangle_Y3;
    @FXML
    private TextField Triangle_X3;
    @FXML
    private ColorPicker Triangle_CP;
    @FXML
    private Button Triangle_DRAW;
    
    
    
    @FXML
    private void drawLine(ActionEvent event)
    {
        double bx = Double.parseDouble(Line_BX.getText());
        double by = Double.parseDouble(Line_BY.getText());
        double ex = Double.parseDouble(Line_EX.getText());
        double ey = Double.parseDouble(Line_EY.getText());
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(5);
        gc.setStroke(Line_CP.getValue());
        gc.strokeLine(bx,by,ex,ey);
    }
    
    @FXML
    private void drawRect(ActionEvent event)
    {
        double x = Double.parseDouble(Rect_X.getText());
        double y = Double.parseDouble(Rect_Y.getText());
        double w = Double.parseDouble(Rect_WIDTH.getText());
        double h = Double.parseDouble(Rect_HEIGHT.getText());
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(5);
//        gc.setStroke(Rect_CP.getValue()); this is used to make it without filling
//        gc.strokeRect(x, y, w, h);
        gc.setFill(Rect_CP.getValue());
        gc.fillRect(x, y, w, h);
        
    }
    
        
    
    @FXML
    private void drawPolyline(ActionEvent event)
    {
        double [] xPL = new double[4];
        double [] yPL = new double[4];
        
        xPL[0] = Double.parseDouble(Polyline_X1.getText());
        xPL[1] = Double.parseDouble(Polyline_X2.getText());
        xPL[2] = Double.parseDouble(Polyline_X3.getText());
        xPL[3] = Double.parseDouble(Polyline_X4.getText());
        yPL[0] = Double.parseDouble(Polyline_Y1.getText());
        yPL[1] = Double.parseDouble(Polyline_Y2.getText());
        yPL[2] = Double.parseDouble(Polyline_Y3.getText());
        yPL[3] = Double.parseDouble(Polyline_Y4.getText());
        
        
        
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(5);
        gc.setStroke(Polyline_CP.getValue());
        gc.strokePolyline(xPL, yPL, 4);
        
    }
    
    
    @FXML
    private void drawPolygon(ActionEvent event)
    {
        double [] xPG = new double[4];
        double [] yPG = new double[4];
        
        xPG[0] = Double.parseDouble(Polygon_X1.getText());
        xPG[1] = Double.parseDouble(Polygon_X2.getText());
        xPG[2] = Double.parseDouble(Polygon_X3.getText());
        xPG[3] = Double.parseDouble(Polygon_X4.getText());
        yPG[0] = Double.parseDouble(Polygon_Y1.getText());
        yPG[1] = Double.parseDouble(Polygon_Y2.getText());
        yPG[2] = Double.parseDouble(Polygon_Y3.getText());
        yPG[3] = Double.parseDouble(Polygon_Y4.getText());
        
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(5);
//        gc.setStroke(Polygon_CP.getValue());
//        gc.strokePolygon(xPG, yPG, 4);
        gc.setFill(Polygon_CP.getValue());
        gc.fillPolygon(xPG, yPG, 4);
        
    }
    
    @FXML
    private void drawTriangle(ActionEvent event)
    {
        double [] xT = new double[4];
        double [] yT = new double[4];
        
        xT[0] = Double.parseDouble(Triangle_X1.getText());
        xT[1] = Double.parseDouble(Triangle_X2.getText());
        xT[2] = Double.parseDouble(Triangle_X3.getText());
        yT[0] = Double.parseDouble(Triangle_Y1.getText());
        yT[1] = Double.parseDouble(Triangle_Y2.getText());
        yT[2] = Double.parseDouble(Triangle_Y3.getText());
        
        
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(5);
//        gc.setStroke(Polygon_CP.getValue());
//        gc.strokePolygon(xPG, yPG, 4);
        gc.setFill(Triangle_CP.getValue());
        gc.fillPolygon(xT, yT, 3);
        
    }
    
    @FXML
    private void clearCanvas(ActionEvent event)
    {
        
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
