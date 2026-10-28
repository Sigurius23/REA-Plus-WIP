package c41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import az1.C2165f;
import b91.C2886a;
import b91.EnumC2888c;
import c31.C3929m;
import c51.AbstractC4234k;
import c51.C4238o;
import c51.C4242s;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gy0.AbstractC16272a;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.l4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aY\u0010\u0012\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\t\u001a)\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(\"\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(\"\u0017\u00105\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0017\u00108\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010&\u001a\u0004\b7\u0010(\"\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0018\u0010B\u001a\u00020?*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A\"\u0018\u0010E\u001a\u00020\u0010*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lc41/r4;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "p", "(Landroidx/compose/ui/Modifier;Lc41/r4;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lm91/u;", "topItem", "Lc41/m4;", "layoutStyle", "Lkd1/o;", "image", "Ly3/f;", "imageSize", "s", "(Lm91/u;Lc41/m4;Lkd1/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ly3/f;Landroidx/compose/runtime/Composer;II)V", "k", "imageSource", "size", "i", "(Lkd1/o;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lkd1/o$c;", "a", "Lkd1/o$c;", "getSampleLevelsImage", "()Lkd1/o$c;", "sampleLevelsImage", "Lc51/s;", "b", "Lc51/s;", "getSampleWhoopAgeAmoeba", "()Lc51/s;", "sampleWhoopAgeAmoeba", "c", "Lc41/r4;", "getSampleProfileInfoTileLevels", "()Lc41/r4;", "sampleProfileInfoTileLevels", "d", "getSampleProfileInfoTileAmoeba", "sampleProfileInfoTileAmoeba", "e", "getSampleProfileInfoTileNoImage", "sampleProfileInfoTileNoImage", "Lkd1/o$a;", "f", "Lkd1/o$a;", "getSampleAvatarImage", "()Lkd1/o$a;", "sampleAvatarImage", "g", "getSampleProfileInfoTileCircleImage", "sampleProfileInfoTileCircleImage", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/List;", "v", "()Ljava/util/List;", "sampleProfileInfoTileStates", "", "u", "(Lc41/r4;)Z", "hasLeadingVisual", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lc41/r4;)F", "singleLayoutImageSize", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4066l4 {

    /* JADX INFO: renamed from: a */
    private static final AbstractC22403o.c f16518a;

    /* JADX INFO: renamed from: b */
    private static final C4242s f16519b;

    /* JADX INFO: renamed from: c */
    private static final C4108r4 f16520c;

    /* JADX INFO: renamed from: d */
    private static final C4108r4 f16521d;

    /* JADX INFO: renamed from: e */
    private static final C4108r4 f16522e;

    /* JADX INFO: renamed from: f */
    private static final AbstractC22403o.a f16523f;

    /* JADX INFO: renamed from: g */
    private static final C4108r4 f16524g;

    /* JADX INFO: renamed from: h */
    private static final List<C4108r4> f16525h;

    /* JADX INFO: renamed from: c41.l4$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16526a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f16527b;

        static {
            int[] iArr = new int[EnumC4038h4.values().length];
            try {
                iArr[EnumC4038h4.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4038h4.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16526a = iArr;
            int[] iArr2 = new int[EnumC4073m4.values().length];
            try {
                iArr2[EnumC4073m4.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC4073m4.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC4073m4.LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f16527b = iArr2;
        }
    }

    static {
        int i13 = AbstractC16272a.f61976O4;
        AbstractC22403o.c cVar = new AbstractC22403o.c(null, i13, i13, i13);
        f16518a = cVar;
        C4242s c4242s = new C4242s(7 * 4, 0.0f, 0.0f, 0.375d, 0.9370266439430035d, null, null, null, false, null, null, null, null, new C4238o("29.9", "", "", "", null, EnumC2888c.N5, false, 16, null), 8166, null);
        f16519b = c4242s;
        EnumC4073m4 enumC4073m4 = EnumC4073m4.DOUBLE;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("LEVEL 30");
        EnumC16313m0 enumC16313m0 = EnumC16313m0.CARET_FORWARD;
        C4108r4 c4108r4 = new C4108r4("levels_tile", enumC4073m4, textResourceM21278l, cVar, null, enumC16313m0, AbstractC8693b.m21278l("2125 Recoveries"), null, null, new C9598e(null, null, null, 7, null), null, null, 3456, null);
        f16520c = c4108r4;
        C4108r4 c4108r5 = new C4108r4("TBD", enumC4073m4, AbstractC8693b.m21278l("WHOOP AGE"), null, c4242s, enumC16313m0, AbstractC8693b.m21278l("2.5 years younger"), null, null, new C9598e(null, null, null, 7, null), null, null, 3456, null);
        f16521d = c4108r5;
        EnumC4073m4 enumC4073m5 = EnumC4073m4.SINGLE;
        f16522e = new C4108r4("no_image_tile", enumC4073m5, AbstractC8693b.m21278l("WHOOP AGE"), null, null, enumC16313m0, AbstractC8693b.m21278l("2.5 years younger"), null, null, new C9598e(null, null, null, 7, null), null, null, 3456, null);
        AbstractC22403o.a aVar = new AbstractC22403o.a(AbstractC16272a.f62062d);
        f16523f = aVar;
        f16524g = new C4108r4("circle_image_tile", enumC4073m5, AbstractC8693b.m21278l("Maya Chen"), aVar, null, enumC16313m0, AbstractC8693b.m21278l("Credited • Jul 3, 2026"), null, null, new C9598e(null, null, null, 7, null), null, EnumC4038h4.CIRCLE, 1408, null);
        f16525h = AbstractC37056f.m118959K(c4108r4, c4108r5, C4108r4.m12654b(c4108r4, null, enumC4073m5, null, null, null, null, null, null, null, null, null, null, 4093, null), C4108r4.m12654b(c4108r4, null, EnumC4073m4.LIST, null, null, null, null, null, null, null, null, null, null, 4093, null));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    private static final void m12448i(AbstractC22403o abstractC22403o, float f13, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2024227023);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(f13, modifier3), AbstractC33253j.m105489e(f13 / 2));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM118994r);
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
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, i15 & 14, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4006d0(abstractC22403o, f13, modifier3, i13, i14, 1);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3419p(f13, modifier3), AbstractC33253j.m105489e(f13 / 2));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM118994r2);
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
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, i15 & 14, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4006d0(abstractC22403o, f13, modifier3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m12449j(AbstractC22403o abstractC22403o, float f13, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m12448i(abstractC22403o, f13, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:111:0x0201  */
    /* JADX WARN: Code duplicated, block: B:114:0x0209 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x020b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0246  */
    /* JADX WARN: Code duplicated, block: B:120:0x0270  */
    /* JADX WARN: Code duplicated, block: B:122:0x0279  */
    /* JADX WARN: Code duplicated, block: B:124:0x027c  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:139:0x02db  */
    /* JADX WARN: Code duplicated, block: B:140:0x030a  */
    /* JADX WARN: Code duplicated, block: B:143:0x031e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0320  */
    /* JADX WARN: Code duplicated, block: B:146:0x0323  */
    /* JADX WARN: Code duplicated, block: B:149:0x0331  */
    /* JADX WARN: Code duplicated, block: B:150:0x0334  */
    /* JADX WARN: Code duplicated, block: B:153:0x0360  */
    /* JADX WARN: Code duplicated, block: B:155:0x0366  */
    /* JADX WARN: Code duplicated, block: B:158:0x0374  */
    /* JADX WARN: Code duplicated, block: B:160:0x0382  */
    /* JADX WARN: Code duplicated, block: B:163:0x038e  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:167:0x0437  */
    /* JADX WARN: Code duplicated, block: B:168:0x0443  */
    /* JADX WARN: Code duplicated, block: B:170:0x0455  */
    /* JADX WARN: Code duplicated, block: B:172:0x045e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0497  */
    /* JADX WARN: Code duplicated, block: B:175:0x049b  */
    /* JADX WARN: Code duplicated, block: B:178:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:180:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:183:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:185:0x0505  */
    /* JADX WARN: Code duplicated, block: B:188:0x0522  */
    /* JADX WARN: Code duplicated, block: B:189:0x0524  */
    /* JADX WARN: Code duplicated, block: B:191:0x0527  */
    /* JADX WARN: Code duplicated, block: B:194:0x054e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0554  */
    /* JADX WARN: Code duplicated, block: B:199:0x0562  */
    /* JADX WARN: Code duplicated, block: B:203:0x0574  */
    /* JADX WARN: Code duplicated, block: B:206:0x0581  */
    /* JADX WARN: Code duplicated, block: B:207:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:210:0x0629  */
    /* JADX WARN: Code duplicated, block: B:211:0x0635  */
    /* JADX WARN: Code duplicated, block: B:213:0x0646  */
    /* JADX WARN: Code duplicated, block: B:215:0x0684  */
    /* JADX WARN: Code duplicated, block: B:216:0x0688  */
    /* JADX WARN: Code duplicated, block: B:219:0x0695  */
    /* JADX WARN: Code duplicated, block: B:221:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:224:0x06af  */
    /* JADX WARN: Code duplicated, block: B:225:0x06da  */
    /* JADX WARN: Code duplicated, block: B:228:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:229:0x0744  */
    /* JADX WARN: Code duplicated, block: B:232:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:235:0x07af  */
    /* JADX WARN: Code duplicated, block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:67:0x0113  */
    /* JADX WARN: Code duplicated, block: B:70:0x011e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0120  */
    /* JADX WARN: Code duplicated, block: B:75:0x012a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0163  */
    /* JADX WARN: Code duplicated, block: B:79:0x0167  */
    /* JADX WARN: Code duplicated, block: B:82:0x017c  */
    /* JADX WARN: Code duplicated, block: B:85:0x018d  */
    /* JADX WARN: Code duplicated, block: B:89:0x019f  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v39, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r12v10, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r12v12, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v14, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v15, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r12v17, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v19, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v4, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r12v6, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v8, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r12v9, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r1v25, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r1v45, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r1v9, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r28v3, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r28v4, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r28v5, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r28v6, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r28v8, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r28v9, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v22 */
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
    /* JADX INFO: renamed from: k */
    private static final void m12450k(Modifier modifier, C4108r4 c4108r4, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        boolean z4;
        Function1 function2;
        Modifier modifier3;
        ?? r14;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function3;
        float f13;
        float f14;
        EnumC4073m4 layoutStyle;
        EnumC4073m4 enumC4073m4;
        long jM95628d;
        float f15;
        float f16;
        float f17;
        int i16;
        boolean z13;
        int i17;
        int i18;
        boolean z14;
        boolean z15;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        C0209i c0209i5;
        EnumC16313m0 endIcon;
        C1100b c1100b;
        float f18;
        C2314t c2314t2;
        float f19;
        ?? r15;
        int i19;
        Function1 function4;
        C2314t c2314t3;
        boolean z16;
        int iHashCode2;
        float f24;
        int i24;
        ?? r16;
        ?? r17;
        C0209i c0209i6;
        int iHashCode3;
        C2305k c2305k;
        C0209i c0209i7;
        float f25;
        int i25;
        ?? r10;
        int iHashCode4;
        ?? r18;
        ?? r19;
        ?? r110;
        int iHashCode5;
        C0209i c0209i8;
        C0209i c0209i9;
        C0209i c0209i10;
        boolean z17;
        boolean z18;
        float f26;
        int iHashCode6;
        ?? r24;
        ?? r111;
        ?? r112;
        int i26;
        C2307m c2307m;
        boolean z19;
        boolean z24;
        boolean z25;
        Object objM87133R2;
        Object objM87133R3;
        C2305k c2305k2 = C2299e.f9110M;
        C2306l c2306l = C2299e.f9108K;
        C2307m c2307m2 = C2299e.f9117z;
        C2307m c2307m3 = C2299e.f9103F;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-754274769);
        int i27 = i14 & 1;
        if (i27 != 0) {
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(c4108r4) : c28655q.m87157i(c4108r4) ? 32 : 16;
        }
        int i28 = i14 & 4;
        if (i28 == 0) {
            if ((i13 & 384) == 0) {
                i15 |= c28655q.m87157i(function1) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i27 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C3929m(21);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function3 = (Function1) objM87133R3;
                } else {
                    function3 = function1;
                }
                f13 = 4;
                f14 = f13 * f13;
                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, modifier4), AbstractC33253j.m105489e(f14));
                layoutStyle = c4108r4.getLayoutStyle();
                enumC4073m4 = EnumC4073m4.LIST;
                if (layoutStyle == enumC4073m4) {
                    c28655q.m87150e0(991431706);
                    long transparent = C38072d.f163053a.m121949b(c28655q, 6).getTransparent();
                    c28655q.m87173q(false);
                    jM95628d = transparent;
                } else {
                    c28655q.m87150e0(991432822);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, jM95628d, AbstractC17918w0.f69621a);
                f15 = 8;
                f16 = 2 * f15;
                if (c4108r4.getLayoutStyle() == enumC4073m4) {
                    f17 = 1 * f15;
                } else {
                    f17 = f16;
                }
                Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3358c, f17, f16);
                i16 = i15 & 112;
                if (i16 != 32 || ((i15 & 64) != 0 && c28655q.m87157i(c4108r4))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Modifier modifier5 = modifier4;
                i17 = i15 & 896;
                i18 = i15;
                if (i17 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z13;
                objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C4059k4(c4108r4, function3);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM5391i = AbstractC1772c1.m5391i(modifierM3395q, false, null, (InterfaceC4339a) objM87133R, 3);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9106I, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM5391i);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    c0209i4 = c0209i;
                } else {
                    c0209i4 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                    endIcon = c4108r4.getEndIcon();
                    c1100b = C1100b.f4583a;
                    if (endIcon != null) {
                        c28655q.m87150e0(622828471);
                        i26 = a.f16527b[c4108r4.getLayoutStyle().ordinal()];
                        if (i26 == 1) {
                            c2307m = C2299e.f9116y;
                        } else {
                            if (i26 == 2 && i26 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c2307m = c2307m3;
                        }
                        C27430e c27430eM107874S = AbstractC34132o.m107874S(c4108r4.getEndIcon().toWhoopIcon(), c28655q, 6);
                        long white50 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                        Modifier modifierM3419p = AbstractC1102d.m3419p(f14, c1100b.mo3400a(c2314t, c2307m));
                        if (i17 == 256) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (i16 != 32 || ((i18 & 64) != 0 && c28655q.m87157i(c4108r4))) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z19 | z24;
                        objM87133R2 = c28655q.m87133R();
                        if (z25 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C4059k4(function3, c4108r4);
                            c28655q.m87172p0(objM87133R2);
                        }
                        Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3419p, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                        c2314t2 = c2314t;
                        f18 = f14;
                        f19 = 1.0f;
                        AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3362g, white50, c28655q, 48, 0);
                        C28655q c28655q2 = c28655q;
                        c28655q2.m87173q(false);
                        r15 = c28655q2;
                    } else {
                        f18 = f14;
                        c2314t2 = c2314t;
                        f19 = 1.0f;
                        c28655q.m87150e0(623587661);
                        c28655q.m87173q(false);
                        r15 = c28655q;
                    }
                    i19 = a.f16527b[c4108r4.getLayoutStyle().ordinal()];
                    if (i19 != 1) {
                        function4 = function3;
                        c2314t3 = c2314t2;
                        z16 = true;
                        C0209i c0209i11 = c0209i4;
                        r15.m87150e0(623726851);
                        Modifier modifierMo3400a = c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t3), C2299e.f9102E);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, r15, 48);
                        iHashCode2 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = r15.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(r15, modifierMo3400a);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j);
                        } else {
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i11, c23010xM66775a);
                        AbstractC28683x.m87239G(r15, r27, interfaceC28653p1M87165m2);
                        if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N2);
                        if (m12460u(c4108r4)) {
                            r15.m87150e0(-75699593);
                            i24 = 3;
                            f24 = f15;
                            m12458s(c4108r4.getTopItem(), null, c4108r4.getImage(), function4, null, null, r15, (i18 << 3) & 7168, 50);
                            AbstractC25012a.m73388u((float) 1.5d, f24, c2314t3, r15, false);
                        } else {
                            f24 = f15;
                            i24 = 3;
                            r15.m87150e0(-75384385);
                            r15.m87173q(false);
                        }
                        if (c4108r4.getTitle() != null) {
                            r15.m87150e0(-75317828);
                            String strM21274h = AbstractC8693b.m21274h(c4108r4.getTitle(), r15, 0);
                            ?? r25 = C38072d.f163053a;
                            ?? r28 = r15;
                            AbstractC30795n.m94707h(strM21274h, null, r25.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(i24), 0L, 2, false, 2, 0, null, r25.m121952e(r15, 6).getSh4(), null, r28, 0, 3120, 185850);
                            ?? r113 = r28;
                            AbstractC25012a.m73388u((float) 0.25d, f24, c2314t3, r113, false);
                            r16 = r113;
                        } else {
                            r15.m87150e0(-74822913);
                            r15.m87173q(false);
                            r16 = r15;
                        }
                        String strM21274h2 = AbstractC8693b.m21274h(c4108r4.getSubtitle(), r16, 0);
                        ?? r26 = C38072d.f163053a;
                        ?? r29 = r16;
                        AbstractC30795n.m94707h(strM21274h2, null, r26.m121949b(r16, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(i24), 0L, 2, false, 2, 0, null, r26.m121952e(r16, 6).getB2(), null, r29, 0, 3120, 185850);
                        ?? r114 = r29;
                        r114.m87173q(true);
                        r114.m87173q(false);
                        r17 = r114;
                    } else if (i19 != 2) {
                        function4 = function3;
                        c0209i6 = c0209i4;
                        r15.m87150e0(625400944);
                        Modifier modifierMo3400a2 = c1100b.mo3400a(AbstractC1102d.m3409f(f19, c2314t2), c2307m2);
                        C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, f15, c2306l, r15, 54);
                        iHashCode3 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = r15.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(r15, modifierMo3400a2);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j);
                        } else {
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i6, c22994r1M53376q);
                        AbstractC28683x.m87239G(r15, r27, interfaceC28653p1M87165m3);
                        if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N3);
                        if (m12460u(c4108r4)) {
                            r15.m87150e0(-1759370494);
                            i25 = 0;
                            c0209i7 = c0209i6;
                            f25 = f15;
                            z16 = true;
                            c2305k = c2305k2;
                            m12458s(c4108r4.getTopItem(), null, c4108r4.getImage(), function4, null, new C39174f(m12462w(c4108r4)), r15, (i18 << 3) & 7168, 18);
                            r15.m87173q(false);
                        } else {
                            c2305k = c2305k2;
                            c0209i7 = c0209i6;
                            z16 = true;
                            f25 = f15;
                            i25 = 0;
                            r15.m87150e0(-1759057208);
                            r15.m87173q(false);
                        }
                        if (1.0f > 0.0d) {
                            r10 = z16;
                        } else {
                            r10 = i25;
                        }
                        if (r10 == 0) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, z16);
                        C23010x c23010xM73381n = AbstractC25012a.m73381n((float) 0.5d, f25, c2305k, r15, 6);
                        iHashCode4 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = r15.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(r15, layoutWeightElement);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j);
                        } else {
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i7, c23010xM73381n);
                        AbstractC28683x.m87239G(r15, r27, interfaceC28653p1M87165m4);
                        if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, r15, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N4);
                        if (c4108r4.getTitle() != null) {
                            r15.m87150e0(1894633932);
                            String strM21274h3 = AbstractC8693b.m21274h(c4108r4.getTitle(), r15, i25);
                            ?? r27 = C38072d.f163053a;
                            C2886a c2886aM8414L = r27.m121952e(r15, 6).getSh4();
                            long brandWhite = r27.m121949b(r15, 6).getBrandWhite();
                            ?? r210 = r15;
                            ?? r33 = i25;
                            AbstractC30795n.m94707h(strM21274h3, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886aM8414L, null, r210, 0, 3120, 186362);
                            ?? r115 = r210;
                            r115.m87173q(r33);
                            r19 = r33;
                            r18 = r115;
                        } else {
                            ?? r34 = i25;
                            r15.m87150e0(1895003762);
                            r15.m87173q(r34);
                            r19 = r34;
                            r18 = r15;
                        }
                        String strM21274h4 = AbstractC8693b.m21274h(c4108r4.getSubtitle(), r18, r19);
                        ?? r35 = C38072d.f163053a;
                        ?? r211 = r18;
                        AbstractC30795n.m94707h(strM21274h4, null, r35.m121949b(r18, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, r35.m121952e(r18, 6).getB2(), null, r211, 0, 3120, 186362);
                        r110 = r211;
                        r110.m87173q(z16);
                        if (c4108r4.getEndIcon() != null) {
                            AbstractC31061c.m95623C(r110, -1757970162, c2314t2, f18, r110);
                            r110.m87173q(r19);
                        } else {
                            r110.m87150e0(-1757883672);
                            r110.m87173q(r19);
                        }
                        r110.m87173q(z16);
                        r110.m87173q(r19);
                        r17 = r110;
                    } else {
                        if (i19 == 3) {
                            throw AbstractC11895b.m32003v(-2058088193, r15, false);
                        }
                        r15.m87150e0(627354440);
                        Modifier modifierMo3400a3 = c1100b.mo3400a(AbstractC1102d.m3409f(f19, c2314t2), c2307m2);
                        C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q(3, f13, c2306l, r15, 54);
                        iHashCode5 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = r15.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(r15, modifierMo3400a3);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j);
                        } else {
                            r15.m87178s0();
                        }
                        c0209i8 = c0209i4;
                        AbstractC28683x.m87239G(r15, c0209i8, c22994r1M53376q2);
                        AbstractC28683x.m87239G(r15, r27, interfaceC28653p1M87165m5);
                        if (r15.f115903S && AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode5))) {
                            c0209i9 = c0209i3;
                        } else {
                            c0209i9 = c0209i3;
                            AbstractC11266d.m30471y(iHashCode5, r15, iHashCode5, c0209i9);
                        }
                        AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N5);
                        if (m12460u(c4108r4)) {
                            r15.m87150e0(530105675);
                            z17 = true;
                            Function1 function5 = function3;
                            c0209i10 = c0209i8;
                            m12458s(c4108r4.getTopItem(), c4108r4.getLayoutStyle(), c4108r4.getImage(), function5, null, null, r15, (i18 << 3) & 7168, 48);
                            function4 = function5;
                            r15.m87173q(false);
                        } else {
                            function4 = function3;
                            c0209i10 = c0209i8;
                            z17 = true;
                            r15.m87150e0(530411273);
                            r15.m87173q(false);
                        }
                        if (f19 > 0.0d) {
                            z18 = z17;
                        } else {
                            z18 = false;
                        }
                        if (!z18) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f19, z17);
                        if (c4108r4.getEndIcon() != null) {
                            f26 = f16;
                        } else {
                            f26 = 0 * f15;
                        }
                        Modifier modifierM3398t = AbstractC1099a.m3398t(layoutWeightElement2, 0.0f, 0.0f, f26, 0.0f, 11);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k2, r15, 6);
                        iHashCode6 = Long.hashCode(r15.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = r15.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(r15, modifierM3398t);
                        r15.m87158i0();
                        if (r15.f115903S) {
                            r15.m87163l(c0213j);
                        } else {
                            r15.m87178s0();
                        }
                        AbstractC28683x.m87239G(r15, c0209i10, c23010xM66775a2);
                        AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m6);
                        if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode6))) {
                            AbstractC11266d.m30471y(iHashCode6, r15, iHashCode6, c0209i9);
                        }
                        AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N6);
                        if (c4108r4.getTitle() != null) {
                            r15.m87150e0(-110856978);
                            String strM21274h5 = AbstractC8693b.m21274h(c4108r4.getTitle(), r15, 0);
                            ?? r36 = C38072d.f163053a;
                            C2886a c2886aM8421b = r36.m121952e(r15, 6).getB2();
                            long brandWhite2 = r36.m121949b(r15, 6).getBrandWhite();
                            ?? r212 = r15;
                            r24 = 0;
                            AbstractC30795n.m94707h(strM21274h5, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886aM8421b, null, r212, 0, 3120, 186362);
                            ?? r116 = r212;
                            r116.m87173q(false);
                            r111 = r116;
                        } else {
                            r24 = 0;
                            r15.m87150e0(-110488109);
                            r15.m87173q(false);
                            r111 = r15;
                        }
                        String strM21274h6 = AbstractC8693b.m21274h(c4108r4.getSubtitle(), r111, r24);
                        ?? r37 = C38072d.f163053a;
                        ?? r213 = r111;
                        AbstractC30795n.m94707h(strM21274h6, null, r37.m121949b(r111, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, r37.m121952e(r111, 6).getB2(), null, r213, 0, 3120, 186362);
                        r112 = r213;
                        r112.m87173q(z17);
                        if (c4108r4.getEndIcon() != null) {
                            AbstractC31061c.m95623C(r112, 531612399, c2314t2, f18, r112);
                            r112.m87173q(r24);
                        } else {
                            r112.m87150e0(531698889);
                            r112.m87173q(r24);
                        }
                        r112.m87173q(z17);
                        r112.m87173q(r24);
                        z16 = z17;
                        r17 = r112;
                    }
                    r17.m87173q(z16);
                    modifier3 = modifier5;
                    function2 = function4;
                    r14 = r17;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                endIcon = c4108r4.getEndIcon();
                c1100b = C1100b.f4583a;
                if (endIcon != null) {
                    c28655q.m87150e0(622828471);
                    i26 = a.f16527b[c4108r4.getLayoutStyle().ordinal()];
                    if (i26 == 1) {
                        if (i26 == 2) {
                        }
                        c2307m = c2307m3;
                    } else {
                        c2307m = C2299e.f9116y;
                    }
                    C27430e c27430eM107874S2 = AbstractC34132o.m107874S(c4108r4.getEndIcon().toWhoopIcon(), c28655q, 6);
                    long white51 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(f14, c1100b.mo3400a(c2314t, c2307m));
                    if (i17 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (i16 != 32) {
                        z24 = true;
                    } else {
                        z24 = true;
                    }
                    z25 = z19 | z24;
                    objM87133R2 = c28655q.m87133R();
                    if (z25) {
                        objM87133R2 = new C4059k4(function3, c4108r4);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C4059k4(function3, c4108r4);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3419p2, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    c2314t2 = c2314t;
                    f18 = f14;
                    f19 = 1.0f;
                    AbstractC15005f3.m43108b(c27430eM107874S2, null, modifierM3362g2, white51, c28655q, 48, 0);
                    C28655q c28655q3 = c28655q;
                    c28655q3.m87173q(false);
                    r15 = c28655q3;
                } else {
                    f18 = f14;
                    c2314t2 = c2314t;
                    f19 = 1.0f;
                    c28655q.m87150e0(623587661);
                    c28655q.m87173q(false);
                    r15 = c28655q;
                }
                i19 = a.f16527b[c4108r4.getLayoutStyle().ordinal()];
                if (i19 != 1) {
                    function4 = function3;
                    c2314t3 = c2314t2;
                    z16 = true;
                    C0209i c0209i12 = c0209i4;
                    r15.m87150e0(623726851);
                    Modifier modifierMo3400a4 = c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t3), C2299e.f9102E);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, r15, 48);
                    iHashCode2 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = r15.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(r15, modifierMo3400a4);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i12, c23010xM66775a3);
                    AbstractC28683x.m87239G(r15, r27, interfaceC28653p1M87165m7);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N7);
                    if (m12460u(c4108r4)) {
                        r15.m87150e0(-75699593);
                        i24 = 3;
                        f24 = f15;
                        m12458s(c4108r4.getTopItem(), null, c4108r4.getImage(), function4, null, null, r15, (i18 << 3) & 7168, 50);
                        AbstractC25012a.m73388u((float) 1.5d, f24, c2314t3, r15, false);
                    } else {
                        f24 = f15;
                        i24 = 3;
                        r15.m87150e0(-75384385);
                        r15.m87173q(false);
                    }
                    if (c4108r4.getTitle() != null) {
                        r15.m87150e0(-75317828);
                        String strM21274h7 = AbstractC8693b.m21274h(c4108r4.getTitle(), r15, 0);
                        ?? r214 = C38072d.f163053a;
                        ?? r215 = r15;
                        AbstractC30795n.m94707h(strM21274h7, null, r214.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(i24), 0L, 2, false, 2, 0, null, r214.m121952e(r15, 6).getSh4(), null, r215, 0, 3120, 185850);
                        ?? r117 = r215;
                        AbstractC25012a.m73388u((float) 0.25d, f24, c2314t3, r117, false);
                        r16 = r117;
                    } else {
                        r15.m87150e0(-74822913);
                        r15.m87173q(false);
                        r16 = r15;
                    }
                    String strM21274h8 = AbstractC8693b.m21274h(c4108r4.getSubtitle(), r16, 0);
                    ?? r216 = C38072d.f163053a;
                    ?? r217 = r16;
                    AbstractC30795n.m94707h(strM21274h8, null, r216.m121949b(r16, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(i24), 0L, 2, false, 2, 0, null, r216.m121952e(r16, 6).getB2(), null, r217, 0, 3120, 185850);
                    ?? r118 = r217;
                    r118.m87173q(true);
                    r118.m87173q(false);
                    r17 = r118;
                } else if (i19 != 2) {
                    function4 = function3;
                    c0209i6 = c0209i4;
                    r15.m87150e0(625400944);
                    Modifier modifierMo3400a5 = c1100b.mo3400a(AbstractC1102d.m3409f(f19, c2314t2), c2307m2);
                    C22994r1 c22994r1M53376q3 = AbstractC18489d0.m53376q(1, f15, c2306l, r15, 54);
                    iHashCode3 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = r15.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(r15, modifierMo3400a5);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i6, c22994r1M53376q3);
                    AbstractC28683x.m87239G(r15, r27, interfaceC28653p1M87165m8);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N8);
                    if (m12460u(c4108r4)) {
                        r15.m87150e0(-1759370494);
                        i25 = 0;
                        c0209i7 = c0209i6;
                        f25 = f15;
                        z16 = true;
                        c2305k = c2305k2;
                        m12458s(c4108r4.getTopItem(), null, c4108r4.getImage(), function4, null, new C39174f(m12462w(c4108r4)), r15, (i18 << 3) & 7168, 18);
                        r15.m87173q(false);
                    } else {
                        c2305k = c2305k2;
                        c0209i7 = c0209i6;
                        z16 = true;
                        f25 = f15;
                        i25 = 0;
                        r15.m87150e0(-1759057208);
                        r15.m87173q(false);
                    }
                    if (1.0f > 0.0d) {
                        r10 = z16;
                    } else {
                        r10 = i25;
                    }
                    if (r10 == 0) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, z16);
                    C23010x c23010xM73381n2 = AbstractC25012a.m73381n((float) 0.5d, f25, c2305k, r15, 6);
                    iHashCode4 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = r15.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(r15, layoutWeightElement3);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i7, c23010xM73381n2);
                    AbstractC28683x.m87239G(r15, r27, interfaceC28653p1M87165m9);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, r15, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, r15, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N9);
                    if (c4108r4.getTitle() != null) {
                        r15.m87150e0(1894633932);
                        String strM21274h9 = AbstractC8693b.m21274h(c4108r4.getTitle(), r15, i25);
                        ?? r218 = C38072d.f163053a;
                        C2886a c2886aM8414L2 = r218.m121952e(r15, 6).getSh4();
                        long brandWhite3 = r218.m121949b(r15, 6).getBrandWhite();
                        ?? r219 = r15;
                        ?? r38 = i25;
                        AbstractC30795n.m94707h(strM21274h9, null, brandWhite3, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886aM8414L2, null, r219, 0, 3120, 186362);
                        ?? r119 = r219;
                        r119.m87173q(r38);
                        r19 = r38;
                        r18 = r119;
                    } else {
                        ?? r39 = i25;
                        r15.m87150e0(1895003762);
                        r15.m87173q(r39);
                        r19 = r39;
                        r18 = r15;
                    }
                    String strM21274h10 = AbstractC8693b.m21274h(c4108r4.getSubtitle(), r18, r19);
                    ?? r310 = C38072d.f163053a;
                    ?? r2110 = r18;
                    AbstractC30795n.m94707h(strM21274h10, null, r310.m121949b(r18, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, r310.m121952e(r18, 6).getB2(), null, r2110, 0, 3120, 186362);
                    r110 = r2110;
                    r110.m87173q(z16);
                    if (c4108r4.getEndIcon() != null) {
                        AbstractC31061c.m95623C(r110, -1757970162, c2314t2, f18, r110);
                        r110.m87173q(r19);
                    } else {
                        r110.m87150e0(-1757883672);
                        r110.m87173q(r19);
                    }
                    r110.m87173q(z16);
                    r110.m87173q(r19);
                    r17 = r110;
                } else {
                    if (i19 == 3) {
                        throw AbstractC11895b.m32003v(-2058088193, r15, false);
                    }
                    r15.m87150e0(627354440);
                    Modifier modifierMo3400a6 = c1100b.mo3400a(AbstractC1102d.m3409f(f19, c2314t2), c2307m2);
                    C22994r1 c22994r1M53376q4 = AbstractC18489d0.m53376q(3, f13, c2306l, r15, 54);
                    iHashCode5 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = r15.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(r15, modifierMo3400a6);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j);
                    } else {
                        r15.m87178s0();
                    }
                    c0209i8 = c0209i4;
                    AbstractC28683x.m87239G(r15, c0209i8, c22994r1M53376q4);
                    AbstractC28683x.m87239G(r15, r27, interfaceC28653p1M87165m10);
                    if (r15.f115903S) {
                        c0209i9 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode5, r15, iHashCode5, c0209i9);
                    } else {
                        c0209i9 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode5, r15, iHashCode5, c0209i9);
                    }
                    AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N10);
                    if (m12460u(c4108r4)) {
                        r15.m87150e0(530105675);
                        z17 = true;
                        Function1 function6 = function3;
                        c0209i10 = c0209i8;
                        m12458s(c4108r4.getTopItem(), c4108r4.getLayoutStyle(), c4108r4.getImage(), function6, null, null, r15, (i18 << 3) & 7168, 48);
                        function4 = function6;
                        r15.m87173q(false);
                    } else {
                        function4 = function3;
                        c0209i10 = c0209i8;
                        z17 = true;
                        r15.m87150e0(530411273);
                        r15.m87173q(false);
                    }
                    if (f19 > 0.0d) {
                        z18 = z17;
                    } else {
                        z18 = false;
                    }
                    if (!z18) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(f19, z17);
                    if (c4108r4.getEndIcon() != null) {
                        f26 = f16;
                    } else {
                        f26 = 0 * f15;
                    }
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(layoutWeightElement4, 0.0f, 0.0f, f26, 0.0f, 11);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k2, r15, 6);
                    iHashCode6 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = r15.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(r15, modifierM3398t2);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i10, c23010xM66775a4);
                    AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m11);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode6, r15, iHashCode6, c0209i9);
                    } else {
                        AbstractC11266d.m30471y(iHashCode6, r15, iHashCode6, c0209i9);
                    }
                    AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N11);
                    if (c4108r4.getTitle() != null) {
                        r15.m87150e0(-110856978);
                        String strM21274h11 = AbstractC8693b.m21274h(c4108r4.getTitle(), r15, 0);
                        ?? r311 = C38072d.f163053a;
                        C2886a c2886aM8421b2 = r311.m121952e(r15, 6).getB2();
                        long brandWhite4 = r311.m121949b(r15, 6).getBrandWhite();
                        ?? r2111 = r15;
                        r24 = 0;
                        AbstractC30795n.m94707h(strM21274h11, null, brandWhite4, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886aM8421b2, null, r2111, 0, 3120, 186362);
                        ?? r1110 = r2111;
                        r1110.m87173q(false);
                        r111 = r1110;
                    } else {
                        r24 = 0;
                        r15.m87150e0(-110488109);
                        r15.m87173q(false);
                        r111 = r15;
                    }
                    String strM21274h12 = AbstractC8693b.m21274h(c4108r4.getSubtitle(), r111, r24);
                    ?? r312 = C38072d.f163053a;
                    ?? r2112 = r111;
                    AbstractC30795n.m94707h(strM21274h12, null, r312.m121949b(r111, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, r312.m121952e(r111, 6).getB2(), null, r2112, 0, 3120, 186362);
                    r112 = r2112;
                    r112.m87173q(z17);
                    if (c4108r4.getEndIcon() != null) {
                        AbstractC31061c.m95623C(r112, 531612399, c2314t2, f18, r112);
                        r112.m87173q(r24);
                    } else {
                        r112.m87150e0(531698889);
                        r112.m87173q(r24);
                    }
                    r112.m87173q(z17);
                    r112.m87173q(r24);
                    z16 = z17;
                    r17 = r112;
                }
                r17.m87173q(z16);
                modifier3 = modifier5;
                function2 = function4;
                r14 = r17;
            } else {
                c28655q.m87138X();
                function2 = function1;
                modifier3 = modifier2;
                r14 = c28655q;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4052j4(modifier3, c4108r4, function2, i13, i14, 1);
            }
        }
        i15 |= 384;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i27 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i28 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C3929m(21);
                    c28655q.m87172p0(objM87133R3);
                }
                function3 = (Function1) objM87133R3;
            } else {
                function3 = function1;
            }
            f13 = 4;
            f14 = f13 * f13;
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, modifier4), AbstractC33253j.m105489e(f14));
            layoutStyle = c4108r4.getLayoutStyle();
            enumC4073m4 = EnumC4073m4.LIST;
            if (layoutStyle == enumC4073m4) {
                c28655q.m87150e0(991431706);
                long transparent2 = C38072d.f163053a.m121949b(c28655q, 6).getTransparent();
                c28655q.m87173q(false);
                jM95628d = transparent2;
            } else {
                c28655q.m87150e0(991432822);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            }
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM118994r2, jM95628d, AbstractC17918w0.f69621a);
            f15 = 8;
            f16 = 2 * f15;
            if (c4108r4.getLayoutStyle() == enumC4073m4) {
                f17 = 1 * f15;
            } else {
                f17 = f16;
            }
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(modifierM3358c2, f17, f16);
            i16 = i15 & 112;
            if (i16 != 32) {
                z13 = true;
            } else {
                z13 = true;
            }
            Modifier modifier6 = modifier4;
            i17 = i15 & 896;
            i18 = i15;
            if (i17 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | z13;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C4059k4(c4108r4, function3);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C4059k4(c4108r4, function3);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM5391i2 = AbstractC1772c1.m5391i(modifierM3395q2, false, null, (InterfaceC4339a) objM87133R, 3);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9106I, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM5391i2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m12);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                c0209i4 = c0209i;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N12);
                endIcon = c4108r4.getEndIcon();
                c1100b = C1100b.f4583a;
                if (endIcon != null) {
                    c28655q.m87150e0(622828471);
                    i26 = a.f16527b[c4108r4.getLayoutStyle().ordinal()];
                    if (i26 == 1) {
                        if (i26 == 2) {
                        }
                        c2307m = c2307m3;
                    } else {
                        c2307m = C2299e.f9116y;
                    }
                    C27430e c27430eM107874S3 = AbstractC34132o.m107874S(c4108r4.getEndIcon().toWhoopIcon(), c28655q, 6);
                    long white52 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                    Modifier modifierM3419p3 = AbstractC1102d.m3419p(f14, c1100b.mo3400a(c2314t, c2307m));
                    if (i17 == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (i16 != 32) {
                        z24 = true;
                    } else {
                        z24 = true;
                    }
                    z25 = z19 | z24;
                    objM87133R2 = c28655q.m87133R();
                    if (z25) {
                        objM87133R2 = new C4059k4(function3, c4108r4);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C4059k4(function3, c4108r4);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Modifier modifierM3362g3 = AbstractC1092a.m3362g(modifierM3419p3, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                    c2314t2 = c2314t;
                    f18 = f14;
                    f19 = 1.0f;
                    AbstractC15005f3.m43108b(c27430eM107874S3, null, modifierM3362g3, white52, c28655q, 48, 0);
                    C28655q c28655q4 = c28655q;
                    c28655q4.m87173q(false);
                    r15 = c28655q4;
                } else {
                    f18 = f14;
                    c2314t2 = c2314t;
                    f19 = 1.0f;
                    c28655q.m87150e0(623587661);
                    c28655q.m87173q(false);
                    r15 = c28655q;
                }
                i19 = a.f16527b[c4108r4.getLayoutStyle().ordinal()];
                if (i19 != 1) {
                    function4 = function3;
                    c2314t3 = c2314t2;
                    z16 = true;
                    C0209i c0209i13 = c0209i4;
                    r15.m87150e0(623726851);
                    Modifier modifierMo3400a7 = c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t3), C2299e.f9102E);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, r15, 48);
                    iHashCode2 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = r15.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(r15, modifierMo3400a7);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i13, c23010xM66775a5);
                    AbstractC28683x.m87239G(r15, r27, interfaceC28653p1M87165m13);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N13);
                    if (m12460u(c4108r4)) {
                        r15.m87150e0(-75699593);
                        i24 = 3;
                        f24 = f15;
                        m12458s(c4108r4.getTopItem(), null, c4108r4.getImage(), function4, null, null, r15, (i18 << 3) & 7168, 50);
                        AbstractC25012a.m73388u((float) 1.5d, f24, c2314t3, r15, false);
                    } else {
                        f24 = f15;
                        i24 = 3;
                        r15.m87150e0(-75384385);
                        r15.m87173q(false);
                    }
                    if (c4108r4.getTitle() != null) {
                        r15.m87150e0(-75317828);
                        String strM21274h13 = AbstractC8693b.m21274h(c4108r4.getTitle(), r15, 0);
                        ?? r2113 = C38072d.f163053a;
                        ?? r2114 = r15;
                        AbstractC30795n.m94707h(strM21274h13, null, r2113.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(i24), 0L, 2, false, 2, 0, null, r2113.m121952e(r15, 6).getSh4(), null, r2114, 0, 3120, 185850);
                        ?? r1111 = r2114;
                        AbstractC25012a.m73388u((float) 0.25d, f24, c2314t3, r1111, false);
                        r16 = r1111;
                    } else {
                        r15.m87150e0(-74822913);
                        r15.m87173q(false);
                        r16 = r15;
                    }
                    String strM21274h14 = AbstractC8693b.m21274h(c4108r4.getSubtitle(), r16, 0);
                    ?? r2115 = C38072d.f163053a;
                    ?? r2116 = r16;
                    AbstractC30795n.m94707h(strM21274h14, null, r2115.m121949b(r16, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(i24), 0L, 2, false, 2, 0, null, r2115.m121952e(r16, 6).getB2(), null, r2116, 0, 3120, 185850);
                    ?? r1112 = r2116;
                    r1112.m87173q(true);
                    r1112.m87173q(false);
                    r17 = r1112;
                } else if (i19 != 2) {
                    function4 = function3;
                    c0209i6 = c0209i4;
                    r15.m87150e0(625400944);
                    Modifier modifierMo3400a8 = c1100b.mo3400a(AbstractC1102d.m3409f(f19, c2314t2), c2307m2);
                    C22994r1 c22994r1M53376q5 = AbstractC18489d0.m53376q(1, f15, c2306l, r15, 54);
                    iHashCode3 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = r15.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(r15, modifierMo3400a8);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i6, c22994r1M53376q5);
                    AbstractC28683x.m87239G(r15, r27, interfaceC28653p1M87165m14);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N14);
                    if (m12460u(c4108r4)) {
                        r15.m87150e0(-1759370494);
                        i25 = 0;
                        c0209i7 = c0209i6;
                        f25 = f15;
                        z16 = true;
                        c2305k = c2305k2;
                        m12458s(c4108r4.getTopItem(), null, c4108r4.getImage(), function4, null, new C39174f(m12462w(c4108r4)), r15, (i18 << 3) & 7168, 18);
                        r15.m87173q(false);
                    } else {
                        c2305k = c2305k2;
                        c0209i7 = c0209i6;
                        z16 = true;
                        f25 = f15;
                        i25 = 0;
                        r15.m87150e0(-1759057208);
                        r15.m87173q(false);
                    }
                    if (1.0f > 0.0d) {
                        r10 = z16;
                    } else {
                        r10 = i25;
                    }
                    if (r10 == 0) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f, z16);
                    C23010x c23010xM73381n3 = AbstractC25012a.m73381n((float) 0.5d, f25, c2305k, r15, 6);
                    iHashCode4 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = r15.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(r15, layoutWeightElement5);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i7, c23010xM73381n3);
                    AbstractC28683x.m87239G(r15, r27, interfaceC28653p1M87165m15);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, r15, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, r15, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N15);
                    if (c4108r4.getTitle() != null) {
                        r15.m87150e0(1894633932);
                        String strM21274h15 = AbstractC8693b.m21274h(c4108r4.getTitle(), r15, i25);
                        ?? r2117 = C38072d.f163053a;
                        C2886a c2886aM8414L3 = r2117.m121952e(r15, 6).getSh4();
                        long brandWhite5 = r2117.m121949b(r15, 6).getBrandWhite();
                        ?? r2118 = r15;
                        ?? r313 = i25;
                        AbstractC30795n.m94707h(strM21274h15, null, brandWhite5, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886aM8414L3, null, r2118, 0, 3120, 186362);
                        ?? r1113 = r2118;
                        r1113.m87173q(r313);
                        r19 = r313;
                        r18 = r1113;
                    } else {
                        ?? r314 = i25;
                        r15.m87150e0(1895003762);
                        r15.m87173q(r314);
                        r19 = r314;
                        r18 = r15;
                    }
                    String strM21274h16 = AbstractC8693b.m21274h(c4108r4.getSubtitle(), r18, r19);
                    ?? r315 = C38072d.f163053a;
                    ?? r2119 = r18;
                    AbstractC30795n.m94707h(strM21274h16, null, r315.m121949b(r18, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, r315.m121952e(r18, 6).getB2(), null, r2119, 0, 3120, 186362);
                    r110 = r2119;
                    r110.m87173q(z16);
                    if (c4108r4.getEndIcon() != null) {
                        AbstractC31061c.m95623C(r110, -1757970162, c2314t2, f18, r110);
                        r110.m87173q(r19);
                    } else {
                        r110.m87150e0(-1757883672);
                        r110.m87173q(r19);
                    }
                    r110.m87173q(z16);
                    r110.m87173q(r19);
                    r17 = r110;
                } else {
                    if (i19 == 3) {
                        throw AbstractC11895b.m32003v(-2058088193, r15, false);
                    }
                    r15.m87150e0(627354440);
                    Modifier modifierMo3400a9 = c1100b.mo3400a(AbstractC1102d.m3409f(f19, c2314t2), c2307m2);
                    C22994r1 c22994r1M53376q6 = AbstractC18489d0.m53376q(3, f13, c2306l, r15, 54);
                    iHashCode5 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = r15.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(r15, modifierMo3400a9);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j);
                    } else {
                        r15.m87178s0();
                    }
                    c0209i8 = c0209i4;
                    AbstractC28683x.m87239G(r15, c0209i8, c22994r1M53376q6);
                    AbstractC28683x.m87239G(r15, r27, interfaceC28653p1M87165m16);
                    if (r15.f115903S) {
                        c0209i9 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode5, r15, iHashCode5, c0209i9);
                    } else {
                        c0209i9 = c0209i3;
                        AbstractC11266d.m30471y(iHashCode5, r15, iHashCode5, c0209i9);
                    }
                    AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N16);
                    if (m12460u(c4108r4)) {
                        r15.m87150e0(530105675);
                        z17 = true;
                        Function1 function7 = function3;
                        c0209i10 = c0209i8;
                        m12458s(c4108r4.getTopItem(), c4108r4.getLayoutStyle(), c4108r4.getImage(), function7, null, null, r15, (i18 << 3) & 7168, 48);
                        function4 = function7;
                        r15.m87173q(false);
                    } else {
                        function4 = function3;
                        c0209i10 = c0209i8;
                        z17 = true;
                        r15.m87150e0(530411273);
                        r15.m87173q(false);
                    }
                    if (f19 > 0.0d) {
                        z18 = z17;
                    } else {
                        z18 = false;
                    }
                    if (!z18) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(f19, z17);
                    if (c4108r4.getEndIcon() != null) {
                        f26 = f16;
                    } else {
                        f26 = 0 * f15;
                    }
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(layoutWeightElement6, 0.0f, 0.0f, f26, 0.0f, 11);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k2, r15, 6);
                    iHashCode6 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = r15.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(r15, modifierM3398t3);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i10, c23010xM66775a6);
                    AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m17);
                    if (r15.f115903S) {
                        AbstractC11266d.m30471y(iHashCode6, r15, iHashCode6, c0209i9);
                    } else {
                        AbstractC11266d.m30471y(iHashCode6, r15, iHashCode6, c0209i9);
                    }
                    AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N17);
                    if (c4108r4.getTitle() != null) {
                        r15.m87150e0(-110856978);
                        String strM21274h17 = AbstractC8693b.m21274h(c4108r4.getTitle(), r15, 0);
                        ?? r316 = C38072d.f163053a;
                        C2886a c2886aM8421b3 = r316.m121952e(r15, 6).getB2();
                        long brandWhite6 = r316.m121949b(r15, 6).getBrandWhite();
                        ?? r21110 = r15;
                        r24 = 0;
                        AbstractC30795n.m94707h(strM21274h17, null, brandWhite6, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886aM8421b3, null, r21110, 0, 3120, 186362);
                        ?? r1114 = r21110;
                        r1114.m87173q(false);
                        r111 = r1114;
                    } else {
                        r24 = 0;
                        r15.m87150e0(-110488109);
                        r15.m87173q(false);
                        r111 = r15;
                    }
                    String strM21274h18 = AbstractC8693b.m21274h(c4108r4.getSubtitle(), r111, r24);
                    ?? r317 = C38072d.f163053a;
                    ?? r21111 = r111;
                    AbstractC30795n.m94707h(strM21274h18, null, r317.m121949b(r111, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, r317.m121952e(r111, 6).getB2(), null, r21111, 0, 3120, 186362);
                    r112 = r21111;
                    r112.m87173q(z17);
                    if (c4108r4.getEndIcon() != null) {
                        AbstractC31061c.m95623C(r112, 531612399, c2314t2, f18, r112);
                        r112.m87173q(r24);
                    } else {
                        r112.m87150e0(531698889);
                        r112.m87173q(r24);
                    }
                    r112.m87173q(z17);
                    r112.m87173q(r24);
                    z16 = z17;
                    r17 = r112;
                }
                r17.m87173q(z16);
                modifier3 = modifier6;
                function2 = function4;
                r14 = r17;
            } else {
                c0209i4 = c0209i;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N12);
            endIcon = c4108r4.getEndIcon();
            c1100b = C1100b.f4583a;
            if (endIcon != null) {
                c28655q.m87150e0(622828471);
                i26 = a.f16527b[c4108r4.getLayoutStyle().ordinal()];
                if (i26 == 1) {
                    if (i26 == 2) {
                    }
                    c2307m = c2307m3;
                } else {
                    c2307m = C2299e.f9116y;
                }
                C27430e c27430eM107874S4 = AbstractC34132o.m107874S(c4108r4.getEndIcon().toWhoopIcon(), c28655q, 6);
                long white53 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                Modifier modifierM3419p4 = AbstractC1102d.m3419p(f14, c1100b.mo3400a(c2314t, c2307m));
                if (i17 == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (i16 != 32) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                z25 = z19 | z24;
                objM87133R2 = c28655q.m87133R();
                if (z25) {
                    objM87133R2 = new C4059k4(function3, c4108r4);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C4059k4(function3, c4108r4);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM3362g4 = AbstractC1092a.m3362g(modifierM3419p4, false, null, null, (InterfaceC4339a) objM87133R2, 15);
                c2314t2 = c2314t;
                f18 = f14;
                f19 = 1.0f;
                AbstractC15005f3.m43108b(c27430eM107874S4, null, modifierM3362g4, white53, c28655q, 48, 0);
                C28655q c28655q5 = c28655q;
                c28655q5.m87173q(false);
                r15 = c28655q5;
            } else {
                f18 = f14;
                c2314t2 = c2314t;
                f19 = 1.0f;
                c28655q.m87150e0(623587661);
                c28655q.m87173q(false);
                r15 = c28655q;
            }
            i19 = a.f16527b[c4108r4.getLayoutStyle().ordinal()];
            if (i19 != 1) {
                function4 = function3;
                c2314t3 = c2314t2;
                z16 = true;
                C0209i c0209i14 = c0209i4;
                r15.m87150e0(623726851);
                Modifier modifierMo3400a10 = c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, c2314t3), C2299e.f9102E);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, r15, 48);
                iHashCode2 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = r15.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(r15, modifierMo3400a10);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i14, c23010xM66775a7);
                AbstractC28683x.m87239G(r15, r27, interfaceC28653p1M87165m18);
                if (r15.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N18);
                if (m12460u(c4108r4)) {
                    r15.m87150e0(-75699593);
                    i24 = 3;
                    f24 = f15;
                    m12458s(c4108r4.getTopItem(), null, c4108r4.getImage(), function4, null, null, r15, (i18 << 3) & 7168, 50);
                    AbstractC25012a.m73388u((float) 1.5d, f24, c2314t3, r15, false);
                } else {
                    f24 = f15;
                    i24 = 3;
                    r15.m87150e0(-75384385);
                    r15.m87173q(false);
                }
                if (c4108r4.getTitle() != null) {
                    r15.m87150e0(-75317828);
                    String strM21274h19 = AbstractC8693b.m21274h(c4108r4.getTitle(), r15, 0);
                    ?? r21112 = C38072d.f163053a;
                    ?? r21113 = r15;
                    AbstractC30795n.m94707h(strM21274h19, null, r21112.m121949b(r15, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(i24), 0L, 2, false, 2, 0, null, r21112.m121952e(r15, 6).getSh4(), null, r21113, 0, 3120, 185850);
                    ?? r1115 = r21113;
                    AbstractC25012a.m73388u((float) 0.25d, f24, c2314t3, r1115, false);
                    r16 = r1115;
                } else {
                    r15.m87150e0(-74822913);
                    r15.m87173q(false);
                    r16 = r15;
                }
                String strM21274h110 = AbstractC8693b.m21274h(c4108r4.getSubtitle(), r16, 0);
                ?? r21114 = C38072d.f163053a;
                ?? r21115 = r16;
                AbstractC30795n.m94707h(strM21274h110, null, r21114.m121949b(r16, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(i24), 0L, 2, false, 2, 0, null, r21114.m121952e(r16, 6).getB2(), null, r21115, 0, 3120, 185850);
                ?? r1116 = r21115;
                r1116.m87173q(true);
                r1116.m87173q(false);
                r17 = r1116;
            } else if (i19 != 2) {
                function4 = function3;
                c0209i6 = c0209i4;
                r15.m87150e0(625400944);
                Modifier modifierMo3400a11 = c1100b.mo3400a(AbstractC1102d.m3409f(f19, c2314t2), c2307m2);
                C22994r1 c22994r1M53376q7 = AbstractC18489d0.m53376q(1, f15, c2306l, r15, 54);
                iHashCode3 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = r15.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(r15, modifierMo3400a11);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i6, c22994r1M53376q7);
                AbstractC28683x.m87239G(r15, r27, interfaceC28653p1M87165m19);
                if (r15.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, r15, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N19);
                if (m12460u(c4108r4)) {
                    r15.m87150e0(-1759370494);
                    i25 = 0;
                    c0209i7 = c0209i6;
                    f25 = f15;
                    z16 = true;
                    c2305k = c2305k2;
                    m12458s(c4108r4.getTopItem(), null, c4108r4.getImage(), function4, null, new C39174f(m12462w(c4108r4)), r15, (i18 << 3) & 7168, 18);
                    r15.m87173q(false);
                } else {
                    c2305k = c2305k2;
                    c0209i7 = c0209i6;
                    z16 = true;
                    f25 = f15;
                    i25 = 0;
                    r15.m87150e0(-1759057208);
                    r15.m87173q(false);
                }
                if (1.0f > 0.0d) {
                    r10 = z16;
                } else {
                    r10 = i25;
                }
                if (r10 == 0) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(1.0f, z16);
                C23010x c23010xM73381n4 = AbstractC25012a.m73381n((float) 0.5d, f25, c2305k, r15, 6);
                iHashCode4 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = r15.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(r15, layoutWeightElement7);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i7, c23010xM73381n4);
                AbstractC28683x.m87239G(r15, r27, interfaceC28653p1M87165m110);
                if (r15.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, r15, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, r15, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N110);
                if (c4108r4.getTitle() != null) {
                    r15.m87150e0(1894633932);
                    String strM21274h111 = AbstractC8693b.m21274h(c4108r4.getTitle(), r15, i25);
                    ?? r21116 = C38072d.f163053a;
                    C2886a c2886aM8414L4 = r21116.m121952e(r15, 6).getSh4();
                    long brandWhite7 = r21116.m121949b(r15, 6).getBrandWhite();
                    ?? r21117 = r15;
                    ?? r318 = i25;
                    AbstractC30795n.m94707h(strM21274h111, null, brandWhite7, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886aM8414L4, null, r21117, 0, 3120, 186362);
                    ?? r1117 = r21117;
                    r1117.m87173q(r318);
                    r19 = r318;
                    r18 = r1117;
                } else {
                    ?? r319 = i25;
                    r15.m87150e0(1895003762);
                    r15.m87173q(r319);
                    r19 = r319;
                    r18 = r15;
                }
                String strM21274h112 = AbstractC8693b.m21274h(c4108r4.getSubtitle(), r18, r19);
                ?? r3110 = C38072d.f163053a;
                ?? r21118 = r18;
                AbstractC30795n.m94707h(strM21274h112, null, r3110.m121949b(r18, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, r3110.m121952e(r18, 6).getB2(), null, r21118, 0, 3120, 186362);
                r110 = r21118;
                r110.m87173q(z16);
                if (c4108r4.getEndIcon() != null) {
                    AbstractC31061c.m95623C(r110, -1757970162, c2314t2, f18, r110);
                    r110.m87173q(r19);
                } else {
                    r110.m87150e0(-1757883672);
                    r110.m87173q(r19);
                }
                r110.m87173q(z16);
                r110.m87173q(r19);
                r17 = r110;
            } else {
                if (i19 == 3) {
                    throw AbstractC11895b.m32003v(-2058088193, r15, false);
                }
                r15.m87150e0(627354440);
                Modifier modifierMo3400a12 = c1100b.mo3400a(AbstractC1102d.m3409f(f19, c2314t2), c2307m2);
                C22994r1 c22994r1M53376q8 = AbstractC18489d0.m53376q(3, f13, c2306l, r15, 54);
                iHashCode5 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = r15.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(r15, modifierMo3400a12);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j);
                } else {
                    r15.m87178s0();
                }
                c0209i8 = c0209i4;
                AbstractC28683x.m87239G(r15, c0209i8, c22994r1M53376q8);
                AbstractC28683x.m87239G(r15, r27, interfaceC28653p1M87165m111);
                if (r15.f115903S) {
                    c0209i9 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode5, r15, iHashCode5, c0209i9);
                } else {
                    c0209i9 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode5, r15, iHashCode5, c0209i9);
                }
                AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N111);
                if (m12460u(c4108r4)) {
                    r15.m87150e0(530105675);
                    z17 = true;
                    Function1 function8 = function3;
                    c0209i10 = c0209i8;
                    m12458s(c4108r4.getTopItem(), c4108r4.getLayoutStyle(), c4108r4.getImage(), function8, null, null, r15, (i18 << 3) & 7168, 48);
                    function4 = function8;
                    r15.m87173q(false);
                } else {
                    function4 = function3;
                    c0209i10 = c0209i8;
                    z17 = true;
                    r15.m87150e0(530411273);
                    r15.m87173q(false);
                }
                if (f19 > 0.0d) {
                    z18 = z17;
                } else {
                    z18 = false;
                }
                if (!z18) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(f19, z17);
                if (c4108r4.getEndIcon() != null) {
                    f26 = f16;
                } else {
                    f26 = 0 * f15;
                }
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(layoutWeightElement8, 0.0f, 0.0f, f26, 0.0f, 11);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k2, r15, 6);
                iHashCode6 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m112 = r15.m87165m();
                Modifier modifierM118962N112 = AbstractC37056f.m118962N(r15, modifierM3398t4);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i10, c23010xM66775a8);
                AbstractC28683x.m87239G(r15, c0209i2, interfaceC28653p1M87165m112);
                if (r15.f115903S) {
                    AbstractC11266d.m30471y(iHashCode6, r15, iHashCode6, c0209i9);
                } else {
                    AbstractC11266d.m30471y(iHashCode6, r15, iHashCode6, c0209i9);
                }
                AbstractC28683x.m87239G(r15, c0209i5, modifierM118962N112);
                if (c4108r4.getTitle() != null) {
                    r15.m87150e0(-110856978);
                    String strM21274h113 = AbstractC8693b.m21274h(c4108r4.getTitle(), r15, 0);
                    ?? r3111 = C38072d.f163053a;
                    C2886a c2886aM8421b4 = r3111.m121952e(r15, 6).getB2();
                    long brandWhite8 = r3111.m121949b(r15, 6).getBrandWhite();
                    ?? r21119 = r15;
                    r24 = 0;
                    AbstractC30795n.m94707h(strM21274h113, null, brandWhite8, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886aM8421b4, null, r21119, 0, 3120, 186362);
                    ?? r1118 = r21119;
                    r1118.m87173q(false);
                    r111 = r1118;
                } else {
                    r24 = 0;
                    r15.m87150e0(-110488109);
                    r15.m87173q(false);
                    r111 = r15;
                }
                String strM21274h114 = AbstractC8693b.m21274h(c4108r4.getSubtitle(), r111, r24);
                ?? r3112 = C38072d.f163053a;
                ?? r211110 = r111;
                AbstractC30795n.m94707h(strM21274h114, null, r3112.m121949b(r111, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, r3112.m121952e(r111, 6).getB2(), null, r211110, 0, 3120, 186362);
                r112 = r211110;
                r112.m87173q(z17);
                if (c4108r4.getEndIcon() != null) {
                    AbstractC31061c.m95623C(r112, 531612399, c2314t2, f18, r112);
                    r112.m87173q(r24);
                } else {
                    r112.m87150e0(531698889);
                    r112.m87173q(r24);
                }
                r112.m87173q(z17);
                r112.m87173q(r24);
                z16 = z17;
                r17 = r112;
            }
            r17.m87173q(z16);
            modifier3 = modifier6;
            function2 = function4;
            r14 = r17;
        } else {
            c28655q.m87138X();
            function2 = function1;
            modifier3 = modifier2;
            r14 = c28655q;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4052j4(modifier3, c4108r4, function2, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m12451l(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m12452m(C4108r4 c4108r4, Function1 function1) {
        Object interaction = c4108r4.getInteraction();
        if (interaction == null) {
            interaction = c4108r4.getDestination();
        }
        if (interaction != null) {
            function1.invoke(interaction);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m12453n(Function1 function1, C4108r4 c4108r4) {
        function1.invoke(new AbstractC4101q4.a(c4108r4.getId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m12454o(Modifier modifier, C4108r4 c4108r4, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m12450k(modifier, c4108r4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    public static final void m12455p(Modifier modifier, C4108r4 viewState, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        Modifier modifier2;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1781816416);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifier3 = modifier;
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C3929m(20);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            int i18 = a.f16527b[viewState.getLayoutStyle().ordinal()];
            if (i18 == 1) {
                function3 = function1;
                c28655q.m87150e0(592258669);
                m12450k(modifier3, viewState, function3, c28655q, i15 & 1022, 0);
                c28655q.m87173q(false);
            } else if (i18 == 2) {
                function3 = function1;
                c28655q.m87150e0(592484845);
                m12450k(modifier3, viewState, function3, c28655q, i15 & 1022, 0);
                c28655q.m87173q(false);
            } else {
                if (i18 != 3) {
                    throw AbstractC11895b.m32003v(-1366370099, c28655q, false);
                }
                c28655q.m87150e0(592709037);
                function3 = function1;
                m12450k(modifier3, viewState, function3, c28655q, i15 & 1022, 0);
                c28655q.m87173q(false);
            }
            modifier2 = modifier3;
            function2 = function3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4052j4(modifier2, viewState, function2, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m12456q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m12457r(Modifier modifier, C4108r4 c4108r4, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m12455p(modifier, c4108r4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012d  */
    /* JADX WARN: Code duplicated, block: B:102:0x013b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0145  */
    /* JADX WARN: Code duplicated, block: B:107:0x014f  */
    /* JADX WARN: Code duplicated, block: B:109:0x017f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0198  */
    /* JADX WARN: Code duplicated, block: B:112:0x01db  */
    /* JADX WARN: Code duplicated, block: B:114:0x0208  */
    /* JADX WARN: Code duplicated, block: B:115:0x020c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0219  */
    /* JADX WARN: Code duplicated, block: B:120:0x0227  */
    /* JADX WARN: Code duplicated, block: B:123:0x0245  */
    /* JADX WARN: Code duplicated, block: B:125:0x024b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0261  */
    /* JADX WARN: Code duplicated, block: B:128:0x0272  */
    /* JADX WARN: Code duplicated, block: B:131:0x027f  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x011a  */
    /* JADX INFO: renamed from: s */
    private static final void m12458s(InterfaceC25312u interfaceC25312u, EnumC4073m4 enumC4073m4, AbstractC22403o abstractC22403o, Function1 function1, Modifier modifier, C39174f c39174f, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        C39174f c39174f2;
        int i17;
        boolean z4;
        EnumC4073m4 enumC4073m5;
        Modifier modifier3;
        C39174f c39174f3;
        C28677v1 c28677v1M87180u;
        EnumC4073m4 enumC4073m6;
        C2314t c2314t;
        Modifier modifier4;
        C39174f c39174f4;
        EnumC4073m4 enumC4073m7;
        float f13;
        float f14;
        float f15;
        float f16;
        C2307m c2307m;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        boolean z13;
        int iHashCode2;
        boolean z14;
        C4238o text;
        C4238o c4238oM13215b;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1981108882);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(interfaceC25312u) : c28655q.m87157i(interfaceC25312u) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC4073m4 == null ? -1 : enumC4073m4.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(abstractC22403o) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i19 = i14 & 16;
        if (i19 == 0) {
            if ((i13 & 24576) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((196608 & i13) == 0) {
                    c39174f2 = c39174f;
                    if (c28655q.m87153g(c39174f2)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
                if ((74899 & i15) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i18 != 0) {
                        enumC4073m6 = null;
                    } else {
                        enumC4073m6 = enumC4073m4;
                    }
                    c2314t = C2314t.f9131w;
                    if (i19 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        c39174f4 = null;
                    } else {
                        c39174f4 = c39174f2;
                    }
                    enumC4073m7 = EnumC4073m4.LIST;
                    if (enumC4073m6 == enumC4073m7) {
                        f13 = 8;
                    } else {
                        f13 = 20;
                    }
                    f14 = f13 * 4;
                    if (c39174f4 != null) {
                        f16 = c39174f4.f168413w;
                    } else {
                        if (enumC4073m6 == enumC4073m7) {
                            f15 = 8;
                        } else {
                            f15 = 18;
                        }
                        f16 = f15 * 4;
                    }
                    if (interfaceC25312u == null && c39174f4 != null) {
                        f14 = c39174f4.f168413w;
                    }
                    Modifier modifierM3419p = AbstractC1102d.m3419p(f14, modifier4);
                    c2307m = C2299e.f9102E;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    EnumC4073m4 enumC4073m8 = enumC4073m6;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3419p);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    if (interfaceC25312u != null) {
                        c28655q.m87150e0(200969021);
                        if (interfaceC25312u instanceof C4242s) {
                            c28655q.m87150e0(201029719);
                            float f17 = 4;
                            Modifier modifierM3383e = AbstractC1099a.m3383e(c2314t, ((float) (-2.5d)) * f17, (-2) * f17);
                            Modifier modifierM34565N = AbstractC12350b.m34565N(1.4f, c2314t);
                            Modifier modifierM3383e2 = AbstractC1099a.m3383e(c2314t, ((float) 2.5d) * f17, ((float) 7.5d) * f17);
                            C4242s c4242s = (C4242s) interfaceC25312u;
                            text = c4242s.getText();
                            if (text != null) {
                                c4238oM13215b = C4238o.m13215b(text, null, "", null, null, null, EnumC2888c.N5, false, 29, null);
                            } else {
                                c4238oM13215b = null;
                            }
                            z13 = true;
                            AbstractC4234k.m13178q(modifierM3383e, modifierM3383e2, null, modifierM34565N, AbstractC34132o.m107879c(0.0f, c2314t), null, c4242s.m13236b((8191 & 1) != 0 ? c4242s.radius : 0.0f, (8191 & 2) != 0 ? c4242s.padding : 0.0f, (8191 & 4) != 0 ? c4242s.gradientPadding : 0.0f, (8191 & 8) != 0 ? c4242s.paceOfAgingAnimationScore : 0.0d, (8191 & 16) != 0 ? c4242s.yearsDifferenceAnimationScore : 0.0d, (8191 & 32) != 0 ? c4242s.colors : null, (8191 & 64) != 0 ? c4242s.centerShadowBrush : null, (8191 & 128) != 0 ? c4242s.outline : null, (8191 & 256) != 0 ? c4242s.usingPrimitiveEdgeFade : false, (8191 & 512) != 0 ? c4242s.edgeFade : null, (8191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c4242s.primitiveEdgeFade : null, (8191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c4242s.particles : null, (8191 & 4096) != 0 ? c4242s.transition : null, (8191 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c4242s.text : c4238oM13215b), c28655q, 27696, 36);
                            c28655q.m87173q(false);
                            z14 = false;
                            c28655q = c28655q;
                        } else {
                            z13 = true;
                            c28655q.m87150e0(201856551);
                            Modifier modifierM3419p2 = AbstractC1102d.m3419p(18 * 4, modifier4);
                            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3419p2);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                            z14 = false;
                            AbstractC25303l.m74291r(interfaceC25312u, null, null, function1, c28655q, i15 & 7182, 6);
                            c28655q = c28655q;
                            c28655q.m87173q(true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z14);
                    } else {
                        modifier4 = modifier4;
                        c39174f4 = c39174f4;
                        z13 = true;
                        if (abstractC22403o != null) {
                            c28655q.m87150e0(202265720);
                            m12448i(abstractC22403o, f16, null, c28655q, (i15 >> 6) & 14, 4);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(202390650);
                            c28655q.m87173q(false);
                        }
                    }
                    c28655q.m87173q(z13);
                    c39174f3 = c39174f4;
                    modifier3 = modifier4;
                    enumC4073m5 = enumC4073m8;
                } else {
                    c28655q.m87138X();
                    enumC4073m5 = enumC4073m4;
                    modifier3 = modifier2;
                    c39174f3 = c39174f2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2165f(interfaceC25312u, enumC4073m5, abstractC22403o, function1, modifier3, c39174f3, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            c39174f2 = c39174f;
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    enumC4073m6 = null;
                } else {
                    enumC4073m6 = enumC4073m4;
                }
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    c39174f4 = null;
                } else {
                    c39174f4 = c39174f2;
                }
                enumC4073m7 = EnumC4073m4.LIST;
                if (enumC4073m6 == enumC4073m7) {
                    f13 = 8;
                } else {
                    f13 = 20;
                }
                f14 = f13 * 4;
                if (c39174f4 != null) {
                    f16 = c39174f4.f168413w;
                } else {
                    if (enumC4073m6 == enumC4073m7) {
                        f15 = 8;
                    } else {
                        f15 = 18;
                    }
                    f16 = f15 * 4;
                }
                if (interfaceC25312u == null) {
                    f14 = c39174f4.f168413w;
                }
                Modifier modifierM3419p3 = AbstractC1102d.m3419p(f14, modifier4);
                c2307m = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                EnumC4073m4 enumC4073m9 = enumC4073m6;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3419p3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                if (interfaceC25312u != null) {
                    c28655q.m87150e0(200969021);
                    if (interfaceC25312u instanceof C4242s) {
                        c28655q.m87150e0(201029719);
                        float f18 = 4;
                        Modifier modifierM3383e3 = AbstractC1099a.m3383e(c2314t, ((float) (-2.5d)) * f18, (-2) * f18);
                        Modifier modifierM34565N2 = AbstractC12350b.m34565N(1.4f, c2314t);
                        Modifier modifierM3383e4 = AbstractC1099a.m3383e(c2314t, ((float) 2.5d) * f18, ((float) 7.5d) * f18);
                        C4242s c4242s2 = (C4242s) interfaceC25312u;
                        text = c4242s2.getText();
                        if (text != null) {
                            c4238oM13215b = C4238o.m13215b(text, null, "", null, null, null, EnumC2888c.N5, false, 29, null);
                        } else {
                            c4238oM13215b = null;
                        }
                        z13 = true;
                        AbstractC4234k.m13178q(modifierM3383e3, modifierM3383e4, null, modifierM34565N2, AbstractC34132o.m107879c(0.0f, c2314t), null, c4242s2.m13236b((8191 & 1) != 0 ? c4242s2.radius : 0.0f, (8191 & 2) != 0 ? c4242s2.padding : 0.0f, (8191 & 4) != 0 ? c4242s2.gradientPadding : 0.0f, (8191 & 8) != 0 ? c4242s2.paceOfAgingAnimationScore : 0.0d, (8191 & 16) != 0 ? c4242s2.yearsDifferenceAnimationScore : 0.0d, (8191 & 32) != 0 ? c4242s2.colors : null, (8191 & 64) != 0 ? c4242s2.centerShadowBrush : null, (8191 & 128) != 0 ? c4242s2.outline : null, (8191 & 256) != 0 ? c4242s2.usingPrimitiveEdgeFade : false, (8191 & 512) != 0 ? c4242s2.edgeFade : null, (8191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c4242s2.primitiveEdgeFade : null, (8191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c4242s2.particles : null, (8191 & 4096) != 0 ? c4242s2.transition : null, (8191 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c4242s2.text : c4238oM13215b), c28655q, 27696, 36);
                        c28655q.m87173q(false);
                        z14 = false;
                        c28655q = c28655q;
                    } else {
                        z13 = true;
                        c28655q.m87150e0(201856551);
                        Modifier modifierM3419p4 = AbstractC1102d.m3419p(18 * 4, modifier4);
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3419p4);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                        z14 = false;
                        AbstractC25303l.m74291r(interfaceC25312u, null, null, function1, c28655q, i15 & 7182, 6);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z14);
                } else {
                    modifier4 = modifier4;
                    c39174f4 = c39174f4;
                    z13 = true;
                    if (abstractC22403o != null) {
                        c28655q.m87150e0(202265720);
                        m12448i(abstractC22403o, f16, null, c28655q, (i15 >> 6) & 14, 4);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(202390650);
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(z13);
                c39174f3 = c39174f4;
                modifier3 = modifier4;
                enumC4073m5 = enumC4073m9;
            } else {
                c28655q.m87138X();
                enumC4073m5 = enumC4073m4;
                modifier3 = modifier2;
                c39174f3 = c39174f2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(interfaceC25312u, enumC4073m5, abstractC22403o, function1, modifier3, c39174f3, i13, i14);
            }
        }
        i15 |= 24576;
        modifier2 = modifier;
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((196608 & i13) == 0) {
                c39174f2 = c39174f;
                if (c28655q.m87153g(c39174f2)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    enumC4073m6 = null;
                } else {
                    enumC4073m6 = enumC4073m4;
                }
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    c39174f4 = null;
                } else {
                    c39174f4 = c39174f2;
                }
                enumC4073m7 = EnumC4073m4.LIST;
                if (enumC4073m6 == enumC4073m7) {
                    f13 = 8;
                } else {
                    f13 = 20;
                }
                f14 = f13 * 4;
                if (c39174f4 != null) {
                    f16 = c39174f4.f168413w;
                } else {
                    if (enumC4073m6 == enumC4073m7) {
                        f15 = 8;
                    } else {
                        f15 = 18;
                    }
                    f16 = f15 * 4;
                }
                if (interfaceC25312u == null) {
                    f14 = c39174f4.f168413w;
                }
                Modifier modifierM3419p5 = AbstractC1102d.m3419p(f14, modifier4);
                c2307m = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                EnumC4073m4 enumC4073m10 = enumC4073m6;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3419p5);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d5);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                if (interfaceC25312u != null) {
                    c28655q.m87150e0(200969021);
                    if (interfaceC25312u instanceof C4242s) {
                        c28655q.m87150e0(201029719);
                        float f19 = 4;
                        Modifier modifierM3383e5 = AbstractC1099a.m3383e(c2314t, ((float) (-2.5d)) * f19, (-2) * f19);
                        Modifier modifierM34565N3 = AbstractC12350b.m34565N(1.4f, c2314t);
                        Modifier modifierM3383e6 = AbstractC1099a.m3383e(c2314t, ((float) 2.5d) * f19, ((float) 7.5d) * f19);
                        C4242s c4242s3 = (C4242s) interfaceC25312u;
                        text = c4242s3.getText();
                        if (text != null) {
                            c4238oM13215b = C4238o.m13215b(text, null, "", null, null, null, EnumC2888c.N5, false, 29, null);
                        } else {
                            c4238oM13215b = null;
                        }
                        z13 = true;
                        AbstractC4234k.m13178q(modifierM3383e5, modifierM3383e6, null, modifierM34565N3, AbstractC34132o.m107879c(0.0f, c2314t), null, c4242s3.m13236b((8191 & 1) != 0 ? c4242s3.radius : 0.0f, (8191 & 2) != 0 ? c4242s3.padding : 0.0f, (8191 & 4) != 0 ? c4242s3.gradientPadding : 0.0f, (8191 & 8) != 0 ? c4242s3.paceOfAgingAnimationScore : 0.0d, (8191 & 16) != 0 ? c4242s3.yearsDifferenceAnimationScore : 0.0d, (8191 & 32) != 0 ? c4242s3.colors : null, (8191 & 64) != 0 ? c4242s3.centerShadowBrush : null, (8191 & 128) != 0 ? c4242s3.outline : null, (8191 & 256) != 0 ? c4242s3.usingPrimitiveEdgeFade : false, (8191 & 512) != 0 ? c4242s3.edgeFade : null, (8191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c4242s3.primitiveEdgeFade : null, (8191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c4242s3.particles : null, (8191 & 4096) != 0 ? c4242s3.transition : null, (8191 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c4242s3.text : c4238oM13215b), c28655q, 27696, 36);
                        c28655q.m87173q(false);
                        z14 = false;
                        c28655q = c28655q;
                    } else {
                        z13 = true;
                        c28655q.m87150e0(201856551);
                        Modifier modifierM3419p6 = AbstractC1102d.m3419p(18 * 4, modifier4);
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3419p6);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d6);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                        z14 = false;
                        AbstractC25303l.m74291r(interfaceC25312u, null, null, function1, c28655q, i15 & 7182, 6);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z14);
                } else {
                    modifier4 = modifier4;
                    c39174f4 = c39174f4;
                    z13 = true;
                    if (abstractC22403o != null) {
                        c28655q.m87150e0(202265720);
                        m12448i(abstractC22403o, f16, null, c28655q, (i15 >> 6) & 14, 4);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(202390650);
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(z13);
                c39174f3 = c39174f4;
                modifier3 = modifier4;
                enumC4073m5 = enumC4073m10;
            } else {
                c28655q.m87138X();
                enumC4073m5 = enumC4073m4;
                modifier3 = modifier2;
                c39174f3 = c39174f2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2165f(interfaceC25312u, enumC4073m5, abstractC22403o, function1, modifier3, c39174f3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        c39174f2 = c39174f;
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                enumC4073m6 = null;
            } else {
                enumC4073m6 = enumC4073m4;
            }
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (i16 != 0) {
                c39174f4 = null;
            } else {
                c39174f4 = c39174f2;
            }
            enumC4073m7 = EnumC4073m4.LIST;
            if (enumC4073m6 == enumC4073m7) {
                f13 = 8;
            } else {
                f13 = 20;
            }
            f14 = f13 * 4;
            if (c39174f4 != null) {
                f16 = c39174f4.f168413w;
            } else {
                if (enumC4073m6 == enumC4073m7) {
                    f15 = 8;
                } else {
                    f15 = 18;
                }
                f16 = f15 * 4;
            }
            if (interfaceC25312u == null) {
                f14 = c39174f4.f168413w;
            }
            Modifier modifierM3419p7 = AbstractC1102d.m3419p(f14, modifier4);
            c2307m = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m, false);
            EnumC4073m4 enumC4073m11 = enumC4073m6;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3419p7);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d7);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
            if (interfaceC25312u != null) {
                c28655q.m87150e0(200969021);
                if (interfaceC25312u instanceof C4242s) {
                    c28655q.m87150e0(201029719);
                    float f110 = 4;
                    Modifier modifierM3383e7 = AbstractC1099a.m3383e(c2314t, ((float) (-2.5d)) * f110, (-2) * f110);
                    Modifier modifierM34565N4 = AbstractC12350b.m34565N(1.4f, c2314t);
                    Modifier modifierM3383e8 = AbstractC1099a.m3383e(c2314t, ((float) 2.5d) * f110, ((float) 7.5d) * f110);
                    C4242s c4242s4 = (C4242s) interfaceC25312u;
                    text = c4242s4.getText();
                    if (text != null) {
                        c4238oM13215b = C4238o.m13215b(text, null, "", null, null, null, EnumC2888c.N5, false, 29, null);
                    } else {
                        c4238oM13215b = null;
                    }
                    z13 = true;
                    AbstractC4234k.m13178q(modifierM3383e7, modifierM3383e8, null, modifierM34565N4, AbstractC34132o.m107879c(0.0f, c2314t), null, c4242s4.m13236b((8191 & 1) != 0 ? c4242s4.radius : 0.0f, (8191 & 2) != 0 ? c4242s4.padding : 0.0f, (8191 & 4) != 0 ? c4242s4.gradientPadding : 0.0f, (8191 & 8) != 0 ? c4242s4.paceOfAgingAnimationScore : 0.0d, (8191 & 16) != 0 ? c4242s4.yearsDifferenceAnimationScore : 0.0d, (8191 & 32) != 0 ? c4242s4.colors : null, (8191 & 64) != 0 ? c4242s4.centerShadowBrush : null, (8191 & 128) != 0 ? c4242s4.outline : null, (8191 & 256) != 0 ? c4242s4.usingPrimitiveEdgeFade : false, (8191 & 512) != 0 ? c4242s4.edgeFade : null, (8191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c4242s4.primitiveEdgeFade : null, (8191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c4242s4.particles : null, (8191 & 4096) != 0 ? c4242s4.transition : null, (8191 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c4242s4.text : c4238oM13215b), c28655q, 27696, 36);
                    c28655q.m87173q(false);
                    z14 = false;
                    c28655q = c28655q;
                } else {
                    z13 = true;
                    c28655q.m87150e0(201856551);
                    Modifier modifierM3419p8 = AbstractC1102d.m3419p(18 * 4, modifier4);
                    InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3419p8);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d8);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                    z14 = false;
                    AbstractC25303l.m74291r(interfaceC25312u, null, null, function1, c28655q, i15 & 7182, 6);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
            } else {
                modifier4 = modifier4;
                c39174f4 = c39174f4;
                z13 = true;
                if (abstractC22403o != null) {
                    c28655q.m87150e0(202265720);
                    m12448i(abstractC22403o, f16, null, c28655q, (i15 >> 6) & 14, 4);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(202390650);
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(z13);
            c39174f3 = c39174f4;
            modifier3 = modifier4;
            enumC4073m5 = enumC4073m11;
        } else {
            c28655q.m87138X();
            enumC4073m5 = enumC4073m4;
            modifier3 = modifier2;
            c39174f3 = c39174f2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2165f(interfaceC25312u, enumC4073m5, abstractC22403o, function1, modifier3, c39174f3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m12459t(InterfaceC25312u interfaceC25312u, EnumC4073m4 enumC4073m4, AbstractC22403o abstractC22403o, Function1 function1, Modifier modifier, C39174f c39174f, int i13, int i14, Composer composer, int i15) {
        m12458s(interfaceC25312u, enumC4073m4, abstractC22403o, function1, modifier, c39174f, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final boolean m12460u(C4108r4 c4108r4) {
        return (c4108r4.getTopItem() == null && c4108r4.getImage() == null) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public static final List<C4108r4> m12461v() {
        return f16525h;
    }

    /* JADX INFO: renamed from: w */
    private static final float m12462w(C4108r4 c4108r4) {
        int i13;
        int i14 = a.f16526a[c4108r4.getImageStyle().ordinal()];
        if (i14 == 1) {
            i13 = 8;
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = 18;
        }
        return i13 * 4;
    }
}
