package rt1;

import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pt1.C29512b;
import pt1.InterfaceC29513c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rs1.AbstractC31789a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: rt1.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lrt1/i;", "", "<init>", "()V", "Lec3/l;", "Lpt1/b;", "upstream", "Lrt1/h;", "a", "(Lec3/l;)Lec3/l;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31811i {

    /* JADX INFO: renamed from: rt1.i$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f131806w;

        /* JADX INFO: renamed from: rt1.i$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f131807w;

            /* JADX INFO: renamed from: rt1.i$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.reading.presentation.LabradorReadingViewStateReducer$reduce$$inlined$map$1$2", m100430f = "LabradorReadingViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42294a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f131808E;

                /* JADX INFO: renamed from: F */
                Object f131809F;

                /* JADX INFO: renamed from: G */
                Object f131810G;

                /* JADX INFO: renamed from: H */
                int f131811H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f131812w;

                /* JADX INFO: renamed from: x */
                int f131813x;

                /* JADX INFO: renamed from: y */
                Object f131814y;

                public C42294a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f131812w = obj;
                    this.f131813x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f131807w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42294a c42294a;
                Object objM98859c;
                if (interfaceC30057d instanceof C42294a) {
                    c42294a = (C42294a) interfaceC30057d;
                    int i13 = c42294a.f131813x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42294a.f131813x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42294a = new C42294a(interfaceC30057d);
                    }
                } else {
                    c42294a = new C42294a(interfaceC30057d);
                }
                Object obj2 = c42294a.f131812w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42294a.f131813x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f131807w;
                    C29512b c29512b = (C29512b) obj;
                    InterfaceC29513c readingDomainStateType = c29512b.getReadingDomainStateType();
                    if (readingDomainStateType instanceof InterfaceC29513c.g) {
                        InterfaceC31810h.b.Companion companion = InterfaceC31810h.b.INSTANCE;
                        objM98859c = InterfaceC31810h.b.m98839i(companion.m98857a(), null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, C31803a.m98794b(companion.m98857a().getCalibration(), c29512b.getIsCalibrating(), null, null, 6, null), 131071, null);
                    } else if (readingDomainStateType instanceof InterfaceC29513c.e) {
                        objM98859c = InterfaceC31810h.b.m98839i(InterfaceC31810h.b.INSTANCE.m98860d(), null, null, null, null, null, null, null, false, false, false, null, null, AbstractC31789a.m98726b(((InterfaceC29513c.e) c29512b.getReadingDomainStateType()).getLabradorReadingStatus().m33462g0()), C31807e.INSTANCE.m98810a(((InterfaceC29513c.e) c29512b.getReadingDomainStateType()).getLabradorReadingStatus().m33463h0()), null, ((InterfaceC29513c.e) c29512b.getReadingDomainStateType()).m90171d(), false, null, 217087, null);
                    } else if (readingDomainStateType instanceof InterfaceC29513c.h) {
                        objM98859c = InterfaceC31810h.b.m98839i(InterfaceC31810h.b.INSTANCE.m98862f(), null, null, null, null, null, null, null, false, false, false, null, null, AbstractC31789a.m98726b(((InterfaceC29513c.h) c29512b.getReadingDomainStateType()).getLabradorReadingStatus().m33462g0()), C31807e.INSTANCE.m98810a(((InterfaceC29513c.h) c29512b.getReadingDomainStateType()).getLabradorReadingStatus().m33463h0()), null, null, false, null, 249855, null);
                    } else if (readingDomainStateType instanceof InterfaceC29513c.b) {
                        objM98859c = InterfaceC31810h.b.m98839i(InterfaceC31810h.b.INSTANCE.m98858b(), null, null, null, null, null, null, null, false, false, false, null, null, AbstractC31789a.m98726b(((InterfaceC29513c.b) c29512b.getReadingDomainStateType()).getLabradorReadingStatus().m33461f0()), null, new C31813k(((InterfaceC29513c.b) c29512b.getReadingDomainStateType()).getCompleteTimeStamp(), null, 2, null), ((InterfaceC29513c.b) c29512b.getReadingDomainStateType()).m90167c(), false, null, 200703, null);
                    } else if (readingDomainStateType instanceof InterfaceC29513c.a) {
                        objM98859c = InterfaceC31810h.a.m98820d(InterfaceC31810h.a.INSTANCE.m98830a(), null, null, null, null, null, null, InterfaceC31804b.b.f131722a, false, 191, null);
                    } else if ((readingDomainStateType instanceof InterfaceC29513c.c) || AbstractC22676k.m65745e(readingDomainStateType, InterfaceC29513c.d.f120045a)) {
                        objM98859c = InterfaceC31810h.b.INSTANCE.m98859c();
                    } else if (readingDomainStateType instanceof InterfaceC29513c.i) {
                        objM98859c = InterfaceC31810h.b.INSTANCE.m98863g();
                    } else if (readingDomainStateType instanceof InterfaceC29513c.j) {
                        objM98859c = InterfaceC31810h.a.m98820d(InterfaceC31810h.a.INSTANCE.m98831b(), null, null, null, InterfaceC31804b.b.f131722a, null, null, null, true, 119, null);
                    } else {
                        objM98859c = readingDomainStateType instanceof InterfaceC29513c.f ? InterfaceC31810h.b.INSTANCE.m98861e() : InterfaceC31810h.b.INSTANCE.m98857a();
                    }
                    c42294a.f131814y = null;
                    c42294a.f131808E = null;
                    c42294a.f131809F = null;
                    c42294a.f131810G = null;
                    c42294a.f131811H = 0;
                    c42294a.f131813x = 1;
                    if (interfaceC13062m.emit(objM98859c, c42294a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f131806w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f131806w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m98864a(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new b(upstream);
    }
}
