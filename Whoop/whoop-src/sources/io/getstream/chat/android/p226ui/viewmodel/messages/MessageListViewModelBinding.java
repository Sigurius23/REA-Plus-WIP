package io.getstream.chat.android.p226ui.viewmodel.messages;

import android.os.Bundle;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.InterfaceC1357w1;
import androidx.lifecycle.InterfaceC1585g0;
import c93.InterfaceC4339a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import i01.C17841d;
import io.getstream.chat.android.client.api.state.EventObserver;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController;
import io.getstream.chat.android.p226ui.common.state.messages.list.GiphyAction;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryActivity;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryResultItem;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryResultItemKt;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.AddPollCommentDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.SuggestPollOptionDialogFragment;
import io.getstream.chat.android.p226ui.utils.PermissionChecker;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import java.util.Set;
import l83.C23454a0;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;", ProfileAnalyticsKt.VIEW, "Landroidx/lifecycle/g0;", "lifecycleOwner", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/viewmodel/messages/MessageListViewModel;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Landroidx/lifecycle/g0;)V", "bindView", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListViewModelBinding {
    public static final void bind(final MessageListViewModel messageListViewModel, final MessageListView view, InterfaceC1585g0 lifecycleOwner) {
        AbstractC22676k.m65750j(messageListViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        final int i13 = 0;
        messageListViewModel.getChannel().observe(lifecycleOwner, new MessageListViewModelBinding$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.messages.h
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        MessageListViewModelBinding.bindView$lambda$0(view, (Channel) obj);
                        break;
                    case 1:
                        MessageListViewModelBinding.bindView$lambda$24(view, (Set) obj);
                        break;
                    case 2:
                        MessageListViewModelBinding.bindView$lambda$25(view, (MessageListViewModel.State) obj);
                        break;
                    case 3:
                        MessageListViewModelBinding.bindView$lambda$26(view, (MessageListController.UnreadLabel) obj);
                        break;
                    default:
                        MessageListViewModelBinding.bindView$lambda$30(view, (MessageListController.ErrorEvent) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        view.setEndRegionReachedHandler(new C19945i(messageListViewModel));
        view.setBottomEndRegionReachedHandler(new C19945i(messageListViewModel));
        view.setLastMessageReadHandler(new C19945i(messageListViewModel));
        view.setMessageDeleteHandler(new C19945i(messageListViewModel));
        view.setThreadStartHandler(new C19945i(messageListViewModel));
        view.setOpenThreadHandler(new C19945i(messageListViewModel));
        if (ChatUI.getShowOriginalTranslationEnabled()) {
            view.setToggleOriginalTextHandler(new C19945i(messageListViewModel));
        }
        view.setMessageFlagHandler(new C19953q(messageListViewModel, view));
        view.setMessagePinHandler(new C19945i(messageListViewModel));
        view.setMessageUnpinHandler(new C19945i(messageListViewModel));
        view.setMessageMarkAsUnreadHandler(new C19945i(messageListViewModel));
        view.setGiphySendHandler(new C19945i(messageListViewModel));
        view.setMessageRetryHandler(new C19945i(messageListViewModel));
        view.setMessageReactionHandler(new C19945i(messageListViewModel));
        view.setMessageReplyHandler(new C19945i(messageListViewModel));
        view.setAttachmentDownloadHandler(new C19953q(view, messageListViewModel));
        view.setOnReplyMessageClickListener(new C19945i(messageListViewModel));
        view.setOnScrollToBottomHandler(new C19953q(messageListViewModel, view));
        view.setMessageUserBlockHandler(new C19945i(messageListViewModel));
        view.setMessageUserUnblockHandler(new C19945i(messageListViewModel));
        view.setOnPauseAudioRecordingAttachmentsHandler(new C19945i(messageListViewModel));
        final int i14 = 1;
        messageListViewModel.getOwnCapabilities().observe(lifecycleOwner, new MessageListViewModelBinding$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.messages.h
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        MessageListViewModelBinding.bindView$lambda$0(view, (Channel) obj);
                        break;
                    case 1:
                        MessageListViewModelBinding.bindView$lambda$24(view, (Set) obj);
                        break;
                    case 2:
                        MessageListViewModelBinding.bindView$lambda$25(view, (MessageListViewModel.State) obj);
                        break;
                    case 3:
                        MessageListViewModelBinding.bindView$lambda$26(view, (MessageListController.UnreadLabel) obj);
                        break;
                    default:
                        MessageListViewModelBinding.bindView$lambda$30(view, (MessageListController.ErrorEvent) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        final int i15 = 2;
        messageListViewModel.getState().observe(lifecycleOwner, new MessageListViewModelBinding$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.messages.h
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        MessageListViewModelBinding.bindView$lambda$0(view, (Channel) obj);
                        break;
                    case 1:
                        MessageListViewModelBinding.bindView$lambda$24(view, (Set) obj);
                        break;
                    case 2:
                        MessageListViewModelBinding.bindView$lambda$25(view, (MessageListViewModel.State) obj);
                        break;
                    case 3:
                        MessageListViewModelBinding.bindView$lambda$26(view, (MessageListController.UnreadLabel) obj);
                        break;
                    default:
                        MessageListViewModelBinding.bindView$lambda$30(view, (MessageListController.ErrorEvent) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        messageListViewModel.getLoadMoreLiveData().observe(lifecycleOwner, new MessageListViewModelBinding$sam$androidx_lifecycle_Observer$0(new MessageListViewModelBinding$bindView$25(view)));
        messageListViewModel.getTargetMessage().observe(lifecycleOwner, new MessageListViewModelBinding$sam$androidx_lifecycle_Observer$0(new MessageListViewModelBinding$bindView$26(view)));
        messageListViewModel.getShouldRequestMessagesAtBottom().observe(lifecycleOwner, new MessageListViewModelBinding$sam$androidx_lifecycle_Observer$0(new MessageListViewModelBinding$bindView$27(view)));
        messageListViewModel.getUnreadCount().observe(lifecycleOwner, new MessageListViewModelBinding$sam$androidx_lifecycle_Observer$0(new MessageListViewModelBinding$bindView$28(view)));
        final int i16 = 3;
        messageListViewModel.getUnreadLabel().observe(lifecycleOwner, new MessageListViewModelBinding$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.messages.h
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        MessageListViewModelBinding.bindView$lambda$0(view, (Channel) obj);
                        break;
                    case 1:
                        MessageListViewModelBinding.bindView$lambda$24(view, (Set) obj);
                        break;
                    case 2:
                        MessageListViewModelBinding.bindView$lambda$25(view, (MessageListViewModel.State) obj);
                        break;
                    case 3:
                        MessageListViewModelBinding.bindView$lambda$26(view, (MessageListController.UnreadLabel) obj);
                        break;
                    default:
                        MessageListViewModelBinding.bindView$lambda$30(view, (MessageListController.ErrorEvent) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        view.setAttachmentReplyOptionClickHandler(new AttachmentGalleryActivity.AttachmentReplyOptionHandler() { // from class: io.getstream.chat.android.ui.viewmodel.messages.j
            @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentReplyOptionHandler
            public final void onClick(AttachmentGalleryResultItem attachmentGalleryResultItem) {
                MessageListViewModelBinding.bindView$lambda$27(messageListViewModel, attachmentGalleryResultItem);
            }
        });
        view.setAttachmentShowInChatOptionClickHandler(new AttachmentGalleryActivity.AttachmentShowInChatOptionHandler() { // from class: io.getstream.chat.android.ui.viewmodel.messages.k
            @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentShowInChatOptionHandler
            public final void onClick(AttachmentGalleryResultItem attachmentGalleryResultItem) {
                MessageListViewModelBinding.bindView$lambda$28(messageListViewModel, attachmentGalleryResultItem);
            }
        });
        view.setAttachmentDeleteOptionClickHandler(new AttachmentGalleryActivity.AttachmentDeleteOptionHandler() { // from class: io.getstream.chat.android.ui.viewmodel.messages.l
            @Override // io.getstream.chat.android.ui.feature.gallery.AttachmentGalleryActivity.AttachmentDeleteOptionHandler
            public final void onClick(AttachmentGalleryResultItem attachmentGalleryResultItem) {
                MessageListViewModelBinding.bindView$lambda$29(messageListViewModel, attachmentGalleryResultItem);
            }
        });
        final int i17 = 4;
        messageListViewModel.getErrorEvents().observe(lifecycleOwner, new EventObserver(new Function1() { // from class: io.getstream.chat.android.ui.viewmodel.messages.h
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        MessageListViewModelBinding.bindView$lambda$0(view, (Channel) obj);
                        break;
                    case 1:
                        MessageListViewModelBinding.bindView$lambda$24(view, (Set) obj);
                        break;
                    case 2:
                        MessageListViewModelBinding.bindView$lambda$25(view, (MessageListViewModel.State) obj);
                        break;
                    case 3:
                        MessageListViewModelBinding.bindView$lambda$26(view, (MessageListController.UnreadLabel) obj);
                        break;
                    default:
                        MessageListViewModelBinding.bindView$lambda$30(view, (MessageListController.ErrorEvent) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        }));
        view.setOnUnreadLabelClickListener(new C19945i(messageListViewModel));
        view.setOnUnreadLabelReachedListener(new MessageListView.OnUnreadLabelReachedListener() { // from class: io.getstream.chat.android.ui.viewmodel.messages.m
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnUnreadLabelReachedListener
            public final void onUnreadLabelReached() {
                MessageListViewModelBinding.bindView$lambda$32(messageListViewModel);
            }
        });
        view.setOnPollOptionClickListener(new MessageListView.OnPollOptionClickListener() { // from class: io.getstream.chat.android.ui.viewmodel.messages.n
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnPollOptionClickListener
            public final boolean onPollOptionClick(Message message, Poll poll, Option option) {
                MessageListViewModelBinding.bindView$lambda$34(messageListViewModel, message, poll, option);
                return true;
            }
        });
        view.setOnPollCloseClickListener(new MessageListView.OnPollCloseClickListener() { // from class: io.getstream.chat.android.ui.viewmodel.messages.o
            @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnPollCloseClickListener
            public final boolean onPollCloseClick(Poll poll) {
                MessageListViewModelBinding.bindView$lambda$36(messageListViewModel, poll);
                return true;
            }
        });
        AbstractC1329o1 fragmentManager = ContextKt.getFragmentManager(view.getContext());
        if (fragmentManager != null) {
            final int i18 = 0;
            fragmentManager.m4170g0(SuggestPollOptionDialogFragment.REQUEST_KEY, lifecycleOwner, new InterfaceC1357w1() { // from class: io.getstream.chat.android.ui.viewmodel.messages.p
                @Override // androidx.fragment.app.InterfaceC1357w1
                /* JADX INFO: renamed from: a */
                public final void mo4108a(Bundle bundle, String str) {
                    switch (i18) {
                        case 0:
                            MessageListViewModelBinding.bindView$lambda$37(messageListViewModel, str, bundle);
                            break;
                        default:
                            MessageListViewModelBinding.bindView$lambda$39(messageListViewModel, str, bundle);
                            break;
                    }
                }
            });
        }
        AbstractC1329o1 fragmentManager2 = ContextKt.getFragmentManager(view.getContext());
        if (fragmentManager2 != null) {
            final int i19 = 1;
            fragmentManager2.m4170g0(AddPollCommentDialogFragment.REQUEST_KEY, lifecycleOwner, new InterfaceC1357w1() { // from class: io.getstream.chat.android.ui.viewmodel.messages.p
                @Override // androidx.fragment.app.InterfaceC1357w1
                /* JADX INFO: renamed from: a */
                public final void mo4108a(Bundle bundle, String str) {
                    switch (i19) {
                        case 0:
                            MessageListViewModelBinding.bindView$lambda$37(messageListViewModel, str, bundle);
                            break;
                        default:
                            MessageListViewModelBinding.bindView$lambda$39(messageListViewModel, str, bundle);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$0(MessageListView messageListView, Channel channel) {
        AbstractC22676k.m65747g(channel);
        messageListView.updateChannel(channel);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$10(MessageListViewModel messageListViewModel, Message it) {
        AbstractC22676k.m65750j(it, "it");
        messageListViewModel.onEvent(new MessageListViewModel.Event.UnpinMessage(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$11(MessageListViewModel messageListViewModel, Message it) {
        AbstractC22676k.m65750j(it, "it");
        messageListViewModel.onEvent(new MessageListViewModel.Event.MarkAsUnreadMessage(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$12(MessageListViewModel messageListViewModel, GiphyAction giphyAction) {
        AbstractC22676k.m65750j(giphyAction, "giphyAction");
        messageListViewModel.onEvent(new MessageListViewModel.Event.GiphyActionSelected(giphyAction));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$13(MessageListViewModel messageListViewModel, Message it) {
        AbstractC22676k.m65750j(it, "it");
        messageListViewModel.onEvent(new MessageListViewModel.Event.RetryMessage(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$14(MessageListViewModel messageListViewModel, Message message, String reactionType) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(reactionType, "reactionType");
        messageListViewModel.onEvent(new MessageListViewModel.Event.MessageReaction(message, reactionType, ChatUI.getReactionPushEmojiFactory().emojiCode(reactionType), false, 8, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$15(MessageListViewModel messageListViewModel, String cid, Message message) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(message, "message");
        messageListViewModel.onEvent(new MessageListViewModel.Event.ReplyMessage(cid, message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$17(MessageListView messageListView, MessageListViewModel messageListViewModel, InterfaceC4339a downloadAttachmentCall) {
        AbstractC22676k.m65750j(downloadAttachmentCall, "downloadAttachmentCall");
        PermissionChecker.checkWriteStoragePermissions$default(new PermissionChecker(), messageListView, null, new C17841d(21, messageListViewModel, downloadAttachmentCall), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$17$lambda$16(MessageListViewModel messageListViewModel, InterfaceC4339a interfaceC4339a) {
        messageListViewModel.onEvent(new MessageListViewModel.Event.DownloadAttachment(interfaceC4339a));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindView$lambda$18(MessageListViewModel messageListViewModel, Message replyTo) {
        AbstractC22676k.m65750j(replyTo, "replyTo");
        messageListViewModel.onEvent(new MessageListViewModel.Event.ShowMessage(replyTo.getId(), replyTo.getParentId()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(MessageListViewModel messageListViewModel, String str) {
        messageListViewModel.onEvent(new MessageListViewModel.Event.BottomEndRegionReached(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$20(MessageListViewModel messageListViewModel, MessageListView messageListView) {
        MessageListViewModel.scrollToBottom$default(messageListViewModel, 0, new C19938b(messageListView, 3), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$20$lambda$19(MessageListView messageListView) {
        messageListView.scrollToBottom();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$21(MessageListViewModel messageListViewModel, Message message) {
        AbstractC22676k.m65750j(message, "message");
        messageListViewModel.onEvent(new MessageListViewModel.Event.BlockUser(message.getUser().getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$22(MessageListViewModel messageListViewModel, Message it) {
        AbstractC22676k.m65750j(it, "it");
        messageListViewModel.onEvent(new MessageListViewModel.Event.UnblockUser(it.getUser().getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$24(MessageListView messageListView, Set set) {
        AbstractC22676k.m65747g(set);
        messageListView.setOwnCapabilities(set);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$25(MessageListView messageListView, MessageListViewModel.State state) {
        if (state instanceof MessageListViewModel.State.Loading) {
            messageListView.hideEmptyStateView();
            messageListView.showLoadingView();
        } else if (state instanceof MessageListViewModel.State.Result) {
            MessageListViewModel.State.Result result = (MessageListViewModel.State.Result) state;
            if (result.getMessageListItem().getItems().isEmpty()) {
                messageListView.showEmptyStateView();
            } else {
                messageListView.hideEmptyStateView();
            }
            messageListView.displayNewMessages(result.getMessageListItem());
            messageListView.hideLoadingView();
        } else if (!AbstractC22676k.m65745e(state, MessageListViewModel.State.NavigateUp.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$26(MessageListView messageListView, MessageListController.UnreadLabel unreadLabel) {
        boolean buttonVisibility = unreadLabel.getButtonVisibility();
        if (buttonVisibility) {
            messageListView.showUnreadLabelButton(unreadLabel.getUnreadCount());
        } else {
            if (buttonVisibility) {
                throw new NoWhenBranchMatchedException();
            }
            messageListView.hideUnreadLabelButton();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$27(MessageListViewModel messageListViewModel, AttachmentGalleryResultItem result) {
        AbstractC22676k.m65750j(result, "result");
        messageListViewModel.onEvent(new MessageListViewModel.Event.ReplyAttachment(result.getCid(), result.getMessageId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$28(MessageListViewModel messageListViewModel, AttachmentGalleryResultItem result) {
        AbstractC22676k.m65750j(result, "result");
        messageListViewModel.onEvent(new MessageListViewModel.Event.ShowMessage(result.getMessageId(), result.getParentId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$29(MessageListViewModel messageListViewModel, AttachmentGalleryResultItem result) {
        AbstractC22676k.m65750j(result, "result");
        messageListViewModel.onEvent(new MessageListViewModel.Event.RemoveAttachment(result.getMessageId(), AttachmentGalleryResultItemKt.toAttachment(result)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$30(MessageListView messageListView, MessageListController.ErrorEvent it) {
        AbstractC22676k.m65750j(it, "it");
        messageListView.showError(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$31(MessageListViewModel messageListViewModel) {
        messageListViewModel.onEvent(new MessageListViewModel.Event.HideUnreadLabel(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$32(MessageListViewModel messageListViewModel) {
        messageListViewModel.onEvent(new MessageListViewModel.Event.HideUnreadLabel(false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindView$lambda$34(MessageListViewModel messageListViewModel, Message message, Poll poll, Option option) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(option, "option");
        messageListViewModel.onEvent(new MessageListViewModel.Event.PollOptionUpdated(message, poll, option));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindView$lambda$36(MessageListViewModel messageListViewModel, Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        messageListViewModel.onEvent(new MessageListViewModel.Event.PollClosed(poll));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$37(MessageListViewModel messageListViewModel, String str, Bundle bundle) {
        String string;
        String string2;
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(bundle, "bundle");
        String string3 = bundle.getString(SuggestPollOptionDialogFragment.BUNDLE_KEY_POLL_ID);
        if (string3 == null || (string = bundle.getString(SuggestPollOptionDialogFragment.BUNDLE_KEY_OPTION_TEXT)) == null || (string2 = AbstractC39414r.m125869O0(string).toString()) == null) {
            return;
        }
        if (string2.length() <= 0) {
            string2 = null;
        }
        if (string2 != null) {
            messageListViewModel.onEvent(new MessageListViewModel.Event.PollOptionSuggested(string3, string2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$39(MessageListViewModel messageListViewModel, String str, Bundle bundle) {
        String string;
        String string2;
        String string3;
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(bundle, "bundle");
        String string4 = bundle.getString(AddPollCommentDialogFragment.BUNDLE_KEY_MESSAGE_ID);
        if (string4 == null || (string = bundle.getString(AddPollCommentDialogFragment.BUNDLE_KEY_POLL_ID)) == null || (string2 = bundle.getString(AddPollCommentDialogFragment.BUNDLE_KEY_ANSWER)) == null || (string3 = AbstractC39414r.m125869O0(string2).toString()) == null) {
            return;
        }
        if (string3.length() <= 0) {
            string3 = null;
        }
        if (string3 != null) {
            messageListViewModel.onEvent(new MessageListViewModel.Event.PollAnswerCast(string4, string, string3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$4(MessageListViewModel messageListViewModel, Message it) {
        AbstractC22676k.m65750j(it, "it");
        messageListViewModel.onEvent(new MessageListViewModel.Event.DeleteMessage(it, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$5(MessageListViewModel messageListViewModel, Message it) {
        AbstractC22676k.m65750j(it, "it");
        messageListViewModel.onEvent(new MessageListViewModel.Event.ThreadModeEntered(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$6(MessageListViewModel messageListViewModel, Message it) {
        AbstractC22676k.m65750j(it, "it");
        messageListViewModel.onEvent(new MessageListViewModel.Event.OpenThread(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$7(MessageListViewModel messageListViewModel, Message it) {
        AbstractC22676k.m65750j(it, "it");
        messageListViewModel.onEvent(new MessageListViewModel.Event.ToggleOriginalText(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$8(MessageListViewModel messageListViewModel, MessageListView messageListView, Message it) {
        AbstractC22676k.m65750j(it, "it");
        messageListViewModel.onEvent(new MessageListViewModel.Event.FlagMessage(it, null, C25272z.f99163w, new MessageListViewModelBinding$bindView$9$1(messageListView)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$9(MessageListViewModel messageListViewModel, Message it) {
        AbstractC22676k.m65750j(it, "it");
        messageListViewModel.onEvent(new MessageListViewModel.Event.PinMessage(it));
    }
}
