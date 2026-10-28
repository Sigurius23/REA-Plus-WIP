package io.getstream.chat.android.p226ui.common.utils.extensions;

import android.content.Context;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.p226ui.common.C19470R;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m65681d2 = {"getSubtitle", "", "Lio/getstream/chat/android/models/Poll;", "context", "Landroid/content/Context;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollKt {
    @InternalStreamChatApi
    public static final String getSubtitle(Poll poll, Context context) {
        AbstractC22676k.m65750j(poll, "<this>");
        AbstractC22676k.m65750j(context, "context");
        if (poll.getClosed()) {
            String string = context.getString(C19470R.string.stream_ui_poll_description_closed);
            AbstractC22676k.m65749i(string, "getString(...)");
            return string;
        }
        Integer maxVotesAllowed = poll.getMaxVotesAllowed();
        Integer numValueOf = maxVotesAllowed != null ? Integer.valueOf(Math.min(maxVotesAllowed.intValue(), poll.getOptions().size())) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            String string2 = context.getString(C19470R.string.stream_ui_poll_description_single_answer);
            AbstractC22676k.m65749i(string2, "getString(...)");
            return string2;
        }
        if (numValueOf == null) {
            String string3 = context.getString(C19470R.string.stream_ui_poll_description_unlimited_answers);
            AbstractC22676k.m65749i(string3, "getString(...)");
            return string3;
        }
        String string4 = context.getString(C19470R.string.stream_ui_poll_description_multiple_answers, numValueOf);
        AbstractC22676k.m65749i(string4, "getString(...)");
        return string4;
    }
}
