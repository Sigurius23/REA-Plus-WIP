package dg0;

import c93.InterfaceC4351m;
import com.whoop.advancedlabsjoin.feature.updatetests.domain.GetUpdateTestsRequest;
import com.whoop.advancedlabsjoin.feature.updatetests.domain.models.AdvanceLabsUpdateTestsStickyModel;
import com.whoop.advancedlabsjoin.feature.updatetests.domain.models.UpdateTestsDialogModel;
import com.whoop.advancedlabsjoin.feature.updatetests.domain.models.UpdateTestsModels;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import gg0.InterfaceC15822a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.Map;
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
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.C30698f;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: dg0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u000b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u00032\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0002¢\u0006\u0004\b%\u0010&J#\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"Ldg0/d;", "Lod1/g;", "Ldg0/b;", "Ldg0/c;", "Lnm0/e;", "cachedApiSource", "Lqw2/c;", "actionInteractor", "<init>", "(Lnm0/e;Lqw2/c;)V", "previousState", "action", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ldg0/c;Ldg0/b;)Ldg0/c;", "Ldg0/b$a;", "g", "(Ldg0/c;Ldg0/b$a;)Ldg0/c;", "Lec3/l;", "n", "(Ldg0/b$a;)Lec3/l;", "Lqw2/b;", "actionDomainState", "m", "(Lqw2/b;)Ldg0/c;", "Lcom/whoop/navigation/e;", "", "j", "(Lcom/whoop/navigation/e;)Z", "", "source", "testCount", "manualRefresh", "k", "(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsModels;", "cacheResult", "i", "(Lpm0/a$c;)Ldg0/c;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lqw2/c;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12006d implements InterfaceC27844g<AbstractC12004b, C12005c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: dg0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.updatetests.domain.UpdateTestsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "UpdateTestsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f39614w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39615x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39616y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12006d f39617z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C12006d c12006d) {
            super(3, interfaceC30057d);
            this.f39617z = c12006d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC12004b abstractC12004b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f39617z);
            aVar.f39615x = interfaceC13062m;
            aVar.f39616y = abstractC12004b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0064  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39614w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f39615x;
                AbstractC12004b abstractC12004b = (AbstractC12004b) this.f39616y;
                if (abstractC12004b instanceof AbstractC12004b.c) {
                    AbstractC12004b.c cVar = (AbstractC12004b.c) abstractC12004b;
                    c13084s1 = AbstractC13091v.m36590P(C12006d.m33111l(this.f39617z, cVar.getSource(), cVar.getTestCount(), false, 4, null), new e(null));
                } else if (abstractC12004b instanceof AbstractC12004b.a) {
                    AbstractC12004b.a aVar = (AbstractC12004b.a) abstractC12004b;
                    if (aVar.getCardButtonState().getAction() != null) {
                        c13084s1 = new f(this.f39617z.m33113n(aVar));
                    } else {
                        c13084s1 = new C13084s1(new c(abstractC12004b, null));
                    }
                } else {
                    c13084s1 = new C13084s1(new c(abstractC12004b, null));
                }
                this.f39615x = null;
                this.f39616y = null;
                this.f39614w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC12004b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: dg0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.updatetests.domain.UpdateTestsInteractor$interact$1$internalActionFlow$1$1", m100430f = "UpdateTestsInteractor.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldg0/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f39618w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39619x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C12005c f39620y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C12005c c12005c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f39620y = c12005c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f39620y, interfaceC30057d);
            bVar.f39619x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f39619x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39618w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC12007e.b bVar = new AbstractC12007e.b(this.f39620y);
                this.f39619x = null;
                this.f39618w = 1;
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

    /* JADX INFO: renamed from: dg0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.updatetests.domain.UpdateTestsInteractor$interact$1$internalActionFlow$3", m100430f = "UpdateTestsInteractor.kt", m100431l = {49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldg0/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f39621w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39622x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC12004b f39623y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC12004b abstractC12004b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f39623y = abstractC12004b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f39623y, interfaceC30057d);
            cVar.f39622x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f39622x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39621w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC12007e.c cVar = new AbstractC12007e.c(this.f39623y);
                this.f39622x = null;
                this.f39621w = 1;
                if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: dg0.d$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.updatetests.domain.UpdateTestsInteractor$interact$2", m100430f = "UpdateTestsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ldg0/c;", "previousState", "Ldg0/e;", "action", "<anonymous>", "(Ldg0/c;Ldg0/e;)Ldg0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f39624w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f39625x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39626y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C12005c c12005c, AbstractC12007e abstractC12007e, InterfaceC30057d<? super C12005c> interfaceC30057d) {
            d dVar = C12006d.this.new d(interfaceC30057d);
            dVar.f39625x = c12005c;
            dVar.f39626y = abstractC12007e;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C12005c c12005c = (C12005c) this.f39625x;
            AbstractC12007e abstractC12007e = (AbstractC12007e) this.f39626y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f39624w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC12007e instanceof AbstractC12007e.c) {
                return C12006d.this.m33107h(c12005c, ((AbstractC12007e.c) abstractC12007e).getDomainAction());
            }
            if (abstractC12007e instanceof AbstractC12007e.b) {
                return ((AbstractC12007e.b) abstractC12007e).getDomainState();
            }
            if (abstractC12007e instanceof AbstractC12007e.a) {
                return ((AbstractC12007e.a) abstractC12007e).getDomainState();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: dg0.d$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.updatetests.domain.UpdateTestsInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "UpdateTestsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f39628w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39629x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39630y;

        public e(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C12005c c12005c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f39629x = interfaceC13062m;
            eVar.f39630y = c12005c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39628w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f39629x;
                C13084s1 c13084s1 = new C13084s1(new b((C12005c) this.f39630y, null));
                this.f39629x = null;
                this.f39630y = null;
                this.f39628w = 1;
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
            return invoke((InterfaceC13062m) obj, (C12005c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: dg0.d$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f39631w;

        /* JADX INFO: renamed from: dg0.d$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f39632w;

            /* JADX INFO: renamed from: dg0.d$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.updatetests.domain.UpdateTestsInteractor$interact$lambda$0$$inlined$map$1$2", m100430f = "UpdateTestsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41467a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f39633E;

                /* JADX INFO: renamed from: F */
                Object f39634F;

                /* JADX INFO: renamed from: G */
                Object f39635G;

                /* JADX INFO: renamed from: H */
                int f39636H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f39637w;

                /* JADX INFO: renamed from: x */
                int f39638x;

                /* JADX INFO: renamed from: y */
                Object f39639y;

                public C41467a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f39637w = obj;
                    this.f39638x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f39632w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41467a c41467a;
                if (interfaceC30057d instanceof C41467a) {
                    c41467a = (C41467a) interfaceC30057d;
                    int i13 = c41467a.f39638x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41467a.f39638x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41467a = new C41467a(interfaceC30057d);
                    }
                } else {
                    c41467a = new C41467a(interfaceC30057d);
                }
                Object obj2 = c41467a.f39637w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41467a.f39638x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f39632w;
                    AbstractC12007e.a aVar = new AbstractC12007e.a((C12005c) obj);
                    c41467a.f39639y = null;
                    c41467a.f39633E = null;
                    c41467a.f39634F = null;
                    c41467a.f39635G = null;
                    c41467a.f39636H = 0;
                    c41467a.f39638x = 1;
                    if (interfaceC13062m.emit(aVar, c41467a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l) {
            this.f39631w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f39631w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dg0.d$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.updatetests.domain.UpdateTestsInteractor$loadUpdateTestsCache$$inlined$cacheAPI$1", m100430f = "UpdateTestsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f39641w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f39642x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39643y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f39644z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f39644z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f39644z);
            gVar.f39642x = interfaceC13062m;
            gVar.f39643y = c26832c;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39641w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f39642x;
                C26832c c26832c = (C26832c) this.f39643y;
                InterfaceC26834e interfaceC26834e = this.f39644z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(UpdateTestsModels.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(UpdateTestsModels.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f39642x = null;
                this.f39643y = null;
                this.f39641w = 1;
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

    /* JADX INFO: renamed from: dg0.d$h */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f39645E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f39646w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f39647x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f39648y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12006d f39649z;

        /* JADX INFO: renamed from: dg0.d$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ String f39650E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f39651w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f39652x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ boolean f39653y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C12006d f39654z;

            /* JADX INFO: renamed from: dg0.d$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.updatetests.domain.UpdateTestsInteractor$loadUpdateTestsCache$$inlined$map$1$2", m100430f = "UpdateTestsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41468a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f39655E;

                /* JADX INFO: renamed from: F */
                Object f39656F;

                /* JADX INFO: renamed from: G */
                Object f39657G;

                /* JADX INFO: renamed from: H */
                int f39658H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f39659w;

                /* JADX INFO: renamed from: x */
                int f39660x;

                /* JADX INFO: renamed from: y */
                Object f39661y;

                public C41468a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f39659w = obj;
                    this.f39660x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, String str, boolean z4, C12006d c12006d, String str2) {
                this.f39651w = interfaceC13062m;
                this.f39652x = str;
                this.f39653y = z4;
                this.f39654z = c12006d;
                this.f39650E = str2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41468a c41468a;
                C12005c c12005cM33092b;
                C12005c c12005c;
                if (interfaceC30057d instanceof C41468a) {
                    c41468a = (C41468a) interfaceC30057d;
                    int i13 = c41468a.f39660x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41468a.f39660x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41468a = new C41468a(interfaceC30057d);
                    }
                } else {
                    c41468a = new C41468a(interfaceC30057d);
                }
                Object obj2 = c41468a.f39659w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41468a.f39660x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f39651w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c12005cM33092b = new C12005c(InterfaceC12003a.c.f39592a, null, null, this.f39652x, null, false, false, null, 246, null);
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            InterfaceC29354a.a.b bVar = (InterfaceC29354a.a.b) interfaceC29354a;
                            UpdateTestsModels updateTestsModels = (UpdateTestsModels) bVar.getData();
                            String initiallySelectedSegmentId = ((UpdateTestsModels) bVar.getData()).getInitiallySelectedSegmentId();
                            String str = initiallySelectedSegmentId == null ? "" : initiallySelectedSegmentId;
                            String str2 = this.f39652x;
                            String initiallySelectedSegmentId2 = ((UpdateTestsModels) bVar.getData()).getInitiallySelectedSegmentId();
                            c12005c = new C12005c(null, updateTestsModels, str, str2, initiallySelectedSegmentId2 == null ? "" : initiallySelectedSegmentId2, this.f39653y, true, null, 129, null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                            UpdateTestsModels updateTestsModels2 = (UpdateTestsModels) c42173a.getData();
                            String initiallySelectedSegmentId3 = ((UpdateTestsModels) c42173a.getData()).getInitiallySelectedSegmentId();
                            String str3 = initiallySelectedSegmentId3 == null ? "" : initiallySelectedSegmentId3;
                            String str4 = this.f39652x;
                            String initiallySelectedSegmentId4 = ((UpdateTestsModels) c42173a.getData()).getInitiallySelectedSegmentId();
                            c12005c = new C12005c(null, updateTestsModels2, str3, str4, initiallySelectedSegmentId4 == null ? "" : initiallySelectedSegmentId4, false, false, null, 225, null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                            UpdateTestsModels updateTestsModels3 = (UpdateTestsModels) dVar.getData();
                            String initiallySelectedSegmentId5 = ((UpdateTestsModels) dVar.getData()).getInitiallySelectedSegmentId();
                            String str5 = initiallySelectedSegmentId5 == null ? "" : initiallySelectedSegmentId5;
                            String str6 = this.f39652x;
                            String initiallySelectedSegmentId6 = ((UpdateTestsModels) dVar.getData()).getInitiallySelectedSegmentId();
                            c12005c = new C12005c(null, updateTestsModels3, str5, str6, initiallySelectedSegmentId6 == null ? "" : initiallySelectedSegmentId6, false, false, null, 225, null);
                        } else {
                            if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c12005cM33092b = C12005c.m33092b(this.f39654z.m33108i((InterfaceC29354a.c) interfaceC29354a), null, null, null, this.f39652x, this.f39650E, false, false, null, 231, null);
                        }
                        c12005cM33092b = c12005c;
                    }
                    c41468a.f39661y = null;
                    c41468a.f39655E = null;
                    c41468a.f39656F = null;
                    c41468a.f39657G = null;
                    c41468a.f39658H = 0;
                    c41468a.f39660x = 1;
                    if (interfaceC13062m.emit(c12005cM33092b, c41468a) == enumC31071a) {
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

        public h(InterfaceC13058l interfaceC13058l, String str, boolean z4, C12006d c12006d, String str2) {
            this.f39646w = interfaceC13058l;
            this.f39647x = str;
            this.f39648y = z4;
            this.f39649z = c12006d;
            this.f39645E = str2;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f39646w.collect(new a(interfaceC13062m, this.f39647x, this.f39648y, this.f39649z, this.f39645E), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dg0.d$i */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f39663w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12006d f39664x;

        /* JADX INFO: renamed from: dg0.d$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f39665w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12006d f39666x;

            /* JADX INFO: renamed from: dg0.d$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabsjoin.feature.updatetests.domain.UpdateTestsInteractor$performAction$$inlined$map$1$2", m100430f = "UpdateTestsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41469a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f39667E;

                /* JADX INFO: renamed from: F */
                Object f39668F;

                /* JADX INFO: renamed from: G */
                Object f39669G;

                /* JADX INFO: renamed from: H */
                int f39670H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f39671w;

                /* JADX INFO: renamed from: x */
                int f39672x;

                /* JADX INFO: renamed from: y */
                Object f39673y;

                public C41469a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f39671w = obj;
                    this.f39672x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12006d c12006d) {
                this.f39665w = interfaceC13062m;
                this.f39666x = c12006d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41469a c41469a;
                if (interfaceC30057d instanceof C41469a) {
                    c41469a = (C41469a) interfaceC30057d;
                    int i13 = c41469a.f39672x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41469a.f39672x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41469a = new C41469a(interfaceC30057d);
                    }
                } else {
                    c41469a = new C41469a(interfaceC30057d);
                }
                Object obj2 = c41469a.f39671w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41469a.f39672x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f39665w;
                    C12005c c12005cM33112m = this.f39666x.m33112m((AbstractC30694b) obj);
                    c41469a.f39673y = null;
                    c41469a.f39667E = null;
                    c41469a.f39668F = null;
                    c41469a.f39669G = null;
                    c41469a.f39670H = 0;
                    c41469a.f39672x = 1;
                    if (interfaceC13062m.emit(c12005cM33112m, c41469a) == enumC31071a) {
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

        public i(InterfaceC13058l interfaceC13058l, C12006d c12006d) {
            this.f39663w = interfaceC13058l;
            this.f39664x = c12006d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f39663w.collect(new a(interfaceC13062m, this.f39664x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C12006d(InterfaceC26834e cachedApiSource, C30695c actionInteractor) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        this.cachedApiSource = cachedApiSource;
        this.actionInteractor = actionInteractor;
    }

    /* JADX INFO: renamed from: g */
    private final C12005c m33106g(C12005c previousState, AbstractC12004b.a action) {
        Map<String, AdvanceLabsUpdateTestsStickyModel> bottomStickyItems;
        AdvanceLabsUpdateTestsStickyModel advanceLabsUpdateTestsStickyModel;
        if (action.getCardButtonState().getAction() != null) {
            return C12005c.m33092b(previousState, InterfaceC12003a.c.f39592a, null, null, null, null, false, false, null, 254, null);
        }
        UpdateTestsModels response = previousState.getResponse();
        UpdateTestsDialogModel dialog = (response == null || (bottomStickyItems = response.getBottomStickyItems()) == null || (advanceLabsUpdateTestsStickyModel = bottomStickyItems.get(action.getSelectedSegmentId())) == null) ? null : advanceLabsUpdateTestsStickyModel.getDialog();
        if (dialog != null && !action.getIsFromDialog()) {
            return C12005c.m33092b(previousState, new InterfaceC12003a.a(dialog), null, null, null, null, false, false, null, 254, null);
        }
        if (m33109j(action.getCardButtonState().getDestination())) {
            return C12005c.m33092b(previousState, null, null, null, null, null, false, false, new InterfaceC15822a.c(action.getCardButtonState().getDestination()), 127, null);
        }
        return (!action.getIsFromDialog() && action.getCardButtonState().getAction() == null && AbstractC22676k.m65745e(action.getCardButtonState().getDestination(), new C9598e(null, null, null, 7, null))) ? C12005c.m33092b(previousState, null, null, null, null, null, false, false, InterfaceC15822a.f.f59725a, 127, null) : C12005c.m33092b(previousState, null, null, null, null, null, false, false, null, 254, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final C12005c m33107h(C12005c previousState, AbstractC12004b action) {
        if (action instanceof AbstractC12004b.c) {
            return previousState;
        }
        if (action instanceof AbstractC12004b.d) {
            return C12005c.m33092b(previousState, null, null, ((AbstractC12004b.d) action).getSelectedSegmentId(), null, null, false, false, null, 251, null);
        }
        if (action instanceof AbstractC12004b.a) {
            return m33106g(previousState, (AbstractC12004b.a) action);
        }
        if (action instanceof AbstractC12004b.b) {
            return C12005c.m33092b(previousState, null, null, null, null, null, false, false, null, 254, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final C12005c m33108i(InterfaceC29354a.c<UpdateTestsModels> cacheResult) {
        return AbstractC29355b.m89462a(cacheResult) ? new C12005c(InterfaceC12003a.f.f39594a, null, null, null, null, false, false, null, 254, null) : new C12005c(InterfaceC12003a.d.f39593a, null, null, null, null, false, false, null, 254, null);
    }

    /* JADX INFO: renamed from: j */
    private final boolean m33109j(C9598e c9598e) {
        return !AbstractC22676k.m65745e(c9598e.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w);
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC13058l m33110k(String source, String testCount, boolean manualRefresh) {
        return new h(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetUpdateTestsRequest(testCount), 1), AbstractC12350b.m34570S("UpdateTests_SCOPE"), null, 2, null), new g(null, this.cachedApiSource)), source, manualRefresh, this, testCount);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ InterfaceC13058l m33111l(C12006d c12006d, String str, String str2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "";
        }
        if ((i13 & 2) != 0) {
            str2 = "";
        }
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return c12006d.m33110k(str, str2, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final C12005c m33112m(AbstractC30694b actionDomainState) {
        if (!(actionDomainState instanceof AbstractC30694b.c) && !(actionDomainState instanceof AbstractC30694b.i)) {
            if (!(actionDomainState instanceof AbstractC30694b.n) && !(actionDomainState instanceof AbstractC30694b.f)) {
                if (actionDomainState instanceof AbstractC30694b.d) {
                    return new C12005c(null, null, null, null, null, false, false, new InterfaceC15822a.c(((AbstractC30694b.d) actionDomainState).getDestination()), 127, null);
                }
                if (actionDomainState instanceof AbstractC30694b.a) {
                    return AbstractC39414r.m125876U(((AbstractC30694b.a) actionDomainState).getMessage(), "network", true) ? new C12005c(InterfaceC12003a.d.f39593a, null, null, null, null, false, false, null, 254, null) : new C12005c(InterfaceC12003a.f.f39594a, null, null, null, null, false, false, null, 254, null);
                }
                if ((actionDomainState instanceof AbstractC30694b.m) || (actionDomainState instanceof AbstractC30694b.l) || (actionDomainState instanceof AbstractC30694b.k) || (actionDomainState instanceof AbstractC30694b.j) || (actionDomainState instanceof AbstractC30694b.g) || (actionDomainState instanceof AbstractC30694b.e) || (actionDomainState instanceof AbstractC30694b.h) || (actionDomainState instanceof AbstractC30694b.b)) {
                    return new C12005c(null, null, null, null, null, false, false, null, 254, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new C12005c(InterfaceC12003a.g.f39595a, null, null, null, null, false, false, null, 254, null);
        }
        return new C12005c(InterfaceC12003a.c.f39592a, null, null, null, null, false, false, null, 254, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC13058l m33113n(AbstractC12004b.a action) {
        Action action2 = action.getCardButtonState().getAction();
        return action2 == null ? new C0456u(new C12005c(null, null, null, null, null, false, false, null, 254, null), 1) : new i(this.actionInteractor.interact(new C0456u(new C30698f(action2), 1)), this);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C12005c(InterfaceC12003a.c.f39592a, null, null, null, null, false, false, null, 254, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new d(null));
    }
}
