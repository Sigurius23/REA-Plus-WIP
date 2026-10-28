package uu2;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.AiCoachChatScreenModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CoachScreenModel;
import com.whoop.navigation.CommonNavigationScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.models.GenericInteraction;
import cu2.EnumC11122b;
import dp0.InterfaceC12251g;
import du2.AbstractC12377a;
import e51.AbstractC12732h;
import ep0.C13404j;
import fi0.InterfaceC14515a;
import j02.InterfaceC21159o0;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import m83.C25272z;
import ny0.C27256h;
import p114eb.AbstractC12939a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qi0.C30406a;
import r83.EnumC31071a;
import rv2.InterfaceC31846d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sg2.C32451b;
import sv2.AbstractC33042e;
import v71.AbstractC35769j;

/* JADX INFO: renamed from: uu2.s */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a_\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00050\n2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\n2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a_\u0010\u0019\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0014\u0010\u0013\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00050\n2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\n2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0000¢\u0006\u0004\b\u0019\u0010\u0018\u001aC\u0010%\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0000¢\u0006\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lcu2/b;", "entryPointType", "Leb/a0;", "navController", "globalNavController", "Ll83/a0;", "c", "(Lcu2/b;Leb/a0;Leb/a0;)V", "", "viewEvent", "Lkotlin/Function1;", "Luu2/p;", "onExerciseDetailsV2Event", "e", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "raw", "Lqi0/a;", "actionRouter", "Lcom/whoop/design/models/modal/AnyModal;", "setPresentedModal", "Lcom/whoop/navigation/e;", "onNavigationAction", "onEvent", "b", "(Ljava/lang/Object;Lqi0/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "g", "destination", "Lj02/o0;", "appNavigator", "Ldp0/g;", "globalCoachManager", "Lbc3/c0;", "coroutineScope", "Lfi0/a;", "baseAnalytics", "Luu2/m;", "analyticsContext", "d", "(Lcom/whoop/navigation/e;Lj02/o0;Ldp0/g;Lbc3/c0;Lfi0/a;Luu2/m;)V", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35268s {

    /* JADX INFO: renamed from: uu2.s$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f150056a;

        static {
            int[] iArr = new int[EnumC11122b.values().length];
            try {
                iArr[EnumC11122b.EXTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f150056a = iArr;
        }
    }

    /* JADX INFO: renamed from: uu2.s$b */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsV2NavigationKt$handleExerciseDetailsBackendNavigation$2$1", m100430f = "ExerciseDetailsV2Navigation.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150057w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC12251g f150058x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC12251g interfaceC12251g, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150058x = interfaceC12251g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f150058x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f150057w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC12251g.m34132f(this.f150058x, 0L, null, null, 7, null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m111860b(Object raw, C30406a c30406a, Function1 setPresentedModal, Function1 onNavigationAction, Function1 onEvent) {
        AbstractC22676k.m65750j(raw, "raw");
        AbstractC22676k.m65750j(setPresentedModal, "setPresentedModal");
        AbstractC22676k.m65750j(onNavigationAction, "onNavigationAction");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        if (raw instanceof AbstractC35769j.a) {
            m111860b(((AbstractC35769j.a) raw).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), c30406a, setPresentedModal, onNavigationAction, onEvent);
            return;
        }
        if ((raw instanceof GenericInteraction) || (raw instanceof DesignItemInteraction)) {
            C35266q.f150053a.m111850j(c30406a, raw, setPresentedModal, onEvent, onNavigationAction);
            return;
        }
        if (raw instanceof C9598e) {
            onNavigationAction.invoke(raw);
            return;
        }
        if (!(raw instanceof C27256h)) {
            m111863e(raw, onEvent);
        } else if (((C27256h) raw).getActionArgument() instanceof AnyModal) {
            C35266q.f150053a.m111850j(c30406a, raw, setPresentedModal, onEvent, onNavigationAction);
        } else {
            m111863e(raw, onEvent);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m111861c(EnumC11122b entryPointType, AbstractC12939a0 navController, AbstractC12939a0 globalNavController) {
        AbstractC22676k.m65750j(entryPointType, "entryPointType");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(globalNavController, "globalNavController");
        if (a.f150056a[entryPointType.ordinal()] == 1) {
            if (globalNavController.m36410z()) {
                return;
            }
            navController.m36410z();
        } else {
            if (navController.m36410z()) {
                return;
            }
            globalNavController.m36410z();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m111862d(C9598e destination, InterfaceC21159o0 interfaceC21159o0, InterfaceC12251g globalCoachManager, InterfaceC2994c0 coroutineScope, InterfaceC14515a baseAnalytics, C35262m c35262m) {
        C13404j c13404j;
        AbstractC22676k.m65750j(destination, "destination");
        AbstractC22676k.m65750j(globalCoachManager, "globalCoachManager");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        NavigationScreenModel parameters = destination.getParameters();
        if (!(parameters instanceof CoachScreenModel) && !(parameters instanceof AiCoachChatScreenModel)) {
            if (interfaceC21159o0 != null) {
                interfaceC21159o0.mo59392a(C9598e.m23127b(destination, null, AbstractC12377a.m34730b(destination.getParameters()), null, 5, null));
                return;
            }
            return;
        }
        if (c35262m != null) {
            AbstractC35263n.m111829g(baseAnalytics, c35262m);
        }
        CommonNavigationScreenModel commonNavigationScreenModel = (CommonNavigationScreenModel) parameters;
        boolean z4 = commonNavigationScreenModel instanceof CoachScreenModel;
        C25272z c25272z = C25272z.f99163w;
        if (z4) {
            CoachScreenModel coachScreenModel = (CoachScreenModel) parameters;
            String source = coachScreenModel.getSource();
            if (source == null || source.length() == 0) {
                source = null;
            }
            if (source == null) {
                source = "exercise_details";
            }
            String str = source;
            String sourceType = coachScreenModel.getSourceType();
            String conversationSeedId = coachScreenModel.getConversationSeedId();
            String entryText = coachScreenModel.getEntryText();
            String presetQuestion = coachScreenModel.getPresetQuestion();
            boolean includeInitialMessage = coachScreenModel.getIncludeInitialMessage();
            String sourceId = coachScreenModel.getSourceId();
            Map<String, JsonElement> args = coachScreenModel.getArgs();
            c13404j = new C13404j(null, null, true, null, sourceType, sourceId, conversationSeedId, null, entryText, null, null, presetQuestion, null, includeInitialMessage, null, null, args == null ? c25272z : args, str, false, null, null, null, false, 8181387, null);
        } else if (commonNavigationScreenModel instanceof AiCoachChatScreenModel) {
            AiCoachChatScreenModel aiCoachChatScreenModel = (AiCoachChatScreenModel) parameters;
            String sourceType2 = aiCoachChatScreenModel.getSourceType();
            String fingerprint = aiCoachChatScreenModel.getFingerprint();
            String staticInitialMessage = aiCoachChatScreenModel.getStaticInitialMessage();
            String sourceId2 = aiCoachChatScreenModel.getSourceId();
            Map<String, JsonElement> args2 = aiCoachChatScreenModel.getArgs();
            c13404j = new C13404j(null, null, true, null, sourceType2, sourceId2, null, fingerprint, staticInitialMessage, null, null, null, null, false, null, null, args2 == null ? c25272z : args2, "exercise_details", false, null, null, null, false, 8191563, null);
        } else {
            c13404j = null;
        }
        if (c13404j != null) {
            globalCoachManager.mo34145t(true, c13404j);
            AbstractC3006f0.m8732z(coroutineScope, null, null, new b(globalCoachManager, null), 3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m111863e(Object viewEvent, Function1 onExerciseDetailsV2Event) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC22676k.m65750j(onExerciseDetailsV2Event, "onExerciseDetailsV2Event");
        AbstractC33042e.m104530n1(viewEvent, false, new C32451b(onExerciseDetailsV2Event, 27), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m111864f(Function1 function1, InterfaceC31846d libraryEvent) {
        AbstractC22676k.m65750j(libraryEvent, "libraryEvent");
        if (libraryEvent instanceof InterfaceC31846d.a) {
            function1.invoke(new InterfaceC35265p.a(((InterfaceC31846d.a) libraryEvent).getDestination()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static final void m111865g(Object viewEvent, C30406a c30406a, Function1 setPresentedModal, Function1 onNavigationAction, Function1 onEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC22676k.m65750j(setPresentedModal, "setPresentedModal");
        AbstractC22676k.m65750j(onNavigationAction, "onNavigationAction");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        if (viewEvent instanceof AbstractC12732h.a) {
            viewEvent = ((AbstractC12732h.a) viewEvent).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        }
        m111860b(viewEvent, c30406a, setPresentedModal, onNavigationAction, onEvent);
    }
}
