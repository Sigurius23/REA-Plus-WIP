package e81;

import am2.C1024j;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.profile.view.edit.preview.C9809a;
import e93.AbstractC12889b;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.InterfaceC11372l;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p180h0.AbstractC16444q3;
import p181h2.C16618c;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17887h;
import p208i2.C17891j;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.InterfaceC17910s0;
import p208i2.InterfaceC17915v;
import p270k2.C22134h;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p411q2.InterfaceC29805a;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.C34472r;
import p512u2.InterfaceC34449b;
import p512u2.InterfaceC34476v;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32274h;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: e81.d0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0083\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aQ\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00020\u0010H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001ag\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a-\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010$\u001a\u00020 *\u00020#H\u0000¢\u0006\u0004\b$\u0010%\u001a%\u0010(\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)\u001a+\u0010/\u001a\u00020\u000e*\u00020*2\u0006\u0010+\u001a\u00020#2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u00100\u001a+\u00101\u001a\u00020\u000e*\u00020*2\u0006\u0010+\u001a\u00020#2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0014H\u0002¢\u0006\u0004\b1\u00100\u001aI\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005022\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\b\b\u0002\u00106\u001a\u00020 H\u0002¢\u0006\u0004\b7\u00108\u001a;\u0010<\u001a\u00020\u000e*\u0002092\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005022\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000502H\u0002¢\u0006\u0004\b<\u0010=\u001aG\u0010E\u001a\u0002092\u0006\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0005H\u0002¢\u0006\u0004\bE\u0010F\u001aS\u0010H\u001a\u00020\u000e*\u00020*2\u0006\u0010G\u001a\u00020,2\u0006\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0005H\u0002¢\u0006\u0004\bH\u0010I\u001aS\u0010L\u001a\u00020\u000e*\u00020*2\u0006\u0010K\u001a\u00020J2\u0006\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0005H\u0002¢\u0006\u0004\bL\u0010M\u001a\u000f\u0010N\u001a\u00020\u000eH\u0003¢\u0006\u0004\bN\u0010O¨\u0006U²\u0006\u0010\u0010P\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010S\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002²\u0006\u001a\u0010T\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e0\f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "Le81/h0;", "sliceData", "", "tickThicknessPercent", "highlightThicknessPercent", "gapAngle", "fillFraction", "Le81/u;", "selection", "Lkotlin/Function1;", "", "Ll83/a0;", "onSelectionChange", "Lkotlin/Function0;", "centerContent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Ljava/util/List;FFFFLe81/u;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "Le81/w;", "frames", "v", "(Landroidx/compose/ui/Modifier;Ljava/util/List;FFFLc93/a;Landroidx/compose/runtime/Composer;I)V", "Le81/r;", "angles", "Lq2/a;", "haptics", "onSelectedSliceChange", "U", "(Landroidx/compose/ui/Modifier;Le81/r;Ljava/util/List;Le81/u;Lq2/a;FFFLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "index", "", "R", "(ILjava/util/List;F)Z", "Le81/t;", "Q", "(Le81/t;)Z", "Ltx/f;", "type", "O", "(Le81/u;Lq2/a;I)V", "Lk2/e;", "metrics", "Li2/x;", "sliceColor", "frame", "N", "(Lk2/e;Le81/t;JLe81/w;)V", "K", "Ll83/k;", "point", "angle", "distance", "perpendicular", "S", "(Ll83/k;FFZ)Ll83/k;", "Li2/s0;", "controlPoint", "endPoint", "I", "(Li2/s0;Ll83/k;Ll83/k;)V", "startAngle", "sweepAngle", "centerX", "centerY", "strokeWidth", "radius", "cornerRadius", "J", "(FFFFFFF)Li2/s0;", "color", "M", "(Lk2/e;JFFFFFFF)V", "Li2/t;", "brush", "L", "(Lk2/e;Li2/t;FFFFFFF)V", "y", "(Landroidx/compose/runtime/Composer;I)V", "selectedSliceIndex", "fromFrame", "toFrame", "previousSlice", "currentOnSelectionChange", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12823d0 {

    /* JADX INFO: renamed from: e81.d0$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.piechart.PieChartKt$PieChart$2$1", m100430f = "PieChart.kt", m100431l = {112, 113}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Integer f43927E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C11344e f43928F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f43929G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28601c1 f43930H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC28601c1 f43931I;

        /* JADX INFO: renamed from: w */
        Object f43932w;

        /* JADX INFO: renamed from: x */
        int f43933x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<C12849w> f43934y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12847u f43935z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<C12849w> list, C12847u c12847u, Integer num, C11344e c11344e, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f43934y = list;
            this.f43935z = c12847u;
            this.f43927E = num;
            this.f43928F = c11344e;
            this.f43929G = interfaceC28601c1;
            this.f43930H = interfaceC28601c2;
            this.f43931I = interfaceC28601c3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f43934y, this.f43935z, this.f43927E, this.f43928F, this.f43929G, this.f43930H, this.f43931I, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11372l interfaceC11372lM36079d;
            InterfaceC11372l interfaceC11372l;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f43933x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!AbstractC22676k.m65745e(this.f43934y, AbstractC12823d0.m35941j(this.f43929G))) {
                    C12847u c12847u = this.f43935z;
                    if (c12847u == null) {
                        interfaceC11372lM36079d = AbstractC11348f.m30572t();
                    } else if (this.f43927E == null) {
                        interfaceC11372lM36079d = c12847u.getReleaseAnimation();
                    } else {
                        interfaceC11372lM36079d = AbstractC12823d0.m35943l(this.f43930H) == null ? this.f43935z.getPressAnimation() : this.f43935z.getDragAnimation();
                    }
                    interfaceC11372l = interfaceC11372lM36079d;
                    AbstractC12823d0.m35944m(this.f43930H, this.f43927E);
                    InterfaceC28601c1 interfaceC28601c1 = this.f43931I;
                    AbstractC12823d0.m35952u(interfaceC28601c1, AbstractC12845s.m36060c(AbstractC12823d0.m35951t(interfaceC28601c1), AbstractC12823d0.m35941j(this.f43929G), ((Number) this.f43928F.m30549e()).floatValue()));
                    AbstractC12823d0.m35942k(this.f43929G, this.f43934y);
                    C11344e c11344e = this.f43928F;
                    Float f13 = new Float(0.0f);
                    this.f43932w = interfaceC11372l;
                    this.f43933x = 1;
                    if (c11344e.m30551g(f13, this) != enumC31071a) {
                    }
                }
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            interfaceC11372l = (InterfaceC11372l) this.f43932w;
            AbstractC34132o.m107864I(obj);
            InterfaceC11372l interfaceC11372l2 = interfaceC11372l;
            C11344e c11344e2 = this.f43928F;
            Float f14 = new Float(1.0f);
            this.f43932w = null;
            this.f43933x = 2;
            return C11344e.m30547d(c11344e2, f14, interfaceC11372l2, null, this, 12) == enumC31071a ? enumC31071a : c23454a0;
        }
    }

    /* JADX INFO: renamed from: e81.d0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f43936E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC29805a f43937F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ List<C12831h0> f43938G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ float f43939H;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C12844r f43940w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f43941x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f43942y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12847u f43943z;

        /* JADX INFO: renamed from: e81.d0$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.piechart.PieChartKt$sliceSelection$1$1", m100430f = "PieChart.kt", m100431l = {296, 309, 321}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu2/b;", "Ll83/a0;", "<anonymous>", "(Lu2/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32274h implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            Object f43944E;

            /* JADX INFO: renamed from: F */
            Object f43945F;

            /* JADX INFO: renamed from: G */
            Object f43946G;

            /* JADX INFO: renamed from: H */
            float f43947H;

            /* JADX INFO: renamed from: I */
            float f43948I;

            /* JADX INFO: renamed from: J */
            int f43949J;

            /* JADX INFO: renamed from: K */
            private /* synthetic */ Object f43950K;

            /* JADX INFO: renamed from: L */
            final /* synthetic */ C12844r f43951L;

            /* JADX INFO: renamed from: M */
            final /* synthetic */ float f43952M;

            /* JADX INFO: renamed from: N */
            final /* synthetic */ float f43953N;

            /* JADX INFO: renamed from: O */
            final /* synthetic */ C12847u f43954O;

            /* JADX INFO: renamed from: P */
            final /* synthetic */ Function1 f43955P;

            /* JADX INFO: renamed from: Q */
            final /* synthetic */ InterfaceC29805a f43956Q;

            /* JADX INFO: renamed from: R */
            final /* synthetic */ List<C12831h0> f43957R;

            /* JADX INFO: renamed from: S */
            final /* synthetic */ float f43958S;

            /* JADX INFO: renamed from: x */
            Object f43959x;

            /* JADX INFO: renamed from: y */
            Object f43960y;

            /* JADX INFO: renamed from: z */
            Object f43961z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C12844r c12844r, float f13, float f14, C12847u c12847u, Function1 function1, InterfaceC29805a interfaceC29805a, List<C12831h0> list, float f15, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f43951L = c12844r;
                this.f43952M = f13;
                this.f43953N = f14;
                this.f43954O = c12847u;
                this.f43955P = function1;
                this.f43956Q = interfaceC29805a;
                this.f43957R = list;
                this.f43958S = f15;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: i */
            public static final C23454a0 m35959i(C12846t c12846t, float f13, float f14, C12844r c12844r, C22669g0 c22669g0, Function1 function1, C12847u c12847u, InterfaceC29805a interfaceC29805a, List list, float f15, C34472r c34472r) {
                c34472r.m108946a();
                long j7 = c34472r.f144817c;
                C12846t.c cVarM36070j = c12846t.m36070j(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), f13, f14);
                float fM36075b = cVarM36070j.getRadius();
                float fM36061a = c12846t.getInteractiveInnerRadius();
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (fM36075b < fM36061a) {
                    return c23454a0;
                }
                Integer numM36056c = c12844r.m36056c(cVarM36070j.getAngleDegrees());
                if (numM36056c == null || !AbstractC12823d0.m35928R(numM36056c.intValue(), list, f15)) {
                    numM36056c = null;
                }
                if (!AbstractC22676k.m65745e(numM36056c, c22669g0.f89336w)) {
                    c22669g0.f89336w = numM36056c;
                    function1.invoke(numM36056c);
                    AbstractC12823d0.m35926P(c12847u, interfaceC29805a, 0, 2, null);
                }
                return c23454a0;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f43951L, this.f43952M, this.f43953N, this.f43954O, this.f43955P, this.f43956Q, this.f43957R, this.f43958S, interfaceC30057d);
                aVar.f43950K = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34449b interfaceC34449b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC34449b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code duplicated, block: B:32:0x0118  */
            /* JADX WARN: Code duplicated, block: B:34:0x013e  */
            /* JADX WARN: Code duplicated, block: B:37:0x014d  */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x01a3, code lost:
            
                if (r3 == r2) goto L41;
             */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r34) {
                /*
                    Method dump skipped, instruction units count: 480
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: e81.AbstractC12823d0.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(C12844r c12844r, float f13, float f14, C12847u c12847u, Function1 function1, InterfaceC29805a interfaceC29805a, List<C12831h0> list, float f15) {
            this.f43940w = c12844r;
            this.f43941x = f13;
            this.f43942y = f14;
            this.f43943z = c12847u;
            this.f43936E = function1;
            this.f43937F = interfaceC29805a;
            this.f43938G = list;
            this.f43939H = f15;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46625g = AbstractC16444q3.m46625g(interfaceC34476v, new a(this.f43940w, this.f43941x, this.f43942y, this.f43943z, this.f43936E, this.f43937F, this.f43938G, this.f43939H, null), interfaceC30057d);
            return objM46625g == EnumC31071a.f128113w ? objM46625g : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: I */
    private static final void m35919I(InterfaceC17910s0 interfaceC17910s0, C23465k c23465k, C23465k c23465k2) {
        ((C17891j) interfaceC17910s0).f69587a.quadTo(((Number) c23465k.f92937w).floatValue(), ((Number) c23465k.f92938x).floatValue(), ((Number) c23465k2.f92937w).floatValue(), ((Number) c23465k2.f92938x).floatValue());
    }

    /* JADX INFO: renamed from: J */
    private static final InterfaceC17910s0 m35920J(float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        float f24 = f17 / 2.0f;
        float f25 = f18 + f24;
        float f26 = f18 - f24;
        double d3 = 180;
        float f27 = (float) ((((double) f13) * 3.141592653589793d) / d3);
        float f28 = (float) ((((double) (f13 + f14)) * 3.141592653589793d) / d3);
        double d14 = f27;
        float fCos = (float) Math.cos(d14);
        float fSin = (float) Math.sin(d14);
        double d15 = f28;
        float fCos2 = (float) Math.cos(d15);
        float fSin2 = (float) Math.sin(d15);
        C23465k c23465k = new C23465k(Float.valueOf((f25 * fCos) + f15), Float.valueOf((f25 * fSin) + f16));
        C23465k c23465k2 = new C23465k(Float.valueOf((fCos * f26) + f15), Float.valueOf((fSin * f26) + f16));
        C23465k c23465k3 = new C23465k(Float.valueOf((f25 * fCos2) + f15), Float.valueOf((f25 * fSin2) + f16));
        C23465k c23465k4 = new C23465k(Float.valueOf((fCos2 * f26) + f15), Float.valueOf((fSin2 * f26) + f16));
        float f29 = (f19 / f25) * 57.295776f;
        float f34 = (f19 / f26) * 57.295776f;
        float f35 = f14 - (2 * f29);
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        float f36 = -f19;
        C23465k c23465kM35929S = m35929S(c23465k2, f27, f36, true);
        float fFloatValue = ((Number) c23465kM35929S.f92937w).floatValue();
        float fFloatValue2 = ((Number) c23465kM35929S.f92938x).floatValue();
        Path path = c17891jM51478a.f69587a;
        c17891jM51478a.m51462i(fFloatValue, fFloatValue2);
        m35919I(c17891jM51478a, c23465k2, m35930T(c23465k2, f27, f19, false, 8, null));
        C23465k c23465kM35930T = m35930T(c23465k, f27, f36, false, 8, null);
        c17891jM51478a.m51461h(((Number) c23465kM35930T.f92937w).floatValue(), ((Number) c23465kM35930T.f92938x).floatValue());
        m35919I(c17891jM51478a, c23465k, m35929S(c23465k, f27, f36, true));
        float f37 = f15 - f25;
        float f38 = f16 - f25;
        float f39 = f15 + f25;
        float f43 = f16 + f25;
        float f44 = f13 + f29;
        if (c17891jM51478a.f69588b == null) {
            c17891jM51478a.f69588b = new RectF();
        }
        RectF rectF = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF);
        rectF.set(f37, f38, f39, f43);
        RectF rectF2 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF2);
        path.arcTo(rectF2, f44, f35, false);
        m35919I(c17891jM51478a, c23465k3, m35930T(c23465k3, f28, f36, false, 8, null));
        C23465k c23465kM35930T2 = m35930T(c23465k4, f28, f19, false, 8, null);
        c17891jM51478a.m51461h(((Number) c23465kM35930T2.f92937w).floatValue(), ((Number) c23465kM35930T2.f92938x).floatValue());
        m35919I(c17891jM51478a, c23465k4, m35929S(c23465k4, f28, f19, true));
        float f45 = f15 - f26;
        float f46 = f16 - f26;
        float f47 = f15 + f26;
        float f48 = f16 + f26;
        float f49 = (f28 * 57.295776f) - f34;
        float f54 = -f35;
        if (c17891jM51478a.f69588b == null) {
            c17891jM51478a.f69588b = new RectF();
        }
        RectF rectF3 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF3);
        rectF3.set(f45, f46, f47, f48);
        RectF rectF4 = c17891jM51478a.f69588b;
        AbstractC22676k.m65747g(rectF4);
        path.arcTo(rectF4, f49, f54, false);
        c17891jM51478a.m51459f();
        return c17891jM51478a;
    }

    /* JADX INFO: renamed from: K */
    private static final void m35921K(InterfaceC22131e interfaceC22131e, C12846t c12846t, long j7, C12849w c12849w) {
        float fM36064d = c12846t.getShadowBandOuterRadius();
        float fM36063c = c12846t.getShadowBandInnerRadius();
        float f13 = fM36064d - fM36063c;
        if (f13 <= 0.001f) {
            return;
        }
        float f14 = (fM36064d + fM36063c) / 2.0f;
        C12846t.b bVarM36065e = c12846t.getShadowGradientRadii();
        if (f14 <= 0.0f || bVarM36065e.getEnd() <= bVarM36065e.getStart()) {
            return;
        }
        C17909s c17909s = AbstractC17911t.f69612b;
        C23465k[] c23465kArr = {new C23465k(Float.valueOf(AbstractC12889b.m36283m(bVarM36065e.getStart() / bVarM36065e.getEnd(), 0.0f, 1.0f) + 0.05f), new C17919x(C17919x.m51541c(0.0f, j7))), new C23465k(Float.valueOf(1.0f), new C17919x(C17919x.m51541c(0.35f, j7)))};
        long jMo721B0 = interfaceC22131e.mo721B0();
        float fM36072a = bVarM36065e.getEnd();
        c17909s.getClass();
        m35922L(interfaceC22131e, C17909s.m51488f(c23465kArr, jMo721B0, fM36072a, 0), c12849w.getStartAngle(), c12849w.getSweepAngle(), Float.intBitsToFloat((int) (interfaceC22131e.mo721B0() >> 32)), Float.intBitsToFloat((int) (interfaceC22131e.mo721B0() & 4294967295L)), f13, f14, 0.0f);
    }

    /* JADX INFO: renamed from: L */
    private static final void m35922L(InterfaceC22131e interfaceC22131e, AbstractC17911t abstractC17911t, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        InterfaceC22131e.m63378L(interfaceC22131e, m35920J(f13, f14, f15, f16, f17, f18, f19), abstractC17911t, 0.0f, C22134h.f85857a, 52);
    }

    /* JADX INFO: renamed from: M */
    private static final void m35923M(InterfaceC22131e interfaceC22131e, long j7, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        InterfaceC22131e.m63386z(interfaceC22131e, m35920J(f13, f14, f15, f16, f17, f18, f19), j7, 0.0f, C22134h.f85857a, 52);
    }

    /* JADX INFO: renamed from: N */
    private static final void m35924N(InterfaceC22131e interfaceC22131e, C12846t c12846t, long j7, C12849w c12849w) {
        float fM36068h = c12846t.getSliceOuterRadius();
        float fM36067g = c12846t.getSliceInnerRadius();
        float f13 = fM36068h - fM36067g;
        if (f13 <= 0.001f) {
            return;
        }
        float f14 = (fM36068h + fM36067g) / 2.0f;
        if (f14 <= 0.0f) {
            return;
        }
        float f15 = 0.08f * f13;
        m35923M(interfaceC22131e, j7, c12849w.getStartAngle(), c12849w.getSweepAngle(), Float.intBitsToFloat((int) (interfaceC22131e.mo721B0() >> 32)), Float.intBitsToFloat((int) (interfaceC22131e.mo721B0() & 4294967295L)), f13, f14, f15 > 4.0f ? 4.0f : f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final void m35925O(C12847u c12847u, InterfaceC29805a interfaceC29805a, int i13) {
        if (c12847u.getIsHapticFeedbackEnabled()) {
            interfaceC29805a.mo7428a(i13);
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m35926P(C12847u c12847u, InterfaceC29805a interfaceC29805a, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 9;
        }
        m35925O(c12847u, interfaceC29805a, i13);
    }

    /* JADX INFO: renamed from: Q */
    public static final boolean m35927Q(C12846t c12846t) {
        AbstractC22676k.m65750j(c12846t, "<this>");
        float fM36066f = c12846t.getShadowThickness() + c12846t.getSliceThickness();
        return fM36066f > 0.0f && fM36066f <= c12846t.getOuterRadius();
    }

    /* JADX INFO: renamed from: R */
    public static final boolean m35928R(int i13, List<C12831h0> sliceData, float f13) {
        AbstractC22676k.m65750j(sliceData, "sliceData");
        if (i13 < 0 || i13 >= sliceData.size() || f13 < (i13 + 1.0f) / sliceData.size()) {
            return false;
        }
        long jM35966a = sliceData.get(i13).getColor();
        int i14 = C17919x.f69638o;
        return !C17919x.m51542d(jM35966a, C17919x.f69636m);
    }

    /* JADX INFO: renamed from: S */
    private static final C23465k m35929S(C23465k c23465k, float f13, float f14, boolean z4) {
        if (z4) {
            f13 -= 1.5707964f;
        }
        double d3 = f13;
        return new C23465k(Float.valueOf((((float) Math.cos(d3)) * f14) + ((Number) c23465k.f92937w).floatValue()), Float.valueOf((f14 * ((float) Math.sin(d3))) + ((Number) c23465k.f92938x).floatValue()));
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ C23465k m35930T(C23465k c23465k, float f13, float f14, boolean z4, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z4 = false;
        }
        return m35929S(c23465k, f13, f14, z4);
    }

    /* JADX INFO: renamed from: U */
    private static final Modifier m35931U(Modifier modifier, C12844r c12844r, List<C12831h0> list, C12847u c12847u, InterfaceC29805a interfaceC29805a, float f13, float f14, float f15, Function1 function1) {
        return AbstractC34452c0.m108905d(modifier, new Object[]{c12844r, list, c12847u, Float.valueOf(f13), Float.valueOf(f14), Float.valueOf(f15)}, new b(c12844r, f13, f14, c12847u, function1, interfaceC29805a, list, f15));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:104:0x012d  */
    /* JADX WARN: Code duplicated, block: B:105:0x012f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:109:0x0139  */
    /* JADX WARN: Code duplicated, block: B:110:0x013e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0141  */
    /* JADX WARN: Code duplicated, block: B:114:0x0145  */
    /* JADX WARN: Code duplicated, block: B:115:0x0148  */
    /* JADX WARN: Code duplicated, block: B:117:0x014b  */
    /* JADX WARN: Code duplicated, block: B:118:0x014e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0154  */
    /* JADX WARN: Code duplicated, block: B:123:0x015a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0166  */
    /* JADX WARN: Code duplicated, block: B:127:0x016a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0173  */
    /* JADX WARN: Code duplicated, block: B:132:0x0189  */
    /* JADX WARN: Code duplicated, block: B:133:0x018b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0193 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x0195  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x01e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:158:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:161:0x0209  */
    /* JADX WARN: Code duplicated, block: B:164:0x021a  */
    /* JADX WARN: Code duplicated, block: B:167:0x022b  */
    /* JADX WARN: Code duplicated, block: B:170:0x023e  */
    /* JADX WARN: Code duplicated, block: B:171:0x0240  */
    /* JADX WARN: Code duplicated, block: B:174:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x025d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0284 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x0286  */
    /* JADX WARN: Code duplicated, block: B:184:0x029c  */
    /* JADX WARN: Code duplicated, block: B:185:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:188:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:189:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:192:0x0306  */
    /* JADX WARN: Code duplicated, block: B:194:0x0314  */
    /* JADX WARN: Code duplicated, block: B:197:0x032c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:198:0x032e  */
    /* JADX WARN: Code duplicated, block: B:200:0x036a  */
    /* JADX WARN: Code duplicated, block: B:203:0x037f  */
    /* JADX WARN: Code duplicated, block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0120  */
    /* JADX INFO: renamed from: h */
    public static final void m35939h(Modifier modifier, final List<C12831h0> sliceData, float f13, float f14, float f15, float f16, C12847u c12847u, Function1 function1, InterfaceC4351m interfaceC4351m, Composer composer, final int i13, final int i14) {
        int i15;
        float f17;
        int i16;
        float f18;
        int i17;
        int i18;
        float f19;
        int i19;
        int i24;
        float f24;
        int i25;
        int i26;
        C12847u c12847u2;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        boolean z4;
        C28655q c28655q;
        final Modifier modifier2;
        final Function1 function2;
        final InterfaceC4351m interfaceC4351m2;
        final float f25;
        final float f26;
        final C12847u c12847u3;
        final float f27;
        final float f28;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        float f29;
        float f34;
        C12847u c12847u4;
        C28676v0 c28676v0;
        Function1 function3;
        InterfaceC4351m interfaceC4351mM36052d;
        boolean z13;
        boolean z14;
        Object objM87133R;
        C12844r c12844r;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        Integer numM35949r;
        int i36;
        boolean z15;
        boolean z16;
        Object objM87133R3;
        float fM36081f;
        List list;
        Object objM87133R4;
        final InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R5;
        final InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R6;
        InterfaceC28601c1 interfaceC28601c4;
        Object objM87133R7;
        C11344e c11344e;
        boolean z17;
        boolean zM87153g;
        Object objM87133R8;
        final C11344e c11344e2;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        boolean zM87153g2;
        Object objM87133R9;
        Function1 function4;
        InterfaceC29805a interfaceC29805a;
        C2314t c2314t2;
        Modifier modifierM35931U;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean zM87157i;
        Object objM87133R10;
        Object objM87133R11;
        AbstractC22676k.m65750j(sliceData, "sliceData");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1756812322);
        int i37 = i14 & 1;
        if (i37 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(sliceData) ? 32 : 16;
        }
        int i38 = i14 & 4;
        if (i38 == 0) {
            if ((i13 & 384) == 0) {
                f17 = f13;
                i15 |= c28655q2.m87147d(f17) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    f18 = f14;
                    if (c28655q2.m87147d(f18)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        f19 = f15;
                        if (c28655q2.m87147d(f19)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 32;
                    if (i24 != 0) {
                        if ((196608 & i13) == 0) {
                            f24 = f16;
                            if (c28655q2.m87147d(f24)) {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i25;
                        }
                        i26 = i14 & 64;
                        if (i26 != 0) {
                            i15 |= 1572864;
                            c12847u2 = c12847u;
                        } else {
                            c12847u2 = c12847u;
                            if ((i13 & 1572864) == 0) {
                                if (c28655q2.m87153g(c12847u2)) {
                                    i27 = 1048576;
                                } else {
                                    i27 = 524288;
                                }
                                i15 |= i27;
                            }
                        }
                        i28 = i14 & 128;
                        if (i28 != 0) {
                            if ((i13 & 12582912) == 0) {
                                if (c28655q2.m87157i(function1)) {
                                    i29 = 8388608;
                                } else {
                                    i29 = 4194304;
                                }
                                i15 |= i29;
                            }
                            i34 = i14 & 256;
                            if (i34 != 0) {
                                if ((i13 & 100663296) == 0) {
                                    if (c28655q2.m87157i(interfaceC4351m)) {
                                        i35 = 67108864;
                                    } else {
                                        i35 = AndroidSDKConstants.FLAG_MUTABLE;
                                    }
                                    i15 |= i35;
                                }
                                if ((i15 & 38347923) != 38347922) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (c28655q2.m87135U(i15 & 1, z4)) {
                                    c2314t = C2314t.f9131w;
                                    if (i37 != 0) {
                                        modifier3 = c2314t;
                                    } else {
                                        modifier3 = modifier;
                                    }
                                    if (i38 != 0) {
                                        f17 = 0.06f;
                                    }
                                    if (i16 != 0) {
                                        f29 = 0.13f;
                                    } else {
                                        f29 = f18;
                                    }
                                    if (i18 != 0) {
                                        f19 = 1.0f;
                                    }
                                    if (i24 != 0) {
                                        f34 = 1.0f;
                                    } else {
                                        f34 = f24;
                                    }
                                    if (i26 != 0) {
                                        c12847u4 = null;
                                    } else {
                                        c12847u4 = c12847u2;
                                    }
                                    c28676v0 = C28635l.f115821a;
                                    if (i28 != 0) {
                                        objM87133R11 = c28655q2.m87133R();
                                        if (objM87133R11 == c28676v0) {
                                            objM87133R11 = new C12824e(5);
                                            c28655q2.m87172p0(objM87133R11);
                                        }
                                        function3 = (Function1) objM87133R11;
                                    } else {
                                        function3 = function1;
                                    }
                                    if (i34 != 0) {
                                        interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                                    } else {
                                        interfaceC4351mM36052d = interfaceC4351m;
                                    }
                                    boolean zM87149e = c28655q2.m87149e(sliceData.size());
                                    if ((i15 & 57344) == 16384) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    z14 = zM87149e | z13;
                                    objM87133R = c28655q2.m87133R();
                                    if (z14 || objM87133R == c28676v0) {
                                        objM87133R = new C12844r(sliceData.size(), f19);
                                        c28655q2.m87172p0(objM87133R);
                                    }
                                    c12844r = (C12844r) objM87133R;
                                    objM87133R2 = c28655q2.m87133R();
                                    if (objM87133R2 == c28676v0) {
                                        objM87133R2 = AbstractC28683x.m87272z(null);
                                        c28655q2.m87172p0(objM87133R2);
                                    }
                                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                                    if (c12847u4 == null) {
                                        numM35949r = null;
                                    } else {
                                        numM35949r = m35949r(interfaceC28601c1);
                                    }
                                    boolean zM87153g3 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                                    i36 = i15 & 3670016;
                                    Modifier modifier4 = modifier3;
                                    if (i36 == 1048576) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    z16 = zM87153g3 | z15;
                                    objM87133R3 = c28655q2.m87133R();
                                    if (z16 || objM87133R3 == c28676v0) {
                                        if (c12847u4 != null) {
                                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                                        } else {
                                            fM36081f = 1.0f;
                                        }
                                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                        c28655q2.m87172p0(objM87133R3);
                                    }
                                    list = (List) objM87133R3;
                                    objM87133R4 = c28655q2.m87133R();
                                    if (objM87133R4 == c28676v0) {
                                        objM87133R4 = AbstractC28683x.m87272z(list);
                                        c28655q2.m87172p0(objM87133R4);
                                    }
                                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                                    objM87133R5 = c28655q2.m87133R();
                                    if (objM87133R5 == c28676v0) {
                                        objM87133R5 = AbstractC28683x.m87272z(list);
                                        c28655q2.m87172p0(objM87133R5);
                                    }
                                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                                    objM87133R6 = c28655q2.m87133R();
                                    if (objM87133R6 == c28676v0) {
                                        objM87133R6 = AbstractC28683x.m87272z(null);
                                        c28655q2.m87172p0(objM87133R6);
                                    }
                                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                                    objM87133R7 = c28655q2.m87133R();
                                    if (objM87133R7 == c28676v0) {
                                        objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                        c28655q2.m87172p0(objM87133R7);
                                    }
                                    c11344e = (C11344e) objM87133R7;
                                    boolean zM87157i2 = c28655q2.m87157i(list);
                                    if (i36 == 1048576) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    zM87153g = zM87157i2 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                                    objM87133R8 = c28655q2.m87133R();
                                    if (!zM87153g || objM87133R8 == c28676v0) {
                                        c11344e2 = c11344e;
                                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                        c28655q2.m87172p0(objM87133R8);
                                    } else {
                                        c11344e2 = c11344e;
                                    }
                                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                                    objM87133R9 = c28655q2.m87133R();
                                    if (zM87153g2 || objM87133R9 == c28676v0) {
                                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                        c28655q2.m87172p0(objM87133R9);
                                    }
                                    function4 = (Function1) objM87133R9;
                                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                                    if (c12847u4 == null) {
                                        c2314t2 = c2314t;
                                        modifierM35931U = c2314t2;
                                    } else {
                                        c2314t2 = c2314t;
                                        modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                                    }
                                    Modifier modifierMo3471e = modifier4.mo3471e(modifierM35931U);
                                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                                    iHashCode = Long.hashCode(c28655q2.f115904T);
                                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
                                    InterfaceC0221l.f734a.getClass();
                                    c0213j = C0217k.f724b;
                                    c28655q2.m87158i0();
                                    float f35 = f17;
                                    if (c28655q2.f115903S) {
                                        c28655q2.m87163l(c0213j);
                                    } else {
                                        c28655q2.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                                    c0209i = C0217k.f732j;
                                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                                    }
                                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                                    Modifier modifierMo3401b = C1100b.f4583a.mo3401b(c2314t2);
                                    zM87157i = c28655q2.m87157i(c11344e2);
                                    objM87133R10 = c28655q2.m87133R();
                                    if (zM87157i || objM87133R10 == c28676v0) {
                                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                            @Override // c93.InterfaceC4339a
                                            public final Object invoke() {
                                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                            }
                                        };
                                        c28655q2.m87172p0(objM87133R10);
                                    }
                                    m35953v(modifierMo3401b, sliceData, f35, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                                    c28655q = c28655q2;
                                    InterfaceC4351m interfaceC4351m3 = interfaceC4351mM36052d;
                                    AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m3, c28655q, true);
                                    f25 = f35;
                                    f26 = f29;
                                    f28 = f34;
                                    modifier2 = modifier4;
                                    interfaceC4351m2 = interfaceC4351m3;
                                    f27 = f19;
                                    function2 = function3;
                                    c12847u3 = c12847u4;
                                } else {
                                    c28655q = c28655q2;
                                    c28655q.m87138X();
                                    modifier2 = modifier;
                                    function2 = function1;
                                    interfaceC4351m2 = interfaceC4351m;
                                    f25 = f17;
                                    f26 = f18;
                                    c12847u3 = c12847u2;
                                    f27 = f19;
                                    f28 = f24;
                                }
                                c28677v1M87180u = c28655q.m87180u();
                                if (c28677v1M87180u != null) {
                                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                        @Override // c93.InterfaceC4351m
                                        public final Object invoke(Object obj, Object obj2) {
                                            int iIntValue = ((Integer) obj2).intValue();
                                            return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                        }
                                    };
                                }
                            }
                            i15 |= 100663296;
                            if ((i15 & 38347923) != 38347922) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (c28655q2.m87135U(i15 & 1, z4)) {
                                c2314t = C2314t.f9131w;
                                if (i37 != 0) {
                                    modifier3 = c2314t;
                                } else {
                                    modifier3 = modifier;
                                }
                                if (i38 != 0) {
                                    f17 = 0.06f;
                                }
                                if (i16 != 0) {
                                    f29 = 0.13f;
                                } else {
                                    f29 = f18;
                                }
                                if (i18 != 0) {
                                    f19 = 1.0f;
                                }
                                if (i24 != 0) {
                                    f34 = 1.0f;
                                } else {
                                    f34 = f24;
                                }
                                if (i26 != 0) {
                                    c12847u4 = null;
                                } else {
                                    c12847u4 = c12847u2;
                                }
                                c28676v0 = C28635l.f115821a;
                                if (i28 != 0) {
                                    objM87133R11 = c28655q2.m87133R();
                                    if (objM87133R11 == c28676v0) {
                                        objM87133R11 = new C12824e(5);
                                        c28655q2.m87172p0(objM87133R11);
                                    }
                                    function3 = (Function1) objM87133R11;
                                } else {
                                    function3 = function1;
                                }
                                if (i34 != 0) {
                                    interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                                } else {
                                    interfaceC4351mM36052d = interfaceC4351m;
                                }
                                boolean zM87149e2 = c28655q2.m87149e(sliceData.size());
                                if ((i15 & 57344) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                z14 = zM87149e2 | z13;
                                objM87133R = c28655q2.m87133R();
                                if (z14) {
                                    objM87133R = new C12844r(sliceData.size(), f19);
                                    c28655q2.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new C12844r(sliceData.size(), f19);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                c12844r = (C12844r) objM87133R;
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = AbstractC28683x.m87272z(null);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                                if (c12847u4 == null) {
                                    numM35949r = null;
                                } else {
                                    numM35949r = m35949r(interfaceC28601c1);
                                }
                                boolean zM87153g4 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                                i36 = i15 & 3670016;
                                Modifier modifier5 = modifier3;
                                if (i36 == 1048576) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = zM87153g4 | z15;
                                objM87133R3 = c28655q2.m87133R();
                                if (z16) {
                                    if (c12847u4 != null) {
                                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                                    } else {
                                        fM36081f = 1.0f;
                                    }
                                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                    c28655q2.m87172p0(objM87133R3);
                                } else {
                                    if (c12847u4 != null) {
                                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                                    } else {
                                        fM36081f = 1.0f;
                                    }
                                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                list = (List) objM87133R3;
                                objM87133R4 = c28655q2.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = AbstractC28683x.m87272z(list);
                                    c28655q2.m87172p0(objM87133R4);
                                }
                                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                                objM87133R5 = c28655q2.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = AbstractC28683x.m87272z(list);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                                objM87133R6 = c28655q2.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = AbstractC28683x.m87272z(null);
                                    c28655q2.m87172p0(objM87133R6);
                                }
                                interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                                objM87133R7 = c28655q2.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                    c28655q2.m87172p0(objM87133R7);
                                }
                                c11344e = (C11344e) objM87133R7;
                                boolean zM87157i3 = c28655q2.m87157i(list);
                                if (i36 == 1048576) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                zM87153g = zM87157i3 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                                objM87133R8 = c28655q2.m87133R();
                                if (zM87153g) {
                                    c11344e2 = c11344e;
                                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                    c28655q2.m87172p0(objM87133R8);
                                } else {
                                    c11344e2 = c11344e;
                                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                    c28655q2.m87172p0(objM87133R8);
                                }
                                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                                zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                                objM87133R9 = c28655q2.m87133R();
                                if (zM87153g2) {
                                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                    c28655q2.m87172p0(objM87133R9);
                                } else {
                                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                    c28655q2.m87172p0(objM87133R9);
                                }
                                function4 = (Function1) objM87133R9;
                                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                                if (c12847u4 == null) {
                                    c2314t2 = c2314t;
                                    modifierM35931U = c2314t2;
                                } else {
                                    c2314t2 = c2314t;
                                    modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                                }
                                Modifier modifierMo3471e2 = modifier5.mo3471e(modifierM35931U);
                                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                                iHashCode = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e2);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q2.m87158i0();
                                float f36 = f17;
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                                c0209i = C0217k.f732j;
                                if (c28655q2.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                                Modifier modifierMo3401b2 = C1100b.f4583a.mo3401b(c2314t2);
                                zM87157i = c28655q2.m87157i(c11344e2);
                                objM87133R10 = c28655q2.m87133R();
                                if (zM87157i) {
                                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                        }
                                    };
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                        }
                                    };
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                m35953v(modifierMo3401b2, sliceData, f36, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                                c28655q = c28655q2;
                                InterfaceC4351m interfaceC4351m4 = interfaceC4351mM36052d;
                                AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m4, c28655q, true);
                                f25 = f36;
                                f26 = f29;
                                f28 = f34;
                                modifier2 = modifier5;
                                interfaceC4351m2 = interfaceC4351m4;
                                f27 = f19;
                                function2 = function3;
                                c12847u3 = c12847u4;
                            } else {
                                c28655q = c28655q2;
                                c28655q.m87138X();
                                modifier2 = modifier;
                                function2 = function1;
                                interfaceC4351m2 = interfaceC4351m;
                                f25 = f17;
                                f26 = f18;
                                c12847u3 = c12847u2;
                                f27 = f19;
                                f28 = f24;
                            }
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i15 |= 12582912;
                        i34 = i14 & 256;
                        if (i34 != 0) {
                            if ((i13 & 100663296) == 0) {
                                if (c28655q2.m87157i(interfaceC4351m)) {
                                    i35 = 67108864;
                                } else {
                                    i35 = AndroidSDKConstants.FLAG_MUTABLE;
                                }
                                i15 |= i35;
                            }
                            if ((i15 & 38347923) != 38347922) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (c28655q2.m87135U(i15 & 1, z4)) {
                                c2314t = C2314t.f9131w;
                                if (i37 != 0) {
                                    modifier3 = c2314t;
                                } else {
                                    modifier3 = modifier;
                                }
                                if (i38 != 0) {
                                    f17 = 0.06f;
                                }
                                if (i16 != 0) {
                                    f29 = 0.13f;
                                } else {
                                    f29 = f18;
                                }
                                if (i18 != 0) {
                                    f19 = 1.0f;
                                }
                                if (i24 != 0) {
                                    f34 = 1.0f;
                                } else {
                                    f34 = f24;
                                }
                                if (i26 != 0) {
                                    c12847u4 = null;
                                } else {
                                    c12847u4 = c12847u2;
                                }
                                c28676v0 = C28635l.f115821a;
                                if (i28 != 0) {
                                    objM87133R11 = c28655q2.m87133R();
                                    if (objM87133R11 == c28676v0) {
                                        objM87133R11 = new C12824e(5);
                                        c28655q2.m87172p0(objM87133R11);
                                    }
                                    function3 = (Function1) objM87133R11;
                                } else {
                                    function3 = function1;
                                }
                                if (i34 != 0) {
                                    interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                                } else {
                                    interfaceC4351mM36052d = interfaceC4351m;
                                }
                                boolean zM87149e3 = c28655q2.m87149e(sliceData.size());
                                if ((i15 & 57344) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                z14 = zM87149e3 | z13;
                                objM87133R = c28655q2.m87133R();
                                if (z14) {
                                    objM87133R = new C12844r(sliceData.size(), f19);
                                    c28655q2.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new C12844r(sliceData.size(), f19);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                c12844r = (C12844r) objM87133R;
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = AbstractC28683x.m87272z(null);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                                if (c12847u4 == null) {
                                    numM35949r = null;
                                } else {
                                    numM35949r = m35949r(interfaceC28601c1);
                                }
                                boolean zM87153g5 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                                i36 = i15 & 3670016;
                                Modifier modifier6 = modifier3;
                                if (i36 == 1048576) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = zM87153g5 | z15;
                                objM87133R3 = c28655q2.m87133R();
                                if (z16) {
                                    if (c12847u4 != null) {
                                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                                    } else {
                                        fM36081f = 1.0f;
                                    }
                                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                    c28655q2.m87172p0(objM87133R3);
                                } else {
                                    if (c12847u4 != null) {
                                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                                    } else {
                                        fM36081f = 1.0f;
                                    }
                                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                list = (List) objM87133R3;
                                objM87133R4 = c28655q2.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = AbstractC28683x.m87272z(list);
                                    c28655q2.m87172p0(objM87133R4);
                                }
                                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                                objM87133R5 = c28655q2.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = AbstractC28683x.m87272z(list);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                                objM87133R6 = c28655q2.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = AbstractC28683x.m87272z(null);
                                    c28655q2.m87172p0(objM87133R6);
                                }
                                interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                                objM87133R7 = c28655q2.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                    c28655q2.m87172p0(objM87133R7);
                                }
                                c11344e = (C11344e) objM87133R7;
                                boolean zM87157i4 = c28655q2.m87157i(list);
                                if (i36 == 1048576) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                zM87153g = zM87157i4 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                                objM87133R8 = c28655q2.m87133R();
                                if (zM87153g) {
                                    c11344e2 = c11344e;
                                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                    c28655q2.m87172p0(objM87133R8);
                                } else {
                                    c11344e2 = c11344e;
                                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                    c28655q2.m87172p0(objM87133R8);
                                }
                                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                                zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                                objM87133R9 = c28655q2.m87133R();
                                if (zM87153g2) {
                                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                    c28655q2.m87172p0(objM87133R9);
                                } else {
                                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                    c28655q2.m87172p0(objM87133R9);
                                }
                                function4 = (Function1) objM87133R9;
                                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                                if (c12847u4 == null) {
                                    c2314t2 = c2314t;
                                    modifierM35931U = c2314t2;
                                } else {
                                    c2314t2 = c2314t;
                                    modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                                }
                                Modifier modifierMo3471e3 = modifier6.mo3471e(modifierM35931U);
                                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                                iHashCode = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e3);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q2.m87158i0();
                                float f37 = f17;
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d3);
                                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                                c0209i = C0217k.f732j;
                                if (c28655q2.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                                Modifier modifierMo3401b3 = C1100b.f4583a.mo3401b(c2314t2);
                                zM87157i = c28655q2.m87157i(c11344e2);
                                objM87133R10 = c28655q2.m87133R();
                                if (zM87157i) {
                                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                        }
                                    };
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                        }
                                    };
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                m35953v(modifierMo3401b3, sliceData, f37, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                                c28655q = c28655q2;
                                InterfaceC4351m interfaceC4351m5 = interfaceC4351mM36052d;
                                AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m5, c28655q, true);
                                f25 = f37;
                                f26 = f29;
                                f28 = f34;
                                modifier2 = modifier6;
                                interfaceC4351m2 = interfaceC4351m5;
                                f27 = f19;
                                function2 = function3;
                                c12847u3 = c12847u4;
                            } else {
                                c28655q = c28655q2;
                                c28655q.m87138X();
                                modifier2 = modifier;
                                function2 = function1;
                                interfaceC4351m2 = interfaceC4351m;
                                f25 = f17;
                                f26 = f18;
                                c12847u3 = c12847u2;
                                f27 = f19;
                                f28 = f24;
                            }
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i15 |= 100663296;
                        if ((i15 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i37 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i38 != 0) {
                                f17 = 0.06f;
                            }
                            if (i16 != 0) {
                                f29 = 0.13f;
                            } else {
                                f29 = f18;
                            }
                            if (i18 != 0) {
                                f19 = 1.0f;
                            }
                            if (i24 != 0) {
                                f34 = 1.0f;
                            } else {
                                f34 = f24;
                            }
                            if (i26 != 0) {
                                c12847u4 = null;
                            } else {
                                c12847u4 = c12847u2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R11 = c28655q2.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C12824e(5);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                function3 = (Function1) objM87133R11;
                            } else {
                                function3 = function1;
                            }
                            if (i34 != 0) {
                                interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                            } else {
                                interfaceC4351mM36052d = interfaceC4351m;
                            }
                            boolean zM87149e4 = c28655q2.m87149e(sliceData.size());
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87149e4 | z13;
                            objM87133R = c28655q2.m87133R();
                            if (z14) {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c12844r = (C12844r) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            if (c12847u4 == null) {
                                numM35949r = null;
                            } else {
                                numM35949r = m35949r(interfaceC28601c1);
                            }
                            boolean zM87153g6 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                            i36 = i15 & 3670016;
                            Modifier modifier7 = modifier3;
                            if (i36 == 1048576) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87153g6 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (z16) {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            list = (List) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            c11344e = (C11344e) objM87133R7;
                            boolean zM87157i5 = c28655q2.m87157i(list);
                            if (i36 == 1048576) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87153g = zM87157i5 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87153g) {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                            zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            function4 = (Function1) objM87133R9;
                            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                            if (c12847u4 == null) {
                                c2314t2 = c2314t;
                                modifierM35931U = c2314t2;
                            } else {
                                c2314t2 = c2314t;
                                modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                            }
                            Modifier modifierMo3471e4 = modifier7.mo3471e(modifierM35931U);
                            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e4);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            float f38 = f17;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                            Modifier modifierMo3401b4 = C1100b.f4583a.mo3401b(c2314t2);
                            zM87157i = c28655q2.m87157i(c11344e2);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            }
                            m35953v(modifierMo3401b4, sliceData, f38, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                            c28655q = c28655q2;
                            InterfaceC4351m interfaceC4351m6 = interfaceC4351mM36052d;
                            AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m6, c28655q, true);
                            f25 = f38;
                            f26 = f29;
                            f28 = f34;
                            modifier2 = modifier7;
                            interfaceC4351m2 = interfaceC4351m6;
                            f27 = f19;
                            function2 = function3;
                            c12847u3 = c12847u4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            modifier2 = modifier;
                            function2 = function1;
                            interfaceC4351m2 = interfaceC4351m;
                            f25 = f17;
                            f26 = f18;
                            c12847u3 = c12847u2;
                            f27 = f19;
                            f28 = f24;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    f24 = f16;
                    i26 = i14 & 64;
                    if (i26 != 0) {
                        i15 |= 1572864;
                        c12847u2 = c12847u;
                    } else {
                        c12847u2 = c12847u;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q2.m87153g(c12847u2)) {
                                i27 = 1048576;
                            } else {
                                i27 = 524288;
                            }
                            i15 |= i27;
                        }
                    }
                    i28 = i14 & 128;
                    if (i28 != 0) {
                        if ((i13 & 12582912) == 0) {
                            if (c28655q2.m87157i(function1)) {
                                i29 = 8388608;
                            } else {
                                i29 = 4194304;
                            }
                            i15 |= i29;
                        }
                        i34 = i14 & 256;
                        if (i34 != 0) {
                            if ((i13 & 100663296) == 0) {
                                if (c28655q2.m87157i(interfaceC4351m)) {
                                    i35 = 67108864;
                                } else {
                                    i35 = AndroidSDKConstants.FLAG_MUTABLE;
                                }
                                i15 |= i35;
                            }
                            if ((i15 & 38347923) != 38347922) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (c28655q2.m87135U(i15 & 1, z4)) {
                                c2314t = C2314t.f9131w;
                                if (i37 != 0) {
                                    modifier3 = c2314t;
                                } else {
                                    modifier3 = modifier;
                                }
                                if (i38 != 0) {
                                    f17 = 0.06f;
                                }
                                if (i16 != 0) {
                                    f29 = 0.13f;
                                } else {
                                    f29 = f18;
                                }
                                if (i18 != 0) {
                                    f19 = 1.0f;
                                }
                                if (i24 != 0) {
                                    f34 = 1.0f;
                                } else {
                                    f34 = f24;
                                }
                                if (i26 != 0) {
                                    c12847u4 = null;
                                } else {
                                    c12847u4 = c12847u2;
                                }
                                c28676v0 = C28635l.f115821a;
                                if (i28 != 0) {
                                    objM87133R11 = c28655q2.m87133R();
                                    if (objM87133R11 == c28676v0) {
                                        objM87133R11 = new C12824e(5);
                                        c28655q2.m87172p0(objM87133R11);
                                    }
                                    function3 = (Function1) objM87133R11;
                                } else {
                                    function3 = function1;
                                }
                                if (i34 != 0) {
                                    interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                                } else {
                                    interfaceC4351mM36052d = interfaceC4351m;
                                }
                                boolean zM87149e5 = c28655q2.m87149e(sliceData.size());
                                if ((i15 & 57344) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                z14 = zM87149e5 | z13;
                                objM87133R = c28655q2.m87133R();
                                if (z14) {
                                    objM87133R = new C12844r(sliceData.size(), f19);
                                    c28655q2.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new C12844r(sliceData.size(), f19);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                c12844r = (C12844r) objM87133R;
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = AbstractC28683x.m87272z(null);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                                if (c12847u4 == null) {
                                    numM35949r = null;
                                } else {
                                    numM35949r = m35949r(interfaceC28601c1);
                                }
                                boolean zM87153g7 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                                i36 = i15 & 3670016;
                                Modifier modifier8 = modifier3;
                                if (i36 == 1048576) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = zM87153g7 | z15;
                                objM87133R3 = c28655q2.m87133R();
                                if (z16) {
                                    if (c12847u4 != null) {
                                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                                    } else {
                                        fM36081f = 1.0f;
                                    }
                                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                    c28655q2.m87172p0(objM87133R3);
                                } else {
                                    if (c12847u4 != null) {
                                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                                    } else {
                                        fM36081f = 1.0f;
                                    }
                                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                list = (List) objM87133R3;
                                objM87133R4 = c28655q2.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = AbstractC28683x.m87272z(list);
                                    c28655q2.m87172p0(objM87133R4);
                                }
                                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                                objM87133R5 = c28655q2.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = AbstractC28683x.m87272z(list);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                                objM87133R6 = c28655q2.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = AbstractC28683x.m87272z(null);
                                    c28655q2.m87172p0(objM87133R6);
                                }
                                interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                                objM87133R7 = c28655q2.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                    c28655q2.m87172p0(objM87133R7);
                                }
                                c11344e = (C11344e) objM87133R7;
                                boolean zM87157i6 = c28655q2.m87157i(list);
                                if (i36 == 1048576) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                zM87153g = zM87157i6 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                                objM87133R8 = c28655q2.m87133R();
                                if (zM87153g) {
                                    c11344e2 = c11344e;
                                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                    c28655q2.m87172p0(objM87133R8);
                                } else {
                                    c11344e2 = c11344e;
                                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                    c28655q2.m87172p0(objM87133R8);
                                }
                                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                                zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                                objM87133R9 = c28655q2.m87133R();
                                if (zM87153g2) {
                                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                    c28655q2.m87172p0(objM87133R9);
                                } else {
                                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                    c28655q2.m87172p0(objM87133R9);
                                }
                                function4 = (Function1) objM87133R9;
                                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                                if (c12847u4 == null) {
                                    c2314t2 = c2314t;
                                    modifierM35931U = c2314t2;
                                } else {
                                    c2314t2 = c2314t;
                                    modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                                }
                                Modifier modifierMo3471e5 = modifier8.mo3471e(modifierM35931U);
                                InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                                iHashCode = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e5);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q2.m87158i0();
                                float f39 = f17;
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d5);
                                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                                c0209i = C0217k.f732j;
                                if (c28655q2.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                                Modifier modifierMo3401b5 = C1100b.f4583a.mo3401b(c2314t2);
                                zM87157i = c28655q2.m87157i(c11344e2);
                                objM87133R10 = c28655q2.m87133R();
                                if (zM87157i) {
                                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                        }
                                    };
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                        }
                                    };
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                m35953v(modifierMo3401b5, sliceData, f39, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                                c28655q = c28655q2;
                                InterfaceC4351m interfaceC4351m7 = interfaceC4351mM36052d;
                                AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m7, c28655q, true);
                                f25 = f39;
                                f26 = f29;
                                f28 = f34;
                                modifier2 = modifier8;
                                interfaceC4351m2 = interfaceC4351m7;
                                f27 = f19;
                                function2 = function3;
                                c12847u3 = c12847u4;
                            } else {
                                c28655q = c28655q2;
                                c28655q.m87138X();
                                modifier2 = modifier;
                                function2 = function1;
                                interfaceC4351m2 = interfaceC4351m;
                                f25 = f17;
                                f26 = f18;
                                c12847u3 = c12847u2;
                                f27 = f19;
                                f28 = f24;
                            }
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i15 |= 100663296;
                        if ((i15 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i37 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i38 != 0) {
                                f17 = 0.06f;
                            }
                            if (i16 != 0) {
                                f29 = 0.13f;
                            } else {
                                f29 = f18;
                            }
                            if (i18 != 0) {
                                f19 = 1.0f;
                            }
                            if (i24 != 0) {
                                f34 = 1.0f;
                            } else {
                                f34 = f24;
                            }
                            if (i26 != 0) {
                                c12847u4 = null;
                            } else {
                                c12847u4 = c12847u2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R11 = c28655q2.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C12824e(5);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                function3 = (Function1) objM87133R11;
                            } else {
                                function3 = function1;
                            }
                            if (i34 != 0) {
                                interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                            } else {
                                interfaceC4351mM36052d = interfaceC4351m;
                            }
                            boolean zM87149e6 = c28655q2.m87149e(sliceData.size());
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87149e6 | z13;
                            objM87133R = c28655q2.m87133R();
                            if (z14) {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c12844r = (C12844r) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            if (c12847u4 == null) {
                                numM35949r = null;
                            } else {
                                numM35949r = m35949r(interfaceC28601c1);
                            }
                            boolean zM87153g8 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                            i36 = i15 & 3670016;
                            Modifier modifier9 = modifier3;
                            if (i36 == 1048576) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87153g8 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (z16) {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            list = (List) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            c11344e = (C11344e) objM87133R7;
                            boolean zM87157i7 = c28655q2.m87157i(list);
                            if (i36 == 1048576) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87153g = zM87157i7 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87153g) {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                            zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            function4 = (Function1) objM87133R9;
                            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                            if (c12847u4 == null) {
                                c2314t2 = c2314t;
                                modifierM35931U = c2314t2;
                            } else {
                                c2314t2 = c2314t;
                                modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                            }
                            Modifier modifierMo3471e6 = modifier9.mo3471e(modifierM35931U);
                            InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e6);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            float f310 = f17;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d6);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                            Modifier modifierMo3401b6 = C1100b.f4583a.mo3401b(c2314t2);
                            zM87157i = c28655q2.m87157i(c11344e2);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            }
                            m35953v(modifierMo3401b6, sliceData, f310, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                            c28655q = c28655q2;
                            InterfaceC4351m interfaceC4351m8 = interfaceC4351mM36052d;
                            AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m8, c28655q, true);
                            f25 = f310;
                            f26 = f29;
                            f28 = f34;
                            modifier2 = modifier9;
                            interfaceC4351m2 = interfaceC4351m8;
                            f27 = f19;
                            function2 = function3;
                            c12847u3 = c12847u4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            modifier2 = modifier;
                            function2 = function1;
                            interfaceC4351m2 = interfaceC4351m;
                            f25 = f17;
                            f26 = f18;
                            c12847u3 = c12847u2;
                            f27 = f19;
                            f28 = f24;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i15 |= 12582912;
                    i34 = i14 & 256;
                    if (i34 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87157i(interfaceC4351m)) {
                                i35 = 67108864;
                            } else {
                                i35 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i35;
                        }
                        if ((i15 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i37 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i38 != 0) {
                                f17 = 0.06f;
                            }
                            if (i16 != 0) {
                                f29 = 0.13f;
                            } else {
                                f29 = f18;
                            }
                            if (i18 != 0) {
                                f19 = 1.0f;
                            }
                            if (i24 != 0) {
                                f34 = 1.0f;
                            } else {
                                f34 = f24;
                            }
                            if (i26 != 0) {
                                c12847u4 = null;
                            } else {
                                c12847u4 = c12847u2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R11 = c28655q2.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C12824e(5);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                function3 = (Function1) objM87133R11;
                            } else {
                                function3 = function1;
                            }
                            if (i34 != 0) {
                                interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                            } else {
                                interfaceC4351mM36052d = interfaceC4351m;
                            }
                            boolean zM87149e7 = c28655q2.m87149e(sliceData.size());
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87149e7 | z13;
                            objM87133R = c28655q2.m87133R();
                            if (z14) {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c12844r = (C12844r) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            if (c12847u4 == null) {
                                numM35949r = null;
                            } else {
                                numM35949r = m35949r(interfaceC28601c1);
                            }
                            boolean zM87153g9 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                            i36 = i15 & 3670016;
                            Modifier modifier10 = modifier3;
                            if (i36 == 1048576) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87153g9 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (z16) {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            list = (List) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            c11344e = (C11344e) objM87133R7;
                            boolean zM87157i8 = c28655q2.m87157i(list);
                            if (i36 == 1048576) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87153g = zM87157i8 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87153g) {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                            zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            function4 = (Function1) objM87133R9;
                            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                            if (c12847u4 == null) {
                                c2314t2 = c2314t;
                                modifierM35931U = c2314t2;
                            } else {
                                c2314t2 = c2314t;
                                modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                            }
                            Modifier modifierMo3471e7 = modifier10.mo3471e(modifierM35931U);
                            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e7);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            float f311 = f17;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d7);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                            Modifier modifierMo3401b7 = C1100b.f4583a.mo3401b(c2314t2);
                            zM87157i = c28655q2.m87157i(c11344e2);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            }
                            m35953v(modifierMo3401b7, sliceData, f311, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                            c28655q = c28655q2;
                            InterfaceC4351m interfaceC4351m9 = interfaceC4351mM36052d;
                            AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m9, c28655q, true);
                            f25 = f311;
                            f26 = f29;
                            f28 = f34;
                            modifier2 = modifier10;
                            interfaceC4351m2 = interfaceC4351m9;
                            f27 = f19;
                            function2 = function3;
                            c12847u3 = c12847u4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            modifier2 = modifier;
                            function2 = function1;
                            interfaceC4351m2 = interfaceC4351m;
                            f25 = f17;
                            f26 = f18;
                            c12847u3 = c12847u2;
                            f27 = f19;
                            f28 = f24;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i15 |= 100663296;
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e8 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e8 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g10 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier11 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g10 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i9 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i9 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e8 = modifier11.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e8);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f312 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d8);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
                        Modifier modifierMo3401b8 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b8, sliceData, f312, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m10 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m10, c28655q, true);
                        f25 = f312;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier11;
                        interfaceC4351m2 = interfaceC4351m10;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 24576;
                f19 = f15;
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((196608 & i13) == 0) {
                        f24 = f16;
                        if (c28655q2.m87147d(f24)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 64;
                    if (i26 != 0) {
                        i15 |= 1572864;
                        c12847u2 = c12847u;
                    } else {
                        c12847u2 = c12847u;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q2.m87153g(c12847u2)) {
                                i27 = 1048576;
                            } else {
                                i27 = 524288;
                            }
                            i15 |= i27;
                        }
                    }
                    i28 = i14 & 128;
                    if (i28 != 0) {
                        if ((i13 & 12582912) == 0) {
                            if (c28655q2.m87157i(function1)) {
                                i29 = 8388608;
                            } else {
                                i29 = 4194304;
                            }
                            i15 |= i29;
                        }
                        i34 = i14 & 256;
                        if (i34 != 0) {
                            if ((i13 & 100663296) == 0) {
                                if (c28655q2.m87157i(interfaceC4351m)) {
                                    i35 = 67108864;
                                } else {
                                    i35 = AndroidSDKConstants.FLAG_MUTABLE;
                                }
                                i15 |= i35;
                            }
                            if ((i15 & 38347923) != 38347922) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (c28655q2.m87135U(i15 & 1, z4)) {
                                c2314t = C2314t.f9131w;
                                if (i37 != 0) {
                                    modifier3 = c2314t;
                                } else {
                                    modifier3 = modifier;
                                }
                                if (i38 != 0) {
                                    f17 = 0.06f;
                                }
                                if (i16 != 0) {
                                    f29 = 0.13f;
                                } else {
                                    f29 = f18;
                                }
                                if (i18 != 0) {
                                    f19 = 1.0f;
                                }
                                if (i24 != 0) {
                                    f34 = 1.0f;
                                } else {
                                    f34 = f24;
                                }
                                if (i26 != 0) {
                                    c12847u4 = null;
                                } else {
                                    c12847u4 = c12847u2;
                                }
                                c28676v0 = C28635l.f115821a;
                                if (i28 != 0) {
                                    objM87133R11 = c28655q2.m87133R();
                                    if (objM87133R11 == c28676v0) {
                                        objM87133R11 = new C12824e(5);
                                        c28655q2.m87172p0(objM87133R11);
                                    }
                                    function3 = (Function1) objM87133R11;
                                } else {
                                    function3 = function1;
                                }
                                if (i34 != 0) {
                                    interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                                } else {
                                    interfaceC4351mM36052d = interfaceC4351m;
                                }
                                boolean zM87149e9 = c28655q2.m87149e(sliceData.size());
                                if ((i15 & 57344) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                z14 = zM87149e9 | z13;
                                objM87133R = c28655q2.m87133R();
                                if (z14) {
                                    objM87133R = new C12844r(sliceData.size(), f19);
                                    c28655q2.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new C12844r(sliceData.size(), f19);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                c12844r = (C12844r) objM87133R;
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = AbstractC28683x.m87272z(null);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                                if (c12847u4 == null) {
                                    numM35949r = null;
                                } else {
                                    numM35949r = m35949r(interfaceC28601c1);
                                }
                                boolean zM87153g11 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                                i36 = i15 & 3670016;
                                Modifier modifier12 = modifier3;
                                if (i36 == 1048576) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = zM87153g11 | z15;
                                objM87133R3 = c28655q2.m87133R();
                                if (z16) {
                                    if (c12847u4 != null) {
                                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                                    } else {
                                        fM36081f = 1.0f;
                                    }
                                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                    c28655q2.m87172p0(objM87133R3);
                                } else {
                                    if (c12847u4 != null) {
                                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                                    } else {
                                        fM36081f = 1.0f;
                                    }
                                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                list = (List) objM87133R3;
                                objM87133R4 = c28655q2.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = AbstractC28683x.m87272z(list);
                                    c28655q2.m87172p0(objM87133R4);
                                }
                                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                                objM87133R5 = c28655q2.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = AbstractC28683x.m87272z(list);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                                objM87133R6 = c28655q2.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = AbstractC28683x.m87272z(null);
                                    c28655q2.m87172p0(objM87133R6);
                                }
                                interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                                objM87133R7 = c28655q2.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                    c28655q2.m87172p0(objM87133R7);
                                }
                                c11344e = (C11344e) objM87133R7;
                                boolean zM87157i10 = c28655q2.m87157i(list);
                                if (i36 == 1048576) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                zM87153g = zM87157i10 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                                objM87133R8 = c28655q2.m87133R();
                                if (zM87153g) {
                                    c11344e2 = c11344e;
                                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                    c28655q2.m87172p0(objM87133R8);
                                } else {
                                    c11344e2 = c11344e;
                                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                    c28655q2.m87172p0(objM87133R8);
                                }
                                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                                zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                                objM87133R9 = c28655q2.m87133R();
                                if (zM87153g2) {
                                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                    c28655q2.m87172p0(objM87133R9);
                                } else {
                                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                    c28655q2.m87172p0(objM87133R9);
                                }
                                function4 = (Function1) objM87133R9;
                                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                                if (c12847u4 == null) {
                                    c2314t2 = c2314t;
                                    modifierM35931U = c2314t2;
                                } else {
                                    c2314t2 = c2314t;
                                    modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                                }
                                Modifier modifierMo3471e9 = modifier12.mo3471e(modifierM35931U);
                                InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                                iHashCode = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e9);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q2.m87158i0();
                                float f313 = f17;
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d9);
                                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m9);
                                c0209i = C0217k.f732j;
                                if (c28655q2.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N9);
                                Modifier modifierMo3401b9 = C1100b.f4583a.mo3401b(c2314t2);
                                zM87157i = c28655q2.m87157i(c11344e2);
                                objM87133R10 = c28655q2.m87133R();
                                if (zM87157i) {
                                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                        }
                                    };
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                        }
                                    };
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                m35953v(modifierMo3401b9, sliceData, f313, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                                c28655q = c28655q2;
                                InterfaceC4351m interfaceC4351m11 = interfaceC4351mM36052d;
                                AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m11, c28655q, true);
                                f25 = f313;
                                f26 = f29;
                                f28 = f34;
                                modifier2 = modifier12;
                                interfaceC4351m2 = interfaceC4351m11;
                                f27 = f19;
                                function2 = function3;
                                c12847u3 = c12847u4;
                            } else {
                                c28655q = c28655q2;
                                c28655q.m87138X();
                                modifier2 = modifier;
                                function2 = function1;
                                interfaceC4351m2 = interfaceC4351m;
                                f25 = f17;
                                f26 = f18;
                                c12847u3 = c12847u2;
                                f27 = f19;
                                f28 = f24;
                            }
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i15 |= 100663296;
                        if ((i15 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i37 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i38 != 0) {
                                f17 = 0.06f;
                            }
                            if (i16 != 0) {
                                f29 = 0.13f;
                            } else {
                                f29 = f18;
                            }
                            if (i18 != 0) {
                                f19 = 1.0f;
                            }
                            if (i24 != 0) {
                                f34 = 1.0f;
                            } else {
                                f34 = f24;
                            }
                            if (i26 != 0) {
                                c12847u4 = null;
                            } else {
                                c12847u4 = c12847u2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R11 = c28655q2.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C12824e(5);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                function3 = (Function1) objM87133R11;
                            } else {
                                function3 = function1;
                            }
                            if (i34 != 0) {
                                interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                            } else {
                                interfaceC4351mM36052d = interfaceC4351m;
                            }
                            boolean zM87149e10 = c28655q2.m87149e(sliceData.size());
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87149e10 | z13;
                            objM87133R = c28655q2.m87133R();
                            if (z14) {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c12844r = (C12844r) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            if (c12847u4 == null) {
                                numM35949r = null;
                            } else {
                                numM35949r = m35949r(interfaceC28601c1);
                            }
                            boolean zM87153g12 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                            i36 = i15 & 3670016;
                            Modifier modifier13 = modifier3;
                            if (i36 == 1048576) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87153g12 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (z16) {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            list = (List) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            c11344e = (C11344e) objM87133R7;
                            boolean zM87157i11 = c28655q2.m87157i(list);
                            if (i36 == 1048576) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87153g = zM87157i11 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87153g) {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                            zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            function4 = (Function1) objM87133R9;
                            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                            if (c12847u4 == null) {
                                c2314t2 = c2314t;
                                modifierM35931U = c2314t2;
                            } else {
                                c2314t2 = c2314t;
                                modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                            }
                            Modifier modifierMo3471e10 = modifier13.mo3471e(modifierM35931U);
                            InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e10);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            float f314 = f17;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d10);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m10);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N10);
                            Modifier modifierMo3401b10 = C1100b.f4583a.mo3401b(c2314t2);
                            zM87157i = c28655q2.m87157i(c11344e2);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            }
                            m35953v(modifierMo3401b10, sliceData, f314, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                            c28655q = c28655q2;
                            InterfaceC4351m interfaceC4351m12 = interfaceC4351mM36052d;
                            AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m12, c28655q, true);
                            f25 = f314;
                            f26 = f29;
                            f28 = f34;
                            modifier2 = modifier13;
                            interfaceC4351m2 = interfaceC4351m12;
                            f27 = f19;
                            function2 = function3;
                            c12847u3 = c12847u4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            modifier2 = modifier;
                            function2 = function1;
                            interfaceC4351m2 = interfaceC4351m;
                            f25 = f17;
                            f26 = f18;
                            c12847u3 = c12847u2;
                            f27 = f19;
                            f28 = f24;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i15 |= 12582912;
                    i34 = i14 & 256;
                    if (i34 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87157i(interfaceC4351m)) {
                                i35 = 67108864;
                            } else {
                                i35 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i35;
                        }
                        if ((i15 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i37 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i38 != 0) {
                                f17 = 0.06f;
                            }
                            if (i16 != 0) {
                                f29 = 0.13f;
                            } else {
                                f29 = f18;
                            }
                            if (i18 != 0) {
                                f19 = 1.0f;
                            }
                            if (i24 != 0) {
                                f34 = 1.0f;
                            } else {
                                f34 = f24;
                            }
                            if (i26 != 0) {
                                c12847u4 = null;
                            } else {
                                c12847u4 = c12847u2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R11 = c28655q2.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C12824e(5);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                function3 = (Function1) objM87133R11;
                            } else {
                                function3 = function1;
                            }
                            if (i34 != 0) {
                                interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                            } else {
                                interfaceC4351mM36052d = interfaceC4351m;
                            }
                            boolean zM87149e11 = c28655q2.m87149e(sliceData.size());
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87149e11 | z13;
                            objM87133R = c28655q2.m87133R();
                            if (z14) {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c12844r = (C12844r) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            if (c12847u4 == null) {
                                numM35949r = null;
                            } else {
                                numM35949r = m35949r(interfaceC28601c1);
                            }
                            boolean zM87153g13 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                            i36 = i15 & 3670016;
                            Modifier modifier14 = modifier3;
                            if (i36 == 1048576) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87153g13 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (z16) {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            list = (List) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            c11344e = (C11344e) objM87133R7;
                            boolean zM87157i12 = c28655q2.m87157i(list);
                            if (i36 == 1048576) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87153g = zM87157i12 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87153g) {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                            zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            function4 = (Function1) objM87133R9;
                            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                            if (c12847u4 == null) {
                                c2314t2 = c2314t;
                                modifierM35931U = c2314t2;
                            } else {
                                c2314t2 = c2314t;
                                modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                            }
                            Modifier modifierMo3471e11 = modifier14.mo3471e(modifierM35931U);
                            InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e11);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            float f315 = f17;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d11);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11);
                            Modifier modifierMo3401b11 = C1100b.f4583a.mo3401b(c2314t2);
                            zM87157i = c28655q2.m87157i(c11344e2);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            }
                            m35953v(modifierMo3401b11, sliceData, f315, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                            c28655q = c28655q2;
                            InterfaceC4351m interfaceC4351m13 = interfaceC4351mM36052d;
                            AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m13, c28655q, true);
                            f25 = f315;
                            f26 = f29;
                            f28 = f34;
                            modifier2 = modifier14;
                            interfaceC4351m2 = interfaceC4351m13;
                            f27 = f19;
                            function2 = function3;
                            c12847u3 = c12847u4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            modifier2 = modifier;
                            function2 = function1;
                            interfaceC4351m2 = interfaceC4351m;
                            f25 = f17;
                            f26 = f18;
                            c12847u3 = c12847u2;
                            f27 = f19;
                            f28 = f24;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i15 |= 100663296;
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e12 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e12 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g14 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier15 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g14 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i13 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i13 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e12 = modifier15.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                        Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e12);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f316 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d12);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m12);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N12);
                        Modifier modifierMo3401b12 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b12, sliceData, f316, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m14 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m14, c28655q, true);
                        f25 = f316;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier15;
                        interfaceC4351m2 = interfaceC4351m14;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                f24 = f16;
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                    c12847u2 = c12847u;
                } else {
                    c12847u2 = c12847u;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87153g(c12847u2)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                }
                i28 = i14 & 128;
                if (i28 != 0) {
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87157i(function1)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i15 |= i29;
                    }
                    i34 = i14 & 256;
                    if (i34 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87157i(interfaceC4351m)) {
                                i35 = 67108864;
                            } else {
                                i35 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i35;
                        }
                        if ((i15 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i37 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i38 != 0) {
                                f17 = 0.06f;
                            }
                            if (i16 != 0) {
                                f29 = 0.13f;
                            } else {
                                f29 = f18;
                            }
                            if (i18 != 0) {
                                f19 = 1.0f;
                            }
                            if (i24 != 0) {
                                f34 = 1.0f;
                            } else {
                                f34 = f24;
                            }
                            if (i26 != 0) {
                                c12847u4 = null;
                            } else {
                                c12847u4 = c12847u2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R11 = c28655q2.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C12824e(5);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                function3 = (Function1) objM87133R11;
                            } else {
                                function3 = function1;
                            }
                            if (i34 != 0) {
                                interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                            } else {
                                interfaceC4351mM36052d = interfaceC4351m;
                            }
                            boolean zM87149e13 = c28655q2.m87149e(sliceData.size());
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87149e13 | z13;
                            objM87133R = c28655q2.m87133R();
                            if (z14) {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c12844r = (C12844r) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            if (c12847u4 == null) {
                                numM35949r = null;
                            } else {
                                numM35949r = m35949r(interfaceC28601c1);
                            }
                            boolean zM87153g15 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                            i36 = i15 & 3670016;
                            Modifier modifier16 = modifier3;
                            if (i36 == 1048576) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87153g15 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (z16) {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            list = (List) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            c11344e = (C11344e) objM87133R7;
                            boolean zM87157i14 = c28655q2.m87157i(list);
                            if (i36 == 1048576) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87153g = zM87157i14 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87153g) {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                            zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            function4 = (Function1) objM87133R9;
                            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                            if (c12847u4 == null) {
                                c2314t2 = c2314t;
                                modifierM35931U = c2314t2;
                            } else {
                                c2314t2 = c2314t;
                                modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                            }
                            Modifier modifierMo3471e13 = modifier16.mo3471e(modifierM35931U);
                            InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e13);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            float f317 = f17;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d13);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m13);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N13);
                            Modifier modifierMo3401b13 = C1100b.f4583a.mo3401b(c2314t2);
                            zM87157i = c28655q2.m87157i(c11344e2);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            }
                            m35953v(modifierMo3401b13, sliceData, f317, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                            c28655q = c28655q2;
                            InterfaceC4351m interfaceC4351m15 = interfaceC4351mM36052d;
                            AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m15, c28655q, true);
                            f25 = f317;
                            f26 = f29;
                            f28 = f34;
                            modifier2 = modifier16;
                            interfaceC4351m2 = interfaceC4351m15;
                            f27 = f19;
                            function2 = function3;
                            c12847u3 = c12847u4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            modifier2 = modifier;
                            function2 = function1;
                            interfaceC4351m2 = interfaceC4351m;
                            f25 = f17;
                            f26 = f18;
                            c12847u3 = c12847u2;
                            f27 = f19;
                            f28 = f24;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i15 |= 100663296;
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e14 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e14 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g16 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier17 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g16 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i15 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i15 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e14 = modifier17.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e14);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f318 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d14);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m14);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N14);
                        Modifier modifierMo3401b14 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b14, sliceData, f318, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m16 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m16, c28655q, true);
                        f25 = f318;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier17;
                        interfaceC4351m2 = interfaceC4351m16;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 12582912;
                i34 = i14 & 256;
                if (i34 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(interfaceC4351m)) {
                            i35 = 67108864;
                        } else {
                            i35 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i35;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e15 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e15 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g17 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier18 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g17 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i16 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i16 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e15 = modifier18.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e15);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f319 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d15);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m15);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N15);
                        Modifier modifierMo3401b15 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b15, sliceData, f319, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m17 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m17, c28655q, true);
                        f25 = f319;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier18;
                        interfaceC4351m2 = interfaceC4351m17;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 100663296;
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i38 != 0) {
                        f17 = 0.06f;
                    }
                    if (i16 != 0) {
                        f29 = 0.13f;
                    } else {
                        f29 = f18;
                    }
                    if (i18 != 0) {
                        f19 = 1.0f;
                    }
                    if (i24 != 0) {
                        f34 = 1.0f;
                    } else {
                        f34 = f24;
                    }
                    if (i26 != 0) {
                        c12847u4 = null;
                    } else {
                        c12847u4 = c12847u2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C12824e(5);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function3 = (Function1) objM87133R11;
                    } else {
                        function3 = function1;
                    }
                    if (i34 != 0) {
                        interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                    } else {
                        interfaceC4351mM36052d = interfaceC4351m;
                    }
                    boolean zM87149e16 = c28655q2.m87149e(sliceData.size());
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87149e16 | z13;
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c12844r = (C12844r) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (c12847u4 == null) {
                        numM35949r = null;
                    } else {
                        numM35949r = m35949r(interfaceC28601c1);
                    }
                    boolean zM87153g18 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                    i36 = i15 & 3670016;
                    Modifier modifier19 = modifier3;
                    if (i36 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87153g18 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    list = (List) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c11344e = (C11344e) objM87133R7;
                    boolean zM87157i17 = c28655q2.m87157i(list);
                    if (i36 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = zM87157i17 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    if (c12847u4 == null) {
                        c2314t2 = c2314t;
                        modifierM35931U = c2314t2;
                    } else {
                        c2314t2 = c2314t;
                        modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                    }
                    Modifier modifierMo3471e16 = modifier19.mo3471e(modifierM35931U);
                    InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e16);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    float f3110 = f17;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d16);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m16);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N16);
                    Modifier modifierMo3401b16 = C1100b.f4583a.mo3401b(c2314t2);
                    zM87157i = c28655q2.m87157i(c11344e2);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    }
                    m35953v(modifierMo3401b16, sliceData, f3110, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m18 = interfaceC4351mM36052d;
                    AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m18, c28655q, true);
                    f25 = f3110;
                    f26 = f29;
                    f28 = f34;
                    modifier2 = modifier19;
                    interfaceC4351m2 = interfaceC4351m18;
                    f27 = f19;
                    function2 = function3;
                    c12847u3 = c12847u4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    function2 = function1;
                    interfaceC4351m2 = interfaceC4351m;
                    f25 = f17;
                    f26 = f18;
                    c12847u3 = c12847u2;
                    f27 = f19;
                    f28 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 3072;
            f18 = f14;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    f19 = f15;
                    if (c28655q2.m87147d(f19)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((196608 & i13) == 0) {
                        f24 = f16;
                        if (c28655q2.m87147d(f24)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 64;
                    if (i26 != 0) {
                        i15 |= 1572864;
                        c12847u2 = c12847u;
                    } else {
                        c12847u2 = c12847u;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q2.m87153g(c12847u2)) {
                                i27 = 1048576;
                            } else {
                                i27 = 524288;
                            }
                            i15 |= i27;
                        }
                    }
                    i28 = i14 & 128;
                    if (i28 != 0) {
                        if ((i13 & 12582912) == 0) {
                            if (c28655q2.m87157i(function1)) {
                                i29 = 8388608;
                            } else {
                                i29 = 4194304;
                            }
                            i15 |= i29;
                        }
                        i34 = i14 & 256;
                        if (i34 != 0) {
                            if ((i13 & 100663296) == 0) {
                                if (c28655q2.m87157i(interfaceC4351m)) {
                                    i35 = 67108864;
                                } else {
                                    i35 = AndroidSDKConstants.FLAG_MUTABLE;
                                }
                                i15 |= i35;
                            }
                            if ((i15 & 38347923) != 38347922) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (c28655q2.m87135U(i15 & 1, z4)) {
                                c2314t = C2314t.f9131w;
                                if (i37 != 0) {
                                    modifier3 = c2314t;
                                } else {
                                    modifier3 = modifier;
                                }
                                if (i38 != 0) {
                                    f17 = 0.06f;
                                }
                                if (i16 != 0) {
                                    f29 = 0.13f;
                                } else {
                                    f29 = f18;
                                }
                                if (i18 != 0) {
                                    f19 = 1.0f;
                                }
                                if (i24 != 0) {
                                    f34 = 1.0f;
                                } else {
                                    f34 = f24;
                                }
                                if (i26 != 0) {
                                    c12847u4 = null;
                                } else {
                                    c12847u4 = c12847u2;
                                }
                                c28676v0 = C28635l.f115821a;
                                if (i28 != 0) {
                                    objM87133R11 = c28655q2.m87133R();
                                    if (objM87133R11 == c28676v0) {
                                        objM87133R11 = new C12824e(5);
                                        c28655q2.m87172p0(objM87133R11);
                                    }
                                    function3 = (Function1) objM87133R11;
                                } else {
                                    function3 = function1;
                                }
                                if (i34 != 0) {
                                    interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                                } else {
                                    interfaceC4351mM36052d = interfaceC4351m;
                                }
                                boolean zM87149e17 = c28655q2.m87149e(sliceData.size());
                                if ((i15 & 57344) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                z14 = zM87149e17 | z13;
                                objM87133R = c28655q2.m87133R();
                                if (z14) {
                                    objM87133R = new C12844r(sliceData.size(), f19);
                                    c28655q2.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new C12844r(sliceData.size(), f19);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                c12844r = (C12844r) objM87133R;
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = AbstractC28683x.m87272z(null);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                                if (c12847u4 == null) {
                                    numM35949r = null;
                                } else {
                                    numM35949r = m35949r(interfaceC28601c1);
                                }
                                boolean zM87153g19 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                                i36 = i15 & 3670016;
                                Modifier modifier110 = modifier3;
                                if (i36 == 1048576) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = zM87153g19 | z15;
                                objM87133R3 = c28655q2.m87133R();
                                if (z16) {
                                    if (c12847u4 != null) {
                                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                                    } else {
                                        fM36081f = 1.0f;
                                    }
                                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                    c28655q2.m87172p0(objM87133R3);
                                } else {
                                    if (c12847u4 != null) {
                                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                                    } else {
                                        fM36081f = 1.0f;
                                    }
                                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                list = (List) objM87133R3;
                                objM87133R4 = c28655q2.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = AbstractC28683x.m87272z(list);
                                    c28655q2.m87172p0(objM87133R4);
                                }
                                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                                objM87133R5 = c28655q2.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = AbstractC28683x.m87272z(list);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                                objM87133R6 = c28655q2.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = AbstractC28683x.m87272z(null);
                                    c28655q2.m87172p0(objM87133R6);
                                }
                                interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                                objM87133R7 = c28655q2.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                    c28655q2.m87172p0(objM87133R7);
                                }
                                c11344e = (C11344e) objM87133R7;
                                boolean zM87157i18 = c28655q2.m87157i(list);
                                if (i36 == 1048576) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                zM87153g = zM87157i18 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                                objM87133R8 = c28655q2.m87133R();
                                if (zM87153g) {
                                    c11344e2 = c11344e;
                                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                    c28655q2.m87172p0(objM87133R8);
                                } else {
                                    c11344e2 = c11344e;
                                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                    c28655q2.m87172p0(objM87133R8);
                                }
                                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                                zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                                objM87133R9 = c28655q2.m87133R();
                                if (zM87153g2) {
                                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                    c28655q2.m87172p0(objM87133R9);
                                } else {
                                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                    c28655q2.m87172p0(objM87133R9);
                                }
                                function4 = (Function1) objM87133R9;
                                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                                if (c12847u4 == null) {
                                    c2314t2 = c2314t;
                                    modifierM35931U = c2314t2;
                                } else {
                                    c2314t2 = c2314t;
                                    modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                                }
                                Modifier modifierMo3471e17 = modifier110.mo3471e(modifierM35931U);
                                InterfaceC39127r0 interfaceC39127r0M66763d17 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                                iHashCode = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                                Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e17);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q2.m87158i0();
                                float f3111 = f17;
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d17);
                                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m17);
                                c0209i = C0217k.f732j;
                                if (c28655q2.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N17);
                                Modifier modifierMo3401b17 = C1100b.f4583a.mo3401b(c2314t2);
                                zM87157i = c28655q2.m87157i(c11344e2);
                                objM87133R10 = c28655q2.m87133R();
                                if (zM87157i) {
                                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                        }
                                    };
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                        }
                                    };
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                m35953v(modifierMo3401b17, sliceData, f3111, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                                c28655q = c28655q2;
                                InterfaceC4351m interfaceC4351m19 = interfaceC4351mM36052d;
                                AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m19, c28655q, true);
                                f25 = f3111;
                                f26 = f29;
                                f28 = f34;
                                modifier2 = modifier110;
                                interfaceC4351m2 = interfaceC4351m19;
                                f27 = f19;
                                function2 = function3;
                                c12847u3 = c12847u4;
                            } else {
                                c28655q = c28655q2;
                                c28655q.m87138X();
                                modifier2 = modifier;
                                function2 = function1;
                                interfaceC4351m2 = interfaceC4351m;
                                f25 = f17;
                                f26 = f18;
                                c12847u3 = c12847u2;
                                f27 = f19;
                                f28 = f24;
                            }
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i15 |= 100663296;
                        if ((i15 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i37 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i38 != 0) {
                                f17 = 0.06f;
                            }
                            if (i16 != 0) {
                                f29 = 0.13f;
                            } else {
                                f29 = f18;
                            }
                            if (i18 != 0) {
                                f19 = 1.0f;
                            }
                            if (i24 != 0) {
                                f34 = 1.0f;
                            } else {
                                f34 = f24;
                            }
                            if (i26 != 0) {
                                c12847u4 = null;
                            } else {
                                c12847u4 = c12847u2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R11 = c28655q2.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C12824e(5);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                function3 = (Function1) objM87133R11;
                            } else {
                                function3 = function1;
                            }
                            if (i34 != 0) {
                                interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                            } else {
                                interfaceC4351mM36052d = interfaceC4351m;
                            }
                            boolean zM87149e18 = c28655q2.m87149e(sliceData.size());
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87149e18 | z13;
                            objM87133R = c28655q2.m87133R();
                            if (z14) {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c12844r = (C12844r) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            if (c12847u4 == null) {
                                numM35949r = null;
                            } else {
                                numM35949r = m35949r(interfaceC28601c1);
                            }
                            boolean zM87153g110 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                            i36 = i15 & 3670016;
                            Modifier modifier111 = modifier3;
                            if (i36 == 1048576) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87153g110 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (z16) {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            list = (List) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            c11344e = (C11344e) objM87133R7;
                            boolean zM87157i19 = c28655q2.m87157i(list);
                            if (i36 == 1048576) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87153g = zM87157i19 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87153g) {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                            zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            function4 = (Function1) objM87133R9;
                            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                            if (c12847u4 == null) {
                                c2314t2 = c2314t;
                                modifierM35931U = c2314t2;
                            } else {
                                c2314t2 = c2314t;
                                modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                            }
                            Modifier modifierMo3471e18 = modifier111.mo3471e(modifierM35931U);
                            InterfaceC39127r0 interfaceC39127r0M66763d18 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                            Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e18);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            float f3112 = f17;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d18);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m18);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N18);
                            Modifier modifierMo3401b18 = C1100b.f4583a.mo3401b(c2314t2);
                            zM87157i = c28655q2.m87157i(c11344e2);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            }
                            m35953v(modifierMo3401b18, sliceData, f3112, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                            c28655q = c28655q2;
                            InterfaceC4351m interfaceC4351m110 = interfaceC4351mM36052d;
                            AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m110, c28655q, true);
                            f25 = f3112;
                            f26 = f29;
                            f28 = f34;
                            modifier2 = modifier111;
                            interfaceC4351m2 = interfaceC4351m110;
                            f27 = f19;
                            function2 = function3;
                            c12847u3 = c12847u4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            modifier2 = modifier;
                            function2 = function1;
                            interfaceC4351m2 = interfaceC4351m;
                            f25 = f17;
                            f26 = f18;
                            c12847u3 = c12847u2;
                            f27 = f19;
                            f28 = f24;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i15 |= 12582912;
                    i34 = i14 & 256;
                    if (i34 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87157i(interfaceC4351m)) {
                                i35 = 67108864;
                            } else {
                                i35 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i35;
                        }
                        if ((i15 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i37 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i38 != 0) {
                                f17 = 0.06f;
                            }
                            if (i16 != 0) {
                                f29 = 0.13f;
                            } else {
                                f29 = f18;
                            }
                            if (i18 != 0) {
                                f19 = 1.0f;
                            }
                            if (i24 != 0) {
                                f34 = 1.0f;
                            } else {
                                f34 = f24;
                            }
                            if (i26 != 0) {
                                c12847u4 = null;
                            } else {
                                c12847u4 = c12847u2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R11 = c28655q2.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C12824e(5);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                function3 = (Function1) objM87133R11;
                            } else {
                                function3 = function1;
                            }
                            if (i34 != 0) {
                                interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                            } else {
                                interfaceC4351mM36052d = interfaceC4351m;
                            }
                            boolean zM87149e19 = c28655q2.m87149e(sliceData.size());
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87149e19 | z13;
                            objM87133R = c28655q2.m87133R();
                            if (z14) {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c12844r = (C12844r) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            if (c12847u4 == null) {
                                numM35949r = null;
                            } else {
                                numM35949r = m35949r(interfaceC28601c1);
                            }
                            boolean zM87153g111 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                            i36 = i15 & 3670016;
                            Modifier modifier112 = modifier3;
                            if (i36 == 1048576) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87153g111 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (z16) {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            list = (List) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            c11344e = (C11344e) objM87133R7;
                            boolean zM87157i110 = c28655q2.m87157i(list);
                            if (i36 == 1048576) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87153g = zM87157i110 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87153g) {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                            zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            function4 = (Function1) objM87133R9;
                            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                            if (c12847u4 == null) {
                                c2314t2 = c2314t;
                                modifierM35931U = c2314t2;
                            } else {
                                c2314t2 = c2314t;
                                modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                            }
                            Modifier modifierMo3471e19 = modifier112.mo3471e(modifierM35931U);
                            InterfaceC39127r0 interfaceC39127r0M66763d19 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                            Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e19);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            float f3113 = f17;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d19);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m19);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N19);
                            Modifier modifierMo3401b19 = C1100b.f4583a.mo3401b(c2314t2);
                            zM87157i = c28655q2.m87157i(c11344e2);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            }
                            m35953v(modifierMo3401b19, sliceData, f3113, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                            c28655q = c28655q2;
                            InterfaceC4351m interfaceC4351m111 = interfaceC4351mM36052d;
                            AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m111, c28655q, true);
                            f25 = f3113;
                            f26 = f29;
                            f28 = f34;
                            modifier2 = modifier112;
                            interfaceC4351m2 = interfaceC4351m111;
                            f27 = f19;
                            function2 = function3;
                            c12847u3 = c12847u4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            modifier2 = modifier;
                            function2 = function1;
                            interfaceC4351m2 = interfaceC4351m;
                            f25 = f17;
                            f26 = f18;
                            c12847u3 = c12847u2;
                            f27 = f19;
                            f28 = f24;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i15 |= 100663296;
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e110 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e110 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g112 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier113 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g112 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i111 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i111 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e110 = modifier113.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d110 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e110);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f3114 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d110);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m110);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N110);
                        Modifier modifierMo3401b110 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b110, sliceData, f3114, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m112 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m112, c28655q, true);
                        f25 = f3114;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier113;
                        interfaceC4351m2 = interfaceC4351m112;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                f24 = f16;
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                    c12847u2 = c12847u;
                } else {
                    c12847u2 = c12847u;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87153g(c12847u2)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                }
                i28 = i14 & 128;
                if (i28 != 0) {
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87157i(function1)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i15 |= i29;
                    }
                    i34 = i14 & 256;
                    if (i34 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87157i(interfaceC4351m)) {
                                i35 = 67108864;
                            } else {
                                i35 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i35;
                        }
                        if ((i15 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i37 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i38 != 0) {
                                f17 = 0.06f;
                            }
                            if (i16 != 0) {
                                f29 = 0.13f;
                            } else {
                                f29 = f18;
                            }
                            if (i18 != 0) {
                                f19 = 1.0f;
                            }
                            if (i24 != 0) {
                                f34 = 1.0f;
                            } else {
                                f34 = f24;
                            }
                            if (i26 != 0) {
                                c12847u4 = null;
                            } else {
                                c12847u4 = c12847u2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R11 = c28655q2.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C12824e(5);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                function3 = (Function1) objM87133R11;
                            } else {
                                function3 = function1;
                            }
                            if (i34 != 0) {
                                interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                            } else {
                                interfaceC4351mM36052d = interfaceC4351m;
                            }
                            boolean zM87149e111 = c28655q2.m87149e(sliceData.size());
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87149e111 | z13;
                            objM87133R = c28655q2.m87133R();
                            if (z14) {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c12844r = (C12844r) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            if (c12847u4 == null) {
                                numM35949r = null;
                            } else {
                                numM35949r = m35949r(interfaceC28601c1);
                            }
                            boolean zM87153g113 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                            i36 = i15 & 3670016;
                            Modifier modifier114 = modifier3;
                            if (i36 == 1048576) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87153g113 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (z16) {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            list = (List) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            c11344e = (C11344e) objM87133R7;
                            boolean zM87157i112 = c28655q2.m87157i(list);
                            if (i36 == 1048576) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87153g = zM87157i112 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87153g) {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                            zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            function4 = (Function1) objM87133R9;
                            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                            if (c12847u4 == null) {
                                c2314t2 = c2314t;
                                modifierM35931U = c2314t2;
                            } else {
                                c2314t2 = c2314t;
                                modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                            }
                            Modifier modifierMo3471e111 = modifier114.mo3471e(modifierM35931U);
                            InterfaceC39127r0 interfaceC39127r0M66763d111 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                            Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e111);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            float f3115 = f17;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d111);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m111);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N111);
                            Modifier modifierMo3401b111 = C1100b.f4583a.mo3401b(c2314t2);
                            zM87157i = c28655q2.m87157i(c11344e2);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            }
                            m35953v(modifierMo3401b111, sliceData, f3115, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                            c28655q = c28655q2;
                            InterfaceC4351m interfaceC4351m113 = interfaceC4351mM36052d;
                            AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m113, c28655q, true);
                            f25 = f3115;
                            f26 = f29;
                            f28 = f34;
                            modifier2 = modifier114;
                            interfaceC4351m2 = interfaceC4351m113;
                            f27 = f19;
                            function2 = function3;
                            c12847u3 = c12847u4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            modifier2 = modifier;
                            function2 = function1;
                            interfaceC4351m2 = interfaceC4351m;
                            f25 = f17;
                            f26 = f18;
                            c12847u3 = c12847u2;
                            f27 = f19;
                            f28 = f24;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i15 |= 100663296;
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e112 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e112 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g114 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier115 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g114 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i113 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i113 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e112 = modifier115.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d112 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
                        Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e112);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f3116 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d112);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m112);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N112);
                        Modifier modifierMo3401b112 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b112, sliceData, f3116, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m114 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m114, c28655q, true);
                        f25 = f3116;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier115;
                        interfaceC4351m2 = interfaceC4351m114;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 12582912;
                i34 = i14 & 256;
                if (i34 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(interfaceC4351m)) {
                            i35 = 67108864;
                        } else {
                            i35 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i35;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e113 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e113 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g115 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier116 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g115 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i114 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i114 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e113 = modifier116.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d113 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
                        Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e113);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f3117 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d113);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m113);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N113);
                        Modifier modifierMo3401b113 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b113, sliceData, f3117, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m115 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m115, c28655q, true);
                        f25 = f3117;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier116;
                        interfaceC4351m2 = interfaceC4351m115;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 100663296;
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i38 != 0) {
                        f17 = 0.06f;
                    }
                    if (i16 != 0) {
                        f29 = 0.13f;
                    } else {
                        f29 = f18;
                    }
                    if (i18 != 0) {
                        f19 = 1.0f;
                    }
                    if (i24 != 0) {
                        f34 = 1.0f;
                    } else {
                        f34 = f24;
                    }
                    if (i26 != 0) {
                        c12847u4 = null;
                    } else {
                        c12847u4 = c12847u2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C12824e(5);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function3 = (Function1) objM87133R11;
                    } else {
                        function3 = function1;
                    }
                    if (i34 != 0) {
                        interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                    } else {
                        interfaceC4351mM36052d = interfaceC4351m;
                    }
                    boolean zM87149e114 = c28655q2.m87149e(sliceData.size());
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87149e114 | z13;
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c12844r = (C12844r) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (c12847u4 == null) {
                        numM35949r = null;
                    } else {
                        numM35949r = m35949r(interfaceC28601c1);
                    }
                    boolean zM87153g116 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                    i36 = i15 & 3670016;
                    Modifier modifier117 = modifier3;
                    if (i36 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87153g116 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    list = (List) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c11344e = (C11344e) objM87133R7;
                    boolean zM87157i115 = c28655q2.m87157i(list);
                    if (i36 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = zM87157i115 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    if (c12847u4 == null) {
                        c2314t2 = c2314t;
                        modifierM35931U = c2314t2;
                    } else {
                        c2314t2 = c2314t;
                        modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                    }
                    Modifier modifierMo3471e114 = modifier117.mo3471e(modifierM35931U);
                    InterfaceC39127r0 interfaceC39127r0M66763d114 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q2.m87165m();
                    Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e114);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    float f3118 = f17;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d114);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m114);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N114);
                    Modifier modifierMo3401b114 = C1100b.f4583a.mo3401b(c2314t2);
                    zM87157i = c28655q2.m87157i(c11344e2);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    }
                    m35953v(modifierMo3401b114, sliceData, f3118, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m116 = interfaceC4351mM36052d;
                    AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m116, c28655q, true);
                    f25 = f3118;
                    f26 = f29;
                    f28 = f34;
                    modifier2 = modifier117;
                    interfaceC4351m2 = interfaceC4351m116;
                    f27 = f19;
                    function2 = function3;
                    c12847u3 = c12847u4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    function2 = function1;
                    interfaceC4351m2 = interfaceC4351m;
                    f25 = f17;
                    f26 = f18;
                    c12847u3 = c12847u2;
                    f27 = f19;
                    f28 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 24576;
            f19 = f15;
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    f24 = f16;
                    if (c28655q2.m87147d(f24)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                    c12847u2 = c12847u;
                } else {
                    c12847u2 = c12847u;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87153g(c12847u2)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                }
                i28 = i14 & 128;
                if (i28 != 0) {
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87157i(function1)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i15 |= i29;
                    }
                    i34 = i14 & 256;
                    if (i34 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87157i(interfaceC4351m)) {
                                i35 = 67108864;
                            } else {
                                i35 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i35;
                        }
                        if ((i15 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i37 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i38 != 0) {
                                f17 = 0.06f;
                            }
                            if (i16 != 0) {
                                f29 = 0.13f;
                            } else {
                                f29 = f18;
                            }
                            if (i18 != 0) {
                                f19 = 1.0f;
                            }
                            if (i24 != 0) {
                                f34 = 1.0f;
                            } else {
                                f34 = f24;
                            }
                            if (i26 != 0) {
                                c12847u4 = null;
                            } else {
                                c12847u4 = c12847u2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R11 = c28655q2.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C12824e(5);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                function3 = (Function1) objM87133R11;
                            } else {
                                function3 = function1;
                            }
                            if (i34 != 0) {
                                interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                            } else {
                                interfaceC4351mM36052d = interfaceC4351m;
                            }
                            boolean zM87149e115 = c28655q2.m87149e(sliceData.size());
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87149e115 | z13;
                            objM87133R = c28655q2.m87133R();
                            if (z14) {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c12844r = (C12844r) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            if (c12847u4 == null) {
                                numM35949r = null;
                            } else {
                                numM35949r = m35949r(interfaceC28601c1);
                            }
                            boolean zM87153g117 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                            i36 = i15 & 3670016;
                            Modifier modifier118 = modifier3;
                            if (i36 == 1048576) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87153g117 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (z16) {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            list = (List) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            c11344e = (C11344e) objM87133R7;
                            boolean zM87157i116 = c28655q2.m87157i(list);
                            if (i36 == 1048576) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87153g = zM87157i116 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87153g) {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                            zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            function4 = (Function1) objM87133R9;
                            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                            if (c12847u4 == null) {
                                c2314t2 = c2314t;
                                modifierM35931U = c2314t2;
                            } else {
                                c2314t2 = c2314t;
                                modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                            }
                            Modifier modifierMo3471e115 = modifier118.mo3471e(modifierM35931U);
                            InterfaceC39127r0 interfaceC39127r0M66763d115 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q2.m87165m();
                            Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e115);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            float f3119 = f17;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d115);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m115);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N115);
                            Modifier modifierMo3401b115 = C1100b.f4583a.mo3401b(c2314t2);
                            zM87157i = c28655q2.m87157i(c11344e2);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            }
                            m35953v(modifierMo3401b115, sliceData, f3119, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                            c28655q = c28655q2;
                            InterfaceC4351m interfaceC4351m117 = interfaceC4351mM36052d;
                            AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m117, c28655q, true);
                            f25 = f3119;
                            f26 = f29;
                            f28 = f34;
                            modifier2 = modifier118;
                            interfaceC4351m2 = interfaceC4351m117;
                            f27 = f19;
                            function2 = function3;
                            c12847u3 = c12847u4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            modifier2 = modifier;
                            function2 = function1;
                            interfaceC4351m2 = interfaceC4351m;
                            f25 = f17;
                            f26 = f18;
                            c12847u3 = c12847u2;
                            f27 = f19;
                            f28 = f24;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i15 |= 100663296;
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e116 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e116 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g118 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier119 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g118 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i117 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i117 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e116 = modifier119.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d116 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q2.m87165m();
                        Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e116);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f31110 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d116);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m116);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N116);
                        Modifier modifierMo3401b116 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b116, sliceData, f31110, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m118 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m118, c28655q, true);
                        f25 = f31110;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier119;
                        interfaceC4351m2 = interfaceC4351m118;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 12582912;
                i34 = i14 & 256;
                if (i34 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(interfaceC4351m)) {
                            i35 = 67108864;
                        } else {
                            i35 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i35;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e117 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e117 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g119 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier1110 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g119 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i118 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i118 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e117 = modifier1110.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d117 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q2.m87165m();
                        Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e117);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f31111 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d117);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m117);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N117);
                        Modifier modifierMo3401b117 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b117, sliceData, f31111, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m119 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m119, c28655q, true);
                        f25 = f31111;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier1110;
                        interfaceC4351m2 = interfaceC4351m119;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 100663296;
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i38 != 0) {
                        f17 = 0.06f;
                    }
                    if (i16 != 0) {
                        f29 = 0.13f;
                    } else {
                        f29 = f18;
                    }
                    if (i18 != 0) {
                        f19 = 1.0f;
                    }
                    if (i24 != 0) {
                        f34 = 1.0f;
                    } else {
                        f34 = f24;
                    }
                    if (i26 != 0) {
                        c12847u4 = null;
                    } else {
                        c12847u4 = c12847u2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C12824e(5);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function3 = (Function1) objM87133R11;
                    } else {
                        function3 = function1;
                    }
                    if (i34 != 0) {
                        interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                    } else {
                        interfaceC4351mM36052d = interfaceC4351m;
                    }
                    boolean zM87149e118 = c28655q2.m87149e(sliceData.size());
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87149e118 | z13;
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c12844r = (C12844r) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (c12847u4 == null) {
                        numM35949r = null;
                    } else {
                        numM35949r = m35949r(interfaceC28601c1);
                    }
                    boolean zM87153g1110 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                    i36 = i15 & 3670016;
                    Modifier modifier1111 = modifier3;
                    if (i36 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87153g1110 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    list = (List) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c11344e = (C11344e) objM87133R7;
                    boolean zM87157i119 = c28655q2.m87157i(list);
                    if (i36 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = zM87157i119 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    if (c12847u4 == null) {
                        c2314t2 = c2314t;
                        modifierM35931U = c2314t2;
                    } else {
                        c2314t2 = c2314t;
                        modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                    }
                    Modifier modifierMo3471e118 = modifier1111.mo3471e(modifierM35931U);
                    InterfaceC39127r0 interfaceC39127r0M66763d118 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q2.m87165m();
                    Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e118);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    float f31112 = f17;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d118);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m118);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N118);
                    Modifier modifierMo3401b118 = C1100b.f4583a.mo3401b(c2314t2);
                    zM87157i = c28655q2.m87157i(c11344e2);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    }
                    m35953v(modifierMo3401b118, sliceData, f31112, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m1110 = interfaceC4351mM36052d;
                    AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1110, c28655q, true);
                    f25 = f31112;
                    f26 = f29;
                    f28 = f34;
                    modifier2 = modifier1111;
                    interfaceC4351m2 = interfaceC4351m1110;
                    f27 = f19;
                    function2 = function3;
                    c12847u3 = c12847u4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    function2 = function1;
                    interfaceC4351m2 = interfaceC4351m;
                    f25 = f17;
                    f26 = f18;
                    c12847u3 = c12847u2;
                    f27 = f19;
                    f28 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            f24 = f16;
            i26 = i14 & 64;
            if (i26 != 0) {
                i15 |= 1572864;
                c12847u2 = c12847u;
            } else {
                c12847u2 = c12847u;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87153g(c12847u2)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
            }
            i28 = i14 & 128;
            if (i28 != 0) {
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 256;
                if (i34 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(interfaceC4351m)) {
                            i35 = 67108864;
                        } else {
                            i35 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i35;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e119 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e119 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g1111 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier1112 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g1111 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i1110 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i1110 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e119 = modifier1112.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d119 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q2.m87165m();
                        Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e119);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f31113 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d119);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m119);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N119);
                        Modifier modifierMo3401b119 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b119, sliceData, f31113, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m1111 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1111, c28655q, true);
                        f25 = f31113;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier1112;
                        interfaceC4351m2 = interfaceC4351m1111;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 100663296;
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i38 != 0) {
                        f17 = 0.06f;
                    }
                    if (i16 != 0) {
                        f29 = 0.13f;
                    } else {
                        f29 = f18;
                    }
                    if (i18 != 0) {
                        f19 = 1.0f;
                    }
                    if (i24 != 0) {
                        f34 = 1.0f;
                    } else {
                        f34 = f24;
                    }
                    if (i26 != 0) {
                        c12847u4 = null;
                    } else {
                        c12847u4 = c12847u2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C12824e(5);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function3 = (Function1) objM87133R11;
                    } else {
                        function3 = function1;
                    }
                    if (i34 != 0) {
                        interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                    } else {
                        interfaceC4351mM36052d = interfaceC4351m;
                    }
                    boolean zM87149e1110 = c28655q2.m87149e(sliceData.size());
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87149e1110 | z13;
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c12844r = (C12844r) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (c12847u4 == null) {
                        numM35949r = null;
                    } else {
                        numM35949r = m35949r(interfaceC28601c1);
                    }
                    boolean zM87153g1112 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                    i36 = i15 & 3670016;
                    Modifier modifier1113 = modifier3;
                    if (i36 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87153g1112 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    list = (List) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c11344e = (C11344e) objM87133R7;
                    boolean zM87157i1111 = c28655q2.m87157i(list);
                    if (i36 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = zM87157i1111 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    if (c12847u4 == null) {
                        c2314t2 = c2314t;
                        modifierM35931U = c2314t2;
                    } else {
                        c2314t2 = c2314t;
                        modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                    }
                    Modifier modifierMo3471e1110 = modifier1113.mo3471e(modifierM35931U);
                    InterfaceC39127r0 interfaceC39127r0M66763d1110 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q2.m87165m();
                    Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e1110);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    float f31114 = f17;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1110);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1110);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1110);
                    Modifier modifierMo3401b1110 = C1100b.f4583a.mo3401b(c2314t2);
                    zM87157i = c28655q2.m87157i(c11344e2);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    }
                    m35953v(modifierMo3401b1110, sliceData, f31114, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m1112 = interfaceC4351mM36052d;
                    AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1112, c28655q, true);
                    f25 = f31114;
                    f26 = f29;
                    f28 = f34;
                    modifier2 = modifier1113;
                    interfaceC4351m2 = interfaceC4351m1112;
                    f27 = f19;
                    function2 = function3;
                    c12847u3 = c12847u4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    function2 = function1;
                    interfaceC4351m2 = interfaceC4351m;
                    f25 = f17;
                    f26 = f18;
                    c12847u3 = c12847u2;
                    f27 = f19;
                    f28 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 12582912;
            i34 = i14 & 256;
            if (i34 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(interfaceC4351m)) {
                        i35 = 67108864;
                    } else {
                        i35 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i35;
                }
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i38 != 0) {
                        f17 = 0.06f;
                    }
                    if (i16 != 0) {
                        f29 = 0.13f;
                    } else {
                        f29 = f18;
                    }
                    if (i18 != 0) {
                        f19 = 1.0f;
                    }
                    if (i24 != 0) {
                        f34 = 1.0f;
                    } else {
                        f34 = f24;
                    }
                    if (i26 != 0) {
                        c12847u4 = null;
                    } else {
                        c12847u4 = c12847u2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C12824e(5);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function3 = (Function1) objM87133R11;
                    } else {
                        function3 = function1;
                    }
                    if (i34 != 0) {
                        interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                    } else {
                        interfaceC4351mM36052d = interfaceC4351m;
                    }
                    boolean zM87149e1111 = c28655q2.m87149e(sliceData.size());
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87149e1111 | z13;
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c12844r = (C12844r) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (c12847u4 == null) {
                        numM35949r = null;
                    } else {
                        numM35949r = m35949r(interfaceC28601c1);
                    }
                    boolean zM87153g1113 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                    i36 = i15 & 3670016;
                    Modifier modifier1114 = modifier3;
                    if (i36 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87153g1113 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    list = (List) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c11344e = (C11344e) objM87133R7;
                    boolean zM87157i1112 = c28655q2.m87157i(list);
                    if (i36 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = zM87157i1112 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    if (c12847u4 == null) {
                        c2314t2 = c2314t;
                        modifierM35931U = c2314t2;
                    } else {
                        c2314t2 = c2314t;
                        modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                    }
                    Modifier modifierMo3471e1111 = modifier1114.mo3471e(modifierM35931U);
                    InterfaceC39127r0 interfaceC39127r0M66763d1111 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q2.m87165m();
                    Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e1111);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    float f31115 = f17;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1111);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1111);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1111);
                    Modifier modifierMo3401b1111 = C1100b.f4583a.mo3401b(c2314t2);
                    zM87157i = c28655q2.m87157i(c11344e2);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    }
                    m35953v(modifierMo3401b1111, sliceData, f31115, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m1113 = interfaceC4351mM36052d;
                    AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1113, c28655q, true);
                    f25 = f31115;
                    f26 = f29;
                    f28 = f34;
                    modifier2 = modifier1114;
                    interfaceC4351m2 = interfaceC4351m1113;
                    f27 = f19;
                    function2 = function3;
                    c12847u3 = c12847u4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    function2 = function1;
                    interfaceC4351m2 = interfaceC4351m;
                    f25 = f17;
                    f26 = f18;
                    c12847u3 = c12847u2;
                    f27 = f19;
                    f28 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 100663296;
            if ((i15 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i37 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if (i38 != 0) {
                    f17 = 0.06f;
                }
                if (i16 != 0) {
                    f29 = 0.13f;
                } else {
                    f29 = f18;
                }
                if (i18 != 0) {
                    f19 = 1.0f;
                }
                if (i24 != 0) {
                    f34 = 1.0f;
                } else {
                    f34 = f24;
                }
                if (i26 != 0) {
                    c12847u4 = null;
                } else {
                    c12847u4 = c12847u2;
                }
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C12824e(5);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    function3 = (Function1) objM87133R11;
                } else {
                    function3 = function1;
                }
                if (i34 != 0) {
                    interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                } else {
                    interfaceC4351mM36052d = interfaceC4351m;
                }
                boolean zM87149e1112 = c28655q2.m87149e(sliceData.size());
                if ((i15 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87149e1112 | z13;
                objM87133R = c28655q2.m87133R();
                if (z14) {
                    objM87133R = new C12844r(sliceData.size(), f19);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C12844r(sliceData.size(), f19);
                    c28655q2.m87172p0(objM87133R);
                }
                c12844r = (C12844r) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                if (c12847u4 == null) {
                    numM35949r = null;
                } else {
                    numM35949r = m35949r(interfaceC28601c1);
                }
                boolean zM87153g1114 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                i36 = i15 & 3670016;
                Modifier modifier1115 = modifier3;
                if (i36 == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87153g1114 | z15;
                objM87133R3 = c28655q2.m87133R();
                if (z16) {
                    if (c12847u4 != null) {
                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                    } else {
                        fM36081f = 1.0f;
                    }
                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    if (c12847u4 != null) {
                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                    } else {
                        fM36081f = 1.0f;
                    }
                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                    c28655q2.m87172p0(objM87133R3);
                }
                list = (List) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(list);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(list);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC11348f.m30553a(1.0f);
                    c28655q2.m87172p0(objM87133R7);
                }
                c11344e = (C11344e) objM87133R7;
                boolean zM87157i1113 = c28655q2.m87157i(list);
                if (i36 == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87153g = zM87157i1113 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                objM87133R8 = c28655q2.m87133R();
                if (zM87153g) {
                    c11344e2 = c11344e;
                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    c11344e2 = c11344e;
                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                    c28655q2.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                objM87133R9 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                    c28655q2.m87172p0(objM87133R9);
                }
                function4 = (Function1) objM87133R9;
                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                if (c12847u4 == null) {
                    c2314t2 = c2314t;
                    modifierM35931U = c2314t2;
                } else {
                    c2314t2 = c2314t;
                    modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                }
                Modifier modifierMo3471e1112 = modifier1115.mo3471e(modifierM35931U);
                InterfaceC39127r0 interfaceC39127r0M66763d1112 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q2.m87165m();
                Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e1112);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                float f31116 = f17;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1112);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1112);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1112);
                Modifier modifierMo3401b1112 = C1100b.f4583a.mo3401b(c2314t2);
                zM87157i = c28655q2.m87157i(c11344e2);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                        }
                    };
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                        }
                    };
                    c28655q2.m87172p0(objM87133R10);
                }
                m35953v(modifierMo3401b1112, sliceData, f31116, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                c28655q = c28655q2;
                InterfaceC4351m interfaceC4351m1114 = interfaceC4351mM36052d;
                AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1114, c28655q, true);
                f25 = f31116;
                f26 = f29;
                f28 = f34;
                modifier2 = modifier1115;
                interfaceC4351m2 = interfaceC4351m1114;
                f27 = f19;
                function2 = function3;
                c12847u3 = c12847u4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                function2 = function1;
                interfaceC4351m2 = interfaceC4351m;
                f25 = f17;
                f26 = f18;
                c12847u3 = c12847u2;
                f27 = f19;
                f28 = f24;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 384;
        f17 = f13;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                f18 = f14;
                if (c28655q2.m87147d(f18)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    f19 = f15;
                    if (c28655q2.m87147d(f19)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((196608 & i13) == 0) {
                        f24 = f16;
                        if (c28655q2.m87147d(f24)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 64;
                    if (i26 != 0) {
                        i15 |= 1572864;
                        c12847u2 = c12847u;
                    } else {
                        c12847u2 = c12847u;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q2.m87153g(c12847u2)) {
                                i27 = 1048576;
                            } else {
                                i27 = 524288;
                            }
                            i15 |= i27;
                        }
                    }
                    i28 = i14 & 128;
                    if (i28 != 0) {
                        if ((i13 & 12582912) == 0) {
                            if (c28655q2.m87157i(function1)) {
                                i29 = 8388608;
                            } else {
                                i29 = 4194304;
                            }
                            i15 |= i29;
                        }
                        i34 = i14 & 256;
                        if (i34 != 0) {
                            if ((i13 & 100663296) == 0) {
                                if (c28655q2.m87157i(interfaceC4351m)) {
                                    i35 = 67108864;
                                } else {
                                    i35 = AndroidSDKConstants.FLAG_MUTABLE;
                                }
                                i15 |= i35;
                            }
                            if ((i15 & 38347923) != 38347922) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (c28655q2.m87135U(i15 & 1, z4)) {
                                c2314t = C2314t.f9131w;
                                if (i37 != 0) {
                                    modifier3 = c2314t;
                                } else {
                                    modifier3 = modifier;
                                }
                                if (i38 != 0) {
                                    f17 = 0.06f;
                                }
                                if (i16 != 0) {
                                    f29 = 0.13f;
                                } else {
                                    f29 = f18;
                                }
                                if (i18 != 0) {
                                    f19 = 1.0f;
                                }
                                if (i24 != 0) {
                                    f34 = 1.0f;
                                } else {
                                    f34 = f24;
                                }
                                if (i26 != 0) {
                                    c12847u4 = null;
                                } else {
                                    c12847u4 = c12847u2;
                                }
                                c28676v0 = C28635l.f115821a;
                                if (i28 != 0) {
                                    objM87133R11 = c28655q2.m87133R();
                                    if (objM87133R11 == c28676v0) {
                                        objM87133R11 = new C12824e(5);
                                        c28655q2.m87172p0(objM87133R11);
                                    }
                                    function3 = (Function1) objM87133R11;
                                } else {
                                    function3 = function1;
                                }
                                if (i34 != 0) {
                                    interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                                } else {
                                    interfaceC4351mM36052d = interfaceC4351m;
                                }
                                boolean zM87149e1113 = c28655q2.m87149e(sliceData.size());
                                if ((i15 & 57344) == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                z14 = zM87149e1113 | z13;
                                objM87133R = c28655q2.m87133R();
                                if (z14) {
                                    objM87133R = new C12844r(sliceData.size(), f19);
                                    c28655q2.m87172p0(objM87133R);
                                } else {
                                    objM87133R = new C12844r(sliceData.size(), f19);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                c12844r = (C12844r) objM87133R;
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = AbstractC28683x.m87272z(null);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                                if (c12847u4 == null) {
                                    numM35949r = null;
                                } else {
                                    numM35949r = m35949r(interfaceC28601c1);
                                }
                                boolean zM87153g1115 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                                i36 = i15 & 3670016;
                                Modifier modifier1116 = modifier3;
                                if (i36 == 1048576) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = zM87153g1115 | z15;
                                objM87133R3 = c28655q2.m87133R();
                                if (z16) {
                                    if (c12847u4 != null) {
                                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                                    } else {
                                        fM36081f = 1.0f;
                                    }
                                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                    c28655q2.m87172p0(objM87133R3);
                                } else {
                                    if (c12847u4 != null) {
                                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                                    } else {
                                        fM36081f = 1.0f;
                                    }
                                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                list = (List) objM87133R3;
                                objM87133R4 = c28655q2.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = AbstractC28683x.m87272z(list);
                                    c28655q2.m87172p0(objM87133R4);
                                }
                                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                                objM87133R5 = c28655q2.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = AbstractC28683x.m87272z(list);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                                objM87133R6 = c28655q2.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = AbstractC28683x.m87272z(null);
                                    c28655q2.m87172p0(objM87133R6);
                                }
                                interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                                objM87133R7 = c28655q2.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                    c28655q2.m87172p0(objM87133R7);
                                }
                                c11344e = (C11344e) objM87133R7;
                                boolean zM87157i1114 = c28655q2.m87157i(list);
                                if (i36 == 1048576) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                zM87153g = zM87157i1114 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                                objM87133R8 = c28655q2.m87133R();
                                if (zM87153g) {
                                    c11344e2 = c11344e;
                                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                    c28655q2.m87172p0(objM87133R8);
                                } else {
                                    c11344e2 = c11344e;
                                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                    c28655q2.m87172p0(objM87133R8);
                                }
                                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                                zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                                objM87133R9 = c28655q2.m87133R();
                                if (zM87153g2) {
                                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                    c28655q2.m87172p0(objM87133R9);
                                } else {
                                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                    c28655q2.m87172p0(objM87133R9);
                                }
                                function4 = (Function1) objM87133R9;
                                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                                if (c12847u4 == null) {
                                    c2314t2 = c2314t;
                                    modifierM35931U = c2314t2;
                                } else {
                                    c2314t2 = c2314t;
                                    modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                                }
                                Modifier modifierMo3471e1113 = modifier1116.mo3471e(modifierM35931U);
                                InterfaceC39127r0 interfaceC39127r0M66763d1113 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                                iHashCode = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q2.m87165m();
                                Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e1113);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q2.m87158i0();
                                float f31117 = f17;
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1113);
                                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1113);
                                c0209i = C0217k.f732j;
                                if (c28655q2.f115903S) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                                } else {
                                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1113);
                                Modifier modifierMo3401b1113 = C1100b.f4583a.mo3401b(c2314t2);
                                zM87157i = c28655q2.m87157i(c11344e2);
                                objM87133R10 = c28655q2.m87133R();
                                if (zM87157i) {
                                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                        }
                                    };
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                        @Override // c93.InterfaceC4339a
                                        public final Object invoke() {
                                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                        }
                                    };
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                m35953v(modifierMo3401b1113, sliceData, f31117, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                                c28655q = c28655q2;
                                InterfaceC4351m interfaceC4351m1115 = interfaceC4351mM36052d;
                                AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1115, c28655q, true);
                                f25 = f31117;
                                f26 = f29;
                                f28 = f34;
                                modifier2 = modifier1116;
                                interfaceC4351m2 = interfaceC4351m1115;
                                f27 = f19;
                                function2 = function3;
                                c12847u3 = c12847u4;
                            } else {
                                c28655q = c28655q2;
                                c28655q.m87138X();
                                modifier2 = modifier;
                                function2 = function1;
                                interfaceC4351m2 = interfaceC4351m;
                                f25 = f17;
                                f26 = f18;
                                c12847u3 = c12847u2;
                                f27 = f19;
                                f28 = f24;
                            }
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        int iIntValue = ((Integer) obj2).intValue();
                                        return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                    }
                                };
                            }
                        }
                        i15 |= 100663296;
                        if ((i15 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i37 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i38 != 0) {
                                f17 = 0.06f;
                            }
                            if (i16 != 0) {
                                f29 = 0.13f;
                            } else {
                                f29 = f18;
                            }
                            if (i18 != 0) {
                                f19 = 1.0f;
                            }
                            if (i24 != 0) {
                                f34 = 1.0f;
                            } else {
                                f34 = f24;
                            }
                            if (i26 != 0) {
                                c12847u4 = null;
                            } else {
                                c12847u4 = c12847u2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R11 = c28655q2.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C12824e(5);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                function3 = (Function1) objM87133R11;
                            } else {
                                function3 = function1;
                            }
                            if (i34 != 0) {
                                interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                            } else {
                                interfaceC4351mM36052d = interfaceC4351m;
                            }
                            boolean zM87149e1114 = c28655q2.m87149e(sliceData.size());
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87149e1114 | z13;
                            objM87133R = c28655q2.m87133R();
                            if (z14) {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c12844r = (C12844r) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            if (c12847u4 == null) {
                                numM35949r = null;
                            } else {
                                numM35949r = m35949r(interfaceC28601c1);
                            }
                            boolean zM87153g1116 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                            i36 = i15 & 3670016;
                            Modifier modifier1117 = modifier3;
                            if (i36 == 1048576) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87153g1116 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (z16) {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            list = (List) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            c11344e = (C11344e) objM87133R7;
                            boolean zM87157i1115 = c28655q2.m87157i(list);
                            if (i36 == 1048576) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87153g = zM87157i1115 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87153g) {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                            zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            function4 = (Function1) objM87133R9;
                            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                            if (c12847u4 == null) {
                                c2314t2 = c2314t;
                                modifierM35931U = c2314t2;
                            } else {
                                c2314t2 = c2314t;
                                modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                            }
                            Modifier modifierMo3471e1114 = modifier1117.mo3471e(modifierM35931U);
                            InterfaceC39127r0 interfaceC39127r0M66763d1114 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q2.m87165m();
                            Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e1114);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            float f31118 = f17;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1114);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1114);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1114);
                            Modifier modifierMo3401b1114 = C1100b.f4583a.mo3401b(c2314t2);
                            zM87157i = c28655q2.m87157i(c11344e2);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            }
                            m35953v(modifierMo3401b1114, sliceData, f31118, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                            c28655q = c28655q2;
                            InterfaceC4351m interfaceC4351m1116 = interfaceC4351mM36052d;
                            AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1116, c28655q, true);
                            f25 = f31118;
                            f26 = f29;
                            f28 = f34;
                            modifier2 = modifier1117;
                            interfaceC4351m2 = interfaceC4351m1116;
                            f27 = f19;
                            function2 = function3;
                            c12847u3 = c12847u4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            modifier2 = modifier;
                            function2 = function1;
                            interfaceC4351m2 = interfaceC4351m;
                            f25 = f17;
                            f26 = f18;
                            c12847u3 = c12847u2;
                            f27 = f19;
                            f28 = f24;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i15 |= 12582912;
                    i34 = i14 & 256;
                    if (i34 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87157i(interfaceC4351m)) {
                                i35 = 67108864;
                            } else {
                                i35 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i35;
                        }
                        if ((i15 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i37 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i38 != 0) {
                                f17 = 0.06f;
                            }
                            if (i16 != 0) {
                                f29 = 0.13f;
                            } else {
                                f29 = f18;
                            }
                            if (i18 != 0) {
                                f19 = 1.0f;
                            }
                            if (i24 != 0) {
                                f34 = 1.0f;
                            } else {
                                f34 = f24;
                            }
                            if (i26 != 0) {
                                c12847u4 = null;
                            } else {
                                c12847u4 = c12847u2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R11 = c28655q2.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C12824e(5);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                function3 = (Function1) objM87133R11;
                            } else {
                                function3 = function1;
                            }
                            if (i34 != 0) {
                                interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                            } else {
                                interfaceC4351mM36052d = interfaceC4351m;
                            }
                            boolean zM87149e1115 = c28655q2.m87149e(sliceData.size());
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87149e1115 | z13;
                            objM87133R = c28655q2.m87133R();
                            if (z14) {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c12844r = (C12844r) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            if (c12847u4 == null) {
                                numM35949r = null;
                            } else {
                                numM35949r = m35949r(interfaceC28601c1);
                            }
                            boolean zM87153g1117 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                            i36 = i15 & 3670016;
                            Modifier modifier1118 = modifier3;
                            if (i36 == 1048576) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87153g1117 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (z16) {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            list = (List) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            c11344e = (C11344e) objM87133R7;
                            boolean zM87157i1116 = c28655q2.m87157i(list);
                            if (i36 == 1048576) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87153g = zM87157i1116 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87153g) {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                            zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            function4 = (Function1) objM87133R9;
                            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                            if (c12847u4 == null) {
                                c2314t2 = c2314t;
                                modifierM35931U = c2314t2;
                            } else {
                                c2314t2 = c2314t;
                                modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                            }
                            Modifier modifierMo3471e1115 = modifier1118.mo3471e(modifierM35931U);
                            InterfaceC39127r0 interfaceC39127r0M66763d1115 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q2.m87165m();
                            Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e1115);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            float f31119 = f17;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1115);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1115);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1115);
                            Modifier modifierMo3401b1115 = C1100b.f4583a.mo3401b(c2314t2);
                            zM87157i = c28655q2.m87157i(c11344e2);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            }
                            m35953v(modifierMo3401b1115, sliceData, f31119, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                            c28655q = c28655q2;
                            InterfaceC4351m interfaceC4351m1117 = interfaceC4351mM36052d;
                            AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1117, c28655q, true);
                            f25 = f31119;
                            f26 = f29;
                            f28 = f34;
                            modifier2 = modifier1118;
                            interfaceC4351m2 = interfaceC4351m1117;
                            f27 = f19;
                            function2 = function3;
                            c12847u3 = c12847u4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            modifier2 = modifier;
                            function2 = function1;
                            interfaceC4351m2 = interfaceC4351m;
                            f25 = f17;
                            f26 = f18;
                            c12847u3 = c12847u2;
                            f27 = f19;
                            f28 = f24;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i15 |= 100663296;
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e1116 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e1116 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g1118 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier1119 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g1118 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i1117 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i1117 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e1116 = modifier1119.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d1116 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q2.m87165m();
                        Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e1116);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f311110 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1116);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1116);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1116);
                        Modifier modifierMo3401b1116 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b1116, sliceData, f311110, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m1118 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1118, c28655q, true);
                        f25 = f311110;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier1119;
                        interfaceC4351m2 = interfaceC4351m1118;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                f24 = f16;
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                    c12847u2 = c12847u;
                } else {
                    c12847u2 = c12847u;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87153g(c12847u2)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                }
                i28 = i14 & 128;
                if (i28 != 0) {
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87157i(function1)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i15 |= i29;
                    }
                    i34 = i14 & 256;
                    if (i34 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87157i(interfaceC4351m)) {
                                i35 = 67108864;
                            } else {
                                i35 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i35;
                        }
                        if ((i15 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i37 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i38 != 0) {
                                f17 = 0.06f;
                            }
                            if (i16 != 0) {
                                f29 = 0.13f;
                            } else {
                                f29 = f18;
                            }
                            if (i18 != 0) {
                                f19 = 1.0f;
                            }
                            if (i24 != 0) {
                                f34 = 1.0f;
                            } else {
                                f34 = f24;
                            }
                            if (i26 != 0) {
                                c12847u4 = null;
                            } else {
                                c12847u4 = c12847u2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R11 = c28655q2.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C12824e(5);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                function3 = (Function1) objM87133R11;
                            } else {
                                function3 = function1;
                            }
                            if (i34 != 0) {
                                interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                            } else {
                                interfaceC4351mM36052d = interfaceC4351m;
                            }
                            boolean zM87149e1117 = c28655q2.m87149e(sliceData.size());
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87149e1117 | z13;
                            objM87133R = c28655q2.m87133R();
                            if (z14) {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c12844r = (C12844r) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            if (c12847u4 == null) {
                                numM35949r = null;
                            } else {
                                numM35949r = m35949r(interfaceC28601c1);
                            }
                            boolean zM87153g1119 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                            i36 = i15 & 3670016;
                            Modifier modifier11110 = modifier3;
                            if (i36 == 1048576) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87153g1119 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (z16) {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            list = (List) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            c11344e = (C11344e) objM87133R7;
                            boolean zM87157i1118 = c28655q2.m87157i(list);
                            if (i36 == 1048576) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87153g = zM87157i1118 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87153g) {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                            zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            function4 = (Function1) objM87133R9;
                            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                            if (c12847u4 == null) {
                                c2314t2 = c2314t;
                                modifierM35931U = c2314t2;
                            } else {
                                c2314t2 = c2314t;
                                modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                            }
                            Modifier modifierMo3471e1117 = modifier11110.mo3471e(modifierM35931U);
                            InterfaceC39127r0 interfaceC39127r0M66763d1117 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q2.m87165m();
                            Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e1117);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            float f311111 = f17;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1117);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1117);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1117);
                            Modifier modifierMo3401b1117 = C1100b.f4583a.mo3401b(c2314t2);
                            zM87157i = c28655q2.m87157i(c11344e2);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            }
                            m35953v(modifierMo3401b1117, sliceData, f311111, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                            c28655q = c28655q2;
                            InterfaceC4351m interfaceC4351m1119 = interfaceC4351mM36052d;
                            AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1119, c28655q, true);
                            f25 = f311111;
                            f26 = f29;
                            f28 = f34;
                            modifier2 = modifier11110;
                            interfaceC4351m2 = interfaceC4351m1119;
                            f27 = f19;
                            function2 = function3;
                            c12847u3 = c12847u4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            modifier2 = modifier;
                            function2 = function1;
                            interfaceC4351m2 = interfaceC4351m;
                            f25 = f17;
                            f26 = f18;
                            c12847u3 = c12847u2;
                            f27 = f19;
                            f28 = f24;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i15 |= 100663296;
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e1118 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e1118 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g11110 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier11111 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g11110 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i1119 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i1119 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e1118 = modifier11111.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d1118 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q2.m87165m();
                        Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e1118);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f311112 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1118);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1118);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1118);
                        Modifier modifierMo3401b1118 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b1118, sliceData, f311112, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m11110 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m11110, c28655q, true);
                        f25 = f311112;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier11111;
                        interfaceC4351m2 = interfaceC4351m11110;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 12582912;
                i34 = i14 & 256;
                if (i34 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(interfaceC4351m)) {
                            i35 = 67108864;
                        } else {
                            i35 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i35;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e1119 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e1119 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g11111 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier11112 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g11111 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i11110 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i11110 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e1119 = modifier11112.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d1119 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q2.m87165m();
                        Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e1119);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f311113 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1119);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1119);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1119);
                        Modifier modifierMo3401b1119 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b1119, sliceData, f311113, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m11111 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m11111, c28655q, true);
                        f25 = f311113;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier11112;
                        interfaceC4351m2 = interfaceC4351m11111;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 100663296;
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i38 != 0) {
                        f17 = 0.06f;
                    }
                    if (i16 != 0) {
                        f29 = 0.13f;
                    } else {
                        f29 = f18;
                    }
                    if (i18 != 0) {
                        f19 = 1.0f;
                    }
                    if (i24 != 0) {
                        f34 = 1.0f;
                    } else {
                        f34 = f24;
                    }
                    if (i26 != 0) {
                        c12847u4 = null;
                    } else {
                        c12847u4 = c12847u2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C12824e(5);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function3 = (Function1) objM87133R11;
                    } else {
                        function3 = function1;
                    }
                    if (i34 != 0) {
                        interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                    } else {
                        interfaceC4351mM36052d = interfaceC4351m;
                    }
                    boolean zM87149e11110 = c28655q2.m87149e(sliceData.size());
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87149e11110 | z13;
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c12844r = (C12844r) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (c12847u4 == null) {
                        numM35949r = null;
                    } else {
                        numM35949r = m35949r(interfaceC28601c1);
                    }
                    boolean zM87153g11112 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                    i36 = i15 & 3670016;
                    Modifier modifier11113 = modifier3;
                    if (i36 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87153g11112 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    list = (List) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c11344e = (C11344e) objM87133R7;
                    boolean zM87157i11111 = c28655q2.m87157i(list);
                    if (i36 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = zM87157i11111 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    if (c12847u4 == null) {
                        c2314t2 = c2314t;
                        modifierM35931U = c2314t2;
                    } else {
                        c2314t2 = c2314t;
                        modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                    }
                    Modifier modifierMo3471e11110 = modifier11113.mo3471e(modifierM35931U);
                    InterfaceC39127r0 interfaceC39127r0M66763d11110 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q2.m87165m();
                    Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e11110);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    float f311114 = f17;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d11110);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11110);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11110);
                    Modifier modifierMo3401b11110 = C1100b.f4583a.mo3401b(c2314t2);
                    zM87157i = c28655q2.m87157i(c11344e2);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    }
                    m35953v(modifierMo3401b11110, sliceData, f311114, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m11112 = interfaceC4351mM36052d;
                    AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m11112, c28655q, true);
                    f25 = f311114;
                    f26 = f29;
                    f28 = f34;
                    modifier2 = modifier11113;
                    interfaceC4351m2 = interfaceC4351m11112;
                    f27 = f19;
                    function2 = function3;
                    c12847u3 = c12847u4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    function2 = function1;
                    interfaceC4351m2 = interfaceC4351m;
                    f25 = f17;
                    f26 = f18;
                    c12847u3 = c12847u2;
                    f27 = f19;
                    f28 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 24576;
            f19 = f15;
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    f24 = f16;
                    if (c28655q2.m87147d(f24)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                    c12847u2 = c12847u;
                } else {
                    c12847u2 = c12847u;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87153g(c12847u2)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                }
                i28 = i14 & 128;
                if (i28 != 0) {
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87157i(function1)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i15 |= i29;
                    }
                    i34 = i14 & 256;
                    if (i34 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87157i(interfaceC4351m)) {
                                i35 = 67108864;
                            } else {
                                i35 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i35;
                        }
                        if ((i15 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i37 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i38 != 0) {
                                f17 = 0.06f;
                            }
                            if (i16 != 0) {
                                f29 = 0.13f;
                            } else {
                                f29 = f18;
                            }
                            if (i18 != 0) {
                                f19 = 1.0f;
                            }
                            if (i24 != 0) {
                                f34 = 1.0f;
                            } else {
                                f34 = f24;
                            }
                            if (i26 != 0) {
                                c12847u4 = null;
                            } else {
                                c12847u4 = c12847u2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R11 = c28655q2.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C12824e(5);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                function3 = (Function1) objM87133R11;
                            } else {
                                function3 = function1;
                            }
                            if (i34 != 0) {
                                interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                            } else {
                                interfaceC4351mM36052d = interfaceC4351m;
                            }
                            boolean zM87149e11111 = c28655q2.m87149e(sliceData.size());
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87149e11111 | z13;
                            objM87133R = c28655q2.m87133R();
                            if (z14) {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c12844r = (C12844r) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            if (c12847u4 == null) {
                                numM35949r = null;
                            } else {
                                numM35949r = m35949r(interfaceC28601c1);
                            }
                            boolean zM87153g11113 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                            i36 = i15 & 3670016;
                            Modifier modifier11114 = modifier3;
                            if (i36 == 1048576) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87153g11113 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (z16) {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            list = (List) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            c11344e = (C11344e) objM87133R7;
                            boolean zM87157i11112 = c28655q2.m87157i(list);
                            if (i36 == 1048576) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87153g = zM87157i11112 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87153g) {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                            zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            function4 = (Function1) objM87133R9;
                            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                            if (c12847u4 == null) {
                                c2314t2 = c2314t;
                                modifierM35931U = c2314t2;
                            } else {
                                c2314t2 = c2314t;
                                modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                            }
                            Modifier modifierMo3471e11111 = modifier11114.mo3471e(modifierM35931U);
                            InterfaceC39127r0 interfaceC39127r0M66763d11111 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q2.m87165m();
                            Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e11111);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            float f311115 = f17;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d11111);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11111);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11111);
                            Modifier modifierMo3401b11111 = C1100b.f4583a.mo3401b(c2314t2);
                            zM87157i = c28655q2.m87157i(c11344e2);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            }
                            m35953v(modifierMo3401b11111, sliceData, f311115, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                            c28655q = c28655q2;
                            InterfaceC4351m interfaceC4351m11113 = interfaceC4351mM36052d;
                            AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m11113, c28655q, true);
                            f25 = f311115;
                            f26 = f29;
                            f28 = f34;
                            modifier2 = modifier11114;
                            interfaceC4351m2 = interfaceC4351m11113;
                            f27 = f19;
                            function2 = function3;
                            c12847u3 = c12847u4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            modifier2 = modifier;
                            function2 = function1;
                            interfaceC4351m2 = interfaceC4351m;
                            f25 = f17;
                            f26 = f18;
                            c12847u3 = c12847u2;
                            f27 = f19;
                            f28 = f24;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i15 |= 100663296;
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e11112 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e11112 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g11114 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier11115 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g11114 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i11113 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i11113 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e11112 = modifier11115.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d11112 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q2.m87165m();
                        Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e11112);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f311116 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d11112);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11112);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11112);
                        Modifier modifierMo3401b11112 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b11112, sliceData, f311116, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m11114 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m11114, c28655q, true);
                        f25 = f311116;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier11115;
                        interfaceC4351m2 = interfaceC4351m11114;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 12582912;
                i34 = i14 & 256;
                if (i34 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(interfaceC4351m)) {
                            i35 = 67108864;
                        } else {
                            i35 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i35;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e11113 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e11113 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g11115 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier11116 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g11115 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i11114 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i11114 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e11113 = modifier11116.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d11113 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q2.m87165m();
                        Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e11113);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f311117 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d11113);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11113);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11113);
                        Modifier modifierMo3401b11113 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b11113, sliceData, f311117, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m11115 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m11115, c28655q, true);
                        f25 = f311117;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier11116;
                        interfaceC4351m2 = interfaceC4351m11115;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 100663296;
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i38 != 0) {
                        f17 = 0.06f;
                    }
                    if (i16 != 0) {
                        f29 = 0.13f;
                    } else {
                        f29 = f18;
                    }
                    if (i18 != 0) {
                        f19 = 1.0f;
                    }
                    if (i24 != 0) {
                        f34 = 1.0f;
                    } else {
                        f34 = f24;
                    }
                    if (i26 != 0) {
                        c12847u4 = null;
                    } else {
                        c12847u4 = c12847u2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C12824e(5);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function3 = (Function1) objM87133R11;
                    } else {
                        function3 = function1;
                    }
                    if (i34 != 0) {
                        interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                    } else {
                        interfaceC4351mM36052d = interfaceC4351m;
                    }
                    boolean zM87149e11114 = c28655q2.m87149e(sliceData.size());
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87149e11114 | z13;
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c12844r = (C12844r) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (c12847u4 == null) {
                        numM35949r = null;
                    } else {
                        numM35949r = m35949r(interfaceC28601c1);
                    }
                    boolean zM87153g11116 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                    i36 = i15 & 3670016;
                    Modifier modifier11117 = modifier3;
                    if (i36 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87153g11116 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    list = (List) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c11344e = (C11344e) objM87133R7;
                    boolean zM87157i11115 = c28655q2.m87157i(list);
                    if (i36 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = zM87157i11115 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    if (c12847u4 == null) {
                        c2314t2 = c2314t;
                        modifierM35931U = c2314t2;
                    } else {
                        c2314t2 = c2314t;
                        modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                    }
                    Modifier modifierMo3471e11114 = modifier11117.mo3471e(modifierM35931U);
                    InterfaceC39127r0 interfaceC39127r0M66763d11114 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q2.m87165m();
                    Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e11114);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    float f311118 = f17;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d11114);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11114);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11114);
                    Modifier modifierMo3401b11114 = C1100b.f4583a.mo3401b(c2314t2);
                    zM87157i = c28655q2.m87157i(c11344e2);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    }
                    m35953v(modifierMo3401b11114, sliceData, f311118, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m11116 = interfaceC4351mM36052d;
                    AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m11116, c28655q, true);
                    f25 = f311118;
                    f26 = f29;
                    f28 = f34;
                    modifier2 = modifier11117;
                    interfaceC4351m2 = interfaceC4351m11116;
                    f27 = f19;
                    function2 = function3;
                    c12847u3 = c12847u4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    function2 = function1;
                    interfaceC4351m2 = interfaceC4351m;
                    f25 = f17;
                    f26 = f18;
                    c12847u3 = c12847u2;
                    f27 = f19;
                    f28 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            f24 = f16;
            i26 = i14 & 64;
            if (i26 != 0) {
                i15 |= 1572864;
                c12847u2 = c12847u;
            } else {
                c12847u2 = c12847u;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87153g(c12847u2)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
            }
            i28 = i14 & 128;
            if (i28 != 0) {
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 256;
                if (i34 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(interfaceC4351m)) {
                            i35 = 67108864;
                        } else {
                            i35 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i35;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e11115 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e11115 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g11117 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier11118 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g11117 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i11116 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i11116 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e11115 = modifier11118.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d11115 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q2.m87165m();
                        Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e11115);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f311119 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d11115);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11115);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11115);
                        Modifier modifierMo3401b11115 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b11115, sliceData, f311119, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m11117 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m11117, c28655q, true);
                        f25 = f311119;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier11118;
                        interfaceC4351m2 = interfaceC4351m11117;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 100663296;
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i38 != 0) {
                        f17 = 0.06f;
                    }
                    if (i16 != 0) {
                        f29 = 0.13f;
                    } else {
                        f29 = f18;
                    }
                    if (i18 != 0) {
                        f19 = 1.0f;
                    }
                    if (i24 != 0) {
                        f34 = 1.0f;
                    } else {
                        f34 = f24;
                    }
                    if (i26 != 0) {
                        c12847u4 = null;
                    } else {
                        c12847u4 = c12847u2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C12824e(5);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function3 = (Function1) objM87133R11;
                    } else {
                        function3 = function1;
                    }
                    if (i34 != 0) {
                        interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                    } else {
                        interfaceC4351mM36052d = interfaceC4351m;
                    }
                    boolean zM87149e11116 = c28655q2.m87149e(sliceData.size());
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87149e11116 | z13;
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c12844r = (C12844r) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (c12847u4 == null) {
                        numM35949r = null;
                    } else {
                        numM35949r = m35949r(interfaceC28601c1);
                    }
                    boolean zM87153g11118 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                    i36 = i15 & 3670016;
                    Modifier modifier11119 = modifier3;
                    if (i36 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87153g11118 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    list = (List) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c11344e = (C11344e) objM87133R7;
                    boolean zM87157i11117 = c28655q2.m87157i(list);
                    if (i36 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = zM87157i11117 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    if (c12847u4 == null) {
                        c2314t2 = c2314t;
                        modifierM35931U = c2314t2;
                    } else {
                        c2314t2 = c2314t;
                        modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                    }
                    Modifier modifierMo3471e11116 = modifier11119.mo3471e(modifierM35931U);
                    InterfaceC39127r0 interfaceC39127r0M66763d11116 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q2.m87165m();
                    Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e11116);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    float f3111110 = f17;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d11116);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11116);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11116);
                    Modifier modifierMo3401b11116 = C1100b.f4583a.mo3401b(c2314t2);
                    zM87157i = c28655q2.m87157i(c11344e2);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    }
                    m35953v(modifierMo3401b11116, sliceData, f3111110, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m11118 = interfaceC4351mM36052d;
                    AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m11118, c28655q, true);
                    f25 = f3111110;
                    f26 = f29;
                    f28 = f34;
                    modifier2 = modifier11119;
                    interfaceC4351m2 = interfaceC4351m11118;
                    f27 = f19;
                    function2 = function3;
                    c12847u3 = c12847u4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    function2 = function1;
                    interfaceC4351m2 = interfaceC4351m;
                    f25 = f17;
                    f26 = f18;
                    c12847u3 = c12847u2;
                    f27 = f19;
                    f28 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 12582912;
            i34 = i14 & 256;
            if (i34 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(interfaceC4351m)) {
                        i35 = 67108864;
                    } else {
                        i35 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i35;
                }
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i38 != 0) {
                        f17 = 0.06f;
                    }
                    if (i16 != 0) {
                        f29 = 0.13f;
                    } else {
                        f29 = f18;
                    }
                    if (i18 != 0) {
                        f19 = 1.0f;
                    }
                    if (i24 != 0) {
                        f34 = 1.0f;
                    } else {
                        f34 = f24;
                    }
                    if (i26 != 0) {
                        c12847u4 = null;
                    } else {
                        c12847u4 = c12847u2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C12824e(5);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function3 = (Function1) objM87133R11;
                    } else {
                        function3 = function1;
                    }
                    if (i34 != 0) {
                        interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                    } else {
                        interfaceC4351mM36052d = interfaceC4351m;
                    }
                    boolean zM87149e11117 = c28655q2.m87149e(sliceData.size());
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87149e11117 | z13;
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c12844r = (C12844r) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (c12847u4 == null) {
                        numM35949r = null;
                    } else {
                        numM35949r = m35949r(interfaceC28601c1);
                    }
                    boolean zM87153g11119 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                    i36 = i15 & 3670016;
                    Modifier modifier111110 = modifier3;
                    if (i36 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87153g11119 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    list = (List) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c11344e = (C11344e) objM87133R7;
                    boolean zM87157i11118 = c28655q2.m87157i(list);
                    if (i36 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = zM87157i11118 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    if (c12847u4 == null) {
                        c2314t2 = c2314t;
                        modifierM35931U = c2314t2;
                    } else {
                        c2314t2 = c2314t;
                        modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                    }
                    Modifier modifierMo3471e11117 = modifier111110.mo3471e(modifierM35931U);
                    InterfaceC39127r0 interfaceC39127r0M66763d11117 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q2.m87165m();
                    Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e11117);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    float f3111111 = f17;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d11117);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11117);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11117);
                    Modifier modifierMo3401b11117 = C1100b.f4583a.mo3401b(c2314t2);
                    zM87157i = c28655q2.m87157i(c11344e2);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    }
                    m35953v(modifierMo3401b11117, sliceData, f3111111, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m11119 = interfaceC4351mM36052d;
                    AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m11119, c28655q, true);
                    f25 = f3111111;
                    f26 = f29;
                    f28 = f34;
                    modifier2 = modifier111110;
                    interfaceC4351m2 = interfaceC4351m11119;
                    f27 = f19;
                    function2 = function3;
                    c12847u3 = c12847u4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    function2 = function1;
                    interfaceC4351m2 = interfaceC4351m;
                    f25 = f17;
                    f26 = f18;
                    c12847u3 = c12847u2;
                    f27 = f19;
                    f28 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 100663296;
            if ((i15 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i37 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if (i38 != 0) {
                    f17 = 0.06f;
                }
                if (i16 != 0) {
                    f29 = 0.13f;
                } else {
                    f29 = f18;
                }
                if (i18 != 0) {
                    f19 = 1.0f;
                }
                if (i24 != 0) {
                    f34 = 1.0f;
                } else {
                    f34 = f24;
                }
                if (i26 != 0) {
                    c12847u4 = null;
                } else {
                    c12847u4 = c12847u2;
                }
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C12824e(5);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    function3 = (Function1) objM87133R11;
                } else {
                    function3 = function1;
                }
                if (i34 != 0) {
                    interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                } else {
                    interfaceC4351mM36052d = interfaceC4351m;
                }
                boolean zM87149e11118 = c28655q2.m87149e(sliceData.size());
                if ((i15 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87149e11118 | z13;
                objM87133R = c28655q2.m87133R();
                if (z14) {
                    objM87133R = new C12844r(sliceData.size(), f19);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C12844r(sliceData.size(), f19);
                    c28655q2.m87172p0(objM87133R);
                }
                c12844r = (C12844r) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                if (c12847u4 == null) {
                    numM35949r = null;
                } else {
                    numM35949r = m35949r(interfaceC28601c1);
                }
                boolean zM87153g111110 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                i36 = i15 & 3670016;
                Modifier modifier111111 = modifier3;
                if (i36 == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87153g111110 | z15;
                objM87133R3 = c28655q2.m87133R();
                if (z16) {
                    if (c12847u4 != null) {
                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                    } else {
                        fM36081f = 1.0f;
                    }
                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    if (c12847u4 != null) {
                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                    } else {
                        fM36081f = 1.0f;
                    }
                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                    c28655q2.m87172p0(objM87133R3);
                }
                list = (List) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(list);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(list);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC11348f.m30553a(1.0f);
                    c28655q2.m87172p0(objM87133R7);
                }
                c11344e = (C11344e) objM87133R7;
                boolean zM87157i11119 = c28655q2.m87157i(list);
                if (i36 == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87153g = zM87157i11119 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                objM87133R8 = c28655q2.m87133R();
                if (zM87153g) {
                    c11344e2 = c11344e;
                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    c11344e2 = c11344e;
                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                    c28655q2.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                objM87133R9 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                    c28655q2.m87172p0(objM87133R9);
                }
                function4 = (Function1) objM87133R9;
                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                if (c12847u4 == null) {
                    c2314t2 = c2314t;
                    modifierM35931U = c2314t2;
                } else {
                    c2314t2 = c2314t;
                    modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                }
                Modifier modifierMo3471e11118 = modifier111111.mo3471e(modifierM35931U);
                InterfaceC39127r0 interfaceC39127r0M66763d11118 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q2.m87165m();
                Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e11118);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                float f3111112 = f17;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d11118);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11118);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11118);
                Modifier modifierMo3401b11118 = C1100b.f4583a.mo3401b(c2314t2);
                zM87157i = c28655q2.m87157i(c11344e2);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                        }
                    };
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                        }
                    };
                    c28655q2.m87172p0(objM87133R10);
                }
                m35953v(modifierMo3401b11118, sliceData, f3111112, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                c28655q = c28655q2;
                InterfaceC4351m interfaceC4351m111110 = interfaceC4351mM36052d;
                AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m111110, c28655q, true);
                f25 = f3111112;
                f26 = f29;
                f28 = f34;
                modifier2 = modifier111111;
                interfaceC4351m2 = interfaceC4351m111110;
                f27 = f19;
                function2 = function3;
                c12847u3 = c12847u4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                function2 = function1;
                interfaceC4351m2 = interfaceC4351m;
                f25 = f17;
                f26 = f18;
                c12847u3 = c12847u2;
                f27 = f19;
                f28 = f24;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 3072;
        f18 = f14;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                f19 = f15;
                if (c28655q2.m87147d(f19)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    f24 = f16;
                    if (c28655q2.m87147d(f24)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    i15 |= 1572864;
                    c12847u2 = c12847u;
                } else {
                    c12847u2 = c12847u;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87153g(c12847u2)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                }
                i28 = i14 & 128;
                if (i28 != 0) {
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87157i(function1)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i15 |= i29;
                    }
                    i34 = i14 & 256;
                    if (i34 != 0) {
                        if ((i13 & 100663296) == 0) {
                            if (c28655q2.m87157i(interfaceC4351m)) {
                                i35 = 67108864;
                            } else {
                                i35 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i35;
                        }
                        if ((i15 & 38347923) != 38347922) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i37 != 0) {
                                modifier3 = c2314t;
                            } else {
                                modifier3 = modifier;
                            }
                            if (i38 != 0) {
                                f17 = 0.06f;
                            }
                            if (i16 != 0) {
                                f29 = 0.13f;
                            } else {
                                f29 = f18;
                            }
                            if (i18 != 0) {
                                f19 = 1.0f;
                            }
                            if (i24 != 0) {
                                f34 = 1.0f;
                            } else {
                                f34 = f24;
                            }
                            if (i26 != 0) {
                                c12847u4 = null;
                            } else {
                                c12847u4 = c12847u2;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R11 = c28655q2.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C12824e(5);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                function3 = (Function1) objM87133R11;
                            } else {
                                function3 = function1;
                            }
                            if (i34 != 0) {
                                interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                            } else {
                                interfaceC4351mM36052d = interfaceC4351m;
                            }
                            boolean zM87149e11119 = c28655q2.m87149e(sliceData.size());
                            if ((i15 & 57344) == 16384) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87149e11119 | z13;
                            objM87133R = c28655q2.m87133R();
                            if (z14) {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                objM87133R = new C12844r(sliceData.size(), f19);
                                c28655q2.m87172p0(objM87133R);
                            }
                            c12844r = (C12844r) objM87133R;
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            if (c12847u4 == null) {
                                numM35949r = null;
                            } else {
                                numM35949r = m35949r(interfaceC28601c1);
                            }
                            boolean zM87153g111111 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                            i36 = i15 & 3670016;
                            Modifier modifier111112 = modifier3;
                            if (i36 == 1048576) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = zM87153g111111 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (z16) {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                if (c12847u4 != null) {
                                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                                } else {
                                    fM36081f = 1.0f;
                                }
                                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            list = (List) objM87133R3;
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = AbstractC28683x.m87272z(list);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(null);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC11348f.m30553a(1.0f);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            c11344e = (C11344e) objM87133R7;
                            boolean zM87157i111110 = c28655q2.m87157i(list);
                            if (i36 == 1048576) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87153g = zM87157i111110 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87153g) {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                c11344e2 = c11344e;
                                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                            zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87153g2) {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            function4 = (Function1) objM87133R9;
                            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                            if (c12847u4 == null) {
                                c2314t2 = c2314t;
                                modifierM35931U = c2314t2;
                            } else {
                                c2314t2 = c2314t;
                                modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                            }
                            Modifier modifierMo3471e11119 = modifier111112.mo3471e(modifierM35931U);
                            InterfaceC39127r0 interfaceC39127r0M66763d11119 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11119 = c28655q2.m87165m();
                            Modifier modifierM118962N11119 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e11119);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            float f3111113 = f17;
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d11119);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11119);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11119);
                            Modifier modifierMo3401b11119 = C1100b.f4583a.mo3401b(c2314t2);
                            zM87157i = c28655q2.m87157i(c11344e2);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i) {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                    }
                                };
                                c28655q2.m87172p0(objM87133R10);
                            }
                            m35953v(modifierMo3401b11119, sliceData, f3111113, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                            c28655q = c28655q2;
                            InterfaceC4351m interfaceC4351m111111 = interfaceC4351mM36052d;
                            AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m111111, c28655q, true);
                            f25 = f3111113;
                            f26 = f29;
                            f28 = f34;
                            modifier2 = modifier111112;
                            interfaceC4351m2 = interfaceC4351m111111;
                            f27 = f19;
                            function2 = function3;
                            c12847u3 = c12847u4;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            modifier2 = modifier;
                            function2 = function1;
                            interfaceC4351m2 = interfaceC4351m;
                            f25 = f17;
                            f26 = f18;
                            c12847u3 = c12847u2;
                            f27 = f19;
                            f28 = f24;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i15 |= 100663296;
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e111110 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e111110 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g111112 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier111113 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g111112 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i111111 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i111111 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e111110 = modifier111113.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d111110 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111110 = c28655q2.m87165m();
                        Modifier modifierM118962N111110 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e111110);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f3111114 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d111110);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m111110);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N111110);
                        Modifier modifierMo3401b111110 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b111110, sliceData, f3111114, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m111112 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m111112, c28655q, true);
                        f25 = f3111114;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier111113;
                        interfaceC4351m2 = interfaceC4351m111112;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 12582912;
                i34 = i14 & 256;
                if (i34 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(interfaceC4351m)) {
                            i35 = 67108864;
                        } else {
                            i35 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i35;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e111111 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e111111 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g111113 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier111114 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g111113 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i111112 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i111112 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e111111 = modifier111114.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d111111 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111111 = c28655q2.m87165m();
                        Modifier modifierM118962N111111 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e111111);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f3111115 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d111111);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m111111);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N111111);
                        Modifier modifierMo3401b111111 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b111111, sliceData, f3111115, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m111113 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m111113, c28655q, true);
                        f25 = f3111115;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier111114;
                        interfaceC4351m2 = interfaceC4351m111113;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 100663296;
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i38 != 0) {
                        f17 = 0.06f;
                    }
                    if (i16 != 0) {
                        f29 = 0.13f;
                    } else {
                        f29 = f18;
                    }
                    if (i18 != 0) {
                        f19 = 1.0f;
                    }
                    if (i24 != 0) {
                        f34 = 1.0f;
                    } else {
                        f34 = f24;
                    }
                    if (i26 != 0) {
                        c12847u4 = null;
                    } else {
                        c12847u4 = c12847u2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C12824e(5);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function3 = (Function1) objM87133R11;
                    } else {
                        function3 = function1;
                    }
                    if (i34 != 0) {
                        interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                    } else {
                        interfaceC4351mM36052d = interfaceC4351m;
                    }
                    boolean zM87149e111112 = c28655q2.m87149e(sliceData.size());
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87149e111112 | z13;
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c12844r = (C12844r) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (c12847u4 == null) {
                        numM35949r = null;
                    } else {
                        numM35949r = m35949r(interfaceC28601c1);
                    }
                    boolean zM87153g111114 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                    i36 = i15 & 3670016;
                    Modifier modifier111115 = modifier3;
                    if (i36 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87153g111114 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    list = (List) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c11344e = (C11344e) objM87133R7;
                    boolean zM87157i111113 = c28655q2.m87157i(list);
                    if (i36 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = zM87157i111113 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    if (c12847u4 == null) {
                        c2314t2 = c2314t;
                        modifierM35931U = c2314t2;
                    } else {
                        c2314t2 = c2314t;
                        modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                    }
                    Modifier modifierMo3471e111112 = modifier111115.mo3471e(modifierM35931U);
                    InterfaceC39127r0 interfaceC39127r0M66763d111112 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111112 = c28655q2.m87165m();
                    Modifier modifierM118962N111112 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e111112);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    float f3111116 = f17;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d111112);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m111112);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N111112);
                    Modifier modifierMo3401b111112 = C1100b.f4583a.mo3401b(c2314t2);
                    zM87157i = c28655q2.m87157i(c11344e2);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    }
                    m35953v(modifierMo3401b111112, sliceData, f3111116, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m111114 = interfaceC4351mM36052d;
                    AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m111114, c28655q, true);
                    f25 = f3111116;
                    f26 = f29;
                    f28 = f34;
                    modifier2 = modifier111115;
                    interfaceC4351m2 = interfaceC4351m111114;
                    f27 = f19;
                    function2 = function3;
                    c12847u3 = c12847u4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    function2 = function1;
                    interfaceC4351m2 = interfaceC4351m;
                    f25 = f17;
                    f26 = f18;
                    c12847u3 = c12847u2;
                    f27 = f19;
                    f28 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            f24 = f16;
            i26 = i14 & 64;
            if (i26 != 0) {
                i15 |= 1572864;
                c12847u2 = c12847u;
            } else {
                c12847u2 = c12847u;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87153g(c12847u2)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
            }
            i28 = i14 & 128;
            if (i28 != 0) {
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 256;
                if (i34 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(interfaceC4351m)) {
                            i35 = 67108864;
                        } else {
                            i35 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i35;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e111113 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e111113 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g111115 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier111116 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g111115 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i111114 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i111114 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e111113 = modifier111116.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d111113 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111113 = c28655q2.m87165m();
                        Modifier modifierM118962N111113 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e111113);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f3111117 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d111113);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m111113);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N111113);
                        Modifier modifierMo3401b111113 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b111113, sliceData, f3111117, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m111115 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m111115, c28655q, true);
                        f25 = f3111117;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier111116;
                        interfaceC4351m2 = interfaceC4351m111115;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 100663296;
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i38 != 0) {
                        f17 = 0.06f;
                    }
                    if (i16 != 0) {
                        f29 = 0.13f;
                    } else {
                        f29 = f18;
                    }
                    if (i18 != 0) {
                        f19 = 1.0f;
                    }
                    if (i24 != 0) {
                        f34 = 1.0f;
                    } else {
                        f34 = f24;
                    }
                    if (i26 != 0) {
                        c12847u4 = null;
                    } else {
                        c12847u4 = c12847u2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C12824e(5);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function3 = (Function1) objM87133R11;
                    } else {
                        function3 = function1;
                    }
                    if (i34 != 0) {
                        interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                    } else {
                        interfaceC4351mM36052d = interfaceC4351m;
                    }
                    boolean zM87149e111114 = c28655q2.m87149e(sliceData.size());
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87149e111114 | z13;
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c12844r = (C12844r) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (c12847u4 == null) {
                        numM35949r = null;
                    } else {
                        numM35949r = m35949r(interfaceC28601c1);
                    }
                    boolean zM87153g111116 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                    i36 = i15 & 3670016;
                    Modifier modifier111117 = modifier3;
                    if (i36 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87153g111116 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    list = (List) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c11344e = (C11344e) objM87133R7;
                    boolean zM87157i111115 = c28655q2.m87157i(list);
                    if (i36 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = zM87157i111115 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    if (c12847u4 == null) {
                        c2314t2 = c2314t;
                        modifierM35931U = c2314t2;
                    } else {
                        c2314t2 = c2314t;
                        modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                    }
                    Modifier modifierMo3471e111114 = modifier111117.mo3471e(modifierM35931U);
                    InterfaceC39127r0 interfaceC39127r0M66763d111114 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111114 = c28655q2.m87165m();
                    Modifier modifierM118962N111114 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e111114);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    float f3111118 = f17;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d111114);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m111114);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N111114);
                    Modifier modifierMo3401b111114 = C1100b.f4583a.mo3401b(c2314t2);
                    zM87157i = c28655q2.m87157i(c11344e2);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    }
                    m35953v(modifierMo3401b111114, sliceData, f3111118, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m111116 = interfaceC4351mM36052d;
                    AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m111116, c28655q, true);
                    f25 = f3111118;
                    f26 = f29;
                    f28 = f34;
                    modifier2 = modifier111117;
                    interfaceC4351m2 = interfaceC4351m111116;
                    f27 = f19;
                    function2 = function3;
                    c12847u3 = c12847u4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    function2 = function1;
                    interfaceC4351m2 = interfaceC4351m;
                    f25 = f17;
                    f26 = f18;
                    c12847u3 = c12847u2;
                    f27 = f19;
                    f28 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 12582912;
            i34 = i14 & 256;
            if (i34 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(interfaceC4351m)) {
                        i35 = 67108864;
                    } else {
                        i35 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i35;
                }
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i38 != 0) {
                        f17 = 0.06f;
                    }
                    if (i16 != 0) {
                        f29 = 0.13f;
                    } else {
                        f29 = f18;
                    }
                    if (i18 != 0) {
                        f19 = 1.0f;
                    }
                    if (i24 != 0) {
                        f34 = 1.0f;
                    } else {
                        f34 = f24;
                    }
                    if (i26 != 0) {
                        c12847u4 = null;
                    } else {
                        c12847u4 = c12847u2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C12824e(5);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function3 = (Function1) objM87133R11;
                    } else {
                        function3 = function1;
                    }
                    if (i34 != 0) {
                        interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                    } else {
                        interfaceC4351mM36052d = interfaceC4351m;
                    }
                    boolean zM87149e111115 = c28655q2.m87149e(sliceData.size());
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87149e111115 | z13;
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c12844r = (C12844r) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (c12847u4 == null) {
                        numM35949r = null;
                    } else {
                        numM35949r = m35949r(interfaceC28601c1);
                    }
                    boolean zM87153g111117 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                    i36 = i15 & 3670016;
                    Modifier modifier111118 = modifier3;
                    if (i36 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87153g111117 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    list = (List) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c11344e = (C11344e) objM87133R7;
                    boolean zM87157i111116 = c28655q2.m87157i(list);
                    if (i36 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = zM87157i111116 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    if (c12847u4 == null) {
                        c2314t2 = c2314t;
                        modifierM35931U = c2314t2;
                    } else {
                        c2314t2 = c2314t;
                        modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                    }
                    Modifier modifierMo3471e111115 = modifier111118.mo3471e(modifierM35931U);
                    InterfaceC39127r0 interfaceC39127r0M66763d111115 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111115 = c28655q2.m87165m();
                    Modifier modifierM118962N111115 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e111115);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    float f3111119 = f17;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d111115);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m111115);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N111115);
                    Modifier modifierMo3401b111115 = C1100b.f4583a.mo3401b(c2314t2);
                    zM87157i = c28655q2.m87157i(c11344e2);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    }
                    m35953v(modifierMo3401b111115, sliceData, f3111119, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m111117 = interfaceC4351mM36052d;
                    AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m111117, c28655q, true);
                    f25 = f3111119;
                    f26 = f29;
                    f28 = f34;
                    modifier2 = modifier111118;
                    interfaceC4351m2 = interfaceC4351m111117;
                    f27 = f19;
                    function2 = function3;
                    c12847u3 = c12847u4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    function2 = function1;
                    interfaceC4351m2 = interfaceC4351m;
                    f25 = f17;
                    f26 = f18;
                    c12847u3 = c12847u2;
                    f27 = f19;
                    f28 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 100663296;
            if ((i15 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i37 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if (i38 != 0) {
                    f17 = 0.06f;
                }
                if (i16 != 0) {
                    f29 = 0.13f;
                } else {
                    f29 = f18;
                }
                if (i18 != 0) {
                    f19 = 1.0f;
                }
                if (i24 != 0) {
                    f34 = 1.0f;
                } else {
                    f34 = f24;
                }
                if (i26 != 0) {
                    c12847u4 = null;
                } else {
                    c12847u4 = c12847u2;
                }
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C12824e(5);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    function3 = (Function1) objM87133R11;
                } else {
                    function3 = function1;
                }
                if (i34 != 0) {
                    interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                } else {
                    interfaceC4351mM36052d = interfaceC4351m;
                }
                boolean zM87149e111116 = c28655q2.m87149e(sliceData.size());
                if ((i15 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87149e111116 | z13;
                objM87133R = c28655q2.m87133R();
                if (z14) {
                    objM87133R = new C12844r(sliceData.size(), f19);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C12844r(sliceData.size(), f19);
                    c28655q2.m87172p0(objM87133R);
                }
                c12844r = (C12844r) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                if (c12847u4 == null) {
                    numM35949r = null;
                } else {
                    numM35949r = m35949r(interfaceC28601c1);
                }
                boolean zM87153g111118 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                i36 = i15 & 3670016;
                Modifier modifier111119 = modifier3;
                if (i36 == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87153g111118 | z15;
                objM87133R3 = c28655q2.m87133R();
                if (z16) {
                    if (c12847u4 != null) {
                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                    } else {
                        fM36081f = 1.0f;
                    }
                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    if (c12847u4 != null) {
                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                    } else {
                        fM36081f = 1.0f;
                    }
                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                    c28655q2.m87172p0(objM87133R3);
                }
                list = (List) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(list);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(list);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC11348f.m30553a(1.0f);
                    c28655q2.m87172p0(objM87133R7);
                }
                c11344e = (C11344e) objM87133R7;
                boolean zM87157i111117 = c28655q2.m87157i(list);
                if (i36 == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87153g = zM87157i111117 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                objM87133R8 = c28655q2.m87133R();
                if (zM87153g) {
                    c11344e2 = c11344e;
                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    c11344e2 = c11344e;
                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                    c28655q2.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                objM87133R9 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                    c28655q2.m87172p0(objM87133R9);
                }
                function4 = (Function1) objM87133R9;
                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                if (c12847u4 == null) {
                    c2314t2 = c2314t;
                    modifierM35931U = c2314t2;
                } else {
                    c2314t2 = c2314t;
                    modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                }
                Modifier modifierMo3471e111116 = modifier111119.mo3471e(modifierM35931U);
                InterfaceC39127r0 interfaceC39127r0M66763d111116 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111116 = c28655q2.m87165m();
                Modifier modifierM118962N111116 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e111116);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                float f31111110 = f17;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d111116);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m111116);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N111116);
                Modifier modifierMo3401b111116 = C1100b.f4583a.mo3401b(c2314t2);
                zM87157i = c28655q2.m87157i(c11344e2);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                        }
                    };
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                        }
                    };
                    c28655q2.m87172p0(objM87133R10);
                }
                m35953v(modifierMo3401b111116, sliceData, f31111110, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                c28655q = c28655q2;
                InterfaceC4351m interfaceC4351m111118 = interfaceC4351mM36052d;
                AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m111118, c28655q, true);
                f25 = f31111110;
                f26 = f29;
                f28 = f34;
                modifier2 = modifier111119;
                interfaceC4351m2 = interfaceC4351m111118;
                f27 = f19;
                function2 = function3;
                c12847u3 = c12847u4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                function2 = function1;
                interfaceC4351m2 = interfaceC4351m;
                f25 = f17;
                f26 = f18;
                c12847u3 = c12847u2;
                f27 = f19;
                f28 = f24;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 24576;
        f19 = f15;
        i24 = i14 & 32;
        if (i24 != 0) {
            if ((196608 & i13) == 0) {
                f24 = f16;
                if (c28655q2.m87147d(f24)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            i26 = i14 & 64;
            if (i26 != 0) {
                i15 |= 1572864;
                c12847u2 = c12847u;
            } else {
                c12847u2 = c12847u;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87153g(c12847u2)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
            }
            i28 = i14 & 128;
            if (i28 != 0) {
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 256;
                if (i34 != 0) {
                    if ((i13 & 100663296) == 0) {
                        if (c28655q2.m87157i(interfaceC4351m)) {
                            i35 = 67108864;
                        } else {
                            i35 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i35;
                    }
                    if ((i15 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i37 != 0) {
                            modifier3 = c2314t;
                        } else {
                            modifier3 = modifier;
                        }
                        if (i38 != 0) {
                            f17 = 0.06f;
                        }
                        if (i16 != 0) {
                            f29 = 0.13f;
                        } else {
                            f29 = f18;
                        }
                        if (i18 != 0) {
                            f19 = 1.0f;
                        }
                        if (i24 != 0) {
                            f34 = 1.0f;
                        } else {
                            f34 = f24;
                        }
                        if (i26 != 0) {
                            c12847u4 = null;
                        } else {
                            c12847u4 = c12847u2;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R11 = c28655q2.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C12824e(5);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            function3 = (Function1) objM87133R11;
                        } else {
                            function3 = function1;
                        }
                        if (i34 != 0) {
                            interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                        } else {
                            interfaceC4351mM36052d = interfaceC4351m;
                        }
                        boolean zM87149e111117 = c28655q2.m87149e(sliceData.size());
                        if ((i15 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87149e111117 | z13;
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C12844r(sliceData.size(), f19);
                            c28655q2.m87172p0(objM87133R);
                        }
                        c12844r = (C12844r) objM87133R;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        if (c12847u4 == null) {
                            numM35949r = null;
                        } else {
                            numM35949r = m35949r(interfaceC28601c1);
                        }
                        boolean zM87153g111119 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                        i36 = i15 & 3670016;
                        Modifier modifier1111110 = modifier3;
                        if (i36 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87153g111119 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z16) {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            if (c12847u4 != null) {
                                fM36081f = c12847u4.getUnselectedSliceAlpha();
                            } else {
                                fM36081f = 1.0f;
                            }
                            objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        list = (List) objM87133R3;
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC28683x.m87272z(list);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(null);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC11348f.m30553a(1.0f);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        c11344e = (C11344e) objM87133R7;
                        boolean zM87157i111118 = c28655q2.m87157i(list);
                        if (i36 == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g = zM87157i111118 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g) {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            c11344e2 = c11344e;
                            objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                        zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2) {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        if (c12847u4 == null) {
                            c2314t2 = c2314t;
                            modifierM35931U = c2314t2;
                        } else {
                            c2314t2 = c2314t;
                            modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                        }
                        Modifier modifierMo3471e111117 = modifier1111110.mo3471e(modifierM35931U);
                        InterfaceC39127r0 interfaceC39127r0M66763d111117 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111117 = c28655q2.m87165m();
                        Modifier modifierM118962N111117 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e111117);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        float f31111111 = f17;
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d111117);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m111117);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N111117);
                        Modifier modifierMo3401b111117 = C1100b.f4583a.mo3401b(c2314t2);
                        zM87157i = c28655q2.m87157i(c11344e2);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                                }
                            };
                            c28655q2.m87172p0(objM87133R10);
                        }
                        m35953v(modifierMo3401b111117, sliceData, f31111111, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                        c28655q = c28655q2;
                        InterfaceC4351m interfaceC4351m111119 = interfaceC4351mM36052d;
                        AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m111119, c28655q, true);
                        f25 = f31111111;
                        f26 = f29;
                        f28 = f34;
                        modifier2 = modifier1111110;
                        interfaceC4351m2 = interfaceC4351m111119;
                        f27 = f19;
                        function2 = function3;
                        c12847u3 = c12847u4;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        modifier2 = modifier;
                        function2 = function1;
                        interfaceC4351m2 = interfaceC4351m;
                        f25 = f17;
                        f26 = f18;
                        c12847u3 = c12847u2;
                        f27 = f19;
                        f28 = f24;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i15 |= 100663296;
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i38 != 0) {
                        f17 = 0.06f;
                    }
                    if (i16 != 0) {
                        f29 = 0.13f;
                    } else {
                        f29 = f18;
                    }
                    if (i18 != 0) {
                        f19 = 1.0f;
                    }
                    if (i24 != 0) {
                        f34 = 1.0f;
                    } else {
                        f34 = f24;
                    }
                    if (i26 != 0) {
                        c12847u4 = null;
                    } else {
                        c12847u4 = c12847u2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C12824e(5);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function3 = (Function1) objM87133R11;
                    } else {
                        function3 = function1;
                    }
                    if (i34 != 0) {
                        interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                    } else {
                        interfaceC4351mM36052d = interfaceC4351m;
                    }
                    boolean zM87149e111118 = c28655q2.m87149e(sliceData.size());
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87149e111118 | z13;
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c12844r = (C12844r) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (c12847u4 == null) {
                        numM35949r = null;
                    } else {
                        numM35949r = m35949r(interfaceC28601c1);
                    }
                    boolean zM87153g1111110 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                    i36 = i15 & 3670016;
                    Modifier modifier1111111 = modifier3;
                    if (i36 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87153g1111110 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    list = (List) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c11344e = (C11344e) objM87133R7;
                    boolean zM87157i111119 = c28655q2.m87157i(list);
                    if (i36 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = zM87157i111119 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    if (c12847u4 == null) {
                        c2314t2 = c2314t;
                        modifierM35931U = c2314t2;
                    } else {
                        c2314t2 = c2314t;
                        modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                    }
                    Modifier modifierMo3471e111118 = modifier1111111.mo3471e(modifierM35931U);
                    InterfaceC39127r0 interfaceC39127r0M66763d111118 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111118 = c28655q2.m87165m();
                    Modifier modifierM118962N111118 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e111118);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    float f31111112 = f17;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d111118);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m111118);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N111118);
                    Modifier modifierMo3401b111118 = C1100b.f4583a.mo3401b(c2314t2);
                    zM87157i = c28655q2.m87157i(c11344e2);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    }
                    m35953v(modifierMo3401b111118, sliceData, f31111112, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m1111110 = interfaceC4351mM36052d;
                    AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1111110, c28655q, true);
                    f25 = f31111112;
                    f26 = f29;
                    f28 = f34;
                    modifier2 = modifier1111111;
                    interfaceC4351m2 = interfaceC4351m1111110;
                    f27 = f19;
                    function2 = function3;
                    c12847u3 = c12847u4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    function2 = function1;
                    interfaceC4351m2 = interfaceC4351m;
                    f25 = f17;
                    f26 = f18;
                    c12847u3 = c12847u2;
                    f27 = f19;
                    f28 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 12582912;
            i34 = i14 & 256;
            if (i34 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(interfaceC4351m)) {
                        i35 = 67108864;
                    } else {
                        i35 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i35;
                }
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i38 != 0) {
                        f17 = 0.06f;
                    }
                    if (i16 != 0) {
                        f29 = 0.13f;
                    } else {
                        f29 = f18;
                    }
                    if (i18 != 0) {
                        f19 = 1.0f;
                    }
                    if (i24 != 0) {
                        f34 = 1.0f;
                    } else {
                        f34 = f24;
                    }
                    if (i26 != 0) {
                        c12847u4 = null;
                    } else {
                        c12847u4 = c12847u2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C12824e(5);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function3 = (Function1) objM87133R11;
                    } else {
                        function3 = function1;
                    }
                    if (i34 != 0) {
                        interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                    } else {
                        interfaceC4351mM36052d = interfaceC4351m;
                    }
                    boolean zM87149e111119 = c28655q2.m87149e(sliceData.size());
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87149e111119 | z13;
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c12844r = (C12844r) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (c12847u4 == null) {
                        numM35949r = null;
                    } else {
                        numM35949r = m35949r(interfaceC28601c1);
                    }
                    boolean zM87153g1111111 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                    i36 = i15 & 3670016;
                    Modifier modifier1111112 = modifier3;
                    if (i36 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87153g1111111 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    list = (List) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c11344e = (C11344e) objM87133R7;
                    boolean zM87157i1111110 = c28655q2.m87157i(list);
                    if (i36 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = zM87157i1111110 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    if (c12847u4 == null) {
                        c2314t2 = c2314t;
                        modifierM35931U = c2314t2;
                    } else {
                        c2314t2 = c2314t;
                        modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                    }
                    Modifier modifierMo3471e111119 = modifier1111112.mo3471e(modifierM35931U);
                    InterfaceC39127r0 interfaceC39127r0M66763d111119 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111119 = c28655q2.m87165m();
                    Modifier modifierM118962N111119 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e111119);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    float f31111113 = f17;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d111119);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m111119);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N111119);
                    Modifier modifierMo3401b111119 = C1100b.f4583a.mo3401b(c2314t2);
                    zM87157i = c28655q2.m87157i(c11344e2);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    }
                    m35953v(modifierMo3401b111119, sliceData, f31111113, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m1111111 = interfaceC4351mM36052d;
                    AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1111111, c28655q, true);
                    f25 = f31111113;
                    f26 = f29;
                    f28 = f34;
                    modifier2 = modifier1111112;
                    interfaceC4351m2 = interfaceC4351m1111111;
                    f27 = f19;
                    function2 = function3;
                    c12847u3 = c12847u4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    function2 = function1;
                    interfaceC4351m2 = interfaceC4351m;
                    f25 = f17;
                    f26 = f18;
                    c12847u3 = c12847u2;
                    f27 = f19;
                    f28 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 100663296;
            if ((i15 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i37 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if (i38 != 0) {
                    f17 = 0.06f;
                }
                if (i16 != 0) {
                    f29 = 0.13f;
                } else {
                    f29 = f18;
                }
                if (i18 != 0) {
                    f19 = 1.0f;
                }
                if (i24 != 0) {
                    f34 = 1.0f;
                } else {
                    f34 = f24;
                }
                if (i26 != 0) {
                    c12847u4 = null;
                } else {
                    c12847u4 = c12847u2;
                }
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C12824e(5);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    function3 = (Function1) objM87133R11;
                } else {
                    function3 = function1;
                }
                if (i34 != 0) {
                    interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                } else {
                    interfaceC4351mM36052d = interfaceC4351m;
                }
                boolean zM87149e1111110 = c28655q2.m87149e(sliceData.size());
                if ((i15 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87149e1111110 | z13;
                objM87133R = c28655q2.m87133R();
                if (z14) {
                    objM87133R = new C12844r(sliceData.size(), f19);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C12844r(sliceData.size(), f19);
                    c28655q2.m87172p0(objM87133R);
                }
                c12844r = (C12844r) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                if (c12847u4 == null) {
                    numM35949r = null;
                } else {
                    numM35949r = m35949r(interfaceC28601c1);
                }
                boolean zM87153g1111112 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                i36 = i15 & 3670016;
                Modifier modifier1111113 = modifier3;
                if (i36 == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87153g1111112 | z15;
                objM87133R3 = c28655q2.m87133R();
                if (z16) {
                    if (c12847u4 != null) {
                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                    } else {
                        fM36081f = 1.0f;
                    }
                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    if (c12847u4 != null) {
                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                    } else {
                        fM36081f = 1.0f;
                    }
                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                    c28655q2.m87172p0(objM87133R3);
                }
                list = (List) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(list);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(list);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC11348f.m30553a(1.0f);
                    c28655q2.m87172p0(objM87133R7);
                }
                c11344e = (C11344e) objM87133R7;
                boolean zM87157i1111111 = c28655q2.m87157i(list);
                if (i36 == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87153g = zM87157i1111111 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                objM87133R8 = c28655q2.m87133R();
                if (zM87153g) {
                    c11344e2 = c11344e;
                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    c11344e2 = c11344e;
                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                    c28655q2.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                objM87133R9 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                    c28655q2.m87172p0(objM87133R9);
                }
                function4 = (Function1) objM87133R9;
                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                if (c12847u4 == null) {
                    c2314t2 = c2314t;
                    modifierM35931U = c2314t2;
                } else {
                    c2314t2 = c2314t;
                    modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                }
                Modifier modifierMo3471e1111110 = modifier1111113.mo3471e(modifierM35931U);
                InterfaceC39127r0 interfaceC39127r0M66763d1111110 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111110 = c28655q2.m87165m();
                Modifier modifierM118962N1111110 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e1111110);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                float f31111114 = f17;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1111110);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1111110);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1111110);
                Modifier modifierMo3401b1111110 = C1100b.f4583a.mo3401b(c2314t2);
                zM87157i = c28655q2.m87157i(c11344e2);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                        }
                    };
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                        }
                    };
                    c28655q2.m87172p0(objM87133R10);
                }
                m35953v(modifierMo3401b1111110, sliceData, f31111114, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                c28655q = c28655q2;
                InterfaceC4351m interfaceC4351m1111112 = interfaceC4351mM36052d;
                AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1111112, c28655q, true);
                f25 = f31111114;
                f26 = f29;
                f28 = f34;
                modifier2 = modifier1111113;
                interfaceC4351m2 = interfaceC4351m1111112;
                f27 = f19;
                function2 = function3;
                c12847u3 = c12847u4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                function2 = function1;
                interfaceC4351m2 = interfaceC4351m;
                f25 = f17;
                f26 = f18;
                c12847u3 = c12847u2;
                f27 = f19;
                f28 = f24;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        f24 = f16;
        i26 = i14 & 64;
        if (i26 != 0) {
            i15 |= 1572864;
            c12847u2 = c12847u;
        } else {
            c12847u2 = c12847u;
            if ((i13 & 1572864) == 0) {
                if (c28655q2.m87153g(c12847u2)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i15 |= i27;
            }
        }
        i28 = i14 & 128;
        if (i28 != 0) {
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i15 |= i29;
            }
            i34 = i14 & 256;
            if (i34 != 0) {
                if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(interfaceC4351m)) {
                        i35 = 67108864;
                    } else {
                        i35 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i35;
                }
                if ((i15 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        modifier3 = c2314t;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i38 != 0) {
                        f17 = 0.06f;
                    }
                    if (i16 != 0) {
                        f29 = 0.13f;
                    } else {
                        f29 = f18;
                    }
                    if (i18 != 0) {
                        f19 = 1.0f;
                    }
                    if (i24 != 0) {
                        f34 = 1.0f;
                    } else {
                        f34 = f24;
                    }
                    if (i26 != 0) {
                        c12847u4 = null;
                    } else {
                        c12847u4 = c12847u2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R11 = c28655q2.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C12824e(5);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        function3 = (Function1) objM87133R11;
                    } else {
                        function3 = function1;
                    }
                    if (i34 != 0) {
                        interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                    } else {
                        interfaceC4351mM36052d = interfaceC4351m;
                    }
                    boolean zM87149e1111111 = c28655q2.m87149e(sliceData.size());
                    if ((i15 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87149e1111111 | z13;
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12844r(sliceData.size(), f19);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c12844r = (C12844r) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    if (c12847u4 == null) {
                        numM35949r = null;
                    } else {
                        numM35949r = m35949r(interfaceC28601c1);
                    }
                    boolean zM87153g1111113 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                    i36 = i15 & 3670016;
                    Modifier modifier1111114 = modifier3;
                    if (i36 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87153g1111113 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        if (c12847u4 != null) {
                            fM36081f = c12847u4.getUnselectedSliceAlpha();
                        } else {
                            fM36081f = 1.0f;
                        }
                        objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    list = (List) objM87133R3;
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(list);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC11348f.m30553a(1.0f);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    c11344e = (C11344e) objM87133R7;
                    boolean zM87157i1111112 = c28655q2.m87157i(list);
                    if (i36 == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g = zM87157i1111112 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        c11344e2 = c11344e;
                        objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    if (c12847u4 == null) {
                        c2314t2 = c2314t;
                        modifierM35931U = c2314t2;
                    } else {
                        c2314t2 = c2314t;
                        modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                    }
                    Modifier modifierMo3471e1111111 = modifier1111114.mo3471e(modifierM35931U);
                    InterfaceC39127r0 interfaceC39127r0M66763d1111111 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111 = c28655q2.m87165m();
                    Modifier modifierM118962N1111111 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e1111111);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    float f31111115 = f17;
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1111111);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1111111);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1111111);
                    Modifier modifierMo3401b1111111 = C1100b.f4583a.mo3401b(c2314t2);
                    zM87157i = c28655q2.m87157i(c11344e2);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                            }
                        };
                        c28655q2.m87172p0(objM87133R10);
                    }
                    m35953v(modifierMo3401b1111111, sliceData, f31111115, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                    c28655q = c28655q2;
                    InterfaceC4351m interfaceC4351m1111113 = interfaceC4351mM36052d;
                    AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1111113, c28655q, true);
                    f25 = f31111115;
                    f26 = f29;
                    f28 = f34;
                    modifier2 = modifier1111114;
                    interfaceC4351m2 = interfaceC4351m1111113;
                    f27 = f19;
                    function2 = function3;
                    c12847u3 = c12847u4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    function2 = function1;
                    interfaceC4351m2 = interfaceC4351m;
                    f25 = f17;
                    f26 = f18;
                    c12847u3 = c12847u2;
                    f27 = f19;
                    f28 = f24;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i15 |= 100663296;
            if ((i15 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i37 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if (i38 != 0) {
                    f17 = 0.06f;
                }
                if (i16 != 0) {
                    f29 = 0.13f;
                } else {
                    f29 = f18;
                }
                if (i18 != 0) {
                    f19 = 1.0f;
                }
                if (i24 != 0) {
                    f34 = 1.0f;
                } else {
                    f34 = f24;
                }
                if (i26 != 0) {
                    c12847u4 = null;
                } else {
                    c12847u4 = c12847u2;
                }
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C12824e(5);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    function3 = (Function1) objM87133R11;
                } else {
                    function3 = function1;
                }
                if (i34 != 0) {
                    interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                } else {
                    interfaceC4351mM36052d = interfaceC4351m;
                }
                boolean zM87149e1111112 = c28655q2.m87149e(sliceData.size());
                if ((i15 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87149e1111112 | z13;
                objM87133R = c28655q2.m87133R();
                if (z14) {
                    objM87133R = new C12844r(sliceData.size(), f19);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C12844r(sliceData.size(), f19);
                    c28655q2.m87172p0(objM87133R);
                }
                c12844r = (C12844r) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                if (c12847u4 == null) {
                    numM35949r = null;
                } else {
                    numM35949r = m35949r(interfaceC28601c1);
                }
                boolean zM87153g1111114 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                i36 = i15 & 3670016;
                Modifier modifier1111115 = modifier3;
                if (i36 == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87153g1111114 | z15;
                objM87133R3 = c28655q2.m87133R();
                if (z16) {
                    if (c12847u4 != null) {
                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                    } else {
                        fM36081f = 1.0f;
                    }
                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    if (c12847u4 != null) {
                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                    } else {
                        fM36081f = 1.0f;
                    }
                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                    c28655q2.m87172p0(objM87133R3);
                }
                list = (List) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(list);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(list);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC11348f.m30553a(1.0f);
                    c28655q2.m87172p0(objM87133R7);
                }
                c11344e = (C11344e) objM87133R7;
                boolean zM87157i1111113 = c28655q2.m87157i(list);
                if (i36 == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87153g = zM87157i1111113 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                objM87133R8 = c28655q2.m87133R();
                if (zM87153g) {
                    c11344e2 = c11344e;
                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    c11344e2 = c11344e;
                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                    c28655q2.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                objM87133R9 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                    c28655q2.m87172p0(objM87133R9);
                }
                function4 = (Function1) objM87133R9;
                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                if (c12847u4 == null) {
                    c2314t2 = c2314t;
                    modifierM35931U = c2314t2;
                } else {
                    c2314t2 = c2314t;
                    modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                }
                Modifier modifierMo3471e1111112 = modifier1111115.mo3471e(modifierM35931U);
                InterfaceC39127r0 interfaceC39127r0M66763d1111112 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111112 = c28655q2.m87165m();
                Modifier modifierM118962N1111112 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e1111112);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                float f31111116 = f17;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1111112);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1111112);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1111112);
                Modifier modifierMo3401b1111112 = C1100b.f4583a.mo3401b(c2314t2);
                zM87157i = c28655q2.m87157i(c11344e2);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                        }
                    };
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                        }
                    };
                    c28655q2.m87172p0(objM87133R10);
                }
                m35953v(modifierMo3401b1111112, sliceData, f31111116, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                c28655q = c28655q2;
                InterfaceC4351m interfaceC4351m1111114 = interfaceC4351mM36052d;
                AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1111114, c28655q, true);
                f25 = f31111116;
                f26 = f29;
                f28 = f34;
                modifier2 = modifier1111115;
                interfaceC4351m2 = interfaceC4351m1111114;
                f27 = f19;
                function2 = function3;
                c12847u3 = c12847u4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                function2 = function1;
                interfaceC4351m2 = interfaceC4351m;
                f25 = f17;
                f26 = f18;
                c12847u3 = c12847u2;
                f27 = f19;
                f28 = f24;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 12582912;
        i34 = i14 & 256;
        if (i34 != 0) {
            if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(interfaceC4351m)) {
                    i35 = 67108864;
                } else {
                    i35 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i35;
            }
            if ((i15 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i37 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier;
                }
                if (i38 != 0) {
                    f17 = 0.06f;
                }
                if (i16 != 0) {
                    f29 = 0.13f;
                } else {
                    f29 = f18;
                }
                if (i18 != 0) {
                    f19 = 1.0f;
                }
                if (i24 != 0) {
                    f34 = 1.0f;
                } else {
                    f34 = f24;
                }
                if (i26 != 0) {
                    c12847u4 = null;
                } else {
                    c12847u4 = c12847u2;
                }
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C12824e(5);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    function3 = (Function1) objM87133R11;
                } else {
                    function3 = function1;
                }
                if (i34 != 0) {
                    interfaceC4351mM36052d = C12843q.f44027a.m36052d();
                } else {
                    interfaceC4351mM36052d = interfaceC4351m;
                }
                boolean zM87149e1111113 = c28655q2.m87149e(sliceData.size());
                if ((i15 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87149e1111113 | z13;
                objM87133R = c28655q2.m87133R();
                if (z14) {
                    objM87133R = new C12844r(sliceData.size(), f19);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C12844r(sliceData.size(), f19);
                    c28655q2.m87172p0(objM87133R);
                }
                c12844r = (C12844r) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                if (c12847u4 == null) {
                    numM35949r = null;
                } else {
                    numM35949r = m35949r(interfaceC28601c1);
                }
                boolean zM87153g1111115 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
                i36 = i15 & 3670016;
                Modifier modifier1111116 = modifier3;
                if (i36 == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87153g1111115 | z15;
                objM87133R3 = c28655q2.m87133R();
                if (z16) {
                    if (c12847u4 != null) {
                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                    } else {
                        fM36081f = 1.0f;
                    }
                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    if (c12847u4 != null) {
                        fM36081f = c12847u4.getUnselectedSliceAlpha();
                    } else {
                        fM36081f = 1.0f;
                    }
                    objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                    c28655q2.m87172p0(objM87133R3);
                }
                list = (List) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(list);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(list);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC11348f.m30553a(1.0f);
                    c28655q2.m87172p0(objM87133R7);
                }
                c11344e = (C11344e) objM87133R7;
                boolean zM87157i1111114 = c28655q2.m87157i(list);
                if (i36 == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87153g = zM87157i1111114 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
                objM87133R8 = c28655q2.m87133R();
                if (zM87153g) {
                    c11344e2 = c11344e;
                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    c11344e2 = c11344e;
                    objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                    c28655q2.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
                zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
                objM87133R9 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                    c28655q2.m87172p0(objM87133R9);
                }
                function4 = (Function1) objM87133R9;
                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                if (c12847u4 == null) {
                    c2314t2 = c2314t;
                    modifierM35931U = c2314t2;
                } else {
                    c2314t2 = c2314t;
                    modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
                }
                Modifier modifierMo3471e1111113 = modifier1111116.mo3471e(modifierM35931U);
                InterfaceC39127r0 interfaceC39127r0M66763d1111113 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111113 = c28655q2.m87165m();
                Modifier modifierM118962N1111113 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e1111113);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                float f31111117 = f17;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1111113);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1111113);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1111113);
                Modifier modifierMo3401b1111113 = C1100b.f4583a.mo3401b(c2314t2);
                zM87157i = c28655q2.m87157i(c11344e2);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                        }
                    };
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                        }
                    };
                    c28655q2.m87172p0(objM87133R10);
                }
                m35953v(modifierMo3401b1111113, sliceData, f31111117, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
                c28655q = c28655q2;
                InterfaceC4351m interfaceC4351m1111115 = interfaceC4351mM36052d;
                AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1111115, c28655q, true);
                f25 = f31111117;
                f26 = f29;
                f28 = f34;
                modifier2 = modifier1111116;
                interfaceC4351m2 = interfaceC4351m1111115;
                f27 = f19;
                function2 = function3;
                c12847u3 = c12847u4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                function2 = function1;
                interfaceC4351m2 = interfaceC4351m;
                f25 = f17;
                f26 = f18;
                c12847u3 = c12847u2;
                f27 = f19;
                f28 = f24;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 100663296;
        if ((i15 & 38347923) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i37 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier;
            }
            if (i38 != 0) {
                f17 = 0.06f;
            }
            if (i16 != 0) {
                f29 = 0.13f;
            } else {
                f29 = f18;
            }
            if (i18 != 0) {
                f19 = 1.0f;
            }
            if (i24 != 0) {
                f34 = 1.0f;
            } else {
                f34 = f24;
            }
            if (i26 != 0) {
                c12847u4 = null;
            } else {
                c12847u4 = c12847u2;
            }
            c28676v0 = C28635l.f115821a;
            if (i28 != 0) {
                objM87133R11 = c28655q2.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C12824e(5);
                    c28655q2.m87172p0(objM87133R11);
                }
                function3 = (Function1) objM87133R11;
            } else {
                function3 = function1;
            }
            if (i34 != 0) {
                interfaceC4351mM36052d = C12843q.f44027a.m36052d();
            } else {
                interfaceC4351mM36052d = interfaceC4351m;
            }
            boolean zM87149e1111114 = c28655q2.m87149e(sliceData.size());
            if ((i15 & 57344) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87149e1111114 | z13;
            objM87133R = c28655q2.m87133R();
            if (z14) {
                objM87133R = new C12844r(sliceData.size(), f19);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C12844r(sliceData.size(), f19);
                c28655q2.m87172p0(objM87133R);
            }
            c12844r = (C12844r) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            if (c12847u4 == null) {
                numM35949r = null;
            } else {
                numM35949r = m35949r(interfaceC28601c1);
            }
            boolean zM87153g1111116 = c28655q2.m87153g(c12844r) | c28655q2.m87153g(numM35949r);
            i36 = i15 & 3670016;
            Modifier modifier1111117 = modifier3;
            if (i36 == 1048576) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = zM87153g1111116 | z15;
            objM87133R3 = c28655q2.m87133R();
            if (z16) {
                if (c12847u4 != null) {
                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                } else {
                    fM36081f = 1.0f;
                }
                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                c28655q2.m87172p0(objM87133R3);
            } else {
                if (c12847u4 != null) {
                    fM36081f = c12847u4.getUnselectedSliceAlpha();
                } else {
                    fM36081f = 1.0f;
                }
                objM87133R3 = AbstractC12845s.m36058a(c12844r, numM35949r, fM36081f);
                c28655q2.m87172p0(objM87133R3);
            }
            list = (List) objM87133R3;
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(list);
                c28655q2.m87172p0(objM87133R4);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R4;
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(list);
                c28655q2.m87172p0(objM87133R5);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R5;
            objM87133R6 = c28655q2.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R6);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R6;
            objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC11348f.m30553a(1.0f);
                c28655q2.m87172p0(objM87133R7);
            }
            c11344e = (C11344e) objM87133R7;
            boolean zM87157i1111115 = c28655q2.m87157i(list);
            if (i36 == 1048576) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM87153g = zM87157i1111115 | z17 | c28655q2.m87153g(numM35949r) | c28655q2.m87157i(c11344e);
            objM87133R8 = c28655q2.m87133R();
            if (zM87153g) {
                c11344e2 = c11344e;
                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                c28655q2.m87172p0(objM87133R8);
            } else {
                c11344e2 = c11344e;
                objM87133R8 = new a(list, c12847u4, numM35949r, c11344e2, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, null);
                c28655q2.m87172p0(objM87133R8);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, list);
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function3, c28655q2);
            zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F);
            objM87133R9 = c28655q2.m87133R();
            if (zM87153g2) {
                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                c28655q2.m87172p0(objM87133R9);
            } else {
                objM87133R9 = new C1024j(2, interfaceC28601c1, interfaceC28601c1M87238F);
                c28655q2.m87172p0(objM87133R9);
            }
            function4 = (Function1) objM87133R9;
            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
            if (c12847u4 == null) {
                c2314t2 = c2314t;
                modifierM35931U = c2314t2;
            } else {
                c2314t2 = c2314t;
                modifierM35931U = m35931U(c2314t2, c12844r, sliceData, c12847u4, interfaceC29805a, f17, f29, f34, function4);
            }
            Modifier modifierMo3471e1111114 = modifier1111117.mo3471e(modifierM35931U);
            InterfaceC39127r0 interfaceC39127r0M66763d1111114 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111114 = c28655q2.m87165m();
            Modifier modifierM118962N1111114 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e1111114);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            float f31111118 = f17;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d1111114);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m1111114);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N1111114);
            Modifier modifierMo3401b1111114 = C1100b.f4583a.mo3401b(c2314t2);
            zM87157i = c28655q2.m87157i(c11344e2);
            objM87133R10 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                    }
                };
                c28655q2.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new InterfaceC4339a() { // from class: e81.z
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return AbstractC12823d0.m35947p(c11344e2, interfaceC28601c2, interfaceC28601c3);
                    }
                };
                c28655q2.m87172p0(objM87133R10);
            }
            m35953v(modifierMo3401b1111114, sliceData, f31111118, f29, f34, (InterfaceC4339a) objM87133R10, c28655q2, (i15 & 8176) | ((i15 >> 3) & 57344));
            c28655q = c28655q2;
            InterfaceC4351m interfaceC4351m1111116 = interfaceC4351mM36052d;
            AbstractC11895b.m32007z((i15 >> 24) & 14, interfaceC4351m1111116, c28655q, true);
            f25 = f31111118;
            f26 = f29;
            f28 = f34;
            modifier2 = modifier1111117;
            interfaceC4351m2 = interfaceC4351m1111116;
            f27 = f19;
            function2 = function3;
            c12847u3 = c12847u4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier2 = modifier;
            function2 = function1;
            interfaceC4351m2 = interfaceC4351m;
            f25 = f17;
            f26 = f18;
            c12847u3 = c12847u2;
            f27 = f19;
            f28 = f24;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: e81.a0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC12823d0.m35948q(modifier2, sliceData, f25, f26, f27, f28, c12847u3, function2, interfaceC4351m2, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m35940i(Integer num) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final List<C12849w> m35941j(InterfaceC28601c1 interfaceC28601c1) {
        return (List) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m35942k(InterfaceC28601c1 interfaceC28601c1, List<C12849w> list) {
        interfaceC28601c1.setValue(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Integer m35943l(InterfaceC28601c1 interfaceC28601c1) {
        return (Integer) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m35944m(InterfaceC28601c1 interfaceC28601c1, Integer num) {
        interfaceC28601c1.setValue(num);
    }

    /* JADX INFO: renamed from: n */
    private static final Function1 m35945n(InterfaceC28670t2 interfaceC28670t2) {
        return (Function1) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m35946o(InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, Integer num) {
        if (!AbstractC22676k.m65745e(m35949r(interfaceC28601c1), num)) {
            m35950s(interfaceC28601c1, num);
            m35945n(interfaceC28670t2).invoke(num);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final List m35947p(C11344e c11344e, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        return AbstractC12845s.m36060c(m35951t(interfaceC28601c1), m35941j(interfaceC28601c2), ((Number) c11344e.m30549e()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m35948q(Modifier modifier, List list, float f13, float f14, float f15, float f16, C12847u c12847u, Function1 function1, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m35939h(modifier, list, f13, f14, f15, f16, c12847u, function1, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final Integer m35949r(InterfaceC28601c1 interfaceC28601c1) {
        return (Integer) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: s */
    private static final void m35950s(InterfaceC28601c1 interfaceC28601c1, Integer num) {
        interfaceC28601c1.setValue(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final List<C12849w> m35951t(InterfaceC28601c1 interfaceC28601c1) {
        return (List) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m35952u(InterfaceC28601c1 interfaceC28601c1, List<C12849w> list) {
        interfaceC28601c1.setValue(list);
    }

    /* JADX INFO: renamed from: v */
    private static final void m35953v(Modifier modifier, List<C12831h0> list, float f13, float f14, float f15, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        float f16;
        float f17;
        float f18;
        InterfaceC4339a interfaceC4339a2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1379288058);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(list) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            f16 = f13;
            i14 |= c28655q.m87147d(f16) ? 256 : 128;
        } else {
            f16 = f13;
        }
        if ((i13 & 3072) == 0) {
            f17 = f14;
            i14 |= c28655q.m87147d(f17) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            f17 = f14;
        }
        if ((i13 & 24576) == 0) {
            f18 = f15;
            i14 |= c28655q.m87147d(f18) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            f18 = f15;
        }
        if ((196608 & i13) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            i14 |= c28655q.m87157i(interfaceC4339a2) ? 131072 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            boolean zM87157i = ((458752 & i15) == 131072) | c28655q.m87157i(list) | ((i15 & 896) == 256) | ((i15 & 7168) == 2048) | ((57344 & i15) == 16384);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                C12819b0 c12819b0 = new C12819b0(interfaceC4339a2, list, f16, f17, f18);
                c28655q.m87172p0(c12819b0);
                objM87133R = c12819b0;
            }
            AbstractC21478l0.m60421a(modifier, (Function1) objM87133R, c28655q, i15 & 14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12821c0(modifier, list, f13, f14, f15, interfaceC4339a, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m35954w(InterfaceC4339a interfaceC4339a, List list, float f13, float f14, float f15, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        List list2 = (List) interfaceC4339a.invoke();
        C12846t c12846t = new C12846t(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) / 2.0f, list.size(), f13, f14, 0.0f, 16, null);
        if (m35927Q(c12846t)) {
            int i13 = 0;
            while (i13 < list.size()) {
                C12849w c12849w = (C12849w) AbstractC25265s.m74102I0(i13, list2);
                float fM36087a = c12849w != null ? c12849w.getAlpha() : 1.0f;
                int i14 = i13 + 1;
                while (i14 < list.size()) {
                    C12849w c12849w2 = (C12849w) AbstractC25265s.m74102I0(i14, list2);
                    if (!AbstractC22676k.m65743c(c12849w2 != null ? Float.valueOf(c12849w2.getAlpha()) : null, fM36087a)) {
                        break;
                    }
                    i14++;
                }
                if (fM36087a >= 1.0f) {
                    while (i13 < i14) {
                        C12849w c12849w3 = (C12849w) AbstractC25265s.m74102I0(i13, list2);
                        if (c12849w3 != null) {
                            C12831h0 c12831h0 = (C12831h0) list.get(i13);
                            if (m35928R(i13, list, f15)) {
                                m35921K(Canvas, c12846t, c12831h0.getColor(), c12849w3);
                                m35924N(Canvas, c12846t, c12831h0.getColor(), c12849w3);
                            }
                        }
                        i13++;
                    }
                } else {
                    InterfaceC17915v interfaceC17915vM716w = Canvas.mo744t0().m716w();
                    C16618c c16618c = new C16618c(0.0f, 0.0f, Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)), Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)));
                    C17887h c17887hM51522j = AbstractC17918w0.m51522j();
                    c17887hM51522j.m51445c(fM36087a);
                    interfaceC17915vM716w.mo51425p(c16618c, c17887hM51522j);
                    while (i13 < i14) {
                        C12849w c12849w4 = (C12849w) AbstractC25265s.m74102I0(i13, list2);
                        if (c12849w4 != null) {
                            C12831h0 c12831h1 = (C12831h0) list.get(i13);
                            if (m35928R(i13, list, f15)) {
                                m35921K(Canvas, c12846t, c12831h1.getColor(), c12849w4);
                                m35924N(Canvas, c12846t, c12831h1.getColor(), c12849w4);
                            }
                        }
                        i13++;
                    }
                    interfaceC17915vM716w.mo51417g();
                }
                i13 = i14;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m35955x(Modifier modifier, List list, float f13, float f14, float f15, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m35953v(modifier, list, f13, f14, f15, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m35956y(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1586260542);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            long j7 = C17919x.f69629f;
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h("60", null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN3(), null, c28655q, 390, 0, 196602);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC30795n.m94707h("Biomarkers", null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getBtS(), null, c28655q, 6, 0, 196602);
            c28655q = c28655q;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.CARET_FORWARD.toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(((float) 3.5d) * 4, c2314t), c38072d.m121949b(c28655q, 6).getWhite70(), c28655q, 432, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9809a(i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m35957z(int i13, Composer composer, int i14) {
        m35956y(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
