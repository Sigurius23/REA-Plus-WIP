package qm0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.lang.reflect.Type;
import l83.C23454a0;
import ne3.C26616h;
import ne3.C26624l;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u82.InterfaceC34640a;
import va3.AbstractC35854l;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: qm0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lqm0/a;", "", "Lu82/a;", "bffCacheDeserializer", "Lq83/j;", "ioDispatcher", "<init>", "(Lu82/a;Lq83/j;)V", "T", "Lne3/l;", "byteString", "Ljava/lang/reflect/Type;", "type", "b", "(Lne3/l;Ljava/lang/reflect/Type;Lq83/d;)Ljava/lang/Object;", "a", "Lu82/a;", "Lq83/j;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30478a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34640a bffCacheDeserializer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC30063j ioDispatcher;

    /* JADX INFO: renamed from: qm0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.decoder.CacheDecoder$deserialize$2", m100430f = "CacheDecoder.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m65681d2 = {"T", "Lbc3/c0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125240w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26624l f125241x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C30478a f125242y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Type f125243z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C26624l c26624l, C30478a c30478a, Type type, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f125241x = c26624l;
            this.f125242y = c30478a;
            this.f125243z = type;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f125241x, this.f125242y, this.f125243z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super T> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f125240w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C26616h c26616h = new C26616h();
            C26624l c26624l = this.f125241x;
            C30478a c30478a = this.f125242y;
            Type type = this.f125243z;
            try {
                c26616h.m79217l1(c26624l);
                return c30478a.bffCacheDeserializer.mo109477a(c26616h.mo79183H0(AbstractC39397a.f169546a), type);
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(c26616h, th3);
                    throw th4;
                }
            }
        }
    }

    public C30478a(InterfaceC34640a bffCacheDeserializer, InterfaceC30063j ioDispatcher) {
        AbstractC22676k.m65750j(bffCacheDeserializer, "bffCacheDeserializer");
        AbstractC22676k.m65750j(ioDispatcher, "ioDispatcher");
        this.bffCacheDeserializer = bffCacheDeserializer;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX INFO: renamed from: b */
    public final <T> Object m93288b(C26624l c26624l, Type type, InterfaceC30057d<? super T> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.ioDispatcher, new a(c26624l, this, type, null), interfaceC30057d);
    }
}
