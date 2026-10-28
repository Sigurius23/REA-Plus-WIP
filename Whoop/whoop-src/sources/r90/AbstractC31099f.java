package r90;

import a00.C0073h;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2549j2;
import bc3.InterfaceC2994c0;
import c31.C3927k;
import c31.EnumC3920d;
import c31.EnumC3921e;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.activation.domain.models.ConsentSubmission;
import com.whoop.design.util.TextResource;
import h80.InterfaceC17002b;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import j80.InterfaceC21413a;
import j80.InterfaceC21415c;
import j80.InterfaceC21416d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kd1.AbstractC22403o;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p095dp.AbstractC12240d;
import p163g1.AbstractC14959b1;
import p163g1.C15127r1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p353o0.C27325i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p714k80.AbstractC22288q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28329e;
import p727py0.C29616a;
import p90.C29000h;
import pj2.C29311j;
import q12.C29802c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qk2.C30453i;
import r61.C30985h;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: r90.f */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aC\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a9\u0010\u0013\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\f\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0018²\u0006\u000e\u0010\u0015\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0016\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lr90/g;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "k", "(Lr90/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "selectAllTitle", "", "isChecked", "analyticsName", "country", "x", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "Lr90/j;", "terms", "G", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "termsInitialized", "showTermDetail", "enableButton", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31099f {

    /* JADX INFO: renamed from: r90.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.privacyconsent.PrivacyConsentScreenKt$PrivacyConsentScreenView$2$1", m100430f = "PrivacyConsentScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f128257w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31100g f128258x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f128259y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C31100g c31100g, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f128258x = c31100g;
            this.f128259y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f128258x, this.f128259y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f128257w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C3927k c3927kM95812j = this.f128258x.getProgressButtonState();
            if ((c3927kM95812j != null ? c3927kM95812j.getState() : null) == EnumC3920d.LOADING) {
                AbstractC31099f.m95777G(this.f128258x.m95817o(), this.f128258x.getAnalyticsName(), this.f128259y);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: r90.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.privacyconsent.PrivacyConsentScreenKt$PrivacyConsentScreenView$3$1", m100430f = "PrivacyConsentScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f128260w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f128261x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C31100g f128262y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f128263z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, C31100g c31100g, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f128261x = function1;
            this.f128262y = c31100g;
            this.f128263z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f128261x, this.f128262y, this.f128263z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f128260w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC31099f.m95795r(this.f128263z)) {
                this.f128261x.invoke(new InterfaceC21416d.f(this.f128262y.m95817o()));
                AbstractC31099f.m95796s(this.f128263z, true);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: r90.f$c */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.privacyconsent.PrivacyConsentScreenKt$PrivacyConsentScreenView$4$1", m100430f = "PrivacyConsentScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f128264w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31100g f128265x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f128266y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f128267z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C31100g c31100g, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f128265x = c31100g;
            this.f128266y = function1;
            this.f128267z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f128265x, this.f128266y, this.f128267z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f128264w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC28601c1 interfaceC28601c1 = this.f128267z;
            List<C31103j> listM95817o = this.f128265x.m95817o();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listM95817o) {
                if (((C31103j) obj2).getIsRequired()) {
                    arrayList.add(obj2);
                }
            }
            boolean z4 = true;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((C31103j) it.next()).getIsChecked()) {
                        z4 = false;
                        break;
                    }
                }
            }
            AbstractC31099f.m95800w(interfaceC28601c1, z4);
            Function1 function1 = this.f128266y;
            boolean zM95808f = this.f128265x.getConsentsAccepted();
            boolean zM95811i = this.f128265x.getMarketingOptIn();
            boolean zM95813k = this.f128265x.getRecommendationOptIn();
            List<C31103j> listM95817o2 = this.f128265x.m95817o();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM95817o2, 10));
            for (C31103j c31103j : listM95817o2) {
                arrayList2.add(new ConsentSubmission(c31103j.getId(), c31103j.getConsentKey(), c31103j.getIsChecked()));
            }
            function1.invoke(new InterfaceC21413a.l0(zM95808f, zM95811i, zM95813k, arrayList2));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: r90.f$d */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.privacyconsent.PrivacyConsentScreenKt$PrivacyConsentScreenView$5$1", m100430f = "PrivacyConsentScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f128268w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f128269x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f128270y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f128269x = function1;
            this.f128270y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f128269x, this.f128270y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f128268w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC31099f.m95799v(this.f128270y)) {
                this.f128269x.invoke(EnumC3921e.ENABLE);
            } else {
                this.f128269x.invoke(EnumC3921e.DISABLE);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: r90.f$e */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.privacyconsent.PrivacyConsentScreenKt$PrivacyConsentScreenView$6$1", m100430f = "PrivacyConsentScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f128271w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31100g f128272x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f128273y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C31100g c31100g, Function1 function1, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f128272x = c31100g;
            this.f128273y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f128272x, this.f128273y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f128271w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f128272x.getStripeToken() != null) {
                this.f128273y.invoke(new InterfaceC21413a.k0(this.f128272x.getStripeToken()));
            }
            this.f128273y.invoke(InterfaceC21415c.d.f82168a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m95771A(InterfaceC4339a interfaceC4339a, boolean z4) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m95772B(String str, boolean z4, String str2, String str3, Function1 function1, int i13, Composer composer, int i14) {
        m95801x(str, z4, str2, str3, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    public static final void m95777G(List<C31103j> terms, String analyticsName, Function1 onViewEvent) {
        Object obj;
        Object next;
        Object next2;
        AbstractC22676k.m65750j(terms, "terms");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        List<C31103j> list = terms;
        boolean z4 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((C31103j) it.next()).getIsChecked()) {
                    z4 = false;
                    break;
                }
            }
        }
        Iterator<T> it3 = list.iterator();
        do {
            obj = null;
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (((C31103j) next).getConsent() != EnumC31097d.CONSENT_PROCESSING_OF_DATA);
        C31103j c31103j = (C31103j) next;
        boolean zM95854k = c31103j != null ? c31103j.getIsChecked() : false;
        Iterator<T> it4 = list.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (((C31103j) next2).getConsent() != EnumC31097d.MARKETING_OPT_IN);
        C31103j c31103j2 = (C31103j) next2;
        boolean zM95854k2 = c31103j2 != null ? c31103j2.getIsChecked() : false;
        for (Object obj2 : list) {
            if (((C31103j) obj2).getConsent() == EnumC31097d.RECOMMENDATION_OPT_IN) {
                obj = obj2;
                break;
            }
        }
        C31103j c31103j3 = (C31103j) obj;
        boolean zM95854k3 = c31103j3 != null ? c31103j3.getIsChecked() : false;
        if (z4) {
            onViewEvent.invoke(new InterfaceC17002b.i(analyticsName, null, "check_box", "select_all", "permissions", null, 34, null));
        }
        if (zM95854k) {
            onViewEvent.invoke(new InterfaceC17002b.i(analyticsName, null, "check_box", "health_data", "permissions", null, 34, null));
        }
        if (zM95854k2) {
            onViewEvent.invoke(new InterfaceC17002b.i(analyticsName, null, "check_box", "marketing", "permissions", null, 34, null));
        }
        if (zM95854k3) {
            onViewEvent.invoke(new InterfaceC17002b.i(analyticsName, null, "check_box", NotificationCompat.CATEGORY_RECOMMENDATION, "permissions", null, 34, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0237  */
    /* JADX WARN: Code duplicated, block: B:108:0x0254  */
    /* JADX WARN: Code duplicated, block: B:109:0x0259  */
    /* JADX WARN: Code duplicated, block: B:111:0x025c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0289  */
    /* JADX WARN: Code duplicated, block: B:118:0x0299  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:123:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:124:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:133:0x0309  */
    /* JADX WARN: Code duplicated, block: B:134:0x0316  */
    /* JADX WARN: Code duplicated, block: B:137:0x0329  */
    /* JADX WARN: Code duplicated, block: B:139:0x032d  */
    /* JADX WARN: Code duplicated, block: B:140:0x032f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0338  */
    /* JADX WARN: Code duplicated, block: B:147:0x034a  */
    /* JADX WARN: Code duplicated, block: B:148:0x034c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0364  */
    /* JADX WARN: Code duplicated, block: B:157:0x0384  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:164:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:170:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:? A[LOOP:2: B:101:0x0231->B:174:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x011c  */
    /* JADX WARN: Code duplicated, block: B:70:0x011e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0127  */
    /* JADX WARN: Code duplicated, block: B:77:0x013e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0140  */
    /* JADX WARN: Code duplicated, block: B:82:0x014a  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:94:0x0202  */
    /* JADX WARN: Code duplicated, block: B:95:0x020e  */
    /* JADX INFO: renamed from: k */
    public static final void m95788k(C31100g viewState, Function1 function1, Composer composer, int i13, int i14) {
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c2;
        int i15;
        boolean z13;
        boolean z14;
        Object objM87133R4;
        boolean z15;
        boolean zM87157i;
        Object objM87133R5;
        boolean z16;
        boolean z17;
        Object objM87133R6;
        boolean z18;
        Object objM87133R7;
        boolean z19;
        boolean z24;
        Object objM87133R8;
        InterfaceC28601c1 interfaceC28601c3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q2;
        List<C31103j> listM95817o;
        Iterator<T> it;
        boolean z25;
        C31103j c31103j;
        String strM95852i;
        Function1 function5;
        C28655q c28655q3;
        InterfaceC28601c1 interfaceC28601c4;
        String strM95797t;
        Iterator<T> it3;
        Object next;
        C31103j c31103j2;
        boolean z26;
        Object objM87133R9;
        boolean z27;
        boolean zM87157i2;
        Object c0073h;
        InterfaceC28601c1 interfaceC28601c5;
        Function1 function6;
        Object objM87133R10;
        Object objM87133R11;
        InterfaceC28601c1 interfaceC28601c6;
        Object objM87133R12;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(781731161);
        int i16 = 4;
        int i17 = (i13 & 6) == 0 ? i13 | (c28655q4.m87157i(viewState) ? 4 : 2) : i13;
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i17 |= c28655q4.m87157i(function2) ? 32 : 16;
            }
            if ((i17 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i17 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R12 = c28655q4.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C30985h(i16);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    function4 = (Function1) objM87133R12;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q4.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(null);
                    c28655q4.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q4.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                C3927k c3927kM95812j = viewState.getProgressButtonState();
                boolean zM87157i3 = c28655q4.m87157i(viewState);
                i15 = i17 & 112;
                if (i15 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i3 | z13;
                objM87133R4 = c28655q4.m87133R();
                if (z14 || objM87133R4 == c28676v0) {
                    objM87133R4 = new a(viewState, function4, null);
                    c28655q4.m87172p0(objM87133R4);
                }
                int i19 = C3927k.f16020r;
                AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R4, c3927kM95812j);
                Boolean boolValueOf = Boolean.valueOf(m95795r(interfaceC28601c1));
                if (i15 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i = z15 | c28655q4.m87157i(viewState);
                objM87133R5 = c28655q4.m87133R();
                if (zM87157i || objM87133R5 == c28676v0) {
                    objM87133R5 = new b(function4, viewState, interfaceC28601c1, null);
                    c28655q4.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R5, boolValueOf);
                List<C31103j> listM95817o2 = viewState.m95817o();
                boolean zM87157i4 = c28655q4.m87157i(viewState);
                if (i15 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i4 | z16;
                objM87133R6 = c28655q4.m87133R();
                if (z17 || objM87133R6 == c28676v0) {
                    objM87133R6 = new c(viewState, function4, interfaceC28601c2, null);
                    c28655q4.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R6, listM95817o2);
                Boolean boolValueOf2 = Boolean.valueOf(m95799v(interfaceC28601c2));
                if (i15 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R7 = c28655q4.m87133R();
                if (z18 || objM87133R7 == c28676v0) {
                    objM87133R7 = new d(function4, interfaceC28601c2, null);
                    c28655q4.m87172p0(objM87133R7);
                }
                AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R7, boolValueOf2);
                String strM95815m = viewState.getStripeToken();
                boolean zM87157i5 = c28655q4.m87157i(viewState);
                if (i15 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = zM87157i5 | z19;
                objM87133R8 = c28655q4.m87133R();
                if (z24 || objM87133R8 == c28676v0) {
                    objM87133R8 = new e(viewState, function4, null);
                    c28655q4.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R8, strM95815m);
                C2314t c2314t = C2314t.f9131w;
                float f13 = 8;
                float f14 = ((float) 2.5d) * f13;
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), f14, 7 * f13, f14, 0.0f, 8), AbstractC30060g.m92099U(0, c28655q4, 1), 14);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q4, 6);
                interfaceC28601c3 = interfaceC28601c7;
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM92116f0);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N);
                c28655q2 = c28655q4;
                AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubTitle(), c28655q2, AbstractC22403o.f87638a | (TextResource.$stable << 3), 0);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f14, c2314t));
                if (viewState.getSelectAllTitle() == null) {
                    c28655q2.m87150e0(1484419535);
                    c28655q2.m87173q(false);
                    function5 = function4;
                } else {
                    c28655q2.m87150e0(1484419536);
                    String strM95814l = viewState.getSelectAllTitle();
                    listM95817o = viewState.m95817o();
                    if (!(listM95817o instanceof Collection) && listM95817o.isEmpty()) {
                        z25 = true;
                        break;
                    }
                    it = listM95817o.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((C31103j) it.next()).getIsChecked()) {
                                z25 = false;
                                break;
                            }
                        } else {
                            z25 = true;
                            break;
                        }
                    }
                    String strM95807e = viewState.getAnalyticsName();
                    c31103j = (C31103j) AbstractC25265s.m74100H0(viewState.m95817o());
                    if (c31103j != null) {
                        strM95852i = c31103j.getRegion();
                    } else {
                        strM95852i = null;
                    }
                    if (strM95852i == null) {
                        strM95852i = "";
                    }
                    String str = strM95852i;
                    Function1 function7 = function4;
                    m95801x(strM95814l, z25, strM95807e, str, function7, c28655q2, (i17 << 9) & 57344);
                    function5 = function7;
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87150e0(1017727928);
                for (C31103j c31103j3 : viewState.m95817o()) {
                    String strM95807e2 = viewState.getAnalyticsName();
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        interfaceC28601c6 = interfaceC28601c3;
                        objM87133R11 = new C29802c(6, interfaceC28601c6);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        interfaceC28601c6 = interfaceC28601c3;
                    }
                    C28655q c28655q5 = c28655q2;
                    AbstractC31096c.m95759h(c31103j3, strM95807e2, function5, (Function1) objM87133R11, c28655q5, ((i17 << 3) & 896) | 3072);
                    c28655q2 = c28655q5;
                    interfaceC28601c3 = interfaceC28601c6;
                }
                c28655q3 = c28655q2;
                interfaceC28601c4 = interfaceC28601c3;
                c28655q3.m87173q(false);
                strM95797t = m95797t(interfaceC28601c4);
                if (strM95797t == null) {
                    c28655q3.m87150e0(1485148965);
                    c28655q3.m87173q(false);
                    function6 = function5;
                    c28655q = c28655q3;
                } else {
                    c28655q3.m87150e0(1485148966);
                    it3 = viewState.m95817o().iterator();
                    do {
                        if (it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!AbstractC22676k.m65745e(((C31103j) next).getId(), strM95797t));
                    c31103j2 = (C31103j) next;
                    if (c31103j2 == null) {
                        c28655q3.m87150e0(1957708444);
                        c28655q3.m87173q(false);
                        function6 = function5;
                        c28655q = c28655q3;
                    } else {
                        c28655q3.m87150e0(1957708445);
                        String strM95810h = viewState.getJumpCtaTitle();
                        String strM95806c = viewState.getAcceptCtaTitle();
                        String str2 = strM95806c != null ? strM95806c : "";
                        if (i15 == 32) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R9 = c28655q3.m87133R();
                        if (z26 || objM87133R9 == c28676v0) {
                            objM87133R9 = new C29000h(function5, 21);
                            c28655q3.m87172p0(objM87133R9);
                        }
                        Function1 function8 = (Function1) objM87133R9;
                        if (i15 == 32) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zM87157i2 = z27 | c28655q3.m87157i(viewState) | c28655q3.m87153g(c31103j2) | c28655q3.m87153g(strM95797t);
                        Object objM87133R13 = c28655q3.m87133R();
                        if (!zM87157i2 || objM87133R13 == c28676v0) {
                            Function1 function9 = function5;
                            interfaceC28601c5 = interfaceC28601c4;
                            c0073h = new C0073h(function9, viewState, c31103j2, strM95797t, interfaceC28601c5, 19);
                            function6 = function9;
                            c28655q3.m87172p0(c0073h);
                        } else {
                            function6 = function5;
                            c0073h = objM87133R13;
                            interfaceC28601c5 = interfaceC28601c4;
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) c0073h;
                        objM87133R10 = c28655q3.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C27325i(18, interfaceC28601c5);
                            c28655q3.m87172p0(objM87133R10);
                        }
                        AbstractC31101h.m95830k(c31103j2, strM95810h, str2, function8, interfaceC4339a, (InterfaceC4339a) objM87133R10, c28655q3, ProfileVerifier.CompilationStatus.f6515xf2722a21, 0);
                        c28655q = c28655q3;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73388u(17, f13, c2314t, c28655q, true);
                function3 = function6;
            } else {
                c28655q = c28655q4;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30453i(viewState, i13, function3, i14, 5);
            }
        }
        i17 |= 48;
        function2 = function1;
        if ((i17 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q4.m87135U(i17 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R12 = c28655q4.m87133R();
                if (objM87133R12 == c28676v0) {
                    objM87133R12 = new C30985h(i16);
                    c28655q4.m87172p0(objM87133R12);
                }
                function4 = (Function1) objM87133R12;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q4.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q4.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q4.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(null);
                c28655q4.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q4.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q4.m87172p0(objM87133R3);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            C3927k c3927kM95812j2 = viewState.getProgressButtonState();
            boolean zM87157i6 = c28655q4.m87157i(viewState);
            i15 = i17 & 112;
            if (i15 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87157i6 | z13;
            objM87133R4 = c28655q4.m87133R();
            if (z14) {
                objM87133R4 = new a(viewState, function4, null);
                c28655q4.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new a(viewState, function4, null);
                c28655q4.m87172p0(objM87133R4);
            }
            int i110 = C3927k.f16020r;
            AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R4, c3927kM95812j2);
            Boolean boolValueOf3 = Boolean.valueOf(m95795r(interfaceC28601c1));
            if (i15 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87157i = z15 | c28655q4.m87157i(viewState);
            objM87133R5 = c28655q4.m87133R();
            if (zM87157i) {
                objM87133R5 = new b(function4, viewState, interfaceC28601c1, null);
                c28655q4.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new b(function4, viewState, interfaceC28601c1, null);
                c28655q4.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R5, boolValueOf3);
            List<C31103j> listM95817o3 = viewState.m95817o();
            boolean zM87157i7 = c28655q4.m87157i(viewState);
            if (i15 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = zM87157i7 | z16;
            objM87133R6 = c28655q4.m87133R();
            if (z17) {
                objM87133R6 = new c(viewState, function4, interfaceC28601c2, null);
                c28655q4.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new c(viewState, function4, interfaceC28601c2, null);
                c28655q4.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R6, listM95817o3);
            Boolean boolValueOf4 = Boolean.valueOf(m95799v(interfaceC28601c2));
            if (i15 == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            objM87133R7 = c28655q4.m87133R();
            if (z18) {
                objM87133R7 = new d(function4, interfaceC28601c2, null);
                c28655q4.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new d(function4, interfaceC28601c2, null);
                c28655q4.m87172p0(objM87133R7);
            }
            AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R7, boolValueOf4);
            String strM95815m2 = viewState.getStripeToken();
            boolean zM87157i8 = c28655q4.m87157i(viewState);
            if (i15 == 32) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = zM87157i8 | z19;
            objM87133R8 = c28655q4.m87133R();
            if (z24) {
                objM87133R8 = new e(viewState, function4, null);
                c28655q4.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new e(viewState, function4, null);
                c28655q4.m87172p0(objM87133R8);
            }
            AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R8, strM95815m2);
            C2314t c2314t2 = C2314t.f9131w;
            float f15 = 8;
            float f16 = ((float) 2.5d) * f15;
            Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t2), f16, 7 * f15, f16, 0.0f, 8), AbstractC30060g.m92099U(0, c28655q4, 1), 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q4, 6);
            interfaceC28601c3 = interfaceC28601c8;
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM92116f1);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N2);
            c28655q2 = c28655q4;
            AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubTitle(), c28655q2, AbstractC22403o.f87638a | (TextResource.$stable << 3), 0);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f16, c2314t2));
            if (viewState.getSelectAllTitle() == null) {
                c28655q2.m87150e0(1484419535);
                c28655q2.m87173q(false);
                function5 = function4;
            } else {
                c28655q2.m87150e0(1484419536);
                String strM95814l2 = viewState.getSelectAllTitle();
                listM95817o = viewState.m95817o();
                if (!(listM95817o instanceof Collection)) {
                    it = listM95817o.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((C31103j) it.next()).getIsChecked()) {
                                z25 = false;
                                break;
                            }
                        } else {
                            z25 = true;
                            break;
                        }
                    }
                } else {
                    it = listM95817o.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((C31103j) it.next()).getIsChecked()) {
                                z25 = false;
                                break;
                            }
                        } else {
                            z25 = true;
                            break;
                        }
                    }
                }
                String strM95807e3 = viewState.getAnalyticsName();
                c31103j = (C31103j) AbstractC25265s.m74100H0(viewState.m95817o());
                if (c31103j != null) {
                    strM95852i = c31103j.getRegion();
                } else {
                    strM95852i = null;
                }
                if (strM95852i == null) {
                    strM95852i = "";
                }
                String str3 = strM95852i;
                Function1 function10 = function4;
                m95801x(strM95814l2, z25, strM95807e3, str3, function10, c28655q2, (i17 << 9) & 57344);
                function5 = function10;
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            c28655q2.m87150e0(1017727928);
            while (r8.hasNext()) {
                String strM95807e4 = viewState.getAnalyticsName();
                objM87133R11 = c28655q2.m87133R();
                if (objM87133R11 == c28676v0) {
                    interfaceC28601c6 = interfaceC28601c3;
                    objM87133R11 = new C29802c(6, interfaceC28601c6);
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    interfaceC28601c6 = interfaceC28601c3;
                }
                C28655q c28655q6 = c28655q2;
                AbstractC31096c.m95759h(c31103j3, strM95807e4, function5, (Function1) objM87133R11, c28655q6, ((i17 << 3) & 896) | 3072);
                c28655q2 = c28655q6;
                interfaceC28601c3 = interfaceC28601c6;
            }
            c28655q3 = c28655q2;
            interfaceC28601c4 = interfaceC28601c3;
            c28655q3.m87173q(false);
            strM95797t = m95797t(interfaceC28601c4);
            if (strM95797t == null) {
                c28655q3.m87150e0(1485148965);
                c28655q3.m87173q(false);
                function6 = function5;
                c28655q = c28655q3;
            } else {
                c28655q3.m87150e0(1485148966);
                it3 = viewState.m95817o().iterator();
                do {
                    if (it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!AbstractC22676k.m65745e(((C31103j) next).getId(), strM95797t));
                c31103j2 = (C31103j) next;
                if (c31103j2 == null) {
                    c28655q3.m87150e0(1957708444);
                    c28655q3.m87173q(false);
                    function6 = function5;
                    c28655q = c28655q3;
                } else {
                    c28655q3.m87150e0(1957708445);
                    String strM95810h2 = viewState.getJumpCtaTitle();
                    String strM95806c2 = viewState.getAcceptCtaTitle();
                    if (strM95806c2 != null) {
                    }
                    if (i15 == 32) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R9 = c28655q3.m87133R();
                    if (z26) {
                        objM87133R9 = new C29000h(function5, 21);
                        c28655q3.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C29000h(function5, 21);
                        c28655q3.m87172p0(objM87133R9);
                    }
                    Function1 function11 = (Function1) objM87133R9;
                    if (i15 == 32) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87157i2 = z27 | c28655q3.m87157i(viewState) | c28655q3.m87153g(c31103j2) | c28655q3.m87153g(strM95797t);
                    Object objM87133R14 = c28655q3.m87133R();
                    if (zM87157i2) {
                        Function1 function12 = function5;
                        interfaceC28601c5 = interfaceC28601c4;
                        c0073h = new C0073h(function12, viewState, c31103j2, strM95797t, interfaceC28601c5, 19);
                        function6 = function12;
                        c28655q3.m87172p0(c0073h);
                    } else {
                        Function1 function13 = function5;
                        interfaceC28601c5 = interfaceC28601c4;
                        c0073h = new C0073h(function13, viewState, c31103j2, strM95797t, interfaceC28601c5, 19);
                        function6 = function13;
                        c28655q3.m87172p0(c0073h);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) c0073h;
                    objM87133R10 = c28655q3.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C27325i(18, interfaceC28601c5);
                        c28655q3.m87172p0(objM87133R10);
                    }
                    AbstractC31101h.m95830k(c31103j2, strM95810h2, str2, function11, interfaceC4339a2, (InterfaceC4339a) objM87133R10, c28655q3, ProfileVerifier.CompilationStatus.f6515xf2722a21, 0);
                    c28655q = c28655q3;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            AbstractC25012a.m73388u(17, f15, c2314t2, c28655q, true);
            function3 = function6;
        } else {
            c28655q = c28655q4;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(viewState, i13, function3, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m95789l(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m95790m(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m95798u(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m95791n(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m95792o(Function1 function1, C31100g c31100g, C31103j c31103j, String str, InterfaceC28601c1 interfaceC28601c1) {
        String strM95807e = c31100g.getAnalyticsName();
        String strM95847d = c31103j.getConsentKey();
        Locale locale = Locale.ROOT;
        String lowerCase = strM95847d.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        C23465k c23465k = new C23465k("consent", lowerCase);
        String lowerCase2 = c31103j.getRegion().toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
        function1.invoke(new InterfaceC17002b.i(strM95807e, null, "check_box", "select_one", "permissions", AbstractC25247g0.m73990Y(c23465k, new C23465k("country", lowerCase2), new C23465k("accepted_terms", Boolean.TRUE)), 2, null));
        function1.invoke(new InterfaceC21416d.a(str));
        m95798u(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m95793p(InterfaceC28601c1 interfaceC28601c1) {
        m95798u(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m95794q(C31100g c31100g, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m95788k(c31100g, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final boolean m95795r(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m95796s(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: t */
    private static final String m95797t(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: u */
    private static final void m95798u(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final boolean m95799v(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m95800w(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: x */
    public static final void m95801x(String selectAllTitle, boolean z4, String analyticsName, String country, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(selectAllTitle, "selectAllTitle");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(171552433);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(selectAllTitle) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(analyticsName) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(country) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            boolean z13 = ((57344 & i15) == 16384) | ((i15 & 896) == 256) | ((i15 & 7168) == 2048) | ((i15 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C29311j(onViewEvent, analyticsName, country, z4);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t), "SelectAllRow");
            boolean zM87153g = c28655q.m87153g(interfaceC4339a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C28329e(interfaceC4339a, 21);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3599a, false, null, null, (InterfaceC4339a) objM87133R2, 15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            float f13 = 4;
            float f14 = 8;
            float f15 = 1 * f14;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC31061c.m95629e(modifierM3362g, (float) 1.75d, f13, c38072d.m121949b(c28655q, i16).getWhite10()), f15, f15, 0.0f, f15, 4);
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(2, f14, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(7 * f13, c2314t), (float) 1.5d, f13);
            C15127r1 c15127r1M34081r = AbstractC12240d.m34081r(c38072d.m121949b(c28655q, i16).getBrandWhite(), c38072d.m121949b(c28655q, i16).getBrandWhite(), c38072d.m121949b(c28655q, i16).getBrandBlack(), 0L, c28655q, 0, 24);
            boolean zM87153g2 = c28655q.m87153g(interfaceC4339a);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C29616a(interfaceC4339a, 17);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC14959b1.m43082a(z4, (Function1) objM87133R3, modifierM53364e, false, c15127r1M34081r, c28655q, (i15 >> 3) & 14, 24);
            if (10.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC21048g.m58807M(selectAllTitle, new LayoutWeightElement(10.0f, true), false, null, null, 0, 0, 0, false, c28655q, i15 & 14, 508);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(selectAllTitle, z4, analyticsName, country, onViewEvent, i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m95802y(Function1 function1, String str, String str2, boolean z4) {
        function1.invoke(new InterfaceC17002b.i(str, null, "check_box", "select_all", "permissions", AbstractC25247g0.m73990Y(new C23465k("country", str2), new C23465k("selected_all", Boolean.valueOf(!z4))), 2, null));
        if (z4) {
            function1.invoke(InterfaceC21416d.b.f82170a);
        } else {
            function1.invoke(InterfaceC21416d.e.f82174a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m95803z(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }
}
