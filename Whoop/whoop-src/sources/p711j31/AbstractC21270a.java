package p711j31;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p026b2.C2314t;
import p180h0.AbstractC16434o3;
import p180h0.AbstractC16444q3;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.C34462h0;
import p512u2.C34472r;
import p512u2.InterfaceC34449b;
import p512u2.InterfaceC34476v;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32274h;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: j31.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Lj31/m;", "state", "a", "(Landroidx/compose/ui/Modifier;Lj31/m;)Landroidx/compose/ui/Modifier;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21270a {

    /* JADX INFO: renamed from: j31.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractC21282m<?> f81215w;

        /* JADX INFO: renamed from: j31.a$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.reordable.DetectReorderKt$detectReorderAfterLongPress$1$1", m100430f = "DetectReorder.kt", m100431l = {49, 52}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu2/v;", "Ll83/a0;", "<anonymous>", "(Lu2/v;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41823a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            Object f81216w;

            /* JADX INFO: renamed from: x */
            int f81217x;

            /* JADX INFO: renamed from: y */
            private /* synthetic */ Object f81218y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ AbstractC21282m<?> f81219z;

            /* JADX INFO: renamed from: j31.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.reordable.DetectReorderKt$detectReorderAfterLongPress$1$1$down$1", m100430f = "DetectReorder.kt", m100431l = {50}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu2/b;", "Lu2/r;", "<anonymous>", "(Lu2/b;)Lu2/r;"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41824a extends AbstractC32274h implements InterfaceC4351m {

                /* JADX INFO: renamed from: x */
                int f81220x;

                /* JADX INFO: renamed from: y */
                private /* synthetic */ Object f81221y;

                public C41824a(InterfaceC30057d<? super C41824a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    C41824a c41824a = new C41824a(interfaceC30057d);
                    c41824a.f81221y = obj;
                    return c41824a;
                }

                @Override // c93.InterfaceC4351m
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC34449b interfaceC34449b, InterfaceC30057d<? super C34472r> interfaceC30057d) {
                    return ((C41824a) create(interfaceC34449b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    InterfaceC34449b interfaceC34449b = (InterfaceC34449b) this.f81221y;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f81220x;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    this.f81221y = null;
                    this.f81220x = 1;
                    Object objM46603c = AbstractC16434o3.m46603c(interfaceC34449b, this, 2);
                    return objM46603c == enumC31071a ? enumC31071a : objM46603c;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41823a(AbstractC21282m<?> abstractC21282m, InterfaceC30057d<? super C41823a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f81219z = abstractC21282m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                C41823a c41823a = new C41823a(this.f81219z, interfaceC30057d);
                c41823a.f81218y = obj;
                return c41823a;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41823a) create(interfaceC34476v, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0051  */
            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C34472r c34472r;
                InterfaceC34476v interfaceC34476v = (InterfaceC34476v) this.f81218y;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f81217x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C41824a c41824a = new C41824a(null);
                    this.f81218y = interfaceC34476v;
                    this.f81217x = 1;
                    obj = ((C34462h0) interfaceC34476v).m108934X0(c41824a, this);
                    if (obj != enumC31071a) {
                    }
                    return enumC31071a;
                }
                if (i13 == 1) {
                    AbstractC34132o.m107864I(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c34472r = (C34472r) this.f81216w;
                    AbstractC34132o.m107864I(obj);
                }
                if (((C34472r) obj) != null) {
                    this.f81219z.getInteractions().mo32218s(new C21285p(c34472r.f144815a, null, 2, null));
                }
                return C23454a0.f92919a;
                C34472r c34472r2 = (C34472r) obj;
                this.f81218y = null;
                this.f81216w = c34472r2;
                this.f81217x = 2;
                Object objM59687b = AbstractC21272c.m59687b(interfaceC34476v, c34472r2, this);
                if (objM59687b != enumC31071a) {
                    c34472r = c34472r2;
                    obj = objM59687b;
                    if (((C34472r) obj) != null) {
                        this.f81219z.getInteractions().mo32218s(new C21285p(c34472r.f144815a, null, 2, null));
                    }
                    return C23454a0.f92919a;
                }
                return enumC31071a;
            }
        }

        public a(AbstractC21282m<?> abstractC21282m) {
            this.f81215w = abstractC21282m;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46631m = AbstractC16444q3.m46631m(interfaceC34476v, new C41823a(this.f81215w, null), interfaceC30057d);
            return objM46631m == EnumC31071a.f128113w ? objM46631m : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Modifier m59681a(Modifier modifier, AbstractC21282m<?> state) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(state, "state");
        return modifier.mo3471e(AbstractC34452c0.m108903b(C2314t.f9131w, C23454a0.f92919a, new a(state)));
    }
}
