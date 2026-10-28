package i80;

import ch.C4588i;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.HomeScreenModel;
import com.whoop.navigation.MembershipAdjustmentScreenModel;
import com.whoop.navigation.OrderConfirmationScreenModel;
import e70.C12798a;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f70.InterfaceC14176e;
import java.util.Map;
import l80.AbstractC23438o;
import l83.C23454a0;
import n70.AbstractC26417d;
import n70.C26418e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: i80.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Li80/c;", "", "<init>", "()V", "Ln70/d;", "action", "Ll80/o;", "c", "(Ln70/d;)Ll80/o;", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "destination", "", "", "arguments", "b", "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/util/Map;)Ll80/o;", "Lec3/l;", "Le70/a;", "upstream", "d", "(Lec3/l;)Lec3/l;", "a", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18212c {

    /* JADX INFO: renamed from: i80.c$b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f70761a;

        static {
            int[] iArr = new int[ActivationFlowDestination.values().length];
            try {
                iArr[ActivationFlowDestination.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivationFlowDestination.ORDER_CONFIRMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivationFlowDestination.HEALTH_CONNECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActivationFlowDestination.MEMBERSHIP_ADJUSTMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f70761a = iArr;
        }
    }

    /* JADX INFO: renamed from: i80.c$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f70762w;

        /* JADX INFO: renamed from: i80.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f70763w;

            /* JADX INFO: renamed from: i80.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.activation.presentation.reducers.ActivationFlowNavigationReducer$reduceNavigationEvents$$inlined$map$1$2", m100430f = "ActivationFlowNavigationReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41727a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f70764E;

                /* JADX INFO: renamed from: F */
                Object f70765F;

                /* JADX INFO: renamed from: G */
                Object f70766G;

                /* JADX INFO: renamed from: H */
                int f70767H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f70768w;

                /* JADX INFO: renamed from: x */
                int f70769x;

                /* JADX INFO: renamed from: y */
                Object f70770y;

                public C41727a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f70768w = obj;
                    this.f70769x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f70763w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41727a c41727a;
                C26418e c26418e;
                if (interfaceC30057d instanceof C41727a) {
                    c41727a = (C41727a) interfaceC30057d;
                    int i13 = c41727a.f70769x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41727a.f70769x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41727a = new C41727a(interfaceC30057d);
                    }
                } else {
                    c41727a = new C41727a(interfaceC30057d);
                }
                Object obj2 = c41727a.f70768w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41727a.f70769x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f70763w;
                    InterfaceC14176e activationDomainResult = ((C12798a) obj).getActivationDomainResult();
                    InterfaceC14176e.b bVar = activationDomainResult instanceof InterfaceC14176e.b ? (InterfaceC14176e.b) activationDomainResult : null;
                    AbstractC26417d navigationAction = (bVar == null || (c26418e = bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String()) == null) ? null : c26418e.getNavigationAction();
                    c41727a.f70770y = null;
                    c41727a.f70764E = null;
                    c41727a.f70765F = null;
                    c41727a.f70766G = null;
                    c41727a.f70767H = 0;
                    c41727a.f70769x = 1;
                    if (interfaceC13062m.emit(navigationAction, c41727a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f70762w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f70762w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: i80.c$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f70772w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18212c f70773x;

        /* JADX INFO: renamed from: i80.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f70774w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18212c f70775x;

            /* JADX INFO: renamed from: i80.c$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes6.dex */
            @InterfaceC32271e(m100429c = "com.whoop.activation.presentation.reducers.ActivationFlowNavigationReducer$reduceNavigationEvents$$inlined$map$2$2", m100430f = "ActivationFlowNavigationReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41728a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f70776E;

                /* JADX INFO: renamed from: F */
                Object f70777F;

                /* JADX INFO: renamed from: G */
                Object f70778G;

                /* JADX INFO: renamed from: H */
                int f70779H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f70780w;

                /* JADX INFO: renamed from: x */
                int f70781x;

                /* JADX INFO: renamed from: y */
                Object f70782y;

                public C41728a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f70780w = obj;
                    this.f70781x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C18212c c18212c) {
                this.f70774w = interfaceC13062m;
                this.f70775x = c18212c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41728a c41728a;
                if (interfaceC30057d instanceof C41728a) {
                    c41728a = (C41728a) interfaceC30057d;
                    int i13 = c41728a.f70781x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41728a.f70781x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41728a = new C41728a(interfaceC30057d);
                    }
                } else {
                    c41728a = new C41728a(interfaceC30057d);
                }
                Object obj2 = c41728a.f70780w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41728a.f70781x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f70774w;
                    AbstractC23438o abstractC23438oM52377c = this.f70775x.m52377c((AbstractC26417d) obj);
                    c41728a.f70782y = null;
                    c41728a.f70776E = null;
                    c41728a.f70777F = null;
                    c41728a.f70778G = null;
                    c41728a.f70779H = 0;
                    c41728a.f70781x = 1;
                    if (interfaceC13062m.emit(abstractC23438oM52377c, c41728a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C18212c c18212c) {
            this.f70772w = interfaceC13058l;
            this.f70773x = c18212c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f70772w.collect(new a(interfaceC13062m, this.f70773x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b */
    private final AbstractC23438o m52376b(ActivationFlowDestination destination, Map<String, ? extends Object> arguments) {
        int i13 = b.f70761a[destination.ordinal()];
        if (i13 == 1) {
            return new AbstractC23438o.a(new C9598e(AppScreen.C9426u2.f27963w, new HomeScreenModel((String) null, (AiAction) null, 3, (DefaultConstructorMarker) null), null, 4, null));
        }
        if (i13 == 2) {
            return new AbstractC23438o.a(new C9598e(AppScreen.C9340j4.f27699w, new OrderConfirmationScreenModel("LogIn"), null, 4, null));
        }
        if (i13 == 3) {
            return AbstractC23438o.i.f92881a;
        }
        if (i13 != 4) {
            return new AbstractC23438o.g(destination, arguments);
        }
        return new AbstractC23438o.a(new C9598e(AppScreen.C9451x3.f28042w, new MembershipAdjustmentScreenModel(String.valueOf(arguments.get("strapSerial")), String.valueOf(arguments.get("strapSignature")), "PAIRING_FIRST_FLOW"), null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final AbstractC23438o m52377c(AbstractC26417d action) {
        if (action instanceof AbstractC26417d.c) {
            return new AbstractC23438o.b(null, null, 3, null);
        }
        if (action instanceof AbstractC26417d.a) {
            AbstractC26417d.a aVar = (AbstractC26417d.a) action;
            return m52376b(aVar.getDestination(), aVar.m78159a());
        }
        if (action instanceof AbstractC26417d.b) {
            return new AbstractC23438o.a(((AbstractC26417d.b) action).getAction());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m52378d(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new d(new C4588i(AbstractC13091v.m36610t(new c(upstream)), 2), this);
    }
}
