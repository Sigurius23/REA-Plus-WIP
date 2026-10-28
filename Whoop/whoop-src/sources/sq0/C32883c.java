package sq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import com.mapbox.common.HttpHeaders;
import com.whoop.community.domain.model.teams.TimePeriod;
import com.whoop.service.network.model.UserSessionDto;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.ViewOnClickListenerC19676a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import vu1.AbstractC36510a;
import xp0.AbstractC38501b0;
import xp0.AbstractC38528y;
import xp0.AbstractC38529z;

/* JADX INFO: renamed from: sq0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010\u001aJ\u000f\u0010'\u001a\u00020\u0010H\u0002¢\u0006\u0004\b'\u0010\u001aJ\u001d\u0010)\u001a\u00020\u00162\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\u0002¢\u0006\u0004\b)\u0010 J\u0017\u0010+\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b-\u0010\u001cJ\u000f\u0010.\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010\u001cJ\u0017\u0010/\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b/\u0010#J\u0017\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u00102R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010?R\"\u0010C\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R$\u0010J\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR>\u0010T\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00100Lj\b\u0012\u0004\u0012\u00020\u0010`M0K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR&\u0010W\u001a\u0012\u0012\u0004\u0012\u00020\u00100Lj\b\u0012\u0004\u0012\u00020\u0010`M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR$\u0010[\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010X\u001a\u0004\bU\u0010Y\"\u0004\bZ\u0010,R$\u0010]\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010X\u001a\u0004\b@\u0010Y\"\u0004\b\\\u0010,R\"\u0010a\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\bN\u0010\u001a\"\u0004\b`\u0010#¨\u0006b"}, m65681d2 = {"Lsq0/c;", "Landroidx/recyclerview/widget/i1;", "Lsq0/b;", "", "Lsq0/a;", "dataCellList", "Ljava/util/Date;", "selectedDate", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "timePeriodType", "", "isRtl", "<init>", "(Ljava/util/List;Ljava/util/Date;Lcom/whoop/community/domain/model/teams/TimePeriod;Z)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "l", "(Landroid/view/ViewGroup;I)Lsq0/b;", "holder", "position", "Ll83/a0;", "j", "(Lsq0/b;I)V", "getItemCount", "()I", "s", "()V", "x", "oldSelectedView", "m", "(Ljava/util/List;)V", "week", "o", "(I)V", "f", "(I)I", "c", "d", "currentSelectedViews", "v", "dateCell", "r", "(Lsq0/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "n", "b", HttpHeaders.DATE, "i", "(Ljava/util/Date;)I", "a", "Ljava/util/List;", "Ljava/util/Date;", "getSelectedDate", "()Ljava/util/Date;", "setSelectedDate", "(Ljava/util/Date;)V", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "getTimePeriodType", "()Lcom/whoop/community/domain/model/teams/TimePeriod;", "u", "(Lcom/whoop/community/domain/model/teams/TimePeriod;)V", "Z", "e", "getFlag", "p", "flag", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "getSelectedInstance", "()Ljava/util/Calendar;", "t", "(Ljava/util/Calendar;)V", "selectedInstance", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "g", "Ljava/util/HashMap;", "getMonthWeekPair", "()Ljava/util/HashMap;", "q", "(Ljava/util/HashMap;)V", "monthWeekPair", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/ArrayList;", "selectedView", "Lsq0/a;", "()Lsq0/a;", "setStartDateCell", "startDateCell", "setEndDateCell", "endDateCell", "k", "I", "setSelectedPosition", "selectedPosition", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32883c extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private List<C32881a> dataCellList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Date selectedDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private TimePeriod timePeriodType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isRtl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private TimePeriod flag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Calendar selectedInstance;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private HashMap<Integer, ArrayList<Integer>> monthWeekPair;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ArrayList<Integer> selectedView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private C32881a startDateCell;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private C32881a endDateCell;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int selectedPosition;

    /* JADX INFO: renamed from: sq0.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f137049a;

        static {
            int[] iArr = new int[TimePeriod.values().length];
            try {
                iArr[TimePeriod.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimePeriod.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimePeriod.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f137049a = iArr;
        }
    }

    public C32883c(List<C32881a> dataCellList, Date date, TimePeriod timePeriodType, boolean z4) {
        AbstractC22676k.m65750j(dataCellList, "dataCellList");
        AbstractC22676k.m65750j(timePeriodType, "timePeriodType");
        this.dataCellList = dataCellList;
        this.selectedDate = date;
        this.timePeriodType = timePeriodType;
        this.isRtl = z4;
        this.flag = TimePeriod.DAILY;
        this.monthWeekPair = new HashMap<>();
        this.selectedView = new ArrayList<>();
        this.selectedPosition = -1;
    }

    /* JADX INFO: renamed from: b */
    private final void m103196b(int position) {
        int iM103200i = m103200i(this.dataCellList.get(position).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
        if (!this.monthWeekPair.containsKey(Integer.valueOf(iM103200i))) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(Integer.valueOf(position));
            this.monthWeekPair.put(Integer.valueOf(iM103200i), arrayList);
        } else {
            ArrayList<Integer> arrayList2 = this.monthWeekPair.get(Integer.valueOf(iM103200i));
            AbstractC22676k.m65747g(arrayList2);
            if (!arrayList2.contains(Integer.valueOf(position))) {
                arrayList2.add(Integer.valueOf(position));
            }
            this.monthWeekPair.put(Integer.valueOf(iM103200i), arrayList2);
        }
    }

    /* JADX INFO: renamed from: c */
    private final int m103197c() {
        return this.isRtl ? AbstractC38529z.f165820m : AbstractC38529z.f165823p;
    }

    /* JADX INFO: renamed from: d */
    private final int m103198d() {
        return this.isRtl ? AbstractC38529z.f165823p : AbstractC38529z.f165820m;
    }

    /* JADX INFO: renamed from: f */
    private final int m103199f(int position) {
        return position / 7;
    }

    /* JADX INFO: renamed from: i */
    private final int m103200i(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(2);
        calendar.setTime(date);
        return calendar.get(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m103201k(C32881a c32881a, C32883c c32883c, int i13, View view) {
        if (c32881a.getCom.mapbox.common.HttpHeaders.DATE java.lang.String().after(Calendar.getInstance().getTime())) {
            return;
        }
        if (c32883c.selectedView.size() > 0) {
            c32883c.m103202m(c32883c.selectedView);
        }
        c32883c.selectedPosition = i13;
        int i14 = a.f137049a[c32883c.flag.ordinal()];
        if (i14 == 1) {
            c32883c.selectedView.add(Integer.valueOf(i13));
            c32883c.m103208x();
            c32883c.selectedDate = c32883c.dataCellList.get(i13).getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
            c32883c.timePeriodType = TimePeriod.DAILY;
            return;
        }
        if (i14 == 2) {
            c32883c.m103204o(c32883c.m103199f(i13));
            c32883c.selectedDate = c32883c.dataCellList.get(i13).getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
            c32883c.timePeriodType = TimePeriod.MONTH;
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c32883c.m103203n();
            c32883c.selectedDate = c32883c.dataCellList.get(i13).getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
            c32883c.timePeriodType = TimePeriod.MONTH;
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m103202m(List<Integer> oldSelectedView) {
        int size = oldSelectedView.size();
        for (int i13 = 0; i13 < size; i13++) {
            C32881a c32881a = this.dataCellList.get(oldSelectedView.get(i13).intValue());
            if (c32881a.getCurrentMonth()) {
                c32881a.m103193l(AbstractC36510a.f156046y);
            } else {
                c32881a.m103193l(AbstractC38528y.f165803a);
            }
            c32881a.m103189h(AbstractC36510a.f156005N);
            c32881a.m103192k(AbstractC36510a.f156005N);
            c32881a.m103191j(false);
            c32881a.m103190i(false);
            this.dataCellList.set(oldSelectedView.get(i13).intValue(), c32881a);
        }
        this.selectedView = new ArrayList<>();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: n */
    private final void m103203n() {
        int size = this.dataCellList.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (this.dataCellList.get(i13).getCurrentMonth()) {
                this.selectedView.add(Integer.valueOf(i13));
                m103196b(i13);
            }
        }
        List<C32881a> list = this.dataCellList;
        Integer num = this.selectedView.get(0);
        AbstractC22676k.m65749i(num, "get(...)");
        this.startDateCell = list.get(num.intValue());
        List<C32881a> list2 = this.dataCellList;
        ArrayList<Integer> arrayList = this.selectedView;
        Integer num2 = arrayList.get(arrayList.size() - 1);
        AbstractC22676k.m65749i(num2, "get(...)");
        this.endDateCell = list2.get(num2.intValue());
        m103207w();
    }

    /* JADX INFO: renamed from: o */
    private final void m103204o(int week) {
        int size;
        int size2;
        if (week < this.dataCellList.size() / 7) {
            size = week * 7;
            size2 = size + 7;
        } else {
            size = (this.dataCellList.size() / 7) * 7;
            size2 = this.dataCellList.size();
        }
        while (size < size2) {
            this.selectedView.add(Integer.valueOf(size));
            size++;
        }
        m103206v(this.selectedView);
        List<C32881a> list = this.dataCellList;
        Integer num = this.selectedView.get(0);
        AbstractC22676k.m65749i(num, "get(...)");
        this.startDateCell = list.get(num.intValue());
        List<C32881a> list2 = this.dataCellList;
        ArrayList<Integer> arrayList = this.selectedView;
        Integer num2 = arrayList.get(arrayList.size() - 1);
        AbstractC22676k.m65749i(num2, "get(...)");
        this.endDateCell = list2.get(num2.intValue());
    }

    /* JADX INFO: renamed from: r */
    private final void m103205r(C32881a dateCell) {
        if (dateCell.getCom.mapbox.common.HttpHeaders.DATE java.lang.String().after(Calendar.getInstance().getTime())) {
            dateCell.m103193l(AbstractC38528y.f165805c);
        } else {
            dateCell.m103193l(AbstractC38528y.f165804b);
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m103206v(List<Integer> currentSelectedViews) {
        if (currentSelectedViews.size() == 1) {
            C32881a c32881a = this.dataCellList.get(currentSelectedViews.get(0).intValue());
            c32881a.m103190i(true);
            m103205r(c32881a);
            c32881a.m103189h(AbstractC38529z.f165822o);
            this.dataCellList.set(currentSelectedViews.get(0).intValue(), c32881a);
        } else {
            C32881a c32881a2 = this.dataCellList.get(currentSelectedViews.get(0).intValue());
            c32881a2.m103190i(true);
            m103205r(c32881a2);
            c32881a2.m103189h(m103197c());
            this.dataCellList.set(currentSelectedViews.get(0).intValue(), c32881a2);
            int size = currentSelectedViews.size() - 1;
            for (int i13 = 1; i13 < size; i13++) {
                C32881a c32881a3 = this.dataCellList.get(currentSelectedViews.get(i13).intValue());
                c32881a3.m103190i(true);
                m103205r(c32881a3);
                c32881a3.m103189h(AbstractC38529z.f165821n);
                this.dataCellList.set(currentSelectedViews.get(i13).intValue(), c32881a3);
            }
            C32881a c32881a4 = this.dataCellList.get(((Number) AbstractC11266d.m30455i(1, currentSelectedViews)).intValue());
            c32881a4.m103190i(true);
            m103205r(c32881a4);
            c32881a4.m103189h(m103198d());
            this.dataCellList.set(((Number) AbstractC11266d.m30455i(1, currentSelectedViews)).intValue(), c32881a4);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: w */
    private final void m103207w() {
        for (Integer num : this.monthWeekPair.keySet()) {
            AbstractC22676k.m65749i(num, "next(...)");
            ArrayList<Integer> arrayList = this.monthWeekPair.get(Integer.valueOf(num.intValue()));
            AbstractC22676k.m65748h(arrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>");
            m103206v(arrayList);
        }
    }

    /* JADX INFO: renamed from: x */
    private final void m103208x() {
        int size = this.selectedView.size();
        for (int i13 = 0; i13 < size; i13++) {
            List<C32881a> list = this.dataCellList;
            Integer num = this.selectedView.get(i13);
            AbstractC22676k.m65749i(num, "get(...)");
            C32881a c32881a = list.get(num.intValue());
            c32881a.m103191j(true);
            m103205r(c32881a);
            c32881a.m103192k(AbstractC38529z.f165819l);
            List<C32881a> list2 = this.dataCellList;
            Integer num2 = this.selectedView.get(i13);
            AbstractC22676k.m65749i(num2, "get(...)");
            list2.set(num2.intValue(), c32881a);
            this.startDateCell = c32881a;
            this.endDateCell = c32881a;
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C32881a getEndDateCell() {
        return this.endDateCell;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public int getDisplayCount() {
        return this.dataCellList.size();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C32881a getStartDateCell() {
        return this.startDateCell;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C32882b holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        C32881a c32881a = this.dataCellList.get(position);
        Calendar calendar = Calendar.getInstance();
        AbstractC22676k.m65749i(calendar, "getInstance(...)");
        calendar.setTime(c32881a.getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
        if (AbstractC22676k.m65745e(calendar.getTime(), this.selectedDate)) {
            this.selectedPosition = position;
        }
        holder.getTextView().setText(String.valueOf(calendar.get(5)).length() == 1 ? AbstractC2875y.m8295h(calendar.get(5), UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE) : String.valueOf(calendar.get(5)));
        if ((c32881a.getCurrentMonth() && !c32881a.getCom.mapbox.common.HttpHeaders.DATE java.lang.String().after(Calendar.getInstance().getTime())) || c32881a.getSelectedDay() || c32881a.getCurrentWeek()) {
            holder.getTextView().setTextColor(AbstractC32122c.getColor(holder.getContext(), c32881a.getTextColor()));
        } else {
            holder.getTextView().setTextColor(AbstractC32122c.getColor(holder.getContext(), AbstractC38528y.f165803a));
        }
        holder.getTextView().setBackgroundResource(c32881a.getTextBackgroundResource());
        holder.itemView.setBackgroundResource(c32881a.getBackgroundResource());
        holder.itemView.setOnClickListener(new ViewOnClickListenerC19676a(c32881a, this, position, 1));
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C32882b onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(AbstractC38501b0.f165551x, parent, false);
        AbstractC22676k.m65748h(viewInflate, "null cannot be cast to non-null type android.view.View");
        return new C32882b(viewInflate);
    }

    /* JADX INFO: renamed from: p */
    public final void m103214p(TimePeriod timePeriod) {
        AbstractC22676k.m65750j(timePeriod, "<set-?>");
        this.flag = timePeriod;
    }

    /* JADX INFO: renamed from: q */
    public final void m103215q(HashMap<Integer, ArrayList<Integer>> map) {
        AbstractC22676k.m65750j(map, "<set-?>");
        this.monthWeekPair = map;
    }

    /* JADX INFO: renamed from: s */
    public final void m103216s() {
        if (this.selectedView.size() > 0) {
            m103202m(this.selectedView);
        }
        if (this.selectedPosition >= 0) {
            int i13 = a.f137049a[this.timePeriodType.ordinal()];
            if (i13 == 1) {
                this.selectedView.add(Integer.valueOf(this.selectedPosition));
                m103208x();
            } else if (i13 == 2) {
                m103204o(m103199f(this.selectedPosition));
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                m103203n();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m103217t(Calendar calendar) {
        this.selectedInstance = calendar;
    }

    /* JADX INFO: renamed from: u */
    public final void m103218u(TimePeriod timePeriod) {
        AbstractC22676k.m65750j(timePeriod, "<set-?>");
        this.timePeriodType = timePeriod;
    }
}
