package v00;

import com.stripe.android.p056ui.core.elements.AddressSpec;
import d30.C11530f0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import n83.C26460c;
import p484s9.AbstractC32281f;
import t00.C33254a;
import u00.C34378f;
import u00.EnumC34376d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: v00.p0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC35485p0 implements InterfaceC35487q0 {
    @Override // v00.InterfaceC35487q0
    /* JADX INFO: renamed from: a */
    public final List mo112554a(InterfaceC35457b0 interfaceC35457b0, C35459c0 c35459c0, List list, C35479m0 c35479m0) {
        return AbstractC32281f.m100451s(this, interfaceC35457b0, c35459c0, list, c35479m0);
    }

    @Override // v00.InterfaceC35487q0
    /* JADX INFO: renamed from: b */
    public final C34378f mo112555b(C35459c0 c35459c0, InterfaceC35457b0 interfaceC35457b0, List list) {
        return AbstractC32281f.m100457z(this, c35459c0, interfaceC35457b0, list);
    }

    @Override // v00.InterfaceC35487q0
    /* JADX INFO: renamed from: g */
    public final boolean mo112556g(InterfaceC35457b0 interfaceC35457b0, List list) {
        return AbstractC32281f.m100450r(this, interfaceC35457b0, list);
    }

    /* JADX INFO: renamed from: h */
    public final List m112557h(C35459c0 c35459c0, C35479m0 c35479m0) {
        LinkedHashMap linkedHashMap = c35479m0.f151034c;
        C11530f0 c11530f0 = new C11530f0(c35479m0);
        mo112559k(c35459c0, c35479m0, c11530f0);
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        c26460cM119000x.addAll((ArrayList) c11530f0.f37151d);
        for (EnumC34376d enumC34376d : (LinkedHashSet) c11530f0.f37154g) {
            if (!((LinkedHashSet) c11530f0.f37155h).contains(enumC34376d)) {
                c26460cM119000x.add(enumC34376d.mo108673b(linkedHashMap));
            }
        }
        c26460cM119000x.addAll((ArrayList) c11530f0.f37152e);
        if (c11530f0.f37148a) {
            c26460cM119000x.addAll(new AddressSpec(null, (Set) c11530f0.f37149b, null, false, null, false, 61, null).transform(linkedHashMap, c35479m0.f151036e, c35479m0.f151046o));
        }
        c26460cM119000x.addAll((ArrayList) c11530f0.f37153f);
        return AbstractC37056f.m118988k(c26460cM119000x);
    }

    @Override // v00.InterfaceC35487q0
    /* JADX INFO: renamed from: i */
    public final C33254a mo112558i(InterfaceC35457b0 interfaceC35457b0, C35459c0 c35459c0, List list, boolean z4) {
        return AbstractC32281f.m100452t(this, interfaceC35457b0, c35459c0, list, z4);
    }

    /* JADX INFO: renamed from: k */
    public void mo112559k(C35459c0 c35459c0, C35479m0 c35479m0, C11530f0 c11530f0) {
    }

    /* JADX INFO: renamed from: l */
    public abstract C34378f mo112560l(C35459c0 c35459c0);
}
