package us0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;

/* JADX INFO: renamed from: us0.m */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lus0/m;", "", "Lst0/v;", "deviceType", "", "categoryName", "<init>", "(Lst0/v;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lst0/v;", "b", "()Lst0/v;", "Ljava/lang/String;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35217m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC32978v deviceType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String categoryName;

    public C35217m(EnumC32978v deviceType, String categoryName) {
        AbstractC22676k.m65750j(deviceType, "deviceType");
        AbstractC22676k.m65750j(categoryName, "categoryName");
        this.deviceType = deviceType;
        this.categoryName = categoryName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public EnumC32978v getDeviceType() {
        return this.deviceType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35217m)) {
            return false;
        }
        C35217m c35217m = (C35217m) other;
        return this.deviceType == c35217m.deviceType && AbstractC22676k.m65745e(this.categoryName, c35217m.categoryName);
    }

    public int hashCode() {
        return this.categoryName.hashCode() + (this.deviceType.hashCode() * 31);
    }

    public String toString() {
        return "UnknownType(deviceType=" + this.deviceType + ", categoryName=" + this.categoryName + ")";
    }
}
