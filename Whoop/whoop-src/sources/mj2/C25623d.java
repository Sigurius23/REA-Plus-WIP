package mj2;

import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.stress.domain.model.DisclaimerScreen;
import com.whoop.stress.domain.model.StressAdditionalInstruction;
import com.whoop.stress.domain.model.StressCustomization;
import com.whoop.stress.domain.model.StressCustomizationDisplay;
import com.whoop.stress.domain.model.StressCustomizationDrawer;
import com.whoop.stress.domain.model.StressCustomizationOptions;
import com.whoop.stress.domain.model.StressCustomizationPicker;
import com.whoop.stress.domain.model.StressDuration;
import com.whoop.stress.domain.model.StressIntervention;
import com.whoop.stress.domain.model.StressSession;
import d41.C11682h;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import nj2.AbstractC26755b;
import nj2.AbstractC26771r;
import nj2.C26760g;
import nj2.C26761h;
import nj2.C26770q;
import nj2.C26773t;
import nj2.EnumC26772s;
import oj2.C27980a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.C35666g;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: mj2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\n¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lmj2/d;", "", "Loj2/a;", "breathingAnimationHelper", "<init>", "(Loj2/a;)V", "Lcom/whoop/stress/domain/model/StressIntervention;", "intervention", "", "totalRounds", "Lec3/l;", "Lnj2/t;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/stress/domain/model/StressIntervention;I)Lec3/l;", "Lcom/whoop/stress/domain/model/StressSession;", "session", "g", "(Lcom/whoop/stress/domain/model/StressSession;)Lec3/l;", "Lcom/whoop/stress/domain/model/StressCustomizationOptions;", "options", "Lnj2/b;", "e", "(Lcom/whoop/stress/domain/model/StressCustomizationOptions;)Lnj2/b;", "Lnj2/r;", "upstream", "f", "(Lec3/l;)Lec3/l;", "a", "Loj2/a;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25623d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27980a breathingAnimationHelper;

    /* JADX INFO: renamed from: mj2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.reducer.StressSessionViewStateReducer$reduce$$inlined$flatMapLatest$1", m100430f = "StressSessionViewStateReducer.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f100532w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f100533x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f100534y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25623d f100535z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C25623d c25623d) {
            super(3, interfaceC30057d);
            this.f100535z = c25623d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC26771r abstractC26771r, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f100535z);
            aVar.f100533x = interfaceC13062m;
            aVar.f100534y = abstractC26771r;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13084s1 c13084s1;
            InterfaceC13058l interfaceC13058lM84412n;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100532w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f100533x;
                AbstractC26771r abstractC26771r = (AbstractC26771r) this.f100534y;
                if (abstractC26771r instanceof AbstractC26771r.d) {
                    interfaceC13058lM84412n = this.f100535z.m75385g(((AbstractC26771r.d) abstractC26771r).getSession());
                } else if (abstractC26771r instanceof AbstractC26771r.f) {
                    AbstractC26771r.f fVar = (AbstractC26771r.f) abstractC26771r;
                    StressIntervention stressInterventionM79776b = fVar.getIntervention();
                    if (stressInterventionM79776b == null || (interfaceC13058lM84412n = this.f100535z.m75386h(stressInterventionM79776b, fVar.getTotalRounds())) == null) {
                        c13084s1 = new C13084s1(new b(null));
                        interfaceC13058lM84412n = c13084s1;
                    }
                } else {
                    if (abstractC26771r instanceof AbstractC26771r.g) {
                        AbstractC26771r.g gVar = (AbstractC26771r.g) abstractC26771r;
                        StressIntervention stressInterventionM79778a = gVar.getIntervention();
                        if (stressInterventionM79778a == null || (interfaceC13058lM84412n = this.f100535z.breathingAnimationHelper.m84412n(stressInterventionM79778a, gVar.getTotalRounds())) == null) {
                            c13084s1 = new C13084s1(new c(null));
                        }
                    } else if (AbstractC22676k.m65745e(abstractC26771r, AbstractC26771r.b.f106624a)) {
                        c13084s1 = new C13084s1(new d(null));
                    } else if (AbstractC22676k.m65745e(abstractC26771r, AbstractC26771r.a.f106623a)) {
                        c13084s1 = new C13084s1(new e(null));
                    } else if (AbstractC22676k.m65745e(abstractC26771r, AbstractC26771r.e.f106627a)) {
                        c13084s1 = new C13084s1(new f(null));
                    } else {
                        if (!AbstractC22676k.m65745e(abstractC26771r, AbstractC26771r.c.f106625a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c13084s1 = new C13084s1(new g(null));
                    }
                    interfaceC13058lM84412n = c13084s1;
                }
                this.f100533x = null;
                this.f100534y = null;
                this.f100532w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM84412n, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC26771r) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: mj2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.reducer.StressSessionViewStateReducer$reduce$1$2", m100430f = "StressSessionViewStateReducer.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnj2/t;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100536w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f100537x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f100537x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f100537x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100536w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C26773t c26773t = new C26773t(false, true, null, null, null, null, null, 125, null);
                this.f100537x = null;
                this.f100536w = 1;
                if (interfaceC13062m.emit(c26773t, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mj2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.reducer.StressSessionViewStateReducer$reduce$1$4", m100430f = "StressSessionViewStateReducer.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnj2/t;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100538w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f100539x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f100539x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f100539x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100538w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C26773t c26773t = new C26773t(false, true, null, null, null, null, null, 125, null);
                this.f100539x = null;
                this.f100538w = 1;
                if (interfaceC13062m.emit(c26773t, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mj2.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.reducer.StressSessionViewStateReducer$reduce$1$5", m100430f = "StressSessionViewStateReducer.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnj2/t;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100540w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f100541x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f100541x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f100541x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100540w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C26773t c26773t = new C26773t(false, false, null, null, EnumC26772s.SAVING, null, null, 111, null);
                this.f100541x = null;
                this.f100540w = 1;
                if (interfaceC13062m.emit(c26773t, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mj2.d$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.reducer.StressSessionViewStateReducer$reduce$1$6", m100430f = "StressSessionViewStateReducer.kt", m100431l = {41}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnj2/t;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100542w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f100543x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f100543x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f100543x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100542w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C26773t c26773t = new C26773t(false, false, null, null, EnumC26772s.SAVED, null, null, 111, null);
                this.f100543x = null;
                this.f100542w = 1;
                if (interfaceC13062m.emit(c26773t, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mj2.d$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.reducer.StressSessionViewStateReducer$reduce$1$7", m100430f = "StressSessionViewStateReducer.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnj2/t;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100544w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f100545x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f100545x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f100545x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100544w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C26773t c26773t = new C26773t(false, false, null, null, EnumC26772s.ERROR, null, null, 111, null);
                this.f100545x = null;
                this.f100544w = 1;
                if (interfaceC13062m.emit(c26773t, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mj2.d$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.reducer.StressSessionViewStateReducer$reduce$1$8", m100430f = "StressSessionViewStateReducer.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnj2/t;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100546w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f100547x;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(interfaceC30057d);
            gVar.f100547x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f100547x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100546w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C26773t c26773t = new C26773t(false, true, null, null, null, null, null, 125, null);
                this.f100547x = null;
                this.f100546w = 1;
                if (interfaceC13062m.emit(c26773t, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mj2.d$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.reducer.StressSessionViewStateReducer$refresh$1", m100430f = "StressSessionViewStateReducer.kt", m100431l = {64}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnj2/t;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f100548E;

        /* JADX INFO: renamed from: F */
        int f100549F;

        /* JADX INFO: renamed from: G */
        int f100550G;

        /* JADX INFO: renamed from: H */
        private /* synthetic */ Object f100551H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ StressSession f100552I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ C25623d f100553J;

        /* JADX INFO: renamed from: w */
        Object f100554w;

        /* JADX INFO: renamed from: x */
        Object f100555x;

        /* JADX INFO: renamed from: y */
        Object f100556y;

        /* JADX INFO: renamed from: z */
        Object f100557z;

        /* JADX INFO: renamed from: mj2.d$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function1 {
            @Override // p715kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC25312u invoke(InterfaceC25312u it) {
                AbstractC22676k.m65750j(it, "it");
                return C11682h.m31135b((C11682h) it, null, null, null, null, false, 31, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(StressSession stressSession, C25623d c25623d, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f100552I = stressSession;
            this.f100553J = c25623d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m75389h(C21536b c21536b) {
            c21536b.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11682h.class), new a());
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f100552I, this.f100553J, interfaceC30057d);
            hVar.f100551H = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            StressCustomizationOptions speed;
            StressCustomizationOptions cycle;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f100551H;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100550G;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                StressSession stressSession = this.f100552I;
                C25623d c25623d = this.f100553J;
                InterfaceC25312u interfaceC25312uM60541h = AbstractC21537c.m60554d(new C25624e(0)).m60541h(stressSession.getInstruction().getVideo());
                C11682h c11682h = interfaceC25312uM60541h instanceof C11682h ? (C11682h) interfaceC25312uM60541h : null;
                StressCustomization customization = stressSession.getCustomization();
                AbstractC26755b abstractC26755bM75384e = (customization == null || (cycle = customization.getCycle()) == null) ? null : c25623d.m75384e(cycle);
                StressCustomization customization2 = stressSession.getCustomization();
                AbstractC26755b abstractC26755bM75384e2 = (customization2 == null || (speed = customization2.getSpeed()) == null) ? null : c25623d.m75384e(speed);
                String backgroundImageUrl = stressSession.getBackgroundImageUrl();
                TextResource textResourceM21278l = AbstractC8693b.m21278l(stressSession.getTitle());
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(stressSession.getDescriptionDisplay());
                StressDuration duration = stressSession.getDuration();
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(duration != null ? duration.getTitle() : null);
                StressDuration duration2 = stressSession.getDuration();
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(duration2 != null ? duration2.getSuffix() : null);
                StressDuration duration3 = stressSession.getDuration();
                TextResource textResourceM21278l5 = AbstractC8693b.m21278l(duration3 != null ? duration3.getSubtitle() : null);
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(stressSession.getInstruction().getTitle());
                TextResource textResourceM21278l7 = AbstractC8693b.m21278l(stressSession.getInstruction().getDescription());
                List<StressAdditionalInstruction> additionalInstructions = stressSession.getInstruction().getAdditionalInstructions();
                if (additionalInstructions != null) {
                    List<StressAdditionalInstruction> list = additionalInstructions;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                    for (StressAdditionalInstruction stressAdditionalInstruction : list) {
                        arrayList.add(new C26760g(AbstractC8693b.m21278l(stressAdditionalInstruction.getTitle()), AbstractC8693b.m21278l(stressAdditionalInstruction.getDescription()), null, 4, null));
                    }
                } else {
                    arrayList = null;
                }
                C26770q c26770q = new C26770q(backgroundImageUrl, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, textResourceM21278l5, new C26760g(textResourceM21278l6, textResourceM21278l7, arrayList), c11682h, AbstractC8693b.m21278l(stressSession.getButtonDisplay()), abstractC26755bM75384e2, abstractC26755bM75384e);
                DisclaimerScreen disclaimerScreen = stressSession.getIntervention().getDisclaimerScreen();
                C26773t c26773t = new C26773t(false, false, c26770q, null, null, disclaimerScreen != null ? new C26761h(AbstractC8693b.m21278l(disclaimerScreen.getNavigationTitle()), new AbstractC22403o.c(disclaimerScreen.getImageUrl(), 0, 0, 0, 14, null), AbstractC8693b.m21278l(disclaimerScreen.getTitle()), AbstractC8693b.m21278l(disclaimerScreen.getAlert()), AbstractC8693b.m21278l(disclaimerScreen.getDescription()), AbstractC8693b.m21278l(disclaimerScreen.getButton())) : null, null, 82, null);
                this.f100551H = null;
                this.f100554w = null;
                this.f100555x = null;
                this.f100556y = null;
                this.f100557z = null;
                this.f100548E = null;
                this.f100549F = 0;
                this.f100550G = 1;
                if (interfaceC13062m.emit(c26773t, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mj2.d$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.reducer.StressSessionViewStateReducer$startNextCycle$1", m100430f = "StressSessionViewStateReducer.kt", m100431l = {51}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnj2/t;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100558w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f100559x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ StressIntervention f100561z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(StressIntervention stressIntervention, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f100561z = stressIntervention;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = C25623d.this.new i(this.f100561z, interfaceC30057d);
            iVar.f100559x = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f100559x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100558w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C26773t c26773tM84411f = C25623d.this.breathingAnimationHelper.m84411f(this.f100561z);
                this.f100559x = null;
                this.f100558w = 1;
                if (interfaceC13062m.emit(c26773tM84411f, this) == enumC31071a) {
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

    public C25623d(C27980a breathingAnimationHelper) {
        AbstractC22676k.m65750j(breathingAnimationHelper, "breathingAnimationHelper");
        this.breathingAnimationHelper = breathingAnimationHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final AbstractC26755b m75384e(StressCustomizationOptions options) {
        String strM31996o;
        StressCustomizationDrawer drawer = options.getDrawer();
        StressCustomizationPicker picker = options.getPicker();
        String currentSelection = options.getCurrentSelection();
        Map<String, StressCustomizationDisplay> mapComponent4 = options.component4();
        StressCustomizationDisplay stressCustomizationDisplay = mapComponent4.get(currentSelection);
        TextResource textResource = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        if (stressCustomizationDisplay != null) {
            int i13 = 2;
            if (drawer != null) {
                C39282o c39282oM125229d = C39282o.Companion.m125229d(C39282o.INSTANCE, AbstractC8693b.m21278l(stressCustomizationDisplay.getTitle()), null, null, null, null, new C39274g(EnumC16313m0.valueOf(stressCustomizationDisplay.getIcon()).toWhoopIcon(), textResource, i13, objArr7 == true ? 1 : 0), null, null, null, null, null, AbstractC8693b.m21278l(stressCustomizationDisplay.getDescription()), AbstractC8693b.m21278l(stressCustomizationDisplay.getSubDescription()), null, false, false, null, false, null, null, null, false, null, 8382430, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(mapComponent4.size()));
                Iterator<T> it = mapComponent4.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), C39282o.Companion.m125229d(C39282o.INSTANCE, AbstractC8693b.m21278l(((StressCustomizationDisplay) entry.getValue()).getTitle()), null, null, null, null, new C39274g(EnumC16313m0.valueOf(((StressCustomizationDisplay) entry.getValue()).getIcon()).toWhoopIcon(), objArr6 == true ? 1 : 0, i13, objArr5 == true ? 1 : 0), null, null, null, null, null, AbstractC8693b.m21278l(((StressCustomizationDisplay) entry.getValue()).getDescription()), AbstractC8693b.m21278l(((StressCustomizationDisplay) entry.getValue()).getSubDescription()), null, false, false, null, false, null, null, null, false, null, 8382430, null));
                }
                return new AbstractC26755b.a(c39282oM125229d, currentSelection, new C35666g(AbstractC8693b.m21278l(drawer.getDrawerTitle()), null, null, null, null, 0.0f, 0.0f, 126, null), linkedHashMap, drawer);
            }
            if (picker != null) {
                C39282o c39282oM125229d2 = C39282o.Companion.m125229d(C39282o.INSTANCE, AbstractC8693b.m21278l(stressCustomizationDisplay.getTitle()), null, null, null, null, new C39274g(EnumC16313m0.valueOf(stressCustomizationDisplay.getIcon()).toWhoopIcon(), objArr4 == true ? 1 : 0, i13, objArr3 == true ? 1 : 0), null, null, null, AbstractC8693b.m21278l(stressCustomizationDisplay.getDescription()), AbstractC8693b.m21278l(stressCustomizationDisplay.getSubDescription()), null, null, null, false, false, null, false, null, null, null, false, null, 8387038, null);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(mapComponent4.size()));
                Iterator<T> it3 = mapComponent4.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it3.next();
                    linkedHashMap2.put(entry2.getKey(), C39282o.Companion.m125229d(C39282o.INSTANCE, AbstractC8693b.m21278l(((StressCustomizationDisplay) entry2.getValue()).getTitle()), null, null, null, null, new C39274g(EnumC16313m0.valueOf(((StressCustomizationDisplay) entry2.getValue()).getIcon()).toWhoopIcon(), objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0), null, null, null, AbstractC8693b.m21278l(((StressCustomizationDisplay) entry2.getValue()).getDescription()), AbstractC8693b.m21278l(((StressCustomizationDisplay) entry2.getValue()).getSubDescription()), null, null, null, false, false, null, false, null, null, null, false, null, 8387038, null));
                }
                String suffix = picker.getSuffix();
                if (suffix == null || (strM31996o = AbstractC11895b.m31996o(" (", suffix, ")")) == null) {
                    strM31996o = "";
                }
                return new AbstractC26755b.b(c39282oM125229d2, currentSelection, new C35666g(AbstractC8693b.m21278l(AbstractC2875y.m8299l(picker.getPickerTitle(), strM31996o)), null, null, null, null, 0.0f, 0.0f, 126, null), linkedHashMap2, picker);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m75385g(StressSession session) {
        return new C13084s1(new h(session, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m75386h(StressIntervention intervention, int totalRounds) {
        return intervention.getRepeatCount() <= 0 ? new C13084s1(new i(intervention, null)) : this.breathingAnimationHelper.m84412n(intervention, totalRounds);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m75387f(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }
}
