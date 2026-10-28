package y42;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c52.AbstractC4250a;
import c52.AbstractC4251b;
import c93.InterfaceC4351m;
import dc3.EnumC11916a;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13060l1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13072o1;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: y42.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\u0012\n\u0004\b\r\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001c¨\u0006 "}, m65681d2 = {"Ly42/e;", "", "Ltr2/n;", "logger", "Lbc3/c0;", "coroutineScope", "", "macAddress", "<init>", "(Ltr2/n;Lbc3/c0;Ljava/lang/String;)V", "Lc52/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "e", "(Lc52/a;)V", "a", "Ltr2/n;", "b", "Lbc3/c0;", "c", "Ljava/lang/String;", "Lec3/o1;", "d", "Lec3/o1;", "_connectionEvent", "Lec3/f2;", "Lc52/b;", "Lec3/f2;", "()Lec3/f2;", "getConnectionState$annotations", "()V", "connectionState", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39223e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String macAddress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13072o1 _connectionEvent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13037f2 connectionState;

    /* JADX INFO: renamed from: y42.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinConnectionStateManager$connectionState$1", m100430f = "PuffinConnectionStateManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lc52/b;", "currentState", "Lc52/a;", NotificationCompat.CATEGORY_EVENT, "<anonymous>", "(Lc52/b;Lc52/a;)Lc52/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f168566w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f168567x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f168568y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4251b abstractC4251b, AbstractC4250a abstractC4250a, InterfaceC30057d<? super AbstractC4251b> interfaceC30057d) {
            a aVar = C39223e.this.new a(interfaceC30057d);
            aVar.f168567x = abstractC4251b;
            aVar.f168568y = abstractC4250a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:54:0x00b6 A[RETURN] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC4251b abstractC4251b = (AbstractC4251b) this.f168567x;
            AbstractC4250a abstractC4250a = (AbstractC4250a) this.f168568y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f168566w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C39223e.this.logger.mo85228t("New event - " + abstractC4250a, new AbstractC30556a.a[0]);
            C39223e.this.logger.mo85228t("Current state - " + abstractC4251b, new AbstractC30556a.a[0]);
            AbstractC4251b.c cVar = AbstractC4251b.c.f17284a;
            if (AbstractC22676k.m65745e(abstractC4251b, cVar)) {
                if (abstractC4250a instanceof AbstractC4250a.b) {
                    return AbstractC4251b.b.f17283a;
                }
                if (abstractC4250a instanceof AbstractC4250a.a) {
                    return AbstractC4251b.a.f17282a;
                }
            } else if (AbstractC22676k.m65745e(abstractC4251b, AbstractC4251b.b.f17283a)) {
                if (abstractC4250a instanceof AbstractC4250a.a) {
                    return AbstractC4251b.a.f17282a;
                }
                if (abstractC4250a instanceof AbstractC4250a.e) {
                    return cVar;
                }
            } else if (AbstractC22676k.m65745e(abstractC4251b, AbstractC4251b.a.f17282a)) {
                if (abstractC4250a instanceof AbstractC4250a.d) {
                    return AbstractC4251b.d.f17285a;
                }
                if (abstractC4250a instanceof AbstractC4250a.e) {
                    return cVar;
                }
            } else if (AbstractC22676k.m65745e(abstractC4251b, AbstractC4251b.d.f17285a)) {
                if (abstractC4250a instanceof AbstractC4250a.f) {
                    return AbstractC4251b.e.f17286a;
                }
                if (abstractC4250a instanceof AbstractC4250a.e) {
                    return cVar;
                }
            } else if (AbstractC22676k.m65745e(abstractC4251b, AbstractC4251b.e.f17286a)) {
                if (abstractC4250a instanceof AbstractC4250a.g) {
                    return AbstractC4251b.f.f17287a;
                }
                if (abstractC4250a instanceof AbstractC4250a.e) {
                    return cVar;
                }
            } else {
                if (!AbstractC22676k.m65745e(abstractC4251b, AbstractC4251b.f.f17287a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (abstractC4250a instanceof AbstractC4250a.c) {
                    return cVar;
                }
            }
            return abstractC4251b;
        }
    }

    /* JADX INFO: renamed from: y42.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinConnectionStateManager$connectionState$2", m100430f = "PuffinConnectionStateManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lc52/b;", "it", "Ll83/a0;", "<anonymous>", "(Lc52/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f168570w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f168571x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C39223e.this.new b(interfaceC30057d);
            bVar.f168571x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4251b abstractC4251b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(abstractC4251b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC4251b abstractC4251b = (AbstractC4251b) this.f168571x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f168570w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C39223e.this.logger.mo85219j("Puffin Connection state (mac address: " + C39223e.this.macAddress + ") changed to " + abstractC4251b, new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y42.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinConnectionStateManager$sendEvent$1", m100430f = "PuffinConnectionStateManager.kt", m100431l = {84}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f168573w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4250a f168575y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC4250a abstractC4250a, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f168575y = abstractC4250a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39223e.this.new c(this.f168575y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f168573w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C39223e.this._connectionEvent;
                AbstractC4250a abstractC4250a = this.f168575y;
                this.f168573w = 1;
                if (interfaceC13072o1.emit(abstractC4250a, this) == enumC31071a) {
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

    public C39223e(InterfaceC34116n logger, InterfaceC2994c0 coroutineScope, String macAddress) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(macAddress, "macAddress");
        this.logger = logger;
        this.coroutineScope = coroutineScope;
        this.macAddress = macAddress;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 6, EnumC11916a.f38982w, 1);
        this._connectionEvent = c13096w1M36592b;
        AbstractC4251b.c cVar = AbstractC4251b.c.f17284a;
        this.connectionState = AbstractC13091v.m36587M(new C13052j1(new C13060l1(cVar, c13096w1M36592b, new a(null)), new b(null), 0), coroutineScope, C13105z1.f45288a, cVar);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC13037f2 getConnectionState() {
        return this.connectionState;
    }

    /* JADX INFO: renamed from: e */
    public final void m124960e(AbstractC4250a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(event, null), 3);
    }

    public /* synthetic */ C39223e(InterfaceC34116n interfaceC34116n, InterfaceC2994c0 interfaceC2994c0, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PuffinConnectionStateManager") : interfaceC34116n, interfaceC2994c0, str);
    }
}
