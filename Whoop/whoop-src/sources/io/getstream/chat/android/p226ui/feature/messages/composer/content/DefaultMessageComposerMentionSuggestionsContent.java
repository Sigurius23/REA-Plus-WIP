package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import com.google.android.material.card.MaterialCardView;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.state.messages.composer.MessageComposerState;
import io.getstream.chat.android.p226ui.databinding.StreamUiSuggestionListViewBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerContext;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0017\u001a\u00028\u0000\"\u0012\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00010\u0010*\u00020\u0011\"\b\b\u0001\u0010\u0014*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u0016\u001a\u00020\u00158\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020\u00118\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R0\u00105\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\r\u0018\u0001038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006;"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerMentionSuggestionsContent;", "Landroid/widget/FrameLayout;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerMentionSuggestionsContent;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ll83/a0;", "init", "()V", "Landroidx/recyclerview/widget/i1;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionSuggestionsAdapter;", "T", "Landroidx/recyclerview/widget/o2;", "VH", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "buildAdapter", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)Landroidx/recyclerview/widget/i1;", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;", "messageComposerContext", "attachContext", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;", "state", "renderState", "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiSuggestionListViewBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiSuggestionListViewBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiSuggestionListViewBinding;", "setBinding", "(Lio/getstream/chat/android/ui/databinding/StreamUiSuggestionListViewBinding;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "getStyle", "()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "setStyle", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V", "adapter", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionSuggestionsAdapter;", "getAdapter", "()Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionSuggestionsAdapter;", "setAdapter", "(Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionSuggestionsAdapter;)V", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/User;", "mentionSelectionListener", "Lkotlin/jvm/functions/Function1;", "getMentionSelectionListener", "()Lkotlin/jvm/functions/Function1;", "setMentionSelectionListener", "(Lkotlin/jvm/functions/Function1;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class DefaultMessageComposerMentionSuggestionsContent extends FrameLayout implements MessageComposerMentionSuggestionsContent {
    protected MentionSuggestionsAdapter adapter;
    protected StreamUiSuggestionListViewBinding binding;
    private Function1 mentionSelectionListener;
    protected MessageComposerViewStyle style;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerMentionSuggestionsContent(Context context) {
        this(context, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 buildAdapter$lambda$0(DefaultMessageComposerMentionSuggestionsContent defaultMessageComposerMentionSuggestionsContent, User it) {
        AbstractC22676k.m65750j(it, "it");
        Function1 mentionSelectionListener = defaultMessageComposerMentionSuggestionsContent.getMentionSelectionListener();
        if (mentionSelectionListener != null) {
            mentionSelectionListener.invoke(it);
        }
        return C23454a0.f92919a;
    }

    private final void init() {
        setBinding(StreamUiSuggestionListViewBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this));
        MaterialCardView suggestionsCardView = getBinding().suggestionsCardView;
        AbstractC22676k.m65749i(suggestionsCardView, "suggestionsCardView");
        suggestionsCardView.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final void attachContext(MessageComposerContext messageComposerContext) {
        AbstractC22676k.m65750j(messageComposerContext, "messageComposerContext");
        setStyle(messageComposerContext.getStyle());
        AbstractC1692i1 abstractC1692i1BuildAdapter = buildAdapter(messageComposerContext.getStyle());
        setAdapter((MentionSuggestionsAdapter) abstractC1692i1BuildAdapter);
        getBinding().suggestionsRecyclerView.setAdapter(abstractC1692i1BuildAdapter);
        getBinding().suggestionsCardView.setCardBackgroundColor(getStyle().getMentionSuggestionsBackgroundColor());
    }

    public final <T extends AbstractC1692i1 & MentionSuggestionsAdapter, VH extends AbstractC1717o2> T buildAdapter(MessageComposerViewStyle style) {
        AbstractC22676k.m65750j(style, "style");
        return new MentionsAdapter(style, new C19713b(this, 2));
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final View findViewByKey(String str) {
        super.findViewByKey(str);
        return null;
    }

    public final MentionSuggestionsAdapter getAdapter() {
        MentionSuggestionsAdapter mentionSuggestionsAdapter = this.adapter;
        if (mentionSuggestionsAdapter != null) {
            return mentionSuggestionsAdapter;
        }
        AbstractC22676k.m65757q("adapter");
        throw null;
    }

    public final StreamUiSuggestionListViewBinding getBinding() {
        StreamUiSuggestionListViewBinding streamUiSuggestionListViewBinding = this.binding;
        if (streamUiSuggestionListViewBinding != null) {
            return streamUiSuggestionListViewBinding;
        }
        AbstractC22676k.m65757q("binding");
        throw null;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerMentionSuggestionsContent
    public Function1 getMentionSelectionListener() {
        return this.mentionSelectionListener;
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
        getAdapter().setItems(state.getMentionSuggestions());
    }

    public final void setAdapter(MentionSuggestionsAdapter mentionSuggestionsAdapter) {
        AbstractC22676k.m65750j(mentionSuggestionsAdapter, "<set-?>");
        this.adapter = mentionSuggestionsAdapter;
    }

    public final void setBinding(StreamUiSuggestionListViewBinding streamUiSuggestionListViewBinding) {
        AbstractC22676k.m65750j(streamUiSuggestionListViewBinding, "<set-?>");
        this.binding = streamUiSuggestionListViewBinding;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerMentionSuggestionsContent
    public void setMentionSelectionListener(Function1 function1) {
        this.mentionSelectionListener = function1;
    }

    public final void setStyle(MessageComposerViewStyle messageComposerViewStyle) {
        AbstractC22676k.m65750j(messageComposerViewStyle, "<set-?>");
        this.style = messageComposerViewStyle;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerMentionSuggestionsContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerMentionSuggestionsContent(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        init();
    }
}
