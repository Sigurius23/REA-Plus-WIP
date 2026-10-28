package o01;

import android.os.Build;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material.C1119d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import e93.AbstractC12889b;
import gb1.AbstractC15673b0;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import mw1.C25985a;
import no0.C26944e0;
import no0.C26984y0;
import nx1.C27219a;
import ny0.C27266m;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p132f0.C13825t;
import p163g1.AbstractC15210z4;
import p208i2.AbstractC17911t;
import p208i2.C17875c1;
import p208i2.C17907r;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p291l0.EnumC22935a1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24679k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: o01.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lo01/c;", "aiChatEntryViewState", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "g", "(Lo01/c;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27346b {
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:40:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
    /* JADX WARN: Code duplicated, block: B:47:0x0105  */
    /* JADX WARN: Code duplicated, block: B:52:0x0126  */
    /* JADX WARN: Code duplicated, block: B:55:0x0136  */
    /* JADX WARN: Code duplicated, block: B:57:0x013c  */
    /* JADX WARN: Code duplicated, block: B:58:0x013e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0141  */
    /* JADX WARN: Code duplicated, block: B:62:0x0157  */
    /* JADX WARN: Code duplicated, block: B:64:0x0177  */
    /* JADX WARN: Code duplicated, block: B:68:0x018c  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:80:0x0209  */
    /* JADX WARN: Code duplicated, block: B:83:0x0213  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m82499g(C27347c aiChatEntryViewState, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Object objM87133R;
        boolean zIsFeatureEnabled;
        AbstractC17911t c17875c1;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean zM87157i;
        Object objM87133R2;
        boolean z13;
        Object objM87133R3;
        InterfaceC4339a interfaceC4339a5;
        boolean z14;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(aiChatEntryViewState, "aiChatEntryViewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-845911189);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(aiChatEntryViewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C27219a(2);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                C1119d c1119dM43228a = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                if (aiChatEntryViewState.getOnboardingGlow()) {
                    c28655q.m87150e0(-1966864138);
                    c28655q.m87173q(false);
                    zIsFeatureEnabled = true;
                } else {
                    c28655q.m87150e0(-1171824582);
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled(FeatureFlagRepositoryKt.AI_CHAT_ENTRY_GRADIENT_BORDER);
                    c28655q.m87173q(false);
                }
                if (zIsFeatureEnabled) {
                    c28655q.m87150e0(-1966775374);
                    c28655q.m87173q(false);
                    c17875c1 = AbstractC15673b0.m43972A();
                } else {
                    c28655q.m87150e0(-1966732129);
                    c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack());
                    c28655q.m87173q(false);
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90538x);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3388j);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                if (aiChatEntryViewState.getOnboardingGlow()) {
                    if (Build.VERSION.SDK_INT < 31) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (z14) {
                        c28655q.m87150e0(428677443);
                        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t, "ONBOARDING GLOW"));
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C27266m(6);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC22989q.m66760a(AbstractC15751g.m44456i(4, AbstractC1127a.m3486a(modifierM3407d, (Function1) objM87133R4), c17875c1, AbstractC33253j.m105489e(12)), c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(429059921);
                        c28655q.m87173q(false);
                    }
                } else {
                    c28655q.m87150e0(429059921);
                    c28655q.m87173q(false);
                }
                zM87157i = c28655q.m87157i(aiChatEntryViewState);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C26944e0(aiChatEntryViewState, 11);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM51775c = AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R2);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (!z13 || objM87133R3 == c28676v0) {
                    interfaceC4339a5 = interfaceC4339a4;
                    objM87133R3 = new C24679k(interfaceC4339a5, 25);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    interfaceC4339a5 = interfaceC4339a4;
                }
                AbstractC12889b.m36263b(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3360e(modifierM51775c, interfaceC21083i, c1119dM43228a, false, null, (InterfaceC4339a) objM87133R3, 28)), null, 3), AbstractC33253j.m105489e(12), C38072d.f163053a.m121949b(c28655q, 6).getBlack30(), new C13825t(2, c17875c1), 0, AbstractC37817c.m121344e(1789571156, c28655q, new C25985a(aiChatEntryViewState, 23)), c28655q, 1769472, 8);
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a5;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C26984y0(aiChatEntryViewState, i13, interfaceC4339a3, i14, 4);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C27219a(2);
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
            C1119d c1119dM43228a2 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
            if (aiChatEntryViewState.getOnboardingGlow()) {
                c28655q.m87150e0(-1966864138);
                c28655q.m87173q(false);
                zIsFeatureEnabled = true;
            } else {
                c28655q.m87150e0(-1171824582);
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled(FeatureFlagRepositoryKt.AI_CHAT_ENTRY_GRADIENT_BORDER);
                c28655q.m87173q(false);
            }
            if (zIsFeatureEnabled) {
                c28655q.m87150e0(-1966775374);
                c28655q.m87173q(false);
                c17875c1 = AbstractC15673b0.m43972A();
            } else {
                c28655q.m87150e0(-1966732129);
                c17875c1 = new C17875c1(C38072d.f163053a.m121949b(c28655q, 6).getBrandBlack());
                c28655q.m87173q(false);
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3388j2 = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t), EnumC22935a1.f90538x);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3388j2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            if (aiChatEntryViewState.getOnboardingGlow()) {
                c28655q.m87150e0(429059921);
                c28655q.m87173q(false);
            } else {
                if (Build.VERSION.SDK_INT < 31) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (z14) {
                    c28655q.m87150e0(428677443);
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t, "ONBOARDING GLOW"));
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C27266m(6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC22989q.m66760a(AbstractC15751g.m44456i(4, AbstractC1127a.m3486a(modifierM3407d2, (Function1) objM87133R4), c17875c1, AbstractC33253j.m105489e(12)), c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(429059921);
                    c28655q.m87173q(false);
                }
            }
            zM87157i = c28655q.m87157i(aiChatEntryViewState);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new C26944e0(aiChatEntryViewState, 11);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C26944e0(aiChatEntryViewState, 11);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM51775c2 = AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R2);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z13) {
                interfaceC4339a5 = interfaceC4339a4;
                objM87133R3 = new C24679k(interfaceC4339a5, 25);
                c28655q.m87172p0(objM87133R3);
            } else {
                interfaceC4339a5 = interfaceC4339a4;
                objM87133R3 = new C24679k(interfaceC4339a5, 25);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC12889b.m36263b(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3360e(modifierM51775c2, interfaceC21083i2, c1119dM43228a2, false, null, (InterfaceC4339a) objM87133R3, 28)), null, 3), AbstractC33253j.m105489e(12), C38072d.f163053a.m121949b(c28655q, 6).getBlack30(), new C13825t(2, c17875c1), 0, AbstractC37817c.m121344e(1789571156, c28655q, new C25985a(aiChatEntryViewState, 23)), c28655q, 1769472, 8);
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a5;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(aiChatEntryViewState, i13, interfaceC4339a3, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m82500h() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m82501i(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51556g(new C17907r(30.0f, 30.0f, 3));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m82502j(C27347c c27347c, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(c27347c.getAccessibilityLabel(), semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m82503k(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m82504l(C27347c c27347c, Composer composer, int i13) {
        long jM53358D;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC1102d.m3409f(1.0f, c2314t));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC27348d.m82519c(null, c28655q, 0, 1);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(10, c2314t));
            FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            if (featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA) || featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                c28655q.m87150e0(-2056301431);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(-2056230999);
                jM53358D = C38072d.f163053a.m121949b(c28655q, 6).getWhite30();
                c28655q.m87173q(false);
            }
            AbstractC30795n.m94707h(c27347c.getHintText(), null, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196602);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m82505m(C27347c c27347c, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m82499g(c27347c, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
