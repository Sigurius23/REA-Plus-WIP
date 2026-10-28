package com.whoop.design.model;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/design/model/FeatureEducationInlineIcon;", "", "", "icon", "Ly81/f;", "color", "<init>", "(ILy81/f;)V", "component1", "()I", "component2", "()Ly81/f;", "copy", "(ILy81/f;)Lcom/whoop/design/model/FeatureEducationInlineIcon;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getIcon", "Ly81/f;", "getColor", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class FeatureEducationInlineIcon {
    public static final int $stable = 0;
    private final EnumC39333f color;
    private final int icon;

    public FeatureEducationInlineIcon(int i13, EnumC39333f color) {
        AbstractC22676k.m65750j(color, "color");
        this.icon = i13;
        this.color = color;
    }

    public static /* synthetic */ FeatureEducationInlineIcon copy$default(FeatureEducationInlineIcon featureEducationInlineIcon, int i13, EnumC39333f enumC39333f, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = featureEducationInlineIcon.icon;
        }
        if ((i14 & 2) != 0) {
            enumC39333f = featureEducationInlineIcon.color;
        }
        return featureEducationInlineIcon.copy(i13, enumC39333f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnumC39333f getColor() {
        return this.color;
    }

    public final FeatureEducationInlineIcon copy(int icon, EnumC39333f color) {
        AbstractC22676k.m65750j(color, "color");
        return new FeatureEducationInlineIcon(icon, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureEducationInlineIcon)) {
            return false;
        }
        FeatureEducationInlineIcon featureEducationInlineIcon = (FeatureEducationInlineIcon) other;
        return this.icon == featureEducationInlineIcon.icon && this.color == featureEducationInlineIcon.color;
    }

    public final EnumC39333f getColor() {
        return this.color;
    }

    public final int getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return this.color.hashCode() + (Integer.hashCode(this.icon) * 31);
    }

    public String toString() {
        return "FeatureEducationInlineIcon(icon=" + this.icon + ", color=" + this.color + ")";
    }
}
