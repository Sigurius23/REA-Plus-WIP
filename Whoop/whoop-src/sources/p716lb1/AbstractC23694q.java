package p716lb1;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.calendar.BehaviorsCalendarDayModel;
import com.whoop.design.models.calendar.BehaviorsCalendarDayStatus;
import com.whoop.design.models.calendar.BehaviorsCalendarDaysListModel;
import com.whoop.design.models.calendar.BehaviorsCalendarLegendItemModel;
import com.whoop.design.models.calendar.BehaviorsCalendarModel;
import com.whoop.design.models.calendar.BehaviorsCalendarMonthModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import zz0.C41240a;
import zz0.C41242c;
import zz0.C41247h;
import zz0.C41248i;
import zz0.C41252m;
import zz0.EnumC41241b;

/* JADX INFO: renamed from: lb1.q */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;", "model", "Lzz0/m;", "c", "(Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;)Lzz0/m;", "Lzz0/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;)Lzz0/a;", "Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;", "Lzz0/i;", "k", "(Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;)Lzz0/i;", "Lcom/whoop/design/models/calendar/BehaviorsCalendarDayModel;", "Lzz0/c;", "i", "(Lcom/whoop/design/models/calendar/BehaviorsCalendarDayModel;)Lzz0/c;", "Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;", NotificationCompat.CATEGORY_STATUS, "Lzz0/b;", "g", "(Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;)Lzz0/b;", "Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;", "Lzz0/h;", "j", "(Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;)Lzz0/h;", "Llb1/y0;", "a", "Llb1/y0;", "f", "()Llb1/y0;", "behaviorsCalendarMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23694q {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93913a = Function1.m68251a(new C23587a(18));

    /* JADX INFO: renamed from: lb1.q$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93914a;

        static {
            int[] iArr = new int[BehaviorsCalendarDayStatus.values().length];
            try {
                iArr[BehaviorsCalendarDayStatus.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BehaviorsCalendarDayStatus.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BehaviorsCalendarDayStatus.INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BehaviorsCalendarDayStatus.EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f93914a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.q$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93915w;

        public b(Function1 function1) {
            this.f93915w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93915w.invoke((BehaviorsCalendarModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C41252m m69251c(BehaviorsCalendarModel model) {
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        C41240a c41240aM69256h = m69256h(model);
        List<BehaviorsCalendarMonthModel> months = model.getMonths();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(months, 10));
        Iterator<T> it = months.iterator();
        while (it.hasNext()) {
            arrayList.add(m69259k((BehaviorsCalendarMonthModel) it.next()));
        }
        List<BehaviorsCalendarLegendItemModel> legend = model.getLegend();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(legend, 10));
        Iterator<T> it3 = legend.iterator();
        while (it3.hasNext()) {
            arrayList2.add(m69258j((BehaviorsCalendarLegendItemModel) it3.next()));
        }
        return new C41252m(textResourceM21278l, false, c41240aM69256h, arrayList, arrayList2, null, 34, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69252d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(BehaviorsCalendarModel.class), new b(new C23587a(19)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C41252m m69253e(BehaviorsCalendarModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69251c(model);
    }

    /* JADX INFO: renamed from: f */
    public static final C23743y0 m69254f() {
        return f93913a;
    }

    /* JADX INFO: renamed from: g */
    private static final EnumC41241b m69255g(BehaviorsCalendarDayStatus behaviorsCalendarDayStatus) {
        int i13 = a.f93914a[behaviorsCalendarDayStatus.ordinal()];
        if (i13 == 1) {
            return EnumC41241b.YES;
        }
        if (i13 == 2) {
            return EnumC41241b.NO;
        }
        if (i13 == 3) {
            return EnumC41241b.INVALID;
        }
        if (i13 == 4) {
            return EnumC41241b.EMPTY;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: h */
    private static final C41240a m69256h(BehaviorsCalendarModel behaviorsCalendarModel) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(behaviorsCalendarModel.getDatePicker().getCurrentDateRangeDisplay());
        String nextDateTime = behaviorsCalendarModel.getDatePicker().getNextDateTime();
        boolean z4 = !(nextDateTime == null || nextDateTime.length() == 0);
        String previousDateTime = behaviorsCalendarModel.getDatePicker().getPreviousDateTime();
        return new C41240a(textResourceM21278l, z4, !(previousDateTime == null || previousDateTime.length() == 0), behaviorsCalendarModel.getDatePicker().getNextDateTime(), behaviorsCalendarModel.getDatePicker().getPreviousDateTime());
    }

    /* JADX INFO: renamed from: i */
    private static final C41242c m69257i(BehaviorsCalendarDayModel behaviorsCalendarDayModel) {
        return new C41242c(behaviorsCalendarDayModel.getIndex(), m69255g(behaviorsCalendarDayModel.getStatus()), behaviorsCalendarDayModel.isToday());
    }

    /* JADX INFO: renamed from: j */
    private static final C41247h m69258j(BehaviorsCalendarLegendItemModel behaviorsCalendarLegendItemModel) {
        return new C41247h(m69255g(behaviorsCalendarLegendItemModel.getStatus()), AbstractC8693b.m21278l(behaviorsCalendarLegendItemModel.getLegendText()), AbstractC8693b.m21278l(behaviorsCalendarLegendItemModel.getLegendSubText()));
    }

    /* JADX INFO: renamed from: k */
    private static final C41248i m69259k(BehaviorsCalendarMonthModel behaviorsCalendarMonthModel) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(behaviorsCalendarMonthModel.getMonth());
        int yesCount = behaviorsCalendarMonthModel.getYesCount();
        List<String> dayHeaders = behaviorsCalendarMonthModel.getDayHeaders();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(dayHeaders, 10));
        Iterator<T> it = dayHeaders.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8693b.m21278l((String) it.next()));
        }
        List<BehaviorsCalendarDaysListModel> weeks = behaviorsCalendarMonthModel.getWeeks();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(weeks, 10));
        Iterator<T> it3 = weeks.iterator();
        while (it3.hasNext()) {
            List<BehaviorsCalendarDayModel> days = ((BehaviorsCalendarDaysListModel) it3.next()).getDays();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(days, 10));
            Iterator<T> it4 = days.iterator();
            while (it4.hasNext()) {
                arrayList3.add(m69257i((BehaviorsCalendarDayModel) it4.next()));
            }
            arrayList2.add(arrayList3);
        }
        return new C41248i(textResourceM21278l, yesCount, arrayList, arrayList2);
    }
}
