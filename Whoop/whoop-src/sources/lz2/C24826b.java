package lz2;

import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: lz2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Llz2/b;", "", "Lcom/whoop/design/util/TextResource;", "name", "", "address", "", "isConnected", "isConnecting", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ljava/lang/String;", "c", "Z", "()Z", "d", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24826b {

    /* JADX INFO: renamed from: e */
    public static final int f97186e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String address;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isConnected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isConnecting;

    public C24826b(TextResource name, String address, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(address, "address");
        this.name = name;
        this.address = address;
        this.isConnected = z4;
        this.isConnecting = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsConnecting() {
        return this.isConnecting;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24826b)) {
            return false;
        }
        C24826b c24826b = (C24826b) other;
        return AbstractC22676k.m65745e(this.name, c24826b.name) && AbstractC22676k.m65745e(this.address, c24826b.address) && this.isConnected == c24826b.isConnected && this.isConnecting == c24826b.isConnecting;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isConnecting) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.name.hashCode() * 31, 31, this.address), 31, this.isConnected);
    }

    public String toString() {
        TextResource textResource = this.name;
        String str = this.address;
        return AbstractC36095b.m114682j(AbstractC30007c.m91845o("HrDeviceViewState(name=", textResource, ", address=", str, ", isConnected="), this.isConnected, ", isConnecting=", this.isConnecting, ")");
    }
}
