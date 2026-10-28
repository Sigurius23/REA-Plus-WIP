package e81;

import a01.AbstractC0087g;
import a01.C0088h;
import a81.C0555f;
import a81.C0560k;
import ai1.C0910b;
import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aq1.C1910d;
import b91.C2886a;
import bb2.C2931g;
import c93.InterfaceC4339a;
import ck1.C4789l;
import com.whoop.navigation.C9598e;
import cy1.C11186b;
import d30.C11546l;
import d71.C11757c;
import e11.C12582b;
import gb1.AbstractC15676d;
import hy0.AbstractC17808z1;
import hy0.C17731c2;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m83.AbstractC25267u;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p000.C2175b;
import p000.C33241t;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p078d1.C11456i;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p390p1.InterfaceC28690z0;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39126r;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.AbstractC39177i;
import p636y3.C39169a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.AbstractC29011e;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: e81.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aY\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a1\u0010 \u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b \u0010!\u001a'\u0010\"\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\"\u0010#\u001aG\u0010&\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b&\u0010'\u001a=\u0010(\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u001dH\u0003¢\u0006\u0004\b+\u0010,\u001a7\u0010-\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u001d2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b-\u0010.\"\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101¨\u00066²\u0006\u0010\u00105\u001a\u0004\u0018\u00010\u00148\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Le81/n;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "x", "(Landroidx/compose/ui/Modifier;Le81/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Le81/f0;", "pieChart", "Le81/a;", "content", "Le81/l;", "orientation", "Le81/m;", "style", "Le81/u;", "selection", "", "onSelectionChange", "N", "(Landroidx/compose/ui/Modifier;Le81/f0;Le81/a;Le81/l;Le81/m;Le81/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "subtitle", "L", "(Ljava/lang/String;Le81/l;Le81/m;Landroidx/compose/runtime/Composer;I)V", "", "Le81/k0;", "trendCounts", "caption", "d0", "(Ljava/util/List;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Y", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "La01/h;", "selectedBiomarker", "E", "(Ljava/util/List;La01/h;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "a0", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "trendCount", "S", "(Le81/k0;Landroidx/compose/runtime/Composer;I)V", "U", "(Landroidx/compose/ui/Modifier;Le81/k0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", "TREND_TILE_SPACING", "b", "MERGED_CARD_INSET", "selectedSliceIndex", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12836k {

    /* JADX INFO: renamed from: a */
    private static final float f44001a = 3 * 4;

    /* JADX INFO: renamed from: b */
    private static final float f44002b = 2 * 8;

    /* JADX INFO: renamed from: e81.k$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC39127r0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC28690z0 f44003a;

        public a(InterfaceC28690z0 interfaceC28690z0) {
            this.f44003a = interfaceC28690z0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final C23454a0 m36026g(AbstractC39104j1 abstractC39104j1, AbstractC39104j1 abstractC39104j2, AbstractC39104j1 abstractC39104j3, AbstractC39101i1 layout) {
            AbstractC22676k.m65750j(layout, "$this$layout");
            layout.m124632f(abstractC39104j1, 0, 0, 0.0f);
            layout.m124632f(abstractC39104j2, 0, 0, 0.0f);
            layout.m124632f(abstractC39104j3, 0, 0, 0.0f);
            return C23454a0.f92919a;
        }

        @Override // p635y2.InterfaceC39127r0
        /* JADX INFO: renamed from: a */
        public final InterfaceC39130s0 mo521a(InterfaceC39133t0 Layout, List<? extends InterfaceC39124q0> measurables, long j7) {
            AbstractC22676k.m65750j(Layout, "$this$Layout");
            AbstractC22676k.m65750j(measurables, "measurables");
            InterfaceC39124q0 interfaceC39124q0 = measurables.get(0);
            InterfaceC39124q0 interfaceC39124q1 = measurables.get(1);
            InterfaceC39124q0 interfaceC39124q2 = measurables.get(2);
            final AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q1.mo448T(C39169a.m124758b(j7, 0, 0, 0, 0, 11));
            ((C28617g1) this.f44003a).m87023y(abstractC39104j1Mo448T.f168212x);
            int i13 = abstractC39104j1Mo448T.f168211w;
            final AbstractC39104j1 abstractC39104j1Mo448T2 = interfaceC39124q2.mo448T(AbstractC39170b.m124769a(i13, i13, 0, Integer.MAX_VALUE));
            int iMax = Math.max(abstractC39104j1Mo448T.f168212x, abstractC39104j1Mo448T2.f168212x);
            if (!((iMax >= 0) & (i13 >= 0))) {
                AbstractC39177i.m124789a("width and height must be >= 0");
            }
            final AbstractC39104j1 abstractC39104j1Mo448T3 = interfaceC39124q0.mo448T(AbstractC39170b.m124776h(i13, i13, iMax, iMax));
            int i14 = abstractC39104j1Mo448T.f168212x;
            int iM124766j = C39169a.m124766j(j7);
            if (i14 < iM124766j) {
                i14 = iM124766j;
            }
            return Layout.mo86822W(i13, i14, C25272z.f99163w, new Function1() { // from class: e81.j
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC12836k.a.m36026g(abstractC39104j1Mo448T3, abstractC39104j1Mo448T, abstractC39104j1Mo448T2, (AbstractC39101i1) obj);
                }
            });
        }

        @Override // p635y2.InterfaceC39127r0
        /* JADX INFO: renamed from: b */
        public /* bridge */ int mo537b(InterfaceC39126r interfaceC39126r, List<? extends InterfaceC39124q0> list, int i13) {
            return super.mo537b(interfaceC39126r, list, i13);
        }

        @Override // p635y2.InterfaceC39127r0
        /* JADX INFO: renamed from: c */
        public /* bridge */ int mo538c(InterfaceC39126r interfaceC39126r, List<? extends InterfaceC39124q0> list, int i13) {
            return super.mo538c(interfaceC39126r, list, i13);
        }

        @Override // p635y2.InterfaceC39127r0
        /* JADX INFO: renamed from: d */
        public /* bridge */ int mo539d(InterfaceC39126r interfaceC39126r, List<? extends InterfaceC39124q0> list, int i13) {
            return super.mo539d(interfaceC39126r, list, i13);
        }

        @Override // p635y2.InterfaceC39127r0
        /* JADX INFO: renamed from: e */
        public /* bridge */ int mo540e(InterfaceC39126r interfaceC39126r, List<? extends InterfaceC39124q0> list, int i13) {
            return super.mo540e(interfaceC39126r, list, i13);
        }
    }

    /* JADX INFO: renamed from: e81.k$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44004a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f44005b;

        static {
            int[] iArr = new int[EnumC12838l.values().length];
            try {
                iArr[EnumC12838l.PIE_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC12838l.PIE_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC12838l.PIE_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44004a = iArr;
            int[] iArr2 = new int[EnumC12839m.values().length];
            try {
                iArr2[EnumC12839m.TILES.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC12839m.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f44005b = iArr2;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final void m35968A(InterfaceC28601c1 interfaceC28601c1, Integer num) {
        interfaceC28601c1.setValue(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m35969B(Function1 function1, C9598e c9598e) {
        function1.invoke(c9598e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m35970C(InterfaceC28601c1 interfaceC28601c1, Integer num) {
        m35968A(interfaceC28601c1, num);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m35971D(Modifier modifier, C12840n c12840n, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m36022x(modifier, c12840n, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0238  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:69:0x0102  */
    /* JADX WARN: Code duplicated, block: B:72:0x0117  */
    /* JADX WARN: Code duplicated, block: B:74:0x0125  */
    /* JADX WARN: Code duplicated, block: B:77:0x0139  */
    /* JADX WARN: Code duplicated, block: B:78:0x0146  */
    /* JADX WARN: Code duplicated, block: B:81:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x0156  */
    /* JADX WARN: Code duplicated, block: B:85:0x0186 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x0188  */
    /* JADX WARN: Code duplicated, block: B:89:0x01da  */
    /* JADX WARN: Code duplicated, block: B:90:0x01de  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:97:0x022e  */
    /* JADX INFO: renamed from: E */
    public static final void m35972E(List<C12837k0> trendCounts, C0088h c0088h, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        float f13;
        InterfaceC28670t2 interfaceC28670t2M30588b;
        Object objM87133R;
        InterfaceC28690z0 interfaceC28690z0;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R3;
        boolean zM87153g;
        Object objM87133R4;
        boolean zM87153g2;
        Object objM87133R5;
        int iHashCode2;
        Object objM87133R6;
        AbstractC22676k.m65750j(trendCounts, "trendCounts");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2086413548);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(trendCounts) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(c0088h) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i18 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C12824e(4);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function4 = (Function1) objM87133R6;
                    } else {
                        function4 = function2;
                    }
                    if (c0088h != null) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(150, 0, AbstractC11333b0.f36310a, 2), "BiomarkerReadoutMerge", null, c28655q, 3072, 20);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                    }
                    interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new a(interfaceC28690z0);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC39127r0 interfaceC39127r0 = (InterfaceC39127r0) objM87133R2;
                    int i19 = i15 >> 3;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    int i24 = i15;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    int size = trendCounts.size();
                    float f14 = f44001a;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C11456i(interfaceC28690z0, 13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                    zM87153g = c28655q.m87153g(interfaceC28670t2M30588b);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g || objM87133R4 == c28676v0) {
                        objM87133R4 = new C33241t(interfaceC28670t2M30588b, 1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC12842p.m36042c(size, f14, interfaceC4339a, (InterfaceC4339a) objM87133R4, null, c28655q, 432, 16);
                    zM87153g2 = c28655q.m87153g(interfaceC28670t2M30588b);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R5 == c28676v0) {
                        objM87133R5 = new C2175b(interfaceC28670t2M30588b, 3);
                        c28655q.m87172p0(objM87133R5);
                    }
                    Modifier modifier4 = modifier3;
                    Function1 function5 = function4;
                    m35995a0(AbstractC1127a.m3486a(c2314t, (Function1) objM87133R5), trendCounts, function5, c28655q, ((i24 << 3) & 112) | (i19 & 896), 0);
                    Modifier modifierM3355a = AbstractC1091c.m3355a(c2314t, AbstractC11348f.m30574v(110, 0, null, 6), 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3355a);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    AbstractC29125c.m88520b(c0088h, null, AbstractC11348f.m30574v(110, 0, null, 6), "BiomarkerCardSwap", AbstractC37817c.m121344e(1629141784, c28655q, new C12826f(function5, 0)), c28655q, (i19 & 14) | 28032, 2);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier2 = modifier4;
                    function3 = function5;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) trendCounts, (Object) c0088h, (Object) modifier2, function3, i13, i14, 18);
                }
            }
            i15 |= 3072;
            function2 = function1;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C12824e(4);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function4 = (Function1) objM87133R6;
                } else {
                    function4 = function2;
                }
                if (c0088h != null) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(150, 0, AbstractC11333b0.f36310a, 2), "BiomarkerReadoutMerge", null, c28655q, 3072, 20);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new a(interfaceC28690z0);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC39127r0 interfaceC39127r1 = (InterfaceC39127r0) objM87133R2;
                int i110 = i15 >> 3;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                int i25 = i15;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r1);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                int size2 = trendCounts.size();
                float f15 = f44001a;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C11456i(interfaceC28690z0, 13);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                zM87153g = c28655q.m87153g(interfaceC28670t2M30588b);
                objM87133R4 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R4 = new C33241t(interfaceC28670t2M30588b, 1);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C33241t(interfaceC28670t2M30588b, 1);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC12842p.m36042c(size2, f15, interfaceC4339a2, (InterfaceC4339a) objM87133R4, null, c28655q, 432, 16);
                zM87153g2 = c28655q.m87153g(interfaceC28670t2M30588b);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R5 = new C2175b(interfaceC28670t2M30588b, 3);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C2175b(interfaceC28670t2M30588b, 3);
                    c28655q.m87172p0(objM87133R5);
                }
                Modifier modifier5 = modifier3;
                Function1 function6 = function4;
                m35995a0(AbstractC1127a.m3486a(c2314t, (Function1) objM87133R5), trendCounts, function6, c28655q, ((i25 << 3) & 112) | (i110 & 896), 0);
                Modifier modifierM3355a2 = AbstractC1091c.m3355a(c2314t, AbstractC11348f.m30574v(110, 0, null, 6), 2);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3355a2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                AbstractC29125c.m88520b(c0088h, null, AbstractC11348f.m30574v(110, 0, null, 6), "BiomarkerCardSwap", AbstractC37817c.m121344e(1629141784, c28655q, new C12826f(function6, 0)), c28655q, (i110 & 14) | 28032, 2);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier2 = modifier5;
                function3 = function6;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) trendCounts, (Object) c0088h, (Object) modifier2, function3, i13, i14, 18);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C12824e(4);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function4 = (Function1) objM87133R6;
                } else {
                    function4 = function2;
                }
                if (c0088h != null) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(150, 0, AbstractC11333b0.f36310a, 2), "BiomarkerReadoutMerge", null, c28655q, 3072, 20);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
                }
                interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new a(interfaceC28690z0);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC39127r0 interfaceC39127r2 = (InterfaceC39127r0) objM87133R2;
                int i111 = i15 >> 3;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifier3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                int i26 = i15;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r2);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                int size3 = trendCounts.size();
                float f16 = f44001a;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C11456i(interfaceC28690z0, 13);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
                zM87153g = c28655q.m87153g(interfaceC28670t2M30588b);
                objM87133R4 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R4 = new C33241t(interfaceC28670t2M30588b, 1);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C33241t(interfaceC28670t2M30588b, 1);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC12842p.m36042c(size3, f16, interfaceC4339a3, (InterfaceC4339a) objM87133R4, null, c28655q, 432, 16);
                zM87153g2 = c28655q.m87153g(interfaceC28670t2M30588b);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R5 = new C2175b(interfaceC28670t2M30588b, 3);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C2175b(interfaceC28670t2M30588b, 3);
                    c28655q.m87172p0(objM87133R5);
                }
                Modifier modifier6 = modifier3;
                Function1 function7 = function4;
                m35995a0(AbstractC1127a.m3486a(c2314t, (Function1) objM87133R5), trendCounts, function7, c28655q, ((i26 << 3) & 112) | (i111 & 896), 0);
                Modifier modifierM3355a3 = AbstractC1091c.m3355a(c2314t, AbstractC11348f.m30574v(110, 0, null, 6), 2);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3355a3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                AbstractC29125c.m88520b(c0088h, null, AbstractC11348f.m30574v(110, 0, null, 6), "BiomarkerCardSwap", AbstractC37817c.m121344e(1629141784, c28655q, new C12826f(function7, 0)), c28655q, (i111 & 14) | 28032, 2);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier2 = modifier6;
                function3 = function7;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) trendCounts, (Object) c0088h, (Object) modifier2, function3, i13, i14, 18);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C12824e(4);
                    c28655q.m87172p0(objM87133R6);
                }
                function4 = (Function1) objM87133R6;
            } else {
                function4 = function2;
            }
            if (c0088h != null) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(150, 0, AbstractC11333b0.f36310a, 2), "BiomarkerReadoutMerge", null, c28655q, 3072, 20);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
            }
            interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new a(interfaceC28690z0);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC39127r0 interfaceC39127r3 = (InterfaceC39127r0) objM87133R2;
            int i112 = i15 >> 3;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifier3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            int i27 = i15;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r3);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
            int size4 = trendCounts.size();
            float f17 = f44001a;
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C11456i(interfaceC28690z0, 13);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            zM87153g = c28655q.m87153g(interfaceC28670t2M30588b);
            objM87133R4 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R4 = new C33241t(interfaceC28670t2M30588b, 1);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C33241t(interfaceC28670t2M30588b, 1);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC12842p.m36042c(size4, f17, interfaceC4339a4, (InterfaceC4339a) objM87133R4, null, c28655q, 432, 16);
            zM87153g2 = c28655q.m87153g(interfaceC28670t2M30588b);
            objM87133R5 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R5 = new C2175b(interfaceC28670t2M30588b, 3);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C2175b(interfaceC28670t2M30588b, 3);
                c28655q.m87172p0(objM87133R5);
            }
            Modifier modifier7 = modifier3;
            Function1 function8 = function4;
            m35995a0(AbstractC1127a.m3486a(c2314t, (Function1) objM87133R5), trendCounts, function8, c28655q, ((i27 << 3) & 112) | (i112 & 896), 0);
            Modifier modifierM3355a4 = AbstractC1091c.m3355a(c2314t, AbstractC11348f.m30574v(110, 0, null, 6), 2);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3355a4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
            AbstractC29125c.m88520b(c0088h, null, AbstractC11348f.m30574v(110, 0, null, 6), "BiomarkerCardSwap", AbstractC37817c.m121344e(1629141784, c28655q, new C12826f(function8, 0)), c28655q, (i112 & 14) | 28032, 2);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier2 = modifier7;
            function3 = function8;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f((Object) trendCounts, (Object) c0088h, (Object) modifier2, function3, i13, i14, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m35973F(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final float m35974G(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final float m35975H(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m35976I(InterfaceC28670t2 interfaceC28670t2, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51551a(1.0f - ((Number) interfaceC28670t2.getValue()).floatValue());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m35977J(Function1 function1, C0088h c0088h, Composer composer, int i13) {
        if (c0088h == null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(632496223);
            c28655q.m87173q(false);
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(632496224);
            AbstractC0087g.m220g(AbstractC1099a.m3394p(f44002b, C2314t.f9131w), c0088h, function1, c28655q2, 6, 0);
            c28655q2.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m35978K(List list, C0088h c0088h, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m35972E(list, c0088h, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private static final void m35979L(String str, EnumC12838l enumC12838l, EnumC12839m enumC12839m, Composer composer, int i13) {
        String str2;
        int i14;
        C28655q c28655q;
        long jM95624D;
        C2886a c2886aM8438s;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1092132187);
        if ((i13 & 6) == 0) {
            str2 = str;
            i14 = (c28655q2.m87153g(str2) ? 4 : 2) | i13;
        } else {
            str2 = str;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87149e(enumC12838l.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87149e(enumC12839m.ordinal()) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            int i15 = b.f44005b[enumC12839m.ordinal()];
            if (i15 == 1) {
                c28655q2.m87150e0(-1567002449);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, false);
            } else {
                if (i15 != 2) {
                    throw AbstractC11895b.m32003v(-1567004964, c28655q2, false);
                }
                c28655q2.m87150e0(-1566999828);
                jM95624D = C38072d.f163053a.m121949b(c28655q2, 6).getWhite70();
                c28655q2.m87173q(false);
            }
            int i16 = b.f44004a[enumC12838l.ordinal()];
            if (i16 == 1 || i16 == 2) {
                c28655q2.m87150e0(-1566993529);
                c2886aM8438s = C38072d.f163053a.m121952e(c28655q2, 6).getH5();
                c28655q2.m87173q(false);
            } else {
                if (i16 != 3) {
                    throw AbstractC11895b.m32003v(-1566998452, c28655q2, false);
                }
                c28655q2.m87150e0(-1566990712);
                c2886aM8438s = C38072d.f163053a.m121952e(c28655q2, 6).getBtS();
                c28655q2.m87173q(false);
            }
            c28655q = c28655q2;
            AbstractC30795n.m94707h(str2, null, jM95624D, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8438s, Float.valueOf(1.0f), c28655q, i14 & 14, 12582912, 65018);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(str, enumC12838l, enumC12839m, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m35980M(String str, EnumC12838l enumC12838l, EnumC12839m enumC12839m, int i13, Composer composer, int i14) {
        m35979L(str, enumC12838l, enumC12839m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f3 A[LOOP:0: B:73:0x00ed->B:75:0x00f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x014b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0157  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: N */
    private static final void m35981N(Modifier modifier, C12827f0 c12827f0, C12816a c12816a, EnumC12838l enumC12838l, EnumC12839m enumC12839m, C12847u c12847u, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Function1 function4;
        ArrayList arrayList;
        Iterator<T> it;
        Object objM87133R;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1347931055);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(c12827f0) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q2.m87153g(c12816a) : c28655q2.m87157i(c12816a) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87149e(enumC12838l.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87149e(enumC12839m.ordinal()) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q2.m87153g(c12847u) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i17 = i14 & 64;
        if (i17 == 0) {
            if ((1572864 & i13) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 1048576 : 524288;
            }
            i16 = i15;
            if ((599187 & i16) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                if (i17 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C12824e(3);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                c28655q2.m87150e0(1718390902);
                List<C12835j0> listM35964e = c12827f0.m35964e();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM35964e, 10));
                it = listM35964e.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C12831h0(AbstractC12829g0.m35965a(((C12835j0) it.next()).getStyle(), c28655q2, 0), null));
                }
                c28655q2.m87173q(false);
                int i18 = i16 << 3;
                c28655q = c28655q2;
                AbstractC12823d0.m35939h(modifier, arrayList, 0.0f, 0.0f, 0.0f, 0.0f, c12847u, function4, AbstractC37817c.m121344e(-1900507158, c28655q2, new C12830h(0, C38072d.f163053a.m121949b(c28655q2, 6).getWhite10(), c12816a, enumC12838l, enumC12839m)), c28655q, (i16 & 14) | 100663296 | (3670016 & i18) | (i18 & 29360128), 60);
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g((Object) modifier, (Object) c12827f0, (Object) c12816a, (Object) enumC12838l, (Object) enumC12839m, (Object) c12847u, function3, i13, i14, 5);
            }
        }
        i15 |= 1572864;
        function2 = function1;
        i16 = i15;
        if ((599187 & i16) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            if (i17 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C12824e(3);
                    c28655q2.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            c28655q2.m87150e0(1718390902);
            List<C12835j0> listM35964e2 = c12827f0.m35964e();
            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM35964e2, 10));
            it = listM35964e2.iterator();
            while (it.hasNext()) {
                arrayList.add(new C12831h0(AbstractC12829g0.m35965a(((C12835j0) it.next()).getStyle(), c28655q2, 0), null));
            }
            c28655q2.m87173q(false);
            int i19 = i16 << 3;
            c28655q = c28655q2;
            AbstractC12823d0.m35939h(modifier, arrayList, 0.0f, 0.0f, 0.0f, 0.0f, c12847u, function4, AbstractC37817c.m121344e(-1900507158, c28655q2, new C12830h(0, C38072d.f163053a.m121949b(c28655q2, 6).getWhite10(), c12816a, enumC12838l, enumC12839m)), c28655q, (i16 & 14) | 100663296 | (3670016 & i19) | (i19 & 29360128), 60);
            function3 = function4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g((Object) modifier, (Object) c12827f0, (Object) c12816a, (Object) enumC12838l, (Object) enumC12839m, (Object) c12847u, function3, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m35982O(Integer num) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m35983P(C12816a c12816a, EnumC12838l enumC12838l, EnumC12839m enumC12839m, long j7, Composer composer, int i13) throws XmlPullParserException, IOException {
        C2886a c2886a;
        C0209i c0209i;
        C0209i c0209i2;
        C0213j c0213j;
        boolean z4;
        boolean z13;
        boolean z14;
        float f13;
        long jM53358D;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM88145f = AbstractC29011e.m88145f(c2314t, 0.0f, 0.0f, 0.7f, 0.7f, null, 19, null);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM88145f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i3 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
            C0209i c0209i4 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
            }
            C0209i c0209i6 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
            String strM35884f = c12816a.getTitle();
            if (strM35884f == null) {
                c28655q.m87150e0(-513761606);
                c28655q.m87173q(false);
                z4 = false;
                c0209i2 = c0209i5;
                c0209i = c0209i3;
                c0213j = c0213j2;
            } else {
                c28655q.m87150e0(-513761605);
                C38072d c38072d = C38072d.f163053a;
                long jM125430y = c38072d.m121949b(c28655q, 6).getBrandWhite();
                int i14 = b.f44004a[enumC12838l.ordinal()];
                if (i14 == 1 || i14 == 2) {
                    c28655q.m87150e0(-1504368139);
                    C2886a c2886aM8445z = c38072d.m121952e(c28655q, 6).getN45();
                    c28655q.m87173q(false);
                    c2886a = c2886aM8445z;
                } else {
                    if (i14 != 3) {
                        throw AbstractC11895b.m32003v(-1504373784, c28655q, false);
                    }
                    c28655q.m87150e0(-1504364940);
                    C2886a c2886aM8443x = c38072d.m121952e(c28655q, 6).getN3();
                    c28655q.m87173q(false);
                    c2886a = c2886aM8443x;
                }
                c0209i = c0209i3;
                c0209i2 = c0209i5;
                c0213j = c0213j2;
                AbstractC30795n.m94707h(strM35884f, null, jM125430y, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886a, Float.valueOf(1.0f), c28655q, 0, 12582912, 65018);
                c28655q = c28655q;
                z4 = false;
                c28655q.m87173q(false);
            }
            String strM35882d = c12816a.getSubtitle();
            if (strM35882d == null) {
                c28655q.m87150e0(-513096067);
                c28655q.m87173q(z4);
                z14 = true;
            } else {
                c28655q.m87150e0(-513096066);
                float f14 = 4;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                boolean z15 = enumC12839m == EnumC12839m.TILES;
                boolean zM87151f = c28655q.m87151f(j7);
                Object objM87133R = c28655q.m87133R();
                if (zM87151f || objM87133R == C28635l.f115821a) {
                    objM87133R = new C0910b(j7, 13);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM44099b = AbstractC15676d.m44099b(c2314t, z15, (Function1) objM87133R);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44099b);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, r4, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
                if (c12816a.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String() == null || c12816a.getSubtitleIcon() == null) {
                    z13 = false;
                    z14 = true;
                    c28655q.m87150e0(538192196);
                    m35979L(strM35882d, enumC12838l, enumC12839m, c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(537044855);
                    C2306l c2306l = C2299e.f9108K;
                    int[] iArr = b.f44005b;
                    int i15 = iArr[enumC12839m.ordinal()];
                    if (i15 == 1) {
                        f13 = 1 * 8;
                    } else {
                        if (i15 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f13 = 0;
                    }
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q, 48);
                    int iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N3);
                    m35979L(strM35882d, enumC12838l, enumC12839m, c28655q, 0);
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(c12816a.getSubtitleIcon().toWhoopIcon(), c28655q, 6);
                    int i16 = iArr[enumC12839m.ordinal()];
                    if (i16 == 1) {
                        z13 = false;
                        c28655q.m87150e0(-1429249273);
                        jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        if (i16 != 2) {
                            throw AbstractC11895b.m32003v(-1429252484, c28655q, false);
                        }
                        c28655q.m87150e0(-1429245977);
                        jM53358D = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
                        z13 = false;
                        c28655q.m87173q(false);
                    }
                    AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1102d.m3419p(((float) 3.5d) * f14, c2314t), jM53358D, c28655q, 432, 0);
                    z14 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(z13);
                }
                c28655q.m87173q(z14);
                c28655q.m87173q(z13);
            }
            c28655q.m87173q(z14);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final Modifier m35984Q(long j7, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1102d.m3411h(40, AbstractC1099a.m3396r(AbstractC1092a.m3358c(AbstractC18489d0.m53364e(applyIf, 3, 4), j7, AbstractC17918w0.f69621a), 12, 0.0f, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m35985R(Modifier modifier, C12827f0 c12827f0, C12816a c12816a, EnumC12838l enumC12838l, EnumC12839m enumC12839m, C12847u c12847u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m35981N(modifier, c12827f0, c12816a, enumC12838l, enumC12839m, c12847u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    private static final void m35986S(C12837k0 c12837k0, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-414317555);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c12837k0) : c28655q.m87157i(c12837k0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            C17731c2 c17731c2M36027a = c12837k0.getTrend();
            AbstractC17808z1.m51175c(c17731c2M36027a.m50800a((28671 & 1) != 0 ? c17731c2M36027a.text : null, (28671 & 2) != 0 ? c17731c2M36027a.includeBackground : false, (28671 & 4) != 0 ? c17731c2M36027a.trendTypeState : null, (28671 & 8) != 0 ? c17731c2M36027a.isPressed : false, (28671 & 16) != 0 ? c17731c2M36027a.icon : null, (28671 & 32) != 0 ? c17731c2M36027a.removeSideRadius : null, (28671 & 64) != 0 ? c17731c2M36027a.withIcon : false, (28671 & 128) != 0 ? c17731c2M36027a.showBorder : false, (28671 & 256) != 0 ? c17731c2M36027a.overflow : 0, (28671 & 512) != 0 ? c17731c2M36027a.maxLines : 0, (28671 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c17731c2M36027a.iconSize : 0.0f, (28671 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c17731c2M36027a.destination : null, (28671 & 4096) != 0 ? c17731c2M36027a.maxFontScaling : Float.valueOf(1.5f), (28671 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c17731c2M36027a.radius : 0.0f, (28671 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c17731c2M36027a.backgroundPaddingValues : null), c28655q, C9598e.f28134d);
            String strM36028b = c12837k0.getValue();
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM36028b, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN6(), Float.valueOf(1.8f), c28655q, 0, 12582912, 65530);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(c12837k0, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m35987T(C12837k0 c12837k0, int i13, Composer composer, int i14) {
        m35986S(c12837k0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:71:0x0102  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:79:0x0149  */
    /* JADX WARN: Code duplicated, block: B:80:0x014d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0168  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: U */
    private static final void m35988U(Modifier modifier, C12837k0 c12837k0, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2126132245);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(c12837k0) : c28655q.m87157i(c12837k0) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
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
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C12824e(2);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                if ((i15 & 112) != 32 || ((i15 & 64) != 0 && c28655q.m87157i(c12837k0))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z13;
                objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C11546l(12, c12837k0, function4);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifier4 = modifier3;
                float f13 = 8;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1092a.m3362g(modifier3, false, null, null, (InterfaceC4339a) objM87133R, 15), 0.0f, 2 * f13, 1);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                C23010x c23010xM73381n = AbstractC25012a.m73381n(1, f13, C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                String strM36028b = c12837k0.getValue();
                C38072d c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM36028b, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN5(), null, c28655q, 0, 0, 196602);
                C17731c2 c17731c2M36027a = c12837k0.getTrend();
                AbstractC17808z1.m51175c(c17731c2M36027a.m50800a((28671 & 1) != 0 ? c17731c2M36027a.text : null, (28671 & 2) != 0 ? c17731c2M36027a.includeBackground : false, (28671 & 4) != 0 ? c17731c2M36027a.trendTypeState : null, (28671 & 8) != 0 ? c17731c2M36027a.isPressed : false, (28671 & 16) != 0 ? c17731c2M36027a.icon : null, (28671 & 32) != 0 ? c17731c2M36027a.removeSideRadius : null, (28671 & 64) != 0 ? c17731c2M36027a.withIcon : false, (28671 & 128) != 0 ? c17731c2M36027a.showBorder : false, (28671 & 256) != 0 ? c17731c2M36027a.overflow : 0, (28671 & 512) != 0 ? c17731c2M36027a.maxLines : 0, (28671 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c17731c2M36027a.iconSize : 0.0f, (28671 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c17731c2M36027a.destination : null, (28671 & 4096) != 0 ? c17731c2M36027a.maxFontScaling : Float.valueOf(1.4f), (28671 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c17731c2M36027a.radius : 0.0f, (28671 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c17731c2M36027a.backgroundPaddingValues : null), c28655q, C9598e.f28134d);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function4;
                modifier2 = modifier4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 4, (Object) modifier2, (Object) c12837k0, (InterfaceC23459e) function3);
            }
        }
        i15 |= 384;
        function2 = function1;
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
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C12824e(2);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            if ((i15 & 112) != 32) {
                z13 = true;
            } else {
                z13 = true;
            }
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | z13;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C11546l(12, c12837k0, function4);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C11546l(12, c12837k0, function4);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifier5 = modifier3;
            float f14 = 8;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(modifier3, false, null, null, (InterfaceC4339a) objM87133R, 15), 0.0f, 2 * f14, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            C23010x c23010xM73381n2 = AbstractC25012a.m73381n(1, f14, C2299e.f9111N, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM73381n2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            String strM36028b2 = c12837k0.getValue();
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC30795n.m94707h(strM36028b2, null, c38072d2.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getN5(), null, c28655q, 0, 0, 196602);
            C17731c2 c17731c2M36027a2 = c12837k0.getTrend();
            AbstractC17808z1.m51175c(c17731c2M36027a2.m50800a((28671 & 1) != 0 ? c17731c2M36027a2.text : null, (28671 & 2) != 0 ? c17731c2M36027a2.includeBackground : false, (28671 & 4) != 0 ? c17731c2M36027a2.trendTypeState : null, (28671 & 8) != 0 ? c17731c2M36027a2.isPressed : false, (28671 & 16) != 0 ? c17731c2M36027a2.icon : null, (28671 & 32) != 0 ? c17731c2M36027a2.removeSideRadius : null, (28671 & 64) != 0 ? c17731c2M36027a2.withIcon : false, (28671 & 128) != 0 ? c17731c2M36027a2.showBorder : false, (28671 & 256) != 0 ? c17731c2M36027a2.overflow : 0, (28671 & 512) != 0 ? c17731c2M36027a2.maxLines : 0, (28671 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c17731c2M36027a2.iconSize : 0.0f, (28671 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c17731c2M36027a2.destination : null, (28671 & 4096) != 0 ? c17731c2M36027a2.maxFontScaling : Float.valueOf(1.4f), (28671 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c17731c2M36027a2.radius : 0.0f, (28671 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c17731c2M36027a2.backgroundPaddingValues : null), c28655q, C9598e.f28134d);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function3 = function4;
            modifier2 = modifier5;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 4, (Object) modifier2, (Object) c12837k0, (InterfaceC23459e) function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m35989V(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m35990W(C12837k0 c12837k0, Function1 function1) {
        C9598e destination = c12837k0.getTrend().getDestination();
        if (destination != null) {
            function1.invoke(destination);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m35991X(Modifier modifier, C12837k0 c12837k0, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m35988U(modifier, c12837k0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Y */
    private static final void m35992Y(List<C12837k0> list, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-480732140);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(list) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            modifier2 = i16 != 0 ? C2314t.f9131w : modifier;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(16), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
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
            c28655q.m87150e0(-1494358127);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                m35986S((C12837k0) it.next(), c28655q, C9598e.f28134d);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12828g(list, modifier2, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m35993Z(List list, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m35992Y(list, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x010c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0138  */
    /* JADX WARN: Code duplicated, block: B:71:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a0 */
    private static final void m35995a0(Modifier modifier, List<C12837k0> list, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1578424915);
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
            i15 |= c28655q.m87157i(list) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            i16 = 1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C12824e(i16);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3388j = AbstractC1099a.m3388j(modifier3, EnumC22935a1.f90537w);
                C22949e c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f44001a, C2299e.f9111N), C2299e.f9108K, c28655q, 54);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c28655q.m87150e0(-1612709049);
                for (C12837k0 c12837k0 : list) {
                    if (1.0f > 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    m35988U(new LayoutWeightElement(1.0f, true), c12837k0, function4, c28655q, (C9598e.f28134d << 3) | (i15 & 896), 0);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                modifier2 = modifier3;
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0560k(modifier2, list, function3, i13, i14, 2);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = 1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i18 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C12824e(i16);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            Modifier modifierM3388j2 = AbstractC1099a.m3388j(modifier3, EnumC22935a1.f90537w);
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f44001a, C2299e.f9111N), C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            c28655q.m87150e0(-1612709049);
            while (r1.hasNext()) {
                if (1.0f > 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                m35988U(new LayoutWeightElement(1.0f, true), c12837k0, function4, c28655q, (C9598e.f28134d << 3) | (i15 & 896), 0);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            modifier2 = modifier3;
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0560k(modifier2, list, function3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m35997b0(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m35999c0(Modifier modifier, List list, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m35995a0(modifier, list, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x014b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0156  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d0 */
    private static final void m36001d0(List<C12837k0> list, String str, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifier5;
        boolean z13;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(173153867);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(list) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4), C2299e.f9110M, c28655q2, 6);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                m35992Y(list, null, c28655q2, i15 & 14, 2);
                if (str == null) {
                    c28655q2.m87150e0(407709845);
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                    modifier5 = modifier4;
                    z13 = true;
                } else {
                    c28655q2.m87150e0(407709846);
                    C38072d c38072d = C38072d.f163053a;
                    modifier5 = modifier4;
                    z13 = true;
                    AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 1 * 8, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB4(), null, c28655q2, 48, 0, 196600);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12832i(list, str, modifier3, i13, i14);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4), C2299e.f9110M, c28655q2, 6);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            m35992Y(list, null, c28655q2, i15 & 14, 2);
            if (str == null) {
                c28655q2.m87150e0(407709845);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                modifier5 = modifier4;
                z13 = true;
            } else {
                c28655q2.m87150e0(407709846);
                C38072d c38072d2 = C38072d.f163053a;
                modifier5 = modifier4;
                z13 = true;
                AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 1 * 8, 0.0f, 0.0f, 13), c38072d2.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, 6).getB4(), null, c28655q2, 48, 0, 196600);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z13);
            modifier3 = modifier5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12832i(list, str, modifier3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m36003e0(List list, String str, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m36001d0(list, str, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0217  */
    /* JADX WARN: Code duplicated, block: B:104:0x0225  */
    /* JADX WARN: Code duplicated, block: B:107:0x0237  */
    /* JADX WARN: Code duplicated, block: B:109:0x0263  */
    /* JADX WARN: Code duplicated, block: B:112:0x029d  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:116:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:118:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:121:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:123:0x031e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0322  */
    /* JADX WARN: Code duplicated, block: B:127:0x032f  */
    /* JADX WARN: Code duplicated, block: B:129:0x033d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0356  */
    /* JADX WARN: Code duplicated, block: B:133:0x0399  */
    /* JADX WARN: Code duplicated, block: B:135:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:137:0x0410  */
    /* JADX WARN: Code duplicated, block: B:138:0x0414  */
    /* JADX WARN: Code duplicated, block: B:141:0x0421  */
    /* JADX WARN: Code duplicated, block: B:143:0x042f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0466  */
    /* JADX WARN: Code duplicated, block: B:147:0x0470  */
    /* JADX WARN: Code duplicated, block: B:151:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:154:0x04df  */
    /* JADX WARN: Code duplicated, block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:69:0x011e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0157  */
    /* JADX WARN: Code duplicated, block: B:73:0x015b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0170  */
    /* JADX WARN: Code duplicated, block: B:79:0x0181  */
    /* JADX WARN: Code duplicated, block: B:83:0x019c  */
    /* JADX WARN: Code duplicated, block: B:85:0x019f  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:98:0x0206  */
    /* JADX WARN: Code duplicated, block: B:99:0x020a  */
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
    /* JADX INFO: renamed from: x */
    public static final void m36022x(Modifier modifier, C12840n viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        boolean zIsFeatureEnabled;
        C12847u c12847uM36083a;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        float f13;
        Modifier modifierM3394p;
        C9598e c9598eM35881c;
        C2314t c2314t2;
        Modifier modifierMo3471e;
        float f14;
        float f15;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        int i16;
        C0209i c0209i4;
        int i17;
        boolean z13;
        Function1 function4;
        C12847u c12847u;
        C2314t c2314t3;
        int iHashCode2;
        boolean z14;
        boolean z15;
        String caption;
        int iHashCode3;
        C23000t1 c23000t1;
        Modifier modifierM3384f;
        boolean z16;
        boolean z17;
        C28655q c28655q;
        int iHashCode4;
        int iHashCode5;
        C28655q c28655q2;
        boolean z18;
        float f16;
        int i18;
        Object objM87133R2;
        boolean z19;
        boolean zM87157i;
        Object objM87133R3;
        Object objM87133R4;
        C2305k c2305k = C2299e.f9111N;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1576689724);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q3.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(viewState) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q3.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i19 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C12824e(0);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    function2 = (Function1) objM87133R4;
                }
                if (viewState.m36032e()) {
                    c28655q3.m87150e0(924643254);
                    zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q3, 6).isFeatureEnabled("alabs-dial-v2");
                    c28655q3.m87173q(false);
                } else {
                    c28655q3.m87150e0(-1400828961);
                    c28655q3.m87173q(false);
                    zIsFeatureEnabled = false;
                }
                if (zIsFeatureEnabled) {
                    c12847uM36083a = C12847u.INSTANCE.m36083a();
                } else {
                    c12847uM36083a = null;
                }
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c28655q3.m87150e0(924652567);
                f13 = 4;
                modifierM3394p = AbstractC1099a.m3394p(f13, modifier4);
                c9598eM35881c = viewState.getPieChartContent().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
                if (c9598eM35881c != null) {
                    if ((i15 & 896) == 256) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87157i = z19 | c28655q3.m87157i(c9598eM35881c);
                    objM87133R3 = c28655q3.m87133R();
                    if (zM87157i || objM87133R3 == c28676v0) {
                        objM87133R3 = new C4789l(function2, c9598eM35881c, 1);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    c2314t2 = c2314t;
                    modifierMo3471e = modifierM3394p.mo3471e(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R3, 15));
                } else {
                    c2314t2 = c2314t;
                    modifierMo3471e = modifierM3394p.mo3471e(c2314t2);
                }
                c28655q3.m87173q(false);
                f14 = 8;
                f15 = 2 * f14;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q3, 6);
                Modifier modifier5 = modifier4;
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q3.f115903S) {
                    i16 = i15;
                } else {
                    i16 = i15;
                    if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                    i17 = b.f44004a[viewState.getOrientation().ordinal()];
                    if (i17 != 1) {
                        if (i17 != 2) {
                            z13 = true;
                        } else {
                            if (i17 == 3) {
                                throw AbstractC11895b.m32003v(-1590237547, c28655q3, false);
                            }
                            c28655q3.m87150e0(-2049301888);
                            C23010x c23010xM73381n = AbstractC25012a.m73381n(3, f14, c2305k, c28655q3, 54);
                            iHashCode4 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, c2314t2);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(c0213j);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM73381n);
                            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m2);
                            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode4))) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 48);
                            iHashCode5 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, c2314t2);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(c0213j);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a2);
                            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m3);
                            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode5))) {
                                AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N3);
                            if (viewState.m36039l().isEmpty()) {
                                function4 = function2;
                                c28655q2 = c28655q3;
                                z18 = false;
                                f16 = 1.0f;
                                i18 = 6;
                                c28655q2.m87150e0(-1518784485);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q3.m87150e0(-1519101615);
                                Function1 function5 = function2;
                                f16 = 1.0f;
                                i18 = 6;
                                m35972E(viewState.m36039l(), viewState.m36030a(m36024z(interfaceC28601c1)), null, function5, c28655q3, (i16 << 3) & 7168, 4);
                                function4 = function5;
                                c28655q2 = c28655q3;
                                z18 = false;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            Modifier modifierM3384f2 = AbstractC1099a.m3384f(AbstractC1102d.m3409f(viewState.getPieChartFractionWidth(), c2314t2), z18, f16);
                            z14 = true;
                            C12827f0 pieChart = viewState.getPieChart();
                            C12816a pieChartContent = viewState.getPieChartContent();
                            EnumC12838l orientation = viewState.getOrientation();
                            EnumC12839m style = viewState.getStyle();
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C1910d(24, interfaceC28601c1);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            c28655q3 = c28655q2;
                            m35981N(modifierM3384f2, pieChart, pieChartContent, orientation, style, c12847uM36083a, (Function1) objM87133R2, c28655q3, (C9598e.f28134d << i18) | 1572864, 0);
                            c28655q3.m87173q(true);
                            c28655q3.m87173q(z18);
                        }
                        c28655q3.m87173q(z14);
                        modifier3 = modifier5;
                        function3 = function4;
                    } else {
                        z13 = true;
                    }
                    function4 = function2;
                    c12847u = c12847uM36083a;
                    c28655q3.m87150e0(-2052626700);
                    if (viewState.m36039l().isEmpty()) {
                        c2314t3 = c2314t2;
                        c28655q3.m87150e0(-2050449105);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, c28655q3, 54);
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, c2314t3);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m4);
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N4);
                        z14 = z13;
                        c28655q3 = c28655q3;
                        z15 = false;
                        m35981N(AbstractC1102d.m3419p(200, c2314t3), viewState.getPieChart(), viewState.getPieChartContent(), viewState.getOrientation(), viewState.getStyle(), c12847u, null, c28655q3, (C9598e.f28134d << 6) | 6, 64);
                        caption = viewState.getCaption();
                        if (caption == null) {
                            c28655q3.m87150e0(295918562);
                            c28655q3.m87173q(false);
                        } else {
                            c28655q3.m87150e0(295918563);
                            C38072d c38072d = C38072d.f163053a;
                            AbstractC30795n.m94707h(caption, AbstractC1099a.m3398t(c2314t3, 0.0f, (z14 ? 1.0f : 0.0f) * f14, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q3, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getB4(), null, c28655q3, 48, 0, 196600);
                            c28655q3 = c28655q3;
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z14);
                        c28655q3.m87173q(false);
                    } else {
                        c28655q3.m87150e0(-2052608255);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13 * f14), C2299e.f9108K, c28655q3, 54);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM3409f);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m5);
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N5);
                        c23000t1 = C23000t1.f90727a;
                        modifierM3384f = AbstractC1099a.m3384f(c23000t1.mo66772c(c2314t2, z13, 1.0f), false, 1.0f);
                        if (viewState.getOrientation() == EnumC12838l.PIE_LEFT) {
                            c28655q3.m87150e0(-254492830);
                            z17 = z13;
                            z16 = false;
                            m35981N(modifierM3384f, viewState.getPieChart(), viewState.getPieChartContent(), viewState.getOrientation(), viewState.getStyle(), c12847u, null, c28655q3, C9598e.f28134d << 6, 64);
                            m36001d0(viewState.m36039l(), viewState.getCaption(), c23000t1.mo66772c(c2314t2, z17, 1.0f), c28655q3, 0, 0);
                            c28655q3.m87173q(false);
                            c28655q = c28655q3;
                        } else {
                            z16 = false;
                            z17 = z13;
                            c28655q3.m87150e0(-253741886);
                            m36001d0(viewState.m36039l(), viewState.getCaption(), c23000t1.mo66772c(c2314t2, z17, 1.0f), c28655q3, 0, 0);
                            m35981N(modifierM3384f, viewState.getPieChart(), viewState.getPieChartContent(), viewState.getOrientation(), viewState.getStyle(), c12847u, null, c28655q3, C9598e.f28134d << 6, 64);
                            c28655q = c28655q3;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z17);
                        c28655q.m87173q(z16);
                        z15 = z16;
                        z14 = z17;
                        c28655q3 = c28655q;
                    }
                    c28655q3.m87173q(z15);
                    c28655q3.m87173q(z14);
                    modifier3 = modifier5;
                    function3 = function4;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                i17 = b.f44004a[viewState.getOrientation().ordinal()];
                if (i17 != 1) {
                    if (i17 != 2) {
                        z13 = true;
                    } else {
                        if (i17 == 3) {
                            throw AbstractC11895b.m32003v(-1590237547, c28655q3, false);
                        }
                        c28655q3.m87150e0(-2049301888);
                        C23010x c23010xM73381n2 = AbstractC25012a.m73381n(3, f14, c2305k, c28655q3, 54);
                        iHashCode4 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, c2314t2);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM73381n2);
                        AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m6);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N6);
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 48);
                        iHashCode5 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q3.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q3, c2314t2);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a4);
                        AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m7);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N7);
                        if (viewState.m36039l().isEmpty()) {
                            c28655q3.m87150e0(-1519101615);
                            Function1 function6 = function2;
                            f16 = 1.0f;
                            i18 = 6;
                            m35972E(viewState.m36039l(), viewState.m36030a(m36024z(interfaceC28601c1)), null, function6, c28655q3, (i16 << 3) & 7168, 4);
                            function4 = function6;
                            c28655q2 = c28655q3;
                            z18 = false;
                            c28655q2.m87173q(false);
                        } else {
                            function4 = function2;
                            c28655q2 = c28655q3;
                            z18 = false;
                            f16 = 1.0f;
                            i18 = 6;
                            c28655q2.m87150e0(-1518784485);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        Modifier modifierM3384f3 = AbstractC1099a.m3384f(AbstractC1102d.m3409f(viewState.getPieChartFractionWidth(), c2314t2), z18, f16);
                        z14 = true;
                        C12827f0 pieChart2 = viewState.getPieChart();
                        C12816a pieChartContent2 = viewState.getPieChartContent();
                        EnumC12838l orientation2 = viewState.getOrientation();
                        EnumC12839m style2 = viewState.getStyle();
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C1910d(24, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        c28655q3 = c28655q2;
                        m35981N(modifierM3384f3, pieChart2, pieChartContent2, orientation2, style2, c12847uM36083a, (Function1) objM87133R2, c28655q3, (C9598e.f28134d << i18) | 1572864, 0);
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(z18);
                    }
                    c28655q3.m87173q(z14);
                    modifier3 = modifier5;
                    function3 = function4;
                } else {
                    z13 = true;
                }
                function4 = function2;
                c12847u = c12847uM36083a;
                c28655q3.m87150e0(-2052626700);
                if (viewState.m36039l().isEmpty()) {
                    c28655q3.m87150e0(-2052608255);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13 * f14), C2299e.f9108K, c28655q3, 54);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q3.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q3, modifierM3409f2);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m8);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N8);
                    c23000t1 = C23000t1.f90727a;
                    modifierM3384f = AbstractC1099a.m3384f(c23000t1.mo66772c(c2314t2, z13, 1.0f), false, 1.0f);
                    if (viewState.getOrientation() == EnumC12838l.PIE_LEFT) {
                        c28655q3.m87150e0(-254492830);
                        z17 = z13;
                        z16 = false;
                        m35981N(modifierM3384f, viewState.getPieChart(), viewState.getPieChartContent(), viewState.getOrientation(), viewState.getStyle(), c12847u, null, c28655q3, C9598e.f28134d << 6, 64);
                        m36001d0(viewState.m36039l(), viewState.getCaption(), c23000t1.mo66772c(c2314t2, z17, 1.0f), c28655q3, 0, 0);
                        c28655q3.m87173q(false);
                        c28655q = c28655q3;
                    } else {
                        z16 = false;
                        z17 = z13;
                        c28655q3.m87150e0(-253741886);
                        m36001d0(viewState.m36039l(), viewState.getCaption(), c23000t1.mo66772c(c2314t2, z17, 1.0f), c28655q3, 0, 0);
                        m35981N(modifierM3384f, viewState.getPieChart(), viewState.getPieChartContent(), viewState.getOrientation(), viewState.getStyle(), c12847u, null, c28655q3, C9598e.f28134d << 6, 64);
                        c28655q = c28655q3;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z17);
                    c28655q.m87173q(z16);
                    z15 = z16;
                    z14 = z17;
                    c28655q3 = c28655q;
                } else {
                    c2314t3 = c2314t2;
                    c28655q3.m87150e0(-2050449105);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, c28655q3, 54);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q3.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q3, c2314t3);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m9);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N9);
                    z14 = z13;
                    c28655q3 = c28655q3;
                    z15 = false;
                    m35981N(AbstractC1102d.m3419p(200, c2314t3), viewState.getPieChart(), viewState.getPieChartContent(), viewState.getOrientation(), viewState.getStyle(), c12847u, null, c28655q3, (C9598e.f28134d << 6) | 6, 64);
                    caption = viewState.getCaption();
                    if (caption == null) {
                        c28655q3.m87150e0(295918562);
                        c28655q3.m87173q(false);
                    } else {
                        c28655q3.m87150e0(295918563);
                        C38072d c38072d2 = C38072d.f163053a;
                        AbstractC30795n.m94707h(caption, AbstractC1099a.m3398t(c2314t3, 0.0f, (z14 ? 1.0f : 0.0f) * f14, 0.0f, 0.0f, 13), c38072d2.m121949b(c28655q3, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, 6).getB4(), null, c28655q3, 48, 0, 196600);
                        c28655q3 = c28655q3;
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z14);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z15);
                c28655q3.m87173q(z14);
                modifier3 = modifier5;
                function3 = function4;
            } else {
                c28655q3.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q3.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 5, (Object) modifier3, (Object) viewState, (InterfaceC23459e) function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i19 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C12824e(0);
                    c28655q3.m87172p0(objM87133R4);
                }
                function2 = (Function1) objM87133R4;
            }
            if (viewState.m36032e()) {
                c28655q3.m87150e0(924643254);
                zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q3, 6).isFeatureEnabled("alabs-dial-v2");
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(-1400828961);
                c28655q3.m87173q(false);
                zIsFeatureEnabled = false;
            }
            if (zIsFeatureEnabled) {
                c12847uM36083a = C12847u.INSTANCE.m36083a();
            } else {
                c12847uM36083a = null;
            }
            objM87133R = c28655q3.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q3.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c28655q3.m87150e0(924652567);
            f13 = 4;
            modifierM3394p = AbstractC1099a.m3394p(f13, modifier4);
            c9598eM35881c = viewState.getPieChartContent().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
            if (c9598eM35881c != null) {
                if ((i15 & 896) == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87157i = z19 | c28655q3.m87157i(c9598eM35881c);
                objM87133R3 = c28655q3.m87133R();
                if (zM87157i) {
                    objM87133R3 = new C4789l(function2, c9598eM35881c, 1);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C4789l(function2, c9598eM35881c, 1);
                    c28655q3.m87172p0(objM87133R3);
                }
                c2314t2 = c2314t;
                modifierMo3471e = modifierM3394p.mo3471e(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R3, 15));
            } else {
                c2314t2 = c2314t;
                modifierMo3471e = modifierM3394p.mo3471e(c2314t2);
            }
            c28655q3.m87173q(false);
            f14 = 8;
            f15 = 2 * f14;
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q3, 6);
            Modifier modifier6 = modifier4;
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q3.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q3, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a6);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m10);
            c0209i3 = C0217k.f732j;
            if (c28655q3.f115903S) {
                i16 = i15;
                if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N10);
                i17 = b.f44004a[viewState.getOrientation().ordinal()];
                if (i17 != 1) {
                    if (i17 != 2) {
                        z13 = true;
                    } else {
                        if (i17 == 3) {
                            throw AbstractC11895b.m32003v(-1590237547, c28655q3, false);
                        }
                        c28655q3.m87150e0(-2049301888);
                        C23010x c23010xM73381n3 = AbstractC25012a.m73381n(3, f14, c2305k, c28655q3, 54);
                        iHashCode4 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q3.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q3, c2314t2);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM73381n3);
                        AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m11);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N11);
                        C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 48);
                        iHashCode5 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q3.m87165m();
                        Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q3, c2314t2);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a7);
                        AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m12);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N12);
                        if (viewState.m36039l().isEmpty()) {
                            c28655q3.m87150e0(-1519101615);
                            Function1 function7 = function2;
                            f16 = 1.0f;
                            i18 = 6;
                            m35972E(viewState.m36039l(), viewState.m36030a(m36024z(interfaceC28601c1)), null, function7, c28655q3, (i16 << 3) & 7168, 4);
                            function4 = function7;
                            c28655q2 = c28655q3;
                            z18 = false;
                            c28655q2.m87173q(false);
                        } else {
                            function4 = function2;
                            c28655q2 = c28655q3;
                            z18 = false;
                            f16 = 1.0f;
                            i18 = 6;
                            c28655q2.m87150e0(-1518784485);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        Modifier modifierM3384f4 = AbstractC1099a.m3384f(AbstractC1102d.m3409f(viewState.getPieChartFractionWidth(), c2314t2), z18, f16);
                        z14 = true;
                        C12827f0 pieChart3 = viewState.getPieChart();
                        C12816a pieChartContent3 = viewState.getPieChartContent();
                        EnumC12838l orientation3 = viewState.getOrientation();
                        EnumC12839m style3 = viewState.getStyle();
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C1910d(24, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        c28655q3 = c28655q2;
                        m35981N(modifierM3384f4, pieChart3, pieChartContent3, orientation3, style3, c12847uM36083a, (Function1) objM87133R2, c28655q3, (C9598e.f28134d << i18) | 1572864, 0);
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(z18);
                    }
                    c28655q3.m87173q(z14);
                    modifier3 = modifier6;
                    function3 = function4;
                } else {
                    z13 = true;
                }
                function4 = function2;
                c12847u = c12847uM36083a;
                c28655q3.m87150e0(-2052626700);
                if (viewState.m36039l().isEmpty()) {
                    c28655q3.m87150e0(-2052608255);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13 * f14), C2299e.f9108K, c28655q3, 54);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q3.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q3, modifierM3409f3);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m13);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N13);
                    c23000t1 = C23000t1.f90727a;
                    modifierM3384f = AbstractC1099a.m3384f(c23000t1.mo66772c(c2314t2, z13, 1.0f), false, 1.0f);
                    if (viewState.getOrientation() == EnumC12838l.PIE_LEFT) {
                        c28655q3.m87150e0(-254492830);
                        z17 = z13;
                        z16 = false;
                        m35981N(modifierM3384f, viewState.getPieChart(), viewState.getPieChartContent(), viewState.getOrientation(), viewState.getStyle(), c12847u, null, c28655q3, C9598e.f28134d << 6, 64);
                        m36001d0(viewState.m36039l(), viewState.getCaption(), c23000t1.mo66772c(c2314t2, z17, 1.0f), c28655q3, 0, 0);
                        c28655q3.m87173q(false);
                        c28655q = c28655q3;
                    } else {
                        z16 = false;
                        z17 = z13;
                        c28655q3.m87150e0(-253741886);
                        m36001d0(viewState.m36039l(), viewState.getCaption(), c23000t1.mo66772c(c2314t2, z17, 1.0f), c28655q3, 0, 0);
                        m35981N(modifierM3384f, viewState.getPieChart(), viewState.getPieChartContent(), viewState.getOrientation(), viewState.getStyle(), c12847u, null, c28655q3, C9598e.f28134d << 6, 64);
                        c28655q = c28655q3;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z17);
                    c28655q.m87173q(z16);
                    z15 = z16;
                    z14 = z17;
                    c28655q3 = c28655q;
                } else {
                    c2314t3 = c2314t2;
                    c28655q3.m87150e0(-2050449105);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, c28655q3, 54);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q3.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q3, c2314t3);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m14);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N14);
                    z14 = z13;
                    c28655q3 = c28655q3;
                    z15 = false;
                    m35981N(AbstractC1102d.m3419p(200, c2314t3), viewState.getPieChart(), viewState.getPieChartContent(), viewState.getOrientation(), viewState.getStyle(), c12847u, null, c28655q3, (C9598e.f28134d << 6) | 6, 64);
                    caption = viewState.getCaption();
                    if (caption == null) {
                        c28655q3.m87150e0(295918562);
                        c28655q3.m87173q(false);
                    } else {
                        c28655q3.m87150e0(295918563);
                        C38072d c38072d3 = C38072d.f163053a;
                        AbstractC30795n.m94707h(caption, AbstractC1099a.m3398t(c2314t3, 0.0f, (z14 ? 1.0f : 0.0f) * f14, 0.0f, 0.0f, 13), c38072d3.m121949b(c28655q3, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q3, 6).getB4(), null, c28655q3, 48, 0, 196600);
                        c28655q3 = c28655q3;
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z14);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z15);
                c28655q3.m87173q(z14);
                modifier3 = modifier6;
                function3 = function4;
            } else {
                i16 = i15;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N10);
            i17 = b.f44004a[viewState.getOrientation().ordinal()];
            if (i17 != 1) {
                if (i17 != 2) {
                    z13 = true;
                } else {
                    if (i17 == 3) {
                        throw AbstractC11895b.m32003v(-1590237547, c28655q3, false);
                    }
                    c28655q3.m87150e0(-2049301888);
                    C23010x c23010xM73381n4 = AbstractC25012a.m73381n(3, f14, c2305k, c28655q3, 54);
                    iHashCode4 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q3.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q3, c2314t2);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM73381n4);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m15);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N15);
                    C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 48);
                    iHashCode5 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q3.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q3, c2314t2);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a9);
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m16);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N16);
                    if (viewState.m36039l().isEmpty()) {
                        c28655q3.m87150e0(-1519101615);
                        Function1 function8 = function2;
                        f16 = 1.0f;
                        i18 = 6;
                        m35972E(viewState.m36039l(), viewState.m36030a(m36024z(interfaceC28601c1)), null, function8, c28655q3, (i16 << 3) & 7168, 4);
                        function4 = function8;
                        c28655q2 = c28655q3;
                        z18 = false;
                        c28655q2.m87173q(false);
                    } else {
                        function4 = function2;
                        c28655q2 = c28655q3;
                        z18 = false;
                        f16 = 1.0f;
                        i18 = 6;
                        c28655q2.m87150e0(-1518784485);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    Modifier modifierM3384f5 = AbstractC1099a.m3384f(AbstractC1102d.m3409f(viewState.getPieChartFractionWidth(), c2314t2), z18, f16);
                    z14 = true;
                    C12827f0 pieChart4 = viewState.getPieChart();
                    C12816a pieChartContent4 = viewState.getPieChartContent();
                    EnumC12838l orientation4 = viewState.getOrientation();
                    EnumC12839m style4 = viewState.getStyle();
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C1910d(24, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    c28655q3 = c28655q2;
                    m35981N(modifierM3384f5, pieChart4, pieChartContent4, orientation4, style4, c12847uM36083a, (Function1) objM87133R2, c28655q3, (C9598e.f28134d << i18) | 1572864, 0);
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(z18);
                }
                c28655q3.m87173q(z14);
                modifier3 = modifier6;
                function3 = function4;
            } else {
                z13 = true;
            }
            function4 = function2;
            c12847u = c12847uM36083a;
            c28655q3.m87150e0(-2052626700);
            if (viewState.m36039l().isEmpty()) {
                c28655q3.m87150e0(-2052608255);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13 * f14), C2299e.f9108K, c28655q3, 54);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q3.m87165m();
                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q3, modifierM3409f4);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m17);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N17);
                c23000t1 = C23000t1.f90727a;
                modifierM3384f = AbstractC1099a.m3384f(c23000t1.mo66772c(c2314t2, z13, 1.0f), false, 1.0f);
                if (viewState.getOrientation() == EnumC12838l.PIE_LEFT) {
                    c28655q3.m87150e0(-254492830);
                    z17 = z13;
                    z16 = false;
                    m35981N(modifierM3384f, viewState.getPieChart(), viewState.getPieChartContent(), viewState.getOrientation(), viewState.getStyle(), c12847u, null, c28655q3, C9598e.f28134d << 6, 64);
                    m36001d0(viewState.m36039l(), viewState.getCaption(), c23000t1.mo66772c(c2314t2, z17, 1.0f), c28655q3, 0, 0);
                    c28655q3.m87173q(false);
                    c28655q = c28655q3;
                } else {
                    z16 = false;
                    z17 = z13;
                    c28655q3.m87150e0(-253741886);
                    m36001d0(viewState.m36039l(), viewState.getCaption(), c23000t1.mo66772c(c2314t2, z17, 1.0f), c28655q3, 0, 0);
                    m35981N(modifierM3384f, viewState.getPieChart(), viewState.getPieChartContent(), viewState.getOrientation(), viewState.getStyle(), c12847u, null, c28655q3, C9598e.f28134d << 6, 64);
                    c28655q = c28655q3;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z17);
                c28655q.m87173q(z16);
                z15 = z16;
                z14 = z17;
                c28655q3 = c28655q;
            } else {
                c2314t3 = c2314t2;
                c28655q3.m87150e0(-2050449105);
                C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), c2305k, c28655q3, 54);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q3.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q3, c2314t3);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a10);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m18);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N18);
                z14 = z13;
                c28655q3 = c28655q3;
                z15 = false;
                m35981N(AbstractC1102d.m3419p(200, c2314t3), viewState.getPieChart(), viewState.getPieChartContent(), viewState.getOrientation(), viewState.getStyle(), c12847u, null, c28655q3, (C9598e.f28134d << 6) | 6, 64);
                caption = viewState.getCaption();
                if (caption == null) {
                    c28655q3.m87150e0(295918562);
                    c28655q3.m87173q(false);
                } else {
                    c28655q3.m87150e0(295918563);
                    C38072d c38072d4 = C38072d.f163053a;
                    AbstractC30795n.m94707h(caption, AbstractC1099a.m3398t(c2314t3, 0.0f, (z14 ? 1.0f : 0.0f) * f14, 0.0f, 0.0f, 13), c38072d4.m121949b(c28655q3, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q3, 6).getB4(), null, c28655q3, 48, 0, 196600);
                    c28655q3 = c28655q3;
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z14);
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(z15);
            c28655q3.m87173q(z14);
            modifier3 = modifier6;
            function3 = function4;
        } else {
            c28655q3.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q3.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 5, (Object) modifier3, (Object) viewState, (InterfaceC23459e) function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m36023y(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final Integer m36024z(InterfaceC28601c1 interfaceC28601c1) {
        return (Integer) interfaceC28601c1.getValue();
    }
}
