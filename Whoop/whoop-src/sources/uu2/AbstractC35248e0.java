package uu2;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gu2.C16214a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import qz0.AbstractC30795n;
import s01.C32049e;
import tu1.C34190c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: uu2.e0 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\b\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0017\u0010\u0014\u001a+\u0010\u001b\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0012\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lkd1/o;", "image", "", "videoUrl", "name", "Lkotlin/Function0;", "Ll83/a0;", "onPlayVideo", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lgu2/a;", "instructionText", "j", "(Lgu2/a;Landroidx/compose/runtime/Composer;I)V", "equipmentLabel", "equipmentValue", "Landroidx/compose/ui/Modifier;", "sectionSpacer", "labelGap", "f", "(Lgu2/a;Lgu2/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "muscleGroupsLabel", "muscleGroupsValue", "n", "linkedExerciseLabel", "Lm91/u;", "linkedExerciseValue", "l", "(Lgu2/a;Lm91/u;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35248e0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m111683f(C16214a c16214a, C16214a c16214a2, Modifier modifier, Modifier modifier2, Composer composer, int i13) {
        C16214a c16214a3;
        int i14;
        C16214a c16214a4;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1820938604);
        if ((i13 & 6) == 0) {
            c16214a3 = c16214a;
            i14 = (c28655q2.m87157i(c16214a3) ? 4 : 2) | i13;
        } else {
            c16214a3 = c16214a;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            c16214a4 = c16214a2;
            i14 |= c28655q2.m87157i(c16214a4) ? 32 : 16;
        } else {
            c16214a4 = c16214a2;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(modifier) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            TextResource text = c16214a4.getText();
            int i15 = TextResource.$stable;
            if (AbstractC39414r.m125890i0(AbstractC8693b.m21274h(text, c28655q2, i15))) {
                c28655q = c28655q2;
                c28655q.m87150e0(2145741334);
                c28655q.m87173q(false);
            } else {
                c28655q2.m87150e0(2145287742);
                AbstractC22953f.m66715b(c28655q2, modifier);
                String strM21274h = AbstractC8693b.m21274h(c16214a3.getText(), c28655q2, i15);
                long jMo134584toComposableColorWaAFU9c = c16214a3.getTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                C2886a textStyle = c16214a3.getTextStyle();
                int i16 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, null, c28655q2, 0, i16, 196602);
                AbstractC22953f.m66715b(c28655q2, modifier2);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c16214a2.getText(), c28655q2, i15), null, c16214a2.getTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c16214a2.getTextStyle(), null, c28655q2, 0, i16, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35246d0(c16214a3, c16214a2, modifier, modifier2, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m111684g(C16214a c16214a, C16214a c16214a2, Modifier modifier, Modifier modifier2, int i13, Composer composer, int i14) {
        m111683f(c16214a, c16214a2, modifier, modifier2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m111685h(AbstractC22403o abstractC22403o, String str, String str2, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1331690902);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(str2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            c28655q.m87138X();
        } else if (abstractC22403o == null) {
            c28655q.m87150e0(-209099800);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-209099799);
            int i15 = i14 << 3;
            AbstractC35252g0.m111706f(null, abstractC22403o, str, str2, interfaceC4339a, c28655q, (AbstractC22403o.f87638a << 3) | (i15 & 896) | (i15 & 7168) | (i15 & 57344), 1);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34190c(abstractC22403o, str, str2, interfaceC4339a, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m111686i(AbstractC22403o abstractC22403o, String str, String str2, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m111685h(abstractC22403o, str, str2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m111687j(C16214a c16214a, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1118790250);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(c16214a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q = c28655q2;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c16214a.getText(), c28655q2, TextResource.$stable), null, c16214a.getTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c16214a.getTextStyle(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35253h(c16214a, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m111688k(C16214a c16214a, int i13, Composer composer, int i14) {
        m111687j(c16214a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m111689l(C16214a c16214a, InterfaceC25312u interfaceC25312u, Modifier modifier, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1350815616);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c16214a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC25312u) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87138X();
        } else if (c16214a == null || interfaceC25312u == null) {
            c28655q.m87150e0(-1694972894);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1695314049);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(2 * 8, C2314t.f9131w));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c16214a.getText(), c28655q, TextResource.$stable), null, c16214a.getTextColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c16214a.getTextStyle(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            AbstractC22953f.m66715b(c28655q, modifier);
            AbstractC25303l.m74291r(interfaceC25312u, null, null, null, c28655q, (i14 >> 3) & 14, 14);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e((Object) c16214a, (Object) interfaceC25312u, modifier, i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m111690m(C16214a c16214a, InterfaceC25312u interfaceC25312u, Modifier modifier, int i13, Composer composer, int i14) {
        m111689l(c16214a, interfaceC25312u, modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m111691n(C16214a c16214a, C16214a c16214a2, Modifier modifier, Modifier modifier2, Composer composer, int i13) {
        C16214a c16214a3;
        int i14;
        C16214a c16214a4;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1955819199);
        if ((i13 & 6) == 0) {
            c16214a3 = c16214a;
            i14 = (c28655q2.m87157i(c16214a3) ? 4 : 2) | i13;
        } else {
            c16214a3 = c16214a;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            c16214a4 = c16214a2;
            i14 |= c28655q2.m87157i(c16214a4) ? 32 : 16;
        } else {
            c16214a4 = c16214a2;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(modifier) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            TextResource text = c16214a4.getText();
            int i15 = TextResource.$stable;
            if (AbstractC39414r.m125890i0(AbstractC8693b.m21274h(text, c28655q2, i15))) {
                c28655q = c28655q2;
                c28655q.m87150e0(284193635);
                c28655q.m87173q(false);
            } else {
                c28655q2.m87150e0(283722745);
                AbstractC22953f.m66715b(c28655q2, modifier);
                String strM21274h = AbstractC8693b.m21274h(c16214a3.getText(), c28655q2, i15);
                long jMo134584toComposableColorWaAFU9c = c16214a3.getTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                C2886a textStyle = c16214a3.getTextStyle();
                int i16 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, null, c28655q2, 0, i16, 196602);
                AbstractC22953f.m66715b(c28655q2, modifier2);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c16214a2.getText(), c28655q2, i15), null, c16214a2.getTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c16214a2.getTextStyle(), null, c28655q2, 0, i16, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35246d0(c16214a3, c16214a2, modifier, modifier2, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m111692o(C16214a c16214a, C16214a c16214a2, Modifier modifier, Modifier modifier2, int i13, Composer composer, int i14) {
        m111691n(c16214a, c16214a2, modifier, modifier2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
