package io.getstream.chat.android.p226ui.utils.extensions;

import android.content.Context;
import android.text.SpannableString;
import c93.InterfaceC4339a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.ReactionGroup;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.helper.CurrentUserProvider;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0003\u001a\u0011\u0010\u000b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0011\u0010\f\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\f\u0010\u0003\u001a'\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001e\u001a\u00020\u0010*\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010\u001e\u001a\u00020\u0010*\u00020\u00002\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0 H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\"\u001a\u001d\u0010\u001e\u001a\u00020\u0010*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b\u001e\u0010%\u001a%\u0010'\u001a\u00020\u0010*\u00020\u00002\u0006\u0010&\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b'\u0010(\"\u001b\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b+\u0010,\"!\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020/0.*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b0\u00101\"!\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002030.*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b4\u00101\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00066"}, m65681d2 = {"Lio/getstream/chat/android/models/Message;", "", "hasNoAttachments", "(Lio/getstream/chat/android/models/Message;)Z", "isGiphyNotEphemeral", "Ljava/util/Date;", "getCreatedAtOrNull", "(Lio/getstream/chat/android/models/Message;)Ljava/util/Date;", "getUpdatedAtOrNull", "getCreatedAtOrThrow", "hasSingleReaction", "hasReactions", "hasText", "Landroid/content/Context;", "context", "isDirectMessaging", "", "getSenderDisplayName", "(Lio/getstream/chat/android/models/Message;Landroid/content/Context;Z)Ljava/lang/String;", "getPinnedText", "(Lio/getstream/chat/android/models/Message;Landroid/content/Context;)Ljava/lang/String;", "Landroid/text/SpannableString;", "getAttachmentsText", "(Lio/getstream/chat/android/models/Message;)Landroid/text/SpannableString;", "Lio/getstream/chat/android/models/Attachment;", "attachment", "getAttachmentPrefix", "(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;", "Lio/getstream/chat/android/models/User;", "currentUser", "getTranslatedText", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Ljava/lang/String;", "Lkotlin/Function0;", "getCurrentUser", "(Lio/getstream/chat/android/models/Message;Lc93/a;)Ljava/lang/String;", "Lio/getstream/chat/android/ui/helper/CurrentUserProvider;", "currentUserProvider", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/helper/CurrentUserProvider;)Ljava/lang/String;", "showOriginalText", "getToggleableTranslatedText", "(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/ui/helper/CurrentUserProvider;)Ljava/lang/String;", "", "Lio/getstream/chat/android/models/Reaction;", "getSupportedLatestReactions", "(Lio/getstream/chat/android/models/Message;)Ljava/util/List;", "supportedLatestReactions", "", "Lio/getstream/chat/android/models/ReactionGroup;", "getSupportedReactionGroups", "(Lio/getstream/chat/android/models/Message;)Ljava/util/Map;", "supportedReactionGroups", "", "getSupportedReactionCounts", "supportedReactionCounts", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageKt {
    private static final String getAttachmentPrefix(Attachment attachment) {
        if (AbstractC22676k.m65745e(attachment.getType(), "giphy")) {
            return "/giphy";
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    public static final SpannableString getAttachmentsText(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        List<Attachment> attachments = message.getAttachments();
        if (attachments.isEmpty()) {
            attachments = null;
        }
        if (attachments != null) {
            ArrayList arrayList = new ArrayList();
            for (Attachment attachment : attachments) {
                String title = attachment.getTitle();
                if (title == null) {
                    title = attachment.getName();
                    if (title == null) {
                        title = attachment.getFallback();
                    }
                } else {
                    String attachmentPrefix = getAttachmentPrefix(attachment);
                    if (attachmentPrefix != null) {
                        title = AbstractC18489d0.m53370k(attachmentPrefix, " ", title);
                    }
                    if (title == null) {
                        title = attachment.getName();
                        if (title == null) {
                            title = attachment.getFallback();
                        }
                    }
                }
                if (title != null) {
                    arrayList.add(title);
                }
            }
            String strM74110N0 = AbstractC25265s.m74110N0(arrayList, null, null, null, null, 63);
            if (strM74110N0 != null) {
                return StringKt.italicize$default(strM74110N0, null, false, 3, null);
            }
        }
        return null;
    }

    public static final Date getCreatedAtOrNull(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        Date createdLocallyAt = message.getCreatedLocallyAt();
        return createdLocallyAt == null ? message.getCreatedAt() : createdLocallyAt;
    }

    public static final Date getCreatedAtOrThrow(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        Date createdAtOrNull = getCreatedAtOrNull(message);
        if (createdAtOrNull != null) {
            return createdAtOrNull;
        }
        throw new IllegalStateException("a message needs to have a non null value for either createdAt or createdLocallyAt");
    }

    public static final String getPinnedText(Message message, Context context) {
        AbstractC22676k.m65750j(message, "<this>");
        AbstractC22676k.m65750j(context, "context");
        User pinnedBy = message.getPinnedBy();
        if (pinnedBy == null) {
            return null;
        }
        String string = UserKt.isCurrentUser(pinnedBy) ? context.getString(C19469R.string.stream_ui_message_list_pinned_message_you) : pinnedBy.getName();
        AbstractC22676k.m65747g(string);
        return context.getString(C19469R.string.stream_ui_message_list_pinned_message, string);
    }

    public static final String getSenderDisplayName(Message message, Context context, boolean z4) {
        AbstractC22676k.m65750j(message, "<this>");
        AbstractC22676k.m65750j(context, "context");
        if (UserKt.isCurrentUser(message.getUser())) {
            return context.getString(C19469R.string.stream_ui_channel_list_you);
        }
        if (z4) {
            return null;
        }
        return UserKt.asMention(message.getUser(), context);
    }

    public static /* synthetic */ String getSenderDisplayName$default(Message message, Context context, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return getSenderDisplayName(message, context, z4);
    }

    public static final List<Reaction> getSupportedLatestReactions(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        if (message.getLatestReactions().isEmpty()) {
            return message.getLatestReactions();
        }
        List<Reaction> latestReactions = message.getLatestReactions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : latestReactions) {
            if (ChatUI.getSupportedReactions().m55661x42c3070e(((Reaction) obj).getType())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Map<String, Integer> getSupportedReactionCounts(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        if (message.getReactionCounts().isEmpty()) {
            return message.getReactionCounts();
        }
        Map<String, Integer> reactionCounts = message.getReactionCounts();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Integer> entry : reactionCounts.entrySet()) {
            if (ChatUI.getSupportedReactions().m55661x42c3070e(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final Map<String, ReactionGroup> getSupportedReactionGroups(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        Map<String, ReactionGroup> reactionGroups = message.getReactionGroups();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ReactionGroup> entry : reactionGroups.entrySet()) {
            if (ChatUI.getSupportedReactions().m55661x42c3070e(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final String getToggleableTranslatedText(Message message, boolean z4, CurrentUserProvider currentUserProvider) {
        String language;
        AbstractC22676k.m65750j(message, "<this>");
        AbstractC22676k.m65750j(currentUserProvider, "currentUserProvider");
        if (ChatUI.getAutoTranslationEnabled() && !z4) {
            User currentUser = currentUserProvider.getCurrentUser();
            if (currentUser != null && (language = currentUser.getLanguage()) != null) {
                String translation = message.getTranslation(language);
                if (translation.length() == 0) {
                    translation = message.getText();
                }
                if (translation != null) {
                    return translation;
                }
            }
            return message.getText();
        }
        return message.getText();
    }

    public static /* synthetic */ String getToggleableTranslatedText$default(Message message, boolean z4, CurrentUserProvider currentUserProvider, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            currentUserProvider = ChatUI.getCurrentUserProvider();
        }
        return getToggleableTranslatedText(message, z4, currentUserProvider);
    }

    public static final String getTranslatedText(Message message, InterfaceC4339a getCurrentUser) {
        String language;
        AbstractC22676k.m65750j(message, "<this>");
        AbstractC22676k.m65750j(getCurrentUser, "getCurrentUser");
        if (!ChatUI.getAutoTranslationEnabled()) {
            return message.getText();
        }
        User user = (User) getCurrentUser.invoke();
        if (user != null && (language = user.getLanguage()) != null) {
            String translation = message.getTranslation(language);
            if (translation.length() == 0) {
                translation = message.getText();
            }
            if (translation != null) {
                return translation;
            }
        }
        return message.getText();
    }

    public static /* synthetic */ String getTranslatedText$default(Message message, CurrentUserProvider currentUserProvider, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            currentUserProvider = ChatUI.getCurrentUserProvider();
        }
        return getTranslatedText(message, currentUserProvider);
    }

    public static final Date getUpdatedAtOrNull(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        Date updatedAt = message.getUpdatedAt();
        return updatedAt == null ? message.getUpdatedLocallyAt() : updatedAt;
    }

    public static final boolean hasNoAttachments(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return message.getAttachments().isEmpty();
    }

    public static final boolean hasReactions(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return !getSupportedReactionGroups(message).isEmpty();
    }

    public static final boolean hasSingleReaction(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return getSupportedReactionGroups(message).size() == 1;
    }

    public static final boolean hasText(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return message.getText().length() > 0;
    }

    public static final boolean isGiphyNotEphemeral(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return !MessageUtils.isEphemeral(message) && AbstractC22676k.m65745e(message.getCommand(), "giphy");
    }

    public static final String getTranslatedText(Message message, User user) {
        String language;
        AbstractC22676k.m65750j(message, "<this>");
        if (ChatUI.getAutoTranslationEnabled()) {
            if (user != null && (language = user.getLanguage()) != null) {
                String translation = message.getTranslation(language);
                if (translation.length() == 0) {
                    translation = message.getText();
                }
                if (translation != null) {
                    return translation;
                }
            }
            return message.getText();
        }
        return message.getText();
    }

    public static final String getTranslatedText(Message message, CurrentUserProvider currentUserProvider) {
        String language;
        AbstractC22676k.m65750j(message, "<this>");
        AbstractC22676k.m65750j(currentUserProvider, "currentUserProvider");
        if (ChatUI.getAutoTranslationEnabled()) {
            User currentUser = currentUserProvider.getCurrentUser();
            if (currentUser != null && (language = currentUser.getLanguage()) != null) {
                String translation = message.getTranslation(language);
                if (translation.length() == 0) {
                    translation = message.getText();
                }
                if (translation != null) {
                    return translation;
                }
            }
            return message.getText();
        }
        return message.getText();
    }
}
