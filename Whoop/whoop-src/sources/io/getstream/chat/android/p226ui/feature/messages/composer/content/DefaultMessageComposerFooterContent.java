package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import io.getstream.chat.android.p226ui.common.state.messages.MessageMode;
import io.getstream.chat.android.p226ui.common.state.messages.composer.MessageComposerState;
import io.getstream.chat.android.p226ui.databinding.StreamUiMessageComposerDefaultFooterContentBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerContext;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R0\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\r\u0018\u00010&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerFooterContent;", "Landroid/widget/FrameLayout;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerFooterContent;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "()V", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;", "messageComposerContext", "attachContext", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;", "state", "renderState", "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultFooterContentBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultFooterContentBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultFooterContentBinding;", "setBinding", "(Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultFooterContentBinding;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "getStyle", "()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "setStyle", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V", "Lkotlin/Function1;", "", "alsoSendToChannelSelectionListener", "Lkotlin/jvm/functions/Function1;", "getAlsoSendToChannelSelectionListener", "()Lkotlin/jvm/functions/Function1;", "setAlsoSendToChannelSelectionListener", "(Lkotlin/jvm/functions/Function1;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class DefaultMessageComposerFooterContent extends FrameLayout implements MessageComposerFooterContent {
    private Function1 alsoSendToChannelSelectionListener;
    protected StreamUiMessageComposerDefaultFooterContentBinding binding;
    protected MessageComposerViewStyle style;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerFooterContent(Context context) {
        this(context, null);
        AbstractC22676k.m65750j(context, "context");
    }

    private final void init() {
        setBinding(StreamUiMessageComposerDefaultFooterContentBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this));
        getBinding().alsoSendToChannelCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                DefaultMessageComposerFooterContent.init$lambda$0(this.f74574a, compoundButton, z4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(DefaultMessageComposerFooterContent defaultMessageComposerFooterContent, CompoundButton compoundButton, boolean z4) {
        Function1 alsoSendToChannelSelectionListener = defaultMessageComposerFooterContent.getAlsoSendToChannelSelectionListener();
        if (alsoSendToChannelSelectionListener != null) {
            alsoSendToChannelSelectionListener.invoke(Boolean.valueOf(defaultMessageComposerFooterContent.getBinding().alsoSendToChannelCheckBox.isChecked()));
        }
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final void attachContext(MessageComposerContext messageComposerContext) {
        AbstractC22676k.m65750j(messageComposerContext, "messageComposerContext");
        setStyle(messageComposerContext.getStyle());
        getBinding().alsoSendToChannelCheckBox.setText(getStyle().getAlsoSendToChannelCheckboxText());
        AppCompatCheckBox alsoSendToChannelCheckBox = getBinding().alsoSendToChannelCheckBox;
        AbstractC22676k.m65749i(alsoSendToChannelCheckBox, "alsoSendToChannelCheckBox");
        TextStyleKt.setTextStyle(alsoSendToChannelCheckBox, getStyle().getAlsoSendToChannelCheckboxTextStyle());
        Drawable alsoSendToChannelCheckboxDrawable = getStyle().getAlsoSendToChannelCheckboxDrawable();
        if (alsoSendToChannelCheckboxDrawable != null) {
            getBinding().alsoSendToChannelCheckBox.setButtonDrawable(alsoSendToChannelCheckboxDrawable);
        }
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final View findViewByKey(String str) {
        super.findViewByKey(str);
        return null;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerFooterContent
    public Function1 getAlsoSendToChannelSelectionListener() {
        return this.alsoSendToChannelSelectionListener;
    }

    public final StreamUiMessageComposerDefaultFooterContentBinding getBinding() {
        StreamUiMessageComposerDefaultFooterContentBinding streamUiMessageComposerDefaultFooterContentBinding = this.binding;
        if (streamUiMessageComposerDefaultFooterContentBinding != null) {
            return streamUiMessageComposerDefaultFooterContentBinding;
        }
        AbstractC22676k.m65757q("binding");
        throw null;
    }

    public final MessageComposerViewStyle getStyle() {
        MessageComposerViewStyle messageComposerViewStyle = this.style;
        if (messageComposerViewStyle != null) {
            return messageComposerViewStyle;
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final void renderState(MessageComposerState state) {
        AbstractC22676k.m65750j(state, "state");
        boolean z4 = state.getMessageMode() instanceof MessageMode.MessageThread;
        AppCompatCheckBox alsoSendToChannelCheckBox = getBinding().alsoSendToChannelCheckBox;
        AbstractC22676k.m65749i(alsoSendToChannelCheckBox, "alsoSendToChannelCheckBox");
        alsoSendToChannelCheckBox.setVisibility(getStyle().getAlsoSendToChannelCheckboxVisible() && z4 ? 0 : 8);
        getBinding().alsoSendToChannelCheckBox.setChecked(state.getAlsoSendToChannel());
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerFooterContent
    public void setAlsoSendToChannelSelectionListener(Function1 function1) {
        this.alsoSendToChannelSelectionListener = function1;
    }

    public final void setBinding(StreamUiMessageComposerDefaultFooterContentBinding streamUiMessageComposerDefaultFooterContentBinding) {
        AbstractC22676k.m65750j(streamUiMessageComposerDefaultFooterContentBinding, "<set-?>");
        this.binding = streamUiMessageComposerDefaultFooterContentBinding;
    }

    public final void setStyle(MessageComposerViewStyle messageComposerViewStyle) {
        AbstractC22676k.m65750j(messageComposerViewStyle, "<set-?>");
        this.style = messageComposerViewStyle;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerFooterContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerFooterContent(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        init();
    }
}
