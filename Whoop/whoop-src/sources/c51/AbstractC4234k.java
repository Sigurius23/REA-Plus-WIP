package c51;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bb2.C2931g;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import be1.C3169c;
import c31.C3929m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import d51.AbstractC11713a;
import i93.InterfaceC18280f;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import l83.C23471q;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C21061j;
import p000.C2175b;
import p000.C29656q;
import p003a1.C0103b;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0237p;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p014aj.C0929d;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3760m1;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p088dc.AbstractC11895b;
import p097ds.AbstractC12313p;
import p098dt.AbstractC12350b;
import p208i2.AbstractC17876d;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17891j;
import p208i2.C17896l0;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.InterfaceC17910s0;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p698au1.C2061f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import z41.AbstractC40075j;
import zy2.C41230c;

/* JADX INFO: renamed from: c51.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u001aS\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b \u0010!\u001a\u001f\u0010\"\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\"\u0010\u0018\u001a7\u0010&\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'\u001a)\u0010)\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0(2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b)\u0010*\u001a4\u0010.\u001a\u00020\t2\u0012\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0,0+2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b.\u0010/¨\u00065²\u0006\u000e\u00100\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00101\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\f\u00102\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u00103\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\u000e\u00104\u001a\u00020#8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "textContainerModifier", "subtitleModifier", "amoebaAnimationModifier", "backgroundModifier", "centerShadowModifier", "Lc51/s;", "viewState", "Ll83/a0;", "q", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc51/s;Landroidx/compose/runtime/Composer;II)V", "D", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Li2/x;", "targetStartColor", "Lp1/t2;", "f0", "(JLandroidx/compose/runtime/Composer;I)Lp1/t2;", "G", "(Lc51/s;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Li2/t;", "colorBrush", "Q", "(Lc51/s;Li2/t;Landroidx/compose/runtime/Composer;I)V", "Li2/s0;", "outline", "", "scale", "N", "(Lc51/s;Li2/s0;Li2/t;FLandroidx/compose/runtime/Composer;I)V", "advancedEdgeFadePath", "J", "(Lc51/s;Li2/s0;Li2/t;Landroidx/compose/runtime/Composer;I)V", "V", "", "widthPx", "heightPx", "h0", "(Lc51/s;IILi2/s0;Li2/s0;)V", "Ll83/q;", "g0", "(Lc51/s;Landroidx/compose/runtime/Composer;I)Ll83/q;", "", "Lp1/c1;", "pointScalarValues", "e0", "(Ljava/util/List;Lc51/s;FLq83/d;)Ljava/lang/Object;", "segmentCount", "targetEndColor", "animatedStartColor", "animatedEndColor", "animationIteration", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4234k {

    /* JADX INFO: renamed from: c51.k$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.amoeba.presentation.AmoebaKt$Amoeba$1$1", m100430f = "Amoeba.kt", m100431l = {108, 111}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f17162w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4242s f17163x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<InterfaceC28601c1> f17164y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ float f17165z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C4242s c4242s, List<? extends InterfaceC28601c1> list, float f13, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f17163x = c4242s;
            this.f17164y = list;
            this.f17165z = f13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f17163x, this.f17164y, this.f17165z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
        
            if (c51.AbstractC4234k.m13163e0(r7, r1, r3, r6) == r0) goto L21;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.f17162w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r7)
                goto L68
            L10:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L18:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L59
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                c51.s r7 = r6.f17163x
                c51.r r7 = r7.getTransition()
                if (r7 == 0) goto L59
                java.util.List<p1.c1> r7 = r6.f17164y
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L2f:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L46
                java.lang.Object r1 = r7.next()
                p1.c1 r1 = (p390p1.InterfaceC28601c1) r1
                java.lang.Float r4 = new java.lang.Float
                r5 = -1056964608(0xffffffffc1000000, float:-8.0)
                r4.<init>(r5)
                r1.setValue(r4)
                goto L2f
            L46:
                c51.s r7 = r6.f17163x
                c51.r r7 = r7.getTransition()
                long r4 = r7.getEaseInDuration()
                r6.f17162w = r3
                java.lang.Object r7 = bc3.AbstractC3034m0.m8783c(r4, r6)
                if (r7 != r0) goto L59
                goto L67
            L59:
                java.util.List<p1.c1> r7 = r6.f17164y
                c51.s r1 = r6.f17163x
                float r3 = r6.f17165z
                r6.f17162w = r2
                java.lang.Object r7 = c51.AbstractC4234k.m13161d0(r7, r1, r3, r6)
                if (r7 != r0) goto L68
            L67:
                return r0
            L68:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: c51.AbstractC4234k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: c51.k$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.amoeba.presentation.AmoebaKt$Amoeba$2$1", m100430f = "Amoeba.kt", m100431l = {116}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f17166w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4242s f17167x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f17168y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4242s c4242s, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f17167x = c4242s;
            this.f17168y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f17167x, this.f17168y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f17166w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f17167x.getTransition() != null) {
                    long jM13230a = this.f17167x.getTransition().getEaseInDuration();
                    this.f17166w = 1;
                    if (AbstractC3034m0.m8783c(jM13230a, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC4234k.m13128A(this.f17168y, this.f17167x.getOutline().getSegmentCount());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c51.k$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.amoeba.presentation.AmoebaKt$Amoeba$3$1", m100430f = "Amoeba.kt", m100431l = {123}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f17169w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4242s f17170x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C4242s c4242s, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f17170x = c4242s;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f17170x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f17169w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f17170x.getTransition() != null) {
                    long jM13230a = this.f17170x.getTransition().getEaseInDuration();
                    this.f17169w = 1;
                    if (AbstractC3034m0.m8783c(jM13230a, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c51.k$d */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.amoeba.presentation.AmoebaKt$Amoeba$4$1", m100430f = "Amoeba.kt", m100431l = {159, 162}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f17171E;

        /* JADX INFO: renamed from: w */
        long f17172w;

        /* JADX INFO: renamed from: x */
        int f17173x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C4242s f17174y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f17175z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C4242s c4242s, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f17174y = c4242s;
            this.f17175z = interfaceC28601c1;
            this.f17171E = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f17174y, this.f17175z, this.f17171E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
        
            if (bc3.AbstractC3034m0.m8782b(r3, r8) == r0) goto L18;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 209
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c51.AbstractC4234k.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: c51.k$e */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.amoeba.presentation.AmoebaKt$Particles$1$1", m100430f = "Amoeba.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f17176w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4242s f17177x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f17178y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C4242s c4242s, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f17177x = c4242s;
            this.f17178y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f17177x, this.f17178y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f17176w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f17177x.getTransition() != null) {
                AbstractC4234k.m13146S(this.f17178y, AbstractC4234k.m13145R(this.f17178y) + 1);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c51.k$f */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.amoeba.presentation.AmoebaKt", m100430f = "Amoeba.kt", m100431l = {360}, m100432m = "changePointScalarsByGroup", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f17179E;

        /* JADX INFO: renamed from: F */
        int f17180F;

        /* JADX INFO: renamed from: w */
        Object f17181w;

        /* JADX INFO: renamed from: x */
        Object f17182x;

        /* JADX INFO: renamed from: y */
        Object f17183y;

        /* JADX INFO: renamed from: z */
        float f17184z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f17179E = obj;
            this.f17180F |= Integer.MIN_VALUE;
            return AbstractC4234k.m13163e0(null, null, 0.0f, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m13128A(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final InterfaceC17910s0 m13129B(InterfaceC39171c interfaceC39171c, List list, int i13, int i14, int i15, InterfaceC28601c1 interfaceC28601c1) {
        List listM74156w1 = AbstractC25265s.m74156w1(list, m13187z(interfaceC28601c1));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM74156w1, 10));
        Iterator it = listM74156w1.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(interfaceC39171c.mo743q0(((Number) ((InterfaceC28670t2) it.next()).getValue()).floatValue())));
        }
        try {
            return AbstractC11713a.INSTANCE.m31297c(arrayList, i13, i14, i15);
        } catch (IllegalArgumentException unused) {
            return AbstractC17897m.m51478a();
        }
    }

    /* JADX INFO: renamed from: C */
    private static final InterfaceC17910s0 m13130C(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC17910s0) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: D */
    private static final void m13131D(Modifier modifier, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(900484820);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierMo3471e = AbstractC12350b.m34565N(1.15f, AbstractC1102d.m3407d(1.0f, C2314t.f9131w)).mo3471e(modifier);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C3929m(27);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierMo3471e, (Function1) objM87133R, c28655q, 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2061f(modifier, i13, 3, (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m13132E(InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        C17909s c17909s = AbstractC17911t.f69612b;
        Float fValueOf = Float.valueOf(0.0f);
        long j7 = C17919x.f69625b;
        InterfaceC22131e.m63375G(Canvas, C17909s.m51490h(c17909s, new C23465k[]{new C23465k(fValueOf, new C17919x(j7)), new C23465k(Float.valueOf(0.7f), new C17919x(j7)), new C23465k(Float.valueOf(1.0f), new C17919x(AbstractC17918w0.m51515c(16777215)))}, 0L, 0.0f, 14), 0.0f, 0L, 1.0f, null, 118);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m13133F(Modifier modifier, int i13, Composer composer, int i14) {
        m13131D(modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final void m13134G(C4242s c4242s, Modifier modifier, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-261339430);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c4242s) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier);
            boolean zM87157i = c28655q.m87157i(c4242s);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C0103b(c4242s, 27);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22989q.m66760a(AbstractC1125a.m3480c(modifierM3407d, (Function1) objM87133R), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C41230c(c4242s, modifier, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m13135H(C4242s c4242s, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        InterfaceC22131e.m63375G(drawWithContent, c4242s.getCenterShadowBrush(), 0.0f, 0L, 0.0f, null, 126);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m13136I(C4242s c4242s, Modifier modifier, int i13, Composer composer, int i14) {
        m13134G(c4242s, modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final void m13137J(C4242s c4242s, InterfaceC17910s0 interfaceC17910s0, AbstractC17911t abstractC17911t, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-144714526);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c4242s) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC17910s0) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(abstractC17911t) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float fM13122d = c4242s.getEdgeFade().getBaseAlpha();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM107879c = AbstractC34132o.m107879c(fM13122d, c2314t);
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM107879c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM34301s = AbstractC12313p.m34301s(c4242s.getEdgeFade().getBlurRadius(), c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM34301s);
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
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            boolean zM87157i = c28655q.m87157i(interfaceC17910s0) | ((i14 & 896) == 256) | c28655q.m87157i(c4242s);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C29656q(interfaceC17910s0, abstractC17911t, c4242s, 16);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3480c = AbstractC1125a.m3480c(modifierM3407d, (Function1) objM87133R);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C3929m(28);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC21478l0.m60421a(modifierM3480c, (Function1) objM87133R2, c28655q, 48);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(c4242s, interfaceC17910s0, abstractC17911t, i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m13138K(InterfaceC17910s0 interfaceC17910s0, AbstractC17911t abstractC17911t, C4242s c4242s, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        InterfaceC22131e.m63378L(drawWithContent, interfaceC17910s0, abstractC17911t, 0.0f, new C22135i(c4242s.getEdgeFade().getStrokeWidth(), 0.0f, 0, 0, null, 30), 52);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m13139L(InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m13140M(C4242s c4242s, InterfaceC17910s0 interfaceC17910s0, AbstractC17911t abstractC17911t, int i13, Composer composer, int i14) {
        m13137J(c4242s, interfaceC17910s0, abstractC17911t, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final void m13141N(C4242s c4242s, InterfaceC17910s0 interfaceC17910s0, AbstractC17911t abstractC17911t, float f13, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(140334495);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c4242s) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC17910s0) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(abstractC17911t) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87147d(f13) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            boolean zM87157i = ((i14 & 896) == 256) | c28655q.m87157i(interfaceC17910s0) | c28655q.m87157i(c4242s) | ((i14 & 7168) == 2048);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C4227d(interfaceC17910s0, abstractC17911t, c4242s, f13);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3407d, (Function1) objM87133R, c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4233j(c4242s, interfaceC17910s0, abstractC17911t, f13, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m13142O(InterfaceC17910s0 interfaceC17910s0, AbstractC17911t abstractC17911t, C4242s c4242s, float f13, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        InterfaceC22131e.m63378L(Canvas, interfaceC17910s0, abstractC17911t, 0.0f, new C22135i(Canvas.mo743q0(c4242s.getOutline().getStrokeWidth()) * f13, 0.0f, 0, 0, null, 30), 52);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m13143P(C4242s c4242s, InterfaceC17910s0 interfaceC17910s0, AbstractC17911t abstractC17911t, float f13, int i13, Composer composer, int i14) {
        m13141N(c4242s, interfaceC17910s0, abstractC17911t, f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    private static final void m13144Q(C4242s c4242s, AbstractC17911t abstractC17911t, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2046561369);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c4242s) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(abstractC17911t) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11895b.m32005x(0, c28655q);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            boolean zM87157i = c28655q.m87157i(c4242s);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new e(c4242s, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c4242s);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R3 = c28655q.m87133R();
            if (z4 || objM87133R3 == c28676v0) {
                objM87133R3 = new C4231h(abstractC17911t, 0);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM3480c = AbstractC1125a.m3480c(modifierM3407d, (Function1) objM87133R3);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3480c);
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
            AbstractC40075j.m128451d(AbstractC1102d.m3407d(1.0f, c2314t), c4242s.getParticles().getParticleSystemSettings(), m13145R(interfaceC28601c1), null, 0.0f, c28655q, 6, 24);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4232i(c4242s, abstractC17911t, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final int m13145R(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final void m13146S(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m13147T(AbstractC17911t abstractC17911t, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        Canvas canvasM51433a = AbstractC17876d.m51433a(c0238p0.f815w.f85852x.m716w());
        canvasM51433a.saveLayer(null, null);
        c0238p0.m728a();
        InterfaceC22131e.m63385u(drawWithContent, abstractC17911t, 0L, 0L, 0.99f, null, 5, 54);
        canvasM51433a.restore();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m13148U(C4242s c4242s, AbstractC17911t abstractC17911t, int i13, Composer composer, int i14) {
        m13144Q(c4242s, abstractC17911t, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: V */
    private static final void m13149V(C4242s c4242s, AbstractC17911t abstractC17911t, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-896905324);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c4242s) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(abstractC17911t) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            boolean zM87157i = c28655q.m87157i(c4242s) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C3169c(10, c4242s, abstractC17911t);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3407d, (Function1) objM87133R, c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4232i(c4242s, abstractC17911t, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m13150W(C4242s c4242s, AbstractC17911t abstractC17911t, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        InterfaceC22131e.m63385u(Canvas, c4242s.getPrimitiveEdgeFade().getBrush(), 0L, 0L, 0.0f, null, 5, 62);
        InterfaceC22131e.m63385u(Canvas, abstractC17911t, 0L, 0L, 0.0f, null, 5, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m13151X(C4242s c4242s, AbstractC17911t abstractC17911t, int i13, Composer composer, int i14) {
        m13149V(c4242s, abstractC17911t, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[LOOP:1: B:27:0x0083->B:29:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bb -> B:33:0x00be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:35:0x007a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: e0 */
    public static final java.lang.Object m13163e0(java.util.List<? extends p390p1.InterfaceC28601c1> r9, c51.C4242s r10, float r11, q83.InterfaceC30057d<? super l83.C23454a0> r12) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c51.AbstractC4234k.m13163e0(java.util.List, c51.s, float, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: f0 */
    private static final InterfaceC28670t2 m13165f0(long j7, Composer composer, int i13) {
        return AbstractC3760m1.m11569a(j7, AbstractC11348f.m30574v(500, 0, AbstractC11333b0.f36312c, 2), null, composer, i13 & 14, 12);
    }

    /* JADX INFO: renamed from: g0 */
    private static final C23471q m13167g0(C4242s c4242s, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(645603025);
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        C23471q c23471q = new C23471q(Integer.valueOf(interfaceC39171c.mo724F(c4242s.m13251s())), Integer.valueOf(interfaceC39171c.mo724F(c4242s.m13250r())), Integer.valueOf(interfaceC39171c.mo724F(c4242s.getRadius())));
        c28655q.m87173q(false);
        return c23471q;
    }

    /* JADX INFO: renamed from: h0 */
    private static final void m13169h0(C4242s c4242s, int i13, int i14, InterfaceC17910s0 interfaceC17910s0, InterfaceC17910s0 interfaceC17910s1) {
        float[] fArrM51471a = C17896l0.m51471a();
        float fM13121c = c4242s.getEdgeFade().getAddedScale();
        float f13 = fM13121c / 2;
        C17896l0.m51477g(fArrM51471a, (-i13) * f13, (-i14) * f13);
        float f14 = fM13121c + 1.0f;
        C17896l0.m51475e(fArrM51471a, f14, f14);
        ((C17891j) interfaceC17910s0).m51457d(interfaceC17910s1, 0L);
        C17891j c17891j = (C17891j) interfaceC17910s0;
        if (c17891j.f69590d == null) {
            c17891j.f69590d = new Matrix();
        }
        Matrix matrix = c17891j.f69590d;
        AbstractC22676k.m65747g(matrix);
        AbstractC17918w0.m51499A(matrix, fArrM51471a);
        Path path = c17891j.f69587a;
        Matrix matrix2 = c17891j.f69590d;
        AbstractC22676k.m65747g(matrix2);
        path.transform(matrix2);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014c A[LOOP:0: B:100:0x014a->B:101:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:103:0x0163  */
    /* JADX WARN: Code duplicated, block: B:106:0x0182 A[LOOP:1: B:105:0x0180->B:106:0x0182, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0206  */
    /* JADX WARN: Code duplicated, block: B:112:0x022d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0242  */
    /* JADX WARN: Code duplicated, block: B:116:0x0277 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x0279  */
    /* JADX WARN: Code duplicated, block: B:120:0x029c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x029e  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x02db  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:137:0x0318  */
    /* JADX WARN: Code duplicated, block: B:138:0x032c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0359 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x035b  */
    /* JADX WARN: Code duplicated, block: B:145:0x039c  */
    /* JADX WARN: Code duplicated, block: B:146:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:149:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:152:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:156:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:157:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:160:0x0401  */
    /* JADX WARN: Code duplicated, block: B:162:0x040f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0422  */
    /* JADX WARN: Code duplicated, block: B:166:0x042e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0453  */
    /* JADX WARN: Code duplicated, block: B:170:0x0457  */
    /* JADX WARN: Code duplicated, block: B:173:0x0464  */
    /* JADX WARN: Code duplicated, block: B:175:0x0472  */
    /* JADX WARN: Code duplicated, block: B:178:0x047e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0490  */
    /* JADX WARN: Code duplicated, block: B:181:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:184:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0101  */
    /* JADX WARN: Code duplicated, block: B:96:0x0103  */
    /* JADX WARN: Code duplicated, block: B:99:0x0138  */
    /* JADX INFO: renamed from: q */
    public static final void m13178q(Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, Modifier modifier5, Modifier modifier6, C4242s viewState, Composer composer, int i13, int i14) {
        Modifier modifier7;
        int i15;
        Modifier modifier8;
        int i16;
        Modifier modifier9;
        int i17;
        int i18;
        int i19;
        int i24;
        Modifier modifier10;
        int i25;
        int i26;
        int i27;
        boolean z4;
        Modifier modifier11;
        Modifier modifier12;
        Modifier modifier13;
        Modifier modifier14;
        Modifier modifier15;
        Modifier modifier16;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier17;
        Modifier modifier18;
        Modifier modifier19;
        Modifier modifier20;
        int i28;
        final int iIntValue;
        final int iIntValue2;
        final int iIntValue3;
        float fM13246n;
        Object objM87133R;
        C28676v0 c28676v0;
        List list;
        int i29;
        ArrayList arrayList;
        int i34;
        int i35;
        final ArrayList arrayList2;
        Object objM87133R2;
        final InterfaceC28601c1 interfaceC28601c1;
        C28674u2 c28674u2;
        final InterfaceC39171c interfaceC39171c;
        Object objM87133R3;
        InterfaceC28670t2 interfaceC28670t2;
        boolean zM87157i;
        Object objM87133R4;
        boolean zM87157i2;
        Object objM87133R5;
        boolean zM87157i3;
        Object objM87133R6;
        C17891j c17891jM51478a;
        Object objM87133R7;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R8;
        InterfaceC28601c1 interfaceC28601c3;
        InterfaceC28670t2 interfaceC28670t2M13165f0;
        InterfaceC28670t2 interfaceC28670t2M13165f1;
        AbstractC17911t abstractC17911tM13239g;
        boolean zM87157i4;
        Object objM87133R9;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Modifier modifier21;
        AbstractC17911t abstractC17911t;
        int iHashCode2;
        Object objM87133R10;
        InterfaceC28670t2 interfaceC28670t3;
        int iHashCode3;
        AbstractC17911t abstractC17911t2;
        int i36;
        int i37;
        ArrayList arrayList3;
        int i38;
        int i39;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-294018363);
        int i44 = i14 & 1;
        if (i44 != 0) {
            i15 = i13 | 6;
            modifier7 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier7 = modifier;
            i15 = (c28655q.m87153g(modifier7) ? 4 : 2) | i13;
        } else {
            modifier7 = modifier;
            i15 = i13;
        }
        int i45 = i14 & 2;
        if (i45 == 0) {
            if ((i13 & 48) == 0) {
                modifier8 = modifier2;
                i15 |= c28655q.m87153g(modifier8) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    modifier9 = modifier3;
                    if (c28655q.m87153g(modifier9)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        if (c28655q.m87153g(modifier4)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            modifier10 = modifier5;
                            if (c28655q.m87153g(modifier10)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        i26 = i14 & 32;
                        if (i26 != 0) {
                            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q.m87153g(modifier6)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                        if ((i13 & 1572864) == 0) {
                            if (c28655q.m87157i(viewState)) {
                                i39 = 1048576;
                            } else {
                                i39 = 524288;
                            }
                            i15 |= i39;
                        }
                        if ((i15 & 599187) != 599186) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z4)) {
                            c2314t = C2314t.f9131w;
                            if (i44 != 0) {
                                modifier17 = c2314t;
                            } else {
                                modifier17 = modifier7;
                            }
                            if (i45 != 0) {
                                modifier8 = c2314t;
                            }
                            if (i16 != 0) {
                                modifier18 = c2314t;
                            } else {
                                modifier18 = modifier9;
                            }
                            if (i18 != 0) {
                                modifier19 = c2314t;
                            } else {
                                modifier19 = modifier4;
                            }
                            if (i24 != 0) {
                                modifier10 = c2314t;
                            }
                            if (i26 != 0) {
                                modifier20 = c2314t;
                            } else {
                                modifier20 = modifier6;
                            }
                            i28 = (i15 >> 18) & 14;
                            C23471q c23471qM13167g0 = m13167g0(viewState, c28655q, i28);
                            iIntValue = ((Number) c23471qM13167g0.f92947w).intValue();
                            iIntValue2 = ((Number) c23471qM13167g0.f92948x).intValue();
                            iIntValue3 = ((Number) c23471qM13167g0.f92949y).intValue();
                            fM13246n = viewState.getRadius() / C4242s.INSTANCE.m13253a();
                            objM87133R = c28655q.m87133R();
                            c28676v0 = C28635l.f115821a;
                            if (objM87133R == c28676v0) {
                                i37 = viewState.getOutline().getSegmentCountRange().f71134x;
                                arrayList3 = new ArrayList(i37);
                                for (i38 = 0; i38 < i37; i38++) {
                                    arrayList3.add(AbstractC28683x.m87272z(Float.valueOf(0.0f)));
                                }
                                c28655q.m87172p0(arrayList3);
                                objM87133R = arrayList3;
                            }
                            list = (List) objM87133R;
                            c28655q.m87150e0(916216129);
                            i29 = viewState.getOutline().getSegmentCountRange().f71134x;
                            arrayList = new ArrayList(i29);
                            i34 = 0;
                            while (i34 < i29) {
                                ArrayList arrayList4 = arrayList;
                                arrayList4.add(AbstractC11352g.m30588b(((Number) ((InterfaceC28601c1) list.get(i34)).getValue()).floatValue(), AbstractC11348f.m30574v((int) Duration.m134273getInWholeMillisecondsimpl(viewState.getOutline().getAnimationIntervalPerGroup()), 0, viewState.getOutline().getAnimationEasing(), 2), null, null, c28655q, 0, 28));
                                i34++;
                                arrayList = arrayList4;
                                modifier10 = modifier10;
                                i29 = i29;
                                i15 = i15;
                                modifier20 = modifier20;
                                i28 = i28;
                                c2314t = c2314t;
                                modifier8 = modifier8;
                            }
                            C2314t c2314t2 = c2314t;
                            int i46 = i15;
                            Modifier modifier22 = modifier8;
                            Modifier modifier23 = modifier20;
                            i35 = i28;
                            Modifier modifier24 = modifier10;
                            arrayList2 = arrayList;
                            c28655q.m87173q(false);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(Integer.valueOf(viewState.getOutline().getSegmentCount()));
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            c28674u2 = AbstractC2453v1.f9569h;
                            interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: c51.g
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        return AbstractC4234k.m13129B(interfaceC39171c, arrayList2, iIntValue, iIntValue2, iIntValue3, interfaceC28601c1);
                                    }
                                });
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                            InterfaceC18280f interfaceC18280fM13192e = viewState.getOutline().getPointScalarRange();
                            Long lValueOf = Long.valueOf(viewState.getOutline().m13190c());
                            zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(list) | c28655q.m87147d(fM13246n);
                            objM87133R4 = c28655q.m87133R();
                            if (zM87157i || objM87133R4 == c28676v0) {
                                objM87133R4 = new a(viewState, list, fM13246n, null);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC28683x.m87254h(interfaceC18280fM13192e, lValueOf, (InterfaceC4351m) objM87133R4, c28655q);
                            Integer numValueOf = Integer.valueOf(viewState.getOutline().getSegmentCount());
                            zM87157i2 = c28655q.m87157i(viewState);
                            objM87133R5 = c28655q.m87133R();
                            if (zM87157i2 || objM87133R5 == c28676v0) {
                                objM87133R5 = new b(viewState, interfaceC28601c1, null);
                                c28655q.m87172p0(objM87133R5);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf);
                            zM87157i3 = c28655q.m87157i(viewState);
                            objM87133R6 = c28655q.m87133R();
                            if (zM87157i3 || objM87133R6 == c28676v0) {
                                objM87133R6 = new c(viewState, null);
                                c28655q.m87172p0(objM87133R6);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                            c17891jM51478a = AbstractC17897m.m51478a();
                            if (!viewState.getUsingPrimitiveEdgeFade()) {
                                m13169h0(viewState, iIntValue, iIntValue2, c17891jM51478a, m13130C(interfaceC28670t2));
                            }
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC28683x.m87272z(viewState.getColors().f92937w);
                                c28655q.m87172p0(objM87133R7);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = AbstractC28683x.m87272z(viewState.getColors().f92938x);
                                c28655q.m87172p0(objM87133R8);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R8;
                            interfaceC28670t2M13165f0 = m13165f0(m13179r(interfaceC28601c2), c28655q, 0);
                            interfaceC28670t2M13165f1 = m13165f0(m13181t(interfaceC28601c3), c28655q, 0);
                            if (viewState.getTransition() == null) {
                                c28655q.m87150e0(-1659695200);
                                abstractC17911tM13239g = viewState.m13238f((InterfaceC39171c) c28655q.m87161k(c28674u2));
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(-1659627558);
                                abstractC17911tM13239g = viewState.m13239g((InterfaceC39171c) c28655q.m87161k(c28674u2), m13183v(interfaceC28670t2M13165f0), m13184w(interfaceC28670t2M13165f1));
                                c28655q.m87173q(false);
                            }
                            zM87157i4 = c28655q.m87157i(viewState);
                            objM87133R9 = c28655q.m87133R();
                            if (zM87157i4 || objM87133R9 == c28676v0) {
                                objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                                c28655q.m87172p0(objM87133R9);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, viewState);
                            Modifier modifierM3424u = AbstractC1102d.m3424u(viewState.m13251s(), AbstractC1102d.m3411h(viewState.m13250r(), modifier17));
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3424u);
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
                            if (c28655q.f115903S) {
                                modifier21 = modifier17;
                            } else {
                                modifier21 = modifier17;
                                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                }
                                C0209i c0209i4 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                                C2307m c2307m = C2299e.f9114w;
                                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                                abstractC17911t = abstractC17911tM13239g;
                                iHashCode2 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier19);
                                c28655q.m87158i0();
                                Modifier modifier25 = modifier19;
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                                int i47 = i46 >> 12;
                                m13131D(modifier24, c28655q, i47 & 14);
                                objM87133R10 = c28655q.m87133R();
                                if (objM87133R10 == c28676v0) {
                                    interfaceC28670t3 = interfaceC28670t2;
                                    objM87133R10 = new C2175b(interfaceC28670t3, 2);
                                    c28655q.m87172p0(objM87133R10);
                                } else {
                                    interfaceC28670t3 = interfaceC28670t2;
                                }
                                Modifier modifierM3480c = AbstractC1125a.m3480c(c2314t2, (Function1) objM87133R10);
                                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                                iHashCode3 = Long.hashCode(c28655q.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3480c);
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                                if (viewState.getUsingPrimitiveEdgeFade()) {
                                    c28655q.m87150e0(-271151621);
                                    abstractC17911t2 = abstractC17911t;
                                    i36 = i35;
                                    m13149V(viewState, abstractC17911t2, c28655q, i36);
                                    c28655q.m87173q(false);
                                } else {
                                    abstractC17911t2 = abstractC17911t;
                                    i36 = i35;
                                    c28655q.m87150e0(-271065906);
                                    m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                                    c28655q.m87173q(false);
                                }
                                m13144Q(viewState, abstractC17911t2, c28655q, i36);
                                m13134G(viewState, modifier23, c28655q, (i47 & 112) | i36);
                                c28655q.m87173q(true);
                                int i48 = i36;
                                m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i48);
                                c28655q.m87173q(true);
                                AbstractC4226c.m13097g(viewState, modifier22, modifier18, null, c28655q, i48 | (i46 & 112) | (i46 & 896), 8);
                                c28655q.m87173q(true);
                                modifier14 = modifier22;
                                modifier16 = modifier24;
                                modifier13 = modifier21;
                                modifier11 = modifier25;
                                modifier15 = modifier18;
                                modifier12 = modifier23;
                            }
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            C0209i c0209i5 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                            C2307m c2307m2 = C2299e.f9114w;
                            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                            abstractC17911t = abstractC17911tM13239g;
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifier19);
                            c28655q.m87158i0();
                            Modifier modifier26 = modifier19;
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d4);
                            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
                            int i49 = i46 >> 12;
                            m13131D(modifier24, c28655q, i49 & 14);
                            objM87133R10 = c28655q.m87133R();
                            if (objM87133R10 == c28676v0) {
                                interfaceC28670t3 = interfaceC28670t2;
                                objM87133R10 = new C2175b(interfaceC28670t3, 2);
                                c28655q.m87172p0(objM87133R10);
                            } else {
                                interfaceC28670t3 = interfaceC28670t2;
                            }
                            Modifier modifierM3480c2 = AbstractC1125a.m3480c(c2314t2, (Function1) objM87133R10);
                            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m2, false);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3480c2);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d5);
                            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
                            if (viewState.getUsingPrimitiveEdgeFade()) {
                                c28655q.m87150e0(-271151621);
                                abstractC17911t2 = abstractC17911t;
                                i36 = i35;
                                m13149V(viewState, abstractC17911t2, c28655q, i36);
                                c28655q.m87173q(false);
                            } else {
                                abstractC17911t2 = abstractC17911t;
                                i36 = i35;
                                c28655q.m87150e0(-271065906);
                                m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                                c28655q.m87173q(false);
                            }
                            m13144Q(viewState, abstractC17911t2, c28655q, i36);
                            m13134G(viewState, modifier23, c28655q, (i49 & 112) | i36);
                            c28655q.m87173q(true);
                            int i410 = i36;
                            m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i410);
                            c28655q.m87173q(true);
                            AbstractC4226c.m13097g(viewState, modifier22, modifier18, null, c28655q, i410 | (i46 & 112) | (i46 & 896), 8);
                            c28655q.m87173q(true);
                            modifier14 = modifier22;
                            modifier16 = modifier24;
                            modifier13 = modifier21;
                            modifier11 = modifier26;
                            modifier15 = modifier18;
                            modifier12 = modifier23;
                        } else {
                            c28655q.m87138X();
                            modifier11 = modifier4;
                            modifier12 = modifier6;
                            modifier13 = modifier7;
                            modifier14 = modifier8;
                            modifier15 = modifier9;
                            modifier16 = modifier10;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C2931g(modifier13, modifier14, modifier15, modifier11, modifier16, modifier12, viewState, i13, i14, 2);
                        }
                    }
                    i15 |= 24576;
                    modifier10 = modifier5;
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87153g(modifier6)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(viewState)) {
                            i39 = 1048576;
                        } else {
                            i39 = 524288;
                        }
                        i15 |= i39;
                    }
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            modifier17 = c2314t;
                        } else {
                            modifier17 = modifier7;
                        }
                        if (i45 != 0) {
                            modifier8 = c2314t;
                        }
                        if (i16 != 0) {
                            modifier18 = c2314t;
                        } else {
                            modifier18 = modifier9;
                        }
                        if (i18 != 0) {
                            modifier19 = c2314t;
                        } else {
                            modifier19 = modifier4;
                        }
                        if (i24 != 0) {
                            modifier10 = c2314t;
                        }
                        if (i26 != 0) {
                            modifier20 = c2314t;
                        } else {
                            modifier20 = modifier6;
                        }
                        i28 = (i15 >> 18) & 14;
                        C23471q c23471qM13167g1 = m13167g0(viewState, c28655q, i28);
                        iIntValue = ((Number) c23471qM13167g1.f92947w).intValue();
                        iIntValue2 = ((Number) c23471qM13167g1.f92948x).intValue();
                        iIntValue3 = ((Number) c23471qM13167g1.f92949y).intValue();
                        fM13246n = viewState.getRadius() / C4242s.INSTANCE.m13253a();
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            i37 = viewState.getOutline().getSegmentCountRange().f71134x;
                            arrayList3 = new ArrayList(i37);
                            while (i38 < i37) {
                                arrayList3.add(AbstractC28683x.m87272z(Float.valueOf(0.0f)));
                            }
                            c28655q.m87172p0(arrayList3);
                            objM87133R = arrayList3;
                        }
                        list = (List) objM87133R;
                        c28655q.m87150e0(916216129);
                        i29 = viewState.getOutline().getSegmentCountRange().f71134x;
                        arrayList = new ArrayList(i29);
                        i34 = 0;
                        while (i34 < i29) {
                            ArrayList arrayList5 = arrayList;
                            arrayList5.add(AbstractC11352g.m30588b(((Number) ((InterfaceC28601c1) list.get(i34)).getValue()).floatValue(), AbstractC11348f.m30574v((int) Duration.m134273getInWholeMillisecondsimpl(viewState.getOutline().getAnimationIntervalPerGroup()), 0, viewState.getOutline().getAnimationEasing(), 2), null, null, c28655q, 0, 28));
                            i34++;
                            arrayList = arrayList5;
                            modifier10 = modifier10;
                            i29 = i29;
                            i15 = i15;
                            modifier20 = modifier20;
                            i28 = i28;
                            c2314t = c2314t;
                            modifier8 = modifier8;
                        }
                        C2314t c2314t3 = c2314t;
                        int i411 = i15;
                        Modifier modifier27 = modifier8;
                        Modifier modifier28 = modifier20;
                        i35 = i28;
                        Modifier modifier29 = modifier10;
                        arrayList2 = arrayList;
                        c28655q.m87173q(false);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(Integer.valueOf(viewState.getOutline().getSegmentCount()));
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        c28674u2 = AbstractC2453v1.f9569h;
                        interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: c51.g
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC4234k.m13129B(interfaceC39171c, arrayList2, iIntValue, iIntValue2, iIntValue3, interfaceC28601c1);
                                }
                            });
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                        InterfaceC18280f interfaceC18280fM13192e2 = viewState.getOutline().getPointScalarRange();
                        Long lValueOf2 = Long.valueOf(viewState.getOutline().m13190c());
                        zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(list) | c28655q.m87147d(fM13246n);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R4 = new a(viewState, list, fM13246n, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new a(viewState, list, fM13246n, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87254h(interfaceC18280fM13192e2, lValueOf2, (InterfaceC4351m) objM87133R4, c28655q);
                        Integer numValueOf2 = Integer.valueOf(viewState.getOutline().getSegmentCount());
                        zM87157i2 = c28655q.m87157i(viewState);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R5 = new b(viewState, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new b(viewState, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf2);
                        zM87157i3 = c28655q.m87157i(viewState);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87157i3) {
                            objM87133R6 = new c(viewState, null);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new c(viewState, null);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                        c17891jM51478a = AbstractC17897m.m51478a();
                        if (!viewState.getUsingPrimitiveEdgeFade()) {
                            m13169h0(viewState, iIntValue, iIntValue2, c17891jM51478a, m13130C(interfaceC28670t2));
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87272z(viewState.getColors().f92937w);
                            c28655q.m87172p0(objM87133R7);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = AbstractC28683x.m87272z(viewState.getColors().f92938x);
                            c28655q.m87172p0(objM87133R8);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R8;
                        interfaceC28670t2M13165f0 = m13165f0(m13179r(interfaceC28601c2), c28655q, 0);
                        interfaceC28670t2M13165f1 = m13165f0(m13181t(interfaceC28601c3), c28655q, 0);
                        if (viewState.getTransition() == null) {
                            c28655q.m87150e0(-1659695200);
                            abstractC17911tM13239g = viewState.m13238f((InterfaceC39171c) c28655q.m87161k(c28674u2));
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1659627558);
                            abstractC17911tM13239g = viewState.m13239g((InterfaceC39171c) c28655q.m87161k(c28674u2), m13183v(interfaceC28670t2M13165f0), m13184w(interfaceC28670t2M13165f1));
                            c28655q.m87173q(false);
                        }
                        zM87157i4 = c28655q.m87157i(viewState);
                        objM87133R9 = c28655q.m87133R();
                        if (zM87157i4) {
                            objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                            c28655q.m87172p0(objM87133R9);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, viewState);
                        Modifier modifierM3424u2 = AbstractC1102d.m3424u(viewState.m13251s(), AbstractC1102d.m3411h(viewState.m13250r(), modifier17));
                        InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3424u2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i6 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d6);
                        C0209i c0209i7 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            modifier21 = modifier17;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i8 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N6);
                            C2307m c2307m3 = C2299e.f9114w;
                            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m3, false);
                            abstractC17911t = abstractC17911tM13239g;
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifier19);
                            c28655q.m87158i0();
                            Modifier modifier210 = modifier19;
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d7);
                            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m7);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N7);
                            int i412 = i411 >> 12;
                            m13131D(modifier29, c28655q, i412 & 14);
                            objM87133R10 = c28655q.m87133R();
                            if (objM87133R10 == c28676v0) {
                                interfaceC28670t3 = interfaceC28670t2;
                                objM87133R10 = new C2175b(interfaceC28670t3, 2);
                                c28655q.m87172p0(objM87133R10);
                            } else {
                                interfaceC28670t3 = interfaceC28670t2;
                            }
                            Modifier modifierM3480c3 = AbstractC1125a.m3480c(c2314t3, (Function1) objM87133R10);
                            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(c2307m3, false);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3480c3);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d8);
                            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m8);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N8);
                            if (viewState.getUsingPrimitiveEdgeFade()) {
                                c28655q.m87150e0(-271151621);
                                abstractC17911t2 = abstractC17911t;
                                i36 = i35;
                                m13149V(viewState, abstractC17911t2, c28655q, i36);
                                c28655q.m87173q(false);
                            } else {
                                abstractC17911t2 = abstractC17911t;
                                i36 = i35;
                                c28655q.m87150e0(-271065906);
                                m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                                c28655q.m87173q(false);
                            }
                            m13144Q(viewState, abstractC17911t2, c28655q, i36);
                            m13134G(viewState, modifier28, c28655q, (i412 & 112) | i36);
                            c28655q.m87173q(true);
                            int i413 = i36;
                            m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i413);
                            c28655q.m87173q(true);
                            AbstractC4226c.m13097g(viewState, modifier27, modifier18, null, c28655q, i413 | (i411 & 112) | (i411 & 896), 8);
                            c28655q.m87173q(true);
                            modifier14 = modifier27;
                            modifier16 = modifier29;
                            modifier13 = modifier21;
                            modifier11 = modifier210;
                            modifier15 = modifier18;
                            modifier12 = modifier28;
                        } else {
                            modifier21 = modifier17;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        C0209i c0209i9 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                        C2307m c2307m4 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(c2307m4, false);
                        abstractC17911t = abstractC17911tM13239g;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifier19);
                        c28655q.m87158i0();
                        Modifier modifier211 = modifier19;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d9);
                        AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m9);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N9);
                        int i414 = i411 >> 12;
                        m13131D(modifier29, c28655q, i414 & 14);
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            interfaceC28670t3 = interfaceC28670t2;
                            objM87133R10 = new C2175b(interfaceC28670t3, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            interfaceC28670t3 = interfaceC28670t2;
                        }
                        Modifier modifierM3480c4 = AbstractC1125a.m3480c(c2314t3, (Function1) objM87133R10);
                        InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(c2307m4, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3480c4);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d10);
                        AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m10);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N10);
                        if (viewState.getUsingPrimitiveEdgeFade()) {
                            c28655q.m87150e0(-271151621);
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            m13149V(viewState, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        } else {
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            c28655q.m87150e0(-271065906);
                            m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        }
                        m13144Q(viewState, abstractC17911t2, c28655q, i36);
                        m13134G(viewState, modifier28, c28655q, (i414 & 112) | i36);
                        c28655q.m87173q(true);
                        int i415 = i36;
                        m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i415);
                        c28655q.m87173q(true);
                        AbstractC4226c.m13097g(viewState, modifier27, modifier18, null, c28655q, i415 | (i411 & 112) | (i411 & 896), 8);
                        c28655q.m87173q(true);
                        modifier14 = modifier27;
                        modifier16 = modifier29;
                        modifier13 = modifier21;
                        modifier11 = modifier211;
                        modifier15 = modifier18;
                        modifier12 = modifier28;
                    } else {
                        c28655q.m87138X();
                        modifier11 = modifier4;
                        modifier12 = modifier6;
                        modifier13 = modifier7;
                        modifier14 = modifier8;
                        modifier15 = modifier9;
                        modifier16 = modifier10;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2931g(modifier13, modifier14, modifier15, modifier11, modifier16, modifier12, viewState, i13, i14, 2);
                    }
                }
                i15 |= 3072;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        modifier10 = modifier5;
                        if (c28655q.m87153g(modifier10)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87153g(modifier6)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(viewState)) {
                            i39 = 1048576;
                        } else {
                            i39 = 524288;
                        }
                        i15 |= i39;
                    }
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            modifier17 = c2314t;
                        } else {
                            modifier17 = modifier7;
                        }
                        if (i45 != 0) {
                            modifier8 = c2314t;
                        }
                        if (i16 != 0) {
                            modifier18 = c2314t;
                        } else {
                            modifier18 = modifier9;
                        }
                        if (i18 != 0) {
                            modifier19 = c2314t;
                        } else {
                            modifier19 = modifier4;
                        }
                        if (i24 != 0) {
                            modifier10 = c2314t;
                        }
                        if (i26 != 0) {
                            modifier20 = c2314t;
                        } else {
                            modifier20 = modifier6;
                        }
                        i28 = (i15 >> 18) & 14;
                        C23471q c23471qM13167g2 = m13167g0(viewState, c28655q, i28);
                        iIntValue = ((Number) c23471qM13167g2.f92947w).intValue();
                        iIntValue2 = ((Number) c23471qM13167g2.f92948x).intValue();
                        iIntValue3 = ((Number) c23471qM13167g2.f92949y).intValue();
                        fM13246n = viewState.getRadius() / C4242s.INSTANCE.m13253a();
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            i37 = viewState.getOutline().getSegmentCountRange().f71134x;
                            arrayList3 = new ArrayList(i37);
                            while (i38 < i37) {
                                arrayList3.add(AbstractC28683x.m87272z(Float.valueOf(0.0f)));
                            }
                            c28655q.m87172p0(arrayList3);
                            objM87133R = arrayList3;
                        }
                        list = (List) objM87133R;
                        c28655q.m87150e0(916216129);
                        i29 = viewState.getOutline().getSegmentCountRange().f71134x;
                        arrayList = new ArrayList(i29);
                        i34 = 0;
                        while (i34 < i29) {
                            ArrayList arrayList6 = arrayList;
                            arrayList6.add(AbstractC11352g.m30588b(((Number) ((InterfaceC28601c1) list.get(i34)).getValue()).floatValue(), AbstractC11348f.m30574v((int) Duration.m134273getInWholeMillisecondsimpl(viewState.getOutline().getAnimationIntervalPerGroup()), 0, viewState.getOutline().getAnimationEasing(), 2), null, null, c28655q, 0, 28));
                            i34++;
                            arrayList = arrayList6;
                            modifier10 = modifier10;
                            i29 = i29;
                            i15 = i15;
                            modifier20 = modifier20;
                            i28 = i28;
                            c2314t = c2314t;
                            modifier8 = modifier8;
                        }
                        C2314t c2314t4 = c2314t;
                        int i416 = i15;
                        Modifier modifier212 = modifier8;
                        Modifier modifier213 = modifier20;
                        i35 = i28;
                        Modifier modifier214 = modifier10;
                        arrayList2 = arrayList;
                        c28655q.m87173q(false);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(Integer.valueOf(viewState.getOutline().getSegmentCount()));
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        c28674u2 = AbstractC2453v1.f9569h;
                        interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: c51.g
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC4234k.m13129B(interfaceC39171c, arrayList2, iIntValue, iIntValue2, iIntValue3, interfaceC28601c1);
                                }
                            });
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                        InterfaceC18280f interfaceC18280fM13192e3 = viewState.getOutline().getPointScalarRange();
                        Long lValueOf3 = Long.valueOf(viewState.getOutline().m13190c());
                        zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(list) | c28655q.m87147d(fM13246n);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R4 = new a(viewState, list, fM13246n, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new a(viewState, list, fM13246n, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87254h(interfaceC18280fM13192e3, lValueOf3, (InterfaceC4351m) objM87133R4, c28655q);
                        Integer numValueOf3 = Integer.valueOf(viewState.getOutline().getSegmentCount());
                        zM87157i2 = c28655q.m87157i(viewState);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R5 = new b(viewState, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new b(viewState, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf3);
                        zM87157i3 = c28655q.m87157i(viewState);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87157i3) {
                            objM87133R6 = new c(viewState, null);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new c(viewState, null);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                        c17891jM51478a = AbstractC17897m.m51478a();
                        if (!viewState.getUsingPrimitiveEdgeFade()) {
                            m13169h0(viewState, iIntValue, iIntValue2, c17891jM51478a, m13130C(interfaceC28670t2));
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87272z(viewState.getColors().f92937w);
                            c28655q.m87172p0(objM87133R7);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = AbstractC28683x.m87272z(viewState.getColors().f92938x);
                            c28655q.m87172p0(objM87133R8);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R8;
                        interfaceC28670t2M13165f0 = m13165f0(m13179r(interfaceC28601c2), c28655q, 0);
                        interfaceC28670t2M13165f1 = m13165f0(m13181t(interfaceC28601c3), c28655q, 0);
                        if (viewState.getTransition() == null) {
                            c28655q.m87150e0(-1659695200);
                            abstractC17911tM13239g = viewState.m13238f((InterfaceC39171c) c28655q.m87161k(c28674u2));
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1659627558);
                            abstractC17911tM13239g = viewState.m13239g((InterfaceC39171c) c28655q.m87161k(c28674u2), m13183v(interfaceC28670t2M13165f0), m13184w(interfaceC28670t2M13165f1));
                            c28655q.m87173q(false);
                        }
                        zM87157i4 = c28655q.m87157i(viewState);
                        objM87133R9 = c28655q.m87133R();
                        if (zM87157i4) {
                            objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                            c28655q.m87172p0(objM87133R9);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, viewState);
                        Modifier modifierM3424u3 = AbstractC1102d.m3424u(viewState.m13251s(), AbstractC1102d.m3411h(viewState.m13250r(), modifier17));
                        InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3424u3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i10 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d11);
                        C0209i c0209i11 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m11);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            modifier21 = modifier17;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i12 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N11);
                            C2307m c2307m5 = C2299e.f9114w;
                            InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(c2307m5, false);
                            abstractC17911t = abstractC17911tM13239g;
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifier19);
                            c28655q.m87158i0();
                            Modifier modifier215 = modifier19;
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d12);
                            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m12);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N12);
                            int i417 = i416 >> 12;
                            m13131D(modifier214, c28655q, i417 & 14);
                            objM87133R10 = c28655q.m87133R();
                            if (objM87133R10 == c28676v0) {
                                interfaceC28670t3 = interfaceC28670t2;
                                objM87133R10 = new C2175b(interfaceC28670t3, 2);
                                c28655q.m87172p0(objM87133R10);
                            } else {
                                interfaceC28670t3 = interfaceC28670t2;
                            }
                            Modifier modifierM3480c5 = AbstractC1125a.m3480c(c2314t4, (Function1) objM87133R10);
                            InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(c2307m5, false);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3480c5);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d13);
                            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m13);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N13);
                            if (viewState.getUsingPrimitiveEdgeFade()) {
                                c28655q.m87150e0(-271151621);
                                abstractC17911t2 = abstractC17911t;
                                i36 = i35;
                                m13149V(viewState, abstractC17911t2, c28655q, i36);
                                c28655q.m87173q(false);
                            } else {
                                abstractC17911t2 = abstractC17911t;
                                i36 = i35;
                                c28655q.m87150e0(-271065906);
                                m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                                c28655q.m87173q(false);
                            }
                            m13144Q(viewState, abstractC17911t2, c28655q, i36);
                            m13134G(viewState, modifier213, c28655q, (i417 & 112) | i36);
                            c28655q.m87173q(true);
                            int i418 = i36;
                            m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i418);
                            c28655q.m87173q(true);
                            AbstractC4226c.m13097g(viewState, modifier212, modifier18, null, c28655q, i418 | (i416 & 112) | (i416 & 896), 8);
                            c28655q.m87173q(true);
                            modifier14 = modifier212;
                            modifier16 = modifier214;
                            modifier13 = modifier21;
                            modifier11 = modifier215;
                            modifier15 = modifier18;
                            modifier12 = modifier213;
                        } else {
                            modifier21 = modifier17;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        C0209i c0209i13 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N11);
                        C2307m c2307m6 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(c2307m6, false);
                        abstractC17911t = abstractC17911tM13239g;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifier19);
                        c28655q.m87158i0();
                        Modifier modifier216 = modifier19;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d14);
                        AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m14);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N14);
                        int i419 = i416 >> 12;
                        m13131D(modifier214, c28655q, i419 & 14);
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            interfaceC28670t3 = interfaceC28670t2;
                            objM87133R10 = new C2175b(interfaceC28670t3, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            interfaceC28670t3 = interfaceC28670t2;
                        }
                        Modifier modifierM3480c6 = AbstractC1125a.m3480c(c2314t4, (Function1) objM87133R10);
                        InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(c2307m6, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3480c6);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i10, interfaceC39127r0M66763d15);
                        AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m15);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N15);
                        if (viewState.getUsingPrimitiveEdgeFade()) {
                            c28655q.m87150e0(-271151621);
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            m13149V(viewState, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        } else {
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            c28655q.m87150e0(-271065906);
                            m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        }
                        m13144Q(viewState, abstractC17911t2, c28655q, i36);
                        m13134G(viewState, modifier213, c28655q, (i419 & 112) | i36);
                        c28655q.m87173q(true);
                        int i4110 = i36;
                        m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i4110);
                        c28655q.m87173q(true);
                        AbstractC4226c.m13097g(viewState, modifier212, modifier18, null, c28655q, i4110 | (i416 & 112) | (i416 & 896), 8);
                        c28655q.m87173q(true);
                        modifier14 = modifier212;
                        modifier16 = modifier214;
                        modifier13 = modifier21;
                        modifier11 = modifier216;
                        modifier15 = modifier18;
                        modifier12 = modifier213;
                    } else {
                        c28655q.m87138X();
                        modifier11 = modifier4;
                        modifier12 = modifier6;
                        modifier13 = modifier7;
                        modifier14 = modifier8;
                        modifier15 = modifier9;
                        modifier16 = modifier10;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2931g(modifier13, modifier14, modifier15, modifier11, modifier16, modifier12, viewState, i13, i14, 2);
                    }
                }
                i15 |= 24576;
                modifier10 = modifier5;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87153g(modifier6)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(viewState)) {
                        i39 = 1048576;
                    } else {
                        i39 = 524288;
                    }
                    i15 |= i39;
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        modifier17 = c2314t;
                    } else {
                        modifier17 = modifier7;
                    }
                    if (i45 != 0) {
                        modifier8 = c2314t;
                    }
                    if (i16 != 0) {
                        modifier18 = c2314t;
                    } else {
                        modifier18 = modifier9;
                    }
                    if (i18 != 0) {
                        modifier19 = c2314t;
                    } else {
                        modifier19 = modifier4;
                    }
                    if (i24 != 0) {
                        modifier10 = c2314t;
                    }
                    if (i26 != 0) {
                        modifier20 = c2314t;
                    } else {
                        modifier20 = modifier6;
                    }
                    i28 = (i15 >> 18) & 14;
                    C23471q c23471qM13167g3 = m13167g0(viewState, c28655q, i28);
                    iIntValue = ((Number) c23471qM13167g3.f92947w).intValue();
                    iIntValue2 = ((Number) c23471qM13167g3.f92948x).intValue();
                    iIntValue3 = ((Number) c23471qM13167g3.f92949y).intValue();
                    fM13246n = viewState.getRadius() / C4242s.INSTANCE.m13253a();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        i37 = viewState.getOutline().getSegmentCountRange().f71134x;
                        arrayList3 = new ArrayList(i37);
                        while (i38 < i37) {
                            arrayList3.add(AbstractC28683x.m87272z(Float.valueOf(0.0f)));
                        }
                        c28655q.m87172p0(arrayList3);
                        objM87133R = arrayList3;
                    }
                    list = (List) objM87133R;
                    c28655q.m87150e0(916216129);
                    i29 = viewState.getOutline().getSegmentCountRange().f71134x;
                    arrayList = new ArrayList(i29);
                    i34 = 0;
                    while (i34 < i29) {
                        ArrayList arrayList7 = arrayList;
                        arrayList7.add(AbstractC11352g.m30588b(((Number) ((InterfaceC28601c1) list.get(i34)).getValue()).floatValue(), AbstractC11348f.m30574v((int) Duration.m134273getInWholeMillisecondsimpl(viewState.getOutline().getAnimationIntervalPerGroup()), 0, viewState.getOutline().getAnimationEasing(), 2), null, null, c28655q, 0, 28));
                        i34++;
                        arrayList = arrayList7;
                        modifier10 = modifier10;
                        i29 = i29;
                        i15 = i15;
                        modifier20 = modifier20;
                        i28 = i28;
                        c2314t = c2314t;
                        modifier8 = modifier8;
                    }
                    C2314t c2314t5 = c2314t;
                    int i4111 = i15;
                    Modifier modifier217 = modifier8;
                    Modifier modifier218 = modifier20;
                    i35 = i28;
                    Modifier modifier219 = modifier10;
                    arrayList2 = arrayList;
                    c28655q.m87173q(false);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Integer.valueOf(viewState.getOutline().getSegmentCount()));
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    c28674u2 = AbstractC2453v1.f9569h;
                    interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: c51.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC4234k.m13129B(interfaceC39171c, arrayList2, iIntValue, iIntValue2, iIntValue3, interfaceC28601c1);
                            }
                        });
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                    InterfaceC18280f interfaceC18280fM13192e4 = viewState.getOutline().getPointScalarRange();
                    Long lValueOf4 = Long.valueOf(viewState.getOutline().m13190c());
                    zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(list) | c28655q.m87147d(fM13246n);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new a(viewState, list, fM13246n, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(viewState, list, fM13246n, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(interfaceC18280fM13192e4, lValueOf4, (InterfaceC4351m) objM87133R4, c28655q);
                    Integer numValueOf4 = Integer.valueOf(viewState.getOutline().getSegmentCount());
                    zM87157i2 = c28655q.m87157i(viewState);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R5 = new b(viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new b(viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf4);
                    zM87157i3 = c28655q.m87157i(viewState);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87157i3) {
                        objM87133R6 = new c(viewState, null);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new c(viewState, null);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                    c17891jM51478a = AbstractC17897m.m51478a();
                    if (!viewState.getUsingPrimitiveEdgeFade()) {
                        m13169h0(viewState, iIntValue, iIntValue2, c17891jM51478a, m13130C(interfaceC28670t2));
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(viewState.getColors().f92937w);
                        c28655q.m87172p0(objM87133R7);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87272z(viewState.getColors().f92938x);
                        c28655q.m87172p0(objM87133R8);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R8;
                    interfaceC28670t2M13165f0 = m13165f0(m13179r(interfaceC28601c2), c28655q, 0);
                    interfaceC28670t2M13165f1 = m13165f0(m13181t(interfaceC28601c3), c28655q, 0);
                    if (viewState.getTransition() == null) {
                        c28655q.m87150e0(-1659695200);
                        abstractC17911tM13239g = viewState.m13238f((InterfaceC39171c) c28655q.m87161k(c28674u2));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1659627558);
                        abstractC17911tM13239g = viewState.m13239g((InterfaceC39171c) c28655q.m87161k(c28674u2), m13183v(interfaceC28670t2M13165f0), m13184w(interfaceC28670t2M13165f1));
                        c28655q.m87173q(false);
                    }
                    zM87157i4 = c28655q.m87157i(viewState);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i4) {
                        objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q.m87172p0(objM87133R9);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, viewState);
                    Modifier modifierM3424u4 = AbstractC1102d.m3424u(viewState.m13251s(), AbstractC1102d.m3411h(viewState.m13250r(), modifier17));
                    InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3424u4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i14 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d16);
                    C0209i c0209i15 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m16);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        modifier21 = modifier17;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i16 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N16);
                        C2307m c2307m7 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d17 = AbstractC22989q.m66763d(c2307m7, false);
                        abstractC17911t = abstractC17911tM13239g;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifier19);
                        c28655q.m87158i0();
                        Modifier modifier2110 = modifier19;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d17);
                        AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m17);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N17);
                        int i4112 = i4111 >> 12;
                        m13131D(modifier219, c28655q, i4112 & 14);
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            interfaceC28670t3 = interfaceC28670t2;
                            objM87133R10 = new C2175b(interfaceC28670t3, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            interfaceC28670t3 = interfaceC28670t2;
                        }
                        Modifier modifierM3480c7 = AbstractC1125a.m3480c(c2314t5, (Function1) objM87133R10);
                        InterfaceC39127r0 interfaceC39127r0M66763d18 = AbstractC22989q.m66763d(c2307m7, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3480c7);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d18);
                        AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m18);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N18);
                        if (viewState.getUsingPrimitiveEdgeFade()) {
                            c28655q.m87150e0(-271151621);
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            m13149V(viewState, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        } else {
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            c28655q.m87150e0(-271065906);
                            m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        }
                        m13144Q(viewState, abstractC17911t2, c28655q, i36);
                        m13134G(viewState, modifier218, c28655q, (i4112 & 112) | i36);
                        c28655q.m87173q(true);
                        int i4113 = i36;
                        m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i4113);
                        c28655q.m87173q(true);
                        AbstractC4226c.m13097g(viewState, modifier217, modifier18, null, c28655q, i4113 | (i4111 & 112) | (i4111 & 896), 8);
                        c28655q.m87173q(true);
                        modifier14 = modifier217;
                        modifier16 = modifier219;
                        modifier13 = modifier21;
                        modifier11 = modifier2110;
                        modifier15 = modifier18;
                        modifier12 = modifier218;
                    } else {
                        modifier21 = modifier17;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i17 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N16);
                    C2307m c2307m8 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d19 = AbstractC22989q.m66763d(c2307m8, false);
                    abstractC17911t = abstractC17911tM13239g;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                    Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifier19);
                    c28655q.m87158i0();
                    Modifier modifier2111 = modifier19;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d19);
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m19);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N19);
                    int i4114 = i4111 >> 12;
                    m13131D(modifier219, c28655q, i4114 & 14);
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28670t3 = interfaceC28670t2;
                        objM87133R10 = new C2175b(interfaceC28670t3, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        interfaceC28670t3 = interfaceC28670t2;
                    }
                    Modifier modifierM3480c8 = AbstractC1125a.m3480c(c2314t5, (Function1) objM87133R10);
                    InterfaceC39127r0 interfaceC39127r0M66763d110 = AbstractC22989q.m66763d(c2307m8, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3480c8);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d110);
                    AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N110);
                    if (viewState.getUsingPrimitiveEdgeFade()) {
                        c28655q.m87150e0(-271151621);
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        m13149V(viewState, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    } else {
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        c28655q.m87150e0(-271065906);
                        m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    }
                    m13144Q(viewState, abstractC17911t2, c28655q, i36);
                    m13134G(viewState, modifier218, c28655q, (i4114 & 112) | i36);
                    c28655q.m87173q(true);
                    int i4115 = i36;
                    m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i4115);
                    c28655q.m87173q(true);
                    AbstractC4226c.m13097g(viewState, modifier217, modifier18, null, c28655q, i4115 | (i4111 & 112) | (i4111 & 896), 8);
                    c28655q.m87173q(true);
                    modifier14 = modifier217;
                    modifier16 = modifier219;
                    modifier13 = modifier21;
                    modifier11 = modifier2111;
                    modifier15 = modifier18;
                    modifier12 = modifier218;
                } else {
                    c28655q.m87138X();
                    modifier11 = modifier4;
                    modifier12 = modifier6;
                    modifier13 = modifier7;
                    modifier14 = modifier8;
                    modifier15 = modifier9;
                    modifier16 = modifier10;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(modifier13, modifier14, modifier15, modifier11, modifier16, modifier12, viewState, i13, i14, 2);
                }
            }
            i15 |= 384;
            modifier9 = modifier3;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87153g(modifier4)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        modifier10 = modifier5;
                        if (c28655q.m87153g(modifier10)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87153g(modifier6)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(viewState)) {
                            i39 = 1048576;
                        } else {
                            i39 = 524288;
                        }
                        i15 |= i39;
                    }
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            modifier17 = c2314t;
                        } else {
                            modifier17 = modifier7;
                        }
                        if (i45 != 0) {
                            modifier8 = c2314t;
                        }
                        if (i16 != 0) {
                            modifier18 = c2314t;
                        } else {
                            modifier18 = modifier9;
                        }
                        if (i18 != 0) {
                            modifier19 = c2314t;
                        } else {
                            modifier19 = modifier4;
                        }
                        if (i24 != 0) {
                            modifier10 = c2314t;
                        }
                        if (i26 != 0) {
                            modifier20 = c2314t;
                        } else {
                            modifier20 = modifier6;
                        }
                        i28 = (i15 >> 18) & 14;
                        C23471q c23471qM13167g4 = m13167g0(viewState, c28655q, i28);
                        iIntValue = ((Number) c23471qM13167g4.f92947w).intValue();
                        iIntValue2 = ((Number) c23471qM13167g4.f92948x).intValue();
                        iIntValue3 = ((Number) c23471qM13167g4.f92949y).intValue();
                        fM13246n = viewState.getRadius() / C4242s.INSTANCE.m13253a();
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            i37 = viewState.getOutline().getSegmentCountRange().f71134x;
                            arrayList3 = new ArrayList(i37);
                            while (i38 < i37) {
                                arrayList3.add(AbstractC28683x.m87272z(Float.valueOf(0.0f)));
                            }
                            c28655q.m87172p0(arrayList3);
                            objM87133R = arrayList3;
                        }
                        list = (List) objM87133R;
                        c28655q.m87150e0(916216129);
                        i29 = viewState.getOutline().getSegmentCountRange().f71134x;
                        arrayList = new ArrayList(i29);
                        i34 = 0;
                        while (i34 < i29) {
                            ArrayList arrayList8 = arrayList;
                            arrayList8.add(AbstractC11352g.m30588b(((Number) ((InterfaceC28601c1) list.get(i34)).getValue()).floatValue(), AbstractC11348f.m30574v((int) Duration.m134273getInWholeMillisecondsimpl(viewState.getOutline().getAnimationIntervalPerGroup()), 0, viewState.getOutline().getAnimationEasing(), 2), null, null, c28655q, 0, 28));
                            i34++;
                            arrayList = arrayList8;
                            modifier10 = modifier10;
                            i29 = i29;
                            i15 = i15;
                            modifier20 = modifier20;
                            i28 = i28;
                            c2314t = c2314t;
                            modifier8 = modifier8;
                        }
                        C2314t c2314t6 = c2314t;
                        int i4116 = i15;
                        Modifier modifier2112 = modifier8;
                        Modifier modifier2113 = modifier20;
                        i35 = i28;
                        Modifier modifier2114 = modifier10;
                        arrayList2 = arrayList;
                        c28655q.m87173q(false);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(Integer.valueOf(viewState.getOutline().getSegmentCount()));
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        c28674u2 = AbstractC2453v1.f9569h;
                        interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: c51.g
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC4234k.m13129B(interfaceC39171c, arrayList2, iIntValue, iIntValue2, iIntValue3, interfaceC28601c1);
                                }
                            });
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                        InterfaceC18280f interfaceC18280fM13192e5 = viewState.getOutline().getPointScalarRange();
                        Long lValueOf5 = Long.valueOf(viewState.getOutline().m13190c());
                        zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(list) | c28655q.m87147d(fM13246n);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R4 = new a(viewState, list, fM13246n, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new a(viewState, list, fM13246n, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87254h(interfaceC18280fM13192e5, lValueOf5, (InterfaceC4351m) objM87133R4, c28655q);
                        Integer numValueOf5 = Integer.valueOf(viewState.getOutline().getSegmentCount());
                        zM87157i2 = c28655q.m87157i(viewState);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R5 = new b(viewState, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new b(viewState, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf5);
                        zM87157i3 = c28655q.m87157i(viewState);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87157i3) {
                            objM87133R6 = new c(viewState, null);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new c(viewState, null);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                        c17891jM51478a = AbstractC17897m.m51478a();
                        if (!viewState.getUsingPrimitiveEdgeFade()) {
                            m13169h0(viewState, iIntValue, iIntValue2, c17891jM51478a, m13130C(interfaceC28670t2));
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87272z(viewState.getColors().f92937w);
                            c28655q.m87172p0(objM87133R7);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = AbstractC28683x.m87272z(viewState.getColors().f92938x);
                            c28655q.m87172p0(objM87133R8);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R8;
                        interfaceC28670t2M13165f0 = m13165f0(m13179r(interfaceC28601c2), c28655q, 0);
                        interfaceC28670t2M13165f1 = m13165f0(m13181t(interfaceC28601c3), c28655q, 0);
                        if (viewState.getTransition() == null) {
                            c28655q.m87150e0(-1659695200);
                            abstractC17911tM13239g = viewState.m13238f((InterfaceC39171c) c28655q.m87161k(c28674u2));
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1659627558);
                            abstractC17911tM13239g = viewState.m13239g((InterfaceC39171c) c28655q.m87161k(c28674u2), m13183v(interfaceC28670t2M13165f0), m13184w(interfaceC28670t2M13165f1));
                            c28655q.m87173q(false);
                        }
                        zM87157i4 = c28655q.m87157i(viewState);
                        objM87133R9 = c28655q.m87133R();
                        if (zM87157i4) {
                            objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                            c28655q.m87172p0(objM87133R9);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, viewState);
                        Modifier modifierM3424u5 = AbstractC1102d.m3424u(viewState.m13251s(), AbstractC1102d.m3411h(viewState.m13250r(), modifier17));
                        InterfaceC39127r0 interfaceC39127r0M66763d111 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                        Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierM3424u5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i18 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC39127r0M66763d111);
                        C0209i c0209i19 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC28653p1M87165m111);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            modifier21 = modifier17;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i110 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i110, modifierM118962N111);
                            C2307m c2307m9 = C2299e.f9114w;
                            InterfaceC39127r0 interfaceC39127r0M66763d112 = AbstractC22989q.m66763d(c2307m9, false);
                            abstractC17911t = abstractC17911tM13239g;
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifier19);
                            c28655q.m87158i0();
                            Modifier modifier2115 = modifier19;
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC39127r0M66763d112);
                            AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC28653p1M87165m112);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i110, modifierM118962N112);
                            int i4117 = i4116 >> 12;
                            m13131D(modifier2114, c28655q, i4117 & 14);
                            objM87133R10 = c28655q.m87133R();
                            if (objM87133R10 == c28676v0) {
                                interfaceC28670t3 = interfaceC28670t2;
                                objM87133R10 = new C2175b(interfaceC28670t3, 2);
                                c28655q.m87172p0(objM87133R10);
                            } else {
                                interfaceC28670t3 = interfaceC28670t2;
                            }
                            Modifier modifierM3480c9 = AbstractC1125a.m3480c(c2314t6, (Function1) objM87133R10);
                            InterfaceC39127r0 interfaceC39127r0M66763d113 = AbstractC22989q.m66763d(c2307m9, false);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                            Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM3480c9);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC39127r0M66763d113);
                            AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC28653p1M87165m113);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i110, modifierM118962N113);
                            if (viewState.getUsingPrimitiveEdgeFade()) {
                                c28655q.m87150e0(-271151621);
                                abstractC17911t2 = abstractC17911t;
                                i36 = i35;
                                m13149V(viewState, abstractC17911t2, c28655q, i36);
                                c28655q.m87173q(false);
                            } else {
                                abstractC17911t2 = abstractC17911t;
                                i36 = i35;
                                c28655q.m87150e0(-271065906);
                                m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                                c28655q.m87173q(false);
                            }
                            m13144Q(viewState, abstractC17911t2, c28655q, i36);
                            m13134G(viewState, modifier2113, c28655q, (i4117 & 112) | i36);
                            c28655q.m87173q(true);
                            int i4118 = i36;
                            m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i4118);
                            c28655q.m87173q(true);
                            AbstractC4226c.m13097g(viewState, modifier2112, modifier18, null, c28655q, i4118 | (i4116 & 112) | (i4116 & 896), 8);
                            c28655q.m87173q(true);
                            modifier14 = modifier2112;
                            modifier16 = modifier2114;
                            modifier13 = modifier21;
                            modifier11 = modifier2115;
                            modifier15 = modifier18;
                            modifier12 = modifier2113;
                        } else {
                            modifier21 = modifier17;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        C0209i c0209i111 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N111);
                        C2307m c2307m10 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d114 = AbstractC22989q.m66763d(c2307m10, false);
                        abstractC17911t = abstractC17911tM13239g;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                        Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifier19);
                        c28655q.m87158i0();
                        Modifier modifier2116 = modifier19;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC39127r0M66763d114);
                        AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC28653p1M87165m114);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N114);
                        int i4119 = i4116 >> 12;
                        m13131D(modifier2114, c28655q, i4119 & 14);
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            interfaceC28670t3 = interfaceC28670t2;
                            objM87133R10 = new C2175b(interfaceC28670t3, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            interfaceC28670t3 = interfaceC28670t2;
                        }
                        Modifier modifierM3480c10 = AbstractC1125a.m3480c(c2314t6, (Function1) objM87133R10);
                        InterfaceC39127r0 interfaceC39127r0M66763d115 = AbstractC22989q.m66763d(c2307m10, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                        Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, modifierM3480c10);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC39127r0M66763d115);
                        AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC28653p1M87165m115);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111, modifierM118962N115);
                        if (viewState.getUsingPrimitiveEdgeFade()) {
                            c28655q.m87150e0(-271151621);
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            m13149V(viewState, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        } else {
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            c28655q.m87150e0(-271065906);
                            m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        }
                        m13144Q(viewState, abstractC17911t2, c28655q, i36);
                        m13134G(viewState, modifier2113, c28655q, (i4119 & 112) | i36);
                        c28655q.m87173q(true);
                        int i41110 = i36;
                        m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i41110);
                        c28655q.m87173q(true);
                        AbstractC4226c.m13097g(viewState, modifier2112, modifier18, null, c28655q, i41110 | (i4116 & 112) | (i4116 & 896), 8);
                        c28655q.m87173q(true);
                        modifier14 = modifier2112;
                        modifier16 = modifier2114;
                        modifier13 = modifier21;
                        modifier11 = modifier2116;
                        modifier15 = modifier18;
                        modifier12 = modifier2113;
                    } else {
                        c28655q.m87138X();
                        modifier11 = modifier4;
                        modifier12 = modifier6;
                        modifier13 = modifier7;
                        modifier14 = modifier8;
                        modifier15 = modifier9;
                        modifier16 = modifier10;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2931g(modifier13, modifier14, modifier15, modifier11, modifier16, modifier12, viewState, i13, i14, 2);
                    }
                }
                i15 |= 24576;
                modifier10 = modifier5;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87153g(modifier6)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(viewState)) {
                        i39 = 1048576;
                    } else {
                        i39 = 524288;
                    }
                    i15 |= i39;
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        modifier17 = c2314t;
                    } else {
                        modifier17 = modifier7;
                    }
                    if (i45 != 0) {
                        modifier8 = c2314t;
                    }
                    if (i16 != 0) {
                        modifier18 = c2314t;
                    } else {
                        modifier18 = modifier9;
                    }
                    if (i18 != 0) {
                        modifier19 = c2314t;
                    } else {
                        modifier19 = modifier4;
                    }
                    if (i24 != 0) {
                        modifier10 = c2314t;
                    }
                    if (i26 != 0) {
                        modifier20 = c2314t;
                    } else {
                        modifier20 = modifier6;
                    }
                    i28 = (i15 >> 18) & 14;
                    C23471q c23471qM13167g5 = m13167g0(viewState, c28655q, i28);
                    iIntValue = ((Number) c23471qM13167g5.f92947w).intValue();
                    iIntValue2 = ((Number) c23471qM13167g5.f92948x).intValue();
                    iIntValue3 = ((Number) c23471qM13167g5.f92949y).intValue();
                    fM13246n = viewState.getRadius() / C4242s.INSTANCE.m13253a();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        i37 = viewState.getOutline().getSegmentCountRange().f71134x;
                        arrayList3 = new ArrayList(i37);
                        while (i38 < i37) {
                            arrayList3.add(AbstractC28683x.m87272z(Float.valueOf(0.0f)));
                        }
                        c28655q.m87172p0(arrayList3);
                        objM87133R = arrayList3;
                    }
                    list = (List) objM87133R;
                    c28655q.m87150e0(916216129);
                    i29 = viewState.getOutline().getSegmentCountRange().f71134x;
                    arrayList = new ArrayList(i29);
                    i34 = 0;
                    while (i34 < i29) {
                        ArrayList arrayList9 = arrayList;
                        arrayList9.add(AbstractC11352g.m30588b(((Number) ((InterfaceC28601c1) list.get(i34)).getValue()).floatValue(), AbstractC11348f.m30574v((int) Duration.m134273getInWholeMillisecondsimpl(viewState.getOutline().getAnimationIntervalPerGroup()), 0, viewState.getOutline().getAnimationEasing(), 2), null, null, c28655q, 0, 28));
                        i34++;
                        arrayList = arrayList9;
                        modifier10 = modifier10;
                        i29 = i29;
                        i15 = i15;
                        modifier20 = modifier20;
                        i28 = i28;
                        c2314t = c2314t;
                        modifier8 = modifier8;
                    }
                    C2314t c2314t7 = c2314t;
                    int i41111 = i15;
                    Modifier modifier2117 = modifier8;
                    Modifier modifier2118 = modifier20;
                    i35 = i28;
                    Modifier modifier2119 = modifier10;
                    arrayList2 = arrayList;
                    c28655q.m87173q(false);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Integer.valueOf(viewState.getOutline().getSegmentCount()));
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    c28674u2 = AbstractC2453v1.f9569h;
                    interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: c51.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC4234k.m13129B(interfaceC39171c, arrayList2, iIntValue, iIntValue2, iIntValue3, interfaceC28601c1);
                            }
                        });
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                    InterfaceC18280f interfaceC18280fM13192e6 = viewState.getOutline().getPointScalarRange();
                    Long lValueOf6 = Long.valueOf(viewState.getOutline().m13190c());
                    zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(list) | c28655q.m87147d(fM13246n);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new a(viewState, list, fM13246n, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(viewState, list, fM13246n, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(interfaceC18280fM13192e6, lValueOf6, (InterfaceC4351m) objM87133R4, c28655q);
                    Integer numValueOf6 = Integer.valueOf(viewState.getOutline().getSegmentCount());
                    zM87157i2 = c28655q.m87157i(viewState);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R5 = new b(viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new b(viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf6);
                    zM87157i3 = c28655q.m87157i(viewState);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87157i3) {
                        objM87133R6 = new c(viewState, null);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new c(viewState, null);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                    c17891jM51478a = AbstractC17897m.m51478a();
                    if (!viewState.getUsingPrimitiveEdgeFade()) {
                        m13169h0(viewState, iIntValue, iIntValue2, c17891jM51478a, m13130C(interfaceC28670t2));
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(viewState.getColors().f92937w);
                        c28655q.m87172p0(objM87133R7);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87272z(viewState.getColors().f92938x);
                        c28655q.m87172p0(objM87133R8);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R8;
                    interfaceC28670t2M13165f0 = m13165f0(m13179r(interfaceC28601c2), c28655q, 0);
                    interfaceC28670t2M13165f1 = m13165f0(m13181t(interfaceC28601c3), c28655q, 0);
                    if (viewState.getTransition() == null) {
                        c28655q.m87150e0(-1659695200);
                        abstractC17911tM13239g = viewState.m13238f((InterfaceC39171c) c28655q.m87161k(c28674u2));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1659627558);
                        abstractC17911tM13239g = viewState.m13239g((InterfaceC39171c) c28655q.m87161k(c28674u2), m13183v(interfaceC28670t2M13165f0), m13184w(interfaceC28670t2M13165f1));
                        c28655q.m87173q(false);
                    }
                    zM87157i4 = c28655q.m87157i(viewState);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i4) {
                        objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q.m87172p0(objM87133R9);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, viewState);
                    Modifier modifierM3424u6 = AbstractC1102d.m3424u(viewState.m13251s(), AbstractC1102d.m3411h(viewState.m13250r(), modifier17));
                    InterfaceC39127r0 interfaceC39127r0M66763d116 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
                    Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, modifierM3424u6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i112 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i112, interfaceC39127r0M66763d116);
                    C0209i c0209i113 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m116);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        modifier21 = modifier17;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i114 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i114, modifierM118962N116);
                        C2307m c2307m11 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d117 = AbstractC22989q.m66763d(c2307m11, false);
                        abstractC17911t = abstractC17911tM13239g;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
                        Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, modifier19);
                        c28655q.m87158i0();
                        Modifier modifier21110 = modifier19;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i112, interfaceC39127r0M66763d117);
                        AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m117);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i114, modifierM118962N117);
                        int i41112 = i41111 >> 12;
                        m13131D(modifier2119, c28655q, i41112 & 14);
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            interfaceC28670t3 = interfaceC28670t2;
                            objM87133R10 = new C2175b(interfaceC28670t3, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            interfaceC28670t3 = interfaceC28670t2;
                        }
                        Modifier modifierM3480c11 = AbstractC1125a.m3480c(c2314t7, (Function1) objM87133R10);
                        InterfaceC39127r0 interfaceC39127r0M66763d118 = AbstractC22989q.m66763d(c2307m11, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
                        Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, modifierM3480c11);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i112, interfaceC39127r0M66763d118);
                        AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m118);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i114, modifierM118962N118);
                        if (viewState.getUsingPrimitiveEdgeFade()) {
                            c28655q.m87150e0(-271151621);
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            m13149V(viewState, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        } else {
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            c28655q.m87150e0(-271065906);
                            m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        }
                        m13144Q(viewState, abstractC17911t2, c28655q, i36);
                        m13134G(viewState, modifier2118, c28655q, (i41112 & 112) | i36);
                        c28655q.m87173q(true);
                        int i41113 = i36;
                        m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i41113);
                        c28655q.m87173q(true);
                        AbstractC4226c.m13097g(viewState, modifier2117, modifier18, null, c28655q, i41113 | (i41111 & 112) | (i41111 & 896), 8);
                        c28655q.m87173q(true);
                        modifier14 = modifier2117;
                        modifier16 = modifier2119;
                        modifier13 = modifier21;
                        modifier11 = modifier21110;
                        modifier15 = modifier18;
                        modifier12 = modifier2118;
                    } else {
                        modifier21 = modifier17;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i115 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N116);
                    C2307m c2307m12 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d119 = AbstractC22989q.m66763d(c2307m12, false);
                    abstractC17911t = abstractC17911tM13239g;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q.m87165m();
                    Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q, modifier19);
                    c28655q.m87158i0();
                    Modifier modifier21111 = modifier19;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i112, interfaceC39127r0M66763d119);
                    AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m119);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N119);
                    int i41114 = i41111 >> 12;
                    m13131D(modifier2119, c28655q, i41114 & 14);
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28670t3 = interfaceC28670t2;
                        objM87133R10 = new C2175b(interfaceC28670t3, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        interfaceC28670t3 = interfaceC28670t2;
                    }
                    Modifier modifierM3480c12 = AbstractC1125a.m3480c(c2314t7, (Function1) objM87133R10);
                    InterfaceC39127r0 interfaceC39127r0M66763d1110 = AbstractC22989q.m66763d(c2307m12, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q.m87165m();
                    Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q, modifierM3480c12);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i112, interfaceC39127r0M66763d1110);
                    AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m1110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N1110);
                    if (viewState.getUsingPrimitiveEdgeFade()) {
                        c28655q.m87150e0(-271151621);
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        m13149V(viewState, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    } else {
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        c28655q.m87150e0(-271065906);
                        m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    }
                    m13144Q(viewState, abstractC17911t2, c28655q, i36);
                    m13134G(viewState, modifier2118, c28655q, (i41114 & 112) | i36);
                    c28655q.m87173q(true);
                    int i41115 = i36;
                    m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i41115);
                    c28655q.m87173q(true);
                    AbstractC4226c.m13097g(viewState, modifier2117, modifier18, null, c28655q, i41115 | (i41111 & 112) | (i41111 & 896), 8);
                    c28655q.m87173q(true);
                    modifier14 = modifier2117;
                    modifier16 = modifier2119;
                    modifier13 = modifier21;
                    modifier11 = modifier21111;
                    modifier15 = modifier18;
                    modifier12 = modifier2118;
                } else {
                    c28655q.m87138X();
                    modifier11 = modifier4;
                    modifier12 = modifier6;
                    modifier13 = modifier7;
                    modifier14 = modifier8;
                    modifier15 = modifier9;
                    modifier16 = modifier10;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(modifier13, modifier14, modifier15, modifier11, modifier16, modifier12, viewState, i13, i14, 2);
                }
            }
            i15 |= 3072;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    modifier10 = modifier5;
                    if (c28655q.m87153g(modifier10)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87153g(modifier6)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(viewState)) {
                        i39 = 1048576;
                    } else {
                        i39 = 524288;
                    }
                    i15 |= i39;
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        modifier17 = c2314t;
                    } else {
                        modifier17 = modifier7;
                    }
                    if (i45 != 0) {
                        modifier8 = c2314t;
                    }
                    if (i16 != 0) {
                        modifier18 = c2314t;
                    } else {
                        modifier18 = modifier9;
                    }
                    if (i18 != 0) {
                        modifier19 = c2314t;
                    } else {
                        modifier19 = modifier4;
                    }
                    if (i24 != 0) {
                        modifier10 = c2314t;
                    }
                    if (i26 != 0) {
                        modifier20 = c2314t;
                    } else {
                        modifier20 = modifier6;
                    }
                    i28 = (i15 >> 18) & 14;
                    C23471q c23471qM13167g6 = m13167g0(viewState, c28655q, i28);
                    iIntValue = ((Number) c23471qM13167g6.f92947w).intValue();
                    iIntValue2 = ((Number) c23471qM13167g6.f92948x).intValue();
                    iIntValue3 = ((Number) c23471qM13167g6.f92949y).intValue();
                    fM13246n = viewState.getRadius() / C4242s.INSTANCE.m13253a();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        i37 = viewState.getOutline().getSegmentCountRange().f71134x;
                        arrayList3 = new ArrayList(i37);
                        while (i38 < i37) {
                            arrayList3.add(AbstractC28683x.m87272z(Float.valueOf(0.0f)));
                        }
                        c28655q.m87172p0(arrayList3);
                        objM87133R = arrayList3;
                    }
                    list = (List) objM87133R;
                    c28655q.m87150e0(916216129);
                    i29 = viewState.getOutline().getSegmentCountRange().f71134x;
                    arrayList = new ArrayList(i29);
                    i34 = 0;
                    while (i34 < i29) {
                        ArrayList arrayList10 = arrayList;
                        arrayList10.add(AbstractC11352g.m30588b(((Number) ((InterfaceC28601c1) list.get(i34)).getValue()).floatValue(), AbstractC11348f.m30574v((int) Duration.m134273getInWholeMillisecondsimpl(viewState.getOutline().getAnimationIntervalPerGroup()), 0, viewState.getOutline().getAnimationEasing(), 2), null, null, c28655q, 0, 28));
                        i34++;
                        arrayList = arrayList10;
                        modifier10 = modifier10;
                        i29 = i29;
                        i15 = i15;
                        modifier20 = modifier20;
                        i28 = i28;
                        c2314t = c2314t;
                        modifier8 = modifier8;
                    }
                    C2314t c2314t8 = c2314t;
                    int i41116 = i15;
                    Modifier modifier21112 = modifier8;
                    Modifier modifier21113 = modifier20;
                    i35 = i28;
                    Modifier modifier21114 = modifier10;
                    arrayList2 = arrayList;
                    c28655q.m87173q(false);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Integer.valueOf(viewState.getOutline().getSegmentCount()));
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    c28674u2 = AbstractC2453v1.f9569h;
                    interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: c51.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC4234k.m13129B(interfaceC39171c, arrayList2, iIntValue, iIntValue2, iIntValue3, interfaceC28601c1);
                            }
                        });
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                    InterfaceC18280f interfaceC18280fM13192e7 = viewState.getOutline().getPointScalarRange();
                    Long lValueOf7 = Long.valueOf(viewState.getOutline().m13190c());
                    zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(list) | c28655q.m87147d(fM13246n);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new a(viewState, list, fM13246n, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(viewState, list, fM13246n, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(interfaceC18280fM13192e7, lValueOf7, (InterfaceC4351m) objM87133R4, c28655q);
                    Integer numValueOf7 = Integer.valueOf(viewState.getOutline().getSegmentCount());
                    zM87157i2 = c28655q.m87157i(viewState);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R5 = new b(viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new b(viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf7);
                    zM87157i3 = c28655q.m87157i(viewState);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87157i3) {
                        objM87133R6 = new c(viewState, null);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new c(viewState, null);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                    c17891jM51478a = AbstractC17897m.m51478a();
                    if (!viewState.getUsingPrimitiveEdgeFade()) {
                        m13169h0(viewState, iIntValue, iIntValue2, c17891jM51478a, m13130C(interfaceC28670t2));
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(viewState.getColors().f92937w);
                        c28655q.m87172p0(objM87133R7);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87272z(viewState.getColors().f92938x);
                        c28655q.m87172p0(objM87133R8);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R8;
                    interfaceC28670t2M13165f0 = m13165f0(m13179r(interfaceC28601c2), c28655q, 0);
                    interfaceC28670t2M13165f1 = m13165f0(m13181t(interfaceC28601c3), c28655q, 0);
                    if (viewState.getTransition() == null) {
                        c28655q.m87150e0(-1659695200);
                        abstractC17911tM13239g = viewState.m13238f((InterfaceC39171c) c28655q.m87161k(c28674u2));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1659627558);
                        abstractC17911tM13239g = viewState.m13239g((InterfaceC39171c) c28655q.m87161k(c28674u2), m13183v(interfaceC28670t2M13165f0), m13184w(interfaceC28670t2M13165f1));
                        c28655q.m87173q(false);
                    }
                    zM87157i4 = c28655q.m87157i(viewState);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i4) {
                        objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q.m87172p0(objM87133R9);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, viewState);
                    Modifier modifierM3424u7 = AbstractC1102d.m3424u(viewState.m13251s(), AbstractC1102d.m3411h(viewState.m13250r(), modifier17));
                    InterfaceC39127r0 interfaceC39127r0M66763d1111 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q.m87165m();
                    Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q, modifierM3424u7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i116 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC39127r0M66763d1111);
                    C0209i c0209i117 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m1111);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        modifier21 = modifier17;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i118 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i118, modifierM118962N1111);
                        C2307m c2307m13 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d1112 = AbstractC22989q.m66763d(c2307m13, false);
                        abstractC17911t = abstractC17911tM13239g;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q.m87165m();
                        Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q, modifier19);
                        c28655q.m87158i0();
                        Modifier modifier21115 = modifier19;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC39127r0M66763d1112);
                        AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m1112);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i118, modifierM118962N1112);
                        int i41117 = i41116 >> 12;
                        m13131D(modifier21114, c28655q, i41117 & 14);
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            interfaceC28670t3 = interfaceC28670t2;
                            objM87133R10 = new C2175b(interfaceC28670t3, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            interfaceC28670t3 = interfaceC28670t2;
                        }
                        Modifier modifierM3480c13 = AbstractC1125a.m3480c(c2314t8, (Function1) objM87133R10);
                        InterfaceC39127r0 interfaceC39127r0M66763d1113 = AbstractC22989q.m66763d(c2307m13, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q.m87165m();
                        Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q, modifierM3480c13);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC39127r0M66763d1113);
                        AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m1113);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i118, modifierM118962N1113);
                        if (viewState.getUsingPrimitiveEdgeFade()) {
                            c28655q.m87150e0(-271151621);
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            m13149V(viewState, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        } else {
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            c28655q.m87150e0(-271065906);
                            m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        }
                        m13144Q(viewState, abstractC17911t2, c28655q, i36);
                        m13134G(viewState, modifier21113, c28655q, (i41117 & 112) | i36);
                        c28655q.m87173q(true);
                        int i41118 = i36;
                        m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i41118);
                        c28655q.m87173q(true);
                        AbstractC4226c.m13097g(viewState, modifier21112, modifier18, null, c28655q, i41118 | (i41116 & 112) | (i41116 & 896), 8);
                        c28655q.m87173q(true);
                        modifier14 = modifier21112;
                        modifier16 = modifier21114;
                        modifier13 = modifier21;
                        modifier11 = modifier21115;
                        modifier15 = modifier18;
                        modifier12 = modifier21113;
                    } else {
                        modifier21 = modifier17;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i119 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i119, modifierM118962N1111);
                    C2307m c2307m14 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d1114 = AbstractC22989q.m66763d(c2307m14, false);
                    abstractC17911t = abstractC17911tM13239g;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q.m87165m();
                    Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q, modifier19);
                    c28655q.m87158i0();
                    Modifier modifier21116 = modifier19;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC39127r0M66763d1114);
                    AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m1114);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i119, modifierM118962N1114);
                    int i41119 = i41116 >> 12;
                    m13131D(modifier21114, c28655q, i41119 & 14);
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28670t3 = interfaceC28670t2;
                        objM87133R10 = new C2175b(interfaceC28670t3, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        interfaceC28670t3 = interfaceC28670t2;
                    }
                    Modifier modifierM3480c14 = AbstractC1125a.m3480c(c2314t8, (Function1) objM87133R10);
                    InterfaceC39127r0 interfaceC39127r0M66763d1115 = AbstractC22989q.m66763d(c2307m14, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q.m87165m();
                    Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q, modifierM3480c14);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC39127r0M66763d1115);
                    AbstractC28683x.m87239G(c28655q, c0209i117, interfaceC28653p1M87165m1115);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i119, modifierM118962N1115);
                    if (viewState.getUsingPrimitiveEdgeFade()) {
                        c28655q.m87150e0(-271151621);
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        m13149V(viewState, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    } else {
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        c28655q.m87150e0(-271065906);
                        m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    }
                    m13144Q(viewState, abstractC17911t2, c28655q, i36);
                    m13134G(viewState, modifier21113, c28655q, (i41119 & 112) | i36);
                    c28655q.m87173q(true);
                    int i411110 = i36;
                    m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i411110);
                    c28655q.m87173q(true);
                    AbstractC4226c.m13097g(viewState, modifier21112, modifier18, null, c28655q, i411110 | (i41116 & 112) | (i41116 & 896), 8);
                    c28655q.m87173q(true);
                    modifier14 = modifier21112;
                    modifier16 = modifier21114;
                    modifier13 = modifier21;
                    modifier11 = modifier21116;
                    modifier15 = modifier18;
                    modifier12 = modifier21113;
                } else {
                    c28655q.m87138X();
                    modifier11 = modifier4;
                    modifier12 = modifier6;
                    modifier13 = modifier7;
                    modifier14 = modifier8;
                    modifier15 = modifier9;
                    modifier16 = modifier10;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(modifier13, modifier14, modifier15, modifier11, modifier16, modifier12, viewState, i13, i14, 2);
                }
            }
            i15 |= 24576;
            modifier10 = modifier5;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87153g(modifier6)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(viewState)) {
                    i39 = 1048576;
                } else {
                    i39 = 524288;
                }
                i15 |= i39;
            }
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i44 != 0) {
                    modifier17 = c2314t;
                } else {
                    modifier17 = modifier7;
                }
                if (i45 != 0) {
                    modifier8 = c2314t;
                }
                if (i16 != 0) {
                    modifier18 = c2314t;
                } else {
                    modifier18 = modifier9;
                }
                if (i18 != 0) {
                    modifier19 = c2314t;
                } else {
                    modifier19 = modifier4;
                }
                if (i24 != 0) {
                    modifier10 = c2314t;
                }
                if (i26 != 0) {
                    modifier20 = c2314t;
                } else {
                    modifier20 = modifier6;
                }
                i28 = (i15 >> 18) & 14;
                C23471q c23471qM13167g7 = m13167g0(viewState, c28655q, i28);
                iIntValue = ((Number) c23471qM13167g7.f92947w).intValue();
                iIntValue2 = ((Number) c23471qM13167g7.f92948x).intValue();
                iIntValue3 = ((Number) c23471qM13167g7.f92949y).intValue();
                fM13246n = viewState.getRadius() / C4242s.INSTANCE.m13253a();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    i37 = viewState.getOutline().getSegmentCountRange().f71134x;
                    arrayList3 = new ArrayList(i37);
                    while (i38 < i37) {
                        arrayList3.add(AbstractC28683x.m87272z(Float.valueOf(0.0f)));
                    }
                    c28655q.m87172p0(arrayList3);
                    objM87133R = arrayList3;
                }
                list = (List) objM87133R;
                c28655q.m87150e0(916216129);
                i29 = viewState.getOutline().getSegmentCountRange().f71134x;
                arrayList = new ArrayList(i29);
                i34 = 0;
                while (i34 < i29) {
                    ArrayList arrayList11 = arrayList;
                    arrayList11.add(AbstractC11352g.m30588b(((Number) ((InterfaceC28601c1) list.get(i34)).getValue()).floatValue(), AbstractC11348f.m30574v((int) Duration.m134273getInWholeMillisecondsimpl(viewState.getOutline().getAnimationIntervalPerGroup()), 0, viewState.getOutline().getAnimationEasing(), 2), null, null, c28655q, 0, 28));
                    i34++;
                    arrayList = arrayList11;
                    modifier10 = modifier10;
                    i29 = i29;
                    i15 = i15;
                    modifier20 = modifier20;
                    i28 = i28;
                    c2314t = c2314t;
                    modifier8 = modifier8;
                }
                C2314t c2314t9 = c2314t;
                int i411111 = i15;
                Modifier modifier21117 = modifier8;
                Modifier modifier21118 = modifier20;
                i35 = i28;
                Modifier modifier21119 = modifier10;
                arrayList2 = arrayList;
                c28655q.m87173q(false);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Integer.valueOf(viewState.getOutline().getSegmentCount()));
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                c28674u2 = AbstractC2453v1.f9569h;
                interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: c51.g
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC4234k.m13129B(interfaceC39171c, arrayList2, iIntValue, iIntValue2, iIntValue3, interfaceC28601c1);
                        }
                    });
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                InterfaceC18280f interfaceC18280fM13192e8 = viewState.getOutline().getPointScalarRange();
                Long lValueOf8 = Long.valueOf(viewState.getOutline().m13190c());
                zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(list) | c28655q.m87147d(fM13246n);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new a(viewState, list, fM13246n, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(viewState, list, fM13246n, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87254h(interfaceC18280fM13192e8, lValueOf8, (InterfaceC4351m) objM87133R4, c28655q);
                Integer numValueOf8 = Integer.valueOf(viewState.getOutline().getSegmentCount());
                zM87157i2 = c28655q.m87157i(viewState);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R5 = new b(viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new b(viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf8);
                zM87157i3 = c28655q.m87157i(viewState);
                objM87133R6 = c28655q.m87133R();
                if (zM87157i3) {
                    objM87133R6 = new c(viewState, null);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new c(viewState, null);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                c17891jM51478a = AbstractC17897m.m51478a();
                if (!viewState.getUsingPrimitiveEdgeFade()) {
                    m13169h0(viewState, iIntValue, iIntValue2, c17891jM51478a, m13130C(interfaceC28670t2));
                }
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(viewState.getColors().f92937w);
                    c28655q.m87172p0(objM87133R7);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87272z(viewState.getColors().f92938x);
                    c28655q.m87172p0(objM87133R8);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R8;
                interfaceC28670t2M13165f0 = m13165f0(m13179r(interfaceC28601c2), c28655q, 0);
                interfaceC28670t2M13165f1 = m13165f0(m13181t(interfaceC28601c3), c28655q, 0);
                if (viewState.getTransition() == null) {
                    c28655q.m87150e0(-1659695200);
                    abstractC17911tM13239g = viewState.m13238f((InterfaceC39171c) c28655q.m87161k(c28674u2));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1659627558);
                    abstractC17911tM13239g = viewState.m13239g((InterfaceC39171c) c28655q.m87161k(c28674u2), m13183v(interfaceC28670t2M13165f0), m13184w(interfaceC28670t2M13165f1));
                    c28655q.m87173q(false);
                }
                zM87157i4 = c28655q.m87157i(viewState);
                objM87133R9 = c28655q.m87133R();
                if (zM87157i4) {
                    objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R9);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, viewState);
                Modifier modifierM3424u8 = AbstractC1102d.m3424u(viewState.m13251s(), AbstractC1102d.m3411h(viewState.m13250r(), modifier17));
                InterfaceC39127r0 interfaceC39127r0M66763d1116 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q.m87165m();
                Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q, modifierM3424u8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i1110 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i1110, interfaceC39127r0M66763d1116);
                C0209i c0209i1111 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i1111, interfaceC28653p1M87165m1116);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    modifier21 = modifier17;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1112 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1112, modifierM118962N1116);
                    C2307m c2307m15 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d1117 = AbstractC22989q.m66763d(c2307m15, false);
                    abstractC17911t = abstractC17911tM13239g;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q.m87165m();
                    Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q, modifier19);
                    c28655q.m87158i0();
                    Modifier modifier211110 = modifier19;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1110, interfaceC39127r0M66763d1117);
                    AbstractC28683x.m87239G(c28655q, c0209i1111, interfaceC28653p1M87165m1117);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1112, modifierM118962N1117);
                    int i411112 = i411111 >> 12;
                    m13131D(modifier21119, c28655q, i411112 & 14);
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28670t3 = interfaceC28670t2;
                        objM87133R10 = new C2175b(interfaceC28670t3, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        interfaceC28670t3 = interfaceC28670t2;
                    }
                    Modifier modifierM3480c15 = AbstractC1125a.m3480c(c2314t9, (Function1) objM87133R10);
                    InterfaceC39127r0 interfaceC39127r0M66763d1118 = AbstractC22989q.m66763d(c2307m15, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q.m87165m();
                    Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q, modifierM3480c15);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1110, interfaceC39127r0M66763d1118);
                    AbstractC28683x.m87239G(c28655q, c0209i1111, interfaceC28653p1M87165m1118);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1112, modifierM118962N1118);
                    if (viewState.getUsingPrimitiveEdgeFade()) {
                        c28655q.m87150e0(-271151621);
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        m13149V(viewState, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    } else {
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        c28655q.m87150e0(-271065906);
                        m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    }
                    m13144Q(viewState, abstractC17911t2, c28655q, i36);
                    m13134G(viewState, modifier21118, c28655q, (i411112 & 112) | i36);
                    c28655q.m87173q(true);
                    int i411113 = i36;
                    m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i411113);
                    c28655q.m87173q(true);
                    AbstractC4226c.m13097g(viewState, modifier21117, modifier18, null, c28655q, i411113 | (i411111 & 112) | (i411111 & 896), 8);
                    c28655q.m87173q(true);
                    modifier14 = modifier21117;
                    modifier16 = modifier21119;
                    modifier13 = modifier21;
                    modifier11 = modifier211110;
                    modifier15 = modifier18;
                    modifier12 = modifier21118;
                } else {
                    modifier21 = modifier17;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i1113 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1113, modifierM118962N1116);
                C2307m c2307m16 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d1119 = AbstractC22989q.m66763d(c2307m16, false);
                abstractC17911t = abstractC17911tM13239g;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q.m87165m();
                Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q, modifier19);
                c28655q.m87158i0();
                Modifier modifier211111 = modifier19;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1110, interfaceC39127r0M66763d1119);
                AbstractC28683x.m87239G(c28655q, c0209i1111, interfaceC28653p1M87165m1119);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1113, modifierM118962N1119);
                int i411114 = i411111 >> 12;
                m13131D(modifier21119, c28655q, i411114 & 14);
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    interfaceC28670t3 = interfaceC28670t2;
                    objM87133R10 = new C2175b(interfaceC28670t3, 2);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    interfaceC28670t3 = interfaceC28670t2;
                }
                Modifier modifierM3480c16 = AbstractC1125a.m3480c(c2314t9, (Function1) objM87133R10);
                InterfaceC39127r0 interfaceC39127r0M66763d11110 = AbstractC22989q.m66763d(c2307m16, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q.m87165m();
                Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q, modifierM3480c16);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1110, interfaceC39127r0M66763d11110);
                AbstractC28683x.m87239G(c28655q, c0209i1111, interfaceC28653p1M87165m11110);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1113, modifierM118962N11110);
                if (viewState.getUsingPrimitiveEdgeFade()) {
                    c28655q.m87150e0(-271151621);
                    abstractC17911t2 = abstractC17911t;
                    i36 = i35;
                    m13149V(viewState, abstractC17911t2, c28655q, i36);
                    c28655q.m87173q(false);
                } else {
                    abstractC17911t2 = abstractC17911t;
                    i36 = i35;
                    c28655q.m87150e0(-271065906);
                    m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                    c28655q.m87173q(false);
                }
                m13144Q(viewState, abstractC17911t2, c28655q, i36);
                m13134G(viewState, modifier21118, c28655q, (i411114 & 112) | i36);
                c28655q.m87173q(true);
                int i411115 = i36;
                m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i411115);
                c28655q.m87173q(true);
                AbstractC4226c.m13097g(viewState, modifier21117, modifier18, null, c28655q, i411115 | (i411111 & 112) | (i411111 & 896), 8);
                c28655q.m87173q(true);
                modifier14 = modifier21117;
                modifier16 = modifier21119;
                modifier13 = modifier21;
                modifier11 = modifier211111;
                modifier15 = modifier18;
                modifier12 = modifier21118;
            } else {
                c28655q.m87138X();
                modifier11 = modifier4;
                modifier12 = modifier6;
                modifier13 = modifier7;
                modifier14 = modifier8;
                modifier15 = modifier9;
                modifier16 = modifier10;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(modifier13, modifier14, modifier15, modifier11, modifier16, modifier12, viewState, i13, i14, 2);
            }
        }
        i15 |= 48;
        modifier8 = modifier2;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                modifier9 = modifier3;
                if (c28655q.m87153g(modifier9)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87153g(modifier4)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        modifier10 = modifier5;
                        if (c28655q.m87153g(modifier10)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87153g(modifier6)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87157i(viewState)) {
                            i39 = 1048576;
                        } else {
                            i39 = 524288;
                        }
                        i15 |= i39;
                    }
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i44 != 0) {
                            modifier17 = c2314t;
                        } else {
                            modifier17 = modifier7;
                        }
                        if (i45 != 0) {
                            modifier8 = c2314t;
                        }
                        if (i16 != 0) {
                            modifier18 = c2314t;
                        } else {
                            modifier18 = modifier9;
                        }
                        if (i18 != 0) {
                            modifier19 = c2314t;
                        } else {
                            modifier19 = modifier4;
                        }
                        if (i24 != 0) {
                            modifier10 = c2314t;
                        }
                        if (i26 != 0) {
                            modifier20 = c2314t;
                        } else {
                            modifier20 = modifier6;
                        }
                        i28 = (i15 >> 18) & 14;
                        C23471q c23471qM13167g8 = m13167g0(viewState, c28655q, i28);
                        iIntValue = ((Number) c23471qM13167g8.f92947w).intValue();
                        iIntValue2 = ((Number) c23471qM13167g8.f92948x).intValue();
                        iIntValue3 = ((Number) c23471qM13167g8.f92949y).intValue();
                        fM13246n = viewState.getRadius() / C4242s.INSTANCE.m13253a();
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            i37 = viewState.getOutline().getSegmentCountRange().f71134x;
                            arrayList3 = new ArrayList(i37);
                            while (i38 < i37) {
                                arrayList3.add(AbstractC28683x.m87272z(Float.valueOf(0.0f)));
                            }
                            c28655q.m87172p0(arrayList3);
                            objM87133R = arrayList3;
                        }
                        list = (List) objM87133R;
                        c28655q.m87150e0(916216129);
                        i29 = viewState.getOutline().getSegmentCountRange().f71134x;
                        arrayList = new ArrayList(i29);
                        i34 = 0;
                        while (i34 < i29) {
                            ArrayList arrayList12 = arrayList;
                            arrayList12.add(AbstractC11352g.m30588b(((Number) ((InterfaceC28601c1) list.get(i34)).getValue()).floatValue(), AbstractC11348f.m30574v((int) Duration.m134273getInWholeMillisecondsimpl(viewState.getOutline().getAnimationIntervalPerGroup()), 0, viewState.getOutline().getAnimationEasing(), 2), null, null, c28655q, 0, 28));
                            i34++;
                            arrayList = arrayList12;
                            modifier10 = modifier10;
                            i29 = i29;
                            i15 = i15;
                            modifier20 = modifier20;
                            i28 = i28;
                            c2314t = c2314t;
                            modifier8 = modifier8;
                        }
                        C2314t c2314t10 = c2314t;
                        int i411116 = i15;
                        Modifier modifier211112 = modifier8;
                        Modifier modifier211113 = modifier20;
                        i35 = i28;
                        Modifier modifier211114 = modifier10;
                        arrayList2 = arrayList;
                        c28655q.m87173q(false);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(Integer.valueOf(viewState.getOutline().getSegmentCount()));
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        c28674u2 = AbstractC2453v1.f9569h;
                        interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: c51.g
                                @Override // c93.InterfaceC4339a
                                public final Object invoke() {
                                    return AbstractC4234k.m13129B(interfaceC39171c, arrayList2, iIntValue, iIntValue2, iIntValue3, interfaceC28601c1);
                                }
                            });
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                        InterfaceC18280f interfaceC18280fM13192e9 = viewState.getOutline().getPointScalarRange();
                        Long lValueOf9 = Long.valueOf(viewState.getOutline().m13190c());
                        zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(list) | c28655q.m87147d(fM13246n);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87157i) {
                            objM87133R4 = new a(viewState, list, fM13246n, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new a(viewState, list, fM13246n, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87254h(interfaceC18280fM13192e9, lValueOf9, (InterfaceC4351m) objM87133R4, c28655q);
                        Integer numValueOf9 = Integer.valueOf(viewState.getOutline().getSegmentCount());
                        zM87157i2 = c28655q.m87157i(viewState);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R5 = new b(viewState, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new b(viewState, interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf9);
                        zM87157i3 = c28655q.m87157i(viewState);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87157i3) {
                            objM87133R6 = new c(viewState, null);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new c(viewState, null);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                        c17891jM51478a = AbstractC17897m.m51478a();
                        if (!viewState.getUsingPrimitiveEdgeFade()) {
                            m13169h0(viewState, iIntValue, iIntValue2, c17891jM51478a, m13130C(interfaceC28670t2));
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87272z(viewState.getColors().f92937w);
                            c28655q.m87172p0(objM87133R7);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = AbstractC28683x.m87272z(viewState.getColors().f92938x);
                            c28655q.m87172p0(objM87133R8);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R8;
                        interfaceC28670t2M13165f0 = m13165f0(m13179r(interfaceC28601c2), c28655q, 0);
                        interfaceC28670t2M13165f1 = m13165f0(m13181t(interfaceC28601c3), c28655q, 0);
                        if (viewState.getTransition() == null) {
                            c28655q.m87150e0(-1659695200);
                            abstractC17911tM13239g = viewState.m13238f((InterfaceC39171c) c28655q.m87161k(c28674u2));
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-1659627558);
                            abstractC17911tM13239g = viewState.m13239g((InterfaceC39171c) c28655q.m87161k(c28674u2), m13183v(interfaceC28670t2M13165f0), m13184w(interfaceC28670t2M13165f1));
                            c28655q.m87173q(false);
                        }
                        zM87157i4 = c28655q.m87157i(viewState);
                        objM87133R9 = c28655q.m87133R();
                        if (zM87157i4) {
                            objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                            c28655q.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                            c28655q.m87172p0(objM87133R9);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, viewState);
                        Modifier modifierM3424u9 = AbstractC1102d.m3424u(viewState.m13251s(), AbstractC1102d.m3411h(viewState.m13250r(), modifier17));
                        InterfaceC39127r0 interfaceC39127r0M66763d11111 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q.m87165m();
                        Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q, modifierM3424u9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i1114 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i1114, interfaceC39127r0M66763d11111);
                        C0209i c0209i1115 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i1115, interfaceC28653p1M87165m11111);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            modifier21 = modifier17;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i1116 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i1116, modifierM118962N11111);
                            C2307m c2307m17 = C2299e.f9114w;
                            InterfaceC39127r0 interfaceC39127r0M66763d11112 = AbstractC22989q.m66763d(c2307m17, false);
                            abstractC17911t = abstractC17911tM13239g;
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q.m87165m();
                            Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q, modifier19);
                            c28655q.m87158i0();
                            Modifier modifier211115 = modifier19;
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i1114, interfaceC39127r0M66763d11112);
                            AbstractC28683x.m87239G(c28655q, c0209i1115, interfaceC28653p1M87165m11112);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i1116, modifierM118962N11112);
                            int i411117 = i411116 >> 12;
                            m13131D(modifier211114, c28655q, i411117 & 14);
                            objM87133R10 = c28655q.m87133R();
                            if (objM87133R10 == c28676v0) {
                                interfaceC28670t3 = interfaceC28670t2;
                                objM87133R10 = new C2175b(interfaceC28670t3, 2);
                                c28655q.m87172p0(objM87133R10);
                            } else {
                                interfaceC28670t3 = interfaceC28670t2;
                            }
                            Modifier modifierM3480c17 = AbstractC1125a.m3480c(c2314t10, (Function1) objM87133R10);
                            InterfaceC39127r0 interfaceC39127r0M66763d11113 = AbstractC22989q.m66763d(c2307m17, false);
                            iHashCode3 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q.m87165m();
                            Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q, modifierM3480c17);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i1114, interfaceC39127r0M66763d11113);
                            AbstractC28683x.m87239G(c28655q, c0209i1115, interfaceC28653p1M87165m11113);
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i1116, modifierM118962N11113);
                            if (viewState.getUsingPrimitiveEdgeFade()) {
                                c28655q.m87150e0(-271151621);
                                abstractC17911t2 = abstractC17911t;
                                i36 = i35;
                                m13149V(viewState, abstractC17911t2, c28655q, i36);
                                c28655q.m87173q(false);
                            } else {
                                abstractC17911t2 = abstractC17911t;
                                i36 = i35;
                                c28655q.m87150e0(-271065906);
                                m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                                c28655q.m87173q(false);
                            }
                            m13144Q(viewState, abstractC17911t2, c28655q, i36);
                            m13134G(viewState, modifier211113, c28655q, (i411117 & 112) | i36);
                            c28655q.m87173q(true);
                            int i411118 = i36;
                            m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i411118);
                            c28655q.m87173q(true);
                            AbstractC4226c.m13097g(viewState, modifier211112, modifier18, null, c28655q, i411118 | (i411116 & 112) | (i411116 & 896), 8);
                            c28655q.m87173q(true);
                            modifier14 = modifier211112;
                            modifier16 = modifier211114;
                            modifier13 = modifier21;
                            modifier11 = modifier211115;
                            modifier15 = modifier18;
                            modifier12 = modifier211113;
                        } else {
                            modifier21 = modifier17;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        C0209i c0209i1117 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N11111);
                        C2307m c2307m18 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d11114 = AbstractC22989q.m66763d(c2307m18, false);
                        abstractC17911t = abstractC17911tM13239g;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q.m87165m();
                        Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q, modifier19);
                        c28655q.m87158i0();
                        Modifier modifier211116 = modifier19;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1114, interfaceC39127r0M66763d11114);
                        AbstractC28683x.m87239G(c28655q, c0209i1115, interfaceC28653p1M87165m11114);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N11114);
                        int i411119 = i411116 >> 12;
                        m13131D(modifier211114, c28655q, i411119 & 14);
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            interfaceC28670t3 = interfaceC28670t2;
                            objM87133R10 = new C2175b(interfaceC28670t3, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            interfaceC28670t3 = interfaceC28670t2;
                        }
                        Modifier modifierM3480c18 = AbstractC1125a.m3480c(c2314t10, (Function1) objM87133R10);
                        InterfaceC39127r0 interfaceC39127r0M66763d11115 = AbstractC22989q.m66763d(c2307m18, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q.m87165m();
                        Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q, modifierM3480c18);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1114, interfaceC39127r0M66763d11115);
                        AbstractC28683x.m87239G(c28655q, c0209i1115, interfaceC28653p1M87165m11115);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N11115);
                        if (viewState.getUsingPrimitiveEdgeFade()) {
                            c28655q.m87150e0(-271151621);
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            m13149V(viewState, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        } else {
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            c28655q.m87150e0(-271065906);
                            m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        }
                        m13144Q(viewState, abstractC17911t2, c28655q, i36);
                        m13134G(viewState, modifier211113, c28655q, (i411119 & 112) | i36);
                        c28655q.m87173q(true);
                        int i4111110 = i36;
                        m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i4111110);
                        c28655q.m87173q(true);
                        AbstractC4226c.m13097g(viewState, modifier211112, modifier18, null, c28655q, i4111110 | (i411116 & 112) | (i411116 & 896), 8);
                        c28655q.m87173q(true);
                        modifier14 = modifier211112;
                        modifier16 = modifier211114;
                        modifier13 = modifier21;
                        modifier11 = modifier211116;
                        modifier15 = modifier18;
                        modifier12 = modifier211113;
                    } else {
                        c28655q.m87138X();
                        modifier11 = modifier4;
                        modifier12 = modifier6;
                        modifier13 = modifier7;
                        modifier14 = modifier8;
                        modifier15 = modifier9;
                        modifier16 = modifier10;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2931g(modifier13, modifier14, modifier15, modifier11, modifier16, modifier12, viewState, i13, i14, 2);
                    }
                }
                i15 |= 24576;
                modifier10 = modifier5;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87153g(modifier6)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(viewState)) {
                        i39 = 1048576;
                    } else {
                        i39 = 524288;
                    }
                    i15 |= i39;
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        modifier17 = c2314t;
                    } else {
                        modifier17 = modifier7;
                    }
                    if (i45 != 0) {
                        modifier8 = c2314t;
                    }
                    if (i16 != 0) {
                        modifier18 = c2314t;
                    } else {
                        modifier18 = modifier9;
                    }
                    if (i18 != 0) {
                        modifier19 = c2314t;
                    } else {
                        modifier19 = modifier4;
                    }
                    if (i24 != 0) {
                        modifier10 = c2314t;
                    }
                    if (i26 != 0) {
                        modifier20 = c2314t;
                    } else {
                        modifier20 = modifier6;
                    }
                    i28 = (i15 >> 18) & 14;
                    C23471q c23471qM13167g9 = m13167g0(viewState, c28655q, i28);
                    iIntValue = ((Number) c23471qM13167g9.f92947w).intValue();
                    iIntValue2 = ((Number) c23471qM13167g9.f92948x).intValue();
                    iIntValue3 = ((Number) c23471qM13167g9.f92949y).intValue();
                    fM13246n = viewState.getRadius() / C4242s.INSTANCE.m13253a();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        i37 = viewState.getOutline().getSegmentCountRange().f71134x;
                        arrayList3 = new ArrayList(i37);
                        while (i38 < i37) {
                            arrayList3.add(AbstractC28683x.m87272z(Float.valueOf(0.0f)));
                        }
                        c28655q.m87172p0(arrayList3);
                        objM87133R = arrayList3;
                    }
                    list = (List) objM87133R;
                    c28655q.m87150e0(916216129);
                    i29 = viewState.getOutline().getSegmentCountRange().f71134x;
                    arrayList = new ArrayList(i29);
                    i34 = 0;
                    while (i34 < i29) {
                        ArrayList arrayList13 = arrayList;
                        arrayList13.add(AbstractC11352g.m30588b(((Number) ((InterfaceC28601c1) list.get(i34)).getValue()).floatValue(), AbstractC11348f.m30574v((int) Duration.m134273getInWholeMillisecondsimpl(viewState.getOutline().getAnimationIntervalPerGroup()), 0, viewState.getOutline().getAnimationEasing(), 2), null, null, c28655q, 0, 28));
                        i34++;
                        arrayList = arrayList13;
                        modifier10 = modifier10;
                        i29 = i29;
                        i15 = i15;
                        modifier20 = modifier20;
                        i28 = i28;
                        c2314t = c2314t;
                        modifier8 = modifier8;
                    }
                    C2314t c2314t11 = c2314t;
                    int i4111111 = i15;
                    Modifier modifier211117 = modifier8;
                    Modifier modifier211118 = modifier20;
                    i35 = i28;
                    Modifier modifier211119 = modifier10;
                    arrayList2 = arrayList;
                    c28655q.m87173q(false);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Integer.valueOf(viewState.getOutline().getSegmentCount()));
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    c28674u2 = AbstractC2453v1.f9569h;
                    interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: c51.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC4234k.m13129B(interfaceC39171c, arrayList2, iIntValue, iIntValue2, iIntValue3, interfaceC28601c1);
                            }
                        });
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                    InterfaceC18280f interfaceC18280fM13192e10 = viewState.getOutline().getPointScalarRange();
                    Long lValueOf10 = Long.valueOf(viewState.getOutline().m13190c());
                    zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(list) | c28655q.m87147d(fM13246n);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new a(viewState, list, fM13246n, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(viewState, list, fM13246n, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(interfaceC18280fM13192e10, lValueOf10, (InterfaceC4351m) objM87133R4, c28655q);
                    Integer numValueOf10 = Integer.valueOf(viewState.getOutline().getSegmentCount());
                    zM87157i2 = c28655q.m87157i(viewState);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R5 = new b(viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new b(viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf10);
                    zM87157i3 = c28655q.m87157i(viewState);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87157i3) {
                        objM87133R6 = new c(viewState, null);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new c(viewState, null);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                    c17891jM51478a = AbstractC17897m.m51478a();
                    if (!viewState.getUsingPrimitiveEdgeFade()) {
                        m13169h0(viewState, iIntValue, iIntValue2, c17891jM51478a, m13130C(interfaceC28670t2));
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(viewState.getColors().f92937w);
                        c28655q.m87172p0(objM87133R7);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87272z(viewState.getColors().f92938x);
                        c28655q.m87172p0(objM87133R8);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R8;
                    interfaceC28670t2M13165f0 = m13165f0(m13179r(interfaceC28601c2), c28655q, 0);
                    interfaceC28670t2M13165f1 = m13165f0(m13181t(interfaceC28601c3), c28655q, 0);
                    if (viewState.getTransition() == null) {
                        c28655q.m87150e0(-1659695200);
                        abstractC17911tM13239g = viewState.m13238f((InterfaceC39171c) c28655q.m87161k(c28674u2));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1659627558);
                        abstractC17911tM13239g = viewState.m13239g((InterfaceC39171c) c28655q.m87161k(c28674u2), m13183v(interfaceC28670t2M13165f0), m13184w(interfaceC28670t2M13165f1));
                        c28655q.m87173q(false);
                    }
                    zM87157i4 = c28655q.m87157i(viewState);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i4) {
                        objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q.m87172p0(objM87133R9);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, viewState);
                    Modifier modifierM3424u10 = AbstractC1102d.m3424u(viewState.m13251s(), AbstractC1102d.m3411h(viewState.m13250r(), modifier17));
                    InterfaceC39127r0 interfaceC39127r0M66763d11116 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q.m87165m();
                    Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q, modifierM3424u10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i1118 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i1118, interfaceC39127r0M66763d11116);
                    C0209i c0209i1119 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i1119, interfaceC28653p1M87165m11116);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        modifier21 = modifier17;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i11110 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i11110, modifierM118962N11116);
                        C2307m c2307m19 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d11117 = AbstractC22989q.m66763d(c2307m19, false);
                        abstractC17911t = abstractC17911tM13239g;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q.m87165m();
                        Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q, modifier19);
                        c28655q.m87158i0();
                        Modifier modifier2111110 = modifier19;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1118, interfaceC39127r0M66763d11117);
                        AbstractC28683x.m87239G(c28655q, c0209i1119, interfaceC28653p1M87165m11117);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11110, modifierM118962N11117);
                        int i4111112 = i4111111 >> 12;
                        m13131D(modifier211119, c28655q, i4111112 & 14);
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            interfaceC28670t3 = interfaceC28670t2;
                            objM87133R10 = new C2175b(interfaceC28670t3, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            interfaceC28670t3 = interfaceC28670t2;
                        }
                        Modifier modifierM3480c19 = AbstractC1125a.m3480c(c2314t11, (Function1) objM87133R10);
                        InterfaceC39127r0 interfaceC39127r0M66763d11118 = AbstractC22989q.m66763d(c2307m19, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q.m87165m();
                        Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q, modifierM3480c19);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i1118, interfaceC39127r0M66763d11118);
                        AbstractC28683x.m87239G(c28655q, c0209i1119, interfaceC28653p1M87165m11118);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11110, modifierM118962N11118);
                        if (viewState.getUsingPrimitiveEdgeFade()) {
                            c28655q.m87150e0(-271151621);
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            m13149V(viewState, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        } else {
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            c28655q.m87150e0(-271065906);
                            m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        }
                        m13144Q(viewState, abstractC17911t2, c28655q, i36);
                        m13134G(viewState, modifier211118, c28655q, (i4111112 & 112) | i36);
                        c28655q.m87173q(true);
                        int i4111113 = i36;
                        m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i4111113);
                        c28655q.m87173q(true);
                        AbstractC4226c.m13097g(viewState, modifier211117, modifier18, null, c28655q, i4111113 | (i4111111 & 112) | (i4111111 & 896), 8);
                        c28655q.m87173q(true);
                        modifier14 = modifier211117;
                        modifier16 = modifier211119;
                        modifier13 = modifier21;
                        modifier11 = modifier2111110;
                        modifier15 = modifier18;
                        modifier12 = modifier211118;
                    } else {
                        modifier21 = modifier17;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i11111 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i11111, modifierM118962N11116);
                    C2307m c2307m110 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d11119 = AbstractC22989q.m66763d(c2307m110, false);
                    abstractC17911t = abstractC17911tM13239g;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11119 = c28655q.m87165m();
                    Modifier modifierM118962N11119 = AbstractC37056f.m118962N(c28655q, modifier19);
                    c28655q.m87158i0();
                    Modifier modifier2111111 = modifier19;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1118, interfaceC39127r0M66763d11119);
                    AbstractC28683x.m87239G(c28655q, c0209i1119, interfaceC28653p1M87165m11119);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11111, modifierM118962N11119);
                    int i4111114 = i4111111 >> 12;
                    m13131D(modifier211119, c28655q, i4111114 & 14);
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28670t3 = interfaceC28670t2;
                        objM87133R10 = new C2175b(interfaceC28670t3, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        interfaceC28670t3 = interfaceC28670t2;
                    }
                    Modifier modifierM3480c110 = AbstractC1125a.m3480c(c2314t11, (Function1) objM87133R10);
                    InterfaceC39127r0 interfaceC39127r0M66763d111110 = AbstractC22989q.m66763d(c2307m110, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111110 = c28655q.m87165m();
                    Modifier modifierM118962N111110 = AbstractC37056f.m118962N(c28655q, modifierM3480c110);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1118, interfaceC39127r0M66763d111110);
                    AbstractC28683x.m87239G(c28655q, c0209i1119, interfaceC28653p1M87165m111110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11111, modifierM118962N111110);
                    if (viewState.getUsingPrimitiveEdgeFade()) {
                        c28655q.m87150e0(-271151621);
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        m13149V(viewState, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    } else {
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        c28655q.m87150e0(-271065906);
                        m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    }
                    m13144Q(viewState, abstractC17911t2, c28655q, i36);
                    m13134G(viewState, modifier211118, c28655q, (i4111114 & 112) | i36);
                    c28655q.m87173q(true);
                    int i4111115 = i36;
                    m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i4111115);
                    c28655q.m87173q(true);
                    AbstractC4226c.m13097g(viewState, modifier211117, modifier18, null, c28655q, i4111115 | (i4111111 & 112) | (i4111111 & 896), 8);
                    c28655q.m87173q(true);
                    modifier14 = modifier211117;
                    modifier16 = modifier211119;
                    modifier13 = modifier21;
                    modifier11 = modifier2111111;
                    modifier15 = modifier18;
                    modifier12 = modifier211118;
                } else {
                    c28655q.m87138X();
                    modifier11 = modifier4;
                    modifier12 = modifier6;
                    modifier13 = modifier7;
                    modifier14 = modifier8;
                    modifier15 = modifier9;
                    modifier16 = modifier10;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(modifier13, modifier14, modifier15, modifier11, modifier16, modifier12, viewState, i13, i14, 2);
                }
            }
            i15 |= 3072;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    modifier10 = modifier5;
                    if (c28655q.m87153g(modifier10)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87153g(modifier6)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(viewState)) {
                        i39 = 1048576;
                    } else {
                        i39 = 524288;
                    }
                    i15 |= i39;
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        modifier17 = c2314t;
                    } else {
                        modifier17 = modifier7;
                    }
                    if (i45 != 0) {
                        modifier8 = c2314t;
                    }
                    if (i16 != 0) {
                        modifier18 = c2314t;
                    } else {
                        modifier18 = modifier9;
                    }
                    if (i18 != 0) {
                        modifier19 = c2314t;
                    } else {
                        modifier19 = modifier4;
                    }
                    if (i24 != 0) {
                        modifier10 = c2314t;
                    }
                    if (i26 != 0) {
                        modifier20 = c2314t;
                    } else {
                        modifier20 = modifier6;
                    }
                    i28 = (i15 >> 18) & 14;
                    C23471q c23471qM13167g10 = m13167g0(viewState, c28655q, i28);
                    iIntValue = ((Number) c23471qM13167g10.f92947w).intValue();
                    iIntValue2 = ((Number) c23471qM13167g10.f92948x).intValue();
                    iIntValue3 = ((Number) c23471qM13167g10.f92949y).intValue();
                    fM13246n = viewState.getRadius() / C4242s.INSTANCE.m13253a();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        i37 = viewState.getOutline().getSegmentCountRange().f71134x;
                        arrayList3 = new ArrayList(i37);
                        while (i38 < i37) {
                            arrayList3.add(AbstractC28683x.m87272z(Float.valueOf(0.0f)));
                        }
                        c28655q.m87172p0(arrayList3);
                        objM87133R = arrayList3;
                    }
                    list = (List) objM87133R;
                    c28655q.m87150e0(916216129);
                    i29 = viewState.getOutline().getSegmentCountRange().f71134x;
                    arrayList = new ArrayList(i29);
                    i34 = 0;
                    while (i34 < i29) {
                        ArrayList arrayList14 = arrayList;
                        arrayList14.add(AbstractC11352g.m30588b(((Number) ((InterfaceC28601c1) list.get(i34)).getValue()).floatValue(), AbstractC11348f.m30574v((int) Duration.m134273getInWholeMillisecondsimpl(viewState.getOutline().getAnimationIntervalPerGroup()), 0, viewState.getOutline().getAnimationEasing(), 2), null, null, c28655q, 0, 28));
                        i34++;
                        arrayList = arrayList14;
                        modifier10 = modifier10;
                        i29 = i29;
                        i15 = i15;
                        modifier20 = modifier20;
                        i28 = i28;
                        c2314t = c2314t;
                        modifier8 = modifier8;
                    }
                    C2314t c2314t12 = c2314t;
                    int i4111116 = i15;
                    Modifier modifier2111112 = modifier8;
                    Modifier modifier2111113 = modifier20;
                    i35 = i28;
                    Modifier modifier2111114 = modifier10;
                    arrayList2 = arrayList;
                    c28655q.m87173q(false);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Integer.valueOf(viewState.getOutline().getSegmentCount()));
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    c28674u2 = AbstractC2453v1.f9569h;
                    interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: c51.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC4234k.m13129B(interfaceC39171c, arrayList2, iIntValue, iIntValue2, iIntValue3, interfaceC28601c1);
                            }
                        });
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                    InterfaceC18280f interfaceC18280fM13192e11 = viewState.getOutline().getPointScalarRange();
                    Long lValueOf11 = Long.valueOf(viewState.getOutline().m13190c());
                    zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(list) | c28655q.m87147d(fM13246n);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new a(viewState, list, fM13246n, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(viewState, list, fM13246n, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(interfaceC18280fM13192e11, lValueOf11, (InterfaceC4351m) objM87133R4, c28655q);
                    Integer numValueOf11 = Integer.valueOf(viewState.getOutline().getSegmentCount());
                    zM87157i2 = c28655q.m87157i(viewState);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R5 = new b(viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new b(viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf11);
                    zM87157i3 = c28655q.m87157i(viewState);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87157i3) {
                        objM87133R6 = new c(viewState, null);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new c(viewState, null);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                    c17891jM51478a = AbstractC17897m.m51478a();
                    if (!viewState.getUsingPrimitiveEdgeFade()) {
                        m13169h0(viewState, iIntValue, iIntValue2, c17891jM51478a, m13130C(interfaceC28670t2));
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(viewState.getColors().f92937w);
                        c28655q.m87172p0(objM87133R7);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87272z(viewState.getColors().f92938x);
                        c28655q.m87172p0(objM87133R8);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R8;
                    interfaceC28670t2M13165f0 = m13165f0(m13179r(interfaceC28601c2), c28655q, 0);
                    interfaceC28670t2M13165f1 = m13165f0(m13181t(interfaceC28601c3), c28655q, 0);
                    if (viewState.getTransition() == null) {
                        c28655q.m87150e0(-1659695200);
                        abstractC17911tM13239g = viewState.m13238f((InterfaceC39171c) c28655q.m87161k(c28674u2));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1659627558);
                        abstractC17911tM13239g = viewState.m13239g((InterfaceC39171c) c28655q.m87161k(c28674u2), m13183v(interfaceC28670t2M13165f0), m13184w(interfaceC28670t2M13165f1));
                        c28655q.m87173q(false);
                    }
                    zM87157i4 = c28655q.m87157i(viewState);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i4) {
                        objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q.m87172p0(objM87133R9);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, viewState);
                    Modifier modifierM3424u11 = AbstractC1102d.m3424u(viewState.m13251s(), AbstractC1102d.m3411h(viewState.m13250r(), modifier17));
                    InterfaceC39127r0 interfaceC39127r0M66763d111111 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111 = c28655q.m87165m();
                    Modifier modifierM118962N111111 = AbstractC37056f.m118962N(c28655q, modifierM3424u11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i11112 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i11112, interfaceC39127r0M66763d111111);
                    C0209i c0209i11113 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i11113, interfaceC28653p1M87165m111111);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        modifier21 = modifier17;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i11114 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i11114, modifierM118962N111111);
                        C2307m c2307m111 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d111112 = AbstractC22989q.m66763d(c2307m111, false);
                        abstractC17911t = abstractC17911tM13239g;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111112 = c28655q.m87165m();
                        Modifier modifierM118962N111112 = AbstractC37056f.m118962N(c28655q, modifier19);
                        c28655q.m87158i0();
                        Modifier modifier2111115 = modifier19;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11112, interfaceC39127r0M66763d111112);
                        AbstractC28683x.m87239G(c28655q, c0209i11113, interfaceC28653p1M87165m111112);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11114, modifierM118962N111112);
                        int i4111117 = i4111116 >> 12;
                        m13131D(modifier2111114, c28655q, i4111117 & 14);
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            interfaceC28670t3 = interfaceC28670t2;
                            objM87133R10 = new C2175b(interfaceC28670t3, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            interfaceC28670t3 = interfaceC28670t2;
                        }
                        Modifier modifierM3480c111 = AbstractC1125a.m3480c(c2314t12, (Function1) objM87133R10);
                        InterfaceC39127r0 interfaceC39127r0M66763d111113 = AbstractC22989q.m66763d(c2307m111, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m111113 = c28655q.m87165m();
                        Modifier modifierM118962N111113 = AbstractC37056f.m118962N(c28655q, modifierM3480c111);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11112, interfaceC39127r0M66763d111113);
                        AbstractC28683x.m87239G(c28655q, c0209i11113, interfaceC28653p1M87165m111113);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i11114, modifierM118962N111113);
                        if (viewState.getUsingPrimitiveEdgeFade()) {
                            c28655q.m87150e0(-271151621);
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            m13149V(viewState, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        } else {
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            c28655q.m87150e0(-271065906);
                            m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        }
                        m13144Q(viewState, abstractC17911t2, c28655q, i36);
                        m13134G(viewState, modifier2111113, c28655q, (i4111117 & 112) | i36);
                        c28655q.m87173q(true);
                        int i4111118 = i36;
                        m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i4111118);
                        c28655q.m87173q(true);
                        AbstractC4226c.m13097g(viewState, modifier2111112, modifier18, null, c28655q, i4111118 | (i4111116 & 112) | (i4111116 & 896), 8);
                        c28655q.m87173q(true);
                        modifier14 = modifier2111112;
                        modifier16 = modifier2111114;
                        modifier13 = modifier21;
                        modifier11 = modifier2111115;
                        modifier15 = modifier18;
                        modifier12 = modifier2111113;
                    } else {
                        modifier21 = modifier17;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i11115 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i11115, modifierM118962N111111);
                    C2307m c2307m112 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d111114 = AbstractC22989q.m66763d(c2307m112, false);
                    abstractC17911t = abstractC17911tM13239g;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111114 = c28655q.m87165m();
                    Modifier modifierM118962N111114 = AbstractC37056f.m118962N(c28655q, modifier19);
                    c28655q.m87158i0();
                    Modifier modifier2111116 = modifier19;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11112, interfaceC39127r0M66763d111114);
                    AbstractC28683x.m87239G(c28655q, c0209i11113, interfaceC28653p1M87165m111114);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11115, modifierM118962N111114);
                    int i4111119 = i4111116 >> 12;
                    m13131D(modifier2111114, c28655q, i4111119 & 14);
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28670t3 = interfaceC28670t2;
                        objM87133R10 = new C2175b(interfaceC28670t3, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        interfaceC28670t3 = interfaceC28670t2;
                    }
                    Modifier modifierM3480c112 = AbstractC1125a.m3480c(c2314t12, (Function1) objM87133R10);
                    InterfaceC39127r0 interfaceC39127r0M66763d111115 = AbstractC22989q.m66763d(c2307m112, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111115 = c28655q.m87165m();
                    Modifier modifierM118962N111115 = AbstractC37056f.m118962N(c28655q, modifierM3480c112);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11112, interfaceC39127r0M66763d111115);
                    AbstractC28683x.m87239G(c28655q, c0209i11113, interfaceC28653p1M87165m111115);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11115, modifierM118962N111115);
                    if (viewState.getUsingPrimitiveEdgeFade()) {
                        c28655q.m87150e0(-271151621);
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        m13149V(viewState, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    } else {
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        c28655q.m87150e0(-271065906);
                        m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    }
                    m13144Q(viewState, abstractC17911t2, c28655q, i36);
                    m13134G(viewState, modifier2111113, c28655q, (i4111119 & 112) | i36);
                    c28655q.m87173q(true);
                    int i41111110 = i36;
                    m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i41111110);
                    c28655q.m87173q(true);
                    AbstractC4226c.m13097g(viewState, modifier2111112, modifier18, null, c28655q, i41111110 | (i4111116 & 112) | (i4111116 & 896), 8);
                    c28655q.m87173q(true);
                    modifier14 = modifier2111112;
                    modifier16 = modifier2111114;
                    modifier13 = modifier21;
                    modifier11 = modifier2111116;
                    modifier15 = modifier18;
                    modifier12 = modifier2111113;
                } else {
                    c28655q.m87138X();
                    modifier11 = modifier4;
                    modifier12 = modifier6;
                    modifier13 = modifier7;
                    modifier14 = modifier8;
                    modifier15 = modifier9;
                    modifier16 = modifier10;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(modifier13, modifier14, modifier15, modifier11, modifier16, modifier12, viewState, i13, i14, 2);
                }
            }
            i15 |= 24576;
            modifier10 = modifier5;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87153g(modifier6)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(viewState)) {
                    i39 = 1048576;
                } else {
                    i39 = 524288;
                }
                i15 |= i39;
            }
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i44 != 0) {
                    modifier17 = c2314t;
                } else {
                    modifier17 = modifier7;
                }
                if (i45 != 0) {
                    modifier8 = c2314t;
                }
                if (i16 != 0) {
                    modifier18 = c2314t;
                } else {
                    modifier18 = modifier9;
                }
                if (i18 != 0) {
                    modifier19 = c2314t;
                } else {
                    modifier19 = modifier4;
                }
                if (i24 != 0) {
                    modifier10 = c2314t;
                }
                if (i26 != 0) {
                    modifier20 = c2314t;
                } else {
                    modifier20 = modifier6;
                }
                i28 = (i15 >> 18) & 14;
                C23471q c23471qM13167g11 = m13167g0(viewState, c28655q, i28);
                iIntValue = ((Number) c23471qM13167g11.f92947w).intValue();
                iIntValue2 = ((Number) c23471qM13167g11.f92948x).intValue();
                iIntValue3 = ((Number) c23471qM13167g11.f92949y).intValue();
                fM13246n = viewState.getRadius() / C4242s.INSTANCE.m13253a();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    i37 = viewState.getOutline().getSegmentCountRange().f71134x;
                    arrayList3 = new ArrayList(i37);
                    while (i38 < i37) {
                        arrayList3.add(AbstractC28683x.m87272z(Float.valueOf(0.0f)));
                    }
                    c28655q.m87172p0(arrayList3);
                    objM87133R = arrayList3;
                }
                list = (List) objM87133R;
                c28655q.m87150e0(916216129);
                i29 = viewState.getOutline().getSegmentCountRange().f71134x;
                arrayList = new ArrayList(i29);
                i34 = 0;
                while (i34 < i29) {
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(AbstractC11352g.m30588b(((Number) ((InterfaceC28601c1) list.get(i34)).getValue()).floatValue(), AbstractC11348f.m30574v((int) Duration.m134273getInWholeMillisecondsimpl(viewState.getOutline().getAnimationIntervalPerGroup()), 0, viewState.getOutline().getAnimationEasing(), 2), null, null, c28655q, 0, 28));
                    i34++;
                    arrayList = arrayList15;
                    modifier10 = modifier10;
                    i29 = i29;
                    i15 = i15;
                    modifier20 = modifier20;
                    i28 = i28;
                    c2314t = c2314t;
                    modifier8 = modifier8;
                }
                C2314t c2314t13 = c2314t;
                int i41111111 = i15;
                Modifier modifier2111117 = modifier8;
                Modifier modifier2111118 = modifier20;
                i35 = i28;
                Modifier modifier2111119 = modifier10;
                arrayList2 = arrayList;
                c28655q.m87173q(false);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Integer.valueOf(viewState.getOutline().getSegmentCount()));
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                c28674u2 = AbstractC2453v1.f9569h;
                interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: c51.g
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC4234k.m13129B(interfaceC39171c, arrayList2, iIntValue, iIntValue2, iIntValue3, interfaceC28601c1);
                        }
                    });
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                InterfaceC18280f interfaceC18280fM13192e12 = viewState.getOutline().getPointScalarRange();
                Long lValueOf12 = Long.valueOf(viewState.getOutline().m13190c());
                zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(list) | c28655q.m87147d(fM13246n);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new a(viewState, list, fM13246n, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(viewState, list, fM13246n, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87254h(interfaceC18280fM13192e12, lValueOf12, (InterfaceC4351m) objM87133R4, c28655q);
                Integer numValueOf12 = Integer.valueOf(viewState.getOutline().getSegmentCount());
                zM87157i2 = c28655q.m87157i(viewState);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R5 = new b(viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new b(viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf12);
                zM87157i3 = c28655q.m87157i(viewState);
                objM87133R6 = c28655q.m87133R();
                if (zM87157i3) {
                    objM87133R6 = new c(viewState, null);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new c(viewState, null);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                c17891jM51478a = AbstractC17897m.m51478a();
                if (!viewState.getUsingPrimitiveEdgeFade()) {
                    m13169h0(viewState, iIntValue, iIntValue2, c17891jM51478a, m13130C(interfaceC28670t2));
                }
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(viewState.getColors().f92937w);
                    c28655q.m87172p0(objM87133R7);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87272z(viewState.getColors().f92938x);
                    c28655q.m87172p0(objM87133R8);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R8;
                interfaceC28670t2M13165f0 = m13165f0(m13179r(interfaceC28601c2), c28655q, 0);
                interfaceC28670t2M13165f1 = m13165f0(m13181t(interfaceC28601c3), c28655q, 0);
                if (viewState.getTransition() == null) {
                    c28655q.m87150e0(-1659695200);
                    abstractC17911tM13239g = viewState.m13238f((InterfaceC39171c) c28655q.m87161k(c28674u2));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1659627558);
                    abstractC17911tM13239g = viewState.m13239g((InterfaceC39171c) c28655q.m87161k(c28674u2), m13183v(interfaceC28670t2M13165f0), m13184w(interfaceC28670t2M13165f1));
                    c28655q.m87173q(false);
                }
                zM87157i4 = c28655q.m87157i(viewState);
                objM87133R9 = c28655q.m87133R();
                if (zM87157i4) {
                    objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R9);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, viewState);
                Modifier modifierM3424u12 = AbstractC1102d.m3424u(viewState.m13251s(), AbstractC1102d.m3411h(viewState.m13250r(), modifier17));
                InterfaceC39127r0 interfaceC39127r0M66763d111116 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111116 = c28655q.m87165m();
                Modifier modifierM118962N111116 = AbstractC37056f.m118962N(c28655q, modifierM3424u12);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i11116 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i11116, interfaceC39127r0M66763d111116);
                C0209i c0209i11117 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i11117, interfaceC28653p1M87165m111116);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    modifier21 = modifier17;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i11118 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i11118, modifierM118962N111116);
                    C2307m c2307m113 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d111117 = AbstractC22989q.m66763d(c2307m113, false);
                    abstractC17911t = abstractC17911tM13239g;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111117 = c28655q.m87165m();
                    Modifier modifierM118962N111117 = AbstractC37056f.m118962N(c28655q, modifier19);
                    c28655q.m87158i0();
                    Modifier modifier21111110 = modifier19;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11116, interfaceC39127r0M66763d111117);
                    AbstractC28683x.m87239G(c28655q, c0209i11117, interfaceC28653p1M87165m111117);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11118, modifierM118962N111117);
                    int i41111112 = i41111111 >> 12;
                    m13131D(modifier2111119, c28655q, i41111112 & 14);
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28670t3 = interfaceC28670t2;
                        objM87133R10 = new C2175b(interfaceC28670t3, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        interfaceC28670t3 = interfaceC28670t2;
                    }
                    Modifier modifierM3480c113 = AbstractC1125a.m3480c(c2314t13, (Function1) objM87133R10);
                    InterfaceC39127r0 interfaceC39127r0M66763d111118 = AbstractC22989q.m66763d(c2307m113, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111118 = c28655q.m87165m();
                    Modifier modifierM118962N111118 = AbstractC37056f.m118962N(c28655q, modifierM3480c113);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11116, interfaceC39127r0M66763d111118);
                    AbstractC28683x.m87239G(c28655q, c0209i11117, interfaceC28653p1M87165m111118);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i11118, modifierM118962N111118);
                    if (viewState.getUsingPrimitiveEdgeFade()) {
                        c28655q.m87150e0(-271151621);
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        m13149V(viewState, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    } else {
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        c28655q.m87150e0(-271065906);
                        m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    }
                    m13144Q(viewState, abstractC17911t2, c28655q, i36);
                    m13134G(viewState, modifier2111118, c28655q, (i41111112 & 112) | i36);
                    c28655q.m87173q(true);
                    int i41111113 = i36;
                    m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i41111113);
                    c28655q.m87173q(true);
                    AbstractC4226c.m13097g(viewState, modifier2111117, modifier18, null, c28655q, i41111113 | (i41111111 & 112) | (i41111111 & 896), 8);
                    c28655q.m87173q(true);
                    modifier14 = modifier2111117;
                    modifier16 = modifier2111119;
                    modifier13 = modifier21;
                    modifier11 = modifier21111110;
                    modifier15 = modifier18;
                    modifier12 = modifier2111118;
                } else {
                    modifier21 = modifier17;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i11119 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i11119, modifierM118962N111116);
                C2307m c2307m114 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d111119 = AbstractC22989q.m66763d(c2307m114, false);
                abstractC17911t = abstractC17911tM13239g;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111119 = c28655q.m87165m();
                Modifier modifierM118962N111119 = AbstractC37056f.m118962N(c28655q, modifier19);
                c28655q.m87158i0();
                Modifier modifier21111111 = modifier19;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11116, interfaceC39127r0M66763d111119);
                AbstractC28683x.m87239G(c28655q, c0209i11117, interfaceC28653p1M87165m111119);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11119, modifierM118962N111119);
                int i41111114 = i41111111 >> 12;
                m13131D(modifier2111119, c28655q, i41111114 & 14);
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    interfaceC28670t3 = interfaceC28670t2;
                    objM87133R10 = new C2175b(interfaceC28670t3, 2);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    interfaceC28670t3 = interfaceC28670t2;
                }
                Modifier modifierM3480c114 = AbstractC1125a.m3480c(c2314t13, (Function1) objM87133R10);
                InterfaceC39127r0 interfaceC39127r0M66763d1111110 = AbstractC22989q.m66763d(c2307m114, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111110 = c28655q.m87165m();
                Modifier modifierM118962N1111110 = AbstractC37056f.m118962N(c28655q, modifierM3480c114);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i11116, interfaceC39127r0M66763d1111110);
                AbstractC28683x.m87239G(c28655q, c0209i11117, interfaceC28653p1M87165m1111110);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11119, modifierM118962N1111110);
                if (viewState.getUsingPrimitiveEdgeFade()) {
                    c28655q.m87150e0(-271151621);
                    abstractC17911t2 = abstractC17911t;
                    i36 = i35;
                    m13149V(viewState, abstractC17911t2, c28655q, i36);
                    c28655q.m87173q(false);
                } else {
                    abstractC17911t2 = abstractC17911t;
                    i36 = i35;
                    c28655q.m87150e0(-271065906);
                    m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                    c28655q.m87173q(false);
                }
                m13144Q(viewState, abstractC17911t2, c28655q, i36);
                m13134G(viewState, modifier2111118, c28655q, (i41111114 & 112) | i36);
                c28655q.m87173q(true);
                int i41111115 = i36;
                m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i41111115);
                c28655q.m87173q(true);
                AbstractC4226c.m13097g(viewState, modifier2111117, modifier18, null, c28655q, i41111115 | (i41111111 & 112) | (i41111111 & 896), 8);
                c28655q.m87173q(true);
                modifier14 = modifier2111117;
                modifier16 = modifier2111119;
                modifier13 = modifier21;
                modifier11 = modifier21111111;
                modifier15 = modifier18;
                modifier12 = modifier2111118;
            } else {
                c28655q.m87138X();
                modifier11 = modifier4;
                modifier12 = modifier6;
                modifier13 = modifier7;
                modifier14 = modifier8;
                modifier15 = modifier9;
                modifier16 = modifier10;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(modifier13, modifier14, modifier15, modifier11, modifier16, modifier12, viewState, i13, i14, 2);
            }
        }
        i15 |= 384;
        modifier9 = modifier3;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q.m87153g(modifier4)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    modifier10 = modifier5;
                    if (c28655q.m87153g(modifier10)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87153g(modifier6)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87157i(viewState)) {
                        i39 = 1048576;
                    } else {
                        i39 = 524288;
                    }
                    i15 |= i39;
                }
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i44 != 0) {
                        modifier17 = c2314t;
                    } else {
                        modifier17 = modifier7;
                    }
                    if (i45 != 0) {
                        modifier8 = c2314t;
                    }
                    if (i16 != 0) {
                        modifier18 = c2314t;
                    } else {
                        modifier18 = modifier9;
                    }
                    if (i18 != 0) {
                        modifier19 = c2314t;
                    } else {
                        modifier19 = modifier4;
                    }
                    if (i24 != 0) {
                        modifier10 = c2314t;
                    }
                    if (i26 != 0) {
                        modifier20 = c2314t;
                    } else {
                        modifier20 = modifier6;
                    }
                    i28 = (i15 >> 18) & 14;
                    C23471q c23471qM13167g12 = m13167g0(viewState, c28655q, i28);
                    iIntValue = ((Number) c23471qM13167g12.f92947w).intValue();
                    iIntValue2 = ((Number) c23471qM13167g12.f92948x).intValue();
                    iIntValue3 = ((Number) c23471qM13167g12.f92949y).intValue();
                    fM13246n = viewState.getRadius() / C4242s.INSTANCE.m13253a();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        i37 = viewState.getOutline().getSegmentCountRange().f71134x;
                        arrayList3 = new ArrayList(i37);
                        while (i38 < i37) {
                            arrayList3.add(AbstractC28683x.m87272z(Float.valueOf(0.0f)));
                        }
                        c28655q.m87172p0(arrayList3);
                        objM87133R = arrayList3;
                    }
                    list = (List) objM87133R;
                    c28655q.m87150e0(916216129);
                    i29 = viewState.getOutline().getSegmentCountRange().f71134x;
                    arrayList = new ArrayList(i29);
                    i34 = 0;
                    while (i34 < i29) {
                        ArrayList arrayList16 = arrayList;
                        arrayList16.add(AbstractC11352g.m30588b(((Number) ((InterfaceC28601c1) list.get(i34)).getValue()).floatValue(), AbstractC11348f.m30574v((int) Duration.m134273getInWholeMillisecondsimpl(viewState.getOutline().getAnimationIntervalPerGroup()), 0, viewState.getOutline().getAnimationEasing(), 2), null, null, c28655q, 0, 28));
                        i34++;
                        arrayList = arrayList16;
                        modifier10 = modifier10;
                        i29 = i29;
                        i15 = i15;
                        modifier20 = modifier20;
                        i28 = i28;
                        c2314t = c2314t;
                        modifier8 = modifier8;
                    }
                    C2314t c2314t14 = c2314t;
                    int i41111116 = i15;
                    Modifier modifier21111112 = modifier8;
                    Modifier modifier21111113 = modifier20;
                    i35 = i28;
                    Modifier modifier21111114 = modifier10;
                    arrayList2 = arrayList;
                    c28655q.m87173q(false);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Integer.valueOf(viewState.getOutline().getSegmentCount()));
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    c28674u2 = AbstractC2453v1.f9569h;
                    interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: c51.g
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC4234k.m13129B(interfaceC39171c, arrayList2, iIntValue, iIntValue2, iIntValue3, interfaceC28601c1);
                            }
                        });
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                    InterfaceC18280f interfaceC18280fM13192e13 = viewState.getOutline().getPointScalarRange();
                    Long lValueOf13 = Long.valueOf(viewState.getOutline().m13190c());
                    zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(list) | c28655q.m87147d(fM13246n);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new a(viewState, list, fM13246n, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(viewState, list, fM13246n, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(interfaceC18280fM13192e13, lValueOf13, (InterfaceC4351m) objM87133R4, c28655q);
                    Integer numValueOf13 = Integer.valueOf(viewState.getOutline().getSegmentCount());
                    zM87157i2 = c28655q.m87157i(viewState);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R5 = new b(viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new b(viewState, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf13);
                    zM87157i3 = c28655q.m87157i(viewState);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87157i3) {
                        objM87133R6 = new c(viewState, null);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new c(viewState, null);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                    c17891jM51478a = AbstractC17897m.m51478a();
                    if (!viewState.getUsingPrimitiveEdgeFade()) {
                        m13169h0(viewState, iIntValue, iIntValue2, c17891jM51478a, m13130C(interfaceC28670t2));
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(viewState.getColors().f92937w);
                        c28655q.m87172p0(objM87133R7);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87272z(viewState.getColors().f92938x);
                        c28655q.m87172p0(objM87133R8);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R8;
                    interfaceC28670t2M13165f0 = m13165f0(m13179r(interfaceC28601c2), c28655q, 0);
                    interfaceC28670t2M13165f1 = m13165f0(m13181t(interfaceC28601c3), c28655q, 0);
                    if (viewState.getTransition() == null) {
                        c28655q.m87150e0(-1659695200);
                        abstractC17911tM13239g = viewState.m13238f((InterfaceC39171c) c28655q.m87161k(c28674u2));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1659627558);
                        abstractC17911tM13239g = viewState.m13239g((InterfaceC39171c) c28655q.m87161k(c28674u2), m13183v(interfaceC28670t2M13165f0), m13184w(interfaceC28670t2M13165f1));
                        c28655q.m87173q(false);
                    }
                    zM87157i4 = c28655q.m87157i(viewState);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i4) {
                        objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q.m87172p0(objM87133R9);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, viewState);
                    Modifier modifierM3424u13 = AbstractC1102d.m3424u(viewState.m13251s(), AbstractC1102d.m3411h(viewState.m13250r(), modifier17));
                    InterfaceC39127r0 interfaceC39127r0M66763d1111111 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111111 = c28655q.m87165m();
                    Modifier modifierM118962N1111111 = AbstractC37056f.m118962N(c28655q, modifierM3424u13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i111110 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i111110, interfaceC39127r0M66763d1111111);
                    C0209i c0209i111111 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i111111, interfaceC28653p1M87165m1111111);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        modifier21 = modifier17;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i111112 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i111112, modifierM118962N1111111);
                        C2307m c2307m115 = C2299e.f9114w;
                        InterfaceC39127r0 interfaceC39127r0M66763d1111112 = AbstractC22989q.m66763d(c2307m115, false);
                        abstractC17911t = abstractC17911tM13239g;
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111112 = c28655q.m87165m();
                        Modifier modifierM118962N1111112 = AbstractC37056f.m118962N(c28655q, modifier19);
                        c28655q.m87158i0();
                        Modifier modifier21111115 = modifier19;
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111110, interfaceC39127r0M66763d1111112);
                        AbstractC28683x.m87239G(c28655q, c0209i111111, interfaceC28653p1M87165m1111112);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111112, modifierM118962N1111112);
                        int i41111117 = i41111116 >> 12;
                        m13131D(modifier21111114, c28655q, i41111117 & 14);
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v0) {
                            interfaceC28670t3 = interfaceC28670t2;
                            objM87133R10 = new C2175b(interfaceC28670t3, 2);
                            c28655q.m87172p0(objM87133R10);
                        } else {
                            interfaceC28670t3 = interfaceC28670t2;
                        }
                        Modifier modifierM3480c115 = AbstractC1125a.m3480c(c2314t14, (Function1) objM87133R10);
                        InterfaceC39127r0 interfaceC39127r0M66763d1111113 = AbstractC22989q.m66763d(c2307m115, false);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1111113 = c28655q.m87165m();
                        Modifier modifierM118962N1111113 = AbstractC37056f.m118962N(c28655q, modifierM3480c115);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111110, interfaceC39127r0M66763d1111113);
                        AbstractC28683x.m87239G(c28655q, c0209i111111, interfaceC28653p1M87165m1111113);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i111112, modifierM118962N1111113);
                        if (viewState.getUsingPrimitiveEdgeFade()) {
                            c28655q.m87150e0(-271151621);
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            m13149V(viewState, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        } else {
                            abstractC17911t2 = abstractC17911t;
                            i36 = i35;
                            c28655q.m87150e0(-271065906);
                            m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                            c28655q.m87173q(false);
                        }
                        m13144Q(viewState, abstractC17911t2, c28655q, i36);
                        m13134G(viewState, modifier21111113, c28655q, (i41111117 & 112) | i36);
                        c28655q.m87173q(true);
                        int i41111118 = i36;
                        m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i41111118);
                        c28655q.m87173q(true);
                        AbstractC4226c.m13097g(viewState, modifier21111112, modifier18, null, c28655q, i41111118 | (i41111116 & 112) | (i41111116 & 896), 8);
                        c28655q.m87173q(true);
                        modifier14 = modifier21111112;
                        modifier16 = modifier21111114;
                        modifier13 = modifier21;
                        modifier11 = modifier21111115;
                        modifier15 = modifier18;
                        modifier12 = modifier21111113;
                    } else {
                        modifier21 = modifier17;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i111113 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i111113, modifierM118962N1111111);
                    C2307m c2307m116 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d1111114 = AbstractC22989q.m66763d(c2307m116, false);
                    abstractC17911t = abstractC17911tM13239g;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111114 = c28655q.m87165m();
                    Modifier modifierM118962N1111114 = AbstractC37056f.m118962N(c28655q, modifier19);
                    c28655q.m87158i0();
                    Modifier modifier21111116 = modifier19;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111110, interfaceC39127r0M66763d1111114);
                    AbstractC28683x.m87239G(c28655q, c0209i111111, interfaceC28653p1M87165m1111114);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111113, modifierM118962N1111114);
                    int i41111119 = i41111116 >> 12;
                    m13131D(modifier21111114, c28655q, i41111119 & 14);
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28670t3 = interfaceC28670t2;
                        objM87133R10 = new C2175b(interfaceC28670t3, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        interfaceC28670t3 = interfaceC28670t2;
                    }
                    Modifier modifierM3480c116 = AbstractC1125a.m3480c(c2314t14, (Function1) objM87133R10);
                    InterfaceC39127r0 interfaceC39127r0M66763d1111115 = AbstractC22989q.m66763d(c2307m116, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111115 = c28655q.m87165m();
                    Modifier modifierM118962N1111115 = AbstractC37056f.m118962N(c28655q, modifierM3480c116);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111110, interfaceC39127r0M66763d1111115);
                    AbstractC28683x.m87239G(c28655q, c0209i111111, interfaceC28653p1M87165m1111115);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111113, modifierM118962N1111115);
                    if (viewState.getUsingPrimitiveEdgeFade()) {
                        c28655q.m87150e0(-271151621);
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        m13149V(viewState, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    } else {
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        c28655q.m87150e0(-271065906);
                        m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    }
                    m13144Q(viewState, abstractC17911t2, c28655q, i36);
                    m13134G(viewState, modifier21111113, c28655q, (i41111119 & 112) | i36);
                    c28655q.m87173q(true);
                    int i411111110 = i36;
                    m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i411111110);
                    c28655q.m87173q(true);
                    AbstractC4226c.m13097g(viewState, modifier21111112, modifier18, null, c28655q, i411111110 | (i41111116 & 112) | (i41111116 & 896), 8);
                    c28655q.m87173q(true);
                    modifier14 = modifier21111112;
                    modifier16 = modifier21111114;
                    modifier13 = modifier21;
                    modifier11 = modifier21111116;
                    modifier15 = modifier18;
                    modifier12 = modifier21111113;
                } else {
                    c28655q.m87138X();
                    modifier11 = modifier4;
                    modifier12 = modifier6;
                    modifier13 = modifier7;
                    modifier14 = modifier8;
                    modifier15 = modifier9;
                    modifier16 = modifier10;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(modifier13, modifier14, modifier15, modifier11, modifier16, modifier12, viewState, i13, i14, 2);
                }
            }
            i15 |= 24576;
            modifier10 = modifier5;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87153g(modifier6)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(viewState)) {
                    i39 = 1048576;
                } else {
                    i39 = 524288;
                }
                i15 |= i39;
            }
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i44 != 0) {
                    modifier17 = c2314t;
                } else {
                    modifier17 = modifier7;
                }
                if (i45 != 0) {
                    modifier8 = c2314t;
                }
                if (i16 != 0) {
                    modifier18 = c2314t;
                } else {
                    modifier18 = modifier9;
                }
                if (i18 != 0) {
                    modifier19 = c2314t;
                } else {
                    modifier19 = modifier4;
                }
                if (i24 != 0) {
                    modifier10 = c2314t;
                }
                if (i26 != 0) {
                    modifier20 = c2314t;
                } else {
                    modifier20 = modifier6;
                }
                i28 = (i15 >> 18) & 14;
                C23471q c23471qM13167g13 = m13167g0(viewState, c28655q, i28);
                iIntValue = ((Number) c23471qM13167g13.f92947w).intValue();
                iIntValue2 = ((Number) c23471qM13167g13.f92948x).intValue();
                iIntValue3 = ((Number) c23471qM13167g13.f92949y).intValue();
                fM13246n = viewState.getRadius() / C4242s.INSTANCE.m13253a();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    i37 = viewState.getOutline().getSegmentCountRange().f71134x;
                    arrayList3 = new ArrayList(i37);
                    while (i38 < i37) {
                        arrayList3.add(AbstractC28683x.m87272z(Float.valueOf(0.0f)));
                    }
                    c28655q.m87172p0(arrayList3);
                    objM87133R = arrayList3;
                }
                list = (List) objM87133R;
                c28655q.m87150e0(916216129);
                i29 = viewState.getOutline().getSegmentCountRange().f71134x;
                arrayList = new ArrayList(i29);
                i34 = 0;
                while (i34 < i29) {
                    ArrayList arrayList17 = arrayList;
                    arrayList17.add(AbstractC11352g.m30588b(((Number) ((InterfaceC28601c1) list.get(i34)).getValue()).floatValue(), AbstractC11348f.m30574v((int) Duration.m134273getInWholeMillisecondsimpl(viewState.getOutline().getAnimationIntervalPerGroup()), 0, viewState.getOutline().getAnimationEasing(), 2), null, null, c28655q, 0, 28));
                    i34++;
                    arrayList = arrayList17;
                    modifier10 = modifier10;
                    i29 = i29;
                    i15 = i15;
                    modifier20 = modifier20;
                    i28 = i28;
                    c2314t = c2314t;
                    modifier8 = modifier8;
                }
                C2314t c2314t15 = c2314t;
                int i411111111 = i15;
                Modifier modifier21111117 = modifier8;
                Modifier modifier21111118 = modifier20;
                i35 = i28;
                Modifier modifier21111119 = modifier10;
                arrayList2 = arrayList;
                c28655q.m87173q(false);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Integer.valueOf(viewState.getOutline().getSegmentCount()));
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                c28674u2 = AbstractC2453v1.f9569h;
                interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: c51.g
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC4234k.m13129B(interfaceC39171c, arrayList2, iIntValue, iIntValue2, iIntValue3, interfaceC28601c1);
                        }
                    });
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                InterfaceC18280f interfaceC18280fM13192e14 = viewState.getOutline().getPointScalarRange();
                Long lValueOf14 = Long.valueOf(viewState.getOutline().m13190c());
                zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(list) | c28655q.m87147d(fM13246n);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new a(viewState, list, fM13246n, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(viewState, list, fM13246n, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87254h(interfaceC18280fM13192e14, lValueOf14, (InterfaceC4351m) objM87133R4, c28655q);
                Integer numValueOf14 = Integer.valueOf(viewState.getOutline().getSegmentCount());
                zM87157i2 = c28655q.m87157i(viewState);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R5 = new b(viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new b(viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf14);
                zM87157i3 = c28655q.m87157i(viewState);
                objM87133R6 = c28655q.m87133R();
                if (zM87157i3) {
                    objM87133R6 = new c(viewState, null);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new c(viewState, null);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                c17891jM51478a = AbstractC17897m.m51478a();
                if (!viewState.getUsingPrimitiveEdgeFade()) {
                    m13169h0(viewState, iIntValue, iIntValue2, c17891jM51478a, m13130C(interfaceC28670t2));
                }
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(viewState.getColors().f92937w);
                    c28655q.m87172p0(objM87133R7);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87272z(viewState.getColors().f92938x);
                    c28655q.m87172p0(objM87133R8);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R8;
                interfaceC28670t2M13165f0 = m13165f0(m13179r(interfaceC28601c2), c28655q, 0);
                interfaceC28670t2M13165f1 = m13165f0(m13181t(interfaceC28601c3), c28655q, 0);
                if (viewState.getTransition() == null) {
                    c28655q.m87150e0(-1659695200);
                    abstractC17911tM13239g = viewState.m13238f((InterfaceC39171c) c28655q.m87161k(c28674u2));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1659627558);
                    abstractC17911tM13239g = viewState.m13239g((InterfaceC39171c) c28655q.m87161k(c28674u2), m13183v(interfaceC28670t2M13165f0), m13184w(interfaceC28670t2M13165f1));
                    c28655q.m87173q(false);
                }
                zM87157i4 = c28655q.m87157i(viewState);
                objM87133R9 = c28655q.m87133R();
                if (zM87157i4) {
                    objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R9);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, viewState);
                Modifier modifierM3424u14 = AbstractC1102d.m3424u(viewState.m13251s(), AbstractC1102d.m3411h(viewState.m13250r(), modifier17));
                InterfaceC39127r0 interfaceC39127r0M66763d1111116 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111116 = c28655q.m87165m();
                Modifier modifierM118962N1111116 = AbstractC37056f.m118962N(c28655q, modifierM3424u14);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i111114 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i111114, interfaceC39127r0M66763d1111116);
                C0209i c0209i111115 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i111115, interfaceC28653p1M87165m1111116);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    modifier21 = modifier17;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i111116 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i111116, modifierM118962N1111116);
                    C2307m c2307m117 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d1111117 = AbstractC22989q.m66763d(c2307m117, false);
                    abstractC17911t = abstractC17911tM13239g;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111117 = c28655q.m87165m();
                    Modifier modifierM118962N1111117 = AbstractC37056f.m118962N(c28655q, modifier19);
                    c28655q.m87158i0();
                    Modifier modifier211111110 = modifier19;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111114, interfaceC39127r0M66763d1111117);
                    AbstractC28683x.m87239G(c28655q, c0209i111115, interfaceC28653p1M87165m1111117);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111116, modifierM118962N1111117);
                    int i411111112 = i411111111 >> 12;
                    m13131D(modifier21111119, c28655q, i411111112 & 14);
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28670t3 = interfaceC28670t2;
                        objM87133R10 = new C2175b(interfaceC28670t3, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        interfaceC28670t3 = interfaceC28670t2;
                    }
                    Modifier modifierM3480c117 = AbstractC1125a.m3480c(c2314t15, (Function1) objM87133R10);
                    InterfaceC39127r0 interfaceC39127r0M66763d1111118 = AbstractC22989q.m66763d(c2307m117, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111118 = c28655q.m87165m();
                    Modifier modifierM118962N1111118 = AbstractC37056f.m118962N(c28655q, modifierM3480c117);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111114, interfaceC39127r0M66763d1111118);
                    AbstractC28683x.m87239G(c28655q, c0209i111115, interfaceC28653p1M87165m1111118);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111116, modifierM118962N1111118);
                    if (viewState.getUsingPrimitiveEdgeFade()) {
                        c28655q.m87150e0(-271151621);
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        m13149V(viewState, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    } else {
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        c28655q.m87150e0(-271065906);
                        m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    }
                    m13144Q(viewState, abstractC17911t2, c28655q, i36);
                    m13134G(viewState, modifier21111118, c28655q, (i411111112 & 112) | i36);
                    c28655q.m87173q(true);
                    int i411111113 = i36;
                    m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i411111113);
                    c28655q.m87173q(true);
                    AbstractC4226c.m13097g(viewState, modifier21111117, modifier18, null, c28655q, i411111113 | (i411111111 & 112) | (i411111111 & 896), 8);
                    c28655q.m87173q(true);
                    modifier14 = modifier21111117;
                    modifier16 = modifier21111119;
                    modifier13 = modifier21;
                    modifier11 = modifier211111110;
                    modifier15 = modifier18;
                    modifier12 = modifier21111118;
                } else {
                    modifier21 = modifier17;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i111117 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i111117, modifierM118962N1111116);
                C2307m c2307m118 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d1111119 = AbstractC22989q.m66763d(c2307m118, false);
                abstractC17911t = abstractC17911tM13239g;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111119 = c28655q.m87165m();
                Modifier modifierM118962N1111119 = AbstractC37056f.m118962N(c28655q, modifier19);
                c28655q.m87158i0();
                Modifier modifier211111111 = modifier19;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i111114, interfaceC39127r0M66763d1111119);
                AbstractC28683x.m87239G(c28655q, c0209i111115, interfaceC28653p1M87165m1111119);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i111117, modifierM118962N1111119);
                int i411111114 = i411111111 >> 12;
                m13131D(modifier21111119, c28655q, i411111114 & 14);
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    interfaceC28670t3 = interfaceC28670t2;
                    objM87133R10 = new C2175b(interfaceC28670t3, 2);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    interfaceC28670t3 = interfaceC28670t2;
                }
                Modifier modifierM3480c118 = AbstractC1125a.m3480c(c2314t15, (Function1) objM87133R10);
                InterfaceC39127r0 interfaceC39127r0M66763d11111110 = AbstractC22989q.m66763d(c2307m118, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111110 = c28655q.m87165m();
                Modifier modifierM118962N11111110 = AbstractC37056f.m118962N(c28655q, modifierM3480c118);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i111114, interfaceC39127r0M66763d11111110);
                AbstractC28683x.m87239G(c28655q, c0209i111115, interfaceC28653p1M87165m11111110);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i111117, modifierM118962N11111110);
                if (viewState.getUsingPrimitiveEdgeFade()) {
                    c28655q.m87150e0(-271151621);
                    abstractC17911t2 = abstractC17911t;
                    i36 = i35;
                    m13149V(viewState, abstractC17911t2, c28655q, i36);
                    c28655q.m87173q(false);
                } else {
                    abstractC17911t2 = abstractC17911t;
                    i36 = i35;
                    c28655q.m87150e0(-271065906);
                    m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                    c28655q.m87173q(false);
                }
                m13144Q(viewState, abstractC17911t2, c28655q, i36);
                m13134G(viewState, modifier21111118, c28655q, (i411111114 & 112) | i36);
                c28655q.m87173q(true);
                int i411111115 = i36;
                m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i411111115);
                c28655q.m87173q(true);
                AbstractC4226c.m13097g(viewState, modifier21111117, modifier18, null, c28655q, i411111115 | (i411111111 & 112) | (i411111111 & 896), 8);
                c28655q.m87173q(true);
                modifier14 = modifier21111117;
                modifier16 = modifier21111119;
                modifier13 = modifier21;
                modifier11 = modifier211111111;
                modifier15 = modifier18;
                modifier12 = modifier21111118;
            } else {
                c28655q.m87138X();
                modifier11 = modifier4;
                modifier12 = modifier6;
                modifier13 = modifier7;
                modifier14 = modifier8;
                modifier15 = modifier9;
                modifier16 = modifier10;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(modifier13, modifier14, modifier15, modifier11, modifier16, modifier12, viewState, i13, i14, 2);
            }
        }
        i15 |= 3072;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                modifier10 = modifier5;
                if (c28655q.m87153g(modifier10)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87153g(modifier6)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87157i(viewState)) {
                    i39 = 1048576;
                } else {
                    i39 = 524288;
                }
                i15 |= i39;
            }
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i44 != 0) {
                    modifier17 = c2314t;
                } else {
                    modifier17 = modifier7;
                }
                if (i45 != 0) {
                    modifier8 = c2314t;
                }
                if (i16 != 0) {
                    modifier18 = c2314t;
                } else {
                    modifier18 = modifier9;
                }
                if (i18 != 0) {
                    modifier19 = c2314t;
                } else {
                    modifier19 = modifier4;
                }
                if (i24 != 0) {
                    modifier10 = c2314t;
                }
                if (i26 != 0) {
                    modifier20 = c2314t;
                } else {
                    modifier20 = modifier6;
                }
                i28 = (i15 >> 18) & 14;
                C23471q c23471qM13167g14 = m13167g0(viewState, c28655q, i28);
                iIntValue = ((Number) c23471qM13167g14.f92947w).intValue();
                iIntValue2 = ((Number) c23471qM13167g14.f92948x).intValue();
                iIntValue3 = ((Number) c23471qM13167g14.f92949y).intValue();
                fM13246n = viewState.getRadius() / C4242s.INSTANCE.m13253a();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    i37 = viewState.getOutline().getSegmentCountRange().f71134x;
                    arrayList3 = new ArrayList(i37);
                    while (i38 < i37) {
                        arrayList3.add(AbstractC28683x.m87272z(Float.valueOf(0.0f)));
                    }
                    c28655q.m87172p0(arrayList3);
                    objM87133R = arrayList3;
                }
                list = (List) objM87133R;
                c28655q.m87150e0(916216129);
                i29 = viewState.getOutline().getSegmentCountRange().f71134x;
                arrayList = new ArrayList(i29);
                i34 = 0;
                while (i34 < i29) {
                    ArrayList arrayList18 = arrayList;
                    arrayList18.add(AbstractC11352g.m30588b(((Number) ((InterfaceC28601c1) list.get(i34)).getValue()).floatValue(), AbstractC11348f.m30574v((int) Duration.m134273getInWholeMillisecondsimpl(viewState.getOutline().getAnimationIntervalPerGroup()), 0, viewState.getOutline().getAnimationEasing(), 2), null, null, c28655q, 0, 28));
                    i34++;
                    arrayList = arrayList18;
                    modifier10 = modifier10;
                    i29 = i29;
                    i15 = i15;
                    modifier20 = modifier20;
                    i28 = i28;
                    c2314t = c2314t;
                    modifier8 = modifier8;
                }
                C2314t c2314t16 = c2314t;
                int i411111116 = i15;
                Modifier modifier211111112 = modifier8;
                Modifier modifier211111113 = modifier20;
                i35 = i28;
                Modifier modifier211111114 = modifier10;
                arrayList2 = arrayList;
                c28655q.m87173q(false);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Integer.valueOf(viewState.getOutline().getSegmentCount()));
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                c28674u2 = AbstractC2453v1.f9569h;
                interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: c51.g
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return AbstractC4234k.m13129B(interfaceC39171c, arrayList2, iIntValue, iIntValue2, iIntValue3, interfaceC28601c1);
                        }
                    });
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
                InterfaceC18280f interfaceC18280fM13192e15 = viewState.getOutline().getPointScalarRange();
                Long lValueOf15 = Long.valueOf(viewState.getOutline().m13190c());
                zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(list) | c28655q.m87147d(fM13246n);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new a(viewState, list, fM13246n, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(viewState, list, fM13246n, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87254h(interfaceC18280fM13192e15, lValueOf15, (InterfaceC4351m) objM87133R4, c28655q);
                Integer numValueOf15 = Integer.valueOf(viewState.getOutline().getSegmentCount());
                zM87157i2 = c28655q.m87157i(viewState);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R5 = new b(viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new b(viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf15);
                zM87157i3 = c28655q.m87157i(viewState);
                objM87133R6 = c28655q.m87133R();
                if (zM87157i3) {
                    objM87133R6 = new c(viewState, null);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new c(viewState, null);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
                c17891jM51478a = AbstractC17897m.m51478a();
                if (!viewState.getUsingPrimitiveEdgeFade()) {
                    m13169h0(viewState, iIntValue, iIntValue2, c17891jM51478a, m13130C(interfaceC28670t2));
                }
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(viewState.getColors().f92937w);
                    c28655q.m87172p0(objM87133R7);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87272z(viewState.getColors().f92938x);
                    c28655q.m87172p0(objM87133R8);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R8;
                interfaceC28670t2M13165f0 = m13165f0(m13179r(interfaceC28601c2), c28655q, 0);
                interfaceC28670t2M13165f1 = m13165f0(m13181t(interfaceC28601c3), c28655q, 0);
                if (viewState.getTransition() == null) {
                    c28655q.m87150e0(-1659695200);
                    abstractC17911tM13239g = viewState.m13238f((InterfaceC39171c) c28655q.m87161k(c28674u2));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1659627558);
                    abstractC17911tM13239g = viewState.m13239g((InterfaceC39171c) c28655q.m87161k(c28674u2), m13183v(interfaceC28670t2M13165f0), m13184w(interfaceC28670t2M13165f1));
                    c28655q.m87173q(false);
                }
                zM87157i4 = c28655q.m87157i(viewState);
                objM87133R9 = c28655q.m87133R();
                if (zM87157i4) {
                    objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                    c28655q.m87172p0(objM87133R9);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, viewState);
                Modifier modifierM3424u15 = AbstractC1102d.m3424u(viewState.m13251s(), AbstractC1102d.m3411h(viewState.m13250r(), modifier17));
                InterfaceC39127r0 interfaceC39127r0M66763d11111111 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111111 = c28655q.m87165m();
                Modifier modifierM118962N11111111 = AbstractC37056f.m118962N(c28655q, modifierM3424u15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i111118 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i111118, interfaceC39127r0M66763d11111111);
                C0209i c0209i111119 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i111119, interfaceC28653p1M87165m11111111);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    modifier21 = modifier17;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1111110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1111110, modifierM118962N11111111);
                    C2307m c2307m119 = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d11111112 = AbstractC22989q.m66763d(c2307m119, false);
                    abstractC17911t = abstractC17911tM13239g;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111112 = c28655q.m87165m();
                    Modifier modifierM118962N11111112 = AbstractC37056f.m118962N(c28655q, modifier19);
                    c28655q.m87158i0();
                    Modifier modifier211111115 = modifier19;
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111118, interfaceC39127r0M66763d11111112);
                    AbstractC28683x.m87239G(c28655q, c0209i111119, interfaceC28653p1M87165m11111112);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1111110, modifierM118962N11111112);
                    int i411111117 = i411111116 >> 12;
                    m13131D(modifier211111114, c28655q, i411111117 & 14);
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v0) {
                        interfaceC28670t3 = interfaceC28670t2;
                        objM87133R10 = new C2175b(interfaceC28670t3, 2);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        interfaceC28670t3 = interfaceC28670t2;
                    }
                    Modifier modifierM3480c119 = AbstractC1125a.m3480c(c2314t16, (Function1) objM87133R10);
                    InterfaceC39127r0 interfaceC39127r0M66763d11111113 = AbstractC22989q.m66763d(c2307m119, false);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111113 = c28655q.m87165m();
                    Modifier modifierM118962N11111113 = AbstractC37056f.m118962N(c28655q, modifierM3480c119);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i111118, interfaceC39127r0M66763d11111113);
                    AbstractC28683x.m87239G(c28655q, c0209i111119, interfaceC28653p1M87165m11111113);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1111110, modifierM118962N11111113);
                    if (viewState.getUsingPrimitiveEdgeFade()) {
                        c28655q.m87150e0(-271151621);
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        m13149V(viewState, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    } else {
                        abstractC17911t2 = abstractC17911t;
                        i36 = i35;
                        c28655q.m87150e0(-271065906);
                        m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                        c28655q.m87173q(false);
                    }
                    m13144Q(viewState, abstractC17911t2, c28655q, i36);
                    m13134G(viewState, modifier211111113, c28655q, (i411111117 & 112) | i36);
                    c28655q.m87173q(true);
                    int i411111118 = i36;
                    m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i411111118);
                    c28655q.m87173q(true);
                    AbstractC4226c.m13097g(viewState, modifier211111112, modifier18, null, c28655q, i411111118 | (i411111116 & 112) | (i411111116 & 896), 8);
                    c28655q.m87173q(true);
                    modifier14 = modifier211111112;
                    modifier16 = modifier211111114;
                    modifier13 = modifier21;
                    modifier11 = modifier211111115;
                    modifier15 = modifier18;
                    modifier12 = modifier211111113;
                } else {
                    modifier21 = modifier17;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i1111111 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1111111, modifierM118962N11111111);
                C2307m c2307m1110 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d11111114 = AbstractC22989q.m66763d(c2307m1110, false);
                abstractC17911t = abstractC17911tM13239g;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111114 = c28655q.m87165m();
                Modifier modifierM118962N11111114 = AbstractC37056f.m118962N(c28655q, modifier19);
                c28655q.m87158i0();
                Modifier modifier211111116 = modifier19;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i111118, interfaceC39127r0M66763d11111114);
                AbstractC28683x.m87239G(c28655q, c0209i111119, interfaceC28653p1M87165m11111114);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111111, modifierM118962N11111114);
                int i411111119 = i411111116 >> 12;
                m13131D(modifier211111114, c28655q, i411111119 & 14);
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    interfaceC28670t3 = interfaceC28670t2;
                    objM87133R10 = new C2175b(interfaceC28670t3, 2);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    interfaceC28670t3 = interfaceC28670t2;
                }
                Modifier modifierM3480c1110 = AbstractC1125a.m3480c(c2314t16, (Function1) objM87133R10);
                InterfaceC39127r0 interfaceC39127r0M66763d11111115 = AbstractC22989q.m66763d(c2307m1110, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111115 = c28655q.m87165m();
                Modifier modifierM118962N11111115 = AbstractC37056f.m118962N(c28655q, modifierM3480c1110);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i111118, interfaceC39127r0M66763d11111115);
                AbstractC28683x.m87239G(c28655q, c0209i111119, interfaceC28653p1M87165m11111115);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111111, modifierM118962N11111115);
                if (viewState.getUsingPrimitiveEdgeFade()) {
                    c28655q.m87150e0(-271151621);
                    abstractC17911t2 = abstractC17911t;
                    i36 = i35;
                    m13149V(viewState, abstractC17911t2, c28655q, i36);
                    c28655q.m87173q(false);
                } else {
                    abstractC17911t2 = abstractC17911t;
                    i36 = i35;
                    c28655q.m87150e0(-271065906);
                    m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                    c28655q.m87173q(false);
                }
                m13144Q(viewState, abstractC17911t2, c28655q, i36);
                m13134G(viewState, modifier211111113, c28655q, (i411111119 & 112) | i36);
                c28655q.m87173q(true);
                int i4111111110 = i36;
                m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i4111111110);
                c28655q.m87173q(true);
                AbstractC4226c.m13097g(viewState, modifier211111112, modifier18, null, c28655q, i4111111110 | (i411111116 & 112) | (i411111116 & 896), 8);
                c28655q.m87173q(true);
                modifier14 = modifier211111112;
                modifier16 = modifier211111114;
                modifier13 = modifier21;
                modifier11 = modifier211111116;
                modifier15 = modifier18;
                modifier12 = modifier211111113;
            } else {
                c28655q.m87138X();
                modifier11 = modifier4;
                modifier12 = modifier6;
                modifier13 = modifier7;
                modifier14 = modifier8;
                modifier15 = modifier9;
                modifier16 = modifier10;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(modifier13, modifier14, modifier15, modifier11, modifier16, modifier12, viewState, i13, i14, 2);
            }
        }
        i15 |= 24576;
        modifier10 = modifier5;
        i26 = i14 & 32;
        if (i26 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q.m87153g(modifier6)) {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i27;
        }
        if ((i13 & 1572864) == 0) {
            if (c28655q.m87157i(viewState)) {
                i39 = 1048576;
            } else {
                i39 = 524288;
            }
            i15 |= i39;
        }
        if ((i15 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i44 != 0) {
                modifier17 = c2314t;
            } else {
                modifier17 = modifier7;
            }
            if (i45 != 0) {
                modifier8 = c2314t;
            }
            if (i16 != 0) {
                modifier18 = c2314t;
            } else {
                modifier18 = modifier9;
            }
            if (i18 != 0) {
                modifier19 = c2314t;
            } else {
                modifier19 = modifier4;
            }
            if (i24 != 0) {
                modifier10 = c2314t;
            }
            if (i26 != 0) {
                modifier20 = c2314t;
            } else {
                modifier20 = modifier6;
            }
            i28 = (i15 >> 18) & 14;
            C23471q c23471qM13167g15 = m13167g0(viewState, c28655q, i28);
            iIntValue = ((Number) c23471qM13167g15.f92947w).intValue();
            iIntValue2 = ((Number) c23471qM13167g15.f92948x).intValue();
            iIntValue3 = ((Number) c23471qM13167g15.f92949y).intValue();
            fM13246n = viewState.getRadius() / C4242s.INSTANCE.m13253a();
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                i37 = viewState.getOutline().getSegmentCountRange().f71134x;
                arrayList3 = new ArrayList(i37);
                while (i38 < i37) {
                    arrayList3.add(AbstractC28683x.m87272z(Float.valueOf(0.0f)));
                }
                c28655q.m87172p0(arrayList3);
                objM87133R = arrayList3;
            }
            list = (List) objM87133R;
            c28655q.m87150e0(916216129);
            i29 = viewState.getOutline().getSegmentCountRange().f71134x;
            arrayList = new ArrayList(i29);
            i34 = 0;
            while (i34 < i29) {
                ArrayList arrayList19 = arrayList;
                arrayList19.add(AbstractC11352g.m30588b(((Number) ((InterfaceC28601c1) list.get(i34)).getValue()).floatValue(), AbstractC11348f.m30574v((int) Duration.m134273getInWholeMillisecondsimpl(viewState.getOutline().getAnimationIntervalPerGroup()), 0, viewState.getOutline().getAnimationEasing(), 2), null, null, c28655q, 0, 28));
                i34++;
                arrayList = arrayList19;
                modifier10 = modifier10;
                i29 = i29;
                i15 = i15;
                modifier20 = modifier20;
                i28 = i28;
                c2314t = c2314t;
                modifier8 = modifier8;
            }
            C2314t c2314t17 = c2314t;
            int i4111111111 = i15;
            Modifier modifier211111117 = modifier8;
            Modifier modifier211111118 = modifier20;
            i35 = i28;
            Modifier modifier211111119 = modifier10;
            arrayList2 = arrayList;
            c28655q.m87173q(false);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Integer.valueOf(viewState.getOutline().getSegmentCount()));
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            c28674u2 = AbstractC2453v1.f9569h;
            interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(c28674u2);
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: c51.g
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return AbstractC4234k.m13129B(interfaceC39171c, arrayList2, iIntValue, iIntValue2, iIntValue3, interfaceC28601c1);
                    }
                });
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC28670t2 = (InterfaceC28670t2) objM87133R3;
            InterfaceC18280f interfaceC18280fM13192e16 = viewState.getOutline().getPointScalarRange();
            Long lValueOf16 = Long.valueOf(viewState.getOutline().m13190c());
            zM87157i = c28655q.m87157i(viewState) | c28655q.m87157i(list) | c28655q.m87147d(fM13246n);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R4 = new a(viewState, list, fM13246n, null);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new a(viewState, list, fM13246n, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87254h(interfaceC18280fM13192e16, lValueOf16, (InterfaceC4351m) objM87133R4, c28655q);
            Integer numValueOf16 = Integer.valueOf(viewState.getOutline().getSegmentCount());
            zM87157i2 = c28655q.m87157i(viewState);
            objM87133R5 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R5 = new b(viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new b(viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, numValueOf16);
            zM87157i3 = c28655q.m87157i(viewState);
            objM87133R6 = c28655q.m87133R();
            if (zM87157i3) {
                objM87133R6 = new c(viewState, null);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new c(viewState, null);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, viewState);
            c17891jM51478a = AbstractC17897m.m51478a();
            if (!viewState.getUsingPrimitiveEdgeFade()) {
                m13169h0(viewState, iIntValue, iIntValue2, c17891jM51478a, m13130C(interfaceC28670t2));
            }
            objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC28683x.m87272z(viewState.getColors().f92937w);
                c28655q.m87172p0(objM87133R7);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R7;
            objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = AbstractC28683x.m87272z(viewState.getColors().f92938x);
                c28655q.m87172p0(objM87133R8);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R8;
            interfaceC28670t2M13165f0 = m13165f0(m13179r(interfaceC28601c2), c28655q, 0);
            interfaceC28670t2M13165f1 = m13165f0(m13181t(interfaceC28601c3), c28655q, 0);
            if (viewState.getTransition() == null) {
                c28655q.m87150e0(-1659695200);
                abstractC17911tM13239g = viewState.m13238f((InterfaceC39171c) c28655q.m87161k(c28674u2));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1659627558);
                abstractC17911tM13239g = viewState.m13239g((InterfaceC39171c) c28655q.m87161k(c28674u2), m13183v(interfaceC28670t2M13165f0), m13184w(interfaceC28670t2M13165f1));
                c28655q.m87173q(false);
            }
            zM87157i4 = c28655q.m87157i(viewState);
            objM87133R9 = c28655q.m87133R();
            if (zM87157i4) {
                objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                c28655q.m87172p0(objM87133R9);
            } else {
                objM87133R9 = new d(viewState, interfaceC28601c2, interfaceC28601c3, null);
                c28655q.m87172p0(objM87133R9);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, viewState);
            Modifier modifierM3424u16 = AbstractC1102d.m3424u(viewState.m13251s(), AbstractC1102d.m3411h(viewState.m13250r(), modifier17));
            InterfaceC39127r0 interfaceC39127r0M66763d11111116 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11111116 = c28655q.m87165m();
            Modifier modifierM118962N11111116 = AbstractC37056f.m118962N(c28655q, modifierM3424u16);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i1111112 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i1111112, interfaceC39127r0M66763d11111116);
            C0209i c0209i1111113 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i1111113, interfaceC28653p1M87165m11111116);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                modifier21 = modifier17;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i1111114 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1111114, modifierM118962N11111116);
                C2307m c2307m1111 = C2299e.f9114w;
                InterfaceC39127r0 interfaceC39127r0M66763d11111117 = AbstractC22989q.m66763d(c2307m1111, false);
                abstractC17911t = abstractC17911tM13239g;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111117 = c28655q.m87165m();
                Modifier modifierM118962N11111117 = AbstractC37056f.m118962N(c28655q, modifier19);
                c28655q.m87158i0();
                Modifier modifier2111111110 = modifier19;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111112, interfaceC39127r0M66763d11111117);
                AbstractC28683x.m87239G(c28655q, c0209i1111113, interfaceC28653p1M87165m11111117);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111114, modifierM118962N11111117);
                int i4111111112 = i4111111111 >> 12;
                m13131D(modifier211111119, c28655q, i4111111112 & 14);
                objM87133R10 = c28655q.m87133R();
                if (objM87133R10 == c28676v0) {
                    interfaceC28670t3 = interfaceC28670t2;
                    objM87133R10 = new C2175b(interfaceC28670t3, 2);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    interfaceC28670t3 = interfaceC28670t2;
                }
                Modifier modifierM3480c1111 = AbstractC1125a.m3480c(c2314t17, (Function1) objM87133R10);
                InterfaceC39127r0 interfaceC39127r0M66763d11111118 = AbstractC22989q.m66763d(c2307m1111, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11111118 = c28655q.m87165m();
                Modifier modifierM118962N11111118 = AbstractC37056f.m118962N(c28655q, modifierM3480c1111);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111112, interfaceC39127r0M66763d11111118);
                AbstractC28683x.m87239G(c28655q, c0209i1111113, interfaceC28653p1M87165m11111118);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1111114, modifierM118962N11111118);
                if (viewState.getUsingPrimitiveEdgeFade()) {
                    c28655q.m87150e0(-271151621);
                    abstractC17911t2 = abstractC17911t;
                    i36 = i35;
                    m13149V(viewState, abstractC17911t2, c28655q, i36);
                    c28655q.m87173q(false);
                } else {
                    abstractC17911t2 = abstractC17911t;
                    i36 = i35;
                    c28655q.m87150e0(-271065906);
                    m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                    c28655q.m87173q(false);
                }
                m13144Q(viewState, abstractC17911t2, c28655q, i36);
                m13134G(viewState, modifier211111118, c28655q, (i4111111112 & 112) | i36);
                c28655q.m87173q(true);
                int i4111111113 = i36;
                m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i4111111113);
                c28655q.m87173q(true);
                AbstractC4226c.m13097g(viewState, modifier211111117, modifier18, null, c28655q, i4111111113 | (i4111111111 & 112) | (i4111111111 & 896), 8);
                c28655q.m87173q(true);
                modifier14 = modifier211111117;
                modifier16 = modifier211111119;
                modifier13 = modifier21;
                modifier11 = modifier2111111110;
                modifier15 = modifier18;
                modifier12 = modifier211111118;
            } else {
                modifier21 = modifier17;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i1111115 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i1111115, modifierM118962N11111116);
            C2307m c2307m1112 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d11111119 = AbstractC22989q.m66763d(c2307m1112, false);
            abstractC17911t = abstractC17911tM13239g;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11111119 = c28655q.m87165m();
            Modifier modifierM118962N11111119 = AbstractC37056f.m118962N(c28655q, modifier19);
            c28655q.m87158i0();
            Modifier modifier2111111111 = modifier19;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i1111112, interfaceC39127r0M66763d11111119);
            AbstractC28683x.m87239G(c28655q, c0209i1111113, interfaceC28653p1M87165m11111119);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i1111115, modifierM118962N11111119);
            int i4111111114 = i4111111111 >> 12;
            m13131D(modifier211111119, c28655q, i4111111114 & 14);
            objM87133R10 = c28655q.m87133R();
            if (objM87133R10 == c28676v0) {
                interfaceC28670t3 = interfaceC28670t2;
                objM87133R10 = new C2175b(interfaceC28670t3, 2);
                c28655q.m87172p0(objM87133R10);
            } else {
                interfaceC28670t3 = interfaceC28670t2;
            }
            Modifier modifierM3480c1112 = AbstractC1125a.m3480c(c2314t17, (Function1) objM87133R10);
            InterfaceC39127r0 interfaceC39127r0M66763d111111110 = AbstractC22989q.m66763d(c2307m1112, false);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m111111110 = c28655q.m87165m();
            Modifier modifierM118962N111111110 = AbstractC37056f.m118962N(c28655q, modifierM3480c1112);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i1111112, interfaceC39127r0M66763d111111110);
            AbstractC28683x.m87239G(c28655q, c0209i1111113, interfaceC28653p1M87165m111111110);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i1111115, modifierM118962N111111110);
            if (viewState.getUsingPrimitiveEdgeFade()) {
                c28655q.m87150e0(-271151621);
                abstractC17911t2 = abstractC17911t;
                i36 = i35;
                m13149V(viewState, abstractC17911t2, c28655q, i36);
                c28655q.m87173q(false);
            } else {
                abstractC17911t2 = abstractC17911t;
                i36 = i35;
                c28655q.m87150e0(-271065906);
                m13137J(viewState, c17891jM51478a, abstractC17911t2, c28655q, i36);
                c28655q.m87173q(false);
            }
            m13144Q(viewState, abstractC17911t2, c28655q, i36);
            m13134G(viewState, modifier211111118, c28655q, (i4111111114 & 112) | i36);
            c28655q.m87173q(true);
            int i4111111115 = i36;
            m13141N(viewState, m13130C(interfaceC28670t3), abstractC17911t2, fM13246n, c28655q, i4111111115);
            c28655q.m87173q(true);
            AbstractC4226c.m13097g(viewState, modifier211111117, modifier18, null, c28655q, i4111111115 | (i4111111111 & 112) | (i4111111111 & 896), 8);
            c28655q.m87173q(true);
            modifier14 = modifier211111117;
            modifier16 = modifier211111119;
            modifier13 = modifier21;
            modifier11 = modifier2111111111;
            modifier15 = modifier18;
            modifier12 = modifier211111118;
        } else {
            c28655q.m87138X();
            modifier11 = modifier4;
            modifier12 = modifier6;
            modifier13 = modifier7;
            modifier14 = modifier8;
            modifier15 = modifier9;
            modifier16 = modifier10;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g(modifier13, modifier14, modifier15, modifier11, modifier16, modifier12, viewState, i13, i14, 2);
        }
    }

    /* JADX INFO: renamed from: r */
    private static final long m13179r(InterfaceC28601c1 interfaceC28601c1) {
        return ((C17919x) interfaceC28601c1.getValue()).f69639a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m13180s(InterfaceC28601c1 interfaceC28601c1, long j7) {
        interfaceC28601c1.setValue(new C17919x(j7));
    }

    /* JADX INFO: renamed from: t */
    private static final long m13181t(InterfaceC28601c1 interfaceC28601c1) {
        return ((C17919x) interfaceC28601c1.getValue()).f69639a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m13182u(InterfaceC28601c1 interfaceC28601c1, long j7) {
        interfaceC28601c1.setValue(new C17919x(j7));
    }

    /* JADX INFO: renamed from: v */
    private static final long m13183v(InterfaceC28670t2 interfaceC28670t2) {
        return ((C17919x) interfaceC28670t2.getValue()).f69639a;
    }

    /* JADX INFO: renamed from: w */
    private static final long m13184w(InterfaceC28670t2 interfaceC28670t2) {
        return ((C17919x) interfaceC28670t2.getValue()).f69639a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m13185x(InterfaceC28670t2 interfaceC28670t2, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        InterfaceC17910s0 interfaceC17910s0M13130C = m13130C(interfaceC28670t2);
        C0237p c0237pMo744t0 = drawWithContent.mo744t0();
        long jM670A = c0237pMo744t0.m670A();
        c0237pMo744t0.m716w().mo51426q();
        try {
            ((C0929d) c0237pMo744t0.f812x).m2344b(interfaceC17910s0M13130C, 1);
            ((C0238p0) drawWithContent).m728a();
            return C23454a0.f92919a;
        } finally {
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m13186y(Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, Modifier modifier5, Modifier modifier6, C4242s c4242s, int i13, int i14, Composer composer, int i15) {
        m13178q(modifier, modifier2, modifier3, modifier4, modifier5, modifier6, c4242s, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final int m13187z(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }
}
