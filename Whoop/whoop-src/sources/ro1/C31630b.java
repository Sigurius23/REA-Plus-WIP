package ro1;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.mapbox.common.HttpHeaders;
import com.squareup.wire.AbstractC5583n;
import l83.C23465k;
import m83.AbstractC25247g0;
import or2.AbstractC28163g0;
import or2.AbstractC28219z;
import p114eb.C12969k0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ro1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lro1/b;", "", "Landroidx/fragment/app/m0;", "fragment", "<init>", "(Landroidx/fragment/app/m0;)V", "Lro1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lro1/a;)V", "Landroidx/fragment/app/m0;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31630b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractComponentCallbacksC1320m0 fragment;

    public C31630b(AbstractComponentCallbacksC1320m0 fragment) {
        AbstractC22676k.m65750j(fragment, "fragment");
        this.fragment = fragment;
    }

    /* JADX INFO: renamed from: a */
    public final void m97737a(AbstractC31629a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC31629a.a.f130687a)) {
            AbstractC28163g0.m85259o(this.fragment).m85343i();
            return;
        }
        if (!(event instanceof AbstractC31629a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC31629a.b bVar = (AbstractC31629a.b) event;
        String string = AbstractC28219z.m85447b("logCalendar", AbstractC25247g0.m73990Y(new C23465k(HttpHeaders.DATE, bVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()), new C23465k("source", bVar.getSource()))).toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        Uri uri = Uri.parse(string);
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC5583n.m16799z(this.fragment).m36404s(new C12969k0(uri, null, null));
    }
}
