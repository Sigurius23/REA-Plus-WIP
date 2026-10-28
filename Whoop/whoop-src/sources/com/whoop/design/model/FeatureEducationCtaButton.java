package com.whoop.design.model;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, m65681d2 = {"Lcom/whoop/design/model/FeatureEducationCtaButton;", "", "Ly81/f;", "color", "Lcom/whoop/design/util/TextResource;", "text", "Lcom/whoop/design/model/CtaNavigationDestination;", "clickAction", "<init>", "(Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/model/CtaNavigationDestination;)V", "component1", "()Ly81/f;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "()Lcom/whoop/design/model/CtaNavigationDestination;", "copy", "(Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/model/CtaNavigationDestination;)Lcom/whoop/design/model/FeatureEducationCtaButton;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ly81/f;", "getColor", "Lcom/whoop/design/util/TextResource;", "getText", "Lcom/whoop/design/model/CtaNavigationDestination;", "getClickAction", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class FeatureEducationCtaButton {
    public static final int $stable = 0;
    private final CtaNavigationDestination clickAction;
    private final EnumC39333f color;
    private final TextResource text;

    public FeatureEducationCtaButton(EnumC39333f color, TextResource text, CtaNavigationDestination ctaNavigationDestination) {
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(text, "text");
        this.color = color;
        this.text = text;
        this.clickAction = ctaNavigationDestination;
    }

    public static /* synthetic */ FeatureEducationCtaButton copy$default(FeatureEducationCtaButton featureEducationCtaButton, EnumC39333f enumC39333f, TextResource textResource, CtaNavigationDestination ctaNavigationDestination, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC39333f = featureEducationCtaButton.color;
        }
        if ((i13 & 2) != 0) {
            textResource = featureEducationCtaButton.text;
        }
        if ((i13 & 4) != 0) {
            ctaNavigationDestination = featureEducationCtaButton.clickAction;
        }
        return featureEducationCtaButton.copy(enumC39333f, textResource, ctaNavigationDestination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC39333f getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CtaNavigationDestination getClickAction() {
        return this.clickAction;
    }

    public final FeatureEducationCtaButton copy(EnumC39333f color, TextResource text, CtaNavigationDestination clickAction) {
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(text, "text");
        return new FeatureEducationCtaButton(color, text, clickAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureEducationCtaButton)) {
            return false;
        }
        FeatureEducationCtaButton featureEducationCtaButton = (FeatureEducationCtaButton) other;
        return this.color == featureEducationCtaButton.color && AbstractC22676k.m65745e(this.text, featureEducationCtaButton.text) && this.clickAction == featureEducationCtaButton.clickAction;
    }

    public final CtaNavigationDestination getClickAction() {
        return this.clickAction;
    }

    public final EnumC39333f getColor() {
        return this.color;
    }

    public final TextResource getText() {
        return this.text;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.color.hashCode() * 31, this.text, 31);
        CtaNavigationDestination ctaNavigationDestination = this.clickAction;
        return iM95625a + (ctaNavigationDestination == null ? 0 : ctaNavigationDestination.hashCode());
    }

    public String toString() {
        return "FeatureEducationCtaButton(color=" + this.color + ", text=" + this.text + ", clickAction=" + this.clickAction + ")";
    }
}
