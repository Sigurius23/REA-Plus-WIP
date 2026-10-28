package h51;

import android.content.Context;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import b91.EnumC2888c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ep1.C13412g;
import gb1.AbstractC15681i;
import ge0.C15728c;
import gf1.C15786e;
import h00.C16497d0;
import h00.C16513l0;
import hy0.AbstractC17783r0;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import i91.C18250d;
import i91.C18252f;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p026b2.InterfaceC2300f;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p133f1.C13921a0;
import p180h0.C16416l0;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: h51.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\u001aÕ\u0001\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00112\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001f\u0010 \u001aË\u0001\u0010$\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010!\u001a\u00020\t2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001a0\u00112\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00112\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\tH\u0003¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010(\u001a\u00020\t*\u00020\u00002\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010/\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,\"\u0014\u00101\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010,\"\u0014\u00103\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010,\"\u0014\u00105\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010,\"\u0014\u00107\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010,¨\u0006:²\u0006\u000e\u00109\u001a\u0002088\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "title", "Li91/a;", "titleColor", "Lb91/c;", "titleTypography", "actionButtonText", "Ly71/g;", "actionButtonIcon", "", "showActionButton", "showTitle", "", "Lm91/u;", "items", "Lb2/f;", "horizontalAlignment", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "modifierBuilder", "Ly81/e;", "backgroundColor", "onBoardingBarColor", "Lkd1/o;", "backgroundImage", "", "Ll83/a0;", "onTileClicked", "Lkotlin/Function0;", "onActionButtonClicked", "showBottomSpacer", "m", "(Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Lb2/f;Lkotlin/jvm/functions/Function3;Ly81/e;Li91/a;Lkd1/o;Lkotlin/jvm/functions/Function1;Lc93/a;ZLandroidx/compose/runtime/Composer;III)V", "hasBackgroundImage", "Ly2/y;", "onCarouselBodyDrawn", "u", "(Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Lb2/f;Lkotlin/jvm/functions/Function3;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;ZLandroidx/compose/runtime/Composer;III)V", "Landroid/content/Context;", "context", "C", "(Lcom/whoop/design/util/TextResource;Landroid/content/Context;)Z", "Ly3/f;", "a", "F", "START_PADDING", "b", "BACKGROUND_HEIGHT", "c", "BACKGROUND_BLUR_RADIUS", "d", "BACKGROUND_TITLE_OFFSET", "e", "BACKGROUND_TITLE_INSET", "f", "BACKGROUND_CONTENT_INSET", "", "heightInPx", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16932d {

    /* JADX INFO: renamed from: a */
    private static final float f64937a;

    /* JADX INFO: renamed from: b */
    private static final float f64938b = 253;

    /* JADX INFO: renamed from: c */
    private static final float f64939c = (float) 7.5d;

    /* JADX INFO: renamed from: d */
    private static final float f64940d = 129;

    /* JADX INFO: renamed from: e */
    private static final float f64941e;

    /* JADX INFO: renamed from: f */
    private static final float f64942f;

    /* JADX INFO: renamed from: h51.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f64943w = new a();

        /* JADX INFO: renamed from: a */
        public final long m47663a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m47663a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: h51.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f64944w = new b();

        /* JADX INFO: renamed from: a */
        public final long m47664a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m47664a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: h51.d$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f64945w = new c();

        /* JADX INFO: renamed from: a */
        public final long m47665a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m47665a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: h51.d$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f64946w = new d();

        /* JADX INFO: renamed from: a */
        public final long m47666a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m47666a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: h51.d$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f64947w = new e();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h51.d$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f64948w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f64949x;

        public f(Function1 function1, List list) {
            this.f64948w = function1;
            this.f64949x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m47668a(int i13) {
            return this.f64948w.invoke(this.f64949x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m47668a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: h51.d$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f64950w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function3 f64951x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f64952y;

        public g(List list, Function3 function3, Function1 function1) {
            this.f64950w = list;
            this.f64951x = function3;
            this.f64952y = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m47669a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f64950w.get(i13);
            c28655q.m87150e0(110873641);
            AbstractC25303l.m74291r(interfaceC25312u, null, this.f64951x, this.f64952y, c28655q, 0, 2);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m47669a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    static {
        float f13 = 8;
        f64937a = 2 * f13;
        float f14 = 4;
        f64941e = f13 * f14;
        f64942f = 7 * f14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m47634A(List list, Function3 function3, Function1 function1, InterfaceC26064q LazyRow) {
        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
        C26053f c26053f = (C26053f) LazyRow;
        c26053f.m77529r(list.size(), null, new f(e.f64947w, list), new C37816b(new g(list, function3, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m47635B(TextResource textResource, AbstractC18247a abstractC18247a, EnumC2888c enumC2888c, TextResource textResource2, C39274g c39274g, boolean z4, boolean z13, List list, InterfaceC2300f interfaceC2300f, Function3 function3, boolean z14, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, boolean z15, int i13, int i14, int i15, Composer composer, int i16) {
        m47657u(textResource, abstractC18247a, enumC2888c, textResource2, c39274g, z4, z13, list, interfaceC2300f, function3, z14, function1, function2, interfaceC4339a, z15, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final boolean m47636C(TextResource textResource, Context context) {
        TextResource.C8688b c8688b = textResource instanceof TextResource.C8688b ? (TextResource.C8688b) textResource : null;
        return AbstractC22676k.m65745e(c8688b != null ? c8688b.resolve(context) : null, "MORE");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0137  */
    /* JADX WARN: Code duplicated, block: B:106:0x013d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0141  */
    /* JADX WARN: Code duplicated, block: B:110:0x0145  */
    /* JADX WARN: Code duplicated, block: B:111:0x014a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0150  */
    /* JADX WARN: Code duplicated, block: B:114:0x0152  */
    /* JADX WARN: Code duplicated, block: B:116:0x0155  */
    /* JADX WARN: Code duplicated, block: B:119:0x015a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0174  */
    /* JADX WARN: Code duplicated, block: B:130:0x017e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0181  */
    /* JADX WARN: Code duplicated, block: B:133:0x0187  */
    /* JADX WARN: Code duplicated, block: B:135:0x018f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0192  */
    /* JADX WARN: Code duplicated, block: B:139:0x0199  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:152:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:154:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:158:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:165:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:171:0x0205  */
    /* JADX WARN: Code duplicated, block: B:175:0x0212  */
    /* JADX WARN: Code duplicated, block: B:178:0x021b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0227  */
    /* JADX WARN: Code duplicated, block: B:199:0x0264 A[PHI: r0 r2 r3 r4 r5 r6 r8 r9 r10 r11 r12 r13 r16 r17 r21
      0x0264: PHI (r0v66 kotlin.jvm.functions.Function3) = (r0v37 kotlin.jvm.functions.Function3), (r0v73 kotlin.jvm.functions.Function3) binds: [B:258:0x0338, B:198:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r2v27 b91.c) = (r2v6 b91.c), (r2v28 b91.c) binds: [B:258:0x0338, B:198:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r3v20 com.whoop.design.util.TextResource) = (r3v3 com.whoop.design.util.TextResource), (r3v21 com.whoop.design.util.TextResource) binds: [B:258:0x0338, B:198:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r4v17 y71.g) = (r4v3 y71.g), (r4v18 y71.g) binds: [B:258:0x0338, B:198:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r5v33 boolean) = (r5v25 boolean), (r5v37 boolean) binds: [B:258:0x0338, B:198:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r6v20 boolean) = (r6v5 boolean), (r6v21 boolean) binds: [B:258:0x0338, B:198:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r8v12 b2.f) = (r8v5 b2.f), (r8v13 b2.f) binds: [B:258:0x0338, B:198:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r9v23 i91.a) = (r9v8 i91.a), (r9v2 i91.a) binds: [B:258:0x0338, B:198:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r10v36 y81.e) = (r10v14 y81.e), (r10v37 y81.e) binds: [B:258:0x0338, B:198:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r11v20 i91.a) = (r11v6 i91.a), (r11v21 i91.a) binds: [B:258:0x0338, B:198:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r12v14 kotlin.jvm.functions.Function1) = (r12v5 kotlin.jvm.functions.Function1), (r12v15 kotlin.jvm.functions.Function1) binds: [B:258:0x0338, B:198:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r13v13 c93.a) = (r13v5 c93.a), (r13v14 c93.a) binds: [B:258:0x0338, B:198:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r16v11 int) = (r16v7 int), (r16v12 int) binds: [B:258:0x0338, B:198:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r17v13 int) = (r17v8 int), (r17v15 int) binds: [B:258:0x0338, B:198:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r21v8 kd1.o) = (r21v5 kd1.o), (r21v9 kd1.o) binds: [B:258:0x0338, B:198:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:200:0x0268  */
    /* JADX WARN: Code duplicated, block: B:202:0x026c  */
    /* JADX WARN: Code duplicated, block: B:204:0x0272  */
    /* JADX WARN: Code duplicated, block: B:206:0x0280  */
    /* JADX WARN: Code duplicated, block: B:208:0x0283  */
    /* JADX WARN: Code duplicated, block: B:209:0x0285  */
    /* JADX WARN: Code duplicated, block: B:212:0x028b  */
    /* JADX WARN: Code duplicated, block: B:214:0x0293  */
    /* JADX WARN: Code duplicated, block: B:216:0x0296  */
    /* JADX WARN: Code duplicated, block: B:218:0x0299  */
    /* JADX WARN: Code duplicated, block: B:220:0x029c  */
    /* JADX WARN: Code duplicated, block: B:223:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:224:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:227:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:229:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:231:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:234:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:236:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:238:0x02df  */
    /* JADX WARN: Code duplicated, block: B:240:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:241:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:244:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:246:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:247:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:249:0x0304  */
    /* JADX WARN: Code duplicated, block: B:251:0x030a  */
    /* JADX WARN: Code duplicated, block: B:253:0x0310  */
    /* JADX WARN: Code duplicated, block: B:254:0x031d  */
    /* JADX WARN: Code duplicated, block: B:256:0x0323  */
    /* JADX WARN: Code duplicated, block: B:259:0x033a  */
    /* JADX WARN: Code duplicated, block: B:262:0x0346  */
    /* JADX WARN: Code duplicated, block: B:263:0x034e  */
    /* JADX WARN: Code duplicated, block: B:266:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:267:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:270:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:273:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:277:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:279:0x0434  */
    /* JADX WARN: Code duplicated, block: B:280:0x0438  */
    /* JADX WARN: Code duplicated, block: B:283:0x0445  */
    /* JADX WARN: Code duplicated, block: B:285:0x0453  */
    /* JADX WARN: Code duplicated, block: B:287:0x049a  */
    /* JADX WARN: Code duplicated, block: B:289:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:290:0x04af  */
    /* JADX WARN: Code duplicated, block: B:293:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:295:0x0539  */
    /* JADX WARN: Code duplicated, block: B:298:0x0559  */
    /* JADX WARN: Code duplicated, block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0103  */
    /* JADX WARN: Code duplicated, block: B:86:0x0108  */
    /* JADX WARN: Code duplicated, block: B:88:0x010e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0114  */
    /* JADX WARN: Code duplicated, block: B:91:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    /* JADX INFO: renamed from: m */
    public static final void m47649m(final TextResource title, AbstractC18247a abstractC18247a, EnumC2888c enumC2888c, TextResource textResource, C39274g c39274g, boolean z4, boolean z13, final List<? extends InterfaceC25312u> items, InterfaceC2300f interfaceC2300f, Function3 function3, InterfaceC39332e interfaceC39332e, AbstractC18247a abstractC18247a2, AbstractC22403o abstractC22403o, Function1 function1, InterfaceC4339a interfaceC4339a, boolean z14, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        AbstractC18247a abstractC18247a3;
        TextResource textResourceM21267a;
        C39274g c39274g2;
        int i17;
        int i18;
        boolean z15;
        int i19;
        int i24;
        boolean z16;
        int i25;
        int i26;
        InterfaceC2300f interfaceC2300f2;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        boolean z17;
        final EnumC2888c enumC2888c2;
        final AbstractC18247a abstractC18247a4;
        final boolean z18;
        final AbstractC18247a abstractC18247a5;
        final TextResource textResource2;
        final C39274g c39274g3;
        final boolean z19;
        final Function3 function4;
        final InterfaceC39332e interfaceC39332e2;
        final Function1 function2;
        final InterfaceC4339a interfaceC4339a2;
        final InterfaceC2300f interfaceC2300f3;
        final boolean z24;
        final AbstractC22403o abstractC22403o2;
        C28677v1 c28677v1M87180u;
        int i48;
        C28676v0 c28676v0;
        AbstractC18247a abstractC18247aM52574l;
        EnumC2888c enumC2888c3;
        Function3 c15786e;
        InterfaceC39332e interfaceC39332eM125323a;
        AbstractC18247a abstractC18247aM52574l2;
        AbstractC22403o abstractC22403o3;
        Function1 function5;
        InterfaceC4339a interfaceC4339a3;
        int i49;
        TextResource textResource3;
        C39274g c39274g4;
        EnumC2888c enumC2888c4;
        boolean z25;
        AbstractC18247a abstractC18247a6;
        Function1 function6;
        InterfaceC4339a interfaceC4339a4;
        Function3 function7;
        InterfaceC39332e interfaceC39332e3;
        InterfaceC2300f interfaceC2300f4;
        boolean z26;
        boolean z27;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        InterfaceC28601c1 interfaceC28601c1;
        C2314t c2314t;
        C2307m c2307m;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        AbstractC18247a abstractC18247a7;
        C0209i c0209i4;
        C1100b c1100b;
        boolean z28;
        boolean z29;
        boolean z34;
        Object objM87133R7;
        int iHashCode2;
        int i54;
        boolean zM87157i;
        int i55;
        int i56;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(items, "items");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-959366484);
        if ((i13 & 6) == 0) {
            i16 = (c28655q.m87153g(title) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i15 & 2) == 0) {
                abstractC18247a3 = abstractC18247a;
                int i57 = c28655q.m87153g(abstractC18247a3) ? 32 : 16;
                i16 |= i57;
            } else {
                abstractC18247a3 = abstractC18247a;
            }
            i16 |= i57;
        } else {
            abstractC18247a3 = abstractC18247a;
        }
        int i58 = i15 & 4;
        if (i58 != 0) {
            i16 |= 384;
        } else if ((i13 & 384) == 0) {
            i16 |= c28655q.m87149e(enumC2888c == null ? -1 : enumC2888c.ordinal()) ? 256 : 128;
        }
        int i59 = i13 & 3072;
        int i64 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i59 == 0) {
            if ((i15 & 8) == 0) {
                textResourceM21267a = textResource;
                if (c28655q.m87153g(textResourceM21267a)) {
                    i56 = 2048;
                }
                i16 |= i56;
            } else {
                textResourceM21267a = textResource;
            }
            i56 = 1024;
            i16 |= i56;
        } else {
            textResourceM21267a = textResource;
        }
        int i65 = i15 & 16;
        int i66 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i65 == 0) {
            if ((i13 & 24576) == 0) {
                c39274g2 = c39274g;
                i16 |= c28655q.m87153g(c39274g2) ? 16384 : 8192;
            }
            i17 = i15 & 32;
            i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            if (i17 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                z15 = z4;
            } else {
                z15 = z4;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87155h(z15)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i16 |= i19;
                }
            }
            i24 = i15 & 64;
            if (i24 != 0) {
                i16 |= 1572864;
                z16 = z13;
            } else {
                z16 = z13;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87155h(z16)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i16 |= i25;
                }
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(items)) {
                    i55 = 8388608;
                } else {
                    i55 = 4194304;
                }
                i16 |= i55;
            }
            i26 = i15 & 256;
            if (i26 != 0) {
                i16 |= 100663296;
                interfaceC2300f2 = interfaceC2300f;
            } else {
                interfaceC2300f2 = interfaceC2300f;
                if ((i13 & 100663296) == 0) {
                    if (c28655q.m87153g(interfaceC2300f2)) {
                        i27 = 67108864;
                    } else {
                        i27 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i27;
                }
            }
            if ((i13 & 805306368) != 0) {
                i16 |= ((i15 & 512) == 0 || !c28655q.m87157i(function3)) ? 268435456 : 536870912;
            }
            if ((i14 & 6) == 0) {
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    i54 = 2;
                } else {
                    if ((i14 & 8) == 0) {
                        zM87157i = c28655q.m87153g(interfaceC39332e);
                    } else {
                        zM87157i = c28655q.m87157i(interfaceC39332e);
                    }
                    if (zM87157i) {
                        i54 = 4;
                    } else {
                        i54 = 2;
                    }
                }
                i28 = i54 | i14;
            } else {
                i28 = i14;
            }
            if ((i14 & 48) == 0) {
                i29 = i28 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 || !c28655q.m87153g(abstractC18247a2)) ? 16 : 32);
            } else {
                i29 = i28;
            }
            i34 = i15 & 4096;
            if (i34 != 0) {
                i36 = i29 | 384;
            } else {
                i35 = i29;
                if ((i14 & 384) != 0) {
                    if (c28655q.m87153g(abstractC22403o)) {
                        i37 = 256;
                    } else {
                        i37 = 128;
                    }
                    i35 |= i37;
                }
                i36 = i35;
            }
            i38 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i38 != 0) {
                i44 = i36 | 3072;
            } else {
                i39 = i36;
                if ((i14 & 3072) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i64 = 2048;
                    }
                    i44 = i39 | i64;
                } else {
                    i44 = i39;
                }
            }
            i45 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i45 != 0) {
                i46 = i44;
                if ((i14 & 24576) == 0) {
                    if (c28655q.m87157i(interfaceC4339a)) {
                        i66 = 16384;
                    }
                    i46 |= i66;
                }
                i47 = i15 & 32768;
                if (i47 != 0) {
                    i46 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87155h(z14)) {
                        i18 = 131072;
                    }
                    i46 |= i18;
                }
                if ((i16 & 306783379) == 306783378 || (i46 & 74899) != 74898) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (c28655q.m87135U(i16 & 1, z17)) {
                    c28655q.m87140Z();
                    i48 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i48 != 0 || c28655q.m87118C()) {
                        if ((i15 & 2) != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = a.f64943w;
                                c28655q.m87172p0(objM87133R5);
                            }
                            abstractC18247aM52574l = AbstractC18249c.m52574l((Function1) objM87133R5);
                            i16 &= -113;
                        } else {
                            abstractC18247aM52574l = abstractC18247a3;
                        }
                        if (i58 != 0) {
                            enumC2888c3 = null;
                        } else {
                            enumC2888c3 = enumC2888c;
                        }
                        if ((i15 & 8) != 0) {
                            textResourceM21267a = AbstractC8693b.m21267a();
                            i16 &= -7169;
                        }
                        if (i65 != 0) {
                            c39274g2 = null;
                        }
                        if (i17 != 0) {
                            z15 = false;
                        }
                        if (i24 != 0) {
                            z16 = true;
                        }
                        if (i26 != 0) {
                            interfaceC2300f2 = C2299e.f9110M;
                        }
                        if ((i15 & 512) != 0) {
                            c15786e = new C15786e(1);
                            i16 &= -1879048193;
                        } else {
                            c15786e = function3;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = b.f64944w;
                                c28655q.m87172p0(objM87133R4);
                            }
                            interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R4);
                            i46 &= -15;
                        } else {
                            interfaceC39332eM125323a = interfaceC39332e;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = c.f64945w;
                                c28655q.m87172p0(objM87133R3);
                            }
                            abstractC18247aM52574l2 = AbstractC18249c.m52574l((Function1) objM87133R3);
                            i46 &= -113;
                        } else {
                            abstractC18247aM52574l2 = abstractC18247a2;
                        }
                        if (i34 != 0) {
                            abstractC22403o3 = null;
                        } else {
                            abstractC22403o3 = abstractC22403o;
                        }
                        AbstractC18247a abstractC18247a8 = abstractC18247aM52574l;
                        if (i38 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C16513l0(17);
                                c28655q.m87172p0(objM87133R2);
                            }
                            function5 = (Function1) objM87133R2;
                        } else {
                            abstractC18247aM52574l2 = abstractC18247aM52574l2;
                            function5 = function1;
                        }
                        if (i45 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C16497d0(11);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        } else {
                            function5 = function5;
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        i49 = i16;
                        textResource3 = textResourceM21267a;
                        c39274g4 = c39274g2;
                        enumC2888c4 = enumC2888c3;
                        z25 = z15;
                        abstractC18247a6 = abstractC18247aM52574l2;
                        function6 = function5;
                        interfaceC4339a4 = interfaceC4339a3;
                        function7 = c15786e;
                        interfaceC39332e3 = interfaceC39332eM125323a;
                        abstractC18247a3 = abstractC18247a8;
                        interfaceC2300f4 = interfaceC2300f2;
                        z26 = z16;
                        if (i47 != 0) {
                            z27 = true;
                        }
                        c28655q.m87175r();
                        Function3 function8 = function7;
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC11895b.m32005x(0, c28655q);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R6;
                        EnumC2888c enumC2888c5 = enumC2888c4;
                        TextResource textResource4 = textResource3;
                        float fMo733e0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo733e0(m47655s(interfaceC28601c1));
                        long jMo134584toComposableColorWaAFU9c = interfaceC39332e3.mo134584toComposableColorWaAFU9c(c28655q, i46 & 14);
                        C39274g c39274g5 = c39274g4;
                        C17916v0 c17916v0 = AbstractC17918w0.f69621a;
                        boolean z35 = z25;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM3358c = AbstractC1092a.m3358c(c2314t, jMo134584toComposableColorWaAFU9c, c17916v0);
                        c2307m = C2299e.f9114w;
                        boolean z36 = z26;
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                        InterfaceC2300f interfaceC2300f5 = interfaceC2300f4;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        AbstractC18247a abstractC18247a9 = abstractC18247a3;
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
                        InterfaceC39332e interfaceC39332e4 = interfaceC39332e3;
                        if (c28655q.f115903S) {
                            abstractC18247a7 = abstractC18247a6;
                        } else {
                            abstractC18247a7 = abstractC18247a6;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            c0209i4 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                            c1100b = C1100b.f4583a;
                            if (abstractC22403o3 != null) {
                                c28655q.m87150e0(-1689303902);
                                float f13 = 4;
                                C33252i c33252iM105489e = AbstractC33253j.m105489e(f13 * f13);
                                Modifier modifierM44113a = AbstractC15681i.m44113a(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f64938b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f64937a, 0.0f, 2)), c33252iM105489e), c33252iM105489e, 0.0f, c28655q, 0, 2);
                                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                                iHashCode2 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44113a);
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
                                AbstractC17783r0.m51101c(AbstractC22404p.m64500i(abstractC22403o3, null, null, c28655q, (i46 >> 6) & 14, 3), 0.4036f, f64939c, c1100b.mo3401b(c2314t), null, c28655q, 432, 16);
                                z28 = true;
                                c28655q.m87173q(true);
                                z29 = false;
                                c28655q.m87173q(false);
                            } else {
                                z28 = true;
                                z29 = false;
                                c28655q.m87150e0(-1688613904);
                                c28655q.m87173q(false);
                            }
                            if (abstractC22403o3 != null) {
                                z34 = z28;
                            } else {
                                z34 = z29;
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C13921a0(18, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R7);
                            }
                            int i67 = i46 >> 3;
                            AbstractC18247a abstractC18247a10 = abstractC18247a7;
                            Function1 function9 = function6;
                            InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                            boolean z37 = z27;
                            m47657u(title, abstractC18247a9, enumC2888c5, textResource4, c39274g5, z35, z36, items, interfaceC2300f5, function8, z34, (Function1) objM87133R7, function9, interfaceC4339a5, z37, c28655q, i49 & 2147483646, (i67 & 896) | 48 | (i67 & 7168) | (i67 & 57344), 0);
                            AbstractC22989q.m66760a(c1100b.mo3400a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(1 * 4, AbstractC1102d.m3411h(fMo733e0, c2314t)), abstractC18247a10), C2299e.f9117z), c28655q, 0);
                            c28655q.m87173q(true);
                            interfaceC2300f3 = interfaceC2300f5;
                            z18 = z37;
                            function4 = function8;
                            interfaceC39332e2 = interfaceC39332e4;
                            function2 = function9;
                            interfaceC4339a2 = interfaceC4339a5;
                            abstractC22403o2 = abstractC22403o3;
                            abstractC18247a4 = abstractC18247a10;
                            z19 = z36;
                            z24 = z35;
                            c39274g3 = c39274g5;
                            textResource2 = textResource4;
                            enumC2888c2 = enumC2888c5;
                            abstractC18247a5 = abstractC18247a9;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        c1100b = C1100b.f4583a;
                        if (abstractC22403o3 != null) {
                            c28655q.m87150e0(-1689303902);
                            float f14 = 4;
                            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(f14 * f14);
                            Modifier modifierM44113a2 = AbstractC15681i.m44113a(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f64938b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f64937a, 0.0f, 2)), c33252iM105489e2), c33252iM105489e2, 0.0f, c28655q, 0, 2);
                            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM44113a2);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                            AbstractC17783r0.m51101c(AbstractC22404p.m64500i(abstractC22403o3, null, null, c28655q, (i46 >> 6) & 14, 3), 0.4036f, f64939c, c1100b.mo3401b(c2314t), null, c28655q, 432, 16);
                            z28 = true;
                            c28655q.m87173q(true);
                            z29 = false;
                            c28655q.m87173q(false);
                        } else {
                            z28 = true;
                            z29 = false;
                            c28655q.m87150e0(-1688613904);
                            c28655q.m87173q(false);
                        }
                        if (abstractC22403o3 != null) {
                            z34 = z28;
                        } else {
                            z34 = z29;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C13921a0(18, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R7);
                        }
                        int i68 = i46 >> 3;
                        AbstractC18247a abstractC18247a11 = abstractC18247a7;
                        Function1 function10 = function6;
                        InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
                        boolean z38 = z27;
                        m47657u(title, abstractC18247a9, enumC2888c5, textResource4, c39274g5, z35, z36, items, interfaceC2300f5, function8, z34, (Function1) objM87133R7, function10, interfaceC4339a6, z38, c28655q, i49 & 2147483646, (i68 & 896) | 48 | (i68 & 7168) | (i68 & 57344), 0);
                        AbstractC22989q.m66760a(c1100b.mo3400a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(1 * 4, AbstractC1102d.m3411h(fMo733e0, c2314t)), abstractC18247a11), C2299e.f9117z), c28655q, 0);
                        c28655q.m87173q(true);
                        interfaceC2300f3 = interfaceC2300f5;
                        z18 = z38;
                        function4 = function8;
                        interfaceC39332e2 = interfaceC39332e4;
                        function2 = function10;
                        interfaceC4339a2 = interfaceC4339a6;
                        abstractC22403o2 = abstractC22403o3;
                        abstractC18247a4 = abstractC18247a11;
                        z19 = z36;
                        z24 = z35;
                        c39274g3 = c39274g5;
                        textResource2 = textResource4;
                        enumC2888c2 = enumC2888c5;
                        abstractC18247a5 = abstractC18247a9;
                    } else {
                        c28655q.m87138X();
                        if ((i15 & 2) != 0) {
                            i16 &= -113;
                        }
                        if ((i15 & 8) != 0) {
                            i16 &= -7169;
                        }
                        if ((i15 & 512) != 0) {
                            i16 &= -1879048193;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i46 &= -15;
                        }
                        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            i46 &= -113;
                        }
                        enumC2888c4 = enumC2888c;
                        function7 = function3;
                        abstractC22403o3 = abstractC22403o;
                        function6 = function1;
                        i49 = i16;
                        interfaceC2300f4 = interfaceC2300f2;
                        textResource3 = textResourceM21267a;
                        c39274g4 = c39274g2;
                        z25 = z15;
                        z26 = z16;
                        interfaceC39332e3 = interfaceC39332e;
                        abstractC18247a6 = abstractC18247a2;
                        interfaceC4339a4 = interfaceC4339a;
                    }
                    z27 = z14;
                    c28655q.m87175r();
                    Function3 function11 = function7;
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC11895b.m32005x(0, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R6;
                    EnumC2888c enumC2888c6 = enumC2888c4;
                    TextResource textResource5 = textResource3;
                    float fMo733e1 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo733e0(m47655s(interfaceC28601c1));
                    long jMo134584toComposableColorWaAFU9c2 = interfaceC39332e3.mo134584toComposableColorWaAFU9c(c28655q, i46 & 14);
                    C39274g c39274g6 = c39274g4;
                    C17916v0 c17916v1 = AbstractC17918w0.f69621a;
                    boolean z39 = z25;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3358c2 = AbstractC1092a.m3358c(c2314t, jMo134584toComposableColorWaAFU9c2, c17916v1);
                    c2307m = C2299e.f9114w;
                    boolean z310 = z26;
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                    InterfaceC2300f interfaceC2300f6 = interfaceC2300f4;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    AbstractC18247a abstractC18247a12 = abstractC18247a3;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                    c0209i3 = C0217k.f732j;
                    InterfaceC39332e interfaceC39332e5 = interfaceC39332e3;
                    if (c28655q.f115903S) {
                        abstractC18247a7 = abstractC18247a6;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                        c1100b = C1100b.f4583a;
                        if (abstractC22403o3 != null) {
                            c28655q.m87150e0(-1689303902);
                            float f15 = 4;
                            C33252i c33252iM105489e3 = AbstractC33253j.m105489e(f15 * f15);
                            Modifier modifierM44113a3 = AbstractC15681i.m44113a(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f64938b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f64937a, 0.0f, 2)), c33252iM105489e3), c33252iM105489e3, 0.0f, c28655q, 0, 2);
                            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m, false);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM44113a3);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d5);
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                            AbstractC17783r0.m51101c(AbstractC22404p.m64500i(abstractC22403o3, null, null, c28655q, (i46 >> 6) & 14, 3), 0.4036f, f64939c, c1100b.mo3401b(c2314t), null, c28655q, 432, 16);
                            z28 = true;
                            c28655q.m87173q(true);
                            z29 = false;
                            c28655q.m87173q(false);
                        } else {
                            z28 = true;
                            z29 = false;
                            c28655q.m87150e0(-1688613904);
                            c28655q.m87173q(false);
                        }
                        if (abstractC22403o3 != null) {
                            z34 = z28;
                        } else {
                            z34 = z29;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C13921a0(18, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R7);
                        }
                        int i69 = i46 >> 3;
                        AbstractC18247a abstractC18247a13 = abstractC18247a7;
                        Function1 function12 = function6;
                        InterfaceC4339a interfaceC4339a7 = interfaceC4339a4;
                        boolean z311 = z27;
                        m47657u(title, abstractC18247a12, enumC2888c6, textResource5, c39274g6, z39, z310, items, interfaceC2300f6, function11, z34, (Function1) objM87133R7, function12, interfaceC4339a7, z311, c28655q, i49 & 2147483646, (i69 & 896) | 48 | (i69 & 7168) | (i69 & 57344), 0);
                        AbstractC22989q.m66760a(c1100b.mo3400a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(1 * 4, AbstractC1102d.m3411h(fMo733e1, c2314t)), abstractC18247a13), C2299e.f9117z), c28655q, 0);
                        c28655q.m87173q(true);
                        interfaceC2300f3 = interfaceC2300f6;
                        z18 = z311;
                        function4 = function11;
                        interfaceC39332e2 = interfaceC39332e5;
                        function2 = function12;
                        interfaceC4339a2 = interfaceC4339a7;
                        abstractC22403o2 = abstractC22403o3;
                        abstractC18247a4 = abstractC18247a13;
                        z19 = z310;
                        z24 = z39;
                        c39274g3 = c39274g6;
                        textResource2 = textResource5;
                        enumC2888c2 = enumC2888c6;
                        abstractC18247a5 = abstractC18247a12;
                    } else {
                        abstractC18247a7 = abstractC18247a6;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                    c1100b = C1100b.f4583a;
                    if (abstractC22403o3 != null) {
                        c28655q.m87150e0(-1689303902);
                        float f16 = 4;
                        C33252i c33252iM105489e4 = AbstractC33253j.m105489e(f16 * f16);
                        Modifier modifierM44113a4 = AbstractC15681i.m44113a(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f64938b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f64937a, 0.0f, 2)), c33252iM105489e4), c33252iM105489e4, 0.0f, c28655q, 0, 2);
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM44113a4);
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
                        AbstractC17783r0.m51101c(AbstractC22404p.m64500i(abstractC22403o3, null, null, c28655q, (i46 >> 6) & 14, 3), 0.4036f, f64939c, c1100b.mo3401b(c2314t), null, c28655q, 432, 16);
                        z28 = true;
                        c28655q.m87173q(true);
                        z29 = false;
                        c28655q.m87173q(false);
                    } else {
                        z28 = true;
                        z29 = false;
                        c28655q.m87150e0(-1688613904);
                        c28655q.m87173q(false);
                    }
                    if (abstractC22403o3 != null) {
                        z34 = z28;
                    } else {
                        z34 = z29;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C13921a0(18, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    int i610 = i46 >> 3;
                    AbstractC18247a abstractC18247a14 = abstractC18247a7;
                    Function1 function13 = function6;
                    InterfaceC4339a interfaceC4339a8 = interfaceC4339a4;
                    boolean z312 = z27;
                    m47657u(title, abstractC18247a12, enumC2888c6, textResource5, c39274g6, z39, z310, items, interfaceC2300f6, function11, z34, (Function1) objM87133R7, function13, interfaceC4339a8, z312, c28655q, i49 & 2147483646, (i610 & 896) | 48 | (i610 & 7168) | (i610 & 57344), 0);
                    AbstractC22989q.m66760a(c1100b.mo3400a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(1 * 4, AbstractC1102d.m3411h(fMo733e1, c2314t)), abstractC18247a14), C2299e.f9117z), c28655q, 0);
                    c28655q.m87173q(true);
                    interfaceC2300f3 = interfaceC2300f6;
                    z18 = z312;
                    function4 = function11;
                    interfaceC39332e2 = interfaceC39332e5;
                    function2 = function13;
                    interfaceC4339a2 = interfaceC4339a8;
                    abstractC22403o2 = abstractC22403o3;
                    abstractC18247a4 = abstractC18247a14;
                    z19 = z310;
                    z24 = z39;
                    c39274g3 = c39274g6;
                    textResource2 = textResource5;
                    enumC2888c2 = enumC2888c6;
                    abstractC18247a5 = abstractC18247a12;
                } else {
                    c28655q.m87138X();
                    enumC2888c2 = enumC2888c;
                    abstractC18247a4 = abstractC18247a2;
                    z18 = z14;
                    abstractC18247a5 = abstractC18247a3;
                    textResource2 = textResourceM21267a;
                    c39274g3 = c39274g2;
                    z19 = z16;
                    function4 = function3;
                    interfaceC39332e2 = interfaceC39332e;
                    function2 = function1;
                    interfaceC4339a2 = interfaceC4339a;
                    interfaceC2300f3 = interfaceC2300f2;
                    z24 = z15;
                    abstractC22403o2 = abstractC22403o;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h51.c
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC16932d.m47652p(title, abstractC18247a5, enumC2888c2, textResource2, c39274g3, z24, z19, items, interfaceC2300f3, function4, interfaceC39332e2, abstractC18247a4, abstractC22403o2, function2, interfaceC4339a2, z18, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i46 = i44 | 24576;
            i47 = i15 & 32768;
            if (i47 != 0) {
                i46 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87155h(z14)) {
                    i18 = 131072;
                }
                i46 |= i18;
            }
            if ((i16 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (c28655q.m87135U(i16 & 1, z17)) {
                c28655q.m87140Z();
                i48 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i48 != 0) {
                    if ((i15 & 2) != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = a.f64943w;
                            c28655q.m87172p0(objM87133R5);
                        }
                        abstractC18247aM52574l = AbstractC18249c.m52574l((Function1) objM87133R5);
                        i16 &= -113;
                    } else {
                        abstractC18247aM52574l = abstractC18247a3;
                    }
                    if (i58 != 0) {
                        enumC2888c3 = null;
                    } else {
                        enumC2888c3 = enumC2888c;
                    }
                    if ((i15 & 8) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i16 &= -7169;
                    }
                    if (i65 != 0) {
                        c39274g2 = null;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    }
                    if (i26 != 0) {
                        interfaceC2300f2 = C2299e.f9110M;
                    }
                    if ((i15 & 512) != 0) {
                        c15786e = new C15786e(1);
                        i16 &= -1879048193;
                    } else {
                        c15786e = function3;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = b.f64944w;
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R4);
                        i46 &= -15;
                    } else {
                        interfaceC39332eM125323a = interfaceC39332e;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = c.f64945w;
                            c28655q.m87172p0(objM87133R3);
                        }
                        abstractC18247aM52574l2 = AbstractC18249c.m52574l((Function1) objM87133R3);
                        i46 &= -113;
                    } else {
                        abstractC18247aM52574l2 = abstractC18247a2;
                    }
                    if (i34 != 0) {
                        abstractC22403o3 = null;
                    } else {
                        abstractC22403o3 = abstractC22403o;
                    }
                    AbstractC18247a abstractC18247a15 = abstractC18247aM52574l;
                    if (i38 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C16513l0(17);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    } else {
                        abstractC18247aM52574l2 = abstractC18247aM52574l2;
                        function5 = function1;
                    }
                    if (i45 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C16497d0(11);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        function5 = function5;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    i49 = i16;
                    textResource3 = textResourceM21267a;
                    c39274g4 = c39274g2;
                    enumC2888c4 = enumC2888c3;
                    z25 = z15;
                    abstractC18247a6 = abstractC18247aM52574l2;
                    function6 = function5;
                    interfaceC4339a4 = interfaceC4339a3;
                    function7 = c15786e;
                    interfaceC39332e3 = interfaceC39332eM125323a;
                    abstractC18247a3 = abstractC18247a15;
                    interfaceC2300f4 = interfaceC2300f2;
                    z26 = z16;
                    if (i47 != 0) {
                        z27 = true;
                    } else {
                        z27 = z14;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = a.f64943w;
                            c28655q.m87172p0(objM87133R5);
                        }
                        abstractC18247aM52574l = AbstractC18249c.m52574l((Function1) objM87133R5);
                        i16 &= -113;
                    } else {
                        abstractC18247aM52574l = abstractC18247a3;
                    }
                    if (i58 != 0) {
                        enumC2888c3 = null;
                    } else {
                        enumC2888c3 = enumC2888c;
                    }
                    if ((i15 & 8) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i16 &= -7169;
                    }
                    if (i65 != 0) {
                        c39274g2 = null;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    }
                    if (i26 != 0) {
                        interfaceC2300f2 = C2299e.f9110M;
                    }
                    if ((i15 & 512) != 0) {
                        c15786e = new C15786e(1);
                        i16 &= -1879048193;
                    } else {
                        c15786e = function3;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = b.f64944w;
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R4);
                        i46 &= -15;
                    } else {
                        interfaceC39332eM125323a = interfaceC39332e;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = c.f64945w;
                            c28655q.m87172p0(objM87133R3);
                        }
                        abstractC18247aM52574l2 = AbstractC18249c.m52574l((Function1) objM87133R3);
                        i46 &= -113;
                    } else {
                        abstractC18247aM52574l2 = abstractC18247a2;
                    }
                    if (i34 != 0) {
                        abstractC22403o3 = null;
                    } else {
                        abstractC22403o3 = abstractC22403o;
                    }
                    AbstractC18247a abstractC18247a16 = abstractC18247aM52574l;
                    if (i38 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C16513l0(17);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    } else {
                        abstractC18247aM52574l2 = abstractC18247aM52574l2;
                        function5 = function1;
                    }
                    if (i45 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C16497d0(11);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        function5 = function5;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    i49 = i16;
                    textResource3 = textResourceM21267a;
                    c39274g4 = c39274g2;
                    enumC2888c4 = enumC2888c3;
                    z25 = z15;
                    abstractC18247a6 = abstractC18247aM52574l2;
                    function6 = function5;
                    interfaceC4339a4 = interfaceC4339a3;
                    function7 = c15786e;
                    interfaceC39332e3 = interfaceC39332eM125323a;
                    abstractC18247a3 = abstractC18247a16;
                    interfaceC2300f4 = interfaceC2300f2;
                    z26 = z16;
                    if (i47 != 0) {
                        z27 = true;
                    } else {
                        z27 = z14;
                    }
                }
                c28655q.m87175r();
                Function3 function14 = function7;
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC11895b.m32005x(0, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R6;
                EnumC2888c enumC2888c7 = enumC2888c4;
                TextResource textResource6 = textResource3;
                float fMo733e2 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo733e0(m47655s(interfaceC28601c1));
                long jMo134584toComposableColorWaAFU9c3 = interfaceC39332e3.mo134584toComposableColorWaAFU9c(c28655q, i46 & 14);
                C39274g c39274g7 = c39274g4;
                C17916v0 c17916v2 = AbstractC17918w0.f69621a;
                boolean z313 = z25;
                c2314t = C2314t.f9131w;
                Modifier modifierM3358c3 = AbstractC1092a.m3358c(c2314t, jMo134584toComposableColorWaAFU9c3, c17916v2);
                c2307m = C2299e.f9114w;
                boolean z314 = z26;
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m, false);
                InterfaceC2300f interfaceC2300f7 = interfaceC2300f4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3358c3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                AbstractC18247a abstractC18247a17 = abstractC18247a3;
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
                InterfaceC39332e interfaceC39332e6 = interfaceC39332e3;
                if (c28655q.f115903S) {
                    abstractC18247a7 = abstractC18247a6;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
                    c1100b = C1100b.f4583a;
                    if (abstractC22403o3 != null) {
                        c28655q.m87150e0(-1689303902);
                        float f17 = 4;
                        C33252i c33252iM105489e5 = AbstractC33253j.m105489e(f17 * f17);
                        Modifier modifierM44113a5 = AbstractC15681i.m44113a(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f64938b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f64937a, 0.0f, 2)), c33252iM105489e5), c33252iM105489e5, 0.0f, c28655q, 0, 2);
                        InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM44113a5);
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
                        AbstractC17783r0.m51101c(AbstractC22404p.m64500i(abstractC22403o3, null, null, c28655q, (i46 >> 6) & 14, 3), 0.4036f, f64939c, c1100b.mo3401b(c2314t), null, c28655q, 432, 16);
                        z28 = true;
                        c28655q.m87173q(true);
                        z29 = false;
                        c28655q.m87173q(false);
                    } else {
                        z28 = true;
                        z29 = false;
                        c28655q.m87150e0(-1688613904);
                        c28655q.m87173q(false);
                    }
                    if (abstractC22403o3 != null) {
                        z34 = z28;
                    } else {
                        z34 = z29;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C13921a0(18, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    int i611 = i46 >> 3;
                    AbstractC18247a abstractC18247a18 = abstractC18247a7;
                    Function1 function15 = function6;
                    InterfaceC4339a interfaceC4339a9 = interfaceC4339a4;
                    boolean z315 = z27;
                    m47657u(title, abstractC18247a17, enumC2888c7, textResource6, c39274g7, z313, z314, items, interfaceC2300f7, function14, z34, (Function1) objM87133R7, function15, interfaceC4339a9, z315, c28655q, i49 & 2147483646, (i611 & 896) | 48 | (i611 & 7168) | (i611 & 57344), 0);
                    AbstractC22989q.m66760a(c1100b.mo3400a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(1 * 4, AbstractC1102d.m3411h(fMo733e2, c2314t)), abstractC18247a18), C2299e.f9117z), c28655q, 0);
                    c28655q.m87173q(true);
                    interfaceC2300f3 = interfaceC2300f7;
                    z18 = z315;
                    function4 = function14;
                    interfaceC39332e2 = interfaceC39332e6;
                    function2 = function15;
                    interfaceC4339a2 = interfaceC4339a9;
                    abstractC22403o2 = abstractC22403o3;
                    abstractC18247a4 = abstractC18247a18;
                    z19 = z314;
                    z24 = z313;
                    c39274g3 = c39274g7;
                    textResource2 = textResource6;
                    enumC2888c2 = enumC2888c7;
                    abstractC18247a5 = abstractC18247a17;
                } else {
                    abstractC18247a7 = abstractC18247a6;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
                c1100b = C1100b.f4583a;
                if (abstractC22403o3 != null) {
                    c28655q.m87150e0(-1689303902);
                    float f18 = 4;
                    C33252i c33252iM105489e6 = AbstractC33253j.m105489e(f18 * f18);
                    Modifier modifierM44113a6 = AbstractC15681i.m44113a(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f64938b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f64937a, 0.0f, 2)), c33252iM105489e6), c33252iM105489e6, 0.0f, c28655q, 0, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM44113a6);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d9);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m9);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N9);
                    AbstractC17783r0.m51101c(AbstractC22404p.m64500i(abstractC22403o3, null, null, c28655q, (i46 >> 6) & 14, 3), 0.4036f, f64939c, c1100b.mo3401b(c2314t), null, c28655q, 432, 16);
                    z28 = true;
                    c28655q.m87173q(true);
                    z29 = false;
                    c28655q.m87173q(false);
                } else {
                    z28 = true;
                    z29 = false;
                    c28655q.m87150e0(-1688613904);
                    c28655q.m87173q(false);
                }
                if (abstractC22403o3 != null) {
                    z34 = z28;
                } else {
                    z34 = z29;
                }
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C13921a0(18, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R7);
                }
                int i612 = i46 >> 3;
                AbstractC18247a abstractC18247a19 = abstractC18247a7;
                Function1 function16 = function6;
                InterfaceC4339a interfaceC4339a10 = interfaceC4339a4;
                boolean z316 = z27;
                m47657u(title, abstractC18247a17, enumC2888c7, textResource6, c39274g7, z313, z314, items, interfaceC2300f7, function14, z34, (Function1) objM87133R7, function16, interfaceC4339a10, z316, c28655q, i49 & 2147483646, (i612 & 896) | 48 | (i612 & 7168) | (i612 & 57344), 0);
                AbstractC22989q.m66760a(c1100b.mo3400a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(1 * 4, AbstractC1102d.m3411h(fMo733e2, c2314t)), abstractC18247a19), C2299e.f9117z), c28655q, 0);
                c28655q.m87173q(true);
                interfaceC2300f3 = interfaceC2300f7;
                z18 = z316;
                function4 = function14;
                interfaceC39332e2 = interfaceC39332e6;
                function2 = function16;
                interfaceC4339a2 = interfaceC4339a10;
                abstractC22403o2 = abstractC22403o3;
                abstractC18247a4 = abstractC18247a19;
                z19 = z314;
                z24 = z313;
                c39274g3 = c39274g7;
                textResource2 = textResource6;
                enumC2888c2 = enumC2888c7;
                abstractC18247a5 = abstractC18247a17;
            } else {
                c28655q.m87138X();
                enumC2888c2 = enumC2888c;
                abstractC18247a4 = abstractC18247a2;
                z18 = z14;
                abstractC18247a5 = abstractC18247a3;
                textResource2 = textResourceM21267a;
                c39274g3 = c39274g2;
                z19 = z16;
                function4 = function3;
                interfaceC39332e2 = interfaceC39332e;
                function2 = function1;
                interfaceC4339a2 = interfaceC4339a;
                interfaceC2300f3 = interfaceC2300f2;
                z24 = z15;
                abstractC22403o2 = abstractC22403o;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h51.c
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC16932d.m47652p(title, abstractC18247a5, enumC2888c2, textResource2, c39274g3, z24, z19, items, interfaceC2300f3, function4, interfaceC39332e2, abstractC18247a4, abstractC22403o2, function2, interfaceC4339a2, z18, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        c39274g2 = c39274g;
        i17 = i15 & 32;
        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i17 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            z15 = z4;
        } else {
            z15 = z4;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87155h(z15)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i16 |= i19;
            }
        }
        i24 = i15 & 64;
        if (i24 != 0) {
            i16 |= 1572864;
            z16 = z13;
        } else {
            z16 = z13;
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87155h(z16)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i16 |= i25;
            }
        }
        if ((i13 & 12582912) == 0) {
            if (c28655q.m87157i(items)) {
                i55 = 8388608;
            } else {
                i55 = 4194304;
            }
            i16 |= i55;
        }
        i26 = i15 & 256;
        if (i26 != 0) {
            i16 |= 100663296;
            interfaceC2300f2 = interfaceC2300f;
        } else {
            interfaceC2300f2 = interfaceC2300f;
            if ((i13 & 100663296) == 0) {
                if (c28655q.m87153g(interfaceC2300f2)) {
                    i27 = 67108864;
                } else {
                    i27 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i27;
            }
        }
        if ((i13 & 805306368) != 0) {
            i16 |= ((i15 & 512) == 0 || !c28655q.m87157i(function3)) ? 268435456 : 536870912;
        }
        if ((i14 & 6) == 0) {
            if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                i54 = 2;
            } else {
                if ((i14 & 8) == 0) {
                    zM87157i = c28655q.m87153g(interfaceC39332e);
                } else {
                    zM87157i = c28655q.m87157i(interfaceC39332e);
                }
                if (zM87157i) {
                    i54 = 4;
                } else {
                    i54 = 2;
                }
            }
            i28 = i54 | i14;
        } else {
            i28 = i14;
        }
        if ((i14 & 48) == 0) {
            i29 = i28 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 || !c28655q.m87153g(abstractC18247a2)) ? 16 : 32);
        } else {
            i29 = i28;
        }
        i34 = i15 & 4096;
        if (i34 != 0) {
            i36 = i29 | 384;
        } else {
            i35 = i29;
            if ((i14 & 384) != 0) {
                if (c28655q.m87153g(abstractC22403o)) {
                    i37 = 256;
                } else {
                    i37 = 128;
                }
                i35 |= i37;
            }
            i36 = i35;
        }
        i38 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i38 != 0) {
            i44 = i36 | 3072;
        } else {
            i39 = i36;
            if ((i14 & 3072) == 0) {
                if (c28655q.m87157i(function1)) {
                    i64 = 2048;
                }
                i44 = i39 | i64;
            } else {
                i44 = i39;
            }
        }
        i45 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i45 != 0) {
            i46 = i44;
            if ((i14 & 24576) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i66 = 16384;
                }
                i46 |= i66;
            }
            i47 = i15 & 32768;
            if (i47 != 0) {
                i46 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87155h(z14)) {
                    i18 = 131072;
                }
                i46 |= i18;
            }
            if ((i16 & 306783379) == 306783378) {
                z17 = true;
            } else {
                z17 = true;
            }
            if (c28655q.m87135U(i16 & 1, z17)) {
                c28655q.m87140Z();
                i48 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i48 != 0) {
                    if ((i15 & 2) != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = a.f64943w;
                            c28655q.m87172p0(objM87133R5);
                        }
                        abstractC18247aM52574l = AbstractC18249c.m52574l((Function1) objM87133R5);
                        i16 &= -113;
                    } else {
                        abstractC18247aM52574l = abstractC18247a3;
                    }
                    if (i58 != 0) {
                        enumC2888c3 = null;
                    } else {
                        enumC2888c3 = enumC2888c;
                    }
                    if ((i15 & 8) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i16 &= -7169;
                    }
                    if (i65 != 0) {
                        c39274g2 = null;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    }
                    if (i26 != 0) {
                        interfaceC2300f2 = C2299e.f9110M;
                    }
                    if ((i15 & 512) != 0) {
                        c15786e = new C15786e(1);
                        i16 &= -1879048193;
                    } else {
                        c15786e = function3;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = b.f64944w;
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R4);
                        i46 &= -15;
                    } else {
                        interfaceC39332eM125323a = interfaceC39332e;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = c.f64945w;
                            c28655q.m87172p0(objM87133R3);
                        }
                        abstractC18247aM52574l2 = AbstractC18249c.m52574l((Function1) objM87133R3);
                        i46 &= -113;
                    } else {
                        abstractC18247aM52574l2 = abstractC18247a2;
                    }
                    if (i34 != 0) {
                        abstractC22403o3 = null;
                    } else {
                        abstractC22403o3 = abstractC22403o;
                    }
                    AbstractC18247a abstractC18247a110 = abstractC18247aM52574l;
                    if (i38 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C16513l0(17);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    } else {
                        abstractC18247aM52574l2 = abstractC18247aM52574l2;
                        function5 = function1;
                    }
                    if (i45 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C16497d0(11);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        function5 = function5;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    i49 = i16;
                    textResource3 = textResourceM21267a;
                    c39274g4 = c39274g2;
                    enumC2888c4 = enumC2888c3;
                    z25 = z15;
                    abstractC18247a6 = abstractC18247aM52574l2;
                    function6 = function5;
                    interfaceC4339a4 = interfaceC4339a3;
                    function7 = c15786e;
                    interfaceC39332e3 = interfaceC39332eM125323a;
                    abstractC18247a3 = abstractC18247a110;
                    interfaceC2300f4 = interfaceC2300f2;
                    z26 = z16;
                    if (i47 != 0) {
                        z27 = true;
                    } else {
                        z27 = z14;
                    }
                } else {
                    if ((i15 & 2) != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = a.f64943w;
                            c28655q.m87172p0(objM87133R5);
                        }
                        abstractC18247aM52574l = AbstractC18249c.m52574l((Function1) objM87133R5);
                        i16 &= -113;
                    } else {
                        abstractC18247aM52574l = abstractC18247a3;
                    }
                    if (i58 != 0) {
                        enumC2888c3 = null;
                    } else {
                        enumC2888c3 = enumC2888c;
                    }
                    if ((i15 & 8) != 0) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                        i16 &= -7169;
                    }
                    if (i65 != 0) {
                        c39274g2 = null;
                    }
                    if (i17 != 0) {
                        z15 = false;
                    }
                    if (i24 != 0) {
                        z16 = true;
                    }
                    if (i26 != 0) {
                        interfaceC2300f2 = C2299e.f9110M;
                    }
                    if ((i15 & 512) != 0) {
                        c15786e = new C15786e(1);
                        i16 &= -1879048193;
                    } else {
                        c15786e = function3;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = b.f64944w;
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R4);
                        i46 &= -15;
                    } else {
                        interfaceC39332eM125323a = interfaceC39332e;
                    }
                    if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = c.f64945w;
                            c28655q.m87172p0(objM87133R3);
                        }
                        abstractC18247aM52574l2 = AbstractC18249c.m52574l((Function1) objM87133R3);
                        i46 &= -113;
                    } else {
                        abstractC18247aM52574l2 = abstractC18247a2;
                    }
                    if (i34 != 0) {
                        abstractC22403o3 = null;
                    } else {
                        abstractC22403o3 = abstractC22403o;
                    }
                    AbstractC18247a abstractC18247a111 = abstractC18247aM52574l;
                    if (i38 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C16513l0(17);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    } else {
                        abstractC18247aM52574l2 = abstractC18247aM52574l2;
                        function5 = function1;
                    }
                    if (i45 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C16497d0(11);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    } else {
                        function5 = function5;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    i49 = i16;
                    textResource3 = textResourceM21267a;
                    c39274g4 = c39274g2;
                    enumC2888c4 = enumC2888c3;
                    z25 = z15;
                    abstractC18247a6 = abstractC18247aM52574l2;
                    function6 = function5;
                    interfaceC4339a4 = interfaceC4339a3;
                    function7 = c15786e;
                    interfaceC39332e3 = interfaceC39332eM125323a;
                    abstractC18247a3 = abstractC18247a111;
                    interfaceC2300f4 = interfaceC2300f2;
                    z26 = z16;
                    if (i47 != 0) {
                        z27 = true;
                    } else {
                        z27 = z14;
                    }
                }
                c28655q.m87175r();
                Function3 function17 = function7;
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC11895b.m32005x(0, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R6;
                EnumC2888c enumC2888c8 = enumC2888c4;
                TextResource textResource7 = textResource3;
                float fMo733e3 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo733e0(m47655s(interfaceC28601c1));
                long jMo134584toComposableColorWaAFU9c4 = interfaceC39332e3.mo134584toComposableColorWaAFU9c(c28655q, i46 & 14);
                C39274g c39274g8 = c39274g4;
                C17916v0 c17916v3 = AbstractC17918w0.f69621a;
                boolean z317 = z25;
                c2314t = C2314t.f9131w;
                Modifier modifierM3358c4 = AbstractC1092a.m3358c(c2314t, jMo134584toComposableColorWaAFU9c4, c17916v3);
                c2307m = C2299e.f9114w;
                boolean z318 = z26;
                InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m, false);
                InterfaceC2300f interfaceC2300f8 = interfaceC2300f4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3358c4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                AbstractC18247a abstractC18247a112 = abstractC18247a3;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d10);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
                c0209i3 = C0217k.f732j;
                InterfaceC39332e interfaceC39332e7 = interfaceC39332e3;
                if (c28655q.f115903S) {
                    abstractC18247a7 = abstractC18247a6;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                    c1100b = C1100b.f4583a;
                    if (abstractC22403o3 != null) {
                        c28655q.m87150e0(-1689303902);
                        float f19 = 4;
                        C33252i c33252iM105489e7 = AbstractC33253j.m105489e(f19 * f19);
                        Modifier modifierM44113a7 = AbstractC15681i.m44113a(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f64938b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f64937a, 0.0f, 2)), c33252iM105489e7), c33252iM105489e7, 0.0f, c28655q, 0, 2);
                        InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM44113a7);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d11);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11);
                        AbstractC17783r0.m51101c(AbstractC22404p.m64500i(abstractC22403o3, null, null, c28655q, (i46 >> 6) & 14, 3), 0.4036f, f64939c, c1100b.mo3401b(c2314t), null, c28655q, 432, 16);
                        z28 = true;
                        c28655q.m87173q(true);
                        z29 = false;
                        c28655q.m87173q(false);
                    } else {
                        z28 = true;
                        z29 = false;
                        c28655q.m87150e0(-1688613904);
                        c28655q.m87173q(false);
                    }
                    if (abstractC22403o3 != null) {
                        z34 = z28;
                    } else {
                        z34 = z29;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C13921a0(18, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    int i613 = i46 >> 3;
                    AbstractC18247a abstractC18247a113 = abstractC18247a7;
                    Function1 function18 = function6;
                    InterfaceC4339a interfaceC4339a11 = interfaceC4339a4;
                    boolean z319 = z27;
                    m47657u(title, abstractC18247a112, enumC2888c8, textResource7, c39274g8, z317, z318, items, interfaceC2300f8, function17, z34, (Function1) objM87133R7, function18, interfaceC4339a11, z319, c28655q, i49 & 2147483646, (i613 & 896) | 48 | (i613 & 7168) | (i613 & 57344), 0);
                    AbstractC22989q.m66760a(c1100b.mo3400a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(1 * 4, AbstractC1102d.m3411h(fMo733e3, c2314t)), abstractC18247a113), C2299e.f9117z), c28655q, 0);
                    c28655q.m87173q(true);
                    interfaceC2300f3 = interfaceC2300f8;
                    z18 = z319;
                    function4 = function17;
                    interfaceC39332e2 = interfaceC39332e7;
                    function2 = function18;
                    interfaceC4339a2 = interfaceC4339a11;
                    abstractC22403o2 = abstractC22403o3;
                    abstractC18247a4 = abstractC18247a113;
                    z19 = z318;
                    z24 = z317;
                    c39274g3 = c39274g8;
                    textResource2 = textResource7;
                    enumC2888c2 = enumC2888c8;
                    abstractC18247a5 = abstractC18247a112;
                } else {
                    abstractC18247a7 = abstractC18247a6;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                c1100b = C1100b.f4583a;
                if (abstractC22403o3 != null) {
                    c28655q.m87150e0(-1689303902);
                    float f110 = 4;
                    C33252i c33252iM105489e8 = AbstractC33253j.m105489e(f110 * f110);
                    Modifier modifierM44113a8 = AbstractC15681i.m44113a(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f64938b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f64937a, 0.0f, 2)), c33252iM105489e8), c33252iM105489e8, 0.0f, c28655q, 0, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM44113a8);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d12);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
                    AbstractC17783r0.m51101c(AbstractC22404p.m64500i(abstractC22403o3, null, null, c28655q, (i46 >> 6) & 14, 3), 0.4036f, f64939c, c1100b.mo3401b(c2314t), null, c28655q, 432, 16);
                    z28 = true;
                    c28655q.m87173q(true);
                    z29 = false;
                    c28655q.m87173q(false);
                } else {
                    z28 = true;
                    z29 = false;
                    c28655q.m87150e0(-1688613904);
                    c28655q.m87173q(false);
                }
                if (abstractC22403o3 != null) {
                    z34 = z28;
                } else {
                    z34 = z29;
                }
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C13921a0(18, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R7);
                }
                int i614 = i46 >> 3;
                AbstractC18247a abstractC18247a114 = abstractC18247a7;
                Function1 function19 = function6;
                InterfaceC4339a interfaceC4339a12 = interfaceC4339a4;
                boolean z3110 = z27;
                m47657u(title, abstractC18247a112, enumC2888c8, textResource7, c39274g8, z317, z318, items, interfaceC2300f8, function17, z34, (Function1) objM87133R7, function19, interfaceC4339a12, z3110, c28655q, i49 & 2147483646, (i614 & 896) | 48 | (i614 & 7168) | (i614 & 57344), 0);
                AbstractC22989q.m66760a(c1100b.mo3400a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(1 * 4, AbstractC1102d.m3411h(fMo733e3, c2314t)), abstractC18247a114), C2299e.f9117z), c28655q, 0);
                c28655q.m87173q(true);
                interfaceC2300f3 = interfaceC2300f8;
                z18 = z3110;
                function4 = function17;
                interfaceC39332e2 = interfaceC39332e7;
                function2 = function19;
                interfaceC4339a2 = interfaceC4339a12;
                abstractC22403o2 = abstractC22403o3;
                abstractC18247a4 = abstractC18247a114;
                z19 = z318;
                z24 = z317;
                c39274g3 = c39274g8;
                textResource2 = textResource7;
                enumC2888c2 = enumC2888c8;
                abstractC18247a5 = abstractC18247a112;
            } else {
                c28655q.m87138X();
                enumC2888c2 = enumC2888c;
                abstractC18247a4 = abstractC18247a2;
                z18 = z14;
                abstractC18247a5 = abstractC18247a3;
                textResource2 = textResourceM21267a;
                c39274g3 = c39274g2;
                z19 = z16;
                function4 = function3;
                interfaceC39332e2 = interfaceC39332e;
                function2 = function1;
                interfaceC4339a2 = interfaceC4339a;
                interfaceC2300f3 = interfaceC2300f2;
                z24 = z15;
                abstractC22403o2 = abstractC22403o;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h51.c
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC16932d.m47652p(title, abstractC18247a5, enumC2888c2, textResource2, c39274g3, z24, z19, items, interfaceC2300f3, function4, interfaceC39332e2, abstractC18247a4, abstractC22403o2, function2, interfaceC4339a2, z18, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i46 = i44 | 24576;
        i47 = i15 & 32768;
        if (i47 != 0) {
            i46 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q.m87155h(z14)) {
                i18 = 131072;
            }
            i46 |= i18;
        }
        if ((i16 & 306783379) == 306783378) {
            z17 = true;
        } else {
            z17 = true;
        }
        if (c28655q.m87135U(i16 & 1, z17)) {
            c28655q.m87140Z();
            i48 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i48 != 0) {
                if ((i15 & 2) != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = a.f64943w;
                        c28655q.m87172p0(objM87133R5);
                    }
                    abstractC18247aM52574l = AbstractC18249c.m52574l((Function1) objM87133R5);
                    i16 &= -113;
                } else {
                    abstractC18247aM52574l = abstractC18247a3;
                }
                if (i58 != 0) {
                    enumC2888c3 = null;
                } else {
                    enumC2888c3 = enumC2888c;
                }
                if ((i15 & 8) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i16 &= -7169;
                }
                if (i65 != 0) {
                    c39274g2 = null;
                }
                if (i17 != 0) {
                    z15 = false;
                }
                if (i24 != 0) {
                    z16 = true;
                }
                if (i26 != 0) {
                    interfaceC2300f2 = C2299e.f9110M;
                }
                if ((i15 & 512) != 0) {
                    c15786e = new C15786e(1);
                    i16 &= -1879048193;
                } else {
                    c15786e = function3;
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = b.f64944w;
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R4);
                    i46 &= -15;
                } else {
                    interfaceC39332eM125323a = interfaceC39332e;
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = c.f64945w;
                        c28655q.m87172p0(objM87133R3);
                    }
                    abstractC18247aM52574l2 = AbstractC18249c.m52574l((Function1) objM87133R3);
                    i46 &= -113;
                } else {
                    abstractC18247aM52574l2 = abstractC18247a2;
                }
                if (i34 != 0) {
                    abstractC22403o3 = null;
                } else {
                    abstractC22403o3 = abstractC22403o;
                }
                AbstractC18247a abstractC18247a115 = abstractC18247aM52574l;
                if (i38 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C16513l0(17);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function5 = (Function1) objM87133R2;
                } else {
                    abstractC18247aM52574l2 = abstractC18247aM52574l2;
                    function5 = function1;
                }
                if (i45 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C16497d0(11);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                } else {
                    function5 = function5;
                    interfaceC4339a3 = interfaceC4339a;
                }
                i49 = i16;
                textResource3 = textResourceM21267a;
                c39274g4 = c39274g2;
                enumC2888c4 = enumC2888c3;
                z25 = z15;
                abstractC18247a6 = abstractC18247aM52574l2;
                function6 = function5;
                interfaceC4339a4 = interfaceC4339a3;
                function7 = c15786e;
                interfaceC39332e3 = interfaceC39332eM125323a;
                abstractC18247a3 = abstractC18247a115;
                interfaceC2300f4 = interfaceC2300f2;
                z26 = z16;
                if (i47 != 0) {
                    z27 = true;
                } else {
                    z27 = z14;
                }
            } else {
                if ((i15 & 2) != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = a.f64943w;
                        c28655q.m87172p0(objM87133R5);
                    }
                    abstractC18247aM52574l = AbstractC18249c.m52574l((Function1) objM87133R5);
                    i16 &= -113;
                } else {
                    abstractC18247aM52574l = abstractC18247a3;
                }
                if (i58 != 0) {
                    enumC2888c3 = null;
                } else {
                    enumC2888c3 = enumC2888c;
                }
                if ((i15 & 8) != 0) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                    i16 &= -7169;
                }
                if (i65 != 0) {
                    c39274g2 = null;
                }
                if (i17 != 0) {
                    z15 = false;
                }
                if (i24 != 0) {
                    z16 = true;
                }
                if (i26 != 0) {
                    interfaceC2300f2 = C2299e.f9110M;
                }
                if ((i15 & 512) != 0) {
                    c15786e = new C15786e(1);
                    i16 &= -1879048193;
                } else {
                    c15786e = function3;
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = b.f64944w;
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R4);
                    i46 &= -15;
                } else {
                    interfaceC39332eM125323a = interfaceC39332e;
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = c.f64945w;
                        c28655q.m87172p0(objM87133R3);
                    }
                    abstractC18247aM52574l2 = AbstractC18249c.m52574l((Function1) objM87133R3);
                    i46 &= -113;
                } else {
                    abstractC18247aM52574l2 = abstractC18247a2;
                }
                if (i34 != 0) {
                    abstractC22403o3 = null;
                } else {
                    abstractC22403o3 = abstractC22403o;
                }
                AbstractC18247a abstractC18247a116 = abstractC18247aM52574l;
                if (i38 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C16513l0(17);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function5 = (Function1) objM87133R2;
                } else {
                    abstractC18247aM52574l2 = abstractC18247aM52574l2;
                    function5 = function1;
                }
                if (i45 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C16497d0(11);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                } else {
                    function5 = function5;
                    interfaceC4339a3 = interfaceC4339a;
                }
                i49 = i16;
                textResource3 = textResourceM21267a;
                c39274g4 = c39274g2;
                enumC2888c4 = enumC2888c3;
                z25 = z15;
                abstractC18247a6 = abstractC18247aM52574l2;
                function6 = function5;
                interfaceC4339a4 = interfaceC4339a3;
                function7 = c15786e;
                interfaceC39332e3 = interfaceC39332eM125323a;
                abstractC18247a3 = abstractC18247a116;
                interfaceC2300f4 = interfaceC2300f2;
                z26 = z16;
                if (i47 != 0) {
                    z27 = true;
                } else {
                    z27 = z14;
                }
            }
            c28655q.m87175r();
            Function3 function110 = function7;
            objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC11895b.m32005x(0, c28655q);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R6;
            EnumC2888c enumC2888c9 = enumC2888c4;
            TextResource textResource8 = textResource3;
            float fMo733e4 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo733e0(m47655s(interfaceC28601c1));
            long jMo134584toComposableColorWaAFU9c5 = interfaceC39332e3.mo134584toComposableColorWaAFU9c(c28655q, i46 & 14);
            C39274g c39274g9 = c39274g4;
            C17916v0 c17916v4 = AbstractC17918w0.f69621a;
            boolean z3111 = z25;
            c2314t = C2314t.f9131w;
            Modifier modifierM3358c5 = AbstractC1092a.m3358c(c2314t, jMo134584toComposableColorWaAFU9c5, c17916v4);
            c2307m = C2299e.f9114w;
            boolean z3112 = z26;
            InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m, false);
            InterfaceC2300f interfaceC2300f9 = interfaceC2300f4;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3358c5);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            AbstractC18247a abstractC18247a117 = abstractC18247a3;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d13);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m13);
            c0209i3 = C0217k.f732j;
            InterfaceC39332e interfaceC39332e8 = interfaceC39332e3;
            if (c28655q.f115903S) {
                abstractC18247a7 = abstractC18247a6;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N13);
                c1100b = C1100b.f4583a;
                if (abstractC22403o3 != null) {
                    c28655q.m87150e0(-1689303902);
                    float f111 = 4;
                    C33252i c33252iM105489e9 = AbstractC33253j.m105489e(f111 * f111);
                    Modifier modifierM44113a9 = AbstractC15681i.m44113a(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f64938b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f64937a, 0.0f, 2)), c33252iM105489e9), c33252iM105489e9, 0.0f, c28655q, 0, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM44113a9);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d14);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m14);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N14);
                    AbstractC17783r0.m51101c(AbstractC22404p.m64500i(abstractC22403o3, null, null, c28655q, (i46 >> 6) & 14, 3), 0.4036f, f64939c, c1100b.mo3401b(c2314t), null, c28655q, 432, 16);
                    z28 = true;
                    c28655q.m87173q(true);
                    z29 = false;
                    c28655q.m87173q(false);
                } else {
                    z28 = true;
                    z29 = false;
                    c28655q.m87150e0(-1688613904);
                    c28655q.m87173q(false);
                }
                if (abstractC22403o3 != null) {
                    z34 = z28;
                } else {
                    z34 = z29;
                }
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C13921a0(18, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R7);
                }
                int i615 = i46 >> 3;
                AbstractC18247a abstractC18247a118 = abstractC18247a7;
                Function1 function111 = function6;
                InterfaceC4339a interfaceC4339a13 = interfaceC4339a4;
                boolean z3113 = z27;
                m47657u(title, abstractC18247a117, enumC2888c9, textResource8, c39274g9, z3111, z3112, items, interfaceC2300f9, function110, z34, (Function1) objM87133R7, function111, interfaceC4339a13, z3113, c28655q, i49 & 2147483646, (i615 & 896) | 48 | (i615 & 7168) | (i615 & 57344), 0);
                AbstractC22989q.m66760a(c1100b.mo3400a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(1 * 4, AbstractC1102d.m3411h(fMo733e4, c2314t)), abstractC18247a118), C2299e.f9117z), c28655q, 0);
                c28655q.m87173q(true);
                interfaceC2300f3 = interfaceC2300f9;
                z18 = z3113;
                function4 = function110;
                interfaceC39332e2 = interfaceC39332e8;
                function2 = function111;
                interfaceC4339a2 = interfaceC4339a13;
                abstractC22403o2 = abstractC22403o3;
                abstractC18247a4 = abstractC18247a118;
                z19 = z3112;
                z24 = z3111;
                c39274g3 = c39274g9;
                textResource2 = textResource8;
                enumC2888c2 = enumC2888c9;
                abstractC18247a5 = abstractC18247a117;
            } else {
                abstractC18247a7 = abstractC18247a6;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N13);
            c1100b = C1100b.f4583a;
            if (abstractC22403o3 != null) {
                c28655q.m87150e0(-1689303902);
                float f112 = 4;
                C33252i c33252iM105489e10 = AbstractC33253j.m105489e(f112 * f112);
                Modifier modifierM44113a10 = AbstractC15681i.m44113a(AbstractC37056f.m118994r(AbstractC1102d.m3411h(f64938b, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f64937a, 0.0f, 2)), c33252iM105489e10), c33252iM105489e10, 0.0f, c28655q, 0, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM44113a10);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d15);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m15);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
                AbstractC17783r0.m51101c(AbstractC22404p.m64500i(abstractC22403o3, null, null, c28655q, (i46 >> 6) & 14, 3), 0.4036f, f64939c, c1100b.mo3401b(c2314t), null, c28655q, 432, 16);
                z28 = true;
                c28655q.m87173q(true);
                z29 = false;
                c28655q.m87173q(false);
            } else {
                z28 = true;
                z29 = false;
                c28655q.m87150e0(-1688613904);
                c28655q.m87173q(false);
            }
            if (abstractC22403o3 != null) {
                z34 = z28;
            } else {
                z34 = z29;
            }
            objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C13921a0(18, interfaceC28601c1);
                c28655q.m87172p0(objM87133R7);
            }
            int i616 = i46 >> 3;
            AbstractC18247a abstractC18247a119 = abstractC18247a7;
            Function1 function112 = function6;
            InterfaceC4339a interfaceC4339a14 = interfaceC4339a4;
            boolean z3114 = z27;
            m47657u(title, abstractC18247a117, enumC2888c9, textResource8, c39274g9, z3111, z3112, items, interfaceC2300f9, function110, z34, (Function1) objM87133R7, function112, interfaceC4339a14, z3114, c28655q, i49 & 2147483646, (i616 & 896) | 48 | (i616 & 7168) | (i616 & 57344), 0);
            AbstractC22989q.m66760a(c1100b.mo3400a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(1 * 4, AbstractC1102d.m3411h(fMo733e4, c2314t)), abstractC18247a119), C2299e.f9117z), c28655q, 0);
            c28655q.m87173q(true);
            interfaceC2300f3 = interfaceC2300f9;
            z18 = z3114;
            function4 = function110;
            interfaceC39332e2 = interfaceC39332e8;
            function2 = function112;
            interfaceC4339a2 = interfaceC4339a14;
            abstractC22403o2 = abstractC22403o3;
            abstractC18247a4 = abstractC18247a119;
            z19 = z3112;
            z24 = z3111;
            c39274g3 = c39274g9;
            textResource2 = textResource8;
            enumC2888c2 = enumC2888c9;
            abstractC18247a5 = abstractC18247a117;
        } else {
            c28655q.m87138X();
            enumC2888c2 = enumC2888c;
            abstractC18247a4 = abstractC18247a2;
            z18 = z14;
            abstractC18247a5 = abstractC18247a3;
            textResource2 = textResourceM21267a;
            c39274g3 = c39274g2;
            z19 = z16;
            function4 = function3;
            interfaceC39332e2 = interfaceC39332e;
            function2 = function1;
            interfaceC4339a2 = interfaceC4339a;
            interfaceC2300f3 = interfaceC2300f2;
            z24 = z15;
            abstractC22403o2 = abstractC22403o;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h51.c
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC16932d.m47652p(title, abstractC18247a5, enumC2888c2, textResource2, c39274g3, z24, z19, items, interfaceC2300f3, function4, interfaceC39332e2, abstractC18247a4, abstractC22403o2, function2, interfaceC4339a2, z18, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Modifier m47650n(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1534120820);
        c28655q.m87173q(false);
        return C2314t.f9131w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m47651o(InterfaceC28601c1 interfaceC28601c1, InterfaceC39147y it) {
        AbstractC22676k.m65750j(it, "it");
        m47656t(interfaceC28601c1, (int) (it.mo3541n() & 4294967295L));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m47652p(TextResource textResource, AbstractC18247a abstractC18247a, EnumC2888c enumC2888c, TextResource textResource2, C39274g c39274g, boolean z4, boolean z13, List list, InterfaceC2300f interfaceC2300f, Function3 function3, InterfaceC39332e interfaceC39332e, AbstractC18247a abstractC18247a2, AbstractC22403o abstractC22403o, Function1 function1, InterfaceC4339a interfaceC4339a, boolean z14, int i13, int i14, int i15, Composer composer, int i16) {
        m47649m(textResource, abstractC18247a, enumC2888c, textResource2, c39274g, z4, z13, list, interfaceC2300f, function3, interfaceC39332e, abstractC18247a2, abstractC22403o, function1, interfaceC4339a, z14, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m47653q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m47654r() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final int m47655s(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: t */
    private static final void m47656t(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX WARN: Code duplicated, block: B:218:0x0328  */
    /* JADX WARN: Code duplicated, block: B:219:0x0335  */
    /* JADX WARN: Code duplicated, block: B:221:0x0341  */
    /* JADX WARN: Code duplicated, block: B:223:0x0349  */
    /* JADX WARN: Code duplicated, block: B:224:0x0358  */
    /* JADX WARN: Code duplicated, block: B:227:0x036a  */
    /* JADX WARN: Code duplicated, block: B:229:0x0371 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:230:0x0373  */
    /* JADX WARN: Code duplicated, block: B:231:0x037b  */
    /* JADX WARN: Code duplicated, block: B:234:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:235:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:240:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:243:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:245:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:247:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:248:0x0400  */
    /* JADX WARN: Code duplicated, block: B:250:0x0410  */
    /* JADX WARN: Code duplicated, block: B:252:0x042a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x042c  */
    /* JADX WARN: Code duplicated, block: B:254:0x043f  */
    /* JADX WARN: Code duplicated, block: B:256:0x0443  */
    /* JADX WARN: Code duplicated, block: B:257:0x0488  */
    /* JADX WARN: Code duplicated, block: B:260:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:262:0x0500  */
    /* JADX WARN: Code duplicated, block: B:263:0x0502  */
    /* JADX WARN: Code duplicated, block: B:266:0x0509 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:267:0x050b  */
    /* JADX WARN: Code duplicated, block: B:270:0x055a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0583  */
    /* JADX WARN: Code duplicated, block: B:276:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:278:0x05af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:279:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:280:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:283:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:286:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:289:0x05db A[PHI: r6
      0x05db: PHI (r6v15 kotlin.jvm.functions.Function3) = (r6v12 kotlin.jvm.functions.Function3), (r6v16 kotlin.jvm.functions.Function3) binds: [B:288:0x05d9, B:284:0x05d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:293:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:294:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:297:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:301:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:304:0x0626  */
    /* JADX WARN: Code duplicated, block: B:306:0x0633  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r2v15, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v9, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX INFO: renamed from: u */
    private static final void m47657u(final TextResource textResource, AbstractC18247a abstractC18247a, EnumC2888c enumC2888c, final TextResource textResource2, final C39274g c39274g, final boolean z4, final boolean z13, final List<? extends InterfaceC25312u> list, InterfaceC2300f interfaceC2300f, Function3 function3, boolean z14, final Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, boolean z15, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        AbstractC18247a abstractC18247a2;
        InterfaceC2300f interfaceC2300f2;
        int i17;
        int i18;
        int i19;
        int i24;
        final EnumC2888c enumC2888c2;
        final Function3 function4;
        final Function1 function5;
        final InterfaceC4339a interfaceC4339a2;
        final boolean z16;
        final InterfaceC2300f interfaceC2300f3;
        AbstractC18247a abstractC18247a3;
        final boolean z17;
        ?? r10;
        AbstractC18247a abstractC18247aM52574l;
        Function3 c15786e;
        boolean z18;
        Function1 function6;
        InterfaceC4339a interfaceC4339a3;
        boolean z19;
        Function1 function7;
        Function3 function8;
        EnumC2888c enumC2888c3;
        InterfaceC4339a interfaceC4339a4;
        Function1 function9;
        C0209i c0209i;
        int i25;
        EnumC2888c enumC2888c4;
        InterfaceC4339a interfaceC4339a5;
        C28676v0 c28676v0;
        ?? r14;
        int i26;
        float f13;
        float f14;
        Function3 function10;
        ?? r15;
        ?? r16;
        ?? r17;
        Object objM87133R;
        Function1 function11;
        ?? r18;
        int i27;
        float f15;
        InterfaceC4339a interfaceC4339a6;
        int iHashCode;
        boolean z24;
        int i28;
        long jM95624D;
        long j7;
        char c3;
        C2886a c2886aM8402a;
        boolean z25;
        boolean z26;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(672103573);
        if ((i13 & 6) == 0) {
            i16 = (c28655q.m87153g(textResource) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i15 & 2) == 0) {
                abstractC18247a2 = abstractC18247a;
                int i29 = c28655q.m87153g(abstractC18247a2) ? 32 : 16;
                i16 |= i29;
            } else {
                abstractC18247a2 = abstractC18247a;
            }
            i16 |= i29;
        } else {
            abstractC18247a2 = abstractC18247a;
        }
        int i34 = i15 & 4;
        if (i34 != 0) {
            i16 |= 384;
        } else if ((i13 & 384) == 0) {
            i16 |= c28655q.m87149e(enumC2888c == null ? -1 : enumC2888c.ordinal()) ? 256 : 128;
        }
        int i35 = i13 & 3072;
        int i36 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i35 == 0) {
            i16 |= c28655q.m87153g(textResource2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
        }
        int i37 = i13 & 24576;
        int i38 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i37 == 0) {
            i16 |= c28655q.m87153g(c39274g) ? 16384 : 8192;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i16 |= c28655q.m87155h(z4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i13 & 1572864) == 0) {
            i16 |= c28655q.m87155h(z13) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i16 |= c28655q.m87157i(list) ? 8388608 : 4194304;
        }
        int i39 = i15 & 256;
        if (i39 != 0) {
            i16 |= 100663296;
            interfaceC2300f2 = interfaceC2300f;
        } else {
            interfaceC2300f2 = interfaceC2300f;
            if ((i13 & 100663296) == 0) {
                i16 |= c28655q.m87153g(interfaceC2300f2) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
            }
        }
        if ((i13 & 805306368) == 0) {
            i16 |= ((i15 & 512) == 0 && c28655q.m87157i(function3)) ? 536870912 : 268435456;
        }
        int i44 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i44 != 0) {
            i17 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i17 = i14 | (c28655q.m87155h(z14) ? 4 : 2);
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i45 = i17;
        int i46 = i15 & 4096;
        if (i46 != 0) {
            i18 = i45 | 384;
        } else if ((i14 & 384) == 0) {
            i18 = i45 | (c28655q.m87157i(function2) ? 256 : 128);
        } else {
            i18 = i45;
        }
        int i47 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i47 != 0) {
            i19 = i18 | 3072;
        } else {
            int i48 = i18;
            if ((i14 & 3072) == 0) {
                if (c28655q.m87157i(interfaceC4339a)) {
                    i36 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i19 = i48 | i36;
            } else {
                i19 = i48;
            }
        }
        int i49 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i49 != 0) {
            i24 = i19 | 24576;
        } else {
            int i54 = i19;
            if ((i14 & 24576) == 0) {
                if (c28655q.m87155h(z15)) {
                    i38 = 16384;
                }
                i24 = i54 | i38;
            } else {
                i24 = i54;
            }
        }
        if (c28655q.m87135U(i16 & 1, ((i16 & 306783379) == 306783378 && (i24 & 9363) == 9362) ? false : true)) {
            c28655q.m87140Z();
            int i55 = i13 & 1;
            C28676v0 c28676v1 = C28635l.f115821a;
            if (i55 == 0 || c28655q.m87118C()) {
                if ((i15 & 2) != 0) {
                    Object objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v1) {
                        objM87133R3 = d.f64946w;
                        c28655q.m87172p0(objM87133R3);
                    }
                    abstractC18247aM52574l = AbstractC18249c.m52574l((Function1) objM87133R3);
                    i16 &= -113;
                } else {
                    abstractC18247aM52574l = abstractC18247a2;
                }
                EnumC2888c enumC2888c5 = i34 != 0 ? null : enumC2888c;
                if (i39 != 0) {
                    interfaceC2300f2 = C2299e.f9110M;
                }
                if ((i15 & 512) != 0) {
                    c15786e = new C15786e(2);
                    i16 &= -1879048193;
                } else {
                    c15786e = function3;
                }
                z18 = i44 != 0 ? false : z14;
                if (i46 != 0) {
                    Object objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v1) {
                        objM87133R4 = new C16513l0(18);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    abstractC18247aM52574l = abstractC18247aM52574l;
                    function6 = function2;
                }
                if (i47 != 0) {
                    Object objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v1) {
                        objM87133R5 = new C16497d0(12);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                } else {
                    function6 = function6;
                    interfaceC4339a3 = interfaceC4339a;
                }
                z19 = i49 != 0 ? true : z15;
                function7 = function6;
                function8 = c15786e;
                enumC2888c3 = enumC2888c5;
                interfaceC4339a4 = interfaceC4339a3;
                abstractC18247a3 = abstractC18247aM52574l;
            } else {
                c28655q.m87138X();
                if ((i15 & 2) != 0) {
                    i16 &= -113;
                }
                if ((i15 & 512) != 0) {
                    i16 &= -1879048193;
                }
                enumC2888c3 = enumC2888c;
                z18 = z14;
                z19 = z15;
                i16 = i16;
                interfaceC2300f2 = interfaceC2300f2;
                abstractC18247a3 = abstractC18247a2;
                function8 = function3;
                function7 = function2;
                interfaceC4339a4 = interfaceC4339a;
            }
            c28655q.m87175r();
            boolean zM47636C = m47636C(textResource2, (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b));
            boolean z27 = (i24 & 112) == 32;
            Object objM87133R6 = c28655q.m87133R();
            if (z27 || objM87133R6 == c28676v1) {
                objM87133R6 = new C15728c(function1, 18);
                c28655q.m87172p0(objM87133R6);
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3500d = AbstractC1131a.m3500d(c2314t, (Function1) objM87133R6);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, interfaceC2300f2, c28655q, (((i16 >> 18) & 896) >> 3) & 112);
            InterfaceC2300f interfaceC2300f4 = interfaceC2300f2;
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3500d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            Function3 function12 = function8;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S) {
                function9 = function7;
            } else {
                function9 = function7;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
                if (z18) {
                    c28655q.m87150e0(-23013850);
                    AbstractC25012a.m73389v(c2314t, f64940d, c28655q, false);
                } else {
                    c28655q.m87150e0(-22936009);
                    c28655q.m87173q(false);
                }
                if (z13) {
                    c28655q.m87150e0(-22851348);
                    if (z18) {
                        i27 = 0;
                        c28655q.m87150e0(-22799113);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-22870227);
                        i27 = 0;
                        AbstractC31061c.m95650z(2, 4, c2314t, c28655q, false);
                    }
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    if (z18) {
                        f15 = f64941e;
                    } else if (zM47636C) {
                        f15 = i27 * 8;
                    } else {
                        f15 = f64937a;
                    }
                    Modifier modifierM3396r = AbstractC1099a.m3396r(modifierM3409f, f15, 0.0f, 2);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                    interfaceC4339a6 = interfaceC4339a4;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N2);
                    String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, i16 & 14);
                    if (zM47636C) {
                        c28655q.m87150e0(-2038238837);
                        i28 = 6;
                        z24 = false;
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        z24 = false;
                        if (abstractC18247a3 instanceof C18252f) {
                            c28655q.m87150e0(-2038236108);
                            long jMo134584toComposableColorWaAFU9c = ((C18252f) abstractC18247a3).getColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                            c28655q.m87173q(false);
                            j7 = jMo134584toComposableColorWaAFU9c;
                            i28 = 6;
                        } else {
                            c28655q.m87150e0(-2038233877);
                            i28 = 6;
                            jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                        }
                        if (zM47636C) {
                            c28655q.m87150e0(-2038229661);
                            C2886a c2886aM8417O = C38072d.f163053a.m121952e(c28655q, i28).getT2();
                            c28655q.m87173q(z24);
                            c2886aM8402a = c2886aM8417O;
                        } else {
                            if (enumC2888c3 != null) {
                                c28655q.m87150e0(-2038227420);
                                c28655q.m87173q(z24);
                                c2886aM8402a = EnumC2888c.INSTANCE.m8402a(enumC2888c3);
                            } else if (abstractC18247a3 instanceof C18250d) {
                                c28655q.m87150e0(-2038223497);
                                C38072d c38072d = C38072d.f163053a;
                                c3 = 2;
                                C2886a c2886aM8397c = C2886a.m8397c(c38072d.m121952e(c28655q, 6).getSh4(), C23285v0.m67363a(c38072d.m121952e(c28655q, 6).getSh4().getStyle(), ((C18250d) abstractC18247a3).getBrush().mo60316a(c28655q, 0), 0L, null, null, 0L, 33554430), null, 2, null);
                                c28655q.m87173q(false);
                                c2886aM8402a = c2886aM8397c;
                            } else {
                                c3 = 2;
                                c28655q.m87150e0(-2038217052);
                                C2886a c2886aM8414L = C38072d.f163053a.m121952e(c28655q, 6).getSh4();
                                c28655q.m87173q(false);
                                c2886aM8402a = c2886aM8414L;
                            }
                            AbstractC30795n.m94707h(strM21274h, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8402a, null, c28655q, 0, 0, 196602);
                            c28655q = c28655q;
                            if (z4) {
                                c28655q.m87150e0(1239871443);
                                EnumC2888c enumC2888c6 = enumC2888c3;
                                EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                                if ((i24 & 7168) == 2048) {
                                    z26 = true;
                                } else {
                                    z26 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (z26 || objM87133R2 == c28676v1) {
                                    objM87133R2 = new C16416l0(interfaceC4339a6, 6);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                enumC2888c4 = enumC2888c6;
                                i25 = i24;
                                c28676v0 = c28676v1;
                                z25 = false;
                                interfaceC4339a5 = interfaceC4339a6;
                                AbstractC27265l0.m82217i(null, enumC27269n0, textResource2, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, ((i16 >> 3) & 896) | 48 | (i16 & 57344), 0, 4073);
                                c28655q.m87173q(false);
                            } else {
                                i25 = i24;
                                enumC2888c4 = enumC2888c3;
                                interfaceC4339a5 = interfaceC4339a6;
                                c28676v0 = c28676v1;
                                z25 = false;
                                c28655q.m87150e0(1240130913);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            i26 = 8;
                            AbstractC31061c.m95650z(1, 8, c2314t, c28655q, z25);
                            r14 = z25;
                        }
                        c3 = 2;
                        AbstractC30795n.m94707h(strM21274h, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8402a, null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        if (z4) {
                            c28655q.m87150e0(1239871443);
                            EnumC2888c enumC2888c7 = enumC2888c3;
                            EnumC27269n0 enumC27269n1 = EnumC27269n0.TextSmall;
                            if ((i24 & 7168) == 2048) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z26) {
                                objM87133R2 = new C16416l0(interfaceC4339a6, 6);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C16416l0(interfaceC4339a6, 6);
                                c28655q.m87172p0(objM87133R2);
                            }
                            enumC2888c4 = enumC2888c7;
                            i25 = i24;
                            c28676v0 = c28676v1;
                            z25 = false;
                            interfaceC4339a5 = interfaceC4339a6;
                            AbstractC27265l0.m82217i(null, enumC27269n1, textResource2, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, ((i16 >> 3) & 896) | 48 | (i16 & 57344), 0, 4073);
                            c28655q.m87173q(false);
                        } else {
                            i25 = i24;
                            enumC2888c4 = enumC2888c3;
                            interfaceC4339a5 = interfaceC4339a6;
                            c28676v0 = c28676v1;
                            z25 = false;
                            c28655q.m87150e0(1240130913);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        i26 = 8;
                        AbstractC31061c.m95650z(1, 8, c2314t, c28655q, z25);
                        r14 = z25;
                    }
                    j7 = jM95624D;
                    if (zM47636C) {
                        c28655q.m87150e0(-2038229661);
                        C2886a c2886aM8417O2 = C38072d.f163053a.m121952e(c28655q, i28).getT2();
                        c28655q.m87173q(z24);
                        c2886aM8402a = c2886aM8417O2;
                    } else {
                        if (enumC2888c3 != null) {
                            c28655q.m87150e0(-2038227420);
                            c28655q.m87173q(z24);
                            c2886aM8402a = EnumC2888c.INSTANCE.m8402a(enumC2888c3);
                        } else if (abstractC18247a3 instanceof C18250d) {
                            c28655q.m87150e0(-2038223497);
                            C38072d c38072d2 = C38072d.f163053a;
                            c3 = 2;
                            C2886a c2886aM8397c2 = C2886a.m8397c(c38072d2.m121952e(c28655q, 6).getSh4(), C23285v0.m67363a(c38072d2.m121952e(c28655q, 6).getSh4().getStyle(), ((C18250d) abstractC18247a3).getBrush().mo60316a(c28655q, 0), 0L, null, null, 0L, 33554430), null, 2, null);
                            c28655q.m87173q(false);
                            c2886aM8402a = c2886aM8397c2;
                        } else {
                            c3 = 2;
                            c28655q.m87150e0(-2038217052);
                            C2886a c2886aM8414L2 = C38072d.f163053a.m121952e(c28655q, 6).getSh4();
                            c28655q.m87173q(false);
                            c2886aM8402a = c2886aM8414L2;
                        }
                        AbstractC30795n.m94707h(strM21274h, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8402a, null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        if (z4) {
                            c28655q.m87150e0(1239871443);
                            EnumC2888c enumC2888c8 = enumC2888c3;
                            EnumC27269n0 enumC27269n2 = EnumC27269n0.TextSmall;
                            if ((i24 & 7168) == 2048) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z26) {
                                objM87133R2 = new C16416l0(interfaceC4339a6, 6);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C16416l0(interfaceC4339a6, 6);
                                c28655q.m87172p0(objM87133R2);
                            }
                            enumC2888c4 = enumC2888c8;
                            i25 = i24;
                            c28676v0 = c28676v1;
                            z25 = false;
                            interfaceC4339a5 = interfaceC4339a6;
                            AbstractC27265l0.m82217i(null, enumC27269n2, textResource2, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, ((i16 >> 3) & 896) | 48 | (i16 & 57344), 0, 4073);
                            c28655q.m87173q(false);
                        } else {
                            i25 = i24;
                            enumC2888c4 = enumC2888c3;
                            interfaceC4339a5 = interfaceC4339a6;
                            c28676v0 = c28676v1;
                            z25 = false;
                            c28655q.m87150e0(1240130913);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        i26 = 8;
                        AbstractC31061c.m95650z(1, 8, c2314t, c28655q, z25);
                        r14 = z25;
                    }
                    c3 = 2;
                    AbstractC30795n.m94707h(strM21274h, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8402a, null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    if (z4) {
                        c28655q.m87150e0(1239871443);
                        EnumC2888c enumC2888c9 = enumC2888c3;
                        EnumC27269n0 enumC27269n3 = EnumC27269n0.TextSmall;
                        if ((i24 & 7168) == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z26) {
                            objM87133R2 = new C16416l0(interfaceC4339a6, 6);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C16416l0(interfaceC4339a6, 6);
                            c28655q.m87172p0(objM87133R2);
                        }
                        enumC2888c4 = enumC2888c9;
                        i25 = i24;
                        c28676v0 = c28676v1;
                        z25 = false;
                        interfaceC4339a5 = interfaceC4339a6;
                        AbstractC27265l0.m82217i(null, enumC27269n3, textResource2, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, ((i16 >> 3) & 896) | 48 | (i16 & 57344), 0, 4073);
                        c28655q.m87173q(false);
                    } else {
                        i25 = i24;
                        enumC2888c4 = enumC2888c3;
                        interfaceC4339a5 = interfaceC4339a6;
                        c28676v0 = c28676v1;
                        z25 = false;
                        c28655q.m87150e0(1240130913);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    i26 = 8;
                    AbstractC31061c.m95650z(1, 8, c2314t, c28655q, z25);
                    r14 = z25;
                } else {
                    interfaceC2300f4 = interfaceC2300f4;
                    abstractC18247a3 = abstractC18247a3;
                    i25 = i24;
                    enumC2888c4 = enumC2888c3;
                    c2314t = c2314t;
                    interfaceC4339a5 = interfaceC4339a4;
                    c28676v0 = c28676v1;
                    r14 = 0;
                    i26 = 8;
                    c28655q.m87150e0(-20995657);
                    c28655q.m87173q(false);
                }
                f13 = 4;
                C22971k c22971kM66746i = AbstractC22977m.m66746i(2 * f13);
                if (z18) {
                    f14 = f64942f;
                } else if (zM47636C) {
                    f14 = ((float) r14) * i26;
                } else {
                    f14 = f64937a;
                }
                C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(f14, 0.0f, 2);
                boolean zM87157i = c28655q.m87157i(list);
                if (((i16 & 1879048192) ^ 805306368) > 536870912) {
                    function10 = function12;
                    if (!c28655q.m87153g(function10)) {
                        r15 = 1;
                    }
                    int i56 = (zM87157i ? 1 : 0) | r15;
                    if ((i25 & 896) == 256) {
                        r16 = 1;
                    } else {
                        r16 = r14;
                    }
                    r17 = i56 | r16;
                    objM87133R = c28655q.m87133R();
                    if (r17 == 0 || objM87133R == c28676v0) {
                        function11 = function9;
                        objM87133R = new C13412g(list, function10, function11, 22);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function11 = function9;
                    }
                    Function3 function13 = function10;
                    Function1 function14 = function11;
                    C28655q c28655q2 = c28655q;
                    AbstractC22674j.m65718d(null, null, c22976l1M3379a, c22971kM66746i, null, null, false, null, (Function1) objM87133R, c28655q2, 24576, 491);
                    r18 = c28655q2;
                    if (z19) {
                        r18.m87150e0(-20357739);
                        AbstractC31061c.m95650z(6, f13, c2314t, r18, r14);
                    } else {
                        r18.m87150e0(-20294313);
                        r18.m87173q(r14);
                    }
                    r18.m87173q(true);
                    interfaceC2300f3 = interfaceC2300f4;
                    enumC2888c2 = enumC2888c4;
                    interfaceC4339a2 = interfaceC4339a5;
                    z17 = z18;
                    z16 = z19;
                    function4 = function13;
                    function5 = function14;
                    r10 = r18;
                } else {
                    function10 = function12;
                }
                if ((i16 & 805306368) == 536870912) {
                    r15 = 1;
                } else {
                    r15 = r14;
                }
                int i57 = (zM87157i ? 1 : 0) | r15;
                if ((i25 & 896) == 256) {
                    r16 = 1;
                } else {
                    r16 = r14;
                }
                r17 = i57 | r16;
                objM87133R = c28655q.m87133R();
                if (r17 == 0) {
                    function11 = function9;
                    objM87133R = new C13412g(list, function10, function11, 22);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function11 = function9;
                    objM87133R = new C13412g(list, function10, function11, 22);
                    c28655q.m87172p0(objM87133R);
                }
                Function3 function15 = function10;
                Function1 function16 = function11;
                C28655q c28655q3 = c28655q;
                AbstractC22674j.m65718d(null, null, c22976l1M3379a, c22971kM66746i, null, null, false, null, (Function1) objM87133R, c28655q3, 24576, 491);
                r18 = c28655q3;
                if (z19) {
                    r18.m87150e0(-20357739);
                    AbstractC31061c.m95650z(6, f13, c2314t, r18, r14);
                } else {
                    r18.m87150e0(-20294313);
                    r18.m87173q(r14);
                }
                r18.m87173q(true);
                interfaceC2300f3 = interfaceC2300f4;
                enumC2888c2 = enumC2888c4;
                interfaceC4339a2 = interfaceC4339a5;
                z17 = z18;
                z16 = z19;
                function4 = function15;
                function5 = function16;
                r10 = r18;
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            c0209i = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N);
            if (z18) {
                c28655q.m87150e0(-23013850);
                AbstractC25012a.m73389v(c2314t, f64940d, c28655q, false);
            } else {
                c28655q.m87150e0(-22936009);
                c28655q.m87173q(false);
            }
            if (z13) {
                c28655q.m87150e0(-22851348);
                if (z18) {
                    c28655q.m87150e0(-22870227);
                    i27 = 0;
                    AbstractC31061c.m95650z(2, 4, c2314t, c28655q, false);
                } else {
                    i27 = 0;
                    c28655q.m87150e0(-22799113);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (z18) {
                    f15 = f64941e;
                } else if (zM47636C) {
                    f15 = i27 * 8;
                } else {
                    f15 = f64937a;
                }
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(modifierM3409f2, f15, 0.0f, 2);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                interfaceC4339a6 = interfaceC4339a4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N3);
                String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q, i16 & 14);
                if (zM47636C) {
                    c28655q.m87150e0(-2038238837);
                    i28 = 6;
                    z24 = false;
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                } else {
                    z24 = false;
                    if (abstractC18247a3 instanceof C18252f) {
                        c28655q.m87150e0(-2038236108);
                        long jMo134584toComposableColorWaAFU9c2 = ((C18252f) abstractC18247a3).getColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                        c28655q.m87173q(false);
                        j7 = jMo134584toComposableColorWaAFU9c2;
                        i28 = 6;
                    } else {
                        c28655q.m87150e0(-2038233877);
                        i28 = 6;
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    }
                    if (zM47636C) {
                        c28655q.m87150e0(-2038229661);
                        C2886a c2886aM8417O3 = C38072d.f163053a.m121952e(c28655q, i28).getT2();
                        c28655q.m87173q(z24);
                        c2886aM8402a = c2886aM8417O3;
                    } else {
                        if (enumC2888c3 != null) {
                            c28655q.m87150e0(-2038227420);
                            c28655q.m87173q(z24);
                            c2886aM8402a = EnumC2888c.INSTANCE.m8402a(enumC2888c3);
                        } else if (abstractC18247a3 instanceof C18250d) {
                            c28655q.m87150e0(-2038223497);
                            C38072d c38072d3 = C38072d.f163053a;
                            c3 = 2;
                            C2886a c2886aM8397c3 = C2886a.m8397c(c38072d3.m121952e(c28655q, 6).getSh4(), C23285v0.m67363a(c38072d3.m121952e(c28655q, 6).getSh4().getStyle(), ((C18250d) abstractC18247a3).getBrush().mo60316a(c28655q, 0), 0L, null, null, 0L, 33554430), null, 2, null);
                            c28655q.m87173q(false);
                            c2886aM8402a = c2886aM8397c3;
                        } else {
                            c3 = 2;
                            c28655q.m87150e0(-2038217052);
                            C2886a c2886aM8414L3 = C38072d.f163053a.m121952e(c28655q, 6).getSh4();
                            c28655q.m87173q(false);
                            c2886aM8402a = c2886aM8414L3;
                        }
                        AbstractC30795n.m94707h(strM21274h2, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8402a, null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        if (z4) {
                            c28655q.m87150e0(1239871443);
                            EnumC2888c enumC2888c10 = enumC2888c3;
                            EnumC27269n0 enumC27269n4 = EnumC27269n0.TextSmall;
                            if ((i24 & 7168) == 2048) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z26) {
                                objM87133R2 = new C16416l0(interfaceC4339a6, 6);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C16416l0(interfaceC4339a6, 6);
                                c28655q.m87172p0(objM87133R2);
                            }
                            enumC2888c4 = enumC2888c10;
                            i25 = i24;
                            c28676v0 = c28676v1;
                            z25 = false;
                            interfaceC4339a5 = interfaceC4339a6;
                            AbstractC27265l0.m82217i(null, enumC27269n4, textResource2, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, ((i16 >> 3) & 896) | 48 | (i16 & 57344), 0, 4073);
                            c28655q.m87173q(false);
                        } else {
                            i25 = i24;
                            enumC2888c4 = enumC2888c3;
                            interfaceC4339a5 = interfaceC4339a6;
                            c28676v0 = c28676v1;
                            z25 = false;
                            c28655q.m87150e0(1240130913);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        i26 = 8;
                        AbstractC31061c.m95650z(1, 8, c2314t, c28655q, z25);
                        r14 = z25;
                    }
                    c3 = 2;
                    AbstractC30795n.m94707h(strM21274h2, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8402a, null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    if (z4) {
                        c28655q.m87150e0(1239871443);
                        EnumC2888c enumC2888c11 = enumC2888c3;
                        EnumC27269n0 enumC27269n5 = EnumC27269n0.TextSmall;
                        if ((i24 & 7168) == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z26) {
                            objM87133R2 = new C16416l0(interfaceC4339a6, 6);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C16416l0(interfaceC4339a6, 6);
                            c28655q.m87172p0(objM87133R2);
                        }
                        enumC2888c4 = enumC2888c11;
                        i25 = i24;
                        c28676v0 = c28676v1;
                        z25 = false;
                        interfaceC4339a5 = interfaceC4339a6;
                        AbstractC27265l0.m82217i(null, enumC27269n5, textResource2, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, ((i16 >> 3) & 896) | 48 | (i16 & 57344), 0, 4073);
                        c28655q.m87173q(false);
                    } else {
                        i25 = i24;
                        enumC2888c4 = enumC2888c3;
                        interfaceC4339a5 = interfaceC4339a6;
                        c28676v0 = c28676v1;
                        z25 = false;
                        c28655q.m87150e0(1240130913);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    i26 = 8;
                    AbstractC31061c.m95650z(1, 8, c2314t, c28655q, z25);
                    r14 = z25;
                }
                j7 = jM95624D;
                if (zM47636C) {
                    c28655q.m87150e0(-2038229661);
                    C2886a c2886aM8417O4 = C38072d.f163053a.m121952e(c28655q, i28).getT2();
                    c28655q.m87173q(z24);
                    c2886aM8402a = c2886aM8417O4;
                } else {
                    if (enumC2888c3 != null) {
                        c28655q.m87150e0(-2038227420);
                        c28655q.m87173q(z24);
                        c2886aM8402a = EnumC2888c.INSTANCE.m8402a(enumC2888c3);
                    } else if (abstractC18247a3 instanceof C18250d) {
                        c28655q.m87150e0(-2038223497);
                        C38072d c38072d4 = C38072d.f163053a;
                        c3 = 2;
                        C2886a c2886aM8397c4 = C2886a.m8397c(c38072d4.m121952e(c28655q, 6).getSh4(), C23285v0.m67363a(c38072d4.m121952e(c28655q, 6).getSh4().getStyle(), ((C18250d) abstractC18247a3).getBrush().mo60316a(c28655q, 0), 0L, null, null, 0L, 33554430), null, 2, null);
                        c28655q.m87173q(false);
                        c2886aM8402a = c2886aM8397c4;
                    } else {
                        c3 = 2;
                        c28655q.m87150e0(-2038217052);
                        C2886a c2886aM8414L4 = C38072d.f163053a.m121952e(c28655q, 6).getSh4();
                        c28655q.m87173q(false);
                        c2886aM8402a = c2886aM8414L4;
                    }
                    AbstractC30795n.m94707h(strM21274h2, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8402a, null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    if (z4) {
                        c28655q.m87150e0(1239871443);
                        EnumC2888c enumC2888c12 = enumC2888c3;
                        EnumC27269n0 enumC27269n6 = EnumC27269n0.TextSmall;
                        if ((i24 & 7168) == 2048) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z26) {
                            objM87133R2 = new C16416l0(interfaceC4339a6, 6);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C16416l0(interfaceC4339a6, 6);
                            c28655q.m87172p0(objM87133R2);
                        }
                        enumC2888c4 = enumC2888c12;
                        i25 = i24;
                        c28676v0 = c28676v1;
                        z25 = false;
                        interfaceC4339a5 = interfaceC4339a6;
                        AbstractC27265l0.m82217i(null, enumC27269n6, textResource2, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, ((i16 >> 3) & 896) | 48 | (i16 & 57344), 0, 4073);
                        c28655q.m87173q(false);
                    } else {
                        i25 = i24;
                        enumC2888c4 = enumC2888c3;
                        interfaceC4339a5 = interfaceC4339a6;
                        c28676v0 = c28676v1;
                        z25 = false;
                        c28655q.m87150e0(1240130913);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    i26 = 8;
                    AbstractC31061c.m95650z(1, 8, c2314t, c28655q, z25);
                    r14 = z25;
                }
                c3 = 2;
                AbstractC30795n.m94707h(strM21274h2, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8402a, null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                if (z4) {
                    c28655q.m87150e0(1239871443);
                    EnumC2888c enumC2888c13 = enumC2888c3;
                    EnumC27269n0 enumC27269n7 = EnumC27269n0.TextSmall;
                    if ((i24 & 7168) == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z26) {
                        objM87133R2 = new C16416l0(interfaceC4339a6, 6);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C16416l0(interfaceC4339a6, 6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    enumC2888c4 = enumC2888c13;
                    i25 = i24;
                    c28676v0 = c28676v1;
                    z25 = false;
                    interfaceC4339a5 = interfaceC4339a6;
                    AbstractC27265l0.m82217i(null, enumC27269n7, textResource2, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, ((i16 >> 3) & 896) | 48 | (i16 & 57344), 0, 4073);
                    c28655q.m87173q(false);
                } else {
                    i25 = i24;
                    enumC2888c4 = enumC2888c3;
                    interfaceC4339a5 = interfaceC4339a6;
                    c28676v0 = c28676v1;
                    z25 = false;
                    c28655q.m87150e0(1240130913);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                i26 = 8;
                AbstractC31061c.m95650z(1, 8, c2314t, c28655q, z25);
                r14 = z25;
            } else {
                interfaceC2300f4 = interfaceC2300f4;
                abstractC18247a3 = abstractC18247a3;
                i25 = i24;
                enumC2888c4 = enumC2888c3;
                c2314t = c2314t;
                interfaceC4339a5 = interfaceC4339a4;
                c28676v0 = c28676v1;
                r14 = 0;
                i26 = 8;
                c28655q.m87150e0(-20995657);
                c28655q.m87173q(false);
            }
            f13 = 4;
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(2 * f13);
            if (z18) {
                f14 = f64942f;
            } else if (zM47636C) {
                f14 = ((float) r14) * i26;
            } else {
                f14 = f64937a;
            }
            C22976l1 c22976l1M3379a2 = AbstractC1099a.m3379a(f14, 0.0f, 2);
            boolean zM87157i2 = c28655q.m87157i(list);
            if (((i16 & 1879048192) ^ 805306368) > 536870912) {
                function10 = function12;
                if (!c28655q.m87153g(function10)) {
                    r15 = 1;
                }
                int i58 = (zM87157i2 ? 1 : 0) | r15;
                if ((i25 & 896) == 256) {
                    r16 = 1;
                } else {
                    r16 = r14;
                }
                r17 = i58 | r16;
                objM87133R = c28655q.m87133R();
                if (r17 == 0) {
                    function11 = function9;
                    objM87133R = new C13412g(list, function10, function11, 22);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function11 = function9;
                    objM87133R = new C13412g(list, function10, function11, 22);
                    c28655q.m87172p0(objM87133R);
                }
                Function3 function17 = function10;
                Function1 function18 = function11;
                C28655q c28655q4 = c28655q;
                AbstractC22674j.m65718d(null, null, c22976l1M3379a2, c22971kM66746i2, null, null, false, null, (Function1) objM87133R, c28655q4, 24576, 491);
                r18 = c28655q4;
                if (z19) {
                    r18.m87150e0(-20357739);
                    AbstractC31061c.m95650z(6, f13, c2314t, r18, r14);
                } else {
                    r18.m87150e0(-20294313);
                    r18.m87173q(r14);
                }
                r18.m87173q(true);
                interfaceC2300f3 = interfaceC2300f4;
                enumC2888c2 = enumC2888c4;
                interfaceC4339a2 = interfaceC4339a5;
                z17 = z18;
                z16 = z19;
                function4 = function17;
                function5 = function18;
                r10 = r18;
            } else {
                function10 = function12;
            }
            if ((i16 & 805306368) == 536870912) {
                r15 = 1;
            } else {
                r15 = r14;
            }
            int i59 = (zM87157i2 ? 1 : 0) | r15;
            if ((i25 & 896) == 256) {
                r16 = 1;
            } else {
                r16 = r14;
            }
            r17 = i59 | r16;
            objM87133R = c28655q.m87133R();
            if (r17 == 0) {
                function11 = function9;
                objM87133R = new C13412g(list, function10, function11, 22);
                c28655q.m87172p0(objM87133R);
            } else {
                function11 = function9;
                objM87133R = new C13412g(list, function10, function11, 22);
                c28655q.m87172p0(objM87133R);
            }
            Function3 function19 = function10;
            Function1 function110 = function11;
            C28655q c28655q5 = c28655q;
            AbstractC22674j.m65718d(null, null, c22976l1M3379a2, c22971kM66746i2, null, null, false, null, (Function1) objM87133R, c28655q5, 24576, 491);
            r18 = c28655q5;
            if (z19) {
                r18.m87150e0(-20357739);
                AbstractC31061c.m95650z(6, f13, c2314t, r18, r14);
            } else {
                r18.m87150e0(-20294313);
                r18.m87173q(r14);
            }
            r18.m87173q(true);
            interfaceC2300f3 = interfaceC2300f4;
            enumC2888c2 = enumC2888c4;
            interfaceC4339a2 = interfaceC4339a5;
            z17 = z18;
            z16 = z19;
            function4 = function19;
            function5 = function110;
            r10 = r18;
        } else {
            C28655q c28655q6 = c28655q;
            c28655q6.m87138X();
            enumC2888c2 = enumC2888c;
            function4 = function3;
            function5 = function2;
            interfaceC4339a2 = interfaceC4339a;
            z16 = z15;
            interfaceC2300f3 = interfaceC2300f2;
            abstractC18247a3 = abstractC18247a2;
            z17 = z14;
            r10 = c28655q6;
        }
        C28677v1 c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            final AbstractC18247a abstractC18247a4 = abstractC18247a3;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: h51.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC16932d.m47635B(textResource, abstractC18247a4, enumC2888c2, textResource2, c39274g, z4, z13, list, interfaceC2300f3, function4, z17, function1, function5, interfaceC4339a2, z16, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Modifier m47658v(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-218627747);
        c28655q.m87173q(false);
        return C2314t.f9131w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m47659w(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m47660x() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m47661y(Function1 function1, InterfaceC39147y it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m47662z(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }
}
