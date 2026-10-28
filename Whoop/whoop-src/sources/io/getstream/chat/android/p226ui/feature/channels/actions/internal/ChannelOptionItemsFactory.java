package io.getstream.chat.android.p226ui.feature.channels.actions.internal;

import android.content.Context;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.p226ui.common.state.channels.actions.ChannelAction;
import io.getstream.chat.android.p226ui.feature.channels.actions.ChannelActionsDialogViewStyle;
import java.util.List;
import java.util.Set;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000 \f2\u00020\u0001:\u0001\fJ,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory;", "", "createChannelOptionItems", "", "Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;", "selectedChannel", "Lio/getstream/chat/android/models/Channel;", "ownCapabilities", "", "", "style", "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelOptionItemsFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory$Companion;", "", "<init>", "()V", "defaultFactory", "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelOptionItemsFactory;", "context", "Landroid/content/Context;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ChannelOptionItemsFactory defaultFactory(Context context) {
            AbstractC22676k.m65750j(context, "context");
            return new DefaultChannelOptionItemsFactory(context);
        }
    }

    List<ChannelAction> createChannelOptionItems(Channel selectedChannel, Set<String> ownCapabilities, ChannelActionsDialogViewStyle style);
}
