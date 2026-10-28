package io0;

import com.whoop.clinicianintheloop.api.GetSchedulingConfirmationRequest;
import com.whoop.clinicianintheloop.api.SchedulingConfirmationResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;

/* JADX INFO: renamed from: io0.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lio0/g;", "Lod1/g;", "Lio0/e;", "Lio0/f;", "Lnm0/e;", "cachedApiSource", "<init>", "(Lnm0/e;)V", "", "appointmentId", "Lec3/l;", "Lio0/g$a;", "d", "(Ljava/lang/String;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20720g implements InterfaceC27844g<AbstractC20718e, C20719f> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: io0.g$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lio0/g$a;", "", "<init>", "()V", "c", "b", "a", "Lio0/g$a$a;", "Lio0/g$a$b;", "Lio0/g$a$c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: io0.g$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lio0/g$a$a;", "Lio0/g$a;", "<init>", "()V", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41767a extends a {

            /* JADX INFO: renamed from: a */
            public static final C41767a f77594a = new C41767a();

            private C41767a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: io0.g$a$b */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lio0/g$a$b;", "Lio0/g$a;", "<init>", "()V", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a */
            public static final b f77595a = new b();

            private b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: io0.g$a$c */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio0/g$a$c;", "Lio0/g$a;", "Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;", "data", "<init>", "(Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;", "()Lcom/whoop/clinicianintheloop/api/SchedulingConfirmationResponse;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final SchedulingConfirmationResponse data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SchedulingConfirmationResponse data) {
                super(null);
                AbstractC22676k.m65750j(data, "data");
                this.data = data;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final SchedulingConfirmationResponse getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && AbstractC22676k.m65745e(this.data, ((c) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Success(data=" + this.data + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: io0.g$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianSchedulingConfirmationInteractor$fetchConfirmation$$inlined$cacheAPI$1", m100430f = "ClinicianSchedulingConfirmationInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f77597w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f77598x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f77599y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f77600z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f77600z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f77600z);
            bVar.f77598x = interfaceC13062m;
            bVar.f77599y = c26832c;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f77597w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f77598x;
                C26832c c26832c = (C26832c) this.f77599y;
                InterfaceC26834e interfaceC26834e = this.f77600z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(SchedulingConfirmationResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(SchedulingConfirmationResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f77598x = null;
                this.f77599y = null;
                this.f77597w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: io0.g$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f77601w;

        /* JADX INFO: renamed from: io0.g$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f77602w;

            /* JADX INFO: renamed from: io0.g$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianSchedulingConfirmationInteractor$fetchConfirmation$$inlined$map$1$2", m100430f = "ClinicianSchedulingConfirmationInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41768a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f77603E;

                /* JADX INFO: renamed from: F */
                Object f77604F;

                /* JADX INFO: renamed from: G */
                Object f77605G;

                /* JADX INFO: renamed from: H */
                int f77606H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f77607w;

                /* JADX INFO: renamed from: x */
                int f77608x;

                /* JADX INFO: renamed from: y */
                Object f77609y;

                public C41768a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f77607w = obj;
                    this.f77608x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f77602w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41768a c41768a;
                Object obj2;
                a.c cVar;
                if (interfaceC30057d instanceof C41768a) {
                    c41768a = (C41768a) interfaceC30057d;
                    int i13 = c41768a.f77608x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41768a.f77608x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41768a = new C41768a(interfaceC30057d);
                    }
                } else {
                    c41768a = new C41768a(interfaceC30057d);
                }
                Object obj3 = c41768a.f77607w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41768a.f77608x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj3);
                    InterfaceC13062m interfaceC13062m = this.f77602w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        obj2 = a.b.f77595a;
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            cVar = new a.c((SchedulingConfirmationResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            cVar = new a.c((SchedulingConfirmationResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData());
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            cVar = new a.c((SchedulingConfirmationResponse) ((InterfaceC29354a.d) interfaceC29354a).getData());
                        } else {
                            if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            obj2 = a.C41767a.f77594a;
                        }
                        obj2 = cVar;
                    }
                    c41768a.f77609y = null;
                    c41768a.f77603E = null;
                    c41768a.f77604F = null;
                    c41768a.f77605G = null;
                    c41768a.f77606H = 0;
                    c41768a.f77608x = 1;
                    if (interfaceC13062m.emit(obj2, c41768a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj3);
                }
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC13058l interfaceC13058l) {
            this.f77601w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f77601w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io0.g$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianSchedulingConfirmationInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ClinicianSchedulingConfirmationInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f77611w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f77612x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f77613y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C20720g f77614z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C20720g c20720g) {
            super(3, interfaceC30057d);
            this.f77614z = c20720g;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC20718e abstractC20718e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f77614z);
            dVar.f77612x = interfaceC13062m;
            dVar.f77613y = abstractC20718e;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f77611w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f77612x;
                AbstractC20718e abstractC20718e = (AbstractC20718e) this.f77613y;
                if (!(abstractC20718e instanceof AbstractC20718e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13058l interfaceC13058lM56914d = this.f77614z.m56914d(((AbstractC20718e.a) abstractC20718e).getAppointmentId());
                this.f77612x = null;
                this.f77613y = null;
                this.f77611w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM56914d, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC20718e) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: io0.g$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.domain.ClinicianSchedulingConfirmationInteractor$interact$2", m100430f = "ClinicianSchedulingConfirmationInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lio0/f;", "previousState", "Lio0/g$a;", "internal", "<anonymous>", "(Lio0/f;Lio0/g$a;)Lio0/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f77615w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f77616x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f77617y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C20719f c20719f, a aVar, InterfaceC30057d<? super C20719f> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f77616x = c20719f;
            eVar.f77617y = aVar;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C20719f c20719f = (C20719f) this.f77616x;
            a aVar = (a) this.f77617y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f77615w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(aVar, a.b.f77595a)) {
                return c20719f.m56910a(C20716c.f77588a, null);
            }
            if (aVar instanceof a.c) {
                return c20719f.m56910a(null, ((a.c) aVar).getData());
            }
            if (AbstractC22676k.m65745e(aVar, a.C41767a.f77594a)) {
                return c20719f.m56910a(C20717d.f77589a, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public C20720g(InterfaceC26834e cachedApiSource) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        this.cachedApiSource = cachedApiSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m56914d(String appointmentId) {
        return new c(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetSchedulingConfirmationRequest(appointmentId), 1), AbstractC12350b.m34570S("scheduling-confirmation"), null, 2, null), new b(null, this.cachedApiSource)));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C20719f(null, null, 3, null), AbstractC13091v.m36590P(upstream, new d(null, this)), new e(null));
    }
}
