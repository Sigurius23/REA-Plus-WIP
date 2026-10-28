package io.getstream.chat.android.p226ui.common.utils;

import android.content.Context;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.C19470R;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;", "", "formatChannelName", "", "channel", "Lio/getstream/chat/android/models/Channel;", "currentUser", "Lio/getstream/chat/android/models/User;", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelNameFormatter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;", "", "<init>", "()V", "defaultFormatter", "Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;", "context", "Landroid/content/Context;", "fallback", "", "maxMembers", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ ChannelNameFormatter defaultFormatter$default(Companion companion, Context context, int i13, int i14, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                i13 = C19470R.string.stream_ui_channel_list_untitled_channel;
            }
            if ((i15 & 4) != 0) {
                i14 = 2;
            }
            return companion.defaultFormatter(context, i13, i14);
        }

        public final ChannelNameFormatter defaultFormatter(Context context) {
            AbstractC22676k.m65750j(context, "context");
            return defaultFormatter$default(this, context, 0, 0, 6, null);
        }

        public final ChannelNameFormatter defaultFormatter(Context context, int i13) {
            AbstractC22676k.m65750j(context, "context");
            return defaultFormatter$default(this, context, i13, 0, 4, null);
        }

        public final ChannelNameFormatter defaultFormatter(Context context, int fallback, int maxMembers) {
            AbstractC22676k.m65750j(context, "context");
            return new DefaultChannelNameFormatter(context, fallback, maxMembers);
        }
    }

    String formatChannelName(Channel channel, User currentUser);
}
