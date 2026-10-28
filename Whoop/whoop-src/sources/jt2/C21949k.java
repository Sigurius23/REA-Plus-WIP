package jt2;

import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel;
import com.whoop.design.models.items.GoalSettingsTileModel;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.ToggleContent;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import com.whoop.weeklyplan.hubandspoke.domain.api.Activity;
import com.whoop.weeklyplan.hubandspoke.domain.api.Behavior;
import com.whoop.weeklyplan.hubandspoke.domain.api.Goal;
import com.whoop.weeklyplan.hubandspoke.domain.api.HubAndSpokeResponse;
import com.whoop.weeklyplan.hubandspoke.domain.api.InitialSelection;
import com.whoop.weeklyplan.hubandspoke.domain.api.MetaData;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sw0.AbstractC33051h;
import sw0.C33050g;

/* JADX INFO: renamed from: jt2.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B§\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0003H\u0000¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010:R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010<R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010<R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010<R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010<¨\u0006C"}, m65681d2 = {"Ljt2/k;", "Lod1/g;", "Ljt2/l;", "Ljt2/j;", "Ljt2/f;", "apiInteractor", "Ljt2/n;", "metricSelectorInteractor", "Ljt2/o;", "hubAndSpokeSliderInteractor", "Ljt2/e;", "hubAndSpokeActivitiesInteractor", "Ljt2/g;", "hubAndSpokeBehaviorsInteractor", "Ljt2/i;", "bottomSheetInteractor", "Ljt2/q;", "metricSliderMatcher", "", "locked", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;", "screenArgsInitialSelection", "", "source", "presetPlanCategory", "planTitle", "description", "explanationTitle", "explanation", "templateId", "<init>", "(Ljt2/f;Ljt2/n;Ljt2/o;Ljt2/e;Ljt2/g;Ljt2/i;Ljt2/q;ZLcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;", "result", "combinedDomainState", "Ljt2/d;", "i", "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;Ljt2/j;)Ljt2/d;", "a", "Ljt2/f;", "b", "Ljt2/n;", "c", "Ljt2/o;", "d", "Ljt2/e;", "e", "Ljt2/g;", "f", "Ljt2/i;", "g", "Ljt2/q;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;", "j", "Ljava/lang/String;", "k", "l", "m", "n", "o", "p", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21949k implements InterfaceC27844g<AbstractC21950l, C21948j> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21944f apiInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21952n metricSelectorInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21953o hubAndSpokeSliderInteractor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C21943e hubAndSpokeActivitiesInteractor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C21945g hubAndSpokeBehaviorsInteractor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C21947i bottomSheetInteractor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C21955q metricSliderMatcher;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean locked;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InitialSelection screenArgsInitialSelection;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final String presetPlanCategory;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String planTitle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final String explanationTitle;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String explanation;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final String templateId;

    /* JADX INFO: renamed from: jt2.k$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.domain.HubAndSpokeCombiner$interact$$inlined$flatMapLatest$1", m100430f = "HubAndSpokeCombiner.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f84809w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f84810x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f84811y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21949k f84812z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C21949k c21949k) {
            super(3, interfaceC30057d);
            this.f84812z = c21949k;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC21950l abstractC21950l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f84812z);
            aVar.f84810x = interfaceC13062m;
            aVar.f84811y = abstractC21950l;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lInteract;
            C0456u c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f84809w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f84810x;
                AbstractC21950l abstractC21950l = (AbstractC21950l) this.f84811y;
                if (abstractC21950l instanceof AbstractC21950l.d) {
                    interfaceC13058lInteract = this.f84812z.apiInteractor.interact(new C0456u(abstractC21950l, 1));
                } else if (abstractC21950l instanceof AbstractC21950l.g) {
                    AbstractC21950l.g gVar = (AbstractC21950l.g) abstractC21950l;
                    interfaceC13058lInteract = this.f84812z.apiInteractor.interact(new C0456u(new AbstractC21950l.g(gVar.getPlanId(), gVar.getPlanName(), gVar.getIsCustomized(), gVar.getMigrateSmartAlarm(), gVar.m62616g(), gVar.m62611b(), gVar.m62610a(), gVar.getSource(), gVar.getPresetPlanCategory(), gVar.getTemplateId()), 1));
                } else if (abstractC21950l instanceof AbstractC21950l.f) {
                    interfaceC13058lInteract = new C0456u(new AbstractC21954p.i(((AbstractC21950l.f) abstractC21950l).getSliderScreen()), 1);
                } else if (abstractC21950l instanceof AbstractC21950l.a) {
                    interfaceC13058lInteract = new C0456u(new AbstractC21954p.a(((AbstractC21950l.a) abstractC21950l).getId()), 1);
                } else if (abstractC21950l instanceof AbstractC21950l.m) {
                    interfaceC13058lInteract = new C0456u(new AbstractC21954p.r(((AbstractC21950l.m) abstractC21950l).getId()), 1);
                } else {
                    if (AbstractC22676k.m65745e(abstractC21950l, AbstractC21950l.k.f84837a)) {
                        c0456u = new C0456u(AbstractC21954p.n.f84882a, 1);
                    } else if (abstractC21950l instanceof AbstractC21950l.q) {
                        interfaceC13058lInteract = new C0456u(new AbstractC21954p.w(((AbstractC21950l.q) abstractC21950l).getTargetGoalType()), 1);
                    } else if (abstractC21950l instanceof AbstractC21950l.s) {
                        AbstractC21950l.s sVar = (AbstractC21950l.s) abstractC21950l;
                        interfaceC13058lInteract = new C0456u(new AbstractC21954p.y(sVar.getTargetGoalType(), sVar.getValue()), 1);
                    } else if (abstractC21950l instanceof AbstractC21950l.l) {
                        AbstractC21950l.l lVar = (AbstractC21950l.l) abstractC21950l;
                        interfaceC13058lInteract = new C0456u(new AbstractC21954p.o(lVar.getSavedValue(), lVar.getTargetGoalType()), 1);
                    } else if (abstractC21950l instanceof AbstractC21950l.o) {
                        AbstractC21950l.o oVar = (AbstractC21950l.o) abstractC21950l;
                        interfaceC13058lInteract = new C0456u(new AbstractC21954p.u(oVar.getId(), oVar.getIsToggled(), oVar.getSelectedDay()), 1);
                    } else if (abstractC21950l instanceof AbstractC21950l.p) {
                        AbstractC21950l.p pVar = (AbstractC21950l.p) abstractC21950l;
                        interfaceC13058lInteract = new C0456u(new AbstractC21954p.v(pVar.getId(), pVar.getIsToggled(), pVar.getIsAvoid(), pVar.getSelectedDay()), 1);
                    } else if (abstractC21950l instanceof AbstractC21950l.e) {
                        interfaceC13058lInteract = new C0456u(new AbstractC21954p.h(((AbstractC21950l.e) abstractC21950l).getBottomSheetType()), 1);
                    } else if (abstractC21950l instanceof AbstractC21950l.c) {
                        AbstractC21950l.c cVar = (AbstractC21950l.c) abstractC21950l;
                        interfaceC13058lInteract = new C0456u(new AbstractC21954p.e(cVar.getBottomSheetType(), cVar.getCategoryIndex()), 1);
                    } else if (abstractC21950l instanceof AbstractC21950l.j) {
                        interfaceC13058lInteract = new C0456u(new AbstractC21954p.l(((AbstractC21950l.j) abstractC21950l).getBottomSheetType()), 1);
                    } else if (abstractC21950l instanceof AbstractC21950l.n) {
                        AbstractC21950l.n nVar = (AbstractC21950l.n) abstractC21950l;
                        interfaceC13058lInteract = new C0456u(new AbstractC21954p.t(nVar.getBottomSheetType(), nVar.getId()), 1);
                    } else if (abstractC21950l instanceof AbstractC21950l.r) {
                        AbstractC21950l.r rVar = (AbstractC21950l.r) abstractC21950l;
                        interfaceC13058lInteract = new C0456u(new AbstractC21954p.x(rVar.getBottomSheetType(), rVar.getQuery()), 1);
                    } else if (AbstractC22676k.m65745e(abstractC21950l, AbstractC21950l.h.f84834a)) {
                        c0456u = new C0456u(AbstractC21954p.j.f84878a, 1);
                    } else if (AbstractC22676k.m65745e(abstractC21950l, AbstractC21950l.i.f84835a)) {
                        c0456u = new C0456u(AbstractC21954p.k.f84879a, 1);
                    } else {
                        if (!(abstractC21950l instanceof AbstractC21950l.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC13058lInteract = this.f84812z.apiInteractor.interact(new C0456u(new AbstractC21950l.b(((AbstractC21950l.b) abstractC21950l).getPlanId()), 1));
                    }
                    interfaceC13058lInteract = c0456u;
                }
                this.f84810x = null;
                this.f84811y = null;
                this.f84809w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lInteract, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC21950l) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: jt2.k$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.domain.HubAndSpokeCombiner$interact$2", m100430f = "HubAndSpokeCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ljt2/j;", "domainState", "Ljt2/p;", "internalAction", "<anonymous>", "(Ljt2/j;Ljt2/p;)Ljt2/j;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f84813w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f84814x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f84815y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C21948j c21948j, AbstractC21954p abstractC21954p, InterfaceC30057d<? super C21948j> interfaceC30057d) {
            b bVar = C21949k.this.new b(interfaceC30057d);
            bVar.f84814x = c21948j;
            bVar.f84815y = abstractC21954p;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C21948j c21948j = (C21948j) this.f84814x;
            AbstractC21954p abstractC21954p = (AbstractC21954p) this.f84815y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f84813w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC21954p instanceof AbstractC21954p.s) {
                HubAndSpokeResponse hubAndSpokeResponseM62657a = ((AbstractC21954p.s) abstractC21954p).getResult();
                MetaData metadata = hubAndSpokeResponseM62657a.getMetadata();
                AbstractC21951m.i iVar = new AbstractC21951m.i(hubAndSpokeResponseM62657a, metadata != null ? metadata.getAiContextMetadata() : null);
                C21949k c21949k = C21949k.this;
                MetaData metadata2 = hubAndSpokeResponseM62657a.getMetadata();
                return c21948j.m62592a(iVar, c21949k.m62601i(hubAndSpokeResponseM62657a, C21948j.m62591b(c21948j, new AbstractC21951m.i(hubAndSpokeResponseM62657a, metadata2 != null ? metadata2.getAiContextMetadata() : null), null, 2, null)));
            }
            if (abstractC21954p instanceof AbstractC21954p.i) {
                AbstractC21954p.i iVar2 = (AbstractC21954p.i) abstractC21954p;
                return C21948j.m62591b(c21948j, null, C21942d.m62534b(c21948j.getAccumulatedStateForVS(), null, iVar2.getSliderScreen() ? c21948j.getAccumulatedStateForVS().m62553t() : c21948j.getAccumulatedStateForVS().m62538e(), null, null, c21948j.getAccumulatedStateForVS().m62551r(), null, iVar2.getSliderScreen() ? c21948j.getAccumulatedStateForVS().m62543j() : c21948j.getAccumulatedStateForVS().m62549p(), null, null, iVar2.getSliderScreen() ? c21948j.getAccumulatedStateForVS().m62544k() : c21948j.getAccumulatedStateForVS().m62550q(), null, false, null, false, null, null, null, null, null, null, null, 2096557, null), 1, null);
            }
            if (!(abstractC21954p instanceof AbstractC21954p.a) && !(abstractC21954p instanceof AbstractC21954p.r) && !(abstractC21954p instanceof AbstractC21954p.n)) {
                if (!(abstractC21954p instanceof AbstractC21954p.w) && !(abstractC21954p instanceof AbstractC21954p.y) && !(abstractC21954p instanceof AbstractC21954p.o)) {
                    if (abstractC21954p instanceof AbstractC21954p.u) {
                        return C21949k.this.hubAndSpokeActivitiesInteractor.m62558a(abstractC21954p, c21948j);
                    }
                    if (abstractC21954p instanceof AbstractC21954p.v) {
                        return C21949k.this.hubAndSpokeBehaviorsInteractor.m62572a(abstractC21954p, c21948j);
                    }
                    if (abstractC21954p instanceof AbstractC21954p.j) {
                        return C21949k.this.hubAndSpokeActivitiesInteractor.m62558a(abstractC21954p, c21948j);
                    }
                    if (abstractC21954p instanceof AbstractC21954p.k) {
                        return C21949k.this.hubAndSpokeBehaviorsInteractor.m62572a(abstractC21954p, c21948j);
                    }
                    if (abstractC21954p instanceof AbstractC21954p.f) {
                        return C21948j.m62591b(c21948j, AbstractC21951m.d.f84858a, null, 2, null);
                    }
                    if (AbstractC22676k.m65745e(abstractC21954p, AbstractC21954p.g.f84875a)) {
                        return C21948j.m62591b(c21948j, AbstractC21951m.e.f84859a, null, 2, null);
                    }
                    if (AbstractC22676k.m65745e(abstractC21954p, AbstractC21954p.q.f84886a)) {
                        return C21948j.m62591b(c21948j, AbstractC21951m.h.f84862a, null, 2, null);
                    }
                    if (!(abstractC21954p instanceof AbstractC21954p.x) && !(abstractC21954p instanceof AbstractC21954p.e) && !(abstractC21954p instanceof AbstractC21954p.t) && !(abstractC21954p instanceof AbstractC21954p.h) && !(abstractC21954p instanceof AbstractC21954p.l)) {
                        if (AbstractC22676k.m65745e(abstractC21954p, AbstractC21954p.p.f84885a)) {
                            return C21948j.m62591b(c21948j, AbstractC21951m.g.f84861a, null, 2, null);
                        }
                        if (AbstractC22676k.m65745e(abstractC21954p, AbstractC21954p.m.f84881a)) {
                            return C21948j.m62591b(c21948j, AbstractC21951m.f.f84860a, null, 2, null);
                        }
                        if (AbstractC22676k.m65745e(abstractC21954p, AbstractC21954p.c.f84870a)) {
                            return C21948j.m62591b(c21948j, AbstractC21951m.b.f84856a, null, 2, null);
                        }
                        if (AbstractC22676k.m65745e(abstractC21954p, AbstractC21954p.d.f84871a)) {
                            return C21948j.m62591b(c21948j, AbstractC21951m.c.f84857a, null, 2, null);
                        }
                        if (abstractC21954p instanceof AbstractC21954p.b) {
                            return C21948j.m62591b(c21948j, new AbstractC21951m.a(((AbstractC21954p.b) abstractC21954p).getPlanId()), null, 2, null);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return C21949k.this.bottomSheetInteractor.m62589g(abstractC21954p, c21948j);
                }
                return C21949k.this.hubAndSpokeSliderInteractor.m62645a(abstractC21954p, c21948j);
            }
            return C21949k.this.metricSelectorInteractor.m62641a(abstractC21954p, c21948j);
        }
    }

    public C21949k(C21944f apiInteractor, C21952n metricSelectorInteractor, C21953o hubAndSpokeSliderInteractor, C21943e hubAndSpokeActivitiesInteractor, C21945g hubAndSpokeBehaviorsInteractor, C21947i bottomSheetInteractor, C21955q metricSliderMatcher, boolean z4, InitialSelection initialSelection, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC22676k.m65750j(apiInteractor, "apiInteractor");
        AbstractC22676k.m65750j(metricSelectorInteractor, "metricSelectorInteractor");
        AbstractC22676k.m65750j(hubAndSpokeSliderInteractor, "hubAndSpokeSliderInteractor");
        AbstractC22676k.m65750j(hubAndSpokeActivitiesInteractor, "hubAndSpokeActivitiesInteractor");
        AbstractC22676k.m65750j(hubAndSpokeBehaviorsInteractor, "hubAndSpokeBehaviorsInteractor");
        AbstractC22676k.m65750j(bottomSheetInteractor, "bottomSheetInteractor");
        AbstractC22676k.m65750j(metricSliderMatcher, "metricSliderMatcher");
        this.apiInteractor = apiInteractor;
        this.metricSelectorInteractor = metricSelectorInteractor;
        this.hubAndSpokeSliderInteractor = hubAndSpokeSliderInteractor;
        this.hubAndSpokeActivitiesInteractor = hubAndSpokeActivitiesInteractor;
        this.hubAndSpokeBehaviorsInteractor = hubAndSpokeBehaviorsInteractor;
        this.bottomSheetInteractor = bottomSheetInteractor;
        this.metricSliderMatcher = metricSliderMatcher;
        this.locked = z4;
        this.screenArgsInitialSelection = initialSelection;
        this.source = str;
        this.presetPlanCategory = str2;
        this.planTitle = str3;
        this.description = str4;
        this.explanationTitle = str5;
        this.explanation = str6;
        this.templateId = str7;
    }

    /* JADX WARN: Code duplicated, block: B:223:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:264:0x05d4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v2, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX INFO: renamed from: i */
    public final C21942d m62601i(HubAndSpokeResponse result, C21948j combinedDomainState) {
        int i13;
        ?? r10;
        List<Activity> activityGoals;
        ?? r14;
        ?? r15;
        List<Behavior> behaviorGoals;
        List<Goal> targetGoals;
        C33050g c33050g;
        Object obj;
        C33050g c33050g2;
        ToggleContent toggles;
        CustomizeBottomSheetSelectorModel bottomSheet;
        ?? arrayList;
        ToggleContent toggles2;
        List<GoalSettingsTileModel> initialToggles;
        ToggleContent toggles3;
        List<GoalSettingsTileModel> topInitialToggles;
        ToggleContent toggles4;
        CustomizeBottomSheetSelectorModel bottomSheet2;
        ?? arrayList2;
        ?? arrayList3;
        ToggleContent toggles5;
        List<GoalSettingsTileModel> initialToggles2;
        ToggleContent toggles6;
        List<GoalSettingsTileModel> topInitialToggles2;
        List<Behavior> behaviorGoals2;
        boolean z4;
        ToggleContent toggles7;
        List<GoalSettingsTileModel> initialToggles3;
        ToggleContent toggles8;
        List<GoalSettingsTileModel> topInitialToggles3;
        List<Activity> activityGoals2;
        Object next;
        int iIntValue;
        boolean z13;
        ToggleContent toggles9;
        List<GoalSettingsTileModel> initialToggles4;
        ToggleContent toggles10;
        AbstractC22676k.m65750j(result, "result");
        AbstractC22676k.m65750j(combinedDomainState, "combinedDomainState");
        Iterator it = result.getGoalScreens().iterator();
        boolean z14 = false;
        Object obj2 = null;
        while (true) {
            i13 = 1;
            if (!it.hasNext()) {
                if (!z14) {
                    break;
                }
                break;
            }
            Object next2 = it.next();
            if (((WeeklyPlanCustomizationScreenModel) next2).getGoal() == TargetGoalType.ACTIVITIES) {
                if (!z14) {
                    obj2 = next2;
                    z14 = true;
                }
            }
            obj2 = null;
            break;
        }
        WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel = (WeeklyPlanCustomizationScreenModel) obj2;
        List<GoalSettingsTileModel> topInitialToggles4 = (weeklyPlanCustomizationScreenModel == null || (toggles10 = weeklyPlanCustomizationScreenModel.getToggles()) == null) ? null : toggles10.getTopInitialToggles();
        ?? arrayList4 = C25271y.f99162w;
        ?? r16 = topInitialToggles4;
        if (topInitialToggles4 == null) {
            r16 = arrayList4;
        }
        Collection collection = (Collection) r16;
        if (weeklyPlanCustomizationScreenModel == null || (toggles9 = weeklyPlanCustomizationScreenModel.getToggles()) == null) {
            r10 = 0;
        } else {
            initialToggles4 = toggles9.getInitialToggles();
        }
        if (r10 == 0) {
            r10 = initialToggles4;
            r10 = arrayList4;
        }
        r10 = initialToggles4;
        ArrayList<GoalSettingsTileModel> arrayListM74129g1 = AbstractC25265s.m74129g1(collection, (Iterable) r10);
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(arrayListM74129g1, 10));
        for (GoalSettingsTileModel goalSettingsTileModel : arrayListM74129g1) {
            InitialSelection initialSelection = this.screenArgsInitialSelection;
            if (initialSelection == null || (activityGoals2 = initialSelection.getActivityGoals()) == null) {
                activityGoals2 = result.getInitialSelection().getActivityGoals();
            }
            String id4 = goalSettingsTileModel.getId();
            List<Activity> list = activityGoals2;
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!AbstractC22676k.m65745e(((Activity) next).getActivityType(), goalSettingsTileModel.getId()));
            Activity activity = (Activity) next;
            if (activity != null) {
                iIntValue = activity.getDays();
            } else {
                Integer selectedValue = goalSettingsTileModel.getSelectedValue();
                iIntValue = selectedValue != null ? selectedValue.intValue() : 1;
            }
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z13 = false;
                        break;
                    }
                    if (AbstractC22676k.m65745e(((Activity) it4.next()).getActivityType(), goalSettingsTileModel.getId())) {
                        z13 = true;
                        break;
                    }
                }
            } else {
                z13 = false;
                break;
                break;
            }
            arrayList5.add(new C21939a(id4, z13, iIntValue));
        }
        InitialSelection initialSelection2 = this.screenArgsInitialSelection;
        if (initialSelection2 == null || (activityGoals = initialSelection2.getActivityGoals()) == null) {
            activityGoals = result.getInitialSelection().getActivityGoals();
        }
        List<Activity> list2 = activityGoals;
        ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (Activity activity2 : list2) {
            arrayList6.add(new C21939a(activity2.getActivityType(), true, activity2.getDays()));
        }
        ArrayList arrayListM74129g2 = AbstractC25265s.m74129g1(arrayList6, arrayList5);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayListM74129g2) {
            String activityType = ((C21939a) obj3).getActivityType();
            Object arrayList7 = linkedHashMap.get(activityType);
            if (arrayList7 == null) {
                arrayList7 = new ArrayList();
                linkedHashMap.put(activityType, arrayList7);
            }
            ((List) arrayList7).add(obj3);
        }
        ArrayList arrayList8 = new ArrayList(linkedHashMap.size());
        Iterator it5 = linkedHashMap.entrySet().iterator();
        while (it5.hasNext()) {
            arrayList8.add((C21939a) AbstractC25265s.m74096F0((List) ((Map.Entry) it5.next()).getValue()));
        }
        Iterator it6 = result.getGoalScreens().iterator();
        boolean z15 = false;
        Object obj4 = null;
        while (true) {
            if (!it6.hasNext()) {
                if (!z15) {
                    break;
                }
                break;
            }
            Object next3 = it6.next();
            if (((WeeklyPlanCustomizationScreenModel) next3).getGoal() == TargetGoalType.BEHAVIORS) {
                if (!z15) {
                    z15 = true;
                    obj4 = next3;
                }
            }
            obj4 = null;
            break;
        }
        WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel2 = (WeeklyPlanCustomizationScreenModel) obj4;
        if (weeklyPlanCustomizationScreenModel2 == null || (toggles8 = weeklyPlanCustomizationScreenModel2.getToggles()) == null) {
            r14 = 0;
        } else {
            topInitialToggles3 = toggles8.getTopInitialToggles();
        }
        if (r14 == 0) {
            r14 = topInitialToggles3;
            r14 = arrayList4;
        }
        r14 = topInitialToggles3;
        Collection collection2 = (Collection) r14;
        if (weeklyPlanCustomizationScreenModel2 == null || (toggles7 = weeklyPlanCustomizationScreenModel2.getToggles()) == null) {
            r15 = 0;
        } else {
            initialToggles3 = toggles7.getInitialToggles();
        }
        if (r15 == 0) {
            r15 = initialToggles3;
            r15 = arrayList4;
        }
        r15 = initialToggles3;
        ArrayList<GoalSettingsTileModel> arrayListM74129g3 = AbstractC25265s.m74129g1(collection2, (Iterable) r15);
        ArrayList arrayList9 = new ArrayList(AbstractC25267u.m74163i0(arrayListM74129g3, 10));
        for (GoalSettingsTileModel goalSettingsTileModel2 : arrayListM74129g3) {
            InitialSelection initialSelection3 = this.screenArgsInitialSelection;
            if (initialSelection3 == null || (behaviorGoals2 = initialSelection3.getBehaviorGoals()) == null) {
                behaviorGoals2 = result.getInitialSelection().getBehaviorGoals();
            }
            String id5 = goalSettingsTileModel2.getId();
            Boolean boolIsAvoidChecked = goalSettingsTileModel2.isAvoidChecked();
            boolean zBooleanValue = boolIsAvoidChecked != null ? boolIsAvoidChecked.booleanValue() : false;
            Integer selectedValue2 = goalSettingsTileModel2.getSelectedValue();
            int iIntValue2 = selectedValue2 != null ? selectedValue2.intValue() : i13;
            List<Behavior> list3 = behaviorGoals2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it7 = list3.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        if (AbstractC22676k.m65745e(String.valueOf(((Behavior) it7.next()).getBehaviorTrackerId()), goalSettingsTileModel2.getId())) {
                            if (goalSettingsTileModel2.getSelectedValue() != null) {
                                z4 = true;
                                break;
                            }
                        }
                    }
                    z4 = false;
                    break;
                }
            }
            z4 = false;
            break;
            break;
            arrayList9.add(new C21940b(id5, zBooleanValue, z4, iIntValue2));
            i13 = 1;
        }
        InitialSelection initialSelection4 = this.screenArgsInitialSelection;
        if (initialSelection4 == null || (behaviorGoals = initialSelection4.getBehaviorGoals()) == null) {
            behaviorGoals = result.getInitialSelection().getBehaviorGoals();
        }
        List<Behavior> list4 = behaviorGoals;
        ArrayList arrayList10 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
        for (Behavior behavior : list4) {
            arrayList10.add(new C21940b(String.valueOf(behavior.getBehaviorTrackerId()), behavior.getAvoid(), true, behavior.getDays()));
        }
        ArrayList arrayListM74129g4 = AbstractC25265s.m74129g1(arrayList10, arrayList9);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj5 : arrayListM74129g4) {
            String id6 = ((C21940b) obj5).getId();
            Object arrayList11 = linkedHashMap2.get(id6);
            if (arrayList11 == null) {
                arrayList11 = new ArrayList();
                linkedHashMap2.put(id6, arrayList11);
            }
            ((List) arrayList11).add(obj5);
        }
        ArrayList arrayList12 = new ArrayList(linkedHashMap2.size());
        Iterator it8 = linkedHashMap2.entrySet().iterator();
        while (it8.hasNext()) {
            arrayList12.add((C21940b) AbstractC25265s.m74096F0((List) ((Map.Entry) it8.next()).getValue()));
        }
        InitialSelection initialSelection5 = this.screenArgsInitialSelection;
        if (initialSelection5 == null || (targetGoals = initialSelection5.getTargetGoals()) == null) {
            targetGoals = result.getInitialSelection().getTargetGoals();
        }
        C21942d accumulatedStateForVS = combinedDomainState.getAccumulatedStateForVS();
        List<Goal> list5 = targetGoals;
        ArrayList arrayList13 = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
        Iterator it9 = list5.iterator();
        while (it9.hasNext()) {
            arrayList13.add(Integer.valueOf(((Goal) it9.next()).getGoalTypeId()));
        }
        ArrayList arrayList14 = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
        Iterator it10 = list5.iterator();
        while (it10.hasNext()) {
            arrayList14.add(Integer.valueOf(((Goal) it10.next()).getGoalTypeId()));
        }
        C21948j c21948jM62591b = C21948j.m62591b(combinedDomainState, null, C21942d.m62534b(accumulatedStateForVS, arrayList13, arrayList14, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, 2097148, null), 1, null);
        String planId = result.getPlanId();
        boolean z16 = !this.locked;
        ArrayList arrayList15 = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
        Iterator it11 = list5.iterator();
        while (it11.hasNext()) {
            arrayList15.add(Integer.valueOf(((Goal) it11.next()).getGoalTypeId()));
        }
        ArrayList arrayList16 = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
        Iterator it12 = list5.iterator();
        while (it12.hasNext()) {
            arrayList16.add(Integer.valueOf(((Goal) it12.next()).getGoalTypeId()));
        }
        List<C21956r> listM62675d = this.metricSliderMatcher.m62675d(c21948jM62591b, targetGoals);
        List<C21956r> listM62675d2 = this.metricSliderMatcher.m62675d(c21948jM62591b, targetGoals);
        Iterator it13 = result.getGoalScreens().iterator();
        Object obj6 = null;
        boolean z17 = false;
        while (true) {
            if (!it13.hasNext()) {
                if (!z17) {
                    break;
                }
                break;
            }
            Object next4 = it13.next();
            if (((WeeklyPlanCustomizationScreenModel) next4).getGoal() == TargetGoalType.ACTIVITIES) {
                if (!z17) {
                    obj6 = next4;
                    z17 = true;
                }
            }
            obj6 = null;
            break;
        }
        WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel3 = (WeeklyPlanCustomizationScreenModel) obj6;
        if (weeklyPlanCustomizationScreenModel3 == null || (toggles4 = weeklyPlanCustomizationScreenModel3.getToggles()) == null || (bottomSheet2 = toggles4.getBottomSheet()) == null) {
            c33050g = new C33050g(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        } else {
            if (weeklyPlanCustomizationScreenModel == null || (toggles6 = weeklyPlanCustomizationScreenModel.getToggles()) == null || (topInitialToggles2 = toggles6.getTopInitialToggles()) == null) {
                arrayList2 = arrayList4;
            } else {
                List<GoalSettingsTileModel> list6 = topInitialToggles2;
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list6, 10));
                Iterator it14 = list6.iterator();
                while (it14.hasNext()) {
                    arrayList2.add(((GoalSettingsTileModel) it14.next()).getId());
                }
            }
            Collection collection3 = (Collection) arrayList2;
            if (weeklyPlanCustomizationScreenModel == null || (toggles5 = weeklyPlanCustomizationScreenModel.getToggles()) == null || (initialToggles2 = toggles5.getInitialToggles()) == null) {
                arrayList3 = arrayList4;
            } else {
                List<GoalSettingsTileModel> list7 = initialToggles2;
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list7, 10));
                Iterator it15 = list7.iterator();
                while (it15.hasNext()) {
                    arrayList3.add(((GoalSettingsTileModel) it15.next()).getId());
                }
            }
            C33050g c33050gM104642c = AbstractC33051h.m104642c(bottomSheet2, null, false, AbstractC25265s.m74129g1(collection3, arrayList3), 3, null);
            if (c33050gM104642c != null) {
                c33050g = c33050gM104642c;
            } else {
                c33050g = new C33050g(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
            }
        }
        Iterator it16 = result.getGoalScreens().iterator();
        Object obj7 = null;
        boolean z18 = false;
        while (true) {
            if (!it16.hasNext()) {
                if (!z18) {
                    break;
                }
                obj = obj7;
                break;
            }
            Object next5 = it16.next();
            if (((WeeklyPlanCustomizationScreenModel) next5).getGoal() == TargetGoalType.BEHAVIORS) {
                if (!z18) {
                    obj7 = next5;
                    z18 = true;
                }
            }
            obj = null;
            break;
        }
        WeeklyPlanCustomizationScreenModel weeklyPlanCustomizationScreenModel4 = (WeeklyPlanCustomizationScreenModel) obj;
        if (weeklyPlanCustomizationScreenModel4 == null || (toggles = weeklyPlanCustomizationScreenModel4.getToggles()) == null || (bottomSheet = toggles.getBottomSheet()) == null) {
            c33050g2 = new C33050g(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        } else {
            if (weeklyPlanCustomizationScreenModel2 == null || (toggles3 = weeklyPlanCustomizationScreenModel2.getToggles()) == null || (topInitialToggles = toggles3.getTopInitialToggles()) == null) {
                arrayList = arrayList4;
            } else {
                List<GoalSettingsTileModel> list8 = topInitialToggles;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list8, 10));
                Iterator it17 = list8.iterator();
                while (it17.hasNext()) {
                    arrayList.add(((GoalSettingsTileModel) it17.next()).getId());
                }
            }
            Collection collection4 = (Collection) arrayList;
            if (weeklyPlanCustomizationScreenModel2 != null && (toggles2 = weeklyPlanCustomizationScreenModel2.getToggles()) != null && (initialToggles = toggles2.getInitialToggles()) != null) {
                List<GoalSettingsTileModel> list9 = initialToggles;
                arrayList4 = new ArrayList(AbstractC25267u.m74163i0(list9, 10));
                Iterator it18 = list9.iterator();
                while (it18.hasNext()) {
                    arrayList4.add(((GoalSettingsTileModel) it18.next()).getId());
                }
            }
            C33050g c33050gM104642c2 = AbstractC33051h.m104642c(bottomSheet, null, false, AbstractC25265s.m74129g1(collection4, arrayList4), 3, null);
            if (c33050gM104642c2 != null) {
                c33050g2 = c33050gM104642c2;
            } else {
                c33050g2 = new C33050g(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
            }
        }
        return new C21942d(arrayList15, arrayList16, null, listM62675d2, listM62675d, c33050g, arrayList8, arrayList8, c33050g2, arrayList12, arrayList12, false, planId, z16, this.source, this.presetPlanCategory, this.templateId, this.planTitle, this.description, this.explanationTitle, this.explanation, 2052, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C21948j(null, null, 3, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new b(null));
    }
}
