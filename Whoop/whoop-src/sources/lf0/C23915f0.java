package lf0;

import gz0.EnumC16313m0;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: lf0.f0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006!"}, m65681d2 = {"Llf0/f0;", "Lm91/u;", "", "title", "supertitle", "Lkd1/o;", "profileImage", "Lgz0/m0;", "badgeIcon", "signatureImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lgz0/m0;Lkd1/o;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "e", "c", "Lkd1/o;", "()Lkd1/o;", "d", "Lgz0/m0;", "()Lgz0/m0;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23915f0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f94545f = AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String supertitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o profileImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 badgeIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22403o signatureImage;

    public C23915f0(String title, String supertitle, AbstractC22403o profileImage, EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(supertitle, "supertitle");
        AbstractC22676k.m65750j(profileImage, "profileImage");
        this.title = title;
        this.supertitle = supertitle;
        this.profileImage = profileImage;
        this.badgeIcon = enumC16313m0;
        this.signatureImage = abstractC22403o;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getBadgeIcon() {
        return this.badgeIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getProfileImage() {
        return this.profileImage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getSignatureImage() {
        return this.signatureImage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSupertitle() {
        return this.supertitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23915f0)) {
            return false;
        }
        C23915f0 c23915f0 = (C23915f0) other;
        return AbstractC22676k.m65745e(this.title, c23915f0.title) && AbstractC22676k.m65745e(this.supertitle, c23915f0.supertitle) && AbstractC22676k.m65745e(this.profileImage, c23915f0.profileImage) && this.badgeIcon == c23915f0.badgeIcon && AbstractC22676k.m65745e(this.signatureImage, c23915f0.signatureImage);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM91833c = AbstractC30007c.m91833c(this.profileImage, AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.supertitle), 31);
        EnumC16313m0 enumC16313m0 = this.badgeIcon;
        int iHashCode = (iM91833c + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.signatureImage;
        return iHashCode + (abstractC22403o != null ? abstractC22403o.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.supertitle;
        AbstractC22403o abstractC22403o = this.profileImage;
        EnumC16313m0 enumC16313m0 = this.badgeIcon;
        AbstractC22403o abstractC22403o2 = this.signatureImage;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ClinicalReportCardHeaderState(title=", str, ", supertitle=", str2, ", profileImage=");
        sbM32001t.append(abstractC22403o);
        sbM32001t.append(", badgeIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", signatureImage=");
        sbM32001t.append(abstractC22403o2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
