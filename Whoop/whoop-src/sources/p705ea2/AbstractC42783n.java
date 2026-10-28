package p705ea2;

import a31.C0341c;
import am2.C1040r;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import aq1.C1910d;
import ar2.C1935f;
import bc3.InterfaceC2994c0;
import bv2.C3675b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.onboarding.OnboardingStatus;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.C9772c;
import e51.C12725a;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import gz0.AbstractC16319p0;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15044i9;
import p163g1.AbstractC15133r7;
import p163g1.C15033h9;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p507tx.AbstractC34235f;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rz0.AbstractC31926e;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ea2.n, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u007f\u0010\f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002$\u0010\u0007\u001a \u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0004\u0012\u00020\u00010\u00042,\u0010\u000b\u001a(\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\b\u0012\u0004\u0012\u00020\u00010\bH\u0003¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0017²\u0006\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onBackClick", "onClearInteractorCache", "Lkotlin/Function1;", "", "Lcom/whoop/data/onboarding/OnboardingStatus;", "onLoadOnboardingStatuses", "Lkotlin/Function2;", "", "", "onUpdateOnboardingStatus", "l", "(Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/data/onboarding/FeatureEducationType;", "featureType", "isCompleted", "onToggle", "A", "(Lcom/whoop/data/onboarding/FeatureEducationType;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "onboardingStatuses", "isLoading", "searchQuery", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC42783n {

    /* JADX INFO: renamed from: ea2.n$a */
    @InterfaceC32271e(m100429c = "com.whoop.settings.OnboardingStatusDebugFragmentKt$OnboardingStatusDebugContent$1$1", m100430f = "OnboardingStatusDebugFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f44443w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f44444x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f44445y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f44446z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f44444x = function1;
            this.f44445y = interfaceC28601c1;
            this.f44446z = interfaceC28601c2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m36364h(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, List list) {
            AbstractC42783n.m36358v(interfaceC28601c1, list);
            AbstractC42783n.m36360x(interfaceC28601c2, false);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f44444x, this.f44445y, this.f44446z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f44443w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC42783n.m36360x(this.f44445y, true);
            this.f44444x.invoke(new C12916m(0, this.f44446z, this.f44445y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ea2.n$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f44447E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ FeatureEducationType f44448w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4351m f44449x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f44450y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Context f44451z;

        /* JADX INFO: renamed from: ea2.n$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC28601c1 f44452E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ OnboardingStatus f44453F;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC4339a f44454w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ FeatureEducationType f44455x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ boolean f44456y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ Context f44457z;

            public a(InterfaceC4339a interfaceC4339a, FeatureEducationType featureEducationType, boolean z4, Context context, InterfaceC28601c1 interfaceC28601c1, OnboardingStatus onboardingStatus) {
                this.f44454w = interfaceC4339a;
                this.f44455x = featureEducationType;
                this.f44456y = z4;
                this.f44457z = context;
                this.f44452E = interfaceC28601c1;
                this.f44453F = onboardingStatus;
            }

            /* JADX INFO: renamed from: a */
            public final void m36366a(boolean z4, String str) {
                int i13 = 0;
                if (!z4) {
                    Toast.makeText(this.f44457z, "Failed to update status: " + str, 0).show();
                    return;
                }
                InterfaceC28601c1 interfaceC28601c1 = this.f44452E;
                ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(AbstractC42783n.m36349m(interfaceC28601c1));
                OnboardingStatus onboardingStatus = this.f44453F;
                FeatureEducationType featureEducationType = this.f44455x;
                Iterator it = arrayListM74097F1.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i13 = -1;
                        break;
                    } else if (((OnboardingStatus) it.next()).getType() == featureEducationType) {
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i13 >= 0) {
                    arrayListM74097F1.set(i13, onboardingStatus);
                } else {
                    arrayListM74097F1.add(onboardingStatus);
                }
                AbstractC42783n.m36358v(interfaceC28601c1, arrayListM74097F1);
                this.f44454w.invoke();
                Log.d("OnboardingStatusDebug", "Toggled " + this.f44455x.name() + " to " + this.f44456y);
                Toast.makeText(this.f44457z, AbstractC11895b.m31997p(this.f44455x.name(), " ", this.f44456y ? "marked as completed" : "marked as not completed", ". Cache sync attempted. If not working immediately, try restarting the app."), 1).show();
            }

            @Override // c93.InterfaceC4351m
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m36366a(((Boolean) obj).booleanValue(), (String) obj2);
                return C23454a0.f92919a;
            }
        }

        public b(FeatureEducationType featureEducationType, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, Context context, InterfaceC28601c1 interfaceC28601c1) {
            this.f44448w = featureEducationType;
            this.f44449x = interfaceC4351m;
            this.f44450y = interfaceC4339a;
            this.f44451z = context;
            this.f44447E = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m36365a(boolean z4) {
            OnboardingStatus onboardingStatus = new OnboardingStatus(this.f44448w, z4);
            this.f44449x.invoke(onboardingStatus, new a(this.f44450y, this.f44448w, z4, this.f44451z, this.f44447E, onboardingStatus));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m36365a(((Boolean) obj).booleanValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ea2.n$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f44458w = new c();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(FeatureEducationType featureEducationType) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ea2.n$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f44459w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f44460x;

        public d(Function1 function1, List list) {
            this.f44459w = function1;
            this.f44460x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m36368a(int i13) {
            return this.f44459w.invoke(this.f44460x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m36368a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: ea2.n$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f44461E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f44462w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4351m f44463x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f44464y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Context f44465z;

        public e(List list, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, Context context, InterfaceC28601c1 interfaceC28601c1) {
            this.f44462w = list;
            this.f44463x = interfaceC4351m;
            this.f44464y = interfaceC4339a;
            this.f44465z = context;
            this.f44461E = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m36369a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            Object next;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            FeatureEducationType featureEducationType = (FeatureEducationType) this.f44462w.get(i13);
            c28655q.m87150e0(967728092);
            Iterator it = AbstractC42783n.m36349m(this.f44461E).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((OnboardingStatus) next).getType() != featureEducationType);
            OnboardingStatus onboardingStatus = (OnboardingStatus) next;
            boolean zIsCompleted = onboardingStatus != null ? onboardingStatus.isCompleted() : false;
            boolean zM87149e = c28655q.m87149e(featureEducationType.ordinal()) | c28655q.m87153g(this.f44463x) | c28655q.m87153g(this.f44464y) | c28655q.m87157i(this.f44465z);
            Object objM87133R = c28655q.m87133R();
            if (zM87149e || objM87133R == C28635l.f115821a) {
                b bVar = new b(featureEducationType, this.f44463x, this.f44464y, this.f44465z, this.f44461E);
                c28655q.m87172p0(bVar);
                objM87133R = bVar;
            }
            AbstractC42783n.m36328A(featureEducationType, zIsCompleted, (Function1) objM87133R, c28655q, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m36369a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m36328A(FeatureEducationType featureEducationType, boolean z4, Function1 function1, Composer composer, int i13) {
        int i14;
        long jM51541c;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(146685344);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(featureEducationType.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            String strM125926K = AbstractC39421y.m125926K(featureEducationType.name(), "_", " ", false);
            Locale locale = Locale.ROOT;
            String lowerCase = strM125926K.toLowerCase(locale);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            if (lowerCase.length() > 0) {
                StringBuilder sb4 = new StringBuilder();
                String strValueOf = String.valueOf(lowerCase.charAt(0));
                AbstractC22676k.m65748h(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(locale);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                sb4.append((Object) upperCase);
                String strSubstring = lowerCase.substring(1);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                sb4.append(strSubstring);
                lowerCase = sb4.toString();
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            float f13 = 8;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3409f, c38072d.m121949b(c28655q, i15).getWhite10(), AbstractC33253j.m105489e(f13));
            boolean z13 = ((i14 & 112) == 32) | ((i14 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C3675b(function1, z4, 1);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3358c, false, null, null, (InterfaceC4339a) objM87133R, 15);
            float f14 = 1;
            if (z4) {
                c28655q.m87150e0(1921965709);
                jM51541c = C17919x.m51541c(0.3f, c38072d.m121949b(c28655q, i15).getRecovery());
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1922056322);
                jM51541c = C17919x.m51541c(0.3f, c38072d.m121949b(c28655q, i15).getAccentNegativeTrend());
                c28655q.m87173q(false);
            }
            AbstractC31926e.m99375j(AbstractC15751g.m44455h(modifierM3362g, f14, jM51541c, AbstractC33253j.m105489e(f13)), null, 0L, AbstractC33253j.m105489e(f13), null, null, 0.0f, AbstractC37817c.m121344e(-1746715344, c28655q, new C0341c(z4, function1, lowerCase, 2)), c28655q, 12582912, 118);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(featureEducationType, z4, function1, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m36329B(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(!z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v9 */
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
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m36330C(boolean z4, Function1 function1, String str, Composer composer, int i13) {
        int i14;
        ?? r10;
        long jM125392f;
        C38072d c38072d;
        boolean z13;
        long jM125392f2;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(16, AbstractC1102d.m3409f(1.0f, c2314t));
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            C38072d c38072d2 = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125430y = c38072d2.m121949b(c28655q, i15).getBrandWhite();
            C28674u2 c28674u2 = AbstractC15044i9.f56319b;
            float f13 = 4;
            AbstractC15011f9.m43114b(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7), jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C15033h9) c28655q.m87161k(c28674u2)).f56282i, c28655q, 48, 0, 65528);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            float f14 = 8;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f14, c2314t);
            if (z4) {
                c28655q.m87150e0(1292675158);
                C38072d c38072d3 = c38072d2;
                i14 = i15;
                jM125392f = c38072d3.m121949b(c28655q, i14).getRecovery();
                r10 = 0;
                c38072d = c38072d3;
            } else {
                C38072d c38072d4 = c38072d2;
                i14 = i15;
                r10 = 0;
                c28655q.m87150e0(1292676193);
                jM125392f = c38072d4.m121949b(c28655q, i14).getAccentNegativeTrend();
                c38072d = c38072d4;
            }
            c28655q.m87173q(r10);
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM3419p, jM125392f, AbstractC33253j.m105489e(f13)), c28655q, r10);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f14, c2314t));
            String str2 = z4 ? "Completed" : "Not Completed";
            if (z4) {
                c28655q.m87150e0(1292688118);
                jM125392f2 = c38072d.m121949b(c28655q, i14).getRecovery();
                z13 = false;
            } else {
                z13 = false;
                c28655q.m87150e0(1292689153);
                jM125392f2 = c38072d.m121949b(c28655q, i14).getAccentNegativeTrend();
            }
            c28655q.m87173q(z13);
            int i16 = i14;
            AbstractC15011f9.m43114b(str2, null, jM125392f2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C15033h9) c28655q.m87161k(c28674u2)).f56285l, c28655q, 0, 0, 65530);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            AbstractC15133r7.m43183a(z4, function1, null, false, AbstractC34235f.m108196A(c38072d.m121949b(c28655q, i16).getBrandWhite(), c38072d.m121949b(c28655q, i16).getRecovery(), 0.0f, c38072d.m121949b(c28655q, i16).getBrandWhite(), c38072d.m121949b(c28655q, i16).getAccentNegativeTrend(), 0.0f, 0L, 0L, 0L, 0L, c28655q, 996), c28655q, 0, 28);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m36331D(FeatureEducationType featureEducationType, boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m36328A(featureEducationType, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m36348l(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function1, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        int i14;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1578628451);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(C25271y.f99162w);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z("");
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            boolean z13 = (i14 & 896) == 256;
            Object objM87133R4 = c28655q.m87133R();
            if (z13 || objM87133R4 == c28676v0) {
                objM87133R4 = new a(function1, interfaceC28601c2, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, C23454a0.f92919a);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l("ONBOARDING STATUS DEBUG"), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, interfaceC4339a, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i14 << 9) & 7168), 53);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(m36361y(interfaceC28601c3));
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Search feature education types...");
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, f14, 7);
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C1910d(26, interfaceC28601c3);
                c28655q.m87172p0(objM87133R5);
            }
            int i15 = TextResource.$stable;
            AbstractC17795v0.m51127j(modifierM3398t, textResourceM21278l, textResourceM21278l2, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R5, c28655q, (i15 << 3) | 6 | (i15 << 6), 24576, 16376);
            if (m36359w(interfaceC28601c2)) {
                c28655q.m87150e0(1450241294);
                AbstractC15011f9.m43114b("Loading onboarding statuses...", AbstractC1099a.m3394p(16, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 54, 0, 131064);
                c28655q = c28655q;
                c28655q.m87173q(false);
                z4 = true;
            } else {
                c28655q.m87150e0(1450712556);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(f14, 0.0f, 2);
                C22971k c22971kM66746i = AbstractC22977m.m66746i(1 * f13);
                boolean zM87157i = ((i14 & 112) == 32) | ((i14 & 7168) == 2048) | c28655q.m87157i(context);
                Object objM87133R6 = c28655q.m87133R();
                if (zM87157i || objM87133R6 == c28676v0) {
                    objM87133R6 = new C1040r(interfaceC28601c1, interfaceC28601c3, interfaceC4351m, interfaceC4339a2, context);
                    c28655q.m87172p0(objM87133R6);
                }
                z4 = true;
                AbstractC22674j.m65717c(modifierM3407d, null, c22976l1M3379a, c22971kM66746i, null, null, false, null, (Function1) objM87133R6, c28655q, 24966, 490);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12725a(interfaceC4339a, interfaceC4339a2, function1, interfaceC4351m, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final List<OnboardingStatus> m36349m(InterfaceC28601c1 interfaceC28601c1) {
        return (List) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m36350n(InterfaceC28601c1 interfaceC28601c1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof AbstractC17801x0.c) {
            m36362z(interfaceC28601c1, ((AbstractC17801x0.c) it).getNewText());
        } else if (it instanceof AbstractC17801x0.a) {
            m36362z(interfaceC28601c1, "");
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m36351o(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, Context context, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C12906g(1, interfaceC28601c1), true, 205289102), 3);
        List listM74049W0 = AbstractC25260n.m74049W0(FeatureEducationType.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM74049W0) {
            FeatureEducationType featureEducationType = (FeatureEducationType) obj;
            if (m36361y(interfaceC28601c2).length() != 0) {
                String strM125926K = AbstractC39421y.m125926K(featureEducationType.name(), "_", " ", false);
                Locale locale = Locale.ROOT;
                String lowerCase = strM125926K.toLowerCase(locale);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                String lowerCase2 = m36361y(interfaceC28601c2).toLowerCase(locale);
                AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
                if (!AbstractC39414r.m125876U(lowerCase, lowerCase2, false)) {
                    String lowerCase3 = featureEducationType.name().toLowerCase(locale);
                    AbstractC22676k.m65749i(lowerCase3, "toLowerCase(...)");
                    String lowerCase4 = m36361y(interfaceC28601c2).toLowerCase(locale);
                    AbstractC22676k.m65749i(lowerCase4, "toLowerCase(...)");
                    if (AbstractC39414r.m125876U(lowerCase3, lowerCase4, false)) {
                    }
                }
            }
            arrayList.add(obj);
        }
        List listM74152u1 = AbstractC25265s.m74152u1(arrayList, new C12915l(new C9772c(2, interfaceC28601c1), 0));
        ((C26053f) LazyColumn).m77529r(listM74152u1.size(), null, new d(c.f44458w, listM74152u1), new C37816b(new e(listM74152u1, interfaceC4351m, interfaceC4339a, context, interfaceC28601c1), true, 802480018));
        if (m36361y(interfaceC28601c2).length() > 0) {
            for (FeatureEducationType featureEducationType2 : FeatureEducationType.values()) {
                String strM125926K2 = AbstractC39421y.m125926K(featureEducationType2.name(), "_", " ", false);
                Locale locale2 = Locale.ROOT;
                String lowerCase5 = strM125926K2.toLowerCase(locale2);
                AbstractC22676k.m65749i(lowerCase5, "toLowerCase(...)");
                String lowerCase6 = m36361y(interfaceC28601c2).toLowerCase(locale2);
                AbstractC22676k.m65749i(lowerCase6, "toLowerCase(...)");
                if (!AbstractC39414r.m125876U(lowerCase5, lowerCase6, false)) {
                    String lowerCase7 = featureEducationType2.name().toLowerCase(locale2);
                    AbstractC22676k.m65749i(lowerCase7, "toLowerCase(...)");
                    String lowerCase8 = m36361y(interfaceC28601c2).toLowerCase(locale2);
                    AbstractC22676k.m65749i(lowerCase8, "toLowerCase(...)");
                    if (!AbstractC39414r.m125876U(lowerCase7, lowerCase8, false)) {
                    }
                }
            }
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C12906g(2, interfaceC28601c2), true, 1297136787), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m36352p(InterfaceC28601c1 interfaceC28601c1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            float f13 = 12;
            AbstractC31926e.m99375j(AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), AbstractC33253j.m105489e(f13)), null, 0L, AbstractC33253j.m105489e(f13), null, null, 0.0f, AbstractC37817c.m121344e(2043838718, c28655q, new C9772c(1, interfaceC28601c1)), c28655q, 12582912, 118);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m36353q(InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        int i14;
        int i15;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(16, c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            AbstractC15011f9.m43114b("Onboarding Status Overview", AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 4, 7), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b)).f56279f, c28655q, 54, 0, 65528);
            List<OnboardingStatus> listM36349m = m36349m(interfaceC28601c1);
            if ((listM36349m instanceof Collection) && listM36349m.isEmpty()) {
                i14 = 0;
            } else {
                Iterator<T> it = listM36349m.iterator();
                i14 = 0;
                while (it.hasNext()) {
                    if (((OnboardingStatus) it.next()).isCompleted() && (i14 = i14 + 1) < 0) {
                        AbstractC37056f.m118976c0();
                        throw null;
                    }
                }
            }
            AbstractC15011f9.m43114b(AbstractC25012a.m73372e(i14, FeatureEducationType.values().length, "Completed: ", " / ", " total"), null, AbstractC13673n.m38559f(C38072d.f163053a, c28655q, C38072d.f163054b, 0.8f), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b)).f56283j, c28655q, 0, 0, 65530);
            c28655q.m87173q(true);
            List<OnboardingStatus> listM36349m2 = m36349m(interfaceC28601c1);
            if ((listM36349m2 instanceof Collection) && listM36349m2.isEmpty()) {
                i15 = 0;
            } else {
                Iterator<T> it3 = listM36349m2.iterator();
                i15 = 0;
                while (it3.hasNext()) {
                    if (((OnboardingStatus) it3.next()).isCompleted() && (i15 = i15 + 1) < 0) {
                        AbstractC37056f.m118976c0();
                        throw null;
                    }
                }
            }
            int length = FeatureEducationType.values().length;
            float f13 = length > 0 ? i15 / length : 0.0f;
            Modifier modifierM3419p = AbstractC1102d.m3419p(60, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3419p, C17919x.m51541c(0.2f, c38072d.m121949b(c28655q, i16).getRecovery()), AbstractC33253j.m105489e(30));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            AbstractC15011f9.m43114b(AbstractC31061c.m95635k((int) (f13 * 100), "%"), null, c38072d.m121949b(c28655q, i16).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b)).f56285l, c28655q, 0, 0, 65530);
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final int m36354r(InterfaceC28601c1 interfaceC28601c1, FeatureEducationType featureEducationType, FeatureEducationType featureEducationType2) {
        Object obj;
        Object next;
        Iterator<T> it = m36349m(interfaceC28601c1).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((OnboardingStatus) next).getType() != featureEducationType);
        OnboardingStatus onboardingStatus = (OnboardingStatus) next;
        boolean zIsCompleted = onboardingStatus != null ? onboardingStatus.isCompleted() : false;
        for (Object obj2 : m36349m(interfaceC28601c1)) {
            if (((OnboardingStatus) obj2).getType() == featureEducationType2) {
                obj = obj2;
                break;
            }
        }
        OnboardingStatus onboardingStatus2 = (OnboardingStatus) obj;
        boolean zIsCompleted2 = onboardingStatus2 != null ? onboardingStatus2.isCompleted() : false;
        if (!zIsCompleted || zIsCompleted2) {
            return (zIsCompleted || !zIsCompleted2) ? 0 : 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final int m36355s(InterfaceC4351m interfaceC4351m, Object obj, Object obj2) {
        return ((Number) interfaceC4351m.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m36356t(InterfaceC28601c1 interfaceC28601c1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(32, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC15011f9.m43114b(AbstractC11895b.m31996o("No feature education types found matching \"", m36361y(interfaceC28601c1), "\""), null, AbstractC13673n.m38559f(C38072d.f163053a, c28655q, C38072d.f163054b, 0.6f), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b)).f56282i, c28655q, 0, 0, 65530);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m36357u(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function1, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m36348l(interfaceC4339a, interfaceC4339a2, function1, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m36358v(InterfaceC28601c1 interfaceC28601c1, List<OnboardingStatus> list) {
        interfaceC28601c1.setValue(list);
    }

    /* JADX INFO: renamed from: w */
    private static final boolean m36359w(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m36360x(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: y */
    private static final String m36361y(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: z */
    private static final void m36362z(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }
}
