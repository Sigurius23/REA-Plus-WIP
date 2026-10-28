package p731rl2;

import al2.AbstractC0988d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gz0.AbstractC16319p0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import nx1.C27225g;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p702ch0.C4651t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28329e;
import r80.AbstractC31061c;
import r90.C31095b;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: rl2.b, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aG\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\n\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onToolbarLeftClick", "onActivityDetectionClicked", "onHrSettingsClicked", "onLocationSettingsClicked", "m", "(Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "p", "(Lc93/a;Landroidx/compose/runtime/Composer;I)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "training_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static final void m97099h(InterfaceC4339a onActivityDetectionClicked, InterfaceC4339a onHrSettingsClicked, InterfaceC4339a onLocationSettingsClicked, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onActivityDetectionClicked, "onActivityDetectionClicked");
        AbstractC22676k.m65750j(onHrSettingsClicked, "onHrSettingsClicked");
        AbstractC22676k.m65750j(onLocationSettingsClicked, "onLocationSettingsClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(186954359);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onActivityDetectionClicked) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onHrSettingsClicked) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onLocationSettingsClicked) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(3 * 8, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float f13 = 4;
            AbstractC18489d0.m53380u(10, f13, c2314t, c28655q);
            C39282o.Companion companion = C39282o.INSTANCE;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            C39282o c39282oM125229d = C39282o.Companion.m125229d(companion, new TextResource.C8688b(AbstractC0988d.f3678d, null, i15, 0 == true ? 1 : 0), null, null, null, null, new C39274g(AbstractC16319p0.m46430a().getActivities().getOther(), 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388574, null);
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C28329e(onActivityDetectionClicked, 26);
                c28655q.m87172p0(objM87133R);
            }
            int i16 = C39282o.f168987q << 3;
            AbstractC39281n.m125207c(null, c39282oM125229d, (InterfaceC4339a) objM87133R, c28655q, i16, 1);
            float f14 = f13 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            C39282o c39282oM125229d2 = C39282o.Companion.m125229d(companion, new TextResource.C8688b(AbstractC0988d.f3692k, objArr6 == true ? 1 : 0, i15, objArr5 == true ? 1 : 0), null, null, null, null, new C39274g(AbstractC16319p0.m46430a().getStrain().getHeartRate(), objArr4 == true ? 1 : 0, i15, objArr3 == true ? 1 : 0), null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388574, null);
            boolean z13 = (i14 & 112) == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C28329e(onHrSettingsClicked, 27);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC39281n.m125207c(null, c39282oM125229d2, (InterfaceC4339a) objM87133R2, c28655q, i16, 1);
            if (((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.ANDROID_GPS_SETTINGS_PAGE)) {
                AbstractC31061c.m95623C(c28655q, -536722562, c2314t, f14, c28655q);
                C39282o c39282oM125229d3 = C39282o.Companion.m125229d(companion, AbstractC8693b.m21277k(AbstractC0988d.f3673a0), null, null, null, null, new C39274g(AbstractC16319p0.m46430a().getActivities().getOther(), objArr2 == true ? 1 : 0, i15, objArr == true ? 1 : 0), null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388574, null);
                boolean z14 = (i14 & 896) == 256;
                Object objM87133R3 = c28655q.m87133R();
                if (z14 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C28329e(onLocationSettingsClicked, 28);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC39281n.m125207c(null, c39282oM125229d3, (InterfaceC4339a) objM87133R3, c28655q, i16, 1);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-536350655);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g(onActivityDetectionClicked, onHrSettingsClicked, onLocationSettingsClicked, i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m97100i(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m97101j(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m97102k(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m97103l(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, int i13, Composer composer, int i14) {
        m97099h(interfaceC4339a, interfaceC4339a2, interfaceC4339a3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m97104m(InterfaceC4339a onToolbarLeftClick, InterfaceC4339a onActivityDetectionClicked, InterfaceC4339a onHrSettingsClicked, InterfaceC4339a onLocationSettingsClicked, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onToolbarLeftClick, "onToolbarLeftClick");
        AbstractC22676k.m65750j(onActivityDetectionClicked, "onActivityDetectionClicked");
        AbstractC22676k.m65750j(onHrSettingsClicked, "onHrSettingsClicked");
        AbstractC22676k.m65750j(onLocationSettingsClicked, "onLocationSettingsClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(636160576);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onToolbarLeftClick) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onActivityDetectionClicked) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onHrSettingsClicked) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onLocationSettingsClicked) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44032d0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w))));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
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
            m97107p(onToolbarLeftClick, c28655q, i14 & 14);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C28329e(onActivityDetectionClicked, 25);
                c28655q.m87172p0(objM87133R);
            }
            m97099h((InterfaceC4339a) objM87133R, onHrSettingsClicked, onLocationSettingsClicked, c28655q, (i14 >> 3) & MessageListItemViewType.GIPHY);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31095b(onToolbarLeftClick, onActivityDetectionClicked, onHrSettingsClicked, onLocationSettingsClicked, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m97105n(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m97106o(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, int i13, Composer composer, int i14) {
        m97104m(interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static final void m97107p(InterfaceC4339a onToolbarLeftClick, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onToolbarLeftClick, "onToolbarLeftClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(124555381);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onToolbarLeftClick) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(new TextResource.C8688b(AbstractC0988d.f3684g, null, i15, 0 == true ? 1 : 0), null, Integer.valueOf(AbstractC16319p0.m46430a().getAction().getCross()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, onToolbarLeftClick, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i14 << 9) & 7168), 53);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4651t(i13, 20, onToolbarLeftClick);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m97108q(InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m97107p(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
