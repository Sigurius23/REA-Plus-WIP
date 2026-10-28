package c51;

import l83.C23454a0;
import p181h2.C16620e;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c51.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4222a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17110w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f17111x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f17112y;

    public /* synthetic */ C4222a(float f13, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f17110w = i13;
        this.f17111x = f13;
        this.f17112y = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17110w) {
            case 0:
                return AbstractC4226c.m13103m(this.f17111x, this.f17112y, ((Double) obj).doubleValue());
            default:
                C16620e c16620e = (C16620e) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c16620e.f63951a >> 32));
                float f13 = this.f17111x;
                float f14 = fIntBitsToFloat * f13;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c16620e.f63951a & 4294967295L)) * f13;
                InterfaceC28601c1 interfaceC28601c1 = this.f17112y;
                if (Float.intBitsToFloat((int) (((C16620e) interfaceC28601c1.getValue()).f63951a >> 32)) != f14 || Float.intBitsToFloat((int) (((C16620e) interfaceC28601c1.getValue()).f63951a & 4294967295L)) != fIntBitsToFloat2) {
                    interfaceC28601c1.setValue(new C16620e((((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)));
                }
                return C23454a0.f92919a;
        }
    }
}
