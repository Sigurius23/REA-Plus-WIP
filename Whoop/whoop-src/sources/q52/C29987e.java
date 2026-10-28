package q52;

import android.content.Context;
import android.widget.TextView;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q52.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lq52/e;", "", "<init>", "()V", "Landroid/widget/TextView;", ProfileAnalyticsKt.VIEW, "Lcom/whoop/design/util/TextResource;", "textResource", "Ll83/a0;", "a", "(Landroid/widget/TextView;Lcom/whoop/design/util/TextResource;)V", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29987e {

    /* JADX INFO: renamed from: a */
    public static final C29987e f122462a = new C29987e();

    private C29987e() {
    }

    /* JADX INFO: renamed from: a */
    public static final void m91714a(TextView view, TextResource textResource) {
        CharSequence charSequenceResolve;
        AbstractC22676k.m65750j(view, "view");
        if (textResource != null) {
            Context context = view.getContext();
            AbstractC22676k.m65749i(context, "getContext(...)");
            charSequenceResolve = textResource.resolve(context);
        } else {
            charSequenceResolve = null;
        }
        view.setText(charSequenceResolve);
    }
}
