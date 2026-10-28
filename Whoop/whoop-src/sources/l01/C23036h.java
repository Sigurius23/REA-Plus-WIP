package l01;

import c41.C4092p2;
import kd1.AbstractC22403o;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: l01.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u001a\u0010#¨\u0006$"}, m65681d2 = {"Ll01/h;", "Lm91/u;", "", "description", "Lkd1/o;", "titleImage", "tierImage", "Lc41/p2;", "callout", "Lny0/h;", "cardButton", "<init>", "(Ljava/lang/String;Lkd1/o;Lkd1/o;Lc41/p2;Lny0/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lkd1/o;", "f", "()Lkd1/o;", "e", "d", "Lc41/p2;", "()Lc41/p2;", "Lny0/h;", "()Lny0/h;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23036h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o titleImage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o tierImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C4092p2 callout;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27256h cardButton;

    public C23036h(String description, AbstractC22403o titleImage, AbstractC22403o abstractC22403o, C4092p2 callout, C27256h cardButton) {
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(titleImage, "titleImage");
        AbstractC22676k.m65750j(callout, "callout");
        AbstractC22676k.m65750j(cardButton, "cardButton");
        this.description = description;
        this.titleImage = titleImage;
        this.tierImage = abstractC22403o;
        this.callout = callout;
        this.cardButton = cardButton;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C4092p2 getCallout() {
        return this.callout;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C27256h getCardButton() {
        return this.cardButton;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC22403o getTierImage() {
        return this.tierImage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23036h)) {
            return false;
        }
        C23036h c23036h = (C23036h) other;
        return AbstractC22676k.m65745e(this.description, c23036h.description) && AbstractC22676k.m65745e(this.titleImage, c23036h.titleImage) && AbstractC22676k.m65745e(this.tierImage, c23036h.tierImage) && AbstractC22676k.m65745e(this.callout, c23036h.callout) && AbstractC22676k.m65745e(this.cardButton, c23036h.cardButton);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC22403o getTitleImage() {
        return this.titleImage;
    }

    public int hashCode() {
        int iM91833c = AbstractC30007c.m91833c(this.titleImage, this.description.hashCode() * 31, 31);
        AbstractC22403o abstractC22403o = this.tierImage;
        return this.cardButton.hashCode() + ((this.callout.hashCode() + ((iM91833c + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31)) * 31);
    }

    public String toString() {
        return "UpsellCardCalloutState(description=" + this.description + ", titleImage=" + this.titleImage + ", tierImage=" + this.tierImage + ", callout=" + this.callout + ", cardButton=" + this.cardButton + ")";
    }

    public /* synthetic */ C23036h(String str, AbstractC22403o abstractC22403o, AbstractC22403o abstractC22403o2, C4092p2 c4092p2, C27256h c27256h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, abstractC22403o, (i13 & 4) != 0 ? null : abstractC22403o2, c4092p2, c27256h);
    }
}
