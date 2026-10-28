package cm2;

import am2.InterfaceC1038q;
import android.content.Context;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.trends.data.model.ManualMeasurementModelV2;
import com.whoop.trends.data.model.TrendMenuSheetSourceItem;
import hv1.AbstractC17674d;
import hv1.C17671a;
import hv1.C17672b;
import hv1.C17673c;
import hv1.C17675e;
import hv1.C17676f;
import hv1.C17677g;
import hv1.EnumC17678h;
import hy0.C17736e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import m83.AbstractC25267u;
import p294l3.C23254g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import sl2.AbstractC32706a;
import vl2.C36109b0;
import vl2.InterfaceC36115h;
import vl2.InterfaceC36116i;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: cm2.t */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u00013B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\b*\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u0014*\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJM\u0010+\u001a\u00020**\u00020\u001f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001c2\b\u0010'\u001a\u0004\u0018\u00010\b2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u0004\u0018\u00010**\u00020\u001f2\u0006\u0010!\u001a\u00020 2\b\u0010'\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b-\u0010.J'\u0010/\u001a\u00020(2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b/\u00100J'\u00103\u001a\u0002022\u0006\u00101\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u00104J!\u00108\u001a\u0002072\u0006\u00106\u001a\u0002052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010;¨\u0006<"}, m65681d2 = {"Lcm2/t;", "", "Ljava/time/Clock;", "clock", "Landroid/content/Context;", "context", "<init>", "(Ljava/time/Clock;Landroid/content/Context;)V", "", "timestamp", "Ljava/time/LocalDateTime;", "e", "(Ljava/lang/String;)Ljava/time/LocalDateTime;", "Ljava/time/LocalDate;", "localDateNow", "today", "b", "(Ljava/time/LocalDateTime;Ljava/time/LocalDate;Ljava/lang/String;)Ljava/lang/String;", "Ljava/time/ZoneId;", "zoneId", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)J", "updatedSource", "selectedSource", "", "Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;", "sourceItems", "Lhv1/f;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lhv1/f;", "Lcom/whoop/trends/data/model/ManualMeasurementModelV2;", "Lcm2/i;", "measurementType", "updatedTimeStamp", "", "vo2MaxValue", "unit", "selectedSourceViewState", "recordUUId", "", "isTimeSelected", "Lhv1/a;", "i", "(Lcom/whoop/trends/data/model/ManualMeasurementModelV2;Lcm2/i;Ljava/time/LocalDateTime;ILjava/lang/String;Lhv1/f;Ljava/lang/String;Z)Lhv1/a;", "j", "(Lcom/whoop/trends/data/model/ManualMeasurementModelV2;Lcm2/i;Ljava/lang/String;)Lhv1/a;", "d", "(ILhv1/f;Z)Z", "description", "Ll3/g;", "a", "(Ljava/lang/String;ILjava/lang/String;)Ll3/g;", "Lvl2/i;", "model", "Lhv1/e;", "f", "(Lvl2/i;Ljava/lang/String;)Lhv1/e;", "Ljava/time/Clock;", "Landroid/content/Context;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4832t {

    /* JADX INFO: renamed from: d */
    public static final int f19888d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context context;

    public C4832t(Clock clock, Context context) {
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(context, "context");
        this.clock = clock;
        this.context = context;
    }

    /* JADX INFO: renamed from: a */
    private final C23254g m15259a(String description, int vo2MaxValue, String unit) {
        String string = this.context.getString(AbstractC32706a.f135970x, Integer.valueOf(vo2MaxValue), unit, description);
        AbstractC22676k.m65749i(string, "getString(...)");
        return new C23254g(string);
    }

    /* JADX INFO: renamed from: b */
    private final String m15260b(LocalDateTime localDateTime, LocalDate localDate, String str) {
        if (AbstractC22676k.m65745e(localDateTime.toLocalDate(), localDate)) {
            return str;
        }
        String str2 = localDateTime.format(DateTimeFormatter.ofPattern("MMM d, yyyy", Locale.getDefault()));
        AbstractC22676k.m65749i(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: renamed from: c */
    private final C17676f m15261c(String updatedSource, String selectedSource, List<TrendMenuSheetSourceItem> sourceItems) {
        Object obj;
        EnumC17678h enumC17678h;
        String displayValue;
        if (updatedSource == null) {
            updatedSource = selectedSource;
        }
        EnumC17678h enumC17678h2 = EnumC17678h.UNKNOWN;
        EnumC17678h[] enumC17678hArrValues = EnumC17678h.values();
        int length = enumC17678hArrValues.length;
        int i13 = 0;
        while (true) {
            obj = null;
            if (i13 >= length) {
                enumC17678h = null;
                break;
            }
            enumC17678h = enumC17678hArrValues[i13];
            if (AbstractC22676k.m65745e(enumC17678h.name(), updatedSource)) {
                break;
            }
            i13++;
        }
        if (enumC17678h != null) {
            enumC17678h2 = enumC17678h;
        }
        for (Object obj2 : sourceItems) {
            if (AbstractC22676k.m65745e(((TrendMenuSheetSourceItem) obj2).getValue(), enumC17678h2.name())) {
                obj = obj2;
                break;
            }
        }
        TrendMenuSheetSourceItem trendMenuSheetSourceItem = (TrendMenuSheetSourceItem) obj;
        if (trendMenuSheetSourceItem == null || (displayValue = trendMenuSheetSourceItem.getDisplayValue()) == null) {
            displayValue = "";
        }
        return new C17676f(enumC17678h2, AbstractC8693b.m21278l(displayValue));
    }

    /* JADX INFO: renamed from: d */
    private final boolean m15262d(int vo2MaxValue, C17676f selectedSourceViewState, boolean isTimeSelected) {
        return 15 <= vo2MaxValue && vo2MaxValue < 101 && selectedSourceViewState.getSourceValue() != EnumC17678h.UNKNOWN && isTimeSelected;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.time.LocalDateTime] */
    /* JADX INFO: renamed from: e */
    private final LocalDateTime m15263e(String timestamp) {
        try {
            ?? localDateTime = ZonedDateTime.parse(timestamp, DateTimeFormatter.ISO_OFFSET_DATE_TIME).withZoneSameInstant(this.clock.getZone()).toLocalDateTime();
            AbstractC22676k.m65747g(localDateTime);
            return localDateTime;
        } catch (Exception unused) {
            LocalDateTime localDateTime2 = LocalDateTime.parse(timestamp, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            AbstractC22676k.m65747g(localDateTime2);
            return localDateTime2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C17675e m15264g(C4832t c4832t, InterfaceC36116i interfaceC36116i, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        return c4832t.m15268f(interfaceC36116i, str);
    }

    /* JADX INFO: renamed from: h */
    private final long m15265h(LocalDateTime localDateTime, ZoneId zoneId) {
        return localDateTime.atZone(zoneId).toInstant().toEpochMilli();
    }

    /* JADX INFO: renamed from: i */
    private final C17671a m15266i(ManualMeasurementModelV2 manualMeasurementModelV2, EnumC4821i enumC4821i, LocalDateTime localDateTime, int i13, String str, C17676f c17676f, String str2, boolean z4) {
        return new C17671a(AbstractC8693b.m21278l(manualMeasurementModelV2.getSaveTitle()), m15262d(i13, c17676f, z4), new C17672b(AbstractC8693b.m21278l(manualMeasurementModelV2.getConfirmDialog().getTitle()), null, m15259a(manualMeasurementModelV2.getConfirmDialog().getDescription(), i13, str), AbstractC8693b.m21278l(manualMeasurementModelV2.getConfirmDialog().getPrimaryButtonTitle()), AbstractC8693b.m21278l(manualMeasurementModelV2.getConfirmDialog().getSecondaryButtonTitle()), null, false, str2 != null ? new InterfaceC1038q.c(enumC4821i, new AbstractC17674d.a(localDateTime, i13, c17676f.getSourceValue(), str2)) : new InterfaceC1038q.e(enumC4821i, new AbstractC17674d.a(localDateTime, i13, c17676f.getSourceValue(), null)), 96, null));
    }

    /* JADX INFO: renamed from: j */
    private final C17671a m15267j(ManualMeasurementModelV2 manualMeasurementModelV2, EnumC4821i enumC4821i, String str) {
        String deleteTitle = manualMeasurementModelV2.getDeleteTitle();
        if (deleteTitle == null || AbstractC39414r.m125890i0(deleteTitle) || str == null) {
            return null;
        }
        return new C17671a(AbstractC8693b.m21278l(manualMeasurementModelV2.getDeleteTitle()), true, new C17672b(AbstractC8693b.m21277k(AbstractC32706a.f135945C), AbstractC8693b.m21277k(AbstractC32706a.f135944B), null, AbstractC8693b.m21277k(AbstractC32706a.f135943A), AbstractC8693b.m21277k(AbstractC32706a.f135969w), EnumC39333f.BRAND_WHITE, false, new InterfaceC1038q.b(enumC4821i, str), 4, null));
    }

    /* JADX INFO: renamed from: f */
    public final C17675e m15268f(InterfaceC36116i model, String recordUUId) {
        String strM15260b;
        EnumC17678h enumC17678h;
        Integer vo2Max;
        LocalDateTime date;
        AbstractC22676k.m65750j(model, "model");
        if (!(model instanceof InterfaceC36116i.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC36116i.a aVar = (InterfaceC36116i.a) model;
        ManualMeasurementModelV2 trendMenuSheet = aVar.getTrendMenuSheet();
        InterfaceC36115h.a trendMenuSheetDomainState = aVar.getTrendMenuSheetDomainState();
        C36109b0 updatedFormData = trendMenuSheetDomainState != null ? trendMenuSheetDomainState.getUpdatedFormData() : null;
        LocalDateTime localDateTimeNow = (updatedFormData == null || (date = updatedFormData.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()) == null) ? AbstractC39414r.m125890i0(trendMenuSheet.getTimestamp()) ? LocalDateTime.now(this.clock) : m15263e(trendMenuSheet.getTimestamp()) : date;
        LocalDateTime localDateTimeM15263e = m15263e(trendMenuSheet.getStartDateTimestamp());
        int vo2MaxValue = (updatedFormData == null || (vo2Max = updatedFormData.getVo2Max()) == null) ? (int) trendMenuSheet.getVo2MaxValue() : vo2Max.intValue();
        C17676f c17676fM15261c = m15261c(updatedFormData != null ? updatedFormData.getSource() : null, trendMenuSheet.getSelectedSource(), trendMenuSheet.getSourceItems());
        TextResource textResourceM21278l = AbstractC8693b.m21278l(trendMenuSheet.getTitle());
        C17736e c17736e = new C17736e(null, null, AbstractC8693b.m21277k(AbstractC32706a.f135955i), 3, null);
        if ((updatedFormData != null ? updatedFormData.getCom.mapbox.common.HttpHeaders.DATE java.lang.String() : null) == null && recordUUId == null) {
            strM15260b = this.context.getString(AbstractC32706a.f135971y);
        } else {
            AbstractC22676k.m65747g(localDateTimeNow);
            LocalDate localDateNow = LocalDate.now(this.clock);
            AbstractC22676k.m65749i(localDateNow, "now(...)");
            String string = this.context.getString(AbstractC32706a.f135972z);
            AbstractC22676k.m65749i(string, "getString(...)");
            strM15260b = m15260b(localDateTimeNow, localDateNow, string);
        }
        AbstractC22676k.m65747g(strM15260b);
        AbstractC22676k.m65747g(localDateTimeNow);
        ZoneId zone = this.clock.getZone();
        AbstractC22676k.m65749i(zone, "getZone(...)");
        long jM15265h = m15265h(localDateTimeM15263e, zone);
        LocalDateTime localDateTimeNow2 = LocalDateTime.now(this.clock);
        AbstractC22676k.m65749i(localDateTimeNow2, "now(...)");
        ZoneId zone2 = this.clock.getZone();
        AbstractC22676k.m65749i(zone2, "getZone(...)");
        C17673c c17673c = new C17673c(strM15260b, localDateTimeNow, jM15265h, m15265h(localDateTimeNow2, zone2));
        C17736e c17736e2 = new C17736e(null, null, AbstractC8693b.m21277k(AbstractC32706a.f135967u), 3, null);
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(trendMenuSheet.getMeasurementTitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(trendMenuSheet.getVo2MaxUnit());
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC32706a.f135966t);
        List<TrendMenuSheetSourceItem> sourceItems = trendMenuSheet.getSourceItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sourceItems, 10));
        for (TrendMenuSheetSourceItem trendMenuSheetSourceItem : sourceItems) {
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(trendMenuSheetSourceItem.getDisplayValue());
            String value = trendMenuSheetSourceItem.getValue();
            EnumC17678h enumC17678h2 = EnumC17678h.UNKNOWN;
            EnumC17678h[] enumC17678hArrValues = EnumC17678h.values();
            int length = enumC17678hArrValues.length;
            ManualMeasurementModelV2 manualMeasurementModelV2 = trendMenuSheet;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC17678h = null;
                    break;
                }
                enumC17678h = enumC17678hArrValues[i13];
                int i14 = length;
                if (AbstractC22676k.m65745e(enumC17678h.name(), value)) {
                    break;
                }
                i13++;
                length = i14;
            }
            if (enumC17678h != null) {
                enumC17678h2 = enumC17678h;
            }
            arrayList.add(new C17676f(enumC17678h2, textResourceM21278l4));
            trendMenuSheet = manualMeasurementModelV2;
        }
        ManualMeasurementModelV2 manualMeasurementModelV3 = trendMenuSheet;
        int i15 = vo2MaxValue;
        return new C17675e(textResourceM21278l, AbstractC37056f.m118959K(c17736e, c17673c, c17736e2, new C17677g(textResourceM21278l2, i15, 100, 15, textResourceM21278l3, c8688bM21277k, c17676fM15261c, arrayList)), EnumC4821i.VO2_MAX, recordUUId, m15266i(manualMeasurementModelV3, r3, localDateTimeNow, i15, manualMeasurementModelV3.getVo2MaxUnit(), c17676fM15261c, recordUUId, ((updatedFormData != null ? updatedFormData.getCom.mapbox.common.HttpHeaders.DATE java.lang.String() : null) == null && recordUUId == null) ? false : true), m15267j(manualMeasurementModelV3, r3, recordUUId));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4832t(Clock clock, Context context, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            clock = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clock, "systemDefaultZone(...)");
        }
        this(clock, context);
    }
}
