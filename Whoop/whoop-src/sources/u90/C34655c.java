package u90;

import java.util.List;
import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: u90.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\f¨\u0006 "}, m65681d2 = {"Lu90/c;", "Lm91/u;", "Lkd1/o;", "image", "", "itemStates", "", "mobileScreenName", "analyticsName", "<init>", "(Lkd1/o;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "()Lkd1/o;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljava/lang/String;", "getMobileScreenName", "d", "getAnalyticsName", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34655c implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> itemStates;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String mobileScreenName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String analyticsName;

    /* JADX WARN: Multi-variable type inference failed */
    public C34655c(AbstractC22403o image, List<? extends InterfaceC25312u> itemStates, String mobileScreenName, String analyticsName) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(itemStates, "itemStates");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.image = image;
        this.itemStates = itemStates;
        this.mobileScreenName = mobileScreenName;
        this.analyticsName = analyticsName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m109509b() {
        return this.itemStates;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34655c)) {
            return false;
        }
        C34655c c34655c = (C34655c) other;
        return AbstractC22676k.m65745e(this.image, c34655c.image) && AbstractC22676k.m65745e(this.itemStates, c34655c.itemStates) && AbstractC22676k.m65745e(this.mobileScreenName, c34655c.mobileScreenName) && AbstractC22676k.m65745e(this.analyticsName, c34655c.analyticsName);
    }

    public int hashCode() {
        return this.analyticsName.hashCode() + AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.image.hashCode() * 31, 31, this.itemStates), 31, this.mobileScreenName);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.image;
        List<InterfaceC25312u> list = this.itemStates;
        String str = this.mobileScreenName;
        String str2 = this.analyticsName;
        StringBuilder sb4 = new StringBuilder("UniversalPaymentMethodViewState(image=");
        sb4.append(abstractC22403o);
        sb4.append(", itemStates=");
        sb4.append(list);
        sb4.append(", mobileScreenName=");
        return AbstractC11266d.m30464r(sb4, str, ", analyticsName=", str2, ")");
    }
}
