package to1;

import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.calendar.CalendarDateModel;
import java.util.Collection;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: to1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "dateModels", "", HttpHeaders.DATE, "", "a", "(Ljava/util/List;Ljava/lang/String;)Z", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34013f {
    /* JADX INFO: renamed from: a */
    public static final boolean m107517a(List<CalendarDateModel> dateModels, String str) {
        AbstractC22676k.m65750j(dateModels, "dateModels");
        if (str == null) {
            return false;
        }
        List<CalendarDateModel> list = dateModels;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (CalendarDateModel calendarDateModel : list) {
            if (AbstractC22676k.m65745e(calendarDateModel.getDate(), str) && AbstractC22676k.m65745e(calendarDateModel.isHidden(), Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }
}
