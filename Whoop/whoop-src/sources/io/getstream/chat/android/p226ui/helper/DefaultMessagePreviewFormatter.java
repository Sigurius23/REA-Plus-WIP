package io.getstream.chat.android.p226ui.helper;

import android.content.Context;
import android.text.SpannableStringBuilder;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.utils.extensions.ChannelKt;
import io.getstream.chat.android.p226ui.utils.extensions.MessageKt;
import io.getstream.chat.android.p226ui.utils.extensions.StringKt;
import io.getstream.chat.android.p226ui.utils.extensions.UserKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/ui/helper/DefaultMessagePreviewFormatter;", "Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "formatMessagePreview", "", "channel", "Lio/getstream/chat/android/models/Channel;", "message", "Lio/getstream/chat/android/models/Message;", "currentUser", "Lio/getstream/chat/android/models/User;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class DefaultMessagePreviewFormatter implements MessagePreviewFormatter {
    private final Context context;

    public DefaultMessagePreviewFormatter(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
    }

    @Override // io.getstream.chat.android.p226ui.helper.MessagePreviewFormatter
    public final CharSequence formatMessagePreview(Channel channel, Message message, User currentUser) throws IOException {
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC22676k.m65750j(message, "message");
        String translatedText = MessageKt.getTranslatedText(message, currentUser);
        if (MessageUtils.isSystem(message)) {
            return new SpannableStringBuilder(StringKt.italicize$default(AbstractC39414r.m125869O0(translatedText).toString(), null, false, 3, null));
        }
        String senderDisplayName = MessageKt.getSenderDisplayName(message, this.context, ChannelKt.isDirectMessaging(channel));
        if (!MessageUtils.hasAudioRecording(message)) {
            String strAsMention = currentUser != null ? UserKt.asMention(currentUser, this.context) : null;
            List listM118959K = AbstractC37056f.m118959K(senderDisplayName, StringKt.bold(AbstractC39414r.m125869O0(translatedText).toString(), strAsMention != null ? AbstractC37056f.m118958J(strAsMention) : null, true), MessageKt.getAttachmentsText(message));
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM118959K) {
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null && charSequence.length() != 0) {
                    arrayList.add(obj);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            AbstractC25265s.m74109M0(arrayList, spannableStringBuilder, ": ", null, null, null, 124);
            return spannableStringBuilder;
        }
        String string = this.context.getString(C19469R.string.stream_ui_message_audio_reply_info);
        AbstractC22676k.m65749i(string, "getString(...)");
        List listM118959K2 = AbstractC37056f.m118959K(senderDisplayName, StringKt.italicize$default(string, null, false, 3, null));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listM118959K2) {
            CharSequence charSequence2 = (CharSequence) obj2;
            if (charSequence2 != null && charSequence2.length() != 0) {
                arrayList2.add(obj2);
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        AbstractC25265s.m74109M0(arrayList2, spannableStringBuilder2, ": ", null, null, null, 124);
        return spannableStringBuilder2;
    }
}
