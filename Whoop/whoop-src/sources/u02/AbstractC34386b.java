package u02;

import c93.InterfaceC4351m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: u02.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001an\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a=\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001aJ\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0086@¢\u0006\u0004\b\u0015\u0010\u0016\u001aP\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022(\u0010\u0014\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH\u0086@¢\u0006\u0004\b\u0018\u0010\u0016\u001a-\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001d\u0010\u001e\"\u0019\u0010\"\u001a\u00020\u0019*\u0006\u0012\u0002\b\u00030\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0019\u0010$\u001a\u00020\u0019*\u0006\u0012\u0002\b\u00030\u001f8F¢\u0006\u0006\u001a\u0004\b#\u0010!¨\u0006%"}, m65681d2 = {"T", "R", "Lu02/a;", "Ltr2/n;", "logger", "Lrr2/c;", "crashReporter", "", "errorPrefix", "Lkotlin/Function2;", "Lq83/d;", "", "apiCall", "a", "(Lu02/a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lc93/m;Lq83/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "transform", "e", "(Lu02/a;Lkotlin/jvm/functions/Function1;)Lu02/a;", "Ll83/a0;", "block", "g", "(Lu02/a;Lc93/m;Lq83/d;)Ljava/lang/Object;", "Lu02/a$b;", "f", "", "handled", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lu02/a$b;Z)Lu02/a$b;", "b", "(Lu02/a;)Ljava/lang/Object;", "Lu02/a$b$a;", "c", "(Lu02/a$b$a;)Z", "isServerError", "d", "isTemporaryServerError", "network_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34386b {

    /* JADX INFO: renamed from: u02.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.network.api.ApiCallKt$chain$2", m100430f = "ApiCall.kt", m100431l = {131}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, m65681d2 = {"<anonymous>", "R"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f144531w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4351m f144532x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC34385a<T> f144533y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC4351m interfaceC4351m, InterfaceC34385a<? extends T> interfaceC34385a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f144532x = interfaceC4351m;
            this.f144533y = interfaceC34385a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f144532x, this.f144533y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f144531w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC4351m interfaceC4351m = this.f144532x;
            Object objM108735a = ((InterfaceC34385a.c) this.f144533y).m108735a();
            this.f144531w = 1;
            Object objInvoke = interfaceC4351m.invoke(objM108735a, this);
            return objInvoke == enumC31071a ? enumC31071a : objInvoke;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super R> interfaceC30057d) {
            return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: u02.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.network.api.ApiCallKt", m100430f = "ApiCall.kt", m100431l = {167}, m100432m = "onError", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b<T> extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f144534w;

        /* JADX INFO: renamed from: x */
        Object f144535x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f144536y;

        /* JADX INFO: renamed from: z */
        int f144537z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f144536y = obj;
            this.f144537z |= Integer.MIN_VALUE;
            return AbstractC34386b.m108741f(null, null, this);
        }
    }

    /* JADX INFO: renamed from: u02.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.network.api.ApiCallKt", m100430f = "ApiCall.kt", m100431l = {155}, m100432m = "onSuccess", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c<T> extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f144538w;

        /* JADX INFO: renamed from: x */
        Object f144539x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f144540y;

        /* JADX INFO: renamed from: z */
        int f144541z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f144540y = obj;
            this.f144541z |= Integer.MIN_VALUE;
            return AbstractC34386b.m108742g(null, null, this);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <T, R> Object m108736a(InterfaceC34385a<? extends T> interfaceC34385a, InterfaceC34116n interfaceC34116n, InterfaceC31766c interfaceC31766c, String str, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super InterfaceC34385a<? extends R>> interfaceC30057d) {
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return InterfaceC34385a.INSTANCE.m108730a(interfaceC34116n, interfaceC31766c, str, new a(interfaceC4351m, interfaceC34385a, null), interfaceC30057d);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return m108744i((InterfaceC34385a.b) interfaceC34385a, false, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final <T> T m108737b(InterfaceC34385a<? extends T> interfaceC34385a) {
        AbstractC22676k.m65750j(interfaceC34385a, "<this>");
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return (T) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m108738c(InterfaceC34385a.b.a<?> aVar) {
        AbstractC22676k.m65750j(aVar, "<this>");
        int errorCode = aVar.getErrorCode();
        return 500 <= errorCode && errorCode < 600;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m108739d(InterfaceC34385a.b.a<?> aVar) {
        AbstractC22676k.m65750j(aVar, "<this>");
        int errorCode = aVar.getErrorCode();
        return 501 <= errorCode && errorCode < 600;
    }

    /* JADX INFO: renamed from: e */
    public static final <T, R> InterfaceC34385a<R> m108740e(InterfaceC34385a<? extends T> interfaceC34385a, Function1 transform) {
        AbstractC22676k.m65750j(interfaceC34385a, "<this>");
        AbstractC22676k.m65750j(transform, "transform");
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new InterfaceC34385a.c(transform.invoke(((InterfaceC34385a.c) interfaceC34385a).m108735a()));
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return m108744i((InterfaceC34385a.b) interfaceC34385a, false, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final <T> Object m108741f(InterfaceC34385a<? extends T> interfaceC34385a, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super InterfaceC34385a<? extends T>> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f144537z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f144537z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f144536y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = bVar.f144537z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if ((interfaceC34385a instanceof InterfaceC34385a.b) && !((InterfaceC34385a.b) interfaceC34385a).getHandled()) {
                bVar.f144534w = interfaceC34385a;
                bVar.f144535x = null;
                bVar.f144537z = 1;
                if (interfaceC4351m.invoke(interfaceC34385a, bVar) == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC34385a = (InterfaceC34385a) bVar.f144534w;
            AbstractC34132o.m107864I(obj);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return m108743h((InterfaceC34385a.b) interfaceC34385a, true);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return interfaceC34385a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public static final <T> Object m108742g(InterfaceC34385a<? extends T> interfaceC34385a, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super InterfaceC34385a<? extends T>> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f144541z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f144541z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f144540y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = cVar.f144541z;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC34385a interfaceC34385a2 = (InterfaceC34385a) cVar.f144538w;
            AbstractC34132o.m107864I(obj);
            return interfaceC34385a2;
        }
        AbstractC34132o.m107864I(obj);
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            Object objM108735a = ((InterfaceC34385a.c) interfaceC34385a).m108735a();
            cVar.f144538w = interfaceC34385a;
            cVar.f144539x = null;
            cVar.f144541z = 1;
            if (interfaceC4351m.invoke(objM108735a, cVar) == obj2) {
                return obj2;
            }
        }
        return interfaceC34385a;
    }

    /* JADX INFO: renamed from: h */
    private static final <R> InterfaceC34385a.b<R> m108743h(InterfaceC34385a.b<?> bVar, boolean z4) {
        if (bVar instanceof InterfaceC34385a.b.C42432b) {
            InterfaceC34385a.b.C42432b c42432b = (InterfaceC34385a.b.C42432b) bVar;
            return new InterfaceC34385a.b.C42432b(c42432b.getException(), c42432b.getErrorMessage(), z4);
        }
        if (bVar instanceof InterfaceC34385a.b.a.C42431a) {
            InterfaceC34385a.b.a.C42431a c42431a = (InterfaceC34385a.b.a.C42431a) bVar;
            return new InterfaceC34385a.b.a.C42431a(c42431a.getException(), c42431a.getErrorMessage(), c42431a.getErrorCode(), z4);
        }
        if (!(bVar instanceof InterfaceC34385a.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.b.a aVar = (InterfaceC34385a.b.a) bVar;
        return new InterfaceC34385a.b.a(aVar.getException(), aVar.getErrorMessage(), aVar.getErrorCode(), z4);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ InterfaceC34385a.b m108744i(InterfaceC34385a.b bVar, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = bVar.getHandled();
        }
        return m108743h(bVar, z4);
    }
}
