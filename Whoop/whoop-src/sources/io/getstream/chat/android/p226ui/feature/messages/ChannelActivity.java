package io.getstream.chat.android.p226ui.feature.messages;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.C1271a;
import ht2.C17632d;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.databinding.StreamUiFragmentContainerBinding;
import io.getstream.chat.android.p226ui.utils.extensions.ViewKt;
import l83.C23454a0;
import p000.AbstractC30802r;
import p314m.AbstractActivityC24852m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;", "Lm/m;", "<init>", "()V", "Ll83/a0;", "setupEdgeToEdge", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "cid", "messageId", "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;", "createChannelFragment", "(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentContainerBinding;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class ChannelActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final String EXTRA_CID = "extra_cid";
    private static final String EXTRA_MESSAGE_ID = "extra_message_id";
    private StreamUiFragmentContainerBinding binding;

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/ChannelActivity$Companion;", "", "<init>", "()V", "EXTRA_CID", "", "EXTRA_MESSAGE_ID", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "cid", "messageId", "activityClass", "Ljava/lang/Class;", "Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Intent createIntent$default(Companion companion, Context context, String str, String str2, Class cls, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                str2 = null;
            }
            if ((i13 & 8) != 0) {
                cls = ChannelActivity.class;
            }
            return companion.createIntent(context, str, str2, cls);
        }

        public final Intent createIntent(Context context, String cid) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(cid, "cid");
            return createIntent$default(this, context, cid, null, null, 12, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Intent createIntent(Context context, String cid, String str) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(cid, "cid");
            return createIntent$default(this, context, cid, str, null, 8, null);
        }

        public final Intent createIntent(Context context, String cid, String messageId, Class<? extends ChannelActivity> activityClass) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(cid, "cid");
            AbstractC22676k.m65750j(activityClass, "activityClass");
            Intent intent = new Intent(context, activityClass);
            intent.putExtra(ChannelActivity.EXTRA_CID, cid);
            intent.putExtra(ChannelActivity.EXTRA_MESSAGE_ID, messageId);
            return intent;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 createChannelFragment$lambda$1(String str, ChannelFragment.Builder newInstance) {
        AbstractC22676k.m65750j(newInstance, "$this$newInstance");
        newInstance.setFragment(new ChannelFragment());
        newInstance.showHeader(true);
        newInstance.messageId(str);
        return C23454a0.f92919a;
    }

    public static final Intent createIntent(Context context, String str) {
        return INSTANCE.createIntent(context, str);
    }

    private final void setupEdgeToEdge() {
        StreamUiFragmentContainerBinding streamUiFragmentContainerBinding = this.binding;
        if (streamUiFragmentContainerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout root = streamUiFragmentContainerBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ViewKt.applyEdgeToEdgePadding(root, 15);
    }

    public final ChannelFragment createChannelFragment(String cid, String messageId) {
        AbstractC22676k.m65750j(cid, "cid");
        return ChannelFragment.INSTANCE.newInstance(cid, new C17632d(messageId, 10));
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
            String stringExtra = getIntent().getStringExtra(EXTRA_CID);
            if (stringExtra == null) {
                throw new IllegalArgumentException("Channel cid must not be null");
            }
            String stringExtra2 = getIntent().getStringExtra(EXTRA_MESSAGE_ID);
            AbstractC1329o1 supportFragmentManager = getSupportFragmentManager();
            C1271a c1271aM94758g = AbstractC30802r.m94758g(supportFragmentManager, supportFragmentManager);
            c1271aM94758g.m4068e(C19469R.id.container, createChannelFragment(stringExtra, stringExtra2), null);
            c1271aM94758g.m4046j();
        }
    }

    public static final Intent createIntent(Context context, String str, String str2) {
        return INSTANCE.createIntent(context, str, str2);
    }

    public static final Intent createIntent(Context context, String str, String str2, Class<? extends ChannelActivity> cls) {
        return INSTANCE.createIntent(context, str, str2, cls);
    }
}
