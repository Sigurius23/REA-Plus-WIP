package p81;

import c41.C4115s4;
import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: p81.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u001b\u0010\"¨\u0006#"}, m65681d2 = {"Lp81/c;", "Lm91/u;", "Lkd1/o;", "topImage", "Lcom/whoop/design/util/TextResource;", "title", "subTitle", "body", "Lc41/s4;", "recoveryImpactEmptyState", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/s4;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "f", "()Lkd1/o;", "b", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Lc41/s4;", "()Lc41/s4;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28971c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o topImage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource body;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C4115s4 recoveryImpactEmptyState;

    public C28971c(AbstractC22403o topImage, TextResource title, TextResource subTitle, TextResource textResource, C4115s4 c4115s4) {
        AbstractC22676k.m65750j(topImage, "topImage");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subTitle, "subTitle");
        this.topImage = topImage;
        this.title = title;
        this.subTitle = subTitle;
        this.body = textResource;
        this.recoveryImpactEmptyState = c4115s4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C4115s4 getRecoveryImpactEmptyState() {
        return this.recoveryImpactEmptyState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28971c)) {
            return false;
        }
        C28971c c28971c = (C28971c) other;
        return AbstractC22676k.m65745e(this.topImage, c28971c.topImage) && AbstractC22676k.m65745e(this.title, c28971c.title) && AbstractC22676k.m65745e(this.subTitle, c28971c.subTitle) && AbstractC22676k.m65745e(this.body, c28971c.body) && AbstractC22676k.m65745e(this.recoveryImpactEmptyState, c28971c.recoveryImpactEmptyState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC22403o getTopImage() {
        return this.topImage;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.topImage.hashCode() * 31, this.title, 31), this.subTitle, 31);
        TextResource textResource = this.body;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        C4115s4 c4115s4 = this.recoveryImpactEmptyState;
        return iHashCode + (c4115s4 != null ? c4115s4.hashCode() : 0);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.topImage;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subTitle;
        TextResource textResource3 = this.body;
        C4115s4 c4115s4 = this.recoveryImpactEmptyState;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("UnlockTrendsCardState(topImage=", textResource, abstractC22403o, ", title=", ", subTitle=");
        AbstractC30007c.m91855y(sbM114683k, textResource2, ", body=", textResource3, ", recoveryImpactEmptyState=");
        sbM114683k.append(c4115s4);
        sbM114683k.append(")");
        return sbM114683k.toString();
    }
}
