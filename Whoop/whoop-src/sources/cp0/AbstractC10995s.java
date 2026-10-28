package cp0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.nestedscroll.AbstractC1129a;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import e93.AbstractC12889b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p180h0.AbstractC16362b;
import p180h0.AbstractC16412k1;
import p180h0.C16430o;
import p180h0.C16435p;
import p180h0.C16475x;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16356a;
import p180h0.InterfaceC16397h1;
import p180h0.InterfaceC16413k2;
import p180h0.InterfaceC16432o1;
import p180h0.InterfaceC16439p3;
import p181h2.C16617b;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22663d0;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: cp0.s */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a*\u0010\u001b\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006 ²\u0006\u0012\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u001e\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Lh0/p;", "Lcp0/l;", "state", "Lkotlin/Function0;", "Ll83/a0;", "onDragStart", "i", "(Landroidx/compose/ui/Modifier;Lh0/p;Lc93/a;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Lcp0/t;", "drawerState", "", "isBarState", "enabled", "onDragStarted", "n", "(Landroidx/compose/ui/Modifier;Lcp0/t;ZZLc93/a;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "", MapboxMap.QFE_OFFSET, "delta", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(FF)F", "g", "(Lh0/p;F)Z", "Lh0/o1;", "flingBehavior", "velocity", "m", "(Lh0/p;Lh0/o1;FLq83/d;)Ljava/lang/Object;", "currentOnDragStart", "currentIsBarState", "currentOnDragStarted", "coach-everywhere_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10995s {

    /* JADX INFO: renamed from: cp0.s$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a extends C22672i implements Function1 {
        public a(Object obj) {
            super(1, 0, C16435p.class, obj, "dispatchRawDelta", "dispatchRawDelta(F)F");
        }

        /* JADX INFO: renamed from: a */
        public final Float m29370a(float f13) {
            C16435p c16435p = (C16435p) this.receiver;
            float fM46614d = c16435p.m46614d(f13);
            float fM46616f = fM46614d - c16435p.m46616f();
            c16435p.f63158j.m46600b(fM46614d, 0.0f);
            return Float.valueOf(fM46616f);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m29370a(((Number) obj).floatValue());
        }
    }

    /* JADX INFO: renamed from: cp0.s$b */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachDrawerOverScrollKt$forwardOverScrollToCoachDrawer$connection$1$3", m100430f = "CoachDrawerOverScroll.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "", "velocity"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f34349w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ float f34350x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C16435p f34351y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC16439p3 f34352z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C16435p c16435p, InterfaceC16439p3 interfaceC16439p3, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f34351y = c16435p;
            this.f34352z = interfaceC16439p3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f34351y, this.f34352z, interfaceC30057d);
            bVar.f34350x = ((Number) obj).floatValue();
            return bVar;
        }

        /* JADX INFO: renamed from: f */
        public final Object m29371f(float f13, InterfaceC30057d<? super Float> interfaceC30057d) {
            return ((b) create(Float.valueOf(f13), interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m29371f(((Number) obj).floatValue(), (InterfaceC30057d) obj2);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            float f13 = this.f34350x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34349w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C16435p c16435p = this.f34351y;
            InterfaceC16439p3 interfaceC16439p3 = this.f34352z;
            this.f34350x = f13;
            this.f34349w = 1;
            Object objM29365m = AbstractC10995s.m29365m(c16435p, interfaceC16439p3, f13, this);
            return objM29365m == enumC31071a ? enumC31071a : objM29365m;
        }
    }

    /* JADX INFO: renamed from: cp0.s$c */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachDrawerOverScrollKt", m100430f = "CoachDrawerOverScroll.kt", m100431l = {166}, m100432m = "performFling", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f34353E;

        /* JADX INFO: renamed from: F */
        int f34354F;

        /* JADX INFO: renamed from: w */
        Object f34355w;

        /* JADX INFO: renamed from: x */
        Object f34356x;

        /* JADX INFO: renamed from: y */
        Object f34357y;

        /* JADX INFO: renamed from: z */
        float f34358z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f34353E = obj;
            this.f34354F |= Integer.MIN_VALUE;
            return AbstractC10995s.m29365m(null, null, 0.0f, this);
        }
    }

    /* JADX INFO: renamed from: cp0.s$d */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachDrawerOverScrollKt$performFling$2", m100430f = "CoachDrawerOverScroll.kt", m100431l = {179}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lh0/a;", "Lh0/h1;", "Lcp0/l;", "anchors", "Ll83/a0;", "<anonymous>", "(Lh0/a;Lh0/h1;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        int f34359E;

        /* JADX INFO: renamed from: F */
        private /* synthetic */ Object f34360F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f34361G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC16432o1 f34362H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ C16435p f34363I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ C22663d0 f34364J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ float f34365K;

        /* JADX INFO: renamed from: w */
        Object f34366w;

        /* JADX INFO: renamed from: x */
        Object f34367x;

        /* JADX INFO: renamed from: y */
        Object f34368y;

        /* JADX INFO: renamed from: z */
        int f34369z;

        /* JADX INFO: renamed from: cp0.s$d$a */
        @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"cp0/s$d$a", "Lh0/k2;", "", "pixels", "a", "(F)F", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements InterfaceC16413k2 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C16435p f34370a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ InterfaceC16397h1 f34371b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ InterfaceC16356a f34372c;

            public a(C16435p c16435p, InterfaceC16397h1 interfaceC16397h1, InterfaceC16356a interfaceC16356a) {
                this.f34370a = c16435p;
                this.f34371b = interfaceC16397h1;
                this.f34372c = interfaceC16356a;
            }

            @Override // p180h0.InterfaceC16413k2
            /* JADX INFO: renamed from: a */
            public float mo29373a(float pixels) {
                float fM46616f = this.f34370a.m46616f();
                float fM36283m = AbstractC12889b.m36283m(pixels + fM46616f, ((C16475x) this.f34371b).m46649d(), ((C16475x) this.f34371b).m46648c());
                ((C16430o) this.f34372c).m46600b(fM36283m, 0.0f);
                return fM36283m - fM46616f;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC16432o1 interfaceC16432o1, C16435p c16435p, C22663d0 c22663d0, float f13, InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f34362H = interfaceC16432o1;
            this.f34363I = c16435p;
            this.f34364J = c22663d0;
            this.f34365K = f13;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16356a interfaceC16356a, InterfaceC16397h1 interfaceC16397h1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(this.f34362H, this.f34363I, this.f34364J, this.f34365K, interfaceC30057d);
            dVar.f34360F = interfaceC16356a;
            dVar.f34361G = interfaceC16397h1;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22663d0 c22663d0;
            InterfaceC16356a interfaceC16356a = (InterfaceC16356a) this.f34360F;
            InterfaceC16397h1 interfaceC16397h1 = (InterfaceC16397h1) this.f34361G;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f34359E;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                a aVar = new a(this.f34363I, interfaceC16397h1, interfaceC16356a);
                InterfaceC16432o1 interfaceC16432o1 = this.f34362H;
                C22663d0 c22663d1 = this.f34364J;
                float f13 = this.f34365K;
                this.f34360F = null;
                this.f34361G = null;
                this.f34366w = null;
                this.f34367x = null;
                this.f34368y = c22663d1;
                this.f34369z = 0;
                this.f34359E = 1;
                obj = interfaceC16432o1.mo46565a(aVar, f13, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
                c22663d0 = c22663d1;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c22663d0 = (C22663d0) this.f34368y;
                AbstractC34132o.m107864I(obj);
            }
            c22663d0.f89331w = ((Number) obj).floatValue();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cp0.s$e */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachDrawerOverScrollKt$swipeUpToOpenCoachDrawer$2$1", m100430f = "CoachDrawerOverScroll.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "Lh2/b;", "it", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;Lh2/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f34373w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f34374x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f34374x = interfaceC28670t2;
        }

        /* JADX INFO: renamed from: f */
        public final Object m29374f(InterfaceC2994c0 interfaceC2994c0, long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return new e(this.f34374x, interfaceC30057d).invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m29374f((InterfaceC2994c0) obj, ((C16617b) obj2).f63937a, (InterfaceC30057d) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f34373w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC10995s.m29369q(this.f34374x).invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cp0.s$f */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachDrawerOverScrollKt$swipeUpToOpenCoachDrawer$3$1", m100430f = "CoachDrawerOverScroll.kt", m100431l = {63, 65}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "", "velocity", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;F)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C10998t f34375E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28670t2 f34376F;

        /* JADX INFO: renamed from: w */
        int f34377w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ float f34378x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C16435p f34379y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC16439p3 f34380z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C16435p c16435p, InterfaceC16439p3 interfaceC16439p3, C10998t c10998t, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f34379y = c16435p;
            this.f34380z = interfaceC16439p3;
            this.f34375E = c10998t;
            this.f34376F = interfaceC28670t2;
        }

        /* JADX INFO: renamed from: f */
        public final Object m29375f(InterfaceC2994c0 interfaceC2994c0, float f13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(this.f34379y, this.f34380z, this.f34375E, this.f34376F, interfaceC30057d);
            fVar.f34378x = f13;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m29375f((InterfaceC2994c0) obj, ((Number) obj2).floatValue(), (InterfaceC30057d) obj3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        
            if (r8.m29397q(r2, false, r7) == r1) goto L21;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                float r0 = r7.f34378x
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f34377w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1e
                if (r2 == r4) goto L1a
                if (r2 != r3) goto L12
                p505ts.AbstractC34132o.m107864I(r8)
                goto L57
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L37
            L1e:
                p505ts.AbstractC34132o.m107864I(r8)
                h0.p r8 = r7.f34379y
                h0.p3 r2 = r7.f34380z
                r5 = 0
                int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r6 <= 0) goto L2b
                goto L2c
            L2b:
                r5 = r0
            L2c:
                r7.f34378x = r0
                r7.f34377w = r4
                java.lang.Object r8 = cp0.AbstractC10995s.m29356d(r8, r2, r5, r7)
                if (r8 != r1) goto L37
                goto L56
            L37:
                cp0.t r8 = r7.f34375E
                cp0.l r8 = r8.m29392g()
                boolean r8 = r8.isDrawerDetent()
                if (r8 != 0) goto L57
                cp0.t r8 = r7.f34375E
                p1.t2 r2 = r7.f34376F
                boolean r2 = cp0.AbstractC10995s.m29357e(r2)
                r7.f34378x = r0
                r7.f34377w = r3
                r0 = 0
                java.lang.Object r8 = r8.m29397q(r2, r0, r7)
                if (r8 != r1) goto L57
            L56:
                return r1
            L57:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: cp0.AbstractC10995s.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: g */
    private static final boolean m29359g(C16435p c16435p, float f13) {
        C28617g1 c28617g1 = c16435p.f63154f;
        C28617g1 c28617g2 = c16435p.f63154f;
        if (Float.isNaN(c28617g1.m87022x())) {
            return false;
        }
        if (f13 < 0.0f) {
            return c28617g2.m87022x() > ((C16475x) c16435p.m46613c()).m46649d();
        }
        return c28617g2.m87022x() < ((C16475x) c16435p.m46613c()).m46648c();
    }

    /* JADX INFO: renamed from: h */
    public static final float m29360h(float f13, float f14) {
        if (f13 > 0.0f && f14 >= 0.0f) {
            return 0.0f;
        }
        float f15 = (f13 > 0.0f ? 0.0f : f13) + f14;
        return (f15 <= 0.0f ? f15 : 0.0f) - f13;
    }

    /* JADX INFO: renamed from: i */
    public static final Modifier m29361i(Modifier modifier, C16435p state, InterfaceC4339a onDragStart, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onDragStart, "onDragStart");
        InterfaceC16439p3 interfaceC16439p3M46564a = AbstractC16362b.m46564a(state, composer, ((i13 >> 3) & 14) | (AbstractC16362b.f62902c << 9));
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(onDragStart, composer);
        boolean z4 = (((i13 & 112) ^ 48) > 32 && ((C28655q) composer).m87153g(state)) || (i13 & 48) == 32;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = z4 | c28655q.m87153g(interfaceC16439p3M46564a);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C10989q(new C11007w0(state, 1), new a(state), new b(state, interfaceC16439p3M46564a, null), new C10992r(0, interfaceC28601c1M87238F));
            c28655q.m87172p0(objM87133R);
        }
        return AbstractC1129a.m3495a(modifier, (C10989q) objM87133R, null);
    }

    /* JADX INFO: renamed from: j */
    private static final InterfaceC4339a m29362j(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC4339a) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final boolean m29363k(C16435p c16435p, float f13) {
        return m29359g(c16435p, f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m29364l(InterfaceC28670t2 interfaceC28670t2) {
        m29362j(interfaceC28670t2).invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public static final Object m29365m(C16435p c16435p, InterfaceC16432o1 interfaceC16432o1, float f13, InterfaceC30057d<? super Float> interfaceC30057d) {
        c cVar;
        C22663d0 c22663d0;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f34354F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f34354F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f34353E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f34354F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C22663d0 c22663d1 = new C22663d0();
            c22663d1.f89331w = f13;
            d dVar = new d(interfaceC16432o1, c16435p, c22663d1, f13, null);
            cVar.f34355w = null;
            cVar.f34356x = null;
            cVar.f34357y = c22663d1;
            cVar.f34358z = f13;
            cVar.f34354F = 1;
            if (C16435p.m46611b(c16435p, dVar, cVar) == enumC31071a) {
                return enumC31071a;
            }
            c22663d0 = c22663d1;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22663d0 = (C22663d0) cVar.f34357y;
            AbstractC34132o.m107864I(obj);
        }
        return new Float(c22663d0.f89331w);
    }

    /* JADX INFO: renamed from: n */
    public static final Modifier m29366n(Modifier modifier, C10998t drawerState, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        InterfaceC4339a interfaceC4339a2;
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(drawerState, "drawerState");
        int i15 = i14 & 8;
        C28676v0 c28676v0 = C28635l.f115821a;
        if (i15 != 0) {
            C28655q c28655q = (C28655q) composer;
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C10977m(7);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC4339a2 = (InterfaceC4339a) objM87133R;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        C16435p draggableState = drawerState.getDraggableState();
        InterfaceC16439p3 interfaceC16439p3M46564a = AbstractC16362b.m46564a(draggableState, composer, AbstractC16362b.f62902c << 9);
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(Boolean.valueOf(z4), composer);
        InterfaceC28601c1 interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(interfaceC4339a2, composer);
        C28655q c28655q2 = (C28655q) composer;
        boolean zM87153g = c28655q2.m87153g(draggableState);
        Object objM87133R2 = c28655q2.m87133R();
        if (zM87153g || objM87133R2 == c28676v0) {
            objM87133R2 = new C10943a1(draggableState);
            c28655q2.m87172p0(objM87133R2);
        }
        C10943a1 c10943a1 = (C10943a1) objM87133R2;
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        boolean zM87153g2 = c28655q2.m87153g(interfaceC28601c1M87238F2);
        Object objM87133R3 = c28655q2.m87133R();
        if (zM87153g2 || objM87133R3 == c28676v0) {
            objM87133R3 = new e(interfaceC28601c1M87238F2, null);
            c28655q2.m87172p0(objM87133R3);
        }
        Function3 function3 = (Function3) objM87133R3;
        boolean zM87153g3 = c28655q2.m87153g(draggableState) | c28655q2.m87153g(interfaceC16439p3M46564a) | ((((i13 & 112) ^ 48) > 32 && c28655q2.m87153g(drawerState)) || (i13 & 48) == 32) | c28655q2.m87153g(interfaceC28601c1M87238F);
        Object objM87133R4 = c28655q2.m87133R();
        if (zM87153g3 || objM87133R4 == c28676v0) {
            f fVar = new f(draggableState, interfaceC16439p3M46564a, drawerState, interfaceC28601c1M87238F, null);
            c28655q2.m87172p0(fVar);
            objM87133R4 = fVar;
        }
        return AbstractC16412k1.m46598a(modifier, c10943a1, enumC16377d2, z13, null, false, function3, (Function3) objM87133R4, false, 152);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m29367o() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final boolean m29368p(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC4339a m29369q(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC4339a) interfaceC28670t2.getValue();
    }
}
