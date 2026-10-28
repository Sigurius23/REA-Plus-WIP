package p711j31;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.List;
import l83.C23454a0;
import p027b3.AbstractC2453v1;
import p329n0.AbstractC26071x;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p505ts.AbstractC34132o;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: j31.l, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00002\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lkotlin/Function2;", "Lj31/d;", "Ll83/a0;", "onMove", "Ln0/u;", "listState", "", "canDragOver", "", "onDragEnd", "Ly3/f;", "maxScrollPerFrame", "Lj31/b;", "dragCancelledAnimation", "Lj31/k;", "a", "(Lc93/m;Ln0/u;Lc93/m;Lc93/m;FLj31/b;Landroidx/compose/runtime/Composer;II)Lj31/k;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function2 {

    /* JADX INFO: renamed from: j31.l$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.reordable.ReorderableLazyListStateKt$rememberReorderableLazyListState$1$1", m100430f = "ReorderableLazyListState.kt", m100431l = {51}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f81269w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21280k f81270x;

        /* JADX INFO: renamed from: j31.l$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41826a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21280k f81271w;

            public C41826a(C21280k c21280k) {
                this.f81271w = c21280k;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<? extends InterfaceC26054g> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f81271w.m59773P(0, 0);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C21280k c21280k, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f81270x = c21280k;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f81270x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81269w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM59775W = this.f81270x.m59775W();
                C41826a c41826a = new C41826a(this.f81270x);
                this.f81269w = 1;
                if (interfaceC13058lM59775W.collect(c41826a, this) == enumC31071a) {
                    return enumC31071a;
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

    /* JADX INFO: renamed from: j31.l$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.reordable.ReorderableLazyListStateKt$rememberReorderableLazyListState$2$1", m100430f = "ReorderableLazyListState.kt", m100431l = {61, 62}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C26068u f81272E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ boolean f81273F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C21280k f81274G;

        /* JADX INFO: renamed from: w */
        int f81275w;

        /* JADX INFO: renamed from: x */
        float f81276x;

        /* JADX INFO: renamed from: y */
        float f81277y;

        /* JADX INFO: renamed from: z */
        int f81278z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C26068u c26068u, boolean z4, C21280k c21280k, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f81272E = c26068u;
            this.f81273F = z4;
            this.f81274G = c21280k;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f81272E, this.f81273F, this.f81274G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x005e  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        
            if (p180h0.AbstractC16444q3.m46634p(r8.f81272E, r9 * r1, r8) == r0) goto L26;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0077 -> B:7:0x0013). Please report as a decompilation issue!!! */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r8.f81278z
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                float r1 = r8.f81276x
                int r4 = r8.f81275w
                p505ts.AbstractC34132o.m107864I(r9)
            L13:
                r9 = r4
                goto L4b
            L15:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1d:
                float r1 = r8.f81276x
                int r4 = r8.f81275w
                p505ts.AbstractC34132o.m107864I(r9)
                goto L61
            L25:
                p505ts.AbstractC34132o.m107864I(r9)
                n0.u r9 = r8.f81272E
                n0.n r9 = r9.m77565h()
                r9.getClass()
                boolean r9 = r8.f81273F
                if (r9 == 0) goto L43
                n0.u r9 = r8.f81272E
                n0.n r9 = r9.m77565h()
                h0.d2 r9 = r9.f103181o
                h0.d2 r1 = p180h0.EnumC16377d2.f62971w
                if (r9 == r1) goto L43
                r9 = 0
                goto L44
            L43:
                r9 = r3
            L44:
                if (r9 == 0) goto L49
                r1 = 1065353216(0x3f800000, float:1.0)
                goto L4b
            L49:
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            L4b:
                j31.k r4 = r8.f81274G
                dc3.l r4 = r4.getScrollChannel()
                r8.f81275w = r9
                r8.f81276x = r1
                r8.f81278z = r3
                java.lang.Object r4 = r4.mo32208i(r8)
                if (r4 != r0) goto L5e
                goto L79
            L5e:
                r7 = r4
                r4 = r9
                r9 = r7
            L61:
                java.lang.Number r9 = (java.lang.Number) r9
                float r9 = r9.floatValue()
                n0.u r5 = r8.f81272E
                float r6 = r9 * r1
                r8.f81275w = r4
                r8.f81276x = r1
                r8.f81277y = r9
                r8.f81278z = r2
                java.lang.Object r9 = p180h0.AbstractC16444q3.m46634p(r5, r6, r8)
                if (r9 != r0) goto L13
            L79:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p711j31.Function2.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C21280k m59746a(InterfaceC4351m onMove, C26068u c26068u, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, float f13, InterfaceC21271b interfaceC21271b, Composer composer, int i13, int i14) {
        AbstractC22676k.m65750j(onMove, "onMove");
        C26068u c26068uM77569a = (i14 & 2) != 0 ? AbstractC26071x.m77569a(0, 0, composer, 3) : c26068u;
        InterfaceC4351m interfaceC4351m3 = (i14 & 4) != 0 ? null : interfaceC4351m;
        InterfaceC4351m interfaceC4351m4 = (i14 & 8) != 0 ? null : interfaceC4351m2;
        float f14 = (i14 & 16) != 0 ? 20 : f13;
        InterfaceC21271b c21284o = (i14 & 32) != 0 ? new C21284o(0.0f, 1, null) : interfaceC21271b;
        C28655q c28655q = (C28655q) composer;
        float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC28683x.m87262p(c28655q);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
        int i15 = (i13 & 112) ^ 48;
        boolean z4 = (i15 > 32 && c28655q.m87153g(c26068uM77569a)) || (i13 & 48) == 32;
        Object objM87133R2 = c28655q.m87133R();
        if (z4 || objM87133R2 == c28676v0) {
            C21280k c21280k = new C21280k(c26068uM77569a, interfaceC2994c0, fMo743q0, onMove, interfaceC4351m3, interfaceC4351m4, c21284o);
            c28655q.m87172p0(c21280k);
            objM87133R2 = c21280k;
        }
        C21280k c21280k2 = (C21280k) objM87133R2;
        boolean z13 = c28655q.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x;
        boolean zM87157i = c28655q.m87157i(c21280k2);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i || objM87133R3 == c28676v0) {
            objM87133R3 = new a(c21280k2, null);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c21280k2);
        boolean zM87155h = c28655q.m87155h(z13) | ((i15 > 32 && c28655q.m87153g(c26068uM77569a)) || (i13 & 48) == 32) | c28655q.m87157i(c21280k2);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87155h || objM87133R4 == c28676v0) {
            objM87133R4 = new b(c26068uM77569a, z13, c21280k2, null);
            c28655q.m87172p0(objM87133R4);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, c21280k2);
        return c21280k2;
    }
}
