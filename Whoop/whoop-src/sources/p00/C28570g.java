package p00;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b30.C2591o4;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.model.ConsentUi;
import com.whoop.android.R;
import d40.EnumC11668m;
import g00.AbstractC14930a;
import g00.AbstractC14936g;
import g00.C14931b;
import g00.C14934e;
import g40.C15399o1;
import j00.C21111n;
import l83.C23454a0;
import p026b2.C2314t;
import p163g1.AbstractC15011f9;
import p163g1.C15001f;
import p164g2.C15247s;
import p291l0.AbstractC22953f;
import p291l0.InterfaceC23013y;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: p00.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C28570g implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C15247s f115591E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC4339a f115592F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C28580q f115593w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f115594x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f115595y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C15399o1 f115596z;

    public C28570g(C28580q c28580q, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C15399o1 c15399o1, C15247s c15247s, InterfaceC4339a interfaceC4339a3) {
        this.f115593w = c28580q;
        this.f115594x = interfaceC4339a;
        this.f115595y = interfaceC4339a2;
        this.f115596z = c15399o1;
        this.f115591E = c15247s;
        this.f115592F = interfaceC4339a3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0110  */
    /* JADX WARN: Code duplicated, block: B:18:0x0112  */
    /* JADX WARN: Code duplicated, block: B:22:0x0154  */
    /* JADX WARN: Code duplicated, block: B:26:0x016d  */
    /* JADX WARN: Code duplicated, block: B:30:0x018c  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C28580q c28580q;
        boolean z4;
        C2314t c2314t;
        C28655q c28655q;
        float f13;
        boolean z13;
        ConsentUi.ConsentSection consentSection;
        InterfaceC4339a interfaceC4339a;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC23013y VerificationBodyContainer = (InterfaceC23013y) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(VerificationBodyContainer, "$this$VerificationBodyContainer");
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C28655q) composer).m87153g(VerificationBodyContainer) ? 4 : 2;
        }
        int i13 = iIntValue;
        if ((i13 & 19) == 18) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                c28580q = this.f115593w;
                boolean z14 = c28580q.f115643H;
                z4 = c28580q.f115648w;
                AbstractC28571h.m86902e(z14, composer, 0);
                c2314t = C2314t.f9131w;
                AbstractC22953f.m66715b(composer, AbstractC1102d.m3419p(8, c2314t));
                String strM92102X = AbstractC30060g.m92102X(R.string.stripe_link_verification_message_short, new Object[]{c28580q.f115641F}, composer);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(c2314t, "verification_subtitle"));
                c28655q = (C28655q) composer;
                c28655q.m87150e0(-1418551394);
                C14934e c14934e = (C14934e) c28655q.m87161k(AbstractC14936g.f55705b);
                c28655q.m87173q(false);
                C23285v0 c23285v0 = c14934e.f55695b;
                c28655q.m87150e0(-443512897);
                C14931b c14931b = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                c28655q.m87173q(false);
                AbstractC15011f9.m43114b(strM92102X, modifierM3409f, c14931b.f55676o, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c23285v0, composer, 48, 0, 65016);
                f13 = 24;
                AbstractC22953f.m66715b(composer, AbstractC1102d.m3419p(f13, c2314t));
                AbstractC14930a.m43026a(EnumC11668m.f37665w, AbstractC37817c.m121344e(2026671242, composer, new C15001f(c28580q, this.f115596z, this.f115591E, 11)), composer, 54, 0);
                if (c28580q.f115650y != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                AbstractC1090b.m3350e(VerificationBodyContainer, z13, null, null, null, null, AbstractC37817c.m121344e(-1034645593, composer, new C2591o4(c28580q, 11)), composer, (i13 & 14) | 1572864, 30);
                AbstractC22953f.m66715b(composer, AbstractC1102d.m3419p(f13, c2314t));
                AbstractC28571h.m86901d(z4, c28580q.f115651z, this.f115594x, composer, 0);
                consentSection = c28580q.f115646K;
                c28655q.m87150e0(-733322818);
                if (consentSection != null) {
                    AbstractC28571h.m86899b(consentSection, composer, 0);
                    c28655q.m87150e0(917647365);
                    interfaceC4339a = this.f115592F;
                    zM87153g = c28655q.m87153g(interfaceC4339a);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == C28635l.f115821a) {
                        objM87133R = new C21111n(interfaceC4339a, null, 1);
                        c28655q.m87172p0(objM87133R);
                    }
                    c28655q.m87173q(false);
                    AbstractC28683x.m87253g(composer, (InterfaceC4351m) objM87133R, consentSection);
                }
                c28655q.m87173q(false);
                c28655q.m87150e0(-733317017);
                if (c28580q.f115644I) {
                    AbstractC22953f.m66715b(composer, AbstractC1102d.m3419p(f13, c2314t));
                    AbstractC28571h.m86898a(c28580q.f115642G, z4, this.f115595y, composer, 0);
                }
                c28655q.m87173q(false);
                AbstractC22953f.m66715b(composer, AbstractC1102d.m3419p(12, c2314t));
            }
        } else {
            c28580q = this.f115593w;
            boolean z15 = c28580q.f115643H;
            z4 = c28580q.f115648w;
            AbstractC28571h.m86902e(z15, composer, 0);
            c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(composer, AbstractC1102d.m3419p(8, c2314t));
            String strM92102X2 = AbstractC30060g.m92102X(R.string.stripe_link_verification_message_short, new Object[]{c28580q.f115641F}, composer);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(c2314t, "verification_subtitle"));
            c28655q = (C28655q) composer;
            c28655q.m87150e0(-1418551394);
            C14934e c14934e2 = (C14934e) c28655q.m87161k(AbstractC14936g.f55705b);
            c28655q.m87173q(false);
            C23285v0 c23285v1 = c14934e2.f55695b;
            c28655q.m87150e0(-443512897);
            C14931b c14931b2 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
            c28655q.m87173q(false);
            AbstractC15011f9.m43114b(strM92102X2, modifierM3409f2, c14931b2.f55676o, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c23285v1, composer, 48, 0, 65016);
            f13 = 24;
            AbstractC22953f.m66715b(composer, AbstractC1102d.m3419p(f13, c2314t));
            AbstractC14930a.m43026a(EnumC11668m.f37665w, AbstractC37817c.m121344e(2026671242, composer, new C15001f(c28580q, this.f115596z, this.f115591E, 11)), composer, 54, 0);
            if (c28580q.f115650y != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            AbstractC1090b.m3350e(VerificationBodyContainer, z13, null, null, null, null, AbstractC37817c.m121344e(-1034645593, composer, new C2591o4(c28580q, 11)), composer, (i13 & 14) | 1572864, 30);
            AbstractC22953f.m66715b(composer, AbstractC1102d.m3419p(f13, c2314t));
            AbstractC28571h.m86901d(z4, c28580q.f115651z, this.f115594x, composer, 0);
            consentSection = c28580q.f115646K;
            c28655q.m87150e0(-733322818);
            if (consentSection != null) {
                AbstractC28571h.m86899b(consentSection, composer, 0);
                c28655q.m87150e0(917647365);
                interfaceC4339a = this.f115592F;
                zM87153g = c28655q.m87153g(interfaceC4339a);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = new C21111n(interfaceC4339a, null, 1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C21111n(interfaceC4339a, null, 1);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC28683x.m87253g(composer, (InterfaceC4351m) objM87133R, consentSection);
            }
            c28655q.m87173q(false);
            c28655q.m87150e0(-733317017);
            if (c28580q.f115644I) {
                AbstractC22953f.m66715b(composer, AbstractC1102d.m3419p(f13, c2314t));
                AbstractC28571h.m86898a(c28580q.f115642G, z4, this.f115595y, composer, 0);
            }
            c28655q.m87173q(false);
            AbstractC22953f.m66715b(composer, AbstractC1102d.m3419p(12, c2314t));
        }
        return C23454a0.f92919a;
    }
}
