package vv2;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.navigation.AiCoachChatScreenModel;
import com.whoop.navigation.CoachScreenModel;
import com.whoop.weightlifting.StrengthTrainerDestination;
import dp0.InterfaceC12251g;
import du2.AbstractC12378b;
import fi0.InterfaceC14515a;
import hc3.AbstractC17182o;
import j02.InterfaceC21159o0;
import kc3.C22365e;
import l83.C23454a0;
import p114eb.AbstractC12939a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv2.InterfaceC35284a;

/* JADX INFO: renamed from: vv2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lvv2/a;", "", "Leb/a0;", "strengthTrainerNavController", "globalNavController", "Landroid/content/Context;", "context", "Lfi0/a;", "analytics", "Lj02/o0;", "appNavigator", "Ldp0/g;", "globalCoachManager", "Lbc3/c0;", "scope", "<init>", "(Leb/a0;Leb/a0;Landroid/content/Context;Lfi0/a;Lj02/o0;Ldp0/g;Lbc3/c0;)V", "Luv2/a$g;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Luv2/a$g;)V", "a", "Leb/a0;", "c", "Landroid/content/Context;", "d", "Lfi0/a;", "e", "Lj02/o0;", "f", "Ldp0/g;", "g", "Lbc3/c0;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36535a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 strengthTrainerNavController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 globalNavController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC21159o0 appNavigator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC12251g globalCoachManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: vv2.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.linkworkouts.view.LinkWorkoutNavigationRouter$route$1", m100430f = "LinkWorkoutNavigationRouter.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f156421w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36535a.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f156421w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC12251g.m34132f(C36535a.this.globalCoachManager, 0L, null, null, 7, null);
            return C23454a0.f92919a;
        }
    }

    public C36535a(AbstractC12939a0 strengthTrainerNavController, AbstractC12939a0 globalNavController, Context context, InterfaceC14515a analytics, InterfaceC21159o0 appNavigator, InterfaceC12251g globalCoachManager, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(strengthTrainerNavController, "strengthTrainerNavController");
        AbstractC22676k.m65750j(globalNavController, "globalNavController");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(appNavigator, "appNavigator");
        AbstractC22676k.m65750j(globalCoachManager, "globalCoachManager");
        AbstractC22676k.m65750j(scope, "scope");
        this.strengthTrainerNavController = strengthTrainerNavController;
        this.globalNavController = globalNavController;
        this.context = context;
        this.analytics = analytics;
        this.appNavigator = appNavigator;
        this.globalCoachManager = globalCoachManager;
        this.scope = scope;
    }

    /* JADX INFO: renamed from: b */
    public final void m117090b(InterfaceC35284a.g event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC35284a.a) {
            AbstractC12378b.m34735e(this.analytics);
            this.globalNavController.m36410z();
            return;
        }
        if (event instanceof InterfaceC35284a.e) {
            AbstractC12378b.m34737g(this.analytics);
            StrengthTrainerDestination.C10743f.f32781a.m28092d(this.strengthTrainerNavController, true);
            return;
        }
        if (event instanceof InterfaceC35284a.f) {
            InterfaceC35284a.f fVar = (InterfaceC35284a.f) event;
            AbstractC12378b.m34736f(this.analytics, fVar.getTemplateId(), fVar.getTemplateName().resolve(this.context).toString());
            StrengthTrainerDestination.C10741d.m28056n(StrengthTrainerDestination.C10741d.f32764a, this.strengthTrainerNavController, fVar.getTemplateId(), null, null, false, false, null, 58, null);
        } else {
            if (!(event instanceof InterfaceC35284a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC35284a.c cVar = (InterfaceC35284a.c) event;
            if (!(cVar.getNavigationAction().getParameters() instanceof CoachScreenModel) && !(cVar.getNavigationAction().getParameters() instanceof AiCoachChatScreenModel)) {
                this.appNavigator.mo59392a(cVar.getNavigationAction());
            } else {
                AbstractC12378b.m34734d(this.analytics);
                AbstractC3006f0.m8732z(this.scope, null, null, new a(null), 3);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C36535a(AbstractC12939a0 abstractC12939a0, AbstractC12939a0 abstractC12939a1, Context context, InterfaceC14515a interfaceC14515a, InterfaceC21159o0 interfaceC21159o0, InterfaceC12251g interfaceC12251g, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC2994c0 interfaceC2994c0M8708b;
        if ((i13 & 64) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC2994c0M8708b = AbstractC3006f0.m8708b(AbstractC17182o.f65999a);
        } else {
            interfaceC2994c0M8708b = interfaceC2994c0;
        }
        this(abstractC12939a0, abstractC12939a1, context, interfaceC14515a, interfaceC21159o0, interfaceC12251g, interfaceC2994c0M8708b);
    }
}
