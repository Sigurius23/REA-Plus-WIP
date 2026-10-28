package iu0;

import java.util.Arrays;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: iu0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Liu0/a;", "", "", "id", "", "serialNumber", "", "value", "<init>", "(JLjava/lang/String;[B)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "c", "[B", "()[B", "connectivity-data-packets-model_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20935a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String serialNumber;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final byte[] value;

    public C20935a(long j7, String serialNumber, byte[] value) {
        AbstractC22676k.m65750j(serialNumber, "serialNumber");
        AbstractC22676k.m65750j(value, "value");
        this.id = j7;
        this.serialNumber = serialNumber;
        this.value = value;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final byte[] getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20935a)) {
            return false;
        }
        C20935a c20935a = (C20935a) other;
        return this.id == c20935a.id && AbstractC22676k.m65745e(this.serialNumber, c20935a.serialNumber) && AbstractC22676k.m65745e(this.value, c20935a.value);
    }

    public int hashCode() {
        return Arrays.hashCode(this.value) + AbstractC11266d.m30450d(Long.hashCode(this.id) * 31, 31, this.serialNumber);
    }

    public String toString() {
        long j7 = this.id;
        String str = this.serialNumber;
        return AbstractC2875y.m8304q(AbstractC36095b.m114685m("MemfaultPacketDto(id=", ", serialNumber=", j7, str), ", value=", Arrays.toString(this.value), ")");
    }

    public /* synthetic */ C20935a(long j7, String str, byte[] bArr, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0L : j7, str, bArr);
    }
}
