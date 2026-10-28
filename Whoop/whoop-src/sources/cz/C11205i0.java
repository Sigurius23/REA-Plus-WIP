package cz;

import c93.InterfaceC4351m;
import h20.C16621a;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import y00.C38915o4;

/* JADX INFO: renamed from: cz.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11205i0 extends C22672i implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35936w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11205i0(int i13, Object obj, Class cls, String str, String str2, int i14, int i15) {
        super(i13, i14, cls, obj, str, str2);
        this.f35936w = i15;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f35936w) {
            case 0:
                C11215n0.m30337l((C11215n0) this.receiver, (C38915o4) obj, (C16621a) obj2, (InterfaceC30057d) obj3);
                return EnumC31071a.f128113w;
            default:
                return ((InterfaceC4351m) this.receiver).invoke(obj, obj2);
        }
    }
}
