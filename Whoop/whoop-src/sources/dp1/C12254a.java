package dp1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciPregnancyDueDateSavedScreenDto;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciPregnancyOnboardingDto;
import com.whoop.hormonalinsights.onboarding.domain.models.FeatureToggleScreen;
import com.whoop.hormonalinsights.onboarding.domain.models.InformationScreen;
import com.whoop.hormonalinsights.onboarding.domain.models.MciDateInputScreen;
import com.whoop.hormonalinsights.onboarding.domain.models.MciIntegrationScreen;
import com.whoop.hormonalinsights.onboarding.domain.models.MciOnboardingResponse;
import com.whoop.hormonalinsights.onboarding.domain.models.MciSaveScreen;
import com.whoop.hormonalinsights.onboarding.domain.models.TextNumberPickerScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalMultiSelectScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import com.whoop.hormonalinsights.postpartum.domain.models.MultiSelectOption;
import cp1.AbstractC11015b;
import cp1.AbstractC11024k;
import cp1.C11014a;
import cp1.C11016c;
import cp1.C11018e;
import cp1.C11019f;
import cp1.C11020g;
import cp1.C11021h;
import cp1.C11026m;
import cp1.C11027n;
import cp1.C11028o;
import cp1.C11029p;
import cp1.C11030q;
import cp1.C11031r;
import cp1.EnumC11017d;
import d13.AbstractC11478a;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import hp1.C17543c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ip1.AbstractC20813b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m83.AbstractC25267u;
import org.joda.time.LocalDate;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tp1.C34072l;
import up1.AbstractC35152b;
import zo1.AbstractC40926c;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: dp1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010 J\u001f\u0010$\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010\u001cJ\u0017\u0010%\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010 J!\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, m65681d2 = {"Ldp1/a;", "", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lzr2/a;)V", "Lzo1/c$k;", "domainResult", "Lcp1/k;", "d", "(Lzo1/c$k;)Lcp1/k;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto;", "pregnancyOnboardingDto", "", "isInitialScreen", "Lcp1/k$l;", "l", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto;Z)Lcp1/k$l;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateSavedScreenDto;", "dueDateSavedScreenDto", "Lcp1/k$c;", "e", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateSavedScreenDto;)Lcp1/k$c;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;", "result", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "screenId", "j", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)Lcp1/k;", "id", "g", "n", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;)Lcp1/k;", "m", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "k", "f", "Lec3/l;", "Lzo1/c;", "upstream", "o", "(Lec3/l;)Lec3/l;", "a", "Lzr2/a;", "getDateAndTimeProvider", "()Lzr2/a;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12254a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: dp1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41004a;

        static {
            int[] iArr = new int[HormonalScreenId.values().length];
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_PERIOD_LENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_SAVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_SYMPTOMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_GOALS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_LAST_PERIOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HormonalScreenId.HORMONAL_INSIGHTS_MODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_MOTIVATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_CONTRACEPTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_INFO_INITIAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_INFO_COMMUNITY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_INFO_SYMPTOMS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_INFO_FOLLICULAR_PHASE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_INFO_PHASE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_INFO_LUTEAL_PHASE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_INFO_MENSTRUAL_PHASE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_INFO_METRICS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[HormonalScreenId.INITIAL_SCREEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[HormonalScreenId.NEITHER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[HormonalScreenId.DATA_PRIVACY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_INFO_OVULATORY_PHASE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_INTEGRATION.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[HormonalScreenId.FERTILITY_FEATURE_TOGGLE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            f41004a = iArr;
        }
    }

    /* JADX INFO: renamed from: dp1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f41005w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12254a f41006x;

        /* JADX INFO: renamed from: dp1.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f41007w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12254a f41008x;

            /* JADX INFO: renamed from: dp1.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.onboarding.presentation.reducers.MciOnboardingViewStateReducer$reduce$$inlined$map$1$2", m100430f = "MciOnboardingViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41478a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f41009E;

                /* JADX INFO: renamed from: F */
                Object f41010F;

                /* JADX INFO: renamed from: G */
                Object f41011G;

                /* JADX INFO: renamed from: H */
                int f41012H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f41013w;

                /* JADX INFO: renamed from: x */
                int f41014x;

                /* JADX INFO: renamed from: y */
                Object f41015y;

                public C41478a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f41013w = obj;
                    this.f41014x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12254a c12254a) {
                this.f41007w = interfaceC13062m;
                this.f41008x = c12254a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41478a c41478a;
                Object objM34158e;
                Object oVar;
                if (interfaceC30057d instanceof C41478a) {
                    c41478a = (C41478a) interfaceC30057d;
                    int i13 = c41478a.f41014x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41478a.f41014x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41478a = new C41478a(interfaceC30057d);
                    }
                } else {
                    c41478a = new C41478a(interfaceC30057d);
                }
                Object obj2 = c41478a.f41013w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41478a.f41014x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f41007w;
                    AbstractC40926c abstractC40926c = (AbstractC40926c) obj;
                    if (abstractC40926c instanceof AbstractC40926c.e) {
                        objM34158e = AbstractC11024k.i.f34586a;
                    } else {
                        if (abstractC40926c instanceof AbstractC40926c.d) {
                            oVar = new AbstractC11024k.d(((AbstractC40926c.d) abstractC40926c).getFeature());
                        } else if (abstractC40926c instanceof AbstractC40926c.k) {
                            objM34158e = this.f41008x.m34157d((AbstractC40926c.k) abstractC40926c);
                        } else if (abstractC40926c instanceof AbstractC40926c.h) {
                            objM34158e = AbstractC11024k.p.f34595a;
                        } else if (AbstractC22676k.m65745e(abstractC40926c, AbstractC40926c.i.f176530a)) {
                            objM34158e = AbstractC11024k.r.f34598a;
                        } else if (abstractC40926c instanceof AbstractC40926c.j) {
                            objM34158e = AbstractC11024k.s.f34599a;
                        } else if (abstractC40926c instanceof AbstractC40926c.f) {
                            AbstractC40926c.f fVar = (AbstractC40926c.f) abstractC40926c;
                            objM34158e = this.f41008x.m34165l(fVar.getPregnancyOnboardingDto(), fVar.getIsInitialScreen());
                        } else if (abstractC40926c instanceof AbstractC40926c.c) {
                            objM34158e = this.f41008x.m34158e(((AbstractC40926c.c) abstractC40926c).getDueDateSavedScreenDto());
                        } else if (abstractC40926c instanceof AbstractC40926c.b) {
                            oVar = new AbstractC11024k.b(((AbstractC40926c.b) abstractC40926c).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
                        } else if (abstractC40926c instanceof AbstractC40926c.g) {
                            oVar = new AbstractC11024k.o(((AbstractC40926c.g) abstractC40926c).getIsInitialScreen());
                        } else {
                            if (!AbstractC22676k.m65745e(abstractC40926c, AbstractC40926c.a.f176520a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            objM34158e = AbstractC11024k.a.f34570a;
                        }
                        objM34158e = oVar;
                    }
                    c41478a.f41015y = null;
                    c41478a.f41009E = null;
                    c41478a.f41010F = null;
                    c41478a.f41011G = null;
                    c41478a.f41012H = 0;
                    c41478a.f41014x = 1;
                    if (interfaceC13062m.emit(objM34158e, c41478a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C12254a c12254a) {
            this.f41005w = interfaceC13058l;
            this.f41006x = c12254a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f41005w.collect(new a(interfaceC13062m, this.f41006x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C12254a(InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.dateAndTimeProvider = dateAndTimeProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final AbstractC11024k m34157d(AbstractC40926c.k domainResult) {
        Object next;
        AbstractC11024k abstractC11024kM34167n;
        AbstractC11024k abstractC11024kM34166m;
        AbstractC11024k abstractC11024kM34163j;
        AbstractC11024k abstractC11024kM34162i;
        AbstractC11024k abstractC11024kM34164k;
        AbstractC11024k abstractC11024kM34160g;
        AbstractC11024k abstractC11024kM34161h;
        AbstractC11024k abstractC11024kM34159f;
        HormonalScreenId currentScreen = domainResult.getProgressResult().getCurrentScreen();
        MciOnboardingResponse response = domainResult.getResponse();
        domainResult.getSaveRequest();
        Iterator<T> it = response.getScreens().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((HormonalScreen) next).getId() != currentScreen);
        HormonalScreen hormonalScreen = (HormonalScreen) next;
        if (domainResult.getShouldExit()) {
            return AbstractC11024k.e.f34579a;
        }
        switch (a.f41004a[currentScreen.ordinal()]) {
            case 1:
                return (hormonalScreen == null || (abstractC11024kM34167n = m34167n(hormonalScreen)) == null) ? AbstractC11024k.n.f34593a : abstractC11024kM34167n;
            case 2:
                return (hormonalScreen == null || (abstractC11024kM34166m = m34166m(hormonalScreen)) == null) ? AbstractC11024k.n.f34593a : abstractC11024kM34166m;
            case 3:
            case 4:
                return (hormonalScreen == null || (abstractC11024kM34163j = m34163j(hormonalScreen, currentScreen)) == null) ? AbstractC11024k.n.f34593a : abstractC11024kM34163j;
            case 5:
                return (hormonalScreen == null || (abstractC11024kM34162i = m34162i(hormonalScreen)) == null) ? AbstractC11024k.n.f34593a : abstractC11024kM34162i;
            case 6:
            case 7:
            case 8:
                return (hormonalScreen == null || (abstractC11024kM34164k = m34164k(hormonalScreen, currentScreen)) == null) ? AbstractC11024k.n.f34593a : abstractC11024kM34164k;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
                return (hormonalScreen == null || (abstractC11024kM34160g = m34160g(hormonalScreen, currentScreen)) == null) ? AbstractC11024k.n.f34593a : abstractC11024kM34160g;
            case 21:
                return (hormonalScreen == null || (abstractC11024kM34161h = m34161h(hormonalScreen)) == null) ? AbstractC11024k.n.f34593a : abstractC11024kM34161h;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return (hormonalScreen == null || (abstractC11024kM34159f = m34159f(hormonalScreen)) == null) ? AbstractC11024k.n.f34593a : abstractC11024kM34159f;
            default:
                return AbstractC11024k.n.f34593a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final AbstractC11024k.c m34158e(MciPregnancyDueDateSavedScreenDto dueDateSavedScreenDto) {
        return new AbstractC11024k.c(AbstractC8693b.m21278l(dueDateSavedScreenDto.getTitle()), AbstractC8693b.m21278l(dueDateSavedScreenDto.getSubtitle()), AbstractC8693b.m21278l(dueDateSavedScreenDto.getDescription()), AbstractC8693b.m21278l(dueDateSavedScreenDto.getButton()), new AbstractC22403o.c(dueDateSavedScreenDto.getBackgroundImageUrl(), 0, 0, 0, 14, null));
    }

    /* JADX INFO: renamed from: f */
    private final AbstractC11024k m34159f(HormonalScreen result) {
        if (!(result.getContent() instanceof FeatureToggleScreen)) {
            return AbstractC11024k.n.f34593a;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(result.getNavigationTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(result.getNavigationSubtitle());
        String imageUrl = ((FeatureToggleScreen) result.getContent()).getImageUrl();
        return new AbstractC11024k.f(new C11014a(textResourceM21278l, textResourceM21278l2, imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null, AbstractC8693b.m21278l(((FeatureToggleScreen) result.getContent()).getTitleDisplay()), AbstractC8693b.m21278l(((FeatureToggleScreen) result.getContent()).getDescriptionDisplay()), AbstractC8693b.m21278l(((FeatureToggleScreen) result.getContent()).getFeatureToggleTitle()), ((FeatureToggleScreen) result.getContent()).getEnabledNextId(), ((FeatureToggleScreen) result.getContent()).getDisabledNextId(), new C11016c(AbstractC8693b.m21278l(((FeatureToggleScreen) result.getContent()).getProgress().getText()), ((FeatureToggleScreen) result.getContent()).getProgress().getScreenCount(), ((FeatureToggleScreen) result.getContent()).getProgress().getMaxScreenCount())));
    }

    /* JADX INFO: renamed from: g */
    private final AbstractC11024k m34160g(HormonalScreen result, HormonalScreenId id4) {
        if (result.getContent() instanceof InformationScreen) {
            return new AbstractC11024k.g(new C11018e(AbstractC8693b.m21278l(result.getNavigationTitle()), AbstractC8693b.m21278l(result.getNavigationSubtitle()), ((InformationScreen) result.getContent()).getImageUrl() != null ? new AbstractC22403o.c(((InformationScreen) result.getContent()).getImageUrl(), 0, 0, 0, 14, null) : null, AbstractC8693b.m21278l(((InformationScreen) result.getContent()).getTitleDisplay()), AbstractC8693b.m21278l(((InformationScreen) result.getContent()).getDescriptionDisplay()), ((InformationScreen) result.getContent()).isFullImage(), AbstractC8693b.m21278l(((InformationScreen) result.getContent()).getButtonTitle()), ((InformationScreen) result.getContent()).getNextId(), AbstractC8693b.m21278l(((InformationScreen) result.getContent()).getSkipTitle()), ((InformationScreen) result.getContent()).getSkipNextId(), id4, AbstractC11015b.m29571a(((InformationScreen) result.getContent()).getProgress())));
        }
        return AbstractC11024k.n.f34593a;
    }

    /* JADX INFO: renamed from: h */
    private final AbstractC11024k m34161h(HormonalScreen result) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        if (!(result.getContent() instanceof MciIntegrationScreen)) {
            return AbstractC11024k.n.f34593a;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(result.getNavigationTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(result.getNavigationSubtitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(((MciIntegrationScreen) result.getContent()).getTitleDisplay());
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(((MciIntegrationScreen) result.getContent()).getDescriptionDisplay());
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(((MciIntegrationScreen) result.getContent()).getButtonTitle());
        HormonalScreenId nextId = ((MciIntegrationScreen) result.getContent()).getNextId();
        C11016c c11016cM29571a = AbstractC11015b.m29571a(((MciIntegrationScreen) result.getContent()).getProgress());
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(((MciIntegrationScreen) result.getContent()).getUpsellTitle());
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(((MciIntegrationScreen) result.getContent()).getUpsellContent().getDescriptionDisplay());
        String icon = ((MciIntegrationScreen) result.getContent()).getUpsellContent().getIcon();
        EnumC16313m0 enumC16313m2 = EnumC16313m0.INTEGRATIONS;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        EnumC16313m0 enumC16313m3 = enumC16313m0 == null ? enumC16313m2 : enumC16313m0;
        String ctaIcon = ((MciIntegrationScreen) result.getContent()).getUpsellContent().getCtaIcon();
        if (ctaIcon != null) {
            EnumC16313m0 enumC16313m4 = EnumC16313m0.ARROW_FORWARD;
            EnumC16313m0[] enumC16313m0ArrValues2 = EnumC16313m0.values();
            int length2 = enumC16313m0ArrValues2.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    enumC16313m1 = null;
                    break;
                }
                EnumC16313m0 enumC16313m5 = enumC16313m0ArrValues2[i14];
                if (AbstractC22676k.m65745e(enumC16313m5.name(), ctaIcon)) {
                    enumC16313m1 = enumC16313m5;
                    break;
                }
                i14++;
            }
            if (enumC16313m1 == null) {
                enumC16313m1 = enumC16313m4;
            }
        } else {
            enumC16313m1 = null;
        }
        return new AbstractC11024k.h(new C11019f(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, textResourceM21278l6, new C34072l(textResourceM21278l7, enumC16313m3, AbstractC8693b.m21278l(((MciIntegrationScreen) result.getContent()).getUpsellContent().getCtaTextDisplay()), enumC16313m1, ((MciIntegrationScreen) result.getContent()).getUpsellContent().getCtaDestination(), ((MciIntegrationScreen) result.getContent()).getUpsellContent().getDismissable()), textResourceM21278l5, nextId, c11016cM29571a));
    }

    /* JADX INFO: renamed from: i */
    private final AbstractC11024k m34162i(HormonalScreen result) {
        if (!(result.getContent() instanceof MciDateInputScreen)) {
            return AbstractC11024k.n.f34593a;
        }
        LocalDate localDateMo133365d = this.dateAndTimeProvider.mo133365d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int maxMonths = ((MciDateInputScreen) result.getContent()).getMaxMonths();
        for (int i13 = 0; i13 < maxMonths; i13++) {
            LocalDate localDateMinusMonths = localDateMo133365d.minusMonths((((MciDateInputScreen) result.getContent()).getMaxMonths() - 1) - i13);
            Integer numValueOf = Integer.valueOf(i13);
            String string = localDateMinusMonths.toString("MMMM yyyy");
            AbstractC22676k.m65749i(string, "toString(...)");
            TextResource textResourceM30853e = AbstractC11478a.m30853e(Locale.ROOT, string, "toUpperCase(...)");
            String string2 = localDateMinusMonths.toString("yyyy-MM-dd");
            AbstractC22676k.m65749i(string2, "toString(...)");
            linkedHashMap.put(numValueOf, new C11029p(textResourceM30853e, string2));
        }
        return new AbstractC11024k.j(new C11020g(AbstractC8693b.m21278l(result.getNavigationTitle()), AbstractC8693b.m21278l(result.getNavigationSubtitle()), AbstractC8693b.m21278l(((MciDateInputScreen) result.getContent()).getTitle()), AbstractC8693b.m21278l(((MciDateInputScreen) result.getContent()).getDescriptionDisplay()), linkedHashMap, AbstractC8693b.m21278l(((MciDateInputScreen) result.getContent()).getButtonTitle()), AbstractC8693b.m21278l(((MciDateInputScreen) result.getContent()).getSkipTitle()), ((MciDateInputScreen) result.getContent()).getNextId(), ((MciDateInputScreen) result.getContent()).getSkipNextId(), ((MciDateInputScreen) result.getContent()).getSelectedDays(), AbstractC11015b.m29571a(((MciDateInputScreen) result.getContent()).getProgress())));
    }

    /* JADX INFO: renamed from: j */
    private final AbstractC11024k m34163j(HormonalScreen result, HormonalScreenId screenId) {
        HormonalScreenId hormonalScreenId;
        Iterator it;
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        if (!(result.getContent() instanceof HormonalMultiSelectScreen)) {
            return AbstractC11024k.n.f34593a;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(result.getNavigationTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(result.getNavigationSubtitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(((HormonalMultiSelectScreen) result.getContent()).getTitle());
        String descriptionDisplay = ((HormonalMultiSelectScreen) result.getContent()).getDescriptionDisplay();
        TextResource textResourceM21278l4 = descriptionDisplay != null ? AbstractC8693b.m21278l(descriptionDisplay) : null;
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(((HormonalMultiSelectScreen) result.getContent()).getButtonTitle());
        Integer optionLimit = ((HormonalMultiSelectScreen) result.getContent()).getOptionLimit();
        int iIntValue = optionLimit != null ? optionLimit.intValue() : ((HormonalMultiSelectScreen) result.getContent()).getOptions().size();
        HormonalScreenId nextId = ((HormonalMultiSelectScreen) result.getContent()).getNextId();
        if (nextId == null) {
            Iterator<T> it3 = ((HormonalMultiSelectScreen) result.getContent()).getOptions().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    hormonalScreenId = null;
                    break;
                }
                HormonalScreenId nextId2 = ((MultiSelectOption) it3.next()).getNextId();
                if (nextId2 != null) {
                    hormonalScreenId = nextId2;
                    break;
                }
            }
        } else {
            hormonalScreenId = nextId;
        }
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(((HormonalMultiSelectScreen) result.getContent()).getSkipTitle());
        HormonalScreenId skipNextId = ((HormonalMultiSelectScreen) result.getContent()).getSkipNextId();
        C11016c c11016cM29571a = AbstractC11015b.m29571a(((HormonalMultiSelectScreen) result.getContent()).getProgress());
        List<MultiSelectOption> options = ((HormonalMultiSelectScreen) result.getContent()).getOptions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(options, 10));
        Iterator it4 = options.iterator();
        while (it4.hasNext()) {
            MultiSelectOption multiSelectOption = (MultiSelectOption) it4.next();
            TextResource textResourceM21278l7 = AbstractC8693b.m21278l(multiSelectOption.getTitle());
            String value = multiSelectOption.getValue();
            HormonalScreenId nextId3 = multiSelectOption.getNextId();
            Double nextCount = multiSelectOption.getNextCount();
            Integer numValueOf = nextCount != null ? Integer.valueOf((int) nextCount.doubleValue()) : null;
            String icon = multiSelectOption.getIcon();
            if (icon != null) {
                EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                int length = enumC16313m0ArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        it = it4;
                        enumC16313m1 = null;
                        break;
                    }
                    enumC16313m1 = enumC16313m0ArrValues[i13];
                    it = it4;
                    if (AbstractC22676k.m65745e(enumC16313m1.name(), icon)) {
                        break;
                    }
                    i13++;
                    it4 = it;
                }
                enumC16313m0 = enumC16313m1;
            } else {
                it = it4;
                enumC16313m0 = null;
            }
            arrayList.add(new C17543c(textResourceM21278l7, value, null, enumC16313m0, nextId3, numValueOf, 4, null));
            it4 = it;
        }
        return new AbstractC11024k.k(new C11021h(screenId, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, iIntValue, textResourceM21278l5, arrayList, textResourceM21278l6, hormonalScreenId, skipNextId, c11016cM29571a));
    }

    /* JADX INFO: renamed from: k */
    private final AbstractC11024k m34164k(HormonalScreen result, HormonalScreenId screenId) {
        return new AbstractC11024k.m(AbstractC20813b.m57399b(result, screenId, EnumC11017d.MCI));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final AbstractC11024k.l m34165l(MciPregnancyOnboardingDto pregnancyOnboardingDto, boolean isInitialScreen) {
        return new AbstractC11024k.l(new C11027n(new C11028o(AbstractC8693b.m21278l(pregnancyOnboardingDto.getWelcomeScreen().getTitle()), AbstractC8693b.m21278l(pregnancyOnboardingDto.getWelcomeScreen().getDescription()), AbstractC8693b.m21278l(pregnancyOnboardingDto.getWelcomeScreen().getButton()), new AbstractC22403o.c(pregnancyOnboardingDto.getWelcomeScreen().getBackgroundImageUrl(), 0, 0, 0, 14, null)), new C11026m(AbstractC8693b.m21278l(pregnancyOnboardingDto.getDueDateScreen().getTitle()), AbstractC8693b.m21278l(pregnancyOnboardingDto.getDueDateScreen().getDescription()), AbstractC8693b.m21278l(pregnancyOnboardingDto.getDueDateScreen().getButton()), AbstractC35152b.m111203a(this.dateAndTimeProvider, pregnancyOnboardingDto.getDueDateScreen().getCurrentDate()), pregnancyOnboardingDto.getDueDateScreen().getMaxDate(), pregnancyOnboardingDto.getDueDateScreen().getMinDate())), isInitialScreen);
    }

    /* JADX INFO: renamed from: m */
    private final AbstractC11024k m34166m(HormonalScreen result) {
        EnumC16313m0 enumC16313m0;
        if (!(result.getContent() instanceof MciSaveScreen)) {
            return AbstractC11024k.n.f34593a;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(result.getNavigationTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(result.getNavigationSubtitle());
        AbstractC22403o.c cVar = new AbstractC22403o.c(((MciSaveScreen) result.getContent()).getImageUrl(), 0, 0, 0, 14, null);
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(((MciSaveScreen) result.getContent()).getTitle());
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(((MciSaveScreen) result.getContent()).getDescriptionDisplay());
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(((MciSaveScreen) result.getContent()).getSaveButtonTitle());
        String icon = ((MciSaveScreen) result.getContent()).getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.CHECKMARK;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        return new AbstractC11024k.q(new C11030q(textResourceM21278l, textResourceM21278l2, cVar, enumC16313m0 == null ? enumC16313m1 : enumC16313m0, textResourceM21278l3, textResourceM21278l4, textResourceM21278l5, AbstractC8693b.m21278l(((MciSaveScreen) result.getContent()).getSubtitle()), AbstractC11015b.m29571a(((MciSaveScreen) result.getContent()).getProgress())));
    }

    /* JADX INFO: renamed from: n */
    private final AbstractC11024k m34167n(HormonalScreen result) {
        if (!(result.getContent() instanceof TextNumberPickerScreen)) {
            return AbstractC11024k.n.f34593a;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(result.getNavigationTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(result.getNavigationSubtitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(((TextNumberPickerScreen) result.getContent()).getTitle());
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(((TextNumberPickerScreen) result.getContent()).getDescriptionDisplay());
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(((TextNumberPickerScreen) result.getContent()).getTrailingText());
        int minValue = ((TextNumberPickerScreen) result.getContent()).getMinValue();
        int maxValue = ((TextNumberPickerScreen) result.getContent()).getMaxValue();
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(((TextNumberPickerScreen) result.getContent()).getButtonTitle());
        HormonalScreenId nextId = ((TextNumberPickerScreen) result.getContent()).getNextId();
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(((TextNumberPickerScreen) result.getContent()).getSkipTitle());
        HormonalScreenId skipNextId = ((TextNumberPickerScreen) result.getContent()).getSkipNextId();
        Integer currentValue = ((TextNumberPickerScreen) result.getContent()).getCurrentValue();
        return new AbstractC11024k.t(new C11031r(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, textResourceM21278l5, minValue, maxValue, textResourceM21278l6, textResourceM21278l7, nextId, skipNextId, currentValue != null ? currentValue.intValue() : ((TextNumberPickerScreen) result.getContent()).getMinValue(), AbstractC11015b.m29571a(((TextNumberPickerScreen) result.getContent()).getProgress())));
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC13058l m34168o(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new b(upstream, this);
    }
}
