package p502ti;

import p078d1.C11457j;
import p119ej.C13225b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ti.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C33823f extends C11457j {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f141654E;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f141655z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33823f(Object obj, int i13) {
        super(11);
        this.f141655z = i13;
        this.f141654E = obj;
    }

    @Override // p078d1.C11457j
    /* JADX INFO: renamed from: z */
    public final Object mo30755z(C13225b c13225b) {
        switch (this.f141655z) {
            case 0:
                Float f13 = (Float) ((C11457j) this.f141654E).mo30755z(c13225b);
                if (f13 == null) {
                    return null;
                }
                return Float.valueOf(f13.floatValue() * 2.55f);
            default:
                return ((Function1) this.f141654E).invoke(c13225b);
        }
    }
}
