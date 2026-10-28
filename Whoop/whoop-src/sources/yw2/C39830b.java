package yw2;

import android.bluetooth.BluetoothDevice;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: yw2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\rB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ8\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0010R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001f¨\u0006\""}, m65681d2 = {"Lyw2/b;", "", "", "name", "address", "", "isConnected", "isConnecting", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "newName", "i", "(Ljava/lang/String;)Lyw2/b;", "a", "(Ljava/lang/String;Ljava/lang/String;ZZ)Lyw2/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "c", "Z", "e", "()Z", "g", "(Z)V", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39830b {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final int f171708f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String address;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isConnected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isConnecting;

    /* JADX INFO: renamed from: yw2.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lyw2/b$a;", "", "<init>", "()V", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "Lyw2/b;", "a", "(Landroid/bluetooth/BluetoothDevice;)Lyw2/b;", "", "FALLBACK_PREFIX", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C39830b m127789a(BluetoothDevice bluetoothDevice) {
            AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
            String strM127792c = AbstractC39831c.m127792c(bluetoothDevice);
            String address = bluetoothDevice.getAddress();
            AbstractC22676k.m65749i(address, "getAddress(...)");
            return new C39830b(strM127792c, address, false, false, 12, null);
        }

        private Companion() {
        }
    }

    public C39830b(String name, String address, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(address, "address");
        this.name = name;
        this.address = address;
        this.isConnected = z4;
        this.isConnecting = z13;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C39830b m127780b(C39830b c39830b, String str, String str2, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c39830b.name;
        }
        if ((i13 & 2) != 0) {
            str2 = c39830b.address;
        }
        if ((i13 & 4) != 0) {
            z4 = c39830b.isConnected;
        }
        if ((i13 & 8) != 0) {
            z13 = c39830b.isConnecting;
        }
        return c39830b.m127781a(str, str2, z4, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C39830b m127781a(String name, String address, boolean isConnected, boolean isConnecting) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(address, "address");
        return new C39830b(name, address, isConnected, isConnecting);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39830b)) {
            return false;
        }
        C39830b c39830b = (C39830b) other;
        return AbstractC22676k.m65745e(this.name, c39830b.name) && AbstractC22676k.m65745e(this.address, c39830b.address) && this.isConnected == c39830b.isConnected && this.isConnecting == c39830b.isConnecting;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsConnecting() {
        return this.isConnecting;
    }

    /* JADX INFO: renamed from: g */
    public final void m127786g(boolean z4) {
        this.isConnected = z4;
    }

    /* JADX INFO: renamed from: h */
    public final void m127787h(boolean z4) {
        this.isConnecting = z4;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isConnecting) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.name.hashCode() * 31, 31, this.address), 31, this.isConnected);
    }

    /* JADX INFO: renamed from: i */
    public final C39830b m127788i(String newName) {
        AbstractC22676k.m65750j(newName, "newName");
        return AbstractC39831c.m127793d(this.name, newName) ? m127780b(this, newName, null, false, false, 14, null) : this;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.address;
        return AbstractC36095b.m114682j(AbstractC11895b.m32001t("HrDevice(name=", str, ", address=", str2, ", isConnected="), this.isConnected, ", isConnecting=", this.isConnecting, ")");
    }

    public /* synthetic */ C39830b(String str, String str2, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13);
    }
}
