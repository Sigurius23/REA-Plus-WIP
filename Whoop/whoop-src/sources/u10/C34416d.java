package u10;

import a30.C0273a;
import b30.C2659y0;
import be.C3151d;
import c93.InterfaceC4339a;
import h20.C16651f;
import h20.C16687l;
import h20.C16689l1;
import h20.EnumC16677j1;
import java.util.Set;
import k20.C22136a;
import k83.InterfaceC22297a;
import my.EnumC26028b;
import p537ux.InterfaceC35320a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s10.C32064f;
import sc0.C32355c;
import v00.C35459c0;
import v00.C35482o;
import v00.C35484p;

/* JADX INFO: renamed from: u10.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C34416d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC22297a f144641a;

    /* JADX INFO: renamed from: b */
    public final C35459c0 f144642b;

    /* JADX INFO: renamed from: c */
    public final C16651f f144643c;

    /* JADX INFO: renamed from: d */
    public final C32064f f144644d;

    /* JADX INFO: renamed from: e */
    public final C22136a f144645e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC22297a f144646f;

    public C34416d(InterfaceC22297a interfaceC22297a, C35459c0 paymentMethodMetadata, C16651f customerStateHolder, C32064f selectionHolder, C22136a eventReporter, InterfaceC22297a manageNavigatorProvider) {
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(customerStateHolder, "customerStateHolder");
        AbstractC22676k.m65750j(selectionHolder, "selectionHolder");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        AbstractC22676k.m65750j(manageNavigatorProvider, "manageNavigatorProvider");
        this.f144641a = interfaceC22297a;
        this.f144642b = paymentMethodMetadata;
        this.f144643c = customerStateHolder;
        this.f144644d = selectionHolder;
        this.f144645e = eventReporter;
        this.f144646f = manageNavigatorProvider;
    }

    /* JADX INFO: renamed from: a */
    public final C2659y0 m108791a(C16687l displayableSavedPaymentMethod) {
        C35482o c35482o;
        EnumC26028b enumC26028b;
        AbstractC22676k.m65750j(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
        C35459c0 c35459c0 = this.f144642b;
        boolean zMo124338q0 = c35459c0.f150996w.mo124338q0();
        C16651f c16651f = this.f144643c;
        boolean zBooleanValue = ((Boolean) ((InterfaceC4339a) c16651f.f64025f.f104635y).invoke()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) ((InterfaceC4339a) c16651f.f64026g.f104635y).invoke()).booleanValue();
        InterfaceC35320a interfaceC35320a = c35459c0.f150981X;
        C16689l1 c16689l1 = c35459c0.f150997x;
        EnumC16677j1 enumC16677j1 = c16689l1.f64192z;
        Set setM47249b = c16689l1.m47249b();
        C35484p c35484p = c35459c0.f150973P;
        boolean z4 = false;
        if (c35484p != null && c35484p.f151062z) {
            z4 = true;
        }
        C0273a c0273a = (C0273a) c16651f.f64021b.f45200w.getValue();
        InterfaceC30057d interfaceC30057d = null;
        return new C2659y0(zMo124338q0, zBooleanValue, displayableSavedPaymentMethod, interfaceC35320a, enumC16677j1, setM47249b, zBooleanValue2, (c35484p == null || (c35482o = c35484p.f151058E) == null || (enumC26028b = c35482o.f151054w) == null) ? null : enumC26028b.m77436a(c35459c0.f150966I), AbstractC22676k.m65745e(displayableSavedPaymentMethod.f64178b.f167527w, c0273a != null ? c0273a.f936x : null), z4, new C34415c(this, interfaceC30057d, 0), new C3151d(this, interfaceC30057d, 7), new C34415c(this, interfaceC30057d, 1), new C34414b(this, 0), new C32355c(this, 14));
    }
}
