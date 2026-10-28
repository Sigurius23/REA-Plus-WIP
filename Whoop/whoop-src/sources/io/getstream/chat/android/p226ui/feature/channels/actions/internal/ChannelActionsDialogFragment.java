package io.getstream.chat.android.p226ui.feature.channels.actions.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C1643y1;
import androidx.lifecycle.InterfaceC1563a2;
import b13.ViewOnClickListenerC2292a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import h02.C16587n0;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.state.channels.actions.ChannelAction;
import io.getstream.chat.android.p226ui.common.utils.ChannelNameFormatter;
import io.getstream.chat.android.p226ui.databinding.StreamUiFragmentChannelActionsBinding;
import io.getstream.chat.android.p226ui.feature.channels.actions.ChannelActionsDialogViewStyle;
import io.getstream.chat.android.p226ui.font.TextStyle;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ChannelKt;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.TextViewKt;
import io.getstream.chat.android.p226ui.utils.extensions.UserKt;
import io.getstream.chat.android.p226ui.viewmodel.channels.internal.ChannelActionsViewModel;
import io.getstream.chat.android.p226ui.viewmodel.channels.internal.ChannelActionsViewModelFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p404pq.C29464l;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0003@A?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010+R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010,R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010-R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010.R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006B"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;", "Lpq/l;", "<init>", "()V", "Ll83/a0;", "setupDialog", "bindChannelInfo", "bindChannelOptions", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "getTheme", "()I", "Lio/getstream/chat/android/models/Channel;", "channel", "setChannel", "(Lio/getstream/chat/android/models/Channel;)V", "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;", "style", "setStyle", "(Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;)V", "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelOptionClickListener;", "channelOptionClickListener", "setChannelOptionClickListener", "(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelOptionClickListener;)V", "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelMemberClickListener;", "channelMemberClickListener", "setChannelMemberClickListener", "(Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelMemberClickListener;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;", "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;", "Lio/getstream/chat/android/models/Channel;", "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelOptionClickListener;", "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelMemberClickListener;", "Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;", "channelActionsViewModel$delegate", "Ll83/h;", "getChannelActionsViewModel", "()Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;", "channelActionsViewModel", "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter;", "membersAdapter", "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelMembersAdapter;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentChannelActionsBinding;", "binding", "", "getCid", "()Ljava/lang/String;", "cid", "Companion", "ChannelMemberClickListener", "ChannelOptionClickListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelActionsDialogFragment extends C29464l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private StreamUiFragmentChannelActionsBinding _binding;
    private Channel channel;

    /* JADX INFO: renamed from: channelActionsViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h channelActionsViewModel;
    private ChannelMemberClickListener channelMemberClickListener;
    private ChannelOptionClickListener channelOptionClickListener;
    private final ChannelMembersAdapter membersAdapter;
    private ChannelActionsDialogViewStyle style;

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelMemberClickListener;", "", "Lio/getstream/chat/android/models/Member;", "member", "Ll83/a0;", "onMemberClick", "(Lio/getstream/chat/android/models/Member;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ChannelMemberClickListener {
        void onMemberClick(Member member);
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$ChannelOptionClickListener;", "", "Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;", "channelAction", "Ll83/a0;", "onChannelOptionClick", "(Lio/getstream/chat/android/ui/common/state/channels/actions/ChannelAction;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface ChannelOptionClickListener {
        void onChannelOptionClick(ChannelAction channelAction);
    }

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment$Companion;", "", "<init>", "()V", "newInstance", "Lio/getstream/chat/android/ui/feature/channels/actions/internal/ChannelActionsDialogFragment;", "channel", "Lio/getstream/chat/android/models/Channel;", "style", "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ChannelActionsDialogFragment newInstance(Channel channel, ChannelActionsDialogViewStyle style) {
            AbstractC22676k.m65750j(channel, "channel");
            AbstractC22676k.m65750j(style, "style");
            ChannelActionsDialogFragment channelActionsDialogFragment = new ChannelActionsDialogFragment();
            channelActionsDialogFragment.setChannel(channel);
            channelActionsDialogFragment.setStyle(style);
            return channelActionsDialogFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ChannelActionsDialogFragment() {
        C16587n0 c16587n0 = new C16587n0(this, 27);
        InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C19622x33f4a4fa(new C19621x33f4a4f9(this)));
        this.channelActionsViewModel = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ChannelActionsViewModel.class), new C19623x33f4a4fb(interfaceC23462hM92087G), c16587n0, new C19624x33f4a4fc(null, interfaceC23462hM92087G));
        this.membersAdapter = new ChannelMembersAdapter(new C19626a(this, 0));
    }

    /* JADX INFO: renamed from: A */
    public static ChannelActionsViewModelFactory m55094A(ChannelActionsDialogFragment channelActionsDialogFragment) {
        return new ChannelActionsViewModelFactory(channelActionsDialogFragment.getCid());
    }

    private final void bindChannelInfo() {
        StreamUiFragmentChannelActionsBinding streamUiFragmentChannelActionsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelActionsBinding);
        TextView textView = streamUiFragmentChannelActionsBinding.channelMembersTextView;
        ChannelNameFormatter channelNameFormatter = ChatUI.getChannelNameFormatter();
        Channel channel = this.channel;
        if (channel == null) {
            AbstractC22676k.m65757q("channel");
            throw null;
        }
        textView.setText(channelNameFormatter.formatChannelName(channel, ChatUI.getCurrentUserProvider().getCurrentUser()));
        StreamUiFragmentChannelActionsBinding streamUiFragmentChannelActionsBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelActionsBinding2);
        TextView textView2 = streamUiFragmentChannelActionsBinding2.channelMembersInfoTextView;
        Channel channel2 = this.channel;
        if (channel2 == null) {
            AbstractC22676k.m65757q("channel");
            throw null;
        }
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        textView2.setText(ChannelKt.getMembersStatusText$default(channel2, contextRequireContext, null, 2, null));
        Channel channel3 = this.channel;
        if (channel3 == null) {
            AbstractC22676k.m65757q("channel");
            throw null;
        }
        List<Member> members = channel3.getMembers();
        Channel channel4 = this.channel;
        if (channel4 == null) {
            AbstractC22676k.m65757q("channel");
            throw null;
        }
        if (io.getstream.chat.android.p226ui.common.utils.extensions.ChannelKt.isDirectMessaging(channel4)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : members) {
                if (!UserKt.isCurrentUser(((Member) obj).getUser())) {
                    arrayList.add(obj);
                }
            }
            members = arrayList;
        }
        this.membersAdapter.submitList(members);
    }

    private final void bindChannelOptions() {
        TextStyle itemTextStyle;
        StreamUiFragmentChannelActionsBinding streamUiFragmentChannelActionsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelActionsBinding);
        streamUiFragmentChannelActionsBinding.optionsContainer.removeAllViews();
        ChannelOptionItemsFactory.Companion companion = ChannelOptionItemsFactory.INSTANCE;
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        ChannelOptionItemsFactory channelOptionItemsFactoryDefaultFactory = companion.defaultFactory(contextRequireContext);
        Channel channel = this.channel;
        if (channel == null) {
            AbstractC22676k.m65757q("channel");
            throw null;
        }
        Set<String> ownCapabilities = channel.getOwnCapabilities();
        ChannelActionsDialogViewStyle channelActionsDialogViewStyle = this.style;
        if (channelActionsDialogViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        for (ChannelAction channelAction : ((DefaultChannelOptionItemsFactory) channelOptionItemsFactoryDefaultFactory).createChannelOptionItems(channel, ownCapabilities, channelActionsDialogViewStyle)) {
            Context contextRequireContext2 = requireContext();
            AbstractC22676k.m65749i(contextRequireContext2, "requireContext(...)");
            LayoutInflater streamThemeInflater = ContextKt.getStreamThemeInflater(contextRequireContext2);
            int i13 = C19469R.layout.stream_ui_channel_option_item;
            StreamUiFragmentChannelActionsBinding streamUiFragmentChannelActionsBinding2 = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentChannelActionsBinding2);
            View viewInflate = streamThemeInflater.inflate(i13, (ViewGroup) streamUiFragmentChannelActionsBinding2.optionsContainer, false);
            AbstractC22676k.m65748h(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewInflate;
            if (channelAction.getIsDestructive()) {
                ChannelActionsDialogViewStyle channelActionsDialogViewStyle2 = this.style;
                if (channelActionsDialogViewStyle2 == null) {
                    AbstractC22676k.m65757q("style");
                    throw null;
                }
                itemTextStyle = channelActionsDialogViewStyle2.getWarningItemTextStyle();
            } else {
                ChannelActionsDialogViewStyle channelActionsDialogViewStyle3 = this.style;
                if (channelActionsDialogViewStyle3 == null) {
                    AbstractC22676k.m65757q("style");
                    throw null;
                }
                itemTextStyle = channelActionsDialogViewStyle3.getItemTextStyle();
            }
            textView.setText(channelAction.getLabel());
            Context contextRequireContext3 = requireContext();
            AbstractC22676k.m65749i(contextRequireContext3, "requireContext(...)");
            Drawable drawable = AbstractC32122c.getDrawable(contextRequireContext3, channelAction.getIcon());
            if (drawable != null) {
                drawable.mutate();
                drawable.setTint(itemTextStyle.getColor());
            } else {
                drawable = null;
            }
            TextViewKt.setStartDrawable(textView, drawable);
            textView.setOnClickListener(new ViewOnClickListenerC2292a(2, this, channelAction));
            TextStyleKt.setTextStyle(textView, itemTextStyle);
            StreamUiFragmentChannelActionsBinding streamUiFragmentChannelActionsBinding3 = this._binding;
            AbstractC22676k.m65747g(streamUiFragmentChannelActionsBinding3);
            streamUiFragmentChannelActionsBinding3.optionsContainer.addView(textView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindChannelOptions$lambda$7$lambda$6(ChannelActionsDialogFragment channelActionsDialogFragment, ChannelAction channelAction, View view) {
        ChannelOptionClickListener channelOptionClickListener = channelActionsDialogFragment.channelOptionClickListener;
        if (channelOptionClickListener != null) {
            channelOptionClickListener.onChannelOptionClick(channelAction);
        }
        channelActionsDialogFragment.dismiss();
    }

    private static final InterfaceC1563a2 channelActionsViewModel_delegate$lambda$0(ChannelActionsDialogFragment channelActionsDialogFragment) {
        return new ChannelActionsViewModelFactory(channelActionsDialogFragment.getCid());
    }

    private final StreamUiFragmentChannelActionsBinding getBinding() {
        StreamUiFragmentChannelActionsBinding streamUiFragmentChannelActionsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelActionsBinding);
        return streamUiFragmentChannelActionsBinding;
    }

    private final ChannelActionsViewModel getChannelActionsViewModel() {
        return (ChannelActionsViewModel) this.channelActionsViewModel.getValue();
    }

    private final String getCid() {
        Channel channel = this.channel;
        if (channel != null) {
            return channel.getCid();
        }
        AbstractC22676k.m65757q("channel");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 membersAdapter$lambda$1(ChannelActionsDialogFragment channelActionsDialogFragment, Member it) {
        AbstractC22676k.m65750j(it, "it");
        ChannelMemberClickListener channelMemberClickListener = channelActionsDialogFragment.channelMemberClickListener;
        if (channelMemberClickListener != null) {
            channelMemberClickListener.onMemberClick(it);
        }
        return C23454a0.f92919a;
    }

    private final void setupDialog() {
        StreamUiFragmentChannelActionsBinding streamUiFragmentChannelActionsBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelActionsBinding);
        streamUiFragmentChannelActionsBinding.recyclerView.setAdapter(this.membersAdapter);
        StreamUiFragmentChannelActionsBinding streamUiFragmentChannelActionsBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelActionsBinding2);
        LinearLayout linearLayout = streamUiFragmentChannelActionsBinding2.channelActionsContainer;
        ChannelActionsDialogViewStyle channelActionsDialogViewStyle = this.style;
        if (channelActionsDialogViewStyle == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        linearLayout.setBackground(channelActionsDialogViewStyle.getBackground());
        StreamUiFragmentChannelActionsBinding streamUiFragmentChannelActionsBinding3 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelActionsBinding3);
        TextView channelMembersTextView = streamUiFragmentChannelActionsBinding3.channelMembersTextView;
        AbstractC22676k.m65749i(channelMembersTextView, "channelMembersTextView");
        ChannelActionsDialogViewStyle channelActionsDialogViewStyle2 = this.style;
        if (channelActionsDialogViewStyle2 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        TextStyleKt.setTextStyle(channelMembersTextView, channelActionsDialogViewStyle2.getMemberNamesTextStyle());
        StreamUiFragmentChannelActionsBinding streamUiFragmentChannelActionsBinding4 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentChannelActionsBinding4);
        TextView channelMembersInfoTextView = streamUiFragmentChannelActionsBinding4.channelMembersInfoTextView;
        AbstractC22676k.m65749i(channelMembersInfoTextView, "channelMembersInfoTextView");
        ChannelActionsDialogViewStyle channelActionsDialogViewStyle3 = this.style;
        if (channelActionsDialogViewStyle3 == null) {
            AbstractC22676k.m65757q("style");
            throw null;
        }
        TextStyleKt.setTextStyle(channelMembersInfoTextView, channelActionsDialogViewStyle3.getMemberInfoTextStyle());
        getChannelActionsViewModel().getChannel().observe(getViewLifecycleOwner(), new ChannelActionsDialogFragment$sam$androidx_lifecycle_Observer$0(new C19626a(this, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setupDialog$lambda$3(ChannelActionsDialogFragment channelActionsDialogFragment, Channel channel) {
        AbstractC22676k.m65747g(channel);
        channelActionsDialogFragment.channel = channel;
        channelActionsDialogFragment.bindChannelInfo();
        channelActionsDialogFragment.bindChannelOptions();
        return C23454a0.f92919a;
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
        StreamUiFragmentChannelActionsBinding streamUiFragmentChannelActionsBindingInflate = StreamUiFragmentChannelActionsBinding.inflate(ContextKt.getStreamThemeInflater(contextRequireContext), container, false);
        this._binding = streamUiFragmentChannelActionsBindingInflate;
        LinearLayout root = streamUiFragmentChannelActionsBindingInflate.getRoot();
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
        boolean z4 = (this.channel == null || this.style == null) ? false : true;
        if (savedInstanceState == null && z4) {
            setupDialog();
        } else {
            dismiss();
        }
    }

    public final void setChannel(Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        this.channel = channel;
    }

    public final void setChannelMemberClickListener(ChannelMemberClickListener channelMemberClickListener) {
        AbstractC22676k.m65750j(channelMemberClickListener, "channelMemberClickListener");
        this.channelMemberClickListener = channelMemberClickListener;
    }

    public final void setChannelOptionClickListener(ChannelOptionClickListener channelOptionClickListener) {
        AbstractC22676k.m65750j(channelOptionClickListener, "channelOptionClickListener");
        this.channelOptionClickListener = channelOptionClickListener;
    }

    public final void setStyle(ChannelActionsDialogViewStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
    }
}
