package qn1;

import c93.InterfaceC4351m;
import com.whoop.homenotificationscenter.domain.cache.NotificationCenterReadCardRequest;
import com.whoop.homenotificationscenter.domain.cache.NotificationsCenterGetRequest;
import com.whoop.homenotificationscenter.domain.cache.NotificationsCenterReplayRequest;
import com.whoop.homenotificationscenter.domain.models.HomeNotificationsCenterResponse;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import nn1.C26866a;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p741vn1.EnumC36197a;
import pm0.InterfaceC29354a;
import pn1.AbstractC29378a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;

/* JADX INFO: renamed from: qn1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000f2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Lqn1/c;", "Lod1/g;", "Lpn1/a;", "Lqn1/d;", "Lnm0/e;", "cachedApiSource", "Lnn1/a;", "homeNotificationsCenterAnalyticsHelper", "<init>", "(Lnm0/e;Lnn1/a;)V", "", "cardId", "Lvn1/a;", "cardDismissAction", "path", "Lec3/l;", "f", "(Ljava/lang/String;Lvn1/a;Ljava/lang/String;)Lec3/l;", "Lpm0/a;", "Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "g", "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "i", "(Ljava/lang/String;)Lec3/l;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lnn1/a;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30520c implements InterfaceC27844g<AbstractC29378a, AbstractC30521d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C26866a homeNotificationsCenterAnalyticsHelper;

    /* JADX INFO: renamed from: qn1.c$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f125433w;

        /* JADX INFO: renamed from: qn1.c$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42234a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f125434w;

            /* JADX INFO: renamed from: qn1.c$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsInteractionInteractor$interact$$inlined$filterNot$1$2", m100430f = "HomeNotificationsInteractionInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42235a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f125436F;

                /* JADX INFO: renamed from: G */
                Object f125437G;

                /* JADX INFO: renamed from: H */
                int f125438H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f125439w;

                /* JADX INFO: renamed from: x */
                int f125440x;

                /* JADX INFO: renamed from: y */
                Object f125441y;

                /* JADX INFO: renamed from: z */
                Object f125442z;

                public C42235a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f125439w = obj;
                    this.f125440x |= Integer.MIN_VALUE;
                    return C42234a.this.emit(null, this);
                }
            }

            public C42234a(InterfaceC13062m interfaceC13062m) {
                this.f125434w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42235a c42235a;
                if (interfaceC30057d instanceof C42235a) {
                    c42235a = (C42235a) interfaceC30057d;
                    int i13 = c42235a.f125440x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42235a.f125440x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42235a = new C42235a(interfaceC30057d);
                    }
                } else {
                    c42235a = new C42235a(interfaceC30057d);
                }
                Object obj2 = c42235a.f125439w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42235a.f125440x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f125434w;
                    if (!(((AbstractC29378a) obj) instanceof AbstractC29378a.c)) {
                        c42235a.f125441y = null;
                        c42235a.f125442z = null;
                        c42235a.f125436F = null;
                        c42235a.f125437G = null;
                        c42235a.f125438H = 0;
                        c42235a.f125440x = 1;
                        if (interfaceC13062m.emit(obj, c42235a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l) {
            this.f125433w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f125433w.collect(new C42234a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qn1.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsInteractionInteractor$interact$$inlined$flatMapLatest$1", m100430f = "HomeNotificationsInteractionInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f125443w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f125444x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f125445y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C30520c f125446z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C30520c c30520c) {
            super(3, interfaceC30057d);
            this.f125446z = c30520c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC29378a abstractC29378a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f125446z);
            bVar.f125444x = interfaceC13062m;
            bVar.f125445y = abstractC29378a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            C0456u c0456u2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125443w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f125444x;
                AbstractC29378a abstractC29378a = (AbstractC29378a) this.f125445y;
                if (abstractC29378a instanceof AbstractC29378a.f) {
                    AbstractC29378a.f fVar = (AbstractC29378a.f) abstractC29378a;
                    c0456u = this.f125446z.m93514f(fVar.getId(), fVar.getCardDismissAction(), fVar.getPath());
                } else if (abstractC29378a instanceof AbstractC29378a.h) {
                    c0456u = this.f125446z.m93517i(((AbstractC29378a.h) abstractC29378a).getPath());
                } else {
                    if (abstractC29378a instanceof AbstractC29378a.g) {
                        c0456u2 = new C0456u(AbstractC30521d.j.f125511a, 1);
                    } else if (abstractC29378a instanceof AbstractC29378a.d) {
                        c0456u = new C0456u(new AbstractC30521d.g(((AbstractC29378a.d) abstractC29378a).getId()), 1);
                    } else if (abstractC29378a instanceof AbstractC29378a.b) {
                        c0456u = new C0456u(new AbstractC30521d.a(((AbstractC29378a.b) abstractC29378a).getNotificationCardDismissAnimation()), 1);
                    } else if (abstractC29378a instanceof AbstractC29378a.a) {
                        AbstractC29378a.a aVar = (AbstractC29378a.a) abstractC29378a;
                        this.f125446z.homeNotificationsCenterAnalyticsHelper.m80207i(aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String().getCategory(), aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String().getLabel());
                        c0456u2 = new C0456u(AbstractC30521d.f.f125502a, 1);
                    } else {
                        if (abstractC29378a instanceof AbstractC29378a.c) {
                            throw new IllegalStateException("impossible");
                        }
                        if (!(abstractC29378a instanceof AbstractC29378a.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC29378a.e eVar = (AbstractC29378a.e) abstractC29378a;
                        c0456u = new C0456u(new AbstractC30521d.h(eVar.getCardVariant(), eVar.getLabel(), eVar.getTotalCards(), eVar.getNotificationType(), eVar.getTemplateName()), 1);
                    }
                    c0456u = c0456u2;
                }
                this.f125444x = null;
                this.f125445y = null;
                this.f125443w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC29378a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: qn1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f125447w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f125448x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC36197a f125449y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C30520c f125450z;

        /* JADX INFO: renamed from: qn1.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f125451w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f125452x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ EnumC36197a f125453y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C30520c f125454z;

            /* JADX INFO: renamed from: qn1.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsInteractionInteractor$markCardAsRead$$inlined$map$1$2", m100430f = "HomeNotificationsInteractionInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42236a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f125455E;

                /* JADX INFO: renamed from: F */
                Object f125456F;

                /* JADX INFO: renamed from: G */
                Object f125457G;

                /* JADX INFO: renamed from: H */
                int f125458H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f125459w;

                /* JADX INFO: renamed from: x */
                int f125460x;

                /* JADX INFO: renamed from: y */
                Object f125461y;

                public C42236a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f125459w = obj;
                    this.f125460x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, String str, EnumC36197a enumC36197a, C30520c c30520c) {
                this.f125451w = interfaceC13062m;
                this.f125452x = str;
                this.f125453y = enumC36197a;
                this.f125454z = c30520c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42236a c42236a;
                Object bVar;
                C26866a.b bVarM80205g;
                if (interfaceC30057d instanceof C42236a) {
                    c42236a = (C42236a) interfaceC30057d;
                    int i13 = c42236a.f125460x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42236a.f125460x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42236a = new C42236a(interfaceC30057d);
                    }
                } else {
                    c42236a = new C42236a(interfaceC30057d);
                }
                Object obj2 = c42236a.f125459w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42236a.f125460x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f125451w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        bVar = new AbstractC30521d.i(this.f125452x, this.f125453y);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                        bVar = new AbstractC30521d.k((HomeNotificationsCenterResponse) c42173a.getData(), ((HomeNotificationsCenterResponse) c42173a.getData()).getCount() != 0, null, 4, null);
                    } else {
                        bVar = (!(interfaceC29354a instanceof InterfaceC29354a.d) || (bVarM80205g = this.f125454z.homeNotificationsCenterAnalyticsHelper.m80205g(this.f125452x, ((HomeNotificationsCenterResponse) ((InterfaceC29354a.d) interfaceC29354a).getData()).getNotificationCards())) == null) ? AbstractC30521d.f.f125502a : new AbstractC30521d.b(bVarM80205g.getAppNotificationType(), bVarM80205g.getCardTitle(), bVarM80205g.getTotalCards());
                    }
                    c42236a.f125461y = null;
                    c42236a.f125455E = null;
                    c42236a.f125456F = null;
                    c42236a.f125457G = null;
                    c42236a.f125458H = 0;
                    c42236a.f125460x = 1;
                    if (interfaceC13062m.emit(bVar, c42236a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, String str, EnumC36197a enumC36197a, C30520c c30520c) {
            this.f125447w = interfaceC13058l;
            this.f125448x = str;
            this.f125449y = enumC36197a;
            this.f125450z = c30520c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f125447w.collect(new a(interfaceC13062m, this.f125448x, this.f125449y, this.f125450z), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qn1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsInteractionInteractor$markCardsAsReadResultFlow$$inlined$cacheAPI$1", m100430f = "HomeNotificationsInteractionInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f125463w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f125464x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f125465y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f125466z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f125466z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f125466z);
            dVar.f125464x = interfaceC13062m;
            dVar.f125465y = c26832c;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125463w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f125464x;
                C26832c c26832c = (C26832c) this.f125465y;
                InterfaceC26834e interfaceC26834e = this.f125466z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(HomeNotificationsCenterResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(HomeNotificationsCenterResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f125464x = null;
                this.f125465y = null;
                this.f125463w = 1;
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

    /* JADX INFO: renamed from: qn1.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsInteractionInteractor$markCardsAsUnseenCacheResultFlow$$inlined$cacheAPI$1", m100430f = "HomeNotificationsInteractionInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f125467w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f125468x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f125469y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f125470z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f125470z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f125470z);
            eVar.f125468x = interfaceC13062m;
            eVar.f125469y = c26832c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125467w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f125468x;
                C26832c c26832c = (C26832c) this.f125469y;
                InterfaceC26834e interfaceC26834e = this.f125470z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(HomeNotificationsCenterResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(HomeNotificationsCenterResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f125468x = null;
                this.f125469y = null;
                this.f125467w = 1;
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

    /* JADX INFO: renamed from: qn1.c$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f125471w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30520c f125472x;

        /* JADX INFO: renamed from: qn1.c$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f125473w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30520c f125474x;

            /* JADX INFO: renamed from: qn1.c$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsInteractionInteractor$replayCards$$inlined$map$1$2", m100430f = "HomeNotificationsInteractionInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42237a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f125475E;

                /* JADX INFO: renamed from: F */
                Object f125476F;

                /* JADX INFO: renamed from: G */
                Object f125477G;

                /* JADX INFO: renamed from: H */
                int f125478H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f125479w;

                /* JADX INFO: renamed from: x */
                int f125480x;

                /* JADX INFO: renamed from: y */
                Object f125481y;

                public C42237a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f125479w = obj;
                    this.f125480x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C30520c c30520c) {
                this.f125473w = interfaceC13062m;
                this.f125474x = c30520c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42237a c42237a;
                Object cVar;
                if (interfaceC30057d instanceof C42237a) {
                    c42237a = (C42237a) interfaceC30057d;
                    int i13 = c42237a.f125480x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42237a.f125480x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42237a = new C42237a(interfaceC30057d);
                    }
                } else {
                    c42237a = new C42237a(interfaceC30057d);
                }
                Object obj2 = c42237a.f125479w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42237a.f125480x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f125473w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                        this.f125474x.homeNotificationsCenterAnalyticsHelper.m80209m(((HomeNotificationsCenterResponse) c42173a.getData()).getNotificationCards().size());
                        cVar = new AbstractC30521d.k((HomeNotificationsCenterResponse) c42173a.getData(), false, null, 6, null);
                    } else if ((interfaceC29354a instanceof InterfaceC29354a.a.b) || (interfaceC29354a instanceof InterfaceC29354a.e)) {
                        cVar = AbstractC30521d.e.f125501a;
                    } else if ((interfaceC29354a instanceof InterfaceC29354a.c) || (interfaceC29354a instanceof InterfaceC29354a.d)) {
                        this.f125474x.homeNotificationsCenterAnalyticsHelper.m80210n();
                        cVar = new AbstractC30521d.c(null, 1, null);
                    } else {
                        cVar = new AbstractC30521d.c(null, 1, null);
                    }
                    c42237a.f125481y = null;
                    c42237a.f125475E = null;
                    c42237a.f125476F = null;
                    c42237a.f125477G = null;
                    c42237a.f125478H = 0;
                    c42237a.f125480x = 1;
                    if (interfaceC13062m.emit(cVar, c42237a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l, C30520c c30520c) {
            this.f125471w = interfaceC13058l;
            this.f125472x = c30520c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f125471w.collect(new a(interfaceC13062m, this.f125472x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qn1.c$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsInteractionInteractor$replayCards$$inlined$transform$1", m100430f = "HomeNotificationsInteractionInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125483w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f125484x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f125485y;

        /* JADX INFO: renamed from: qn1.c$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f125486w;

            /* JADX INFO: renamed from: qn1.c$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsInteractionInteractor$replayCards$$inlined$transform$1$1", m100430f = "HomeNotificationsInteractionInteractor.kt", m100431l = {41, 42, 43, 47, 48, 51}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42238a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f125487E;

                /* JADX INFO: renamed from: F */
                Object f125488F;

                /* JADX INFO: renamed from: G */
                Object f125489G;

                /* JADX INFO: renamed from: H */
                int f125490H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f125491w;

                /* JADX INFO: renamed from: x */
                int f125492x;

                /* JADX INFO: renamed from: z */
                Object f125494z;

                public C42238a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f125491w = obj;
                    this.f125492x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f125486w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:25:0x00ab A[PHI: r2 r8
              0x00ab: PHI (r2v9 ec3.m) = (r2v6 ec3.m), (r2v11 ec3.m) binds: [B:23:0x00a8, B:14:0x004f] A[DONT_GENERATE, DONT_INLINE]
              0x00ab: PHI (r8v9 int) = (r8v7 int), (r8v12 int) binds: [B:23:0x00a8, B:14:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00f0, code lost:
            
                if (bc3.AbstractC3034m0.m8782b(500, r0) == r1) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x0104, code lost:
            
                if (r9.emit(r8, r0) == r1) goto L39;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, q83.InterfaceC30057d<? super l83.C23454a0> r9) {
                /*
                    Method dump skipped, instruction units count: 284
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: qn1.C30520c.g.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f125485y = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(this.f125485y, interfaceC30057d);
            gVar.f125484x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125483w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f125484x;
                InterfaceC13058l interfaceC13058l = this.f125485y;
                a aVar = new a(interfaceC13062m);
                this.f125484x = null;
                this.f125483w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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

    public C30520c(InterfaceC26834e cachedApiSource, C26866a homeNotificationsCenterAnalyticsHelper) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(homeNotificationsCenterAnalyticsHelper, "homeNotificationsCenterAnalyticsHelper");
        this.cachedApiSource = cachedApiSource;
        this.homeNotificationsCenterAnalyticsHelper = homeNotificationsCenterAnalyticsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m93514f(String cardId, EnumC36197a cardDismissAction, String path) {
        return new c(m93515g(cardId, path), cardId, cardDismissAction, this);
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC13058l m93515g(String cardId, String path) {
        if (path == null) {
            path = NotificationsCenterGetRequest.NOTIFICATION_WRAPPER_V2_PATH;
        }
        return AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new NotificationCenterReadCardRequest(cardId, path), 1), null, path, 1, null), new d(null, this.cachedApiSource));
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC13058l m93516h(String path) {
        if (path == null) {
            path = NotificationsCenterGetRequest.NOTIFICATION_WRAPPER_V2_PATH;
        }
        return AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new NotificationsCenterReplayRequest(path), 1), null, path, 1, null), new e(null, this.cachedApiSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m93517i(String path) {
        return new C13084s1(new g(new f(m93516h(path), this), null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(new a(upstream), new b(null, this));
    }
}
