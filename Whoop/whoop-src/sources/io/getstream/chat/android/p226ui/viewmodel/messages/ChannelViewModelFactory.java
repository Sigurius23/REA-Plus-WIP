package io.getstream.chat.android.p226ui.viewmodel.messages;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.InterfaceC1563a2;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.CompatUserLookupHandler;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.CompatUserLookupHandlerKt;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.DefaultUserLookupHandler;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.UserLookupHandler;
import io.getstream.chat.android.p226ui.common.feature.messages.list.C19585a;
import io.getstream.chat.android.p226ui.common.feature.messages.list.DateSeparatorHandler;
import io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController;
import io.getstream.chat.android.p226ui.common.feature.messages.list.MessagePositionHandler;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageFooterVisibility;
import io.getstream.chat.android.p226ui.common.utils.extensions.C19616a;
import j93.InterfaceC21461d;
import java.io.File;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p213i7.C18194g;
import p298l8.AbstractC23420c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30063j;
import s23.C32091d;
import s23.InterfaceC32094g;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001EBç\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0015\u0012\b\b\u0002\u0010!\u001a\u00020\u0015\u0012\b\b\u0002\u0010\"\u001a\u00020\u0015\u0012\b\b\u0002\u0010#\u001a\u00020\u0015¢\u0006\u0004\b$\u0010%J/\u0010,\u001a\u00028\u0000\"\b\b\u0000\u0010'*\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J/\u00100\u001a\u00028\u0000\"\b\b\u0000\u0010'*\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J'\u00100\u001a\u00028\u0000\"\b\b\u0000\u0010'*\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b0\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00107R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00108R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00109R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010:R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00109R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010:R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010;R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010<R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010<R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010=R\u0014\u0010 \u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010:R\u0014\u0010!\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010:R\u0014\u0010\"\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010:R\u0014\u0010#\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010:R#\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006F"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory;", "Landroidx/lifecycle/a2;", "Landroid/content/Context;", "context", "", "cid", "messageId", "parentMessageId", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Ls23/g;", "mediaRecorder", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;", "userLookupHandler", "Lkotlin/Function1;", "Ljava/io/File;", "fileToUri", "", "messageLimit", "", "enforceUniqueReactions", "maxAttachmentCount", "showSystemMessages", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;", "messageFooterVisibility", "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;", "dateSeparatorHandler", "threadDateSeparatorHandler", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;", "messagePositionHandler", "showDateSeparatorInEmptyThread", "showThreadSeparatorInEmptyThread", "threadLoadOlderToNewer", "isComposerDraftMessagesEnabled", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;IZIZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZZZ)V", "Landroidx/lifecycle/w1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/k1;", "savedStateHandle", "createInternal", "(Ljava/lang/Class;Landroidx/lifecycle/k1;)Landroidx/lifecycle/w1;", "Ll8/c;", "extras", "create", "(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;", "(Ljava/lang/Class;)Landroidx/lifecycle/w1;", "Ljava/lang/String;", "Lio/getstream/chat/android/client/ChatClient;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Ls23/g;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;", "Lkotlin/jvm/functions/Function1;", "I", "Z", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;", "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;", "Lec3/f2;", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "channelStateFlow$delegate", "Ll83/h;", "getChannelStateFlow", "()Lec3/f2;", "channelStateFlow", "Builder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelViewModelFactory implements InterfaceC1563a2 {

    /* JADX INFO: renamed from: channelStateFlow$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h channelStateFlow;
    private final ChatClient chatClient;
    private final String cid;
    private final ClientState clientState;
    private final DateSeparatorHandler dateSeparatorHandler;
    private final boolean enforceUniqueReactions;
    private final Function1 fileToUri;
    private final boolean isComposerDraftMessagesEnabled;
    private final int maxAttachmentCount;
    private final InterfaceC32094g mediaRecorder;
    private final MessageFooterVisibility messageFooterVisibility;
    private final String messageId;
    private final int messageLimit;
    private final MessagePositionHandler messagePositionHandler;
    private final String parentMessageId;
    private final boolean showDateSeparatorInEmptyThread;
    private final boolean showSystemMessages;
    private final boolean showThreadSeparatorInEmptyThread;
    private final DateSeparatorHandler threadDateSeparatorHandler;
    private final boolean threadLoadOlderToNewer;
    private final UserLookupHandler userLookupHandler;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0014¢\u0006\u0004\b\u0011\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0016¢\u0006\u0004\b$\u0010\u0018J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010)R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010,R\u0016\u0010\u001c\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010+R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010.R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00102R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00103R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00104R\u0016\u0010$\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010+¨\u00065"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "cid", "(Ljava/lang/String;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;", "messageId", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;", "Ls23/g;", "mediaRecorder", "(Ls23/g;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;", "userLookupHandler", "userLookupHandlerCompat", "(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;", "(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;", "", "enforceUniqueReactions", "(Z)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;", "", "maxAttachmentCount", "(I)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;", "showSystemMessages", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;", "messageFooterVisibility", "(Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;", "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;", "dateSeparatorHandler", "(Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;)Lio/getstream/chat/android/ui/viewmodel/messages/ChannelViewModelFactory$Builder;", "threadDateSeparatorHandler", "threadLoadOlderToNewer", "Landroidx/lifecycle/a2;", "build", "()Landroidx/lifecycle/a2;", "Landroid/content/Context;", "Ljava/lang/String;", "Lio/getstream/chat/android/client/ChatClient;", "Z", "I", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;", "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;", "messagePositionHandler", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;", "Ls23/g;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/CompatUserLookupHandler;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private ChatClient chatClient;
        private String cid;
        private final Context context;
        private DateSeparatorHandler dateSeparatorHandler;
        private boolean enforceUniqueReactions;
        private int maxAttachmentCount;
        private InterfaceC32094g mediaRecorder;
        private MessageFooterVisibility messageFooterVisibility;
        private String messageId;
        private MessagePositionHandler messagePositionHandler;
        private boolean showSystemMessages;
        private DateSeparatorHandler threadDateSeparatorHandler;
        private boolean threadLoadOlderToNewer;
        private UserLookupHandler userLookupHandler;
        private CompatUserLookupHandler userLookupHandlerCompat;

        public Builder(Context context) {
            AbstractC22676k.m65750j(context, "context");
            this.context = context;
            this.chatClient = ChatClient.INSTANCE.instance();
            this.enforceUniqueReactions = true;
            this.maxAttachmentCount = 30;
            this.showSystemMessages = true;
            this.messageFooterVisibility = MessageFooterVisibility.LastInGroup.INSTANCE;
            this.dateSeparatorHandler = DateSeparatorHandler.INSTANCE.getDefaultDateSeparatorHandler();
            this.threadDateSeparatorHandler = new C19585a(1);
            this.messagePositionHandler = MessagePositionHandler.Companion.defaultHandler$default(MessagePositionHandler.INSTANCE, 0L, 1, null);
            Context applicationContext = context.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
            this.mediaRecorder = new C32091d(applicationContext);
        }

        public final InterfaceC1563a2 build() {
            String str = this.cid;
            if (str == null) {
                throw new IllegalStateException("Channel cid should not be null");
            }
            Context context = this.context;
            String str2 = this.messageId;
            ChatClient chatClient = this.chatClient;
            InterfaceC32094g interfaceC32094g = this.mediaRecorder;
            UserLookupHandler userLookupHandler = this.userLookupHandler;
            if (userLookupHandler == null) {
                CompatUserLookupHandler compatUserLookupHandler = this.userLookupHandlerCompat;
                userLookupHandler = compatUserLookupHandler != null ? CompatUserLookupHandlerKt.toUserLookupHandler(compatUserLookupHandler) : null;
                if (userLookupHandler == null) {
                    userLookupHandler = new DefaultUserLookupHandler(this.chatClient, str, null, 4, null);
                }
            }
            return new ChannelViewModelFactory(context, str, str2, null, chatClient, null, interfaceC32094g, userLookupHandler, null, 0, this.enforceUniqueReactions, this.maxAttachmentCount, this.showSystemMessages, this.messageFooterVisibility, this.dateSeparatorHandler, this.threadDateSeparatorHandler, this.messagePositionHandler, false, false, this.threadLoadOlderToNewer, false, 1442600, null);
        }

        public final Builder chatClient(ChatClient chatClient) {
            AbstractC22676k.m65750j(chatClient, "chatClient");
            this.chatClient = chatClient;
            return this;
        }

        public final Builder cid(String cid) {
            AbstractC22676k.m65750j(cid, "cid");
            this.cid = cid;
            return this;
        }

        public final Builder dateSeparatorHandler(DateSeparatorHandler dateSeparatorHandler) {
            AbstractC22676k.m65750j(dateSeparatorHandler, "dateSeparatorHandler");
            this.dateSeparatorHandler = dateSeparatorHandler;
            return this;
        }

        public final Builder enforceUniqueReactions(boolean enforceUniqueReactions) {
            this.enforceUniqueReactions = enforceUniqueReactions;
            return this;
        }

        public final Builder maxAttachmentCount(int maxAttachmentCount) {
            this.maxAttachmentCount = maxAttachmentCount;
            return this;
        }

        public final Builder mediaRecorder(InterfaceC32094g mediaRecorder) {
            AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
            this.mediaRecorder = mediaRecorder;
            return this;
        }

        public final Builder messageFooterVisibility(MessageFooterVisibility messageFooterVisibility) {
            AbstractC22676k.m65750j(messageFooterVisibility, "messageFooterVisibility");
            this.messageFooterVisibility = messageFooterVisibility;
            return this;
        }

        public final Builder messageId(String messageId) {
            AbstractC22676k.m65750j(messageId, "messageId");
            this.messageId = messageId;
            return this;
        }

        public final Builder showSystemMessages(boolean showSystemMessages) {
            this.showSystemMessages = showSystemMessages;
            return this;
        }

        public final Builder threadDateSeparatorHandler(DateSeparatorHandler threadDateSeparatorHandler) {
            AbstractC22676k.m65750j(threadDateSeparatorHandler, "threadDateSeparatorHandler");
            this.threadDateSeparatorHandler = threadDateSeparatorHandler;
            return this;
        }

        public final Builder threadLoadOlderToNewer(boolean threadLoadOlderToNewer) {
            this.threadLoadOlderToNewer = threadLoadOlderToNewer;
            return this;
        }

        public final Builder userLookupHandler(UserLookupHandler userLookupHandler) {
            AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
            this.userLookupHandler = userLookupHandler;
            return this;
        }

        public final Builder userLookupHandlerCompat(CompatUserLookupHandler userLookupHandler) {
            AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
            this.userLookupHandlerCompat = userLookupHandler;
            return this;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid) {
        this(context, cid, null, null, null, null, null, null, null, 0, false, 0, false, null, null, null, null, false, false, false, false, 2097148, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(File file) {
        AbstractC22676k.m65750j(file, "file");
        return Uri.fromFile(file).toString();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C3004e2 m55712a(InterfaceC3027k1 interfaceC3027k1) {
        return (C3004e2) channelStateFlow_delegate$lambda$2$lambda$1(interfaceC3027k1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C13081r1 m55714c(ChannelViewModelFactory channelViewModelFactory) {
        return (C13081r1) channelStateFlow_delegate$lambda$2(channelViewModelFactory);
    }

    private static final InterfaceC13037f2 channelStateFlow_delegate$lambda$2(ChannelViewModelFactory channelViewModelFactory) {
        InterfaceC2994c0 interfaceC2994c0InheritScope = channelViewModelFactory.chatClient.inheritScope(new C19616a(26));
        String str = channelViewModelFactory.messageId;
        return (str == null || channelViewModelFactory.parentMessageId != null) ? ChatClientExtensions.watchChannelAsState(channelViewModelFactory.chatClient, channelViewModelFactory.cid, channelViewModelFactory.messageLimit, interfaceC2994c0InheritScope) : ChatClientExtensions.watchChannelAsState(channelViewModelFactory.chatClient, channelViewModelFactory.cid, channelViewModelFactory.messageLimit, str, interfaceC2994c0InheritScope);
    }

    private static final InterfaceC30063j channelStateFlow_delegate$lambda$2$lambda$1(InterfaceC3027k1 it) {
        AbstractC22676k.m65750j(it, "it");
        return new C3004e2(it);
    }

    private final <T extends AbstractC1637w1> T createInternal(Class<T> modelClass, C1601k1 savedStateHandle) {
        if (AbstractC22676k.m65745e(modelClass, ChannelHeaderViewModel.class)) {
            return new ChannelHeaderViewModel(this.cid, null, null, this.messageId, 6, null);
        }
        if (AbstractC22676k.m65745e(modelClass, MessageListViewModel.class)) {
            String str = this.cid;
            C18194g c18194g = new C18194g(12);
            boolean z4 = this.threadLoadOlderToNewer;
            int i13 = this.messageLimit;
            return new MessageListViewModel(new MessageListController(str, c18194g, z4, this.messageId, this.parentMessageId, i13, this.chatClient, this.clientState, getChannelStateFlow(), this.showSystemMessages, this.messageFooterVisibility, this.enforceUniqueReactions, this.dateSeparatorHandler, this.threadDateSeparatorHandler, this.messagePositionHandler, this.showDateSeparatorInEmptyThread, this.showThreadSeparatorInEmptyThread), this.chatClient);
        }
        if (!AbstractC22676k.m65745e(modelClass, MessageComposerViewModel.class)) {
            throw new IllegalArgumentException("ChannelViewModelFactory can only create instances of the following classes: ChannelHeaderViewModel, MessageListViewModel, or MessageComposerViewModel.");
        }
        return new MessageComposerViewModel(new MessageComposerController(this.cid, this.chatClient, getChannelStateFlow(), this.mediaRecorder, this.userLookupHandler, this.fileToUri, new MessageComposerController.Config(this.maxAttachmentCount, false, this.isComposerDraftMessagesEnabled, false, 10, null), null, savedStateHandle, 128, null));
    }

    private final InterfaceC13037f2 getChannelStateFlow() {
        return (InterfaceC13037f2) this.channelStateFlow.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final <T extends AbstractC1637w1> T create(InterfaceC21461d interfaceC21461d, AbstractC23420c abstractC23420c) {
        return (T) super.create(interfaceC21461d, abstractC23420c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str) {
        this(context, cid, str, null, null, null, null, null, null, 0, false, 0, false, null, null, null, null, false, false, false, false, 2097144, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final <T extends AbstractC1637w1> T create(Class<T> modelClass, AbstractC23420c extras) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        AbstractC22676k.m65750j(extras, "extras");
        return (T) createInternal(modelClass, AbstractC1613o1.m5015e(extras));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2) {
        this(context, cid, str, str2, null, null, null, null, null, 0, false, 0, false, null, null, null, null, false, false, false, false, 2097136, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final <T extends AbstractC1637w1> T create(Class<T> modelClass) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        return (T) createInternal(modelClass, new C1601k1());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient) {
        this(context, cid, str, str2, chatClient, null, null, null, null, 0, false, 0, false, null, null, null, null, false, false, false, false, 2097120, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient, ClientState clientState) {
        this(context, cid, str, str2, chatClient, clientState, null, null, null, 0, false, 0, false, null, null, null, null, false, false, false, false, 2097088, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient, ClientState clientState, InterfaceC32094g mediaRecorder) {
        this(context, cid, str, str2, chatClient, clientState, mediaRecorder, null, null, 0, false, 0, false, null, null, null, null, false, false, false, false, 2097024, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient, ClientState clientState, InterfaceC32094g mediaRecorder, UserLookupHandler userLookupHandler) {
        this(context, cid, str, str2, chatClient, clientState, mediaRecorder, userLookupHandler, null, 0, false, 0, false, null, null, null, null, false, false, false, false, 2096896, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
        AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient, ClientState clientState, InterfaceC32094g mediaRecorder, UserLookupHandler userLookupHandler, Function1 fileToUri) {
        this(context, cid, str, str2, chatClient, clientState, mediaRecorder, userLookupHandler, fileToUri, 0, false, 0, false, null, null, null, null, false, false, false, false, 2096640, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
        AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
        AbstractC22676k.m65750j(fileToUri, "fileToUri");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient, ClientState clientState, InterfaceC32094g mediaRecorder, UserLookupHandler userLookupHandler, Function1 fileToUri, int i13) {
        this(context, cid, str, str2, chatClient, clientState, mediaRecorder, userLookupHandler, fileToUri, i13, false, 0, false, null, null, null, null, false, false, false, false, 2096128, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
        AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
        AbstractC22676k.m65750j(fileToUri, "fileToUri");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient, ClientState clientState, InterfaceC32094g mediaRecorder, UserLookupHandler userLookupHandler, Function1 fileToUri, int i13, boolean z4) {
        this(context, cid, str, str2, chatClient, clientState, mediaRecorder, userLookupHandler, fileToUri, i13, z4, 0, false, null, null, null, null, false, false, false, false, 2095104, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
        AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
        AbstractC22676k.m65750j(fileToUri, "fileToUri");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient, ClientState clientState, InterfaceC32094g mediaRecorder, UserLookupHandler userLookupHandler, Function1 fileToUri, int i13, boolean z4, int i14) {
        this(context, cid, str, str2, chatClient, clientState, mediaRecorder, userLookupHandler, fileToUri, i13, z4, i14, false, null, null, null, null, false, false, false, false, 2093056, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
        AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
        AbstractC22676k.m65750j(fileToUri, "fileToUri");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient, ClientState clientState, InterfaceC32094g mediaRecorder, UserLookupHandler userLookupHandler, Function1 fileToUri, int i13, boolean z4, int i14, boolean z13) {
        this(context, cid, str, str2, chatClient, clientState, mediaRecorder, userLookupHandler, fileToUri, i13, z4, i14, z13, null, null, null, null, false, false, false, false, 2088960, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
        AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
        AbstractC22676k.m65750j(fileToUri, "fileToUri");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient, ClientState clientState, InterfaceC32094g mediaRecorder, UserLookupHandler userLookupHandler, Function1 fileToUri, int i13, boolean z4, int i14, boolean z13, MessageFooterVisibility messageFooterVisibility) {
        this(context, cid, str, str2, chatClient, clientState, mediaRecorder, userLookupHandler, fileToUri, i13, z4, i14, z13, messageFooterVisibility, null, null, null, false, false, false, false, 2080768, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
        AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
        AbstractC22676k.m65750j(fileToUri, "fileToUri");
        AbstractC22676k.m65750j(messageFooterVisibility, "messageFooterVisibility");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient, ClientState clientState, InterfaceC32094g mediaRecorder, UserLookupHandler userLookupHandler, Function1 fileToUri, int i13, boolean z4, int i14, boolean z13, MessageFooterVisibility messageFooterVisibility, DateSeparatorHandler dateSeparatorHandler) {
        this(context, cid, str, str2, chatClient, clientState, mediaRecorder, userLookupHandler, fileToUri, i13, z4, i14, z13, messageFooterVisibility, dateSeparatorHandler, null, null, false, false, false, false, 2064384, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
        AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
        AbstractC22676k.m65750j(fileToUri, "fileToUri");
        AbstractC22676k.m65750j(messageFooterVisibility, "messageFooterVisibility");
        AbstractC22676k.m65750j(dateSeparatorHandler, "dateSeparatorHandler");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient, ClientState clientState, InterfaceC32094g mediaRecorder, UserLookupHandler userLookupHandler, Function1 fileToUri, int i13, boolean z4, int i14, boolean z13, MessageFooterVisibility messageFooterVisibility, DateSeparatorHandler dateSeparatorHandler, DateSeparatorHandler threadDateSeparatorHandler) {
        this(context, cid, str, str2, chatClient, clientState, mediaRecorder, userLookupHandler, fileToUri, i13, z4, i14, z13, messageFooterVisibility, dateSeparatorHandler, threadDateSeparatorHandler, null, false, false, false, false, 2031616, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
        AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
        AbstractC22676k.m65750j(fileToUri, "fileToUri");
        AbstractC22676k.m65750j(messageFooterVisibility, "messageFooterVisibility");
        AbstractC22676k.m65750j(dateSeparatorHandler, "dateSeparatorHandler");
        AbstractC22676k.m65750j(threadDateSeparatorHandler, "threadDateSeparatorHandler");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient, ClientState clientState, InterfaceC32094g mediaRecorder, UserLookupHandler userLookupHandler, Function1 fileToUri, int i13, boolean z4, int i14, boolean z13, MessageFooterVisibility messageFooterVisibility, DateSeparatorHandler dateSeparatorHandler, DateSeparatorHandler threadDateSeparatorHandler, MessagePositionHandler messagePositionHandler) {
        this(context, cid, str, str2, chatClient, clientState, mediaRecorder, userLookupHandler, fileToUri, i13, z4, i14, z13, messageFooterVisibility, dateSeparatorHandler, threadDateSeparatorHandler, messagePositionHandler, false, false, false, false, 1966080, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
        AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
        AbstractC22676k.m65750j(fileToUri, "fileToUri");
        AbstractC22676k.m65750j(messageFooterVisibility, "messageFooterVisibility");
        AbstractC22676k.m65750j(dateSeparatorHandler, "dateSeparatorHandler");
        AbstractC22676k.m65750j(threadDateSeparatorHandler, "threadDateSeparatorHandler");
        AbstractC22676k.m65750j(messagePositionHandler, "messagePositionHandler");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient, ClientState clientState, InterfaceC32094g mediaRecorder, UserLookupHandler userLookupHandler, Function1 fileToUri, int i13, boolean z4, int i14, boolean z13, MessageFooterVisibility messageFooterVisibility, DateSeparatorHandler dateSeparatorHandler, DateSeparatorHandler threadDateSeparatorHandler, MessagePositionHandler messagePositionHandler, boolean z14) {
        this(context, cid, str, str2, chatClient, clientState, mediaRecorder, userLookupHandler, fileToUri, i13, z4, i14, z13, messageFooterVisibility, dateSeparatorHandler, threadDateSeparatorHandler, messagePositionHandler, z14, false, false, false, 1835008, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
        AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
        AbstractC22676k.m65750j(fileToUri, "fileToUri");
        AbstractC22676k.m65750j(messageFooterVisibility, "messageFooterVisibility");
        AbstractC22676k.m65750j(dateSeparatorHandler, "dateSeparatorHandler");
        AbstractC22676k.m65750j(threadDateSeparatorHandler, "threadDateSeparatorHandler");
        AbstractC22676k.m65750j(messagePositionHandler, "messagePositionHandler");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient, ClientState clientState, InterfaceC32094g mediaRecorder, UserLookupHandler userLookupHandler, Function1 fileToUri, int i13, boolean z4, int i14, boolean z13, MessageFooterVisibility messageFooterVisibility, DateSeparatorHandler dateSeparatorHandler, DateSeparatorHandler threadDateSeparatorHandler, MessagePositionHandler messagePositionHandler, boolean z14, boolean z15) {
        this(context, cid, str, str2, chatClient, clientState, mediaRecorder, userLookupHandler, fileToUri, i13, z4, i14, z13, messageFooterVisibility, dateSeparatorHandler, threadDateSeparatorHandler, messagePositionHandler, z14, z15, false, false, 1572864, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
        AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
        AbstractC22676k.m65750j(fileToUri, "fileToUri");
        AbstractC22676k.m65750j(messageFooterVisibility, "messageFooterVisibility");
        AbstractC22676k.m65750j(dateSeparatorHandler, "dateSeparatorHandler");
        AbstractC22676k.m65750j(threadDateSeparatorHandler, "threadDateSeparatorHandler");
        AbstractC22676k.m65750j(messagePositionHandler, "messagePositionHandler");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient, ClientState clientState, InterfaceC32094g mediaRecorder, UserLookupHandler userLookupHandler, Function1 fileToUri, int i13, boolean z4, int i14, boolean z13, MessageFooterVisibility messageFooterVisibility, DateSeparatorHandler dateSeparatorHandler, DateSeparatorHandler threadDateSeparatorHandler, MessagePositionHandler messagePositionHandler, boolean z14, boolean z15, boolean z16) {
        this(context, cid, str, str2, chatClient, clientState, mediaRecorder, userLookupHandler, fileToUri, i13, z4, i14, z13, messageFooterVisibility, dateSeparatorHandler, threadDateSeparatorHandler, messagePositionHandler, z14, z15, z16, false, 1048576, null);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
        AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
        AbstractC22676k.m65750j(fileToUri, "fileToUri");
        AbstractC22676k.m65750j(messageFooterVisibility, "messageFooterVisibility");
        AbstractC22676k.m65750j(dateSeparatorHandler, "dateSeparatorHandler");
        AbstractC22676k.m65750j(threadDateSeparatorHandler, "threadDateSeparatorHandler");
        AbstractC22676k.m65750j(messagePositionHandler, "messagePositionHandler");
    }

    public ChannelViewModelFactory(Context context, String cid, String str, String str2, ChatClient chatClient, ClientState clientState, InterfaceC32094g mediaRecorder, UserLookupHandler userLookupHandler, Function1 fileToUri, int i13, boolean z4, int i14, boolean z13, MessageFooterVisibility messageFooterVisibility, DateSeparatorHandler dateSeparatorHandler, DateSeparatorHandler threadDateSeparatorHandler, MessagePositionHandler messagePositionHandler, boolean z14, boolean z15, boolean z16, boolean z17) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
        AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
        AbstractC22676k.m65750j(fileToUri, "fileToUri");
        AbstractC22676k.m65750j(messageFooterVisibility, "messageFooterVisibility");
        AbstractC22676k.m65750j(dateSeparatorHandler, "dateSeparatorHandler");
        AbstractC22676k.m65750j(threadDateSeparatorHandler, "threadDateSeparatorHandler");
        AbstractC22676k.m65750j(messagePositionHandler, "messagePositionHandler");
        this.cid = cid;
        this.messageId = str;
        this.parentMessageId = str2;
        this.chatClient = chatClient;
        this.clientState = clientState;
        this.mediaRecorder = mediaRecorder;
        this.userLookupHandler = userLookupHandler;
        this.fileToUri = fileToUri;
        this.messageLimit = i13;
        this.enforceUniqueReactions = z4;
        this.maxAttachmentCount = i14;
        this.showSystemMessages = z13;
        this.messageFooterVisibility = messageFooterVisibility;
        this.dateSeparatorHandler = dateSeparatorHandler;
        this.threadDateSeparatorHandler = threadDateSeparatorHandler;
        this.messagePositionHandler = messagePositionHandler;
        this.showDateSeparatorInEmptyThread = z14;
        this.showThreadSeparatorInEmptyThread = z15;
        this.threadLoadOlderToNewer = z16;
        this.isComposerDraftMessagesEnabled = z17;
        this.channelStateFlow = AbstractC30060g.m92088H(new C19938b(this, 0));
    }

    public /* synthetic */ ChannelViewModelFactory(Context context, String str, String str2, String str3, ChatClient chatClient, ClientState clientState, InterfaceC32094g interfaceC32094g, UserLookupHandler userLookupHandler, Function1 function1, int i13, boolean z4, int i14, boolean z13, MessageFooterVisibility messageFooterVisibility, DateSeparatorHandler dateSeparatorHandler, DateSeparatorHandler dateSeparatorHandler2, MessagePositionHandler messagePositionHandler, boolean z14, boolean z15, boolean z16, boolean z17, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC32094g c32091d;
        UserLookupHandler defaultUserLookupHandler;
        String str4 = (i15 & 4) != 0 ? null : str2;
        String str5 = (i15 & 8) != 0 ? null : str3;
        ChatClient chatClientInstance = (i15 & 16) != 0 ? ChatClient.INSTANCE.instance() : chatClient;
        ClientState clientState2 = (i15 & 32) != 0 ? chatClientInstance.getClientState() : clientState;
        if ((i15 & 64) != 0) {
            Context applicationContext = context.getApplicationContext();
            AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
            c32091d = new C32091d(applicationContext);
        } else {
            c32091d = interfaceC32094g;
        }
        if ((i15 & 128) != 0) {
            defaultUserLookupHandler = new DefaultUserLookupHandler(chatClientInstance, str, null, 4, null);
        } else {
            defaultUserLookupHandler = userLookupHandler;
        }
        this(context, str, str4, str5, chatClientInstance, clientState2, c32091d, defaultUserLookupHandler, (i15 & 256) != 0 ? new C19616a(27) : function1, (i15 & 512) != 0 ? 30 : i13, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? true : z4, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? 30 : i14, (i15 & 4096) != 0 ? true : z13, (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? MessageFooterVisibility.LastInGroup.INSTANCE : messageFooterVisibility, (i15 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? DateSeparatorHandler.INSTANCE.getDefaultDateSeparatorHandler() : dateSeparatorHandler, (32768 & i15) != 0 ? DateSeparatorHandler.INSTANCE.getDefaultThreadDateSeparatorHandler() : dateSeparatorHandler2, (65536 & i15) != 0 ? MessagePositionHandler.Companion.defaultHandler$default(MessagePositionHandler.INSTANCE, 0L, 1, null) : messagePositionHandler, (131072 & i15) != 0 ? false : z14, (262144 & i15) != 0 ? false : z15, (524288 & i15) != 0 ? false : z16, (i15 & 1048576) != 0 ? ChatUI.getDraftMessagesEnabled() : z17);
    }
}
