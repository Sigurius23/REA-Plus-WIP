package nw1;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import uw1.C35310c;
import uw1.C35315h;
import ww1.C37656b;
import ww1.C37662h;
import ww1.C37663i;
import ww1.C37664j;
import ww1.C37665k;
import ww1.C37666l;
import ww1.C37667m;
import ww1.C37668n;
import ww1.C37669o;
import ww1.C37670p;
import ww1.InterfaceC37655a;
import ww1.InterfaceC37658d;

/* JADX INFO: renamed from: nw1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lnw1/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lww1/h;", "action", "Ll83/a0;", "b", "(Lww1/h;)V", "Lww1/a;", NotificationCompat.CATEGORY_EVENT, "a", "(Lww1/a;)V", "Lfi0/a;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27209a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C27209a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: b */
    private final void m81938b(C37662h action) {
        InterfaceC25312u element = action.getElement();
        if (!(element instanceof C27256h)) {
            if (element instanceof C35315h) {
                AbstractC27211c.m81947c(this.analytics);
                return;
            }
            return;
        }
        String id4 = ((C27256h) action.getElement()).getId();
        if (AbstractC22676k.m65745e(id4, "AddNewMemberButton")) {
            AbstractC27211c.m81946b(this.analytics);
        } else if (AbstractC22676k.m65745e(id4, "AddExistingMemberButton")) {
            AbstractC27211c.m81945a(this.analytics);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m81939a(InterfaceC37655a event) {
        String strValueOf;
        String strValueOf2;
        AbstractC22676k.m65750j(event, "event");
        String str = "none";
        if (event instanceof C37669o) {
            Integer numM81942c = AbstractC27210b.m81942c(((C37669o) event).getHubScreenContent());
            InterfaceC14515a interfaceC14515a = this.analytics;
            C23465k c23465k = new C23465k("screen_name", "fp hub");
            if (numM81942c != null && (strValueOf2 = String.valueOf(numM81942c.intValue())) != null) {
                str = strValueOf2;
            }
            InterfaceC14515a.m41418i(interfaceC14515a, null, ProfileAnalyticsKt.VIEW, HMSTrackSource.SCREEN, "Manage Family Plan", null, AbstractC25247g0.m73990Y(c23465k, new C23465k("family_size", str)), 17, null);
            return;
        }
        if (event instanceof C37670p) {
            InterfaceC14515a.m41418i(this.analytics, null, ProfileAnalyticsKt.VIEW, HMSTrackSource.SCREEN, "Manage Family Plan", null, AbstractC31061c.m95645u("screen_name", ((C37670p) event).getIsNewMember() ? "add new member" : "add existing member"), 17, null);
            return;
        }
        if (event instanceof C37668n) {
            InterfaceC14515a.m41418i(this.analytics, null, ProfileAnalyticsKt.VIEW, "modal", "Manage Family Plan", "invite confirmation", AbstractC31061c.m95645u("screen_name", "add existing member"), 1, null);
            return;
        }
        if (event instanceof C37665k) {
            C37665k c37665k = (C37665k) event;
            C35310c.c hubScreenContent = c37665k.getHubScreenContent();
            Integer numM81942c2 = hubScreenContent != null ? AbstractC27210b.m81942c(hubScreenContent) : null;
            InterfaceC14515a interfaceC14515a2 = this.analytics;
            String str2 = c37665k.getIsNewMember() ? "add new member" : "add existing member";
            C23465k c23465k2 = new C23465k("screen_name", "fp hub");
            if (numM81942c2 != null && (strValueOf = String.valueOf(numM81942c2.intValue())) != null) {
                str = strValueOf;
            }
            InterfaceC14515a.m41418i(interfaceC14515a2, null, "tap", "cta", "Manage Family Plan", str2, AbstractC25247g0.m73990Y(c23465k2, new C23465k("family_size", str)), 1, null);
            return;
        }
        if (event.equals(C37664j.f161412a)) {
            InterfaceC14515a.m41418i(this.analytics, null, "tap", "cta", "Manage Family Plan", "gift", AbstractC31061c.m95645u("screen_name", "add new member"), 1, null);
            return;
        }
        if (event.equals(C37666l.f161415a)) {
            InterfaceC14515a.m41418i(this.analytics, null, "tap", "cta", "Manage Family Plan", "RAF", AbstractC31061c.m95645u("screen_name", "add new member"), 1, null);
            return;
        }
        if (event.equals(C37656b.f161391a)) {
            InterfaceC14515a.m41418i(this.analytics, null, "tap", "cta", "Manage Family Plan", "invite confirmation continue", AbstractC31061c.m95645u("screen_name", "add existing member"), 1, null);
            return;
        }
        if (event.equals(C37663i.f161411a)) {
            InterfaceC14515a.m41418i(this.analytics, null, "tap", "icon", "Manage Family Plan", "remove member", AbstractC31061c.m95645u("screen_name", "fp hub"), 1, null);
            return;
        }
        if (event instanceof InterfaceC37658d.c) {
            InterfaceC14515a.m41418i(this.analytics, null, "tap", "modal", "Manage Family Plan", "confirm removal", AbstractC31061c.m95645u("screen_name", "remove member"), 1, null);
            return;
        }
        if (event.equals(InterfaceC37658d.a.f161392a)) {
            InterfaceC14515a.m41418i(this.analytics, null, "tap", "modal", "Manage Family Plan", "back", AbstractC31061c.m95645u("screen_name", "remove member"), 1, null);
        } else if (event.equals(C37667m.f161416a)) {
            InterfaceC14515a.m41418i(this.analytics, null, "tap", "icon", "Manage Family Plan", "back", AbstractC31061c.m95645u("screen_name", "fp hub"), 1, null);
        } else {
            if (!(event instanceof C37662h)) {
                throw new NoWhenBranchMatchedException();
            }
            m81938b((C37662h) event);
        }
    }
}
