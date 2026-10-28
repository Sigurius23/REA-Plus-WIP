package ya0;

import androidx.core.app.NotificationCompat;
import b01.C2188i;
import c41.C4092p2;
import com.whoop.advancedlabs.domain.models.AdvancedLabsAnalyticsDomainModel;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import f01.C13890q;
import fi0.AbstractC14516b;
import fi0.InterfaceC14515a;
import h51.C16934f;
import java.util.Iterator;
import java.util.Map;
import kd0.InterfaceC22381a;
import kf0.C22436k;
import l01.C23042n;
import l83.C23465k;
import lf0.C23972t1;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import ny0.C27256h;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33184h0;
import q11.AbstractC29791a;
import q11.C29795e;
import q21.C29850i;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ya0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00020\b*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lya0/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lkd0/a$x;", "action", "Ll83/a0;", "f", "(Lkd0/a$x;)V", "Lkf0/k;", "a", "(Lkf0/k;Ljava/lang/Object;)V", "Lm91/u;", NotificationCompat.CATEGORY_EVENT, "", "sectionId", "c", "(Lm91/u;Ljava/lang/Object;Ljava/lang/String;)V", "Lny0/h;", "b", "(Lny0/h;)V", "Lkd0/a$c;", "e", "(Lkd0/a$c;)V", "Lcom/whoop/analytics/AnalyticEventModel;", "d", "(Lcom/whoop/analytics/AnalyticEventModel;)V", "Lfi0/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39355a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C39355a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    private final void m125491a(C22436k c22436k, Object obj) {
        String id4 = c22436k.getId();
        switch (id4.hashCode()) {
            case -1653898088:
                if (!id4.equals("feature_comparison_section")) {
                    return;
                }
                break;
            case -1472780963:
                if (!id4.equals("coaching_carousel_section")) {
                    return;
                }
                break;
            case -336157162:
                if (!id4.equals("learn_more_section")) {
                    return;
                }
                break;
            case 353245097:
                if (!id4.equals("biomarker_summary")) {
                    return;
                }
                break;
            case 634073144:
                if (!id4.equals("biomarker_preview_list_section")) {
                    return;
                }
                break;
            case 1462188732:
                if (!id4.equals("faq_section")) {
                    return;
                }
                break;
            case 1799461249:
                if (!id4.equals("next_steps_section")) {
                    return;
                }
                break;
            case 1882277613:
                if (!id4.equals("feature_list_section")) {
                    return;
                }
                break;
            default:
                return;
        }
        Iterator<T> it = c22436k.m64734e().iterator();
        while (it.hasNext()) {
            m125493c((InterfaceC25312u) it.next(), obj, c22436k.getId());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    private final void m125492b(C27256h c27256h) {
        String id4 = c27256h.getId();
        if (id4 != null) {
            switch (id4.hashCode()) {
                case -1208021408:
                    if (id4.equals("coaching_carousel_start_testing_standard_button")) {
                        AbstractC39356b.m125504h(this.analytics);
                        break;
                    }
                    break;
                case 252511160:
                    if (id4.equals("advanced_labs_home_upload_past_labs_button")) {
                        AbstractC39356b.m125509m(this.analytics);
                        break;
                    }
                    break;
                case 742613602:
                    if (id4.equals("advanced_labs_home_start_testing_button")) {
                        AbstractC39356b.m125503g(this.analytics);
                        break;
                    }
                    break;
                case 1608239106:
                    if (id4.equals("biomarker_list_start_testing_button")) {
                        AbstractC39356b.m125502f(this.analytics);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m125493c(InterfaceC25312u interfaceC25312u, Object obj, String str) {
        String str2;
        if (interfaceC25312u instanceof C23972t1) {
            if ((obj instanceof C9598e) && (((C9598e) obj).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() instanceof AppScreen.C9281c1) && AbstractC22676k.m65745e(((C23972t1) interfaceC25312u).getId(), "promotional_biomarker_pie_chart_section")) {
                AbstractC39356b.m125510n(this.analytics);
                return;
            }
            return;
        }
        if (interfaceC25312u instanceof C13890q) {
            if (obj instanceof C27256h) {
                m125492b((C27256h) obj);
                return;
            }
            return;
        }
        if (interfaceC25312u instanceof C27256h) {
            if (obj instanceof C27256h) {
                m125492b((C27256h) obj);
                return;
            }
            return;
        }
        if (interfaceC25312u instanceof C23042n) {
            if ((obj instanceof C9598e) && (((C9598e) obj).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() instanceof AppScreen.C9320h0) && AbstractC22676k.m65745e(((C23042n) interfaceC25312u).getId(), "labs_included")) {
                AbstractC39356b.m125506j(this.analytics);
                return;
            }
            return;
        }
        if (interfaceC25312u instanceof C29850i) {
            if ((obj instanceof C9598e) && (((C9598e) obj).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() instanceof AppScreen.C9320h0)) {
                AbstractC39356b.m125505i(this.analytics);
                return;
            }
            return;
        }
        if (interfaceC25312u instanceof C33184h0) {
            if (AbstractC22676k.m65745e(str, "next_steps_section")) {
                AbstractC39356b.m125507k(this.analytics);
                return;
            }
            return;
        }
        if (interfaceC25312u instanceof C29795e) {
            if (obj instanceof AbstractC29791a.b) {
                AbstractC39356b.m125498b(this.analytics, ((AbstractC29791a.b) obj).getId());
                return;
            }
            return;
        }
        if (interfaceC25312u instanceof C2188i) {
            if (!(obj instanceof C9598e)) {
                if (obj instanceof C27256h) {
                    m125492b((C27256h) obj);
                    return;
                }
                return;
            }
            AppScreen appScreen = ((C9598e) obj).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
            if (appScreen instanceof AppScreen.C9301e5) {
                AbstractC39356b.m125501e(this.analytics);
                return;
            } else {
                if (appScreen instanceof AppScreen.C9320h0) {
                    AbstractC39356b.m125502f(this.analytics);
                    return;
                }
                return;
            }
        }
        if (interfaceC25312u instanceof C16934f) {
            if (obj instanceof ArticleTileModelEvent.Url) {
                if (AbstractC22676k.m65745e(str, "coaching_carousel_section")) {
                    AbstractC39356b.m125497a(this.analytics, ((ArticleTileModelEvent.Url) obj).getId());
                    return;
                } else {
                    if (AbstractC22676k.m65745e(str, "learn_more_section")) {
                        AbstractC39356b.m125499c(this.analytics, ((ArticleTileModelEvent.Url) obj).getId());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ((interfaceC25312u instanceof C4092p2) && AbstractC22676k.m65745e(str, "feature_list_section") && (obj instanceof C9598e) && (((C9598e) obj).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() instanceof AppScreen.C9457y2)) {
            Map<String, String> mapM12554c = ((C4092p2) interfaceC25312u).m12554c();
            if (mapM12554c == null || (str2 = mapM12554c.get("region")) == null) {
                str2 = "unknown";
            }
            AbstractC39356b.m125500d(this.analytics, str2);
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m125494f(InterfaceC22381a.x action) {
        InterfaceC25312u element = action.getElement();
        if (element instanceof C22436k) {
            m125491a((C22436k) element, action.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m125495d(AnalyticEventModel event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC14516b.m41429a(this.analytics, event);
    }

    /* JADX INFO: renamed from: e */
    public final void m125496e(InterfaceC22381a.c event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC22381a.b0) {
            InterfaceC14515a interfaceC14515a = this.analytics;
            InterfaceC22381a.b0 b0Var = (InterfaceC22381a.b0) event;
            AdvancedLabsAnalyticsDomainModel analyticsData = b0Var.getAnalyticsData();
            String label = analyticsData != null ? analyticsData.getLabel() : null;
            AdvancedLabsAnalyticsDomainModel analyticsData2 = b0Var.getAnalyticsData();
            String value = analyticsData2 != null ? analyticsData2.getValue() : null;
            C23465k c23465k = new C23465k("source", b0Var.getSource());
            AdvancedLabsAnalyticsDomainModel analyticsData3 = b0Var.getAnalyticsData();
            C23465k c23465k2 = new C23465k("workflow_step", analyticsData3 != null ? analyticsData3.getWorkflowStep() : null);
            AdvancedLabsAnalyticsDomainModel analyticsData4 = b0Var.getAnalyticsData();
            InterfaceC14515a.m41418i(interfaceC14515a, null, "view_home", label, "Bloodwork", value, AbstractC25247g0.m73990Y(c23465k, c23465k2, new C23465k("category", analyticsData4 != null ? analyticsData4.getCategory() : null)), 1, null);
            return;
        }
        if (event instanceof InterfaceC22381a.f0) {
            InterfaceC14515a interfaceC14515a2 = this.analytics;
            InterfaceC22381a.f0 f0Var = (InterfaceC22381a.f0) event;
            AdvancedLabsAnalyticsDomainModel analyticsData5 = f0Var.getAnalyticsData();
            String label2 = analyticsData5 != null ? analyticsData5.getLabel() : null;
            AdvancedLabsAnalyticsDomainModel analyticsData6 = f0Var.getAnalyticsData();
            String value2 = analyticsData6 != null ? analyticsData6.getValue() : null;
            AdvancedLabsAnalyticsDomainModel analyticsData7 = f0Var.getAnalyticsData();
            InterfaceC14515a.m41418i(interfaceC14515a2, null, "view_biomarker_summary", label2, "Bloodwork", value2, AbstractC25247g0.m73990Y(new C23465k("workflow_step", analyticsData7 != null ? analyticsData7.getWorkflowStep() : null), new C23465k(HMSTrackSource.SCREEN, "biomarker_summary")), 1, null);
            return;
        }
        if (event instanceof InterfaceC22381a.d0) {
            InterfaceC14515a interfaceC14515a3 = this.analytics;
            InterfaceC22381a.d0 d0Var = (InterfaceC22381a.d0) event;
            AdvancedLabsAnalyticsDomainModel analyticsData8 = d0Var.getAnalyticsData();
            String label3 = analyticsData8 != null ? analyticsData8.getLabel() : null;
            AdvancedLabsAnalyticsDomainModel analyticsData9 = d0Var.getAnalyticsData();
            String value3 = analyticsData9 != null ? analyticsData9.getValue() : null;
            AdvancedLabsAnalyticsDomainModel analyticsData10 = d0Var.getAnalyticsData();
            InterfaceC14515a.m41418i(interfaceC14515a3, null, "view_biomarker_detail", label3, "Bloodwork", value3, AbstractC25247g0.m73990Y(new C23465k("workflow_step", analyticsData10 != null ? analyticsData10.getWorkflowStep() : null), new C23465k("source", d0Var.getSource())), 1, null);
            return;
        }
        if (event instanceof InterfaceC22381a.e0) {
            InterfaceC14515a.m41418i(this.analytics, null, "biomarker_detail_faq", null, "Bloodwork", String.valueOf(((InterfaceC22381a.e0) event).getIndex()), null, 37, null);
            return;
        }
        if (event instanceof InterfaceC22381a.h0) {
            InterfaceC14515a interfaceC14515a4 = this.analytics;
            InterfaceC22381a.h0 h0Var = (InterfaceC22381a.h0) event;
            AdvancedLabsAnalyticsDomainModel analyticsData11 = h0Var.getAnalyticsData();
            String label4 = analyticsData11 != null ? analyticsData11.getLabel() : null;
            AdvancedLabsAnalyticsDomainModel analyticsData12 = h0Var.getAnalyticsData();
            String value4 = analyticsData12 != null ? analyticsData12.getValue() : null;
            AdvancedLabsAnalyticsDomainModel analyticsData13 = h0Var.getAnalyticsData();
            InterfaceC14515a.m41418i(interfaceC14515a4, null, "view_insights", label4, "Bloodwork", value4, AbstractC25247g0.m73990Y(new C23465k("workflow_step", analyticsData13 != null ? analyticsData13.getWorkflowStep() : null), new C23465k("source", h0Var.getSource())), 1, null);
            return;
        }
        if (event instanceof InterfaceC22381a.g0) {
            InterfaceC14515a interfaceC14515a5 = this.analytics;
            InterfaceC22381a.g0 g0Var = (InterfaceC22381a.g0) event;
            AdvancedLabsAnalyticsDomainModel analyticsData14 = g0Var.getAnalyticsData();
            String label5 = analyticsData14 != null ? analyticsData14.getLabel() : null;
            AdvancedLabsAnalyticsDomainModel analyticsData15 = g0Var.getAnalyticsData();
            String value5 = analyticsData15 != null ? analyticsData15.getValue() : null;
            AdvancedLabsAnalyticsDomainModel analyticsData16 = g0Var.getAnalyticsData();
            InterfaceC14515a.m41418i(interfaceC14515a5, null, "view_insight_detail", label5, "Bloodwork", value5, AbstractC25247g0.m73990Y(new C23465k("workflow_step", analyticsData16 != null ? analyticsData16.getWorkflowStep() : null), new C23465k("source", g0Var.getSource())), 1, null);
            return;
        }
        if (event instanceof InterfaceC22381a.c0) {
            InterfaceC14515a interfaceC14515a6 = this.analytics;
            InterfaceC22381a.c0 c0Var = (InterfaceC22381a.c0) event;
            AdvancedLabsAnalyticsDomainModel analyticsData17 = c0Var.getAnalyticsData();
            String label6 = analyticsData17 != null ? analyticsData17.getLabel() : null;
            AdvancedLabsAnalyticsDomainModel analyticsData18 = c0Var.getAnalyticsData();
            String value6 = analyticsData18 != null ? analyticsData18.getValue() : null;
            AdvancedLabsAnalyticsDomainModel analyticsData19 = c0Var.getAnalyticsData();
            InterfaceC14515a.m41418i(interfaceC14515a6, null, "view_actions", label6, "Bloodwork", value6, AbstractC31061c.m95645u("workflow_step", analyticsData19 != null ? analyticsData19.getWorkflowStep() : null), 1, null);
            return;
        }
        if (event instanceof InterfaceC22381a.x) {
            m125494f((InterfaceC22381a.x) event);
            return;
        }
        if (event instanceof InterfaceC22381a.z0) {
            AbstractC39356b.m125508l(this.analytics);
            return;
        }
        if (event instanceof InterfaceC22381a.q) {
            InterfaceC22381a.q qVar = (InterfaceC22381a.q) event;
            InterfaceC14515a.m41418i(this.analytics, null, "home_learn_more", qVar.getArticleTile(), "Bloodwork", qVar.getIndex(), null, 33, null);
            return;
        }
        if (event instanceof InterfaceC22381a.o) {
            InterfaceC14515a.m41418i(this.analytics, null, "biomarker_summary_download", null, "Bloodwork", null, null, 53, null);
            return;
        }
        if (event instanceof InterfaceC22381a.p) {
            InterfaceC14515a.m41418i(this.analytics, null, "biomarker_summary_search", null, "Bloodwork", null, null, 53, null);
            return;
        }
        if (event instanceof InterfaceC22381a.e1) {
            InterfaceC14515a interfaceC14515a7 = this.analytics;
            InterfaceC22381a.e1 e1Var = (InterfaceC22381a.e1) event;
            AdvancedLabsAnalyticsDomainModel analyticsData20 = e1Var.getAnalyticsData();
            String label7 = analyticsData20 != null ? analyticsData20.getLabel() : null;
            AdvancedLabsAnalyticsDomainModel analyticsData21 = e1Var.getAnalyticsData();
            InterfaceC14515a.m41418i(interfaceC14515a7, null, "view_all_tests", label7, "Bloodwork", analyticsData21 != null ? analyticsData21.getValue() : null, null, 33, null);
            return;
        }
        if (event instanceof InterfaceC22381a.g1) {
            InterfaceC14515a interfaceC14515a8 = this.analytics;
            InterfaceC22381a.g1 g1Var = (InterfaceC22381a.g1) event;
            AdvancedLabsAnalyticsDomainModel analyticsData22 = g1Var.getAnalyticsData();
            String label8 = analyticsData22 != null ? analyticsData22.getLabel() : null;
            AdvancedLabsAnalyticsDomainModel analyticsData23 = g1Var.getAnalyticsData();
            InterfaceC14515a.m41418i(interfaceC14515a8, null, "view_single_test", label8, "Bloodwork", analyticsData23 != null ? analyticsData23.getValue() : null, null, 33, null);
            return;
        }
        if (event instanceof InterfaceC22381a.w0) {
            InterfaceC14515a.m41418i(this.analytics, null, "test_download", ((InterfaceC22381a.w0) event).getTestType(), "Bloodwork", null, null, 49, null);
            return;
        }
        if (event instanceof InterfaceC22381a.x0) {
            InterfaceC14515a.m41418i(this.analytics, null, "test_edit_saved", null, "Bloodwork", null, null, 53, null);
            return;
        }
        if (event instanceof InterfaceC22381a.v0) {
            InterfaceC14515a.m41418i(this.analytics, null, "test_delete", null, "Bloodwork", null, null, 53, null);
            return;
        }
        if (event instanceof InterfaceC22381a.l) {
            InterfaceC14515a.m41418i(this.analytics, null, "biomarker_detail_view_all", null, "Bloodwork", null, null, 53, null);
            return;
        }
        if (event instanceof InterfaceC22381a.r0) {
            InterfaceC22381a.r0 r0Var = (InterfaceC22381a.r0) event;
            this.analytics.mo41428k("intake_workflow", "start_workflow", r0Var.getLabel(), "Bloodwork", AbstractC31061c.m95645u("source", r0Var.getSource()));
            return;
        }
        if (event instanceof InterfaceC22381a.w) {
            InterfaceC14515a.m41418i(this.analytics, "intake_workflow", "intake_started", null, "Bloodwork", null, null, 52, null);
            return;
        }
        if (event instanceof InterfaceC22381a.l0) {
            InterfaceC22381a.l0 l0Var = (InterfaceC22381a.l0) event;
            if (l0Var.getHasUpchargeWarning()) {
                this.analytics.mo41422d("appt_scheduling_workflow", "appt_scheduling_zip", l0Var.getTestType(), "Bloodwork", l0Var.getCityCode(), AbstractC36095b.m114688p(Boolean.TRUE, "upcharge_warning"));
                return;
            } else {
                this.analytics.mo41426h("appt_scheduling_workflow", "appt_scheduling_zip", l0Var.getTestType(), "Bloodwork", l0Var.getCityCode());
                return;
            }
        }
        if (event instanceof InterfaceC22381a.m0) {
            InterfaceC22381a.m0 m0Var = (InterfaceC22381a.m0) event;
            this.analytics.mo41422d("appt_scheduling_workflow", "appt_scheduling_error", m0Var.getTestType(), "Bloodwork", m0Var.getCityCode(), AbstractC36095b.m114688p(Boolean.TRUE, "location_error"));
            return;
        }
        if (event instanceof InterfaceC22381a.b) {
            InterfaceC14515a.m41418i(this.analytics, "bloodwork", "add_details", null, "External Data Upload", null, null, 52, null);
            return;
        }
        if (event instanceof InterfaceC22381a.c1) {
            InterfaceC14515a.m41418i(this.analytics, null, "upload_success", null, "Bloodwork", null, null, 53, null);
            return;
        }
        if (event instanceof InterfaceC22381a.b1) {
            InterfaceC14515a.m41418i(this.analytics, null, "upload_failure", null, "Bloodwork", null, null, 53, null);
            return;
        }
        if (event instanceof InterfaceC22381a.k) {
            InterfaceC22381a.k kVar = (InterfaceC22381a.k) event;
            InterfaceC14515a.m41418i(this.analytics, null, "biomarker_add_saved", kVar.getBiomarkersAddedNames(), "Bloodwork", kVar.getBiomarkersAddedCount(), null, 33, null);
            return;
        }
        if (event instanceof InterfaceC22381a.m) {
            InterfaceC22381a.m mVar = (InterfaceC22381a.m) event;
            InterfaceC14515a.m41418i(this.analytics, null, "biomarker_edit_saved", mVar.getBiomarkersEditedNames(), "Bloodwork", mVar.getBiomarkersEditedCount(), null, 33, null);
            return;
        }
        if (event instanceof InterfaceC22381a.n) {
            InterfaceC22381a.n nVar = (InterfaceC22381a.n) event;
            InterfaceC14515a.m41418i(this.analytics, null, "biomarker_remove_saved", nVar.getBiomarkersRemovedNames(), "Bloodwork", nVar.getBiomarkersRemovedCount(), null, 33, null);
            return;
        }
        if (event instanceof InterfaceC22381a.d1) {
            InterfaceC22381a.d1 d1Var = (InterfaceC22381a.d1) event;
            this.analytics.mo41426h("bloodwork", "validation_complete", d1Var.getBiomarkersEditedNames(), "External Data Upload", d1Var.getBiomarkersEditedCount());
            return;
        }
        if (event instanceof InterfaceC22381a.e) {
            InterfaceC14515a.m41418i(this.analytics, "appt_scheduling_workflow", "appt_add_calendar", null, "Bloodwork", null, null, 52, null);
            return;
        }
        if (event instanceof InterfaceC22381a.g) {
            InterfaceC14515a.m41418i(this.analytics, "appt_scheduling_workflow", "appt_reschedule_start", null, "Bloodwork", null, AbstractC31061c.m95645u("source", ((InterfaceC22381a.g) event).getSource()), 20, null);
            return;
        }
        if (event instanceof InterfaceC22381a.f) {
            InterfaceC14515a.m41418i(this.analytics, "appt_scheduling_workflow", "appt_lab_order", null, "Bloodwork", null, null, 52, null);
            return;
        }
        if (event instanceof InterfaceC22381a.a) {
            InterfaceC14515a.m41418i(this.analytics, null, "action_filter", null, "Bloodwork", null, null, 53, null);
            return;
        }
        if (event instanceof InterfaceC22381a.y0) {
            InterfaceC14515a.m41418i(this.analytics, null, ((InterfaceC22381a.y0) event).getIsExpanded() ? "see_more" : "see_less", null, "Bloodwork", null, AbstractC31061c.m95645u(HMSTrackSource.SCREEN, "biomarker_summary"), 21, null);
            return;
        }
        if (event instanceof InterfaceC22381a.q0) {
            InterfaceC14515a.m41418i(this.analytics, null, "start_testing", null, "Bloodwork", null, AbstractC31061c.m95645u(HMSTrackSource.SCREEN, "biomarker_summary"), 21, null);
            return;
        }
        if (event instanceof InterfaceC22381a.s) {
            InterfaceC14515a.m41418i(this.analytics, null, "close_card", null, "Bloodwork", null, AbstractC31061c.m95645u(HMSTrackSource.SCREEN, "biomarker_summary"), 21, null);
            return;
        }
        if (event instanceof InterfaceC22381a.u) {
            InterfaceC14515a.m41418i(this.analytics, null, null, null, "Healthspan", null, AbstractC31061c.m95645u("source", "biomarker_advanced_labs"), 23, null);
            return;
        }
        if (event instanceof InterfaceC22381a.v) {
            InterfaceC14515a.m41418i(this.analytics, null, "biomarker_detail_healthspan_card", ((InterfaceC22381a.v) event).getLabel(), "Bloodwork", null, null, 49, null);
            return;
        }
        if (event instanceof InterfaceC22381a.s0) {
            AbstractC39356b.m125511o(this.analytics, ((InterfaceC22381a.s0) event).getSelectedSegmentId());
            return;
        }
        if (event instanceof InterfaceC22381a.o0) {
            AbstractC39356b.m125513q(this.analytics, ((InterfaceC22381a.o0) event).getSelectedSegmentId());
            return;
        }
        if (event instanceof InterfaceC22381a.t0) {
            InterfaceC22381a.t0 t0Var = (InterfaceC22381a.t0) event;
            InterfaceC14515a.m41418i(this.analytics, null, "swipe_testimonial", t0Var.getTestimonialId(), "Bloodwork", null, AbstractC31061c.m95645u(HMSTrackSource.SCREEN, t0Var.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String()), 17, null);
            return;
        }
        if (event instanceof InterfaceC22381a.n0) {
            InterfaceC14515a.m41418i(this.analytics, null, ProfileAnalyticsKt.SCROLLED_TO_BOTTOM, null, "Bloodwork", null, AbstractC31061c.m95645u(HMSTrackSource.SCREEN, "al_landing_page"), 21, null);
            return;
        }
        if (event instanceof InterfaceC22381a.u0) {
            InterfaceC14515a.m41418i(this.analytics, null, "test_context_edit", ((InterfaceC22381a.u0) event).getEditType(), "Bloodwork", null, null, 49, null);
        } else {
            if (!(event instanceof InterfaceC22381a.a1)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC14515a interfaceC14515a9 = this.analytics;
            String biomarkerId = ((InterfaceC22381a.a1) event).getBiomarkerId();
            InterfaceC14515a.m41418i(interfaceC14515a9, null, "trend_scrub", null, "Bloodwork", null, biomarkerId != null ? AbstractC31061c.m95645u("biomarker_id", biomarkerId) : null, 21, null);
        }
    }
}
