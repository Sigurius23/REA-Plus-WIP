package io.getstream.chat.android.client.internal.state.plugin.internal;

import com.mapbox.maps.MapboxMap;
import com.whoop.service.network.model.UserState;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.api.ChatClientConfig;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.models.QueryThreadsRequest;
import io.getstream.chat.android.client.api.state.GlobalState;
import io.getstream.chat.android.client.api.state.StateRegistry;
import io.getstream.chat.android.client.errorhandler.ErrorHandler;
import io.getstream.chat.android.client.errorhandler.factory.ErrorHandlerFactory;
import io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandler;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.BlockUserListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.ChannelMarkReadListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.DeleteChannelListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.DeleteMessageForMeListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.DeleteMessageListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.DeleteReactionListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.DraftMessageListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.EditMessageListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.FetchCurrentUserListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.HideChannelListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.LiveLocationListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.MarkAllReadListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.PushPreferencesListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.QueryBlockedUsersListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.QueryChannelListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.QueryChannelsListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.QueryMembersListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.QueryThreadsListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.SendAttachmentListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.SendGiphyListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.SendMessageListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.SendReactionListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.ShuffleGiphyListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.ThreadQueryListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.TypingEventListenerState;
import io.getstream.chat.android.client.internal.state.plugin.listener.internal.UnblockUserListenerState;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState;
import io.getstream.chat.android.client.internal.state.sync.internal.SyncHistoryManager;
import io.getstream.chat.android.client.internal.state.sync.internal.SyncManager;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.client.plugin.Plugin;
import io.getstream.chat.android.client.plugin.listeners.BlockUserListener;
import io.getstream.chat.android.client.plugin.listeners.ChannelMarkReadListener;
import io.getstream.chat.android.client.plugin.listeners.DeleteChannelListener;
import io.getstream.chat.android.client.plugin.listeners.DeleteMessageForMeListener;
import io.getstream.chat.android.client.plugin.listeners.DeleteMessageListener;
import io.getstream.chat.android.client.plugin.listeners.DeleteReactionListener;
import io.getstream.chat.android.client.plugin.listeners.DraftMessageListener;
import io.getstream.chat.android.client.plugin.listeners.EditMessageListener;
import io.getstream.chat.android.client.plugin.listeners.FetchCurrentUserListener;
import io.getstream.chat.android.client.plugin.listeners.HideChannelListener;
import io.getstream.chat.android.client.plugin.listeners.LiveLocationListener;
import io.getstream.chat.android.client.plugin.listeners.MarkAllReadListener;
import io.getstream.chat.android.client.plugin.listeners.PushPreferencesListener;
import io.getstream.chat.android.client.plugin.listeners.QueryBlockedUsersListener;
import io.getstream.chat.android.client.plugin.listeners.QueryChannelListener;
import io.getstream.chat.android.client.plugin.listeners.QueryChannelsListener;
import io.getstream.chat.android.client.plugin.listeners.QueryMembersListener;
import io.getstream.chat.android.client.plugin.listeners.QueryThreadsListener;
import io.getstream.chat.android.client.plugin.listeners.SendAttachmentListener;
import io.getstream.chat.android.client.plugin.listeners.SendGiphyListener;
import io.getstream.chat.android.client.plugin.listeners.SendMessageListener;
import io.getstream.chat.android.client.plugin.listeners.SendReactionListener;
import io.getstream.chat.android.client.plugin.listeners.ShuffleGiphyListener;
import io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener;
import io.getstream.chat.android.client.plugin.listeners.TypingEventListener;
import io.getstream.chat.android.client.plugin.listeners.UnblockUserListener;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.DraftsSort;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Location;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.PushPreferenceLevel;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.querysort.QuerySorter;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import j93.InterfaceC21461d;
import java.util.Date;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.InterfaceC23462h;
import n23.AbstractC26205h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\u008c\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u00132\u00020\u00142\u00020\u00152\u00020\u00162\u00020\u00172\u00020\u00182\u00020\u00192\u00020\u001a2\u00020\u001bB_\b\u0000\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u000208H\u0016¢\u0006\u0004\b;\u0010<J)\u0010A\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010>*\u00020=2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0017¢\u0006\u0004\bA\u0010BJh\u0010R\u001a\u0002082\u0012\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020J2\u0006\u0010N\u001a\u00020M2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020E0O2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020E0DH\u0096A¢\u0006\u0004\bR\u0010SJ2\u0010X\u001a\u0002082\b\u0010T\u001a\u0004\u0018\u00010G2\u0006\u0010U\u001a\u00020G2\u0006\u0010V\u001a\u00020G2\u0006\u0010W\u001a\u000206H\u0096A¢\u0006\u0004\bX\u0010YJ@\u0010[\u001a\u0002082\b\u0010T\u001a\u0004\u0018\u00010G2\u0006\u0010U\u001a\u00020G2\u0006\u0010V\u001a\u00020G2\u0006\u0010W\u001a\u0002062\f\u0010F\u001a\b\u0012\u0004\u0012\u00020Z0CH\u0096A¢\u0006\u0004\b[\u0010\\J \u0010]\u001a\b\u0012\u0004\u0012\u0002080C2\b\u0010W\u001a\u0004\u0018\u000106H\u0096\u0001¢\u0006\u0004\b]\u0010^J2\u0010a\u001a\b\u0012\u0004\u0012\u0002080C2\b\u0010T\u001a\u0004\u0018\u00010G2\b\u0010W\u001a\u0004\u0018\u0001062\u0006\u0010`\u001a\u00020_H\u0096A¢\u0006\u0004\ba\u0010bJ:\u0010e\u001a\u0002082\b\u0010T\u001a\u0004\u0018\u00010G2\u0006\u0010`\u001a\u00020_2\u0006\u0010c\u001a\u00020-2\u0006\u0010d\u001a\u00020-2\u0006\u0010W\u001a\u000206H\u0096A¢\u0006\u0004\be\u0010fJ@\u0010g\u001a\u0002082\b\u0010T\u001a\u0004\u0018\u00010G2\u0006\u0010`\u001a\u00020_2\u0006\u0010c\u001a\u00020-2\u0006\u0010W\u001a\u0002062\f\u0010F\u001a\b\u0012\u0004\u0012\u00020_0CH\u0096A¢\u0006\u0004\bg\u0010hJ \u0010j\u001a\u0002082\u0006\u0010i\u001a\u00020G2\u0006\u0010L\u001a\u00020JH\u0096A¢\u0006\u0004\bj\u0010kJ4\u0010l\u001a\u0002082\u0012\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0D0C2\u0006\u0010i\u001a\u00020G2\u0006\u0010L\u001a\u00020JH\u0096A¢\u0006\u0004\bl\u0010mJ*\u0010o\u001a\u0002082\u0006\u0010i\u001a\u00020G2\u0006\u0010L\u001a\u00020J2\b\u0010n\u001a\u0004\u0018\u00010GH\u0096A¢\u0006\u0004\bo\u0010pJ(\u0010r\u001a\u0002082\u0006\u0010i\u001a\u00020G2\u0006\u0010q\u001a\u00020G2\u0006\u0010L\u001a\u00020JH\u0096A¢\u0006\u0004\br\u0010sJ<\u0010t\u001a\u0002082\u0012\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0D0C2\u0006\u0010i\u001a\u00020G2\u0006\u0010q\u001a\u00020G2\u0006\u0010L\u001a\u00020JH\u0096A¢\u0006\u0004\bt\u0010uJ>\u0010v\u001a\u0002082\u0012\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0D0C2\u0006\u0010i\u001a\u00020G2\u0006\u0010L\u001a\u00020J2\b\u0010n\u001a\u0004\u0018\u00010GH\u0096A¢\u0006\u0004\bv\u0010wJ&\u0010x\u001a\u0002082\u0006\u0010T\u001a\u00020G2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020Z0CH\u0096\u0001¢\u0006\u0004\bx\u0010yJ&\u0010z\u001a\u0002082\u0006\u0010T\u001a\u00020G2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020Z0CH\u0096A¢\u0006\u0004\bz\u0010{J\u001e\u0010|\u001a\b\u0012\u0004\u0012\u0002080C2\u0006\u0010U\u001a\u00020GH\u0096A¢\u0006\u0004\b|\u0010}J\u0018\u0010~\u001a\u0002082\u0006\u0010U\u001a\u00020GH\u0096A¢\u0006\u0004\b~\u0010}J(\u0010\u0080\u0001\u001a\u0002082\u0006\u0010\u007f\u001a\u00020G2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020Z0CH\u0096A¢\u0006\u0005\b\u0080\u0001\u0010{J:\u0010\u0082\u0001\u001a\u0002082\f\u0010F\u001a\b\u0012\u0004\u0012\u00020Z0C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0007\u0010\u0081\u0001\u001a\u00020ZH\u0096A¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0084\u0001\u001a\u0002082\u0007\u0010\u0081\u0001\u001a\u00020ZH\u0096A¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J*\u0010\u0087\u0001\u001a\u0002082\u0007\u0010\u0086\u0001\u001a\u00020Z2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020Z0CH\u0096A¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J3\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u0002080C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0096A¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J-\u0010\u008d\u0001\u001a\u0002082\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0096A¢\u0006\u0006\b\u008d\u0001\u0010\u008c\u0001J<\u0010\u008f\u0001\u001a\u0002082\r\u0010F\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0096A¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001JR\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u0002080C2\u0007\u0010\u0091\u0001\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0014\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=0\u0092\u00012\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0096\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001JL\u0010\u0098\u0001\u001a\u0002082\u0007\u0010\u0091\u0001\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0014\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=0\u0092\u00012\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0096\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J[\u0010\u009b\u0001\u001a\u0002082\r\u0010F\u001a\t\u0012\u0005\u0012\u00030\u009a\u00010C2\u0007\u0010\u0091\u0001\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0014\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=0\u0092\u00012\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0096\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J2\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u0002080C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0007\u0010\u009d\u0001\u001a\u00020-H\u0096A¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J,\u0010 \u0001\u001a\u0002082\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0007\u0010\u009d\u0001\u001a\u00020-H\u0096A¢\u0006\u0006\b \u0001\u0010\u009f\u0001J:\u0010¡\u0001\u001a\u0002082\f\u0010F\u001a\b\u0012\u0004\u0012\u0002080C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0007\u0010\u009d\u0001\u001a\u00020-H\u0096A¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0013\u0010£\u0001\u001a\u000208H\u0096A¢\u0006\u0006\b£\u0001\u0010¤\u0001J)\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u0002080C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020GH\u0096A¢\u0006\u0006\b¥\u0001\u0010¦\u0001J-\u0010§\u0001\u001a\u0002082\b\u0010W\u001a\u0004\u0018\u0001062\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020GH\u0096A¢\u0006\u0006\b§\u0001\u0010¨\u0001J2\u0010©\u0001\u001a\u0002082\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\r\u0010F\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010CH\u0096A¢\u0006\u0006\b©\u0001\u0010ª\u0001J3\u0010«\u0001\u001a\b\u0012\u0004\u0012\u0002080C2\b\u0010W\u001a\u0004\u0018\u0001062\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020GH\u0096A¢\u0006\u0006\b«\u0001\u0010¨\u0001J,\u0010¬\u0001\u001a\u0002082\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\u0007\u0010\u0081\u0001\u001a\u00020ZH\u0096A¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J!\u0010®\u0001\u001a\u0002082\f\u0010F\u001a\b\u0012\u0004\u0012\u0002060CH\u0096A¢\u0006\u0006\b®\u0001\u0010¯\u0001J#\u0010±\u0001\u001a\b\u0012\u0004\u0012\u0002080C2\b\u0010\u008a\u0001\u001a\u00030°\u0001H\u0096A¢\u0006\u0006\b±\u0001\u0010²\u0001J\u001d\u0010³\u0001\u001a\u0002082\b\u0010\u008a\u0001\u001a\u00030°\u0001H\u0096A¢\u0006\u0006\b³\u0001\u0010²\u0001J,\u0010µ\u0001\u001a\u0002082\r\u0010F\u001a\t\u0012\u0005\u0012\u00030´\u00010C2\b\u0010\u008a\u0001\u001a\u00030°\u0001H\u0096A¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\"\u0010¸\u0001\u001a\u0002082\r\u0010F\u001a\t\u0012\u0005\u0012\u00030·\u00010CH\u0096\u0001¢\u0006\u0006\b¸\u0001\u0010¹\u0001J)\u0010»\u0001\u001a\u0002082\u0007\u0010º\u0001\u001a\u00020G2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002080CH\u0096\u0001¢\u0006\u0005\b»\u0001\u0010yJ(\u0010¼\u0001\u001a\u0002082\u0013\u0010F\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030·\u00010D0CH\u0096\u0001¢\u0006\u0006\b¼\u0001\u0010¹\u0001J<\u0010¾\u0001\u001a\u0002082\r\u0010F\u001a\t\u0012\u0005\u0012\u00030½\u00010C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\b\u0010\u0081\u0001\u001a\u00030½\u0001H\u0096A¢\u0006\u0006\b¾\u0001\u0010¿\u0001J;\u0010À\u0001\u001a\u0002082\f\u0010F\u001a\b\u0012\u0004\u0012\u0002080C2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020G2\b\u0010\u0081\u0001\u001a\u00030½\u0001H\u0096A¢\u0006\u0006\bÀ\u0001\u0010¿\u0001JL\u0010Ä\u0001\u001a\u0002082\r\u0010F\u001a\t\u0012\u0005\u0012\u00030Á\u00010C2\u0006\u0010N\u001a\u00020M2\u0006\u0010L\u001a\u00020J2\t\u0010Â\u0001\u001a\u0004\u0018\u00010G2\r\u0010P\u001a\t\u0012\u0005\u0012\u00030Ã\u00010OH\u0096A¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J#\u0010È\u0001\u001a\b\u0012\u0004\u0012\u0002080C2\b\u0010Ç\u0001\u001a\u00030Æ\u0001H\u0096A¢\u0006\u0006\bÈ\u0001\u0010É\u0001J(\u0010Ê\u0001\u001a\u0002082\u0013\u0010F\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Æ\u00010D0CH\u0096A¢\u0006\u0006\bÊ\u0001\u0010¯\u0001J,\u0010Ë\u0001\u001a\u0002082\b\u0010Ç\u0001\u001a\u00030Æ\u00012\r\u0010F\u001a\t\u0012\u0005\u0012\u00030Æ\u00010CH\u0096A¢\u0006\u0006\bË\u0001\u0010Ì\u0001J,\u0010Í\u0001\u001a\u0002082\b\u0010Ç\u0001\u001a\u00030Æ\u00012\r\u0010F\u001a\t\u0012\u0005\u0012\u00030Æ\u00010CH\u0096A¢\u0006\u0006\bÍ\u0001\u0010Ì\u0001J,\u0010Î\u0001\u001a\u0002082\b\u0010Ç\u0001\u001a\u00030Æ\u00012\r\u0010F\u001a\t\u0012\u0005\u0012\u00030Æ\u00010CH\u0096A¢\u0006\u0006\bÎ\u0001\u0010Ì\u0001J4\u0010Ò\u0001\u001a\u0002082\u0006\u0010T\u001a\u00020G2\b\u0010Ð\u0001\u001a\u00030Ï\u00012\r\u0010F\u001a\t\u0012\u0005\u0012\u00030Ñ\u00010CH\u0096A¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J4\u0010Õ\u0001\u001a\u0002082\u0006\u0010T\u001a\u00020G2\b\u0010Ô\u0001\u001a\u00030\u0094\u00012\r\u0010F\u001a\t\u0012\u0005\u0012\u00030Ñ\u00010CH\u0096A¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J \u0010×\u0001\u001a\b\u0012\u0004\u0012\u0002080C2\u0006\u0010i\u001a\u00020GH\u0096A¢\u0006\u0005\b×\u0001\u0010}J#\u0010Ù\u0001\u001a\b\u0012\u0004\u0012\u0002080C2\b\u0010\u008a\u0001\u001a\u00030Ø\u0001H\u0096A¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u001d\u0010Û\u0001\u001a\u0002082\b\u0010\u008a\u0001\u001a\u00030Ø\u0001H\u0096A¢\u0006\u0006\bÛ\u0001\u0010Ú\u0001J,\u0010Ý\u0001\u001a\u0002082\r\u0010F\u001a\t\u0012\u0005\u0012\u00030Ü\u00010C2\b\u0010\u008a\u0001\u001a\u00030Ø\u0001H\u0096A¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J \u0010ß\u0001\u001a\b\u0012\u0004\u0012\u0002080C2\u0006\u0010U\u001a\u00020GH\u0096A¢\u0006\u0005\bß\u0001\u0010}J\u001a\u0010à\u0001\u001a\u0002082\u0006\u0010U\u001a\u00020GH\u0096A¢\u0006\u0005\bà\u0001\u0010}J(\u0010á\u0001\u001a\u0002082\u0006\u0010U\u001a\u00020G2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020Z0CH\u0096A¢\u0006\u0005\bá\u0001\u0010{R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010â\u0001R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010ã\u0001R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010ä\u0001R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010å\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010æ\u0001R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010ç\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010è\u0001R\u0015\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010é\u0001R\u001b\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010ê\u0001R\u0015\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b0\u0010ë\u0001R\u001f\u0010ï\u0001\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\bì\u0001\u0010í\u0001\u001a\u0005\bî\u0001\u00105¨\u0006ð\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;", "Lio/getstream/chat/android/client/plugin/Plugin;", "Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;", "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelsListener;", "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;", "Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;", "Lio/getstream/chat/android/client/plugin/listeners/ChannelMarkReadListener;", "Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;", "Lio/getstream/chat/android/client/plugin/listeners/MarkAllReadListener;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;", "Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;", "Lio/getstream/chat/android/client/plugin/listeners/SendGiphyListener;", "Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;", "Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/TypingEventListener;", "Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;", "Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;", "Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;", "Lio/getstream/chat/android/client/plugin/listeners/BlockUserListener;", "Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/UnblockUserListener;", "Lio/getstream/chat/android/client/plugin/listeners/LiveLocationListener;", "Lio/getstream/chat/android/client/plugin/listeners/QueryBlockedUsersListener;", "Lio/getstream/chat/android/client/plugin/listeners/PushPreferencesListener;", "Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;", "errorHandlerFactory", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "repositoryFacade", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Lio/getstream/chat/android/client/api/state/StateRegistry;", "stateRegistry", "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;", "syncManager", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;", "eventHandler", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "mutableGlobalState", "Lec3/p1;", "", "queryingChannelsFree", "Lio/getstream/chat/android/client/api/ChatClientConfig;", "chatClientConfig", "<init>", "(Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lec3/p1;Lio/getstream/chat/android/client/api/ChatClientConfig;)V", "Lio/getstream/chat/android/client/errorhandler/ErrorHandler;", "getErrorHandler", "()Lio/getstream/chat/android/client/errorhandler/ErrorHandler;", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Ll83/a0;", "onUserSet", "(Lio/getstream/chat/android/models/User;)V", "onUserDisconnected", "()V", "", "T", "Lj93/d;", "klass", "resolveDependency", "(Lj93/d;)Ljava/lang/Object;", "Ln23/h;", "", "Lio/getstream/chat/android/models/Member;", "result", "", "channelType", "channelId", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", QueryChannelRequest.KEY_MEMBERS, "onQueryMembersResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "cid", "messageId", "reactionType", "currentUser", "onDeleteReactionRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Message;", "onDeleteReactionResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onDeleteReactionPrecondition", "(Lio/getstream/chat/android/models/User;)Ln23/h;", "Lio/getstream/chat/android/models/Reaction;", "reaction", "onSendReactionPrecondition", "(Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;", "enforceUnique", "skipPush", "onSendReactionRequest", "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "onSendReactionResult", "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;", "parentId", "onGetRepliesRequest", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "onGetRepliesResult", "(Ln23/h;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "lastId", "onGetNewerRepliesRequest", "(Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "firstId", "onGetRepliesMoreRequest", "(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "onGetRepliesMoreResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "onGetNewerRepliesResult", "(Ln23/h;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "onGiphySendResult", "(Ljava/lang/String;Ln23/h;)V", "onShuffleGiphyResult", "(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onMessageDeletePrecondition", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "onMessageDeleteRequest", "originalMessageId", "onMessageDeleteResult", "message", "onMessageSendResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "onMessageEditRequest", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "originalMessage", "onMessageEditResult", "(Lio/getstream/chat/android/models/Message;Ln23/h;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "request", "onQueryChannelPrecondition", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "onQueryChannelRequest", "Lio/getstream/chat/android/models/Channel;", "onQueryChannelResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "eventType", "", "extraData", "Ljava/util/Date;", "eventTime", "onTypingEventPrecondition", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)Ln23/h;", "onTypingEventRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V", "Lio/getstream/chat/android/client/events/ChatEvent;", "onTypingEventResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V", "clearHistory", "onHideChannelPrecondition", "(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "onHideChannelRequest", "onHideChannelResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "onMarkAllReadRequest", "(Lq83/d;)Ljava/lang/Object;", "onChannelMarkReadPrecondition", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "onDeleteChannelRequest", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "onDeleteChannelResult", "(Ljava/lang/String;Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onDeleteChannelPrecondition", "onAttachmentSendRequest", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "onFetchCurrentUserResult", "(Ln23/h;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "onQueryThreadsPrecondition", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;", "onQueryThreadsRequest", "Lio/getstream/chat/android/models/QueryThreadsResult;", "onQueryThreadsResult", "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/UserBlock;", "onBlockUserResult", "(Ln23/h;)V", "userId", "onUnblockUserResult", "onQueryBlockedUsersResult", "Lio/getstream/chat/android/models/DraftMessage;", "onCreateDraftMessageResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;", "onDeleteDraftMessagesResult", "Lio/getstream/chat/android/models/QueryDraftsResult;", "next", "Lio/getstream/chat/android/models/DraftsSort;", "onQueryDraftMessagesResult", "(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Location;", "location", "onUpdateLiveLocationPrecondition", "(Lio/getstream/chat/android/models/Location;Lq83/d;)Ljava/lang/Object;", "onQueryActiveLocationsResult", "onUpdateLiveLocationResult", "(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onStopLiveLocationSharingResult", "onStartLiveLocationSharingResult", "Lio/getstream/chat/android/models/PushPreferenceLevel;", "level", "Lio/getstream/chat/android/models/PushPreference;", "onChannelPushPreferenceSet", "(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;Ln23/h;Lq83/d;)Ljava/lang/Object;", "until", "onChannelPushNotificationsSnoozed", "(Ljava/lang/String;Ljava/util/Date;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onGetRepliesPrecondition", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "onQueryChannelsPrecondition", "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;", "onQueryChannelsRequest", "Lio/getstream/chat/android/client/api/models/QueryChannelsResult;", "onQueryChannelsResult", "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;", "onDeleteMessageForMePrecondition", "onDeleteMessageForMeRequest", "onDeleteMessageForMeResult", "Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lio/getstream/chat/android/client/api/state/StateRegistry;", "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "Lec3/p1;", "Lio/getstream/chat/android/client/api/ChatClientConfig;", "lazyErrorHandler$delegate", "Ll83/h;", "getLazyErrorHandler", "lazyErrorHandler", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StatePlugin implements Plugin, QueryMembersListener, QueryChannelsListener, QueryChannelListener, ThreadQueryListener, ChannelMarkReadListener, EditMessageListener, HideChannelListener, MarkAllReadListener, DeleteReactionListener, DeleteChannelListener, SendReactionListener, DeleteMessageListener, DeleteMessageForMeListener, SendGiphyListener, ShuffleGiphyListener, SendMessageListener, TypingEventListener, SendAttachmentListener, FetchCurrentUserListener, QueryThreadsListener, BlockUserListener, DraftMessageListener, UnblockUserListener, LiveLocationListener, QueryBlockedUsersListener, PushPreferencesListener {
    private final /* synthetic */ QueryMembersListenerState $$delegate_0;
    private final /* synthetic */ QueryChannelsListenerState $$delegate_1;
    private final /* synthetic */ SendReactionListenerState $$delegate_10;
    private final /* synthetic */ DeleteMessageListenerState $$delegate_11;
    private final /* synthetic */ DeleteMessageForMeListenerState $$delegate_12;
    private final /* synthetic */ SendGiphyListenerState $$delegate_13;
    private final /* synthetic */ ShuffleGiphyListenerState $$delegate_14;
    private final /* synthetic */ SendMessageListenerState $$delegate_15;
    private final /* synthetic */ TypingEventListenerState $$delegate_16;
    private final /* synthetic */ SendAttachmentListenerState $$delegate_17;
    private final /* synthetic */ FetchCurrentUserListenerState $$delegate_18;
    private final /* synthetic */ QueryThreadsListenerState $$delegate_19;
    private final /* synthetic */ QueryChannelListenerState $$delegate_2;
    private final /* synthetic */ BlockUserListenerState $$delegate_20;
    private final /* synthetic */ DraftMessageListenerState $$delegate_21;
    private final /* synthetic */ UnblockUserListenerState $$delegate_22;
    private final /* synthetic */ LiveLocationListenerState $$delegate_23;
    private final /* synthetic */ QueryBlockedUsersListenerState $$delegate_24;
    private final /* synthetic */ PushPreferencesListenerState $$delegate_25;
    private final /* synthetic */ ThreadQueryListenerState $$delegate_3;
    private final /* synthetic */ ChannelMarkReadListenerState $$delegate_4;
    private final /* synthetic */ EditMessageListenerState $$delegate_5;
    private final /* synthetic */ HideChannelListenerState $$delegate_6;
    private final /* synthetic */ MarkAllReadListenerState $$delegate_7;
    private final /* synthetic */ DeleteReactionListenerState $$delegate_8;
    private final /* synthetic */ DeleteChannelListenerState $$delegate_9;
    private final ChatClientConfig chatClientConfig;
    private final ClientState clientState;
    private final ErrorHandlerFactory errorHandlerFactory;
    private final EventHandler eventHandler;

    /* JADX INFO: renamed from: lazyErrorHandler$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h lazyErrorHandler;
    private final LogicRegistry logic;
    private final MutableGlobalState mutableGlobalState;
    private final InterfaceC13075p1 queryingChannelsFree;
    private final RepositoryFacade repositoryFacade;
    private final StateRegistry stateRegistry;
    private final SyncManager syncManager;

    public StatePlugin(ErrorHandlerFactory errorHandlerFactory, LogicRegistry logic, RepositoryFacade repositoryFacade, ClientState clientState, StateRegistry stateRegistry, SyncManager syncManager, EventHandler eventHandler, MutableGlobalState mutableGlobalState, InterfaceC13075p1 queryingChannelsFree, ChatClientConfig chatClientConfig) {
        AbstractC22676k.m65750j(errorHandlerFactory, "errorHandlerFactory");
        AbstractC22676k.m65750j(logic, "logic");
        AbstractC22676k.m65750j(repositoryFacade, "repositoryFacade");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(stateRegistry, "stateRegistry");
        AbstractC22676k.m65750j(syncManager, "syncManager");
        AbstractC22676k.m65750j(eventHandler, "eventHandler");
        AbstractC22676k.m65750j(mutableGlobalState, "mutableGlobalState");
        AbstractC22676k.m65750j(queryingChannelsFree, "queryingChannelsFree");
        AbstractC22676k.m65750j(chatClientConfig, "chatClientConfig");
        this.$$delegate_0 = new QueryMembersListenerState(logic);
        this.$$delegate_1 = new QueryChannelsListenerState(logic, queryingChannelsFree);
        this.$$delegate_2 = new QueryChannelListenerState(logic);
        this.$$delegate_3 = new ThreadQueryListenerState(logic, repositoryFacade);
        this.$$delegate_4 = new ChannelMarkReadListenerState(logic);
        this.$$delegate_5 = new EditMessageListenerState(logic, clientState);
        this.$$delegate_6 = new HideChannelListenerState(logic);
        this.$$delegate_7 = new MarkAllReadListenerState(logic);
        this.$$delegate_8 = new DeleteReactionListenerState(logic, clientState);
        this.$$delegate_9 = new DeleteChannelListenerState(logic, clientState);
        this.$$delegate_10 = new SendReactionListenerState(logic, clientState);
        this.$$delegate_11 = new DeleteMessageListenerState(logic, clientState, mutableGlobalState);
        this.$$delegate_12 = new DeleteMessageForMeListenerState(logic, clientState);
        this.$$delegate_13 = new SendGiphyListenerState(logic);
        this.$$delegate_14 = new ShuffleGiphyListenerState(logic);
        this.$$delegate_15 = new SendMessageListenerState(logic);
        this.$$delegate_16 = new TypingEventListenerState(logic);
        this.$$delegate_17 = new SendAttachmentListenerState(logic);
        this.$$delegate_18 = new FetchCurrentUserListenerState(clientState, mutableGlobalState);
        this.$$delegate_19 = new QueryThreadsListenerState(logic);
        this.$$delegate_20 = new BlockUserListenerState(mutableGlobalState);
        this.$$delegate_21 = new DraftMessageListenerState(mutableGlobalState);
        this.$$delegate_22 = new UnblockUserListenerState(mutableGlobalState);
        this.$$delegate_23 = new LiveLocationListenerState(mutableGlobalState);
        this.$$delegate_24 = new QueryBlockedUsersListenerState(mutableGlobalState);
        this.$$delegate_25 = new PushPreferencesListenerState(logic);
        this.errorHandlerFactory = errorHandlerFactory;
        this.logic = logic;
        this.repositoryFacade = repositoryFacade;
        this.clientState = clientState;
        this.stateRegistry = stateRegistry;
        this.syncManager = syncManager;
        this.eventHandler = eventHandler;
        this.mutableGlobalState = mutableGlobalState;
        this.queryingChannelsFree = queryingChannelsFree;
        this.chatClientConfig = chatClientConfig;
        this.lazyErrorHandler = AbstractC30060g.m92088H(new C19683b(this, 12));
    }

    /* JADX INFO: renamed from: a */
    public static ErrorHandler m54788a(StatePlugin statePlugin) {
        return statePlugin.errorHandlerFactory.create();
    }

    private final ErrorHandler getLazyErrorHandler() {
        return (ErrorHandler) this.lazyErrorHandler.getValue();
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin
    public final ErrorHandler getErrorHandler() {
        return getLazyErrorHandler();
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.SendAttachmentListener
    public final Object onAttachmentSendRequest(String str, String str2, Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_17.onAttachmentSendRequest(str, str2, message, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.BlockUserListener
    public final void onBlockUserResult(AbstractC26205h result) {
        AbstractC22676k.m65750j(result, "result");
        this.$$delegate_20.onBlockUserResult(result);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.ChannelMarkReadListener
    public final Object onChannelMarkReadPrecondition(String str, String str2, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.$$delegate_4.onChannelMarkReadPrecondition(str, str2, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.PushPreferencesListener
    public final Object onChannelPushNotificationsSnoozed(String str, Date date, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_25.onChannelPushNotificationsSnoozed(str, date, abstractC26205h, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.PushPreferencesListener
    public final Object onChannelPushPreferenceSet(String str, PushPreferenceLevel pushPreferenceLevel, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_25.onChannelPushPreferenceSet(str, pushPreferenceLevel, abstractC26205h, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DraftMessageListener
    public final Object onCreateDraftMessageResult(AbstractC26205h abstractC26205h, String str, String str2, DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_21.onCreateDraftMessageResult(abstractC26205h, str, str2, draftMessage, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteChannelListener
    public final Object onDeleteChannelPrecondition(User user, String str, String str2, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.$$delegate_9.onDeleteChannelPrecondition(user, str, str2, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteChannelListener
    public final Object onDeleteChannelRequest(User user, String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_9.getClass();
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteChannelListener
    public final Object onDeleteChannelResult(String str, String str2, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_9.getClass();
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DraftMessageListener
    public final Object onDeleteDraftMessagesResult(AbstractC26205h abstractC26205h, String str, String str2, DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_21.onDeleteDraftMessagesResult(abstractC26205h, str, str2, draftMessage, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteMessageForMeListener
    public final Object onDeleteMessageForMePrecondition(String str, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        DeleteMessageForMeListenerState deleteMessageForMeListenerState = this.$$delegate_12;
        deleteMessageForMeListenerState.getClass();
        return DeleteMessageForMeListener.onDeleteMessageForMePrecondition$suspendImpl(deleteMessageForMeListenerState, str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteMessageForMeListener
    public final Object onDeleteMessageForMeRequest(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_12.onDeleteMessageForMeRequest(str, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteMessageForMeListener
    public final Object onDeleteMessageForMeResult(String str, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_12.onDeleteMessageForMeResult(str, abstractC26205h, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteReactionListener
    public final AbstractC26205h onDeleteReactionPrecondition(User currentUser) {
        return this.$$delegate_8.onDeleteReactionPrecondition(currentUser);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteReactionListener
    public final Object onDeleteReactionRequest(String str, String str2, String str3, User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_8.onDeleteReactionRequest(str, str2, str3, user, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteReactionListener
    public final Object onDeleteReactionResult(String str, String str2, String str3, User user, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_8.getClass();
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.FetchCurrentUserListener
    public final Object onFetchCurrentUserResult(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_18.onFetchCurrentUserResult(abstractC26205h, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetNewerRepliesRequest(String str, int i13, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_3.onGetNewerRepliesRequest(str, i13, str2, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetNewerRepliesResult(AbstractC26205h abstractC26205h, String str, int i13, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_3.onGetNewerRepliesResult(abstractC26205h, str, i13, str2, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesMoreRequest(String str, String str2, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_3.onGetRepliesMoreRequest(str, str2, i13, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesMoreResult(AbstractC26205h abstractC26205h, String str, String str2, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_3.onGetRepliesMoreResult(abstractC26205h, str, str2, i13, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesPrecondition(String str, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.$$delegate_3.onGetRepliesPrecondition(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesRequest(String str, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_3.onGetRepliesRequest(str, i13, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesResult(AbstractC26205h abstractC26205h, String str, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_3.onGetRepliesResult(abstractC26205h, str, i13, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.SendGiphyListener
    public final void onGiphySendResult(String cid, AbstractC26205h result) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(result, "result");
        this.$$delegate_13.onGiphySendResult(cid, result);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.HideChannelListener
    public final Object onHideChannelPrecondition(String str, String str2, boolean z4, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.$$delegate_6.onHideChannelPrecondition(str, str2, z4, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.HideChannelListener
    public final Object onHideChannelRequest(String str, String str2, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_6.onHideChannelRequest(str, str2, z4, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.HideChannelListener
    public final Object onHideChannelResult(AbstractC26205h abstractC26205h, String str, String str2, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_6.onHideChannelResult(abstractC26205h, str, str2, z4, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.MarkAllReadListener
    public final Object onMarkAllReadRequest(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_7.onMarkAllReadRequest(interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteMessageListener
    public final Object onMessageDeletePrecondition(String str, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.$$delegate_11.onMessageDeletePrecondition(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteMessageListener
    public final Object onMessageDeleteRequest(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_11.onMessageDeleteRequest(str, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteMessageListener
    public final Object onMessageDeleteResult(String str, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_11.onMessageDeleteResult(str, abstractC26205h, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.EditMessageListener
    public final Object onMessageEditRequest(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_5.onMessageEditRequest(message, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.EditMessageListener
    public final Object onMessageEditResult(Message message, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_5.onMessageEditResult(message, abstractC26205h, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.SendMessageListener
    public final Object onMessageSendResult(AbstractC26205h abstractC26205h, String str, String str2, Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.$$delegate_15.onMessageSendResult(abstractC26205h, str, str2, message, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.LiveLocationListener
    public final Object onQueryActiveLocationsResult(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_23.onQueryActiveLocationsResult(abstractC26205h, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.QueryBlockedUsersListener
    public final void onQueryBlockedUsersResult(AbstractC26205h result) {
        AbstractC22676k.m65750j(result, "result");
        this.$$delegate_24.onQueryBlockedUsersResult(result);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.QueryChannelListener
    public final Object onQueryChannelPrecondition(String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.$$delegate_2.onQueryChannelPrecondition(str, str2, queryChannelRequest, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.QueryChannelListener
    public final Object onQueryChannelRequest(String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.$$delegate_2.onQueryChannelRequest(str, str2, queryChannelRequest, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.QueryChannelListener
    public final Object onQueryChannelResult(AbstractC26205h abstractC26205h, String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_2.onQueryChannelResult(abstractC26205h, str, str2, queryChannelRequest, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.QueryChannelsListener
    public final Object onQueryChannelsPrecondition(QueryChannelsRequest queryChannelsRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.$$delegate_1.onQueryChannelsPrecondition(queryChannelsRequest, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.QueryChannelsListener
    public final Object onQueryChannelsRequest(QueryChannelsRequest queryChannelsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.$$delegate_1.onQueryChannelsRequest(queryChannelsRequest, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.QueryChannelsListener
    public final Object onQueryChannelsResult(AbstractC26205h abstractC26205h, QueryChannelsRequest queryChannelsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.$$delegate_1.onQueryChannelsResult(abstractC26205h, queryChannelsRequest, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DraftMessageListener
    public final Object onQueryDraftMessagesResult(AbstractC26205h abstractC26205h, FilterObject filterObject, int i13, String str, QuerySorter<DraftsSort> querySorter, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_21.onQueryDraftMessagesResult(abstractC26205h, filterObject, i13, str, querySorter, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.QueryMembersListener
    public final Object onQueryMembersResult(AbstractC26205h abstractC26205h, String str, String str2, int i13, int i14, FilterObject filterObject, QuerySorter<Member> querySorter, List<Member> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_0.onQueryMembersResult(abstractC26205h, str, str2, i13, i14, filterObject, querySorter, list, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.QueryThreadsListener
    public final Object onQueryThreadsPrecondition(QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.$$delegate_19.onQueryThreadsPrecondition(queryThreadsRequest, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.QueryThreadsListener
    public final Object onQueryThreadsRequest(QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.$$delegate_19.onQueryThreadsRequest(queryThreadsRequest, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.QueryThreadsListener
    public final Object onQueryThreadsResult(AbstractC26205h abstractC26205h, QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.$$delegate_19.onQueryThreadsResult(abstractC26205h, queryThreadsRequest, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.SendReactionListener
    public final Object onSendReactionPrecondition(String str, User user, Reaction reaction, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.$$delegate_10.onSendReactionPrecondition(str, user, reaction, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.SendReactionListener
    public final Object onSendReactionRequest(String str, Reaction reaction, boolean z4, boolean z13, User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_10.onSendReactionRequest(str, reaction, z4, z13, user, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.SendReactionListener
    public final Object onSendReactionResult(String str, Reaction reaction, boolean z4, User user, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_10.onSendReactionResult(str, reaction, z4, user, abstractC26205h, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.ShuffleGiphyListener
    public final Object onShuffleGiphyResult(String str, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_14.onShuffleGiphyResult(str, abstractC26205h, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.LiveLocationListener
    public final Object onStartLiveLocationSharingResult(Location location, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_23.onStartLiveLocationSharingResult(location, abstractC26205h, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.LiveLocationListener
    public final Object onStopLiveLocationSharingResult(Location location, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_23.onStopLiveLocationSharingResult(location, abstractC26205h, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.TypingEventListener
    public final AbstractC26205h onTypingEventPrecondition(String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData, Date eventTime) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(eventTime, "eventTime");
        return this.$$delegate_16.onTypingEventPrecondition(eventType, channelType, channelId, extraData, eventTime);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.TypingEventListener
    public final void onTypingEventRequest(String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData, Date eventTime) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(eventTime, "eventTime");
        this.$$delegate_16.onTypingEventRequest(eventType, channelType, channelId, extraData, eventTime);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.TypingEventListener
    public final void onTypingEventResult(AbstractC26205h result, String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData, Date eventTime) {
        AbstractC22676k.m65750j(result, "result");
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(eventTime, "eventTime");
        this.$$delegate_16.onTypingEventResult(result, eventType, channelType, channelId, extraData, eventTime);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.UnblockUserListener
    public final void onUnblockUserResult(String userId, AbstractC26205h result) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(result, "result");
        this.$$delegate_22.onUnblockUserResult(userId, result);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.LiveLocationListener
    public final Object onUpdateLiveLocationPrecondition(Location location, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.$$delegate_23.onUpdateLiveLocationPrecondition(location, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.LiveLocationListener
    public final Object onUpdateLiveLocationResult(Location location, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.$$delegate_23.onUpdateLiveLocationResult(location, abstractC26205h, interfaceC30057d);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin
    public final void onUserDisconnected() {
        this.stateRegistry.clear();
        this.logic.clear();
        this.syncManager.stop();
        this.eventHandler.stopListening();
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin
    public final void onUserSet(User user) {
        AbstractC22676k.m65750j(user, "user");
        this.syncManager.start();
        this.eventHandler.startListening();
    }

    @Override // io.getstream.chat.android.client.plugin.DependencyResolver
    @InternalStreamChatApi
    public final <T> T resolveDependency(InterfaceC21461d klass) {
        AbstractC22676k.m65750j(klass, "klass");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        if (klass.equals(c22673i0.getOrCreateKotlinClass(SyncHistoryManager.class))) {
            T t14 = (T) this.syncManager;
            AbstractC22676k.m65748h(t14, "null cannot be cast to non-null type T of io.getstream.chat.android.client.internal.state.plugin.internal.StatePlugin.resolveDependency");
            return t14;
        }
        if (klass.equals(c22673i0.getOrCreateKotlinClass(EventHandler.class))) {
            T t15 = (T) this.eventHandler;
            AbstractC22676k.m65748h(t15, "null cannot be cast to non-null type T of io.getstream.chat.android.client.internal.state.plugin.internal.StatePlugin.resolveDependency");
            return t15;
        }
        if (klass.equals(c22673i0.getOrCreateKotlinClass(LogicRegistry.class))) {
            T t16 = (T) this.logic;
            AbstractC22676k.m65748h(t16, "null cannot be cast to non-null type T of io.getstream.chat.android.client.internal.state.plugin.internal.StatePlugin.resolveDependency");
            return t16;
        }
        if (klass.equals(c22673i0.getOrCreateKotlinClass(StateRegistry.class))) {
            T t17 = (T) this.stateRegistry;
            AbstractC22676k.m65748h(t17, "null cannot be cast to non-null type T of io.getstream.chat.android.client.internal.state.plugin.internal.StatePlugin.resolveDependency");
            return t17;
        }
        if (klass.equals(c22673i0.getOrCreateKotlinClass(GlobalState.class))) {
            T t18 = (T) this.mutableGlobalState;
            AbstractC22676k.m65748h(t18, "null cannot be cast to non-null type T of io.getstream.chat.android.client.internal.state.plugin.internal.StatePlugin.resolveDependency");
            return t18;
        }
        if (!klass.equals(c22673i0.getOrCreateKotlinClass(ChatClientConfig.class))) {
            return null;
        }
        T t19 = (T) this.chatClientConfig;
        AbstractC22676k.m65748h(t19, "null cannot be cast to non-null type T of io.getstream.chat.android.client.internal.state.plugin.internal.StatePlugin.resolveDependency");
        return t19;
    }
}
