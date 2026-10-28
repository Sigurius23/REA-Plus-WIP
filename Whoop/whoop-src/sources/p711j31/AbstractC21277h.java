package p711j31;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import java.util.Collection;
import l83.C23454a0;
import p026b2.C2314t;
import p180h0.AbstractC16444q3;
import p180h0.AbstractC16486z0;
import p181h2.C16617b;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.AbstractC34454d0;
import p512u2.AbstractC34471q;
import p512u2.C34460g0;
import p512u2.C34462h0;
import p512u2.C34472r;
import p512u2.InterfaceC34449b;
import p512u2.InterfaceC34476v;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32274h;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: j31.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aV\u0010\u0010\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\fH\u0080@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Lj31/m;", "state", "b", "(Landroidx/compose/ui/Modifier;Lj31/m;)Landroidx/compose/ui/Modifier;", "Lu2/v;", "Lu2/q;", "down", "Lkotlin/Function0;", "Ll83/a0;", "onDragEnd", "onDragCancel", "Lkotlin/Function2;", "Lu2/r;", "Lh2/b;", "onDrag", "a", "(Lu2/v;JLc93/a;Lc93/a;Lc93/m;Lq83/d;)Ljava/lang/Object;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21277h {

    /* JADX INFO: renamed from: j31.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.reordable.ReorderableKt$detectDrag$4", m100430f = "Reorderable.kt", m100431l = {69}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu2/b;", "Ll83/a0;", "<anonymous>", "(Lu2/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32274h implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC4339a f81248E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC4339a f81249F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC4351m f81250G;

        /* JADX INFO: renamed from: x */
        int f81251x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f81252y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ long f81253z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j7, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f81253z = j7;
            this.f81248E = interfaceC4339a;
            this.f81249F = interfaceC4339a2;
            this.f81250G = interfaceC4351m;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final C23454a0 m59707i(InterfaceC4351m interfaceC4351m, C34472r c34472r) {
            interfaceC4351m.invoke(c34472r, new C16617b(AbstractC34454d0.m108920k(c34472r, false)));
            c34472r.m108946a();
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f81253z, this.f81248E, this.f81249F, this.f81250G, interfaceC30057d);
            aVar.f81252y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC34449b interfaceC34449b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC34449b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC34449b interfaceC34449b = (InterfaceC34449b) this.f81252y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81251x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                long j7 = this.f81253z;
                final InterfaceC4351m interfaceC4351m = this.f81250G;
                Function1 function1 = new Function1() { // from class: j31.g
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AbstractC21277h.a.m59707i(interfaceC4351m, (C34472r) obj2);
                    }
                };
                this.f81252y = interfaceC34449b;
                this.f81251x = 1;
                obj = AbstractC16486z0.m46661j(interfaceC34449b, j7, function1, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                for (C34472r c34472r : (Iterable) ((C34460g0) interfaceC34449b).f144774F.f144784T.f144800a) {
                    if (AbstractC34454d0.m108913d(c34472r)) {
                        c34472r.m108946a();
                    }
                }
                this.f81248E.invoke();
            } else {
                this.f81249F.invoke();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: j31.h$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractC21282m<?> f81254w;

        /* JADX INFO: renamed from: j31.h$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.reordable.ReorderableKt$reorderable$1$1", m100430f = "Reorderable.kt", m100431l = {35, 36, 43}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu2/v;", "Ll83/a0;", "<anonymous>", "(Lu2/v;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ AbstractC21282m<?> f81255E;

            /* JADX INFO: renamed from: w */
            Object f81256w;

            /* JADX INFO: renamed from: x */
            Object f81257x;

            /* JADX INFO: renamed from: y */
            int f81258y;

            /* JADX INFO: renamed from: z */
            private /* synthetic */ Object f81259z;

            /* JADX INFO: renamed from: j31.h$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.reordable.ReorderableKt$reorderable$1$1$down$1", m100430f = "Reorderable.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu2/b;", "Lu2/r;", "<anonymous>", "(Lu2/b;)Lu2/r;"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41825a extends AbstractC32274h implements InterfaceC4351m {

                /* JADX INFO: renamed from: x */
                int f81260x;

                /* JADX INFO: renamed from: y */
                private /* synthetic */ Object f81261y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ C21285p f81262z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41825a(C21285p c21285p, InterfaceC30057d<? super C41825a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f81262z = c21285p;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    C41825a c41825a = new C41825a(this.f81262z, interfaceC30057d);
                    c41825a.f81261y = obj;
                    return c41825a;
                }

                @Override // c93.InterfaceC4351m
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC34449b interfaceC34449b, InterfaceC30057d<? super C34472r> interfaceC30057d) {
                    return ((C41825a) create(interfaceC34449b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.List] */
                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    InterfaceC34449b interfaceC34449b = (InterfaceC34449b) this.f81261y;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    if (this.f81260x != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    ?? r10 = ((C34460g0) interfaceC34449b).f144774F.f144784T.f144800a;
                    C21285p c21285p = this.f81262z;
                    int size = ((Collection) r10).size();
                    for (int i13 = 0; i13 < size; i13++) {
                        Object obj2 = r10.get(i13);
                        if (AbstractC34471q.m108943a(((C34472r) obj2).f144815a, c21285p.getId())) {
                            return obj2;
                        }
                    }
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC21282m<?> abstractC21282m, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f81255E = abstractC21282m;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: k */
            public static final C23454a0 m59712k(AbstractC21282m abstractC21282m) {
                abstractC21282m.m59774Q();
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: l */
            public static final C23454a0 m59713l(AbstractC21282m abstractC21282m) {
                abstractC21282m.m59774Q();
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: m */
            public static final C23454a0 m59714m(AbstractC21282m abstractC21282m, C34472r c34472r, C16617b c16617b) {
                c34472r.m108946a();
                abstractC21282m.m59773P((int) Float.intBitsToFloat((int) (c16617b.f63937a >> 32)), (int) Float.intBitsToFloat((int) (c16617b.f63937a & 4294967295L)));
                return C23454a0.f92919a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f81255E, interfaceC30057d);
                aVar.f81259z = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0067  */
            /* JADX WARN: Code duplicated, block: B:22:0x0087  */
            /* JADX WARN: Code duplicated, block: B:24:0x008d  */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00ca, code lost:
            
                if (p711j31.AbstractC21277h.m59704a(r1, r4, r4, r5, r2, r14) == r0) goto L27;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 208
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p711j31.AbstractC21277h.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC34476v, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public b(AbstractC21282m<?> abstractC21282m) {
            this.f81254w = abstractC21282m;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46631m = AbstractC16444q3.m46631m(interfaceC34476v, new a(this.f81254w, null), interfaceC30057d);
            return objM46631m == EnumC31071a.f128113w ? objM46631m : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m59704a(InterfaceC34476v interfaceC34476v, long j7, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM108934X0 = ((C34462h0) interfaceC34476v).m108934X0(new a(j7, interfaceC4339a, interfaceC4339a2, interfaceC4351m, null), interfaceC30057d);
        return objM108934X0 == EnumC31071a.f128113w ? objM108934X0 : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public static final Modifier m59705b(Modifier modifier, AbstractC21282m<?> state) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(state, "state");
        return modifier.mo3471e(AbstractC34452c0.m108903b(C2314t.f9131w, C23454a0.f92919a, new b(state)));
    }
}
