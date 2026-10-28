package io.getstream.chat.android.client.plugin;

import com.mapbox.maps.MapboxMap;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.models.QueryThreadsRequest;
import io.getstream.chat.android.client.errorhandler.ErrorHandler;
import io.getstream.chat.android.client.plugin.listeners.BlockUserListener;
import io.getstream.chat.android.client.plugin.listeners.ChannelMarkReadListener;
import io.getstream.chat.android.client.plugin.listeners.CreateChannelListener;
import io.getstream.chat.android.client.plugin.listeners.DeleteChannelListener;
import io.getstream.chat.android.client.plugin.listeners.DeleteMessageForMeListener;
import io.getstream.chat.android.client.plugin.listeners.DeleteMessageListener;
import io.getstream.chat.android.client.plugin.listeners.DeleteReactionListener;
import io.getstream.chat.android.client.plugin.listeners.DraftMessageListener;
import io.getstream.chat.android.client.plugin.listeners.EditMessageListener;
import io.getstream.chat.android.client.plugin.listeners.FetchCurrentUserListener;
import io.getstream.chat.android.client.plugin.listeners.GetMessageListener;
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
import io.getstream.chat.android.client.query.CreateChannelParams;
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
import java.util.Date;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000Ê\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u00132\u00020\u00142\u00020\u00152\u00020\u00162\u00020\u00172\u00020\u00182\u00020\u00192\u00020\u001a2\u00020\u001b2\u00020\u001c2\u00020\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 Jh\u00101\u001a\u0002002\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020#0-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0096@¢\u0006\u0004\b1\u00102J2\u00108\u001a\u0002002\b\u00103\u001a\u0004\u0018\u00010%2\u0006\u00104\u001a\u00020%2\u0006\u00105\u001a\u00020%2\u0006\u00107\u001a\u000206H\u0096@¢\u0006\u0004\b8\u00109J@\u0010;\u001a\u0002002\b\u00103\u001a\u0004\u0018\u00010%2\u0006\u00104\u001a\u00020%2\u0006\u00105\u001a\u00020%2\u0006\u00107\u001a\u0002062\f\u0010$\u001a\b\u0012\u0004\u0012\u00020:0!H\u0096@¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\b\u0012\u0004\u0012\u0002000!2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b=\u0010>J2\u0010A\u001a\b\u0012\u0004\u0012\u0002000!2\b\u00103\u001a\u0004\u0018\u00010%2\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010@\u001a\u00020?H\u0096@¢\u0006\u0004\bA\u0010BJ:\u0010F\u001a\u0002002\b\u00103\u001a\u0004\u0018\u00010%2\u0006\u0010@\u001a\u00020?2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020C2\u0006\u00107\u001a\u000206H\u0096@¢\u0006\u0004\bF\u0010GJ@\u0010H\u001a\u0002002\b\u00103\u001a\u0004\u0018\u00010%2\u0006\u0010@\u001a\u00020?2\u0006\u0010D\u001a\u00020C2\u0006\u00107\u001a\u0002062\f\u0010$\u001a\b\u0012\u0004\u0012\u00020?0!H\u0096@¢\u0006\u0004\bH\u0010IJ \u0010K\u001a\u0002002\u0006\u0010J\u001a\u00020%2\u0006\u0010*\u001a\u00020(H\u0096@¢\u0006\u0004\bK\u0010LJ4\u0010M\u001a\u0002002\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\"0!2\u0006\u0010J\u001a\u00020%2\u0006\u0010*\u001a\u00020(H\u0096@¢\u0006\u0004\bM\u0010NJ*\u0010P\u001a\u0002002\u0006\u0010J\u001a\u00020%2\u0006\u0010*\u001a\u00020(2\b\u0010O\u001a\u0004\u0018\u00010%H\u0096@¢\u0006\u0004\bP\u0010QJ(\u0010S\u001a\u0002002\u0006\u0010J\u001a\u00020%2\u0006\u0010R\u001a\u00020%2\u0006\u0010*\u001a\u00020(H\u0096@¢\u0006\u0004\bS\u0010TJ<\u0010U\u001a\u0002002\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\"0!2\u0006\u0010J\u001a\u00020%2\u0006\u0010R\u001a\u00020%2\u0006\u0010*\u001a\u00020(H\u0096@¢\u0006\u0004\bU\u0010VJ>\u0010W\u001a\u0002002\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\"0!2\u0006\u0010J\u001a\u00020%2\u0006\u0010*\u001a\u00020(2\b\u0010O\u001a\u0004\u0018\u00010%H\u0096@¢\u0006\u0004\bW\u0010XJ%\u0010Y\u001a\u0002002\u0006\u00103\u001a\u00020%2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020:0!H\u0016¢\u0006\u0004\bY\u0010ZJ&\u0010[\u001a\u0002002\u0006\u00103\u001a\u00020%2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020:0!H\u0096@¢\u0006\u0004\b[\u0010\\J\u001e\u0010]\u001a\b\u0012\u0004\u0012\u0002000!2\u0006\u00104\u001a\u00020%H\u0096@¢\u0006\u0004\b]\u0010^J\u0018\u0010_\u001a\u0002002\u0006\u00104\u001a\u00020%H\u0096@¢\u0006\u0004\b_\u0010^J&\u0010a\u001a\u0002002\u0006\u0010`\u001a\u00020%2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020:0!H\u0096@¢\u0006\u0004\ba\u0010\\J6\u0010c\u001a\u0002002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020:0!2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010b\u001a\u00020:H\u0096@¢\u0006\u0004\bc\u0010dJ\u0018\u0010e\u001a\u0002002\u0006\u0010b\u001a\u00020:H\u0096@¢\u0006\u0004\be\u0010fJ&\u0010h\u001a\u0002002\u0006\u0010g\u001a\u00020:2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020:0!H\u0096@¢\u0006\u0004\bh\u0010iJ.\u0010l\u001a\b\u0012\u0004\u0012\u0002000!2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010k\u001a\u00020jH\u0096@¢\u0006\u0004\bl\u0010mJ(\u0010n\u001a\u0002002\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010k\u001a\u00020jH\u0096@¢\u0006\u0004\bn\u0010mJ6\u0010p\u001a\u0002002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020o0!2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010k\u001a\u00020jH\u0096@¢\u0006\u0004\bp\u0010qJI\u0010x\u001a\b\u0012\u0004\u0012\u0002000!2\u0006\u0010r\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0012\u0010u\u001a\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020t0s2\u0006\u0010w\u001a\u00020vH\u0016¢\u0006\u0004\bx\u0010yJC\u0010z\u001a\u0002002\u0006\u0010r\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0012\u0010u\u001a\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020t0s2\u0006\u0010w\u001a\u00020vH\u0016¢\u0006\u0004\bz\u0010{JQ\u0010}\u001a\u0002002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020|0!2\u0006\u0010r\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0012\u0010u\u001a\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020t0s2\u0006\u0010w\u001a\u00020vH\u0016¢\u0006\u0004\b}\u0010~J1\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u0002000!2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010\u007f\u001a\u00020CH\u0096@¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J+\u0010\u0082\u0001\u001a\u0002002\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010\u007f\u001a\u00020CH\u0096@¢\u0006\u0006\b\u0082\u0001\u0010\u0081\u0001J9\u0010\u0083\u0001\u001a\u0002002\f\u0010$\u001a\b\u0012\u0004\u0012\u0002000!2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010\u007f\u001a\u00020CH\u0096@¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0013\u0010\u0085\u0001\u001a\u000200H\u0096@¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J)\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u0002000!2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%H\u0096@¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J5\u0010\u008b\u0001\u001a\u0002002\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\u0010\u008a\u0001\u001a\u00030\u0089\u00012\u0006\u00107\u001a\u000206H\u0096@¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J@\u0010\u008e\u0001\u001a\u0002002\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\r\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020%0\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020o0!H\u0096@¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J9\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u0002000!2\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010'\u001a\u00020%2\r\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J-\u0010\u0092\u0001\u001a\u0002002\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%H\u0096@¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J1\u0010\u0094\u0001\u001a\u0002002\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020o0!H\u0096@¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J3\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u0002000!2\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%H\u0096@¢\u0006\u0006\b\u0096\u0001\u0010\u0093\u0001J+\u0010\u0097\u0001\u001a\u0002002\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010b\u001a\u00020:H\u0096@¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001b\u0010\u009a\u0001\u001a\u0002002\u0007\u0010\u0099\u0001\u001a\u000206H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0012\u0010\u009c\u0001\u001a\u000200H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J(\u0010\u009e\u0001\u001a\u0002002\u0006\u00104\u001a\u00020%2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020:0!H\u0096@¢\u0006\u0005\b\u009e\u0001\u0010\\J!\u0010\u009f\u0001\u001a\u0002002\f\u0010$\u001a\b\u0012\u0004\u0012\u0002060!H\u0096@¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\"\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u0002000!2\u0007\u0010k\u001a\u00030¡\u0001H\u0096@¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001c\u0010¤\u0001\u001a\u0002002\u0007\u0010k\u001a\u00030¡\u0001H\u0096@¢\u0006\u0006\b¤\u0001\u0010£\u0001J+\u0010¦\u0001\u001a\u0002002\r\u0010$\u001a\t\u0012\u0005\u0012\u00030¥\u00010!2\u0007\u0010k\u001a\u00030¡\u0001H\u0096@¢\u0006\u0006\b¦\u0001\u0010§\u0001J!\u0010©\u0001\u001a\u0002002\r\u0010$\u001a\t\u0012\u0005\u0012\u00030¨\u00010!H\u0016¢\u0006\u0006\b©\u0001\u0010ª\u0001J(\u0010¬\u0001\u001a\u0002002\u0007\u0010«\u0001\u001a\u00020%2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002000!H\u0016¢\u0006\u0005\b¬\u0001\u0010ZJ'\u0010\u00ad\u0001\u001a\u0002002\u0013\u0010$\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¨\u00010\"0!H\u0016¢\u0006\u0006\b\u00ad\u0001\u0010ª\u0001J;\u0010¯\u0001\u001a\u0002002\r\u0010$\u001a\t\u0012\u0005\u0012\u00030®\u00010!2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0007\u0010b\u001a\u00030®\u0001H\u0096@¢\u0006\u0006\b¯\u0001\u0010°\u0001J:\u0010±\u0001\u001a\u0002002\f\u0010$\u001a\b\u0012\u0004\u0012\u0002000!2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0007\u0010b\u001a\u00030®\u0001H\u0096@¢\u0006\u0006\b±\u0001\u0010°\u0001JL\u0010µ\u0001\u001a\u0002002\r\u0010$\u001a\t\u0012\u0005\u0012\u00030²\u00010!2\u0006\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020(2\t\u0010³\u0001\u001a\u0004\u0018\u00010%2\r\u0010.\u001a\t\u0012\u0005\u0012\u00030´\u00010-H\u0096@¢\u0006\u0006\bµ\u0001\u0010¶\u0001J#\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u0002000!2\b\u0010¸\u0001\u001a\u00030·\u0001H\u0096@¢\u0006\u0006\b¹\u0001\u0010º\u0001J(\u0010»\u0001\u001a\u0002002\u0013\u0010$\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030·\u00010\"0!H\u0096@¢\u0006\u0006\b»\u0001\u0010 \u0001J,\u0010¼\u0001\u001a\u0002002\b\u0010¸\u0001\u001a\u00030·\u00012\r\u0010$\u001a\t\u0012\u0005\u0012\u00030·\u00010!H\u0096@¢\u0006\u0006\b¼\u0001\u0010½\u0001J,\u0010¾\u0001\u001a\u0002002\b\u0010¸\u0001\u001a\u00030·\u00012\r\u0010$\u001a\t\u0012\u0005\u0012\u00030·\u00010!H\u0096@¢\u0006\u0006\b¾\u0001\u0010½\u0001J,\u0010¿\u0001\u001a\u0002002\b\u0010¸\u0001\u001a\u00030·\u00012\r\u0010$\u001a\t\u0012\u0005\u0012\u00030·\u00010!H\u0096@¢\u0006\u0006\b¿\u0001\u0010½\u0001J4\u0010Ã\u0001\u001a\u0002002\u0006\u00103\u001a\u00020%2\b\u0010Á\u0001\u001a\u00030À\u00012\r\u0010$\u001a\t\u0012\u0005\u0012\u00030Â\u00010!H\u0096@¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J3\u0010Æ\u0001\u001a\u0002002\u0006\u00103\u001a\u00020%2\u0007\u0010Å\u0001\u001a\u00020v2\r\u0010$\u001a\t\u0012\u0005\u0012\u00030Â\u00010!H\u0096@¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006È\u0001À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/Plugin;", "Lio/getstream/chat/android/client/plugin/DependencyResolver;", "Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;", "Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;", "Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;", "Lio/getstream/chat/android/client/plugin/listeners/SendGiphyListener;", "Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;", "Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;", "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelsListener;", "Lio/getstream/chat/android/client/plugin/listeners/TypingEventListener;", "Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;", "Lio/getstream/chat/android/client/plugin/listeners/MarkAllReadListener;", "Lio/getstream/chat/android/client/plugin/listeners/ChannelMarkReadListener;", "Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;", "Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;", "Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;", "Lio/getstream/chat/android/client/plugin/listeners/BlockUserListener;", "Lio/getstream/chat/android/client/plugin/listeners/UnblockUserListener;", "Lio/getstream/chat/android/client/plugin/listeners/QueryBlockedUsersListener;", "Lio/getstream/chat/android/client/plugin/listeners/LiveLocationListener;", "Lio/getstream/chat/android/client/plugin/listeners/PushPreferencesListener;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;", "Lio/getstream/chat/android/client/errorhandler/ErrorHandler;", "getErrorHandler", "()Lio/getstream/chat/android/client/errorhandler/ErrorHandler;", "Ln23/h;", "", "Lio/getstream/chat/android/models/Member;", "result", "", "channelType", "channelId", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", QueryChannelRequest.KEY_MEMBERS, "Ll83/a0;", "onQueryMembersResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "cid", "messageId", "reactionType", "Lio/getstream/chat/android/models/User;", "currentUser", "onDeleteReactionRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Message;", "onDeleteReactionResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onDeleteReactionPrecondition", "(Lio/getstream/chat/android/models/User;)Ln23/h;", "Lio/getstream/chat/android/models/Reaction;", "reaction", "onSendReactionPrecondition", "(Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;", "", "enforceUnique", "skipPush", "onSendReactionRequest", "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "onSendReactionResult", "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;", "parentId", "onGetRepliesRequest", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "onGetRepliesResult", "(Ln23/h;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "lastId", "onGetNewerRepliesRequest", "(Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "firstId", "onGetRepliesMoreRequest", "(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "onGetRepliesMoreResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "onGetNewerRepliesResult", "(Ln23/h;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "onGiphySendResult", "(Ljava/lang/String;Ln23/h;)V", "onShuffleGiphyResult", "(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onMessageDeletePrecondition", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "onMessageDeleteRequest", "originalMessageId", "onMessageDeleteResult", "message", "onMessageSendResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "onMessageEditRequest", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "originalMessage", "onMessageEditResult", "(Lio/getstream/chat/android/models/Message;Ln23/h;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "request", "onQueryChannelPrecondition", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "onQueryChannelRequest", "Lio/getstream/chat/android/models/Channel;", "onQueryChannelResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "eventType", "", "", "extraData", "Ljava/util/Date;", "eventTime", "onTypingEventPrecondition", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)Ln23/h;", "onTypingEventRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V", "Lio/getstream/chat/android/client/events/ChatEvent;", "onTypingEventResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Date;)V", "clearHistory", "onHideChannelPrecondition", "(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "onHideChannelRequest", "onHideChannelResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "onMarkAllReadRequest", "(Lq83/d;)Ljava/lang/Object;", "onChannelMarkReadPrecondition", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/query/CreateChannelParams;", "params", "onCreateChannelRequest", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "memberIds", "onCreateChannelResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onCreateChannelPrecondition", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/List;)Ln23/h;", "onDeleteChannelRequest", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "onDeleteChannelResult", "(Ljava/lang/String;Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onDeleteChannelPrecondition", "onAttachmentSendRequest", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", UserState.Sources.USER, "onUserSet", "(Lio/getstream/chat/android/models/User;)V", "onUserDisconnected", "()V", "onGetMessageResult", "onFetchCurrentUserResult", "(Ln23/h;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "onQueryThreadsPrecondition", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;", "onQueryThreadsRequest", "Lio/getstream/chat/android/models/QueryThreadsResult;", "onQueryThreadsResult", "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/UserBlock;", "onBlockUserResult", "(Ln23/h;)V", "userId", "onUnblockUserResult", "onQueryBlockedUsersResult", "Lio/getstream/chat/android/models/DraftMessage;", "onCreateDraftMessageResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;", "onDeleteDraftMessagesResult", "Lio/getstream/chat/android/models/QueryDraftsResult;", "next", "Lio/getstream/chat/android/models/DraftsSort;", "onQueryDraftMessagesResult", "(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Location;", "location", "onUpdateLiveLocationPrecondition", "(Lio/getstream/chat/android/models/Location;Lq83/d;)Ljava/lang/Object;", "onQueryActiveLocationsResult", "onUpdateLiveLocationResult", "(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onStopLiveLocationSharingResult", "onStartLiveLocationSharingResult", "Lio/getstream/chat/android/models/PushPreferenceLevel;", "level", "Lio/getstream/chat/android/models/PushPreference;", "onChannelPushPreferenceSet", "(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;Ln23/h;Lq83/d;)Ljava/lang/Object;", "until", "onChannelPushNotificationsSnoozed", "(Ljava/lang/String;Ljava/util/Date;Ln23/h;Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface Plugin extends DependencyResolver, QueryMembersListener, DeleteReactionListener, SendReactionListener, ThreadQueryListener, SendGiphyListener, ShuffleGiphyListener, DeleteMessageListener, DraftMessageListener, SendMessageListener, SendAttachmentListener, EditMessageListener, QueryChannelListener, QueryChannelsListener, TypingEventListener, HideChannelListener, MarkAllReadListener, ChannelMarkReadListener, CreateChannelListener, DeleteChannelListener, GetMessageListener, FetchCurrentUserListener, QueryThreadsListener, BlockUserListener, UnblockUserListener, QueryBlockedUsersListener, LiveLocationListener, PushPreferencesListener, DeleteMessageForMeListener {
    static /* synthetic */ Object onChannelMarkReadPrecondition$suspendImpl(Plugin plugin, String str, String str2, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return new C26204g(C23454a0.f92919a);
    }

    static /* synthetic */ Object onDeleteChannelPrecondition$suspendImpl(Plugin plugin, User user, String str, String str2, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return new C26204g(C23454a0.f92919a);
    }

    static /* synthetic */ Object onHideChannelPrecondition$suspendImpl(Plugin plugin, String str, String str2, boolean z4, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return new C26204g(C23454a0.f92919a);
    }

    static /* synthetic */ Object onMessageDeletePrecondition$suspendImpl(Plugin plugin, String str, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return new C26204g(C23454a0.f92919a);
    }

    static /* synthetic */ Object onQueryChannelPrecondition$suspendImpl(Plugin plugin, String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return new C26204g(C23454a0.f92919a);
    }

    static /* synthetic */ Object onQueryThreadsPrecondition$suspendImpl(Plugin plugin, QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return new C26204g(C23454a0.f92919a);
    }

    static /* synthetic */ Object onSendReactionPrecondition$suspendImpl(Plugin plugin, String str, User user, Reaction reaction, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return new C26204g(C23454a0.f92919a);
    }

    static /* synthetic */ Object onUpdateLiveLocationPrecondition$suspendImpl(Plugin plugin, Location location, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return new C26204g(C23454a0.f92919a);
    }

    default ErrorHandler getErrorHandler() {
        return null;
    }

    default Object onAttachmentSendRequest(String str, String str2, Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default void onBlockUserResult(AbstractC26205h result) {
        AbstractC22676k.m65750j(result, "result");
    }

    default Object onChannelMarkReadPrecondition(String str, String str2, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return onChannelMarkReadPrecondition$suspendImpl(this, str, str2, interfaceC30057d);
    }

    default Object onChannelPushNotificationsSnoozed(String str, Date date, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onChannelPushPreferenceSet(String str, PushPreferenceLevel pushPreferenceLevel, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default AbstractC26205h onCreateChannelPrecondition(User currentUser, String channelId, List<String> memberIds) {
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(memberIds, "memberIds");
        return new C26204g(C23454a0.f92919a);
    }

    default Object onCreateChannelRequest(String str, String str2, CreateChannelParams createChannelParams, User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onCreateChannelResult(String str, String str2, List<String> list, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onCreateDraftMessageResult(AbstractC26205h abstractC26205h, String str, String str2, DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onDeleteChannelPrecondition(User user, String str, String str2, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return onDeleteChannelPrecondition$suspendImpl(this, user, str, str2, interfaceC30057d);
    }

    default Object onDeleteChannelRequest(User user, String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onDeleteChannelResult(String str, String str2, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onDeleteDraftMessagesResult(AbstractC26205h abstractC26205h, String str, String str2, DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default AbstractC26205h onDeleteReactionPrecondition(User currentUser) {
        return new C26204g(C23454a0.f92919a);
    }

    default Object onDeleteReactionRequest(String str, String str2, String str3, User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onDeleteReactionResult(String str, String str2, String str3, User user, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onFetchCurrentUserResult(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onGetMessageResult(String str, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onGetNewerRepliesRequest(String str, int i13, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onGetNewerRepliesResult(AbstractC26205h abstractC26205h, String str, int i13, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onGetRepliesMoreRequest(String str, String str2, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onGetRepliesMoreResult(AbstractC26205h abstractC26205h, String str, String str2, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onGetRepliesRequest(String str, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onGetRepliesResult(AbstractC26205h abstractC26205h, String str, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default void onGiphySendResult(String cid, AbstractC26205h result) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(result, "result");
    }

    default Object onHideChannelPrecondition(String str, String str2, boolean z4, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return onHideChannelPrecondition$suspendImpl(this, str, str2, z4, interfaceC30057d);
    }

    default Object onHideChannelRequest(String str, String str2, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onHideChannelResult(AbstractC26205h abstractC26205h, String str, String str2, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onMarkAllReadRequest(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onMessageDeletePrecondition(String str, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return onMessageDeletePrecondition$suspendImpl(this, str, interfaceC30057d);
    }

    default Object onMessageDeleteRequest(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onMessageDeleteResult(String str, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onMessageEditRequest(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onMessageEditResult(Message message, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onMessageSendResult(AbstractC26205h abstractC26205h, String str, String str2, Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onQueryActiveLocationsResult(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default void onQueryBlockedUsersResult(AbstractC26205h result) {
        AbstractC22676k.m65750j(result, "result");
    }

    default Object onQueryChannelPrecondition(String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return onQueryChannelPrecondition$suspendImpl(this, str, str2, queryChannelRequest, interfaceC30057d);
    }

    default Object onQueryChannelRequest(String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onQueryChannelResult(AbstractC26205h abstractC26205h, String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onQueryDraftMessagesResult(AbstractC26205h abstractC26205h, FilterObject filterObject, int i13, String str, QuerySorter<DraftsSort> querySorter, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onQueryMembersResult(AbstractC26205h abstractC26205h, String str, String str2, int i13, int i14, FilterObject filterObject, QuerySorter<Member> querySorter, List<Member> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onQueryThreadsPrecondition(QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return onQueryThreadsPrecondition$suspendImpl(this, queryThreadsRequest, interfaceC30057d);
    }

    default Object onQueryThreadsRequest(QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onQueryThreadsResult(AbstractC26205h abstractC26205h, QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onSendReactionPrecondition(String str, User user, Reaction reaction, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return onSendReactionPrecondition$suspendImpl(this, str, user, reaction, interfaceC30057d);
    }

    default Object onSendReactionRequest(String str, Reaction reaction, boolean z4, boolean z13, User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onSendReactionResult(String str, Reaction reaction, boolean z4, User user, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onShuffleGiphyResult(String str, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onStartLiveLocationSharingResult(Location location, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default Object onStopLiveLocationSharingResult(Location location, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default AbstractC26205h onTypingEventPrecondition(String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData, Date eventTime) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(eventTime, "eventTime");
        return new C26204g(C23454a0.f92919a);
    }

    default void onTypingEventRequest(String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData, Date eventTime) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(eventTime, "eventTime");
    }

    default void onTypingEventResult(AbstractC26205h result, String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData, Date eventTime) {
        AbstractC22676k.m65750j(result, "result");
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        AbstractC22676k.m65750j(eventTime, "eventTime");
    }

    default void onUnblockUserResult(String userId, AbstractC26205h result) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(result, "result");
    }

    default Object onUpdateLiveLocationPrecondition(Location location, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return onUpdateLiveLocationPrecondition$suspendImpl(this, location, interfaceC30057d);
    }

    default Object onUpdateLiveLocationResult(Location location, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    default void onUserDisconnected() {
    }

    default void onUserSet(User user) {
        AbstractC22676k.m65750j(user, "user");
    }
}
