package t71;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: t71.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001f"}, m65681d2 = {"Lt71/b;", "", "", "icon", "Ly81/e;", "iconColor", "Lcom/whoop/design/util/TextResource;", "text", "textColor", "backgroundIconColor", "<init>", "(ILy81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ly81/e;", "c", "()Ly81/e;", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "e", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33565b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39332e iconColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC39332e textColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC39332e backgroundIconColor;

    public C33565b(int i13, InterfaceC39332e iconColor, TextResource text, InterfaceC39332e textColor, InterfaceC39332e backgroundIconColor) {
        AbstractC22676k.m65750j(iconColor, "iconColor");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(textColor, "textColor");
        AbstractC22676k.m65750j(backgroundIconColor, "backgroundIconColor");
        this.icon = i13;
        this.iconColor = iconColor;
        this.text = text;
        this.textColor = textColor;
        this.backgroundIconColor = backgroundIconColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC39332e getBackgroundIconColor() {
        return this.backgroundIconColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC39332e getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC39332e getTextColor() {
        return this.textColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33565b)) {
            return false;
        }
        C33565b c33565b = (C33565b) other;
        return this.icon == c33565b.icon && AbstractC22676k.m65745e(this.iconColor, c33565b.iconColor) && AbstractC22676k.m65745e(this.text, c33565b.text) && AbstractC22676k.m65745e(this.textColor, c33565b.textColor) && AbstractC22676k.m65745e(this.backgroundIconColor, c33565b.backgroundIconColor);
    }

    public int hashCode() {
        return this.backgroundIconColor.hashCode() + AbstractC33745d.m106648g(this.textColor, AbstractC31061c.m95625a(AbstractC33745d.m106648g(this.iconColor, Integer.hashCode(this.icon) * 31, 31), this.text, 31), 31);
    }

    public String toString() {
        return "HeaderState(icon=" + this.icon + ", iconColor=" + this.iconColor + ", text=" + this.text + ", textColor=" + this.textColor + ", backgroundIconColor=" + this.backgroundIconColor + ")";
    }
}
