package io.getstream.chat.android.p226ui.feature.channels;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.C1271a;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.databinding.StreamUiFragmentContainerBinding;
import io.getstream.chat.android.p226ui.utils.extensions.ViewKt;
import l83.C23454a0;
import p000.AbstractC30802r;
import p314m.AbstractActivityC24852m;
import p708hb2.C17095c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;", "Lm/m;", "<init>", "()V", "Ll83/a0;", "setupEdgeToEdge", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;", "createChannelListFragment", "()Lio/getstream/chat/android/ui/feature/channels/ChannelListFragment;", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class ChannelListActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private StreamUiFragmentContainerBinding binding;

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\tH\u0007¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "activityClass", "Ljava/lang/Class;", "Lio/getstream/chat/android/ui/feature/channels/ChannelListActivity;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Intent createIntent$default(Companion companion, Context context, Class cls, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                cls = ChannelListActivity.class;
            }
            return companion.createIntent(context, cls);
        }

        public final Intent createIntent(Context context) {
            AbstractC22676k.m65750j(context, "context");
            return createIntent(context, ChannelListActivity.class);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Intent createIntent(Context context, Class<? extends ChannelListActivity> activityClass) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(activityClass, "activityClass");
            return new Intent(context, activityClass);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 createChannelListFragment$lambda$0(ChannelListActivity channelListActivity, ChannelListFragment.Builder newInstance) {
        AbstractC22676k.m65750j(newInstance, "$this$newInstance");
        newInstance.setFragment(new ChannelListFragment());
        newInstance.customTheme(C19469R.style.StreamUiTheme_ChannelListScreen);
        newInstance.showSearch(true);
        newInstance.showHeader(true);
        newInstance.headerTitle(channelListActivity.getString(C19469R.string.stream_ui_channel_list_header_connected));
        return C23454a0.f92919a;
    }

    public static final Intent createIntent(Context context) {
        return INSTANCE.createIntent(context);
    }

    private final void setupEdgeToEdge() {
        StreamUiFragmentContainerBinding streamUiFragmentContainerBinding = this.binding;
        if (streamUiFragmentContainerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout root = streamUiFragmentContainerBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ViewKt.applyEdgeToEdgePadding(root, 7);
    }

    public final ChannelListFragment createChannelListFragment() {
        return ChannelListFragment.INSTANCE.newInstance(new C17095c(this, 23));
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!ChatClient.INSTANCE.isInitialized()) {
            finish();
            return;
        }
        StreamUiFragmentContainerBinding streamUiFragmentContainerBindingInflate = StreamUiFragmentContainerBinding.inflate(getLayoutInflater(), null, false);
        this.binding = streamUiFragmentContainerBindingInflate;
        setContentView(streamUiFragmentContainerBindingInflate.getRoot());
        setupEdgeToEdge();
        if (savedInstanceState == null) {
            AbstractC1329o1 supportFragmentManager = getSupportFragmentManager();
            C1271a c1271aM94758g = AbstractC30802r.m94758g(supportFragmentManager, supportFragmentManager);
            c1271aM94758g.m4068e(C19469R.id.container, createChannelListFragment(), null);
            c1271aM94758g.m4046j();
        }
    }

    public static final Intent createIntent(Context context, Class<? extends ChannelListActivity> cls) {
        return INSTANCE.createIntent(context, cls);
    }
}
