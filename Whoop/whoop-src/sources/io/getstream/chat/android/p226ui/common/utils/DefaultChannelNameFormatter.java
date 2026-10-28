package io.getstream.chat.android.p226ui.common.utils;

import android.content.Context;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.utils.extensions.ChannelKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/utils/DefaultChannelNameFormatter;", "Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;", "context", "Landroid/content/Context;", "fallback", "", "maxMembers", "<init>", "(Landroid/content/Context;II)V", "formatChannelName", "", "channel", "Lio/getstream/chat/android/models/Channel;", "currentUser", "Lio/getstream/chat/android/models/User;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class DefaultChannelNameFormatter implements ChannelNameFormatter {
    private final Context context;
    private final int fallback;
    private final int maxMembers;

    public DefaultChannelNameFormatter(Context context, int i13, int i14) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
        this.fallback = i13;
        this.maxMembers = i14;
    }

    @Override // io.getstream.chat.android.p226ui.common.utils.ChannelNameFormatter
    public final String formatChannelName(Channel channel, User currentUser) {
        AbstractC22676k.m65750j(channel, "channel");
        return ChannelKt.getDisplayName(channel, this.context, currentUser, this.fallback, this.maxMembers);
    }
}
