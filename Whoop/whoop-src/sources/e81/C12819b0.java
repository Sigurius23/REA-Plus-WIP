package e81;

import c93.InterfaceC4339a;
import gb1.AbstractC15679g;
import i91.AbstractC18254h;
import java.util.List;
import p134f2.C14015d;
import p208i2.AbstractC17911t;
import p208i2.InterfaceC17869a1;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;
import z71.AbstractC40153l;

/* JADX INFO: renamed from: e81.b0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C12819b0 implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f43912E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f43913F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43914w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f43915x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f43916y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f43917z;

    public /* synthetic */ C12819b0(float f13, AbstractC18254h abstractC18254h, float f14, AbstractC18254h abstractC18254h2, float f15) {
        this.f43915x = f13;
        this.f43912E = abstractC18254h;
        this.f43916y = f14;
        this.f43913F = abstractC18254h2;
        this.f43917z = f15;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f43914w) {
            case 0:
                return AbstractC12823d0.m35954w((InterfaceC4339a) this.f43912E, (List) this.f43913F, this.f43915x, this.f43916y, this.f43917z, (InterfaceC22131e) obj);
            case 1:
                return AbstractC15679g.m44110g((InterfaceC17869a1) this.f43912E, this.f43915x, this.f43916y, this.f43917z, (AbstractC17911t) this.f43913F, (C14015d) obj);
            default:
                return AbstractC40153l.m128757p(this.f43915x, (AbstractC18254h) this.f43912E, this.f43916y, (AbstractC18254h) this.f43913F, this.f43917z, (InterfaceC22131e) obj);
        }
    }

    public /* synthetic */ C12819b0(InterfaceC4339a interfaceC4339a, List list, float f13, float f14, float f15) {
        this.f43912E = interfaceC4339a;
        this.f43913F = list;
        this.f43915x = f13;
        this.f43916y = f14;
        this.f43917z = f15;
    }

    public /* synthetic */ C12819b0(InterfaceC17869a1 interfaceC17869a1, float f13, float f14, float f15, AbstractC17911t abstractC17911t) {
        this.f43912E = interfaceC17869a1;
        this.f43915x = f13;
        this.f43916y = f14;
        this.f43917z = f15;
        this.f43913F = abstractC17911t;
    }
}
