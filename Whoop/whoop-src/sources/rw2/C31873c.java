package rw2;

import android.content.Context;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.ActionErrorCode;
import com.whoop.whoopaction.domain.models.AddToCalendarParameters;
import com.whoop.whoopaction.domain.models.DialPhoneNumberParameters;
import com.whoop.whoopaction.domain.models.OSAction;
import com.whoop.whoopaction.domain.models.OSActionParameters;
import com.whoop.whoopaction.domain.models.PermissionParameters;
import com.whoop.whoopaction.domain.models.PermissionType;
import com.whoop.whoopaction.domain.models.PickMediaParameters;
import com.whoop.whoopaction.domain.models.PickMediaType;
import com.whoop.whoopaction.domain.models.UnknownOSActionParameters;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import j93.InterfaceC21461d;
import java.util.Set;
import l83.C23454a0;
import la0.C23552a;
import p000.AbstractC11266d;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.AbstractC30694b;
import qw2.InterfaceC30693a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ww2.C37671a;

/* JADX INFO: renamed from: rw2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R(\u0010*\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020&0%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001f\u0010)¨\u0006+"}, m65681d2 = {"Lrw2/c;", "Lrw2/a;", "Landroid/content/Context;", "context", "Lrr2/c;", "crashReporter", "Ltr2/n;", "logger", "<init>", "(Landroid/content/Context;Lrr2/c;Ltr2/n;)V", "Lcom/whoop/whoopaction/domain/models/OSAction;", "action", "Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;", "parameters", "Lqw2/b;", "i", "(Lcom/whoop/whoopaction/domain/models/OSAction;Lcom/whoop/whoopaction/domain/models/AddToCalendarParameters;)Lqw2/b;", "Lcom/whoop/whoopaction/domain/models/DialPhoneNumberParameters;", "j", "(Lcom/whoop/whoopaction/domain/models/OSAction;Lcom/whoop/whoopaction/domain/models/DialPhoneNumberParameters;)Lqw2/b;", "Lcom/whoop/whoopaction/domain/models/PickMediaParameters;", "l", "(Lcom/whoop/whoopaction/domain/models/OSAction;Lcom/whoop/whoopaction/domain/models/PickMediaParameters;)Lqw2/b;", "Lcom/whoop/whoopaction/domain/models/PermissionParameters;", "k", "(Lcom/whoop/whoopaction/domain/models/OSAction;Lcom/whoop/whoopaction/domain/models/PermissionParameters;)Lqw2/b;", "Lec3/l;", "Lqw2/a;", "upstream", "b", "(Lec3/l;)Lec3/l;", "a", "Landroid/content/Context;", "Lrr2/c;", "c", "Ltr2/n;", "", "Lj93/d;", "Lcom/whoop/whoopaction/domain/models/Action;", "d", "Ljava/util/Set;", "()Ljava/util/Set;", "actionTypes", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31873c implements InterfaceC31871a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Set<InterfaceC21461d> actionTypes;

    /* JADX INFO: renamed from: rw2.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f132219w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31873c f132220x;

        /* JADX INFO: renamed from: rw2.c$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42300a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f132221w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31873c f132222x;

            /* JADX INFO: renamed from: rw2.c$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.OSActionHandler$handleActions$$inlined$map$1$2", m100430f = "OSActionHandler.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42301a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f132223E;

                /* JADX INFO: renamed from: F */
                Object f132224F;

                /* JADX INFO: renamed from: G */
                Object f132225G;

                /* JADX INFO: renamed from: H */
                int f132226H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f132227w;

                /* JADX INFO: renamed from: x */
                int f132228x;

                /* JADX INFO: renamed from: y */
                Object f132229y;

                public C42301a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f132227w = obj;
                    this.f132228x |= Integer.MIN_VALUE;
                    return C42300a.this.emit(null, this);
                }
            }

            public C42300a(InterfaceC13062m interfaceC13062m, C31873c c31873c) {
                this.f132221w = interfaceC13062m;
                this.f132222x = c31873c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42301a c42301a;
                AbstractC30694b aVar;
                AbstractC30694b abstractC30694bM99085l;
                if (interfaceC30057d instanceof C42301a) {
                    c42301a = (C42301a) interfaceC30057d;
                    int i13 = c42301a.f132228x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42301a.f132228x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42301a = new C42301a(interfaceC30057d);
                    }
                } else {
                    c42301a = new C42301a(interfaceC30057d);
                }
                Object obj2 = c42301a.f132227w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42301a.f132228x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f132221w;
                    Action action = ((InterfaceC30693a) obj).getAction();
                    if (action instanceof OSAction) {
                        OSAction oSAction = (OSAction) action;
                        OSActionParameters parameters = oSAction.getParameters();
                        if (parameters instanceof AddToCalendarParameters) {
                            abstractC30694bM99085l = this.f132222x.m99082i(oSAction, (AddToCalendarParameters) parameters);
                        } else if (parameters instanceof DialPhoneNumberParameters) {
                            abstractC30694bM99085l = this.f132222x.m99083j(oSAction, (DialPhoneNumberParameters) parameters);
                        } else if (parameters instanceof PermissionParameters) {
                            abstractC30694bM99085l = this.f132222x.m99084k(oSAction, (PermissionParameters) parameters);
                        } else if (parameters instanceof PickMediaParameters) {
                            abstractC30694bM99085l = this.f132222x.m99085l(oSAction, (PickMediaParameters) parameters);
                        } else {
                            if (!(parameters instanceof UnknownOSActionParameters)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f132222x.logger.mo85226q("Ignoring OSAction with unrecognized type", new AbstractC30556a.a[0]);
                            aVar = new AbstractC30694b.a("Unrecognized OS action type", action, null, 4, null);
                        }
                        aVar = abstractC30694bM99085l;
                    } else {
                        this.f132222x.crashReporter.mo98631p(new IllegalStateException(AbstractC11266d.m30461o("OSActionHandler received non-OSAction: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(action.getClass()).getSimpleName())));
                        aVar = new AbstractC30694b.a("OSActionHandler received non-OSAction", action, null, 4, null);
                    }
                    c42301a.f132229y = null;
                    c42301a.f132223E = null;
                    c42301a.f132224F = null;
                    c42301a.f132225G = null;
                    c42301a.f132226H = 0;
                    c42301a.f132228x = 1;
                    if (interfaceC13062m.emit(aVar, c42301a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C31873c c31873c) {
            this.f132219w = interfaceC13058l;
            this.f132220x = c31873c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f132219w.collect(new C42300a(interfaceC13062m, this.f132220x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C31873c(Context context, InterfaceC31766c crashReporter, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(logger, "logger");
        this.context = context;
        this.crashReporter = crashReporter;
        this.logger = logger;
        this.actionTypes = AbstractC12350b.m34570S(AbstractC22671h0.f89337a.getOrCreateKotlinClass(OSAction.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final AbstractC30694b m99082i(OSAction action, AddToCalendarParameters parameters) {
        boolean zM68201a = C23552a.f93401a.m68201a(this.context, parameters.getTitle(), parameters.getStartDate().getTime(), parameters.getEndDate().getTime(), parameters.getLocation(), parameters.getNotes(), 268435456);
        if (zM68201a && action.getOnSuccess() != null) {
            return new AbstractC30694b.b(action.getOnSuccess(), action);
        }
        if (zM68201a) {
            return new AbstractC30694b.n(action);
        }
        return action.getOnError() != null ? new AbstractC30694b.b(action.getOnError(), action) : new AbstractC30694b.a("Failed to open calendar app", action, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final AbstractC30694b m99083j(OSAction action, DialPhoneNumberParameters parameters) {
        boolean zM121100a = C37671a.f161420a.m121100a(this.context, parameters.getPhoneNumber(), 268435456);
        if (zM121100a && action.getOnSuccess() != null) {
            return new AbstractC30694b.b(action.getOnSuccess(), action);
        }
        if (zM121100a) {
            return new AbstractC30694b.n(action);
        }
        return action.getOnError() != null ? new AbstractC30694b.b(action.getOnError(), action) : new AbstractC30694b.a("Failed to open dialer app", action, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final AbstractC30694b m99084k(OSAction action, PermissionParameters parameters) {
        if (parameters.getPermission() != PermissionType.UNKNOWN) {
            return new AbstractC30694b.h(parameters.getPermission(), action.getOnSuccess(), action);
        }
        this.logger.mo85226q("Ignoring OS_ACTION/PERMISSION with unrecognized permission type", new AbstractC30556a.a[0]);
        GenericInteraction genericInteraction = parameters.getOnError().get(ActionErrorCode.UNKNOWN);
        return genericInteraction != null ? new AbstractC30694b.b(genericInteraction, action) : new AbstractC30694b.a("Unrecognized permission type", action, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final AbstractC30694b m99085l(OSAction action, PickMediaParameters parameters) {
        if (parameters.getMediaTypes().contains(PickMediaType.IMAGE)) {
            return new AbstractC30694b.e(parameters.getStateKey(), parameters.getSource(), action.getOnSuccess(), action.getOnError(), action);
        }
        return action.getOnError() != null ? new AbstractC30694b.b(action.getOnError(), action) : new AbstractC30694b.a("Unsupported media kind for PICK_MEDIA", action, null, 4, null);
    }

    @Override // rw2.InterfaceC31871a
    /* JADX INFO: renamed from: a */
    public Set<InterfaceC21461d> mo28414a() {
        return this.actionTypes;
    }

    @Override // rw2.InterfaceC31871a
    /* JADX INFO: renamed from: b */
    public InterfaceC13058l mo28415b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }

    @Override // rw2.InterfaceC31871a, od1.InterfaceC27844g
    public /* bridge */ InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return super.interact(interfaceC13058l);
    }

    public /* synthetic */ C31873c(Context context, InterfaceC31766c interfaceC31766c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC31766c, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("OSActionHandler") : interfaceC34116n);
    }
}
