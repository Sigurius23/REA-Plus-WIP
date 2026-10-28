package jx1;

import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jx1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ljx1/d;", "", "", "title", "existingLabel", "alternateLabel", "", "zipCodeRequired", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Z", "getZipCodeRequired", "()Z", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22010d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String existingLabel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String alternateLabel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean zipCodeRequired;

    public C22010d(String title, String str, String alternateLabel, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(alternateLabel, "alternateLabel");
        this.title = title;
        this.existingLabel = str;
        this.alternateLabel = alternateLabel;
        this.zipCodeRequired = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAlternateLabel() {
        return this.alternateLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getExistingLabel() {
        return this.existingLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22010d)) {
            return false;
        }
        C22010d c22010d = (C22010d) other;
        return AbstractC22676k.m65745e(this.title, c22010d.title) && AbstractC22676k.m65745e(this.existingLabel, c22010d.existingLabel) && AbstractC22676k.m65745e(this.alternateLabel, c22010d.alternateLabel) && this.zipCodeRequired == c22010d.zipCodeRequired;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.existingLabel;
        return Boolean.hashCode(this.zipCodeRequired) + AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.alternateLabel);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.existingLabel;
        return AbstractC21702c.m61137h(AbstractC11895b.m32001t("CheckoutPaymentOptions(title=", str, ", existingLabel=", str2, ", alternateLabel="), this.alternateLabel, ", zipCodeRequired=", this.zipCodeRequired, ")");
    }
}
