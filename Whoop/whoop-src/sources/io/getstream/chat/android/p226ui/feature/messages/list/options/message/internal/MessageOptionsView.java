package io.getstream.chat.android.p226ui.feature.messages.list.options.message.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import b13.ViewOnClickListenerC2292a;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.state.messages.MessageAction;
import io.getstream.chat.android.p226ui.databinding.StreamUiMessageOptionsViewBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.options.message.MessageOptionItem;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.TextViewKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView$MessageActionClickListener;", "listener", "Ll83/a0;", "setMessageActionClickListener", "(Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView$MessageActionClickListener;)V", "", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/MessageOptionItem;", "messageOptions", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "style", "setMessageOptions", "(Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageOptionsViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageOptionsViewBinding;", "Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView$MessageActionClickListener;", "MessageActionClickListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageOptionsView extends FrameLayout {
    private final StreamUiMessageOptionsViewBinding binding;
    private MessageActionClickListener listener;

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/options/message/internal/MessageOptionsView$MessageActionClickListener;", "", "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "messageAction", "Ll83/a0;", "onMessageActionClick", "(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface MessageActionClickListener {
        void onMessageActionClick(MessageAction messageAction);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageOptionsView(Context context) {
        this(context, null, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMessageOptions$lambda$1$lambda$0(MessageOptionsView messageOptionsView, MessageOptionItem messageOptionItem, View view) {
        MessageActionClickListener messageActionClickListener = messageOptionsView.listener;
        if (messageActionClickListener != null) {
            messageActionClickListener.onMessageActionClick(messageOptionItem.getMessageAction());
        }
    }

    public final void setMessageActionClickListener(MessageActionClickListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.listener = listener;
    }

    public final void setMessageOptions(List<MessageOptionItem> messageOptions, MessageListViewStyle style) {
        AbstractC22676k.m65750j(messageOptions, "messageOptions");
        AbstractC22676k.m65750j(style, "style");
        this.binding.messageOptionsContainer.setCardBackgroundColor(style.getMessageOptionsBackgroundColor());
        this.binding.optionListContainer.removeAllViews();
        for (MessageOptionItem messageOptionItem : messageOptions) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            AbstractC22676k.m65749i(layoutInflaterFrom, "from(...)");
            View viewInflate = layoutInflaterFrom.inflate(C19469R.layout.stream_ui_message_option_item, (ViewGroup) this, false);
            AbstractC22676k.m65748h(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewInflate;
            textView.setText(messageOptionItem.getOptionText());
            TextViewKt.setStartDrawable(textView, messageOptionItem.getOptionIcon());
            textView.setOnClickListener(new ViewOnClickListenerC2292a(14, this, messageOptionItem));
            TextStyleKt.setTextStyle(textView, messageOptionItem.isWarningItem() ? style.getWarningMessageOptionsText() : style.getMessageOptionsText());
            this.binding.optionListContainer.addView(textView);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageOptionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageOptionsView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.binding = StreamUiMessageOptionsViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this, true);
    }
}
