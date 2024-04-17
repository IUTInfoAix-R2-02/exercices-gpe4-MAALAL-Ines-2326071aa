package fr.amu.iut.exercice6;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IHMPendu extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        VBox verticale = new VBox();
        verticale.setSpacing(5);

        Button a = new Button("a");
        Button e = new Button("e");
        Button i = new Button("i");
        Button o = new Button("o");
        Button u = new Button("u");
        Button y = new Button("y");
        HBox horizontale = new HBox();
        horizontale.getChildren().addAll(a,e,i,o,u,y);
        horizontale.setAlignment(Pos.CENTER);
        horizontale.setSpacing(5);
        a.setPrefWidth(32);
        e.setPrefWidth(32);
        i.setPrefWidth(32);
        o.setPrefWidth(32);
        u.setPrefWidth(32);
        y.setPrefWidth(32);
        a.setPrefHeight(32);
        e.setPrefHeight(32);
        i.setPrefHeight(32);
        o.setPrefHeight(32);
        u.setPrefHeight(32);
        y.setPrefHeight(32);

        Button b = new Button("b");
        Button c = new Button("c");
        Button d = new Button("d");
        Button f = new Button("f");
        Button g = new Button("g");
        Button h = new Button("h");
        Button j = new Button("j");
        Button k = new Button("k");
        Button l = new Button("l");
        Button m = new Button("m");
        HBox horizontale2 = new HBox();
        horizontale2.getChildren().addAll(b,c,d,f,g,h,j,k,l,m);
        horizontale2.setAlignment(Pos.CENTER);
        horizontale2.setSpacing(5);

        b.setPrefWidth(32);
        c.setPrefWidth(32);
        d.setPrefWidth(32);
        f.setPrefWidth(32);
        g.setPrefWidth(32);
        h.setPrefWidth(32);
        j.setPrefWidth(32);
        k.setPrefWidth(32);
        l.setPrefWidth(32);
        m.setPrefWidth(32);
        b.setPrefHeight(32);
        c.setPrefHeight(32);
        d.setPrefHeight(32);
        f.setPrefHeight(32);
        g.setPrefHeight(32);
        h.setPrefHeight(32);
        j.setPrefHeight(32);
        k.setPrefHeight(32);
        l.setPrefHeight(32);
        m.setPrefHeight(32);

        Button n = new Button("n");
        Button p = new Button("p");
        Button q = new Button("q");
        Button r = new Button("r");
        Button s = new Button("s");
        Button t = new Button("t");
        Button v = new Button("v");
        Button w = new Button("w");
        Button x = new Button("x");
        Button z = new Button("z");


        HBox horizontale3 = new HBox();
        horizontale3.getChildren().addAll(n,p,q,r,s,t,v,w,x,z);
        horizontale3.setAlignment(Pos.CENTER);
        horizontale3.setSpacing(5);
        n.setPrefWidth(32);
        p.setPrefWidth(32);
        q.setPrefWidth(32);
        r.setPrefWidth(32);
        s.setPrefWidth(32);
        t.setPrefWidth(32);
        v.setPrefWidth(32);
        w.setPrefWidth(32);
        x.setPrefWidth(32);
        z.setPrefWidth(32);
        n.setPrefHeight(32);
        p.setPrefHeight(32);
        q.setPrefHeight(32);
        r.setPrefHeight(32);
        s.setPrefHeight(32);
        t.setPrefHeight(32);
        v.setPrefHeight(32);
        w.setPrefHeight(32);
        x.setPrefHeight(32);
        z.setPrefHeight(32);


        HBox horizontale4 = new HBox();
        Button Rejouer = new Button("Rejouer");
        horizontale4.getChildren().addAll(Rejouer);
        horizontale4.setAlignment(Pos.CENTER);
        horizontale4.setPadding(new Insets(10,0,15,0));
        Rejouer.setPrefHeight(32);

        HBox horizontale5 = new HBox();
        Button rep = new Button();
        horizontale5.getChildren().addAll(rep);
        horizontale5.setAlignment(Pos.CENTER);
        horizontale5.setPadding(new Insets(10,0,15,0));
        rep.setPrefHeight(32);
        rep.setPrefWidth(152);


        HBox horizontale6 = new HBox();
        Dico newDic=new Dico();
        String motCache= newDic.getMot();
        String motCacheAffiche="";
        for(int I=0;I<motCache.length();I++){
            motCacheAffiche += "*";
        }
        Label etique=new Label(motCacheAffiche);
        etique.setStyle("-fx-font-size: 28px;");

        horizontale6.getChildren().addAll(etique);
        horizontale6.setAlignment(Pos.TOP_CENTER);

        // descinmeter le nb de vies 
        //HBox horizontale7 = new HBox();
        //Dico newDic=new Dico();
        //String motCache= newDic.getMot();
        //for(int I=0;I<motCache.length();I--){
         //   if
           // motCacheAffiche += "Nombre de vies : ";
        //}
        //Label etique=new Label(motCacheAffiche);
        //etique.setStyle("-fx-font-size: 28px;");

        //horizontale7.getChildren().addAll(etique);
        //horizontale7.setAlignment(Pos.TOP_CENTER);




        verticale.getChildren().addAll(horizontale6,horizontale5,horizontale,horizontale2,horizontale3,horizontale4);
        root.setBottom(verticale);
        primaryStage.setTitle("Jeu du pendu");
        primaryStage.setWidth(500);
        primaryStage.setHeight(550);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        root.setStyle("-fx-background-color: GREY");

        // A completer

        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
