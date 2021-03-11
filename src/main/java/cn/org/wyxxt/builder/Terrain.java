package cn.org.wyxxt.builder;

/**
 * 地形
 *
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/11 9:31 上午
 * @email jsjxzw@163.com
 */
public class Terrain {
    Wall w; //墙
    Fort f; //暗堡
    Mine m; //地雷
}

class Wall {
    int x, y, w, j;

    public Wall(int x, int y, int w, int j) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.j = j;
    }
}


class Fort {
    int x, y, w, h;

    public Fort(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}

class Mine {
    int x, y, w, h;

    public Mine(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}