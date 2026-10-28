package lb3;

import java.util.ArrayList;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;

/* JADX INFO: renamed from: lb3.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C23780i0 extends AbstractC23800s0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f94163c;

    public C23780i0(ArrayList arrayList) {
        this.f94163c = arrayList;
    }

    @Override // lb3.AbstractC23800s0
    /* JADX INFO: renamed from: g */
    public final AbstractC23804u0 mo69873g(InterfaceC23796q0 key) {
        AbstractC22676k.m65750j(key, "key");
        if (!this.f94163c.contains(key)) {
            return null;
        }
        InterfaceC31126h interfaceC31126hMo1784d = key.mo1784d();
        AbstractC22676k.m65748h(interfaceC31126hMo1784d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        return AbstractC23767d1.m69854j((InterfaceC31165x0) interfaceC31126hMo1784d);
    }
}
