package dj0;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dj0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, m65681d2 = {"Ldj0/a;", "", "", "destination", "deliveryMedium", "attributeName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12065a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String destination;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String deliveryMedium;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String attributeName;

    public C12065a(String destination, String deliveryMedium, String attributeName) {
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(deliveryMedium, "deliveryMedium");
        AbstractC22676k.m65750j(attributeName, "attributeName");
        this.destination = destination;
        this.deliveryMedium = deliveryMedium;
        this.attributeName = attributeName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAttributeName() {
        return this.attributeName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeliveryMedium() {
        return this.deliveryMedium;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDestination() {
        return this.destination;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12065a)) {
            return false;
        }
        C12065a c12065a = (C12065a) other;
        return AbstractC22676k.m65745e(this.destination, c12065a.destination) && AbstractC22676k.m65745e(this.deliveryMedium, c12065a.deliveryMedium) && AbstractC22676k.m65745e(this.attributeName, c12065a.attributeName);
    }

    public int hashCode() {
        return this.attributeName.hashCode() + AbstractC11266d.m30450d(this.destination.hashCode() * 31, 31, this.deliveryMedium);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.attributeName, ")", AbstractC11895b.m32001t("CodeDeliveryInfo(destination=", this.destination, ", deliveryMedium=", this.deliveryMedium, ", attributeName="));
    }
}
