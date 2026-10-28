package i63;

import java.util.ArrayList;
import l83.C23470p;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: i63.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18166e0 {

    /* JADX INFO: renamed from: a */
    public final C18160b0 f70481a;

    /* JADX INFO: renamed from: b */
    public final String f70482b;

    /* JADX INFO: renamed from: c */
    public final int f70483c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f70484d;

    /* JADX INFO: renamed from: e */
    public final String f70485e;

    /* JADX INFO: renamed from: f */
    public final String f70486f;

    /* JADX INFO: renamed from: g */
    public final String f70487g;

    /* JADX INFO: renamed from: h */
    public final C23470p f70488h;

    /* JADX INFO: renamed from: i */
    public final C23470p f70489i;

    public C18166e0(C18160b0 protocol, String host, int i13, ArrayList arrayList, InterfaceC18184w parameters, String fragment, String str, String str2, String str3) {
        AbstractC22676k.m65750j(protocol, "protocol");
        AbstractC22676k.m65750j(host, "host");
        AbstractC22676k.m65750j(parameters, "parameters");
        AbstractC22676k.m65750j(fragment, "fragment");
        this.f70481a = protocol;
        this.f70482b = host;
        this.f70483c = i13;
        this.f70484d = arrayList;
        this.f70485e = str;
        this.f70486f = str2;
        this.f70487g = str3;
        if ((i13 < 0 || i13 >= 65536) && i13 != 0) {
            throw new IllegalArgumentException("port must be between 0 and 65535, or 0 if not set");
        }
        AbstractC30060g.m92088H(new C18164d0(this, 2));
        AbstractC30060g.m92088H(new C18164d0(this, 4));
        AbstractC30060g.m92088H(new C18164d0(this, 3));
        this.f70488h = AbstractC30060g.m92088H(new C18164d0(this, 5));
        this.f70489i = AbstractC30060g.m92088H(new C18164d0(this, 1));
        AbstractC30060g.m92088H(new C18164d0(this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            return AbstractC22676k.m65745e(c22673i0.getOrCreateKotlinClass(C18166e0.class), c22673i0.getOrCreateKotlinClass(obj.getClass())) && AbstractC22676k.m65745e(this.f70487g, ((C18166e0) obj).f70487g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f70487g.hashCode();
    }

    public final String toString() {
        return this.f70487g;
    }
}
