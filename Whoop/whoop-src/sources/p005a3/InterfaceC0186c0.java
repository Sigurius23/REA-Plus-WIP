package p005a3;

import p635y2.C39138v;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;

/* JADX INFO: renamed from: a3.c0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0186c0 extends InterfaceC0229n {
    /* JADX INFO: renamed from: E */
    default int mo433E(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return mo434b(new C39138v(abstractC0262w0, abstractC0262w0.getLayoutDirection()), new C0251s1(interfaceC39124q0, EnumC0257u1.f879x, EnumC0260v1.f891x, 0), AbstractC39170b.m124770b(i13, 0, 13)).getHeight();
    }

    /* JADX INFO: renamed from: b */
    InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7);

    /* JADX INFO: renamed from: g0 */
    default int mo435g0(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return new C0182b0(this, 1).m431a(new C39138v(abstractC0262w0, abstractC0262w0.getLayoutDirection()), new C0251s1(interfaceC39124q0, EnumC0257u1.f878w, EnumC0260v1.f890w, 0), AbstractC39170b.m124770b(0, i13, 7)).getWidth();
    }

    /* JADX INFO: renamed from: o */
    default int mo436o(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return mo434b(new C39138v(abstractC0262w0, abstractC0262w0.getLayoutDirection()), new C0251s1(interfaceC39124q0, EnumC0257u1.f879x, EnumC0260v1.f890w, 0), AbstractC39170b.m124770b(0, i13, 7)).getWidth();
    }

    /* JADX INFO: renamed from: y */
    default int mo437y(AbstractC0262w0 abstractC0262w0, InterfaceC39124q0 interfaceC39124q0, int i13) {
        return new C0182b0(this, 0).m431a(new C39138v(abstractC0262w0, abstractC0262w0.getLayoutDirection()), new C0251s1(interfaceC39124q0, EnumC0257u1.f878w, EnumC0260v1.f891x, 0), AbstractC39170b.m124770b(i13, 0, 13)).getHeight();
    }
}
