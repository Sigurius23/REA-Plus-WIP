package n21;

import ai1.C0910b;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import b91.EnumC2888c;
import c51.C4231h;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import h71.C16987d;
import hy0.AbstractC17732d;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import i91.AbstractC18254h;
import i91.AbstractC18255i;
import i91.C18251e;
import i91.C18253g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l80.C23434k;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import mx1.C26009o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p181h2.C16620e;
import p208i2.AbstractC17876d;
import p208i2.AbstractC17911t;
import p208i2.C17893k;
import p208i2.C17919x;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p294l3.C23277r0;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p699b70.C2775a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import qz0.AbstractC30795n;
import t61.AbstractC33556f;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: n21.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aw\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001ai\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010 \u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!\u001a\u0019\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010$\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010#\u001a!\u0010&\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\fH\u0007¢\u0006\u0004\b&\u0010'\u001a!\u0010(\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\fH\u0007¢\u0006\u0004\b(\u0010'¨\u0006)"}, m65681d2 = {"Li91/a;", "firstColor", "Lcom/whoop/design/util/TextResource;", "firstLabel", "Ln21/i;", "firstShape", "Lgz0/m0;", "firstIcon", "secondColor", "secondLabel", "secondShape", "secondIcon", "Li2/x;", "textColor", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "u", "(Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "legendColor", "legendText", "shape", "icon", "Lkotlin/Function1;", "", "onTextOverflow", "Lb91/c;", "legendTextStyle", "n", "(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;JLkotlin/jvm/functions/Function1;Lb91/c;Landroidx/compose/runtime/Composer;II)V", "Li2/t;", "brush", "B", "(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;", "l", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "color", "r", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "y", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26194h {

    /* JADX INFO: renamed from: n21.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f103901w = new a();

        /* JADX INFO: renamed from: a */
        public final long m77793a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m77793a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: n21.h$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f103902w = new b();

        /* JADX INFO: renamed from: a */
        public final long m77794a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getGreyL1();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m77794a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: n21.h$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f103903w = new c();

        /* JADX INFO: renamed from: a */
        public final long m77795a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m77795a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: n21.h$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f103904a;

        static {
            int[] iArr = new int[EnumC26195i.values().length];
            try {
                iArr[EnumC26195i.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC26195i.SQUARE_WITH_CORNERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC26195i.CIRCLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC26195i.MEDIUM_CIRCLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC26195i.RECTANGLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC26195i.RECTANGLE_SMALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC26195i.CAPSULE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC26195i.DASHED_LINE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC26195i.THIN_CAPSULE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC26195i.BAR_AND_CAPSULE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC26195i.DASHED_CIRCLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC26195i.THIN_CIRCLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f103904a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m77764A(Modifier modifier, long j7, int i13, int i14, Composer composer, int i15) {
        m77791y(modifier, j7, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    public static final Modifier m77765B(Modifier modifier, AbstractC17911t brush) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(brush, "brush");
        return AbstractC1125a.m3480c(modifier, new C4231h(brush, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m77766C(AbstractC17911t abstractC17911t, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        Canvas canvasM51433a = AbstractC17876d.m51433a(c0238p0.f815w.f85852x.m716w());
        canvasM51433a.saveLayer(null, null);
        c0238p0.m728a();
        InterfaceC22131e.m63385u(drawWithContent, abstractC17911t, 0L, 0L, 0.99f, null, 5, 54);
        canvasM51433a.restore();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m77778l(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1154639615);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier = c2314t;
            }
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
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
            float f13 = 4;
            float f14 = 3 * f13;
            float f15 = ((float) 0.5d) * f13;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3421r(c2314t, 2 * f13, f14), AbstractC33253j.m105489e(f15));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = a.f103901w;
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM52565c = AbstractC18249c.m52565c(modifierM118994r, AbstractC18249c.m52574l((Function1) objM87133R));
            C2307m c2307m = C2299e.f9102E;
            C1100b c1100b = C1100b.f4583a;
            AbstractC22989q.m66760a(c1100b.mo3400a(modifierM52565c, c2307m), c28655q, 0);
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1102d.m3421r(c2314t, f14, f15), AbstractC33253j.m105489e(f14));
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = b.f103902w;
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22989q.m66760a(c1100b.mo3400a(AbstractC18249c.m52565c(modifierM118994r2, AbstractC18249c.m52574l((Function1) objM87133R2)), c2307m), c28655q, 0);
            c28655q.m87173q(true);
            AbstractC38963t7.m124386p(1, 8, c2314t, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 20, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m77779m(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m77778l(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:135:0x0206  */
    /* JADX WARN: Code duplicated, block: B:136:0x023c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0246  */
    /* JADX WARN: Code duplicated, block: B:140:0x0280  */
    /* JADX WARN: Code duplicated, block: B:142:0x0289  */
    /* JADX WARN: Code duplicated, block: B:144:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:148:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:149:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:154:0x033a  */
    /* JADX WARN: Code duplicated, block: B:156:0x0342  */
    /* JADX WARN: Code duplicated, block: B:158:0x0355  */
    /* JADX WARN: Code duplicated, block: B:159:0x038c  */
    /* JADX WARN: Code duplicated, block: B:161:0x0390  */
    /* JADX WARN: Code duplicated, block: B:164:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:166:0x03de  */
    /* JADX WARN: Code duplicated, block: B:167:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:168:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:170:0x042f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0433  */
    /* JADX WARN: Code duplicated, block: B:178:0x0454  */
    /* JADX WARN: Code duplicated, block: B:181:0x0471  */
    /* JADX WARN: Code duplicated, block: B:182:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:183:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:184:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:186:0x050a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0549  */
    /* JADX WARN: Code duplicated, block: B:189:0x0550  */
    /* JADX WARN: Code duplicated, block: B:191:0x0593  */
    /* JADX WARN: Code duplicated, block: B:193:0x059c  */
    /* JADX WARN: Code duplicated, block: B:195:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:196:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:198:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:200:0x0631  */
    /* JADX WARN: Code duplicated, block: B:202:0x063a  */
    /* JADX WARN: Code duplicated, block: B:203:0x0663  */
    /* JADX WARN: Code duplicated, block: B:207:0x069a  */
    /* JADX WARN: Code duplicated, block: B:208:0x069c  */
    /* JADX WARN: Code duplicated, block: B:212:0x06a5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static final void m77780n(Modifier modifier, final AbstractC18247a legendColor, final TextResource legendText, EnumC26195i enumC26195i, EnumC16313m0 enumC16313m0, long j7, Function1 function1, EnumC2888c enumC2888c, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        final EnumC26195i enumC26195i2;
        final EnumC16313m0 enumC16313m1;
        final Modifier modifier3;
        C28655q c28655q;
        final Function1 function3;
        final long j13;
        final EnumC2888c enumC2888c2;
        EnumC26195i enumC26195i3;
        EnumC16313m0 enumC16313m2;
        long brandWhite;
        EnumC2888c enumC2888c3;
        float f13;
        EnumC26195i enumC26195i4;
        int i16;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        EnumC16313m0 enumC16313m3;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        C28655q c28655q2;
        boolean z4;
        boolean z13;
        C28655q c28655q3;
        AbstractC18254h abstractC18254hM52584a;
        AbstractC18254h abstractC18254hM52584a2;
        C28655q c28655q4;
        boolean z14;
        C28655q c28655q5;
        C28655q c28655q6;
        int iHashCode2;
        C28655q c28655q7;
        AbstractC18254h abstractC18254hM52584a3;
        AbstractC18254h abstractC18254hM52584a4;
        C28655q c28655q8;
        C28655q c28655q9;
        C28655q c28655q10;
        boolean z15;
        boolean z16;
        Object objM87133R;
        AbstractC18254h abstractC18254hM52584a5;
        C2314t c2314t;
        boolean z17;
        int i17;
        C28655q c28655q11;
        AbstractC22676k.m65750j(legendColor, "legendColor");
        AbstractC22676k.m65750j(legendText, "legendText");
        C28655q c28655q12 = (C28655q) composer;
        c28655q12.m87154g0(-695009402);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q12.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q12.m87153g(legendColor) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q12.m87153g(legendText) ? 256 : 128;
        }
        int i19 = i14 & 8;
        if (i19 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q12.m87149e(enumC26195i == null ? -1 : enumC26195i.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i24 = i14 & 16;
        if (i24 != 0) {
            i15 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i15 |= c28655q12.m87149e(enumC16313m0 == null ? -1 : enumC16313m0.ordinal()) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= ((i14 & 32) == 0 && c28655q12.m87151f(j7)) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i25 = i14 & 64;
        if (i25 != 0) {
            i15 |= 1572864;
            function2 = function1;
        } else {
            function2 = function1;
            if ((i13 & 1572864) == 0) {
                i15 |= c28655q12.m87157i(function2) ? 1048576 : 524288;
            }
        }
        int i26 = i14 & 128;
        if (i26 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            i15 |= c28655q12.m87149e(enumC2888c == null ? -1 : enumC2888c.ordinal()) ? 8388608 : 4194304;
        }
        if (c28655q12.m87135U(i15 & 1, (4793491 & i15) != 4793490)) {
            c28655q12.m87140Z();
            int i27 = i13 & 1;
            C2314t c2314t2 = C2314t.f9131w;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i27 == 0 || c28655q12.m87118C()) {
                if (i18 != 0) {
                    modifier2 = c2314t2;
                }
                enumC26195i3 = i19 != 0 ? EnumC26195i.CIRCLE : enumC26195i;
                enumC16313m2 = i24 != 0 ? null : enumC16313m0;
                if ((i14 & 32) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q12, 6).getBrandWhite();
                    i15 &= -458753;
                } else {
                    brandWhite = j7;
                }
                if (i25 != 0) {
                    Object objM87133R2 = c28655q12.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C26009o(13);
                        c28655q12.m87172p0(objM87133R2);
                    }
                    function2 = (Function1) objM87133R2;
                }
                if (i26 != 0) {
                    enumC2888c3 = EnumC2888c.H5;
                }
                c28655q12.m87175r();
                f13 = 8;
                Modifier modifierMo3471e = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, ((float) 1.25d) * f13, 0.0f, 11).mo3471e(modifier2);
                enumC26195i4 = enumC26195i3;
                Modifier modifier4 = modifier2;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q12, 48);
                i16 = i15;
                iHashCode = Long.hashCode(c28655q12.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q12.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q12, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q12.m87158i0();
                enumC16313m3 = enumC16313m2;
                if (c28655q12.f115903S) {
                    c28655q12.m87163l(interfaceC4339a);
                } else {
                    c28655q12.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q12, c0209i, c22994r1M66759a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q12, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q12.f115903S || !AbstractC22676k.m65745e(c28655q12.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q12, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q12, c0209i4, modifierM118962N);
                if (enumC16313m3 != null) {
                    c28655q12.m87150e0(-6057017);
                    abstractC18254hM52584a5 = AbstractC18255i.m52584a(legendColor, c28655q12, (i16 >> 3) & 14);
                    if (abstractC18254hM52584a5 instanceof C18253g) {
                        c28655q12.m87150e0(-5910201);
                        Modifier modifierM3419p = AbstractC1102d.m3419p(3 * 4, c2314t2);
                        long jM52583a = ((C18253g) abstractC18254hM52584a5).getColor();
                        C27430e c27430eM107874S = AbstractC34132o.m107874S(enumC16313m3.toWhoopIcon(), c28655q12, 6);
                        z17 = false;
                        c2314t = c2314t2;
                        i17 = 1;
                        AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, jM52583a, c28655q12, 432, 0);
                        c28655q12.m87173q(false);
                        c28655q11 = c28655q12;
                    } else {
                        c2314t = c2314t2;
                        z17 = false;
                        i17 = 1;
                        if (abstractC18254hM52584a5 instanceof C18251e) {
                            throw AbstractC11895b.m32003v(-1385666484, c28655q12, false);
                        }
                        c28655q12.m87150e0(-5541208);
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m3.toWhoopIcon(), c28655q12, 6), null, m77765B(AbstractC1102d.m3419p(3 * 4, c2314t), ((C18251e) abstractC18254hM52584a5).getBrush()), C17919x.f69637n, c28655q12, 3120, 0);
                        c28655q11 = c28655q12;
                        c28655q11.m87173q(false);
                    }
                    AbstractC18489d0.m53381v(i17, f13, c2314t, c28655q11, z17);
                    z4 = z17;
                    c28655q10 = c28655q11;
                    z15 = i17;
                } else {
                    c28676v0 = c28676v0;
                    c28655q2 = c28655q12;
                    z4 = false;
                    c28655q2.m87150e0(-4879513);
                    switch (d.f103904a[enumC26195i4.ordinal()]) {
                        case 1:
                            z4 = false;
                            C28655q c28655q13 = c28655q2;
                            c28676v0 = c28676v0;
                            z13 = true;
                            c28655q13.m87150e0(-5005063);
                            AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3419p(3 * 4, c2314t2), legendColor), c28655q13, 0);
                            AbstractC18489d0.m53381v(1, f13, c2314t2, c28655q13, false);
                            c28655q6 = c28655q13;
                            c28655q6.m87173q(z4);
                            z15 = z13;
                            c28655q10 = c28655q6;
                            break;
                        case 2:
                            C28655q c28655q14 = c28655q2;
                            c28676v0 = c28676v0;
                            z13 = true;
                            c28655q14.m87150e0(-4696427);
                            Modifier modifierM52565c = AbstractC18249c.m52565c(AbstractC1102d.m3419p(3 * 4, AbstractC37056f.m118994r(c2314t2, AbstractC33253j.m105489e(2))), legendColor);
                            z4 = false;
                            AbstractC22989q.m66760a(modifierM52565c, c28655q14, 0);
                            AbstractC18489d0.m53381v(1, f13, c2314t2, c28655q14, false);
                            c28655q6 = c28655q14;
                            c28655q6.m87173q(z4);
                            z15 = z13;
                            c28655q10 = c28655q6;
                            break;
                        case 3:
                            c28655q3 = c28655q2;
                            c28676v0 = c28676v0;
                            z13 = true;
                            c28655q3.m87150e0(-4320242);
                            abstractC18254hM52584a = AbstractC18255i.m52584a(legendColor, c28655q3, (i16 >> 3) & 14);
                            if (abstractC18254hM52584a instanceof C18253g) {
                                c28655q3.m87150e0(-4169148);
                                AbstractC33556f.m105964c(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * f13, 0.0f, 11), ((C18253g) abstractC18254hM52584a).getColor(), 2 * 4, null, c28655q3, 390, 8);
                                c28655q3.m87173q(false);
                                z4 = false;
                            } else {
                                if (abstractC18254hM52584a instanceof C18251e) {
                                    throw AbstractC11895b.m32003v(-1385609912, c28655q3, false);
                                }
                                c28655q3.m87150e0(-3951497);
                                AbstractC33556f.m105964c(m77765B(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * f13, 0.0f, 11), ((C18251e) abstractC18254hM52584a).getBrush()), C17919x.f69637n, 2 * 4, null, c28655q3, 432, 8);
                                z4 = false;
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(z4);
                            c28655q6 = c28655q3;
                            c28655q6.m87173q(z4);
                            z15 = z13;
                            c28655q10 = c28655q6;
                            break;
                        case 4:
                            c28655q2.m87150e0(-3468114);
                            abstractC18254hM52584a2 = AbstractC18255i.m52584a(legendColor, c28655q2, (i16 >> 3) & 14);
                            if (abstractC18254hM52584a2 instanceof C18253g) {
                                c28655q2.m87150e0(-3317020);
                                z14 = true;
                                AbstractC33556f.m105964c(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * f13, 0.0f, 11), ((C18253g) abstractC18254hM52584a2).getColor(), 3 * 4, null, c28655q2, 390, 8);
                                C28655q c28655q15 = c28655q2;
                                c28655q15.m87173q(false);
                                z4 = false;
                                c28655q5 = c28655q15;
                            } else {
                                c28655q4 = c28655q2;
                                z14 = true;
                                if (abstractC18254hM52584a2 instanceof C18251e) {
                                    throw AbstractC11895b.m32003v(-1385582424, c28655q4, false);
                                }
                                c28655q4.m87150e0(-3099369);
                                AbstractC33556f.m105964c(m77765B(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * f13, 0.0f, 11), ((C18251e) abstractC18254hM52584a2).getBrush()), C17919x.f69637n, 3 * 4, null, c28655q4, 432, 8);
                                z4 = false;
                                c28655q4.m87173q(false);
                                c28655q5 = c28655q4;
                            }
                            c28655q5.m87173q(z4);
                            z13 = z14;
                            c28655q6 = c28655q5;
                            c28655q6.m87173q(z4);
                            z15 = z13;
                            c28655q10 = c28655q6;
                            break;
                        case 5:
                            c28655q2.m87150e0(-2633594);
                            float f14 = 2;
                            float f15 = 4;
                            AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(f15 * f15, AbstractC1102d.m3411h(f14 * f15, AbstractC37056f.m118994r(c2314t2, AbstractC33253j.m105489e(f14)))), legendColor), c28655q2, 0);
                            AbstractC18489d0.m53381v(1, f13, c2314t2, c28655q2, false);
                            c28655q6 = c28655q2;
                            c28676v0 = c28676v0;
                            z4 = false;
                            z13 = true;
                            c28655q6.m87173q(z4);
                            z15 = z13;
                            c28655q10 = c28655q6;
                            break;
                        case 6:
                            c28655q2.m87150e0(-2215962);
                            float f16 = 1;
                            float f17 = 4;
                            AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(3 * f17, AbstractC1102d.m3411h(f16 * f17, AbstractC37056f.m118994r(c2314t2, AbstractC33253j.m105489e(f16)))), legendColor), c28655q2, 0);
                            AbstractC18489d0.m53381v(f16, f13, c2314t2, c28655q2, false);
                            c28655q6 = c28655q2;
                            c28676v0 = c28676v0;
                            z4 = false;
                            z13 = true;
                            c28655q6.m87173q(z4);
                            z15 = z13;
                            c28655q10 = c28655q6;
                            break;
                        case 7:
                            c28655q2.m87150e0(-1806235);
                            float f18 = 4;
                            AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(f18 * f18, AbstractC1102d.m3411h(2 * f18, AbstractC37056f.m118994r(c2314t2, AbstractC33253j.m105489e(25)))), legendColor), c28655q2, 0);
                            z13 = true;
                            AbstractC18489d0.m53381v(1, f13, c2314t2, c28655q2, false);
                            c28655q6 = c28655q2;
                            c28676v0 = c28676v0;
                            z4 = false;
                            c28655q6.m87173q(z4);
                            z15 = z13;
                            c28655q10 = c28655q6;
                            break;
                        case 8:
                            c28655q2.m87150e0(-1392292);
                            float f19 = 4;
                            Modifier modifierM3424u = AbstractC1102d.m3424u(f19 * f19, AbstractC1102d.m3411h(((float) 0.5d) * f19, c2314t2));
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3424u);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(interfaceC4339a);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
                            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                            AbstractC17732d.m50818c(legendColor, c28655q2, (i16 >> 3) & 14);
                            c28655q2.m87173q(true);
                            AbstractC18489d0.m53381v(1, f13, c2314t2, c28655q2, false);
                            c28655q6 = c28655q2;
                            c28676v0 = c28676v0;
                            z4 = false;
                            z13 = true;
                            c28655q6.m87173q(z4);
                            z15 = z13;
                            c28655q10 = c28655q6;
                            break;
                        case 9:
                            c28655q2.m87150e0(-1008512);
                            m77789w(null, c28655q2, 0, 1);
                            c28655q2.m87173q(false);
                            c28655q7 = c28655q2;
                            c28676v0 = c28676v0;
                            z13 = true;
                            c28655q6 = c28655q7;
                            c28655q6.m87173q(z4);
                            z15 = z13;
                            c28655q10 = c28655q6;
                            break;
                        case 10:
                            c28655q2.m87150e0(-902306);
                            m77778l(null, c28655q2, 0, 1);
                            c28655q2.m87173q(false);
                            c28655q7 = c28655q2;
                            c28676v0 = c28676v0;
                            z13 = true;
                            c28655q6 = c28655q7;
                            c28655q6.m87173q(z4);
                            z15 = z13;
                            c28655q10 = c28655q6;
                            break;
                        case 11:
                            c28655q2.m87150e0(-754808);
                            abstractC18254hM52584a3 = AbstractC18255i.m52584a(legendColor, c28655q2, (i16 >> 3) & 14);
                            if (abstractC18254hM52584a3 instanceof C18253g) {
                                c28655q2.m87150e0(-661591);
                                m77784r(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * f13, 0.0f, 11), ((C18253g) abstractC18254hM52584a3).getColor(), c28655q2, 6, 0);
                                c28655q2.m87173q(false);
                                c28655q2 = c28655q2;
                            } else {
                                if (abstractC18254hM52584a3 instanceof C18251e) {
                                    throw AbstractC11895b.m32003v(-1385497670, c28655q2, false);
                                }
                                c28655q2.m87150e0(-449892);
                                m77784r(m77765B(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * f13, 0.0f, 11), ((C18251e) abstractC18254hM52584a3).getBrush()), C17919x.f69637n, c28655q2, 48, 0);
                                c28655q2 = c28655q2;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(false);
                            c28655q7 = c28655q2;
                            c28676v0 = c28676v0;
                            z13 = true;
                            c28655q6 = c28655q7;
                            c28655q6.m87173q(z4);
                            z15 = z13;
                            c28655q10 = c28655q6;
                            break;
                        case 12:
                            c28655q2.m87150e0(13868);
                            abstractC18254hM52584a4 = AbstractC18255i.m52584a(legendColor, c28655q2, (i16 >> 3) & 14);
                            if (abstractC18254hM52584a4 instanceof C18253g) {
                                c28655q2.m87150e0(107147);
                                m77791y(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * f13, 0.0f, 11), ((C18253g) abstractC18254hM52584a4).getColor(), c28655q2, 6, 0);
                                C28655q c28655q16 = c28655q2;
                                c28655q16.m87173q(false);
                                c28655q9 = c28655q16;
                            } else {
                                c28655q8 = c28655q2;
                                if (abstractC18254hM52584a4 instanceof C18251e) {
                                    throw AbstractC11895b.m32003v(-1385472874, c28655q8, false);
                                }
                                c28655q8.m87150e0(316862);
                                m77791y(m77765B(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * f13, 0.0f, 11), ((C18251e) abstractC18254hM52584a4).getBrush()), C17919x.f69637n, c28655q8, 48, 0);
                                c28655q8.m87173q(false);
                                c28655q9 = c28655q8;
                            }
                            c28655q9.m87173q(false);
                            c28655q7 = c28655q9;
                            c28676v0 = c28676v0;
                            z13 = true;
                            c28655q6 = c28655q7;
                            c28655q6.m87173q(z4);
                            z15 = z13;
                            c28655q10 = c28655q6;
                            break;
                        default:
                            throw AbstractC11895b.m32003v(-1385630725, c28655q2, false);
                    }
                }
                String strM21274h = AbstractC8693b.m21274h(legendText, c28655q10, (i16 >> 6) & 14);
                C2886a c2886aM8402a = EnumC2888c.INSTANCE.m8402a(enumC2888c3);
                if ((i16 & 3670016) == 1048576) {
                    z16 = z15;
                } else {
                    z16 = z4;
                }
                objM87133R = c28655q10.m87133R();
                if (z16 || objM87133R == c28676v0) {
                    objM87133R = new C23434k(function2, 25);
                    c28655q10.m87172p0(objM87133R);
                }
                long j14 = brandWhite;
                AbstractC30795n.m94707h(strM21274h, null, j14, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, (Function1) objM87133R, c2886aM8402a, null, c28655q10, (i16 >> 9) & 896, 3120, 153594);
                c28655q10.m87173q(z15);
                c28655q = c28655q10;
                function3 = function2;
                j13 = j14;
                modifier3 = modifier4;
                enumC16313m1 = enumC16313m3;
                enumC2888c2 = enumC2888c3;
                enumC26195i2 = enumC26195i4;
            } else {
                c28655q12.m87138X();
                if ((i14 & 32) != 0) {
                    i15 &= -458753;
                }
                enumC26195i3 = enumC26195i;
                enumC16313m2 = enumC16313m0;
                brandWhite = j7;
            }
            enumC2888c3 = enumC2888c;
            c28655q12.m87175r();
            f13 = 8;
            Modifier modifierMo3471e2 = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, ((float) 1.25d) * f13, 0.0f, 11).mo3471e(modifier2);
            enumC26195i4 = enumC26195i3;
            Modifier modifier5 = modifier2;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q12, 48);
            i16 = i15;
            iHashCode = Long.hashCode(c28655q12.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q12.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q12, modifierMo3471e2);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q12.m87158i0();
            enumC16313m3 = enumC16313m2;
            if (c28655q12.f115903S) {
                c28655q12.m87163l(interfaceC4339a);
            } else {
                c28655q12.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q12, c0209i, c22994r1M66759a2);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q12, c0209i2, interfaceC28653p1M87165m3);
            c0209i3 = C0217k.f732j;
            if (c28655q12.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q12, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q12, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q12, c0209i4, modifierM118962N3);
            if (enumC16313m3 != null) {
                c28655q12.m87150e0(-6057017);
                abstractC18254hM52584a5 = AbstractC18255i.m52584a(legendColor, c28655q12, (i16 >> 3) & 14);
                if (abstractC18254hM52584a5 instanceof C18253g) {
                    c28655q12.m87150e0(-5910201);
                    Modifier modifierM3419p2 = AbstractC1102d.m3419p(3 * 4, c2314t2);
                    long jM52583a2 = ((C18253g) abstractC18254hM52584a5).getColor();
                    C27430e c27430eM107874S2 = AbstractC34132o.m107874S(enumC16313m3.toWhoopIcon(), c28655q12, 6);
                    z17 = false;
                    c2314t = c2314t2;
                    i17 = 1;
                    AbstractC15005f3.m43108b(c27430eM107874S2, null, modifierM3419p2, jM52583a2, c28655q12, 432, 0);
                    c28655q12.m87173q(false);
                    c28655q11 = c28655q12;
                } else {
                    c2314t = c2314t2;
                    z17 = false;
                    i17 = 1;
                    if (abstractC18254hM52584a5 instanceof C18251e) {
                        throw AbstractC11895b.m32003v(-1385666484, c28655q12, false);
                    }
                    c28655q12.m87150e0(-5541208);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m3.toWhoopIcon(), c28655q12, 6), null, m77765B(AbstractC1102d.m3419p(3 * 4, c2314t), ((C18251e) abstractC18254hM52584a5).getBrush()), C17919x.f69637n, c28655q12, 3120, 0);
                    c28655q11 = c28655q12;
                    c28655q11.m87173q(false);
                }
                AbstractC18489d0.m53381v(i17, f13, c2314t, c28655q11, z17);
                z4 = z17;
                c28655q10 = c28655q11;
                z15 = i17;
            } else {
                c28676v0 = c28676v0;
                c28655q2 = c28655q12;
                z4 = false;
                c28655q2.m87150e0(-4879513);
                switch (d.f103904a[enumC26195i4.ordinal()]) {
                    case 1:
                        z4 = false;
                        C28655q c28655q17 = c28655q2;
                        c28676v0 = c28676v0;
                        z13 = true;
                        c28655q17.m87150e0(-5005063);
                        AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3419p(3 * 4, c2314t2), legendColor), c28655q17, 0);
                        AbstractC18489d0.m53381v(1, f13, c2314t2, c28655q17, false);
                        c28655q6 = c28655q17;
                        c28655q6.m87173q(z4);
                        z15 = z13;
                        c28655q10 = c28655q6;
                        break;
                    case 2:
                        C28655q c28655q18 = c28655q2;
                        c28676v0 = c28676v0;
                        z13 = true;
                        c28655q18.m87150e0(-4696427);
                        Modifier modifierM52565c2 = AbstractC18249c.m52565c(AbstractC1102d.m3419p(3 * 4, AbstractC37056f.m118994r(c2314t2, AbstractC33253j.m105489e(2))), legendColor);
                        z4 = false;
                        AbstractC22989q.m66760a(modifierM52565c2, c28655q18, 0);
                        AbstractC18489d0.m53381v(1, f13, c2314t2, c28655q18, false);
                        c28655q6 = c28655q18;
                        c28655q6.m87173q(z4);
                        z15 = z13;
                        c28655q10 = c28655q6;
                        break;
                    case 3:
                        c28655q3 = c28655q2;
                        c28676v0 = c28676v0;
                        z13 = true;
                        c28655q3.m87150e0(-4320242);
                        abstractC18254hM52584a = AbstractC18255i.m52584a(legendColor, c28655q3, (i16 >> 3) & 14);
                        if (abstractC18254hM52584a instanceof C18253g) {
                            c28655q3.m87150e0(-4169148);
                            AbstractC33556f.m105964c(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * f13, 0.0f, 11), ((C18253g) abstractC18254hM52584a).getColor(), 2 * 4, null, c28655q3, 390, 8);
                            c28655q3.m87173q(false);
                            z4 = false;
                        } else {
                            if (abstractC18254hM52584a instanceof C18251e) {
                                throw AbstractC11895b.m32003v(-1385609912, c28655q3, false);
                            }
                            c28655q3.m87150e0(-3951497);
                            AbstractC33556f.m105964c(m77765B(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * f13, 0.0f, 11), ((C18251e) abstractC18254hM52584a).getBrush()), C17919x.f69637n, 2 * 4, null, c28655q3, 432, 8);
                            z4 = false;
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(z4);
                        c28655q6 = c28655q3;
                        c28655q6.m87173q(z4);
                        z15 = z13;
                        c28655q10 = c28655q6;
                        break;
                    case 4:
                        c28655q2.m87150e0(-3468114);
                        abstractC18254hM52584a2 = AbstractC18255i.m52584a(legendColor, c28655q2, (i16 >> 3) & 14);
                        if (abstractC18254hM52584a2 instanceof C18253g) {
                            c28655q2.m87150e0(-3317020);
                            z14 = true;
                            AbstractC33556f.m105964c(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * f13, 0.0f, 11), ((C18253g) abstractC18254hM52584a2).getColor(), 3 * 4, null, c28655q2, 390, 8);
                            C28655q c28655q19 = c28655q2;
                            c28655q19.m87173q(false);
                            z4 = false;
                            c28655q5 = c28655q19;
                        } else {
                            c28655q4 = c28655q2;
                            z14 = true;
                            if (abstractC18254hM52584a2 instanceof C18251e) {
                                throw AbstractC11895b.m32003v(-1385582424, c28655q4, false);
                            }
                            c28655q4.m87150e0(-3099369);
                            AbstractC33556f.m105964c(m77765B(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * f13, 0.0f, 11), ((C18251e) abstractC18254hM52584a2).getBrush()), C17919x.f69637n, 3 * 4, null, c28655q4, 432, 8);
                            z4 = false;
                            c28655q4.m87173q(false);
                            c28655q5 = c28655q4;
                        }
                        c28655q5.m87173q(z4);
                        z13 = z14;
                        c28655q6 = c28655q5;
                        c28655q6.m87173q(z4);
                        z15 = z13;
                        c28655q10 = c28655q6;
                        break;
                    case 5:
                        c28655q2.m87150e0(-2633594);
                        float f110 = 2;
                        float f111 = 4;
                        AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(f111 * f111, AbstractC1102d.m3411h(f110 * f111, AbstractC37056f.m118994r(c2314t2, AbstractC33253j.m105489e(f110)))), legendColor), c28655q2, 0);
                        AbstractC18489d0.m53381v(1, f13, c2314t2, c28655q2, false);
                        c28655q6 = c28655q2;
                        c28676v0 = c28676v0;
                        z4 = false;
                        z13 = true;
                        c28655q6.m87173q(z4);
                        z15 = z13;
                        c28655q10 = c28655q6;
                        break;
                    case 6:
                        c28655q2.m87150e0(-2215962);
                        float f112 = 1;
                        float f113 = 4;
                        AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(3 * f113, AbstractC1102d.m3411h(f112 * f113, AbstractC37056f.m118994r(c2314t2, AbstractC33253j.m105489e(f112)))), legendColor), c28655q2, 0);
                        AbstractC18489d0.m53381v(f112, f13, c2314t2, c28655q2, false);
                        c28655q6 = c28655q2;
                        c28676v0 = c28676v0;
                        z4 = false;
                        z13 = true;
                        c28655q6.m87173q(z4);
                        z15 = z13;
                        c28655q10 = c28655q6;
                        break;
                    case 7:
                        c28655q2.m87150e0(-1806235);
                        float f114 = 4;
                        AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(f114 * f114, AbstractC1102d.m3411h(2 * f114, AbstractC37056f.m118994r(c2314t2, AbstractC33253j.m105489e(25)))), legendColor), c28655q2, 0);
                        z13 = true;
                        AbstractC18489d0.m53381v(1, f13, c2314t2, c28655q2, false);
                        c28655q6 = c28655q2;
                        c28676v0 = c28676v0;
                        z4 = false;
                        c28655q6.m87173q(z4);
                        z15 = z13;
                        c28655q10 = c28655q6;
                        break;
                    case 8:
                        c28655q2.m87150e0(-1392292);
                        float f115 = 4;
                        Modifier modifierM3424u2 = AbstractC1102d.m3424u(f115 * f115, AbstractC1102d.m3411h(((float) 0.5d) * f115, c2314t2));
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3424u2);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                        AbstractC17732d.m50818c(legendColor, c28655q2, (i16 >> 3) & 14);
                        c28655q2.m87173q(true);
                        AbstractC18489d0.m53381v(1, f13, c2314t2, c28655q2, false);
                        c28655q6 = c28655q2;
                        c28676v0 = c28676v0;
                        z4 = false;
                        z13 = true;
                        c28655q6.m87173q(z4);
                        z15 = z13;
                        c28655q10 = c28655q6;
                        break;
                    case 9:
                        c28655q2.m87150e0(-1008512);
                        m77789w(null, c28655q2, 0, 1);
                        c28655q2.m87173q(false);
                        c28655q7 = c28655q2;
                        c28676v0 = c28676v0;
                        z13 = true;
                        c28655q6 = c28655q7;
                        c28655q6.m87173q(z4);
                        z15 = z13;
                        c28655q10 = c28655q6;
                        break;
                    case 10:
                        c28655q2.m87150e0(-902306);
                        m77778l(null, c28655q2, 0, 1);
                        c28655q2.m87173q(false);
                        c28655q7 = c28655q2;
                        c28676v0 = c28676v0;
                        z13 = true;
                        c28655q6 = c28655q7;
                        c28655q6.m87173q(z4);
                        z15 = z13;
                        c28655q10 = c28655q6;
                        break;
                    case 11:
                        c28655q2.m87150e0(-754808);
                        abstractC18254hM52584a3 = AbstractC18255i.m52584a(legendColor, c28655q2, (i16 >> 3) & 14);
                        if (abstractC18254hM52584a3 instanceof C18253g) {
                            c28655q2.m87150e0(-661591);
                            m77784r(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * f13, 0.0f, 11), ((C18253g) abstractC18254hM52584a3).getColor(), c28655q2, 6, 0);
                            c28655q2.m87173q(false);
                            c28655q2 = c28655q2;
                        } else {
                            if (abstractC18254hM52584a3 instanceof C18251e) {
                                throw AbstractC11895b.m32003v(-1385497670, c28655q2, false);
                            }
                            c28655q2.m87150e0(-449892);
                            m77784r(m77765B(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * f13, 0.0f, 11), ((C18251e) abstractC18254hM52584a3).getBrush()), C17919x.f69637n, c28655q2, 48, 0);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(false);
                        c28655q7 = c28655q2;
                        c28676v0 = c28676v0;
                        z13 = true;
                        c28655q6 = c28655q7;
                        c28655q6.m87173q(z4);
                        z15 = z13;
                        c28655q10 = c28655q6;
                        break;
                    case 12:
                        c28655q2.m87150e0(13868);
                        abstractC18254hM52584a4 = AbstractC18255i.m52584a(legendColor, c28655q2, (i16 >> 3) & 14);
                        if (abstractC18254hM52584a4 instanceof C18253g) {
                            c28655q2.m87150e0(107147);
                            m77791y(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * f13, 0.0f, 11), ((C18253g) abstractC18254hM52584a4).getColor(), c28655q2, 6, 0);
                            C28655q c28655q110 = c28655q2;
                            c28655q110.m87173q(false);
                            c28655q9 = c28655q110;
                        } else {
                            c28655q8 = c28655q2;
                            if (abstractC18254hM52584a4 instanceof C18251e) {
                                throw AbstractC11895b.m32003v(-1385472874, c28655q8, false);
                            }
                            c28655q8.m87150e0(316862);
                            m77791y(m77765B(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * f13, 0.0f, 11), ((C18251e) abstractC18254hM52584a4).getBrush()), C17919x.f69637n, c28655q8, 48, 0);
                            c28655q8.m87173q(false);
                            c28655q9 = c28655q8;
                        }
                        c28655q9.m87173q(false);
                        c28655q7 = c28655q9;
                        c28676v0 = c28676v0;
                        z13 = true;
                        c28655q6 = c28655q7;
                        c28655q6.m87173q(z4);
                        z15 = z13;
                        c28655q10 = c28655q6;
                        break;
                    default:
                        throw AbstractC11895b.m32003v(-1385630725, c28655q2, false);
                }
            }
            String strM21274h2 = AbstractC8693b.m21274h(legendText, c28655q10, (i16 >> 6) & 14);
            C2886a c2886aM8402a2 = EnumC2888c.INSTANCE.m8402a(enumC2888c3);
            if ((i16 & 3670016) == 1048576) {
                z16 = z15;
            } else {
                z16 = z4;
            }
            objM87133R = c28655q10.m87133R();
            if (z16) {
                objM87133R = new C23434k(function2, 25);
                c28655q10.m87172p0(objM87133R);
            } else {
                objM87133R = new C23434k(function2, 25);
                c28655q10.m87172p0(objM87133R);
            }
            long j15 = brandWhite;
            AbstractC30795n.m94707h(strM21274h2, null, j15, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, (Function1) objM87133R, c2886aM8402a2, null, c28655q10, (i16 >> 9) & 896, 3120, 153594);
            c28655q10.m87173q(z15);
            c28655q = c28655q10;
            function3 = function2;
            j13 = j15;
            modifier3 = modifier5;
            enumC16313m1 = enumC16313m3;
            enumC2888c2 = enumC2888c3;
            enumC26195i2 = enumC26195i4;
        } else {
            c28655q12.m87138X();
            enumC26195i2 = enumC26195i;
            enumC16313m1 = enumC16313m0;
            modifier3 = modifier2;
            c28655q = c28655q12;
            function3 = function2;
            j13 = j7;
            enumC2888c2 = enumC2888c;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: n21.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC26194h.m77783q(modifier3, legendColor, legendText, enumC26195i2, enumC16313m1, j13, function3, enumC2888c2, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m77781o(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m77782p(Function1 function1, C23277r0 result) {
        AbstractC22676k.m65750j(result, "result");
        function1.invoke(Boolean.valueOf(result.m67336e()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m77783q(Modifier modifier, AbstractC18247a abstractC18247a, TextResource textResource, EnumC26195i enumC26195i, EnumC16313m0 enumC16313m0, long j7, Function1 function1, EnumC2888c enumC2888c, int i13, int i14, Composer composer, int i15) {
        m77780n(modifier, abstractC18247a, textResource, enumC26195i, enumC16313m0, j7, function1, enumC2888c, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final void m77784r(Modifier modifier, long j7, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-621616948);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(modifier) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            modifier2 = i16 != 0 ? C2314t.f9131w : modifier;
            Modifier modifierM3419p = AbstractC1102d.m3419p(3 * 4, modifier2);
            boolean z4 = (i15 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C0910b(j7, 23);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22989q.m66760a(AbstractC1125a.m3478a(modifierM3419p, (Function1) objM87133R), c28655q, 0);
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26193g(modifier2, j7, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m77785s(long j7, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        float f13 = ((float) 0.5d) * 4;
        float fMo743q0 = drawBehind.mo743q0(f13);
        float f14 = 2;
        InterfaceC22131e.m63379M(drawBehind, j7, (C16620e.m47212d(drawBehind.mo731d()) - fMo743q0) / f14, 0L, 0.0f, new C22135i(fMo743q0, 0.0f, 0, 0, new C17893k(new DashPathEffect(new float[]{drawBehind.mo743q0(f13), drawBehind.mo743q0(f14)}, 0.0f)), 14), 108);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m77786t(Modifier modifier, long j7, int i13, int i14, Composer composer, int i15) {
        m77784r(modifier, j7, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0115  */
    /* JADX WARN: Code duplicated, block: B:103:0x011a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0120  */
    /* JADX WARN: Code duplicated, block: B:107:0x0126  */
    /* JADX WARN: Code duplicated, block: B:108:0x0129  */
    /* JADX WARN: Code duplicated, block: B:112:0x0139  */
    /* JADX WARN: Code duplicated, block: B:113:0x013b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0144  */
    /* JADX WARN: Code duplicated, block: B:118:0x0153  */
    /* JADX WARN: Code duplicated, block: B:125:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0179  */
    /* JADX WARN: Code duplicated, block: B:127:0x017c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0182  */
    /* JADX WARN: Code duplicated, block: B:131:0x0185  */
    /* JADX WARN: Code duplicated, block: B:133:0x0189  */
    /* JADX WARN: Code duplicated, block: B:134:0x018c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0190  */
    /* JADX WARN: Code duplicated, block: B:138:0x0194  */
    /* JADX WARN: Code duplicated, block: B:139:0x0197  */
    /* JADX WARN: Code duplicated, block: B:142:0x019c  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:157:0x0208  */
    /* JADX WARN: Code duplicated, block: B:159:0x0216  */
    /* JADX WARN: Code duplicated, block: B:162:0x023f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x0289  */
    /* JADX WARN: Code duplicated, block: B:166:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:169:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7 A[PHI: r14
      0x00b7: PHI (r14v19 int) = (r14v0 int), (r14v5 int), (r14v6 int) binds: [B:66:0x00b5, B:76:0x00cd, B:75:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00de  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:97:0x0104  */
    /* JADX WARN: Code duplicated, block: B:99:0x0109  */
    /* JADX INFO: renamed from: u */
    public static final void m77787u(AbstractC18247a firstColor, TextResource firstLabel, EnumC26195i enumC26195i, EnumC16313m0 enumC16313m0, AbstractC18247a abstractC18247a, TextResource textResource, EnumC26195i enumC26195i2, EnumC16313m0 enumC16313m1, long j7, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        int i16;
        TextResource textResource2;
        int i17;
        int i18;
        int i19;
        int iOrdinal;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z4;
        EnumC26195i enumC26195i3;
        EnumC16313m0 enumC16313m2;
        AbstractC18247a abstractC18247a2;
        EnumC26195i enumC26195i4;
        EnumC16313m0 enumC16313m3;
        Modifier modifier2;
        TextResource textResource3;
        long j13;
        C28677v1 c28677v1M87180u;
        int i29;
        C2314t c2314t;
        AbstractC18247a abstractC18247a3;
        EnumC26195i enumC26195i5;
        long brandWhite;
        Modifier modifier3;
        Modifier modifier4;
        long j14;
        TextResource textResource4;
        EnumC16313m0 enumC16313m4;
        EnumC26195i enumC26195i6;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifier5;
        int i34;
        AbstractC22676k.m65750j(firstColor, "firstColor");
        AbstractC22676k.m65750j(firstLabel, "firstLabel");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2007513397);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(firstColor) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(firstLabel) ? 32 : 16;
        }
        int i35 = i14 & 4;
        if (i35 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(enumC26195i == null ? -1 : enumC26195i.ordinal()) ? 256 : 128;
        }
        int i36 = i14 & 8;
        if (i36 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87149e(enumC16313m0 == null ? -1 : enumC16313m0.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i37 = i14 & 16;
        if (i37 == 0) {
            if ((i13 & 24576) == 0) {
                i15 |= c28655q.m87153g(abstractC18247a) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((196608 & i13) == 0) {
                    textResource2 = textResource;
                    if (c28655q.m87153g(textResource2)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 64;
                i19 = 1572864;
                if (i18 == 0) {
                    i15 |= i19;
                } else if ((1572864 & i13) == 0) {
                    if (enumC26195i2 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC26195i2.ordinal();
                    }
                    if (c28655q.m87149e(iOrdinal)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 128;
                if (i24 != 0) {
                    i15 |= 12582912;
                } else if ((12582912 & i13) == 0) {
                    if (c28655q.m87149e(enumC16313m1 != null ? enumC16313m1.ordinal() : -1)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i15 |= i25;
                }
                if ((100663296 & i13) == 0) {
                    int i38 = i15;
                    if ((i14 & 256) == 0 || !c28655q.m87151f(j7)) {
                        i34 = AndroidSDKConstants.FLAG_MUTABLE;
                    } else {
                        i34 = 67108864;
                    }
                    i26 = i38 | i34;
                } else {
                    i26 = i15;
                }
                i27 = i14 & 512;
                if (i27 != 0) {
                    i26 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q.m87153g(modifier)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                    i26 |= i28;
                }
                if ((306783379 & i26) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i26 & 1, z4)) {
                    c28655q.m87140Z();
                    i29 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    if (i29 != 0 || c28655q.m87118C()) {
                        if (i35 != 0) {
                            enumC26195i3 = EnumC26195i.CIRCLE;
                        } else {
                            enumC26195i3 = enumC26195i;
                        }
                        if (i36 != 0) {
                            enumC16313m2 = null;
                        } else {
                            enumC16313m2 = enumC16313m0;
                        }
                        if (i37 != 0) {
                            abstractC18247a3 = null;
                        } else {
                            abstractC18247a3 = abstractC18247a;
                        }
                        if (i16 != 0) {
                            textResource2 = null;
                        }
                        if (i18 != 0) {
                            enumC26195i5 = EnumC26195i.CIRCLE;
                        } else {
                            enumC26195i5 = enumC26195i2;
                        }
                        EnumC16313m0 enumC16313m5 = i24 == 0 ? enumC16313m1 : null;
                        if ((i14 & 256) != 0) {
                            brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                            i26 &= -234881025;
                        } else {
                            brandWhite = j7;
                        }
                        if (i27 != 0) {
                            modifier3 = c2314t;
                            modifier4 = modifier3;
                        } else {
                            modifier3 = modifier;
                            modifier4 = c2314t;
                        }
                        j14 = brandWhite;
                        textResource4 = textResource2;
                        enumC16313m4 = enumC16313m5;
                        enumC26195i6 = enumC26195i5;
                    } else {
                        c28655q.m87138X();
                        if ((i14 & 256) != 0) {
                            i26 &= -234881025;
                        }
                        enumC26195i3 = enumC26195i;
                        abstractC18247a3 = abstractC18247a;
                        enumC26195i6 = enumC26195i2;
                        enumC16313m4 = enumC16313m1;
                        j14 = j7;
                        modifier3 = modifier;
                        i26 = i26;
                        modifier4 = c2314t;
                        enumC16313m2 = enumC16313m0;
                        textResource4 = textResource2;
                    }
                    c28655q.m87175r();
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier3);
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
                    int i39 = (i26 << 3) & 65520;
                    int i44 = i26 >> 9;
                    int i45 = i44 & 458752;
                    long j15 = j14;
                    m77780n(null, firstColor, firstLabel, enumC26195i3, enumC16313m2, j15, null, null, c28655q, i39 | i45, 193);
                    if (abstractC18247a3 != null || textResource4 == null) {
                        modifier5 = modifier3;
                        c28655q.m87150e0(-78800599);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-78992799);
                        modifier5 = modifier3;
                        m77780n(AbstractC1099a.m3398t(modifier4, 1 * 8, 0.0f, 0.0f, 0.0f, 14), abstractC18247a3, textResource4, enumC26195i6, enumC16313m4, j15, null, null, c28655q, (i44 & 112) | 6 | (i44 & 896) | (i44 & 7168) | (57344 & i44) | i45, 192);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    modifier2 = modifier5;
                    enumC26195i4 = enumC26195i6;
                    enumC16313m3 = enumC16313m4;
                    j13 = j15;
                    abstractC18247a2 = abstractC18247a3;
                    textResource3 = textResource4;
                } else {
                    c28655q.m87138X();
                    enumC26195i3 = enumC26195i;
                    enumC16313m2 = enumC16313m0;
                    abstractC18247a2 = abstractC18247a;
                    enumC26195i4 = enumC26195i2;
                    enumC16313m3 = enumC16313m1;
                    modifier2 = modifier;
                    textResource3 = textResource2;
                    j13 = j7;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C16987d(firstColor, firstLabel, enumC26195i3, enumC16313m2, abstractC18247a2, textResource3, enumC26195i4, enumC16313m3, j13, modifier2, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            textResource2 = textResource;
            i18 = i14 & 64;
            i19 = 1572864;
            if (i18 == 0) {
                i15 |= i19;
            } else if ((1572864 & i13) == 0) {
                if (enumC26195i2 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC26195i2.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
            i24 = i14 & 128;
            if (i24 != 0) {
                i15 |= 12582912;
            } else if ((12582912 & i13) == 0) {
                if (c28655q.m87149e(enumC16313m1 != null ? enumC16313m1.ordinal() : -1)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i15 |= i25;
            }
            if ((100663296 & i13) == 0) {
                int i310 = i15;
                if ((i14 & 256) == 0) {
                    i34 = AndroidSDKConstants.FLAG_MUTABLE;
                } else {
                    i34 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i26 = i310 | i34;
            } else {
                i26 = i15;
            }
            i27 = i14 & 512;
            if (i27 != 0) {
                i26 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q.m87153g(modifier)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i26 |= i28;
            }
            if ((306783379 & i26) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i26 & 1, z4)) {
                c28655q.m87140Z();
                i29 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    if (i35 != 0) {
                        enumC26195i3 = EnumC26195i.CIRCLE;
                    } else {
                        enumC26195i3 = enumC26195i;
                    }
                    if (i36 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i37 != 0) {
                        abstractC18247a3 = null;
                    } else {
                        abstractC18247a3 = abstractC18247a;
                    }
                    if (i16 != 0) {
                        textResource2 = null;
                    }
                    if (i18 != 0) {
                        enumC26195i5 = EnumC26195i.CIRCLE;
                    } else {
                        enumC26195i5 = enumC26195i2;
                    }
                    if (i24 == 0) {
                    }
                    if ((i14 & 256) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i26 &= -234881025;
                    } else {
                        brandWhite = j7;
                    }
                    if (i27 != 0) {
                        modifier3 = c2314t;
                        modifier4 = modifier3;
                    } else {
                        modifier3 = modifier;
                        modifier4 = c2314t;
                    }
                    j14 = brandWhite;
                    textResource4 = textResource2;
                    enumC16313m4 = enumC16313m5;
                    enumC26195i6 = enumC26195i5;
                } else {
                    if (i35 != 0) {
                        enumC26195i3 = EnumC26195i.CIRCLE;
                    } else {
                        enumC26195i3 = enumC26195i;
                    }
                    if (i36 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i37 != 0) {
                        abstractC18247a3 = null;
                    } else {
                        abstractC18247a3 = abstractC18247a;
                    }
                    if (i16 != 0) {
                        textResource2 = null;
                    }
                    if (i18 != 0) {
                        enumC26195i5 = EnumC26195i.CIRCLE;
                    } else {
                        enumC26195i5 = enumC26195i2;
                    }
                    if (i24 == 0) {
                    }
                    if ((i14 & 256) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i26 &= -234881025;
                    } else {
                        brandWhite = j7;
                    }
                    if (i27 != 0) {
                        modifier3 = c2314t;
                        modifier4 = modifier3;
                    } else {
                        modifier3 = modifier;
                        modifier4 = c2314t;
                    }
                    j14 = brandWhite;
                    textResource4 = textResource2;
                    enumC16313m4 = enumC16313m5;
                    enumC26195i6 = enumC26195i5;
                }
                c28655q.m87175r();
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier3);
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
                int i311 = (i26 << 3) & 65520;
                int i46 = i26 >> 9;
                int i47 = i46 & 458752;
                long j16 = j14;
                m77780n(null, firstColor, firstLabel, enumC26195i3, enumC16313m2, j16, null, null, c28655q, i311 | i47, 193);
                if (abstractC18247a3 != null) {
                    modifier5 = modifier3;
                    c28655q.m87150e0(-78800599);
                    c28655q.m87173q(false);
                } else {
                    modifier5 = modifier3;
                    c28655q.m87150e0(-78800599);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier2 = modifier5;
                enumC26195i4 = enumC26195i6;
                enumC16313m3 = enumC16313m4;
                j13 = j16;
                abstractC18247a2 = abstractC18247a3;
                textResource3 = textResource4;
            } else {
                c28655q.m87138X();
                enumC26195i3 = enumC26195i;
                enumC16313m2 = enumC16313m0;
                abstractC18247a2 = abstractC18247a;
                enumC26195i4 = enumC26195i2;
                enumC16313m3 = enumC16313m1;
                modifier2 = modifier;
                textResource3 = textResource2;
                j13 = j7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16987d(firstColor, firstLabel, enumC26195i3, enumC16313m2, abstractC18247a2, textResource3, enumC26195i4, enumC16313m3, j13, modifier2, i13, i14);
            }
        }
        i15 |= 24576;
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((196608 & i13) == 0) {
                textResource2 = textResource;
                if (c28655q.m87153g(textResource2)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            i18 = i14 & 64;
            i19 = 1572864;
            if (i18 == 0) {
                i15 |= i19;
            } else if ((1572864 & i13) == 0) {
                if (enumC26195i2 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC26195i2.ordinal();
                }
                if (c28655q.m87149e(iOrdinal)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
            i24 = i14 & 128;
            if (i24 != 0) {
                i15 |= 12582912;
            } else if ((12582912 & i13) == 0) {
                if (c28655q.m87149e(enumC16313m1 != null ? enumC16313m1.ordinal() : -1)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i15 |= i25;
            }
            if ((100663296 & i13) == 0) {
                int i312 = i15;
                if ((i14 & 256) == 0) {
                    i34 = AndroidSDKConstants.FLAG_MUTABLE;
                } else {
                    i34 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i26 = i312 | i34;
            } else {
                i26 = i15;
            }
            i27 = i14 & 512;
            if (i27 != 0) {
                i26 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q.m87153g(modifier)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i26 |= i28;
            }
            if ((306783379 & i26) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i26 & 1, z4)) {
                c28655q.m87140Z();
                i29 = i13 & 1;
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    if (i35 != 0) {
                        enumC26195i3 = EnumC26195i.CIRCLE;
                    } else {
                        enumC26195i3 = enumC26195i;
                    }
                    if (i36 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i37 != 0) {
                        abstractC18247a3 = null;
                    } else {
                        abstractC18247a3 = abstractC18247a;
                    }
                    if (i16 != 0) {
                        textResource2 = null;
                    }
                    if (i18 != 0) {
                        enumC26195i5 = EnumC26195i.CIRCLE;
                    } else {
                        enumC26195i5 = enumC26195i2;
                    }
                    if (i24 == 0) {
                    }
                    if ((i14 & 256) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i26 &= -234881025;
                    } else {
                        brandWhite = j7;
                    }
                    if (i27 != 0) {
                        modifier3 = c2314t;
                        modifier4 = modifier3;
                    } else {
                        modifier3 = modifier;
                        modifier4 = c2314t;
                    }
                    j14 = brandWhite;
                    textResource4 = textResource2;
                    enumC16313m4 = enumC16313m5;
                    enumC26195i6 = enumC26195i5;
                } else {
                    if (i35 != 0) {
                        enumC26195i3 = EnumC26195i.CIRCLE;
                    } else {
                        enumC26195i3 = enumC26195i;
                    }
                    if (i36 != 0) {
                        enumC16313m2 = null;
                    } else {
                        enumC16313m2 = enumC16313m0;
                    }
                    if (i37 != 0) {
                        abstractC18247a3 = null;
                    } else {
                        abstractC18247a3 = abstractC18247a;
                    }
                    if (i16 != 0) {
                        textResource2 = null;
                    }
                    if (i18 != 0) {
                        enumC26195i5 = EnumC26195i.CIRCLE;
                    } else {
                        enumC26195i5 = enumC26195i2;
                    }
                    if (i24 == 0) {
                    }
                    if ((i14 & 256) != 0) {
                        brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                        i26 &= -234881025;
                    } else {
                        brandWhite = j7;
                    }
                    if (i27 != 0) {
                        modifier3 = c2314t;
                        modifier4 = modifier3;
                    } else {
                        modifier3 = modifier;
                        modifier4 = c2314t;
                    }
                    j14 = brandWhite;
                    textResource4 = textResource2;
                    enumC16313m4 = enumC16313m5;
                    enumC26195i6 = enumC26195i5;
                }
                c28655q.m87175r();
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                int i313 = (i26 << 3) & 65520;
                int i48 = i26 >> 9;
                int i49 = i48 & 458752;
                long j17 = j14;
                m77780n(null, firstColor, firstLabel, enumC26195i3, enumC16313m2, j17, null, null, c28655q, i313 | i49, 193);
                if (abstractC18247a3 != null) {
                    modifier5 = modifier3;
                    c28655q.m87150e0(-78800599);
                    c28655q.m87173q(false);
                } else {
                    modifier5 = modifier3;
                    c28655q.m87150e0(-78800599);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier2 = modifier5;
                enumC26195i4 = enumC26195i6;
                enumC16313m3 = enumC16313m4;
                j13 = j17;
                abstractC18247a2 = abstractC18247a3;
                textResource3 = textResource4;
            } else {
                c28655q.m87138X();
                enumC26195i3 = enumC26195i;
                enumC16313m2 = enumC16313m0;
                abstractC18247a2 = abstractC18247a;
                enumC26195i4 = enumC26195i2;
                enumC16313m3 = enumC16313m1;
                modifier2 = modifier;
                textResource3 = textResource2;
                j13 = j7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16987d(firstColor, firstLabel, enumC26195i3, enumC16313m2, abstractC18247a2, textResource3, enumC26195i4, enumC16313m3, j13, modifier2, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        textResource2 = textResource;
        i18 = i14 & 64;
        i19 = 1572864;
        if (i18 == 0) {
            i15 |= i19;
        } else if ((1572864 & i13) == 0) {
            if (enumC26195i2 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC26195i2.ordinal();
            }
            if (c28655q.m87149e(iOrdinal)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i15 |= i19;
        }
        i24 = i14 & 128;
        if (i24 != 0) {
            i15 |= 12582912;
        } else if ((12582912 & i13) == 0) {
            if (c28655q.m87149e(enumC16313m1 != null ? enumC16313m1.ordinal() : -1)) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i15 |= i25;
        }
        if ((100663296 & i13) == 0) {
            int i314 = i15;
            if ((i14 & 256) == 0) {
                i34 = AndroidSDKConstants.FLAG_MUTABLE;
            } else {
                i34 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i26 = i314 | i34;
        } else {
            i26 = i15;
        }
        i27 = i14 & 512;
        if (i27 != 0) {
            i26 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            if (c28655q.m87153g(modifier)) {
                i28 = 536870912;
            } else {
                i28 = 268435456;
            }
            i26 |= i28;
        }
        if ((306783379 & i26) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i26 & 1, z4)) {
            c28655q.m87140Z();
            i29 = i13 & 1;
            c2314t = C2314t.f9131w;
            if (i29 != 0) {
                if (i35 != 0) {
                    enumC26195i3 = EnumC26195i.CIRCLE;
                } else {
                    enumC26195i3 = enumC26195i;
                }
                if (i36 != 0) {
                    enumC16313m2 = null;
                } else {
                    enumC16313m2 = enumC16313m0;
                }
                if (i37 != 0) {
                    abstractC18247a3 = null;
                } else {
                    abstractC18247a3 = abstractC18247a;
                }
                if (i16 != 0) {
                    textResource2 = null;
                }
                if (i18 != 0) {
                    enumC26195i5 = EnumC26195i.CIRCLE;
                } else {
                    enumC26195i5 = enumC26195i2;
                }
                if (i24 == 0) {
                }
                if ((i14 & 256) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i26 &= -234881025;
                } else {
                    brandWhite = j7;
                }
                if (i27 != 0) {
                    modifier3 = c2314t;
                    modifier4 = modifier3;
                } else {
                    modifier3 = modifier;
                    modifier4 = c2314t;
                }
                j14 = brandWhite;
                textResource4 = textResource2;
                enumC16313m4 = enumC16313m5;
                enumC26195i6 = enumC26195i5;
            } else {
                if (i35 != 0) {
                    enumC26195i3 = EnumC26195i.CIRCLE;
                } else {
                    enumC26195i3 = enumC26195i;
                }
                if (i36 != 0) {
                    enumC16313m2 = null;
                } else {
                    enumC16313m2 = enumC16313m0;
                }
                if (i37 != 0) {
                    abstractC18247a3 = null;
                } else {
                    abstractC18247a3 = abstractC18247a;
                }
                if (i16 != 0) {
                    textResource2 = null;
                }
                if (i18 != 0) {
                    enumC26195i5 = EnumC26195i.CIRCLE;
                } else {
                    enumC26195i5 = enumC26195i2;
                }
                if (i24 == 0) {
                }
                if ((i14 & 256) != 0) {
                    brandWhite = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite();
                    i26 &= -234881025;
                } else {
                    brandWhite = j7;
                }
                if (i27 != 0) {
                    modifier3 = c2314t;
                    modifier4 = modifier3;
                } else {
                    modifier3 = modifier;
                    modifier4 = c2314t;
                }
                j14 = brandWhite;
                textResource4 = textResource2;
                enumC16313m4 = enumC16313m5;
                enumC26195i6 = enumC26195i5;
            }
            c28655q.m87175r();
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifier3);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            int i315 = (i26 << 3) & 65520;
            int i410 = i26 >> 9;
            int i411 = i410 & 458752;
            long j18 = j14;
            m77780n(null, firstColor, firstLabel, enumC26195i3, enumC16313m2, j18, null, null, c28655q, i315 | i411, 193);
            if (abstractC18247a3 != null) {
                modifier5 = modifier3;
                c28655q.m87150e0(-78800599);
                c28655q.m87173q(false);
            } else {
                modifier5 = modifier3;
                c28655q.m87150e0(-78800599);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier2 = modifier5;
            enumC26195i4 = enumC26195i6;
            enumC16313m3 = enumC16313m4;
            j13 = j18;
            abstractC18247a2 = abstractC18247a3;
            textResource3 = textResource4;
        } else {
            c28655q.m87138X();
            enumC26195i3 = enumC26195i;
            enumC16313m2 = enumC16313m0;
            abstractC18247a2 = abstractC18247a;
            enumC26195i4 = enumC26195i2;
            enumC16313m3 = enumC16313m1;
            modifier2 = modifier;
            textResource3 = textResource2;
            j13 = j7;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16987d(firstColor, firstLabel, enumC26195i3, enumC16313m2, abstractC18247a2, textResource3, enumC26195i4, enumC16313m3, j13, modifier2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m77788v(AbstractC18247a abstractC18247a, TextResource textResource, EnumC26195i enumC26195i, EnumC16313m0 enumC16313m0, AbstractC18247a abstractC18247a2, TextResource textResource2, EnumC26195i enumC26195i2, EnumC16313m0 enumC16313m1, long j7, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m77787u(abstractC18247a, textResource, enumC26195i, enumC16313m0, abstractC18247a2, textResource2, enumC26195i2, enumC16313m1, j7, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public static final void m77789w(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(302269580);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier = c2314t;
            }
            float f13 = 4;
            float f14 = 3 * f13;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3421r(modifier, f14, ((float) 0.5d) * f13), AbstractC33253j.m105489e(f14));
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = c.f103903w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22989q.m66760a(AbstractC18249c.m52565c(modifierM118994r, AbstractC18249c.m52574l((Function1) objM87133R)), c28655q, 0);
            AbstractC38963t7.m124386p(1, 8, c2314t, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 19, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m77790x(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m77789w(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    public static final void m77791y(Modifier modifier, long j7, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1651790644);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(modifier) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            modifier2 = i16 != 0 ? C2314t.f9131w : modifier;
            Modifier modifierM3419p = AbstractC1102d.m3419p(3 * 4, modifier2);
            boolean z4 = (i15 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C0910b(j7, 24);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22989q.m66760a(AbstractC1125a.m3478a(modifierM3419p, (Function1) objM87133R), c28655q, 0);
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26193g(modifier2, j7, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m77792z(long j7, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        float fMo743q0 = drawBehind.mo743q0(((float) 0.25d) * 4);
        InterfaceC22131e.m63379M(drawBehind, j7, (C16620e.m47212d(drawBehind.mo731d()) - fMo743q0) / 2, 0L, 0.0f, new C22135i(fMo743q0, 0.0f, 0, 0, null, 30), 108);
        return C23454a0.f92919a;
    }
}
