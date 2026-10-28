package n81;

import b91.EnumC2888c;
import m81.C25231f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: n81.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ln81/d;", "", "Lm81/f;", "selected", "unselected", "Lb91/c;", "textStyle", "<init>", "(Lm81/f;Lm81/f;Lb91/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm81/f;", "()Lm81/f;", "b", "c", "Lb91/c;", "()Lb91/c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26451d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C25231f selected;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C25231f unselected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC2888c textStyle;

    public C26451d(C25231f selected, C25231f unselected, EnumC2888c textStyle) {
        AbstractC22676k.m65750j(selected, "selected");
        AbstractC22676k.m65750j(unselected, "unselected");
        AbstractC22676k.m65750j(textStyle, "textStyle");
        this.selected = selected;
        this.unselected = unselected;
        this.textStyle = textStyle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C25231f getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC2888c getTextStyle() {
        return this.textStyle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C25231f getUnselected() {
        return this.unselected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26451d)) {
            return false;
        }
        C26451d c26451d = (C26451d) other;
        return AbstractC22676k.m65745e(this.selected, c26451d.selected) && AbstractC22676k.m65745e(this.unselected, c26451d.unselected) && this.textStyle == c26451d.textStyle;
    }

    public int hashCode() {
        return this.textStyle.hashCode() + ((this.unselected.hashCode() + (this.selected.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "TagSelectorStyle(selected=" + this.selected + ", unselected=" + this.unselected + ", textStyle=" + this.textStyle + ")";
    }

    public /* synthetic */ C26451d(C25231f c25231f, C25231f c25231f2, EnumC2888c enumC2888c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C25231f(EnumC39333f.BRAND_BLACK, EnumC39333f.BRAND_WHITE, EnumC39333f.BLACK_50, null, 0.0f, 0.0f, 56, null) : c25231f, (i13 & 2) != 0 ? new C25231f(EnumC39333f.BRAND_WHITE, EnumC39333f.WHITE_10, EnumC39333f.WHITE_50, null, 0.0f, 0.0f, 56, null) : c25231f2, (i13 & 4) != 0 ? EnumC2888c.B1 : enumC2888c);
    }
}
