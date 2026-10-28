package io.getstream.chat.android.client.internal.state.plugin.state.channel.internal;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.data.local.room.dao.persistent.C6494e;
import com.whoop.service.network.model.UserState;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import ge3.AbstractC15751g;
import gf1.C15786e;
import ig0.C18468h;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.api2.C19054d;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.client.events.HasChannel;
import io.getstream.chat.android.client.events.MemberAddedEvent;
import io.getstream.chat.android.client.events.MemberRemovedEvent;
import io.getstream.chat.android.client.events.NotificationInviteRejectedEvent;
import io.getstream.chat.android.client.events.UserStartWatchingEvent;
import io.getstream.chat.android.client.events.UserStopWatchingEvent;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.MemberKt;
import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.client.extensions.internal.UserKt;
import io.getstream.chat.android.client.internal.state.message.attachments.internal.AttachmentUrlValidator;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.C19316a;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.C19317b;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.C19318c;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.C19319d;
import io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlowKt;
import io.getstream.chat.android.client.internal.state.utils.internal.ListKt;
import io.getstream.chat.android.client.utils.channel.ChannelUtilsKt;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.extensions.MessagesExtensionsKt;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.ChannelDataKt;
import io.getstream.chat.android.models.ChannelKt;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Config;
import io.getstream.chat.android.models.Location;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessagesState;
import io.getstream.chat.android.models.Mute;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.PushPreference;
import io.getstream.chat.android.models.TypingEvent;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23465k;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p002a0.C0005a0;
import p098dt.AbstractC12350b;
import p708hb2.C17095c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b(\b\u0000\u0018\u0000 ²\u00022\u00020\u0001:\u0004³\u0002²\u0002B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\b0\u0005\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0005\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\n¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b)\u0010$J\u0015\u0010*\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b*\u0010$J)\u0010-\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00022\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0+¢\u0006\u0004\b-\u0010.J/\u00102\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u001b2\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b00¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J!\u00109\u001a\u00020\u001f2\u0006\u00107\u001a\u0002062\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u001f2\u0006\u00107\u001a\u000206¢\u0006\u0004\b;\u0010<J%\u0010@\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u000206¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bB\u0010CJ\u001b\u0010D\u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\n¢\u0006\u0004\bD\u0010!J\u001b\u0010E\u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\n¢\u0006\u0004\bE\u0010!J\u0015\u0010F\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\bF\u00105J\u0017\u0010G\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bG\u0010$J\u001d\u0010J\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0002¢\u0006\u0004\bJ\u0010KJ\u0015\u0010M\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u001b¢\u0006\u0004\bM\u0010$J\u0015\u0010N\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020\u0002¢\u0006\u0004\bN\u00105J\u0015\u0010P\u001a\u00020\u001f2\u0006\u0010O\u001a\u00020\u001b¢\u0006\u0004\bP\u0010$J\u001b\u0010R\u001a\u00020\u001f2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001b0\n¢\u0006\u0004\bR\u0010!J\u0015\u0010T\u001a\u00020\u001f2\u0006\u0010S\u001a\u00020\u0002¢\u0006\u0004\bT\u00105J1\u0010Y\u001a\u00020\u001f2\b\u0010U\u001a\u0004\u0018\u00010\u00022\u0006\u0010V\u001a\u00020%2\b\u0010W\u001a\u0004\u0018\u0001062\u0006\u0010X\u001a\u00020%¢\u0006\u0004\bY\u0010ZJ\u0015\u0010\\\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020\u000f¢\u0006\u0004\b\\\u0010]J\u001b\u0010`\u001a\u00020\u001f2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\n¢\u0006\u0004\b`\u0010!J\u0015\u0010c\u001a\u00020\u001f2\u0006\u0010b\u001a\u00020a¢\u0006\u0004\bc\u0010dJ\u0015\u0010f\u001a\u00020\u001f2\u0006\u0010b\u001a\u00020e¢\u0006\u0004\bf\u0010gJ\u0015\u0010f\u001a\u00020\u001f2\u0006\u0010b\u001a\u00020h¢\u0006\u0004\bf\u0010iJ\u0015\u0010k\u001a\u00020\u001f2\u0006\u0010j\u001a\u00020^¢\u0006\u0004\bk\u0010lJ\u001b\u0010m\u001a\u00020\u001f2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\n¢\u0006\u0004\bm\u0010!J\u0015\u0010o\u001a\u00020\u001f2\u0006\u0010n\u001a\u00020^¢\u0006\u0004\bo\u0010lJ\r\u0010p\u001a\u00020\u001f¢\u0006\u0004\bp\u0010qJ#\u0010t\u001a\u00020\u001f2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010s\u001a\u00020\u000f¢\u0006\u0004\bt\u0010uJ\u0015\u0010w\u001a\u00020\u001f2\u0006\u0010b\u001a\u00020v¢\u0006\u0004\bw\u0010xJ\u0015\u0010z\u001a\u00020\u001f2\u0006\u0010b\u001a\u00020y¢\u0006\u0004\bz\u0010{J#\u0010|\u001a\u00020\u001f2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010s\u001a\u00020\u000f¢\u0006\u0004\b|\u0010uJ\u0017\u0010~\u001a\u0004\u0018\u00010}2\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b~\u0010\u007fJ\u0019\u0010\u0081\u0001\u001a\u00020\u001f2\u0007\u0010\u0080\u0001\u001a\u00020}¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0019\u0010\u0083\u0001\u001a\u00020\u001f2\u0007\u0010\u0080\u0001\u001a\u00020}¢\u0006\u0006\b\u0083\u0001\u0010\u0082\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u001f2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001f\u0010\u0089\u0001\u001a\u00020\u001f2\u000e\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010\n¢\u0006\u0005\b\u0089\u0001\u0010!J \u0010\u008b\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u0002062\u0006\u0010\"\u001a\u00020\u001b¢\u0006\u0005\b\u008b\u0001\u0010:J\u0010\u0010\u008c\u0001\u001a\u00020%¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001a\u0010\u008e\u0001\u001a\u00020\u001f2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u0087\u0001J+\u0010\u0091\u0001\u001a\u00020\u001f2\u0019\u0010\u0090\u0001\u001a\u0014\u0012\u0007\u0012\u0005\u0018\u00010\u008f\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u008f\u00010+¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0019\u0010\u0091\u0001\u001a\u00020\u001f2\u0007\u0010b\u001a\u00030\u0093\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0094\u0001J\u0019\u0010\u0096\u0001\u001a\u00020\u001f2\u0007\u0010\u0095\u0001\u001a\u00020%¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0019\u0010\u0099\u0001\u001a\u00020\u001f2\u0007\u0010\u0098\u0001\u001a\u00020%¢\u0006\u0006\b\u0099\u0001\u0010\u0097\u0001J\u001a\u0010\u009c\u0001\u001a\u00020\u001f2\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0017\u0010\u009e\u0001\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020\u000f¢\u0006\u0005\b\u009e\u0001\u0010]J\u0017\u0010\u009f\u0001\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001b¢\u0006\u0005\b\u009f\u0001\u0010$J\u0017\u0010 \u0001\u001a\u00020\u001f2\u0006\u0010?\u001a\u000206¢\u0006\u0005\b \u0001\u0010<J\u001a\u0010£\u0001\u001a\u00020\u001f2\b\u0010¢\u0001\u001a\u00030¡\u0001¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0019\u0010¦\u0001\u001a\u00020\u001f2\u0007\u0010¥\u0001\u001a\u00020\u0006¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001a\u0010ª\u0001\u001a\u00020\u001f2\b\u0010©\u0001\u001a\u00030¨\u0001¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0012\u0010¬\u0001\u001a\u0004\u0018\u000106¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0019\u0010®\u0001\u001a\u00020\u001f2\b\u00107\u001a\u0004\u0018\u000106¢\u0006\u0005\b®\u0001\u0010<J\u0019\u0010¯\u0001\u001a\u00020\u001f2\b\u0010S\u001a\u0004\u0018\u00010\u0002¢\u0006\u0005\b¯\u0001\u00105J\u000f\u0010°\u0001\u001a\u00020\u001f¢\u0006\u0005\b°\u0001\u0010qJ\u000f\u0010±\u0001\u001a\u00020\u001f¢\u0006\u0005\b±\u0001\u0010qJ\u0019\u0010³\u0001\u001a\u00020\u001f2\u0007\u0010²\u0001\u001a\u00020%¢\u0006\u0006\b³\u0001\u0010\u0097\u0001J\u0019\u0010µ\u0001\u001a\u00020\u001f2\u0007\u0010´\u0001\u001a\u00020%¢\u0006\u0006\bµ\u0001\u0010\u0097\u0001J\u000f\u0010¶\u0001\u001a\u00020\u001f¢\u0006\u0005\b¶\u0001\u0010qJ\u000f\u0010·\u0001\u001a\u00020\u001f¢\u0006\u0005\b·\u0001\u0010qJ'\u0010¸\u0001\u001a\u00020\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0005\b¸\u0001\u0010(J\u000f\u0010¹\u0001\u001a\u00020\u001f¢\u0006\u0005\b¹\u0001\u0010qJ\u001c\u0010¼\u0001\u001a\u00020\u001f2\b\u0010»\u0001\u001a\u00030º\u0001H\u0002¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u001a\u0010¾\u0001\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u001bH\u0002¢\u0006\u0006\b¾\u0001\u0010¿\u0001J#\u0010À\u0001\u001a\u00020\u001f2\u0007\u0010\u0080\u0001\u001a\u00020}2\u0006\u0010S\u001a\u00020\u0002H\u0002¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J'\u0010Ä\u0001\u001a\u00030\u0084\u00012\b\u0010Â\u0001\u001a\u00030\u0084\u00012\b\u0010Ã\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u0019\u0010Æ\u0001\u001a\u00020\u001f2\u0006\u0010U\u001a\u00020\u0002H\u0002¢\u0006\u0005\bÆ\u0001\u00105J\"\u0010&\u001a\u00020\u001b2\u0007\u0010Ç\u0001\u001a\u00020\u001b2\u0007\u0010È\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\b&\u0010É\u0001J4\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\r\u0010Ê\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\r\u0010Ë\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0\nH\u0002¢\u0006\u0005\b&\u0010Ì\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u001d\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0004\u0010Í\u0001\u001a\u0006\bÐ\u0001\u0010Ï\u0001R\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010Ñ\u0001R'\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\b0\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010Ñ\u0001R!\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010Ñ\u0001R!\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010Ñ\u0001R\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010Ò\u0001R\u001a\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\u000f\n\u0005\b\u0012\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010Ö\u0001R\u001f\u0010×\u0001\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b×\u0001\u0010Í\u0001\u001a\u0006\bØ\u0001\u0010Ï\u0001R \u0010Ú\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R1\u0010Ý\u0001\u001a\u001c\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00020Ü\u00010\b0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010Û\u0001R$\u0010Þ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\n0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010Û\u0001R$\u0010ß\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\n0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0001\u0010Û\u0001R\u001e\u0010à\u0001\u001a\t\u0012\u0004\u0012\u00020%0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010Û\u0001R$\u0010á\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\n0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0001\u0010Û\u0001R$\u0010â\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\n0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010Û\u0001R$\u0010ã\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\n0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bã\u0001\u0010Û\u0001R\u001e\u0010ä\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010Û\u0001R$\u0010å\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bå\u0001\u0010Û\u0001R\u001f\u0010æ\u0001\u001a\n\u0012\u0005\u0012\u00030¨\u00010Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010Û\u0001R0\u0010è\u0001\u001a\u001b\u0012\u0016\u0012\u0014\u0012\t\u0012\u00070\u0002j\u0003`ç\u0001\u0012\u0005\u0012\u00030\u0084\u00010\b0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bè\u0001\u0010Û\u0001R\u001e\u0010é\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010Û\u0001R$\u0010ê\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0\n0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bê\u0001\u0010Û\u0001R!\u0010ë\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u008f\u00010Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010Û\u0001R\u001e\u0010ì\u0001\u001a\t\u0012\u0004\u0012\u00020%0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bì\u0001\u0010Û\u0001R\u001e\u0010í\u0001\u001a\t\u0012\u0004\u0012\u00020%0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bí\u0001\u0010Û\u0001R\u001f\u0010î\u0001\u001a\n\u0012\u0005\u0012\u00030¡\u00010Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bî\u0001\u0010Û\u0001R\u001d\u0010ï\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0001\u0010Ñ\u0001R\u0019\u0010ð\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R\u001e\u0010ò\u0001\u001a\t\u0012\u0004\u0012\u00020%0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0001\u0010Û\u0001R\u001b\u0010ó\u0001\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bó\u0001\u0010ô\u0001R\u001b\u0010õ\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010Í\u0001R+\u0010÷\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00020Ü\u00010ö\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b÷\u0001\u0010ø\u0001R$\u0010ù\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020}0ö\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bù\u0001\u0010ø\u0001R$\u0010û\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020%0ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bû\u0001\u0010ü\u0001R#\u0010ý\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\n0\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\bý\u0001\u0010Ñ\u0001R#\u0010þ\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\n0\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\bþ\u0001\u0010Ñ\u0001R!\u0010\u0084\u0002\u001a\u00030ÿ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0080\u0002\u0010\u0081\u0002\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R'\u0010\u0085\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0085\u0002\u0010Ñ\u0001\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R7\u0010\u0088\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\b0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0088\u0002\u0010Ñ\u0001\u001a\u0006\b\u0089\u0002\u0010\u0087\u0002R)\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\n0\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u001e\u0010Ñ\u0001\u001a\u0006\b\u008a\u0002\u0010\u0087\u0002R)\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\n0\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bQ\u0010Ñ\u0001\u001a\u0006\b\u008b\u0002\u0010\u0087\u0002R&\u0010\u008d\u0002\u001a\t\u0012\u0005\u0012\u00030\u008c\u00020\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008d\u0002\u0010Ñ\u0001\u001a\u0006\b\u008e\u0002\u0010\u0087\u0002R#\u0010s\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bs\u0010Ñ\u0001\u001a\u0006\b\u008f\u0002\u0010\u0087\u0002R)\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\br\u0010Ñ\u0001\u001a\u0006\b\u0090\u0002\u0010\u0087\u0002R&\u0010\u0091\u0002\u001a\t\u0012\u0005\u0012\u00030¨\u00010\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0091\u0002\u0010Ñ\u0001\u001a\u0006\b\u0092\u0002\u0010\u0087\u0002R,\u0010\u0088\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00010\n0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010Ñ\u0001\u001a\u0006\b\u0093\u0002\u0010\u0087\u0002R(\u0010\u0085\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0084\u00010\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010Ñ\u0001\u001a\u0006\b\u0094\u0002\u0010\u0087\u0002R%\u0010\u0095\u0002\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0095\u0002\u0010Ñ\u0001\u001a\u0006\b\u0096\u0002\u0010\u0087\u0002R%\u0010\u0097\u0002\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0097\u0002\u0010Ñ\u0001\u001a\u0006\b\u0098\u0002\u0010\u0087\u0002R)\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0\n0\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b_\u0010Ñ\u0001\u001a\u0006\b\u0099\u0002\u0010\u0087\u0002R&\u0010\u009a\u0002\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009a\u0002\u0010Ñ\u0001\u001a\u0006\b\u009b\u0002\u0010\u0087\u0002R%\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010Ñ\u0001\u001a\u0006\b\u009c\u0002\u0010\u0087\u0002R%\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010Ñ\u0001\u001a\u0006\b\u009d\u0002\u0010\u0087\u0002R%\u0010\u009e\u0002\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009e\u0002\u0010Ñ\u0001\u001a\u0006\b\u009f\u0002\u0010\u0087\u0002R%\u0010 \u0002\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b \u0002\u0010Ñ\u0001\u001a\u0006\b¡\u0002\u0010\u0087\u0002R%\u0010¢\u0002\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¢\u0002\u0010Ñ\u0001\u001a\u0006\b£\u0002\u0010\u0087\u0002R%\u0010¤\u0002\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¤\u0002\u0010Ñ\u0001\u001a\u0006\b¥\u0002\u0010\u0087\u0002R%\u0010¦\u0002\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¦\u0002\u0010Ñ\u0001\u001a\u0006\b§\u0002\u0010\u0087\u0002R&\u0010¨\u0002\u001a\t\u0012\u0005\u0012\u00030¡\u00010\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¨\u0002\u0010Ñ\u0001\u001a\u0006\b©\u0002\u0010\u0087\u0002R%\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010Ñ\u0001\u001a\u0006\bª\u0002\u0010\u0087\u0002R'\u0010«\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b«\u0002\u0010Ñ\u0001\u001a\u0006\b¬\u0002\u0010\u0087\u0002R+\u0010\u00ad\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0002\u0010Ñ\u0001\u001a\u0006\b®\u0002\u0010\u0087\u0002R'\u0010¯\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¯\u0002\u0010Ñ\u0001\u001a\u0006\b°\u0002\u0010\u0087\u0002R\u0017\u0010²\u0001\u001a\u00020%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b±\u0002\u0010\u008d\u0001¨\u0006´\u0002"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "", "channelType", "channelId", "Lec3/f2;", "Lio/getstream/chat/android/models/User;", "currentUser", "", "latestUsers", "", "Lio/getstream/chat/android/models/Mute;", "mutedUsers", "Lio/getstream/chat/android/models/Location;", "liveLocations", "", "messageLimit", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;", "paginationManager", "Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;", "attachmentUrlValidator", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Ljava/lang/Integer;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;)V", "Lio/getstream/chat/android/models/Channel;", "toChannel", "()Lio/getstream/chat/android/models/Channel;", "id", "Lio/getstream/chat/android/models/Message;", "getMessageById", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;", "messages", "Ll83/a0;", "setMessages", "(Ljava/util/List;)V", "message", "upsertMessage", "(Lio/getstream/chat/android/models/Message;)V", "", "preserveAttachmentUrls", "upsertMessages", "(Ljava/util/List;Z)V", "upsertCachedMessage", "updateMessage", "Lkotlin/Function1;", "transform", "updateMessageById", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "eventMessage", "Lkotlin/Function2;", "enrich", "updateMessageFromEvent", "(Lio/getstream/chat/android/models/Message;Lc93/m;)V", "deleteMessage", "(Ljava/lang/String;)V", "Ljava/util/Date;", HttpHeaders.DATE, "systemMessage", "removeMessagesBefore", "(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V", "hideMessagesBefore", "(Ljava/util/Date;)V", "userId", "hard", "deletedAt", "deleteMessagesFromUser", "(Ljava/lang/String;ZLjava/util/Date;)V", "getOldestMessage", "()Lio/getstream/chat/android/models/Message;", "setLocalOnlyMessages", "setPendingMessages", "removePendingMessage", "setRepliedMessage", "quotedMessageId", "quotingMessageId", "addQuotedMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "quotedMessage", "updateQuotedMessageReferences", "deleteQuotedMessageReferences", "pinnedMessage", "addPinnedMessage", "pinnedMessages", "addPinnedMessages", "messageId", "deletePinnedMessage", "memberId", "banned", "expiry", "shadow", "updateMemberBan", "(Ljava/lang/String;ZLjava/util/Date;Z)V", "count", "setMemberCount", "(I)V", "Lio/getstream/chat/android/models/Member;", QueryChannelRequest.KEY_MEMBERS, "setMembers", "Lio/getstream/chat/android/client/events/MemberAddedEvent;", NotificationCompat.CATEGORY_EVENT, "addMember", "(Lio/getstream/chat/android/client/events/MemberAddedEvent;)V", "Lio/getstream/chat/android/client/events/MemberRemovedEvent;", "removeMember", "(Lio/getstream/chat/android/client/events/MemberRemovedEvent;)V", "Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;", "(Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;)V", "member", "upsertMember", "(Lio/getstream/chat/android/models/Member;)V", "upsertMembers", "membership", "setMembership", "deleteMembership", "()V", "watchers", "watcherCount", "setWatchers", "(Ljava/util/List;I)V", "Lio/getstream/chat/android/client/events/UserStartWatchingEvent;", "addWatcher", "(Lio/getstream/chat/android/client/events/UserStartWatchingEvent;)V", "Lio/getstream/chat/android/client/events/UserStopWatchingEvent;", "removeWatcher", "(Lio/getstream/chat/android/client/events/UserStopWatchingEvent;)V", "upsertWatchers", "Lio/getstream/chat/android/models/Poll;", "getPoll", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;", "poll", "upsertPoll", "(Lio/getstream/chat/android/models/Poll;)V", "deletePoll", "Lio/getstream/chat/android/models/ChannelUserRead;", "read", "updateRead", "(Lio/getstream/chat/android/models/ChannelUserRead;)V", "reads", "updateReads", "eventReceivedDate", "updateCurrentUserRead", "markRead", "()Z", "updateDelivered", "Lio/getstream/chat/android/models/ChannelData;", "update", "updateChannelData", "(Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/client/events/HasChannel;", "(Lio/getstream/chat/android/client/events/HasChannel;)V", "hidden", "setHidden", "(Z)V", "muted", "setMuted", "Lio/getstream/chat/android/models/PushPreference;", "preference", "setPushPreference", "(Lio/getstream/chat/android/models/PushPreference;)V", "setMessageCount", "updateLastMessageAt", "deleteChannel", "Lio/getstream/chat/android/models/Config;", "config", "setChannelConfig", "(Lio/getstream/chat/android/models/Config;)V", UserState.Sources.USER, "upsertUserPresence", "(Lio/getstream/chat/android/models/User;)V", "Lio/getstream/chat/android/models/TypingEvent;", "typingEvent", "setTyping", "(Lio/getstream/chat/android/models/TypingEvent;)V", "getLastStartTypingEvent", "()Ljava/util/Date;", "setLastStartTypingEvent", "setKeystrokeParentMessageId", "trimOldestMessages", "trimNewestMessages", "recoveryNeeded", "setRecoveryNeeded", "insideSearch", "setInsideSearch", "cacheLatestMessages", "clearCachedLatestMessages", "upsertCachedLatestMessages", "destroy", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$TrimDirection;", "direction", "applyMessageLimitIfNeeded", "(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$TrimDirection;)V", "shouldIgnoreUpsertion", "(Lio/getstream/chat/android/models/Message;)Z", "registerPollForMessage", "(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;)V", "localRead", "serverRead", "mergeCurrentUserRead", "(Lio/getstream/chat/android/models/ChannelUserRead;Lio/getstream/chat/android/models/ChannelUserRead;)Lio/getstream/chat/android/models/ChannelUserRead;", "deleteMemberAndDecrementMemberCount", "newMessage", "oldMessage", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;", "newMessages", "oldMessages", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Ljava/lang/String;", "getChannelType", "()Ljava/lang/String;", "getChannelId", "Lec3/f2;", "Ljava/lang/Integer;", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;", "getPaginationManager", "()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;", "Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;", "cid", "getCid", "Lec3/p1;", "_repliedMessage", "Lec3/p1;", "", "_quotedMessagesMap", "_messages", "localOnlyMessages", "_pendingEnabled", "_pendingMessages", "_cachedLatestMessages", "_pinnedMessages", "_watcherCount", "_watchers", "_typing", "Lio/getstream/chat/android/models/UserId;", "_reads", "_memberCount", "_members", "_channelData", "_hidden", "_muted", "_channelConfig", "_loading", "_recoveryNeeded", "Z", "_insideSearch", "lastStartTypingEvent", "Ljava/util/Date;", "keystrokeParentMessageId", "Ljava/util/concurrent/ConcurrentHashMap;", "messagesWithPolls", "Ljava/util/concurrent/ConcurrentHashMap;", "polls", "La0/a0;", "processedMessageIds", "La0/a0;", "localOnlyMessagesInRange", "pendingMessagesInRange", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "repliedMessage", "getRepliedMessage", "()Lec3/f2;", "quotedMessagesMap", "getQuotedMessagesMap", "getMessages", "getPinnedMessages", "Lio/getstream/chat/android/models/MessagesState;", "messagesState", "getMessagesState", "getWatcherCount", "getWatchers", "typing", "getTyping", "getReads", "getRead", "unreadCount", "getUnreadCount", "membersCount", "getMembersCount", "getMembers", "channelData", "getChannelData", "getHidden", "getMuted", "loading", "getLoading", "loadingOlderMessages", "getLoadingOlderMessages", "loadingNewerMessages", "getLoadingNewerMessages", "endOfOlderMessages", "getEndOfOlderMessages", "endOfNewerMessages", "getEndOfNewerMessages", "channelConfig", "getChannelConfig", "getInsideSearch", "lastSentMessageDate", "getLastSentMessageDate", "activeLiveLocations", "getActiveLiveLocations", "messageCount", "getMessageCount", "getRecoveryNeeded", "Companion", "TrimDirection", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelStateImpl implements ChannelState {
    private static final int CACHED_LATEST_MESSAGES_LIMIT = 25;
    private static final Companion Companion = new Companion();
    private static final Comparator<Message> MESSAGE_COMPARATOR = new ChannelStateImpl$special$$inlined$compareBy$1();
    private static final int TRIM_BUFFER = 30;
    private final InterfaceC13075p1 _cachedLatestMessages;
    private final InterfaceC13075p1 _channelConfig;
    private final InterfaceC13075p1 _channelData;
    private final InterfaceC13075p1 _hidden;
    private final InterfaceC13075p1 _insideSearch;
    private final InterfaceC13037f2 _loading;
    private final InterfaceC13075p1 _memberCount;
    private final InterfaceC13075p1 _members;
    private final InterfaceC13075p1 _messages;
    private final InterfaceC13075p1 _muted;
    private final InterfaceC13075p1 _pendingEnabled;
    private final InterfaceC13075p1 _pendingMessages;
    private final InterfaceC13075p1 _pinnedMessages;
    private final InterfaceC13075p1 _quotedMessagesMap;
    private final InterfaceC13075p1 _reads;
    private boolean _recoveryNeeded;
    private final InterfaceC13075p1 _repliedMessage;
    private final InterfaceC13075p1 _typing;
    private final InterfaceC13075p1 _watcherCount;
    private final InterfaceC13075p1 _watchers;
    private final InterfaceC13037f2 activeLiveLocations;
    private final AttachmentUrlValidator attachmentUrlValidator;
    private final InterfaceC13037f2 channelConfig;
    private final InterfaceC13037f2 channelData;
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final InterfaceC13037f2 currentUser;
    private final InterfaceC13037f2 endOfNewerMessages;
    private final InterfaceC13037f2 endOfOlderMessages;
    private final InterfaceC13037f2 hidden;
    private final InterfaceC13037f2 insideSearch;
    private String keystrokeParentMessageId;
    private final InterfaceC13037f2 lastSentMessageDate;
    private Date lastStartTypingEvent;
    private final InterfaceC13037f2 latestUsers;
    private final InterfaceC13037f2 liveLocations;
    private final InterfaceC13037f2 loading;
    private final InterfaceC13037f2 loadingNewerMessages;
    private final InterfaceC13037f2 loadingOlderMessages;
    private final InterfaceC13075p1 localOnlyMessages;
    private final InterfaceC13037f2 localOnlyMessagesInRange;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC13037f2 members;
    private final InterfaceC13037f2 membersCount;
    private final InterfaceC13037f2 messageCount;
    private final Integer messageLimit;
    private final InterfaceC13037f2 messages;
    private final InterfaceC13037f2 messagesState;
    private final ConcurrentHashMap<String, Set<String>> messagesWithPolls;
    private final InterfaceC13037f2 muted;
    private final InterfaceC13037f2 mutedUsers;
    private final MessagesPaginationManager paginationManager;
    private final InterfaceC13037f2 pendingMessagesInRange;
    private final InterfaceC13037f2 pinnedMessages;
    private final ConcurrentHashMap<String, Poll> polls;
    private final C0005a0 processedMessageIds;
    private final InterfaceC13037f2 quotedMessagesMap;
    private final InterfaceC13037f2 read;
    private final InterfaceC13037f2 reads;
    private final InterfaceC13037f2 repliedMessage;
    private final InterfaceC13037f2 typing;
    private final InterfaceC13037f2 unreadCount;
    private final InterfaceC13037f2 watcherCount;
    private final InterfaceC13037f2 watchers;

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$Companion;", "", "<init>", "()V", "CACHED_LATEST_MESSAGES_LIMIT", "", "TRIM_BUFFER", "MESSAGE_COMPARATOR", "Ljava/util/Comparator;", "Lio/getstream/chat/android/models/Message;", "Lkotlin/Comparator;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl$TrimDirection;", "", "<init>", "(Ljava/lang/String;I)V", "FROM_OLDEST", "FROM_NEWEST", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public enum TrimDirection {
        FROM_OLDEST,
        FROM_NEWEST;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrimDirection.values().length];
            try {
                iArr[TrimDirection.FROM_OLDEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrimDirection.FROM_NEWEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ChannelStateImpl(String channelType, String channelId, InterfaceC13037f2 currentUser, InterfaceC13037f2 latestUsers, InterfaceC13037f2 mutedUsers, InterfaceC13037f2 liveLocations, Integer num, MessagesPaginationManager paginationManager, AttachmentUrlValidator attachmentUrlValidator) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(currentUser, "currentUser");
        AbstractC22676k.m65750j(latestUsers, "latestUsers");
        AbstractC22676k.m65750j(mutedUsers, "mutedUsers");
        AbstractC22676k.m65750j(liveLocations, "liveLocations");
        AbstractC22676k.m65750j(paginationManager, "paginationManager");
        AbstractC22676k.m65750j(attachmentUrlValidator, "attachmentUrlValidator");
        this.channelType = channelType;
        this.channelId = channelId;
        this.currentUser = currentUser;
        this.latestUsers = latestUsers;
        this.mutedUsers = mutedUsers;
        this.liveLocations = liveLocations;
        this.messageLimit = num;
        this.paginationManager = paginationManager;
        this.attachmentUrlValidator = attachmentUrlValidator;
        this.cid = AbstractC18489d0.m53370k(channelType, ":", channelId);
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this._repliedMessage = c13045h2M36593c;
        C25272z c25272z = C25272z.f99163w;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(c25272z);
        this._quotedMessagesMap = c13045h2M36593c2;
        C25271y c25271y = C25271y.f99162w;
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c(c25271y);
        this._messages = c13045h2M36593c3;
        C13045h2 c13045h2M36593c4 = AbstractC13091v.m36593c(c25271y);
        this.localOnlyMessages = c13045h2M36593c4;
        Boolean bool = Boolean.FALSE;
        C13045h2 c13045h2M36593c5 = AbstractC13091v.m36593c(bool);
        this._pendingEnabled = c13045h2M36593c5;
        C13045h2 c13045h2M36593c6 = AbstractC13091v.m36593c(c25271y);
        this._pendingMessages = c13045h2M36593c6;
        this._cachedLatestMessages = AbstractC13091v.m36593c(c25271y);
        C13045h2 c13045h2M36593c7 = AbstractC13091v.m36593c(c25271y);
        this._pinnedMessages = c13045h2M36593c7;
        C13045h2 c13045h2M36593c8 = AbstractC13091v.m36593c(0);
        this._watcherCount = c13045h2M36593c8;
        C13045h2 c13045h2M36593c9 = AbstractC13091v.m36593c(c25271y);
        this._watchers = c13045h2M36593c9;
        C13045h2 c13045h2M36593c10 = AbstractC13091v.m36593c(new TypingEvent(channelId, c25271y));
        this._typing = c13045h2M36593c10;
        C13045h2 c13045h2M36593c11 = AbstractC13091v.m36593c(c25272z);
        this._reads = c13045h2M36593c11;
        C13045h2 c13045h2M36593c12 = AbstractC13091v.m36593c(0);
        this._memberCount = c13045h2M36593c12;
        C13045h2 c13045h2M36593c13 = AbstractC13091v.m36593c(c25271y);
        this._members = c13045h2M36593c13;
        C13045h2 c13045h2M36593c14 = AbstractC13091v.m36593c(null);
        this._channelData = c13045h2M36593c14;
        C13045h2 c13045h2M36593c15 = AbstractC13091v.m36593c(bool);
        this._hidden = c13045h2M36593c15;
        C13045h2 c13045h2M36593c16 = AbstractC13091v.m36593c(bool);
        this._muted = c13045h2M36593c16;
        C13045h2 c13045h2M36593c17 = AbstractC13091v.m36593c(new Config(null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, 0, null, null, null, null, false, false, false, 67108863, null));
        this._channelConfig = c13045h2M36593c17;
        InterfaceC13037f2 interfaceC13037f2MapState = DerivedStateFlowKt.mapState(paginationManager.getState(), new C22693x() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl$_loading$1
            @Override // p715kotlin.jvm.internal.C22693x, j93.InterfaceC21490w
            public final Object get(Object obj) {
                return Boolean.valueOf(((MessagesPaginationState) obj).isLoadingMessages());
            }
        });
        this._loading = interfaceC13037f2MapState;
        C13045h2 c13045h2M36593c18 = AbstractC13091v.m36593c(bool);
        this._insideSearch = c13045h2M36593c18;
        this.messagesWithPolls = new ConcurrentHashMap<>();
        this.polls = new ConcurrentHashMap<>();
        this.processedMessageIds = new C0005a0(100);
        InterfaceC13037f2 interfaceC13037f2CombineStates = DerivedStateFlowKt.combineStates(c13045h2M36593c4, paginationManager.getState(), new C19054d(12));
        this.localOnlyMessagesInRange = interfaceC13037f2CombineStates;
        InterfaceC13037f2 interfaceC13037f2CombineStates2 = DerivedStateFlowKt.combineStates(c13045h2M36593c5, c13045h2M36593c6, paginationManager.getState(), new C15786e(11));
        this.pendingMessagesInRange = interfaceC13037f2CombineStates2;
        this.logger = AbstractC1772c1.m5382S(this, "ChannelStateImpl");
        this.repliedMessage = AbstractC13091v.m36598h(c13045h2M36593c);
        this.quotedMessagesMap = DerivedStateFlowKt.mapState(c13045h2M36593c2, new C19031a(25));
        InterfaceC13037f2 interfaceC13037f2CombineStates3 = DerivedStateFlowKt.combineStates(c13045h2M36593c3, interfaceC13037f2CombineStates2, interfaceC13037f2CombineStates, new C15786e(12));
        this.messages = interfaceC13037f2CombineStates3;
        this.pinnedMessages = AbstractC13091v.m36598h(c13045h2M36593c7);
        this.messagesState = DerivedStateFlowKt.combineStates(interfaceC13037f2MapState, interfaceC13037f2CombineStates3, new C19054d(8));
        this.watcherCount = AbstractC13091v.m36598h(c13045h2M36593c8);
        this.watchers = DerivedStateFlowKt.combineStates(c13045h2M36593c9, latestUsers, new C19054d(9));
        this.typing = AbstractC13091v.m36598h(c13045h2M36593c10);
        this.reads = DerivedStateFlowKt.mapState(c13045h2M36593c11, new C19031a(26));
        InterfaceC13037f2 interfaceC13037f2CombineStates4 = DerivedStateFlowKt.combineStates(c13045h2M36593c11, currentUser, new C19054d(10));
        this.read = interfaceC13037f2CombineStates4;
        this.unreadCount = DerivedStateFlowKt.mapState(interfaceC13037f2CombineStates4, new C19031a(27));
        this.membersCount = AbstractC13091v.m36598h(c13045h2M36593c12);
        this.members = DerivedStateFlowKt.combineStates(c13045h2M36593c13, latestUsers, new C19054d(11));
        final int i13 = 0;
        this.channelData = DerivedStateFlowKt.combineStates(c13045h2M36593c14, latestUsers, new InterfaceC4351m(this) { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelStateImpl f73906x;

            {
                this.f73906x = this;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i13) {
                    case 0:
                        return ChannelStateImpl.channelData$lambda$15(this.f73906x, (ChannelData) obj, (Map) obj2);
                    default:
                        return ChannelStateImpl.lastSentMessageDate$lambda$17(this.f73906x, (Config) obj, (List) obj2);
                }
            }
        });
        this.hidden = AbstractC13091v.m36598h(c13045h2M36593c15);
        this.muted = AbstractC13091v.m36598h(c13045h2M36593c16);
        this.loading = interfaceC13037f2MapState;
        this.loadingOlderMessages = DerivedStateFlowKt.mapState(paginationManager.getState(), new C22693x() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl$loadingOlderMessages$1
            @Override // p715kotlin.jvm.internal.C22693x, j93.InterfaceC21490w
            public final Object get(Object obj) {
                return Boolean.valueOf(((MessagesPaginationState) obj).isLoadingPreviousMessages());
            }
        });
        this.loadingNewerMessages = DerivedStateFlowKt.mapState(paginationManager.getState(), new C22693x() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl$loadingNewerMessages$1
            @Override // p715kotlin.jvm.internal.C22693x, j93.InterfaceC21490w
            public final Object get(Object obj) {
                return Boolean.valueOf(((MessagesPaginationState) obj).isLoadingNextMessages());
            }
        });
        this.endOfOlderMessages = DerivedStateFlowKt.mapState(paginationManager.getState(), new C22693x() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl$endOfOlderMessages$1
            @Override // p715kotlin.jvm.internal.C22693x, j93.InterfaceC21490w
            public final Object get(Object obj) {
                return Boolean.valueOf(((MessagesPaginationState) obj).getHasLoadedAllPreviousMessages());
            }
        });
        this.endOfNewerMessages = DerivedStateFlowKt.mapState(paginationManager.getState(), new C22693x() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl$endOfNewerMessages$1
            @Override // p715kotlin.jvm.internal.C22693x, j93.InterfaceC21490w
            public final Object get(Object obj) {
                return Boolean.valueOf(((MessagesPaginationState) obj).getHasLoadedAllNextMessages());
            }
        });
        C13081r1 c13081r1M36598h = AbstractC13091v.m36598h(c13045h2M36593c17);
        this.channelConfig = c13081r1M36598h;
        this.insideSearch = AbstractC13091v.m36598h(c13045h2M36593c18);
        final int i14 = 1;
        this.lastSentMessageDate = DerivedStateFlowKt.combineStates(c13081r1M36598h, interfaceC13037f2CombineStates3, new InterfaceC4351m(this) { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelStateImpl f73906x;

            {
                this.f73906x = this;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i14) {
                    case 0:
                        return ChannelStateImpl.channelData$lambda$15(this.f73906x, (ChannelData) obj, (Map) obj2);
                    default:
                        return ChannelStateImpl.lastSentMessageDate$lambda$17(this.f73906x, (Config) obj, (List) obj2);
                }
            }
        });
        this.activeLiveLocations = DerivedStateFlowKt.mapState(liveLocations, new C17095c(this, 21));
        this.messageCount = DerivedStateFlowKt.mapState(c13045h2M36593c14, new C19031a(24));
    }

    private static final List activeLiveLocations$lambda$19(ChannelStateImpl channelStateImpl, List locations) {
        AbstractC22676k.m65750j(locations, "locations");
        ArrayList arrayList = new ArrayList();
        for (Object obj : locations) {
            if (AbstractC22676k.m65745e(((Location) obj).getCid(), channelStateImpl.cid)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message addPinnedMessages$lambda$115$lambda$114(ChannelStateImpl channelStateImpl, Message message, Message old) {
        AbstractC22676k.m65750j(old, "old");
        return channelStateImpl.attachmentUrlValidator.updateValidAttachmentsUrl$stream_chat_android_client_release(message, old);
    }

    private final void applyMessageLimitIfNeeded(TrimDirection direction) {
        C13045h2 c13045h2;
        Object value;
        C13045h2 c13045h3;
        Object value2;
        Integer num = this.messageLimit;
        if (num != null) {
            int iIntValue = num.intValue();
            if (((List) ((C13045h2) this._messages).getValue()).size() <= iIntValue + 30) {
                return;
            }
            int i13 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
            if (i13 == 1) {
                InterfaceC13075p1 interfaceC13075p1 = this._messages;
                do {
                    c13045h2 = (C13045h2) interfaceC13075p1;
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, AbstractC25265s.m74158x1(iIntValue, (List) value)));
                this.paginationManager.setEndOfOlderMessages(false);
                this.paginationManager.setOldestMessage((Message) AbstractC25265s.m74100H0((List) ((C13045h2) this._messages).getValue()));
                return;
            }
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cacheLatestMessages();
            InterfaceC13075p1 interfaceC13075p2 = this._messages;
            do {
                c13045h3 = (C13045h2) interfaceC13075p2;
                value2 = c13045h3.getValue();
            } while (!c13045h3.m36569i(value2, AbstractC25265s.m74156w1((List) value2, iIntValue)));
            this.paginationManager.setEndOfNewerMessages(false);
            this.paginationManager.setNewestMessage((Message) AbstractC25265s.m74114R0((List) ((C13045h2) this._messages).getValue()));
            InterfaceC13075p1 interfaceC13075p3 = this._insideSearch;
            Boolean bool = Boolean.TRUE;
            C13045h2 c13045h4 = (C13045h2) interfaceC13075p3;
            c13045h4.getClass();
            c13045h4.m36571k(null, bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData channelData$lambda$15(ChannelStateImpl channelStateImpl, ChannelData channelData, Map users) {
        AbstractC22676k.m65750j(users, "users");
        if (channelData == null) {
            return new ChannelData(channelStateImpl.channelId, channelStateImpl.channelType, null, null, null, 0, false, null, null, null, 0, null, null, null, null, null, null, null, null, null, 1048572, null);
        }
        User createdBy = (User) users.get(channelData.getCreatedBy().getId());
        if (createdBy == null) {
            createdBy = channelData.getCreatedBy();
        }
        return ChannelData.copy$default(channelData, null, null, null, null, createdBy, 0, false, null, null, null, 0, null, null, null, null, null, null, null, null, null, 1048559, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData deleteChannel$lambda$149(Date date, ChannelData channelData) {
        if (channelData != null) {
            return ChannelData.copy$default(channelData, null, null, null, null, null, 0, false, null, null, date, 0, null, null, null, null, null, null, null, null, null, 1048063, null);
        }
        return null;
    }

    private final void deleteMemberAndDecrementMemberCount(String memberId) {
        C13045h2 c13045h2;
        Object value;
        ArrayList arrayList;
        C13045h2 c13045h3;
        Object value2;
        InterfaceC13075p1 interfaceC13075p1 = this._members;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                if (!AbstractC22676k.m65745e(((Member) obj).getUserId(), memberId)) {
                    arrayList.add(obj);
                }
            }
        } while (!c13045h2.m36569i(value, arrayList));
        InterfaceC13075p1 interfaceC13075p2 = this._memberCount;
        do {
            c13045h3 = (C13045h2) interfaceC13075p2;
            value2 = c13045h3.getValue();
        } while (!c13045h3.m36569i(value2, Integer.valueOf(Math.max(0, ((Number) value2).intValue() - 1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData deleteMembership$lambda$129(ChannelData channelData) {
        if (channelData != null) {
            return ChannelData.copy$default(channelData, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, null, null, null, null, null, null, 1032191, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ ArrayList m54816e(List list, Map map) {
        return (ArrayList) watchers$lambda$8(list, map);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date lastSentMessageDate$lambda$17(ChannelStateImpl channelStateImpl, Config config, List messages) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(messages, "messages");
        ArrayList arrayList = new ArrayList();
        for (Object obj : messages) {
            String id4 = ((Message) obj).getUser().getId();
            User user = (User) channelStateImpl.currentUser.getValue();
            if (AbstractC22676k.m65745e(id4, user != null ? user.getId() : null)) {
                arrayList.add(obj);
            }
        }
        return MessagesExtensionsKt.lastMessageAt(arrayList, config.getSkipLastMsgUpdateForSystemMsgs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List localOnlyMessagesInRange$lambda$1(List localOnly, MessagesPaginationState pagination) {
        AbstractC22676k.m65750j(localOnly, "localOnly");
        AbstractC22676k.m65750j(pagination, "pagination");
        if (localOnly.isEmpty()) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : localOnly) {
            if (pagination.isInWindow((Message) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ LinkedHashMap m54824m(Map map) {
        return (LinkedHashMap) quotedMessagesMap$lambda$5(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List members$lambda$14(List members, Map users) {
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(users, "users");
        return AbstractC25265s.m74152u1(MemberKt.updateUsers(members, users), new ChannelStateImpl$members$lambda$14$$inlined$sortedBy$1());
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer messageCount$lambda$20(ChannelData channelData) {
        if (channelData != null) {
            return channelData.getMessageCount();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List messages$lambda$6(List regular, List pending, List localOnly) {
        AbstractC22676k.m65750j(regular, "regular");
        AbstractC22676k.m65750j(pending, "pending");
        AbstractC22676k.m65750j(localOnly, "localOnly");
        if (pending.isEmpty() && localOnly.isEmpty()) {
            return regular;
        }
        if (pending.isEmpty()) {
            return ListKt.mergeSorted(localOnly, regular, new C22693x() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl$messages$1$1
                @Override // p715kotlin.jvm.internal.C22693x, j93.InterfaceC21490w
                public final Object get(Object obj) {
                    return ((Message) obj).getId();
                }
            }, MESSAGE_COMPARATOR);
        }
        if (localOnly.isEmpty()) {
            return ListKt.mergeSorted(pending, regular, new C22693x() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl$messages$1$2
                @Override // p715kotlin.jvm.internal.C22693x, j93.InterfaceC21490w
                public final Object get(Object obj) {
                    return ((Message) obj).getId();
                }
            }, MESSAGE_COMPARATOR);
        }
        ChannelStateImpl$messages$1$3 channelStateImpl$messages$1$3 = new C22693x() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl$messages$1$3
            @Override // p715kotlin.jvm.internal.C22693x, j93.InterfaceC21490w
            public final Object get(Object obj) {
                return ((Message) obj).getId();
            }
        };
        Comparator<Message> comparator = MESSAGE_COMPARATOR;
        return ListKt.mergeSorted(ListKt.mergeSorted(pending, localOnly, channelStateImpl$messages$1$3, comparator), regular, new C22693x() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl$messages$1$4
            @Override // p715kotlin.jvm.internal.C22693x, j93.InterfaceC21490w
            public final Object get(Object obj) {
                return ((Message) obj).getId();
            }
        }, comparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessagesState messagesState$lambda$7(boolean z4, List messages) {
        AbstractC22676k.m65750j(messages, "messages");
        if (z4 && messages.isEmpty()) {
            return MessagesState.Loading.INSTANCE;
        }
        return messages.isEmpty() ? MessagesState.OfflineNoResults.INSTANCE : new MessagesState.Result(messages);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List pendingMessagesInRange$lambda$3(boolean z4, List pending, MessagesPaginationState pagination) {
        AbstractC22676k.m65750j(pending, "pending");
        AbstractC22676k.m65750j(pagination, "pagination");
        if (!z4 || pending.isEmpty()) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : pending) {
            if (pagination.isInWindow((Message) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final Message preserveAttachmentUrls(Message newMessage, Message oldMessage) {
        return this.attachmentUrlValidator.updateValidAttachmentsUrl$stream_chat_android_client_release(newMessage, oldMessage);
    }

    private static final Map quotedMessagesMap$lambda$5(Map it) {
        AbstractC22676k.m65750j(it, "it");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(it.size()));
        for (Map.Entry entry : it.entrySet()) {
            linkedHashMap.put(entry.getKey(), AbstractC25265s.m74093D1((Iterable) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelUserRead read$lambda$11(Map reads, User user) {
        String id4;
        AbstractC22676k.m65750j(reads, "reads");
        if (user == null || (id4 = user.getId()) == null) {
            return null;
        }
        return (ChannelUserRead) reads.get(id4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List reads$lambda$9(Map reads) {
        AbstractC22676k.m65750j(reads, "reads");
        return AbstractC25265s.m74152u1(reads.values(), new ChannelStateImpl$reads$lambda$9$$inlined$sortedBy$1());
    }

    private final void registerPollForMessage(Poll poll, String messageId) {
        this.polls.put(poll.getId(), poll);
        Set<String> set = this.messagesWithPolls.get(poll.getId());
        if (set == null) {
            set = C25235a0.f99113w;
        }
        this.messagesWithPolls.put(poll.getId(), AbstractC12350b.m34555D(messageId, set));
    }

    public static /* synthetic */ void removeMessagesBefore$default(ChannelStateImpl channelStateImpl, Date date, Message message, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            message = null;
        }
        channelStateImpl.removeMessagesBefore(date, message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData setMembership$lambda$128(Member member, ChannelData channelData) {
        if (channelData != null) {
            return ChannelData.copy$default(channelData, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, member, null, null, null, null, null, 1032191, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData setMessageCount$lambda$147(int i13, ChannelData channelData) {
        if (channelData != null) {
            return ChannelData.copy$default(channelData, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, null, null, Integer.valueOf(i13), null, null, null, 983039, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData setPushPreference$lambda$146(PushPreference pushPreference, ChannelData channelData) {
        if (channelData != null) {
            return ChannelData.copy$default(channelData, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, null, null, null, pushPreference, null, null, 917503, null);
        }
        return null;
    }

    private final boolean shouldIgnoreUpsertion(Message message) {
        String id4 = message.getUser().getId();
        User user = (User) this.currentUser.getValue();
        boolean zM65745e = AbstractC22676k.m65745e(id4, user != null ? user.getId() : null);
        boolean shadowed = message.getShadowed();
        if (zM65745e || !shadowed) {
            boolean z4 = message.getParentId() != null;
            boolean showInChannel = message.getShowInChannel();
            if (!z4 || showInChannel) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unreadCount$lambda$12(ChannelUserRead channelUserRead) {
        if (channelUserRead != null) {
            return channelUserRead.getUnreadMessages();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData updateChannelData$lambda$145(HasChannel hasChannel, ChannelData channelData) {
        ChannelData channelDataMergeFromEvent;
        ChannelData channelData2 = ChannelKt.toChannelData(hasChannel.getChannel());
        return (channelData == null || (channelDataMergeFromEvent = ChannelDataKt.mergeFromEvent(channelData, channelData2)) == null) ? channelData2 : channelDataMergeFromEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData updateLastMessageAt$lambda$148(Message message, boolean z4, ChannelData channelData) {
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
    public static final Message updateMessage$lambda$45(ChannelStateImpl channelStateImpl, Message message, Message old) {
        AbstractC22676k.m65750j(old, "old");
        return channelStateImpl.attachmentUrlValidator.updateValidAttachmentsUrl$stream_chat_android_client_release(message, old);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message updateMessageFromEvent$lambda$52(ChannelStateImpl channelStateImpl, Message message, InterfaceC4351m interfaceC4351m, Message old) {
        AbstractC22676k.m65750j(old, "old");
        return (Message) interfaceC4351m.invoke(old, channelStateImpl.attachmentUrlValidator.updateValidAttachmentsUrl$stream_chat_android_client_release(message, old));
    }

    private static final Message updateQuotedMessageReferences$preservedReplyTo(Message message, ChannelStateImpl channelStateImpl, Message message2) {
        Message replyTo = message2.getReplyTo();
        return replyTo == null ? message : channelStateImpl.attachmentUrlValidator.updateValidAttachmentsUrl$stream_chat_android_client_release(message, replyTo);
    }

    public static /* synthetic */ void upsertCachedLatestMessages$default(ChannelStateImpl channelStateImpl, List list, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        channelStateImpl.upsertCachedLatestMessages(list, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message upsertCachedMessage$lambda$44$lambda$43(ChannelStateImpl channelStateImpl, Message message, Message old) {
        AbstractC22676k.m65750j(old, "old");
        return channelStateImpl.attachmentUrlValidator.updateValidAttachmentsUrl$stream_chat_android_client_release(message, old);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message upsertMessage$lambda$32$lambda$31(ChannelStateImpl channelStateImpl, Message message, Message old) {
        AbstractC22676k.m65750j(old, "old");
        return channelStateImpl.attachmentUrlValidator.updateValidAttachmentsUrl$stream_chat_android_client_release(message, old);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message upsertMessage$lambda$34$lambda$33(ChannelStateImpl channelStateImpl, Message message, Message old) {
        AbstractC22676k.m65750j(old, "old");
        return channelStateImpl.attachmentUrlValidator.updateValidAttachmentsUrl$stream_chat_android_client_release(message, old);
    }

    public static /* synthetic */ void upsertMessages$default(ChannelStateImpl channelStateImpl, List list, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        channelStateImpl.upsertMessages(list, z4);
    }

    private static final List watchers$lambda$8(List watchers, Map users) {
        AbstractC22676k.m65750j(watchers, "watchers");
        AbstractC22676k.m65750j(users, "users");
        return UserKt.updateUsers(watchers, users);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ ArrayList m54837z(ChannelStateImpl channelStateImpl, List list) {
        return (ArrayList) activeLiveLocations$lambda$19(channelStateImpl, list);
    }

    public final void addMember(MemberAddedEvent event) {
        C13045h2 c13045h2;
        Object value;
        C13045h2 c13045h3;
        Object value2;
        AbstractC22676k.m65750j(event, "event");
        Member member = event.getMember();
        Iterable iterable = (Iterable) ((C13045h2) this._members).getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (AbstractC22676k.m65745e(((Member) it.next()).getUserId(), member.getUserId())) {
                    return;
                }
            }
        }
        InterfaceC13075p1 interfaceC13075p1 = this._members;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, AbstractC25265s.m74128f1(member, (List) value)));
        InterfaceC13075p1 interfaceC13075p2 = this._memberCount;
        do {
            c13045h3 = (C13045h2) interfaceC13075p2;
            value2 = c13045h3.getValue();
        } while (!c13045h3.m36569i(value2, Integer.valueOf(((Number) value2).intValue() + 1)));
    }

    public final void addPinnedMessage(Message pinnedMessage) {
        AbstractC22676k.m65750j(pinnedMessage, "pinnedMessage");
        addPinnedMessages(AbstractC37056f.m118958J(pinnedMessage));
    }

    public final void addPinnedMessages(List<Message> pinnedMessages) {
        C13045h2 c13045h2;
        Object value;
        List listUpsertSorted;
        AbstractC22676k.m65750j(pinnedMessages, "pinnedMessages");
        if (pinnedMessages.isEmpty()) {
            return;
        }
        for (Message message : pinnedMessages) {
            Poll poll = message.getPoll();
            if (poll != null) {
                registerPollForMessage(poll, message.getId());
            }
            Message replyTo = message.getReplyTo();
            if (replyTo != null) {
                addQuotedMessage(replyTo.getId(), message.getId());
            }
            String replyMessageId = message.getReplyMessageId();
            if (replyMessageId != null) {
                addQuotedMessage(replyMessageId, message.getId());
            }
        }
        InterfaceC13075p1 interfaceC13075p1 = this._pinnedMessages;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            listUpsertSorted = (List) value;
            for (Message message2 : pinnedMessages) {
                listUpsertSorted = ListKt.upsertSorted(listUpsertSorted, message2, new C22693x() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl$addPinnedMessages$4$1
                    @Override // p715kotlin.jvm.internal.C22693x, j93.InterfaceC21490w
                    public final Object get(Object obj) {
                        return ((Message) obj).getId();
                    }
                }, new C19329xab5eab63(), new C19334a(this, message2, 0));
            }
        } while (!c13045h2.m36569i(value, listUpsertSorted));
    }

    public final void addQuotedMessage(String quotedMessageId, String quotingMessageId) {
        C13045h2 c13045h2;
        Object value;
        Map map;
        Set set;
        AbstractC22676k.m65750j(quotedMessageId, "quotedMessageId");
        AbstractC22676k.m65750j(quotingMessageId, "quotingMessageId");
        InterfaceC13075p1 interfaceC13075p1 = this._quotedMessagesMap;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            map = (Map) value;
            set = (Set) map.get(quotedMessageId);
            if (set == null) {
                set = C25235a0.f99113w;
            }
        } while (!c13045h2.m36569i(value, AbstractC25247g0.m73996e0(map, new C23465k(quotedMessageId, AbstractC12350b.m34555D(quotingMessageId, set)))));
    }

    public final void addWatcher(UserStartWatchingEvent event) {
        AbstractC22676k.m65750j(event, "event");
        upsertWatchers(AbstractC37056f.m118958J(event.getUser()), event.getWatcherCount());
    }

    public final void cacheLatestMessages() {
        InterfaceC13075p1 interfaceC13075p1 = this._cachedLatestMessages;
        List listM74158x1 = AbstractC25265s.m74158x1(25, (List) ((C13045h2) this._messages).getValue());
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, listM74158x1);
    }

    public final void clearCachedLatestMessages() {
        C13045h2 c13045h2 = (C13045h2) this._cachedLatestMessages;
        c13045h2.getClass();
        c13045h2.m36571k(null, C25271y.f99162w);
    }

    public final void deleteChannel(Date deletedAt) {
        AbstractC22676k.m65750j(deletedAt, "deletedAt");
        updateChannelData(new C17095c(deletedAt, 20));
    }

    public final void deleteMembership() {
        updateChannelData(new C19031a(28));
    }

    public final void deleteMessage(String id4) {
        C13045h2 c13045h2;
        Object value;
        ArrayList arrayList;
        C13045h2 c13045h3;
        Object value2;
        ArrayList arrayList2;
        C13045h2 c13045h4;
        Object value3;
        ArrayList arrayList3;
        C13045h2 c13045h5;
        Object value4;
        ArrayList arrayList4;
        AbstractC22676k.m65750j(id4, "id");
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                if (!id4.equals(((Message) obj).getId())) {
                    arrayList.add(obj);
                }
            }
        } while (!c13045h2.m36569i(value, arrayList));
        InterfaceC13075p1 interfaceC13075p2 = this._cachedLatestMessages;
        do {
            c13045h3 = (C13045h2) interfaceC13075p2;
            value2 = c13045h3.getValue();
            arrayList2 = new ArrayList();
            for (Object obj2 : (List) value2) {
                if (!id4.equals(((Message) obj2).getId())) {
                    arrayList2.add(obj2);
                }
            }
        } while (!c13045h3.m36569i(value2, arrayList2));
        InterfaceC13075p1 interfaceC13075p3 = this._pinnedMessages;
        do {
            c13045h4 = (C13045h2) interfaceC13075p3;
            value3 = c13045h4.getValue();
            arrayList3 = new ArrayList();
            for (Object obj3 : (List) value3) {
                if (!id4.equals(((Message) obj3).getId())) {
                    arrayList3.add(obj3);
                }
            }
        } while (!c13045h4.m36569i(value3, arrayList3));
        InterfaceC13075p1 interfaceC13075p4 = this.localOnlyMessages;
        do {
            c13045h5 = (C13045h2) interfaceC13075p4;
            value4 = c13045h5.getValue();
            arrayList4 = new ArrayList();
            for (Object obj4 : (List) value4) {
                if (!id4.equals(((Message) obj4).getId())) {
                    arrayList4.add(obj4);
                }
            }
        } while (!c13045h5.m36569i(value4, arrayList4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.ArrayList] */
    public final void deleteMessagesFromUser(String userId, boolean hard, Date deletedAt) {
        Object obj;
        List list;
        int i13;
        int i14;
        Object obj2;
        List list2;
        int i15;
        int i16;
        C13045h2 c13045h2;
        Object obj3;
        List list3;
        int i17;
        int i18;
        C13045h2 c13045h3;
        Object value;
        Object arrayList;
        C13045h2 c13045h4;
        Object value2;
        ArrayList arrayList2;
        C13045h2 c13045h5;
        Object value3;
        ArrayList arrayList3;
        String userId2 = userId;
        AbstractC22676k.m65750j(userId2, "userId");
        AbstractC22676k.m65750j(deletedAt, "deletedAt");
        if (hard) {
            InterfaceC13075p1 interfaceC13075p1 = this._messages;
            do {
                c13045h3 = (C13045h2) interfaceC13075p1;
                value = c13045h3.getValue();
                arrayList = (List) value;
                Iterable iterable = (Iterable) arrayList;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (AbstractC22676k.m65745e(((Message) it.next()).getUser().getId(), userId2)) {
                            arrayList = new ArrayList();
                            for (Object obj4 : iterable) {
                                if (!AbstractC22676k.m65745e(((Message) obj4).getUser().getId(), userId2)) {
                                    arrayList.add(obj4);
                                }
                            }
                            break;
                        }
                    }
                }
            } while (!c13045h3.m36569i(value, arrayList));
            InterfaceC13075p1 interfaceC13075p2 = this._cachedLatestMessages;
            do {
                c13045h4 = (C13045h2) interfaceC13075p2;
                value2 = c13045h4.getValue();
                arrayList2 = new ArrayList();
                for (Object obj5 : (List) value2) {
                    if (!AbstractC22676k.m65745e(((Message) obj5).getUser().getId(), userId2)) {
                        arrayList2.add(obj5);
                    }
                }
            } while (!c13045h4.m36569i(value2, arrayList2));
            InterfaceC13075p1 interfaceC13075p3 = this._pinnedMessages;
            do {
                c13045h5 = (C13045h2) interfaceC13075p3;
                value3 = c13045h5.getValue();
                arrayList3 = new ArrayList();
                for (Object obj6 : (List) value3) {
                    if (!AbstractC22676k.m65745e(((Message) obj6).getUser().getId(), userId2)) {
                        arrayList3.add(obj6);
                    }
                }
            } while (!c13045h5.m36569i(value3, arrayList3));
            return;
        }
        InterfaceC13075p1 interfaceC13075p4 = this._messages;
        while (true) {
            C13045h2 c13045h6 = (C13045h2) interfaceC13075p4;
            Object value4 = c13045h6.getValue();
            List list4 = (List) value4;
            int size = list4.size();
            int i19 = 0;
            ArrayList arrayListM74097F1 = null;
            while (i19 < size) {
                Message message = (Message) list4.get(i19);
                if (AbstractC22676k.m65745e(message.getUser().getId(), userId2)) {
                    if (arrayListM74097F1 == null) {
                        arrayListM74097F1 = AbstractC25265s.m74097F1(list4);
                    }
                    ArrayList arrayList4 = arrayListM74097F1;
                    list3 = list4;
                    i17 = size;
                    i18 = i19;
                    c13045h2 = c13045h6;
                    obj3 = value4;
                    arrayList4.set(i18, message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : deletedAt, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false));
                    arrayListM74097F1 = arrayList4;
                } else {
                    c13045h2 = c13045h6;
                    obj3 = value4;
                    list3 = list4;
                    i17 = size;
                    i18 = i19;
                }
                i19 = i18 + 1;
                userId2 = userId;
                c13045h6 = c13045h2;
                interfaceC13075p4 = interfaceC13075p4;
                value4 = obj3;
                list4 = list3;
                size = i17;
            }
            InterfaceC13075p1 interfaceC13075p5 = interfaceC13075p4;
            if (c13045h6.m36569i(value4, arrayListM74097F1 == null ? list4 : arrayListM74097F1)) {
                break;
            }
            userId2 = userId;
            interfaceC13075p4 = interfaceC13075p5;
        }
        InterfaceC13075p1 interfaceC13075p6 = this._cachedLatestMessages;
        while (true) {
            C13045h2 c13045h7 = (C13045h2) interfaceC13075p6;
            Object value5 = c13045h7.getValue();
            List list5 = (List) value5;
            int size2 = list5.size();
            int i24 = 0;
            ArrayList arrayListM74097F2 = null;
            while (i24 < size2) {
                Message message2 = (Message) list5.get(i24);
                if (AbstractC22676k.m65745e(message2.getUser().getId(), userId)) {
                    if (arrayListM74097F2 == null) {
                        arrayListM74097F2 = AbstractC25265s.m74097F1(list5);
                    }
                    ArrayList arrayList5 = arrayListM74097F2;
                    list2 = list5;
                    i16 = i24;
                    i15 = size2;
                    obj2 = value5;
                    arrayList5.set(i16, message2.copy(((-1) & 1) != 0 ? message2.id : null, ((-1) & 2) != 0 ? message2.cid : null, ((-1) & 4) != 0 ? message2.text : null, ((-1) & 8) != 0 ? message2.html : null, ((-1) & 16) != 0 ? message2.parentId : null, ((-1) & 32) != 0 ? message2.command : null, ((-1) & 64) != 0 ? message2.attachments : null, ((-1) & 128) != 0 ? message2.mentionedUsersIds : null, ((-1) & 256) != 0 ? message2.mentionedUsers : null, ((-1) & 512) != 0 ? message2.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.reactionCounts : null, ((-1) & 4096) != 0 ? message2.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.syncStatus : null, ((-1) & 32768) != 0 ? message2.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message2.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message2.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message2.createdAt : null, ((-1) & 524288) != 0 ? message2.updatedAt : null, ((-1) & 1048576) != 0 ? message2.deletedAt : deletedAt, ((-1) & 2097152) != 0 ? message2.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message2.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message2.user : null, ((-1) & 16777216) != 0 ? message2.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message2.silent : false, ((-1) & 67108864) != 0 ? message2.shadowed : false, ((-1) & 134217728) != 0 ? message2.i18n : null, ((-1) & 268435456) != 0 ? message2.showInChannel : false, ((-1) & 536870912) != 0 ? message2.channelInfo : null, ((-1) & 1073741824) != 0 ? message2.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message2.replyMessageId : null, (65535 & 1) != 0 ? message2.pinned : false, (65535 & 2) != 0 ? message2.pinnedAt : null, (65535 & 4) != 0 ? message2.pinExpires : null, (65535 & 8) != 0 ? message2.pinnedBy : null, (65535 & 16) != 0 ? message2.threadParticipants : null, (65535 & 32) != 0 ? message2.skipPushNotification : false, (65535 & 64) != 0 ? message2.skipEnrichUrl : false, (65535 & 128) != 0 ? message2.moderationDetails : null, (65535 & 256) != 0 ? message2.moderation : null, (65535 & 512) != 0 ? message2.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.restrictedVisibility : null, (65535 & 4096) != 0 ? message2.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.channelRole : null, (65535 & 32768) != 0 ? message2.deletedForMe : false));
                    arrayListM74097F2 = arrayList5;
                } else {
                    obj2 = value5;
                    list2 = list5;
                    i15 = size2;
                    i16 = i24;
                }
                i24 = i16 + 1;
                list5 = list2;
                interfaceC13075p6 = interfaceC13075p6;
                size2 = i15;
                value5 = obj2;
            }
            InterfaceC13075p1 interfaceC13075p7 = interfaceC13075p6;
            if (c13045h7.m36569i(value5, arrayListM74097F2 == null ? list5 : arrayListM74097F2)) {
                break;
            } else {
                interfaceC13075p6 = interfaceC13075p7;
            }
        }
        InterfaceC13075p1 interfaceC13075p8 = this._pinnedMessages;
        while (true) {
            C13045h2 c13045h8 = (C13045h2) interfaceC13075p8;
            Object value6 = c13045h8.getValue();
            List list6 = (List) value6;
            int size3 = list6.size();
            int i25 = 0;
            ArrayList arrayListM74097F3 = null;
            while (i25 < size3) {
                Message message3 = (Message) list6.get(i25);
                if (AbstractC22676k.m65745e(message3.getUser().getId(), userId)) {
                    if (arrayListM74097F3 == null) {
                        arrayListM74097F3 = AbstractC25265s.m74097F1(list6);
                    }
                    ArrayList arrayList6 = arrayListM74097F3;
                    list = list6;
                    i13 = size3;
                    i14 = i25;
                    obj = value6;
                    arrayList6.set(i14, message3.copy(((-1) & 1) != 0 ? message3.id : null, ((-1) & 2) != 0 ? message3.cid : null, ((-1) & 4) != 0 ? message3.text : null, ((-1) & 8) != 0 ? message3.html : null, ((-1) & 16) != 0 ? message3.parentId : null, ((-1) & 32) != 0 ? message3.command : null, ((-1) & 64) != 0 ? message3.attachments : null, ((-1) & 128) != 0 ? message3.mentionedUsersIds : null, ((-1) & 256) != 0 ? message3.mentionedUsers : null, ((-1) & 512) != 0 ? message3.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message3.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message3.reactionCounts : null, ((-1) & 4096) != 0 ? message3.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message3.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message3.syncStatus : null, ((-1) & 32768) != 0 ? message3.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message3.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message3.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message3.createdAt : null, ((-1) & 524288) != 0 ? message3.updatedAt : null, ((-1) & 1048576) != 0 ? message3.deletedAt : deletedAt, ((-1) & 2097152) != 0 ? message3.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message3.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message3.user : null, ((-1) & 16777216) != 0 ? message3.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message3.silent : false, ((-1) & 67108864) != 0 ? message3.shadowed : false, ((-1) & 134217728) != 0 ? message3.i18n : null, ((-1) & 268435456) != 0 ? message3.showInChannel : false, ((-1) & 536870912) != 0 ? message3.channelInfo : null, ((-1) & 1073741824) != 0 ? message3.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message3.replyMessageId : null, (65535 & 1) != 0 ? message3.pinned : false, (65535 & 2) != 0 ? message3.pinnedAt : null, (65535 & 4) != 0 ? message3.pinExpires : null, (65535 & 8) != 0 ? message3.pinnedBy : null, (65535 & 16) != 0 ? message3.threadParticipants : null, (65535 & 32) != 0 ? message3.skipPushNotification : false, (65535 & 64) != 0 ? message3.skipEnrichUrl : false, (65535 & 128) != 0 ? message3.moderationDetails : null, (65535 & 256) != 0 ? message3.moderation : null, (65535 & 512) != 0 ? message3.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message3.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message3.restrictedVisibility : null, (65535 & 4096) != 0 ? message3.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message3.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message3.channelRole : null, (65535 & 32768) != 0 ? message3.deletedForMe : false));
                    arrayListM74097F3 = arrayList6;
                } else {
                    obj = value6;
                    list = list6;
                    i13 = size3;
                    i14 = i25;
                }
                i25 = i14 + 1;
                list6 = list;
                size3 = i13;
                interfaceC13075p8 = interfaceC13075p8;
                value6 = obj;
            }
            InterfaceC13075p1 interfaceC13075p9 = interfaceC13075p8;
            if (c13045h8.m36569i(value6, arrayListM74097F3 == null ? list6 : arrayListM74097F3)) {
                return;
            } else {
                interfaceC13075p8 = interfaceC13075p9;
            }
        }
    }

    public final void deletePinnedMessage(String messageId) {
        C13045h2 c13045h2;
        Object value;
        Collection arrayList;
        AbstractC22676k.m65750j(messageId, "messageId");
        InterfaceC13075p1 interfaceC13075p1 = this._pinnedMessages;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            arrayList = (List) value;
            Collection collection = arrayList;
            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (AbstractC22676k.m65745e(((Message) it.next()).getId(), messageId)) {
                        arrayList = new ArrayList();
                        for (Object obj : collection) {
                            if (!AbstractC22676k.m65745e(((Message) obj).getId(), messageId)) {
                                arrayList.add(obj);
                            }
                        }
                        break;
                    }
                }
            }
        } while (!c13045h2.m36569i(value, arrayList));
    }

    public final void deletePoll(Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        this.polls.remove(poll.getId());
        Set<String> setRemove = this.messagesWithPolls.remove(poll.getId());
        if (setRemove == null) {
            setRemove = C25235a0.f99113w;
        }
        Iterator<String> it = setRemove.iterator();
        while (it.hasNext()) {
            Message messageById = getMessageById(it.next());
            if (messageById != null) {
                updateMessage(messageById.copy(((-1) & 1) != 0 ? messageById.id : null, ((-1) & 2) != 0 ? messageById.cid : null, ((-1) & 4) != 0 ? messageById.text : null, ((-1) & 8) != 0 ? messageById.html : null, ((-1) & 16) != 0 ? messageById.parentId : null, ((-1) & 32) != 0 ? messageById.command : null, ((-1) & 64) != 0 ? messageById.attachments : null, ((-1) & 128) != 0 ? messageById.mentionedUsersIds : null, ((-1) & 256) != 0 ? messageById.mentionedUsers : null, ((-1) & 512) != 0 ? messageById.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageById.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageById.reactionCounts : null, ((-1) & 4096) != 0 ? messageById.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageById.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageById.syncStatus : null, ((-1) & 32768) != 0 ? messageById.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageById.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageById.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageById.createdAt : null, ((-1) & 524288) != 0 ? messageById.updatedAt : null, ((-1) & 1048576) != 0 ? messageById.deletedAt : null, ((-1) & 2097152) != 0 ? messageById.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? messageById.createdLocallyAt : null, ((-1) & 8388608) != 0 ? messageById.user : null, ((-1) & 16777216) != 0 ? messageById.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageById.silent : false, ((-1) & 67108864) != 0 ? messageById.shadowed : false, ((-1) & 134217728) != 0 ? messageById.i18n : null, ((-1) & 268435456) != 0 ? messageById.showInChannel : false, ((-1) & 536870912) != 0 ? messageById.channelInfo : null, ((-1) & 1073741824) != 0 ? messageById.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? messageById.replyMessageId : null, (65535 & 1) != 0 ? messageById.pinned : false, (65535 & 2) != 0 ? messageById.pinnedAt : null, (65535 & 4) != 0 ? messageById.pinExpires : null, (65535 & 8) != 0 ? messageById.pinnedBy : null, (65535 & 16) != 0 ? messageById.threadParticipants : null, (65535 & 32) != 0 ? messageById.skipPushNotification : false, (65535 & 64) != 0 ? messageById.skipEnrichUrl : false, (65535 & 128) != 0 ? messageById.moderationDetails : null, (65535 & 256) != 0 ? messageById.moderation : null, (65535 & 512) != 0 ? messageById.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageById.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageById.restrictedVisibility : null, (65535 & 4096) != 0 ? messageById.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageById.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageById.channelRole : null, (65535 & 32768) != 0 ? messageById.deletedForMe : false));
            }
        }
    }

    public final void deleteQuotedMessageReferences(String quotedMessageId) {
        C13045h2 c13045h2;
        Object value;
        C13045h2 c13045h3;
        Object value2;
        List list;
        C13045h2 c13045h4;
        Object value3;
        List list2;
        C13045h2 c13045h5;
        Object value4;
        List list3;
        C13045h2 c13045h6;
        Object value5;
        AbstractC22676k.m65750j(quotedMessageId, "quotedMessageId");
        Set set = (Set) ((Map) ((C13045h2) this._quotedMessagesMap).getValue()).get(quotedMessageId);
        Set set2 = set;
        if (set2 == null || set2.isEmpty()) {
            InterfaceC13075p1 interfaceC13075p1 = this._quotedMessagesMap;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
            } while (!c13045h2.m36569i(value, AbstractC25247g0.m73991Z(quotedMessageId, (Map) value)));
            return;
        }
        InterfaceC13075p1 interfaceC13075p2 = this._messages;
        do {
            c13045h3 = (C13045h2) interfaceC13075p2;
            value2 = c13045h3.getValue();
            list = (List) value2;
            int size = list.size();
            ArrayList arrayListM74097F1 = null;
            for (int i13 = 0; i13 < size; i13++) {
                Message message = (Message) list.get(i13);
                if (set.contains(message.getId())) {
                    if (arrayListM74097F1 == null) {
                        arrayListM74097F1 = AbstractC25265s.m74097F1(list);
                    }
                    arrayListM74097F1.set(i13, message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false));
                }
            }
            if (arrayListM74097F1 != null) {
                list = arrayListM74097F1;
            }
        } while (!c13045h3.m36569i(value2, list));
        InterfaceC13075p1 interfaceC13075p3 = this._cachedLatestMessages;
        do {
            c13045h4 = (C13045h2) interfaceC13075p3;
            value3 = c13045h4.getValue();
            list2 = (List) value3;
            int size2 = list2.size();
            ArrayList arrayListM74097F2 = null;
            for (int i14 = 0; i14 < size2; i14++) {
                Message message2 = (Message) list2.get(i14);
                if (set.contains(message2.getId())) {
                    if (arrayListM74097F2 == null) {
                        arrayListM74097F2 = AbstractC25265s.m74097F1(list2);
                    }
                    arrayListM74097F2.set(i14, message2.copy(((-1) & 1) != 0 ? message2.id : null, ((-1) & 2) != 0 ? message2.cid : null, ((-1) & 4) != 0 ? message2.text : null, ((-1) & 8) != 0 ? message2.html : null, ((-1) & 16) != 0 ? message2.parentId : null, ((-1) & 32) != 0 ? message2.command : null, ((-1) & 64) != 0 ? message2.attachments : null, ((-1) & 128) != 0 ? message2.mentionedUsersIds : null, ((-1) & 256) != 0 ? message2.mentionedUsers : null, ((-1) & 512) != 0 ? message2.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.reactionCounts : null, ((-1) & 4096) != 0 ? message2.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.syncStatus : null, ((-1) & 32768) != 0 ? message2.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message2.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message2.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message2.createdAt : null, ((-1) & 524288) != 0 ? message2.updatedAt : null, ((-1) & 1048576) != 0 ? message2.deletedAt : null, ((-1) & 2097152) != 0 ? message2.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message2.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message2.user : null, ((-1) & 16777216) != 0 ? message2.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message2.silent : false, ((-1) & 67108864) != 0 ? message2.shadowed : false, ((-1) & 134217728) != 0 ? message2.i18n : null, ((-1) & 268435456) != 0 ? message2.showInChannel : false, ((-1) & 536870912) != 0 ? message2.channelInfo : null, ((-1) & 1073741824) != 0 ? message2.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message2.replyMessageId : null, (65535 & 1) != 0 ? message2.pinned : false, (65535 & 2) != 0 ? message2.pinnedAt : null, (65535 & 4) != 0 ? message2.pinExpires : null, (65535 & 8) != 0 ? message2.pinnedBy : null, (65535 & 16) != 0 ? message2.threadParticipants : null, (65535 & 32) != 0 ? message2.skipPushNotification : false, (65535 & 64) != 0 ? message2.skipEnrichUrl : false, (65535 & 128) != 0 ? message2.moderationDetails : null, (65535 & 256) != 0 ? message2.moderation : null, (65535 & 512) != 0 ? message2.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.restrictedVisibility : null, (65535 & 4096) != 0 ? message2.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.channelRole : null, (65535 & 32768) != 0 ? message2.deletedForMe : false));
                }
            }
            if (arrayListM74097F2 != null) {
                list2 = arrayListM74097F2;
            }
        } while (!c13045h4.m36569i(value3, list2));
        InterfaceC13075p1 interfaceC13075p4 = this._pinnedMessages;
        do {
            c13045h5 = (C13045h2) interfaceC13075p4;
            value4 = c13045h5.getValue();
            list3 = (List) value4;
            int size3 = list3.size();
            ArrayList arrayListM74097F3 = null;
            for (int i15 = 0; i15 < size3; i15++) {
                Message message3 = (Message) list3.get(i15);
                if (set.contains(message3.getId())) {
                    if (arrayListM74097F3 == null) {
                        arrayListM74097F3 = AbstractC25265s.m74097F1(list3);
                    }
                    arrayListM74097F3.set(i15, message3.copy(((-1) & 1) != 0 ? message3.id : null, ((-1) & 2) != 0 ? message3.cid : null, ((-1) & 4) != 0 ? message3.text : null, ((-1) & 8) != 0 ? message3.html : null, ((-1) & 16) != 0 ? message3.parentId : null, ((-1) & 32) != 0 ? message3.command : null, ((-1) & 64) != 0 ? message3.attachments : null, ((-1) & 128) != 0 ? message3.mentionedUsersIds : null, ((-1) & 256) != 0 ? message3.mentionedUsers : null, ((-1) & 512) != 0 ? message3.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message3.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message3.reactionCounts : null, ((-1) & 4096) != 0 ? message3.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message3.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message3.syncStatus : null, ((-1) & 32768) != 0 ? message3.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message3.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message3.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message3.createdAt : null, ((-1) & 524288) != 0 ? message3.updatedAt : null, ((-1) & 1048576) != 0 ? message3.deletedAt : null, ((-1) & 2097152) != 0 ? message3.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message3.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message3.user : null, ((-1) & 16777216) != 0 ? message3.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message3.silent : false, ((-1) & 67108864) != 0 ? message3.shadowed : false, ((-1) & 134217728) != 0 ? message3.i18n : null, ((-1) & 268435456) != 0 ? message3.showInChannel : false, ((-1) & 536870912) != 0 ? message3.channelInfo : null, ((-1) & 1073741824) != 0 ? message3.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message3.replyMessageId : null, (65535 & 1) != 0 ? message3.pinned : false, (65535 & 2) != 0 ? message3.pinnedAt : null, (65535 & 4) != 0 ? message3.pinExpires : null, (65535 & 8) != 0 ? message3.pinnedBy : null, (65535 & 16) != 0 ? message3.threadParticipants : null, (65535 & 32) != 0 ? message3.skipPushNotification : false, (65535 & 64) != 0 ? message3.skipEnrichUrl : false, (65535 & 128) != 0 ? message3.moderationDetails : null, (65535 & 256) != 0 ? message3.moderation : null, (65535 & 512) != 0 ? message3.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message3.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message3.restrictedVisibility : null, (65535 & 4096) != 0 ? message3.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message3.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message3.channelRole : null, (65535 & 32768) != 0 ? message3.deletedForMe : false));
                }
            }
            if (arrayListM74097F3 != null) {
                list3 = arrayListM74097F3;
            }
        } while (!c13045h5.m36569i(value4, list3));
        InterfaceC13075p1 interfaceC13075p5 = this._quotedMessagesMap;
        do {
            c13045h6 = (C13045h2) interfaceC13075p5;
            value5 = c13045h6.getValue();
        } while (!c13045h6.m36569i(value5, AbstractC25247g0.m73991Z(quotedMessageId, (Map) value5)));
    }

    public final void destroy() {
        ((C13045h2) this._repliedMessage).m36570j(null);
        C13045h2 c13045h2 = (C13045h2) this._quotedMessagesMap;
        c13045h2.getClass();
        C25272z c25272z = C25272z.f99163w;
        c13045h2.m36571k(null, c25272z);
        C13045h2 c13045h3 = (C13045h2) this._messages;
        c13045h3.getClass();
        C25271y c25271y = C25271y.f99162w;
        c13045h3.m36571k(null, c25271y);
        C13045h2 c13045h4 = (C13045h2) this._pendingMessages;
        c13045h4.getClass();
        c13045h4.m36571k(null, c25271y);
        InterfaceC13075p1 interfaceC13075p1 = this._pendingEnabled;
        Boolean bool = Boolean.FALSE;
        C13045h2 c13045h5 = (C13045h2) interfaceC13075p1;
        c13045h5.getClass();
        c13045h5.m36571k(null, bool);
        C13045h2 c13045h6 = (C13045h2) this._cachedLatestMessages;
        c13045h6.getClass();
        c13045h6.m36571k(null, c25271y);
        C13045h2 c13045h7 = (C13045h2) this._pinnedMessages;
        c13045h7.getClass();
        c13045h7.m36571k(null, c25271y);
        C13045h2 c13045h8 = (C13045h2) this._watcherCount;
        c13045h8.getClass();
        c13045h8.m36571k(null, 0);
        C13045h2 c13045h9 = (C13045h2) this._watchers;
        c13045h9.getClass();
        c13045h9.m36571k(null, c25271y);
        InterfaceC13075p1 interfaceC13075p2 = this._typing;
        TypingEvent typingEvent = new TypingEvent(this.channelId, c25271y);
        C13045h2 c13045h10 = (C13045h2) interfaceC13075p2;
        c13045h10.getClass();
        c13045h10.m36571k(null, typingEvent);
        C13045h2 c13045h11 = (C13045h2) this._reads;
        c13045h11.getClass();
        c13045h11.m36571k(null, c25272z);
        C13045h2 c13045h12 = (C13045h2) this._memberCount;
        c13045h12.getClass();
        c13045h12.m36571k(null, 0);
        C13045h2 c13045h13 = (C13045h2) this._members;
        c13045h13.getClass();
        c13045h13.m36571k(null, c25271y);
        ((C13045h2) this._channelData).m36570j(null);
        C13045h2 c13045h14 = (C13045h2) this._hidden;
        c13045h14.getClass();
        c13045h14.m36571k(null, bool);
        C13045h2 c13045h15 = (C13045h2) this._muted;
        c13045h15.getClass();
        c13045h15.m36571k(null, bool);
        InterfaceC13075p1 interfaceC13075p3 = this._channelConfig;
        Config config = new Config(null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, 0, null, null, null, null, false, false, false, 67108863, null);
        C13045h2 c13045h16 = (C13045h2) interfaceC13075p3;
        c13045h16.getClass();
        c13045h16.m36571k(null, config);
        this.paginationManager.reset();
        this._recoveryNeeded = false;
        C13045h2 c13045h17 = (C13045h2) this._insideSearch;
        c13045h17.getClass();
        c13045h17.m36571k(null, bool);
        this.lastStartTypingEvent = null;
        this.keystrokeParentMessageId = null;
        this.messagesWithPolls.clear();
        this.polls.clear();
        this.processedMessageIds.m8i(-1);
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getActiveLiveLocations() {
        return this.activeLiveLocations;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getChannelConfig() {
        return this.channelConfig;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getChannelData() {
        return this.channelData;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final String getChannelId() {
        return this.channelId;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final String getChannelType() {
        return this.channelType;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final String getCid() {
        return this.cid;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getEndOfNewerMessages() {
        return this.endOfNewerMessages;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getEndOfOlderMessages() {
        return this.endOfOlderMessages;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getHidden() {
        return this.hidden;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getInsideSearch() {
        return this.insideSearch;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getLastSentMessageDate() {
        return this.lastSentMessageDate;
    }

    public final Date getLastStartTypingEvent() {
        return this.lastStartTypingEvent;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getLoading() {
        return this.loading;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getLoadingNewerMessages() {
        return this.loadingNewerMessages;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getLoadingOlderMessages() {
        return this.loadingOlderMessages;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getMembers() {
        return this.members;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getMembersCount() {
        return this.membersCount;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final Message getMessageById(String id4) {
        Object obj;
        Object next;
        Object next2;
        AbstractC22676k.m65750j(id4, "id");
        Iterator it = ((Iterable) ((C13045h2) this._messages).getValue()).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((Message) next).getId(), id4));
        Message message = (Message) next;
        if (message == null) {
            Iterator it3 = ((Iterable) ((C13045h2) this._cachedLatestMessages).getValue()).iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!AbstractC22676k.m65745e(((Message) next2).getId(), id4));
            message = (Message) next2;
            if (message == null) {
                for (Object obj2 : (Iterable) ((C13045h2) this._pinnedMessages).getValue()) {
                    if (AbstractC22676k.m65745e(((Message) obj2).getId(), id4)) {
                        obj = obj2;
                        break;
                    }
                }
                return (Message) obj;
            }
        }
        return message;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getMessageCount() {
        return this.messageCount;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getMessages() {
        return this.messages;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getMessagesState() {
        return this.messagesState;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getMuted() {
        return this.muted;
    }

    public final Message getOldestMessage() {
        return (Message) AbstractC25265s.m74100H0((List) ((C13045h2) this._messages).getValue());
    }

    public final MessagesPaginationManager getPaginationManager() {
        return this.paginationManager;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getPinnedMessages() {
        return this.pinnedMessages;
    }

    public final Poll getPoll(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        return this.polls.get(id4);
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getQuotedMessagesMap() {
        return this.quotedMessagesMap;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getRead() {
        return this.read;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getReads() {
        return this.reads;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final boolean getRecoveryNeeded() {
        return this._recoveryNeeded;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getRepliedMessage() {
        return this.repliedMessage;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getTyping() {
        return this.typing;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getUnreadCount() {
        return this.unreadCount;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getWatcherCount() {
        return this.watcherCount;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getWatchers() {
        return this.watchers;
    }

    public final void hideMessagesBefore(Date date) {
        AbstractC22676k.m65750j(date, "date");
        removeMessagesBefore(date, null);
    }

    public final boolean markRead() {
        ChannelUserRead channelUserRead;
        C13045h2 c13045h2;
        Object value;
        if (!((Config) this.channelConfig.getValue()).getReadEventsEnabled()) {
            return false;
        }
        Message message = (Message) AbstractC25265s.m74114R0((List) ((C13045h2) this._messages).getValue());
        if (message == null || (channelUserRead = (ChannelUserRead) this.read.getValue()) == null) {
            return true;
        }
        if (AbstractC22676k.m65745e(message.getId(), channelUserRead.getLastReadMessageId())) {
            return false;
        }
        ChannelUserRead channelUserReadCopy$default = ChannelUserRead.copy$default(channelUserRead, null, MessageExtensionsKt.getCreatedAtOrDefault(message, new Date()), 0, MessageExtensionsKt.getCreatedAtOrDefault(message, new Date()), null, null, null, 113, null);
        InterfaceC13075p1 interfaceC13075p1 = this._reads;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, AbstractC25247g0.m73996e0((Map) value, new C23465k(channelUserReadCopy$default.getUserId(), channelUserReadCopy$default))));
        return true;
    }

    public final void removeMember(MemberRemovedEvent event) {
        AbstractC22676k.m65750j(event, "event");
        deleteMemberAndDecrementMemberCount(event.getMember().getUserId());
    }

    public final void removeMessagesBefore(Date date, Message systemMessage) {
        C13045h2 c13045h2;
        Object value;
        Collection arrayList;
        C13045h2 c13045h3;
        Object value2;
        ArrayList arrayList2;
        C13045h2 c13045h4;
        Object value3;
        ArrayList arrayList3;
        AbstractC22676k.m65750j(date, "date");
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            arrayList = (List) value;
            Collection collection = arrayList;
            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!MessageKt.wasCreatedAfter((Message) it.next(), date)) {
                        arrayList = new ArrayList();
                        for (Object obj : collection) {
                            if (MessageKt.wasCreatedAfter((Message) obj, date)) {
                                arrayList.add(obj);
                            }
                        }
                        break;
                    }
                }
            }
        } while (!c13045h2.m36569i(value, arrayList));
        InterfaceC13075p1 interfaceC13075p2 = this._cachedLatestMessages;
        do {
            c13045h3 = (C13045h2) interfaceC13075p2;
            value2 = c13045h3.getValue();
            arrayList2 = new ArrayList();
            for (Object obj2 : (List) value2) {
                if (MessageKt.wasCreatedAfter((Message) obj2, date)) {
                    arrayList2.add(obj2);
                }
            }
        } while (!c13045h3.m36569i(value2, arrayList2));
        InterfaceC13075p1 interfaceC13075p3 = this._pinnedMessages;
        do {
            c13045h4 = (C13045h2) interfaceC13075p3;
            value3 = c13045h4.getValue();
            arrayList3 = new ArrayList();
            for (Object obj3 : (List) value3) {
                if (MessageKt.wasCreatedAfter((Message) obj3, date)) {
                    arrayList3.add(obj3);
                }
            }
        } while (!c13045h4.m36569i(value3, arrayList3));
        if (systemMessage != null) {
            upsertMessage(systemMessage);
        }
    }

    public final void removePendingMessage(String id4) {
        C13045h2 c13045h2;
        Object value;
        Collection arrayList;
        AbstractC22676k.m65750j(id4, "id");
        InterfaceC13075p1 interfaceC13075p1 = this._pendingMessages;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            arrayList = (List) value;
            Collection collection = arrayList;
            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (AbstractC22676k.m65745e(((Message) it.next()).getId(), id4)) {
                        arrayList = new ArrayList();
                        for (Object obj : collection) {
                            if (!AbstractC22676k.m65745e(((Message) obj).getId(), id4)) {
                                arrayList.add(obj);
                            }
                        }
                        break;
                    }
                }
            }
        } while (!c13045h2.m36569i(value, arrayList));
    }

    public final void removeWatcher(UserStopWatchingEvent event) {
        C13045h2 c13045h2;
        Object value;
        ArrayList arrayList;
        AbstractC22676k.m65750j(event, "event");
        InterfaceC13075p1 interfaceC13075p1 = this._watchers;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                if (!AbstractC22676k.m65745e(((User) obj).getId(), event.getUser().getId())) {
                    arrayList.add(obj);
                }
            }
        } while (!c13045h2.m36569i(value, arrayList));
        InterfaceC13075p1 interfaceC13075p2 = this._watcherCount;
        Integer numValueOf = Integer.valueOf(Math.max(0, event.getWatcherCount()));
        C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
        c13045h3.getClass();
        c13045h3.m36571k(null, numValueOf);
    }

    public final void setChannelConfig(Config config) {
        AbstractC22676k.m65750j(config, "config");
        C13045h2 c13045h2 = (C13045h2) this._channelConfig;
        c13045h2.getClass();
        c13045h2.m36571k(null, config);
        boolean markMessagesPending = config.getMarkMessagesPending();
        if (!markMessagesPending) {
            C13045h2 c13045h3 = (C13045h2) this._pendingMessages;
            c13045h3.getClass();
            c13045h3.m36571k(null, C25271y.f99162w);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._pendingEnabled;
        Boolean boolValueOf = Boolean.valueOf(markMessagesPending);
        C13045h2 c13045h4 = (C13045h2) interfaceC13075p1;
        c13045h4.getClass();
        c13045h4.m36571k(null, boolValueOf);
    }

    public final void setHidden(boolean hidden) {
        InterfaceC13075p1 interfaceC13075p1 = this._hidden;
        Boolean boolValueOf = Boolean.valueOf(hidden);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, boolValueOf);
    }

    public final void setInsideSearch(boolean insideSearch) {
        InterfaceC13075p1 interfaceC13075p1 = this._insideSearch;
        Boolean boolValueOf = Boolean.valueOf(insideSearch);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, boolValueOf);
    }

    public final void setKeystrokeParentMessageId(String messageId) {
        this.keystrokeParentMessageId = messageId;
    }

    public final void setLastStartTypingEvent(Date date) {
        this.lastStartTypingEvent = date;
    }

    public final void setLocalOnlyMessages(List<Message> messages) {
        C13045h2 c13045h2;
        Object value;
        AbstractC22676k.m65750j(messages, "messages");
        InterfaceC13075p1 interfaceC13075p1 = this.localOnlyMessages;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, messages));
    }

    public final void setMemberCount(int count) {
        InterfaceC13075p1 interfaceC13075p1 = this._memberCount;
        Integer numValueOf = Integer.valueOf(count);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, numValueOf);
    }

    public final void setMembers(List<Member> members) {
        AbstractC22676k.m65750j(members, "members");
        C13045h2 c13045h2 = (C13045h2) this._members;
        c13045h2.getClass();
        c13045h2.m36571k(null, members);
    }

    public final void setMembership(Member membership) {
        AbstractC22676k.m65750j(membership, "membership");
        updateChannelData(new C19318c(membership, 1));
    }

    public final void setMessageCount(int count) {
        updateChannelData(new C6494e(count, 18));
    }

    public final void setMessages(List<Message> messages) {
        AbstractC22676k.m65750j(messages, "messages");
        ArrayList<Message> arrayList = new ArrayList();
        for (Object obj : messages) {
            if (!shouldIgnoreUpsertion((Message) obj)) {
                arrayList.add(obj);
            }
        }
        for (Message message : arrayList) {
            Message replyTo = message.getReplyTo();
            if (replyTo != null) {
                addQuotedMessage(replyTo.getId(), message.getId());
            }
            String replyMessageId = message.getReplyMessageId();
            if (replyMessageId != null) {
                addQuotedMessage(replyMessageId, message.getId());
            }
            Poll poll = message.getPoll();
            if (poll != null) {
                registerPollForMessage(poll, message.getId());
            }
        }
        C13045h2 c13045h2 = (C13045h2) this._messages;
        c13045h2.getClass();
        c13045h2.m36571k(null, arrayList);
    }

    public final void setMuted(boolean muted) {
        InterfaceC13075p1 interfaceC13075p1 = this._muted;
        Boolean boolValueOf = Boolean.valueOf(muted);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, boolValueOf);
    }

    public final void setPendingMessages(List<Message> messages) {
        AbstractC22676k.m65750j(messages, "messages");
        C13045h2 c13045h2 = (C13045h2) this._pendingMessages;
        c13045h2.getClass();
        c13045h2.m36571k(null, messages);
    }

    public final void setPushPreference(PushPreference preference) {
        AbstractC22676k.m65750j(preference, "preference");
        updateChannelData(new C19317b(preference, 1));
    }

    public final void setRecoveryNeeded(boolean recoveryNeeded) {
        this._recoveryNeeded = recoveryNeeded;
    }

    public final void setRepliedMessage(Message message) {
        ((C13045h2) this._repliedMessage).m36570j(message);
    }

    public final void setTyping(TypingEvent typingEvent) {
        AbstractC22676k.m65750j(typingEvent, "typingEvent");
        C13045h2 c13045h2 = (C13045h2) this._typing;
        c13045h2.getClass();
        c13045h2.m36571k(null, typingEvent);
    }

    public final void setWatchers(List<User> watchers, int watcherCount) {
        AbstractC22676k.m65750j(watchers, "watchers");
        C13045h2 c13045h2 = (C13045h2) this._watchers;
        c13045h2.getClass();
        c13045h2.m36571k(null, watchers);
        InterfaceC13075p1 interfaceC13075p1 = this._watcherCount;
        Integer numValueOf = Integer.valueOf(Math.max(0, watcherCount));
        C13045h2 c13045h3 = (C13045h2) interfaceC13075p1;
        c13045h3.getClass();
        c13045h3.m36571k(null, numValueOf);
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final Channel toChannel() {
        return Channel.copy$default(((ChannelData) this.channelData.getValue()).toChannel((List) this.messages.getValue(), (List) ((C13045h2) this._cachedLatestMessages).getValue(), (List) this.members.getValue(), (List) this.reads.getValue(), (List) this.watchers.getValue(), ((Number) this.watcherCount.getValue()).intValue(), ((Boolean) this.insideSearch.getValue()).booleanValue()), null, null, null, null, 0, false, null, null, null, null, 0, null, null, null, null, (Config) this.channelConfig.getValue(), null, 0, null, (Boolean) this.hidden.getValue(), null, 0, null, (List) this.pinnedMessages.getValue(), null, null, null, false, null, (List) this.activeLiveLocations.getValue(), null, null, null, null, null, -545816577, 7, null);
    }

    public final void trimNewestMessages() {
        applyMessageLimitIfNeeded(TrimDirection.FROM_NEWEST);
    }

    public final void trimOldestMessages() {
        applyMessageLimitIfNeeded(TrimDirection.FROM_OLDEST);
    }

    public final void updateChannelData(Function1 update) {
        C13045h2 c13045h2;
        Object value;
        AbstractC22676k.m65750j(update, "update");
        InterfaceC13075p1 interfaceC13075p1 = this._channelData;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, (ChannelData) update.invoke((ChannelData) value)));
    }

    public final void updateCurrentUserRead(Date eventReceivedDate, Message message) {
        AbstractC22676k.m65750j(eventReceivedDate, "eventReceivedDate");
        AbstractC22676k.m65750j(message, "message");
        Object objM2c = this.processedMessageIds.m2c(message.getId());
        Boolean bool = Boolean.TRUE;
        if (AbstractC22676k.m65745e(objM2c, bool)) {
            return;
        }
        if (((Boolean) this.muted.getValue()).booleanValue()) {
            this.processedMessageIds.m3d(message.getId(), bool);
            return;
        }
        if (message.getParentId() != null && !message.getShowInChannel()) {
            this.processedMessageIds.m3d(message.getId(), bool);
            return;
        }
        String id4 = message.getUser().getId();
        User user = (User) this.currentUser.getValue();
        if (AbstractC22676k.m65745e(id4, user != null ? user.getId() : null)) {
            this.processedMessageIds.m3d(message.getId(), bool);
            return;
        }
        Iterable iterable = (Iterable) this.mutedUsers.getValue();
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
        ChannelUserRead channelUserRead = (ChannelUserRead) this.read.getValue();
        if (channelUserRead != null && channelUserRead.getLastReceivedEventDate().after(eventReceivedDate)) {
            this.processedMessageIds.m3d(message.getId(), Boolean.TRUE);
            return;
        }
        if (channelUserRead != null) {
            updateRead(ChannelUserRead.copy$default(channelUserRead, null, eventReceivedDate, channelUserRead.getUnreadMessages() + 1, null, null, null, null, 121, null));
        }
        this.processedMessageIds.m3d(message.getId(), Boolean.TRUE);
    }

    public final void updateDelivered(ChannelUserRead read) {
        C13045h2 c13045h2;
        Object value;
        ChannelUserRead channelUserReadCopy$default;
        AbstractC22676k.m65750j(read, "read");
        ChannelUserRead channelUserRead = (ChannelUserRead) ((Map) ((C13045h2) this._reads).getValue()).get(read.getUser().getId());
        if (channelUserRead != null && (channelUserReadCopy$default = ChannelUserRead.copy$default(channelUserRead, read.getUser(), read.getLastReceivedEventDate(), 0, null, null, read.getLastDeliveredAt(), read.getLastDeliveredMessageId(), 28, null)) != null) {
            read = channelUserReadCopy$default;
        }
        InterfaceC13075p1 interfaceC13075p1 = this._reads;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, AbstractC25247g0.m73996e0((Map) value, new C23465k(read.getUser().getId(), read))));
    }

    public final void updateLastMessageAt(Message message) {
        AbstractC22676k.m65750j(message, "message");
        updateChannelData(new C19319d(message, ((Config) ((C13045h2) this._channelConfig).getValue()).getSkipLastMsgUpdateForSystemMsgs(), 1));
    }

    public final void updateMemberBan(String memberId, boolean banned, Date expiry, boolean shadow) {
        C13045h2 c13045h2;
        Object value;
        List list;
        InterfaceC13075p1 interfaceC13075p1 = this._members;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            list = (List) value;
            int size = list.size();
            ArrayList arrayListM74097F1 = null;
            for (int i13 = 0; i13 < size; i13++) {
                Member member = (Member) list.get(i13);
                if (AbstractC22676k.m65745e(member.getUser().getId(), memberId)) {
                    if (arrayListM74097F1 == null) {
                        arrayListM74097F1 = AbstractC25265s.m74097F1(list);
                    }
                    arrayListM74097F1.set(i13, member.copy((32766 & 1) != 0 ? member.user : null, (32766 & 2) != 0 ? member.createdAt : null, (32766 & 4) != 0 ? member.updatedAt : null, (32766 & 8) != 0 ? member.isInvited : null, (32766 & 16) != 0 ? member.inviteAcceptedAt : null, (32766 & 32) != 0 ? member.inviteRejectedAt : null, (32766 & 64) != 0 ? member.shadowBanned : shadow, (32766 & 128) != 0 ? member.banned : banned, (32766 & 256) != 0 ? member.channelRole : null, (32766 & 512) != 0 ? member.notificationsMuted : null, (32766 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? member.status : null, (32766 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? member.banExpires : expiry, (32766 & 4096) != 0 ? member.pinnedAt : null, (32766 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? member.archivedAt : null, (32766 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? member.extraData : null));
                }
            }
            if (arrayListM74097F1 != null) {
                list = arrayListM74097F1;
            }
        } while (!c13045h2.m36569i(value, list));
    }

    public final void updateMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        updateMessageById(message.getId(), new C19334a(this, message, 3));
    }

    public final void updateMessageById(String id4, Function1 transform) {
        C13045h2 c13045h2;
        Object value;
        List list;
        C13045h2 c13045h3;
        Object value2;
        List list2;
        C13045h2 c13045h4;
        Object value3;
        List list3;
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(transform, "transform");
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            list = (List) value;
            int size = list.size();
            ArrayList arrayListM74097F1 = null;
            for (int i13 = 0; i13 < size; i13++) {
                Object obj = list.get(i13);
                if (AbstractC22676k.m65745e(((Message) obj).getId(), id4)) {
                    if (arrayListM74097F1 == null) {
                        arrayListM74097F1 = AbstractC25265s.m74097F1(list);
                    }
                    arrayListM74097F1.set(i13, transform.invoke(obj));
                }
            }
            if (arrayListM74097F1 != null) {
                list = arrayListM74097F1;
            }
        } while (!c13045h2.m36569i(value, list));
        InterfaceC13075p1 interfaceC13075p2 = this._cachedLatestMessages;
        do {
            c13045h3 = (C13045h2) interfaceC13075p2;
            value2 = c13045h3.getValue();
            list2 = (List) value2;
            int size2 = list2.size();
            ArrayList arrayListM74097F2 = null;
            for (int i14 = 0; i14 < size2; i14++) {
                Object obj2 = list2.get(i14);
                if (AbstractC22676k.m65745e(((Message) obj2).getId(), id4)) {
                    if (arrayListM74097F2 == null) {
                        arrayListM74097F2 = AbstractC25265s.m74097F1(list2);
                    }
                    arrayListM74097F2.set(i14, transform.invoke(obj2));
                }
            }
            if (arrayListM74097F2 != null) {
                list2 = arrayListM74097F2;
            }
        } while (!c13045h3.m36569i(value2, list2));
        InterfaceC13075p1 interfaceC13075p3 = this._pinnedMessages;
        do {
            c13045h4 = (C13045h2) interfaceC13075p3;
            value3 = c13045h4.getValue();
            list3 = (List) value3;
            int size3 = list3.size();
            ArrayList arrayListM74097F3 = null;
            for (int i15 = 0; i15 < size3; i15++) {
                Object obj3 = list3.get(i15);
                if (AbstractC22676k.m65745e(((Message) obj3).getId(), id4)) {
                    if (arrayListM74097F3 == null) {
                        arrayListM74097F3 = AbstractC25265s.m74097F1(list3);
                    }
                    arrayListM74097F3.set(i15, transform.invoke(obj3));
                }
            }
            if (arrayListM74097F3 != null) {
                list3 = arrayListM74097F3;
            }
        } while (!c13045h4.m36569i(value3, list3));
    }

    public final void updateMessageFromEvent(Message eventMessage, InterfaceC4351m enrich) {
        AbstractC22676k.m65750j(eventMessage, "eventMessage");
        AbstractC22676k.m65750j(enrich, "enrich");
        updateMessageById(eventMessage.getId(), new C18468h(this, eventMessage, enrich, 16));
    }

    public final void updateQuotedMessageReferences(Message quotedMessage) {
        C13045h2 c13045h2;
        Object value;
        List list;
        C13045h2 c13045h3;
        Object value2;
        List list2;
        C13045h2 c13045h4;
        Object value3;
        List list3;
        AbstractC22676k.m65750j(quotedMessage, "quotedMessage");
        Set set = (Set) ((Map) ((C13045h2) this._quotedMessagesMap).getValue()).get(quotedMessage.getId());
        Set set2 = set;
        if (set2 == null || set2.isEmpty()) {
            return;
        }
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            list = (List) value;
            int size = list.size();
            ArrayList arrayListM74097F1 = null;
            for (int i13 = 0; i13 < size; i13++) {
                Message message = (Message) list.get(i13);
                if (set.contains(message.getId())) {
                    if (arrayListM74097F1 == null) {
                        arrayListM74097F1 = AbstractC25265s.m74097F1(list);
                    }
                    arrayListM74097F1.set(i13, message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : updateQuotedMessageReferences$preservedReplyTo(quotedMessage, this, message), ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false));
                }
            }
            if (arrayListM74097F1 != null) {
                list = arrayListM74097F1;
            }
        } while (!c13045h2.m36569i(value, list));
        InterfaceC13075p1 interfaceC13075p2 = this._cachedLatestMessages;
        do {
            c13045h3 = (C13045h2) interfaceC13075p2;
            value2 = c13045h3.getValue();
            list2 = (List) value2;
            int size2 = list2.size();
            ArrayList arrayListM74097F2 = null;
            for (int i14 = 0; i14 < size2; i14++) {
                Message message2 = (Message) list2.get(i14);
                if (set.contains(message2.getId())) {
                    if (arrayListM74097F2 == null) {
                        arrayListM74097F2 = AbstractC25265s.m74097F1(list2);
                    }
                    arrayListM74097F2.set(i14, message2.copy(((-1) & 1) != 0 ? message2.id : null, ((-1) & 2) != 0 ? message2.cid : null, ((-1) & 4) != 0 ? message2.text : null, ((-1) & 8) != 0 ? message2.html : null, ((-1) & 16) != 0 ? message2.parentId : null, ((-1) & 32) != 0 ? message2.command : null, ((-1) & 64) != 0 ? message2.attachments : null, ((-1) & 128) != 0 ? message2.mentionedUsersIds : null, ((-1) & 256) != 0 ? message2.mentionedUsers : null, ((-1) & 512) != 0 ? message2.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.reactionCounts : null, ((-1) & 4096) != 0 ? message2.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.syncStatus : null, ((-1) & 32768) != 0 ? message2.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message2.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message2.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message2.createdAt : null, ((-1) & 524288) != 0 ? message2.updatedAt : null, ((-1) & 1048576) != 0 ? message2.deletedAt : null, ((-1) & 2097152) != 0 ? message2.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message2.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message2.user : null, ((-1) & 16777216) != 0 ? message2.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message2.silent : false, ((-1) & 67108864) != 0 ? message2.shadowed : false, ((-1) & 134217728) != 0 ? message2.i18n : null, ((-1) & 268435456) != 0 ? message2.showInChannel : false, ((-1) & 536870912) != 0 ? message2.channelInfo : null, ((-1) & 1073741824) != 0 ? message2.replyTo : updateQuotedMessageReferences$preservedReplyTo(quotedMessage, this, message2), ((-1) & Integer.MIN_VALUE) != 0 ? message2.replyMessageId : null, (65535 & 1) != 0 ? message2.pinned : false, (65535 & 2) != 0 ? message2.pinnedAt : null, (65535 & 4) != 0 ? message2.pinExpires : null, (65535 & 8) != 0 ? message2.pinnedBy : null, (65535 & 16) != 0 ? message2.threadParticipants : null, (65535 & 32) != 0 ? message2.skipPushNotification : false, (65535 & 64) != 0 ? message2.skipEnrichUrl : false, (65535 & 128) != 0 ? message2.moderationDetails : null, (65535 & 256) != 0 ? message2.moderation : null, (65535 & 512) != 0 ? message2.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.restrictedVisibility : null, (65535 & 4096) != 0 ? message2.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.channelRole : null, (65535 & 32768) != 0 ? message2.deletedForMe : false));
                }
            }
            if (arrayListM74097F2 != null) {
                list2 = arrayListM74097F2;
            }
        } while (!c13045h3.m36569i(value2, list2));
        InterfaceC13075p1 interfaceC13075p3 = this._pinnedMessages;
        do {
            c13045h4 = (C13045h2) interfaceC13075p3;
            value3 = c13045h4.getValue();
            list3 = (List) value3;
            int size3 = list3.size();
            ArrayList arrayListM74097F3 = null;
            for (int i15 = 0; i15 < size3; i15++) {
                Message message3 = (Message) list3.get(i15);
                if (set.contains(message3.getId())) {
                    if (arrayListM74097F3 == null) {
                        arrayListM74097F3 = AbstractC25265s.m74097F1(list3);
                    }
                    arrayListM74097F3.set(i15, message3.copy(((-1) & 1) != 0 ? message3.id : null, ((-1) & 2) != 0 ? message3.cid : null, ((-1) & 4) != 0 ? message3.text : null, ((-1) & 8) != 0 ? message3.html : null, ((-1) & 16) != 0 ? message3.parentId : null, ((-1) & 32) != 0 ? message3.command : null, ((-1) & 64) != 0 ? message3.attachments : null, ((-1) & 128) != 0 ? message3.mentionedUsersIds : null, ((-1) & 256) != 0 ? message3.mentionedUsers : null, ((-1) & 512) != 0 ? message3.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message3.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message3.reactionCounts : null, ((-1) & 4096) != 0 ? message3.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message3.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message3.syncStatus : null, ((-1) & 32768) != 0 ? message3.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message3.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message3.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message3.createdAt : null, ((-1) & 524288) != 0 ? message3.updatedAt : null, ((-1) & 1048576) != 0 ? message3.deletedAt : null, ((-1) & 2097152) != 0 ? message3.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message3.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message3.user : null, ((-1) & 16777216) != 0 ? message3.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message3.silent : false, ((-1) & 67108864) != 0 ? message3.shadowed : false, ((-1) & 134217728) != 0 ? message3.i18n : null, ((-1) & 268435456) != 0 ? message3.showInChannel : false, ((-1) & 536870912) != 0 ? message3.channelInfo : null, ((-1) & 1073741824) != 0 ? message3.replyTo : updateQuotedMessageReferences$preservedReplyTo(quotedMessage, this, message3), ((-1) & Integer.MIN_VALUE) != 0 ? message3.replyMessageId : null, (65535 & 1) != 0 ? message3.pinned : false, (65535 & 2) != 0 ? message3.pinnedAt : null, (65535 & 4) != 0 ? message3.pinExpires : null, (65535 & 8) != 0 ? message3.pinnedBy : null, (65535 & 16) != 0 ? message3.threadParticipants : null, (65535 & 32) != 0 ? message3.skipPushNotification : false, (65535 & 64) != 0 ? message3.skipEnrichUrl : false, (65535 & 128) != 0 ? message3.moderationDetails : null, (65535 & 256) != 0 ? message3.moderation : null, (65535 & 512) != 0 ? message3.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message3.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message3.restrictedVisibility : null, (65535 & 4096) != 0 ? message3.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message3.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message3.channelRole : null, (65535 & 32768) != 0 ? message3.deletedForMe : false));
                }
            }
            if (arrayListM74097F3 != null) {
                list3 = arrayListM74097F3;
            }
        } while (!c13045h4.m36569i(value3, list3));
    }

    public final void updateRead(ChannelUserRead read) {
        AbstractC22676k.m65750j(read, "read");
        updateReads(AbstractC37056f.m118958J(read));
    }

    public final void updateReads(List<ChannelUserRead> reads) {
        C13045h2 c13045h2;
        Object value;
        Map map;
        LinkedHashMap linkedHashMap;
        AbstractC22676k.m65750j(reads, "reads");
        ChannelUserRead channelUserRead = (ChannelUserRead) this.read.getValue();
        if (channelUserRead != null) {
            List<ChannelUserRead> list = reads;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (ChannelUserRead channelUserReadMergeCurrentUserRead : list) {
                String userId = channelUserReadMergeCurrentUserRead.getUserId();
                User user = (User) this.currentUser.getValue();
                if (AbstractC22676k.m65745e(userId, user != null ? user.getId() : null)) {
                    channelUserReadMergeCurrentUserRead = mergeCurrentUserRead(channelUserRead, channelUserReadMergeCurrentUserRead);
                }
                arrayList.add(channelUserReadMergeCurrentUserRead);
            }
            reads = arrayList;
        }
        InterfaceC13075p1 interfaceC13075p1 = this._reads;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            map = (Map) value;
            List<ChannelUserRead> list2 = reads;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : list2) {
                linkedHashMap.put(((ChannelUserRead) obj).getUserId(), obj);
            }
        } while (!c13045h2.m36569i(value, AbstractC25247g0.m73995d0(map, linkedHashMap)));
    }

    public final void upsertCachedLatestMessages(List<Message> messages, boolean preserveAttachmentUrls) {
        C13045h2 c13045h2;
        Object value;
        List<Message> list;
        AbstractC22676k.m65750j(messages, "messages");
        if (messages.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : messages) {
            if (!shouldIgnoreUpsertion((Message) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        InterfaceC13075p1 interfaceC13075p1 = this._cachedLatestMessages;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            list = (List) value;
        } while (!c13045h2.m36569i(value, AbstractC25265s.m74158x1(25, ListKt.mergeSorted(list, preserveAttachmentUrls ? preserveAttachmentUrls(arrayList, list) : arrayList, new C22693x() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl$upsertCachedLatestMessages$1$1
            @Override // p715kotlin.jvm.internal.C22693x, j93.InterfaceC21490w
            public final Object get(Object obj2) {
                return ((Message) obj2).getId();
            }
        }, MESSAGE_COMPARATOR))));
    }

    public final void upsertCachedMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        if (shouldIgnoreUpsertion(message)) {
            return;
        }
        Message replyTo = message.getReplyTo();
        if (replyTo != null) {
            addQuotedMessage(replyTo.getId(), message.getId());
        }
        String replyMessageId = message.getReplyMessageId();
        if (replyMessageId != null) {
            addQuotedMessage(replyMessageId, message.getId());
        }
        Poll poll = message.getPoll();
        if (poll != null) {
            registerPollForMessage(poll, message.getId());
        }
        InterfaceC13075p1 interfaceC13075p1 = this._cachedLatestMessages;
        while (true) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Object value = c13045h2.getValue();
            Message message2 = message;
            if (c13045h2.m36569i(value, ListKt.upsertSortedBounded((List) value, message2, 25, new C22693x() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl$upsertCachedMessage$4$1
                @Override // p715kotlin.jvm.internal.C22693x, j93.InterfaceC21490w
                public final Object get(Object obj) {
                    return ((Message) obj).getId();
                }
            }, MESSAGE_COMPARATOR, new C19334a(this, message, 4)))) {
                return;
            } else {
                message = message2;
            }
        }
    }

    public final void upsertMember(Member member) {
        AbstractC22676k.m65750j(member, "member");
        upsertMembers(AbstractC37056f.m118958J(member));
    }

    public final void upsertMembers(List<Member> members) {
        C13045h2 c13045h2;
        Object value;
        LinkedHashMap linkedHashMapM74003l0;
        AbstractC22676k.m65750j(members, "members");
        InterfaceC13075p1 interfaceC13075p1 = this._members;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            List list = (List) value;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : list) {
                linkedHashMap.put(((Member) obj).getUserId(), obj);
            }
            linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(linkedHashMap);
            List<Member> list2 = members;
            int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W2 >= 16 ? iM73988W2 : 16);
            for (Object obj2 : list2) {
                linkedHashMap2.put(((Member) obj2).getUserId(), obj2);
            }
            linkedHashMapM74003l0.putAll(linkedHashMap2);
        } while (!c13045h2.m36569i(value, AbstractC25265s.m74093D1(linkedHashMapM74003l0.values())));
    }

    public final void upsertMessage(Message message) {
        C13045h2 c13045h2;
        Object value;
        C13045h2 c13045h3;
        Object value2;
        AbstractC22676k.m65750j(message, "message");
        if (shouldIgnoreUpsertion(message)) {
            return;
        }
        Message replyTo = message.getReplyTo();
        if (replyTo != null) {
            addQuotedMessage(replyTo.getId(), message.getId());
        }
        String replyMessageId = message.getReplyMessageId();
        if (replyMessageId != null) {
            addQuotedMessage(replyMessageId, message.getId());
        }
        Poll poll = message.getPoll();
        if (poll != null) {
            registerPollForMessage(poll, message.getId());
        }
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, ListKt.upsertSorted((List) value, message, new C22693x() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl$upsertMessage$4$1
            @Override // p715kotlin.jvm.internal.C22693x, j93.InterfaceC21490w
            public final Object get(Object obj) {
                return ((Message) obj).getId();
            }
        }, MESSAGE_COMPARATOR, new C19334a(this, message, 1))));
        if (MessageUtils.isEphemeral(message)) {
            InterfaceC13075p1 interfaceC13075p2 = this.localOnlyMessages;
            do {
                c13045h3 = (C13045h2) interfaceC13075p2;
                value2 = c13045h3.getValue();
            } while (!c13045h3.m36569i(value2, ListKt.upsertSorted((List) value2, message, new C22693x() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl$upsertMessage$5$1
                @Override // p715kotlin.jvm.internal.C22693x, j93.InterfaceC21490w
                public final Object get(Object obj) {
                    return ((Message) obj).getId();
                }
            }, MESSAGE_COMPARATOR, new C19334a(this, message, 2))));
        }
    }

    public final void upsertMessages(List<Message> messages, boolean preserveAttachmentUrls) {
        C13045h2 c13045h2;
        Object value;
        List<Message> list;
        AbstractC22676k.m65750j(messages, "messages");
        ArrayList<Message> arrayList = new ArrayList();
        for (Object obj : messages) {
            if (!shouldIgnoreUpsertion((Message) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (Message message : arrayList) {
            Message replyTo = message.getReplyTo();
            if (replyTo != null) {
                addQuotedMessage(replyTo.getId(), message.getId());
            }
            String replyMessageId = message.getReplyMessageId();
            if (replyMessageId != null) {
                addQuotedMessage(replyMessageId, message.getId());
            }
            Poll poll = message.getPoll();
            if (poll != null) {
                registerPollForMessage(poll, message.getId());
            }
        }
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            list = (List) value;
        } while (!c13045h2.m36569i(value, ListKt.mergeSorted(list, preserveAttachmentUrls ? preserveAttachmentUrls(arrayList, list) : arrayList, new C22693x() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl$upsertMessages$4$1
            @Override // p715kotlin.jvm.internal.C22693x, j93.InterfaceC21490w
            public final Object get(Object obj2) {
                return ((Message) obj2).getId();
            }
        }, MESSAGE_COMPARATOR)));
    }

    public final void upsertPoll(Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        this.polls.put(poll.getId(), poll);
        Set<String> set = this.messagesWithPolls.get(poll.getId());
        if (set == null) {
            set = C25235a0.f99113w;
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            Message messageById = getMessageById(it.next());
            if (messageById != null) {
                updateMessage(messageById.copy(((-1) & 1) != 0 ? messageById.id : null, ((-1) & 2) != 0 ? messageById.cid : null, ((-1) & 4) != 0 ? messageById.text : null, ((-1) & 8) != 0 ? messageById.html : null, ((-1) & 16) != 0 ? messageById.parentId : null, ((-1) & 32) != 0 ? messageById.command : null, ((-1) & 64) != 0 ? messageById.attachments : null, ((-1) & 128) != 0 ? messageById.mentionedUsersIds : null, ((-1) & 256) != 0 ? messageById.mentionedUsers : null, ((-1) & 512) != 0 ? messageById.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageById.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageById.reactionCounts : null, ((-1) & 4096) != 0 ? messageById.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageById.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageById.syncStatus : null, ((-1) & 32768) != 0 ? messageById.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? messageById.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? messageById.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? messageById.createdAt : null, ((-1) & 524288) != 0 ? messageById.updatedAt : null, ((-1) & 1048576) != 0 ? messageById.deletedAt : null, ((-1) & 2097152) != 0 ? messageById.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? messageById.createdLocallyAt : null, ((-1) & 8388608) != 0 ? messageById.user : null, ((-1) & 16777216) != 0 ? messageById.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? messageById.silent : false, ((-1) & 67108864) != 0 ? messageById.shadowed : false, ((-1) & 134217728) != 0 ? messageById.i18n : null, ((-1) & 268435456) != 0 ? messageById.showInChannel : false, ((-1) & 536870912) != 0 ? messageById.channelInfo : null, ((-1) & 1073741824) != 0 ? messageById.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? messageById.replyMessageId : null, (65535 & 1) != 0 ? messageById.pinned : false, (65535 & 2) != 0 ? messageById.pinnedAt : null, (65535 & 4) != 0 ? messageById.pinExpires : null, (65535 & 8) != 0 ? messageById.pinnedBy : null, (65535 & 16) != 0 ? messageById.threadParticipants : null, (65535 & 32) != 0 ? messageById.skipPushNotification : false, (65535 & 64) != 0 ? messageById.skipEnrichUrl : false, (65535 & 128) != 0 ? messageById.moderationDetails : null, (65535 & 256) != 0 ? messageById.moderation : null, (65535 & 512) != 0 ? messageById.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageById.poll : poll, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageById.restrictedVisibility : null, (65535 & 4096) != 0 ? messageById.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageById.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? messageById.channelRole : null, (65535 & 32768) != 0 ? messageById.deletedForMe : false));
            }
        }
    }

    public final void upsertUserPresence(User user) {
        InterfaceC13075p1 interfaceC13075p1;
        C13045h2 c13045h2;
        Object obj;
        List list;
        int i13;
        int i14;
        InterfaceC13075p1 interfaceC13075p2;
        C13045h2 c13045h3;
        Object obj2;
        List list2;
        int i15;
        int i16;
        InterfaceC13075p1 interfaceC13075p3;
        C13045h2 c13045h4;
        Object obj3;
        List list3;
        int i17;
        int i18;
        InterfaceC13075p1 interfaceC13075p4;
        C13045h2 c13045h5;
        Object obj4;
        List list4;
        int i19;
        int i24;
        User user2 = user;
        AbstractC22676k.m65750j(user2, "user");
        InterfaceC13075p1 interfaceC13075p5 = this._members;
        while (true) {
            C13045h2 c13045h6 = (C13045h2) interfaceC13075p5;
            Object value = c13045h6.getValue();
            List list5 = (List) value;
            int size = list5.size();
            int i25 = 0;
            ArrayList arrayListM74097F1 = null;
            while (i25 < size) {
                Member member = (Member) list5.get(i25);
                if (AbstractC22676k.m65745e(member.getUserId(), user2.getId())) {
                    if (arrayListM74097F1 == null) {
                        arrayListM74097F1 = AbstractC25265s.m74097F1(list5);
                    }
                    ArrayList arrayList = arrayListM74097F1;
                    c13045h5 = c13045h6;
                    list4 = list5;
                    i19 = size;
                    interfaceC13075p4 = interfaceC13075p5;
                    obj4 = value;
                    i24 = i25;
                    arrayList.set(i24, member.copy((32766 & 1) != 0 ? member.user : user2, (32766 & 2) != 0 ? member.createdAt : null, (32766 & 4) != 0 ? member.updatedAt : null, (32766 & 8) != 0 ? member.isInvited : null, (32766 & 16) != 0 ? member.inviteAcceptedAt : null, (32766 & 32) != 0 ? member.inviteRejectedAt : null, (32766 & 64) != 0 ? member.shadowBanned : false, (32766 & 128) != 0 ? member.banned : false, (32766 & 256) != 0 ? member.channelRole : null, (32766 & 512) != 0 ? member.notificationsMuted : null, (32766 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? member.status : null, (32766 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? member.banExpires : null, (32766 & 4096) != 0 ? member.pinnedAt : null, (32766 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? member.archivedAt : null, (32766 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? member.extraData : null));
                    arrayListM74097F1 = arrayList;
                } else {
                    interfaceC13075p4 = interfaceC13075p5;
                    c13045h5 = c13045h6;
                    obj4 = value;
                    list4 = list5;
                    i19 = size;
                    i24 = i25;
                }
                i25 = i24 + 1;
                c13045h6 = c13045h5;
                list5 = list4;
                size = i19;
                interfaceC13075p5 = interfaceC13075p4;
                value = obj4;
            }
            InterfaceC13075p1 interfaceC13075p6 = interfaceC13075p5;
            if (c13045h6.m36569i(value, arrayListM74097F1 == null ? list5 : arrayListM74097F1)) {
                break;
            }
            user2 = user;
            interfaceC13075p5 = interfaceC13075p6;
        }
        ChannelStateImpl channelStateImpl = this;
        InterfaceC13075p1 interfaceC13075p7 = channelStateImpl._watchers;
        while (true) {
            C13045h2 c13045h7 = (C13045h2) interfaceC13075p7;
            Object value2 = c13045h7.getValue();
            List list6 = (List) value2;
            int size2 = list6.size();
            ArrayList arrayListM74097F2 = null;
            for (int i26 = 0; i26 < size2; i26++) {
                if (AbstractC22676k.m65745e(((User) list6.get(i26)).getId(), user2.getId())) {
                    if (arrayListM74097F2 == null) {
                        arrayListM74097F2 = AbstractC25265s.m74097F1(list6);
                    }
                    arrayListM74097F2.set(i26, user2);
                }
            }
            if (arrayListM74097F2 != null) {
                list6 = arrayListM74097F2;
            }
            if (c13045h7.m36569i(value2, list6)) {
                break;
            }
            channelStateImpl = this;
            user2 = user;
        }
        ChannelData channelData = (ChannelData) ((C13045h2) channelStateImpl._channelData).getValue();
        if (channelData != null && AbstractC22676k.m65745e(channelData.getCreatedBy().getId(), user2.getId())) {
            ((C13045h2) channelStateImpl._channelData).m36570j(ChannelData.copy$default(channelData, null, null, null, null, user, 0, false, null, null, null, 0, null, null, null, null, null, null, null, null, null, 1048559, null));
        }
        InterfaceC13075p1 interfaceC13075p8 = channelStateImpl._messages;
        while (true) {
            C13045h2 c13045h8 = (C13045h2) interfaceC13075p8;
            Object value3 = c13045h8.getValue();
            List list7 = (List) value3;
            int size3 = list7.size();
            int i27 = 0;
            ArrayList arrayListM74097F3 = null;
            while (i27 < size3) {
                Message message = (Message) list7.get(i27);
                if (AbstractC22676k.m65745e(message.getUser().getId(), user.getId())) {
                    if (arrayListM74097F3 == null) {
                        arrayListM74097F3 = AbstractC25265s.m74097F1(list7);
                    }
                    ArrayList arrayList2 = arrayListM74097F3;
                    interfaceC13075p3 = interfaceC13075p8;
                    c13045h4 = c13045h8;
                    i17 = size3;
                    i18 = i27;
                    obj3 = value3;
                    list3 = list7;
                    arrayList2.set(i18, message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : user, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false));
                    arrayListM74097F3 = arrayList2;
                } else {
                    interfaceC13075p3 = interfaceC13075p8;
                    c13045h4 = c13045h8;
                    obj3 = value3;
                    list3 = list7;
                    i17 = size3;
                    i18 = i27;
                }
                i27 = i18 + 1;
                list7 = list3;
                interfaceC13075p8 = interfaceC13075p3;
                c13045h8 = c13045h4;
                size3 = i17;
                value3 = obj3;
            }
            InterfaceC13075p1 interfaceC13075p9 = interfaceC13075p8;
            if (c13045h8.m36569i(value3, arrayListM74097F3 == null ? list7 : arrayListM74097F3)) {
                break;
            } else {
                interfaceC13075p8 = interfaceC13075p9;
            }
        }
        InterfaceC13075p1 interfaceC13075p10 = this._cachedLatestMessages;
        while (true) {
            C13045h2 c13045h9 = (C13045h2) interfaceC13075p10;
            Object value4 = c13045h9.getValue();
            List list8 = (List) value4;
            int size4 = list8.size();
            int i28 = 0;
            ArrayList arrayListM74097F4 = null;
            while (i28 < size4) {
                Message message2 = (Message) list8.get(i28);
                if (AbstractC22676k.m65745e(message2.getUser().getId(), user.getId())) {
                    if (arrayListM74097F4 == null) {
                        arrayListM74097F4 = AbstractC25265s.m74097F1(list8);
                    }
                    ArrayList arrayList3 = arrayListM74097F4;
                    c13045h3 = c13045h9;
                    i15 = size4;
                    i16 = i28;
                    interfaceC13075p2 = interfaceC13075p10;
                    obj2 = value4;
                    list2 = list8;
                    arrayList3.set(i16, message2.copy(((-1) & 1) != 0 ? message2.id : null, ((-1) & 2) != 0 ? message2.cid : null, ((-1) & 4) != 0 ? message2.text : null, ((-1) & 8) != 0 ? message2.html : null, ((-1) & 16) != 0 ? message2.parentId : null, ((-1) & 32) != 0 ? message2.command : null, ((-1) & 64) != 0 ? message2.attachments : null, ((-1) & 128) != 0 ? message2.mentionedUsersIds : null, ((-1) & 256) != 0 ? message2.mentionedUsers : null, ((-1) & 512) != 0 ? message2.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.reactionCounts : null, ((-1) & 4096) != 0 ? message2.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.syncStatus : null, ((-1) & 32768) != 0 ? message2.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message2.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message2.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message2.createdAt : null, ((-1) & 524288) != 0 ? message2.updatedAt : null, ((-1) & 1048576) != 0 ? message2.deletedAt : null, ((-1) & 2097152) != 0 ? message2.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message2.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message2.user : user, ((-1) & 16777216) != 0 ? message2.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message2.silent : false, ((-1) & 67108864) != 0 ? message2.shadowed : false, ((-1) & 134217728) != 0 ? message2.i18n : null, ((-1) & 268435456) != 0 ? message2.showInChannel : false, ((-1) & 536870912) != 0 ? message2.channelInfo : null, ((-1) & 1073741824) != 0 ? message2.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message2.replyMessageId : null, (65535 & 1) != 0 ? message2.pinned : false, (65535 & 2) != 0 ? message2.pinnedAt : null, (65535 & 4) != 0 ? message2.pinExpires : null, (65535 & 8) != 0 ? message2.pinnedBy : null, (65535 & 16) != 0 ? message2.threadParticipants : null, (65535 & 32) != 0 ? message2.skipPushNotification : false, (65535 & 64) != 0 ? message2.skipEnrichUrl : false, (65535 & 128) != 0 ? message2.moderationDetails : null, (65535 & 256) != 0 ? message2.moderation : null, (65535 & 512) != 0 ? message2.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message2.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message2.restrictedVisibility : null, (65535 & 4096) != 0 ? message2.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message2.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message2.channelRole : null, (65535 & 32768) != 0 ? message2.deletedForMe : false));
                    arrayListM74097F4 = arrayList3;
                } else {
                    interfaceC13075p2 = interfaceC13075p10;
                    c13045h3 = c13045h9;
                    obj2 = value4;
                    list2 = list8;
                    i15 = size4;
                    i16 = i28;
                }
                i28 = i16 + 1;
                list8 = list2;
                interfaceC13075p10 = interfaceC13075p2;
                c13045h9 = c13045h3;
                size4 = i15;
                value4 = obj2;
            }
            InterfaceC13075p1 interfaceC13075p11 = interfaceC13075p10;
            if (c13045h9.m36569i(value4, arrayListM74097F4 == null ? list8 : arrayListM74097F4)) {
                break;
            } else {
                interfaceC13075p10 = interfaceC13075p11;
            }
        }
        InterfaceC13075p1 interfaceC13075p12 = this._pinnedMessages;
        while (true) {
            C13045h2 c13045h10 = (C13045h2) interfaceC13075p12;
            Object value5 = c13045h10.getValue();
            List list9 = (List) value5;
            int size5 = list9.size();
            int i29 = 0;
            ArrayList arrayListM74097F5 = null;
            while (i29 < size5) {
                Message message3 = (Message) list9.get(i29);
                if (AbstractC22676k.m65745e(message3.getUser().getId(), user.getId())) {
                    if (arrayListM74097F5 == null) {
                        arrayListM74097F5 = AbstractC25265s.m74097F1(list9);
                    }
                    ArrayList arrayList4 = arrayListM74097F5;
                    interfaceC13075p1 = interfaceC13075p12;
                    c13045h2 = c13045h10;
                    i13 = size5;
                    i14 = i29;
                    obj = value5;
                    list = list9;
                    arrayList4.set(i14, message3.copy(((-1) & 1) != 0 ? message3.id : null, ((-1) & 2) != 0 ? message3.cid : null, ((-1) & 4) != 0 ? message3.text : null, ((-1) & 8) != 0 ? message3.html : null, ((-1) & 16) != 0 ? message3.parentId : null, ((-1) & 32) != 0 ? message3.command : null, ((-1) & 64) != 0 ? message3.attachments : null, ((-1) & 128) != 0 ? message3.mentionedUsersIds : null, ((-1) & 256) != 0 ? message3.mentionedUsers : null, ((-1) & 512) != 0 ? message3.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message3.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message3.reactionCounts : null, ((-1) & 4096) != 0 ? message3.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message3.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message3.syncStatus : null, ((-1) & 32768) != 0 ? message3.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message3.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message3.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message3.createdAt : null, ((-1) & 524288) != 0 ? message3.updatedAt : null, ((-1) & 1048576) != 0 ? message3.deletedAt : null, ((-1) & 2097152) != 0 ? message3.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message3.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message3.user : user, ((-1) & 16777216) != 0 ? message3.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message3.silent : false, ((-1) & 67108864) != 0 ? message3.shadowed : false, ((-1) & 134217728) != 0 ? message3.i18n : null, ((-1) & 268435456) != 0 ? message3.showInChannel : false, ((-1) & 536870912) != 0 ? message3.channelInfo : null, ((-1) & 1073741824) != 0 ? message3.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message3.replyMessageId : null, (65535 & 1) != 0 ? message3.pinned : false, (65535 & 2) != 0 ? message3.pinnedAt : null, (65535 & 4) != 0 ? message3.pinExpires : null, (65535 & 8) != 0 ? message3.pinnedBy : null, (65535 & 16) != 0 ? message3.threadParticipants : null, (65535 & 32) != 0 ? message3.skipPushNotification : false, (65535 & 64) != 0 ? message3.skipEnrichUrl : false, (65535 & 128) != 0 ? message3.moderationDetails : null, (65535 & 256) != 0 ? message3.moderation : null, (65535 & 512) != 0 ? message3.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message3.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message3.restrictedVisibility : null, (65535 & 4096) != 0 ? message3.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message3.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message3.channelRole : null, (65535 & 32768) != 0 ? message3.deletedForMe : false));
                    arrayListM74097F5 = arrayList4;
                } else {
                    interfaceC13075p1 = interfaceC13075p12;
                    c13045h2 = c13045h10;
                    obj = value5;
                    list = list9;
                    i13 = size5;
                    i14 = i29;
                }
                i29 = i14 + 1;
                list9 = list;
                interfaceC13075p12 = interfaceC13075p1;
                c13045h10 = c13045h2;
                size5 = i13;
                value5 = obj;
            }
            InterfaceC13075p1 interfaceC13075p13 = interfaceC13075p12;
            if (c13045h10.m36569i(value5, arrayListM74097F5 == null ? list9 : arrayListM74097F5)) {
                return;
            } else {
                interfaceC13075p12 = interfaceC13075p13;
            }
        }
    }

    public final void upsertWatchers(List<User> watchers, int watcherCount) {
        C13045h2 c13045h2;
        Object value;
        LinkedHashMap linkedHashMapM74003l0;
        C13045h2 c13045h3;
        Object value2;
        AbstractC22676k.m65750j(watchers, "watchers");
        InterfaceC13075p1 interfaceC13075p1 = this._watchers;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            List list = (List) value;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : list) {
                linkedHashMap.put(((User) obj).getId(), obj);
            }
            linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(linkedHashMap);
            for (User user : watchers) {
                linkedHashMapM74003l0.put(user.getId(), user);
            }
        } while (!c13045h2.m36569i(value, AbstractC25265s.m74152u1(linkedHashMapM74003l0.values(), new ChannelStateImpl$upsertWatchers$lambda$134$$inlined$sortedBy$1())));
        InterfaceC13075p1 interfaceC13075p2 = this._watcherCount;
        do {
            c13045h3 = (C13045h2) interfaceC13075p2;
            value2 = c13045h3.getValue();
            ((Number) value2).intValue();
        } while (!c13045h3.m36569i(value2, Integer.valueOf(Math.max(0, watcherCount))));
    }

    private final List<Message> preserveAttachmentUrls(List<Message> newMessages, List<Message> oldMessages) {
        List<Message> list = oldMessages;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : list) {
            linkedHashMap.put(((Message) obj).getId(), obj);
        }
        return this.attachmentUrlValidator.updateValidAttachmentsUrl$stream_chat_android_client_release(newMessages, linkedHashMap);
    }

    public final void removeMember(NotificationInviteRejectedEvent event) {
        AbstractC22676k.m65750j(event, "event");
        deleteMemberAndDecrementMemberCount(event.getMember().getUserId());
    }

    public final void updateChannelData(HasChannel event) {
        AbstractC22676k.m65750j(event, "event");
        updateChannelData(new C19316a(event, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ChannelStateImpl(String str, String str2, InterfaceC13037f2 interfaceC13037f2, InterfaceC13037f2 interfaceC13037f3, InterfaceC13037f2 interfaceC13037f4, InterfaceC13037f2 interfaceC13037f5, Integer num, MessagesPaginationManager messagesPaginationManager, AttachmentUrlValidator attachmentUrlValidator, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        AttachmentUrlValidator attachmentUrlValidator2;
        MessagesPaginationManager messagesPaginationManagerImpl = (i13 & 128) != 0 ? new MessagesPaginationManagerImpl() : messagesPaginationManager;
        if ((i13 & 256) != 0) {
            attachmentUrlValidator2 = new AttachmentUrlValidator(null, 1, 0 == true ? 1 : 0);
        } else {
            attachmentUrlValidator2 = attachmentUrlValidator;
        }
        this(str, str2, interfaceC13037f2, interfaceC13037f3, interfaceC13037f4, interfaceC13037f5, num, messagesPaginationManagerImpl, attachmentUrlValidator2);
    }
}
