package ca2;

import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import ts0.EnumC34138c;
import ts0.InterfaceC34136a;
import ts0.InterfaceC34139d;

/* JADX INFO: renamed from: ca2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lca2/j;", "Lts0/a;", "Lca2/f;", "historySyncRouter", "<init>", "(Lca2/f;)V", "Lts0/d;", "request", "Lec3/l;", "Lts0/c;", "a", "(Lts0/d;)Lec3/l;", "Lca2/f;", "b", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4370j implements InterfaceC34136a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4366f historySyncRouter;

    /* JADX INFO: renamed from: ca2.j$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f17693w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC34139d f17694x;

        /* JADX INFO: renamed from: ca2.j$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f17695w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC34139d f17696x;

            /* JADX INFO: renamed from: ca2.j$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.service.sync.StrapSyncServiceImpl$startStrapAndAppSync$$inlined$filter$1$2", m100430f = "StrapSyncServiceImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41336a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f17698F;

                /* JADX INFO: renamed from: G */
                Object f17699G;

                /* JADX INFO: renamed from: H */
                int f17700H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f17701w;

                /* JADX INFO: renamed from: x */
                int f17702x;

                /* JADX INFO: renamed from: y */
                Object f17703y;

                /* JADX INFO: renamed from: z */
                Object f17704z;

                public C41336a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f17701w = obj;
                    this.f17702x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, InterfaceC34139d interfaceC34139d) {
                this.f17695w = interfaceC13062m;
                this.f17696x = interfaceC34139d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41336a c41336a;
                if (interfaceC30057d instanceof C41336a) {
                    c41336a = (C41336a) interfaceC30057d;
                    int i13 = c41336a.f17702x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41336a.f17702x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41336a = new C41336a(interfaceC30057d);
                    }
                } else {
                    c41336a = new C41336a(interfaceC30057d);
                }
                Object obj2 = c41336a.f17701w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41336a.f17702x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f17695w;
                    EnumC34138c enumC34138c = (EnumC34138c) obj;
                    if ((enumC34138c == EnumC34138c.FORCE_SYNC_COMPLETE && AbstractC22676k.m65745e(this.f17696x, InterfaceC34139d.a.f143079a)) || (enumC34138c == EnumC34138c.FULL_SYNC_COMPLETE && AbstractC22676k.m65745e(this.f17696x, InterfaceC34139d.b.f143080a))) {
                        c41336a.f17703y = null;
                        c41336a.f17704z = null;
                        c41336a.f17698F = null;
                        c41336a.f17699G = null;
                        c41336a.f17700H = 0;
                        c41336a.f17702x = 1;
                        if (interfaceC13062m.emit(obj, c41336a) == enumC31071a) {
                            return enumC31071a;
                        }
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

        public b(InterfaceC13058l interfaceC13058l, InterfaceC34139d interfaceC34139d) {
            this.f17693w = interfaceC13058l;
            this.f17694x = interfaceC34139d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f17693w.collect(new a(interfaceC13062m, this.f17694x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C4370j(InterfaceC4366f historySyncRouter) {
        AbstractC22676k.m65750j(historySyncRouter, "historySyncRouter");
        this.historySyncRouter = historySyncRouter;
    }

    @Override // ts0.InterfaceC34136a
    /* JADX INFO: renamed from: a */
    public InterfaceC13058l mo13762a(InterfaceC34139d request) {
        AbstractC22676k.m65750j(request, "request");
        return new b(this.historySyncRouter.mo13757e("StrapAndAppSync"), request);
    }
}
