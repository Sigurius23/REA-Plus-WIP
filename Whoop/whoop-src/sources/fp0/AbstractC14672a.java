package fp0;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fp0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u0012\u001a\u00020\r8\u0014X\u0094D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\r8\u0014X\u0094D¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, m65681d2 = {"Lfp0/a;", "Lhj0/m;", "<init>", "()V", "Ll83/a0;", "F", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Z", "getNewBottomNavVisible", "()Z", "newBottomNavVisible", "x", "E", "setStatusBarColor", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14672a extends AbstractC17354m {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final boolean newBottomNavVisible = true;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final boolean setStatusBarColor = true;

    /* JADX INFO: renamed from: F */
    private final void m41938F() {
        Window window = requireActivity().getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(AbstractC32122c.getColor(requireContext(), R.color.black));
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public boolean getSetStatusBarColor() {
        return this.setStatusBarColor;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (getSetStatusBarColor()) {
            m41938F();
        }
    }
}
