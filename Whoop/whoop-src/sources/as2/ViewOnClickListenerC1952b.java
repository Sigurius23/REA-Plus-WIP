package as2;

import android.os.SystemClock;
import android.view.View;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: as2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Las2/b;", "Landroid/view/View$OnClickListener;", "Lkotlin/Function1;", "Landroid/view/View;", "Ll83/a0;", "onSafeClick", "<init>", "(Lkotlin/jvm/functions/Function1;)V", ProfileAnalyticsKt.VIEW, "onClick", "(Landroid/view/View;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lkotlin/jvm/functions/Function1;", "", "x", "J", "lastTimeClicked", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class ViewOnClickListenerC1952b implements View.OnClickListener {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Function1 onSafeClick;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private long lastTimeClicked;

    public ViewOnClickListenerC1952b(Function1 onSafeClick) {
        AbstractC22676k.m65750j(onSafeClick, "onSafeClick");
        this.onSafeClick = onSafeClick;
        this.lastTimeClicked = -300L;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC22676k.m65750j(view, "view");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.lastTimeClicked < 300) {
            return;
        }
        this.lastTimeClicked = jElapsedRealtime;
        this.onSafeClick.invoke(view);
    }
}
