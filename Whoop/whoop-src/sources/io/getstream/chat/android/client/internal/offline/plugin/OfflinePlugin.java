package io.getstream.chat.android.client.internal.offline.plugin;

import com.mapbox.maps.MapboxMap;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.models.QueryThreadsRequest;
import io.getstream.chat.android.client.plugin.Plugin;
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
import io.getstream.chat.android.client.plugin.listeners.QueryChannelListener;
import io.getstream.chat.android.client.plugin.listeners.QueryMembersListener;
import io.getstream.chat.android.client.plugin.listeners.QueryThreadsListener;
import io.getstream.chat.android.client.plugin.listeners.SendAttachmentListener;
import io.getstream.chat.android.client.plugin.listeners.SendMessageListener;
import io.getstream.chat.android.client.plugin.listeners.SendReactionListener;
import io.getstream.chat.android.client.plugin.listeners.ShuffleGiphyListener;
import io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener;
import io.getstream.chat.android.client.query.CreateChannelParams;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.DraftsSort;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.querysort.QuerySorter;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import n23.AbstractC26205h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u0013B»\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\u0006\u0010 \u001a\u00020\u000f\u0012\u0006\u0010!\u001a\u00020\f\u0012\u0006\u0010\"\u001a\u00020\r\u0012\u0006\u0010#\u001a\u00020\u000e\u0012\u0006\u0010$\u001a\u00020\u0010\u0012\u0006\u0010%\u001a\u00020\u0011\u0012\u0006\u0010&\u001a\u00020\u0012\u0012\u0006\u0010'\u001a\u00020\u0013\u0012\u001a\b\u0002\u0010+\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030)\u0012\u0006\u0012\u0004\u0018\u00010*0(¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020/H\u0016¢\u0006\u0004\b2\u00103J)\u00106\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u00104*\u00020*2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0017¢\u0006\u0004\b6\u00107Jh\u0010G\u001a\u00020/2\u0012\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09082\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?2\u0006\u0010C\u001a\u00020B2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020:0D2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020:09H\u0096A¢\u0006\u0004\bG\u0010HJ2\u0010M\u001a\u00020/2\b\u0010I\u001a\u0004\u0018\u00010<2\u0006\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020\u0014H\u0096A¢\u0006\u0004\bM\u0010NJ@\u0010P\u001a\u00020/2\b\u0010I\u001a\u0004\u0018\u00010<2\u0006\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020\u00142\f\u0010;\u001a\b\u0012\u0004\u0012\u00020O08H\u0096A¢\u0006\u0004\bP\u0010QJ \u0010R\u001a\b\u0012\u0004\u0012\u00020/082\b\u0010L\u001a\u0004\u0018\u00010\u0014H\u0096\u0001¢\u0006\u0004\bR\u0010SJ2\u0010V\u001a\b\u0012\u0004\u0012\u00020/082\b\u0010I\u001a\u0004\u0018\u00010<2\b\u0010L\u001a\u0004\u0018\u00010\u00142\u0006\u0010U\u001a\u00020TH\u0096A¢\u0006\u0004\bV\u0010WJ:\u0010[\u001a\u00020/2\b\u0010I\u001a\u0004\u0018\u00010<2\u0006\u0010U\u001a\u00020T2\u0006\u0010Y\u001a\u00020X2\u0006\u0010Z\u001a\u00020X2\u0006\u0010L\u001a\u00020\u0014H\u0096A¢\u0006\u0004\b[\u0010\\J@\u0010]\u001a\u00020/2\b\u0010I\u001a\u0004\u0018\u00010<2\u0006\u0010U\u001a\u00020T2\u0006\u0010Y\u001a\u00020X2\u0006\u0010L\u001a\u00020\u00142\f\u0010;\u001a\b\u0012\u0004\u0012\u00020T08H\u0096A¢\u0006\u0004\b]\u0010^J \u0010`\u001a\u00020/2\u0006\u0010_\u001a\u00020<2\u0006\u0010A\u001a\u00020?H\u0096A¢\u0006\u0004\b`\u0010aJ4\u0010b\u001a\u00020/2\u0012\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O09082\u0006\u0010_\u001a\u00020<2\u0006\u0010A\u001a\u00020?H\u0096A¢\u0006\u0004\bb\u0010cJ*\u0010e\u001a\u00020/2\u0006\u0010_\u001a\u00020<2\u0006\u0010A\u001a\u00020?2\b\u0010d\u001a\u0004\u0018\u00010<H\u0096A¢\u0006\u0004\be\u0010fJ(\u0010h\u001a\u00020/2\u0006\u0010_\u001a\u00020<2\u0006\u0010g\u001a\u00020<2\u0006\u0010A\u001a\u00020?H\u0096A¢\u0006\u0004\bh\u0010iJ<\u0010j\u001a\u00020/2\u0012\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O09082\u0006\u0010_\u001a\u00020<2\u0006\u0010g\u001a\u00020<2\u0006\u0010A\u001a\u00020?H\u0096A¢\u0006\u0004\bj\u0010kJ>\u0010l\u001a\u00020/2\u0012\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O09082\u0006\u0010_\u001a\u00020<2\u0006\u0010A\u001a\u00020?2\b\u0010d\u001a\u0004\u0018\u00010<H\u0096A¢\u0006\u0004\bl\u0010mJ&\u0010n\u001a\u00020/2\u0006\u0010I\u001a\u00020<2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020O08H\u0096A¢\u0006\u0004\bn\u0010oJ\u001e\u0010p\u001a\b\u0012\u0004\u0012\u00020/082\u0006\u0010J\u001a\u00020<H\u0096A¢\u0006\u0004\bp\u0010qJ\u0018\u0010r\u001a\u00020/2\u0006\u0010J\u001a\u00020<H\u0096A¢\u0006\u0004\br\u0010qJ&\u0010t\u001a\u00020/2\u0006\u0010s\u001a\u00020<2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020O08H\u0096A¢\u0006\u0004\bt\u0010oJ6\u0010v\u001a\u00020/2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020O082\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0006\u0010u\u001a\u00020OH\u0096A¢\u0006\u0004\bv\u0010wJ\u0018\u0010x\u001a\u00020/2\u0006\u0010u\u001a\u00020OH\u0096A¢\u0006\u0004\bx\u0010yJ&\u0010{\u001a\u00020/2\u0006\u0010z\u001a\u00020O2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020O08H\u0096A¢\u0006\u0004\b{\u0010|J/\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020/082\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0006\u0010~\u001a\u00020}H\u0096A¢\u0006\u0005\b\u007f\u0010\u0080\u0001J+\u0010\u0081\u0001\u001a\u00020/2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0006\u0010~\u001a\u00020}H\u0096A¢\u0006\u0006\b\u0081\u0001\u0010\u0080\u0001J:\u0010\u0083\u0001\u001a\u00020/2\r\u0010;\u001a\t\u0012\u0005\u0012\u00030\u0082\u0001082\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0006\u0010~\u001a\u00020}H\u0096A¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J2\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020/082\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0007\u0010\u0085\u0001\u001a\u00020XH\u0096A¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J,\u0010\u0088\u0001\u001a\u00020/2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0007\u0010\u0085\u0001\u001a\u00020XH\u0096A¢\u0006\u0006\b\u0088\u0001\u0010\u0087\u0001J:\u0010\u0089\u0001\u001a\u00020/2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020/082\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0007\u0010\u0085\u0001\u001a\u00020XH\u0096A¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J5\u0010\u008d\u0001\u001a\u00020/2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0006\u0010L\u001a\u00020\u0014H\u0096A¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001JA\u0010\u0090\u0001\u001a\u00020/2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\r\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020<092\r\u0010;\u001a\t\u0012\u0005\u0012\u00030\u0082\u000108H\u0096A¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J:\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020/082\b\u0010L\u001a\u0004\u0018\u00010\u00142\u0006\u0010>\u001a\u00020<2\r\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020<09H\u0096\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J-\u0010\u0094\u0001\u001a\u00020/2\b\u0010L\u001a\u0004\u0018\u00010\u00142\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<H\u0096A¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J2\u0010\u0096\u0001\u001a\u00020/2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\r\u0010;\u001a\t\u0012\u0005\u0012\u00030\u0082\u000108H\u0096A¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J3\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020/082\b\u0010L\u001a\u0004\u0018\u00010\u00142\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<H\u0096A¢\u0006\u0006\b\u0098\u0001\u0010\u0095\u0001J+\u0010\u0099\u0001\u001a\u00020/2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0006\u0010u\u001a\u00020OH\u0096A¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J(\u0010\u009b\u0001\u001a\u00020/2\u0006\u0010J\u001a\u00020<2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020O08H\u0096A¢\u0006\u0005\b\u009b\u0001\u0010oJ!\u0010\u009c\u0001\u001a\u00020/2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001408H\u0096A¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\"\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020/082\u0007\u0010~\u001a\u00030\u009e\u0001H\u0096A¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001c\u0010¡\u0001\u001a\u00020/2\u0007\u0010~\u001a\u00030\u009e\u0001H\u0096A¢\u0006\u0006\b¡\u0001\u0010 \u0001J+\u0010£\u0001\u001a\u00020/2\r\u0010;\u001a\t\u0012\u0005\u0012\u00030¢\u0001082\u0007\u0010~\u001a\u00030\u009e\u0001H\u0096A¢\u0006\u0006\b£\u0001\u0010¤\u0001J;\u0010¦\u0001\u001a\u00020/2\r\u0010;\u001a\t\u0012\u0005\u0012\u00030¥\u0001082\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0007\u0010u\u001a\u00030¥\u0001H\u0096A¢\u0006\u0006\b¦\u0001\u0010§\u0001J:\u0010¨\u0001\u001a\u00020/2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020/082\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020<2\u0007\u0010u\u001a\u00030¥\u0001H\u0096A¢\u0006\u0006\b¨\u0001\u0010§\u0001JL\u0010¬\u0001\u001a\u00020/2\r\u0010;\u001a\t\u0012\u0005\u0012\u00030©\u0001082\u0006\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020?2\t\u0010ª\u0001\u001a\u0004\u0018\u00010<2\r\u0010E\u001a\t\u0012\u0005\u0012\u00030«\u00010DH\u0096A¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J \u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020/082\u0006\u0010_\u001a\u00020<H\u0096A¢\u0006\u0005\b®\u0001\u0010qJ \u0010¯\u0001\u001a\b\u0012\u0004\u0012\u00020/082\u0006\u0010J\u001a\u00020<H\u0096A¢\u0006\u0005\b¯\u0001\u0010qJ\u001a\u0010°\u0001\u001a\u00020/2\u0006\u0010J\u001a\u00020<H\u0096A¢\u0006\u0005\b°\u0001\u0010qJ(\u0010±\u0001\u001a\u00020/2\u0006\u0010J\u001a\u00020<2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020O08H\u0096A¢\u0006\u0005\b±\u0001\u0010oR\u001d\u0010\u0015\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0015\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u0015\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010µ\u0001R\u0015\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010¶\u0001R\u0015\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010·\u0001R\u0015\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010¸\u0001R\u0015\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010¹\u0001R\u0015\u0010\u001b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010º\u0001R\u0015\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010»\u0001R\u0015\u0010\u001d\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010¼\u0001R\u0015\u0010\u001e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010½\u0001R\u0015\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010¾\u0001R\u0015\u0010 \u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010¿\u0001R\u0015\u0010!\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010À\u0001R\u0015\u0010\"\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010Á\u0001R\u0015\u0010#\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010Â\u0001R\u0015\u0010$\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010Ã\u0001R\u0015\u0010%\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010Ä\u0001R\u0015\u0010&\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010Å\u0001R\u0015\u0010'\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010Æ\u0001R'\u0010+\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030)\u0012\u0006\u0012\u0004\u0018\u00010*0(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010Ç\u0001¨\u0006È\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;", "Lio/getstream/chat/android/client/plugin/Plugin;", "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;", "Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;", "Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;", "Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;", "Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;", "Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;", "Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;", "Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;", "Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;", "Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;", "Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;", "Lio/getstream/chat/android/models/User;", "activeUser", "queryChannelListener", "threadQueryListener", "editMessageListener", "hideChannelListener", "deleteReactionListener", "sendReactionListener", "deleteMessageListener", "deleteMessageForMeListener", "shuffleGiphyListener", "sendMessageListener", "sendAttachmentListener", "queryMembersListener", "createChannelListener", "deleteChannelListener", "getMessageListener", "fetchCurrentUserListener", "queryThreadsListener", "draftMessageListener", "Lkotlin/Function1;", "Lj93/d;", "", "provideDependency", "<init>", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;Lkotlin/jvm/functions/Function1;)V", UserState.Sources.USER, "Ll83/a0;", "onUserSet", "(Lio/getstream/chat/android/models/User;)V", "onUserDisconnected", "()V", "T", "klass", "resolveDependency", "(Lj93/d;)Ljava/lang/Object;", "Ln23/h;", "", "Lio/getstream/chat/android/models/Member;", "result", "", "channelType", "channelId", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", QueryChannelRequest.KEY_MEMBERS, "onQueryMembersResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "cid", "messageId", "reactionType", "currentUser", "onDeleteReactionRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Message;", "onDeleteReactionResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onDeleteReactionPrecondition", "(Lio/getstream/chat/android/models/User;)Ln23/h;", "Lio/getstream/chat/android/models/Reaction;", "reaction", "onSendReactionPrecondition", "(Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;", "", "enforceUnique", "skipPush", "onSendReactionRequest", "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "onSendReactionResult", "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;", "parentId", "onGetRepliesRequest", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "onGetRepliesResult", "(Ln23/h;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "lastId", "onGetNewerRepliesRequest", "(Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "firstId", "onGetRepliesMoreRequest", "(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "onGetRepliesMoreResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "onGetNewerRepliesResult", "(Ln23/h;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "onShuffleGiphyResult", "(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onMessageDeletePrecondition", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "onMessageDeleteRequest", "originalMessageId", "onMessageDeleteResult", "message", "onMessageSendResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "onMessageEditRequest", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "originalMessage", "onMessageEditResult", "(Lio/getstream/chat/android/models/Message;Ln23/h;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "request", "onQueryChannelPrecondition", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "onQueryChannelRequest", "Lio/getstream/chat/android/models/Channel;", "onQueryChannelResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "clearHistory", "onHideChannelPrecondition", "(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "onHideChannelRequest", "onHideChannelResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/query/CreateChannelParams;", "params", "onCreateChannelRequest", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "memberIds", "onCreateChannelResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onCreateChannelPrecondition", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/List;)Ln23/h;", "onDeleteChannelRequest", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "onDeleteChannelResult", "(Ljava/lang/String;Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onDeleteChannelPrecondition", "onAttachmentSendRequest", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "onGetMessageResult", "onFetchCurrentUserResult", "(Ln23/h;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "onQueryThreadsPrecondition", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;", "onQueryThreadsRequest", "Lio/getstream/chat/android/models/QueryThreadsResult;", "onQueryThreadsResult", "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/DraftMessage;", "onCreateDraftMessageResult", "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;", "onDeleteDraftMessagesResult", "Lio/getstream/chat/android/models/QueryDraftsResult;", "next", "Lio/getstream/chat/android/models/DraftsSort;", "onQueryDraftMessagesResult", "(Ln23/h;Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;", "onGetRepliesPrecondition", "onDeleteMessageForMePrecondition", "onDeleteMessageForMeRequest", "onDeleteMessageForMeResult", "Lio/getstream/chat/android/models/User;", "getActiveUser$stream_chat_android_client_release", "()Lio/getstream/chat/android/models/User;", "Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;", "Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;", "Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;", "Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;", "Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;", "Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;", "Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;", "Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;", "Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;", "Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;", "Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;", "Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;", "Lkotlin/jvm/functions/Function1;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class OfflinePlugin implements Plugin, QueryChannelListener, ThreadQueryListener, EditMessageListener, HideChannelListener, DeleteReactionListener, SendReactionListener, DeleteMessageListener, DeleteMessageForMeListener, ShuffleGiphyListener, SendMessageListener, QueryMembersListener, CreateChannelListener, DeleteChannelListener, SendAttachmentListener, GetMessageListener, FetchCurrentUserListener, QueryThreadsListener, DraftMessageListener {
    private final User activeUser;
    private final CreateChannelListener createChannelListener;
    private final DeleteChannelListener deleteChannelListener;
    private final DeleteMessageForMeListener deleteMessageForMeListener;
    private final DeleteMessageListener deleteMessageListener;
    private final DeleteReactionListener deleteReactionListener;
    private final DraftMessageListener draftMessageListener;
    private final EditMessageListener editMessageListener;
    private final FetchCurrentUserListener fetchCurrentUserListener;
    private final GetMessageListener getMessageListener;
    private final HideChannelListener hideChannelListener;
    private final Function1 provideDependency;
    private final QueryChannelListener queryChannelListener;
    private final QueryMembersListener queryMembersListener;
    private final QueryThreadsListener queryThreadsListener;
    private final SendAttachmentListener sendAttachmentListener;
    private final SendMessageListener sendMessageListener;
    private final SendReactionListener sendReactionListener;
    private final ShuffleGiphyListener shuffleGiphyListener;
    private final ThreadQueryListener threadQueryListener;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.plugin.OfflinePlugin$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191011 implements Function1 {
        public static final C191011 INSTANCE = new C191011();

        public final Void invoke(InterfaceC21461d it) {
            AbstractC22676k.m65750j(it, "it");
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC21461d) obj);
            return null;
        }
    }

    public OfflinePlugin(User activeUser, QueryChannelListener queryChannelListener, ThreadQueryListener threadQueryListener, EditMessageListener editMessageListener, HideChannelListener hideChannelListener, DeleteReactionListener deleteReactionListener, SendReactionListener sendReactionListener, DeleteMessageListener deleteMessageListener, DeleteMessageForMeListener deleteMessageForMeListener, ShuffleGiphyListener shuffleGiphyListener, SendMessageListener sendMessageListener, SendAttachmentListener sendAttachmentListener, QueryMembersListener queryMembersListener, CreateChannelListener createChannelListener, DeleteChannelListener deleteChannelListener, GetMessageListener getMessageListener, FetchCurrentUserListener fetchCurrentUserListener, QueryThreadsListener queryThreadsListener, DraftMessageListener draftMessageListener, Function1 provideDependency) {
        AbstractC22676k.m65750j(activeUser, "activeUser");
        AbstractC22676k.m65750j(queryChannelListener, "queryChannelListener");
        AbstractC22676k.m65750j(threadQueryListener, "threadQueryListener");
        AbstractC22676k.m65750j(editMessageListener, "editMessageListener");
        AbstractC22676k.m65750j(hideChannelListener, "hideChannelListener");
        AbstractC22676k.m65750j(deleteReactionListener, "deleteReactionListener");
        AbstractC22676k.m65750j(sendReactionListener, "sendReactionListener");
        AbstractC22676k.m65750j(deleteMessageListener, "deleteMessageListener");
        AbstractC22676k.m65750j(deleteMessageForMeListener, "deleteMessageForMeListener");
        AbstractC22676k.m65750j(shuffleGiphyListener, "shuffleGiphyListener");
        AbstractC22676k.m65750j(sendMessageListener, "sendMessageListener");
        AbstractC22676k.m65750j(sendAttachmentListener, "sendAttachmentListener");
        AbstractC22676k.m65750j(queryMembersListener, "queryMembersListener");
        AbstractC22676k.m65750j(createChannelListener, "createChannelListener");
        AbstractC22676k.m65750j(deleteChannelListener, "deleteChannelListener");
        AbstractC22676k.m65750j(getMessageListener, "getMessageListener");
        AbstractC22676k.m65750j(fetchCurrentUserListener, "fetchCurrentUserListener");
        AbstractC22676k.m65750j(queryThreadsListener, "queryThreadsListener");
        AbstractC22676k.m65750j(draftMessageListener, "draftMessageListener");
        AbstractC22676k.m65750j(provideDependency, "provideDependency");
        this.activeUser = activeUser;
        this.queryChannelListener = queryChannelListener;
        this.threadQueryListener = threadQueryListener;
        this.editMessageListener = editMessageListener;
        this.hideChannelListener = hideChannelListener;
        this.deleteReactionListener = deleteReactionListener;
        this.sendReactionListener = sendReactionListener;
        this.deleteMessageListener = deleteMessageListener;
        this.deleteMessageForMeListener = deleteMessageForMeListener;
        this.shuffleGiphyListener = shuffleGiphyListener;
        this.sendMessageListener = sendMessageListener;
        this.sendAttachmentListener = sendAttachmentListener;
        this.queryMembersListener = queryMembersListener;
        this.createChannelListener = createChannelListener;
        this.deleteChannelListener = deleteChannelListener;
        this.getMessageListener = getMessageListener;
        this.fetchCurrentUserListener = fetchCurrentUserListener;
        this.queryThreadsListener = queryThreadsListener;
        this.draftMessageListener = draftMessageListener;
        this.provideDependency = provideDependency;
    }

    /* JADX INFO: renamed from: getActiveUser$stream_chat_android_client_release, reason: from getter */
    public final User getActiveUser() {
        return this.activeUser;
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.SendAttachmentListener
    public final Object onAttachmentSendRequest(String str, String str2, Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.sendAttachmentListener.onAttachmentSendRequest(str, str2, message, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.CreateChannelListener
    public final AbstractC26205h onCreateChannelPrecondition(User currentUser, String channelId, List<String> memberIds) {
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(memberIds, "memberIds");
        return this.createChannelListener.onCreateChannelPrecondition(currentUser, channelId, memberIds);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.CreateChannelListener
    public final Object onCreateChannelRequest(String str, String str2, CreateChannelParams createChannelParams, User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.createChannelListener.onCreateChannelRequest(str, str2, createChannelParams, user, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.CreateChannelListener
    public final Object onCreateChannelResult(String str, String str2, List<String> list, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.createChannelListener.onCreateChannelResult(str, str2, list, abstractC26205h, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DraftMessageListener
    public final Object onCreateDraftMessageResult(AbstractC26205h abstractC26205h, String str, String str2, DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.draftMessageListener.onCreateDraftMessageResult(abstractC26205h, str, str2, draftMessage, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteChannelListener
    public final Object onDeleteChannelPrecondition(User user, String str, String str2, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.deleteChannelListener.onDeleteChannelPrecondition(user, str, str2, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteChannelListener
    public final Object onDeleteChannelRequest(User user, String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.deleteChannelListener.onDeleteChannelRequest(user, str, str2, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteChannelListener
    public final Object onDeleteChannelResult(String str, String str2, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.deleteChannelListener.onDeleteChannelResult(str, str2, abstractC26205h, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DraftMessageListener
    public final Object onDeleteDraftMessagesResult(AbstractC26205h abstractC26205h, String str, String str2, DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.draftMessageListener.onDeleteDraftMessagesResult(abstractC26205h, str, str2, draftMessage, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteMessageForMeListener
    public final Object onDeleteMessageForMePrecondition(String str, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.deleteMessageForMeListener.onDeleteMessageForMePrecondition(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteMessageForMeListener
    public final Object onDeleteMessageForMeRequest(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.deleteMessageForMeListener.onDeleteMessageForMeRequest(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteMessageForMeListener
    public final Object onDeleteMessageForMeResult(String str, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.deleteMessageForMeListener.onDeleteMessageForMeResult(str, abstractC26205h, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteReactionListener
    public final AbstractC26205h onDeleteReactionPrecondition(User currentUser) {
        return this.deleteReactionListener.onDeleteReactionPrecondition(currentUser);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteReactionListener
    public final Object onDeleteReactionRequest(String str, String str2, String str3, User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.deleteReactionListener.onDeleteReactionRequest(str, str2, str3, user, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteReactionListener
    public final Object onDeleteReactionResult(String str, String str2, String str3, User user, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.deleteReactionListener.onDeleteReactionResult(str, str2, str3, user, abstractC26205h, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.FetchCurrentUserListener
    public final Object onFetchCurrentUserResult(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.fetchCurrentUserListener.onFetchCurrentUserResult(abstractC26205h, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.GetMessageListener
    public final Object onGetMessageResult(String str, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.getMessageListener.onGetMessageResult(str, abstractC26205h, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetNewerRepliesRequest(String str, int i13, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.threadQueryListener.onGetNewerRepliesRequest(str, i13, str2, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetNewerRepliesResult(AbstractC26205h abstractC26205h, String str, int i13, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.threadQueryListener.onGetNewerRepliesResult(abstractC26205h, str, i13, str2, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesMoreRequest(String str, String str2, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.threadQueryListener.onGetRepliesMoreRequest(str, str2, i13, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesMoreResult(AbstractC26205h abstractC26205h, String str, String str2, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.threadQueryListener.onGetRepliesMoreResult(abstractC26205h, str, str2, i13, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesPrecondition(String str, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.threadQueryListener.onGetRepliesPrecondition(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesRequest(String str, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.threadQueryListener.onGetRepliesRequest(str, i13, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.ThreadQueryListener
    public final Object onGetRepliesResult(AbstractC26205h abstractC26205h, String str, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.threadQueryListener.onGetRepliesResult(abstractC26205h, str, i13, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.HideChannelListener
    public final Object onHideChannelPrecondition(String str, String str2, boolean z4, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.hideChannelListener.onHideChannelPrecondition(str, str2, z4, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.HideChannelListener
    public final Object onHideChannelRequest(String str, String str2, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.hideChannelListener.onHideChannelRequest(str, str2, z4, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.HideChannelListener
    public final Object onHideChannelResult(AbstractC26205h abstractC26205h, String str, String str2, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.hideChannelListener.onHideChannelResult(abstractC26205h, str, str2, z4, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteMessageListener
    public final Object onMessageDeletePrecondition(String str, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.deleteMessageListener.onMessageDeletePrecondition(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteMessageListener
    public final Object onMessageDeleteRequest(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.deleteMessageListener.onMessageDeleteRequest(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DeleteMessageListener
    public final Object onMessageDeleteResult(String str, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.deleteMessageListener.onMessageDeleteResult(str, abstractC26205h, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.EditMessageListener
    public final Object onMessageEditRequest(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.editMessageListener.onMessageEditRequest(message, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.EditMessageListener
    public final Object onMessageEditResult(Message message, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.editMessageListener.onMessageEditResult(message, abstractC26205h, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.SendMessageListener
    public final Object onMessageSendResult(AbstractC26205h abstractC26205h, String str, String str2, Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.sendMessageListener.onMessageSendResult(abstractC26205h, str, str2, message, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.QueryChannelListener
    public final Object onQueryChannelPrecondition(String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.queryChannelListener.onQueryChannelPrecondition(str, str2, queryChannelRequest, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.QueryChannelListener
    public final Object onQueryChannelRequest(String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.queryChannelListener.onQueryChannelRequest(str, str2, queryChannelRequest, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.QueryChannelListener
    public final Object onQueryChannelResult(AbstractC26205h abstractC26205h, String str, String str2, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.queryChannelListener.onQueryChannelResult(abstractC26205h, str, str2, queryChannelRequest, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.DraftMessageListener
    public final Object onQueryDraftMessagesResult(AbstractC26205h abstractC26205h, FilterObject filterObject, int i13, String str, QuerySorter<DraftsSort> querySorter, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.draftMessageListener.onQueryDraftMessagesResult(abstractC26205h, filterObject, i13, str, querySorter, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.QueryMembersListener
    public final Object onQueryMembersResult(AbstractC26205h abstractC26205h, String str, String str2, int i13, int i14, FilterObject filterObject, QuerySorter<Member> querySorter, List<Member> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.queryMembersListener.onQueryMembersResult(abstractC26205h, str, str2, i13, i14, filterObject, querySorter, list, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.QueryThreadsListener
    public final Object onQueryThreadsPrecondition(QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.queryThreadsListener.onQueryThreadsPrecondition(queryThreadsRequest, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.QueryThreadsListener
    public final Object onQueryThreadsRequest(QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.queryThreadsListener.onQueryThreadsRequest(queryThreadsRequest, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.QueryThreadsListener
    public final Object onQueryThreadsResult(AbstractC26205h abstractC26205h, QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.queryThreadsListener.onQueryThreadsResult(abstractC26205h, queryThreadsRequest, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.SendReactionListener
    public final Object onSendReactionPrecondition(String str, User user, Reaction reaction, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return this.sendReactionListener.onSendReactionPrecondition(str, user, reaction, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.SendReactionListener
    public final Object onSendReactionRequest(String str, Reaction reaction, boolean z4, boolean z13, User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.sendReactionListener.onSendReactionRequest(str, reaction, z4, z13, user, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.SendReactionListener
    public final Object onSendReactionResult(String str, Reaction reaction, boolean z4, User user, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.sendReactionListener.onSendReactionResult(str, reaction, z4, user, abstractC26205h, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin, io.getstream.chat.android.client.plugin.listeners.ShuffleGiphyListener
    public final Object onShuffleGiphyResult(String str, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.shuffleGiphyListener.onShuffleGiphyResult(str, abstractC26205h, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin
    public final void onUserDisconnected() {
    }

    @Override // io.getstream.chat.android.client.plugin.Plugin
    public final void onUserSet(User user) {
        AbstractC22676k.m65750j(user, "user");
    }

    @Override // io.getstream.chat.android.client.plugin.DependencyResolver
    @InternalStreamChatApi
    public final <T> T resolveDependency(InterfaceC21461d klass) {
        AbstractC22676k.m65750j(klass, "klass");
        T t14 = (T) this.provideDependency.invoke(klass);
        if (t14 == null) {
            return null;
        }
        return t14;
    }

    public /* synthetic */ OfflinePlugin(User user, QueryChannelListener queryChannelListener, ThreadQueryListener threadQueryListener, EditMessageListener editMessageListener, HideChannelListener hideChannelListener, DeleteReactionListener deleteReactionListener, SendReactionListener sendReactionListener, DeleteMessageListener deleteMessageListener, DeleteMessageForMeListener deleteMessageForMeListener, ShuffleGiphyListener shuffleGiphyListener, SendMessageListener sendMessageListener, SendAttachmentListener sendAttachmentListener, QueryMembersListener queryMembersListener, CreateChannelListener createChannelListener, DeleteChannelListener deleteChannelListener, GetMessageListener getMessageListener, FetchCurrentUserListener fetchCurrentUserListener, QueryThreadsListener queryThreadsListener, DraftMessageListener draftMessageListener, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(user, queryChannelListener, threadQueryListener, editMessageListener, hideChannelListener, deleteReactionListener, sendReactionListener, deleteMessageListener, deleteMessageForMeListener, shuffleGiphyListener, sendMessageListener, sendAttachmentListener, queryMembersListener, createChannelListener, deleteChannelListener, getMessageListener, fetchCurrentUserListener, queryThreadsListener, draftMessageListener, (i13 & 524288) != 0 ? C191011.INSTANCE : function1);
    }
}
