package so1;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: so1.y */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lso1/y;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "subtitleDisplay", "descriptionDisplay", "Ly81/e;", "style", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "c", "d", "Ly81/e;", "()Ly81/e;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32841y implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtitleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource descriptionDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC39332e style;

    public C32841y(TextResource titleDisplay, TextResource textResource, TextResource textResource2, InterfaceC39332e style) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(style, "style");
        this.titleDisplay = titleDisplay;
        this.subtitleDisplay = textResource;
        this.descriptionDisplay = textResource2;
        this.style = style;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32841y)) {
            return false;
        }
        C32841y c32841y = (C32841y) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c32841y.titleDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, c32841y.subtitleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, c32841y.descriptionDisplay) && AbstractC22676k.m65745e(this.style, c32841y.style);
    }

    public int hashCode() {
        int iHashCode = this.titleDisplay.hashCode() * 31;
        TextResource textResource = this.subtitleDisplay;
        int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.descriptionDisplay;
        return this.style.hashCode() + ((iHashCode2 + (textResource2 != null ? textResource2.hashCode() : 0)) * 31);
    }

    public String toString() {
        TextResource textResource = this.titleDisplay;
        TextResource textResource2 = this.subtitleDisplay;
        TextResource textResource3 = this.descriptionDisplay;
        InterfaceC39332e interfaceC39332e = this.style;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("MciHeaderState(titleDisplay=", textResource, ", subtitleDisplay=", textResource2, ", descriptionDisplay=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", style=");
        sbM106658q.append(interfaceC39332e);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
