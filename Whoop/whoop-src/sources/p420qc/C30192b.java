package p420qc;

import androidx.room.AbstractC1802k;
import j93.AbstractC21478l0;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.EnumC18346a;
import p218ic.EnumC18363i0;
import p500tb.InterfaceC33689c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: qc.b */
/* JADX INFO: loaded from: classes.dex */
public final class C30192b extends AbstractC1802k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f123587a;

    public /* synthetic */ C30192b(int i13) {
        this.f123587a = i13;
    }

    @Override // androidx.room.AbstractC1802k
    public final void bind(InterfaceC33689c statement, Object obj) {
        int i13;
        int i14 = 1;
        switch (this.f123587a) {
            case 0:
                C30191a c30191a = (C30191a) obj;
                AbstractC22676k.m65750j(statement, "statement");
                statement.mo5354L(1, c30191a.m92415b());
                statement.mo5354L(2, c30191a.m92414a());
                return;
            case 1:
                C30194d c30194d = (C30194d) obj;
                AbstractC22676k.m65750j(statement, "statement");
                statement.mo5354L(1, c30194d.f123590a);
                statement.mo5356p(2, c30194d.f123591b.longValue());
                return;
            case 2:
                C30198h c30198h = (C30198h) obj;
                AbstractC22676k.m65750j(statement, "statement");
                statement.mo5354L(1, c30198h.f123598a);
                statement.mo5356p(2, c30198h.f123599b);
                statement.mo5356p(3, c30198h.f123600c);
                return;
            case 3:
                C30201k c30201k = (C30201k) obj;
                AbstractC22676k.m65750j(statement, "statement");
                statement.mo5354L(1, c30201k.f123605a);
                statement.mo5354L(2, c30201k.f123606b);
                return;
            case 4:
                C30203m c30203m = (C30203m) obj;
                AbstractC22676k.m65750j(statement, "statement");
                statement.mo5354L(1, c30203m.m92423b());
                C18358g c18358g = C18358g.f71479b;
                statement.mo5357q(2, AbstractC29125c.m88515X(c30203m.m92422a()));
                return;
            case 5:
                C30207q c30207q = (C30207q) obj;
                AbstractC22676k.m65750j(statement, "statement");
                statement.mo5354L(1, c30207q.f123634a);
                statement.mo5356p(2, AbstractC21478l0.m60424b0(c30207q.f123635b));
                statement.mo5354L(3, c30207q.f123636c);
                statement.mo5354L(4, c30207q.f123637d);
                C18358g c18358g2 = C18358g.f71479b;
                statement.mo5357q(5, AbstractC29125c.m88515X(c30207q.f123638e));
                statement.mo5357q(6, AbstractC29125c.m88515X(c30207q.f123639f));
                statement.mo5356p(7, c30207q.f123640g);
                statement.mo5356p(8, c30207q.f123641h);
                statement.mo5356p(9, c30207q.f123642i);
                statement.mo5356p(10, c30207q.f123644k);
                EnumC18346a backoffPolicy = c30207q.f123645l;
                AbstractC22676k.m65750j(backoffPolicy, "backoffPolicy");
                int iOrdinal = backoffPolicy.ordinal();
                if (iOrdinal == 0) {
                    i13 = 0;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i13 = 1;
                }
                statement.mo5356p(11, i13);
                statement.mo5356p(12, c30207q.f123646m);
                statement.mo5356p(13, c30207q.f123647n);
                statement.mo5356p(14, c30207q.f123648o);
                statement.mo5356p(15, c30207q.f123649p);
                statement.mo5356p(16, c30207q.f123650q ? 1L : 0L);
                EnumC18363i0 policy = c30207q.f123651r;
                AbstractC22676k.m65750j(policy, "policy");
                int iOrdinal2 = policy.ordinal();
                if (iOrdinal2 == 0) {
                    i14 = 0;
                } else if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                statement.mo5356p(17, i14);
                statement.mo5356p(18, c30207q.f123652s);
                statement.mo5356p(19, c30207q.f123653t);
                statement.mo5356p(20, c30207q.f123654u);
                statement.mo5356p(21, c30207q.f123655v);
                statement.mo5356p(22, c30207q.f123656w);
                String str = c30207q.f123657x;
                if (str == null) {
                    statement.mo5359u(23);
                } else {
                    statement.mo5354L(23, str);
                }
                Boolean bool = c30207q.f123658y;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    statement.mo5359u(24);
                } else {
                    statement.mo5356p(24, numValueOf.intValue());
                }
                C18354e c18354e = c30207q.f123643j;
                statement.mo5356p(25, AbstractC21478l0.m60411Q(c18354e.f71465a));
                statement.mo5357q(26, AbstractC21478l0.m60452w(c18354e.f71466b));
                statement.mo5356p(27, c18354e.f71467c ? 1L : 0L);
                statement.mo5356p(28, c18354e.f71468d ? 1L : 0L);
                statement.mo5356p(29, c18354e.f71469e ? 1L : 0L);
                statement.mo5356p(30, c18354e.f71470f ? 1L : 0L);
                statement.mo5356p(31, c18354e.f71471g);
                statement.mo5356p(32, c18354e.f71472h);
                statement.mo5357q(33, AbstractC21478l0.m60419Y(c18354e.f71473i));
                return;
            default:
                C30212v c30212v = (C30212v) obj;
                AbstractC22676k.m65750j(statement, "statement");
                statement.mo5354L(1, c30212v.f123668a);
                statement.mo5354L(2, c30212v.f123669b);
                return;
        }
    }

    @Override // androidx.room.AbstractC1802k
    public final String createQuery() {
        switch (this.f123587a) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
