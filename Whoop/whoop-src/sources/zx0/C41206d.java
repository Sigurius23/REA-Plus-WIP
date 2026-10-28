package zx0;

import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.deepdive.domain.GetDeepDiveRequest;
import com.whoop.deepdive.domain.models.DeepDiveModels;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import hf1.InterfaceC17235b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import lf1.C23998h;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25260n;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tu1.C34188a;

/* JADX INFO: renamed from: zx0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u0003*\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lzx0/d;", "Lod1/g;", "Lzx0/b;", "Lzx0/c;", "Lnm0/e;", "cachedApiSource", "Lhf1/b;", "experimentsChecker", "<init>", "(Lnm0/e;Lhf1/b;)V", "Ltu1/a;", "state", "g", "(Lzx0/c;Ltu1/a;)Lzx0/c;", "", "pillar", HttpHeaders.DATE, "", "manualRefresh", "Lec3/l;", "j", "(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/deepdive/domain/models/DeepDiveModels;", "cacheResult", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lpm0/a$c;Ljava/lang/String;Ljava/lang/String;)Lzx0/c;", "i", "(Lq83/d;)Ljava/lang/Object;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lhf1/b;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41206d implements InterfaceC27844g<AbstractC41204b, C41205c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC17235b experimentsChecker;

    /* JADX INFO: renamed from: zx0.d$a */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.deepdive.domain.DeepDiveInteractor$interact$$inlined$flatMapLatest$1", m100430f = "DeepDiveInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f177792w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f177793x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f177794y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C41206d f177795z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C41206d c41206d) {
            super(3, interfaceC30057d);
            this.f177795z = c41206d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC41204b abstractC41204b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f177795z);
            aVar.f177793x = interfaceC13062m;
            aVar.f177794y = abstractC41204b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f177792w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f177793x;
                AbstractC41204b abstractC41204b = (AbstractC41204b) this.f177794y;
                if (abstractC41204b instanceof AbstractC41204b.b) {
                    AbstractC41204b.b bVar = (AbstractC41204b.b) abstractC41204b;
                    c13084s1 = AbstractC13091v.m36590P(this.f177795z.m133860j(bVar.getPillar(), bVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), bVar.getManualRefresh()), new e(null, abstractC41204b));
                } else {
                    c13084s1 = new C13084s1(new c(abstractC41204b, null));
                }
                this.f177793x = null;
                this.f177794y = null;
                this.f177792w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC41204b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: zx0.d$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.deepdive.domain.DeepDiveInteractor$interact$1$1$1", m100430f = "DeepDiveInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lzx0/b$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f177796w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f177797x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC41204b f177798y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C41205c f177799z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC41204b abstractC41204b, C41205c c41205c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f177798y = abstractC41204b;
            this.f177799z = c41205c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f177798y, this.f177799z, interfaceC30057d);
            bVar.f177797x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f177797x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f177796w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC41204b.b bVar = new AbstractC41204b.b(((AbstractC41204b.b) this.f177798y).getPillar(), ((AbstractC41204b.b) this.f177798y).getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), this.f177799z, ((AbstractC41204b.b) this.f177798y).getManualRefresh());
                this.f177797x = null;
                this.f177796w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: zx0.d$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.deepdive.domain.DeepDiveInteractor$interact$1$2", m100430f = "DeepDiveInteractor.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lzx0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f177800w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f177801x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC41204b f177802y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC41204b abstractC41204b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f177802y = abstractC41204b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f177802y, interfaceC30057d);
            cVar.f177801x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f177801x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f177800w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC41204b abstractC41204b = this.f177802y;
                this.f177801x = null;
                this.f177800w = 1;
                if (interfaceC13062m.emit(abstractC41204b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: zx0.d$d */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.deepdive.domain.DeepDiveInteractor$interact$2", m100430f = "DeepDiveInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lzx0/c;", "previousState", "Lzx0/b;", "action", "<anonymous>", "(Lzx0/c;Lzx0/b;)Lzx0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f177803w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f177804x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f177805y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C41205c c41205c, AbstractC41204b abstractC41204b, InterfaceC30057d<? super C41205c> interfaceC30057d) {
            d dVar = C41206d.this.new d(interfaceC30057d);
            dVar.f177804x = c41205c;
            dVar.f177805y = abstractC41204b;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C41205c c41205c = (C41205c) this.f177804x;
            AbstractC41204b abstractC41204b = (AbstractC41204b) this.f177805y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f177803w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC41204b instanceof AbstractC41204b.b) {
                C41205c domainState = ((AbstractC41204b.b) abstractC41204b).getDomainState();
                return domainState == null ? c41205c : domainState;
            }
            if (abstractC41204b instanceof AbstractC41204b.a) {
                return C41206d.this.m133857g(c41205c, ((AbstractC41204b.a) abstractC41204b).getState());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: zx0.d$e */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.deepdive.domain.DeepDiveInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "DeepDiveInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f177807w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f177808x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f177809y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC41204b f177810z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, AbstractC41204b abstractC41204b) {
            super(3, interfaceC30057d);
            this.f177810z = abstractC41204b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C41205c c41205c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f177810z);
            eVar.f177808x = interfaceC13062m;
            eVar.f177809y = c41205c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f177807w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f177808x;
                C13084s1 c13084s1 = new C13084s1(new b(this.f177810z, (C41205c) this.f177809y, null));
                this.f177808x = null;
                this.f177809y = null;
                this.f177807w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C41205c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: zx0.d$f */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.deepdive.domain.DeepDiveInteractor", m100430f = "DeepDiveInteractor.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "isInHomeCalibrationExperimentTestGroup", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f177811w;

        /* JADX INFO: renamed from: y */
        int f177813y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f177811w = obj;
            this.f177813y |= Integer.MIN_VALUE;
            return C41206d.this.m133859i(this);
        }
    }

    /* JADX INFO: renamed from: zx0.d$g */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.deepdive.domain.DeepDiveInteractor$loadDeepDiveCache$$inlined$cacheAPI$1", m100430f = "DeepDiveInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f177814w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f177815x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f177816y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f177817z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f177817z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f177817z);
            gVar.f177815x = interfaceC13062m;
            gVar.f177816y = c26832c;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f177814w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f177815x;
                C26832c c26832c = (C26832c) this.f177816y;
                InterfaceC26834e interfaceC26834e = this.f177817z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(DeepDiveModels.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(DeepDiveModels.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f177815x = null;
                this.f177816y = null;
                this.f177814w = 1;
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

    /* JADX INFO: renamed from: zx0.d$h */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f177818E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f177819w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f177820x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C41206d f177821y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f177822z;

        /* JADX INFO: renamed from: zx0.d$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ String f177823E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f177824w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f177825x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C41206d f177826y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f177827z;

            /* JADX INFO: renamed from: zx0.d$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.deepdive.domain.DeepDiveInteractor$loadDeepDiveCache$$inlined$map$1$2", m100430f = "DeepDiveInteractor.kt", m100431l = {56, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42779a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f177828E;

                /* JADX INFO: renamed from: F */
                Object f177829F;

                /* JADX INFO: renamed from: G */
                Object f177830G;

                /* JADX INFO: renamed from: H */
                Object f177831H;

                /* JADX INFO: renamed from: I */
                Object f177832I;

                /* JADX INFO: renamed from: J */
                Object f177833J;

                /* JADX INFO: renamed from: K */
                Object f177834K;

                /* JADX INFO: renamed from: L */
                int f177835L;

                /* JADX INFO: renamed from: M */
                int f177836M;

                /* JADX INFO: renamed from: N */
                int f177837N;

                /* JADX INFO: renamed from: O */
                int f177838O;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f177839w;

                /* JADX INFO: renamed from: x */
                int f177840x;

                /* JADX INFO: renamed from: y */
                Object f177841y;

                public C42779a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f177839w = obj;
                    this.f177840x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, boolean z4, C41206d c41206d, String str, String str2) {
                this.f177824w = interfaceC13062m;
                this.f177825x = z4;
                this.f177826y = c41206d;
                this.f177827z = str;
                this.f177823E = str2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x0143, code lost:
            
                if (r12.emit(r13, r2) == r3) goto L45;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r22, q83.InterfaceC30057d r23) {
                /*
                    Method dump skipped, instruction units count: 335
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: zx0.C41206d.h.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public h(InterfaceC13058l interfaceC13058l, boolean z4, C41206d c41206d, String str, String str2) {
            this.f177819w = interfaceC13058l;
            this.f177820x = z4;
            this.f177821y = c41206d;
            this.f177822z = str;
            this.f177818E = str2;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f177819w.collect(new a(interfaceC13062m, this.f177820x, this.f177821y, this.f177822z, this.f177818E), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C41206d(InterfaceC26834e cachedApiSource, InterfaceC17235b experimentsChecker) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(experimentsChecker, "experimentsChecker");
        this.cachedApiSource = cachedApiSource;
        this.experimentsChecker = experimentsChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final C41205c m133857g(C41205c c41205c, C34188a c34188a) {
        return C41205c.m133848b(c41205c, new InterfaceC41203a.b(c34188a), null, false, false, false, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final C41205c m133858h(InterfaceC29354a.c<DeepDiveModels> cacheResult, String pillar, String date) {
        return AbstractC29355b.m89462a(cacheResult) ? new C41205c(new InterfaceC41203a.f(pillar, date), null, false, false, false, 30, null) : new C41205c(new InterfaceC41203a.e(pillar, date), null, false, false, false, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m133859i(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f177813y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f177813y = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object objMo48746f = fVar.f177811w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar.f177813y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo48746f);
            InterfaceC17235b interfaceC17235b = this.experimentsChecker;
            C23998h c23998h = new C23998h(null, null, null, null, 15, null);
            fVar.f177813y = 1;
            objMo48746f = interfaceC17235b.mo48746f(c23998h, fVar);
            if (objMo48746f == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo48746f);
        }
        return Boolean.valueOf(AbstractC22676k.m65745e((String) objMo48746f, "test"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m133860j(String pillar, String date, boolean manualRefresh) {
        return new h(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetDeepDiveRequest(pillar, date), 1), AbstractC25260n.m74059b1(new String[]{"home", SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE}), null, 2, null), new g(null, this.cachedApiSource)), manualRefresh, this, pillar, date);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C41205c(InterfaceC41203a.d.f177774a, null, false, false, false, 30, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new d(null));
    }
}
