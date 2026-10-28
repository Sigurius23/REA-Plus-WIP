package io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMessageFootnoteBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiMessageThreadsFootnoteBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import java.util.List;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25265s;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001aJ3\u0010\u001f\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\u001aJ\u001d\u0010#\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0011¢\u0006\u0004\b%\u0010\u001aJ\u0017\u0010*\u001a\u00020\u00112\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)J'\u0010.\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010+2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0011¢\u0006\u0004\b0\u0010\u001aJ!\u00104\u001a\u00020\u00112\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001101¢\u0006\u0004\b4\u00105J!\u00106\u001a\u00020\u00112\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001101¢\u0006\u0004\b6\u00105J1\u0010:\u001a\u00020\u00112\u0006\u00107\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u00108\u001a\u00020\f2\b\b\u0002\u00109\u001a\u00020\f¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0011¢\u0006\u0004\b<\u0010\u001aR\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0017\u0010F\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bF\u0010E\u001a\u0004\bG\u0010H¨\u0006I"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isMine", "", "Lio/getstream/chat/android/models/User;", "threadParticipants", "Ll83/a0;", "setupUserAvatars", "(ZLjava/util/List;)V", "Ll83/k;", "getTwoLastUsers", "(Ljava/util/List;)Ll83/k;", "applyGravity", "(Z)V", "showSimpleFootnote", "()V", "hideSimpleFootnote", "replyCount", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "style", "showThreadRepliesFootnote", "(ZILjava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V", "hideReadCounter", "count", "showReadCounter", "(ILio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V", "hideStatusIndicator", "Landroid/graphics/drawable/Drawable;", "drawableRes", "showStatusIndicator$stream_chat_android_ui_components_release", "(Landroid/graphics/drawable/Drawable;)V", "showStatusIndicator", "", "time", "editedAt", "showTime", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V", "hideTimeLabel", "Lkotlin/Function1;", "Landroid/view/View;", "onClick", "setOnThreadClickListener", "(Lkotlin/jvm/functions/Function1;)V", "setOnTranslatedLabelClickListener", "languageName", "showOriginalTranslationEnabled", "showOriginalText", "showTranslatedLabel", "(Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;ZZ)V", "hideTranslatedLabel", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;", "footnote", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageFootnoteBinding;", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;", "threadsFootnote", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;", "Landroid/widget/TextView;", "translatedLabel", "Landroid/widget/TextView;", "footerTextLabel", "getFooterTextLabel", "()Landroid/widget/TextView;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FootnoteView extends LinearLayoutCompat {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f74615w = 0;
    private final TextView footerTextLabel;
    private final StreamUiItemMessageFootnoteBinding footnote;
    private final StreamUiMessageThreadsFootnoteBinding threadsFootnote;
    private final TextView translatedLabel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FootnoteView(Context context) {
        super(ContextKt.createStreamThemeWrapper(context), null);
        AbstractC22676k.m65750j(context, "context");
        StreamUiItemMessageFootnoteBinding streamUiItemMessageFootnoteBindingInflate = StreamUiItemMessageFootnoteBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), null, false);
        addView(streamUiItemMessageFootnoteBindingInflate.getRoot());
        this.footnote = streamUiItemMessageFootnoteBindingInflate;
        StreamUiMessageThreadsFootnoteBinding streamUiMessageThreadsFootnoteBindingInflate = StreamUiMessageThreadsFootnoteBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), null, false);
        addView(streamUiMessageThreadsFootnoteBindingInflate.getRoot());
        this.threadsFootnote = streamUiMessageThreadsFootnoteBindingInflate;
        TextView textView = new TextView(getContext());
        textView.setId(View.generateViewId());
        addView(textView);
        this.translatedLabel = textView;
        TextView messageFooterLabel = streamUiItemMessageFootnoteBindingInflate.messageFooterLabel;
        AbstractC22676k.m65749i(messageFooterLabel, "messageFooterLabel");
        this.footerTextLabel = messageFooterLabel;
        setOrientation(1);
        LinearLayoutCompat root = streamUiItemMessageFootnoteBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        root.setVisibility(8);
        ConstraintLayout root2 = streamUiMessageThreadsFootnoteBindingInflate.getRoot();
        AbstractC22676k.m65749i(root2, "getRoot(...)");
        root2.setVisibility(8);
        textView.setVisibility(8);
        TextView editedLabel = streamUiItemMessageFootnoteBindingInflate.editedLabel;
        AbstractC22676k.m65749i(editedLabel, "editedLabel");
        editedLabel.setVisibility(8);
    }

    private final C23465k getTwoLastUsers(List<User> threadParticipants) {
        if (threadParticipants.isEmpty()) {
            return new C23465k(null, null);
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(threadParticipants);
        if (setM74103I1.size() <= 1) {
            return new C23465k(AbstractC25265s.m74094E0(setM74103I1), null);
        }
        Set set = setM74103I1;
        return new C23465k(AbstractC25265s.m74094E0(set), AbstractC25265s.m74088B0(set, 1));
    }

    private final void setupUserAvatars(boolean isMine, List<User> threadParticipants) {
        StreamUiMessageThreadsFootnoteBinding streamUiMessageThreadsFootnoteBinding = this.threadsFootnote;
        UserAvatarView firstTheirUserImage = streamUiMessageThreadsFootnoteBinding.firstTheirUserImage;
        AbstractC22676k.m65749i(firstTheirUserImage, "firstTheirUserImage");
        firstTheirUserImage.setVisibility(!isMine ? 0 : 8);
        UserAvatarView secondTheirUserImage = streamUiMessageThreadsFootnoteBinding.secondTheirUserImage;
        AbstractC22676k.m65749i(secondTheirUserImage, "secondTheirUserImage");
        secondTheirUserImage.setVisibility(!isMine ? 0 : 8);
        UserAvatarView firstMineUserImage = streamUiMessageThreadsFootnoteBinding.firstMineUserImage;
        AbstractC22676k.m65749i(firstMineUserImage, "firstMineUserImage");
        firstMineUserImage.setVisibility(isMine ? 0 : 8);
        UserAvatarView secondMineUserImage = streamUiMessageThreadsFootnoteBinding.secondMineUserImage;
        AbstractC22676k.m65749i(secondMineUserImage, "secondMineUserImage");
        secondMineUserImage.setVisibility(isMine ? 0 : 8);
        C23465k twoLastUsers = getTwoLastUsers(threadParticipants);
        User user = (User) twoLastUsers.f92937w;
        User user2 = (User) twoLastUsers.f92938x;
        UserAvatarView userAvatarView = isMine ? streamUiMessageThreadsFootnoteBinding.firstMineUserImage : streamUiMessageThreadsFootnoteBinding.firstTheirUserImage;
        AbstractC22676k.m65747g(userAvatarView);
        setupUserAvatars$applyUser(user, userAvatarView);
        UserAvatarView userAvatarView2 = isMine ? streamUiMessageThreadsFootnoteBinding.secondMineUserImage : streamUiMessageThreadsFootnoteBinding.secondTheirUserImage;
        AbstractC22676k.m65747g(userAvatarView2);
        setupUserAvatars$applyUser(user2, userAvatarView2);
    }

    private static final void setupUserAvatars$applyUser(User user, UserAvatarView userAvatarView) {
        if (user != null) {
            UserAvatarView.setUser$default(userAvatarView, user, false, 2, null);
        } else {
            userAvatarView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTime$lambda$12(String str, FootnoteView footnoteView, View view) {
        if (str != null) {
            TextView editedLabel = footnoteView.footnote.editedLabel;
            AbstractC22676k.m65749i(editedLabel, "editedLabel");
            TextView editedLabel2 = footnoteView.footnote.editedLabel;
            AbstractC22676k.m65749i(editedLabel2, "editedLabel");
            editedLabel.setVisibility(!(editedLabel2.getVisibility() == 0) ? 0 : 8);
            TextView editedInfo = footnoteView.footnote.editedInfo;
            AbstractC22676k.m65749i(editedInfo, "editedInfo");
            TextView editedInfo2 = footnoteView.footnote.editedInfo;
            AbstractC22676k.m65749i(editedInfo2, "editedInfo");
            editedInfo.setVisibility(editedInfo2.getVisibility() == 0 ? 8 : 0);
            footnoteView.footnote.editedInfo.invalidate();
        }
    }

    public static /* synthetic */ void showTranslatedLabel$default(FootnoteView footnoteView, String str, MessageListItemStyle messageListItemStyle, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        footnoteView.showTranslatedLabel(str, messageListItemStyle, z4, z13);
    }

    public final void applyGravity(boolean isMine) {
        LinearLayoutCompat messageFooterContainer = this.footnote.messageFooterContainer;
        AbstractC22676k.m65749i(messageFooterContainer, "messageFooterContainer");
        ViewGroup.LayoutParams layoutParams = messageFooterContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        setGravity(isMine ? 8388613 : 8388611);
        messageFooterContainer.setLayoutParams(layoutParams);
        LinearLayoutCompat messageFooterContainerInner = this.footnote.messageFooterContainerInner;
        AbstractC22676k.m65749i(messageFooterContainerInner, "messageFooterContainerInner");
        ViewGroup.LayoutParams layoutParams2 = messageFooterContainerInner.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        setGravity(isMine ? 8388613 : 8388611);
        messageFooterContainerInner.setLayoutParams(layoutParams2);
        ConstraintLayout root = this.threadsFootnote.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams3 = root.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        setGravity(isMine ? 8388613 : 8388611);
        root.setLayoutParams(layoutParams3);
        TextView textView = this.translatedLabel;
        ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        setGravity(isMine ? 8388613 : 8388611);
        textView.setLayoutParams(layoutParams4);
    }

    public final TextView getFooterTextLabel() {
        return this.footerTextLabel;
    }

    public final void hideReadCounter() {
        TextView readCount = this.footnote.readCount;
        AbstractC22676k.m65749i(readCount, "readCount");
        readCount.setVisibility(8);
    }

    public final void hideSimpleFootnote() {
        LinearLayoutCompat root = this.footnote.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        root.setVisibility(8);
        ConstraintLayout root2 = this.threadsFootnote.getRoot();
        AbstractC22676k.m65749i(root2, "getRoot(...)");
        root2.setVisibility(8);
    }

    public final void hideStatusIndicator() {
        ImageView deliveryStatusIcon = this.footnote.deliveryStatusIcon;
        AbstractC22676k.m65749i(deliveryStatusIcon, "deliveryStatusIcon");
        deliveryStatusIcon.setVisibility(8);
    }

    public final void hideTimeLabel() {
        TextView timeView = this.footnote.timeView;
        AbstractC22676k.m65749i(timeView, "timeView");
        timeView.setVisibility(8);
    }

    public final void hideTranslatedLabel() {
        this.translatedLabel.setVisibility(8);
    }

    public final void setOnThreadClickListener(Function1 onClick) {
        AbstractC22676k.m65750j(onClick, "onClick");
        this.threadsFootnote.getRoot().setOnClickListener(new ViewOnClickListenerC19779j(onClick, 0));
    }

    public final void setOnTranslatedLabelClickListener(Function1 onClick) {
        AbstractC22676k.m65750j(onClick, "onClick");
        this.translatedLabel.setOnClickListener(new ViewOnClickListenerC19779j(onClick, 1));
    }

    public final void showReadCounter(int count, MessageListItemStyle style) {
        AbstractC22676k.m65750j(style, "style");
        TextView textView = this.footnote.readCount;
        AbstractC22676k.m65747g(textView);
        textView.setVisibility(0);
        textView.setText(String.valueOf(count));
        TextStyleKt.setTextStyle(textView, style.getTextStyleReadCounter());
    }

    public final void showSimpleFootnote() {
        LinearLayoutCompat root = this.footnote.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        root.setVisibility(0);
        ConstraintLayout root2 = this.threadsFootnote.getRoot();
        AbstractC22676k.m65749i(root2, "getRoot(...)");
        root2.setVisibility(8);
    }

    public final void showStatusIndicator$stream_chat_android_ui_components_release(Drawable drawableRes) {
        AbstractC22676k.m65750j(drawableRes, "drawableRes");
        ImageView deliveryStatusIcon = this.footnote.deliveryStatusIcon;
        AbstractC22676k.m65749i(deliveryStatusIcon, "deliveryStatusIcon");
        deliveryStatusIcon.setVisibility(0);
        this.footnote.deliveryStatusIcon.setImageDrawable(drawableRes);
    }

    public final void showThreadRepliesFootnote(boolean isMine, int replyCount, List<User> threadParticipants, MessageListItemStyle style) {
        AbstractC22676k.m65750j(threadParticipants, "threadParticipants");
        AbstractC22676k.m65750j(style, "style");
        LinearLayoutCompat root = this.footnote.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        root.setVisibility(8);
        StreamUiMessageThreadsFootnoteBinding streamUiMessageThreadsFootnoteBinding = this.threadsFootnote;
        ConstraintLayout root2 = streamUiMessageThreadsFootnoteBinding.getRoot();
        AbstractC22676k.m65749i(root2, "getRoot(...)");
        root2.setVisibility(0);
        AppCompatImageView threadsOrnamentLeft = streamUiMessageThreadsFootnoteBinding.threadsOrnamentLeft;
        AbstractC22676k.m65749i(threadsOrnamentLeft, "threadsOrnamentLeft");
        threadsOrnamentLeft.setVisibility(!isMine ? 0 : 8);
        AppCompatImageView threadsOrnamentRight = streamUiMessageThreadsFootnoteBinding.threadsOrnamentRight;
        AbstractC22676k.m65749i(threadsOrnamentRight, "threadsOrnamentRight");
        threadsOrnamentRight.setVisibility(isMine ? 0 : 8);
        streamUiMessageThreadsFootnoteBinding.threadRepliesButton.setText(replyCount == 0 ? getResources().getString(C19469R.string.stream_ui_message_list_thread_footnote_thread_reply) : getResources().getQuantityString(C19469R.plurals.stream_ui_message_list_thread_footnote, replyCount, Integer.valueOf(replyCount)));
        TextView threadRepliesButton = streamUiMessageThreadsFootnoteBinding.threadRepliesButton;
        AbstractC22676k.m65749i(threadRepliesButton, "threadRepliesButton");
        TextStyleKt.setTextStyle(threadRepliesButton, style.getTextStyleThreadCounter());
        setupUserAvatars(isMine, threadParticipants);
    }

    public final void showTime(String time, String editedAt, MessageListItemStyle style) {
        AbstractC22676k.m65750j(time, "time");
        AbstractC22676k.m65750j(style, "style");
        TextView textView = this.footnote.timeView;
        AbstractC22676k.m65747g(textView);
        textView.setVisibility(0);
        textView.setText(time);
        TextStyleKt.setTextStyle(textView, style.getTextStyleMessageDate());
        TextView editedLabel = this.footnote.editedLabel;
        AbstractC22676k.m65749i(editedLabel, "editedLabel");
        editedLabel.setVisibility(editedAt == null ? 8 : 0);
        this.footnote.editedInfo.setText(getContext().getString(C19469R.string.stream_ui_message_list_footnote_edited_at, editedAt));
        TextView editedInfo = this.footnote.editedInfo;
        AbstractC22676k.m65749i(editedInfo, "editedInfo");
        editedInfo.setVisibility(8);
        this.footnote.getRoot().setOnClickListener(new ViewOnClickListenerC19771b(6, editedAt, this));
    }

    public final void showTranslatedLabel(String languageName, MessageListItemStyle style, boolean showOriginalTranslationEnabled, boolean showOriginalText) {
        AbstractC22676k.m65750j(languageName, "languageName");
        AbstractC22676k.m65750j(style, "style");
        TextView textView = this.translatedLabel;
        textView.setVisibility(0);
        TextStyleKt.setTextStyle(textView, style.getTextStyleMessageLanguage());
        if (!showOriginalTranslationEnabled) {
            this.translatedLabel.setText(getContext().getString(C19469R.string.stream_ui_message_list_translated, languageName));
            return;
        }
        String string = showOriginalText ? getContext().getString(C19469R.string.stream_ui_message_list_show_translation) : AbstractC2875y.m8299l(getContext().getString(C19469R.string.stream_ui_message_list_translated, languageName), getContext().getString(C19469R.string.stream_ui_message_list_show_original));
        AbstractC22676k.m65747g(string);
        this.translatedLabel.setText(string);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FootnoteView(Context context, AttributeSet attributeSet) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet);
        AbstractC22676k.m65750j(context, "context");
        StreamUiItemMessageFootnoteBinding streamUiItemMessageFootnoteBindingInflate = StreamUiItemMessageFootnoteBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), null, false);
        addView(streamUiItemMessageFootnoteBindingInflate.getRoot());
        this.footnote = streamUiItemMessageFootnoteBindingInflate;
        StreamUiMessageThreadsFootnoteBinding streamUiMessageThreadsFootnoteBindingInflate = StreamUiMessageThreadsFootnoteBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), null, false);
        addView(streamUiMessageThreadsFootnoteBindingInflate.getRoot());
        this.threadsFootnote = streamUiMessageThreadsFootnoteBindingInflate;
        TextView textView = new TextView(getContext());
        textView.setId(View.generateViewId());
        addView(textView);
        this.translatedLabel = textView;
        TextView messageFooterLabel = streamUiItemMessageFootnoteBindingInflate.messageFooterLabel;
        AbstractC22676k.m65749i(messageFooterLabel, "messageFooterLabel");
        this.footerTextLabel = messageFooterLabel;
        setOrientation(1);
        LinearLayoutCompat root = streamUiItemMessageFootnoteBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        root.setVisibility(8);
        ConstraintLayout root2 = streamUiMessageThreadsFootnoteBindingInflate.getRoot();
        AbstractC22676k.m65749i(root2, "getRoot(...)");
        root2.setVisibility(8);
        textView.setVisibility(8);
        TextView editedLabel = streamUiItemMessageFootnoteBindingInflate.editedLabel;
        AbstractC22676k.m65749i(editedLabel, "editedLabel");
        editedLabel.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FootnoteView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        StreamUiItemMessageFootnoteBinding streamUiItemMessageFootnoteBindingInflate = StreamUiItemMessageFootnoteBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), null, false);
        addView(streamUiItemMessageFootnoteBindingInflate.getRoot());
        this.footnote = streamUiItemMessageFootnoteBindingInflate;
        StreamUiMessageThreadsFootnoteBinding streamUiMessageThreadsFootnoteBindingInflate = StreamUiMessageThreadsFootnoteBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), null, false);
        addView(streamUiMessageThreadsFootnoteBindingInflate.getRoot());
        this.threadsFootnote = streamUiMessageThreadsFootnoteBindingInflate;
        TextView textView = new TextView(getContext());
        textView.setId(View.generateViewId());
        addView(textView);
        this.translatedLabel = textView;
        TextView messageFooterLabel = streamUiItemMessageFootnoteBindingInflate.messageFooterLabel;
        AbstractC22676k.m65749i(messageFooterLabel, "messageFooterLabel");
        this.footerTextLabel = messageFooterLabel;
        setOrientation(1);
        LinearLayoutCompat root = streamUiItemMessageFootnoteBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        root.setVisibility(8);
        ConstraintLayout root2 = streamUiMessageThreadsFootnoteBindingInflate.getRoot();
        AbstractC22676k.m65749i(root2, "getRoot(...)");
        root2.setVisibility(8);
        textView.setVisibility(8);
        TextView editedLabel = streamUiItemMessageFootnoteBindingInflate.editedLabel;
        AbstractC22676k.m65749i(editedLabel, "editedLabel");
        editedLabel.setVisibility(8);
    }
}
