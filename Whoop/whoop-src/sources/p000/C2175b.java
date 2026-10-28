package p000;

import androidx.compose.p018ui.Modifier;
import b30.C2598p3;
import c51.AbstractC4234k;
import e81.AbstractC12836k;
import l83.C23454a0;
import no0.AbstractC26978v0;
import p163g1.EnumC15209z3;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p390p1.InterfaceC28670t2;
import p636y3.C39174f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p723o22.AbstractC27468b;
import t10.C33290j;
import u10.AbstractC34428p;
import x20.C37848p;
import x20.EnumC37847o;

/* JADX INFO: renamed from: b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2175b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8653w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28670t2 f8654x;

    public /* synthetic */ C2175b(InterfaceC28670t2 interfaceC28670t2, int i13) {
        this.f8653w = i13;
        this.f8654x = interfaceC28670t2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8653w) {
            case 0:
                InterfaceC17886g0 graphicsLayer = (InterfaceC17886g0) obj;
                AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
                InterfaceC28670t2 interfaceC28670t2 = this.f8654x;
                C17920x0 c17920x0 = (C17920x0) graphicsLayer;
                c17920x0.m51560p(((Number) interfaceC28670t2.getValue()).floatValue());
                c17920x0.m51561r(((Number) interfaceC28670t2.getValue()).floatValue());
                return C23454a0.f92919a;
            case 1:
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                AbstractC18041w.m51810i(semantics, 0);
                C2598p3 c2598p3 = (C2598p3) this.f8654x.getValue();
                if (c2598p3 == null || !c2598p3.f10110e) {
                    AbstractC18041w.m51802a(semantics);
                }
                return C23454a0.f92919a;
            case 2:
                return AbstractC4234k.m13185x(this.f8654x, (InterfaceC22129c) obj);
            case 3:
                return AbstractC12836k.m35976I(this.f8654x, (InterfaceC17886g0) obj);
            case 4:
                InterfaceC17886g0 graphicsLayer2 = (InterfaceC17886g0) obj;
                AbstractC22676k.m65750j(graphicsLayer2, "$this$graphicsLayer");
                C17920x0 c17920x1 = (C17920x0) graphicsLayer2;
                c17920x1.m51562s(c17920x1.f69654S.getDensity() * ((C39174f) this.f8654x.getValue()).f168413w);
                return C23454a0.f92919a;
            case 5:
                EnumC15209z3 it = (EnumC15209z3) obj;
                AbstractC22676k.m65750j(it, "it");
                return Boolean.valueOf(!((Boolean) this.f8654x.getValue()).booleanValue());
            case 6:
                EnumC15209z3 it3 = (EnumC15209z3) obj;
                AbstractC22676k.m65750j(it3, "it");
                return Boolean.valueOf(!((Boolean) this.f8654x.getValue()).booleanValue());
            case 7:
                ((C17920x0) ((InterfaceC17886g0) obj)).m51551a(((Number) this.f8654x.getValue()).floatValue());
                return C23454a0.f92919a;
            case 8:
                return AbstractC26978v0.m80829m(this.f8654x, (Modifier) obj);
            case 9:
                return AbstractC27468b.m82893e(this.f8654x, (InterfaceC22131e) obj);
            case 10:
                EnumC15209z3 it4 = (EnumC15209z3) obj;
                AbstractC22676k.m65750j(it4, "it");
                return Boolean.valueOf(!((C33290j) this.f8654x.getValue()).f138838d);
            case 11:
                EnumC15209z3 it5 = (EnumC15209z3) obj;
                AbstractC22676k.m65750j(it5, "it");
                return Boolean.valueOf(!((AbstractC34428p) this.f8654x.getValue()).mo108793h());
            default:
                EnumC15209z3 proposedValue = (EnumC15209z3) obj;
                AbstractC22676k.m65750j(proposedValue, "proposedValue");
                return Boolean.valueOf((proposedValue == EnumC15209z3.f57106w && ((C37848p) this.f8654x.getValue()).f162025c == EnumC37847o.f162019w) ? false : true);
        }
    }
}
