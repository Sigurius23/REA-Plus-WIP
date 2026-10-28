package c31;

import android.graphics.RuntimeShader;
import c93.InterfaceC4339a;
import gb1.AbstractC15684l;
import gb1.AbstractC15695w;
import hy0.AbstractC17732d;
import i91.AbstractC18254h;
import p134f2.C14015d;
import p208i2.C17878d1;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c31.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3917a implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f16003E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16004w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f16005x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f16006y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f16007z;

    public /* synthetic */ C3917a(float f13, float f14, float f15, Object obj, int i13) {
        this.f16004w = i13;
        this.f16005x = f13;
        this.f16006y = f14;
        this.f16007z = f15;
        this.f16003E = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16004w) {
            case 0:
                return AbstractC3918b.m11904h(this.f16005x, this.f16006y, this.f16007z, (C17878d1) this.f16003E, (InterfaceC22131e) obj);
            case 1:
                return AbstractC15684l.m44124h((RuntimeShader) this.f16003E, this.f16005x, this.f16006y, this.f16007z, (InterfaceC17886g0) obj);
            case 2:
                return AbstractC15695w.m44163f(this.f16005x, this.f16006y, this.f16007z, (InterfaceC4339a) this.f16003E, (C14015d) obj);
            default:
                return AbstractC17732d.m50819d(this.f16005x, this.f16006y, this.f16007z, (AbstractC18254h) this.f16003E, (InterfaceC22131e) obj);
        }
    }

    public /* synthetic */ C3917a(RuntimeShader runtimeShader, float f13, float f14, float f15) {
        this.f16004w = 1;
        this.f16003E = runtimeShader;
        this.f16005x = f13;
        this.f16006y = f14;
        this.f16007z = f15;
    }
}
