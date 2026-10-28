package o52;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import k52.AbstractC22207c;
import k52.AbstractC22210f;
import m52.AbstractC25089i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o52.a0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, m65681d2 = {"Lo52/a0;", "Lhj0/m;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lm52/i;", "<set-?>", "x", "Lcom/whoop/ui/b;", "E", "()Lm52/i;", "F", "(Lm52/i;)V", "binding", "y", "a", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27542a0 extends AbstractC17354m {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "RealTimeSleepFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: z */
    static final /* synthetic */ InterfaceC21493z[] f110876z = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C27542a0.class, "binding", "getBinding()Lcom/whoop/realtime/databinding/FragmentRealtimeSleepBinding;", 0))};

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: E */
    public static final int f110874E = AbstractC17354m.$stable | C10462b.f31640z;

    /* JADX INFO: renamed from: o52.a0$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, m65681d2 = {"Lo52/a0$a;", "", "<init>", "()V", "Lo52/a0;", "b", "()Lo52/a0;", "a", "", "ARG_FOR_SLEEP", "Ljava/lang/String;", "ARG_FOR_NAP", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C27542a0 m83100a() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("ForNap", true);
            C27542a0 c27542a0 = new C27542a0();
            c27542a0.setArguments(bundle);
            return c27542a0;
        }

        /* JADX INFO: renamed from: b */
        public final C27542a0 m83101b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("ForSleep", true);
            C27542a0 c27542a0 = new C27542a0();
            c27542a0.setArguments(bundle);
            return c27542a0;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: E */
    private final AbstractC25089i m83098E() {
        return (AbstractC25089i) this.binding.getValue(this, f110876z[0]);
    }

    /* JADX INFO: renamed from: F */
    private final void m83099F(AbstractC25089i abstractC25089i) {
        this.binding.setValue(this, f110876z[0], abstractC25089i);
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC25089i abstractC25089iM73586c = AbstractC25089i.m73586c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC25089iM73586c, "inflate(...)");
        m83099F(abstractC25089iM73586c);
        View root = m83098E().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.getBoolean("ForSleep")) {
                m83098E().f98331a.setImageResource(AbstractC22207c.f86270k);
                m83098E().f98332b.setText(getString(AbstractC22210f.f86508q));
            } else if (arguments.getBoolean("ForNap")) {
                m83098E().f98331a.setImageResource(AbstractC22207c.f86270k);
                m83098E().f98332b.setText(getString(AbstractC22210f.f86505p));
            }
        }
    }
}
