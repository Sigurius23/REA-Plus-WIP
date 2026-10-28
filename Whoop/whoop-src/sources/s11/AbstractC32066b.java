package s11;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.EnumC2888c;
import c13.AbstractC3855a;
import c51.C4224b;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import dp0.C12253i;
import fy1.C14873i;
import gb1.AbstractC15676d;
import gz0.EnumC16313m0;
import hy0.AbstractC17755i2;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import iz0.AbstractC21048g;
import iz0.C21053l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import l01.C23031c;
import l01.C23032d;
import l01.EnumC23029a;
import l83.C23454a0;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p736sz0.AbstractC33166b0;
import p736sz0.C33169c0;
import p745y81.EnumC39333f;
import q81.C30048f;
import qk2.C30453i;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: s11.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aC\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll01/d;", "state", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Ll01/d;Landroidx/compose/runtime/Composer;II)V", "Lgz0/m0;", "icon", "Ly81/f;", "iconBackgroundColor", "iconTintColor", "Ll01/a;", "shape", "Ly3/f;", "iconSize", "f", "(Lgz0/m0;Ly81/f;Ly81/f;Ll01/a;FLandroidx/compose/runtime/Composer;II)V", "j", "(Landroidx/compose/runtime/Composer;I)V", "n", "l", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32066b {

    /* JADX INFO: renamed from: s11.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m99649a(Composer composer, int i13) throws XmlPullParserException, IOException {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(1276195946);
            float f13 = 2 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q, 6);
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
            C32067c c32067c = C32067c.f132977a;
            AbstractC32066b.m99641h(null, c32067c.m99654c(), c28655q, 0, 1);
            AbstractC32066b.m99641h(null, c32067c.m99652a(), c28655q, 0, 1);
            AbstractC32066b.m99641h(null, c32067c.m99653b(), c28655q, 0, 1);
            AbstractC32066b.m99641h(null, c32067c.m99655d(), c28655q, 0, 1);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
            m99649a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: s11.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m99650a(Composer composer, int i13) throws XmlPullParserException, IOException {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(520934217);
            AbstractC32066b.m99641h(null, C23032d.m66806b(C32067c.f132977a.m99656e(), null, false, null, null, 14, null), c28655q, 0, 1);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
            m99650a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: s11.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m99651a(Composer composer, int i13) throws XmlPullParserException, IOException {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-952969342);
            AbstractC32066b.m99641h(null, C23032d.m66806b(C32067c.f132977a.m99654c(), null, false, null, null, 14, null), c28655q, 0, 1);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
            m99651a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: s11.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f132976a;

        static {
            int[] iArr = new int[EnumC23029a.values().length];
            try {
                iArr[EnumC23029a.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC23029a.ROUNDED_SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f132976a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0169  */
    /* JADX WARN: Code duplicated, block: B:101:0x0174  */
    /* JADX WARN: Code duplicated, block: B:103:0x0189  */
    /* JADX WARN: Code duplicated, block: B:104:0x0193  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:84:0x0103  */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0113  */
    /* JADX WARN: Code duplicated, block: B:91:0x013a  */
    /* JADX WARN: Code duplicated, block: B:92:0x013e  */
    /* JADX WARN: Code duplicated, block: B:97:0x015f  */
    /* JADX INFO: renamed from: f */
    public static final void m99639f(EnumC16313m0 enumC16313m0, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, EnumC23029a enumC23029a, float f13, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        float f14;
        boolean z4;
        EnumC39333f enumC39333f3;
        float f15;
        C28677v1 c28677v1M87180u;
        C17919x c17919xM31989h;
        EnumC39333f enumC39333f4;
        float f16;
        int i16;
        C33252i c33252iM105489e;
        C17919x c17919xM31989h2;
        C2314t c2314t;
        Modifier modifierM118994r;
        Modifier modifierM3358c;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        long jM31986e;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1052135947);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87149e(enumC16313m0 == null ? -1 : enumC16313m0.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC39333f == null ? -1 : enumC39333f.ordinal()) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(enumC39333f2 == null ? -1 : enumC39333f2.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87149e(enumC23029a == null ? -1 : enumC23029a.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i18 = i14 & 16;
        if (i18 == 0) {
            if ((i13 & 24576) == 0) {
                f14 = f13;
                i15 |= c28655q.m87147d(f14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c17919xM31989h = null;
                if (i17 != 0) {
                    enumC39333f4 = null;
                } else {
                    enumC39333f4 = enumC39333f2;
                }
                if (i18 != 0) {
                    f16 = ((float) 2.5d) * 4;
                } else {
                    f16 = f14;
                }
                i16 = enumC23029a != null ? d.f132976a[enumC23029a.ordinal()] : -1;
                if (i16 != 1) {
                    c33252iM105489e = AbstractC33253j.f138651a;
                } else if (i16 != 2) {
                    c33252iM105489e = null;
                } else {
                    c33252iM105489e = AbstractC33253j.m105489e(((float) 0.5d) * 8);
                }
                if (enumC39333f == null) {
                    c28655q.m87150e0(489756281);
                    c28655q.m87173q(false);
                    c17919xM31989h2 = null;
                } else {
                    c28655q.m87150e0(-1785316728);
                    c17919xM31989h2 = AbstractC11895b.m31989h(c28655q, false, enumC39333f.mo134584toComposableColorWaAFU9c(c28655q, (i15 >> 3) & 14));
                }
                float f17 = 4;
                c2314t = C2314t.f9131w;
                Modifier modifierM3419p = AbstractC1102d.m3419p(f17 * f17, c2314t);
                if (c33252iM105489e != null) {
                    modifierM118994r = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
                } else {
                    modifierM118994r = null;
                }
                Modifier modifierM44103f = AbstractC15676d.m44103f(modifierM3419p, modifierM118994r);
                if (c17919xM31989h2 != null) {
                    modifierM3358c = AbstractC1092a.m3358c(c2314t, c17919xM31989h2.f69639a, AbstractC17918w0.f69621a);
                } else {
                    modifierM3358c = null;
                }
                Modifier modifierM44103f2 = AbstractC15676d.m44103f(modifierM44103f, modifierM3358c);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44103f2);
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
                if (enumC16313m0 == null) {
                    c28655q.m87150e0(-1849726800);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1849726799);
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(f16, c2314t);
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q, 6);
                    if (enumC39333f4 == null) {
                        c28655q.m87150e0(-61623521);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1660580130);
                        c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, enumC39333f4.mo134584toComposableColorWaAFU9c(c28655q, (i15 >> 6) & 14));
                    }
                    if (c17919xM31989h == null) {
                        c28655q.m87150e0(1660581433);
                        jM31986e = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(1660579697);
                        c28655q.m87173q(false);
                        jM31986e = c17919xM31989h.f69639a;
                    }
                    AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p2, jM31986e, c28655q, 48, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                enumC39333f3 = enumC39333f4;
                f15 = f16;
            } else {
                c28655q.m87138X();
                enumC39333f3 = enumC39333f2;
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4224b(enumC16313m0, enumC39333f, enumC39333f3, enumC23029a, f15, i13, i14);
            }
        }
        i15 |= 24576;
        f14 = f13;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c17919xM31989h = null;
            if (i17 != 0) {
                enumC39333f4 = null;
            } else {
                enumC39333f4 = enumC39333f2;
            }
            if (i18 != 0) {
                f16 = ((float) 2.5d) * 4;
            } else {
                f16 = f14;
            }
            if (enumC23029a != null) {
            }
            if (i16 != 1) {
                c33252iM105489e = AbstractC33253j.f138651a;
            } else if (i16 != 2) {
                c33252iM105489e = null;
            } else {
                c33252iM105489e = AbstractC33253j.m105489e(((float) 0.5d) * 8);
            }
            if (enumC39333f == null) {
                c28655q.m87150e0(489756281);
                c28655q.m87173q(false);
                c17919xM31989h2 = null;
            } else {
                c28655q.m87150e0(-1785316728);
                c17919xM31989h2 = AbstractC11895b.m31989h(c28655q, false, enumC39333f.mo134584toComposableColorWaAFU9c(c28655q, (i15 >> 3) & 14));
            }
            float f18 = 4;
            c2314t = C2314t.f9131w;
            Modifier modifierM3419p3 = AbstractC1102d.m3419p(f18 * f18, c2314t);
            if (c33252iM105489e != null) {
                modifierM118994r = AbstractC37056f.m118994r(c2314t, c33252iM105489e);
            } else {
                modifierM118994r = null;
            }
            Modifier modifierM44103f3 = AbstractC15676d.m44103f(modifierM3419p3, modifierM118994r);
            if (c17919xM31989h2 != null) {
                modifierM3358c = AbstractC1092a.m3358c(c2314t, c17919xM31989h2.f69639a, AbstractC17918w0.f69621a);
            } else {
                modifierM3358c = null;
            }
            Modifier modifierM44103f4 = AbstractC15676d.m44103f(modifierM44103f3, modifierM3358c);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44103f4);
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
            if (enumC16313m0 == null) {
                c28655q.m87150e0(-1849726800);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1849726799);
                Modifier modifierM3419p4 = AbstractC1102d.m3419p(f16, c2314t);
                C27430e c27430eM107874S2 = AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q, 6);
                if (enumC39333f4 == null) {
                    c28655q.m87150e0(-61623521);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1660580130);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, enumC39333f4.mo134584toComposableColorWaAFU9c(c28655q, (i15 >> 6) & 14));
                }
                if (c17919xM31989h == null) {
                    c28655q.m87150e0(1660581433);
                    jM31986e = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(1660579697);
                    c28655q.m87173q(false);
                    jM31986e = c17919xM31989h.f69639a;
                }
                AbstractC15005f3.m43108b(c27430eM107874S2, null, modifierM3419p4, jM31986e, c28655q, 48, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            enumC39333f3 = enumC39333f4;
            f15 = f16;
        } else {
            c28655q.m87138X();
            enumC39333f3 = enumC39333f2;
            f15 = f14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4224b(enumC16313m0, enumC39333f, enumC39333f3, enumC23029a, f15, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m99640g(EnumC16313m0 enumC16313m0, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, EnumC23029a enumC23029a, float f13, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m99639f(enumC16313m0, enumC39333f, enumC39333f2, enumC23029a, f13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
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
    /* JADX INFO: renamed from: h */
    public static final void m99641h(Modifier modifier, C23032d state, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q;
        float f13;
        C2314t c2314t;
        C0209i c0209i;
        C2305k c2305k;
        ?? r10;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        boolean z4;
        C28655q c28655q2;
        boolean z13;
        C28655q c28655q3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-1321241981);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q4.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q4.m87157i(state) ? 32 : 16;
        }
        if (c28655q4.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t2 : modifier2;
            float f14 = 4;
            Modifier modifierM3394p = AbstractC1099a.m3394p(state.getStyle().getInnerPadding(), AbstractC31061c.m95629e(AbstractC1102d.m3409f(1.0f, modifier4), 3, f14, AbstractC18249c.m52573k(state.getStyle().getCardBackground(), c28655q4, 0)));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q4, 0);
            int iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i5, c23010xM66775a);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i6, interfaceC28653p1M87165m);
            C0209i c0209i7 = C0217k.f732j;
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i7);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i8, modifierM118962N);
            if (state.getTitle() == null || !AbstractC8693b.m21270d(state.getTitle())) {
                modifier4 = modifier4;
                f13 = f14;
                c2314t = c2314t2;
                c0209i = c0209i6;
                c2305k = c2305k2;
                r10 = 0;
                c0209i2 = c0209i8;
                c0209i3 = c0209i7;
                c0213j = c0213j;
                c0209i4 = c0209i5;
                z4 = true;
                c28655q4.m87150e0(-1398734999);
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            } else {
                c28655q4.m87150e0(-1399358688);
                String upperCase = AbstractC8693b.m21274h(state.getTitle(), c28655q4, 0).toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                if (state.getShowDivider()) {
                    c28655q4.m87150e0(-1399267858);
                    f13 = f14;
                    c0209i4 = c0209i5;
                    c2314t = c2314t2;
                    c2305k = c2305k2;
                    z13 = false;
                    c0209i = c0209i6;
                    c0209i2 = c0209i8;
                    c0209i3 = c0209i7;
                    z4 = true;
                    AbstractC17755i2.m50938j(null, null, null, AbstractC8693b.m21278l(upperCase), null, 0L, 0L, null, c28655q4, 0, 247);
                    C28655q c28655q5 = c28655q4;
                    c28655q5.m87173q(false);
                    c28655q3 = c28655q5;
                } else {
                    f13 = f14;
                    c2314t = c2314t2;
                    c0209i = c0209i6;
                    c2305k = c2305k2;
                    z13 = false;
                    c0209i2 = c0209i8;
                    c0209i3 = c0209i7;
                    c0209i4 = c0209i5;
                    z4 = true;
                    c28655q4.m87150e0(-1399133101);
                    AbstractC33166b0.m105053d(null, new C33169c0(upperCase, EnumC2888c.H5, state.getStyle().getTitleTextColor(), 5, null, null, null, null, false, null, MessageListItemViewType.GIPHY, null), 0, 0, 0, c28655q4, 0, 29);
                    c28655q4.m87173q(false);
                    c28655q3 = c28655q4;
                }
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3411h(state.getStyle().getTitleSpace(), c2314t));
                c28655q3.m87173q(z13);
                r10 = z13;
                c28655q2 = c28655q3;
            }
            float f15 = 8;
            int i17 = 6;
            C23010x c23010xM73381n = AbstractC25012a.m73381n(2, f15, c2305k, c28655q2, 6);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, modifierM118962N2);
            c28655q2.m87150e0(-1298859497);
            C28655q c28655q6 = c28655q2;
            for (C23031c c23031c : state.m66808c()) {
                C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 1.5d, f15, C2299e.f9108K, c28655q6, 54);
                int iHashCode3 = Long.hashCode(c28655q6.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q6.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q6, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q6.m87158i0();
                if (c28655q6.f115903S) {
                    c28655q6.m87163l(c0213j2);
                } else {
                    c28655q6.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q6, C0217k.f729g, c22994r1M53376q);
                AbstractC28683x.m87239G(c28655q6, C0217k.f728f, interfaceC28653p1M87165m3);
                C0209i c0209i9 = C0217k.f732j;
                if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q6, iHashCode3, c0209i9);
                }
                AbstractC28683x.m87239G(c28655q6, C0217k.f726d, modifierM118962N3);
                if (state.getStyle().getShowCheckListIcons()) {
                    c28655q6.m87150e0(482969749);
                    m99639f(c23031c.getIcon(), c23031c.getIconBackgroundColor(), c23031c.getIconTintColor(), c23031c.getShape(), c23031c.getIconSize(), c28655q6, 0, 0);
                    c28655q6.m87173q(r10);
                } else {
                    c28655q6.m87150e0(483382700);
                    EnumC16313m0 enumC16313m0M66798a = c23031c.getIcon();
                    if (enumC16313m0M66798a == null) {
                        c28655q6.m87150e0(483382699);
                        c28655q6.m87173q(r10);
                    } else {
                        c28655q6.m87150e0(483382700);
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M66798a.toWhoopIcon(), c28655q6, i17), null, AbstractC1102d.m3419p(5 * f13, c2314t), C38072d.f163053a.m121949b(c28655q6, i17).getRecovery(), c28655q6, 432, 0);
                        c28655q6.m87173q(r10);
                    }
                    c28655q6.m87173q(r10);
                }
                C28655q c28655q7 = c28655q6;
                AbstractC21048g.m58807M(c23031c.getTitle(), null, false, C21053l.f79834a.m58880a(EnumC2888c.INSTANCE.m8402a(c23031c.getTextStyle()).getStyle(), c23031c.getTextColor().mo134584toComposableColorWaAFU9c(c28655q6, r10), C38072d.f163053a.m121949b(c28655q6, i17).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q7, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32760), null, 0, 0, 0, false, c28655q7, 0, 502);
                C28655q c28655q8 = c28655q7;
                c28655q8.m87173q(z4);
                f15 = f15;
                i17 = i17;
                c28655q6 = c28655q8;
            }
            AbstractC25012a.m73392y(c28655q6, r10, z4, z4);
            modifier3 = modifier4;
            c28655q = c28655q6;
        } else {
            c28655q4.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(modifier3, state, i13, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m99642i(Modifier modifier, C23032d c23032d, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m99641h(modifier, c23032d, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m99643j(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-116416583);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m99644k(int i13, Composer composer, int i14) {
        m99643j(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m99645l(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-292081669);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new b()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m99646m(int i13, Composer composer, int i14) {
        m99645l(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m99647n(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-159599510);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new c()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m99648o(int i13, Composer composer, int i14) {
        m99647n(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
