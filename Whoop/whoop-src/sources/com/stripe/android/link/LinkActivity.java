package com.stripe.android.link;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.room.C1836v0;
import b10.C2222b;
import b10.C2273z0;
import b20.C2326f;
import bc3.AbstractC3006f0;
import c00.C3795a;
import com.stripe.android.link.LinkActivity;
import com.whoop.android.R;
import j93.InterfaceC21461d;
import java.util.Set;
import o73.C27648a;
import p024b0.C2178b;
import p027b3.AbstractC2378g1;
import p108e4.AbstractC12667a;
import p161g.AbstractActivityC14909l;
import p179h.AbstractC16348f;
import p236j.AbstractC21065d;
import p236j.InterfaceC21063b;
import p249jc.AbstractC21598x;
import p298l8.AbstractC23420c;
import p298l8.C23421d;
import p442qy.C30765d;
import p599wz.C37724i0;
import p599wz.C37727j0;
import p599wz.C37730k0;
import p599wz.C37733l0;
import p599wz.C37736m0;
import p599wz.C37750r;
import p599wz.C37770y;
import p599wz.InterfaceC37739n0;
import p602x1.C37816b;
import p664yy.C39865j;
import p692zt.C41113q;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import s40.C32139c0;
import u10.C34418f;
import uo1.C35141b;
import wo1.C37445e0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/link/LinkActivity;", "Lg/l;", "<init>", "()V", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class LinkActivity extends AbstractActivityC14909l {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ int f22192E = 0;

    /* JADX INFO: renamed from: w */
    public final C23421d f22193w;

    /* JADX INFO: renamed from: x */
    public C37770y f22194x;

    /* JADX INFO: renamed from: y */
    public AbstractC21065d f22195y;

    /* JADX INFO: renamed from: z */
    public AbstractC21065d f22196z;

    public LinkActivity() {
        C2178b c2178b = new C2178b(2);
        c2178b.m6855a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37770y.class), new C37445e0(28));
        this.f22193w = c2178b.m6857c();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        AbstractC2378g1.m7328c(this);
    }

    @Override // p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            C23421d factory = this.f22193w;
            AbstractC22676k.m65750j(factory, "factory");
            C1579e2 store = getViewModelStore();
            AbstractC23420c defaultCreationExtras = getDefaultViewModelCreationExtras();
            AbstractC22676k.m65750j(store, "store");
            AbstractC22676k.m65750j(defaultCreationExtras, "defaultCreationExtras");
            C41113q c41113q = new C41113q(store, factory, defaultCreationExtras);
            InterfaceC21461d modelClass = AbstractC21598x.m60666V(C37770y.class);
            AbstractC22676k.m65750j(modelClass, "modelClass");
            String qualifiedName = modelClass.getQualifiedName();
            if (qualifiedName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f22194x = (C37770y) c41113q.m133475w("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), modelClass);
            final C37770y c37770y = this.f22194x;
            if (c37770y == null) {
                return;
            }
            InterfaceC37739n0 interfaceC37739n0 = c37770y.f161766K;
            if ((interfaceC37739n0 instanceof C37733l0) || (interfaceC37739n0 instanceof C37736m0) || (interfaceC37739n0 instanceof C37724i0) || (interfaceC37739n0 instanceof C37727j0)) {
                setTheme(R.style.StripePaymentSheetDefaultTheme);
            } else {
                if (!(interfaceC37739n0 instanceof C37730k0)) {
                    throw new NoWhenBranchMatchedException();
                }
                setTheme(R.style.StripeTransparentTheme);
            }
            AbstractC12667a.m35444P(this);
            c37770y.f161767L.m51593a(this, this);
            c37770y.f161769N.m35250f(this, this);
            C3795a c3795a = c37770y.f161779w;
            Application application = c3795a.f15500b;
            C37750r c37750r = c3795a.f15502c;
            final int i13 = 0;
            this.f22195y = registerForActivityResult(new WebLinkActivityContract(new C2273z0(application, c37750r, c3795a.f15504d, (InterfaceC30063j) c3795a.f15525q.get(), (Set) c3795a.f15526r.get(), new C2222b(c3795a.f15500b, (Set) c3795a.f15526r.get(), c37750r), new C39865j((C30765d) c3795a.f15529u.get(), (InterfaceC30063j) c3795a.f15525q.get()), (C30765d) c3795a.f15529u.get()), (C2326f) c3795a.f15534z.get()), new InterfaceC21063b() { // from class: wz.i
                @Override // p236j.InterfaceC21063b
                /* JADX INFO: renamed from: a */
                public final void mo364a(Object obj) {
                    int i14 = i13;
                    C37770y c37770y2 = c37770y;
                    switch (i14) {
                        case 0:
                            AbstractC37747q result = (AbstractC37747q) obj;
                            int i15 = LinkActivity.f22192E;
                            AbstractC22676k.m65750j(result, "result");
                            c37770y2.getClass();
                            c37770y2.m121169l(result);
                            break;
                        default:
                            InterfaceC37767w1 result2 = (InterfaceC37767w1) obj;
                            int i16 = LinkActivity.f22192E;
                            AbstractC22676k.m65750j(result2, "result");
                            ((C37755s1) c37770y2.f161779w.f15519k0.get()).f161725b.mo36564a(result2);
                            break;
                    }
                }
            });
            final int i14 = 1;
            this.f22196z = registerForActivityResult(WebLinkAuthActivityContract.f22207a, new InterfaceC21063b() { // from class: wz.i
                @Override // p236j.InterfaceC21063b
                /* JADX INFO: renamed from: a */
                public final void mo364a(Object obj) {
                    int i15 = i14;
                    C37770y c37770y2 = c37770y;
                    switch (i15) {
                        case 0:
                            AbstractC37747q result = (AbstractC37747q) obj;
                            int i16 = LinkActivity.f22192E;
                            AbstractC22676k.m65750j(result, "result");
                            c37770y2.getClass();
                            c37770y2.m121169l(result);
                            break;
                        default:
                            InterfaceC37767w1 result2 = (InterfaceC37767w1) obj;
                            int i17 = LinkActivity.f22192E;
                            AbstractC22676k.m65750j(result2, "result");
                            ((C37755s1) c37770y2.f161779w.f15519k0.get()).f161725b.mo36564a(result2);
                            break;
                    }
                }
            });
            c37770y.f161778W = new C1836v0(2, this, LinkActivity.class, "launchWebFlow", "launchWebFlow(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;)V", 0, 22);
            getLifecycle().mo4986a(c37770y);
            C27648a.m83591n(getOnBackPressedDispatcher(), null, new C35141b(this, 23), 3);
            AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C32139c0(c37770y, this, (InterfaceC30057d) null, 22), 3);
            AbstractC16348f.m46559a(this, new C37816b(new C34418f(3, c37770y, this), true, 1514588233));
        } catch (NoArgsException unused) {
            setResult(0);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C37770y c37770y = this.f22194x;
        if (c37770y != null) {
            c37770y.f161778W = null;
        }
        if (c37770y != null) {
            c37770y.f161778W = null;
        }
    }
}
