package p31;

import b91.EnumC2888c;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.List;
import kd1.EnumC22400l;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: p31.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"", "Lp31/l;", "a", "Ljava/util/List;", "()Ljava/util/List;", "homeSectionHeaderStates", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28804o {

    /* JADX INFO: renamed from: a */
    private static final List<C28801l> f116589a;

    static {
        C28801l c28801l = new C28801l(new AbstractC28805p.a(AbstractC8693b.m21278l("STRAIN STATISTICS"), null, null, null, null, null, false, false, null, null, 1022, null), null, 2, null);
        TextResource textResourceM21278l = AbstractC8693b.m21278l("STRAIN STATISTICS");
        EnumC28807r enumC28807r = EnumC28807r.SMALL;
        C28801l c28801l2 = new C28801l(new AbstractC28805p.a(textResourceM21278l, null, enumC28807r, null, null, null, false, false, null, null, MessageListItemViewType.POLL, null), null, 2, null);
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("STRAIN STATISTICS");
        EnumC28807r enumC28807r2 = EnumC28807r.LARGE;
        C28801l c28801l3 = new C28801l(new AbstractC28805p.a(textResourceM21278l2, null, enumC28807r2, null, null, null, false, false, null, null, MessageListItemViewType.POLL, null), null, 2, null);
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("STRAIN STATISTICS");
        EnumC2888c enumC2888c = EnumC2888c.T1;
        C28801l c28801l4 = new C28801l(new AbstractC28805p.a(textResourceM21278l3, null, null, enumC2888c, null, null, false, false, null, null, MessageListItemViewType.FILE_ATTACHMENTS, null), null, 2, null);
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("STRAIN STATISTICS");
        C38072d c38072d = C38072d.f163053a;
        C28801l c28801l5 = new C28801l(new AbstractC28805p.b(textResourceM21278l4, c38072d.m121951d().getVarious().getEducation(), 0, null, null, null, 60, null), null, 2, null);
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l("STRAIN STATISTICS");
        int education = c38072d.m121951d().getVarious().getEducation();
        EnumC2888c enumC2888c2 = EnumC2888c.T3;
        C28801l c28801l6 = new C28801l(new AbstractC28805p.b(textResourceM21278l5, education, 0, null, enumC2888c2, null, 44, null), null, 2, null);
        C28801l c28801l7 = new C28801l(new AbstractC28805p.b(AbstractC8693b.m21278l("STRAIN STATISTICS"), c38072d.m121951d().getVarious().getEducation(), 0, enumC28807r, null, null, 52, null), null, 2, null);
        C28801l c28801l8 = new C28801l(new AbstractC28805p.b(AbstractC8693b.m21278l("STRAIN STATISTICS"), c38072d.m121951d().getVarious().getEducation(), 0, enumC28807r2, null, null, 52, null), null, 2, null);
        C28801l c28801l9 = new C28801l(new AbstractC28805p.d(AbstractC8693b.m21278l("KEY STATISTICS"), AbstractC8693b.m21278l("VS. PREVIOUS 30 DAYS"), null, 4, null), null, 2, null);
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l("TODAY'S ACTIVITIES");
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l("START ACTIVITY");
        int add = c38072d.m121951d().getAction().getAdd();
        EnumC22400l enumC22400l = EnumC22400l.START_ACTIVITY;
        C28801l c28801l10 = new C28801l(new AbstractC28805p.e(textResourceM21278l6, textResourceM21278l7, add, enumC22400l, false, false, 0, false, null, null, null, null, 4080, null), null, 2, null);
        C28801l c28801l11 = new C28801l(new AbstractC28805p.e(AbstractC8693b.m21278l("STATISTICS VS. LAST 30 DAYS"), AbstractC8693b.m21278l("CUSTOMIZE"), AbstractC25012a.m73365A(c38072d), enumC22400l, true, false, 0, false, null, null, null, null, 4064, null), null, 2, null);
        C28801l c28801l12 = new C28801l(new AbstractC28805p.e(AbstractC8693b.m21278l("My Dashboard"), AbstractC8693b.m21278l("CUSTOMIZE"), AbstractC25012a.m73365A(c38072d), EnumC22400l.CUSTOMIZE_MY_DASHBOARD, false, true, 0, false, enumC28807r2, null, null, null, 3792, null), null, 2, null);
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l("Keep Learning, Extending");
        TextResource textResourceM21278l9 = AbstractC8693b.m21278l("VIEW ALL");
        int iM53359E = AbstractC18489d0.m53359E(c38072d);
        EnumC22400l enumC22400l2 = EnumC22400l.ONBOARDING_TASK_LIST;
        f116589a = AbstractC37056f.m118959K(c28801l, c28801l2, c28801l3, c28801l4, c28801l5, c28801l6, c28801l7, c28801l8, c28801l9, c28801l10, c28801l11, c28801l12, new C28801l(new AbstractC28805p.e(textResourceM21278l8, textResourceM21278l9, iM53359E, enumC22400l2, false, false, 0, false, enumC28807r, null, null, null, 3824, null), null, 2, null), new C28801l(new AbstractC28805p.e(AbstractC8693b.m21278l("Keep Learning, Extending"), AbstractC8693b.m21278l("VIEW ALL"), AbstractC18489d0.m53359E(c38072d), enumC22400l2, false, false, 0, false, enumC28807r2, null, null, null, 3824, null), null, 2, null), new C28801l(new AbstractC28805p.e(AbstractC8693b.m21278l("Keep Learning, Extending"), AbstractC8693b.m21278l("VIEW ALL"), AbstractC18489d0.m53359E(c38072d), enumC22400l2, false, false, 0, false, null, enumC2888c, null, null, 3568, null), null, 2, null), new C28801l(new AbstractC28805p.c("", AbstractC8693b.m21278l("Trend Views"), AbstractC8693b.m21278l("Today"), AbstractC8693b.m21278l("vs. last 7 days"), enumC28807r2, enumC2888c2), null, 2, null), new C28801l(new AbstractC28805p.a(AbstractC8693b.m21278l("ACHIEVEMENTS"), null, null, enumC2888c2, null, null, false, false, null, AbstractC8693b.m21278l("(12)"), 502, null), null, 2, null), new C28801l(new AbstractC28805p.a(AbstractC8693b.m21278l("ACHIEVEMENTS"), null, null, null, null, null, false, false, null, AbstractC8693b.m21278l("(12)"), 510, null), null, 2, null), new C28801l(new AbstractC28805p.a(AbstractC8693b.m21278l("ACHIEVEMENTS"), null, null, enumC2888c2, null, null, false, false, null, null, MessageListItemViewType.FILE_ATTACHMENTS, null), null, 2, null), new C28801l(new AbstractC28805p.a(AbstractC8693b.m21278l("ACHIEVEMENTS"), null, null, null, null, null, false, false, null, null, 510, null), null, 2, null), new C28801l(new AbstractC28805p.e(AbstractC8693b.m21278l("ACHIEVEMENTS"), AbstractC8693b.m21278l("VIEW ALL"), AbstractC18489d0.m53359E(c38072d), EnumC22400l.NONE, false, false, 0, false, null, enumC2888c2, null, AbstractC8693b.m21278l("(12)"), 1520, null), null, 2, null));
    }

    /* JADX INFO: renamed from: a */
    public static final List<C28801l> m87632a() {
        return f116589a;
    }
}
