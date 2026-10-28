package com.whoop.design.model;

import b91.C2886a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Lcom/whoop/design/model/ScreenTextStyle;", "", "Lb91/a;", "name", "Ly81/f;", "color", "<init>", "(Lb91/a;Ly81/f;)V", "component1", "()Lb91/a;", "component2", "()Ly81/f;", "copy", "(Lb91/a;Ly81/f;)Lcom/whoop/design/model/ScreenTextStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lb91/a;", "getName", "Ly81/f;", "getColor", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ScreenTextStyle {
    public static final int $stable = 8;
    private final EnumC39333f color;
    private final C2886a name;

    public ScreenTextStyle(C2886a name, EnumC39333f color) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(color, "color");
        this.name = name;
        this.color = color;
    }

    public static /* synthetic */ ScreenTextStyle copy$default(ScreenTextStyle screenTextStyle, C2886a c2886a, EnumC39333f enumC39333f, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c2886a = screenTextStyle.name;
        }
        if ((i13 & 2) != 0) {
            enumC39333f = screenTextStyle.color;
        }
        return screenTextStyle.copy(c2886a, enumC39333f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final C2886a getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnumC39333f getColor() {
        return this.color;
    }

    public final ScreenTextStyle copy(C2886a name, EnumC39333f color) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(color, "color");
        return new ScreenTextStyle(name, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenTextStyle)) {
            return false;
        }
        ScreenTextStyle screenTextStyle = (ScreenTextStyle) other;
        return AbstractC22676k.m65745e(this.name, screenTextStyle.name) && this.color == screenTextStyle.color;
    }

    public final EnumC39333f getColor() {
        return this.color;
    }

    public final C2886a getName() {
        return this.name;
    }

    public int hashCode() {
        return this.color.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return "ScreenTextStyle(name=" + this.name + ", color=" + this.color + ")";
    }
}
