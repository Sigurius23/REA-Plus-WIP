package tl0;

import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: tl0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, m65681d2 = {"Ltl0/c;", "Lm91/u;", "Lkd1/o;", "icon", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "value", "Ly81/e;", "valueColor", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "()Lkd1/o;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "d", "e", "Ly81/e;", "()Ly81/e;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33916c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource value;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC39332e valueColor;

    public C33916c(AbstractC22403o icon, TextResource title, TextResource subtitle, TextResource value, InterfaceC39332e valueColor) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(valueColor, "valueColor");
        this.icon = icon;
        this.title = title;
        this.subtitle = subtitle;
        this.value = value;
        this.valueColor = valueColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC39332e getValueColor() {
        return this.valueColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33916c)) {
            return false;
        }
        C33916c c33916c = (C33916c) other;
        return AbstractC22676k.m65745e(this.icon, c33916c.icon) && AbstractC22676k.m65745e(this.title, c33916c.title) && AbstractC22676k.m65745e(this.subtitle, c33916c.subtitle) && AbstractC22676k.m65745e(this.value, c33916c.value) && AbstractC22676k.m65745e(this.valueColor, c33916c.valueColor);
    }

    public int hashCode() {
        return this.valueColor.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.icon.hashCode() * 31, this.title, 31), this.subtitle, 31), this.value, 31);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.icon;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        TextResource textResource3 = this.value;
        InterfaceC39332e interfaceC39332e = this.valueColor;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("AdditionalContextViewState(icon=", textResource, abstractC22403o, ", title=", ", subtitle=");
        AbstractC30007c.m91855y(sbM114683k, textResource2, ", value=", textResource3, ", valueColor=");
        sbM114683k.append(interfaceC39332e);
        sbM114683k.append(")");
        return sbM114683k.toString();
    }
}
