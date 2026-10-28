package ud3;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37171e;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ud3.b1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34802b1 {

    /* JADX INFO: renamed from: a */
    public final C34797a f146527a;

    /* JADX INFO: renamed from: b */
    public final Proxy f146528b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f146529c;

    public C34802b1(C34797a c34797a, Proxy proxy, InetSocketAddress socketAddress) {
        AbstractC22676k.m65750j(socketAddress, "socketAddress");
        this.f146527a = c34797a;
        this.f146528b = proxy;
        this.f146529c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34802b1)) {
            return false;
        }
        C34802b1 c34802b1 = (C34802b1) obj;
        return AbstractC22676k.m65745e(c34802b1.f146527a, this.f146527a) && AbstractC22676k.m65745e(c34802b1.f146528b, this.f146528b) && AbstractC22676k.m65745e(c34802b1.f146529c, this.f146529c);
    }

    public final int hashCode() {
        return this.f146529c.hashCode() + ((this.f146528b.hashCode() + ((this.f146527a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb4 = new StringBuilder();
        C34810e0 c34810e0 = this.f146527a.f146519h;
        String str = c34810e0.f146565d;
        InetSocketAddress inetSocketAddress = this.f146529c;
        InetAddress address = inetSocketAddress.getAddress();
        String strM119115b = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : AbstractC37171e.m119115b(hostAddress);
        if (AbstractC39414r.m125875T(str, ':', false)) {
            sb4.append("[");
            sb4.append(str);
            sb4.append("]");
        } else {
            sb4.append(str);
        }
        if (c34810e0.f146566e != inetSocketAddress.getPort() || str.equals(strM119115b)) {
            sb4.append(":");
            sb4.append(c34810e0.f146566e);
        }
        if (!str.equals(strM119115b)) {
            if (this.f146528b.equals(Proxy.NO_PROXY)) {
                sb4.append(" at ");
            } else {
                sb4.append(" via proxy ");
            }
            if (strM119115b == null) {
                sb4.append("<unresolved>");
            } else if (AbstractC39414r.m125875T(strM119115b, ':', false)) {
                sb4.append("[");
                sb4.append(strM119115b);
                sb4.append("]");
            } else {
                sb4.append(strM119115b);
            }
            sb4.append(":");
            sb4.append(inetSocketAddress.getPort());
        }
        return sb4.toString();
    }
}
