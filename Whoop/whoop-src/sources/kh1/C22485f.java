package kh1;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kh1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJD\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lkh1/f;", "", "", "source", "giftType", "testCount", "selectedTier", "Lkh1/b;", "pendingAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh1/b;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkh1/b;)Lkh1/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "c", "g", "d", "e", "Lkh1/b;", "()Lkh1/b;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C22485f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String giftType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String testCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String selectedTier;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22481b pendingAction;

    public C22485f(String source, String giftType, String testCount, String selectedTier, AbstractC22481b abstractC22481b) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(giftType, "giftType");
        AbstractC22676k.m65750j(testCount, "testCount");
        AbstractC22676k.m65750j(selectedTier, "selectedTier");
        this.source = source;
        this.giftType = giftType;
        this.testCount = testCount;
        this.selectedTier = selectedTier;
        this.pendingAction = abstractC22481b;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22485f m64978b(C22485f c22485f, String str, String str2, String str3, String str4, AbstractC22481b abstractC22481b, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c22485f.source;
        }
        if ((i13 & 2) != 0) {
            str2 = c22485f.giftType;
        }
        if ((i13 & 4) != 0) {
            str3 = c22485f.testCount;
        }
        if ((i13 & 8) != 0) {
            str4 = c22485f.selectedTier;
        }
        if ((i13 & 16) != 0) {
            abstractC22481b = c22485f.pendingAction;
        }
        AbstractC22481b abstractC22481b2 = abstractC22481b;
        String str5 = str3;
        return c22485f.m64979a(str, str2, str5, str4, abstractC22481b2);
    }

    /* JADX INFO: renamed from: a */
    public final C22485f m64979a(String source, String giftType, String testCount, String selectedTier, AbstractC22481b pendingAction) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(giftType, "giftType");
        AbstractC22676k.m65750j(testCount, "testCount");
        AbstractC22676k.m65750j(selectedTier, "selectedTier");
        return new C22485f(source, giftType, testCount, selectedTier, pendingAction);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getGiftType() {
        return this.giftType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC22481b getPendingAction() {
        return this.pendingAction;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSelectedTier() {
        return this.selectedTier;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22485f)) {
            return false;
        }
        C22485f c22485f = (C22485f) other;
        return AbstractC22676k.m65745e(this.source, c22485f.source) && AbstractC22676k.m65745e(this.giftType, c22485f.giftType) && AbstractC22676k.m65745e(this.testCount, c22485f.testCount) && AbstractC22676k.m65745e(this.selectedTier, c22485f.selectedTier) && AbstractC22676k.m65745e(this.pendingAction, c22485f.pendingAction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTestCount() {
        return this.testCount;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.source.hashCode() * 31, 31, this.giftType), 31, this.testCount), 31, this.selectedTier);
        AbstractC22481b abstractC22481b = this.pendingAction;
        return iM30450d + (abstractC22481b == null ? 0 : abstractC22481b.hashCode());
    }

    public String toString() {
        String str = this.source;
        String str2 = this.giftType;
        String str3 = this.testCount;
        String str4 = this.selectedTier;
        AbstractC22481b abstractC22481b = this.pendingAction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("GiftingInternalDomainState(source=", str, ", giftType=", str2, ", testCount=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", selectedTier=", str4, ", pendingAction=");
        sbM32001t.append(abstractC22481b);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C22485f(String str, String str2, String str3, String str4, AbstractC22481b abstractC22481b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? null : abstractC22481b);
    }
}
