package re3;

import a33.C0352d;
import bf3.InterfaceC3202a;
import cg3.EnumC4578c;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import kr.C22786e;
import p012ab.C0684i0;
import se3.C32428b;
import u00.C34377e;

/* JADX INFO: renamed from: re3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C31329a implements InterfaceC3202a {
    @Override // bf3.InterfaceC3202a
    /* JADX INFO: renamed from: a */
    public final void mo9250a(C0684i0 c0684i0) {
        C32428b c32428b = new C32428b();
        EnumSet.allOf(EnumC4578c.class);
        EnumC4578c enumC4578c = EnumC4578c.f18438w;
        EnumC4578c enumC4578c2 = EnumC4578c.f18439x;
        EnumSet enumSetOf = EnumSet.of(enumC4578c, enumC4578c2);
        if (enumSetOf == null) {
            throw new NullPointerException("linkTypes must not be null");
        }
        HashSet hashSet = new HashSet(enumSetOf);
        c32428b.f134250a = new C0352d(hashSet.contains(enumC4578c) ? new C34377e(21) : null, hashSet.contains(EnumC4578c.f18440y) ? new C22786e(22) : null, hashSet.contains(enumC4578c2) ? new C22786e(21) : null, 7);
        ((ArrayList) c0684i0.f2442E).add(c32428b);
    }
}
