package mo1;

import com.whoop.data.remote.domain.dto.JournalMagnitudeDto;
import com.whoop.data.remote.domain.dto.JournalMagnitudeValueDto;
import com.whoop.design.models.items.BehaviorTrackerModel;
import com.whoop.design.models.items.JournalBoundsModel;
import com.whoop.design.models.items.TrackedBehaviorMetadataModel;
import com.whoop.design.models.items.TrackedBehaviorModel;
import com.whoop.design.models.items.TrackerInputModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import or2.C28205u0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import t83.InterfaceC33616a;
import tr2.InterfaceC34116n;
import w71.AbstractC36882f0;
import w71.C36901t;
import w71.C36906y;
import xn1.AbstractC38480c;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: mo1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001-B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\u001d2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u0004\u0018\u00010\u0011*\u00020\fH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b%\u0010&J!\u0010+\u001a\u00020*2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020$H\u0002¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u00020*2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020$H\u0002¢\u0006\u0004\b-\u0010,J!\u00101\u001a\u0002002\b\u0010.\u001a\u0004\u0018\u00010*2\u0006\u0010/\u001a\u00020*H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u0002042\u0006\u00103\u001a\u00020*H\u0002¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\r2\u0006\u00107\u001a\u00020\f¢\u0006\u0004\b8\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010<¨\u0006="}, m65681d2 = {"Lmo1/d;", "", "Lor2/u0;", "localizedDateTimeFormatter", "Lzr2/a;", "dateAndTimeProvider", "Ltr2/n;", "logger", "Lmo1/d$a;", "answerStyle", "<init>", "(Lor2/u0;Lzr2/a;Ltr2/n;Lmo1/d$a;)V", "Lcom/whoop/design/models/items/TrackedBehaviorModel;", "Lw71/t;", "i", "(Lcom/whoop/design/models/items/TrackedBehaviorModel;)Lw71/t;", "", "Lw71/y;", "j", "(Lcom/whoop/design/models/items/TrackedBehaviorModel;)Ljava/util/List;", "Lcom/whoop/design/models/items/BehaviorTrackerModel;", "tracker", "", "e", "(Lcom/whoop/design/models/items/BehaviorTrackerModel;)I", "Lcom/whoop/data/remote/domain/dto/JournalMagnitudeValueDto;", "magnitudeList", "", "curValue", "", "f", "(Ljava/util/List;Ljava/lang/Float;)Ljava/lang/String;", "k", "(Lcom/whoop/design/models/items/TrackedBehaviorModel;)Lw71/y;", "Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;", "metadata", "Lorg/joda/time/LocalDate;", "g", "(Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;)Lorg/joda/time/LocalDate;", "Lcom/whoop/design/models/items/JournalBoundsModel;", "journalBounds", "requestDate", "", "b", "(Lcom/whoop/design/models/items/JournalBoundsModel;Lorg/joda/time/LocalDate;)J", "a", "milliseconds", "minTime", "Lcom/whoop/design/util/TextResource;", "d", "(Ljava/lang/Long;J)Lcom/whoop/design/util/TextResource;", "dateTimeInMills", "Lorg/joda/time/DateTime;", "c", "(J)Lorg/joda/time/DateTime;", "model", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lor2/u0;", "Lzr2/a;", "Ltr2/n;", "Lmo1/d$a;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25749d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28205u0 localizedDateTimeFormatter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final a answerStyle;

    /* JADX INFO: renamed from: mo1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Lmo1/d$a;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "CHECKBOX", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum a {
        DEFAULT,
        CHECKBOX;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: mo1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101461a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.CHECKBOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f101461a = iArr;
        }
    }

    public C25749d(C28205u0 localizedDateTimeFormatter, InterfaceC41070a dateAndTimeProvider, InterfaceC34116n logger, a answerStyle) {
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(answerStyle, "answerStyle");
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.logger = logger;
        this.answerStyle = answerStyle;
    }

    /* JADX INFO: renamed from: a */
    private final long m75968a(JournalBoundsModel journalBounds, LocalDate requestDate) {
        String nextCycleSleepLower;
        if (journalBounds == null || (nextCycleSleepLower = journalBounds.getNextCycleSleepLower()) == null) {
            return AbstractC22676k.m65745e(requestDate, this.dateAndTimeProvider.mo133365d()) ? m75970c(this.dateAndTimeProvider.mo133363b()).getMillis() : requestDate.toDateTimeAtStartOfDay().plusDays(1).getMillis();
        }
        return new DateTime(nextCycleSleepLower).getMillis();
    }

    /* JADX INFO: renamed from: b */
    private final long m75969b(JournalBoundsModel journalBounds, LocalDate requestDate) {
        String currentCycleSleepLower;
        return (journalBounds == null || (currentCycleSleepLower = journalBounds.getCurrentCycleSleepLower()) == null) ? requestDate.toDateTimeAtStartOfDay().getMillis() : new DateTime(currentCycleSleepLower).getMillis();
    }

    /* JADX INFO: renamed from: c */
    private final DateTime m75970c(long dateTimeInMills) {
        DateTime dateTimeRoundFloorCopy = new DateTime(dateTimeInMills).withMinuteOfHour((new DateTime(dateTimeInMills).getMinuteOfHour() / 30) * 30).minuteOfDay().roundFloorCopy();
        AbstractC22676k.m65749i(dateTimeRoundFloorCopy, "roundFloorCopy(...)");
        return dateTimeRoundFloorCopy;
    }

    /* JADX INFO: renamed from: d */
    private final TextResource m75971d(Long milliseconds, long minTime) {
        TextResource textResourceM21278l;
        if (milliseconds != null && milliseconds.longValue() == minTime) {
            return new TextResource.C8688b(AbstractC38480c.f164867n, new TextResource.AbstractC8690d.a(C28205u0.m85378i(this.localizedDateTimeFormatter, m75970c(milliseconds.longValue()), false, 2, null)));
        }
        return (milliseconds == null || (textResourceM21278l = AbstractC8693b.m21278l(C28205u0.m85378i(this.localizedDateTimeFormatter, m75970c(milliseconds.longValue()), false, 2, null))) == null) ? AbstractC8693b.m21267a() : textResourceM21278l;
    }

    /* JADX INFO: renamed from: e */
    private final int m75972e(BehaviorTrackerModel tracker) {
        List<JournalMagnitudeValueDto> choices;
        Float value;
        JournalMagnitudeDto magnitude = tracker.getMagnitude();
        if (magnitude != null && (choices = magnitude.getChoices()) != null && choices.size() >= 2 && (value = choices.get(0).getValue()) != null) {
            float fFloatValue = value.floatValue();
            Float value2 = choices.get(1).getValue();
            if (value2 != null) {
                return (int) (value2.floatValue() - fFloatValue);
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: f */
    private final String m75973f(List<JournalMagnitudeValueDto> magnitudeList, Float curValue) {
        Object next;
        String label;
        if (magnitudeList == null) {
            return "";
        }
        Iterator<T> it = magnitudeList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65744d(((JournalMagnitudeValueDto) next).getValue(), curValue));
        JournalMagnitudeValueDto journalMagnitudeValueDto = (JournalMagnitudeValueDto) next;
        return (journalMagnitudeValueDto == null || (label = journalMagnitudeValueDto.getLabel()) == null) ? "" : label;
    }

    /* JADX INFO: renamed from: g */
    private final LocalDate m75974g(TrackedBehaviorMetadataModel metadata) {
        String requestDate;
        if (metadata == null || (requestDate = metadata.getRequestDate()) == null) {
            return null;
        }
        try {
            return DateTime.parse(requestDate).toLocalDate();
        } catch (Exception e5) {
            this.logger.mo85230v("Failed to parse requestDate: ".concat(requestDate), e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    private final C36901t m75975i(TrackedBehaviorModel trackedBehaviorModel) {
        AbstractC36882f0 aVar;
        String title;
        List<C36906y> listM75976j = m75976j(trackedBehaviorModel);
        int id4 = trackedBehaviorModel.getBehaviorTracker().getId();
        a aVar2 = this.answerStyle;
        int[] iArr = b.f101461a;
        int i13 = iArr[aVar2.ordinal()];
        if (i13 == 1) {
            TrackerInputModel trackerInput = trackedBehaviorModel.getTrackerInput();
            aVar = new AbstractC36882f0.a(trackerInput != null ? AbstractC22676k.m65745e(trackerInput.getAnsweredYes(), Boolean.TRUE) : false);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            TrackerInputModel trackerInput2 = trackedBehaviorModel.getTrackerInput();
            aVar = new AbstractC36882f0.i(trackerInput2 != null ? trackerInput2.getAnsweredYes() : null);
        }
        AbstractC36882f0 abstractC36882f0 = aVar;
        int i14 = iArr[this.answerStyle.ordinal()];
        if (i14 == 1) {
            title = trackedBehaviorModel.getBehaviorTracker().getTitle();
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            title = trackedBehaviorModel.getBehaviorTracker().getQuestionText();
        }
        String str = title == null ? "" : title;
        String title2 = trackedBehaviorModel.getBehaviorTracker().getTitle();
        C36906y c36906y = new C36906y(id4, title2 != null ? title2 : "", str, null, false, true, abstractC36882f0, null, trackedBehaviorModel.getBehaviorTracker().getDestination(), null, 664, null);
        TrackerInputModel trackerInput3 = trackedBehaviorModel.getTrackerInput();
        return new C36901t(c36906y, listM75976j, (trackerInput3 != null ? AbstractC22676k.m65745e(trackerInput3.getAnsweredYes(), Boolean.TRUE) : false) && !listM75976j.isEmpty(), this.answerStyle == a.CHECKBOX, false, null, null, 96, null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0180  */
    /* JADX INFO: renamed from: j */
    private final List<C36906y> m75976j(TrackedBehaviorModel trackedBehaviorModel) {
        C36906y c36906yM75977k;
        int iFloatValue;
        String str;
        Double magnitudeInputValue;
        Float value;
        JournalMagnitudeValueDto journalMagnitudeValueDto;
        Float value2;
        Double magnitudeInputValue2;
        String str2;
        Double magnitudeInputValue3;
        ArrayList arrayList = new ArrayList();
        JournalMagnitudeDto magnitude = trackedBehaviorModel.getBehaviorTracker().getMagnitude();
        if (magnitude != null) {
            String questionType = magnitude.getQuestionType();
            Float fValueOf = null;
            numValueOf = null;
            Integer numValueOf = null;
            fValueOf = null;
            if (AbstractC22676k.m65745e(questionType, EnumC25747b.STEPPER.getId())) {
                int id4 = trackedBehaviorModel.getBehaviorTracker().getId();
                TrackerInputModel trackerInput = trackedBehaviorModel.getTrackerInput();
                if (trackerInput != null && (magnitudeInputValue3 = trackerInput.getMagnitudeInputValue()) != null) {
                    numValueOf = Integer.valueOf((int) magnitudeInputValue3.doubleValue());
                }
                Float minInclusive = magnitude.getMinInclusive();
                int iFloatValue2 = minInclusive != null ? (int) minInclusive.floatValue() : 0;
                Float maxInclusive = magnitude.getMaxInclusive();
                AbstractC36882f0.d dVar = new AbstractC36882f0.d(numValueOf, iFloatValue2, maxInclusive != null ? (int) maxInclusive.floatValue() : 0);
                String label = magnitude.getLabel();
                if (label == null) {
                    str2 = "";
                } else {
                    if (label.length() > 0) {
                        char upperCase = Character.toUpperCase(label.charAt(0));
                        String strSubstring = label.substring(1);
                        AbstractC22676k.m65749i(strSubstring, "substring(...)");
                        label = upperCase + strSubstring;
                    }
                    if (label == null) {
                        str2 = "";
                    } else {
                        str2 = label;
                    }
                }
                arrayList.add(new C36906y(id4, null, str2, null, true, true, dVar, null, null, null, 906, null));
            } else if (AbstractC22676k.m65745e(questionType, EnumC25747b.SLIDER.getId())) {
                List<JournalMagnitudeValueDto> choices = magnitude.getChoices();
                Integer numValueOf2 = choices != null ? Integer.valueOf(choices.size()) : null;
                TrackerInputModel trackerInput2 = trackedBehaviorModel.getTrackerInput();
                Integer numValueOf3 = (trackerInput2 == null || (magnitudeInputValue2 = trackerInput2.getMagnitudeInputValue()) == null) ? null : Integer.valueOf((int) magnitudeInputValue2.doubleValue());
                int iFloatValue3 = (choices == null || (journalMagnitudeValueDto = choices.get(0)) == null || (value2 = journalMagnitudeValueDto.getValue()) == null) ? 0 : (int) value2.floatValue();
                if (choices == null) {
                    iFloatValue = 0;
                } else {
                    JournalMagnitudeValueDto journalMagnitudeValueDto2 = choices.get(numValueOf2 != null ? numValueOf2.intValue() - 1 : 0);
                    if (journalMagnitudeValueDto2 == null || (value = journalMagnitudeValueDto2.getValue()) == null) {
                        iFloatValue = 0;
                    } else {
                        iFloatValue = (int) value.floatValue();
                    }
                }
                int iM75972e = m75972e(trackedBehaviorModel.getBehaviorTracker());
                List<JournalMagnitudeValueDto> choices2 = magnitude.getChoices();
                TrackerInputModel trackerInput3 = trackedBehaviorModel.getTrackerInput();
                if (trackerInput3 != null && (magnitudeInputValue = trackerInput3.getMagnitudeInputValue()) != null) {
                    fValueOf = Float.valueOf((float) magnitudeInputValue.doubleValue());
                }
                AbstractC36882f0.e eVar = new AbstractC36882f0.e(numValueOf3, iFloatValue3, iFloatValue, iM75972e, m75973f(choices2, fValueOf));
                int id5 = trackedBehaviorModel.getBehaviorTracker().getId();
                String label2 = magnitude.getLabel();
                if (label2 == null) {
                    str = "";
                } else {
                    if (label2.length() > 0) {
                        char upperCase2 = Character.toUpperCase(label2.charAt(0));
                        String strSubstring2 = label2.substring(1);
                        AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                        label2 = upperCase2 + strSubstring2;
                    }
                    if (label2 == null) {
                        str = "";
                    } else {
                        str = label2;
                    }
                }
                arrayList.add(new C36906y(id5, null, str, null, true, false, eVar, null, null, null, 938, null));
            }
        }
        if (trackedBehaviorModel.getBehaviorTracker().getTimeLabel() != null && (c36906yM75977k = m75977k(trackedBehaviorModel)) != null) {
            arrayList.add(c36906yM75977k);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    private final C36906y m75977k(TrackedBehaviorModel trackedBehaviorModel) {
        LocalDate localDateM75974g;
        Long timeInputValue;
        TrackedBehaviorMetadataModel metadata = trackedBehaviorModel.getMetadata();
        if (metadata == null || (localDateM75974g = m75974g(metadata)) == null) {
            return null;
        }
        JournalBoundsModel journalBounds = metadata.getJournalBounds();
        long jM75969b = m75969b(journalBounds, localDateM75974g);
        long jM75968a = m75968a(journalBounds, localDateM75974g);
        TrackerInputModel trackerInput = trackedBehaviorModel.getTrackerInput();
        TextResource textResourceM75971d = m75971d(trackerInput != null ? trackerInput.getTimeInputValue() : null, jM75969b);
        TrackerInputModel trackerInput2 = trackedBehaviorModel.getTrackerInput();
        AbstractC36882f0.g gVar = new AbstractC36882f0.g(textResourceM75971d, jM75969b, jM75968a, (trackerInput2 == null || (timeInputValue = trackerInput2.getTimeInputValue()) == null) ? 0L : timeInputValue.longValue());
        int id4 = trackedBehaviorModel.getBehaviorTracker().getId();
        String timeLabel = trackedBehaviorModel.getBehaviorTracker().getTimeLabel();
        String str = timeLabel == null ? "" : timeLabel;
        String timeContextLabel = trackedBehaviorModel.getBehaviorTracker().getTimeContextLabel();
        return new C36906y(id4, null, str, timeContextLabel == null ? "" : timeContextLabel, true, true, gVar, null, trackedBehaviorModel.getBehaviorTracker().getDestination(), null, 642, null);
    }

    /* JADX INFO: renamed from: h */
    public final C36901t m75978h(TrackedBehaviorModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m75975i(model);
    }

    public /* synthetic */ C25749d(C28205u0 c28205u0, InterfaceC41070a interfaceC41070a, InterfaceC34116n interfaceC34116n, a aVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c28205u0, interfaceC41070a, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TrackedBehaviorViewStateReducer") : interfaceC34116n, (i13 & 8) != 0 ? a.DEFAULT : aVar);
    }
}
