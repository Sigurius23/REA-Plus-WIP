package ri1;

import cj1.EnumC4767w;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.health.domain.models.CardSupplementalInfo;
import com.whoop.health.domain.models.DataVisualizationCardBodyModel;
import com.whoop.health.domain.models.HeartScreenerStatus;
import com.whoop.health.domain.models.HeartScreenerUpdatedAtInfoModel;
import com.whoop.health.domain.models.ImageVisualizationCardBodyModel;
import com.whoop.health.domain.models.ImageVisualizationTrend;
import com.whoop.health.domain.models.MiniStatus;
import com.whoop.health.domain.models.ScreenerStatusTileBodyModel;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.navigation.LabradorReadingModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import hy0.EnumC17727b2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import oi1.AbstractC27949a;
import org.joda.time.DateTime;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qk1.C30443a;
import rk1.EnumC31496c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ri1.q */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010$J+\u0010+\u001a\u00020)2\u0006\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J%\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00112\u0006\u0010&\u001a\u00020%2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b0\u00101J%\u00103\u001a\b\u0012\u0004\u0012\u00020/0\u00112\u0006\u0010&\u001a\u00020%2\b\u00102\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00105R\u0014\u00107\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u00105R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00109¨\u0006;"}, m65681d2 = {"Lri1/q;", "", "Ljava/time/ZoneId;", "zone", "<init>", "(Ljava/time/ZoneId;)V", "Lrk1/c;", "state", "", "g", "(Lrk1/c;)Ljava/lang/String;", "localReadingState", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lrk1/c;)Lcom/whoop/design/util/TextResource;", "Lcj1/w;", "determinationState", "", "Lcom/whoop/health/domain/models/HeartScreenerStatus;", "b", "(Lcj1/w;Lrk1/c;)Ljava/util/List;", "Lcom/whoop/health/domain/models/MiniStatus;", "d", "(Lcj1/w;)Lcom/whoop/health/domain/models/MiniStatus;", "c", "(Lrk1/c;)Lcom/whoop/health/domain/models/MiniStatus;", "Lhy0/b2;", "f", "(Lcj1/w;)Lhy0/b2;", "e", "(Lcj1/w;Lrk1/c;)Lcom/whoop/design/util/TextResource;", "j", "(Lrk1/c;)Lhy0/b2;", "trendTitle", "Lcom/whoop/design/models/items/ImpactModel;", "i", "(Lrk1/c;Ljava/lang/String;)Lcom/whoop/design/models/items/ImpactModel;", "Lqk1/a;", "model", "", "shouldShowShepherdOnboardingTile", "Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;", "dataVisualizationCardBodyModel", "k", "(Lqk1/a;ZLcom/whoop/health/domain/models/DataVisualizationCardBodyModel;)Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;", "Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;", "updatedAtInfo", "Lcom/whoop/design/models/DesignSystemModel;", "l", "(Lqk1/a;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;)Ljava/util/List;", "shepherdState", "a", "(Lqk1/a;Lcj1/w;)Ljava/util/List;", "Ljava/lang/String;", "NO_IRREGULAR_IMAGE", "IRREGULAR_IMAGE", "Ljava/time/format/DateTimeFormatter;", "Ljava/time/format/DateTimeFormatter;", "printer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31468q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String NO_IRREGULAR_IMAGE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String IRREGULAR_IMAGE;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final DateTimeFormatter printer;

    /* JADX INFO: renamed from: ri1.q$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f129665a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f129666b;

        static {
            int[] iArr = new int[EnumC31496c.values().length];
            try {
                iArr[EnumC31496c.SinusRhythm.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31496c.Inconclusive.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC31496c.Unreadable.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC31496c.HighHeartRateNoShepherdDetected.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC31496c.HighHeartRate.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC31496c.LowHeartRate.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC31496c.Shepherd.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC31496c.ShepherdHighHeartRate.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f129665a = iArr;
            int[] iArr2 = new int[EnumC4767w.values().length];
            try {
                iArr2[EnumC4767w.AFIB.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC4767w.NOT_AFIB.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC4767w.INCONCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC4767w.INSUFFICIENT_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            f129666b = iArr2;
        }
    }

    public C31468q(ZoneId zone) {
        AbstractC22676k.m65750j(zone, "zone");
        this.NO_IRREGULAR_IMAGE = "https://app-cdn.prod.whoop.com/labrador/entrypoint/heart.png";
        this.IRREGULAR_IMAGE = "https://app-cdn.prod.whoop.com/labrador/entrypoint/heart_with_alert.png";
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern("MMM d, yyyy - h:mma", Locale.US).withZone(zone);
        AbstractC22676k.m65749i(dateTimeFormatterWithZone, "withZone(...)");
        this.printer = dateTimeFormatterWithZone;
    }

    /* JADX INFO: renamed from: b */
    private final List<HeartScreenerStatus> m96909b(EnumC4767w state, EnumC31496c determinationState) {
        ArrayList arrayListM118964P = state != null ? AbstractC37056f.m118964P(new HeartScreenerStatus(AbstractC8693b.m21277k(AbstractC27949a.f112722a), "SHEPHERD", m96911d(state))) : new ArrayList();
        arrayListM118964P.add(new HeartScreenerStatus(AbstractC8693b.m21277k(AbstractC27949a.f112728g), "LABRADOR", m96910c(determinationState)));
        return arrayListM118964P;
    }

    /* JADX INFO: renamed from: c */
    private final MiniStatus m96910c(EnumC31496c determinationState) {
        return new MiniStatus(a.f129665a[determinationState.ordinal()] == 1 ? "TINY_CHECKMARK" : "TINY_ATTENTION", m96917j(determinationState).name());
    }

    /* JADX INFO: renamed from: d */
    private final MiniStatus m96911d(EnumC4767w state) {
        String str;
        int i13 = a.f129666b[state.ordinal()];
        if (i13 == 1) {
            str = "TINY_ATTENTION";
        } else if (i13 == 2) {
            str = "TINY_CHECKMARK";
        } else {
            if (i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "REMOVE";
        }
        return new MiniStatus(str, m96913f(state).name());
    }

    /* JADX INFO: renamed from: e */
    private final TextResource m96912e(EnumC4767w state, EnumC31496c determinationState) {
        boolean z4 = determinationState == EnumC31496c.Shepherd || determinationState == EnumC31496c.ShepherdHighHeartRate;
        boolean z13 = state == EnumC4767w.AFIB;
        if (z4 && z13) {
            return AbstractC8693b.m21277k(AbstractC27949a.f112731j);
        }
        if (z4) {
            return AbstractC8693b.m21277k(AbstractC27949a.f112733l);
        }
        if (z13) {
            return AbstractC8693b.m21277k(AbstractC27949a.f112732k);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private final EnumC17727b2 m96913f(EnumC4767w state) {
        int i13 = a.f129666b[state.ordinal()];
        if (i13 == 1) {
            return EnumC17727b2.CONCERN_RANGE;
        }
        if (i13 == 2) {
            return EnumC17727b2.POSITIVE_RANGE;
        }
        if (i13 == 3 || i13 == 4) {
            return EnumC17727b2.NO_CHANGE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g */
    private final String m96914g(EnumC31496c state) {
        switch (a.f129665a[state.ordinal()]) {
            case 1:
                return "AFib not Detected";
            case 2:
                return "Inconclusive";
            case 3:
                return "Unreadable";
            case 4:
            case 5:
                return "High HR";
            case 6:
                return "Low HR";
            case 7:
            case 8:
                return "Possible AFib Detected";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: h */
    private final TextResource m96915h(EnumC31496c localReadingState) {
        int i13 = a.f129665a[localReadingState.ordinal()];
        return (i13 == 7 || i13 == 8) ? AbstractC8693b.m21277k(AbstractC27949a.f112727f) : AbstractC8693b.m21277k(AbstractC27949a.f112726e);
    }

    /* JADX INFO: renamed from: i */
    private final ImpactModel m96916i(EnumC31496c state, String trendTitle) {
        int i13 = a.f129665a[state.ordinal()];
        if (i13 != 1 && i13 != 2) {
            return i13 != 3 ? new ImpactModel(trendTitle, true, EnumC17727b2.CONCERN_RANGE, (String) null, (C9598e) null, 16, (DefaultConstructorMarker) null) : new ImpactModel(trendTitle, true, EnumC17727b2.NEUTRAL, (String) null, (C9598e) null, 16, (DefaultConstructorMarker) null);
        }
        return new ImpactModel(trendTitle, true, EnumC17727b2.POSITIVE_RANGE, (String) null, (C9598e) null, 16, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: j */
    private final EnumC17727b2 m96917j(EnumC31496c state) {
        int i13 = a.f129665a[state.ordinal()];
        if (i13 != 1) {
            return (i13 == 7 || i13 == 8) ? EnumC17727b2.CONCERN_RANGE : EnumC17727b2.NO_CHANGE;
        }
        return EnumC17727b2.POSITIVE_RANGE;
    }

    /* JADX INFO: renamed from: a */
    public final List<DesignSystemModel> m96918a(C30443a model, EnumC4767w shepherdState) {
        String str;
        AbstractC22676k.m65750j(model, "model");
        EnumC31496c enumC31496cM97036a = EnumC31496c.INSTANCE.m97036a(model.getClassification());
        TextResource textResourceM96915h = m96915h(enumC31496cM97036a);
        String str2 = this.printer.format(Instant.ofEpochMilli(model.getTimestamp()));
        AbstractC22676k.m65747g(str2);
        ImpactModel impactModelM96916i = m96916i(enumC31496cM97036a, str2);
        TextResource textResourceM96912e = m96912e(shepherdState, enumC31496cM97036a);
        TextResource.C8688b c8688bM21277k = shepherdState == null ? AbstractC8693b.m21277k(AbstractC27949a.f112729h) : null;
        List listM118958J = AbstractC37056f.m118958J(new ImageVisualizationTrend(AbstractC8693b.m21278l(impactModelM96916i.getTitleDisplay()), impactModelM96916i.getBackgroundEnabled(), impactModelM96916i.getTrend(), impactModelM96916i.getIcon()));
        if (textResourceM96912e == null || (str = this.IRREGULAR_IMAGE) == null) {
            str = this.NO_IRREGULAR_IMAGE;
        }
        ArrayList arrayListM118964P = AbstractC37056f.m118964P(new ImageVisualizationCardBodyModel(c8688bM21277k, textResourceM96915h, listM118958J, str));
        if (shepherdState != null) {
            arrayListM118964P.add(new ScreenerStatusTileBodyModel(m96909b(shepherdState, enumC31496cM97036a), textResourceM96912e));
        } else if (textResourceM96912e != null) {
            arrayListM118964P.add(new ScreenerStatusTileBodyModel(C25271y.f99162w, textResourceM96912e));
        }
        if (enumC31496cM97036a != EnumC31496c.SinusRhythm) {
            arrayListM118964P.add(new CardButtonModel((String) null, AbstractC8693b.m21277k(AbstractC27949a.f112735n), "ADD", (String) null, (String) null, "LIGHT_BACKGROUND", (String) null, new C9598e(AppScreen.C9331i3.f27672w, new LabradorReadingModel((String) null, 1, (DefaultConstructorMarker) null), null, 4, null), (Action) null, (AnalyticEventModel) null, (AnyModal) null, (String) null, (String) null, (String) null, (String) null, (DismissEventModel) null, (Boolean) null, (GenericInteraction) null, (Map) null, (Map) null, 1012288, (DefaultConstructorMarker) null));
        }
        return arrayListM118964P;
    }

    /* JADX INFO: renamed from: k */
    public final DataVisualizationCardBodyModel m96919k(C30443a model, boolean shouldShowShepherdOnboardingTile, DataVisualizationCardBodyModel dataVisualizationCardBodyModel) {
        CardSupplementalInfo cardSupplementalInfo;
        AbstractC22676k.m65750j(model, "model");
        EnumC31496c enumC31496cM97036a = EnumC31496c.INSTANCE.m97036a(model.getClassification());
        String strM96914g = m96914g(enumC31496cM97036a);
        String str = this.printer.format(Instant.ofEpochMilli(model.getTimestamp()));
        AbstractC22676k.m65747g(str);
        ImpactModel impactModelM96916i = m96916i(enumC31496cM97036a, str);
        List<List> listM74156w1 = AbstractC25265s.m74156w1(model.m93121g(), model.m93121g().size() / 10);
        ArrayList arrayList = new ArrayList();
        for (List list : listM74156w1) {
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Double.valueOf(((Number) it.next()).intValue()));
            }
            AbstractC25265s.m74141p0(arrayList, arrayList2);
        }
        CardSupplementalInfo cardSupplementalInfo2 = new CardSupplementalInfo((dataVisualizationCardBodyModel == null || (cardSupplementalInfo = dataVisualizationCardBodyModel.getCardSupplementalInfo()) == null) ? null : cardSupplementalInfo.getLatestProcessedTimestamp(), AbstractC25267u.m74164j0(AbstractC25265s.m74153v0(arrayList, 3)), new DateTime(model.getTimestamp()).toString());
        return new DataVisualizationCardBodyModel("ECG REPORT", strM96914g, impactModelM96916i, (GraphModel) null, shouldShowShepherdOnboardingTile ? AbstractC31462k.m96896d() : null, AbstractC31462k.m96897e(), cardSupplementalInfo2, 8, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: l */
    public final List<DesignSystemModel> m96920l(C30443a model, HeartScreenerUpdatedAtInfoModel updatedAtInfo) {
        String shepherdState;
        AbstractC22676k.m65750j(model, "model");
        EnumC4767w enumC4767w = null;
        if (updatedAtInfo != null && (shepherdState = updatedAtInfo.getShepherdState()) != null) {
            for (EnumC4767w enumC4767w2 : EnumC4767w.values()) {
                if (AbstractC22676k.m65745e(enumC4767w2.name(), shepherdState)) {
                    enumC4767w = enumC4767w2;
                    break;
                }
            }
        }
        return m96918a(model, enumC4767w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C31468q(ZoneId zoneId, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            zoneId = ZoneId.systemDefault();
            AbstractC22676k.m65749i(zoneId, "systemDefault(...)");
        }
        this(zoneId);
    }
}
