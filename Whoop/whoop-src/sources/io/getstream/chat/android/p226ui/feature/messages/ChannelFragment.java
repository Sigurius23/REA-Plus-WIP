package io.getstream.chat.android.p226ui.feature.messages;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1643y1;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1620r;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import e93.AbstractC12889b;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.state.messages.Edit;
import io.getstream.chat.android.p226ui.common.state.messages.MessageMode;
import io.getstream.chat.android.p226ui.common.state.messages.Reply;
import io.getstream.chat.android.p226ui.common.state.messages.list.DeleteMessage;
import io.getstream.chat.android.p226ui.common.state.messages.list.EditMessage;
import io.getstream.chat.android.p226ui.common.state.messages.list.ModeratedMessageOption;
import io.getstream.chat.android.p226ui.common.state.messages.list.SendAnyway;
import io.getstream.chat.android.p226ui.databinding.StreamUiFragmentMessageListBinding;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryActivity;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryResultItem;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerView;
import io.getstream.chat.android.p226ui.feature.messages.header.ChannelHeaderView;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.viewmodel.messages.ChannelHeaderViewModel;
import io.getstream.chat.android.p226ui.viewmodel.messages.ChannelHeaderViewModelBinding;
import io.getstream.chat.android.p226ui.viewmodel.messages.ChannelViewModelFactory;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageComposerViewModel;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageComposerViewModelBinding;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageListViewModel;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageListViewModelBinding;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 [2\u00020\u0001:\u0003\\][B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0016¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010\u0003R\u001b\u0010+\u001a\u00020&8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u0010.\u001a\u00020\u00158DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0017R\u001d\u00101\u001a\u0004\u0018\u00010&8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u001b\u00106\u001a\u0002028DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u00105R\u001b\u00109\u001a\u0002028DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u00105R\u001b\u0010>\u001a\u00020:8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b;\u0010(\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b@\u0010(\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bE\u0010(\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010(\u001a\u0004\bK\u0010LR$\u0010O\u001a\u0004\u0018\u00010N8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020U8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006^"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/content/Context;", "context", "Ll83/a0;", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "getTheme", "()I", "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;", "channelHeaderView", "setupChannelHeader", "(Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderView;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;", "messageListView", "setupMessageList", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)V", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;", "messageComposerView", "setupMessageComposer", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V", "onDestroyView", "onDetach", "", "cid$delegate", "Ll83/h;", "getCid", "()Ljava/lang/String;", ChannelFragment.ARG_CHANNEL_ID, "themeResId$delegate", "getThemeResId", "themeResId", "messageId$delegate", "getMessageId", "messageId", "", "showHeader$delegate", "getShowHeader", "()Z", "showHeader", "threadLoadOlderToNewer$delegate", "getThreadLoadOlderToNewer", "threadLoadOlderToNewer", "Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;", "factory$delegate", "getFactory", "()Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;", "factory", "Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;", "channelHeaderViewModel$delegate", "getChannelHeaderViewModel", "()Lio/getstream/chat/android/ui/viewmodel/messages/ChannelHeaderViewModel;", "channelHeaderViewModel", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;", "messageListViewModel$delegate", "getMessageListViewModel", "()Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;", "messageListViewModel", "Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;", "messageComposerViewModel$delegate", "getMessageComposerViewModel", "()Lio/getstream/chat/android/ui/viewmodel/messages/MessageComposerViewModel;", "messageComposerViewModel", "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;", "backPressListener", "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;", "getBackPressListener", "()Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;", "setBackPressListener", "(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;)V", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;", "_binding", "Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiFragmentMessageListBinding;", "binding", "Companion", "BackPressListener", "Builder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class ChannelFragment extends AbstractComponentCallbacksC1320m0 {
    private static final String ARG_CHANNEL_ID = "cid";
    private static final String ARG_MESSAGE_ID = "message_id";
    private static final String ARG_SHOW_HEADER = "show_header";
    private static final String ARG_THEME_RES_ID = "theme_res_id";
    private static final String ARG_THREAD_LOAD_OLDER_TO_NEWER = "thread_load_older_to_newer";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private StreamUiFragmentMessageListBinding _binding;
    private BackPressListener backPressListener;

    /* JADX INFO: renamed from: channelHeaderViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h channelHeaderViewModel;

    /* JADX INFO: renamed from: cid$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h cid;

    /* JADX INFO: renamed from: factory$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h factory;

    /* JADX INFO: renamed from: messageComposerViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h messageComposerViewModel;

    /* JADX INFO: renamed from: messageId$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h messageId;

    /* JADX INFO: renamed from: messageListViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h messageListViewModel;

    /* JADX INFO: renamed from: showHeader$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h showHeader;

    /* JADX INFO: renamed from: themeResId$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h themeResId;

    /* JADX INFO: renamed from: threadLoadOlderToNewer$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h threadLoadOlderToNewer;

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$BackPressListener;", "", "Ll83/a0;", "onBackPress", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface BackPressListener {
        void onBackPress();
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\tJ\u001d\u0010\u000f\u001a\u00020\u0000\"\b\b\u0000\u0010\u0010*\u00020\f2\u0006\u0010\u000b\u001a\u0002H\u0010¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;", "", ChannelFragment.ARG_CHANNEL_ID, "", "<init>", "(Ljava/lang/String;)V", "themeResId", "", "showHeader", "", "messageId", "fragment", "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;", "threadLoadOlderToNewer", "customTheme", "setFragment", "T", "(Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;", "build", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private final String cid;
        private ChannelFragment fragment;
        private String messageId;
        private boolean showHeader;
        private int themeResId;
        private boolean threadLoadOlderToNewer;

        public Builder(String cid) {
            AbstractC22676k.m65750j(cid, "cid");
            this.cid = cid;
        }

        public final ChannelFragment build() {
            ChannelFragment channelFragment = this.fragment;
            if (channelFragment == null) {
                channelFragment = new ChannelFragment();
            }
            channelFragment.setArguments(AbstractC12889b.m36273g(new C23465k(ChannelFragment.ARG_THEME_RES_ID, Integer.valueOf(this.themeResId)), new C23465k(ChannelFragment.ARG_CHANNEL_ID, this.cid), new C23465k(ChannelFragment.ARG_MESSAGE_ID, this.messageId), new C23465k(ChannelFragment.ARG_SHOW_HEADER, Boolean.valueOf(this.showHeader)), new C23465k(ChannelFragment.ARG_THREAD_LOAD_OLDER_TO_NEWER, Boolean.valueOf(this.threadLoadOlderToNewer))));
            return channelFragment;
        }

        public final Builder customTheme(int themeResId) {
            this.themeResId = themeResId;
            return this;
        }

        public final Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        public final <T extends ChannelFragment> Builder setFragment(T fragment) {
            AbstractC22676k.m65750j(fragment, "fragment");
            this.fragment = fragment;
            return this;
        }

        public final Builder showHeader(boolean showHeader) {
            this.showHeader = showHeader;
            return this;
        }

        public final Builder threadLoadOlderToNewer(boolean threadLoadOlderToNewer) {
            this.threadLoadOlderToNewer = threadLoadOlderToNewer;
            return this;
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Companion;", "", "<init>", "()V", "", ChannelFragment.ARG_CHANNEL_ID, "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;", "Ll83/a0;", "initializer", "Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;", "newInstance", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/ui/feature/messages/ChannelFragment;", "ARG_THEME_RES_ID", "Ljava/lang/String;", "ARG_CHANNEL_ID", "ARG_MESSAGE_ID", "ARG_SHOW_HEADER", "ARG_THREAD_LOAD_OLDER_TO_NEWER", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ChannelFragment newInstance$default(Companion companion, String str, Function1 function1, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                function1 = null;
            }
            return companion.newInstance(str, function1);
        }

        public final ChannelFragment newInstance(String cid) {
            AbstractC22676k.m65750j(cid, "cid");
            return newInstance(cid, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ChannelFragment newInstance(String cid, Function1 initializer) {
            AbstractC22676k.m65750j(cid, "cid");
            Builder builder = new Builder(cid);
            if (initializer != null) {
                initializer.invoke(builder);
            }
            return builder.build();
        }
    }

    public ChannelFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        final int i13 = 0;
        this.cid = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelFragment f74586x;

            {
                this.f74586x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ChannelFragment.cid_delegate$lambda$1(this.f74586x);
                    case 1:
                        return Integer.valueOf(this.f74586x.requireArguments().getInt("theme_res_id"));
                    case 2:
                        return this.f74586x.requireArguments().getString("message_id");
                    case 3:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("show_header", false));
                    case 4:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("thread_load_older_to_newer", false));
                    case 5:
                        return ChannelFragment.factory_delegate$lambda$6(this.f74586x);
                    case 6:
                        return this.f74586x.getFactory();
                    case 7:
                        return this.f74586x.getFactory();
                    default:
                        return this.f74586x.getFactory();
                }
            }
        });
        final int i14 = 1;
        this.themeResId = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelFragment f74586x;

            {
                this.f74586x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ChannelFragment.cid_delegate$lambda$1(this.f74586x);
                    case 1:
                        return Integer.valueOf(this.f74586x.requireArguments().getInt("theme_res_id"));
                    case 2:
                        return this.f74586x.requireArguments().getString("message_id");
                    case 3:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("show_header", false));
                    case 4:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("thread_load_older_to_newer", false));
                    case 5:
                        return ChannelFragment.factory_delegate$lambda$6(this.f74586x);
                    case 6:
                        return this.f74586x.getFactory();
                    case 7:
                        return this.f74586x.getFactory();
                    default:
                        return this.f74586x.getFactory();
                }
            }
        });
        final int i15 = 2;
        this.messageId = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelFragment f74586x;

            {
                this.f74586x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return ChannelFragment.cid_delegate$lambda$1(this.f74586x);
                    case 1:
                        return Integer.valueOf(this.f74586x.requireArguments().getInt("theme_res_id"));
                    case 2:
                        return this.f74586x.requireArguments().getString("message_id");
                    case 3:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("show_header", false));
                    case 4:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("thread_load_older_to_newer", false));
                    case 5:
                        return ChannelFragment.factory_delegate$lambda$6(this.f74586x);
                    case 6:
                        return this.f74586x.getFactory();
                    case 7:
                        return this.f74586x.getFactory();
                    default:
                        return this.f74586x.getFactory();
                }
            }
        });
        final int i16 = 3;
        this.showHeader = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelFragment f74586x;

            {
                this.f74586x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return ChannelFragment.cid_delegate$lambda$1(this.f74586x);
                    case 1:
                        return Integer.valueOf(this.f74586x.requireArguments().getInt("theme_res_id"));
                    case 2:
                        return this.f74586x.requireArguments().getString("message_id");
                    case 3:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("show_header", false));
                    case 4:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("thread_load_older_to_newer", false));
                    case 5:
                        return ChannelFragment.factory_delegate$lambda$6(this.f74586x);
                    case 6:
                        return this.f74586x.getFactory();
                    case 7:
                        return this.f74586x.getFactory();
                    default:
                        return this.f74586x.getFactory();
                }
            }
        });
        final int i17 = 4;
        this.threadLoadOlderToNewer = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelFragment f74586x;

            {
                this.f74586x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return ChannelFragment.cid_delegate$lambda$1(this.f74586x);
                    case 1:
                        return Integer.valueOf(this.f74586x.requireArguments().getInt("theme_res_id"));
                    case 2:
                        return this.f74586x.requireArguments().getString("message_id");
                    case 3:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("show_header", false));
                    case 4:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("thread_load_older_to_newer", false));
                    case 5:
                        return ChannelFragment.factory_delegate$lambda$6(this.f74586x);
                    case 6:
                        return this.f74586x.getFactory();
                    case 7:
                        return this.f74586x.getFactory();
                    default:
                        return this.f74586x.getFactory();
                }
            }
        });
        final int i18 = 5;
        this.factory = AbstractC30060g.m92087G(enumC23463i, new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelFragment f74586x;

            {
                this.f74586x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return ChannelFragment.cid_delegate$lambda$1(this.f74586x);
                    case 1:
                        return Integer.valueOf(this.f74586x.requireArguments().getInt("theme_res_id"));
                    case 2:
                        return this.f74586x.requireArguments().getString("message_id");
                    case 3:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("show_header", false));
                    case 4:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("thread_load_older_to_newer", false));
                    case 5:
                        return ChannelFragment.factory_delegate$lambda$6(this.f74586x);
                    case 6:
                        return this.f74586x.getFactory();
                    case 7:
                        return this.f74586x.getFactory();
                    default:
                        return this.f74586x.getFactory();
                }
            }
        });
        final int i19 = 6;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelFragment f74586x;

            {
                this.f74586x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        return ChannelFragment.cid_delegate$lambda$1(this.f74586x);
                    case 1:
                        return Integer.valueOf(this.f74586x.requireArguments().getInt("theme_res_id"));
                    case 2:
                        return this.f74586x.requireArguments().getString("message_id");
                    case 3:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("show_header", false));
                    case 4:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("thread_load_older_to_newer", false));
                    case 5:
                        return ChannelFragment.factory_delegate$lambda$6(this.f74586x);
                    case 6:
                        return this.f74586x.getFactory();
                    case 7:
                        return this.f74586x.getFactory();
                    default:
                        return this.f74586x.getFactory();
                }
            }
        };
        InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(enumC23463i, new ChannelFragment$special$$inlined$viewModels$default$2(new ChannelFragment$special$$inlined$viewModels$default$1(this)));
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        this.channelHeaderViewModel = new C1643y1(c22673i0.getOrCreateKotlinClass(ChannelHeaderViewModel.class), new ChannelFragment$special$$inlined$viewModels$default$3(interfaceC23462hM92087G), interfaceC4339a, new ChannelFragment$special$$inlined$viewModels$default$4(null, interfaceC23462hM92087G));
        final int i24 = 7;
        InterfaceC4339a interfaceC4339a2 = new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelFragment f74586x;

            {
                this.f74586x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        return ChannelFragment.cid_delegate$lambda$1(this.f74586x);
                    case 1:
                        return Integer.valueOf(this.f74586x.requireArguments().getInt("theme_res_id"));
                    case 2:
                        return this.f74586x.requireArguments().getString("message_id");
                    case 3:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("show_header", false));
                    case 4:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("thread_load_older_to_newer", false));
                    case 5:
                        return ChannelFragment.factory_delegate$lambda$6(this.f74586x);
                    case 6:
                        return this.f74586x.getFactory();
                    case 7:
                        return this.f74586x.getFactory();
                    default:
                        return this.f74586x.getFactory();
                }
            }
        };
        InterfaceC23462h interfaceC23462hM92087G2 = AbstractC30060g.m92087G(enumC23463i, new ChannelFragment$special$$inlined$viewModels$default$7(new ChannelFragment$special$$inlined$viewModels$default$6(this)));
        this.messageListViewModel = new C1643y1(c22673i0.getOrCreateKotlinClass(MessageListViewModel.class), new ChannelFragment$special$$inlined$viewModels$default$8(interfaceC23462hM92087G2), interfaceC4339a2, new ChannelFragment$special$$inlined$viewModels$default$9(null, interfaceC23462hM92087G2));
        final int i25 = 8;
        InterfaceC4339a interfaceC4339a3 = new InterfaceC4339a(this) { // from class: io.getstream.chat.android.ui.feature.messages.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelFragment f74586x;

            {
                this.f74586x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        return ChannelFragment.cid_delegate$lambda$1(this.f74586x);
                    case 1:
                        return Integer.valueOf(this.f74586x.requireArguments().getInt("theme_res_id"));
                    case 2:
                        return this.f74586x.requireArguments().getString("message_id");
                    case 3:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("show_header", false));
                    case 4:
                        return Boolean.valueOf(this.f74586x.requireArguments().getBoolean("thread_load_older_to_newer", false));
                    case 5:
                        return ChannelFragment.factory_delegate$lambda$6(this.f74586x);
                    case 6:
                        return this.f74586x.getFactory();
                    case 7:
                        return this.f74586x.getFactory();
                    default:
                        return this.f74586x.getFactory();
                }
            }
        };
        InterfaceC23462h interfaceC23462hM92087G3 = AbstractC30060g.m92087G(enumC23463i, new ChannelFragment$special$$inlined$viewModels$default$12(new ChannelFragment$special$$inlined$viewModels$default$11(this)));
        this.messageComposerViewModel = new C1643y1(c22673i0.getOrCreateKotlinClass(MessageComposerViewModel.class), new ChannelFragment$special$$inlined$viewModels$default$13(interfaceC23462hM92087G3), interfaceC4339a3, new ChannelFragment$special$$inlined$viewModels$default$14(null, interfaceC23462hM92087G3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cid_delegate$lambda$1(ChannelFragment channelFragment) {
        String string = channelFragment.requireArguments().getString(ARG_CHANNEL_ID);
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Channel cid must not be null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelViewModelFactory factory_delegate$lambda$6(ChannelFragment channelFragment) {
        Context applicationContext = channelFragment.requireContext().getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        return new ChannelViewModelFactory(applicationContext, channelFragment.getCid(), channelFragment.getMessageId(), null, null, null, null, null, null, 0, false, 0, false, null, null, null, null, false, false, channelFragment.getThreadLoadOlderToNewer(), false, 1572856, null);
    }

    public static final ChannelFragment newInstance(String str) {
        return INSTANCE.newInstance(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setupMessageComposer$lambda$15(ChannelFragment channelFragment, MessageMode messageMode) {
        if (messageMode instanceof MessageMode.MessageThread) {
            MessageMode.MessageThread messageThread = (MessageMode.MessageThread) messageMode;
            channelFragment.getChannelHeaderViewModel().setActiveThread(messageThread.getParentMessage());
            channelFragment.getMessageComposerViewModel().setMessageMode(new MessageMode.MessageThread(messageThread.getParentMessage(), null, 2, null));
        } else {
            if (!(messageMode instanceof MessageMode.Normal)) {
                throw new NoWhenBranchMatchedException();
            }
            channelFragment.getChannelHeaderViewModel().resetThread();
            channelFragment.getMessageComposerViewModel().leaveThread();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMessageComposer$lambda$16(ChannelFragment channelFragment, String str, Message message) {
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(message, "message");
        channelFragment.getMessageComposerViewModel().performMessageAction(new Reply(message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMessageComposer$lambda$17(ChannelFragment channelFragment, Message message) {
        AbstractC22676k.m65750j(message, "message");
        channelFragment.getMessageComposerViewModel().performMessageAction(new Edit(message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMessageComposer$lambda$18(ChannelFragment channelFragment, Message message, ModeratedMessageOption action) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(action, "action");
        if (action.equals(DeleteMessage.INSTANCE)) {
            channelFragment.getMessageListViewModel().onEvent(new MessageListViewModel.Event.DeleteMessage(message, false, 2, null));
        } else if (action.equals(EditMessage.INSTANCE)) {
            channelFragment.getMessageComposerViewModel().performMessageAction(new Edit(message));
        } else if (action.equals(SendAnyway.INSTANCE)) {
            channelFragment.getMessageListViewModel().onEvent(new MessageListViewModel.Event.RetryMessage(message));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMessageComposer$lambda$20(ChannelFragment channelFragment, AttachmentGalleryResultItem result) {
        AbstractC22676k.m65750j(result, "result");
        Message messageById = channelFragment.getMessageListViewModel().getMessageById(result.getMessageId());
        if (messageById != null) {
            channelFragment.getMessageComposerViewModel().performMessageAction(new Reply(messageById));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setupMessageList$lambda$13(ChannelFragment channelFragment, MessageListViewModel.State state) {
        if (!(state instanceof MessageListViewModel.State.Loading) && !(state instanceof MessageListViewModel.State.Result)) {
            if (!(state instanceof MessageListViewModel.State.NavigateUp)) {
                throw new NoWhenBranchMatchedException();
            }
            BackPressListener backPressListener = channelFragment.backPressListener;
            if (backPressListener == null) {
                AbstractActivityC1340r0 activity = channelFragment.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            } else if (backPressListener != null) {
                backPressListener.onBackPress();
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMessageList$lambda$14(ChannelFragment channelFragment, Message message, ModeratedMessageOption action) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(action, "action");
        if (action.equals(DeleteMessage.INSTANCE)) {
            channelFragment.getMessageListViewModel().onEvent(new MessageListViewModel.Event.DeleteMessage(message, false, 2, null));
        } else if (action.equals(EditMessage.INSTANCE)) {
            channelFragment.getMessageComposerViewModel().performMessageAction(new Edit(message));
        } else if (action.equals(SendAnyway.INSTANCE)) {
            channelFragment.getMessageListViewModel().onEvent(new MessageListViewModel.Event.RetryMessage(message));
        }
    }

    public final BackPressListener getBackPressListener() {
        return this.backPressListener;
    }

    public final StreamUiFragmentMessageListBinding getBinding() {
        StreamUiFragmentMessageListBinding streamUiFragmentMessageListBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentMessageListBinding);
        return streamUiFragmentMessageListBinding;
    }

    public final ChannelHeaderViewModel getChannelHeaderViewModel() {
        return (ChannelHeaderViewModel) this.channelHeaderViewModel.getValue();
    }

    public final String getCid() {
        return (String) this.cid.getValue();
    }

    public final ChannelViewModelFactory getFactory() {
        return (ChannelViewModelFactory) this.factory.getValue();
    }

    public final MessageComposerViewModel getMessageComposerViewModel() {
        return (MessageComposerViewModel) this.messageComposerViewModel.getValue();
    }

    public final String getMessageId() {
        return (String) this.messageId.getValue();
    }

    public final MessageListViewModel getMessageListViewModel() {
        return (MessageListViewModel) this.messageListViewModel.getValue();
    }

    public final boolean getShowHeader() {
        return ((Boolean) this.showHeader.getValue()).booleanValue();
    }

    public final int getTheme() {
        return getThemeResId();
    }

    public final int getThemeResId() {
        return ((Number) this.themeResId.getValue()).intValue();
    }

    public final boolean getThreadLoadOlderToNewer() {
        return ((Boolean) this.threadLoadOlderToNewer.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onAttach(Context context) {
        AbstractC22676k.m65750j(context, "context");
        super.onAttach(context);
        InterfaceC1620r parentFragment = getParentFragment();
        if (!(parentFragment instanceof BackPressListener)) {
            parentFragment = null;
        }
        BackPressListener backPressListener = (BackPressListener) parentFragment;
        if (backPressListener == null) {
            AbstractActivityC1340r0 activity = getActivity();
            backPressListener = (BackPressListener) (activity instanceof BackPressListener ? activity : null);
        }
        this.backPressListener = backPressListener;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        if (getThemeResId() != 0) {
            inflater = inflater.cloneInContext(new ContextThemeWrapper(getContext(), getThemeResId()));
        }
        StreamUiFragmentMessageListBinding streamUiFragmentMessageListBindingInflate = StreamUiFragmentMessageListBinding.inflate(inflater, container, false);
        this._binding = streamUiFragmentMessageListBindingInflate;
        ConstraintLayout root = streamUiFragmentMessageListBindingInflate.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDetach() {
        super.onDetach();
        this.backPressListener = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        StreamUiFragmentMessageListBinding streamUiFragmentMessageListBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentMessageListBinding);
        ChannelHeaderView channelHeaderView = streamUiFragmentMessageListBinding.channelHeaderView;
        AbstractC22676k.m65749i(channelHeaderView, "channelHeaderView");
        setupChannelHeader(channelHeaderView);
        StreamUiFragmentMessageListBinding streamUiFragmentMessageListBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentMessageListBinding2);
        MessageListView messageListView = streamUiFragmentMessageListBinding2.messageListView;
        AbstractC22676k.m65749i(messageListView, "messageListView");
        setupMessageList(messageListView);
        StreamUiFragmentMessageListBinding streamUiFragmentMessageListBinding3 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentMessageListBinding3);
        MessageComposerView messageComposerView = streamUiFragmentMessageListBinding3.messageComposerView;
        AbstractC22676k.m65749i(messageComposerView, "messageComposerView");
        setupMessageComposer(messageComposerView);
    }

    public final void setBackPressListener(BackPressListener backPressListener) {
        this.backPressListener = backPressListener;
    }

    public final void setupChannelHeader(ChannelHeaderView channelHeaderView) {
        AbstractC22676k.m65750j(channelHeaderView, "channelHeaderView");
        if (!getShowHeader()) {
            channelHeaderView.setVisibility(8);
            return;
        }
        ChannelHeaderViewModel channelHeaderViewModel = getChannelHeaderViewModel();
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ChannelHeaderViewModelBinding.bind(channelHeaderViewModel, channelHeaderView, viewLifecycleOwner);
        channelHeaderView.setBackButtonClickListener(new C19670a(this, 0));
    }

    public final void setupMessageComposer(MessageComposerView messageComposerView) {
        AbstractC22676k.m65750j(messageComposerView, "messageComposerView");
        MessageComposerViewModel messageComposerViewModel = getMessageComposerViewModel();
        StreamUiFragmentMessageListBinding streamUiFragmentMessageListBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentMessageListBinding);
        MessageComposerView messageComposerView2 = streamUiFragmentMessageListBinding.messageComposerView;
        AbstractC22676k.m65749i(messageComposerView2, "messageComposerView");
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        MessageComposerViewModelBinding.bind$default(messageComposerViewModel, messageComposerView2, viewLifecycleOwner, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777212, null);
        getMessageListViewModel().getMode().observe(getViewLifecycleOwner(), new ChannelFragment$sam$androidx_lifecycle_Observer$0(new C19671b(this, 1)));
        StreamUiFragmentMessageListBinding streamUiFragmentMessageListBinding2 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentMessageListBinding2);
        streamUiFragmentMessageListBinding2.messageListView.setMessageReplyHandler(new C19670a(this, 2));
        StreamUiFragmentMessageListBinding streamUiFragmentMessageListBinding3 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentMessageListBinding3);
        streamUiFragmentMessageListBinding3.messageListView.setMessageEditHandler(new C19670a(this, 3));
        StreamUiFragmentMessageListBinding streamUiFragmentMessageListBinding4 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentMessageListBinding4);
        streamUiFragmentMessageListBinding4.messageListView.setModeratedMessageHandler(new C19670a(this, 4));
        StreamUiFragmentMessageListBinding streamUiFragmentMessageListBinding5 = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentMessageListBinding5);
        streamUiFragmentMessageListBinding5.messageListView.setAttachmentReplyOptionClickHandler(new AttachmentGalleryActivity.AttachmentReplyOptionHandler() { // from class: io.getstream.chat.android.ui.feature.messages.c
            @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentReplyOptionHandler
            public final void onClick(AttachmentGalleryResultItem attachmentGalleryResultItem) {
                ChannelFragment.setupMessageComposer$lambda$20(this.f74522a, attachmentGalleryResultItem);
            }
        });
    }

    public final void setupMessageList(MessageListView messageListView) {
        AbstractC22676k.m65750j(messageListView, "messageListView");
        MessageListViewModel messageListViewModel = getMessageListViewModel();
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        MessageListViewModelBinding.bind(messageListViewModel, messageListView, viewLifecycleOwner);
        getMessageListViewModel().getState().observe(getViewLifecycleOwner(), new ChannelFragment$sam$androidx_lifecycle_Observer$0(new C19671b(this, 0)));
        StreamUiFragmentMessageListBinding streamUiFragmentMessageListBinding = this._binding;
        AbstractC22676k.m65747g(streamUiFragmentMessageListBinding);
        streamUiFragmentMessageListBinding.messageListView.setModeratedMessageHandler(new C19670a(this, 1));
    }

    public static final ChannelFragment newInstance(String str, Function1 function1) {
        return INSTANCE.newInstance(str, function1);
    }
}
