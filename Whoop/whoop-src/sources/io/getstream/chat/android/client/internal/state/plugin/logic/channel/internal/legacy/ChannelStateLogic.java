package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.mapbox.common.HttpHeaders;
import com.whoop.data.local.room.dao.persistent.C6494e;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import ec3.C13045h2;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.C19383k;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.channel.ChannelMessagesUpdateLogic;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.client.errors.ChatErrorKt;
import io.getstream.chat.android.client.events.HasChannel;
import io.getstream.chat.android.client.events.TypingStartEvent;
import io.getstream.chat.android.client.events.UserStartWatchingEvent;
import io.getstream.chat.android.client.events.UserStopWatchingEvent;
import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import io.getstream.chat.android.client.internal.state.message.attachments.internal.AttachmentUrlValidator;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.SearchLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.TypingEventPruner;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateLegacyImpl;
import io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.client.utils.channel.ChannelUtilsKt;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.ChannelDataKt;
import io.getstream.chat.android.models.ChannelKt;
import io.getstream.chat.android.models.ChannelMute;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Config;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Mute;
import io.getstream.chat.android.models.PendingMessage;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.PushPreference;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.TypingEvent;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import n23.AbstractC26202e;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p002a0.C0005a0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import y00.AbstractC38963t7;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 Ù\u00012\u00020\u0001:\u0002Ù\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\u00020\u001b2\u0016\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b#\u0010!J\r\u0010$\u001a\u00020\u001b¢\u0006\u0004\b$\u0010%J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b\u001c\u0010(J\u0015\u0010+\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b-\u0010,J\u001f\u00101\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020.2\b\u0010'\u001a\u0004\u0018\u000100¢\u0006\u0004\b1\u00102J#\u00108\u001a\u00020\u001b2\f\u00105\u001a\b\u0012\u0004\u0012\u000204032\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\b>\u0010=J%\u0010B\u001a\u00020\u001b2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020:032\b\b\u0002\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ#\u0010D\u001a\u00020\u001b2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020:032\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bD\u0010CJ\u001d\u0010E\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001032\u0006\u0010;\u001a\u00020:¢\u0006\u0004\bE\u0010FJ\u0015\u0010G\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\bG\u0010=J!\u0010K\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020H2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010:¢\u0006\u0004\bK\u0010LJ\u0015\u0010O\u001a\u00020\u001b2\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PJ%\u0010S\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020.2\u0006\u0010Q\u001a\u00020@2\u0006\u0010R\u001a\u00020H¢\u0006\u0004\bS\u0010TJ\u0015\u0010U\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bU\u0010VJ\u0015\u0010X\u001a\u00020\u001b2\u0006\u0010W\u001a\u000204¢\u0006\u0004\bX\u0010YJ\u0015\u0010Z\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\bZ\u0010!J\u001b\u0010\\\u001a\u00020\u001b2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001e03¢\u0006\u0004\b\\\u0010]J#\u0010_\u001a\u00020\u001b2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001e032\u0006\u0010^\u001a\u000206¢\u0006\u0004\b_\u00109J\u0015\u0010`\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b`\u0010!J1\u0010e\u001a\u00020\u001b2\b\u0010a\u001a\u0004\u0018\u00010.2\u0006\u0010b\u001a\u00020@2\b\u0010c\u001a\u0004\u0018\u00010H2\u0006\u0010d\u001a\u00020@¢\u0006\u0004\be\u0010fJ\u0015\u0010h\u001a\u00020\u001b2\u0006\u0010g\u001a\u00020H¢\u0006\u0004\bh\u0010VJ\u0015\u0010j\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020i¢\u0006\u0004\bj\u0010kJ\u0015\u0010m\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020l¢\u0006\u0004\bm\u0010nJ\u0015\u0010p\u001a\u00020\u001b2\u0006\u0010o\u001a\u00020@¢\u0006\u0004\bp\u0010qJ\u0019\u0010s\u001a\u00020\u001b2\b\u0010r\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bs\u0010=J\r\u0010t\u001a\u00020@¢\u0006\u0004\bt\u0010uJ\u0015\u0010w\u001a\u00020\u001b2\u0006\u0010v\u001a\u00020@¢\u0006\u0004\bw\u0010qJP\u0010\u007f\u001a\u00020\u001b2\u0006\u0010y\u001a\u00020x2\u0006\u0010z\u001a\u0002062\b\b\u0002\u0010A\u001a\u00020@2\b\b\u0002\u0010{\u001a\u00020@2\b\b\u0002\u0010|\u001a\u00020@2\b\b\u0002\u0010}\u001a\u00020@2\b\b\u0002\u0010~\u001a\u00020@¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u001b2\u0007\u0010\u0081\u0001\u001a\u00020x¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\"\u0010\u0086\u0001\u001a\u00020\u001b2\u0006\u0010y\u001a\u00020x2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001a\u0010\u008a\u0001\u001a\u00020\u001b2\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0011\u0010\u008d\u0001\u001a\u00020\u001bH\u0000¢\u0006\u0005\b\u008c\u0001\u0010%J\u0017\u0010\u008e\u0001\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0005\b\u008e\u0001\u0010!J\u000f\u0010\u008f\u0001\u001a\u00020\u001b¢\u0006\u0005\b\u008f\u0001\u0010%J\u000f\u0010\u0090\u0001\u001a\u00020\u001b¢\u0006\u0005\b\u0090\u0001\u0010%J\u000f\u0010\u0091\u0001\u001a\u00020\u001b¢\u0006\u0005\b\u0091\u0001\u0010%J \u0010\u0093\u0001\u001a\u00020\u001b2\u0007\u0010\u0092\u0001\u001a\u00020H2\u0006\u0010;\u001a\u00020:¢\u0006\u0005\b\u0093\u0001\u0010LJ\u001a\u0010\u0096\u0001\u001a\u00020\u001b2\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001a\u0010\u0098\u0001\u001a\u00020\u001b2\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u0097\u0001J\u001c\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0094\u00012\u0007\u0010\u0099\u0001\u001a\u00020.¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0019\u0010\u009d\u0001\u001a\u00020\u001b2\u0007\u0010\u009c\u0001\u001a\u000206¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0017\u0010\u009f\u0001\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:¢\u0006\u0005\b\u009f\u0001\u0010=J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010y\u001a\u00020xH\u0002¢\u0006\u0005\b\u001c\u0010\u0083\u0001J \u0010¡\u0001\u001a\u00020\u001b2\r\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020)03H\u0002¢\u0006\u0005\b¡\u0001\u0010]J$\u0010¤\u0001\u001a\u00020)2\u0007\u0010¢\u0001\u001a\u00020)2\u0007\u0010£\u0001\u001a\u00020)H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J2\u0010ª\u0001\u001a\u00020\u001b2\u0014\u0010§\u0001\u001a\u000f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u0002000¦\u00012\b\u0010©\u0001\u001a\u00030¨\u0001H\u0002¢\u0006\u0006\bª\u0001\u0010«\u0001J'\u0010¬\u0001\u001a\u00020\u001b2\f\u00105\u001a\b\u0012\u0004\u0012\u000204032\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0005\b¬\u0001\u00109J\"\u0010®\u0001\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001032\u0007\u0010\u00ad\u0001\u001a\u00020:H\u0002¢\u0006\u0005\b®\u0001\u0010FJ\u001f\u0010¯\u0001\u001a\u00020\u001b2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020:03H\u0002¢\u0006\u0005\b¯\u0001\u0010]J-\u0010°\u0001\u001a\u000f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020:0¦\u00012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020:03H\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001JD\u0010´\u0001\u001a\u00020@2\u0006\u0010|\u001a\u00020@2\u0007\u0010²\u0001\u001a\u00020@2\u0007\u0010³\u0001\u001a\u00020@2\u0006\u0010A\u001a\u00020@2\u0006\u0010}\u001a\u00020@2\u0006\u0010~\u001a\u00020@H\u0002¢\u0006\u0006\b´\u0001\u0010µ\u0001J%\u0010·\u0001\u001a\u00020\u001b2\b\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0007\u0010¶\u0001\u001a\u00020@H\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001J&\u0010»\u0001\u001a\u00020@2\t\u0010¹\u0001\u001a\u0004\u0018\u00010:2\u0007\u0010º\u0001\u001a\u00020:H\u0002¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u0016\u0010½\u0001\u001a\u00020\r*\u00020:H\u0002¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u0016\u0010¿\u0001\u001a\u00020\r*\u00020:H\u0002¢\u0006\u0006\b¿\u0001\u0010¾\u0001J\u0019\u0010À\u0001\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0005\bÀ\u0001\u0010=J\u0015\u0010Á\u0001\u001a\u00020\u001b*\u00020:H\u0002¢\u0006\u0005\bÁ\u0001\u0010=R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010Â\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010Ã\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010Ä\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010Å\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010Æ\u0001R\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010Ç\u0001R%\u0010É\u0001\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0005\u0012\u00030\u0094\u00010È\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R+\u0010Ì\u0001\u001a\u0016\u0012\u0004\u0012\u00020.\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020.0Ë\u00010È\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Ê\u0001R!\u0010Ò\u0001\u001a\u00030Í\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R$\u0010Ô\u0001\u001a\u000f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020@0Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0018\u0010×\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010Ø\u0001¨\u0006Ú\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;", "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;", "mutableState", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "globalMutableState", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;", "searchLogic", "Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;", "attachmentUrlValidator", "Lkotlin/Function0;", "", "now", "Lbc3/c0;", "coroutineScope", "<init>", "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;Lc93/a;Lbc3/c0;)V", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "channelState", "()Lio/getstream/chat/android/client/channel/state/ChannelState;", "writeChannelState", "()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/ChannelData;", "update", "Ll83/a0;", "updateChannelData", "(Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/models/Member;", "membership", "updateMembership", "(Lio/getstream/chat/android/models/Member;)V", "member", "addMembership", "removeMembership", "()V", "Lio/getstream/chat/android/client/events/HasChannel;", NotificationCompat.CATEGORY_EVENT, "(Lio/getstream/chat/android/client/events/HasChannel;)V", "Lio/getstream/chat/android/models/ChannelUserRead;", "read", "updateRead", "(Lio/getstream/chat/android/models/ChannelUserRead;)V", "updateDelivered", "", "userId", "Lio/getstream/chat/android/client/events/TypingStartEvent;", "setTyping", "(Ljava/lang/String;Lio/getstream/chat/android/client/events/TypingStartEvent;)V", "", "Lio/getstream/chat/android/models/User;", "watchers", "", "watchersCount", "setWatchers", "(Ljava/util/List;I)V", "Lio/getstream/chat/android/models/Message;", "message", "upsertMessage", "(Lio/getstream/chat/android/models/Message;)V", "delsertPinnedMessage", "messages", "", "shouldRefreshMessages", "upsertMessages", "(Ljava/util/List;Z)V", "upsertPinnedMessages", "getAllReplies", "(Lio/getstream/chat/android/models/Message;)Ljava/util/List;", "deleteMessage", "Ljava/util/Date;", HttpHeaders.DATE, "systemMessage", "removeMessagesBefore", "(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V", "Lio/getstream/chat/android/models/PushPreference;", "preference", "setPushPreference", "(Lio/getstream/chat/android/models/PushPreference;)V", "hard", "deletedAt", "deleteMessagesFromUser", "(Ljava/lang/String;ZLjava/util/Date;)V", "hideMessagesBefore", "(Ljava/util/Date;)V", UserState.Sources.USER, "upsertUserPresence", "(Lio/getstream/chat/android/models/User;)V", "upsertMember", QueryChannelRequest.KEY_MEMBERS, "upsertMembers", "(Ljava/util/List;)V", "membersCount", "setMembers", "deleteMember", "memberUserId", "banned", "banExpires", "shadow", "updateMemberBanned", "(Ljava/lang/String;ZLjava/util/Date;Z)V", "deleteDate", "deleteChannel", "Lio/getstream/chat/android/client/events/UserStartWatchingEvent;", "upsertWatcher", "(Lio/getstream/chat/android/client/events/UserStartWatchingEvent;)V", "Lio/getstream/chat/android/client/events/UserStopWatchingEvent;", "deleteWatcher", "(Lio/getstream/chat/android/client/events/UserStopWatchingEvent;)V", "hidden", "setHidden", "(Z)V", "repliedMessage", "setRepliedMessage", "markRead", "()Z", "isMuted", "updateMute", "Lio/getstream/chat/android/models/Channel;", "channel", "messageLimit", "scrollUpdate", "isNotificationUpdate", "isChannelsStateUpdate", "isWatchChannel", "updateDataForChannel", "(Lio/getstream/chat/android/models/Channel;IZZZZZ)V", "c", "updateOldMessagesFromChannel", "(Lio/getstream/chat/android/models/Channel;)V", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "request", "propagateChannelQuery", "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V", "Ln23/e;", "error", "propagateQueryError", "(Ln23/e;)V", "syncMuteState$stream_chat_android_client_release", "syncMuteState", "addMember", "loadingNewestMessages", "loadingNewerMessages", "loadingOlderMessages", "eventReceivedDate", "updateCurrentUserRead", "Lio/getstream/chat/android/models/Poll;", "poll", "upsertPoll", "(Lio/getstream/chat/android/models/Poll;)V", "deletePoll", "pollId", "getPoll", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;", "channelMessageCount", "updateMessageCount", "(I)V", "updateLastMessageAt", "reads", "updateReads", "localRead", "serverRead", "mergeCurrentUserRead", "(Lio/getstream/chat/android/models/ChannelUserRead;Lio/getstream/chat/android/models/ChannelUserRead;)Lio/getstream/chat/android/models/ChannelUserRead;", "", "rawTypingEvents", "Lio/getstream/chat/android/models/TypingEvent;", "typingEvent", "updateTypingStates", "(Ljava/util/Map;Lio/getstream/chat/android/models/TypingEvent;)V", "upsertWatchers", "quotedMessage", "normalizeReplyMessages", "upsertCachedMessages", "parseCachedMessages", "(Ljava/util/List;)Ljava/util/Map;", "isInsideSearch", "isScrollUpdate", "shouldUpsertMessages", "(ZZZZZZ)Z", "noMoreMessages", "determinePaginationEnd", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Z)V", "currentMessage", "newMessage", "isMessageNewerThanCurrent", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Z", "lastUpdateTime", "(Lio/getstream/chat/android/models/Message;)J", "lastLocalUpdateTime", "addQuotedMessage", "storePoll", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;", "Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;", "Lc93/a;", "", "polls", "Ljava/util/Map;", "", "messageIdsWithPoll", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "La0/a0;", "processedMessageIds", "La0/a0;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;", "typingEventPruner", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelStateLogic implements ChannelMessagesUpdateLogic {
    private static final int CACHE_SIZE = 100;
    private static final Companion Companion = new Companion();
    private static final String TAG = "Chat:ChannelStateLogic";
    private static final int TEXT_LIMIT = 10;
    private final AttachmentUrlValidator attachmentUrlValidator;
    private final ClientState clientState;
    private final MutableGlobalState globalMutableState;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final Map<String, Set<String>> messageIdsWithPoll;
    private final ChannelStateLegacyImpl mutableState;
    private final InterfaceC4339a now;
    private final Map<String, Poll> polls;
    private final C0005a0 processedMessageIds;
    private final SearchLogic searchLogic;
    private final TypingEventPruner typingEventPruner;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic$Companion;", "", "<init>", "()V", "TAG", "", "TEXT_LIMIT", "", "CACHE_SIZE", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ChannelStateLogic(ClientState clientState, ChannelStateLegacyImpl mutableState, MutableGlobalState globalMutableState, SearchLogic searchLogic, AttachmentUrlValidator attachmentUrlValidator, InterfaceC4339a now, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mutableState, "mutableState");
        AbstractC22676k.m65750j(globalMutableState, "globalMutableState");
        AbstractC22676k.m65750j(searchLogic, "searchLogic");
        AbstractC22676k.m65750j(attachmentUrlValidator, "attachmentUrlValidator");
        AbstractC22676k.m65750j(now, "now");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.clientState = clientState;
        this.mutableState = mutableState;
        this.globalMutableState = globalMutableState;
        this.searchLogic = searchLogic;
        this.attachmentUrlValidator = attachmentUrlValidator;
        this.now = now;
        this.polls = new LinkedHashMap();
        this.messageIdsWithPoll = new LinkedHashMap();
        this.logger = AbstractC1772c1.m5382S(this, TAG);
        this.processedMessageIds = new C0005a0(100);
        this.typingEventPruner = new TypingEventPruner(mutableState.getChannelId(), coroutineScope, 0L, new ChannelStateLogic$typingEventPruner$1(this), 4, null);
        syncMuteState$stream_chat_android_client_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData addMembership$lambda$6(Member member, ChannelData channelData) {
        if (channelData != null) {
            return ChannelData.copy$default(channelData, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, member, null, null, null, null, null, 1032191, null);
        }
        return null;
    }

    private final void addQuotedMessage(Message message) {
        String replyMessageId;
        Message replyTo = message.getReplyTo();
        if (replyTo == null || (replyMessageId = replyTo.getId()) == null) {
            replyMessageId = message.getReplyMessageId();
        }
        if (replyMessageId != null) {
            this.mutableState.addQuotedMessage(replyMessageId, message.getId());
        }
    }

    private final void determinePaginationEnd(QueryChannelRequest request, boolean noMoreMessages) {
        if (!request.isFilteringMessages()) {
            this.mutableState.setEndOfOlderMessages(noMoreMessages);
            this.mutableState.setEndOfNewerMessages(true);
        } else if (request.isFilteringAroundIdMessages()) {
            this.mutableState.setEndOfOlderMessages(false);
            this.mutableState.setEndOfNewerMessages(false);
        } else if (noMoreMessages) {
            if (request.isFilteringNewerMessages()) {
                this.mutableState.setEndOfNewerMessages(true);
            } else {
                this.mutableState.setEndOfOlderMessages(true);
            }
        }
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final boolean isMessageNewerThanCurrent(Message currentMessage, Message newMessage) {
        if (newMessage.getSyncStatus() == SyncStatus.COMPLETED) {
            return (currentMessage != null ? lastUpdateTime(currentMessage) : MessageKt.getNEVER().getTime()) <= lastUpdateTime(newMessage);
        }
        return (currentMessage != null ? lastLocalUpdateTime(currentMessage) : MessageKt.getNEVER().getTime()) <= lastLocalUpdateTime(newMessage);
    }

    private final long lastLocalUpdateTime(Message message) {
        List listM74077r0 = AbstractC25260n.m74077r0(new Date[]{message.getCreatedLocallyAt(), message.getUpdatedLocallyAt(), message.getDeletedAt()});
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM74077r0, 10));
        Iterator it = listM74077r0.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Date) it.next()).getTime()));
        }
        Long l7 = (Long) AbstractC25265s.m74115S0(arrayList);
        return l7 != null ? l7.longValue() : MessageKt.getNEVER().getTime();
    }

    private final long lastUpdateTime(Message message) {
        List listM74077r0 = AbstractC25260n.m74077r0(new Date[]{message.getCreatedAt(), message.getUpdatedAt(), message.getDeletedAt()});
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM74077r0, 10));
        Iterator it = listM74077r0.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Date) it.next()).getTime()));
        }
        Long l7 = (Long) AbstractC25265s.m74115S0(arrayList);
        return l7 != null ? l7.longValue() : MessageKt.getNEVER().getTime();
    }

    private final ChannelUserRead mergeCurrentUserRead(ChannelUserRead localRead, ChannelUserRead serverRead) {
        if (!localRead.getLastReceivedEventDate().after(serverRead.getLastReceivedEventDate())) {
            return serverRead;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[updateReads] Local read state is more recent, preserving: local.lastReceivedEventDate=" + localRead.getLastReceivedEventDate() + ", server.lastReceivedEventDate=" + serverRead.getLastReceivedEventDate() + ", local.unreadMessages=" + localRead.getUnreadMessages() + ", server.unreadMessages=" + serverRead.getUnreadMessages(), null);
        }
        User user = serverRead.getUser();
        Date date = (Date) AbstractC30060g.m92091M(localRead.getLastRead(), serverRead.getLastRead());
        String lastReadMessageId = serverRead.getLastReadMessageId();
        if (lastReadMessageId == null) {
            lastReadMessageId = localRead.getLastReadMessageId();
        }
        String str2 = lastReadMessageId;
        Date lastDeliveredAt = serverRead.getLastDeliveredAt();
        if (lastDeliveredAt == null) {
            lastDeliveredAt = localRead.getLastDeliveredAt();
        }
        Date date2 = lastDeliveredAt;
        String lastDeliveredMessageId = serverRead.getLastDeliveredMessageId();
        if (lastDeliveredMessageId == null) {
            lastDeliveredMessageId = localRead.getLastDeliveredMessageId();
        }
        return ChannelUserRead.copy$default(localRead, user, null, 0, date, str2, date2, lastDeliveredMessageId, 6, null);
    }

    private final List<Message> normalizeReplyMessages(Message quotedMessage) {
        List<Message> allReplies = getAllReplies(quotedMessage);
        if (allReplies == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(allReplies, 10));
        for (Message message : allReplies) {
            arrayList.add(message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : quotedMessage, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : quotedMessage.getId(), (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false));
        }
        return arrayList;
    }

    private final Map<String, Message> parseCachedMessages(List<Message> messages) {
        Map<String, Message> map = (Map) ((C13045h2) this.mutableState.getCachedLatestMessages()).getValue();
        List<Message> listUpdateValidAttachmentsUrl$stream_chat_android_client_release = this.attachmentUrlValidator.updateValidAttachmentsUrl$stream_chat_android_client_release(messages, map);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listUpdateValidAttachmentsUrl$stream_chat_android_client_release) {
            Message message = (Message) obj;
            if (isMessageNewerThanCurrent(map.get(message.getId()), message)) {
                arrayList.add(obj);
            }
        }
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((Message) obj2).getId(), obj2);
        }
        return AbstractC25247g0.m73995d0(map, linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData removeMembership$lambda$7(ChannelData channelData) {
        if (channelData != null) {
            return ChannelData.copy$default(channelData, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, null, null, null, null, null, null, 1032191, null);
        }
        return null;
    }

    public static /* synthetic */ void removeMessagesBefore$default(ChannelStateLogic channelStateLogic, Date date, Message message, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            message = null;
        }
        channelStateLogic.removeMessagesBefore(date, message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData setPushPreference$lambda$33(PushPreference pushPreference, ChannelData channelData) {
        if (channelData != null) {
            return ChannelData.copy$default(channelData, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, null, null, null, pushPreference, null, null, 917503, null);
        }
        return null;
    }

    private final boolean shouldUpsertMessages(boolean isNotificationUpdate, boolean isInsideSearch, boolean isScrollUpdate, boolean shouldRefreshMessages, boolean isChannelsStateUpdate, boolean isWatchChannel) {
        if (isWatchChannel || shouldRefreshMessages || isScrollUpdate) {
            return true;
        }
        if (isNotificationUpdate && !isInsideSearch) {
            return true;
        }
        if (isChannelsStateUpdate) {
            return ((List) this.mutableState.getMessages().getValue()).isEmpty() || !isInsideSearch;
        }
        return false;
    }

    private final void storePoll(Message message) {
        Poll poll = message.getPoll();
        if (poll != null) {
            upsertPoll(poll);
            Map<String, Set<String>> map = this.messageIdsWithPoll;
            String id4 = poll.getId();
            Set<String> set = this.messageIdsWithPoll.get(poll.getId());
            if (set == null) {
                set = C25235a0.f99113w;
            }
            map.put(id4, AbstractC12350b.m34555D(message.getId(), set));
        }
    }

    private final void updateChannelData(Channel channel) {
        ChannelData channelData = ChannelKt.toChannelData(channel);
        if (channelData.getOwnCapabilities().isEmpty()) {
            channelData = ChannelData.copy$default(channelData, null, null, null, null, null, 0, false, null, null, null, 0, null, null, ((ChannelData) this.mutableState.getChannelData().getValue()).getOwnCapabilities(), null, null, null, null, null, null, 1040383, null);
        }
        this.mutableState.setChannelData(channelData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData updateChannelData$lambda$9(HasChannel hasChannel, ChannelData channelData) {
        ChannelData channelDataMergeFromEvent;
        ChannelData channelData2 = ChannelKt.toChannelData(hasChannel.getChannel());
        return (channelData == null || (channelDataMergeFromEvent = ChannelDataKt.mergeFromEvent(channelData, channelData2)) == null) ? channelData2 : channelDataMergeFromEvent;
    }

    public static /* synthetic */ void updateDataForChannel$default(ChannelStateLogic channelStateLogic, Channel channel, int i13, boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            z4 = false;
        }
        if ((i14 & 8) != 0) {
            z13 = false;
        }
        if ((i14 & 16) != 0) {
            z14 = false;
        }
        if ((i14 & 32) != 0) {
            z15 = false;
        }
        if ((i14 & 64) != 0) {
            z16 = false;
        }
        channelStateLogic.updateDataForChannel(channel, i13, z4, z13, z14, z15, z16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData updateLastMessageAt$lambda$56(Message message, boolean z4, ChannelData channelData) {
        Date dateCalculateNewLastMessageAt = ChannelUtilsKt.calculateNewLastMessageAt(message, channelData != null ? channelData.getLastMessageAt() : null, z4);
        if (AbstractC22676k.m65745e(dateCalculateNewLastMessageAt, channelData != null ? channelData.getLastMessageAt() : null)) {
            return channelData;
        }
        if (channelData != null) {
            return ChannelData.copy$default(channelData, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, null, null, null, null, null, dateCalculateNewLastMessageAt, 524287, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData updateMembership$lambda$5(Member member, ChannelStateLogic channelStateLogic, ChannelData channelData) {
        if (channelData == null) {
            return null;
        }
        String userId = member.getUserId();
        Member membership = channelData.getMembership();
        Member membership2 = AbstractC22676k.m65745e(userId, membership != null ? membership.getUserId() : null) ? member : null;
        if (membership2 == null) {
            membership2 = channelData.getMembership();
            C2345k logger = channelStateLogic.getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8300m("[updateMembership] rejected; newMembershipUserId(", member.getUserId(), ") != curMembershipUserId(", membership2 != null ? membership2.getUserId() : null, ")"), null);
            }
        }
        return ChannelData.copy$default(channelData, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, membership2, null, null, null, null, null, 1032191, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData updateMessageCount$lambda$55(int i13, ChannelData channelData) {
        if (channelData != null) {
            return ChannelData.copy$default(channelData, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, null, null, Integer.valueOf(i13), null, null, null, 983039, null);
        }
        return null;
    }

    private final void updateReads(List<ChannelUserRead> reads) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC25012a.m73374g(reads.size(), "[updateReads] cid: ", this.mutableState.getCid(), ", reads.size: "), null);
        }
        User user = (User) ((C13045h2) this.clientState.getUser()).getValue();
        String id4 = user != null ? user.getId() : null;
        ChannelUserRead channelUserRead = (ChannelUserRead) this.mutableState.getRead().getValue();
        if (id4 != null && channelUserRead != null) {
            List<ChannelUserRead> list = reads;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (ChannelUserRead channelUserReadMergeCurrentUserRead : list) {
                if (AbstractC22676k.m65745e(channelUserReadMergeCurrentUserRead.getUserId(), id4)) {
                    channelUserReadMergeCurrentUserRead = mergeCurrentUserRead(channelUserRead, channelUserReadMergeCurrentUserRead);
                }
                arrayList.add(channelUserReadMergeCurrentUserRead);
            }
            reads = arrayList;
        }
        this.mutableState.upsertReads(reads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTypingStates(Map<String, TypingStartEvent> rawTypingEvents, TypingEvent typingEvent) {
        this.mutableState.updateTypingEvent(typingEvent);
        this.globalMutableState.tryEmitTypingEvent(this.mutableState.getCid(), typingEvent);
    }

    private final void upsertCachedMessages(List<Message> messages) {
        this.mutableState.updateCachedLatestMessages(parseCachedMessages(messages));
    }

    public static /* synthetic */ void upsertMessages$default(ChannelStateLogic channelStateLogic, List list, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        channelStateLogic.upsertMessages(list, z4);
    }

    private final void upsertWatchers(List<User> watchers, int watchersCount) {
        this.mutableState.upsertWatchers(watchers, watchersCount);
    }

    public final void addMember(Member member) {
        AbstractC22676k.m65750j(member, "member");
        this.mutableState.addMember(member);
    }

    public final void addMembership(Member member) {
        AbstractC22676k.m65750j(member, "member");
        this.mutableState.updateChannelData(new C19318c(member, 0));
    }

    @Override // io.getstream.chat.android.client.channel.ChannelMessagesUpdateLogic
    public final ChannelState channelState() {
        return this.mutableState;
    }

    public final void deleteChannel(Date deleteDate) {
        AbstractC22676k.m65750j(deleteDate, "deleteDate");
        ChannelStateLegacyImpl channelStateLegacyImpl = this.mutableState;
        channelStateLegacyImpl.setChannelData(ChannelData.copy$default((ChannelData) channelStateLegacyImpl.getChannelData().getValue(), null, null, null, null, null, 0, false, null, null, deleteDate, 0, null, null, null, null, null, null, null, null, null, 1048063, null));
    }

    public final void deleteMember(Member member) {
        AbstractC22676k.m65750j(member, "member");
        this.mutableState.deleteMember(member);
    }

    public final void deleteMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        this.mutableState.deleteMessage(message);
    }

    public final void deleteMessagesFromUser(String userId, boolean hard, Date deletedAt) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(deletedAt, "deletedAt");
        List<Message> messagesFromUser = this.mutableState.getMessagesFromUser(userId);
        if (messagesFromUser.isEmpty()) {
            return;
        }
        if (hard) {
            this.mutableState.deleteMessages(messagesFromUser);
            return;
        }
        List<Message> list = messagesFromUser;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (Message message : list) {
            arrayList.add(message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : deletedAt, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false));
        }
        this.mutableState.upsertMessages(arrayList);
    }

    public final void deletePoll(Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        this.polls.remove(poll.getId());
        Set<String> set = this.messageIdsWithPoll.get(poll.getId());
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                Message messageById = this.mutableState.getMessageById((String) it.next());
                if (messageById != null) {
                    this.mutableState.upsertMessage(messageById.copy(((-1) & 1) != 0 ? messageById.id : null, ((-1) & 2) != 0 ? messageById.cid : null, ((-1) & 4) != 0 ? messageById.text : null, ((-1) & 8) != 0 ? messageById.html : null, ((-1) & 16) != 0 ? messageById.parentId : null, ((-1) & 32) != 0 ? messageById.command : null, ((-1) & 64) != 0 ? messageById.attachments : null, ((-1) & 128) != 0 ? messageById.mentionedUsersIds : null, ((-1) & 256) != 0 ? messageById.mentionedUsers : null, ((-1) & 512) != 0 ? messageById.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageById.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageById.reactionCounts : null, ((-1) & 4096) != 0 ? messageById.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageById.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageById.syncStatus : null, ((-1) & 32768) != 0 ? messageById.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageById.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageById.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageById.createdAt : null, ((-1) & 524288) != 0 ? messageById.updatedAt : null, ((-1) & 1048576) != 0 ? messageById.deletedAt : null, ((-1) & 2097152) != 0 ? messageById.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? messageById.createdLocallyAt : null, ((-1) & 8388608) != 0 ? messageById.user : null, ((-1) & 16777216) != 0 ? messageById.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageById.silent : false, ((-1) & 67108864) != 0 ? messageById.shadowed : false, ((-1) & 134217728) != 0 ? messageById.i18n : null, ((-1) & 268435456) != 0 ? messageById.showInChannel : false, ((-1) & 536870912) != 0 ? messageById.channelInfo : null, ((-1) & 1073741824) != 0 ? messageById.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? messageById.replyMessageId : null, (65535 & 1) != 0 ? messageById.pinned : false, (65535 & 2) != 0 ? messageById.pinnedAt : null, (65535 & 4) != 0 ? messageById.pinExpires : null, (65535 & 8) != 0 ? messageById.pinnedBy : null, (65535 & 16) != 0 ? messageById.threadParticipants : null, (65535 & 32) != 0 ? messageById.skipPushNotification : false, (65535 & 64) != 0 ? messageById.skipEnrichUrl : false, (65535 & 128) != 0 ? messageById.moderationDetails : null, (65535 & 256) != 0 ? messageById.moderation : null, (65535 & 512) != 0 ? messageById.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageById.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageById.restrictedVisibility : null, (65535 & 4096) != 0 ? messageById.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageById.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageById.channelRole : null, (65535 & 32768) != 0 ? messageById.deletedForMe : false));
                }
            }
        }
        this.messageIdsWithPoll.remove(poll.getId());
    }

    public final void deleteWatcher(UserStopWatchingEvent event) {
        AbstractC22676k.m65750j(event, "event");
        this.mutableState.deleteWatcher$stream_chat_android_client_release(event.getUser(), event.getWatcherCount());
    }

    public final void delsertPinnedMessage(Message message) {
        Date pinExpires;
        AbstractC22676k.m65750j(message, "message");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            boolean pinned = message.getPinned();
            InterfaceC4339a interfaceC4339a = this.now;
            Date pinExpires2 = message.getPinExpires();
            boolean z4 = pinExpires2 != null && pinExpires2.getTime() < ((Number) interfaceC4339a.invoke()).longValue();
            boolean zIsDeleted = MessageUtils.isDeleted(message);
            String id4 = message.getId();
            String text = message.getText();
            StringBuilder sbM32002u = AbstractC11895b.m32002u("[delsertPinnedMessage] pinned: ", ", pinExpired: ", ", deleted: ", pinned, z4);
            AbstractC38963t7.m124391u(sbM32002u, zIsDeleted, ", message.id: ", id4, ", message.text: ");
            sbM32002u.append(text);
            interfaceC2344j.log(enumC2341g, str, sbM32002u.toString(), null);
        }
        InterfaceC4339a interfaceC4339a2 = this.now;
        if (!message.getPinned() || MessageUtils.isDeleted(message) || ((pinExpires = message.getPinExpires()) != null && pinExpires.getTime() < ((Number) interfaceC4339a2.invoke()).longValue())) {
            this.mutableState.deletePinnedMessage(message);
        } else {
            upsertPinnedMessages(AbstractC37056f.m118958J(message), false);
        }
    }

    public final List<Message> getAllReplies(Message message) {
        AbstractC22676k.m65750j(message, "message");
        List list = (List) ((Map) this.mutableState.getQuotedMessagesMap().getValue()).get(message.getId());
        if (list == null) {
            return null;
        }
        ChannelStateLegacyImpl channelStateLegacyImpl = this.mutableState;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Message messageById = channelStateLegacyImpl.getMessageById((String) it.next());
            if (messageById != null) {
                arrayList.add(messageById);
            }
        }
        return arrayList;
    }

    public final Poll getPoll(String pollId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return this.polls.get(pollId);
    }

    public final void hideMessagesBefore(Date date) {
        AbstractC22676k.m65750j(date, "date");
        this.mutableState.setHideMessagesBefore(date);
    }

    public final void loadingNewerMessages() {
        this.mutableState.setLoadingNewerMessages(true);
    }

    public final void loadingNewestMessages() {
        this.mutableState.resetMessageLimit$stream_chat_android_client_release();
    }

    public final void loadingOlderMessages() {
        this.mutableState.setLoadingOlderMessages(true);
    }

    public final boolean markRead() {
        return this.mutableState.markChannelAsRead();
    }

    public final void propagateChannelQuery(Channel channel, QueryChannelRequest request) {
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC22676k.m65750j(request, "request");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[propagateChannelQuery] cid: " + channel.getCid() + ", request: " + request, null);
        }
        boolean z4 = request.messagesLimit() > channel.getMessages().size();
        if (!request.getIsNotificationUpdate() && request.messagesLimit() != 0) {
            this.searchLogic.handleMessageBounds(request, z4);
            this.mutableState.setRecoveryNeeded(false);
            determinePaginationEnd(request, z4);
        }
        updateDataForChannel$default(this, channel, request.messagesLimit(), request.getShouldRefresh(), request.isFilteringMessages(), request.getIsNotificationUpdate(), false, request.getIsWatchChannel(), 32, null);
    }

    public final void propagateQueryError(AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        if (ChatErrorKt.isPermanent(error)) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
                C2343i.f9271c.log(enumC2341g, TAG, "Permanent failure calling channel.watch for channel " + this.mutableState.getCid() + ", with error " + error, null);
            }
        } else {
            C2343i c2343i2 = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e2.isLoggable(enumC2341g2, TAG)) {
                C2343i.f9271c.log(enumC2341g2, TAG, "Temporary failure calling channel.watch for channel " + this.mutableState.getCid() + ". Marking the channel as needing recovery. Error was " + error, null);
            }
            this.mutableState.setRecoveryNeeded(true);
        }
        this.mutableState.setLoadingOlderMessages(false);
        this.mutableState.setLoadingNewerMessages(false);
    }

    public final void removeMembership() {
        this.mutableState.updateChannelData(new C19031a(23));
    }

    public final void removeMessagesBefore(Date date, Message systemMessage) {
        AbstractC22676k.m65750j(date, "date");
        this.mutableState.removeMessagesBefore(date);
        if (systemMessage != null) {
            this.mutableState.upsertMessage(systemMessage);
        }
    }

    public final void setHidden(boolean hidden) {
        this.mutableState.setHidden(hidden);
    }

    public final void setMembers(List<Member> members, int membersCount) {
        AbstractC22676k.m65750j(members, "members");
        this.mutableState.setMembers(members, membersCount);
    }

    public final void setPushPreference(PushPreference preference) {
        AbstractC22676k.m65750j(preference, "preference");
        updateChannelData(new C19317b(preference, 0));
    }

    @Override // io.getstream.chat.android.client.channel.ChannelMessagesUpdateLogic
    public final void setRepliedMessage(Message repliedMessage) {
        this.mutableState.setRepliedMessage(repliedMessage);
    }

    public final void setTyping(String userId, TypingStartEvent event) {
        AbstractC22676k.m65750j(userId, "userId");
        User user = (User) ((C13045h2) this.clientState.getUser()).getValue();
        if (userId.equals(user != null ? user.getId() : null)) {
            return;
        }
        this.typingEventPruner.processEvent(userId, event);
    }

    public final void setWatchers(List<User> watchers, int watchersCount) {
        AbstractC22676k.m65750j(watchers, "watchers");
        this.mutableState.setWatchers(watchers, watchersCount);
    }

    public final void syncMuteState$stream_chat_android_client_release() {
        String cid = this.mutableState.getCid();
        Iterable iterable = (Iterable) this.globalMutableState.getChannelMutes().getValue();
        boolean z4 = false;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Channel channel = ((ChannelMute) it.next()).getChannel();
                if (AbstractC22676k.m65745e(channel != null ? channel.getCid() : null, cid)) {
                    z4 = true;
                    break;
                }
            }
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11478a.m30857i("[syncMuteState] cid: ", cid, ", isMuted: ", z4), null);
        }
        updateMute(z4);
    }

    public final void updateCurrentUserRead(Date eventReceivedDate, Message message) {
        AbstractC22676k.m65750j(eventReceivedDate, "eventReceivedDate");
        AbstractC22676k.m65750j(message, "message");
        Object objM2c = this.processedMessageIds.m2c(message.getId());
        Boolean bool = Boolean.TRUE;
        if (AbstractC22676k.m65745e(objM2c, bool)) {
            return;
        }
        if (((Boolean) this.mutableState.getMuted().getValue()).booleanValue()) {
            this.processedMessageIds.m3d(message.getId(), bool);
            return;
        }
        if (message.getParentId() != null && !message.getShowInChannel()) {
            this.processedMessageIds.m3d(message.getId(), bool);
            return;
        }
        String id4 = message.getUser().getId();
        User user = (User) ((C13045h2) this.clientState.getUser()).getValue();
        if (AbstractC22676k.m65745e(id4, user != null ? user.getId() : null)) {
            this.processedMessageIds.m3d(message.getId(), bool);
            return;
        }
        Iterable iterable = (Iterable) this.globalMutableState.getMuted().getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                User target = ((Mute) it.next()).getTarget();
                if (AbstractC22676k.m65745e(target != null ? target.getId() : null, message.getUser().getId())) {
                    this.processedMessageIds.m3d(message.getId(), Boolean.TRUE);
                    return;
                }
            }
        }
        if (message.getShadowed()) {
            this.processedMessageIds.m3d(message.getId(), Boolean.TRUE);
            return;
        }
        if (message.getSilent()) {
            this.processedMessageIds.m3d(message.getId(), Boolean.TRUE);
            return;
        }
        ChannelUserRead channelUserRead = (ChannelUserRead) this.mutableState.getRead().getValue();
        if (channelUserRead != null && channelUserRead.getLastReceivedEventDate().after(eventReceivedDate)) {
            this.processedMessageIds.m3d(message.getId(), Boolean.TRUE);
            return;
        }
        if (channelUserRead != null) {
            updateRead(ChannelUserRead.copy$default(channelUserRead, null, eventReceivedDate, channelUserRead.getUnreadMessages() + 1, null, null, null, null, 121, null));
        }
        this.processedMessageIds.m3d(message.getId(), Boolean.TRUE);
    }

    public final void updateDataForChannel(Channel channel, int messageLimit, boolean shouldRefreshMessages, boolean scrollUpdate, boolean isNotificationUpdate, boolean isChannelsStateUpdate, boolean isWatchChannel) {
        ChannelStateLogic channelStateLogic;
        AbstractC22676k.m65750j(channel, "channel");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(messageLimit, "[updateDataForChannel] cid: ", channel.getCid(), ", messageLimit: ", ", shouldRefreshMessages: ");
            AbstractC38963t7.m124392v(sbM30467u, shouldRefreshMessages, ", scrollUpdate: ", scrollUpdate, ", isNotificationUpdate: ");
            AbstractC38963t7.m124392v(sbM30467u, isNotificationUpdate, ", isChannelsStateUpdate: ", isChannelsStateUpdate, ", isWatchChannel: ");
            sbM30467u.append(isWatchChannel);
            interfaceC2344j.log(enumC2341g, str, sbM30467u.toString(), null);
        }
        updateChannelData(channel);
        this.mutableState.setMembersCount(channel.getMemberCount());
        updateReads(channel.getRead());
        upsertMembers(channel.getMembers());
        upsertWatchers(channel.getWatchers(), channel.getWatcherCount());
        if (messageLimit != 0) {
            channelStateLogic = this;
            if (channelStateLogic.shouldUpsertMessages(isNotificationUpdate, ((Boolean) this.mutableState.getInsideSearch().getValue()).booleanValue(), scrollUpdate, shouldRefreshMessages, isChannelsStateUpdate, isWatchChannel)) {
                List<PendingMessage> pendingMessages = channel.getPendingMessages();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(pendingMessages, 10));
                Iterator<T> it = pendingMessages.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PendingMessage) it.next()).getMessage());
                }
                upsertMessages(AbstractC25265s.m74129g1(channel.getMessages(), arrayList), shouldRefreshMessages);
                upsertPinnedMessages(channel.getPinnedMessages(), shouldRefreshMessages);
            } else {
                List<PendingMessage> pendingMessages2 = channel.getPendingMessages();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(pendingMessages2, 10));
                Iterator<T> it3 = pendingMessages2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((PendingMessage) it3.next()).getMessage());
                }
                upsertCachedMessages(AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(channel.getPinnedMessages(), channel.getMessages()), arrayList2));
            }
        } else {
            channelStateLogic = this;
        }
        channelStateLogic.mutableState.setChannelConfig(channel.getConfig());
        channelStateLogic.mutableState.setLoadingOlderMessages(false);
        channelStateLogic.mutableState.setLoadingNewerMessages(false);
    }

    public final void updateDelivered(ChannelUserRead read) {
        AbstractC22676k.m65750j(read, "read");
        this.mutableState.upsertDelivered(read);
    }

    public final void updateLastMessageAt(Message message) {
        AbstractC22676k.m65750j(message, "message");
        updateChannelData(new C19319d(message, ((Config) this.mutableState.getChannelConfig().getValue()).getSkipLastMsgUpdateForSystemMsgs(), 0));
    }

    public final void updateMemberBanned(String memberUserId, boolean banned, Date banExpires, boolean shadow) {
        ChannelStateLegacyImpl channelStateLegacyImpl = this.mutableState;
        Iterable<Member> iterable = (Iterable) channelStateLegacyImpl.getMembers().getValue();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        for (Member memberCopy : iterable) {
            boolean zM65745e = AbstractC22676k.m65745e(memberCopy.getUser().getId(), memberUserId);
            if (zM65745e) {
                memberCopy = memberCopy.copy((32766 & 1) != 0 ? memberCopy.user : null, (32766 & 2) != 0 ? memberCopy.createdAt : null, (32766 & 4) != 0 ? memberCopy.updatedAt : null, (32766 & 8) != 0 ? memberCopy.isInvited : null, (32766 & 16) != 0 ? memberCopy.inviteAcceptedAt : null, (32766 & 32) != 0 ? memberCopy.inviteRejectedAt : null, (32766 & 64) != 0 ? memberCopy.shadowBanned : shadow, (32766 & 128) != 0 ? memberCopy.banned : banned, (32766 & 256) != 0 ? memberCopy.channelRole : null, (32766 & 512) != 0 ? memberCopy.notificationsMuted : null, (32766 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? memberCopy.status : null, (32766 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? memberCopy.banExpires : banExpires, (32766 & 4096) != 0 ? memberCopy.pinnedAt : null, (32766 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? memberCopy.archivedAt : null, (32766 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? memberCopy.extraData : null);
            } else if (zM65745e) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(memberCopy);
        }
        channelStateLegacyImpl.upsertMembers(arrayList);
    }

    public final void updateMembership(Member membership) {
        AbstractC22676k.m65750j(membership, "membership");
        this.mutableState.updateChannelData(new C19223a(12, membership, this));
    }

    public final void updateMessageCount(int channelMessageCount) {
        updateChannelData(new C6494e(channelMessageCount, 17));
    }

    public final void updateMute(boolean isMuted) {
        this.mutableState.setMuted(isMuted);
    }

    public final void updateOldMessagesFromChannel(Channel c3) {
        AbstractC22676k.m65750j(c3, "c");
        this.mutableState.setHideMessagesBefore(c3.getHiddenMessagesBefore());
        updateChannelData(c3);
        updateReads(c3.getRead());
        this.mutableState.setMembersCount(c3.getMemberCount());
        upsertMembers(c3.getMembers());
        upsertWatchers(c3.getWatchers(), c3.getWatcherCount());
        upsertMessages(c3.getMessages(), false);
    }

    public final void updateRead(ChannelUserRead read) {
        AbstractC22676k.m65750j(read, "read");
        updateReads(AbstractC37056f.m118958J(read));
    }

    public final void upsertMember(Member member) {
        AbstractC22676k.m65750j(member, "member");
        upsertMembers(AbstractC37056f.m118958J(member));
    }

    public final void upsertMembers(List<Member> members) {
        AbstractC22676k.m65750j(members, "members");
        this.mutableState.upsertMembers(members);
    }

    @Override // io.getstream.chat.android.client.channel.ChannelMessagesUpdateLogic
    public final void upsertMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC31061c.m95640p("[upsertMessage] message.id: ", message.getId(), ", message.text: ", message.getText()), null);
        }
        if (((Map) this.mutableState.getVisibleMessages().getValue()).containsKey(message.getId()) || !((Boolean) this.mutableState.getInsideSearch().getValue()).booleanValue()) {
            upsertMessages(AbstractC37056f.m118958J(message), false);
        } else {
            this.mutableState.updateCachedLatestMessages(parseCachedMessages(AbstractC37056f.m118958J(message)));
        }
    }

    public final void upsertMessages(List<Message> messages, boolean shouldRefreshMessages) {
        String text;
        String text2;
        AbstractC22676k.m65750j(messages, "messages");
        Message message = (Message) AbstractC25265s.m74100H0(messages);
        Message message2 = (Message) AbstractC25265s.m74114R0(messages);
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            int size = messages.size();
            String strM125866L0 = (message == null || (text2 = message.getText()) == null) ? null : AbstractC39414r.m125866L0(10, text2);
            String strM125866L1 = (message2 == null || (text = message2.getText()) == null) ? null : AbstractC39414r.m125866L0(10, text);
            StringBuilder sbM53373n = AbstractC18489d0.m53373n(size, "[upsertMessages] messages.size: ", ", first: ", strM125866L0, ", last: ");
            sbM53373n.append(strM125866L1);
            sbM53373n.append(", shouldRefreshMessages: ");
            sbM53373n.append(shouldRefreshMessages);
            interfaceC2344j.log(enumC2341g, str, sbM53373n.toString(), null);
        }
        List<Message> list = messages;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (MessageUtils.isReply((Message) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            addQuotedMessage((Message) it.next());
        }
        if (shouldRefreshMessages) {
            this.mutableState.setMessages(messages);
        } else {
            Iterable iterable = (Iterable) this.mutableState.getMessageList().getValue();
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(iterable, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj2 : iterable) {
                linkedHashMap.put(((Message) obj2).getId(), obj2);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list) {
                Message message3 = (Message) obj3;
                if (isMessageNewerThanCurrent((Message) linkedHashMap.get(message3.getId()), message3)) {
                    arrayList2.add(obj3);
                }
            }
            List<Message> listUpdateValidAttachmentsUrl$stream_chat_android_client_release = this.attachmentUrlValidator.updateValidAttachmentsUrl$stream_chat_android_client_release(arrayList2, linkedHashMap);
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it3 = listUpdateValidAttachmentsUrl$stream_chat_android_client_release.iterator();
            while (it3.hasNext()) {
                List<Message> listNormalizeReplyMessages = normalizeReplyMessages((Message) it3.next());
                if (listNormalizeReplyMessages == null) {
                    listNormalizeReplyMessages = C25271y.f99162w;
                }
                AbstractC25265s.m74141p0(arrayList3, listNormalizeReplyMessages);
            }
            this.mutableState.upsertMessages(AbstractC25265s.m74129g1(listUpdateValidAttachmentsUrl$stream_chat_android_client_release, arrayList3));
        }
        Iterator<T> it4 = list.iterator();
        while (it4.hasNext()) {
            storePoll((Message) it4.next());
        }
    }

    public final void upsertPinnedMessages(List<Message> messages, boolean shouldRefreshMessages) {
        Date pinExpires;
        String text;
        String text2;
        AbstractC22676k.m65750j(messages, "messages");
        Message message = (Message) AbstractC25265s.m74100H0(messages);
        Message message2 = (Message) AbstractC25265s.m74114R0(messages);
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            int size = messages.size();
            String strM125866L0 = (message == null || (text2 = message.getText()) == null) ? null : AbstractC39414r.m125866L0(10, text2);
            String strM125866L1 = (message2 == null || (text = message2.getText()) == null) ? null : AbstractC39414r.m125866L0(10, text);
            StringBuilder sbM53373n = AbstractC18489d0.m53373n(size, "[upsertPinnedMessages] messages.size: ", ", first: ", strM125866L0, ", last: ");
            sbM53373n.append(strM125866L1);
            sbM53373n.append(", shouldRefreshMessages: ");
            sbM53373n.append(shouldRefreshMessages);
            interfaceC2344j.log(enumC2341g, str, sbM53373n.toString(), null);
        }
        List<Message> list = messages;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (MessageUtils.isReply((Message) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            addQuotedMessage((Message) it.next());
        }
        if (shouldRefreshMessages) {
            this.mutableState.setPinnedMessages(messages);
        } else {
            Map<String, Message> rawPinnedMessages = this.mutableState.getRawPinnedMessages();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                Message message3 = (Message) obj2;
                if (isMessageNewerThanCurrent(rawPinnedMessages.get(message3.getId()), message3)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList2) {
                Message message4 = (Message) obj3;
                InterfaceC4339a interfaceC4339a = this.now;
                if (message4.getPinned() && !MessageUtils.isDeleted(message4) && ((pinExpires = message4.getPinExpires()) == null || pinExpires.getTime() >= ((Number) interfaceC4339a.invoke()).longValue())) {
                    arrayList3.add(obj3);
                }
            }
            List<Message> listUpdateValidAttachmentsUrl$stream_chat_android_client_release = this.attachmentUrlValidator.updateValidAttachmentsUrl$stream_chat_android_client_release(arrayList3, rawPinnedMessages);
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it3 = listUpdateValidAttachmentsUrl$stream_chat_android_client_release.iterator();
            while (it3.hasNext()) {
                List<Message> listNormalizeReplyMessages = normalizeReplyMessages((Message) it3.next());
                if (listNormalizeReplyMessages == null) {
                    listNormalizeReplyMessages = C25271y.f99162w;
                }
                AbstractC25265s.m74141p0(arrayList4, listNormalizeReplyMessages);
            }
            this.mutableState.upsertPinnedMessages(AbstractC25265s.m74129g1(listUpdateValidAttachmentsUrl$stream_chat_android_client_release, arrayList4));
        }
        Iterator<T> it4 = list.iterator();
        while (it4.hasNext()) {
            storePoll((Message) it4.next());
        }
    }

    public final void upsertPoll(Poll poll) {
        ChannelStateLogic channelStateLogic = this;
        AbstractC22676k.m65750j(poll, "poll");
        channelStateLogic.polls.put(poll.getId(), poll);
        Set<String> set = channelStateLogic.messageIdsWithPoll.get(poll.getId());
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                Message messageById = channelStateLogic.mutableState.getMessageById((String) it.next());
                if (messageById != null) {
                    channelStateLogic.mutableState.upsertMessage(messageById.copy(((-1) & 1) != 0 ? messageById.id : null, ((-1) & 2) != 0 ? messageById.cid : null, ((-1) & 4) != 0 ? messageById.text : null, ((-1) & 8) != 0 ? messageById.html : null, ((-1) & 16) != 0 ? messageById.parentId : null, ((-1) & 32) != 0 ? messageById.command : null, ((-1) & 64) != 0 ? messageById.attachments : null, ((-1) & 128) != 0 ? messageById.mentionedUsersIds : null, ((-1) & 256) != 0 ? messageById.mentionedUsers : null, ((-1) & 512) != 0 ? messageById.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageById.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageById.reactionCounts : null, ((-1) & 4096) != 0 ? messageById.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageById.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageById.syncStatus : null, ((-1) & 32768) != 0 ? messageById.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageById.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageById.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageById.createdAt : null, ((-1) & 524288) != 0 ? messageById.updatedAt : null, ((-1) & 1048576) != 0 ? messageById.deletedAt : null, ((-1) & 2097152) != 0 ? messageById.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? messageById.createdLocallyAt : null, ((-1) & 8388608) != 0 ? messageById.user : null, ((-1) & 16777216) != 0 ? messageById.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageById.silent : false, ((-1) & 67108864) != 0 ? messageById.shadowed : false, ((-1) & 134217728) != 0 ? messageById.i18n : null, ((-1) & 268435456) != 0 ? messageById.showInChannel : false, ((-1) & 536870912) != 0 ? messageById.channelInfo : null, ((-1) & 1073741824) != 0 ? messageById.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? messageById.replyMessageId : null, (65535 & 1) != 0 ? messageById.pinned : false, (65535 & 2) != 0 ? messageById.pinnedAt : null, (65535 & 4) != 0 ? messageById.pinExpires : null, (65535 & 8) != 0 ? messageById.pinnedBy : null, (65535 & 16) != 0 ? messageById.threadParticipants : null, (65535 & 32) != 0 ? messageById.skipPushNotification : false, (65535 & 64) != 0 ? messageById.skipEnrichUrl : false, (65535 & 128) != 0 ? messageById.moderationDetails : null, (65535 & 256) != 0 ? messageById.moderation : null, (65535 & 512) != 0 ? messageById.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageById.poll : poll, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageById.restrictedVisibility : null, (65535 & 4096) != 0 ? messageById.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageById.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageById.channelRole : null, (65535 & 32768) != 0 ? messageById.deletedForMe : false));
                }
                channelStateLogic = this;
            }
        }
    }

    public final void upsertUserPresence(User user) {
        AbstractC22676k.m65750j(user, "user");
        this.mutableState.upsertUserPresence(user);
    }

    public final void upsertWatcher(UserStartWatchingEvent event) {
        AbstractC22676k.m65750j(event, "event");
        this.mutableState.upsertWatchers(AbstractC37056f.m118958J(event.getUser()), event.getWatcherCount());
    }

    /* JADX INFO: renamed from: writeChannelState, reason: from getter */
    public final ChannelStateLegacyImpl getMutableState() {
        return this.mutableState;
    }

    public final void updateChannelData(Function1 update) {
        AbstractC22676k.m65750j(update, "update");
        this.mutableState.updateChannelData(update);
    }

    public final void updateChannelData(HasChannel event) {
        AbstractC22676k.m65750j(event, "event");
        this.mutableState.updateChannelData(new C19316a(event, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ChannelStateLogic(ClientState clientState, ChannelStateLegacyImpl channelStateLegacyImpl, MutableGlobalState mutableGlobalState, SearchLogic searchLogic, AttachmentUrlValidator attachmentUrlValidator, InterfaceC4339a interfaceC4339a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        AttachmentUrlValidator attachmentUrlValidator2;
        if ((i13 & 16) != 0) {
            attachmentUrlValidator2 = new AttachmentUrlValidator(null, 1, 0 == true ? 1 : 0);
        } else {
            attachmentUrlValidator2 = attachmentUrlValidator;
        }
        this(clientState, channelStateLegacyImpl, mutableGlobalState, searchLogic, attachmentUrlValidator2, (i13 & 32) != 0 ? new C19383k(6) : interfaceC4339a, interfaceC2994c0);
    }
}
