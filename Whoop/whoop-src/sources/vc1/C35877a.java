package vc1;

import androidx.core.app.NotificationCompat;
import com.whoop.analytics.AnalyticEventModel;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import rr2.InterfaceC31766c;

/* JADX INFO: renamed from: vc1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lvc1/a;", "", "Lrr2/c;", "crashReporter", "<init>", "(Lrr2/c;)V", "Lm91/o;", "itemWrapper", "Ll83/a0;", "a", "(Lm91/o;)V", "Lrr2/c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35877a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    public C35877a(InterfaceC31766c crashReporter) {
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        this.crashReporter = crashReporter;
    }

    /* JADX INFO: renamed from: a */
    public final void m113921a(C25306o itemWrapper) {
        String string;
        String name;
        AbstractC22676k.m65750j(itemWrapper, "itemWrapper");
        InterfaceC31766c interfaceC31766c = this.crashReporter;
        Object objM74316c = itemWrapper.m74316c();
        String str = "null";
        if (objM74316c == null || (string = objM74316c.toString()) == null) {
            string = "null";
        }
        C23465k c23465k = new C23465k("id", string);
        AnalyticEventModel primaryAnalyticEvent = itemWrapper.getPrimaryAnalyticEvent();
        if (primaryAnalyticEvent != null && (name = primaryAnalyticEvent.getName()) != null) {
            str = name;
        }
        interfaceC31766c.mo98632r("design_item_tap", AbstractC25247g0.m73990Y(c23465k, new C23465k(NotificationCompat.CATEGORY_EVENT, str)));
    }
}
