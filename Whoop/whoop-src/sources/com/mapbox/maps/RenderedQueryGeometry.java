package com.mapbox.maps;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RenderedQueryGeometry {
    private Type type;
    private Object value;

    /* JADX INFO: loaded from: classes6.dex */
    public enum Type {
        SCREEN_BOX,
        SCREEN_COORDINATE,
        LIST
    }

    public RenderedQueryGeometry(ScreenBox screenBox) {
        this.type = Type.SCREEN_BOX;
        this.value = screenBox;
    }

    public static RenderedQueryGeometry valueOf(ScreenBox screenBox) {
        return new RenderedQueryGeometry(screenBox);
    }

    public List<ScreenCoordinate> getList() {
        if (isList()) {
            return (List) this.value;
        }
        throw new IllegalStateException("The content of the variant does not have type (List<ScreenCoordinate>)");
    }

    public ScreenBox getScreenBox() {
        if (isScreenBox()) {
            return (ScreenBox) this.value;
        }
        throw new IllegalStateException("The content of the variant does not have type (ScreenBox)");
    }

    public ScreenCoordinate getScreenCoordinate() {
        if (isScreenCoordinate()) {
            return (ScreenCoordinate) this.value;
        }
        throw new IllegalStateException("The content of the variant does not have type (ScreenCoordinate)");
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isList() {
        return this.type == Type.LIST;
    }

    public boolean isScreenBox() {
        return this.type == Type.SCREEN_BOX;
    }

    public boolean isScreenCoordinate() {
        return this.type == Type.SCREEN_COORDINATE;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static RenderedQueryGeometry valueOf(ScreenCoordinate screenCoordinate) {
        return new RenderedQueryGeometry(screenCoordinate);
    }

    public static RenderedQueryGeometry valueOf(List<ScreenCoordinate> list) {
        return new RenderedQueryGeometry(list);
    }

    public RenderedQueryGeometry(ScreenCoordinate screenCoordinate) {
        this.type = Type.SCREEN_COORDINATE;
        this.value = screenCoordinate;
    }

    public RenderedQueryGeometry(List<ScreenCoordinate> list) {
        this.type = Type.LIST;
        this.value = list;
    }
}
