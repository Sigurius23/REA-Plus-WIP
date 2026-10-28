package io.getstream.chat.android.p226ui.helper;

import io.getstream.chat.android.p226ui.feature.channels.actions.ChannelActionsDialogViewStyle;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListFragmentViewStyle;
import io.getstream.chat.android.p226ui.feature.channels.list.ChannelListViewStyle;
import io.getstream.chat.android.p226ui.feature.gallery.AttachmentGalleryViewMediaStyle;
import io.getstream.chat.android.p226ui.feature.gallery.MediaAttachmentGridViewStyle;
import io.getstream.chat.android.p226ui.feature.gallery.options.AttachmentGalleryOptionsViewStyle;
import io.getstream.chat.android.p226ui.feature.mentions.list.MentionListViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.common.AudioRecordPlayerViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogStyle;
import io.getstream.chat.android.p226ui.feature.messages.header.ChannelHeaderViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.DefaultQuotedAttachmentViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.FileAttachmentViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.GiphyViewHolderStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageReplyStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.ScrollButtonViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.UnreadLabelButtonStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.UnsupportedAttachmentViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.MediaAttachmentViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.PollViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.edit.EditReactionsViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.SingleReactionViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.ViewReactionsViewStyle;
import io.getstream.chat.android.p226ui.feature.pinned.list.PinnedMessageListViewStyle;
import io.getstream.chat.android.p226ui.feature.search.SearchInputViewStyle;
import io.getstream.chat.android.p226ui.feature.search.list.SearchResultListViewStyle;
import io.getstream.chat.android.p226ui.feature.threads.list.ThreadListViewStyle;
import io.getstream.chat.android.p226ui.widgets.avatar.AvatarStyle;
import io.getstream.chat.android.p226ui.widgets.typing.TypingIndicatorViewStyle;
import p213i7.C18194g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010¢\u0001\u001a\t\u0012\u0005\u0012\u0003H£\u00010\u0005\"\u0005\b\u0000\u0010£\u0001H\u0002R*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u000bR*\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b#\u0010\t\"\u0004\b$\u0010\u000bR*\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b'\u0010\u0003\u001a\u0004\b(\u0010\t\"\u0004\b)\u0010\u000bR*\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b,\u0010\u0003\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010\u000bR*\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b1\u0010\u0003\u001a\u0004\b2\u0010\t\"\u0004\b3\u0010\u000bR*\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b6\u0010\u0003\u001a\u0004\b7\u0010\t\"\u0004\b8\u0010\u000bR*\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b;\u0010\u0003\u001a\u0004\b<\u0010\t\"\u0004\b=\u0010\u000bR*\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b@\u0010\u0003\u001a\u0004\bA\u0010\t\"\u0004\bB\u0010\u000bR*\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bE\u0010\u0003\u001a\u0004\bF\u0010\t\"\u0004\bG\u0010\u000bR*\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bJ\u0010\u0003\u001a\u0004\bK\u0010\t\"\u0004\bL\u0010\u000bR*\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bO\u0010\u0003\u001a\u0004\bP\u0010\t\"\u0004\bQ\u0010\u000bR*\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bT\u0010\u0003\u001a\u0004\bU\u0010\t\"\u0004\bV\u0010\u000bR*\u0010W\u001a\b\u0012\u0004\u0012\u00020X0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bY\u0010\u0003\u001a\u0004\bZ\u0010\t\"\u0004\b[\u0010\u000bR*\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b^\u0010\u0003\u001a\u0004\b_\u0010\t\"\u0004\b`\u0010\u000bR*\u0010a\u001a\b\u0012\u0004\u0012\u00020b0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bc\u0010\u0003\u001a\u0004\bd\u0010\t\"\u0004\be\u0010\u000bR*\u0010f\u001a\b\u0012\u0004\u0012\u00020g0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bh\u0010\u0003\u001a\u0004\bi\u0010\t\"\u0004\bj\u0010\u000bR*\u0010k\u001a\b\u0012\u0004\u0012\u00020l0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bm\u0010\u0003\u001a\u0004\bn\u0010\t\"\u0004\bo\u0010\u000bR*\u0010p\u001a\b\u0012\u0004\u0012\u00020q0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\br\u0010\u0003\u001a\u0004\bs\u0010\t\"\u0004\bt\u0010\u000bR*\u0010u\u001a\b\u0012\u0004\u0012\u00020v0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bw\u0010\u0003\u001a\u0004\bx\u0010\t\"\u0004\by\u0010\u000bR*\u0010z\u001a\b\u0012\u0004\u0012\u00020{0\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b|\u0010\u0003\u001a\u0004\b}\u0010\t\"\u0004\b~\u0010\u000bR.\u0010\u007f\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u0081\u0001\u0010\u0003\u001a\u0005\b\u0082\u0001\u0010\t\"\u0005\b\u0083\u0001\u0010\u000bR/\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u0086\u0001\u0010\u0003\u001a\u0005\b\u0087\u0001\u0010\t\"\u0005\b\u0088\u0001\u0010\u000bR/\u0010\u0089\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u008b\u0001\u0010\u0003\u001a\u0005\b\u008c\u0001\u0010\t\"\u0005\b\u008d\u0001\u0010\u000bR/\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u0090\u0001\u0010\u0003\u001a\u0005\b\u0091\u0001\u0010\t\"\u0005\b\u0092\u0001\u0010\u000bR/\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u0095\u0001\u0010\u0003\u001a\u0005\b\u0096\u0001\u0010\t\"\u0005\b\u0097\u0001\u0010\u000bR/\u0010\u0098\u0001\u001a\t\u0012\u0005\u0012\u00030\u0099\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u009a\u0001\u0010\u0003\u001a\u0005\b\u009b\u0001\u0010\t\"\u0005\b\u009c\u0001\u0010\u000bR/\u0010\u009d\u0001\u001a\t\u0012\u0005\u0012\u00030\u009e\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0017\n\u0000\u0012\u0005\b\u009f\u0001\u0010\u0003\u001a\u0005\b \u0001\u0010\t\"\u0005\b¡\u0001\u0010\u000b¨\u0006¤\u0001"}, m65681d2 = {"Lio/getstream/chat/android/ui/helper/TransformStyle;", "", "<init>", "()V", "avatarStyleTransformer", "Lio/getstream/chat/android/ui/helper/StyleTransformer;", "Lio/getstream/chat/android/ui/widgets/avatar/AvatarStyle;", "getAvatarStyleTransformer$annotations", "getAvatarStyleTransformer", "()Lio/getstream/chat/android/ui/helper/StyleTransformer;", "setAvatarStyleTransformer", "(Lio/getstream/chat/android/ui/helper/StyleTransformer;)V", "channelListFragmentStyleTransformer", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;", "getChannelListFragmentStyleTransformer$annotations", "getChannelListFragmentStyleTransformer", "setChannelListFragmentStyleTransformer", "channelListStyleTransformer", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListViewStyle;", "getChannelListStyleTransformer$annotations", "getChannelListStyleTransformer", "setChannelListStyleTransformer", "messageListStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "getMessageListStyleTransformer$annotations", "getMessageListStyleTransformer", "setMessageListStyleTransformer", "messageListItemStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "getMessageListItemStyleTransformer$annotations", "getMessageListItemStyleTransformer", "setMessageListItemStyleTransformer", "scrollButtonStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/ScrollButtonViewStyle;", "getScrollButtonStyleTransformer$annotations", "getScrollButtonStyleTransformer", "setScrollButtonStyleTransformer", "unreadLabelButtonStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/UnreadLabelButtonStyle;", "getUnreadLabelButtonStyleTransformer$annotations", "getUnreadLabelButtonStyleTransformer", "setUnreadLabelButtonStyleTransformer", "viewReactionsStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/ViewReactionsViewStyle;", "getViewReactionsStyleTransformer$annotations", "getViewReactionsStyleTransformer", "setViewReactionsStyleTransformer", "editReactionsStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/edit/EditReactionsViewStyle;", "getEditReactionsStyleTransformer$annotations", "getEditReactionsStyleTransformer", "setEditReactionsStyleTransformer", "singleReactionViewStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/SingleReactionViewStyle;", "getSingleReactionViewStyleTransformer$annotations", "getSingleReactionViewStyleTransformer", "setSingleReactionViewStyleTransformer", "channelActionsDialogStyleTransformer", "Lio/getstream/chat/android/ui/feature/channels/actions/ChannelActionsDialogViewStyle;", "getChannelActionsDialogStyleTransformer$annotations", "getChannelActionsDialogStyleTransformer", "setChannelActionsDialogStyleTransformer", "giphyViewHolderStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;", "getGiphyViewHolderStyleTransformer$annotations", "getGiphyViewHolderStyleTransformer", "setGiphyViewHolderStyleTransformer", "mediaAttachmentStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;", "getMediaAttachmentStyleTransformer$annotations", "getMediaAttachmentStyleTransformer", "setMediaAttachmentStyleTransformer", "pollViewStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/PollViewStyle;", "getPollViewStyleTransformer$annotations", "getPollViewStyleTransformer", "setPollViewStyleTransformer", "messageReplyStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;", "getMessageReplyStyleTransformer$annotations", "getMessageReplyStyleTransformer", "setMessageReplyStyleTransformer", "fileAttachmentStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;", "getFileAttachmentStyleTransformer$annotations", "getFileAttachmentStyleTransformer", "setFileAttachmentStyleTransformer", "unsupportedAttachmentStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/UnsupportedAttachmentViewStyle;", "getUnsupportedAttachmentStyleTransformer$annotations", "getUnsupportedAttachmentStyleTransformer", "setUnsupportedAttachmentStyleTransformer", "channelHeaderStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/header/ChannelHeaderViewStyle;", "getChannelHeaderStyleTransformer$annotations", "getChannelHeaderStyleTransformer", "setChannelHeaderStyleTransformer", "mentionListViewStyleTransformer", "Lio/getstream/chat/android/ui/feature/mentions/list/MentionListViewStyle;", "getMentionListViewStyleTransformer$annotations", "getMentionListViewStyleTransformer", "setMentionListViewStyleTransformer", "searchInputViewStyleTransformer", "Lio/getstream/chat/android/ui/feature/search/SearchInputViewStyle;", "getSearchInputViewStyleTransformer$annotations", "getSearchInputViewStyleTransformer", "setSearchInputViewStyleTransformer", "searchResultListViewStyleTransformer", "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListViewStyle;", "getSearchResultListViewStyleTransformer$annotations", "getSearchResultListViewStyleTransformer", "setSearchResultListViewStyleTransformer", "typingIndicatorViewStyleTransformer", "Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorViewStyle;", "getTypingIndicatorViewStyleTransformer$annotations", "getTypingIndicatorViewStyleTransformer", "setTypingIndicatorViewStyleTransformer", "pinnedMessageListViewStyleTransformer", "Lio/getstream/chat/android/ui/feature/pinned/list/PinnedMessageListViewStyle;", "getPinnedMessageListViewStyleTransformer$annotations", "getPinnedMessageListViewStyleTransformer", "setPinnedMessageListViewStyleTransformer", "defaultQuotedAttachmentViewStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;", "getDefaultQuotedAttachmentViewStyleTransformer$annotations", "getDefaultQuotedAttachmentViewStyleTransformer", "setDefaultQuotedAttachmentViewStyleTransformer", "attachmentGalleryOptionsStyleTransformer", "Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;", "getAttachmentGalleryOptionsStyleTransformer$annotations", "getAttachmentGalleryOptionsStyleTransformer", "setAttachmentGalleryOptionsStyleTransformer", "messageComposerStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "getMessageComposerStyleTransformer$annotations", "getMessageComposerStyleTransformer", "setMessageComposerStyleTransformer", "attachmentsPickerStyleTransformer", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "getAttachmentsPickerStyleTransformer$annotations", "getAttachmentsPickerStyleTransformer", "setAttachmentsPickerStyleTransformer", "attachmentGalleryViewMediaStyle", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryViewMediaStyle;", "getAttachmentGalleryViewMediaStyle$annotations", "getAttachmentGalleryViewMediaStyle", "setAttachmentGalleryViewMediaStyle", "mediaAttachmentGridViewStyle", "Lio/getstream/chat/android/ui/feature/gallery/MediaAttachmentGridViewStyle;", "getMediaAttachmentGridViewStyle$annotations", "getMediaAttachmentGridViewStyle", "setMediaAttachmentGridViewStyle", "audioRecordPlayerViewStyle", "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;", "getAudioRecordPlayerViewStyle$annotations", "getAudioRecordPlayerViewStyle", "setAudioRecordPlayerViewStyle", "threadListViewStyle", "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListViewStyle;", "getThreadListViewStyle$annotations", "getThreadListViewStyle", "setThreadListViewStyle", "noopTransformer", "T", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TransformStyle {
    public static final TransformStyle INSTANCE = new TransformStyle();
    private static StyleTransformer<AttachmentGalleryOptionsViewStyle> attachmentGalleryOptionsStyleTransformer;
    private static StyleTransformer<AttachmentGalleryViewMediaStyle> attachmentGalleryViewMediaStyle;
    private static StyleTransformer<AttachmentsPickerDialogStyle> attachmentsPickerStyleTransformer;
    private static StyleTransformer<AudioRecordPlayerViewStyle> audioRecordPlayerViewStyle;
    private static StyleTransformer<AvatarStyle> avatarStyleTransformer;
    private static StyleTransformer<ChannelActionsDialogViewStyle> channelActionsDialogStyleTransformer;
    private static StyleTransformer<ChannelHeaderViewStyle> channelHeaderStyleTransformer;
    private static StyleTransformer<ChannelListFragmentViewStyle> channelListFragmentStyleTransformer;
    private static StyleTransformer<ChannelListViewStyle> channelListStyleTransformer;
    private static StyleTransformer<DefaultQuotedAttachmentViewStyle> defaultQuotedAttachmentViewStyleTransformer;
    private static StyleTransformer<EditReactionsViewStyle> editReactionsStyleTransformer;
    private static StyleTransformer<FileAttachmentViewStyle> fileAttachmentStyleTransformer;
    private static StyleTransformer<GiphyViewHolderStyle> giphyViewHolderStyleTransformer;
    private static StyleTransformer<MediaAttachmentGridViewStyle> mediaAttachmentGridViewStyle;
    private static StyleTransformer<MediaAttachmentViewStyle> mediaAttachmentStyleTransformer;
    private static StyleTransformer<MentionListViewStyle> mentionListViewStyleTransformer;
    private static StyleTransformer<MessageComposerViewStyle> messageComposerStyleTransformer;
    private static StyleTransformer<MessageListItemStyle> messageListItemStyleTransformer;
    private static StyleTransformer<MessageListViewStyle> messageListStyleTransformer;
    private static StyleTransformer<MessageReplyStyle> messageReplyStyleTransformer;
    private static StyleTransformer<PinnedMessageListViewStyle> pinnedMessageListViewStyleTransformer;
    private static StyleTransformer<PollViewStyle> pollViewStyleTransformer;
    private static StyleTransformer<ScrollButtonViewStyle> scrollButtonStyleTransformer;
    private static StyleTransformer<SearchInputViewStyle> searchInputViewStyleTransformer;
    private static StyleTransformer<SearchResultListViewStyle> searchResultListViewStyleTransformer;
    private static StyleTransformer<SingleReactionViewStyle> singleReactionViewStyleTransformer;
    private static StyleTransformer<ThreadListViewStyle> threadListViewStyle;
    private static StyleTransformer<TypingIndicatorViewStyle> typingIndicatorViewStyleTransformer;
    private static StyleTransformer<UnreadLabelButtonStyle> unreadLabelButtonStyleTransformer;
    private static StyleTransformer<UnsupportedAttachmentViewStyle> unsupportedAttachmentStyleTransformer;
    private static StyleTransformer<ViewReactionsViewStyle> viewReactionsStyleTransformer;

    static {
        int i13 = 11;
        avatarStyleTransformer = new C18194g(i13);
        channelListFragmentStyleTransformer = new C18194g(i13);
        channelListStyleTransformer = new C18194g(i13);
        messageListStyleTransformer = new C18194g(i13);
        messageListItemStyleTransformer = new C18194g(i13);
        scrollButtonStyleTransformer = new C18194g(i13);
        unreadLabelButtonStyleTransformer = new C18194g(i13);
        viewReactionsStyleTransformer = new C18194g(i13);
        editReactionsStyleTransformer = new C18194g(i13);
        singleReactionViewStyleTransformer = new C18194g(i13);
        channelActionsDialogStyleTransformer = new C18194g(i13);
        giphyViewHolderStyleTransformer = new C18194g(i13);
        mediaAttachmentStyleTransformer = new C18194g(i13);
        pollViewStyleTransformer = new C18194g(i13);
        messageReplyStyleTransformer = new C18194g(i13);
        fileAttachmentStyleTransformer = new C18194g(i13);
        unsupportedAttachmentStyleTransformer = new C18194g(i13);
        channelHeaderStyleTransformer = new C18194g(i13);
        mentionListViewStyleTransformer = new C18194g(i13);
        searchInputViewStyleTransformer = new C18194g(i13);
        searchResultListViewStyleTransformer = new C18194g(i13);
        typingIndicatorViewStyleTransformer = new C18194g(i13);
        pinnedMessageListViewStyleTransformer = new C18194g(i13);
        defaultQuotedAttachmentViewStyleTransformer = new C18194g(i13);
        attachmentGalleryOptionsStyleTransformer = new C18194g(i13);
        messageComposerStyleTransformer = new C18194g(i13);
        attachmentsPickerStyleTransformer = new C18194g(i13);
        attachmentGalleryViewMediaStyle = new C18194g(i13);
        mediaAttachmentGridViewStyle = new C18194g(i13);
        audioRecordPlayerViewStyle = new C18194g(i13);
        threadListViewStyle = new C18194g(i13);
    }

    private TransformStyle() {
    }

    public static final StyleTransformer<AttachmentGalleryOptionsViewStyle> getAttachmentGalleryOptionsStyleTransformer() {
        return attachmentGalleryOptionsStyleTransformer;
    }

    public static /* synthetic */ void getAttachmentGalleryOptionsStyleTransformer$annotations() {
    }

    public static final StyleTransformer<AttachmentGalleryViewMediaStyle> getAttachmentGalleryViewMediaStyle() {
        return attachmentGalleryViewMediaStyle;
    }

    public static /* synthetic */ void getAttachmentGalleryViewMediaStyle$annotations() {
    }

    public static final StyleTransformer<AttachmentsPickerDialogStyle> getAttachmentsPickerStyleTransformer() {
        return attachmentsPickerStyleTransformer;
    }

    public static /* synthetic */ void getAttachmentsPickerStyleTransformer$annotations() {
    }

    public static final StyleTransformer<AudioRecordPlayerViewStyle> getAudioRecordPlayerViewStyle() {
        return audioRecordPlayerViewStyle;
    }

    public static /* synthetic */ void getAudioRecordPlayerViewStyle$annotations() {
    }

    public static final StyleTransformer<AvatarStyle> getAvatarStyleTransformer() {
        return avatarStyleTransformer;
    }

    public static /* synthetic */ void getAvatarStyleTransformer$annotations() {
    }

    public static final StyleTransformer<ChannelActionsDialogViewStyle> getChannelActionsDialogStyleTransformer() {
        return channelActionsDialogStyleTransformer;
    }

    public static /* synthetic */ void getChannelActionsDialogStyleTransformer$annotations() {
    }

    public static final StyleTransformer<ChannelHeaderViewStyle> getChannelHeaderStyleTransformer() {
        return channelHeaderStyleTransformer;
    }

    public static /* synthetic */ void getChannelHeaderStyleTransformer$annotations() {
    }

    public static final StyleTransformer<ChannelListFragmentViewStyle> getChannelListFragmentStyleTransformer() {
        return channelListFragmentStyleTransformer;
    }

    public static /* synthetic */ void getChannelListFragmentStyleTransformer$annotations() {
    }

    public static final StyleTransformer<ChannelListViewStyle> getChannelListStyleTransformer() {
        return channelListStyleTransformer;
    }

    public static /* synthetic */ void getChannelListStyleTransformer$annotations() {
    }

    public static final StyleTransformer<DefaultQuotedAttachmentViewStyle> getDefaultQuotedAttachmentViewStyleTransformer() {
        return defaultQuotedAttachmentViewStyleTransformer;
    }

    public static /* synthetic */ void getDefaultQuotedAttachmentViewStyleTransformer$annotations() {
    }

    public static final StyleTransformer<EditReactionsViewStyle> getEditReactionsStyleTransformer() {
        return editReactionsStyleTransformer;
    }

    public static /* synthetic */ void getEditReactionsStyleTransformer$annotations() {
    }

    public static final StyleTransformer<FileAttachmentViewStyle> getFileAttachmentStyleTransformer() {
        return fileAttachmentStyleTransformer;
    }

    public static /* synthetic */ void getFileAttachmentStyleTransformer$annotations() {
    }

    public static final StyleTransformer<GiphyViewHolderStyle> getGiphyViewHolderStyleTransformer() {
        return giphyViewHolderStyleTransformer;
    }

    public static /* synthetic */ void getGiphyViewHolderStyleTransformer$annotations() {
    }

    public static final StyleTransformer<MediaAttachmentGridViewStyle> getMediaAttachmentGridViewStyle() {
        return mediaAttachmentGridViewStyle;
    }

    public static /* synthetic */ void getMediaAttachmentGridViewStyle$annotations() {
    }

    public static final StyleTransformer<MediaAttachmentViewStyle> getMediaAttachmentStyleTransformer() {
        return mediaAttachmentStyleTransformer;
    }

    public static /* synthetic */ void getMediaAttachmentStyleTransformer$annotations() {
    }

    public static final StyleTransformer<MentionListViewStyle> getMentionListViewStyleTransformer() {
        return mentionListViewStyleTransformer;
    }

    public static /* synthetic */ void getMentionListViewStyleTransformer$annotations() {
    }

    public static final StyleTransformer<MessageComposerViewStyle> getMessageComposerStyleTransformer() {
        return messageComposerStyleTransformer;
    }

    public static /* synthetic */ void getMessageComposerStyleTransformer$annotations() {
    }

    public static final StyleTransformer<MessageListItemStyle> getMessageListItemStyleTransformer() {
        return messageListItemStyleTransformer;
    }

    public static /* synthetic */ void getMessageListItemStyleTransformer$annotations() {
    }

    public static final StyleTransformer<MessageListViewStyle> getMessageListStyleTransformer() {
        return messageListStyleTransformer;
    }

    public static /* synthetic */ void getMessageListStyleTransformer$annotations() {
    }

    public static final StyleTransformer<MessageReplyStyle> getMessageReplyStyleTransformer() {
        return messageReplyStyleTransformer;
    }

    public static /* synthetic */ void getMessageReplyStyleTransformer$annotations() {
    }

    public static final StyleTransformer<PinnedMessageListViewStyle> getPinnedMessageListViewStyleTransformer() {
        return pinnedMessageListViewStyleTransformer;
    }

    public static /* synthetic */ void getPinnedMessageListViewStyleTransformer$annotations() {
    }

    public static final StyleTransformer<PollViewStyle> getPollViewStyleTransformer() {
        return pollViewStyleTransformer;
    }

    public static /* synthetic */ void getPollViewStyleTransformer$annotations() {
    }

    public static final StyleTransformer<ScrollButtonViewStyle> getScrollButtonStyleTransformer() {
        return scrollButtonStyleTransformer;
    }

    public static /* synthetic */ void getScrollButtonStyleTransformer$annotations() {
    }

    public static final StyleTransformer<SearchInputViewStyle> getSearchInputViewStyleTransformer() {
        return searchInputViewStyleTransformer;
    }

    public static /* synthetic */ void getSearchInputViewStyleTransformer$annotations() {
    }

    public static final StyleTransformer<SearchResultListViewStyle> getSearchResultListViewStyleTransformer() {
        return searchResultListViewStyleTransformer;
    }

    public static /* synthetic */ void getSearchResultListViewStyleTransformer$annotations() {
    }

    public static final StyleTransformer<SingleReactionViewStyle> getSingleReactionViewStyleTransformer() {
        return singleReactionViewStyleTransformer;
    }

    public static /* synthetic */ void getSingleReactionViewStyleTransformer$annotations() {
    }

    public static final StyleTransformer<ThreadListViewStyle> getThreadListViewStyle() {
        return threadListViewStyle;
    }

    public static /* synthetic */ void getThreadListViewStyle$annotations() {
    }

    public static final StyleTransformer<TypingIndicatorViewStyle> getTypingIndicatorViewStyleTransformer() {
        return typingIndicatorViewStyleTransformer;
    }

    public static /* synthetic */ void getTypingIndicatorViewStyleTransformer$annotations() {
    }

    public static final StyleTransformer<UnreadLabelButtonStyle> getUnreadLabelButtonStyleTransformer() {
        return unreadLabelButtonStyleTransformer;
    }

    public static /* synthetic */ void getUnreadLabelButtonStyleTransformer$annotations() {
    }

    public static final StyleTransformer<UnsupportedAttachmentViewStyle> getUnsupportedAttachmentStyleTransformer() {
        return unsupportedAttachmentStyleTransformer;
    }

    public static /* synthetic */ void getUnsupportedAttachmentStyleTransformer$annotations() {
    }

    public static final StyleTransformer<ViewReactionsViewStyle> getViewReactionsStyleTransformer() {
        return viewReactionsStyleTransformer;
    }

    public static /* synthetic */ void getViewReactionsStyleTransformer$annotations() {
    }

    private final <T> StyleTransformer<T> noopTransformer() {
        return new C18194g(11);
    }

    private static final Object noopTransformer$lambda$0(Object obj) {
        return obj;
    }

    public static final void setAttachmentGalleryOptionsStyleTransformer(StyleTransformer<AttachmentGalleryOptionsViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        attachmentGalleryOptionsStyleTransformer = styleTransformer;
    }

    public static final void setAttachmentGalleryViewMediaStyle(StyleTransformer<AttachmentGalleryViewMediaStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        attachmentGalleryViewMediaStyle = styleTransformer;
    }

    public static final void setAttachmentsPickerStyleTransformer(StyleTransformer<AttachmentsPickerDialogStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        attachmentsPickerStyleTransformer = styleTransformer;
    }

    public static final void setAudioRecordPlayerViewStyle(StyleTransformer<AudioRecordPlayerViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        audioRecordPlayerViewStyle = styleTransformer;
    }

    public static final void setAvatarStyleTransformer(StyleTransformer<AvatarStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        avatarStyleTransformer = styleTransformer;
    }

    public static final void setChannelActionsDialogStyleTransformer(StyleTransformer<ChannelActionsDialogViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        channelActionsDialogStyleTransformer = styleTransformer;
    }

    public static final void setChannelHeaderStyleTransformer(StyleTransformer<ChannelHeaderViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        channelHeaderStyleTransformer = styleTransformer;
    }

    public static final void setChannelListFragmentStyleTransformer(StyleTransformer<ChannelListFragmentViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        channelListFragmentStyleTransformer = styleTransformer;
    }

    public static final void setChannelListStyleTransformer(StyleTransformer<ChannelListViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        channelListStyleTransformer = styleTransformer;
    }

    public static final void setDefaultQuotedAttachmentViewStyleTransformer(StyleTransformer<DefaultQuotedAttachmentViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        defaultQuotedAttachmentViewStyleTransformer = styleTransformer;
    }

    public static final void setEditReactionsStyleTransformer(StyleTransformer<EditReactionsViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        editReactionsStyleTransformer = styleTransformer;
    }

    public static final void setFileAttachmentStyleTransformer(StyleTransformer<FileAttachmentViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        fileAttachmentStyleTransformer = styleTransformer;
    }

    public static final void setGiphyViewHolderStyleTransformer(StyleTransformer<GiphyViewHolderStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        giphyViewHolderStyleTransformer = styleTransformer;
    }

    public static final void setMediaAttachmentGridViewStyle(StyleTransformer<MediaAttachmentGridViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        mediaAttachmentGridViewStyle = styleTransformer;
    }

    public static final void setMediaAttachmentStyleTransformer(StyleTransformer<MediaAttachmentViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        mediaAttachmentStyleTransformer = styleTransformer;
    }

    public static final void setMentionListViewStyleTransformer(StyleTransformer<MentionListViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        mentionListViewStyleTransformer = styleTransformer;
    }

    public static final void setMessageComposerStyleTransformer(StyleTransformer<MessageComposerViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        messageComposerStyleTransformer = styleTransformer;
    }

    public static final void setMessageListItemStyleTransformer(StyleTransformer<MessageListItemStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        messageListItemStyleTransformer = styleTransformer;
    }

    public static final void setMessageListStyleTransformer(StyleTransformer<MessageListViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        messageListStyleTransformer = styleTransformer;
    }

    public static final void setMessageReplyStyleTransformer(StyleTransformer<MessageReplyStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        messageReplyStyleTransformer = styleTransformer;
    }

    public static final void setPinnedMessageListViewStyleTransformer(StyleTransformer<PinnedMessageListViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        pinnedMessageListViewStyleTransformer = styleTransformer;
    }

    public static final void setPollViewStyleTransformer(StyleTransformer<PollViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        pollViewStyleTransformer = styleTransformer;
    }

    public static final void setScrollButtonStyleTransformer(StyleTransformer<ScrollButtonViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        scrollButtonStyleTransformer = styleTransformer;
    }

    public static final void setSearchInputViewStyleTransformer(StyleTransformer<SearchInputViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        searchInputViewStyleTransformer = styleTransformer;
    }

    public static final void setSearchResultListViewStyleTransformer(StyleTransformer<SearchResultListViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        searchResultListViewStyleTransformer = styleTransformer;
    }

    public static final void setSingleReactionViewStyleTransformer(StyleTransformer<SingleReactionViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        singleReactionViewStyleTransformer = styleTransformer;
    }

    public static final void setThreadListViewStyle(StyleTransformer<ThreadListViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        threadListViewStyle = styleTransformer;
    }

    public static final void setTypingIndicatorViewStyleTransformer(StyleTransformer<TypingIndicatorViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        typingIndicatorViewStyleTransformer = styleTransformer;
    }

    public static final void setUnreadLabelButtonStyleTransformer(StyleTransformer<UnreadLabelButtonStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        unreadLabelButtonStyleTransformer = styleTransformer;
    }

    public static final void setUnsupportedAttachmentStyleTransformer(StyleTransformer<UnsupportedAttachmentViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        unsupportedAttachmentStyleTransformer = styleTransformer;
    }

    public static final void setViewReactionsStyleTransformer(StyleTransformer<ViewReactionsViewStyle> styleTransformer) {
        AbstractC22676k.m65750j(styleTransformer, "<set-?>");
        viewReactionsStyleTransformer = styleTransformer;
    }
}
