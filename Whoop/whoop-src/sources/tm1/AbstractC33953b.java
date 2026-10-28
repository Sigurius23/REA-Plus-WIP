package tm1;

import a11.C0132j;
import android.app.Application;
import android.content.Context;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import hs1.AbstractC17604a;
import hs1.AbstractC17606c;
import hs1.C17605b;
import js1.AbstractC21921l;
import js1.C21922m;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import p000.AbstractC11266d;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28670t2;
import p392p3.C28761b0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: tm1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Ljs1/m;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Ljs1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lhs1/c;", "journalHomeTileViewState", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33953b {
    /* JADX WARN: Code duplicated, block: B:122:0x01e4 A[PHI: r11
      0x01e4: PHI (r11v16 c93.a) = (r11v11 c93.a), (r11v17 c93.a) binds: [B:121:0x01e2, B:117:0x01dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x01f3  */
    /* JADX INFO: renamed from: c */
    public static final void m107396c(C21922m viewState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a;
        boolean z4;
        boolean z13;
        Object objM87133R;
        AbstractC23864c abstractC23864c;
        boolean z14;
        Object obj;
        Object obj2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1619157951);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC17606c journalHomeTileViewState = viewState.getJournalHomeTileViewState();
            int i15 = AbstractC17606c.f68212a;
            c28655q.m87150e0(1371609227);
            boolean zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zIsFeatureEnabled) {
                InterfaceC1583f2 interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                Context applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                boolean z15 = ((((i15 & 14) ^ 6) > 4 && c28655q.m87153g(journalHomeTileViewState)) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && c28655q.m87153g(null)) || (i15 & 48) == 32);
                if (((i15 & 7168) ^ 3072) > 2048) {
                    interfaceC4339a = null;
                    if (c28655q.m87153g(null)) {
                        z4 = true;
                    }
                    z13 = z15 | z4;
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, journalHomeTileViewState, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17605b.class), interfaceC4339a, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                    z14 = false;
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a = null;
                }
                if ((i15 & 3072) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z13 = z15 | z4;
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, journalHomeTileViewState, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17605b.class), interfaceC4339a, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, journalHomeTileViewState, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17605b.class), interfaceC4339a, null);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC23864c = (AbstractC23864c) objM87133R;
                z14 = false;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-707976188);
                InterfaceC1583f2 interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    obj2 = null;
                    obj = null;
                    abstractC23864c = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                    Application application2 = (Application) applicationContext2;
                    boolean z16 = ((((i15 & 112) ^ 48) > 32 && c28655q.m87153g(null)) || (i15 & 48) == 32) | ((((i15 & 14) ^ 6) > 4 && c28655q.m87153g(journalHomeTileViewState)) || (i15 & 6) == 4) | ((((i15 & 7168) ^ 3072) > 2048 && c28655q.m87153g(null)) || (i15 & 3072) == 2048);
                    Object objM87133R2 = c28655q.m87133R();
                    if (z16 || objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17605b.class), null, new C23863b(journalHomeTileViewState), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        obj2 = null;
                        obj = null;
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R2;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    boolean z17 = ((((i15 & 14) ^ 6) > 4 && c28655q.m87153g(journalHomeTileViewState)) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && c28655q.m87153g(obj2)) || (i15 & 48) == 32) | ((((i15 & 7168) ^ 3072) > 2048 && c28655q.m87153g(obj)) || (i15 & 3072) == 2048);
                    Object objM87133R3 = c28655q.m87133R();
                    if (z17 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C23863b(journalHomeTileViewState);
                        c28655q.m87172p0(objM87133R3);
                    }
                    abstractC23864c = (C23863b) objM87133R3;
                    z14 = false;
                    c28655q.m87173q(false);
                } else {
                    z14 = false;
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
                c28655q.m87173q(z14);
                c28676v0 = c28676v0;
            }
            AbstractC22676k.m65748h(abstractC23864c, "null cannot be cast to non-null type com.whoop.journalhometile.presentation.JournalHomeTileViewModel");
            C17605b c17605b = (C17605b) abstractC23864c;
            AbstractC17606c abstractC17606cM107397d = m107397d(AbstractC28683x.m87260n(c17605b.getViewState(), AbstractC17606c.b.f68214b, null, c28655q, AbstractC17606c.b.f68215c << 3, 2));
            String path = viewState.getPath();
            boolean zM87157i = c28655q.m87157i(c17605b);
            if ((i14 & 112) == 32) {
                z14 = true;
            }
            boolean z18 = zM87157i | z14;
            Object objM87133R4 = c28655q.m87133R();
            if (z18 || objM87133R4 == c28676v0) {
                objM87133R4 = new C28761b0(10, c17605b, onViewEvent);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC21921l.m62405y(null, abstractC17606cM107397d, path, false, (Function1) objM87133R4, c28655q, i15 << 3, 9);
            c28655q = c28655q;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0132j(viewState, onViewEvent, i13, 17);
        }
    }

    /* JADX INFO: renamed from: d */
    private static final AbstractC17606c m107397d(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC17606c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m107398e(C17605b c17605b, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof AbstractC17604a) {
            c17605b.mo1216g((AbstractC17604a) it);
        } else {
            function1.invoke(it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m107399f(C21922m c21922m, Function1 function1, int i13, Composer composer, int i14) {
        m107396c(c21922m, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
