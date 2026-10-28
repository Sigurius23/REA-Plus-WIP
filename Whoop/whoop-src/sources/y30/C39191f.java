package y30;

import b20.C2326f;
import b20.EnumC2325e;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: y30.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C39191f implements InterfaceC39190e {

    /* JADX INFO: renamed from: a */
    public final C2326f f168444a;

    public C39191f(C2326f c2326f) {
        this.f168444a = c2326f;
    }

    @Override // y30.InterfaceC39190e
    /* JADX INFO: renamed from: a */
    public final Object mo124820a(String str, InterfaceC30057d interfaceC30057d) {
        IllegalStateException illegalStateException = new IllegalStateException("Missing Google Places dependency, please add it to your apps build.gradle");
        AbstractC35903f.m113990H(this.f168444a, EnumC2325e.FETCH_PLACE_WITHOUT_DEPENDENCY, null, null, 6);
        return AbstractC34132o.m107888l(illegalStateException);
    }

    @Override // y30.InterfaceC39190e
    /* JADX INFO: renamed from: b */
    public final Object mo124821b(String str, String str2, int i13, InterfaceC30057d interfaceC30057d) {
        IllegalStateException illegalStateException = new IllegalStateException("Missing Google Places dependency, please add it to your apps build.gradle");
        AbstractC35903f.m113990H(this.f168444a, EnumC2325e.FIND_AUTOCOMPLETE_PREDICTIONS_WITHOUT_DEPENDENCY, null, null, 6);
        return AbstractC34132o.m107888l(illegalStateException);
    }
}
