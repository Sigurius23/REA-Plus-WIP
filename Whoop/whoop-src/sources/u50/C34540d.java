package u50;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import g12.AbstractC15225c;
import g12.InterfaceC15226d;
import g50.C15490c;
import g50.EnumC15489b;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import x50.InterfaceC37986a;

/* JADX INFO: renamed from: u50.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010!¨\u0006$"}, m65681d2 = {"Lu50/d;", "", "Lg12/d;", "flowPerformer", "Lec3/l;", "Lg12/c;", "performerEvents", "Lg50/c;", "analyticsHelper", "<init>", "(Lg12/d;Lec3/l;Lg50/c;)V", "Ll83/a0;", "g", "(Lg12/c;)V", "Lx50/a$j;", "f", "(Lg12/c;)Lx50/a$j;", "", "omronUrl", "Lbc3/c0;", "scope", "Lkotlin/Function1;", "onViewEvent", "e", "(Ljava/lang/String;Lbc3/c0;Lkotlin/jvm/functions/Function1;)V", "a", "Lg12/d;", "b", "Lec3/l;", "c", "Lg50/c;", "Lbc3/k1;", "d", "Lbc3/k1;", "eventsJob", "flowJob", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34540d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC15226d flowPerformer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13058l performerEvents;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C15490c analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private InterfaceC3027k1 eventsJob;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private InterfaceC3027k1 flowJob;

    /* JADX INFO: renamed from: u50.d$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.access.omronauth.domain.OmronAuthOAuthPerformer$connect$1", m100430f = "OmronAuthOAuthPerformer.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f145224w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f145226y;

        /* JADX INFO: renamed from: u50.d$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42444a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C34540d f145227w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Function1 f145228x;

            public C42444a(C34540d c34540d, Function1 function1) {
                this.f145227w = c34540d;
                this.f145228x = function1;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC15225c abstractC15225c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f145227w.m109150g(abstractC15225c);
                this.f145228x.invoke(this.f145227w.m109149f(abstractC15225c));
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f145226y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34540d.this.new a(this.f145226y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f145224w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058l = C34540d.this.performerEvents;
                C42444a c42444a = new C42444a(C34540d.this, this.f145226y);
                this.f145224w = 1;
                if (interfaceC13058l.collect(c42444a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: u50.d$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.access.omronauth.domain.OmronAuthOAuthPerformer$connect$2", m100430f = "OmronAuthOAuthPerformer.kt", m100431l = {60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f145229w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f145231y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f145231y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34540d.this.new b(this.f145231y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f145229w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC15226d interfaceC15226d = C34540d.this.flowPerformer;
                String str = this.f145231y;
                this.f145229w = 1;
                if (interfaceC15226d.mo43291a(str, "omron", null, this) == enumC31071a) {
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

    public C34540d(InterfaceC15226d flowPerformer, InterfaceC13058l performerEvents, C15490c analyticsHelper) {
        AbstractC22676k.m65750j(flowPerformer, "flowPerformer");
        AbstractC22676k.m65750j(performerEvents, "performerEvents");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.flowPerformer = flowPerformer;
        this.performerEvents = performerEvents;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC37986a.j m109149f(AbstractC15225c abstractC15225c) {
        if (AbstractC22676k.m65745e(abstractC15225c, AbstractC15225c.d.f57174a)) {
            return InterfaceC37986a.e.f162650a;
        }
        if (AbstractC22676k.m65745e(abstractC15225c, AbstractC15225c.a.f57171a)) {
            return InterfaceC37986a.h.f162652a;
        }
        if (AbstractC22676k.m65745e(abstractC15225c, AbstractC15225c.c.f57173a)) {
            return new InterfaceC37986a.c(true);
        }
        if (AbstractC22676k.m65745e(abstractC15225c, AbstractC15225c.b.f57172a)) {
            return new InterfaceC37986a.c(false);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final void m109150g(AbstractC15225c abstractC15225c) {
        if (AbstractC22676k.m65745e(abstractC15225c, AbstractC15225c.d.f57174a)) {
            this.analyticsHelper.m43686b(EnumC15489b.OmronConnectStart);
            return;
        }
        if (AbstractC22676k.m65745e(abstractC15225c, AbstractC15225c.c.f57173a)) {
            this.analyticsHelper.m43686b(EnumC15489b.OmronConnectSuccess);
        } else if (AbstractC22676k.m65745e(abstractC15225c, AbstractC15225c.b.f57172a)) {
            this.analyticsHelper.m43686b(EnumC15489b.OmronConnectFailure);
        } else if (!AbstractC22676k.m65745e(abstractC15225c, AbstractC15225c.a.f57171a)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m109151e(String omronUrl, InterfaceC2994c0 scope, Function1 onViewEvent) {
        AbstractC22676k.m65750j(omronUrl, "omronUrl");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        InterfaceC3027k1 interfaceC3027k1 = this.eventsJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        InterfaceC3027k1 interfaceC3027k2 = this.flowJob;
        if (interfaceC3027k2 != null) {
            interfaceC3027k2.cancel((CancellationException) null);
        }
        onViewEvent.invoke(InterfaceC37986a.e.f162650a);
        this.eventsJob = AbstractC3006f0.m8732z(scope, null, null, new a(onViewEvent, null), 3);
        this.flowJob = AbstractC3006f0.m8732z(scope, null, null, new b(omronUrl, null), 3);
    }
}
