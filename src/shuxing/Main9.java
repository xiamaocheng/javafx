package shuxing;


/**
 * Created by Administrator on 2018/6/22 0022.
 * 下面这些javafx.*下面的API都是JDK8、JRE8中内置好的，直接调用即可
 */

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class Main9 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        ObservableList<String> observableList = FXCollections.observableList(list);
        observableList.addListener(new ListChangeListener() {
            @Override
            public void onChanged(ListChangeListener.Change change) {
                System.out.println("有修改操作!");
            }
        });
        observableList.add("item one");
        list.add("item two");
        System.out.println("Size: " + observableList.size());

    }
}
//更多请阅读：https://www.yiibai.com/javafx/javafx_collections.html


