package h20;

import a20.C0162b;
import androidx.lifecycle.C1601k1;
import b30.C2562l;
import b30.C2570m;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13081r1;
import ec3.C13096w1;
import g20.C15270p;
import g40.C15352f4;
import g40.InterfaceC15367i1;
import g40.InterfaceC15452z;
import i20.C17928b;
import j00.AbstractC21106i0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k20.C22136a;
import m83.C25271y;
import o20.C27457b;
import p029b5.C2725d;
import p499t9.C33623c0;
import p599wz.C37734l1;
import p695zx.C41193o;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q20.C29829n;
import q83.InterfaceC30057d;
import s20.C32077a;
import u30.C34496a;
import v00.C35459c0;
import v00.C35477l0;
import v00.InterfaceC35457b0;
import w00.C36664t;
import w00.C36670w;
import y00.AbstractC38869j5;
import y00.AbstractC38970u5;
import y00.C38809d5;
import y00.EnumC38828f4;

/* JADX INFO: renamed from: h20.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C16657g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2994c0 f64041a;

    /* JADX INFO: renamed from: b */
    public final C16765y f64042b;

    /* JADX INFO: renamed from: c */
    public final C41193o f64043c;

    /* JADX INFO: renamed from: d */
    public final C35459c0 f64044d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4339a f64045e;

    /* JADX INFO: renamed from: f */
    public final Function1 f64046f;

    /* JADX INFO: renamed from: g */
    public final C37734l1 f64047g;

    /* JADX INFO: renamed from: h */
    public final boolean f64048h;

    /* JADX INFO: renamed from: i */
    public final C22136a f64049i;

    /* JADX INFO: renamed from: j */
    public final C1601k1 f64050j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC15452z f64051k;

    /* JADX INFO: renamed from: l */
    public final boolean f64052l;

    /* JADX INFO: renamed from: m */
    public final C2725d f64053m;

    /* JADX INFO: renamed from: n */
    public final C2570m f64054n;

    /* JADX INFO: renamed from: o */
    public final C13096w1 f64055o;

    /* JADX INFO: renamed from: p */
    public final C13052j1 f64056p;

    public C16657g(InterfaceC2994c0 coroutineScope, C16765y c16765y, C41193o cardAccountRangeRepositoryFactory, C35459c0 paymentMethodMetadata, InterfaceC4339a interfaceC4339a, Function1 function1, C37734l1 c37734l1, boolean z4, C22136a eventReporter, C1601k1 savedStateHandle, InterfaceC15452z interfaceC15452z, boolean z13, C2725d c2725d, C2570m c2570m) {
        C13081r1 c13081r1;
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        this.f64041a = coroutineScope;
        this.f64042b = c16765y;
        this.f64043c = cardAccountRangeRepositoryFactory;
        this.f64044d = paymentMethodMetadata;
        this.f64045e = interfaceC4339a;
        this.f64046f = function1;
        this.f64047g = c37734l1;
        this.f64048h = z4;
        this.f64049i = eventReporter;
        this.f64050j = savedStateHandle;
        this.f64051k = interfaceC15452z;
        this.f64052l = z13;
        this.f64053m = c2725d;
        this.f64054n = c2570m;
        InterfaceC30057d interfaceC30057d = null;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.f64055o = c13096w1M36592b;
        this.f64056p = AbstractC13091v.m36606p(c13096w1M36592b, c16765y.f64440b, (c2570m == null || (c13081r1 = (C13081r1) c2570m.f9985F) == null) ? AbstractC3269g.m9493Z(null) : c13081r1, new C2562l(this, interfaceC30057d, 1));
        AbstractC3006f0.m8732z(coroutineScope, null, null, new C0162b(this, interfaceC30057d, 25), 3);
    }

    /* JADX INFO: renamed from: a */
    public final C32077a m47226a(String paymentMethodCode) {
        AbstractC22676k.m65750j(paymentMethodCode, "paymentMethodCode");
        C35459c0 metadata = this.f64044d;
        AbstractC22676k.m65750j(metadata, "metadata");
        String str = metadata.f150966I;
        C34496a c34496aM112537b = metadata.m112537b();
        C16671i1 c16671i1 = metadata.f150968K;
        C17928b c17928b = metadata.f150969L;
        C16689l1 c16689l1 = metadata.f150997x;
        return new C32077a(paymentMethodCode, metadata.f150965H, str, c34496aM112537b, c16671i1, c17928b, metadata.f150976S, metadata.m112543x(paymentMethodCode), c16689l1);
    }

    /* JADX INFO: renamed from: b */
    public final List m47227b(String code) {
        Object next;
        AbstractC22676k.m65750j(code, "code");
        InterfaceC16640d0 interfaceC16640d0 = (InterfaceC16640d0) this.f64045e.invoke();
        Boolean boolValueOf = null;
        if (interfaceC16640d0 == null || !AbstractC22676k.m65745e(interfaceC16640d0.getType(), code)) {
            interfaceC16640d0 = null;
        }
        C15352f4 c15352f4 = new C15352f4(1, this.f64042b, C16765y.class, "onStateUpdated", "onStateUpdated(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V", 0, 3);
        C38809d5 c38809d5Mo47221e = interfaceC16640d0 != null ? interfaceC16640d0.mo47221e() : null;
        AbstractC38970u5 abstractC38970u5Mo47219c = interfaceC16640d0 != null ? interfaceC16640d0.mo47219c() : null;
        AbstractC38869j5 abstractC38869j5Mo47217a = interfaceC16640d0 != null ? interfaceC16640d0.mo47217a() : null;
        AbstractC29840y abstractC29840yMo47218b = interfaceC16640d0 != null ? interfaceC16640d0.mo47218b() : null;
        AbstractC21106i0 abstractC21106i0 = abstractC29840yMo47218b instanceof C29829n ? ((C29829n) abstractC29840yMo47218b).f121920G : null;
        AbstractC29840y abstractC29840yMo47218b2 = interfaceC16640d0 != null ? interfaceC16640d0.mo47218b() : null;
        if (abstractC29840yMo47218b2 instanceof C29829n) {
            boolValueOf = Boolean.valueOf(((C29829n) abstractC29840yMo47218b2).f121920G != null);
        }
        C35477l0 c35477l0 = new C35477l0(this.f64043c, this.f64047g, this.f64042b, c15352f4, c38809d5Mo47221e, abstractC38970u5Mo47219c, abstractC38869j5Mo47217a, abstractC21106i0, this.f64048h, this.f64051k, this.f64052l, boolValueOf, this.f64053m, this.f64054n);
        C35459c0 c35459c0 = this.f64044d;
        c35459c0.getClass();
        AbstractC22676k.m65750j(code, "code");
        List listMo112554a = null;
        if (c35459c0.m112530C(code)) {
            C36670w c36670wM112542s = c35459c0.m112542s(code);
            if (c36670wM112542s != null) {
                listMo112554a = c36670wM112542s.m112557h(c35459c0, c35477l0.m112546a(c35459c0, false));
            }
        } else if (c35459c0.m112544y(code)) {
            C36664t c36664tM112541k = c35459c0.m112541k(code);
            if (c36664tM112541k != null) {
                listMo112554a = c36664tM112541k.m112557h(c35459c0, c35477l0.m112546a(c35459c0, false));
            }
        } else {
            Iterator it = c35459c0.m112533N().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((InterfaceC35457b0) next).getType().f167132w, code));
            InterfaceC35457b0 interfaceC35457b0 = (InterfaceC35457b0) next;
            if (interfaceC35457b0 != null) {
                listMo112554a = interfaceC35457b0.mo112527b().mo112554a(interfaceC35457b0, c35459c0, c35459c0.f150970M, c35477l0.m112546a(c35459c0, interfaceC35457b0.mo112528c(c35459c0)));
            }
        }
        return listMo112554a == null ? C25271y.f99162w : listMo112554a;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:19:0x0047->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final InterfaceC16747v m47228c(String paymentMethodCode) {
        Iterator it;
        InterfaceC41211c interfaceC41211cMo43549c;
        AbstractC22676k.m65750j(paymentMethodCode, "paymentMethodCode");
        List listM47227b = m47227b(paymentMethodCode);
        if ((listM47227b instanceof Collection) && listM47227b.isEmpty()) {
            C33623c0 c33623c0 = EnumC38828f4.f167088G;
            if (!paymentMethodCode.equals("us_bank_account")) {
                it = listM47227b.iterator();
                while (it.hasNext()) {
                    interfaceC41211cMo43549c = ((InterfaceC15367i1) it.next()).mo43549c();
                    if (interfaceC41211cMo43549c != null) {
                        if (interfaceC41211cMo43549c == null) {
                        }
                    }
                }
                interfaceC41211cMo43549c = null;
                if (interfaceC41211cMo43549c == null) {
                }
            }
        } else {
            Iterator it3 = listM47227b.iterator();
            while (it3.hasNext()) {
                if (((InterfaceC15367i1) it3.next()).mo43550d()) {
                }
            }
            C33623c0 c33623c1 = EnumC38828f4.f167088G;
            if (!paymentMethodCode.equals("us_bank_account") && !paymentMethodCode.equals("link")) {
                it = listM47227b.iterator();
                while (it.hasNext()) {
                    interfaceC41211cMo43549c = ((InterfaceC15367i1) it.next()).mo43549c();
                    if (interfaceC41211cMo43549c != null) {
                        return interfaceC41211cMo43549c == null ? C16735t.f64289a : new C16741u(interfaceC41211cMo43549c);
                    }
                }
                interfaceC41211cMo43549c = null;
                if (interfaceC41211cMo43549c == null) {
                }
            }
        }
        return C16735t.f64290b;
    }

    /* JADX INFO: renamed from: d */
    public final void m47229d(C27457b c27457b, String selectedPaymentMethodCode) {
        AbstractC22676k.m65750j(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        AbstractC3006f0.m8732z(this.f64041a, null, null, new C15270p(this, c27457b, selectedPaymentMethodCode, (InterfaceC30057d) null, 14), 3);
    }
}
