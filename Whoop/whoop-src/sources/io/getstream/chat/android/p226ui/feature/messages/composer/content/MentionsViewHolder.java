package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMentionBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.DrawableKt;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarView;
import io.getstream.chat.android.p226ui.widgets.internal.SimpleListAdapter;
import java.util.Arrays;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/MentionsViewHolder;", "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;", "Lio/getstream/chat/android/models/User;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;", "binding", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "Lkotlin/Function1;", "Ll83/a0;", "mentionSelectionListener", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;Lkotlin/jvm/functions/Function1;)V", "item", "bind", "(Lio/getstream/chat/android/models/User;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiItemMentionBinding;", "Lkotlin/jvm/functions/Function1;", "getMentionSelectionListener", "()Lkotlin/jvm/functions/Function1;", "Lio/getstream/chat/android/models/User;", "", "mentionTemplateText", "Ljava/lang/String;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class MentionsViewHolder extends SimpleListAdapter.ViewHolder<User> {
    private final StreamUiItemMentionBinding binding;
    private User item;
    private final Function1 mentionSelectionListener;
    private final String mentionTemplateText;

    /* JADX WARN: Illegal instructions before constructor call */
    public MentionsViewHolder(StreamUiItemMentionBinding binding, MessageComposerViewStyle style, Function1 mentionSelectionListener) {
        AbstractC22676k.m65750j(binding, "binding");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(mentionSelectionListener, "mentionSelectionListener");
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root);
        this.binding = binding;
        this.mentionSelectionListener = mentionSelectionListener;
        this.mentionTemplateText = style.getMentionSuggestionItemMentionText();
        binding.getRoot().setOnClickListener(new ViewOnClickListenerC19712a(this, 1));
        TextView usernameTextView = binding.usernameTextView;
        AbstractC22676k.m65749i(usernameTextView, "usernameTextView");
        TextStyleKt.setTextStyle(usernameTextView, style.getMentionSuggestionItemUsernameTextStyle());
        TextView mentionNameTextView = binding.mentionNameTextView;
        AbstractC22676k.m65749i(mentionNameTextView, "mentionNameTextView");
        TextStyleKt.setTextStyle(mentionNameTextView, style.getMentionSuggestionItemMentionTextStyle());
        binding.mentionsIcon.setImageDrawable(DrawableKt.applyTint(style.getMentionSuggestionItemIconDrawable(), style.getMentionSuggestionItemIconDrawableTintColor()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MentionsViewHolder mentionsViewHolder, View view) {
        Function1 function1 = mentionsViewHolder.mentionSelectionListener;
        User user = mentionsViewHolder.item;
        if (user != null) {
            function1.invoke(user);
        } else {
            AbstractC22676k.m65757q("item");
            throw null;
        }
    }

    public final StreamUiItemMentionBinding getBinding() {
        return this.binding;
    }

    public final Function1 getMentionSelectionListener() {
        return this.mentionSelectionListener;
    }

    @Override // io.getstream.chat.android.ui.widgets.internal.SimpleListAdapter.ViewHolder
    public final void bind(final User item) {
        AbstractC22676k.m65750j(item, "item");
        this.item = item;
        UserAvatarView userAvatarView = this.binding.userAvatarView;
        AbstractC22676k.m65749i(userAvatarView, "userAvatarView");
        if (!userAvatarView.isLaidOut() || userAvatarView.isLayoutRequested()) {
            userAvatarView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.MentionsViewHolder$bind$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    UserAvatarView.setUser$default(this.this$0.getBinding().userAvatarView, item, false, 2, null);
                }
            });
        } else {
            UserAvatarView.setUser$default(this.binding.userAvatarView, item, false, 2, null);
        }
        String str = this.mentionTemplateText;
        String lowerCase = item.getId().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        String str2 = String.format(str, Arrays.copyOf(new Object[]{lowerCase}, 1));
        TextView textView = this.binding.usernameTextView;
        String name = item.getName();
        if (name.length() == 0) {
            name = str2;
        }
        textView.setText(name);
        TextView mentionNameTextView = this.binding.mentionNameTextView;
        AbstractC22676k.m65749i(mentionNameTextView, "mentionNameTextView");
        mentionNameTextView.setVisibility(item.getName().length() > 0 ? 0 : 8);
        this.binding.mentionNameTextView.setText(str2);
    }
}
