package io.getstream.chat.android.p226ui.feature.messages.list.internal.poll;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1643y1;
import androidx.lifecycle.InterfaceC1563a2;
import androidx.recyclerview.widget.AbstractC1717o2;
import androidx.recyclerview.widget.AbstractC1738u;
import androidx.recyclerview.widget.AbstractC1759z0;
import b30.ViewOnClickListenerC2558k3;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ec3.AbstractC13091v;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.Vote;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.databinding.StreamUiFragmentAllPollOptionsBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemOptionBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p314m.C24835d0;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p708hb2.C17095c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 &2\u00020\u0001:\u0003&'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0003R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006)"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;", "Lm/d0;", "<init>", "()V", "Ll83/a0;", "setupDialog", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "setupToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "getTheme", "()I", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;", "viewModel$delegate", "Ll83/h;", "getViewModel", "()Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;", "viewModel", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAllPollOptionsBinding;", "binding", "Companion", "OptionsAdapter", "AllPollOptionsViewModel", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AllPollOptionsDialogFragment extends C24835d0 {
    private static final String ARG_CHANNEL_ID = "channel_id";
    private static final String ARG_CHANNEL_TYPE = "channel_type";
    private static final String ARG_MESSAGE_ID = "message_id";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String TAG = "create_all_poll_options_dialog";
    private StreamUiFragmentAllPollOptionsBinding _binding;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$Companion;", "", "<init>", "()V", "TAG", "", "ARG_MESSAGE_ID", "ARG_CHANNEL_ID", "ARG_CHANNEL_TYPE", "newInstance", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;", "message", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final AllPollOptionsDialogFragment newInstance(Message message) {
            AbstractC22676k.m65750j(message, "message");
            AllPollOptionsDialogFragment allPollOptionsDialogFragment = new AllPollOptionsDialogFragment();
            C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(message.getCid());
            String str = (String) c23465kCidToTypeAndId.f92937w;
            String str2 = (String) c23465kCidToTypeAndId.f92938x;
            Bundle bundle = new Bundle();
            bundle.putString(AllPollOptionsDialogFragment.ARG_MESSAGE_ID, message.getId());
            bundle.putString(AllPollOptionsDialogFragment.ARG_CHANNEL_ID, str2);
            bundle.putString(AllPollOptionsDialogFragment.ARG_CHANNEL_TYPE, str);
            allPollOptionsDialogFragment.setArguments(bundle);
            return allPollOptionsDialogFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0019\u001a\u001bB\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter;", "Landroidx/recyclerview/widget/z0;", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Option;", "Ll83/a0;", "onOptionClick", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/models/Poll;", "poll", "setPoll", "(Lio/getstream/chat/android/models/Poll;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;", "holder", "position", "onBindViewHolder", "(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "OptionItem", "OptionViewHolder", "OptionsDiffCallback", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class OptionsAdapter extends AbstractC1759z0 {
        private final Function1 onOptionClick;

        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;", "", "option", "Lio/getstream/chat/android/models/Option;", "votes", "", "isVotedByUser", "", "readonly", "<init>", "(Lio/getstream/chat/android/models/Option;IZZ)V", "getOption", "()Lio/getstream/chat/android/models/Option;", "getVotes", "()I", "()Z", "getReadonly", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class OptionItem {
            private final boolean isVotedByUser;
            private final Option option;
            private final boolean readonly;
            private final int votes;

            public OptionItem(Option option, int i13, boolean z4, boolean z13) {
                AbstractC22676k.m65750j(option, "option");
                this.option = option;
                this.votes = i13;
                this.isVotedByUser = z4;
                this.readonly = z13;
            }

            public static /* synthetic */ OptionItem copy$default(OptionItem optionItem, Option option, int i13, boolean z4, boolean z13, int i14, Object obj) {
                if ((i14 & 1) != 0) {
                    option = optionItem.option;
                }
                if ((i14 & 2) != 0) {
                    i13 = optionItem.votes;
                }
                if ((i14 & 4) != 0) {
                    z4 = optionItem.isVotedByUser;
                }
                if ((i14 & 8) != 0) {
                    z13 = optionItem.readonly;
                }
                return optionItem.copy(option, i13, z4, z13);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Option getOption() {
                return this.option;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getVotes() {
                return this.votes;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final boolean getIsVotedByUser() {
                return this.isVotedByUser;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final boolean getReadonly() {
                return this.readonly;
            }

            public final OptionItem copy(Option option, int votes, boolean isVotedByUser, boolean readonly) {
                AbstractC22676k.m65750j(option, "option");
                return new OptionItem(option, votes, isVotedByUser, readonly);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OptionItem)) {
                    return false;
                }
                OptionItem optionItem = (OptionItem) other;
                return AbstractC22676k.m65745e(this.option, optionItem.option) && this.votes == optionItem.votes && this.isVotedByUser == optionItem.isVotedByUser && this.readonly == optionItem.readonly;
            }

            public final Option getOption() {
                return this.option;
            }

            public final boolean getReadonly() {
                return this.readonly;
            }

            public final int getVotes() {
                return this.votes;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.readonly) + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.votes, this.option.hashCode() * 31, 31), 31, this.isVotedByUser);
            }

            public final boolean isVotedByUser() {
                return this.isVotedByUser;
            }

            public final String toString() {
                Option option = this.option;
                int i13 = this.votes;
                boolean z4 = this.isVotedByUser;
                boolean z13 = this.readonly;
                StringBuilder sb4 = new StringBuilder("OptionItem(option=");
                sb4.append(option);
                sb4.append(", votes=");
                sb4.append(i13);
                sb4.append(", isVotedByUser=");
                return AbstractC36095b.m114682j(sb4, z4, ", readonly=", z13, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionViewHolder;", "Landroidx/recyclerview/widget/o2;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;", "binding", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Option;", "Ll83/a0;", "onOptionClick", "<init>", "(Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;", "result", "bind", "(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiItemOptionBinding;", "Lkotlin/jvm/functions/Function1;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class OptionViewHolder extends AbstractC1717o2 {
            private final StreamUiItemOptionBinding binding;
            private final Function1 onOptionClick;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OptionViewHolder(StreamUiItemOptionBinding binding, Function1 onOptionClick) {
                super(binding.getRoot());
                AbstractC22676k.m65750j(binding, "binding");
                AbstractC22676k.m65750j(onOptionClick, "onOptionClick");
                this.binding = binding;
                this.onOptionClick = onOptionClick;
            }

            /* JADX INFO: renamed from: a */
            public static void m55619a(OptionViewHolder optionViewHolder, OptionItem optionItem, View view) {
                optionViewHolder.onOptionClick.invoke(optionItem.getOption());
            }

            public final void bind(OptionItem result) {
                AbstractC22676k.m65750j(result, "result");
                this.binding.getRoot().setOnClickListener(new ViewOnClickListenerC19854c(this, result, 0));
                this.binding.option.setText(result.getOption().getText());
                this.binding.votes.setText(String.valueOf(result.getVotes()));
                this.binding.check.setEnabled(result.isVotedByUser());
                AppCompatImageView check = this.binding.check;
                AbstractC22676k.m65749i(check, "check");
                check.setVisibility(!result.getReadonly() ? 0 : 8);
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionsDiffCallback;", "Landroidx/recyclerview/widget/u;", "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;", "<init>", "()V", "oldItem", "newItem", "", "areContentsTheSame", "(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$OptionsAdapter$OptionItem;)Z", "areItemsTheSame", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class OptionsDiffCallback extends AbstractC1738u {
            public static final OptionsDiffCallback INSTANCE = new OptionsDiffCallback();

            private OptionsDiffCallback() {
            }

            @Override // androidx.recyclerview.widget.AbstractC1738u
            public final boolean areContentsTheSame(OptionItem oldItem, OptionItem newItem) {
                AbstractC22676k.m65750j(oldItem, "oldItem");
                AbstractC22676k.m65750j(newItem, "newItem");
                return oldItem.equals(newItem);
            }

            @Override // androidx.recyclerview.widget.AbstractC1738u
            public final boolean areItemsTheSame(OptionItem oldItem, OptionItem newItem) {
                AbstractC22676k.m65750j(oldItem, "oldItem");
                AbstractC22676k.m65750j(newItem, "newItem");
                return AbstractC22676k.m65745e(oldItem.getOption().getId(), newItem.getOption().getId());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionsAdapter(Function1 onOptionClick) {
            super(OptionsDiffCallback.INSTANCE);
            AbstractC22676k.m65750j(onOptionClick, "onOptionClick");
            this.onOptionClick = onOptionClick;
        }

        public final void setPoll(Poll poll) {
            AbstractC22676k.m65750j(poll, "poll");
            List<Option> options = poll.getOptions();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(options, 10));
            for (Option option : options) {
                Integer num = poll.getVoteCountsByOption().get(option.getId());
                boolean z4 = false;
                int iIntValue = num != null ? num.intValue() : 0;
                List<Vote> ownVotes = poll.getOwnVotes();
                if (!(ownVotes instanceof Collection) || !ownVotes.isEmpty()) {
                    Iterator<T> it = ownVotes.iterator();
                    while (it.hasNext()) {
                        if (AbstractC22676k.m65745e(((Vote) it.next()).getOptionId(), option.getId())) {
                            z4 = true;
                            break;
                        }
                    }
                }
                arrayList.add(new OptionItem(option, iIntValue, z4, poll.getClosed()));
            }
            submitList(arrayList);
        }

        @Override // androidx.recyclerview.widget.AbstractC1692i1
        public final void onBindViewHolder(OptionViewHolder holder, int position) {
            AbstractC22676k.m65750j(holder, "holder");
            Object item = getItem(position);
            AbstractC22676k.m65749i(item, "getItem(...)");
            holder.bind((OptionItem) item);
        }

        @Override // androidx.recyclerview.widget.AbstractC1692i1
        public final OptionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            AbstractC22676k.m65750j(parent, "parent");
            return new OptionViewHolder(StreamUiItemOptionBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false), this.onOptionClick);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.internal.poll.AllPollOptionsDialogFragment$setupDialog$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.list.internal.poll.AllPollOptionsDialogFragment$setupDialog$1", m100430f = "AllPollOptionsDialogFragment.kt", m100431l = {107}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C198371 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ OptionsAdapter $adapter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C198371(OptionsAdapter optionsAdapter, InterfaceC30057d<? super C198371> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$adapter = optionsAdapter;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AllPollOptionsDialogFragment.this.new C198371(this.$adapter, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C198371) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                final InterfaceC13037f2 pollState = AllPollOptionsDialogFragment.this.getViewModel().getPollState();
                InterfaceC13058l interfaceC13058l = new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.feature.messages.list.internal.poll.AllPollOptionsDialogFragment$setupDialog$1$invokeSuspend$$inlined$mapNotNull$1

                    /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.internal.poll.AllPollOptionsDialogFragment$setupDialog$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                    public static final class AnonymousClass2<T> implements InterfaceC13062m {
                        final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.internal.poll.AllPollOptionsDialogFragment$setupDialog$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.feature.messages.list.internal.poll.AllPollOptionsDialogFragment$setupDialog$1$invokeSuspend$$inlined$mapNotNull$1$2", m100430f = "AllPollOptionsDialogFragment.kt", m100431l = {52}, m100432m = "emit")
                        @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                        public static final class AnonymousClass1 extends AbstractC32269c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            Object L$4;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                                super(interfaceC30057d);
                            }

                            @Override // s83.AbstractC32267a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC13062m interfaceC13062m) {
                            this.$this_unsafeFlow = interfaceC13062m;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // ec3.InterfaceC13062m
                        public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                            AnonymousClass1 anonymousClass1;
                            if (interfaceC30057d instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                                int i13 = anonymousClass1.label;
                                if ((i13 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i13 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                            }
                            Object obj2 = anonymousClass1.result;
                            EnumC31071a enumC31071a = EnumC31071a.f128113w;
                            int i14 = anonymousClass1.label;
                            if (i14 == 0) {
                                AbstractC34132o.m107864I(obj2);
                                InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                                Poll poll = (Poll) obj;
                                if (poll != null) {
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.L$4 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    if (interfaceC13062m.emit(poll, anonymousClass1) == enumC31071a) {
                                        return enumC31071a;
                                    }
                                }
                            } else {
                                if (i14 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC34132o.m107864I(obj2);
                            }
                            return C23454a0.f92919a;
                        }
                    }

                    @Override // ec3.InterfaceC13058l
                    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                        Object objCollect = pollState.collect(new AnonymousClass2(interfaceC13062m), interfaceC30057d);
                        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
                    }
                };
                final AllPollOptionsDialogFragment allPollOptionsDialogFragment = AllPollOptionsDialogFragment.this;
                final OptionsAdapter optionsAdapter = this.$adapter;
                InterfaceC13062m interfaceC13062m = new InterfaceC13062m() { // from class: io.getstream.chat.android.ui.feature.messages.list.internal.poll.AllPollOptionsDialogFragment.setupDialog.1.2
                    @Override // ec3.InterfaceC13062m
                    public final /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC30057d interfaceC30057d) {
                        emit((Poll) obj2, (InterfaceC30057d<? super C23454a0>) interfaceC30057d);
                        return C23454a0.f92919a;
                    }

                    public final Object emit(Poll poll, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                        AllPollOptionsDialogFragment.access$getBinding(allPollOptionsDialogFragment).question.setText(poll.getName());
                        optionsAdapter.setPoll(poll);
                        return C23454a0.f92919a;
                    }
                };
                this.label = 1;
                if (interfaceC13058l.collect(interfaceC13062m, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    public AllPollOptionsDialogFragment() {
        C19683b c19683b = new C19683b(this, 3);
        InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C19840x395e51fe(new C19839x395e51fd(this)));
        this.viewModel = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AllPollOptionsViewModel.class), new C19841x395e51ff(interfaceC23462hM92087G), c19683b, new C19842x395e5200(null, interfaceC23462hM92087G));
    }

    public static final StreamUiFragmentAllPollOptionsBinding access$getBinding(AllPollOptionsDialogFragment allPollOptionsDialogFragment) {
        StreamUiFragmentAllPollOptionsBinding streamUiFragmentAllPollOptionsBinding = allPollOptionsDialogFragment._binding;
        AbstractC22676k.m65747g(streamUiFragmentAllPollOptionsBinding);
        return streamUiFragmentAllPollOptionsBinding;
    }

    private final StreamUiFragmentAllPollOptionsBinding getBinding() {
        StreamUiFragmentAllPollOptionsBinding streamUiFragmentAllPollOptionsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAllPollOptionsBinding);
        return streamUiFragmentAllPollOptionsBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AllPollOptionsViewModel getViewModel() {
        return (AllPollOptionsViewModel) this.viewModel.getValue();
    }

    private final void setupDialog() {
        StreamUiFragmentAllPollOptionsBinding streamUiFragmentAllPollOptionsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAllPollOptionsBinding);
        Toolbar toolbar = streamUiFragmentAllPollOptionsBinding.toolbar;
        AbstractC22676k.m65749i(toolbar, "toolbar");
        setupToolbar(toolbar);
        OptionsAdapter optionsAdapter = new OptionsAdapter(new C17095c(this, 26));
        StreamUiFragmentAllPollOptionsBinding streamUiFragmentAllPollOptionsBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAllPollOptionsBinding2);
        streamUiFragmentAllPollOptionsBinding2.optionList.setAdapter(optionsAdapter);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C198371(optionsAdapter, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setupDialog$lambda$1(AllPollOptionsDialogFragment allPollOptionsDialogFragment, Option it) {
        AbstractC22676k.m65750j(it, "it");
        allPollOptionsDialogFragment.getViewModel().onOptionClick(it);
        return C23454a0.f92919a;
    }

    private final void setupToolbar(Toolbar toolbar) {
        toolbar.setNavigationOnClickListener(new ViewOnClickListenerC2558k3(this, 21));
        Drawable drawable = AbstractC32122c.getDrawable(requireContext(), C19469R.drawable.stream_ui_arrow_left);
        if (drawable != null) {
            drawable.setTint(AbstractC32122c.getColor(requireContext(), C19469R.color.stream_ui_black));
            toolbar.setNavigationIcon(drawable);
        }
        toolbar.setTitle(getString(C19469R.string.stream_ui_poll_options_title));
    }

    private static final InterfaceC1563a2 viewModel_delegate$lambda$0(AllPollOptionsDialogFragment allPollOptionsDialogFragment) {
        return new AllPollOptionsDialogFragment$viewModel$2$1(allPollOptionsDialogFragment);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y
    public final int getTheme() {
        return C19469R.style.StreamUiBottomSheetDialogTheme;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        StreamUiFragmentAllPollOptionsBinding streamUiFragmentAllPollOptionsBindingInflate = StreamUiFragmentAllPollOptionsBinding.inflate(ContextKt.getStreamThemeInflater(contextRequireContext), container, false);
        this._binding = streamUiFragmentAllPollOptionsBindingInflate;
        ConstraintLayout root = streamUiFragmentAllPollOptionsBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1361y, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        StreamUiFragmentAllPollOptionsBinding streamUiFragmentAllPollOptionsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentAllPollOptionsBinding);
        ConstraintLayout root = streamUiFragmentAllPollOptionsBinding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        ViewKt.applyEdgeToEdgePadding(root, 7);
        setupDialog();
    }

    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;", "Landroidx/lifecycle/w1;", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "", "messageId", "channelId", "channelType", "Lbc3/c0;", "coroutineScope", "<init>", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbc3/c0;)V", "Lio/getstream/chat/android/models/Option;", "option", "Ll83/a0;", "onOptionClick", "(Lio/getstream/chat/android/models/Option;)V", "Lio/getstream/chat/android/client/ChatClient;", "Ljava/lang/String;", "Lbc3/c0;", "Lec3/f2;", "Lio/getstream/chat/android/models/Poll;", "pollState", "Lec3/f2;", "getPollState", "()Lec3/f2;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class AllPollOptionsViewModel extends AbstractC1637w1 {
        private final ChatClient chatClient;
        private final InterfaceC2994c0 coroutineScope;
        private final String messageId;
        private final InterfaceC13037f2 pollState;

        public /* synthetic */ AllPollOptionsViewModel(ChatClient chatClient, String str, String str2, String str3, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? ChatClient.INSTANCE.instance() : chatClient, str, str2, str3, interfaceC2994c0);
        }

        public final InterfaceC13037f2 getPollState() {
            return this.pollState;
        }

        public final void onOptionClick(Option option) {
            AbstractC22676k.m65750j(option, "option");
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new C19836x2333f375(this, option, null), 3);
        }

        public AllPollOptionsViewModel(ChatClient chatClient, String messageId, String channelId, String channelType, InterfaceC2994c0 coroutineScope) {
            AbstractC22676k.m65750j(chatClient, "chatClient");
            AbstractC22676k.m65750j(messageId, "messageId");
            AbstractC22676k.m65750j(channelId, "channelId");
            AbstractC22676k.m65750j(channelType, "channelType");
            AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
            this.chatClient = chatClient;
            this.messageId = messageId;
            this.coroutineScope = coroutineScope;
            this.pollState = AbstractC13091v.m36587M(AbstractC13091v.m36583I(new AllPollOptionsDialogFragment$AllPollOptionsViewModel$pollState$1(this, null), ChatClientExtensions.getState(chatClient).channel(channelType, channelId).getMessages()), coroutineScope, C13105z1.f45288a, null);
        }
    }
}
