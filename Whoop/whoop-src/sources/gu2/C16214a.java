package gu2;

import b91.C2886a;
import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: gu2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lgu2/a;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "text", "Ly81/e;", "textColor", "Lb91/a;", "textStyle", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Ly81/e;", "()Ly81/e;", "c", "Lb91/a;", "()Lb91/a;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16214a implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39332e textColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C2886a textStyle;

    public C16214a(TextResource text, InterfaceC39332e textColor, C2886a textStyle) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(textColor, "textColor");
        AbstractC22676k.m65750j(textStyle, "textStyle");
        this.text = text;
        this.textColor = textColor;
        this.textStyle = textStyle;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C2886a getTextStyle() {
        return this.textStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16214a)) {
            return false;
        }
        C16214a c16214a = (C16214a) other;
        return AbstractC22676k.m65745e(this.text, c16214a.text) && AbstractC22676k.m65745e(this.textColor, c16214a.textColor) && AbstractC22676k.m65745e(this.textStyle, c16214a.textStyle);
    }

    public int hashCode() {
        return this.textStyle.hashCode() + AbstractC33745d.m106648g(this.textColor, this.text.hashCode() * 31, 31);
    }

    public String toString() {
        return "TextItemState(text=" + this.text + ", textColor=" + this.textColor + ", textStyle=" + this.textStyle + ")";
    }
}
