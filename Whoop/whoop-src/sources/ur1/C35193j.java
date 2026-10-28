package ur1;

import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator;
import com.whoop.data.remote.domain.response.journal.CurrentProgressSteps;
import com.whoop.data.remote.domain.response.journal.JournalBehaviorTracker;
import com.whoop.data.remote.domain.response.journal.JournalMagnitude;
import com.whoop.data.remote.domain.response.journal.TrackerInput;
import com.whoop.data.remote.domain.response.journal.WeeklyPlanGoal;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import sr1.AbstractC32909a;
import sr1.AbstractC32913e;
import sr1.C32916h;
import tr1.AbstractC34099c;
import tr1.AbstractC34100d;
import tr1.C34097a;
import tr1.C34098b;
import tr1.InterfaceC34101e;
import tr1.InterfaceC34102f;
import yr1.AbstractC39732c;

/* JADX INFO: renamed from: ur1.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010!\u001a\u00020 2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\"\u0010#J+\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010%\u001a\u00020$2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b&\u0010'J#\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0016¢\u0006\u0004\b*\u0010+J)\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020,2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b-\u0010.J%\u00100\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020/2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b0\u00101J\u001d\u00106\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u001d\u00108\u001a\u0002042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b8\u00109¨\u0006:"}, m65681d2 = {"Lur1/j;", "Lod1/g;", "Lur1/i;", "Lur1/n;", "<init>", "()V", "Ltr1/c;", "actionType", "g", "(Ltr1/c;)Lur1/n;", "Ltr1/c$c;", "", "Ltr1/b;", "behaviors", "Lsr1/h;", "j", "(Ltr1/c$c;Ljava/util/List;)Lsr1/h;", "Ltr1/c$b;", "i", "(Ltr1/c$b;Ljava/util/List;)Lsr1/h;", "Ltr1/c$d;", "booleanAnswer", "l", "(Ltr1/c$d;Ljava/util/List;)Ljava/util/List;", "Ltr1/c$a;", "deselect", "d", "(Ltr1/c$a;Ljava/util/List;)Ljava/util/List;", "Ltr1/c$e;", "magnitudeAnswer", "m", "(Ltr1/c$e;Ljava/util/List;)Ljava/util/List;", "Ltr1/c$g;", "timeAnswer", "n", "(Ltr1/c$g;Ljava/util/List;)Ljava/util/List;", "Ltr1/c$h;", "timeSliderAnswer", "o", "(Ltr1/c$h;Ljava/util/List;)Ljava/util/List;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "Ltr1/f;", "k", "(Ltr1/f;Ljava/util/List;)Ljava/util/List;", "Ltr1/e;", "e", "(Ltr1/e;Ljava/util/List;)Lsr1/h;", "Lsr1/e$e;", "currentState", "", "toggleValue", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lsr1/e$e;Z)Lsr1/e$e;", "f", "(Ljava/util/List;)Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35193j implements InterfaceC27844g<AbstractC35192i, AbstractC35197n> {

    /* JADX INFO: renamed from: ur1.j$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149524w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35193j f149525x;

        /* JADX INFO: renamed from: ur1.j$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42504a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149526w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35193j f149527x;

            /* JADX INFO: renamed from: ur1.j$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalEditEntryInteractor$interact$$inlined$map$1$2", m100430f = "JournalEditEntryInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42505a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f149528E;

                /* JADX INFO: renamed from: F */
                Object f149529F;

                /* JADX INFO: renamed from: G */
                Object f149530G;

                /* JADX INFO: renamed from: H */
                int f149531H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149532w;

                /* JADX INFO: renamed from: x */
                int f149533x;

                /* JADX INFO: renamed from: y */
                Object f149534y;

                public C42505a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149532w = obj;
                    this.f149533x |= Integer.MIN_VALUE;
                    return C42504a.this.emit(null, this);
                }
            }

            public C42504a(InterfaceC13062m interfaceC13062m, C35193j c35193j) {
                this.f149526w = interfaceC13062m;
                this.f149527x = c35193j;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42505a c42505a;
                AbstractC35197n zVar;
                if (interfaceC30057d instanceof C42505a) {
                    c42505a = (C42505a) interfaceC30057d;
                    int i13 = c42505a.f149533x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42505a.f149533x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42505a = new C42505a(interfaceC30057d);
                    }
                } else {
                    c42505a = new C42505a(interfaceC30057d);
                }
                Object obj2 = c42505a.f149532w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42505a.f149533x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f149526w;
                    AbstractC35192i abstractC35192i = (AbstractC35192i) obj;
                    if (abstractC35192i instanceof AbstractC35192i.a) {
                        zVar = this.f149527x.m111428g(((AbstractC35192i.a) abstractC35192i).getActionType());
                    } else {
                        if (!(abstractC35192i instanceof AbstractC35192i.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zVar = new AbstractC35197n.z(((AbstractC35192i.b) abstractC35192i).getToggleValue());
                    }
                    c42505a.f149534y = null;
                    c42505a.f149528E = null;
                    c42505a.f149529F = null;
                    c42505a.f149530G = null;
                    c42505a.f149531H = 0;
                    c42505a.f149533x = 1;
                    if (interfaceC13062m.emit(zVar, c42505a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C35193j c35193j) {
            this.f149524w = interfaceC13058l;
            this.f149525x = c35193j;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149524w.collect(new C42504a(interfaceC13062m, this.f149525x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d */
    private final List<C34098b> m111427d(AbstractC34099c.a deselect, List<C34098b> behaviors) {
        List<C34098b> list = behaviors;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C34098b c34098bM111440b : list) {
            if (c34098bM111440b.getTracker().getId() == deselect.getId()) {
                c34098bM111440b = AbstractC35194k.m111440b(c34098bM111440b);
            }
            arrayList.add(c34098bM111440b);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final AbstractC35197n m111428g(AbstractC34099c actionType) {
        if (actionType instanceof InterfaceC34102f) {
            return new AbstractC35197n.w(actionType);
        }
        return actionType instanceof InterfaceC34101e ? new AbstractC35197n.j(actionType) : AbstractC35197n.n.f149654a;
    }

    /* JADX INFO: renamed from: i */
    private final C32916h m111429i(AbstractC34099c.b actionType, List<C34098b> behaviors) {
        Object next;
        String units;
        Float maxInclusive;
        Float minInclusive;
        Iterator<T> it = behaviors.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C34098b) next).getTracker().getId() != actionType.getId());
        C34098b c34098b = (C34098b) next;
        if (c34098b == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(c34098b.getTracker().getId());
        String title = c34098b.getTracker().getTitle();
        JournalMagnitude magnitude = c34098b.getTracker().getMagnitude();
        String label = magnitude != null ? magnitude.getLabel() : null;
        Double magnitudeInputValue = c34098b.getValue().getMagnitudeInputValue();
        double dFloatValue = 0.0d;
        double dDoubleValue = magnitudeInputValue != null ? magnitudeInputValue.doubleValue() : 0.0d;
        JournalMagnitude magnitude2 = c34098b.getTracker().getMagnitude();
        double dFloatValue2 = (magnitude2 == null || (minInclusive = magnitude2.getMinInclusive()) == null) ? 0.0d : minInclusive.floatValue();
        JournalMagnitude magnitude3 = c34098b.getTracker().getMagnitude();
        if (magnitude3 != null && (maxInclusive = magnitude3.getMaxInclusive()) != null) {
            dFloatValue = maxInclusive.floatValue();
        }
        double d3 = dFloatValue;
        JournalMagnitude magnitude4 = c34098b.getTracker().getMagnitude();
        if (magnitude4 == null || (units = magnitude4.getUnits()) == null) {
            units = "";
        }
        return new C32916h(numValueOf, title, label, new AbstractC32909a.b(dFloatValue2, d3, dDoubleValue, units));
    }

    /* JADX INFO: renamed from: j */
    private final C32916h m111430j(AbstractC34099c.c actionType, List<C34098b> behaviors) {
        Object next;
        String strValueOf;
        Iterator<T> it = behaviors.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C34098b) next).getTracker().getId() != actionType.getId());
        C34098b c34098b = (C34098b) next;
        if (c34098b == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(c34098b.getTracker().getId());
        String title = c34098b.getTracker().getTitle();
        String timeInputLabel = c34098b.getValue().getTimeInputLabel();
        Long timeInputValue = c34098b.getValue().getTimeInputValue();
        if (timeInputValue == null || (strValueOf = String.valueOf(timeInputValue.longValue())) == null) {
            strValueOf = "";
        }
        return new C32916h(numValueOf, title, timeInputLabel, new AbstractC32909a.c(strValueOf));
    }

    /* JADX INFO: renamed from: l */
    private final List<C34098b> m111431l(AbstractC34099c.d booleanAnswer, List<C34098b> behaviors) {
        WeeklyPlanGoal weeklyPlanGoalCopy$default;
        Object next;
        boolean answer;
        CircularProgressIndicator circularProgressIndicatorCopy$default;
        CurrentProgressSteps currentProgressStepsCopy$default;
        CurrentProgressSteps currentProgressSteps;
        int i13;
        CurrentProgressSteps currentProgressSteps2;
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(behaviors);
        Iterator it = arrayListM74097F1.iterator();
        do {
            weeklyPlanGoalCopy$default = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C34098b) next).getTracker().getId() != booleanAnswer.getId());
        C34098b c34098b = (C34098b) next;
        if (c34098b == null) {
            return behaviors;
        }
        int iIndexOf = arrayListM74097F1.indexOf(c34098b);
        WeeklyPlanGoal weeklyPlanGoal = c34098b.getTracker().getWeeklyPlanGoal();
        if (weeklyPlanGoal == null || !weeklyPlanGoal.isAvoided()) {
            answer = booleanAnswer.getAnswer();
        } else {
            answer = !booleanAnswer.getAnswer();
        }
        TrackerInput trackerInputCopy$default = TrackerInput.copy$default(c34098b.getValue(), Boolean.valueOf(answer), 0, null, null, null, null, null, null, null, null, 1022, null);
        WeeklyPlanGoal weeklyPlanGoal2 = c34098b.getTracker().getWeeklyPlanGoal();
        Boolean boolValueOf = weeklyPlanGoal2 != null ? Boolean.valueOf(weeklyPlanGoal2.isAvoided()) : null;
        boolean zEquals = Boolean.valueOf(answer).equals(c34098b.getValue().getAnsweredYes());
        boolean z4 = c34098b.getValue().getAnsweredYes() == null && Boolean.valueOf(answer).equals(boolValueOf);
        JournalBehaviorTracker tracker = c34098b.getTracker();
        WeeklyPlanGoal weeklyPlanGoal3 = c34098b.getTracker().getWeeklyPlanGoal();
        if (weeklyPlanGoal3 != null) {
            CircularProgressIndicator circularProgressIndicator = weeklyPlanGoal3.getCircularProgressIndicator();
            if (circularProgressIndicator != null) {
                CircularProgressIndicator circularProgressIndicator2 = weeklyPlanGoal3.getCircularProgressIndicator();
                if (circularProgressIndicator2 == null || (currentProgressSteps = circularProgressIndicator2.getCurrentProgressSteps()) == null) {
                    currentProgressStepsCopy$default = null;
                } else {
                    CircularProgressIndicator circularProgressIndicator3 = weeklyPlanGoal3.getCircularProgressIndicator();
                    if (circularProgressIndicator3 == null || (currentProgressSteps2 = circularProgressIndicator3.getCurrentProgressSteps()) == null) {
                        i13 = 0;
                    } else {
                        int currentStep = currentProgressSteps2.getCurrentStep();
                        if (!zEquals && !z4) {
                            currentStep += booleanAnswer.getAnswer() ? 1 : -1;
                            if (currentStep < 0) {
                                currentStep = 0;
                            }
                        }
                        i13 = currentStep;
                    }
                    currentProgressStepsCopy$default = CurrentProgressSteps.copy$default(currentProgressSteps, null, i13, 0, null, null, 29, null);
                }
                circularProgressIndicatorCopy$default = CircularProgressIndicator.copy$default(circularProgressIndicator, null, currentProgressStepsCopy$default, 1, null);
            } else {
                circularProgressIndicatorCopy$default = null;
            }
            weeklyPlanGoalCopy$default = WeeklyPlanGoal.copy$default(weeklyPlanGoal3, circularProgressIndicatorCopy$default, false, 2, null);
        }
        arrayListM74097F1.set(iIndexOf, C34098b.m107783b(c34098b, tracker.copy((49151 & 1) != 0 ? tracker.id : 0, (49151 & 2) != 0 ? tracker.description : null, (49151 & 4) != 0 ? tracker.questionText : null, (49151 & 8) != 0 ? tracker.title : null, (49151 & 16) != 0 ? tracker.status : null, (49151 & 32) != 0 ? tracker.sticky : false, (49151 & 64) != 0 ? tracker.magnitude : null, (49151 & 128) != 0 ? tracker.timeLabel : null, (49151 & 256) != 0 ? tracker.category : null, (49151 & 512) != 0 ? tracker.deprecated : null, (49151 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? tracker.createdAt : 0.0d, (49151 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? tracker.updatedAt : 0.0d, (49151 & 4096) != 0 ? tracker.timeContextLabel : null, (49151 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? tracker.questionType : null, (49151 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? tracker.weeklyPlanGoal : weeklyPlanGoalCopy$default, (49151 & 32768) != 0 ? tracker.destination : null), trackerInputCopy$default, false, 4, null));
        return AbstractC25265s.m74093D1(arrayListM74097F1);
    }

    /* JADX INFO: renamed from: m */
    private final List<C34098b> m111432m(AbstractC34099c.e magnitudeAnswer, List<C34098b> behaviors) {
        Object next;
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(behaviors);
        Iterator it = arrayListM74097F1.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C34098b) next).getTracker().getId() != magnitudeAnswer.getId());
        C34098b c34098b = (C34098b) next;
        if (c34098b == null) {
            return behaviors;
        }
        arrayListM74097F1.set(arrayListM74097F1.indexOf(c34098b), C34098b.m107783b(c34098b, null, TrackerInput.copy$default(c34098b.getValue(), null, 0, null, null, null, null, magnitudeAnswer.getMagnitude(), null, null, null, 959, null), false, 5, null));
        return AbstractC25265s.m74093D1(arrayListM74097F1);
    }

    /* JADX INFO: renamed from: n */
    private final List<C34098b> m111433n(AbstractC34099c.g timeAnswer, List<C34098b> behaviors) {
        Object next;
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(behaviors);
        Iterator it = arrayListM74097F1.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C34098b) next).getTracker().getId() != timeAnswer.getId());
        C34098b c34098b = (C34098b) next;
        if (c34098b != null) {
            int iIndexOf = arrayListM74097F1.indexOf(c34098b);
            TrackerInput trackerInputCopy$default = TrackerInput.copy$default(c34098b.getValue(), null, 0, null, null, null, null, null, null, AbstractC22676k.m65745e(timeAnswer.getTime(), "25:25") ? c34098b.getValue().getTimeInputValue() : AbstractC34100d.m107799a(timeAnswer.getTime()), null, 767, null);
            if (trackerInputCopy$default != null) {
                arrayListM74097F1.set(iIndexOf, C34098b.m107783b(c34098b, null, trackerInputCopy$default, false, 5, null));
                return AbstractC25265s.m74093D1(arrayListM74097F1);
            }
        }
        return behaviors;
    }

    /* JADX INFO: renamed from: o */
    private final List<C34098b> m111434o(AbstractC34099c.h timeSliderAnswer, List<C34098b> behaviors) {
        Object next;
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(behaviors);
        Iterator it = arrayListM74097F1.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C34098b) next).getTracker().getId() != timeSliderAnswer.getId());
        C34098b c34098b = (C34098b) next;
        if (c34098b == null) {
            return behaviors;
        }
        arrayListM74097F1.set(arrayListM74097F1.indexOf(c34098b), C34098b.m107783b(c34098b, null, TrackerInput.copy$default(c34098b.getValue(), null, 0, null, null, null, null, null, null, Long.valueOf(AbstractC39732c.m127141b(timeSliderAnswer.getTime()).getMillis()), null, 767, null), false, 5, null));
        return AbstractC25265s.m74093D1(arrayListM74097F1);
    }

    /* JADX INFO: renamed from: e */
    public final C32916h m111435e(InterfaceC34101e actionType, List<C34098b> behaviors) {
        AbstractC22676k.m65750j(actionType, "actionType");
        AbstractC22676k.m65750j(behaviors, "behaviors");
        if (actionType instanceof AbstractC34099c.b) {
            return m111429i((AbstractC34099c.b) actionType, behaviors);
        }
        if (actionType instanceof AbstractC34099c.c) {
            return m111430j((AbstractC34099c.c) actionType, behaviors);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m111436f(List<C34098b> behaviors) {
        AbstractC22676k.m65750j(behaviors, "behaviors");
        List<C34098b> list = behaviors;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C34098b c34098b : list) {
            if (AbstractC22676k.m65745e(c34098b.getValue().getAnsweredYes(), Boolean.TRUE) || c34098b.getValue().getMagnitudeInputValue() != null || c34098b.getValue().getTimeInputValue() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC32913e.e m111437h(AbstractC32913e.e currentState, boolean toggleValue) {
        CircularProgressIndicator circularProgressIndicatorCopy$default;
        CurrentProgressSteps currentProgressStepsCopy$default;
        CurrentProgressSteps currentProgressSteps;
        AbstractC22676k.m65750j(currentState, "currentState");
        if (!toggleValue) {
            return AbstractC32913e.e.m103333b(currentState, currentState.m103349q(), null, null, null, null, null, false, false, null, null, null, 0L, m111436f(currentState.m103349q()), null, null, null, null, null, null, false, false, null, null, 8384510, null);
        }
        List<C34097a> listM103314c = currentState.getDefaultAnswers().m103314c();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(listM103314c, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (C34097a c34097a : listM103314c) {
            linkedHashMap.put(Integer.valueOf(c34097a.getId()), c34097a.getValue());
        }
        ArrayList<C34098b> arrayListM74097F1 = AbstractC25265s.m74097F1(currentState.m103335c());
        ArrayList arrayList = new ArrayList();
        for (C34098b c34098b : arrayListM74097F1) {
            TrackerInput trackerInput = (TrackerInput) linkedHashMap.get(Integer.valueOf(c34098b.getTracker().getId()));
            if (trackerInput != null) {
                WeeklyPlanGoal weeklyPlanGoalCopy$default = null;
                TrackerInput trackerInputCopy$default = TrackerInput.copy$default(trackerInput, null, 0, null, null, null, null, null, null, null, null, 1023, null);
                JournalBehaviorTracker tracker = c34098b.getTracker();
                WeeklyPlanGoal weeklyPlanGoal = c34098b.getTracker().getWeeklyPlanGoal();
                if (weeklyPlanGoal != null) {
                    CircularProgressIndicator circularProgressIndicator = weeklyPlanGoal.getCircularProgressIndicator();
                    if (circularProgressIndicator != null) {
                        CircularProgressIndicator circularProgressIndicator2 = weeklyPlanGoal.getCircularProgressIndicator();
                        if (circularProgressIndicator2 == null || (currentProgressSteps = circularProgressIndicator2.getCurrentProgressSteps()) == null) {
                            currentProgressStepsCopy$default = null;
                        } else {
                            int currentStep = currentProgressSteps.getCurrentStep() + (AbstractC22676k.m65745e(trackerInput.getAnsweredYes(), Boolean.valueOf(weeklyPlanGoal.isAvoided())) ? -1 : 1);
                            if (currentStep < 0) {
                                currentStep = 0;
                            }
                            int totalSteps = currentProgressSteps.getTotalSteps();
                            currentProgressStepsCopy$default = CurrentProgressSteps.copy$default(currentProgressSteps, null, currentStep > totalSteps ? totalSteps : currentStep, 0, null, null, 29, null);
                        }
                        circularProgressIndicatorCopy$default = CircularProgressIndicator.copy$default(circularProgressIndicator, null, currentProgressStepsCopy$default, 1, null);
                    } else {
                        circularProgressIndicatorCopy$default = null;
                    }
                    weeklyPlanGoalCopy$default = WeeklyPlanGoal.copy$default(weeklyPlanGoal, circularProgressIndicatorCopy$default, false, 2, null);
                }
                arrayList.add(C34098b.m107783b(c34098b, tracker.copy((49151 & 1) != 0 ? tracker.id : 0, (49151 & 2) != 0 ? tracker.description : null, (49151 & 4) != 0 ? tracker.questionText : null, (49151 & 8) != 0 ? tracker.title : null, (49151 & 16) != 0 ? tracker.status : null, (49151 & 32) != 0 ? tracker.sticky : false, (49151 & 64) != 0 ? tracker.magnitude : null, (49151 & 128) != 0 ? tracker.timeLabel : null, (49151 & 256) != 0 ? tracker.category : null, (49151 & 512) != 0 ? tracker.deprecated : null, (49151 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? tracker.createdAt : 0.0d, (49151 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? tracker.updatedAt : 0.0d, (49151 & 4096) != 0 ? tracker.timeContextLabel : null, (49151 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? tracker.questionType : null, (49151 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? tracker.weeklyPlanGoal : weeklyPlanGoalCopy$default, (49151 & 32768) != 0 ? tracker.destination : null), trackerInputCopy$default, false, 4, null));
            } else {
                arrayList.add(c34098b);
            }
        }
        return AbstractC32913e.e.m103333b(currentState, arrayList, null, null, null, null, null, false, false, null, null, null, 0L, true, null, null, null, null, null, null, false, false, null, null, 8384510, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }

    /* JADX INFO: renamed from: k */
    public final List<C34098b> m111438k(InterfaceC34102f actionType, List<C34098b> behaviors) {
        AbstractC22676k.m65750j(actionType, "actionType");
        AbstractC22676k.m65750j(behaviors, "behaviors");
        if (actionType instanceof AbstractC34099c.d) {
            return m111431l((AbstractC34099c.d) actionType, behaviors);
        }
        if (actionType instanceof AbstractC34099c.a) {
            return m111427d((AbstractC34099c.a) actionType, behaviors);
        }
        if (actionType instanceof AbstractC34099c.e) {
            return m111432m((AbstractC34099c.e) actionType, behaviors);
        }
        if (actionType instanceof AbstractC34099c.g) {
            return m111433n((AbstractC34099c.g) actionType, behaviors);
        }
        return actionType instanceof AbstractC34099c.h ? m111434o((AbstractC34099c.h) actionType, behaviors) : C25271y.f99162w;
    }
}
