package p292l1;

import android.content.res.Configuration;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import com.whoop.android.R;
import ht2.C17632d;
import i20.C17956k0;
import i93.C18284j;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io2.C20780q;
import java.util.Arrays;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuBaseService;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p316m1.AbstractC24899e0;
import p354o1.AbstractC27368g;
import p354o1.AbstractC27370i;
import p354o1.AbstractC27371j;
import p354o1.EnumC27367f;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l1.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23067b0 {

    /* JADX INFO: renamed from: a */
    public static final C23067b0 f90984a = new C23067b0();

    /* JADX INFO: renamed from: b */
    public static final C18284j f90985b = new C18284j(1900, 2100, 1);

    /* JADX INFO: renamed from: c */
    public static final float f90986c = AbstractC27371j.f109885a;

    /* JADX INFO: renamed from: d */
    public static final C23210z f90987d = new C23210z();

    /* JADX INFO: renamed from: c */
    public static C23204y m67042c(long j7, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, long j29, long j34, long j35, long j36, long j37, Composer composer, int i13) {
        long j38 = (i13 & 1) != 0 ? C17919x.f69637n : j7;
        long j39 = (i13 & 2) != 0 ? C17919x.f69637n : j13;
        long j44 = (i13 & 4) != 0 ? C17919x.f69637n : j14;
        long j45 = (i13 & 8) != 0 ? C17919x.f69637n : j15;
        long j46 = (i13 & 16) != 0 ? C17919x.f69637n : j16;
        long j47 = (i13 & 32) != 0 ? C17919x.f69637n : j17;
        long j48 = (i13 & 64) != 0 ? C17919x.f69637n : j18;
        long j49 = (i13 & 128) != 0 ? C17919x.f69637n : j19;
        long j54 = j38;
        long j55 = (i13 & 256) != 0 ? C17919x.f69637n : j24;
        long j56 = C17919x.f69637n;
        long j57 = j55;
        long j58 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? j56 : j27;
        long j59 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? j56 : j28;
        long j64 = (i13 & 8388608) != 0 ? j56 : j37;
        long j65 = j59;
        C23132m c23132m = (C23132m) ((C28655q) composer).m87161k(AbstractC23138n.f91494a);
        C23204y c23204y = c23132m.f91436Z;
        if (c23204y == null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(642416503);
            long jM67117c = AbstractC23138n.m67117c(c23132m, AbstractC27368g.f109855a);
            long jM67117c2 = AbstractC23138n.m67117c(c23132m, AbstractC27368g.f109872r);
            long jM67117c3 = AbstractC23138n.m67117c(c23132m, AbstractC27368g.f109870p);
            long jM67117c4 = AbstractC23138n.m67117c(c23132m, AbstractC27368g.f109877w);
            long jM67117c5 = AbstractC23138n.m67117c(c23132m, AbstractC27368g.f109876v);
            long j66 = c23132m.f91459s;
            EnumC27367f enumC27367f = AbstractC27368g.f109854E;
            long jM67117c6 = AbstractC23138n.m67117c(c23132m, enumC27367f);
            long jM51541c = C17919x.m51541c(0.38f, AbstractC23138n.m67117c(c23132m, enumC27367f));
            EnumC27367f enumC27367f2 = AbstractC27368g.f109867m;
            long jM67117c7 = AbstractC23138n.m67117c(c23132m, enumC27367f2);
            EnumC27367f enumC27367f3 = AbstractC27368g.f109852C;
            long jM67117c8 = AbstractC23138n.m67117c(c23132m, enumC27367f3);
            long jM51541c2 = C17919x.m51541c(0.38f, AbstractC23138n.m67117c(c23132m, enumC27367f3));
            EnumC27367f enumC27367f4 = AbstractC27368g.f109851B;
            long jM67117c9 = AbstractC23138n.m67117c(c23132m, enumC27367f4);
            long jM51541c3 = C17919x.m51541c(0.38f, AbstractC23138n.m67117c(c23132m, enumC27367f4));
            EnumC27367f enumC27367f5 = AbstractC27368g.f109868n;
            long jM67117c10 = AbstractC23138n.m67117c(c23132m, enumC27367f5);
            long jM51541c4 = C17919x.m51541c(0.38f, AbstractC23138n.m67117c(c23132m, enumC27367f5));
            EnumC27367f enumC27367f6 = AbstractC27368g.f109864j;
            long jM67117c11 = AbstractC23138n.m67117c(c23132m, enumC27367f6);
            long jM51541c5 = C17919x.m51541c(0.38f, AbstractC23138n.m67117c(c23132m, enumC27367f6));
            EnumC27367f enumC27367f7 = AbstractC27368g.f109863i;
            long jM67117c12 = AbstractC23138n.m67117c(c23132m, enumC27367f7);
            long jM51541c6 = C17919x.m51541c(0.38f, AbstractC23138n.m67117c(c23132m, enumC27367f7));
            long jM67117c13 = AbstractC23138n.m67117c(c23132m, enumC27367f2);
            long jM67117c14 = AbstractC23138n.m67117c(c23132m, AbstractC27368g.f109865k);
            long jM67117c15 = AbstractC23138n.m67117c(c23132m, AbstractC27368g.f109875u);
            long jM67117c16 = AbstractC23138n.m67117c(c23132m, AbstractC27368g.f109874t);
            long jM67117c17 = AbstractC23138n.m67117c(c23132m, AbstractC27370i.f109883a);
            C23177t2 c23177t2 = C23177t2.f91688a;
            C23204y c23204y2 = new C23204y(jM67117c, jM67117c2, jM67117c3, jM67117c4, jM67117c5, j66, jM67117c6, jM51541c, jM67117c7, jM67117c8, jM51541c2, jM67117c9, jM51541c3, jM67117c10, jM51541c4, jM67117c11, jM51541c5, jM67117c12, jM51541c6, jM67117c13, jM67117c14, jM67117c16, jM67117c15, jM67117c17, C23177t2.m67139d(c23132m, c28655q));
            c23132m.f91436Z = c23204y2;
            c28655q.m87173q(false);
            c23204y = c23204y2;
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(642290457);
            c28655q2.m87173q(false);
        }
        long j67 = j54 != 16 ? j54 : c23204y.f91827a;
        long j68 = j39 != 16 ? j39 : c23204y.f91828b;
        long j69 = j44 != 16 ? j44 : c23204y.f91829c;
        if (j45 == 16) {
            j45 = c23204y.f91830d;
        }
        long j73 = j45;
        if (j46 == 16) {
            j46 = c23204y.f91831e;
        }
        long j74 = j46;
        if (j47 == 16) {
            j47 = c23204y.f91832f;
        }
        long j75 = j47;
        if (j48 == 16) {
            j48 = c23204y.f91833g;
        }
        return new C23204y(j67, j68, j69, j73, j74, j75, j48, j49 != 16 ? j49 : c23204y.f91834h, j57 != 16 ? j57 : c23204y.f91835i, j25 != 16 ? j25 : c23204y.f91836j, j56 != 16 ? j56 : c23204y.f91837k, j26 != 16 ? j26 : c23204y.f91838l, j56 != 16 ? j56 : c23204y.f91839m, j58 != 16 ? j58 : c23204y.f91840n, j65 != 16 ? j65 : c23204y.f91841o, j29 != 16 ? j29 : c23204y.f91842p, j56 != 16 ? j56 : c23204y.f91843q, j34 != 16 ? j34 : c23204y.f91844r, j56 != 16 ? j56 : c23204y.f91845s, j35 != 16 ? j35 : c23204y.f91846t, j36 != 16 ? j36 : c23204y.f91847u, j56 != 16 ? j56 : c23204y.f91848v, j56 != 16 ? j56 : c23204y.f91849w, j64 != 16 ? j64 : c23204y.f91850x, c23204y.f91851y);
    }

    /* JADX INFO: renamed from: a */
    public final void m67043a(Long l7, int i13, C23085e0 c23085e0, Modifier modifier, long j7, Composer composer, int i14) {
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1913724796);
        int i15 = i14 | (c28655q2.m87153g(l7) ? 4 : 2) | (c28655q2.m87149e(i13) ? 32 : 16) | (c28655q2.m87153g(c23085e0) ? 256 : 128) | (c28655q2.m87151f(j7) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK);
        if (c28655q2.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            c28655q2.m87140Z();
            if ((i14 & 1) != 0 && !c28655q2.m87118C()) {
                c28655q2.m87138X();
            }
            c28655q2.m87175r();
            c28655q2.m87150e0(2088426481);
            Locale locale = ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).getLocales().get(0);
            c28655q2.m87173q(false);
            String strM67055a = c23085e0.m67055a(l7, locale, false);
            String strM67055a2 = c23085e0.m67055a(l7, locale, true);
            String strM73002i = "";
            if (strM67055a2 == null) {
                c28655q2.m87150e0(380185931);
                if (i13 == 0) {
                    c28655q2.m87150e0(843549871);
                    strM67055a2 = AbstractC24899e0.m73002i(c28655q2, R.string.m3c_date_picker_no_selection_description);
                    c28655q2.m87173q(false);
                } else if (i13 == 1) {
                    c28655q2.m87150e0(843552842);
                    strM67055a2 = AbstractC24899e0.m73002i(c28655q2, R.string.m3c_date_input_no_input_description);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(380407362);
                    c28655q2.m87173q(false);
                    strM67055a2 = "";
                }
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(843542258);
                c28655q2.m87173q(false);
            }
            if (strM67055a == null) {
                c28655q2.m87150e0(380507587);
                if (i13 == 0) {
                    c28655q2.m87150e0(843560257);
                    strM67055a = AbstractC24899e0.m73002i(c28655q2, R.string.m3c_date_picker_headline);
                    c28655q2.m87173q(false);
                } else if (i13 == 1) {
                    c28655q2.m87150e0(843562784);
                    strM67055a = AbstractC24899e0.m73002i(c28655q2, R.string.m3c_date_input_headline);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(380705954);
                    c28655q2.m87173q(false);
                    strM67055a = "";
                }
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(843557408);
                c28655q2.m87173q(false);
            }
            if (i13 == 0) {
                c28655q2.m87150e0(843570444);
                strM73002i = AbstractC24899e0.m73002i(c28655q2, R.string.m3c_date_picker_headline_description);
                c28655q2.m87173q(false);
            } else if (i13 == 1) {
                c28655q2.m87150e0(843573323);
                strM73002i = AbstractC24899e0.m73002i(c28655q2, R.string.m3c_date_input_headline_description);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(381043234);
                c28655q2.m87173q(false);
            }
            String str = String.format(strM73002i, Arrays.copyOf(new Object[]{strM67055a2}, 1));
            boolean zM87153g = c28655q2.m87153g(str);
            Object objM87133R = c28655q2.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C17632d(str, 12);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC23149o4.m67128c(strM67055a, AbstractC18032n.m51775c(modifier, false, (Function1) objM87133R), j7, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, c28655q, (i15 >> 6) & 896, 24576, 245752);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20780q(this, l7, i13, c23085e0, modifier, j7, i14);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m67044b(long j7, Modifier modifier, int i13, Composer composer, int i14) {
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-390880814);
        int i15 = i14 | (c28655q2.m87149e(i13) ? 4 : 2) | (c28655q2.m87151f(j7) ? 256 : 128);
        if (c28655q2.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            c28655q2.m87140Z();
            if ((i14 & 1) != 0 && !c28655q2.m87118C()) {
                c28655q2.m87138X();
            }
            c28655q2.m87175r();
            if (i13 == 0) {
                c28655q2.m87150e0(-1974299164);
                AbstractC23149o4.m67128c(AbstractC24899e0.m73002i(c28655q2, R.string.m3c_date_picker_title), modifier, j7, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c28655q2, i15 & MessageListItemViewType.GIPHY, 0, 262136);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                if (i13 == 1) {
                    c28655q.m87150e0(-1974291869);
                    AbstractC23149o4.m67128c(AbstractC24899e0.m73002i(c28655q, R.string.m3c_date_input_title), modifier, j7, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c28655q, i15 & MessageListItemViewType.GIPHY, 0, 262136);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1073325776);
                    c28655q.m87173q(false);
                }
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17956k0(this, i13, modifier, j7, i14);
        }
    }
}
