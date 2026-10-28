package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bm0.C3412o;
import c41.AbstractC4081n5;
import com.whoop.design.util.TextResource;
import hy0.C17797w;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22399k;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.InterfaceC17869a1;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.j8 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0006\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\r\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\bH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/runtime/Composer;I)V", "", "Lcom/whoop/design/util/TextResource$e;", "textList", "f", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "Li2/x;", "textColor", "Li2/a1;", "textPartitionShape", "partitionShapeColor", "d", "(Ljava/util/List;JLi2/a1;JLandroidx/compose/runtime/Composer;II)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40372j8 {
    /* JADX INFO: renamed from: d */
    private static final void m130125d(List<TextResource.C8691e> list, long j7, InterfaceC17869a1 interfaceC17869a1, long j13, Composer composer, int i13, int i14) {
        int i15;
        long jM125382b1;
        InterfaceC17869a1 interfaceC17869a2;
        long jM125370W0;
        long j14;
        InterfaceC17869a1 interfaceC17869a3;
        long j15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2134643654);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(list) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                jM125382b1 = j7;
                int i16 = c28655q.m87151f(jM125382b1) ? 32 : 16;
                i15 |= i16;
            } else {
                jM125382b1 = j7;
            }
            i15 |= i16;
        } else {
            jM125382b1 = j7;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                interfaceC17869a2 = interfaceC17869a1;
                int i17 = c28655q.m87153g(interfaceC17869a2) ? 256 : 128;
                i15 |= i17;
            } else {
                interfaceC17869a2 = interfaceC17869a1;
            }
            i15 |= i17;
        } else {
            interfaceC17869a2 = interfaceC17869a1;
        }
        if ((i13 & 3072) == 0) {
            jM125370W0 = j13;
            i15 |= ((i14 & 8) == 0 && c28655q.m87151f(jM125370W0)) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            jM125370W0 = j13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                if ((i14 & 2) != 0) {
                    jM125382b1 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite50();
                    i15 &= -113;
                }
                if ((i14 & 4) != 0) {
                    interfaceC17869a2 = AbstractC33253j.f138651a;
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    jM125370W0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10();
                    i15 &= -7169;
                }
            } else {
                c28655q.m87138X();
                if ((i14 & 2) != 0) {
                    i15 &= -113;
                }
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                }
            }
            InterfaceC17869a1 interfaceC17869a4 = interfaceC17869a2;
            long j16 = jM125370W0;
            long j17 = jM125382b1;
            c28655q.m87175r();
            int i18 = i15 << 3;
            C2314t c2314t = C2314t.f9131w;
            AbstractC4081n5.m12528b(c2314t, list, j17, interfaceC17869a4, j16, c28655q, (i18 & 112) | 6 | (i18 & 896) | (i18 & 7168) | (i18 & 57344), 0);
            AbstractC18489d0.m53380u(2, 4, c2314t, c28655q);
            j14 = j17;
            interfaceC17869a3 = interfaceC17869a4;
            j15 = j16;
        } else {
            c28655q.m87138X();
            j14 = jM125382b1;
            interfaceC17869a3 = interfaceC17869a2;
            j15 = jM125370W0;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17797w(list, j14, interfaceC17869a3, j15, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m130126e(List list, long j7, InterfaceC17869a1 interfaceC17869a1, long j13, int i13, int i14, Composer composer, int i15) {
        m130125d(list, j7, interfaceC17869a1, j13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private static final void m130127f(List<TextResource.C8691e> list, Composer composer, int i13) {
        int i14;
        List<TextResource.C8691e> list2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1919158793);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            list2 = list;
            AbstractC4081n5.m12528b(c2314t, list2, 0L, null, 0L, c28655q, ((i14 << 3) & 112) | 6, 28);
            AbstractC18489d0.m53380u(2, 4, c2314t, c28655q);
        } else {
            list2 = list;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(list2, i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m130128g(List list, int i13, Composer composer, int i14) {
        m130127f(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m130129h(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1959867516);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 0.0f, 4 * 8, 1);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            AbstractC22399k.m64473c("Standard", c28655q, 6);
            List listM118958J = AbstractC37056f.m118958J(new TextResource.C8691e("Monday"));
            int i14 = TextResource.C8691e.f25898b;
            m130127f(listM118958J, c28655q, i14);
            m130127f(AbstractC37056f.m118959K(new TextResource.C8691e("Day"), new TextResource.C8691e("Day"), new TextResource.C8691e("Day")), c28655q, i14);
            m130127f(AbstractC37056f.m118959K(new TextResource.C8691e("Mon"), new TextResource.C8691e("Tue"), new TextResource.C8691e("Wed"), new TextResource.C8691e("Thu"), new TextResource.C8691e("Fri"), new TextResource.C8691e("Sat"), new TextResource.C8691e("Sun")), c28655q, i14);
            AbstractC22399k.m64473c("With Custom colors and shapes", c28655q, 6);
            List listM118958J2 = AbstractC37056f.m118958J(new TextResource.C8691e("Monday"));
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            m130125d(listM118958J2, c38072d.m121949b(c28655q, i15).getGreyL5(), null, 0L, c28655q, i14, 12);
            m130125d(AbstractC37056f.m118959K(new TextResource.C8691e("Day"), new TextResource.C8691e("Day"), new TextResource.C8691e("Day")), 0L, AbstractC17918w0.f69621a, 0L, c28655q, i14 | 384, 10);
            m130125d(AbstractC37056f.m118959K(new TextResource.C8691e("Mon"), new TextResource.C8691e("Tue"), new TextResource.C8691e("Wed"), new TextResource.C8691e("Thu"), new TextResource.C8691e("Fri"), new TextResource.C8691e("Sat"), new TextResource.C8691e("Sun")), c38072d.m121949b(c28655q, i15).getRecoveryMediumRecovery(), null, c38072d.m121949b(c28655q, i15).getStrainZone5(), c28655q, i14, 4);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40475t7(i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m130130i(int i13, Composer composer, int i14) {
        m130129h(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
