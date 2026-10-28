package ds1;

import com.whoop.data.remote.domain.dto.QuestionType;
import com.whoop.data.remote.domain.response.journal.JournalBehaviorTracker;
import com.whoop.data.remote.domain.response.journal.JournalMagnitude;
import com.whoop.data.remote.domain.response.journal.JournalMagnitudeValue;
import java.util.Iterator;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ds1.m */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\n\u001a\u00020\t2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;", "tracker", "", "a", "(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;)I", "", "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitudeValue;", "magnitudeList", "curValue", "", "b", "(Ljava/util/List;Ljava/lang/Integer;)Ljava/lang/String;", "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;", "magnitude", "c", "(Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;)Ljava/lang/String;", "journal_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12343m {

    /* JADX INFO: renamed from: ds1.m$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41496a;

        static {
            int[] iArr = new int[QuestionType.values().length];
            try {
                iArr[QuestionType.FREEFORM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f41496a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final int m34505a(JournalBehaviorTracker tracker) {
        AbstractC22676k.m65750j(tracker, "tracker");
        JournalMagnitude magnitude = tracker.getMagnitude();
        List<JournalMagnitudeValue> stepValues = magnitude != null ? magnitude.getStepValues() : null;
        if (stepValues == null || stepValues.size() < 2) {
            return 1;
        }
        return (int) (stepValues.get(1).getValue() - stepValues.get(0).getValue());
    }

    /* JADX INFO: renamed from: b */
    public static final String m34506b(List<JournalMagnitudeValue> list, Integer num) {
        Object next;
        if (list == null) {
            return "";
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int value = (int) ((JournalMagnitudeValue) next).getValue();
            if (num != null && value == num.intValue()) {
                break;
            }
        }
        JournalMagnitudeValue journalMagnitudeValue = (JournalMagnitudeValue) next;
        String label = journalMagnitudeValue != null ? journalMagnitudeValue.getLabel() : null;
        return label == null ? "" : label;
    }

    /* JADX INFO: renamed from: c */
    public static final String m34507c(JournalMagnitude journalMagnitude) {
        String units;
        QuestionType questionType = journalMagnitude != null ? journalMagnitude.getQuestionType() : null;
        return ((questionType == null ? -1 : a.f41496a[questionType.ordinal()]) != 1 || (units = journalMagnitude.getUnits()) == null) ? "" : units;
    }
}
