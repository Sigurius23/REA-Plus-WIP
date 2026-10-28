package io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1738u;
import androidx.recyclerview.widget.AbstractC1759z0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.databinding.StreamUiPollOptionBinding;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001b\u001cB+\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;", "", "optionTextLimit", "Lkotlin/Function2;", "", "Ll83/a0;", "onOptionChange", "<init>", "(Ljava/lang/Integer;Lc93/m;)V", "(Lc93/m;)V", "position", "", "getItemId", "(I)J", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;", "holder", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;I)V", "Ljava/lang/Integer;", "Lc93/m;", "OptionViewHolder", "OptionDiffCallback", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class OptionsAdapter extends AbstractC1759z0 {
    private final InterfaceC4351m onOptionChange;
    private final Integer optionTextLimit;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionDiffCallback;", "Landroidx/recyclerview/widget/u;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;)Z", "areContentsTheSame", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class OptionDiffCallback extends AbstractC1738u {
        public static final OptionDiffCallback INSTANCE = new OptionDiffCallback();

        private OptionDiffCallback() {
        }

        @Override // androidx.recyclerview.widget.AbstractC1738u
        public final boolean areContentsTheSame(PollAnswer oldItem, PollAnswer newItem) {
            AbstractC22676k.m65750j(oldItem, "oldItem");
            AbstractC22676k.m65750j(newItem, "newItem");
            return oldItem.getDuplicateError() == newItem.getDuplicateError();
        }

        @Override // androidx.recyclerview.widget.AbstractC1738u
        public final boolean areItemsTheSame(PollAnswer oldItem, PollAnswer newItem) {
            AbstractC22676k.m65750j(oldItem, "oldItem");
            AbstractC22676k.m65750j(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsAdapter(Integer num, InterfaceC4351m onOptionChange) {
        super(OptionDiffCallback.INSTANCE);
        AbstractC22676k.m65750j(onOptionChange, "onOptionChange");
        this.optionTextLimit = num;
        this.onOptionChange = onOptionChange;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final long getItemId(int position) {
        return ((PollAnswer) getItem(position)).getId();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final void onBindViewHolder(OptionViewHolder holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        Object item = getItem(position);
        AbstractC22676k.m65749i(item, "getItem(...)");
        holder.bind((PollAnswer) item);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final OptionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        return new OptionViewHolder(parent, null, this.optionTextLimit, this.onOptionChange, 2, null);
    }

    @Metadata(m65680d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0004*\u0001\u0017\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\n*\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder;", "Landroidx/recyclerview/widget/o2;", "Landroid/view/ViewGroup;", "parent", "Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;", "binding", "", "optionTextLimit", "Lkotlin/Function2;", "", "Ll83/a0;", "onOptionChange", "<init>", "(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;Ljava/lang/Integer;Lc93/m;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;", "updateErrorState", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;)V", "pollAnswer", "bind", "Lio/getstream/chat/android/ui/databinding/StreamUiPollOptionBinding;", "Ljava/lang/Integer;", "Lc93/m;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;", "io/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder$textWatcher$1", "textWatcher", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/OptionsAdapter$OptionViewHolder$textWatcher$1;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class OptionViewHolder extends AbstractC1717o2 {
        private final StreamUiPollOptionBinding binding;
        private final InterfaceC4351m onOptionChange;
        private final Integer optionTextLimit;
        private PollAnswer pollAnswer;
        private final OptionsAdapter$OptionViewHolder$textWatcher$1 textWatcher;

        public /* synthetic */ OptionViewHolder(ViewGroup viewGroup, StreamUiPollOptionBinding streamUiPollOptionBinding, Integer num, InterfaceC4351m interfaceC4351m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(viewGroup, (i13 & 2) != 0 ? StreamUiPollOptionBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup, false) : streamUiPollOptionBinding, num, interfaceC4351m);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateErrorState(PollAnswer pollAnswer) {
            this.binding.option.setError(pollAnswer.getDuplicateError() ? this.binding.getRoot().getContext().getString(C19469R.string.stream_ui_poll_this_is_already_an_option) : null);
        }

        public final void bind(PollAnswer pollAnswer) {
            AbstractC22676k.m65750j(pollAnswer, "pollAnswer");
            this.pollAnswer = pollAnswer;
            this.binding.option.removeTextChangedListener(this.textWatcher);
            this.binding.option.setText(pollAnswer.getText());
            this.binding.option.setSelection(pollAnswer.getText().length());
            updateErrorState(pollAnswer);
            this.binding.option.addTextChangedListener(this.textWatcher);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Type inference failed for: r2v4, types: [io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.OptionsAdapter$OptionViewHolder$textWatcher$1] */
        public OptionViewHolder(ViewGroup parent, StreamUiPollOptionBinding binding, Integer num, InterfaceC4351m onOptionChange) {
            super(binding.getRoot());
            AbstractC22676k.m65750j(parent, "parent");
            AbstractC22676k.m65750j(binding, "binding");
            AbstractC22676k.m65750j(onOptionChange, "onOptionChange");
            this.binding = binding;
            this.optionTextLimit = num;
            this.onOptionChange = onOptionChange;
            if (num != null) {
                binding.option.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(num.intValue())});
            }
            this.textWatcher = new TextWatcher() { // from class: io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.OptionsAdapter$OptionViewHolder$textWatcher$1
                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable s13) {
                    OptionsAdapter.OptionViewHolder optionViewHolder = this.this$0;
                    PollAnswer pollAnswer = optionViewHolder.pollAnswer;
                    if (pollAnswer == null) {
                        AbstractC22676k.m65757q("pollAnswer");
                        throw null;
                    }
                    optionViewHolder.updateErrorState(pollAnswer);
                    InterfaceC4351m interfaceC4351m = this.this$0.onOptionChange;
                    PollAnswer pollAnswer2 = this.this$0.pollAnswer;
                    if (pollAnswer2 != null) {
                        interfaceC4351m.invoke(Integer.valueOf(pollAnswer2.getId()), String.valueOf(s13));
                    } else {
                        AbstractC22676k.m65757q("pollAnswer");
                        throw null;
                    }
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence s13, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence s13, int start, int before, int count) {
                }
            };
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionsAdapter(InterfaceC4351m onOptionChange) {
        this(null, onOptionChange);
        AbstractC22676k.m65750j(onOptionChange, "onOptionChange");
    }
}
