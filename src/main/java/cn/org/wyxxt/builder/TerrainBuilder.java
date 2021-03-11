package cn.org.wyxxt.builder;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/11 9:33 上午
 * @email jsjxzw@163.com
 */
public interface TerrainBuilder {
    TerrainBuilder buildWall();

    TerrainBuilder buildFort();

    TerrainBuilder buildMine();

    Terrain build();
}
