package rf2;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import com.whoop.data.local.room.entity.ScheduleDayOfWeekTypeConverter;
import com.whoop.data.local.room.entity.SmartAlarmGoalTypeConverter;
import com.whoop.data.local.room.entity.SmartAlarmUserInfo;
import com.whoop.data.local.room.entity.SmartAlarmUserInfoKt;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p459rf.C31345p;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import pf.C29124b;
import q11.C29793c;
import q83.InterfaceC30057d;
import r51.C30936d;
import r61.C30985h;
import sf2.C32448a;

/* JADX INFO: renamed from: rf2.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C31361c implements InterfaceC31359a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f129016a;

    /* JADX INFO: renamed from: c */
    private final SmartAlarmGoalTypeConverter f129018c = new SmartAlarmGoalTypeConverter();

    /* JADX INFO: renamed from: d */
    private final ScheduleDayOfWeekTypeConverter f129019d = new ScheduleDayOfWeekTypeConverter();

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f129017b = new a();

    /* JADX INFO: renamed from: e */
    private final AbstractC1802k f129020e = new b();

    /* JADX INFO: renamed from: rf2.c$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, SmartAlarmUserInfo smartAlarmUserInfo) {
            interfaceC33689c.mo5356p(1, smartAlarmUserInfo.getUserId());
            interfaceC33689c.mo5356p(2, smartAlarmUserInfo.getWindowMinutes());
            if (smartAlarmUserInfo.getUpperTimeBound() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, smartAlarmUserInfo.getUpperTimeBound());
            }
            if (smartAlarmUserInfo.getLastTriggeredAt() == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, smartAlarmUserInfo.getLastTriggeredAt());
            }
            if (smartAlarmUserInfo.getSleepScoreGoal() == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5356p(5, smartAlarmUserInfo.getSleepScoreGoal().intValue());
            }
            if (smartAlarmUserInfo.getRecoveryScoreGoal() == null) {
                interfaceC33689c.mo5359u(6);
            } else {
                interfaceC33689c.mo5356p(6, smartAlarmUserInfo.getRecoveryScoreGoal().intValue());
            }
            String strFromSmartGoalType = C31361c.this.f129018c.fromSmartGoalType(smartAlarmUserInfo.getGoal());
            if (strFromSmartGoalType == null) {
                interfaceC33689c.mo5359u(7);
            } else {
                interfaceC33689c.mo5354L(7, strFromSmartGoalType);
            }
            interfaceC33689c.mo5356p(8, smartAlarmUserInfo.getSmartAlarmEnabled() ? 1L : 0L);
            interfaceC33689c.mo5356p(9, smartAlarmUserInfo.getLastUpdatedTime());
            interfaceC33689c.mo5356p(10, smartAlarmUserInfo.getScheduleEnabled() ? 1L : 0L);
            String strFromDayOfWeekType = C31361c.this.f129019d.fromDayOfWeekType(smartAlarmUserInfo.getDayOfWeek());
            if (strFromDayOfWeekType == null) {
                interfaceC33689c.mo5359u(11);
            } else {
                interfaceC33689c.mo5354L(11, strFromDayOfWeekType);
            }
            interfaceC33689c.mo5356p(12, smartAlarmUserInfo.isEnrolledInWeeklyPlan() ? 1L : 0L);
            if (smartAlarmUserInfo.getWeeklyPlanGoal() == null) {
                interfaceC33689c.mo5359u(13);
            } else {
                interfaceC33689c.mo5356p(13, smartAlarmUserInfo.getWeeklyPlanGoal().intValue());
            }
            if (smartAlarmUserInfo.getTimeZoneOffset() == null) {
                interfaceC33689c.mo5359u(14);
            } else {
                interfaceC33689c.mo5354L(14, smartAlarmUserInfo.getTimeZoneOffset());
            }
            if (smartAlarmUserInfo.getAlarmBounds() == null) {
                interfaceC33689c.mo5359u(15);
            } else {
                interfaceC33689c.mo5354L(15, smartAlarmUserInfo.getAlarmBounds());
            }
            if (smartAlarmUserInfo.getWeeklyPlanHourGoal() == null) {
                interfaceC33689c.mo5359u(16);
            } else {
                interfaceC33689c.mo5354L(16, smartAlarmUserInfo.getWeeklyPlanHourGoal());
            }
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `smart_alarm_user_info_table` (`user_id`,`window_minutes`,`upper_time_bound`,`last_triggered_at`,`sleep_score_goal`,`recovery_score_goal`,`goal`,`enabled`,`last_updated_at`,`schedule_enabled`,`day_of_week`,`enrolled_weekly_plan`,`weekly_plan_goal`,`time_zone_offset`,`alarm_bounds`,`weekly_plan_hour_goal`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: rf2.c$b */
    public class b extends AbstractC1802k {
        public b() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C32448a c32448a) {
            if (c32448a.getCompositeId() == null) {
                interfaceC33689c.mo5359u(1);
            } else {
                interfaceC33689c.mo5354L(1, c32448a.getCompositeId());
            }
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_smart_alarm_triggered` (`composite_id`) VALUES (?)";
        }
    }

    public C31361c(AbstractC1848z0 abstractC1848z0) {
        this.f129016a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: q */
    public static List<Class<?>> m96449q() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Boolean m96450r(String str, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT EXISTS(SELECT * FROM table_smart_alarm_triggered WHERE composite_id = ?)");
        boolean z4 = true;
        try {
            if (str == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5354L(1, str);
            }
            Boolean boolValueOf = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                Integer numValueOf = interfaceC33689cMo68212g1.isNull(0) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(0));
                if (numValueOf != null) {
                    if (numValueOf.intValue() == 0) {
                        z4 = false;
                    }
                    boolValueOf = Boolean.valueOf(z4);
                }
            }
            interfaceC33689cMo68212g1.close();
            return boolValueOf;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ C23454a0 m96451s(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM smart_alarm_user_info_table");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ SmartAlarmUserInfo m96452t(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM smart_alarm_user_info_table LIMIT 1");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "user_id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "window_minutes");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "upper_time_bound");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "last_triggered_at");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sleep_score_goal");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "recovery_score_goal");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, WeeklyPlanApiKt.GOAL);
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "enabled");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "last_updated_at");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "schedule_enabled");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "day_of_week");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "enrolled_weekly_plan");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "weekly_plan_goal");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "time_zone_offset");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "alarm_bounds");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "weekly_plan_hour_goal");
            SmartAlarmUserInfo smartAlarmUserInfo = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                smartAlarmUserInfo = new SmartAlarmUserInfo((int) interfaceC33689cMo68212g1.getLong(iM60658N), (int) interfaceC33689cMo68212g1.getLong(iM60658N2), interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3), interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4), interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N5)), interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N6)), this.f129018c.toSmartGoalType(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7)), ((int) interfaceC33689cMo68212g1.getLong(iM60658N8)) != 0, interfaceC33689cMo68212g1.getLong(iM60658N9), ((int) interfaceC33689cMo68212g1.getLong(iM60658N10)) != 0, this.f129019d.toDayOfWeekType(interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N11)), ((int) interfaceC33689cMo68212g1.getLong(iM60658N12)) != 0, interfaceC33689cMo68212g1.isNull(iM60658N13) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N13)), interfaceC33689cMo68212g1.isNull(iM60658N14) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N14), interfaceC33689cMo68212g1.isNull(iM60658N15) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N15), interfaceC33689cMo68212g1.isNull(iM60658N16) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N16));
            }
            return smartAlarmUserInfo;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ SmartAlarmUserInfo m96453u(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM smart_alarm_user_info_table LIMIT 1");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "user_id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "window_minutes");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "upper_time_bound");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "last_triggered_at");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sleep_score_goal");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "recovery_score_goal");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, WeeklyPlanApiKt.GOAL);
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "enabled");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "last_updated_at");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "schedule_enabled");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "day_of_week");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "enrolled_weekly_plan");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "weekly_plan_goal");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "time_zone_offset");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "alarm_bounds");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "weekly_plan_hour_goal");
            SmartAlarmUserInfo smartAlarmUserInfo = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                smartAlarmUserInfo = new SmartAlarmUserInfo((int) interfaceC33689cMo68212g1.getLong(iM60658N), (int) interfaceC33689cMo68212g1.getLong(iM60658N2), interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3), interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4), interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N5)), interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N6)), this.f129018c.toSmartGoalType(interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7)), ((int) interfaceC33689cMo68212g1.getLong(iM60658N8)) != 0, interfaceC33689cMo68212g1.getLong(iM60658N9), ((int) interfaceC33689cMo68212g1.getLong(iM60658N10)) != 0, this.f129019d.toDayOfWeekType(interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N11)), ((int) interfaceC33689cMo68212g1.getLong(iM60658N12)) != 0, interfaceC33689cMo68212g1.isNull(iM60658N13) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N13)), interfaceC33689cMo68212g1.isNull(iM60658N14) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N14), interfaceC33689cMo68212g1.isNull(iM60658N15) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N15), interfaceC33689cMo68212g1.isNull(iM60658N16) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N16));
            }
            return smartAlarmUserInfo;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ C23454a0 m96454v(C32448a c32448a, InterfaceC33687a interfaceC33687a) {
        this.f129020e.insert(interfaceC33687a, c32448a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ C23454a0 m96455w(SmartAlarmUserInfo smartAlarmUserInfo, InterfaceC33687a interfaceC33687a) {
        this.f129017b.insert(interfaceC33687a, smartAlarmUserInfo);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object m96456x(SmartAlarmUserInfo smartAlarmUserInfo, InterfaceC30057d interfaceC30057d) {
        return super.mo96436d(smartAlarmUserInfo, interfaceC30057d);
    }

    @Override // rf2.InterfaceC31359a
    /* JADX INFO: renamed from: a */
    public Object mo96434a(InterfaceC30057d<? super SmartAlarmUserInfo> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f129016a, true, false, new C31345p(this, 1), interfaceC30057d);
    }

    @Override // rf2.InterfaceC31359a
    /* JADX INFO: renamed from: b */
    public InterfaceC13058l mo96435b() {
        return AbstractC12350b.m34591l(this.f129016a, new String[]{SmartAlarmUserInfoKt.SMART_ALARM_USER_INFO_TABLE_NAME}, new C29124b(this, 24));
    }

    @Override // rf2.InterfaceC31359a
    /* JADX INFO: renamed from: d */
    public Object mo96436d(SmartAlarmUserInfo smartAlarmUserInfo, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44433M(this.f129016a, new C31360b(this, smartAlarmUserInfo, 0), interfaceC30057d);
    }

    @Override // rf2.InterfaceC31359a
    public Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f129016a, false, true, new C30985h(14), interfaceC30057d);
    }

    @Override // rf2.InterfaceC31359a
    /* JADX INFO: renamed from: e */
    public Object mo96437e(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f129016a, true, false, new C30936d(str, 2), interfaceC30057d);
    }

    @Override // rf2.InterfaceC31359a
    /* JADX INFO: renamed from: f */
    public Object mo96438f(SmartAlarmUserInfo smartAlarmUserInfo, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        smartAlarmUserInfo.getClass();
        return AbstractC15751g.m44434N(this.f129016a, false, true, new C31360b(this, smartAlarmUserInfo, 1), interfaceC30057d);
    }

    @Override // rf2.InterfaceC31359a
    /* JADX INFO: renamed from: g */
    public Object mo96439g(C32448a c32448a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c32448a.getClass();
        return AbstractC15751g.m44434N(this.f129016a, false, true, new C29793c(17, this, c32448a), interfaceC30057d);
    }
}
