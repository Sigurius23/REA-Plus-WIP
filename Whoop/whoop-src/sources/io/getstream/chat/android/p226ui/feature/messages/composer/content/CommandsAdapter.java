package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.view.ViewGroup;
import io.getstream.chat.android.models.Command;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemCommandBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import io.getstream.chat.android.p226ui.widgets.internal.SimpleListAdapter;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandsAdapter;", "Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter;", "Lio/getstream/chat/android/models/Command;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandSuggestionsAdapter;", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "Lkotlin/Function1;", "Ll83/a0;", "commandSelectionListener", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/composer/content/CommandViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "Lkotlin/jvm/functions/Function1;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class CommandsAdapter extends SimpleListAdapter<Command, CommandViewHolder> implements CommandSuggestionsAdapter {
    private final Function1 commandSelectionListener;
    private final MessageComposerViewStyle style;

    public CommandsAdapter(MessageComposerViewStyle style, Function1 commandSelectionListener) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(commandSelectionListener, "commandSelectionListener");
        this.style = style;
        this.commandSelectionListener = commandSelectionListener;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final CommandViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        return new CommandViewHolder(StreamUiItemCommandBinding.inflate(ViewGroupKt.getStreamThemeInflater(parent), parent, false), this.style, this.commandSelectionListener);
    }
}
