package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.getstream.chat.android.models.Command;
import io.getstream.chat.android.models.CommandDefaults;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.C19470R;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemCommandBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.widgets.internal.SimpleListAdapter;
import java.util.Arrays;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;", "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;", "Lio/getstream/chat/android/models/Command;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;", "binding", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "Lkotlin/Function1;", "Ll83/a0;", "commandSelectionListener", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;Lkotlin/jvm/functions/Function1;)V", "item", "bind", "(Lio/getstream/chat/android/models/Command;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemCommandBinding;", "Lkotlin/jvm/functions/Function1;", "Lio/getstream/chat/android/models/Command;", "", "commandTemplateText", "Ljava/lang/String;", "", "getImageRes", "(Lio/getstream/chat/android/models/Command;)I", "imageRes", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class CommandViewHolder extends SimpleListAdapter.ViewHolder<Command> {
    private final StreamUiItemCommandBinding binding;
    private final Function1 commandSelectionListener;
    private final String commandTemplateText;
    private Command item;

    /* JADX WARN: Illegal instructions before constructor call */
    public CommandViewHolder(StreamUiItemCommandBinding binding, MessageComposerViewStyle style, Function1 commandSelectionListener) {
        AbstractC22676k.m65750j(binding, "binding");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root);
        this.binding = binding;
        this.commandSelectionListener = commandSelectionListener;
        this.commandTemplateText = style.getCommandSuggestionItemCommandDescriptionText();
        binding.getRoot().setOnClickListener(new ViewOnClickListenerC19712a(this, 0));
        TextView commandNameTextView = binding.commandNameTextView;
        AbstractC22676k.m65749i(commandNameTextView, "commandNameTextView");
        TextStyleKt.setTextStyle(commandNameTextView, style.getCommandSuggestionItemCommandNameTextStyle());
        TextView commandQueryTextView = binding.commandQueryTextView;
        AbstractC22676k.m65749i(commandQueryTextView, "commandQueryTextView");
        TextStyleKt.setTextStyle(commandQueryTextView, style.getCommandSuggestionItemCommandDescriptionTextStyle());
        ImageView instantCommandImageView = binding.instantCommandImageView;
        AbstractC22676k.m65749i(instantCommandImageView, "instantCommandImageView");
        instantCommandImageView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CommandViewHolder commandViewHolder, View view) {
        Function1 function1 = commandViewHolder.commandSelectionListener;
        Command command = commandViewHolder.item;
        if (command != null) {
            function1.invoke(command);
        } else {
            AbstractC22676k.m65757q("item");
            throw null;
        }
    }

    private final int getImageRes(Command command) {
        String name = command.getName();
        if (AbstractC22676k.m65745e(name, CommandDefaults.MUTE)) {
            return C19470R.drawable.stream_design_ic_mute;
        }
        return AbstractC22676k.m65745e(name, CommandDefaults.UNMUTE) ? C19469R.drawable.stream_ui_ic_command_unmute : C19469R.drawable.stream_ui_ic_giphy;
    }

    @Override // io.getstream.chat.android.ui.widgets.internal.SimpleListAdapter.ViewHolder
    public final void bind(Command item) {
        AbstractC22676k.m65750j(item, "item");
        this.item = item;
        this.binding.commandIconImageView.setImageResource(getImageRes(item));
        TextView textView = this.binding.commandNameTextView;
        String name = item.getName();
        if (name.length() > 0) {
            StringBuilder sb4 = new StringBuilder();
            String strValueOf = String.valueOf(name.charAt(0));
            AbstractC22676k.m65748h(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            sb4.append((Object) upperCase);
            String strSubstring = name.substring(1);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            sb4.append(strSubstring);
            name = sb4.toString();
        }
        textView.setText(name);
        this.binding.commandQueryTextView.setText(String.format(this.commandTemplateText, Arrays.copyOf(new Object[]{item.getName(), item.getArgs()}, 2)));
    }
}
