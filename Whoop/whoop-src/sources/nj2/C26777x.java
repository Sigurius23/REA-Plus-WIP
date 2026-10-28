package nj2;

import com.whoop.design.util.TextResource;
import hy0.EnumC17727b2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: nj2.x */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006!"}, m65681d2 = {"Lnj2/x;", "", "Lcom/whoop/design/util/TextResource;", "title", "change", "Lhy0/b2;", "trendTypeState", "Ly81/e;", "labelColor", "labelText", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ly81/e;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Lhy0/b2;", "e", "()Lhy0/b2;", "Ly81/e;", "()Ly81/e;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26777x {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource change;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC17727b2 trendTypeState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC39332e labelColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource labelText;

    public C26777x(TextResource title, TextResource textResource, EnumC17727b2 enumC17727b2, InterfaceC39332e labelColor, TextResource labelText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(labelColor, "labelColor");
        AbstractC22676k.m65750j(labelText, "labelText");
        this.title = title;
        this.change = textResource;
        this.trendTypeState = enumC17727b2;
        this.labelColor = labelColor;
        this.labelText = labelText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getChange() {
        return this.change;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getLabelColor() {
        return this.labelColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getLabelText() {
        return this.labelText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC17727b2 getTrendTypeState() {
        return this.trendTypeState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26777x)) {
            return false;
        }
        C26777x c26777x = (C26777x) other;
        return AbstractC22676k.m65745e(this.title, c26777x.title) && AbstractC22676k.m65745e(this.change, c26777x.change) && this.trendTypeState == c26777x.trendTypeState && AbstractC22676k.m65745e(this.labelColor, c26777x.labelColor) && AbstractC22676k.m65745e(this.labelText, c26777x.labelText);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        TextResource textResource = this.change;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        EnumC17727b2 enumC17727b2 = this.trendTypeState;
        return this.labelText.hashCode() + AbstractC33745d.m106648g(this.labelColor, (iHashCode2 + (enumC17727b2 != null ? enumC17727b2.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.change;
        EnumC17727b2 enumC17727b2 = this.trendTypeState;
        InterfaceC39332e interfaceC39332e = this.labelColor;
        TextResource textResource3 = this.labelText;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("StressTrendStatState(title=", textResource, ", change=", textResource2, ", trendTypeState=");
        sbM106658q.append(enumC17727b2);
        sbM106658q.append(", labelColor=");
        sbM106658q.append(interfaceC39332e);
        sbM106658q.append(", labelText=");
        return AbstractC30007c.m91841k(sbM106658q, textResource3, ")");
    }
}
