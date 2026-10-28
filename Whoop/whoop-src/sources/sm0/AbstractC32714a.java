package sm0;

import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.Set;
import l83.C23454a0;
import m83.C25235a0;
import nm0.C26832c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import z02.InterfaceC39944a;

/* JADX INFO: renamed from: sm0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0001\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"RequestT", "Lec3/l;", "Lz02/a;", "", "", "scopes", "uri", "Lnm0/c;", "a", "(Lec3/l;Ljava/util/Set;Ljava/lang/String;)Lec3/l;", "cache_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32714a {

    /* JADX INFO: renamed from: sm0.a$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f135997w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Set f135998x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f135999y;

        /* JADX INFO: renamed from: sm0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42328a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f136000w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Set f136001x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f136002y;

            /* JADX INFO: renamed from: sm0.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.cache.flow.CachedAPISourceFlowKt$cacheRequests$$inlined$map$1$2", m100430f = "CachedAPISourceFlow.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42329a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f136003E;

                /* JADX INFO: renamed from: F */
                Object f136004F;

                /* JADX INFO: renamed from: G */
                Object f136005G;

                /* JADX INFO: renamed from: H */
                int f136006H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f136007w;

                /* JADX INFO: renamed from: x */
                int f136008x;

                /* JADX INFO: renamed from: y */
                Object f136009y;

                public C42329a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f136007w = obj;
                    this.f136008x |= Integer.MIN_VALUE;
                    return C42328a.this.emit(null, this);
                }
            }

            public C42328a(InterfaceC13062m interfaceC13062m, Set set, String str) {
                this.f136000w = interfaceC13062m;
                this.f136001x = set;
                this.f136002y = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42329a c42329a;
                if (interfaceC30057d instanceof C42329a) {
                    c42329a = (C42329a) interfaceC30057d;
                    int i13 = c42329a.f136008x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42329a.f136008x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42329a = new C42329a(interfaceC30057d);
                    }
                } else {
                    c42329a = new C42329a(interfaceC30057d);
                }
                Object obj2 = c42329a.f136007w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42329a.f136008x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f136000w;
                    C26832c c26832c = new C26832c((InterfaceC39944a) obj, this.f136001x, this.f136002y);
                    c42329a.f136009y = null;
                    c42329a.f136003E = null;
                    c42329a.f136004F = null;
                    c42329a.f136005G = null;
                    c42329a.f136006H = 0;
                    c42329a.f136008x = 1;
                    if (interfaceC13062m.emit(c26832c, c42329a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l, Set set, String str) {
            this.f135997w = interfaceC13058l;
            this.f135998x = set;
            this.f135999y = str;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f135997w.collect(new C42328a(interfaceC13062m, this.f135998x, this.f135999y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <RequestT> InterfaceC13058l m102669a(InterfaceC13058l interfaceC13058l, Set<String> scopes, String str) {
        AbstractC22676k.m65750j(interfaceC13058l, "<this>");
        AbstractC22676k.m65750j(scopes, "scopes");
        return new a(interfaceC13058l, scopes, str);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC13058l m102670b(InterfaceC13058l interfaceC13058l, Set set, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            set = C25235a0.f99113w;
        }
        if ((i13 & 2) != 0) {
            str = null;
        }
        return m102669a(interfaceC13058l, set, str);
    }
}
