package ey2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignScheduleScreenResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignScheduleSection;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignScheduleTask;
import fy2.C14881c;
import fy2.C14882d;
import fy2.InterfaceC14880b;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import y71.C39274g;
import y71.C39282o;

/* JADX INFO: renamed from: ey2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;", "Lfy2/b$b;", "b", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleScreenResponse;)Lfy2/b$b;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleSection;", "Lfy2/c;", "c", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleSection;)Lfy2/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleTask;", "Lfy2/d;", "d", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignScheduleTask;)Lfy2/d;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13755b {

    /* JADX INFO: renamed from: ey2.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f49064w = new a();

        /* JADX INFO: renamed from: a */
        public final long m39098a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m39098a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ey2.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f49065w = new b();

        /* JADX INFO: renamed from: a */
        public final long m39099a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m39099a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ey2.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f49066w = new c();

        /* JADX INFO: renamed from: a */
        public final long m39100a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m39100a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: ey2.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f49067w = new d();

        /* JADX INFO: renamed from: a */
        public final long m39101a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getNeutral15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m39101a((C39336i) obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final InterfaceC14880b.b m39095b(CampaignScheduleScreenResponse campaignScheduleScreenResponse) {
        int campaignId = campaignScheduleScreenResponse.getCampaignId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(campaignScheduleScreenResponse.getTitle());
        String subtitle = campaignScheduleScreenResponse.getSubtitle();
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(campaignScheduleScreenResponse.getPageTitle());
        List<CampaignScheduleSection> sections = campaignScheduleScreenResponse.getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(m39096c((CampaignScheduleSection) it.next()));
        }
        return new InterfaceC14880b.b(campaignId, textResourceM21278l2, textResourceM21278l, subtitle, arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static final C14881c m39096c(CampaignScheduleSection campaignScheduleSection) {
        AbstractC22676k.m65750j(campaignScheduleSection, "<this>");
        String title = campaignScheduleSection.getTitle();
        TextResource textResourceM21278l = title != null ? AbstractC8693b.m21278l(title) : null;
        String subtitle = campaignScheduleSection.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        List<CampaignScheduleTask> campaignScheduleTasks = campaignScheduleSection.getCampaignScheduleTasks();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(campaignScheduleTasks, 10));
        Iterator<T> it = campaignScheduleTasks.iterator();
        while (it.hasNext()) {
            arrayList.add(m39097d((CampaignScheduleTask) it.next()));
        }
        return new C14881c(textResourceM21278l, subtitle, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final C14882d m39097d(CampaignScheduleTask campaignScheduleTask) {
        C39274g c39274g;
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(campaignScheduleTask, "<this>");
        int sessionId = campaignScheduleTask.getSessionId();
        C39282o.Companion companion = C39282o.INSTANCE;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(campaignScheduleTask.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(campaignScheduleTask.getSubtitle());
        InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a(a.f49064w);
        String leftIcon = campaignScheduleTask.getLeftIcon();
        Object c39274g2 = null;
        if (leftIcon != null) {
            EnumC16313m0 enumC16313m1 = EnumC16313m0.ACTIVITY;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), leftIcon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            c39274g = new C39274g(enumC16313m1.toWhoopIcon(), AbstractC8693b.m21267a());
        } else {
            c39274g = null;
        }
        InterfaceC39332e interfaceC39332eM125323a2 = p745y81.Function1.m125323a(b.f49065w);
        String rightIcon = campaignScheduleTask.getRightIcon();
        if (rightIcon != null) {
            EnumC16313m0 enumC16313m2 = EnumC16313m0.CARET_FORWARD;
            for (EnumC16313m0 enumC16313m3 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m3.name(), rightIcon)) {
                    c39274g2 = enumC16313m3;
                    break;
                }
            }
            if (c39274g2 != null) {
                enumC16313m2 = c39274g2;
            }
            c39274g2 = new C39274g(enumC16313m2.toWhoopIcon(), AbstractC8693b.m21267a());
        }
        return new C14882d(sessionId, C39282o.Companion.m125229d(companion, textResourceM21278l, null, null, textResourceM21278l2, interfaceC39332eM125323a, c39274g, interfaceC39332eM125323a2, c39274g2, p745y81.Function1.m125323a(c.f49066w), null, null, null, null, p745y81.Function1.m125323a(d.f49067w), AbstractC22676k.m65745e(campaignScheduleTask.getMenuItemState(), "ENABLED"), false, null, false, null, null, null, false, null, 8363526, null));
    }
}
