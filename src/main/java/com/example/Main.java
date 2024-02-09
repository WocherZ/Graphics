package com.example;

import com.madgag.gif.fmsware.AnimatedGifEncoder;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javafx.util.Duration;


public class Main extends Application {

    private static int WIDTH = 600;
    private static int HEIGHT = 600;

    private AnimatedGifEncoder gifEncoder;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException, InterruptedException {
        primaryStage.setTitle("Компьютерная графика");

        // Создаем холст
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        StackPane layout = new StackPane(canvas);
        Scene scene = new Scene(layout, WIDTH, HEIGHT);

        // Настраиваем контекст графики
        DrawingUtils drawingUtils = new DrawingUtils(canvas.getGraphicsContext2D(), canvas);

        DrawingUtils3D drawingUtils3D = new DrawingUtils3D(drawingUtils);

        // Лабораторная работа 1. Вычерчивание отрезков прямых. Заполнение полигонов.

        // 1. Вычерчивание отрезка прямой линии
        drawingUtils.drawLine(300, 300, 500, 500, RGBPIXEL.BLUE);

        // 2. Вывод на экран полигона
//        List<Point> polygonPoints = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i < 5; i++) {
//            polygonPoints.add(new Point(random.nextInt(400) + 100, random.nextInt(400) + 100));
//        }
//        drawingUtils.drawPoligon(polygonPoints, RGBPIXEL.GREEN);

        // 3.1 Проверка простой или сложный полигон
//        boolean isSimple = DrawingUtils.isSimplePolygon(polygonPoints);
//        System.out.println("Является ли многоугольник простым? " + isSimple);

        // 3.2 Проверка выпуклиый или невыпуклый полигон
//        boolean isConvex = DrawingUtils.isConvexPolygon(polygonPoints);
//        System.out.println("Является ли многоугольник выпуклым? " + isConvex);

        // 4.1 Заполнение полигона
//        drawingUtils.colorPolygon(polygonPoints, RGBPIXEL.RED, true);

        // 4.2 Определение прнадлежности пикселя полигону
//        Point testPoint = new Point(300, 300);
//        drawingUtils.setPixel(testPoint, new RGBPIXEL(0, 0, 0));
//        boolean isInside = DrawingUtils.isPointInPolygon(polygonPoints, testPoint, true);
//        System.out.println("Принадлежит ли пиксел полигону? " + isInside);

        // Лабораторная работа 2. Построение кривых. Алгоритмы отсечения

        // 1. Построение кривой Безье 3-го порядка
//        drawingUtils.bezierCurve(List.of(new Point(100, 100), new Point(150, 200), new Point(200, 50), new Point(300, 100)), RGBPIXEL.GREEN);

        // 2. Отсечение отрезков
//        List<Point> rectangle = Arrays.asList(new Point(250, 250), new Point(350, 400), new Point(550, 350), new Point(450, 200));
//
//        drawingUtils.drawPoligon(rectangle, RGBPIXEL.RED);

        // Случай 1 - пересекает полигон
//        Point start_1 = new Point(100, 250);
//        Point end_1 = new Point(580, 330);
//
//        drawingUtils.drawLine(start_1, end_1, RGBPIXEL.GREEN);
//        drawingUtils.cuttingAlgorithmSB(
//                rectangle,
//                start_1,
//                end_1,
//                RGBPIXEL.BLUE
//        );

        // Случай 2 - внутри полигона
//        Point start_2 = new Point(330, 240);
//        Point end_2 =  new Point(500, 300);
//
//        drawingUtils.drawLine(start_2, end_2, RGBPIXEL.GREEN);
//        drawingUtils.cuttingAlgorithmSB(
//                rectangle,
//                start_2,
//                end_2,
//                RGBPIXEL.BLUE
//        );

        // Случай 3 - вне полигона
//        Point start_3 = new Point(50, 350);
//        Point end_3 = new Point(350, 400);
//
//        drawingUtils.drawLine(start_3, end_3, RGBPIXEL.GREEN);
//        drawingUtils.cuttingAlgorithmSB(
//                rectangle,
//                start_3,
//                end_3,
//                RGBPIXEL.BLUE
//        );

        // Доп. Построение кривой Безье 2-го порядка
//        drawingUtils.bezierCurve(List.of(new Point(50, 100), new Point(150, 200), new Point(250, 100)), RGBPIXEL.BLUE);

        // Доп. Построение кривой Безье 4-го порядка
//       drawingUtils.bezierCurve(List.of(new Point(100, 100), new Point(100, 200), new Point(200, 50), new Point(300, 200), new Point(400, 100)), RGBPIXEL.RED);


        // Лабораторная работа 3. Преобразования и способы проецирования трехмерных объектов.

        // 1. Построения параллельной проекции повернутого параллелепипеда на плоскость Z=0.
//        Parallelepiped parallelepiped = drawingUtils3D.createParallelepiped(new Point3D(250, 250, 250), 200, 200, 200);
//        drawingUtils3D.rotate(parallelepiped, Math.PI / 8, parallelepiped.getCenter());
//        drawingUtils3D.drawAllBounds(parallelepiped, RGBPIXEL.GREEN);

        // 2. Построения одноточечной перспективной проекции повернутого параллелепипеда.
//        drawingUtils3D.drawOnePointProjection(parallelepiped, 0.01, RGBPIXEL.RED);

        // 3. Удаления невидимых ребер "проволочной" модели параллелепипеда.
//        drawingUtils3D.drawWithoutVisibleEdges(parallelepiped, RGBPIXEL.BLACK);

        // 4. Анимация вращения параллелепипеда
//        String fileForSave = "anim.gif"; // Файл, в который сохранится анимация
//
//        gifEncoder = new AnimatedGifEncoder();
//        gifEncoder.start(Files.newOutputStream(Paths.get(fileForSave)));
//        gifEncoder.setRepeat(0);
//
//        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(100), event -> {
//            drawingUtils.getGc().setFill(javafx.scene.paint.Color.WHITE);
//            drawingUtils.getGc().fillRect(0, 0, drawingUtils.getCanvas().getWidth(), drawingUtils.getCanvas().getHeight());
//
//            drawingUtils3D.rotate(parallelepiped, Math.PI / 100, parallelepiped.getCenter());
//            drawingUtils3D.drawAllBounds(parallelepiped, RGBPIXEL.BLUE);
//
//            WritableImage snapshot = drawingUtils.getCanvas().snapshot(null, null);
//            BufferedImage image = SwingFXUtils.fromFXImage(snapshot, null);
//            gifEncoder.addFrame(image);
//        }));
//        timeline.setCycleCount(40);
//        timeline.play();


        // Домашнее задание
        // 1. Нахождение полигона, который является внешним контуром объединения двух выпуклых полигонов
//        List<Point> polygonPoints1 = List.of(new Point(100, 100), new Point(200, 100),
//                new Point(200, 300), new Point(150, 350), new Point(100, 400));
//        drawingUtils.drawPoligon(polygonPoints1, RGBPIXEL.GREEN);
//
//        List<Point> polygonPoints2 = List.of(new Point(50, 50), new Point(130, 50),
//                new Point(300, 300), new Point(150, 450), new Point(50, 400));
//        drawingUtils.drawPoligon(polygonPoints2, RGBPIXEL.BLUE);
//
//        List<Point> polygonPoints3 = drawingUtils.findExternalPolygon(polygonPoints1, polygonPoints2);
//        drawingUtils.drawPoligon(polygonPoints3, RGBPIXEL.RED);

        // 2. Построение составной кубической кривой Безье
//        List<Point> pointsList1 = List.of(new Point(100, 100), new Point(120, 150), new Point(150, 150));
//        List<Point> pointsList2 = List.of(new Point(150, 150), new Point(175, 200), new Point(300, 300));
//        drawingUtils.compositeBezierCurve(List.of(pointsList1, pointsList2), RGBPIXEL.GREEN);


        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void stop() throws Exception {
        super.stop();
        gifEncoder.finish();
    }
}