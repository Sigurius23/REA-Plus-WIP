package v11;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.C1119d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import ck1.C4789l;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import j11.AbstractC21211n;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15210z4;
import p208i2.AbstractC17918w0;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23164r1;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qr2.AbstractC30556a;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import s01.C32049e;
import t01.C33259e;
import tr2.InterfaceC34116n;
import ud0.C34789b;
import uz1.C35429g;
import v01.C35509k;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: v11.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a9\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0012\u001a\u00020\u0003*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a9\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001aI\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001aA\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001d\u001a\u00020\u00192\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%²\u0006\u0010\u0010$\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lv11/k;", "dialog", "Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "Lkotlin/Function1;", "", "onViewEvent", "G", "(Lv11/k;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lv11/j;", "viewState", "p", "(Landroidx/compose/ui/Modifier;Lv11/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lv11/b;", "onShowDialog", "M", "(Lv11/b;Lc93/a;Lkotlin/jvm/functions/Function1;)V", "button", "y", "(Lv11/b;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lgz0/m0;", "icon", "", "contentDescription", "A", "(Lv11/b;Lc93/a;Lgz0/m0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "text", "D", "(Lv11/b;Lc93/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ltr2/n;", "a", "Ltr2/n;", "logger", "activeDialog", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35551i {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f151235a = InterfaceC34116n.INSTANCE.m107848a("FollowerRequestCard");

    /* JADX INFO: renamed from: v11.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f151236a;

        static {
            int[] iArr = new int[EnumC35545c.values().length];
            try {
                iArr[EnumC35545c.ICON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC35545c.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC35545c.SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f151236a = iArr;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final void m112707A(C35544b c35544b, InterfaceC4339a interfaceC4339a, EnumC16313m0 enumC16313m0, String str, Function1 function1, Composer composer, int i13) {
        int i14;
        String str2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1767924260);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c35544b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87149e(enumC16313m0.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            str2 = str;
            i14 |= c28655q.m87153g(str2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            str2 = str;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            EnumC35543a enumC35543aM112696e = c35544b.getButtonSize();
            C33252i c33252iM105489e = AbstractC33253j.m105489e(enumC35543aM112696e.getCornerRadius());
            float fM134575getHeightD9Ej5fM = enumC35543aM112696e.getHeight();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(fM134575getHeightD9Ej5fM, c2314t), c33252iM105489e);
            C38072d c38072d = C38072d.f163053a;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, c38072d.m121949b(c28655q, 6).getWhite10(), AbstractC17918w0.f69621a);
            boolean zM112698g = c35544b.getEnabled();
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            C1119d c1119dM43228a = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
            C18027i c18027i = new C18027i(0);
            boolean zM87157i = ((i14 & 57344) == 16384) | ((i14 & 112) == 32) | c28655q.m87157i(c35544b);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C35548f(c35544b, interfaceC4339a, function1, 0);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3358c, interfaceC21083i, c1119dM43228a, zM112698g, c18027i, (InterfaceC4339a) objM87133R2, 8);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3360e);
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
            AbstractC23164r1.m67133b(AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q, 6), AbstractC39414r.m125890i0(str2) ? null : str2, AbstractC1102d.m3419p(enumC35543aM112696e.getIconSize(), c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 0, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34789b(c35544b, interfaceC4339a, enumC16313m0, str2, function1, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m112708B(C35544b c35544b, InterfaceC4339a interfaceC4339a, Function1 function1) {
        m112719M(c35544b, interfaceC4339a, function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m112709C(C35544b c35544b, InterfaceC4339a interfaceC4339a, EnumC16313m0 enumC16313m0, String str, Function1 function1, int i13, Composer composer, int i14) {
        m112707A(c35544b, interfaceC4339a, enumC16313m0, str, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final void m112710D(C35544b c35544b, InterfaceC4339a interfaceC4339a, String str, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        long jM95624D;
        long jM31986e;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1585388413);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(c35544b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(str) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            EnumC35543a enumC35543aM112696e = c35544b.getButtonSize();
            C33252i c33252iM105489e = AbstractC33253j.m105489e(enumC35543aM112696e.getCornerRadius());
            if (!c35544b.getEnabled()) {
                c28655q2.m87150e0(-1155114845);
                jM95624D = C38072d.f163053a.m121949b(c28655q2, 6).getWhite5();
                c28655q2.m87173q(false);
            } else if (c35544b.getStyle() == EnumC35545c.SECONDARY) {
                c28655q2.m87150e0(-1155111996);
                jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, 6, false);
            } else {
                c28655q2.m87150e0(-1155110649);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, false);
            }
            long j7 = jM95624D;
            if (!c35544b.getEnabled()) {
                c28655q2.m87150e0(-1155107804);
                jM31986e = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q2, 6, false);
            } else if (c35544b.getStyle() == EnumC35545c.SECONDARY) {
                c28655q2.m87150e0(-1155104921);
                jM31986e = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, false);
            } else {
                c28655q2.m87150e0(-1155103481);
                jM31986e = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
            }
            float fM134575getHeightD9Ej5fM = enumC35543aM112696e.getHeight();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(fM134575getHeightD9Ej5fM, c2314t), c33252iM105489e), j7, AbstractC17918w0.f69621a);
            boolean zM112698g = c35544b.getEnabled();
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            C1119d c1119dM43228a = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
            C18027i c18027i = new C18027i(0);
            boolean zM87157i = ((i14 & 112) == 32) | c28655q2.m87157i(c35544b) | ((i14 & 7168) == 2048);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C35548f(c35544b, interfaceC4339a, function1, 1);
                c28655q2.m87172p0(objM87133R2);
            }
            Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3358c, interfaceC21083i, c1119dM43228a, zM112698g, c18027i, (InterfaceC4339a) objM87133R2, 8);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3360e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            AbstractC30795n.m94707h(str, AbstractC1099a.m3393o(AbstractC1099a.m3379a(enumC35543aM112696e.getHorizontalPadding(), 0.0f, 2), c2314t), jM31986e, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getBtS(), null, c28655q2, (i14 >> 6) & 14, 0, 196088);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35546d(c35544b, interfaceC4339a, str, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m112711E(C35544b c35544b, InterfaceC4339a interfaceC4339a, Function1 function1) {
        m112719M(c35544b, interfaceC4339a, function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m112712F(C35544b c35544b, InterfaceC4339a interfaceC4339a, String str, Function1 function1, int i13, Composer composer, int i14) {
        m112710D(c35544b, interfaceC4339a, str, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final void m112713G(C35553k c35553k, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(499204010);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(c35553k) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            TextResource textResourceM112762h = c35553k.getTitle();
            TextResource textResourceM112756b = c35553k.getDescription();
            TextResource textResourceM112758d = c35553k.getPrimaryTitle();
            TextResource textResourceM112760f = c35553k.getSecondaryTitle();
            boolean zM112761g = c35553k.getShowCloseButton();
            int i15 = i14 & 896;
            int i16 = i14 & 112;
            boolean zM87157i = c28655q2.m87157i(c35553k) | (i15 == 256) | (i16 == 32);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C35550h(interfaceC4339a, c35553k, function1, 0);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q2.m87157i(c35553k) | (i15 == 256) | (i16 == 32);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C35550h(interfaceC4339a, c35553k, function1, 1);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
            boolean zM87157i3 = (i15 == 256) | c28655q2.m87157i(c35553k) | (i16 == 32);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C35550h(interfaceC4339a, c35553k, function1);
                c28655q2.m87172p0(objM87133R3);
            }
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, textResourceM112762h, textResourceM112756b, textResourceM112758d, true, null, null, null, null, textResourceM112760f, null, false, zM112761g, null, null, false, 0, null, null, null, false, null, interfaceC4339a2, interfaceC4339a3, (InterfaceC4339a) objM87133R3, null, null, null, c28655q, 24576, 0, 0, 239070689);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e(c35553k, interfaceC4339a, function1, i13, 26);
        }
    }

    /* JADX INFO: renamed from: H */
    private static final void m112714H(C35553k c35553k, Function1 function1) {
        AnalyticEventModel analyticEventModelM112759e = c35553k.getSecondaryAnalyticEvent();
        if (analyticEventModelM112759e != null) {
            AbstractC13673n.m38578y(null, analyticEventModelM112759e, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m112715I(InterfaceC4339a interfaceC4339a, C35553k c35553k, Function1 function1) {
        m112714H(c35553k, function1);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m112716J(InterfaceC4339a interfaceC4339a, C35553k c35553k, Function1 function1) {
        m112714H(c35553k, function1);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m112717K(C35553k c35553k, Function1 function1, InterfaceC4339a interfaceC4339a) {
        AnalyticEventModel analyticEventModelM112757c = c35553k.getPrimaryAnalyticEvent();
        if (analyticEventModelM112757c != null) {
            AbstractC13673n.m38578y(null, analyticEventModelM112757c, function1);
        }
        function1.invoke(c35553k.getConfirmAction());
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m112718L(C35553k c35553k, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        m112713G(c35553k, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final void m112719M(C35544b c35544b, InterfaceC4339a interfaceC4339a, Function1 function1) {
        Object objM112701j = c35544b.getModal();
        if (objM112701j == null) {
            objM112701j = c35544b.getAction();
        }
        if (c35544b.getConfirmationDialog() != null) {
            AnalyticEventModel analyticEventModelM112695d = c35544b.getAnalyticEvent();
            if (analyticEventModelM112695d != null) {
                AbstractC13673n.m38578y(null, analyticEventModelM112695d, function1);
            }
            interfaceC4339a.invoke();
            return;
        }
        if (objM112701j != null) {
            if (c35544b.getAnalyticEvent() != null) {
                objM112701j = new DesignItemInteraction(objM112701j, c35544b.getAnalyticEvent());
            }
            function1.invoke(objM112701j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x022f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0250  */
    /* JADX WARN: Code duplicated, block: B:105:0x0253  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:109:0x02af  */
    /* JADX WARN: Code duplicated, block: B:116:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:119:0x0334  */
    /* JADX WARN: Code duplicated, block: B:120:0x0384  */
    /* JADX WARN: Code duplicated, block: B:124:0x0396  */
    /* JADX WARN: Code duplicated, block: B:130:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:131:0x040f  */
    /* JADX WARN: Code duplicated, block: B:133:0x041f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0424  */
    /* JADX WARN: Code duplicated, block: B:137:0x0427  */
    /* JADX WARN: Code duplicated, block: B:142:0x0447  */
    /* JADX WARN: Code duplicated, block: B:143:0x0451  */
    /* JADX WARN: Code duplicated, block: B:146:0x0463  */
    /* JADX WARN: Code duplicated, block: B:150:0x047e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0489  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:64:0x010c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0116  */
    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX WARN: Code duplicated, block: B:70:0x012f  */
    /* JADX WARN: Code duplicated, block: B:74:0x013d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0159  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:92:0x0204  */
    /* JADX WARN: Code duplicated, block: B:93:0x0208  */
    /* JADX WARN: Code duplicated, block: B:98:0x0223  */
    /* JADX INFO: renamed from: p */
    public static final void m112735p(Modifier modifier, C35552j viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        C35553k c35553kM112737r;
        Object objM87133R2;
        String strM21274h;
        String strM21274h2;
        TextResource textResourceM112753h;
        String str;
        C9598e c9598eM112751f;
        Object objM87133R3;
        InterfaceC21083i interfaceC21083i;
        Modifier modifierM3360e;
        Function1 function5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        AbstractC22403o abstractC22403oM112750e;
        String str2;
        int iHashCode3;
        C38072d c38072d;
        boolean z13;
        final C35544b c35544bM112752g;
        boolean zM87157i;
        Object objM87133R4;
        C28676v0 c28676v1;
        final InterfaceC28601c1 interfaceC28601c2;
        boolean z14;
        final C35544b c35544bM112748c;
        boolean zM87157i2;
        Object objM87133R5;
        boolean z15;
        boolean zM87157i3;
        Object objM87133R6;
        Object objM87133R7;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1971329632);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C35509k(1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function4 = (Function1) objM87133R7;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c35553kM112737r = m112737r(interfaceC28601c1);
                if (c35553kM112737r == null) {
                    c28655q.m87150e0(-1501480609);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1501480608);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35429g(1, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    m112713G(c35553kM112737r, (InterfaceC4339a) objM87133R2, function4, c28655q, (i16 & 896) | 48);
                    c28655q.m87173q(false);
                }
                strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, 0);
                strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, 0);
                textResourceM112753h = viewState.getSubtext();
                if (textResourceM112753h == null) {
                    c28655q.m87150e0(-1501133719);
                    c28655q.m87173q(false);
                    str = null;
                } else {
                    c28655q.m87150e0(-1501133718);
                    String strM21274h3 = AbstractC8693b.m21274h(textResourceM112753h, c28655q, 0);
                    c28655q.m87173q(false);
                    str = strM21274h3;
                }
                c9598eM112751f = viewState.getNavigation();
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC11266d.m30453g(c28655q);
                }
                interfaceC21083i = (InterfaceC21083i) objM87133R3;
                if (c9598eM112751f != null) {
                    c28655q.m87150e0(-1500917958);
                    C1119d c1119dM43228a = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                    C18027i c18027i = new C18027i(0);
                    if ((i16 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87157i3 = z15 | c28655q.m87157i(c9598eM112751f);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87157i3 || objM87133R6 == c28676v0) {
                        objM87133R6 = new C4789l(function4, c9598eM112751f, 11);
                        c28655q.m87172p0(objM87133R6);
                    }
                    modifierM3360e = AbstractC1092a.m3360e(c2314t, interfaceC21083i, c1119dM43228a, false, c18027i, (InterfaceC4339a) objM87133R6, 12);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1500743862);
                    c28655q.m87173q(false);
                    modifierM3360e = c2314t;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                C2306l c2306l = C2299e.f9108K;
                float f13 = ((float) 1.5d) * 8;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q, 54);
                function5 = function4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifier4 = modifier2;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierMo3471e = new LayoutWeightElement(1.0f, true).mo3471e(modifierM3360e);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                abstractC22403oM112750e = viewState.getImage();
                if (abstractC22403oM112750e == null) {
                    abstractC22403oM112750e = AbstractC22403o.b.f87641b;
                }
                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403oM112750e, null, null, c28655q, 0, 3);
                if (AbstractC39414r.m125890i0(strM21274h)) {
                    str2 = null;
                } else {
                    str2 = strM21274h;
                }
                AbstractC29125c.m88522c(abstractC26165aM64500i, str2, AbstractC37056f.m118994r(AbstractC1102d.m3419p(10 * 4, c2314t), AbstractC33253j.f138651a), null, C39102j.f168199a, 0.0f, null, c28655q, 24576, 104);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21274h, AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 48, 3120, 185848);
                c28655q = c28655q;
                if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                    c28655q.m87150e0(1822748750);
                    AbstractC30795n.m94707h(strM21274h2, AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 48, 3120, 185848);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1823156772);
                    c28655q.m87173q(false);
                }
                if (str != null || str.length() == 0) {
                    c28655q = c28655q;
                    c28655q = c28655q;
                    z13 = false;
                    c28655q.m87150e0(1823653764);
                    c28655q.m87173q(false);
                } else {
                    c28655q = c28655q;
                    c28655q.m87150e0(1823245742);
                    C28655q c28655q2 = c28655q;
                    AbstractC30795n.m94707h(str, AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q2, 48, 3120, 185848);
                    c28655q = c28655q2;
                    z13 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                c35544bM112752g = viewState.getStartButton();
                if (c35544bM112752g == null) {
                    c28655q.m87150e0(416843801);
                    c28655q.m87173q(z13);
                    interfaceC28601c2 = interfaceC28601c1;
                    z14 = z13;
                    function2 = function5;
                    c28676v1 = c28676v0;
                } else {
                    c28655q.m87150e0(416843802);
                    zM87157i = c28655q.m87157i(c35544bM112752g);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (objM87133R4 == c28676v1) {
                            interfaceC28601c2 = interfaceC28601c1;
                        }
                        function2 = function5;
                        m112744y(c35544bM112752g, (InterfaceC4339a) objM87133R4, function2, c28655q, i16 & 896);
                        z14 = false;
                        c28655q.m87173q(false);
                    }
                    final int i19 = 0;
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R4 = new InterfaceC4339a() { // from class: v11.g
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC35551i.m112741v(c35544bM112752g, interfaceC28601c2);
                                default:
                                    return AbstractC35551i.m112742w(c35544bM112752g, interfaceC28601c2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                    function2 = function5;
                    m112744y(c35544bM112752g, (InterfaceC4339a) objM87133R4, function2, c28655q, i16 & 896);
                    z14 = false;
                    c28655q.m87173q(false);
                }
                c35544bM112748c = viewState.getEndButton();
                if (c35544bM112748c == null) {
                    c28655q.m87150e0(417099737);
                    c28655q.m87173q(z14);
                } else {
                    c28655q.m87150e0(417099738);
                    zM87157i2 = c28655q.m87157i(c35544bM112748c);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R5 == c28676v1) {
                        final int i24 = 1;
                        objM87133R5 = new InterfaceC4339a() { // from class: v11.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i24) {
                                    case 0:
                                        return AbstractC35551i.m112741v(c35544bM112748c, interfaceC28601c2);
                                    default:
                                        return AbstractC35551i.m112742w(c35544bM112748c, interfaceC28601c2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R5);
                    }
                    m112744y(c35544bM112748c, (InterfaceC4339a) objM87133R5, function2, c28655q, i16 & 896);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(modifier3, viewState, function3, i13, i14, 28);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C35509k(1);
                    c28655q.m87172p0(objM87133R7);
                }
                function4 = (Function1) objM87133R7;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c35553kM112737r = m112737r(interfaceC28601c1);
            if (c35553kM112737r == null) {
                c28655q.m87150e0(-1501480609);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1501480608);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C35429g(1, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                m112713G(c35553kM112737r, (InterfaceC4339a) objM87133R2, function4, c28655q, (i16 & 896) | 48);
                c28655q.m87173q(false);
            }
            strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, 0);
            strM21274h2 = AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, 0);
            textResourceM112753h = viewState.getSubtext();
            if (textResourceM112753h == null) {
                c28655q.m87150e0(-1501133719);
                c28655q.m87173q(false);
                str = null;
            } else {
                c28655q.m87150e0(-1501133718);
                String strM21274h4 = AbstractC8693b.m21274h(textResourceM112753h, c28655q, 0);
                c28655q.m87173q(false);
                str = strM21274h4;
            }
            c9598eM112751f = viewState.getNavigation();
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC11266d.m30453g(c28655q);
            }
            interfaceC21083i = (InterfaceC21083i) objM87133R3;
            if (c9598eM112751f != null) {
                c28655q.m87150e0(-1500917958);
                C1119d c1119dM43228a2 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                C18027i c18027i2 = new C18027i(0);
                if ((i16 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i3 = z15 | c28655q.m87157i(c9598eM112751f);
                objM87133R6 = c28655q.m87133R();
                if (zM87157i3) {
                    objM87133R6 = new C4789l(function4, c9598eM112751f, 11);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C4789l(function4, c9598eM112751f, 11);
                    c28655q.m87172p0(objM87133R6);
                }
                modifierM3360e = AbstractC1092a.m3360e(c2314t, interfaceC21083i, c1119dM43228a2, false, c18027i2, (InterfaceC4339a) objM87133R6, 12);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1500743862);
                c28655q.m87173q(false);
                modifierM3360e = c2314t;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
            C2306l c2306l2 = C2299e.f9108K;
            float f14 = ((float) 1.5d) * 8;
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), c2306l2, c28655q, 54);
            function5 = function4;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            Modifier modifier5 = modifier2;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierMo3471e2 = new LayoutWeightElement(1.0f, true).mo3471e(modifierM3360e);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), c2306l2, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            abstractC22403oM112750e = viewState.getImage();
            if (abstractC22403oM112750e == null) {
                abstractC22403oM112750e = AbstractC22403o.b.f87641b;
            }
            AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(abstractC22403oM112750e, null, null, c28655q, 0, 3);
            if (AbstractC39414r.m125890i0(strM21274h)) {
                str2 = null;
            } else {
                str2 = strM21274h;
            }
            AbstractC29125c.m88522c(abstractC26165aM64500i2, str2, AbstractC37056f.m118994r(AbstractC1102d.m3419p(10 * 4, c2314t), AbstractC33253j.f138651a), null, C39102j.f168199a, 0.0f, null, c28655q, 24576, 104);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 48, 3120, 185848);
            c28655q = c28655q;
            if (AbstractC8693b.m21270d(viewState.getSubtitle())) {
                c28655q.m87150e0(1822748750);
                AbstractC30795n.m94707h(strM21274h2, AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 48, 3120, 185848);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1823156772);
                c28655q.m87173q(false);
            }
            if (str != null) {
                c28655q = c28655q;
                c28655q = c28655q;
                z13 = false;
                c28655q.m87150e0(1823653764);
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q;
                c28655q = c28655q;
                z13 = false;
                c28655q.m87150e0(1823653764);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            c35544bM112752g = viewState.getStartButton();
            if (c35544bM112752g == null) {
                c28655q.m87150e0(416843801);
                c28655q.m87173q(z13);
                interfaceC28601c2 = interfaceC28601c1;
                z14 = z13;
                function2 = function5;
                c28676v1 = c28676v0;
            } else {
                c28655q.m87150e0(416843802);
                zM87157i = c28655q.m87157i(c35544bM112752g);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    c28676v1 = c28676v0;
                    if (objM87133R4 == c28676v1) {
                        interfaceC28601c2 = interfaceC28601c1;
                    }
                    function2 = function5;
                    m112744y(c35544bM112752g, (InterfaceC4339a) objM87133R4, function2, c28655q, i16 & 896);
                    z14 = false;
                    c28655q.m87173q(false);
                } else {
                    c28676v1 = c28676v0;
                }
                final int i110 = 0;
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R4 = new InterfaceC4339a() { // from class: v11.g
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i110) {
                            case 0:
                                return AbstractC35551i.m112741v(c35544bM112752g, interfaceC28601c2);
                            default:
                                return AbstractC35551i.m112742w(c35544bM112752g, interfaceC28601c2);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
                function2 = function5;
                m112744y(c35544bM112752g, (InterfaceC4339a) objM87133R4, function2, c28655q, i16 & 896);
                z14 = false;
                c28655q.m87173q(false);
            }
            c35544bM112748c = viewState.getEndButton();
            if (c35544bM112748c == null) {
                c28655q.m87150e0(417099737);
                c28655q.m87173q(z14);
            } else {
                c28655q.m87150e0(417099738);
                zM87157i2 = c28655q.m87157i(c35544bM112748c);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    final int i25 = 1;
                    objM87133R5 = new InterfaceC4339a() { // from class: v11.g
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i25) {
                                case 0:
                                    return AbstractC35551i.m112741v(c35544bM112748c, interfaceC28601c2);
                                default:
                                    return AbstractC35551i.m112742w(c35544bM112748c, interfaceC28601c2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                } else {
                    final int i26 = 1;
                    objM87133R5 = new InterfaceC4339a() { // from class: v11.g
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i26) {
                                case 0:
                                    return AbstractC35551i.m112741v(c35544bM112748c, interfaceC28601c2);
                                default:
                                    return AbstractC35551i.m112742w(c35544bM112748c, interfaceC28601c2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                }
                m112744y(c35544bM112748c, (InterfaceC4339a) objM87133R5, function2, c28655q, i16 & 896);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(modifier3, viewState, function3, i13, i14, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m112736q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final C35553k m112737r(InterfaceC28601c1 interfaceC28601c1) {
        return (C35553k) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: s */
    private static final void m112738s(InterfaceC28601c1 interfaceC28601c1, C35553k c35553k) {
        interfaceC28601c1.setValue(c35553k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m112739t(InterfaceC28601c1 interfaceC28601c1) {
        m112738s(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m112740u(Function1 function1, C9598e c9598e) {
        function1.invoke(c9598e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m112741v(C35544b c35544b, InterfaceC28601c1 interfaceC28601c1) {
        m112738s(interfaceC28601c1, c35544b.getConfirmationDialog());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m112742w(C35544b c35544b, InterfaceC28601c1 interfaceC28601c1) {
        m112738s(interfaceC28601c1, c35544b.getConfirmationDialog());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m112743x(Modifier modifier, C35552j c35552j, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m112735p(modifier, c35552j, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final void m112744y(C35544b c35544b, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2020840454);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c35544b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            String strM21274h = AbstractC8693b.m21274h(c35544b.getTitle(), c28655q, 0);
            EnumC35545c enumC35545cM112702k = c35544b.getStyle();
            int i15 = enumC35545cM112702k == null ? -1 : a.f151236a[enumC35545cM112702k.ordinal()];
            if (i15 == 1) {
                c28655q.m87150e0(-301088439);
                EnumC16313m0 enumC16313m0M112699h = c35544b.getIcon();
                if (enumC16313m0M112699h == null) {
                    c28655q.m87150e0(-301088440);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-301088439);
                    m112707A(c35544b, interfaceC4339a, enumC16313m0M112699h, strM21274h, function1, c28655q, (i14 & 126) | ((i14 << 6) & 57344));
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else if (i15 == 2 || i15 == 3) {
                c28655q.m87150e0(-300712192);
                m112710D(c35544b, interfaceC4339a, strM21274h, function1, c28655q, (i14 & 126) | ((i14 << 3) & 7168));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-300465866);
                c28655q.m87173q(false);
                f151235a.mo85228t("FollowerRequestCard: button style not parsed or unknown (" + c35544b.getStyle() + "), skipping render (id=" + c35544b.getId() + ")", new AbstractC30556a.a[0]);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e(c35544b, interfaceC4339a, function1, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m112745z(C35544b c35544b, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        m112744y(c35544b, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
