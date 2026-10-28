package com.whoop.community.presentation.teams.calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mapbox.common.HttpHeaders;
import com.whoop.community.domain.model.teams.TimePeriod;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sq0.C32881a;
import sq0.C32883c;
import vu1.AbstractC36510a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b \u0010\u0011J\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\u0012¢\u0006\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010H\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010B\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\"¨\u0006I"}, m65681d2 = {"Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll83/a0;", "a", "()V", "b", "(Landroid/content/Context;)V", "e", "", "month", "f", "(I)V", "Ljava/util/Calendar;", "calendar", "", "c", "(Ljava/util/Calendar;)Z", "d", "()Z", "Ljava/util/Date;", HttpHeaders.DATE, "Lcom/whoop/community/domain/model/teams/TimePeriod;", "type", "g", "(Ljava/util/Date;Lcom/whoop/community/domain/model/teams/TimePeriod;)V", "value", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "setType", "(Lcom/whoop/community/domain/model/teams/TimePeriod;)V", "getStartDate", "()Ljava/util/Date;", "getEndDate", "getCurrentMonth", "()Ljava/util/Calendar;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroid/widget/LinearLayout;", "header", "", "x", "Ljava/lang/String;", "getDisplayMonth", "()Ljava/lang/String;", "setDisplayMonth", "(Ljava/lang/String;)V", "displayMonth", "Landroidx/recyclerview/widget/RecyclerView;", "y", "Landroidx/recyclerview/widget/RecyclerView;", "gridView", "Lsq0/c;", "z", "Lsq0/c;", "teamCalendarAdapter", "E", "Ljava/util/Calendar;", "currentDate", "F", "Ljava/util/Date;", "selectedDate", "G", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "timePeriodType", "H", "getTimePeriod", "()Lcom/whoop/community/domain/model/teams/TimePeriod;", "setTimePeriod", "timePeriod", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TeamCalendarView extends LinearLayout {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private Calendar currentDate;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private Date selectedDate;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private TimePeriod timePeriodType;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private TimePeriod timePeriod;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private LinearLayout header;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public String displayMonth;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private RecyclerView gridView;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private C32883c teamCalendarAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamCalendarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(attrs, "attrs");
        this.timePeriod = TimePeriod.DAILY;
        m19507b(context);
    }

    /* JADX INFO: renamed from: a */
    private final void m19506a() {
        View viewFindViewById = findViewById(AbstractC38499a0.f165392r0);
        AbstractC22676k.m65749i(viewFindViewById, "findViewById(...)");
        this.header = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(AbstractC38499a0.f165383q0);
        AbstractC22676k.m65749i(viewFindViewById2, "findViewById(...)");
        this.gridView = (RecyclerView) viewFindViewById2;
    }

    /* JADX INFO: renamed from: b */
    private final void m19507b(Context context) {
        Object systemService = context.getSystemService("layout_inflater");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(AbstractC38501b0.f165521i, this);
        m19506a();
        Calendar calendar = Calendar.getInstance();
        AbstractC22676k.m65749i(calendar, "getInstance(...)");
        this.currentDate = calendar;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m19508c(Calendar calendar) {
        int i13 = calendar.get(2);
        int i14 = calendar.get(1);
        Calendar calendar2 = this.currentDate;
        if (calendar2 == null) {
            AbstractC22676k.m65757q("currentDate");
            throw null;
        }
        if (i13 != calendar2.get(2)) {
            return false;
        }
        Calendar calendar3 = this.currentDate;
        if (calendar3 != null) {
            return i14 == calendar3.get(1);
        }
        AbstractC22676k.m65757q("currentDate");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    private final boolean m19509d() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: e */
    private final void m19510e() throws Throwable {
        String str;
        Throwable th3;
        ArrayList arrayList = new ArrayList();
        Calendar calendar = this.currentDate;
        if (calendar == null) {
            AbstractC22676k.m65757q("currentDate");
            throw null;
        }
        Object objClone = calendar.clone();
        AbstractC22676k.m65748h(objClone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar2 = (Calendar) objClone;
        calendar2.set(5, 1);
        calendar2.setFirstDayOfWeek(2);
        Object objClone2 = calendar2.clone();
        AbstractC22676k.m65748h(objClone2, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar3 = (Calendar) objClone2;
        calendar3.add(2, 1);
        while (calendar2.get(7) != 2) {
            calendar2.add(5, -1);
        }
        int i13 = 0;
        while (true) {
            if (i13 >= 38) {
                str = "getTime(...)";
                th3 = null;
                break;
            }
            Date time = calendar2.getTime();
            AbstractC22676k.m65749i(time, "getTime(...)");
            int i14 = AbstractC36510a.f156046y;
            int i15 = AbstractC36510a.f156005N;
            str = "getTime(...)";
            th3 = null;
            arrayList.add(new C32881a(time, i14, i15, i13, i15, m19508c(calendar2), false, false, 192, null));
            calendar2.add(5, 1);
            if (calendar2.compareTo(calendar3) >= 0) {
                break;
            } else {
                i13++;
            }
        }
        while (calendar2.get(7) != 2) {
            Date time2 = calendar2.getTime();
            AbstractC22676k.m65749i(time2, str);
            arrayList.add(new C32881a(time2, AbstractC36510a.f156046y, AbstractC36510a.f156005N, arrayList.size() + 1, AbstractC36510a.f156005N, m19508c(calendar2), false, false, 192, null));
            calendar2.add(5, 1);
        }
        Date date = this.selectedDate;
        if (date == null) {
            AbstractC22676k.m65757q("selectedDate");
            throw th3;
        }
        TimePeriod timePeriod = this.timePeriodType;
        if (timePeriod == null) {
            AbstractC22676k.m65757q("timePeriodType");
            throw th3;
        }
        C32883c c32883c = new C32883c(arrayList, date, timePeriod, m19509d());
        this.teamCalendarAdapter = c32883c;
        Calendar calendar4 = this.currentDate;
        if (calendar4 == null) {
            AbstractC22676k.m65757q("currentDate");
            throw th3;
        }
        c32883c.m103217t(calendar4);
        C32883c c32883c2 = this.teamCalendarAdapter;
        if (c32883c2 == null) {
            AbstractC22676k.m65757q("teamCalendarAdapter");
            throw th3;
        }
        c32883c2.m103214p(this.timePeriod);
        RecyclerView recyclerView = this.gridView;
        if (recyclerView == null) {
            AbstractC22676k.m65757q("gridView");
            throw th3;
        }
        getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(7, 0));
        RecyclerView recyclerView2 = this.gridView;
        if (recyclerView2 == null) {
            AbstractC22676k.m65757q("gridView");
            throw th3;
        }
        C32883c c32883c3 = this.teamCalendarAdapter;
        if (c32883c3 == null) {
            AbstractC22676k.m65757q("teamCalendarAdapter");
            throw th3;
        }
        recyclerView2.setAdapter(c32883c3);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE,MMMM yyyy");
        Calendar calendar5 = this.currentDate;
        if (calendar5 == null) {
            AbstractC22676k.m65757q("currentDate");
            throw th3;
        }
        String str2 = simpleDateFormat.format(calendar5.getTime());
        AbstractC22676k.m65749i(str2, "format(...)");
        setDisplayMonth(((String[]) AbstractC39414r.m125906y0(str2, new String[]{","}, 6).toArray(new String[0]))[1]);
        C32883c c32883c4 = this.teamCalendarAdapter;
        if (c32883c4 == null) {
            AbstractC22676k.m65757q("teamCalendarAdapter");
            throw th3;
        }
        if (c32883c4.getSelectedPosition() >= 0) {
            C32883c c32883c5 = this.teamCalendarAdapter;
            if (c32883c5 != null) {
                c32883c5.m103216s();
            } else {
                AbstractC22676k.m65757q("teamCalendarAdapter");
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m19511f(int month) throws Throwable {
        Calendar calendar = this.currentDate;
        if (calendar == null) {
            AbstractC22676k.m65757q("currentDate");
            throw null;
        }
        calendar.add(2, month);
        m19510e();
    }

    /* JADX INFO: renamed from: g */
    public final void m19512g(Date date, TimePeriod type) {
        AbstractC22676k.m65750j(type, "type");
        if (date == null) {
            date = Calendar.getInstance().getTime();
            AbstractC22676k.m65749i(date, "getTime(...)");
        }
        this.selectedDate = date;
        this.timePeriodType = type;
        Calendar calendar = this.currentDate;
        if (calendar == null) {
            AbstractC22676k.m65757q("currentDate");
            throw null;
        }
        calendar.setTime(date);
        m19510e();
    }

    public final Calendar getCurrentMonth() {
        Calendar calendar = this.currentDate;
        if (calendar != null) {
            return calendar;
        }
        AbstractC22676k.m65757q("currentDate");
        throw null;
    }

    public final String getDisplayMonth() {
        String str = this.displayMonth;
        if (str != null) {
            return str;
        }
        AbstractC22676k.m65757q("displayMonth");
        throw null;
    }

    public final Date getEndDate() {
        Date date;
        C32883c c32883c = this.teamCalendarAdapter;
        if (c32883c == null) {
            AbstractC22676k.m65757q("teamCalendarAdapter");
            throw null;
        }
        C32881a endDateCell = c32883c.getEndDateCell();
        if (endDateCell == null || (date = endDateCell.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()) == null) {
            return null;
        }
        return date;
    }

    public final Date getStartDate() {
        Date date;
        C32883c c32883c = this.teamCalendarAdapter;
        if (c32883c == null) {
            AbstractC22676k.m65757q("teamCalendarAdapter");
            throw null;
        }
        C32881a startDateCell = c32883c.getStartDateCell();
        if (startDateCell == null || (date = startDateCell.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()) == null) {
            return null;
        }
        return date;
    }

    public final TimePeriod getTimePeriod() {
        return this.timePeriod;
    }

    /* JADX INFO: renamed from: h */
    public final void m19513h(int value) {
        m19511f(value);
        C32883c c32883c = this.teamCalendarAdapter;
        if (c32883c == null) {
            AbstractC22676k.m65757q("teamCalendarAdapter");
            throw null;
        }
        c32883c.m103215q(new HashMap<>());
        C32883c c32883c2 = this.teamCalendarAdapter;
        if (c32883c2 != null) {
            c32883c2.notifyDataSetChanged();
        } else {
            AbstractC22676k.m65757q("teamCalendarAdapter");
            throw null;
        }
    }

    public final void setDisplayMonth(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.displayMonth = str;
    }

    public final void setTimePeriod(TimePeriod timePeriod) {
        AbstractC22676k.m65750j(timePeriod, "<set-?>");
        this.timePeriod = timePeriod;
    }

    public final void setType(TimePeriod type) {
        AbstractC22676k.m65750j(type, "type");
        this.timePeriod = type;
        C32883c c32883c = this.teamCalendarAdapter;
        if (c32883c == null) {
            AbstractC22676k.m65757q("teamCalendarAdapter");
            throw null;
        }
        c32883c.m103214p(type);
        C32883c c32883c2 = this.teamCalendarAdapter;
        if (c32883c2 == null) {
            AbstractC22676k.m65757q("teamCalendarAdapter");
            throw null;
        }
        c32883c2.m103218u(type);
        C32883c c32883c3 = this.teamCalendarAdapter;
        if (c32883c3 != null) {
            c32883c3.m103216s();
        } else {
            AbstractC22676k.m65757q("teamCalendarAdapter");
            throw null;
        }
    }
}
