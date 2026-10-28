package us0;

import lt0.EnumC24737n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32978v;

/* JADX INFO: renamed from: us0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lus0/k;", "", "Lst0/v;", "deviceType", "Llt0/n;", "reason", "<init>", "(Lst0/v;Llt0/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lst0/v;", "()Lst0/v;", "b", "Llt0/n;", "()Llt0/n;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35215k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC32978v deviceType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC24737n reason;

    public C35215k(EnumC32978v deviceType, EnumC24737n reason) {
        AbstractC22676k.m65750j(deviceType, "deviceType");
        AbstractC22676k.m65750j(reason, "reason");
        this.deviceType = deviceType;
        this.reason = reason;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public EnumC32978v getDeviceType() {
        return this.deviceType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC24737n getReason() {
        return this.reason;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35215k)) {
            return false;
        }
        C35215k c35215k = (C35215k) other;
        return this.deviceType == c35215k.deviceType && this.reason == c35215k.reason;
    }

    public int hashCode() {
        return this.reason.hashCode() + (this.deviceType.hashCode() * 31);
    }

    public String toString() {
        return "FrameMalformed(deviceType=" + this.deviceType + ", reason=" + this.reason + ")";
    }
}
