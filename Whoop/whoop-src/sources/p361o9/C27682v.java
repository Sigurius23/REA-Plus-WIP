package p361o9;

import java.util.Objects;
import p031b9.C2840i1;
import p516u8.C34623v0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: o9.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C27682v {

    /* JADX INFO: renamed from: a */
    public final int f111437a;

    /* JADX INFO: renamed from: b */
    public final C2840i1[] f111438b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC27679s[] f111439c;

    /* JADX INFO: renamed from: d */
    public final C34623v0 f111440d;

    /* JADX INFO: renamed from: e */
    public final Object f111441e;

    public C27682v(C2840i1[] c2840i1Arr, InterfaceC27679s[] interfaceC27679sArr, C34623v0 c34623v0, Object obj) {
        AbstractC35849g.m113802d(c2840i1Arr.length == interfaceC27679sArr.length);
        this.f111438b = c2840i1Arr;
        this.f111439c = (InterfaceC27679s[]) interfaceC27679sArr.clone();
        this.f111440d = c34623v0;
        this.f111441e = obj;
        this.f111437a = c2840i1Arr.length;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m83677a(C27682v c27682v, int i13) {
        return c27682v != null && Objects.equals(this.f111438b[i13], c27682v.f111438b[i13]) && Objects.equals(this.f111439c[i13], c27682v.f111439c[i13]);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m83678b(int i13) {
        return this.f111438b[i13] != null;
    }
}
