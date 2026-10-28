package p532ur;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewException;
import java.util.HashMap;
import java.util.Locale;
import p073cq.C11040i;
import p073cq.C11052u;
import p087db.C11856j0;
import p088dc.AbstractC11895b;
import p450r5.ResultReceiverC30930d;
import p559vr.C36297g;
import p559vr.C36299i;
import p593wr.AbstractC37515a;

/* JADX INFO: renamed from: ur.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C35175d implements InterfaceC35173b {

    /* JADX INFO: renamed from: a */
    public final C35178g f149282a;

    /* JADX INFO: renamed from: b */
    public final Handler f149283b = new Handler(Looper.getMainLooper());

    public C35175d(C35178g c35178g) {
        this.f149282a = c35178g;
    }

    /* JADX INFO: renamed from: a */
    public final C11052u m111310a(Activity activity, AbstractC35172a abstractC35172a) {
        C35174c c35174c = (C35174c) abstractC35172a;
        if (c35174c.f149281x) {
            return Tasks.m15640d(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", c35174c.f149280w);
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        C11040i c11040i = new C11040i();
        intent.putExtra("result_receiver", new ResultReceiverC30930d(this.f149283b, c11040i));
        activity.startActivity(intent);
        return c11040i.f34644a;
    }

    /* JADX INFO: renamed from: b */
    public final C11052u m111311b() {
        C35178g c35178g = this.f149282a;
        String str = c35178g.f149292b;
        C11856j0 c11856j0 = C35178g.f149290c;
        c11856j0.m31831q("requestInAppReview (%s)", str);
        C36299i c36299i = c35178g.f149291a;
        if (c36299i != null) {
            C11040i c11040i = new C11040i();
            c36299i.m116021a().post(new C36297g(c36299i, c11040i, c11040i, new C35176e(c35178g, c11040i, c11040i)));
            return c11040i.f34644a;
        }
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", C11856j0.m31817s(c11856j0.f38685x, "Play Store app is either not installed or not the official version", objArr));
        }
        Locale locale = Locale.getDefault();
        HashMap map = AbstractC37515a.f160443a;
        return Tasks.m15639c(new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, !map.containsKey(-1) ? "" : AbstractC11895b.m31997p((String) map.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) AbstractC37515a.f160444b.get(-1), ")")), null, null)));
    }
}
