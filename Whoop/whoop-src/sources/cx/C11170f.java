package cx;

import ax.InterfaceC2116a;
import ax.InterfaceC2117b;
import c93.InterfaceC4339a;
import java.util.ArrayList;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: cx.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C11170f extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35755w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f35756x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11174j f35757y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11170f(boolean z4, C11174j c11174j, int i13) {
        super(0);
        this.f35755w = i13;
        this.f35756x = z4;
        this.f35757y = c11174j;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0171  */
    /* JADX WARN: Code duplicated, block: B:120:0x0179  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        InterfaceC11166b interfaceC11166b;
        InterfaceC11166b interfaceC11166b2;
        switch (this.f35755w) {
            case 0:
                boolean z4 = this.f35756x;
                C11174j c11174j = this.f35757y;
                if (z4) {
                    C11175k c11175k = c11174j.f35772x;
                    if (c11175k == null) {
                        AbstractC22676k.m65757q("pb");
                        throw null;
                    }
                    c11175k.f35780f.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                    C11175k c11175k2 = c11174j.f35772x;
                    if (c11175k2 == null) {
                        AbstractC22676k.m65757q("pb");
                        throw null;
                    }
                    c11175k2.f35781g.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                    C11175k c11175k3 = c11174j.f35772x;
                    if (c11175k3 == null) {
                        AbstractC22676k.m65757q("pb");
                        throw null;
                    }
                    c11175k3.f35782h.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                    InterfaceC11166b interfaceC11166b3 = c11174j.f35773y;
                    if (interfaceC11166b3 == null) {
                        AbstractC22676k.m65757q("task");
                        throw null;
                    }
                    ((AbstractC11165a) interfaceC11166b3).m30273a();
                } else {
                    boolean zShouldShowRequestPermissionRationale = c11174j.shouldShowRequestPermissionRationale("android.permission.ACCESS_BACKGROUND_LOCATION");
                    C11175k c11175k4 = c11174j.f35772x;
                    if (c11175k4 == null) {
                        AbstractC22676k.m65757q("pb");
                        throw null;
                    }
                    if (c11175k4.f35787m != null && zShouldShowRequestPermissionRationale) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                        C11175k c11175k5 = c11174j.f35772x;
                        if (c11175k5 == null) {
                            AbstractC22676k.m65757q("pb");
                            throw null;
                        }
                        InterfaceC2116a interfaceC2116a = c11175k5.f35787m;
                        AbstractC22676k.m65747g(interfaceC2116a);
                        InterfaceC11166b interfaceC11166b4 = c11174j.f35773y;
                        if (interfaceC11166b4 == null) {
                            AbstractC22676k.m65757q("task");
                            throw null;
                        }
                        interfaceC2116a.mo6682a(((AbstractC11165a) interfaceC11166b4).f35751c, arrayList);
                    } else {
                        if (c11175k4.f35788n != null && !zShouldShowRequestPermissionRationale) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                            C11175k c11175k6 = c11174j.f35772x;
                            if (c11175k6 == null) {
                                AbstractC22676k.m65757q("pb");
                                throw null;
                            }
                            InterfaceC2117b interfaceC2117b = c11175k6.f35788n;
                            AbstractC22676k.m65747g(interfaceC2117b);
                            InterfaceC11166b interfaceC11166b5 = c11174j.f35773y;
                            if (interfaceC11166b5 == null) {
                                AbstractC22676k.m65757q("task");
                                throw null;
                            }
                            interfaceC2117b.mo6683e(((AbstractC11165a) interfaceC11166b5).f35752d, arrayList2);
                        }
                        interfaceC11166b = c11174j.f35773y;
                        if (interfaceC11166b != null) {
                            AbstractC22676k.m65757q("task");
                            throw null;
                        }
                        ((AbstractC11165a) interfaceC11166b).m30273a();
                    }
                    if (c11174j.f35772x == null) {
                        AbstractC22676k.m65757q("pb");
                        throw null;
                    }
                    interfaceC11166b = c11174j.f35773y;
                    if (interfaceC11166b != null) {
                        AbstractC22676k.m65757q("task");
                        throw null;
                    }
                    ((AbstractC11165a) interfaceC11166b).m30273a();
                }
                return C23454a0.f92919a;
            default:
                boolean z13 = this.f35756x;
                C11174j c11174j2 = this.f35757y;
                if (z13) {
                    C11175k c11175k7 = c11174j2.f35772x;
                    if (c11175k7 == null) {
                        AbstractC22676k.m65757q("pb");
                        throw null;
                    }
                    c11175k7.f35780f.add("android.permission.BODY_SENSORS_BACKGROUND");
                    C11175k c11175k8 = c11174j2.f35772x;
                    if (c11175k8 == null) {
                        AbstractC22676k.m65757q("pb");
                        throw null;
                    }
                    c11175k8.f35781g.remove("android.permission.BODY_SENSORS_BACKGROUND");
                    C11175k c11175k9 = c11174j2.f35772x;
                    if (c11175k9 == null) {
                        AbstractC22676k.m65757q("pb");
                        throw null;
                    }
                    c11175k9.f35782h.remove("android.permission.BODY_SENSORS_BACKGROUND");
                    InterfaceC11166b interfaceC11166b6 = c11174j2.f35773y;
                    if (interfaceC11166b6 == null) {
                        AbstractC22676k.m65757q("task");
                        throw null;
                    }
                    ((AbstractC11165a) interfaceC11166b6).m30273a();
                } else {
                    boolean zShouldShowRequestPermissionRationale2 = c11174j2.shouldShowRequestPermissionRationale("android.permission.BODY_SENSORS_BACKGROUND");
                    C11175k c11175k10 = c11174j2.f35772x;
                    if (c11175k10 == null) {
                        AbstractC22676k.m65757q("pb");
                        throw null;
                    }
                    if (c11175k10.f35787m != null && zShouldShowRequestPermissionRationale2) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add("android.permission.BODY_SENSORS_BACKGROUND");
                        C11175k c11175k11 = c11174j2.f35772x;
                        if (c11175k11 == null) {
                            AbstractC22676k.m65757q("pb");
                            throw null;
                        }
                        InterfaceC2116a interfaceC2116a2 = c11175k11.f35787m;
                        AbstractC22676k.m65747g(interfaceC2116a2);
                        InterfaceC11166b interfaceC11166b7 = c11174j2.f35773y;
                        if (interfaceC11166b7 == null) {
                            AbstractC22676k.m65757q("task");
                            throw null;
                        }
                        interfaceC2116a2.mo6682a(((AbstractC11165a) interfaceC11166b7).f35751c, arrayList3);
                    } else {
                        if (c11175k10.f35788n != null && !zShouldShowRequestPermissionRationale2) {
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add("android.permission.BODY_SENSORS_BACKGROUND");
                            C11175k c11175k12 = c11174j2.f35772x;
                            if (c11175k12 == null) {
                                AbstractC22676k.m65757q("pb");
                                throw null;
                            }
                            InterfaceC2117b interfaceC2117b2 = c11175k12.f35788n;
                            AbstractC22676k.m65747g(interfaceC2117b2);
                            InterfaceC11166b interfaceC11166b8 = c11174j2.f35773y;
                            if (interfaceC11166b8 == null) {
                                AbstractC22676k.m65757q("task");
                                throw null;
                            }
                            interfaceC2117b2.mo6683e(((AbstractC11165a) interfaceC11166b8).f35752d, arrayList4);
                        }
                        interfaceC11166b2 = c11174j2.f35773y;
                        if (interfaceC11166b2 != null) {
                            AbstractC22676k.m65757q("task");
                            throw null;
                        }
                        ((AbstractC11165a) interfaceC11166b2).m30273a();
                    }
                    if (c11174j2.f35772x == null) {
                        AbstractC22676k.m65757q("pb");
                        throw null;
                    }
                    interfaceC11166b2 = c11174j2.f35773y;
                    if (interfaceC11166b2 != null) {
                        AbstractC22676k.m65757q("task");
                        throw null;
                    }
                    ((AbstractC11165a) interfaceC11166b2).m30273a();
                }
                return C23454a0.f92919a;
        }
    }
}
