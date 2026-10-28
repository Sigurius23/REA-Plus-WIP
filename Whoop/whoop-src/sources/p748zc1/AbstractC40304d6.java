package p748zc1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4351m;
import dp0.C12246b;
import e61.C12760c;
import e81.AbstractC12823d0;
import e81.AbstractC12829g0;
import e81.C12831h0;
import e81.C12847u;
import e81.EnumC12833i0;
import e93.AbstractC12889b;
import hy0.AbstractC17763k2;
import i93.C18279e;
import i93.InterfaceC18280f;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22399k;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28630j2;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28690z0;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p700bd1.AbstractC42782p;
import p705ea2.C12906g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pz0.AbstractC29641d;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.d6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001aw\u0010\u0014\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\r2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00000\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0016\u0010\u0002\u001a\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001aK\u0010!\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00122\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u0011H\u0003¢\u0006\u0004\b!\u0010\"\u001a5\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012H\u0000¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010*\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0000¢\u0006\u0004\b*\u0010+\u001a\u001f\u0010-\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0000¢\u0006\u0004\b-\u0010+\u001a\u001f\u0010.\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0000¢\u0006\u0004\b.\u0010+\u001a+\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060/2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0000¢\u0006\u0004\b0\u00101\u001a\u0019\u00104\u001a\u0004\u0018\u0001032\u0006\u00102\u001a\u00020\rH\u0000¢\u0006\u0004\b4\u00105\u001a\u001f\u00106\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0000¢\u0006\u0004\b6\u00107\u001a\u0017\u00108\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0000¢\u0006\u0004\b8\u00109\u001a'\u0010=\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0000¢\u0006\u0004\b=\u0010>¨\u0006?"}, m65681d2 = {"Ll83/a0;", "z", "(Landroidx/compose/runtime/Composer;I)V", "", "Le81/i0;", "styles", "", "tickThicknessPercent", "highlightThicknessPercent", "gapAngle", "fillFraction", "Ly3/f;", "frameSize", "", "showContent", "contentFraction", "selectionEnabled", "Lkotlin/Function1;", "", "onSelectionChange", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/util/List;FFFFFZFZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Q", "size", "x", "(FLandroidx/compose/runtime/Composer;I)V", "", "label", "value", "Li93/f;", "valueRange", "steps", "onValueChange", "S", "(Ljava/lang/String;FLi93/f;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "sliceCount", "positiveCount", "sufficientCount", "negativeCount", "e0", "(IIII)Ljava/util/List;", "tickPercent", "Z", "(FF)F", "highlightPercent", "f0", "b0", "Ll83/k;", "Y", "(FF)Ll83/k;", "enabled", "Le81/u;", "d0", "(Z)Le81/u;", "X", "(FI)F", "c0", "(I)F", "min", "max", "stepSize", "a0", "(FFF)I", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40304d6 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m129517A(InterfaceC28601c1 interfaceC28601c1, Integer num) {
        interfaceC28601c1.setValue(num);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m129518B(InterfaceC28601c1 interfaceC28601c1, InterfaceC22997s1 GalleryRowCard, Composer composer, int i13) {
        AbstractC22676k.m65750j(GalleryRowCard, "$this$GalleryRowCard");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h("Selection", null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q, 6, C2886a.f11498d << 18, 196602);
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C40413n5(7, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, zBooleanValue, false, 0L, null, null, (Function1) objM87133R, c28655q, 1572864, 61);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m129519C(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m129520D(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m129521E(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m129522F(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m129523G(InterfaceC28601c1 interfaceC28601c1, InterfaceC22997s1 GalleryRowCard, Composer composer, int i13) {
        AbstractC22676k.m65750j(GalleryRowCard, "$this$GalleryRowCard");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h("Show Content", null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q, 6, C2886a.f11498d << 18, 196602);
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C40413n5(8, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC29641d.m91043e(null, zBooleanValue, false, 0L, null, null, (Function1) objM87133R, c28655q, 1572864, 61);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m129524H(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m129525I(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m129526J(InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
        C28617g1 c28617g1 = (C28617g1) interfaceC28690z1;
        c28617g1.m87023y(m129546b0(c28617g1.m87022x(), f13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m129527K(InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
        C28617g1 c28617g1 = (C28617g1) interfaceC28690z1;
        c28617g1.m87023y(m129554f0(c28617g1.m87022x(), f13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m129528L(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m129529M(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m129530N(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m129531O(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m129532P(int i13, Composer composer, int i14) {
        m129574z(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    public static final void m129533Q(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1338003689);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            m129571w(m129552e0(8, 4, 0, 0), 0.06f, 0.13f, 1.0f, 1.0f, 48.0f, false, 0.0f, false, null, c28655q, 14380464, 768);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40270a5(i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m129534R(int i13, Composer composer, int i14) {
        m129533Q(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: S */
    private static final void m129535S(String str, float f13, InterfaceC18280f interfaceC18280f, int i13, Function1 function1, Composer composer, int i14, int i15) {
        int i16;
        int i17;
        boolean z4;
        int i18;
        C28677v1 c28677v1M87180u;
        int i19;
        int i24;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(577942795);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87153g(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87153g(interfaceC18280f) ? 256 : 128;
        }
        int i25 = i15 & 8;
        if (i25 == 0) {
            if ((i14 & 3072) == 0) {
                i17 = i13;
                i16 |= c28655q.m87149e(i17) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i14 & 24576) == 0) {
                if (c28655q.m87157i(function1)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i24;
            }
            if ((i16 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i25 != 0) {
                    i19 = 0;
                } else {
                    i19 = i17;
                }
                AbstractC22399k.m64475e(str, c28655q, i16 & 14);
                AbstractC17763k2.m50956d(null, false, f13, interfaceC18280f, i19, null, function1, c28655q, ((i16 << 3) & 65408) | ((i16 << 6) & 3670016), 35);
                i18 = i19;
            } else {
                c28655q.m87138X();
                i18 = i17;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12760c(str, f13, interfaceC18280f, i18, function1, i14, i15);
            }
        }
        i16 |= 3072;
        i17 = i13;
        if ((i14 & 24576) == 0) {
            if (c28655q.m87157i(function1)) {
                i24 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i24 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 |= i24;
        }
        if ((i16 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i25 != 0) {
                i19 = 0;
            } else {
                i19 = i17;
            }
            AbstractC22399k.m64475e(str, c28655q, i16 & 14);
            AbstractC17763k2.m50956d(null, false, f13, interfaceC18280f, i19, null, function1, c28655q, ((i16 << 3) & 65408) | ((i16 << 6) & 3670016), 35);
            i18 = i19;
        } else {
            c28655q.m87138X();
            i18 = i17;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12760c(str, f13, interfaceC18280f, i18, function1, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m129536T(String str, float f13, InterfaceC18280f interfaceC18280f, int i13, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m129535S(str, f13, interfaceC18280f, i13, function1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m129537U(Integer num) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m129538V(boolean z4, float f13, float f14, float f15, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87138X();
        } else if (z4) {
            c28655q.m87150e0(-1102565388);
            m129572x(m129542Z(f14, f15) * f13, c28655q, 0);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1102451990);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m129539W(List list, float f13, float f14, float f15, float f16, float f17, boolean z4, float f18, boolean z13, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m129571w(list, f13, f14, f15, f16, f17, z4, f18, z13, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X */
    public static final float m129540X(float f13, int i13) {
        return AbstractC12889b.m36283m(f13, 0.0f, m129548c0(i13));
    }

    /* JADX INFO: renamed from: Y */
    public static final C23465k m129541Y(float f13, float f14) {
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        float f15 = f13 + f14;
        if (f15 <= 0.49f) {
            return f15 < 0.01f ? new C23465k(Float.valueOf(0.01f), Float.valueOf(0.0f)) : new C23465k(Float.valueOf(f13), Float.valueOf(f14));
        }
        float f16 = 0.49f / f15;
        return new C23465k(Float.valueOf(f13 * f16), Float.valueOf(f14 * f16));
    }

    /* JADX INFO: renamed from: Z */
    public static final float m129542Z(float f13, float f14) {
        float f15 = 1.0f - (f14 * 2.0f);
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        return AbstractC12889b.m36283m(f13, 0.0f, f15);
    }

    /* JADX INFO: renamed from: a0 */
    public static final int m129544a0(float f13, float f14, float f15) {
        int iM36258X;
        if (f15 <= 0.0f || f14 <= f13 || (iM36258X = AbstractC12889b.m36258X((f14 - f13) / f15) - 1) < 0) {
            return 0;
        }
        return iM36258X;
    }

    /* JADX INFO: renamed from: b0 */
    public static final float m129546b0(float f13, float f14) {
        float f15 = 0.49f - f14;
        if (f13 > f15) {
            f13 = f15;
        }
        if (f13 < 0.0f) {
            return 0.0f;
        }
        return f13;
    }

    /* JADX INFO: renamed from: c0 */
    public static final float m129548c0(int i13) {
        if (i13 <= 0) {
            return 0.0f;
        }
        return (360.0f / i13) * 0.5f;
    }

    /* JADX INFO: renamed from: d0 */
    public static final C12847u m129550d0(boolean z4) {
        if (z4) {
            return C12847u.INSTANCE.m36083a();
        }
        return null;
    }

    /* JADX INFO: renamed from: e0 */
    public static final List<EnumC12833i0> m129552e0(int i13, int i14, int i15, int i16) {
        EnumC12833i0 enumC12833i0;
        int i17 = 0;
        if (i13 < 0) {
            i13 = 0;
        }
        int iM36284n = AbstractC12889b.m36284n(i14, 0, i13);
        int i18 = i13 - iM36284n;
        int iM36284n2 = AbstractC12889b.m36284n(i15, 0, i18);
        int iM36284n3 = AbstractC12889b.m36284n(i16, 0, i18 - iM36284n2);
        ArrayList arrayList = new ArrayList(i13);
        while (i17 < i13) {
            if (i17 < iM36284n) {
                enumC12833i0 = EnumC12833i0.OPTIMAL;
            } else {
                int i19 = iM36284n + iM36284n2;
                if (i17 < i19) {
                    enumC12833i0 = EnumC12833i0.SUFFICIENT;
                } else {
                    enumC12833i0 = i17 < i19 + iM36284n3 ? EnumC12833i0.OUT_OF_RANGE : EnumC12833i0.NONE;
                }
            }
            arrayList.add(enumC12833i0);
            i17++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public static final float m129554f0(float f13, float f14) {
        float f15 = 0.49f - f14;
        if (f13 > f15) {
            f13 = f15;
        }
        if (f13 < 0.01f) {
            return 0.01f;
        }
        return f13;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015c A[LOOP:0: B:99:0x0156->B:101:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:103:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0121  */
    /* JADX INFO: renamed from: w */
    public static final void m129571w(final List<? extends EnumC12833i0> styles, final float f13, float f14, final float f15, final float f16, final float f17, final boolean z4, final float f18, boolean z13, Function1 function1, Composer composer, final int i13, final int i14) {
        int i15;
        float f19;
        boolean z14;
        int i16;
        int i17;
        Function1 function2;
        int i18;
        int i19;
        boolean z15;
        C28655q c28655q;
        final Function1 function3;
        final boolean z16;
        C28677v1 c28677v1M87180u;
        boolean z17;
        Function1 function4;
        float fFloatValue;
        ArrayList arrayList;
        Iterator<T> it;
        Object objM87133R;
        AbstractC22676k.m65750j(styles, "styles");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1125591585);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(styles) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            f19 = f14;
            i15 |= c28655q2.m87147d(f19) ? 256 : 128;
        } else {
            f19 = f14;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87147d(f15) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87147d(f16) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q2.m87147d(f17) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q2.m87147d(f18) ? 8388608 : 4194304;
        }
        int i24 = i14 & 256;
        if (i24 == 0) {
            if ((i13 & 100663296) == 0) {
                z14 = z13;
                i15 |= c28655q2.m87155h(z14) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
            }
            i16 = i14 & 512;
            if (i16 != 0) {
                i15 |= 805306368;
                i17 = 100663296;
                function2 = function1;
            } else {
                i17 = 100663296;
                function2 = function1;
                if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i15 |= i18;
                }
            }
            i19 = i15;
            if ((i15 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i19 & 1, z15)) {
                if (i24 != 0) {
                    z17 = false;
                } else {
                    z17 = z14;
                }
                if (i16 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C40473t5(2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                C23465k c23465kM129541Y = m129541Y(f13, f14);
                final float fFloatValue2 = ((Number) c23465kM129541Y.f92937w).floatValue();
                fFloatValue = ((Number) c23465kM129541Y.f92938x).floatValue();
                Modifier modifierM3419p = AbstractC1102d.m3419p(f17, C2314t.f9131w);
                c28655q2.m87150e0(638261790);
                List<? extends EnumC12833i0> list = styles;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C12831h0(AbstractC12829g0.m35965a((EnumC12833i0) it.next(), c28655q2, 0), null));
                    z17 = z17;
                    fFloatValue = fFloatValue;
                }
                boolean z18 = z17;
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                AbstractC12823d0.m35939h(modifierM3419p, arrayList, fFloatValue2, fFloatValue, m129540X(f15, styles.size()), f16, m129550d0(z18), function4, AbstractC37817c.m121344e(-925752328, c28655q2, new InterfaceC4351m() { // from class: zc1.a6
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40304d6.m129538V(z4, f17, f18, fFloatValue2, (Composer) obj, iIntValue);
                    }
                }), c28655q, ((i19 << 3) & 458752) | i17 | (29360128 & (i19 >> 6)), 0);
                z16 = z18;
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
                z16 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final float f24 = f19;
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: zc1.b6
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC40304d6.m129539W(styles, f13, f24, f15, f16, f17, z4, f18, z16, function3, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    }
                };
            }
        }
        i15 |= 100663296;
        z14 = z13;
        i16 = i14 & 512;
        if (i16 != 0) {
            i15 |= 805306368;
            i17 = 100663296;
            function2 = function1;
        } else {
            i17 = 100663296;
            function2 = function1;
            if ((i13 & 805306368) == 0) {
                if (c28655q2.m87157i(function2)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i15 |= i18;
            }
        }
        i19 = i15;
        if ((i15 & 306783379) != 306783378) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q2.m87135U(i19 & 1, z15)) {
            if (i24 != 0) {
                z17 = false;
            } else {
                z17 = z14;
            }
            if (i16 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C40473t5(2);
                    c28655q2.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            C23465k c23465kM129541Y2 = m129541Y(f13, f14);
            final float fFloatValue3 = ((Number) c23465kM129541Y2.f92937w).floatValue();
            fFloatValue = ((Number) c23465kM129541Y2.f92938x).floatValue();
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(f17, C2314t.f9131w);
            c28655q2.m87150e0(638261790);
            List<? extends EnumC12833i0> list2 = styles;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new C12831h0(AbstractC12829g0.m35965a((EnumC12833i0) it.next(), c28655q2, 0), null));
                z17 = z17;
                fFloatValue = fFloatValue;
            }
            boolean z19 = z17;
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            AbstractC12823d0.m35939h(modifierM3419p2, arrayList, fFloatValue3, fFloatValue, m129540X(f15, styles.size()), f16, m129550d0(z19), function4, AbstractC37817c.m121344e(-925752328, c28655q2, new InterfaceC4351m() { // from class: zc1.a6
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC40304d6.m129538V(z4, f17, f18, fFloatValue3, (Composer) obj, iIntValue);
                }
            }), c28655q, ((i19 << 3) & 458752) | i17 | (29360128 & (i19 >> 6)), 0);
            z16 = z19;
            function3 = function4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
            z16 = z14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final float f25 = f19;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: zc1.b6
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC40304d6.m129539W(styles, f13, f25, f15, f16, f17, z4, f18, z16, function3, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
        }
    }

    /* JADX INFO: renamed from: x */
    private static final void m129572x(float f13, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(352664488);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(f13, C2314t.f9131w), AbstractC33253j.f138651a);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, c38072d.m121949b(c28655q, i15).getWhite10(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
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
            AbstractC30795n.m94707h("Content", null, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 6, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12246b(f13, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m129573y(float f13, int i13, Composer composer, int i14) {
        m129572x(f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    public static final void m129574z(Composer composer, int i13) {
        String strValueOf;
        final C28617g1 c28617g1;
        final C28617g1 c28617g2;
        C28617g1 c28617g3;
        int i14;
        int i15;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1894324174);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30468v(8.0f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z0 = (InterfaceC28690z0) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11266d.m30468v(4.0f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z1 = (InterfaceC28690z0) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC11266d.m30468v(0.0f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z2 = (InterfaceC28690z0) objM87133R3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC11266d.m30468v(0.0f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z3 = (InterfaceC28690z0) objM87133R4;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC11266d.m30468v(0.06f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z4 = (InterfaceC28690z0) objM87133R5;
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC11266d.m30468v(0.13f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z5 = (InterfaceC28690z0) objM87133R6;
            Object objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC11266d.m30468v(300.0f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z6 = (InterfaceC28690z0) objM87133R7;
            Object objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R8);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R8;
            Object objM87133R9 = c28655q.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = AbstractC11266d.m30468v(0.5f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z7 = (InterfaceC28690z0) objM87133R9;
            Object objM87133R10 = c28655q.m87133R();
            if (objM87133R10 == c28676v0) {
                objM87133R10 = AbstractC11266d.m30468v(1.0f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z8 = (InterfaceC28690z0) objM87133R10;
            Object objM87133R11 = c28655q.m87133R();
            if (objM87133R11 == c28676v0) {
                objM87133R11 = AbstractC11266d.m30468v(1.0f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z9 = (InterfaceC28690z0) objM87133R11;
            Object objM87133R12 = c28655q.m87133R();
            if (objM87133R12 == c28676v0) {
                objM87133R12 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R12);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R12;
            Object objM87133R13 = c28655q.m87133R();
            if (objM87133R13 == c28676v0) {
                objM87133R13 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R13);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R13;
            C28617g1 c28617g4 = (C28617g1) interfaceC28690z0;
            int iM36258X = AbstractC12889b.m36258X(c28617g4.m87022x());
            C28617g1 c28617g5 = (C28617g1) interfaceC28690z1;
            C28617g1 c28617g6 = (C28617g1) interfaceC28690z2;
            C28617g1 c28617g7 = (C28617g1) interfaceC28690z3;
            List<EnumC12833i0> listM129552e0 = m129552e0(iM36258X, AbstractC12889b.m36258X(c28617g5.m87022x()), AbstractC12889b.m36258X(c28617g6.m87022x()), AbstractC12889b.m36258X(c28617g7.m87022x()));
            float fM129548c0 = m129548c0(iM36258X);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * 2, AbstractC1102d.m3409f(1.0f, c2314t));
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
            C28617g1 c28617g8 = (C28617g1) interfaceC28690z4;
            float fM87022x = c28617g8.m87022x();
            C28617g1 c28617g9 = (C28617g1) interfaceC28690z5;
            float fM87022x2 = c28617g9.m87022x();
            C28617g1 c28617g10 = (C28617g1) interfaceC28690z8;
            float fM87022x3 = c28617g10.m87022x();
            C28617g1 c28617g11 = (C28617g1) interfaceC28690z9;
            float fM87022x4 = c28617g11.m87022x();
            C28617g1 c28617g12 = (C28617g1) interfaceC28690z6;
            float fM87022x5 = c28617g12.m87022x();
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            C28617g1 c28617g13 = (C28617g1) interfaceC28690z7;
            float fM87022x6 = c28617g13.m87022x();
            boolean zBooleanValue2 = ((Boolean) interfaceC28601c2.getValue()).booleanValue();
            Object objM87133R14 = c28655q.m87133R();
            if (objM87133R14 == c28676v0) {
                objM87133R14 = new C40413n5(6, interfaceC28601c3);
                c28655q.m87172p0(objM87133R14);
            }
            m129571w(listM129552e0, fM87022x, fM87022x2, fM87022x3, fM87022x4, fM87022x5, zBooleanValue, fM87022x6, zBooleanValue2, (Function1) objM87133R14, c28655q, 805306368, 0);
            c28655q = c28655q;
            float f13 = 4;
            AbstractC18489d0.m53380u(f13, f13, c2314t, c28655q);
            AbstractC22399k.m64473c("Controls", c28655q, 6);
            AbstractC42782p.m8885c(AbstractC37817c.m121344e(-385743189, c28655q, new C12906g(17, interfaceC28601c2)), c28655q, 6);
            Integer num = (Integer) interfaceC28601c3.getValue();
            if (num == null || (strValueOf = String.valueOf(num.intValue())) == null) {
                strValueOf = "none";
            }
            AbstractC22399k.m64475e("Held Slice: ".concat(strValueOf), c28655q, 0);
            float f14 = 100;
            String strM8296i = AbstractC2875y.m8296i(AbstractC12889b.m36258X(c28617g8.m87022x() * f14), "Slice Thickness: ", "%");
            float fM87022x7 = c28617g8.m87022x();
            C18279e c18279e = new C18279e(0.01f, 0.49f);
            Object objM87133R15 = c28655q.m87133R();
            if (objM87133R15 == c28676v0) {
                final int i17 = 0;
                c28617g1 = c28617g8;
                c28617g2 = c28617g9;
                objM87133R15 = new Function1() { // from class: zc1.c6
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i18 = i17;
                        float fFloatValue = ((Float) obj).floatValue();
                        switch (i18) {
                            case 0:
                                return AbstractC40304d6.m129526J(c28617g1, c28617g2, fFloatValue);
                            default:
                                return AbstractC40304d6.m129527K(c28617g1, c28617g2, fFloatValue);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R15);
            } else {
                c28617g1 = c28617g8;
                c28617g2 = c28617g9;
            }
            final C28617g1 c28617g14 = c28617g2;
            m129535S(strM8296i, fM87022x7, c18279e, 0, (Function1) objM87133R15, c28655q, 24576, 8);
            String strM8296i2 = AbstractC2875y.m8296i(AbstractC12889b.m36258X(c28617g14.m87022x() * f14), "Shadow Thickness: ", "%");
            float fM87022x8 = c28617g14.m87022x();
            C18279e c18279e2 = new C18279e(0.0f, 0.48000002f);
            Object objM87133R16 = c28655q.m87133R();
            if (objM87133R16 == c28676v0) {
                final int i18 = 1;
                objM87133R16 = new Function1() { // from class: zc1.c6
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i19 = i18;
                        float fFloatValue = ((Float) obj).floatValue();
                        switch (i19) {
                            case 0:
                                return AbstractC40304d6.m129526J(c28617g14, c28617g1, fFloatValue);
                            default:
                                return AbstractC40304d6.m129527K(c28617g14, c28617g1, fFloatValue);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R16);
            }
            m129535S(strM8296i2, fM87022x8, c18279e2, 0, (Function1) objM87133R16, c28655q, 24576, 8);
            float fM87022x9 = c28617g10.m87022x();
            if (fM87022x9 > fM129548c0) {
                fM87022x9 = fM129548c0;
            }
            String strM8296i3 = AbstractC2875y.m8296i(AbstractC12889b.m36258X(fM87022x9), "Gap Angle: ", "°");
            float fM87022x10 = c28617g10.m87022x();
            float f15 = fM87022x10 > fM129548c0 ? fM129548c0 : fM87022x10;
            C18279e c18279e3 = new C18279e(0.0f, fM129548c0);
            Object objM87133R17 = c28655q.m87133R();
            if (objM87133R17 == c28676v0) {
                objM87133R17 = new C28630j2(c28617g10, 10);
                c28655q.m87172p0(objM87133R17);
            }
            m129535S(strM8296i3, f15, c18279e3, 0, (Function1) objM87133R17, c28655q, 24576, 8);
            String strM8295h = AbstractC2875y.m8295h(iM36258X, "Number of Slices: ");
            float fM87022x11 = c28617g4.m87022x();
            C18279e c18279e4 = new C18279e(1.0f, 200.0f);
            int iM129544a0 = m129544a0(1.0f, 200.0f, 1.0f);
            Object objM87133R18 = c28655q.m87133R();
            if (objM87133R18 == c28676v0) {
                c28617g3 = c28617g4;
                objM87133R18 = new C28630j2(c28617g3, 11);
                c28655q.m87172p0(objM87133R18);
            } else {
                c28617g3 = c28617g4;
            }
            m129535S(strM8295h, fM87022x11, c18279e4, iM129544a0, (Function1) objM87133R18, c28655q, 24576, 0);
            String strM8296i4 = AbstractC2875y.m8296i(AbstractC12889b.m36258X(c28617g12.m87022x()), "Frame Size: ", "dp");
            float fM87022x12 = c28617g12.m87022x();
            C18279e c18279e5 = new C18279e(100.0f, 400.0f);
            int iM129544a1 = m129544a0(100.0f, 400.0f, 10.0f);
            Object objM87133R19 = c28655q.m87133R();
            if (objM87133R19 == c28676v0) {
                objM87133R19 = new C28630j2(c28617g12, 4);
                c28655q.m87172p0(objM87133R19);
            }
            m129535S(strM8296i4, fM87022x12, c18279e5, iM129544a1, (Function1) objM87133R19, c28655q, 24576, 0);
            List<EnumC12833i0> list = listM129552e0;
            boolean z4 = list instanceof Collection;
            if (z4 && list.isEmpty()) {
                i14 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i14 = 0;
                while (it.hasNext()) {
                    if (((EnumC12833i0) it.next()) == EnumC12833i0.OPTIMAL && (i14 = i14 + 1) < 0) {
                        AbstractC37056f.m118976c0();
                        throw null;
                    }
                }
            }
            String strM8295h2 = AbstractC2875y.m8295h(i14, "Positive Slices: ");
            float fM87022x13 = c28617g5.m87022x();
            C18279e c18279e6 = new C18279e(0.0f, c28617g3.m87022x());
            int iM129544a2 = m129544a0(0.0f, c28617g3.m87022x(), 1.0f);
            Object objM87133R20 = c28655q.m87133R();
            if (objM87133R20 == c28676v0) {
                objM87133R20 = new C28630j2(c28617g5, 5);
                c28655q.m87172p0(objM87133R20);
            }
            m129535S(strM8295h2, fM87022x13, c18279e6, iM129544a2, (Function1) objM87133R20, c28655q, 24576, 0);
            if (z4 && list.isEmpty()) {
                i15 = 0;
            } else {
                Iterator<T> it3 = list.iterator();
                i15 = 0;
                while (it3.hasNext()) {
                    if (((EnumC12833i0) it3.next()) == EnumC12833i0.SUFFICIENT && (i15 = i15 + 1) < 0) {
                        AbstractC37056f.m118976c0();
                        throw null;
                    }
                }
            }
            String strM8295h3 = AbstractC2875y.m8295h(i15, "Sufficient Slices: ");
            float fM87022x14 = c28617g6.m87022x();
            C18279e c18279e7 = new C18279e(0.0f, c28617g3.m87022x());
            int iM129544a3 = m129544a0(0.0f, c28617g3.m87022x(), 1.0f);
            Object objM87133R21 = c28655q.m87133R();
            if (objM87133R21 == c28676v0) {
                objM87133R21 = new C28630j2(c28617g6, 6);
                c28655q.m87172p0(objM87133R21);
            }
            m129535S(strM8295h3, fM87022x14, c18279e7, iM129544a3, (Function1) objM87133R21, c28655q, 24576, 0);
            if (z4 && list.isEmpty()) {
                i16 = 0;
            } else {
                Iterator<T> it4 = list.iterator();
                int i19 = 0;
                while (it4.hasNext()) {
                    if (((EnumC12833i0) it4.next()) == EnumC12833i0.OUT_OF_RANGE && (i19 = i19 + 1) < 0) {
                        AbstractC37056f.m118976c0();
                        throw null;
                    }
                }
                i16 = i19;
            }
            String strM8295h4 = AbstractC2875y.m8295h(i16, "Negative Slices: ");
            float fM87022x15 = c28617g7.m87022x();
            C18279e c18279e8 = new C18279e(0.0f, c28617g3.m87022x());
            int iM129544a4 = m129544a0(0.0f, c28617g3.m87022x(), 1.0f);
            Object objM87133R22 = c28655q.m87133R();
            if (objM87133R22 == c28676v0) {
                objM87133R22 = new C28630j2(c28617g7, 7);
                c28655q.m87172p0(objM87133R22);
            }
            m129535S(strM8295h4, fM87022x15, c18279e8, iM129544a4, (Function1) objM87133R22, c28655q, 24576, 0);
            String strM8296i5 = AbstractC2875y.m8296i(AbstractC12889b.m36258X(c28617g11.m87022x() * f14), "Fill Fraction: ", "%");
            float fM87022x16 = c28617g11.m87022x();
            C18279e c18279e9 = new C18279e(0.0f, 1.0f);
            Object objM87133R23 = c28655q.m87133R();
            if (objM87133R23 == c28676v0) {
                objM87133R23 = new C28630j2(c28617g11, 8);
                c28655q.m87172p0(objM87133R23);
            }
            m129535S(strM8296i5, fM87022x16, c18279e9, 0, (Function1) objM87133R23, c28655q, 24576, 8);
            AbstractC42782p.m8885c(AbstractC37817c.m121344e(-1769602476, c28655q, new C12906g(16, interfaceC28601c1)), c28655q, 6);
            String strM8296i6 = AbstractC2875y.m8296i(AbstractC12889b.m36258X(c28617g13.m87022x() * f14), "Content Size: ", "%");
            float fM87022x17 = c28617g13.m87022x();
            C18279e c18279e10 = new C18279e(0.0f, 1.0f);
            Object objM87133R24 = c28655q.m87133R();
            if (objM87133R24 == c28676v0) {
                objM87133R24 = new C28630j2(c28617g13, 9);
                c28655q.m87172p0(objM87133R24);
            }
            m129535S(strM8296i6, fM87022x17, c18279e10, 0, (Function1) objM87133R24, c28655q, 24576, 8);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40270a5(i13, 27);
        }
    }
}
