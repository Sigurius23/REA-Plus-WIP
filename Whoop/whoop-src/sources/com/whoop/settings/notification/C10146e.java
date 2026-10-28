package com.whoop.settings.notification;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: com.whoop.settings.notification.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\r*\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Lcom/whoop/settings/notification/e;", "Landroidx/lifecycle/w1;", "Lcom/whoop/settings/notification/c;", "interactor", "Lcom/whoop/settings/notification/f;", "viewStateReducer", "<init>", "(Lcom/whoop/settings/notification/c;Lcom/whoop/settings/notification/f;)V", "Lcom/whoop/settings/notification/d;", "viewEvent", "Lcom/whoop/settings/notification/a;", "p", "(Lcom/whoop/settings/notification/d;)Lcom/whoop/settings/notification/a;", "Lec3/l;", "Lcom/whoop/settings/notification/b;", "l", "(Lec3/l;Lcom/whoop/settings/notification/c;)Lec3/l;", "Lic2/g;", "n", "(Lec3/l;Lcom/whoop/settings/notification/f;)Lec3/l;", "Lbc3/k1;", "o", "(Lcom/whoop/settings/notification/d;)Lbc3/k1;", "Lec3/o1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lec3/o1;", "eventFlow", "x", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10146e extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: com.whoop.settings.notification.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.notification.SettingsNotificationViewModel$sendViewEvent$1", m100430f = "SettingsNotificationViewModel.kt", m100431l = {24}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30671w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC10145d f30673y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC10145d abstractC10145d, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30673y = abstractC10145d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C10146e.this.new a(this.f30673y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30671w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C10146e.this.eventFlow;
                AbstractC10145d abstractC10145d = this.f30673y;
                this.f30671w = 1;
                if (interfaceC13072o1.emit(abstractC10145d, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.settings.notification.e$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f30674w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C10146e f30675x;

        /* JADX INFO: renamed from: com.whoop.settings.notification.e$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f30676w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C10146e f30677x;

            /* JADX INFO: renamed from: com.whoop.settings.notification.e$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.notification.SettingsNotificationViewModel$special$$inlined$map$1$2", m100430f = "SettingsNotificationViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41418a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f30678E;

                /* JADX INFO: renamed from: F */
                Object f30679F;

                /* JADX INFO: renamed from: G */
                Object f30680G;

                /* JADX INFO: renamed from: H */
                int f30681H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f30682w;

                /* JADX INFO: renamed from: x */
                int f30683x;

                /* JADX INFO: renamed from: y */
                Object f30684y;

                public C41418a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f30682w = obj;
                    this.f30683x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C10146e c10146e) {
                this.f30676w = interfaceC13062m;
                this.f30677x = c10146e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41418a c41418a;
                if (interfaceC30057d instanceof C41418a) {
                    c41418a = (C41418a) interfaceC30057d;
                    int i13 = c41418a.f30683x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41418a.f30683x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41418a = new C41418a(interfaceC30057d);
                    }
                } else {
                    c41418a = new C41418a(interfaceC30057d);
                }
                Object obj2 = c41418a.f30682w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41418a.f30683x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f30676w;
                    AbstractC10142a abstractC10142aM25702p = this.f30677x.m25702p((AbstractC10145d) obj);
                    c41418a.f30684y = null;
                    c41418a.f30678E = null;
                    c41418a.f30679F = null;
                    c41418a.f30680G = null;
                    c41418a.f30681H = 0;
                    c41418a.f30683x = 1;
                    if (interfaceC13062m.emit(abstractC10142aM25702p, c41418a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C10146e c10146e) {
            this.f30674w = interfaceC13058l;
            this.f30675x = c10146e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f30674w.collect(new a(interfaceC13062m, this.f30675x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C10146e(C10144c interactor, C10147f viewStateReducer) {
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(m25701n(m25700l(new b(c13096w1M36592b, this), interactor), viewStateReducer), AbstractC1640x1.m5043b(this), C13105z1.f45288a, 1);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m25700l(InterfaceC13058l interfaceC13058l, C10144c c10144c) {
        return c10144c.m25692j(interfaceC13058l);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m25701n(InterfaceC13058l interfaceC13058l, C10147f c10147f) {
        return c10147f.m25704a(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC10142a m25702p(AbstractC10145d viewEvent) {
        if (AbstractC22676k.m65745e(viewEvent, AbstractC10145d.a.f30663a)) {
            return AbstractC10142a.a.f30612a;
        }
        if (viewEvent instanceof AbstractC10145d.b) {
            AbstractC10145d.b bVar = (AbstractC10145d.b) viewEvent;
            return new AbstractC10142a.b(bVar.getNameSpace(), bVar.getIsCurrentlyActive());
        }
        if (!(viewEvent instanceof AbstractC10145d.c)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC10145d.c cVar = (AbstractC10145d.c) viewEvent;
        return new AbstractC10142a.c(cVar.getNameSpace(), cVar.getIsDetectionOn(), cVar.getIsNotificationOn());
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC3027k1 m25703o(AbstractC10145d viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(viewEvent, null), 3);
    }
}
