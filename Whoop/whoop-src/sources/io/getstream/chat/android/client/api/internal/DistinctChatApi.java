package io.getstream.chat.android.client.api.internal;

import a41.C0372h;
import am2.C1012d;
import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import ce3.C4510k;
import com.mapbox.maps.MapboxMap;
import com.whoop.profile.view.edit.C9775f;
import i01.C17841d;
import io.getstream.chat.android.client.api.ChatApi;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.api.models.GetThreadOptions;
import io.getstream.chat.android.client.api.models.PinnedMessagesPagination;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.models.QueryThreadsRequest;
import io.getstream.chat.android.client.api.models.QueryUsersRequest;
import io.getstream.chat.android.client.api.models.SendActionRequest;
import io.getstream.chat.android.client.api.models.UpdatePollRequest;
import io.getstream.chat.android.client.api2.optimisation.hash.ChannelQueryKey;
import io.getstream.chat.android.client.api2.optimisation.hash.GetNewerRepliesHash;
import io.getstream.chat.android.client.api2.optimisation.hash.GetPinnedMessagesHash;
import io.getstream.chat.android.client.api2.optimisation.hash.GetReactionsHash;
import io.getstream.chat.android.client.api2.optimisation.hash.GetRepliesHash;
import io.getstream.chat.android.client.api2.optimisation.hash.QueryBanedUsersHash;
import io.getstream.chat.android.client.api2.optimisation.hash.QueryMembersHash;
import io.getstream.chat.android.client.utils.ProgressCallback;
import io.getstream.chat.android.models.BannedUsersSort;
import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.models.Device;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.DraftsSort;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Location;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.MemberData;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageReminder;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.PollOption;
import io.getstream.chat.android.models.PushPreferenceLevel;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.Vote;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23454a0;
import o23.C27480j;
import o23.InterfaceC27474d;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p133f1.C13990x;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000Ð\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 Â\u00022\u00020\u0001:\u0002Â\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\f2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00140\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010#JI\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00150&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\f2\u0006\u0010\u000b\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/Jm\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00140\f2\u0006\u00101\u001a\u0002002\f\u0010'\u001a\b\u0012\u0004\u0012\u0002020&2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u00104\u001a\u0004\u0018\u0001032\b\u00105\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001032\b\u00107\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b9\u0010:J_\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00140\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00101\u001a\u0002002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020;0&2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u0014H\u0016¢\u0006\u0004\b=\u0010>J \u0010B\u001a\u00020A2\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\bB\u0010CJ\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\fH\u0096\u0001¢\u0006\u0004\bE\u0010FJ8\u0010L\u001a\b\u0012\u0004\u0012\u00020K0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010H\u001a\u00020G2\b\u0010J\u001a\u0004\u0018\u00010IH\u0097\u0001¢\u0006\u0004\bL\u0010MJ8\u0010N\u001a\b\u0012\u0004\u0012\u00020K0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010H\u001a\u00020G2\b\u0010J\u001a\u0004\u0018\u00010IH\u0097\u0001¢\u0006\u0004\bN\u0010MJ.\u0010P\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\bP\u0010QJ\u001e\u0010P\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010O\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\bP\u0010#J.\u0010R\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\bR\u0010QJ\u001e\u0010R\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010O\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\bR\u0010#J(\u0010T\u001a\b\u0012\u0004\u0012\u00020K0\f2\u0006\u0010H\u001a\u00020G2\b\u0010S\u001a\u0004\u0018\u00010IH\u0097\u0001¢\u0006\u0004\bT\u0010UJ(\u0010V\u001a\b\u0012\u0004\u0012\u00020K0\f2\u0006\u0010H\u001a\u00020G2\b\u0010S\u001a\u0004\u0018\u00010IH\u0097\u0001¢\u0006\u0004\bV\u0010UJ\u001e\u0010Y\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010X\u001a\u00020WH\u0097\u0001¢\u0006\u0004\bY\u0010ZJ\u001e\u0010\\\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010[\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\\\u0010#J\u001c\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020W0\u00140\fH\u0097\u0001¢\u0006\u0004\b]\u0010FJ\u001e\u0010a\u001a\b\u0012\u0004\u0012\u00020`0\f2\u0006\u0010_\u001a\u00020^H\u0097\u0001¢\u0006\u0004\ba\u0010bJ\u001e\u0010d\u001a\b\u0012\u0004\u0012\u00020`0\f2\u0006\u0010c\u001a\u000203H\u0097\u0001¢\u0006\u0004\bd\u0010eJ&\u0010g\u001a\b\u0012\u0004\u0012\u00020`0\f2\u0006\u0010f\u001a\u00020\u00072\u0006\u0010_\u001a\u00020^H\u0097\u0001¢\u0006\u0004\bg\u0010hJ&\u0010i\u001a\b\u0012\u0004\u0012\u00020`0\f2\u0006\u0010f\u001a\u00020\u00072\u0006\u0010c\u001a\u000203H\u0097\u0001¢\u0006\u0004\bi\u0010jJT\u0010o\u001a\b\u0012\u0004\u0012\u00020n0\f2\u0006\u0010k\u001a\u0002002\u0006\u0010l\u001a\u0002002\b\u0010\u001e\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010m\u001a\u0004\u0018\u00010\u00072\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010&H\u0097\u0001¢\u0006\u0004\bo\u0010pJL\u0010r\u001a\b\u0012\u0004\u0012\u00020q0\f2\u0006\u0010\u0010\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u0001002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010m\u001a\u0004\u0018\u00010\u00072\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010&H\u0097\u0001¢\u0006\u0004\br\u0010sJ.\u0010x\u001a\b\u0012\u0004\u0012\u00020\u001f0\f2\u0006\u0010t\u001a\u00020\u001f2\u0006\u0010v\u001a\u00020u2\u0006\u0010w\u001a\u00020uH\u0097\u0001¢\u0006\u0004\bx\u0010yJ&\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010z\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b{\u0010|J/\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010}\u001a\u00020u2\u0006\u0010~\u001a\u00020uH\u0097\u0001¢\u0006\u0005\b\u007f\u0010\u0080\u0001J#\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0097\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J2\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0007\u0010\u0085\u0001\u001a\u00020\u0015H\u0097\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J4\u0010\u0089\u0001\u001a\t\u0012\u0005\u0012\u00030\u0088\u00010\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u0085\u0001\u001a\u00030\u0088\u0001H\u0097\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J3\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u0085\u0001\u001a\u00030\u0088\u0001H\u0097\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008a\u0001J4\u0010\u008c\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0088\u00010\u00140\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0097\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001JE\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\f2\u0006\u00101\u001a\u0002002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010m\u001a\u0004\u0018\u00010\u00072\r\u0010'\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010&H\u0097\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J4\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0012H\u0097\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J(\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b\u0095\u0001\u0010|J\"\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u0007\u0010\u0085\u0001\u001a\u00020\u0015H\u0097\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001JP\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0015\u0010\u009a\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u00012\r\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u0007\u0010\u009c\u0001\u001a\u00020uH\u0097\u0001¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J(\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b\u009f\u0001\u0010|J0\u0010¢\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030 \u00010\u00140\f2\u000e\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030 \u00010\u0014H\u0097\u0001¢\u0006\u0006\b¢\u0001\u0010£\u0001J!\u0010¥\u0001\u001a\t\u0012\u0005\u0012\u00030¤\u00010\f2\u0006\u0010?\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b¥\u0001\u0010#J \u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010?\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b¦\u0001\u0010#J\u001f\u0010§\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¤\u00010\u00140\fH\u0097\u0001¢\u0006\u0005\b§\u0001\u0010FJN\u0010¨\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030 \u00010\u00140\f2\u0006\u0010[\u001a\u00020\u00072\u0015\u0010\u009a\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u00012\r\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0097\u0001¢\u0006\u0006\b¨\u0001\u0010©\u0001JK\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0015\u0010ª\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u00012\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0015H\u0097\u0001¢\u0006\u0006\b«\u0001\u0010¬\u0001JO\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0015\u0010\u009a\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u00012\r\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0097\u0001¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J1\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0007\u0010¯\u0001\u001a\u00020\u0012H\u0097\u0001¢\u0006\u0005\b°\u0001\u0010\u0017J(\u0010±\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b±\u0001\u0010|J\u0019\u0010³\u0001\u001a\t\u0012\u0005\u0012\u00030²\u00010\fH\u0096\u0001¢\u0006\u0005\b³\u0001\u0010FJ0\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b´\u0001\u0010QJ(\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00020A0\f2\r\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0097\u0001¢\u0006\u0006\b¶\u0001\u0010£\u0001J1\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0007\u0010·\u0001\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b¸\u0001\u0010QJI\u0010º\u0001\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\t\u0010¹\u0001\u001a\u0004\u0018\u0001032\t\u0010·\u0001\u001a\u0004\u0018\u00010\u0007H\u0097\u0001¢\u0006\u0006\bº\u0001\u0010»\u0001J(\u0010¼\u0001\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b¼\u0001\u0010|J2\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0007\u0010½\u0001\u001a\u00020uH\u0097\u0001¢\u0006\u0006\b¾\u0001\u0010¿\u0001J4\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\t\u0010À\u0001\u001a\u0004\u0018\u00010\u0015H\u0097\u0001¢\u0006\u0006\bÁ\u0001\u0010\u0087\u0001J(\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\bÂ\u0001\u0010|J\u0019\u0010Ä\u0001\u001a\t\u0012\u0005\u0012\u00030Ã\u00010\fH\u0097\u0001¢\u0006\u0005\bÄ\u0001\u0010FJ\u0018\u0010Å\u0001\u001a\b\u0012\u0004\u0012\u00020A0\fH\u0097\u0001¢\u0006\u0005\bÅ\u0001\u0010FJ3\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0007H\u0097\u0001¢\u0006\u0005\bÆ\u0001\u0010QJ(\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\bÇ\u0001\u0010|J\u0018\u0010È\u0001\u001a\b\u0012\u0004\u0012\u00020A0\fH\u0097\u0001¢\u0006\u0005\bÈ\u0001\u0010FJ*\u0010Ë\u0001\u001a\t\u0012\u0005\u0012\u00030Ê\u00010\f2\u0006\u0010?\u001a\u00020\u00072\u0007\u0010É\u0001\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\bË\u0001\u0010|J*\u0010Í\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030 \u00010\u00140\f2\b\u0010Í\u0001\u001a\u00030Ì\u0001H\u0097\u0001¢\u0006\u0006\bÍ\u0001\u0010Î\u0001Jc\u0010Ò\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\r\u0010<\u001a\t\u0012\u0005\u0012\u00030Ï\u00010\u00142\t\u0010À\u0001\u001a\u0004\u0018\u00010\u00152\t\u0010Ð\u0001\u001a\u0004\u0018\u00010u2\t\u0010Ñ\u0001\u001a\u0004\u0018\u0001032\b\u0010w\u001a\u0004\u0018\u00010uH\u0097\u0001¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001JL\u0010Ô\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\t\u0010À\u0001\u001a\u0004\u0018\u00010\u00152\b\u0010w\u001a\u0004\u0018\u00010uH\u0097\u0001¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001JL\u0010Ö\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\t\u0010À\u0001\u001a\u0004\u0018\u00010\u00152\b\u0010w\u001a\u0004\u0018\u00010uH\u0097\u0001¢\u0006\u0006\bÖ\u0001\u0010Õ\u0001JW\u0010×\u0001\u001a\b\u0012\u0004\u0012\u00020;0\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u00072\u0015\u0010\u009a\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u00012\r\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0097\u0001¢\u0006\u0006\b×\u0001\u0010Ø\u0001J-\u0010Ú\u0001\u001a\t\u0012\u0005\u0012\u00030Ã\u00010\f2\u0006\u0010?\u001a\u00020\u00072\t\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0012H\u0097\u0001¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J \u0010Ü\u0001\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010?\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\bÜ\u0001\u0010#JC\u0010à\u0001\u001a\t\u0012\u0005\u0012\u00030ß\u00010\f2\u0006\u0010?\u001a\u00020\u00072\t\u0010Ý\u0001\u001a\u0004\u0018\u00010\u00072\u0014\u0010Þ\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0098\u0001H\u0097\u0001¢\u0006\u0006\bà\u0001\u0010á\u0001J!\u0010â\u0001\u001a\t\u0012\u0005\u0012\u00030ß\u00010\f2\u0006\u0010?\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\bâ\u0001\u0010#JC\u0010ã\u0001\u001a\t\u0012\u0005\u0012\u00030ß\u00010\f2\u0006\u0010\u0010\u001a\u00020\u00072\t\u0010Ý\u0001\u001a\u0004\u0018\u00010\u00072\u0014\u0010Þ\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0098\u0001H\u0097\u0001¢\u0006\u0006\bã\u0001\u0010á\u0001J!\u0010ä\u0001\u001a\t\u0012\u0005\u0012\u00030ß\u00010\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\bä\u0001\u0010#JQ\u0010ç\u0001\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0007\u0010å\u0001\u001a\u00020\u00072\t\u0010Ù\u0001\u001a\u0004\u0018\u00010\u00122\t\u0010Ý\u0001\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0007\u0010æ\u0001\u001a\u00020uH\u0097\u0001¢\u0006\u0006\bç\u0001\u0010è\u0001J;\u0010é\u0001\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0007\u0010å\u0001\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0007\u0010æ\u0001\u001a\u00020uH\u0097\u0001¢\u0006\u0006\bé\u0001\u0010ê\u0001JK\u0010í\u0001\u001a\t\u0012\u0005\u0012\u00030ì\u00010\f2\u0007\u0010ë\u0001\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0016\u0010ª\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u0099\u0001\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u0001H\u0097\u0001¢\u0006\u0006\bí\u0001\u0010î\u0001J)\u0010ð\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0007\u0010ï\u0001\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\bð\u0001\u0010|J!\u0010ò\u0001\u001a\t\u0012\u0005\u0012\u00030ñ\u00010\f2\u0006\u0010O\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\bò\u0001\u0010#J8\u0010õ\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ì\u00010\u00140\f2\r\u0010ó\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u0007\u0010ô\u0001\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0006\bõ\u0001\u0010ö\u0001J\"\u0010ù\u0001\u001a\t\u0012\u0005\u0012\u00030ø\u00010\f2\u0007\u0010÷\u0001\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\bù\u0001\u0010#J#\u0010ü\u0001\u001a\t\u0012\u0005\u0012\u00030û\u00010\f2\u0007\u0010\u000b\u001a\u00030ú\u0001H\u0097\u0001¢\u0006\u0006\bü\u0001\u0010ý\u0001J,\u0010\u0081\u0002\u001a\t\u0012\u0005\u0012\u00030\u0080\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010ÿ\u0001\u001a\u00030þ\u0001H\u0097\u0001¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002JH\u0010\u0084\u0002\u001a\t\u0012\u0005\u0012\u00030\u0083\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0015\u0010\u009a\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u00012\r\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0097\u0001¢\u0006\u0006\b\u0084\u0002\u0010©\u0001J$\u0010\u0088\u0002\u001a\t\u0012\u0005\u0012\u00030\u0087\u00020\f2\b\u0010\u0086\u0002\u001a\u00030\u0085\u0002H\u0097\u0001¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002J$\u0010\u008b\u0002\u001a\t\u0012\u0005\u0012\u00030\u0087\u00020\f2\b\u0010\u0082\u0001\u001a\u00030\u008a\u0002H\u0097\u0001¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J\"\u0010\u008e\u0002\u001a\t\u0012\u0005\u0012\u00030\u0087\u00020\f2\u0007\u0010\u008d\u0002\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b\u008e\u0002\u0010#J-\u0010\u0091\u0002\u001a\t\u0012\u0005\u0012\u00030\u008f\u00020\f2\u0007\u0010\u008d\u0002\u001a\u00020\u00072\b\u0010\u0090\u0002\u001a\u00030\u008f\u0002H\u0097\u0001¢\u0006\u0006\b\u0091\u0002\u0010\u0092\u0002J-\u0010\u0093\u0002\u001a\t\u0012\u0005\u0012\u00030\u008f\u00020\f2\u0007\u0010\u008d\u0002\u001a\u00020\u00072\b\u0010\u0090\u0002\u001a\u00030\u008f\u0002H\u0097\u0001¢\u0006\u0006\b\u0093\u0002\u0010\u0092\u0002J*\u0010\u0095\u0002\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0007\u0010\u008d\u0002\u001a\u00020\u00072\u0007\u0010\u0094\u0002\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b\u0095\u0002\u0010|JQ\u0010\u0098\u0002\u001a\t\u0012\u0005\u0012\u00030\u0097\u00020\f2\u0007\u0010\u008d\u0002\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u0001002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010m\u001a\u0004\u0018\u00010\u00072\u000f\u0010'\u001a\u000b\u0012\u0005\u0012\u00030\u0096\u0002\u0018\u00010&H\u0097\u0001¢\u0006\u0005\b\u0098\u0002\u0010sJI\u0010\u009a\u0002\u001a\t\u0012\u0005\u0012\u00030\u0099\u00020\f2\b\u00101\u001a\u0004\u0018\u0001002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010m\u001a\u0004\u0018\u00010\u00072\u000f\u0010'\u001a\u000b\u0012\u0005\u0012\u00030\u0087\u0002\u0018\u00010&H\u0097\u0001¢\u0006\u0006\b\u009a\u0002\u0010\u0091\u0001J3\u0010\u009b\u0002\u001a\t\u0012\u0005\u0012\u00030\u0096\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0007\u0010\u008d\u0002\u001a\u00020\u00072\u0007\u0010\u0094\u0002\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b\u009b\u0002\u0010QJ3\u0010\u009d\u0002\u001a\t\u0012\u0005\u0012\u00030\u0096\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0007\u0010\u008d\u0002\u001a\u00020\u00072\u0007\u0010\u009c\u0002\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b\u009d\u0002\u0010QJ3\u0010\u009f\u0002\u001a\t\u0012\u0005\u0012\u00030\u0096\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0007\u0010\u008d\u0002\u001a\u00020\u00072\u0007\u0010\u009e\u0002\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b\u009f\u0002\u0010QJI\u0010 \u0002\u001a\t\u0012\u0005\u0012\u00030\u0087\u00020\f2\u0007\u0010\u008d\u0002\u001a\u00020\u00072\u0015\u0010\u009a\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u00012\r\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0097\u0001¢\u0006\u0006\b \u0002\u0010©\u0001J\"\u0010¡\u0002\u001a\t\u0012\u0005\u0012\u00030\u0087\u00020\f2\u0007\u0010\u008d\u0002\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b¡\u0002\u0010#J!\u0010¢\u0002\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0007\u0010\u008d\u0002\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b¢\u0002\u0010#J,\u0010¥\u0002\u001a\t\u0012\u0005\u0012\u00030¤\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\t\u0010£\u0002\u001a\u0004\u0018\u000103H\u0097\u0001¢\u0006\u0005\b¥\u0002\u0010jJ,\u0010¦\u0002\u001a\t\u0012\u0005\u0012\u00030¤\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\t\u0010£\u0002\u001a\u0004\u0018\u000103H\u0097\u0001¢\u0006\u0005\b¦\u0002\u0010jJ \u0010§\u0002\u001a\b\u0012\u0004\u0012\u00020A0\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b§\u0002\u0010#JC\u0010©\u0002\u001a\t\u0012\u0005\u0012\u00030¨\u00020\f2\u0006\u00101\u001a\u0002002\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010m\u001a\u0004\u0018\u00010\u00072\r\u0010'\u001a\t\u0012\u0005\u0012\u00030¤\u00020&H\u0097\u0001¢\u0006\u0006\b©\u0002\u0010ª\u0002J\u001f\u0010¬\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030«\u00020\u00140\fH\u0097\u0001¢\u0006\u0005\b¬\u0002\u0010FJ$\u0010®\u0002\u001a\t\u0012\u0005\u0012\u00030«\u00020\f2\b\u0010\u00ad\u0002\u001a\u00030«\u0002H\u0097\u0001¢\u0006\u0006\b®\u0002\u0010¯\u0002J$\u0010°\u0002\u001a\t\u0012\u0005\u0012\u00030«\u00020\f2\b\u0010\u00ad\u0002\u001a\u00030«\u0002H\u0097\u0001¢\u0006\u0006\b°\u0002\u0010¯\u0002J\u0013\u0010±\u0002\u001a\u00020AH\u0096\u0001¢\u0006\u0006\b±\u0002\u0010²\u0002J\u0013\u0010³\u0002\u001a\u00020AH\u0096\u0001¢\u0006\u0006\b³\u0002\u0010²\u0002JC\u0010¸\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\n\b\u0000\u0010´\u0002*\u00030\u0099\u00012\u0007\u0010µ\u0002\u001a\u00020\u00122\u0014\u0010·\u0002\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0¶\u0002H\u0002¢\u0006\u0006\b¸\u0002\u0010¹\u0002R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010º\u0002R\u001d\u0010\u0004\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0004\u0010»\u0002\u001a\u0006\b¼\u0002\u0010½\u0002R.\u0010À\u0002\u001a\u0019\u0012\u0004\u0012\u00020\u0012\u0012\u000e\u0012\f\u0012\u0007\b\u0001\u0012\u00030\u0099\u00010¿\u00020¾\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0002\u0010Á\u0002¨\u0006Ã\u0002"}, m65681d2 = {"Lio/getstream/chat/android/client/api/internal/DistinctChatApi;", "Lio/getstream/chat/android/client/api/ChatApi;", "Lbc3/c0;", "scope", "delegate", "<init>", "(Lbc3/c0;Lio/getstream/chat/android/client/api/ChatApi;)V", "", "channelType", "channelId", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "query", "Lo23/d;", "Lio/getstream/chat/android/models/Channel;", "queryChannel", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lo23/d;", "messageId", "firstId", "", MapboxMap.QFE_LIMIT, "", "Lio/getstream/chat/android/models/Message;", "getRepliesMore", "(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;", "getReplies", "(Ljava/lang/String;I)Lo23/d;", "parentId", "lastId", "getNewerReplies", "(Ljava/lang/String;ILjava/lang/String;)Lo23/d;", MapboxMap.QFE_OFFSET, "Lio/getstream/chat/android/models/Reaction;", "getReactions", "(Ljava/lang/String;II)Lo23/d;", "getMessage", "(Ljava/lang/String;)Lo23/d;", "Lio/getstream/chat/android/models/PendingMessage;", "getPendingMessage", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", "pagination", "getPinnedMessages", "(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "Lio/getstream/chat/android/client/api/models/QueryChannelsResult;", "queryChannels", "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;", "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/BannedUsersSort;", "Ljava/util/Date;", "createdAtAfter", "createdAtAfterOrEqual", "createdAtBefore", "createdAtBeforeOrEqual", "Lio/getstream/chat/android/models/BannedUser;", "queryBannedUsers", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;", "Lio/getstream/chat/android/models/Member;", QueryChannelRequest.KEY_MEMBERS, "queryMembers", "(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;", "userId", "connectionId", "Ll83/a0;", "setConnection", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/getstream/chat/android/models/AppSettings;", "appSettings", "()Lo23/d;", "Ljava/io/File;", "file", "Lio/getstream/chat/android/client/utils/ProgressCallback;", "callback", "Lio/getstream/chat/android/models/UploadedFile;", "sendFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;", "sendImage", QueryParams.URL, "deleteFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "deleteImage", "progressCallback", "uploadFile", "(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;", "uploadImage", "Lio/getstream/chat/android/models/Device;", "device", "addDevice", "(Lio/getstream/chat/android/models/Device;)Lo23/d;", "id", "deleteDevice", "getDevices", "Lio/getstream/chat/android/models/PushPreferenceLevel;", "level", "Lio/getstream/chat/android/models/PushPreference;", "setUserPushPreference", "(Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;", "until", "snoozeUserPushNotifications", "(Ljava/util/Date;)Lo23/d;", "cid", "setChannelPushPreference", "(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;", "snoozeChannelPushNotifications", "(Ljava/lang/String;Ljava/util/Date;)Lo23/d;", "channelFilter", "messageFilter", "next", "Lio/getstream/chat/android/models/SearchMessagesResult;", "searchMessages", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "Lio/getstream/chat/android/models/QueryReactionsResult;", "queryReactions", "(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "reaction", "", "enforceUnique", "skipPush", "sendReaction", "(Lio/getstream/chat/android/models/Reaction;ZZ)Lo23/d;", "reactionType", "deleteReaction", "(Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "hard", "deleteForMe", "deleteMessage", "(Ljava/lang/String;ZZ)Lo23/d;", "Lio/getstream/chat/android/client/api/models/SendActionRequest;", "request", "sendAction", "(Lio/getstream/chat/android/client/api/models/SendActionRequest;)Lo23/d;", "message", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;", "Lio/getstream/chat/android/models/DraftMessage;", "createDraftMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lo23/d;", "deleteDraftMessage", "queryDraftMessages", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lo23/d;", "Lio/getstream/chat/android/models/DraftsSort;", "Lio/getstream/chat/android/models/QueryDraftsResult;", "queryDrafts", "(Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "expiration", "muteChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unmuteChannel", "updateMessage", "(Lio/getstream/chat/android/models/Message;)Lo23/d;", "", "", "set", "unset", "skipEnrichUrl", "partialUpdateMessage", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Z)Lo23/d;", "stopWatching", "Lio/getstream/chat/android/models/User;", "users", "updateUsers", "(Ljava/util/List;)Lo23/d;", "Lio/getstream/chat/android/models/UserBlock;", "blockUser", "unblockUser", "queryBlockedUsers", "partialUpdateUser", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "extraData", "updateChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Message;)Lo23/d;", "updateChannelPartial", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "cooldownTimeInSeconds", "enableSlowMode", "disableSlowMode", "Lio/getstream/chat/android/models/UnreadCounts;", "getUnreadCounts", "markRead", "messages", "markDelivered", "threadId", "markThreadRead", "messageTimestamp", "markUnread", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lo23/d;", "showChannel", "clearHistory", "hideChannel", "(Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "systemMessage", "truncateChannel", "rejectInvite", "Lio/getstream/chat/android/models/Mute;", "muteCurrentUser", "unmuteCurrentUser", "acceptInvite", "deleteChannel", "markAllRead", "userName", "Lio/getstream/chat/android/models/GuestUser;", "getGuestUser", "Lio/getstream/chat/android/client/api/models/QueryUsersRequest;", "queryUsers", "(Lio/getstream/chat/android/client/api/models/QueryUsersRequest;)Lo23/d;", "Lio/getstream/chat/android/models/MemberData;", "hideHistory", "hideHistoryBefore", "addMembers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lo23/d;", "removeMembers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;", "inviteMembers", "partialUpdateMember", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "timeout", "muteUser", "(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unmuteUser", "reason", "customData", "Lio/getstream/chat/android/models/Flag;", "flagUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;", "unflagUser", "flagMessage", "unflagMessage", "targetId", "shadow", "banUser", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "unbanUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "eventType", "Lio/getstream/chat/android/client/events/ChatEvent;", "sendEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;", "language", "translate", "Lio/getstream/chat/android/models/Attachment;", "og", "channelIds", "lastSyncAt", "getSyncHistory", "(Ljava/util/List;Ljava/lang/String;)Lo23/d;", "fileUrl", "Lud3/a1;", "downloadFile", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "Lio/getstream/chat/android/models/QueryThreadsResult;", "queryThreads", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/GetThreadOptions;", "options", "Lio/getstream/chat/android/models/Thread;", "getThread", "(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/GetThreadOptions;)Lo23/d;", "Lio/getstream/chat/android/models/ThreadInfo;", "partialUpdateThread", "Lio/getstream/chat/android/models/CreatePollParams;", "createPollParams", "Lio/getstream/chat/android/models/Poll;", "createPoll", "(Lio/getstream/chat/android/models/CreatePollParams;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/UpdatePollRequest;", "updatePoll", "(Lio/getstream/chat/android/client/api/models/UpdatePollRequest;)Lo23/d;", "pollId", "getPoll", "Lio/getstream/chat/android/models/PollOption;", "option", "createPollOption", "(Ljava/lang/String;Lio/getstream/chat/android/models/PollOption;)Lo23/d;", "updatePollOption", "optionId", "deletePollOption", "Lio/getstream/chat/android/models/Vote;", "Lio/getstream/chat/android/models/QueryPollVotesResult;", "queryPollVotes", "Lio/getstream/chat/android/models/QueryPollsResult;", "queryPolls", "castPollVote", "answer", "castPollAnswer", "voteId", "removePollVote", "partialUpdatePoll", "closePoll", "deletePoll", "remindAt", "Lio/getstream/chat/android/models/MessageReminder;", "createReminder", "updateReminder", "deleteReminder", "Lio/getstream/chat/android/models/QueryRemindersResult;", "queryReminders", "(Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "Lio/getstream/chat/android/models/Location;", "queryActiveLocations", "location", "updateLiveLocation", "(Lio/getstream/chat/android/models/Location;)Lo23/d;", "stopLiveLocation", "warmUp", "()V", "releaseConnection", "T", "uniqueKey", "Lkotlin/Function0;", "callBuilder", "getOrCreate", "(ILc93/a;)Lo23/d;", "Lbc3/c0;", "Lio/getstream/chat/android/client/api/ChatApi;", "getDelegate$stream_chat_android_client_release", "()Lio/getstream/chat/android/client/api/ChatApi;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lo23/j;", "distinctCalls", "Ljava/util/concurrent/ConcurrentHashMap;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DistinctChatApi implements ChatApi {
    private static final Companion Companion = new Companion();
    private static final String TAG = "Chat:DistinctApi";
    private final ChatApi delegate;
    private final ConcurrentHashMap<Integer, C27480j> distinctCalls;
    private final InterfaceC2994c0 scope;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/api/internal/DistinctChatApi$Companion;", "", "<init>", "()V", "TAG", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public DistinctChatApi(InterfaceC2994c0 scope, ChatApi delegate) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(delegate, "delegate");
        this.scope = scope;
        this.delegate = delegate;
        this.distinctCalls = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC27474d m54541a(DistinctChatApi distinctChatApi, String str, int i13, int i14) {
        return distinctChatApi.delegate.getReactions(str, i13, i14);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC27474d m54542b(DistinctChatApi distinctChatApi, String str, int i13, String str2) {
        return distinctChatApi.delegate.getNewerReplies(str, i13, str2);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC27474d m54543c(DistinctChatApi distinctChatApi, String str) {
        return distinctChatApi.delegate.getMessage(str);
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC27474d m54545e(DistinctChatApi distinctChatApi, String str, int i13) {
        return distinctChatApi.delegate.getReplies(str, i13);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC27474d m54546f(DistinctChatApi distinctChatApi, QueryChannelsRequest queryChannelsRequest) {
        return distinctChatApi.delegate.queryChannels(queryChannelsRequest);
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC27474d m54547g(DistinctChatApi distinctChatApi, String str, String str2, int i13, int i14, FilterObject filterObject, QuerySorter querySorter, List list) {
        return distinctChatApi.delegate.queryMembers(str, str2, i13, i14, filterObject, querySorter, list);
    }

    private final <T> InterfaceC27474d getOrCreate(int uniqueKey, InterfaceC4339a callBuilder) {
        C27480j c27480j = this.distinctCalls.get(Integer.valueOf(uniqueKey));
        C27480j c27480j2 = c27480j instanceof C27480j ? c27480j : null;
        if (c27480j2 != null) {
            return c27480j2;
        }
        C27480j c27480j3 = new C27480j(this.scope, callBuilder, new C13990x(this, uniqueKey, 2));
        this.distinctCalls.put(Integer.valueOf(uniqueKey), c27480j3);
        return c27480j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 getOrCreate$lambda$22(DistinctChatApi distinctChatApi, int i13) {
        distinctChatApi.distinctCalls.remove(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC27474d m54548h(DistinctChatApi distinctChatApi, String str, int i13, String str2) {
        return distinctChatApi.delegate.getRepliesMore(str, str2, i13);
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC27474d m54549i(DistinctChatApi distinctChatApi, FilterObject filterObject, QuerySorter querySorter, Integer num, Integer num2, Date date, Date date2, Date date3, Date date4) {
        return distinctChatApi.delegate.queryBannedUsers(filterObject, querySorter, num, num2, date, date2, date3, date4);
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC27474d m54550j(DistinctChatApi distinctChatApi, String str, String str2, int i13, QuerySorter querySorter, PinnedMessagesPagination pinnedMessagesPagination) {
        return distinctChatApi.delegate.getPinnedMessages(str, str2, i13, querySorter, pinnedMessagesPagination);
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC27474d m54551k(DistinctChatApi distinctChatApi, String str) {
        return distinctChatApi.delegate.getPendingMessage(str);
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC27474d m54552l(DistinctChatApi distinctChatApi, String str, String str2, QueryChannelRequest queryChannelRequest) {
        return distinctChatApi.delegate.queryChannel(str, str2, queryChannelRequest);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d acceptInvite(String channelType, String channelId, String message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.delegate.acceptInvite(channelType, channelId, message);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d addDevice(Device device) {
        AbstractC22676k.m65750j(device, "device");
        return this.delegate.addDevice(device);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d addMembers(String channelType, String channelId, List<MemberData> members, Message systemMessage, Boolean hideHistory, Date hideHistoryBefore, Boolean skipPush) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(members, "members");
        return this.delegate.addMembers(channelType, channelId, members, systemMessage, hideHistory, hideHistoryBefore, skipPush);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d appSettings() {
        return this.delegate.appSettings();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d banUser(String targetId, Integer timeout, String reason, String channelType, String channelId, boolean shadow) {
        AbstractC22676k.m65750j(targetId, "targetId");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.delegate.banUser(targetId, timeout, reason, channelType, channelId, shadow);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d blockUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return this.delegate.blockUser(userId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d castPollAnswer(String messageId, String pollId, String answer) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(answer, "answer");
        return this.delegate.castPollAnswer(messageId, pollId, answer);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d castPollVote(String messageId, String pollId, String optionId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(optionId, "optionId");
        return this.delegate.castPollVote(messageId, pollId, optionId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d closePoll(String pollId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return this.delegate.closePoll(pollId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d createDraftMessage(String channelType, String channelId, DraftMessage message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        return this.delegate.createDraftMessage(channelType, channelId, message);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d createPoll(CreatePollParams createPollParams) {
        AbstractC22676k.m65750j(createPollParams, "createPollParams");
        return this.delegate.createPoll(createPollParams);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d createPollOption(String pollId, PollOption option) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(option, "option");
        return this.delegate.createPollOption(pollId, option);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d createReminder(String messageId, Date remindAt) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.delegate.createReminder(messageId, remindAt);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteChannel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.delegate.deleteChannel(channelType, channelId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteDevice(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        return this.delegate.deleteDevice(id4);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteDraftMessage(String channelType, String channelId, DraftMessage message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        return this.delegate.deleteDraftMessage(channelType, channelId, message);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteFile(String url) {
        AbstractC22676k.m65750j(url, "url");
        return this.delegate.deleteFile(url);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteImage(String url) {
        AbstractC22676k.m65750j(url, "url");
        return this.delegate.deleteImage(url);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteMessage(String messageId, boolean hard, boolean deleteForMe) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.delegate.deleteMessage(messageId, hard, deleteForMe);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deletePoll(String pollId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return this.delegate.deletePoll(pollId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deletePollOption(String pollId, String optionId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(optionId, "optionId");
        return this.delegate.deletePollOption(pollId, optionId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteReaction(String messageId, String reactionType) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(reactionType, "reactionType");
        return this.delegate.deleteReaction(messageId, reactionType);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteReminder(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.delegate.deleteReminder(messageId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d disableSlowMode(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.delegate.disableSlowMode(channelType, channelId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d downloadFile(String fileUrl) {
        AbstractC22676k.m65750j(fileUrl, "fileUrl");
        return this.delegate.downloadFile(fileUrl);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d enableSlowMode(String channelType, String channelId, int cooldownTimeInSeconds) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.delegate.enableSlowMode(channelType, channelId, cooldownTimeInSeconds);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d flagMessage(String messageId, String reason, Map<String, String> customData) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(customData, "customData");
        return this.delegate.flagMessage(messageId, reason, customData);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d flagUser(String userId, String reason, Map<String, String> customData) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(customData, "customData");
        return this.delegate.flagUser(userId, reason, customData);
    }

    /* JADX INFO: renamed from: getDelegate$stream_chat_android_client_release, reason: from getter */
    public final ChatApi getDelegate() {
        return this.delegate;
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getDevices() {
        return this.delegate.getDevices();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getGuestUser(String userId, String userName) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(userName, "userName");
        return this.delegate.getGuestUser(userId, userName);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        int iHashCode = messageId.hashCode();
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            C2343i.f9271c.log(enumC2341g, TAG, AbstractC25012a.m73374g(iHashCode, "[getMessage] messageId: ", messageId, ", uniqueKey: "), null);
        }
        return getOrCreate(iHashCode, new C19010d(this, messageId, 0));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getNewerReplies(String parentId, int limit, String lastId) {
        AbstractC22676k.m65750j(parentId, "parentId");
        int iHashCode = new GetNewerRepliesHash(parentId, limit, lastId).hashCode();
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(limit, "[getNewerReplies] parentId: ", parentId, ", limit: ", ", lastId: ");
            sbM30467u.append(lastId);
            sbM30467u.append(", uniqueKey: ");
            sbM30467u.append(iHashCode);
            interfaceC2344j.log(enumC2341g, TAG, sbM30467u.toString(), null);
        }
        return getOrCreate(iHashCode, new C19007a(this, parentId, limit, lastId));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getPendingMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        int iHashCode = messageId.hashCode();
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            C2343i.f9271c.log(enumC2341g, TAG, AbstractC25012a.m73374g(iHashCode, "[getPendingMessage] messageId: ", messageId, ", uniqueKey: "), null);
        }
        return getOrCreate(iHashCode, new C19010d(this, messageId, 1));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getPinnedMessages(final String channelType, final String channelId, final int limit, final QuerySorter<Message> sort, final PinnedMessagesPagination pagination) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(pagination, "pagination");
        int iHashCode = new GetPinnedMessagesHash(channelType, channelId, limit, sort, pagination).hashCode();
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[getPinnedMessages] channelType: ", channelType, ", channelId: ", channelId, ", limit: ");
            sbM32001t.append(limit);
            sbM32001t.append(", sort: ");
            sbM32001t.append(sort);
            sbM32001t.append(", pagination: ");
            sbM32001t.append(pagination);
            sbM32001t.append(", uniqueKey: ");
            sbM32001t.append(iHashCode);
            interfaceC2344j.log(enumC2341g, TAG, sbM32001t.toString(), null);
        }
        return getOrCreate(iHashCode, new InterfaceC4339a() { // from class: io.getstream.chat.android.client.api.internal.b
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                return DistinctChatApi.m54550j(this.f73722w, channelType, channelId, limit, sort, pagination);
            }
        });
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getPoll(String pollId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return this.delegate.getPoll(pollId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getReactions(String messageId, int offset, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        int iHashCode = new GetReactionsHash(messageId, offset, limit).hashCode();
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(offset, "[getReactions] messageId: ", messageId, ", offset: ", ", limit: ");
            sbM30467u.append(limit);
            sbM30467u.append(", uniqueKey: ");
            sbM30467u.append(iHashCode);
            interfaceC2344j.log(enumC2341g, TAG, sbM30467u.toString(), null);
        }
        return getOrCreate(iHashCode, new C4510k(messageId, offset, limit, 1, this));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getReplies(String messageId, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        int iHashCode = new GetRepliesHash(messageId, null, limit).hashCode();
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(limit, "[getReplies] messageId: ", messageId, ", limit: ", ", uniqueKey: ");
            sbM30467u.append(iHashCode);
            interfaceC2344j.log(enumC2341g, TAG, sbM30467u.toString(), null);
        }
        return getOrCreate(iHashCode, new C0372h(this, messageId, limit, 4));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getRepliesMore(String messageId, String firstId, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(firstId, "firstId");
        int iHashCode = new GetRepliesHash(messageId, firstId, limit).hashCode();
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[getRepliesMore] messageId: ", messageId, ", firstId: ", firstId, ", limit: ");
            sbM32001t.append(limit);
            sbM32001t.append(", uniqueKey: ");
            sbM32001t.append(iHashCode);
            interfaceC2344j.log(enumC2341g, TAG, sbM32001t.toString(), null);
        }
        return getOrCreate(iHashCode, new C19007a(this, messageId, firstId, limit));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getSyncHistory(List<String> channelIds, String lastSyncAt) {
        AbstractC22676k.m65750j(channelIds, "channelIds");
        AbstractC22676k.m65750j(lastSyncAt, "lastSyncAt");
        return this.delegate.getSyncHistory(channelIds, lastSyncAt);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getThread(String messageId, GetThreadOptions options) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(options, "options");
        return this.delegate.getThread(messageId, options);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getUnreadCounts() {
        return this.delegate.getUnreadCounts();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d hideChannel(String channelType, String channelId, boolean clearHistory) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.delegate.hideChannel(channelType, channelId, clearHistory);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d inviteMembers(String channelType, String channelId, List<String> members, Message systemMessage, Boolean skipPush) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(members, "members");
        return this.delegate.inviteMembers(channelType, channelId, members, systemMessage, skipPush);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d markAllRead() {
        return this.delegate.markAllRead();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d markDelivered(List<Message> messages) {
        AbstractC22676k.m65750j(messages, "messages");
        return this.delegate.markDelivered(messages);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d markRead(String channelType, String channelId, String messageId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.delegate.markRead(channelType, channelId, messageId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d markThreadRead(String channelType, String channelId, String threadId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(threadId, "threadId");
        return this.delegate.markThreadRead(channelType, channelId, threadId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d markUnread(String channelType, String channelId, String messageId, Date messageTimestamp, String threadId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.delegate.markUnread(channelType, channelId, messageId, messageTimestamp, threadId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d muteChannel(String channelType, String channelId, Integer expiration) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.delegate.muteChannel(channelType, channelId, expiration);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d muteCurrentUser() {
        return this.delegate.muteCurrentUser();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d muteUser(String userId, Integer timeout) {
        AbstractC22676k.m65750j(userId, "userId");
        return this.delegate.muteUser(userId, timeout);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    /* JADX INFO: renamed from: og */
    public final InterfaceC27474d mo54539og(String url) {
        AbstractC22676k.m65750j(url, "url");
        return this.delegate.mo54539og(url);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdateMember(String channelType, String channelId, String userId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.delegate.partialUpdateMember(channelType, channelId, userId, set, unset);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdateMessage(String messageId, Map<String, ? extends Object> set, List<String> unset, boolean skipEnrichUrl) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.delegate.partialUpdateMessage(messageId, set, unset, skipEnrichUrl);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdatePoll(String pollId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.delegate.partialUpdatePoll(pollId, set, unset);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdateThread(String messageId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.delegate.partialUpdateThread(messageId, set, unset);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdateUser(String id4, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.delegate.partialUpdateUser(id4, set, unset);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryActiveLocations() {
        return this.delegate.queryActiveLocations();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryBannedUsers(FilterObject filter, QuerySorter<BannedUsersSort> sort, Integer offset, Integer limit, Date createdAtAfter, Date createdAtAfterOrEqual, Date createdAtBefore, Date createdAtBeforeOrEqual) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        int iHashCode = new QueryBanedUsersHash(filter, sort, offset, limit, createdAtAfter, createdAtAfterOrEqual, createdAtBefore, createdAtBeforeOrEqual).hashCode();
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            C2343i.f9271c.log(enumC2341g, TAG, "[queryBannedUsers] uniqueKey: " + iHashCode, null);
        }
        return getOrCreate(iHashCode, new C9775f(this, filter, sort, offset, limit, createdAtAfter, createdAtAfterOrEqual, createdAtBefore, createdAtBeforeOrEqual, 1));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryBlockedUsers() {
        return this.delegate.queryBlockedUsers();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryChannel(String channelType, String channelId, QueryChannelRequest query) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(query, "query");
        int iHashCode = ChannelQueryKey.INSTANCE.from(channelType, channelId, query).hashCode();
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[queryChannel] channelType: ", channelType, ", channelId: ", channelId, ", uniqueKey: ");
            sbM32001t.append(iHashCode);
            interfaceC2344j.log(enumC2341g, TAG, sbM32001t.toString(), null);
        }
        return getOrCreate(iHashCode, new C1012d((Object) this, channelType, (Object) channelId, (Object) query, 14));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryChannels(QueryChannelsRequest query) {
        AbstractC22676k.m65750j(query, "query");
        int iHashCode = query.hashCode();
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            C2343i.f9271c.log(enumC2341g, TAG, "[queryChannels] query: " + query + ", uniqueKey: " + iHashCode, null);
        }
        return getOrCreate(iHashCode, new C17841d(12, this, query));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryDraftMessages(Integer offset, Integer limit) {
        return this.delegate.queryDraftMessages(offset, limit);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryDrafts(FilterObject filter, Integer limit, String next, QuerySorter<DraftsSort> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return this.delegate.queryDrafts(filter, limit, next, sort);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryMembers(final String channelType, final String channelId, final int offset, final int limit, final FilterObject filter, final QuerySorter<Member> sort, final List<Member> members) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(members, "members");
        int iHashCode = new QueryMembersHash(channelType, channelId, offset, limit, filter, sort, members).hashCode();
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, TAG)) {
            C2343i.f9271c.log(enumC2341g, TAG, "[queryMembers] uniqueKey: " + iHashCode, null);
        }
        return getOrCreate(iHashCode, new InterfaceC4339a() { // from class: io.getstream.chat.android.client.api.internal.c
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                return DistinctChatApi.m54547g(this.f73730w, channelType, channelId, offset, limit, filter, sort, members);
            }
        });
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryPollVotes(String pollId, FilterObject filter, Integer limit, String next, QuerySorter<Vote> sort) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return this.delegate.queryPollVotes(pollId, filter, limit, next, sort);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryPolls(FilterObject filter, Integer limit, String next, QuerySorter<Poll> sort) {
        return this.delegate.queryPolls(filter, limit, next, sort);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryReactions(String messageId, FilterObject filter, Integer limit, String next, QuerySorter<Reaction> sort) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.delegate.queryReactions(messageId, filter, limit, next, sort);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryReminders(FilterObject filter, int limit, String next, QuerySorter<MessageReminder> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return this.delegate.queryReminders(filter, limit, next, sort);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryThreads(QueryThreadsRequest query) {
        AbstractC22676k.m65750j(query, "query");
        return this.delegate.queryThreads(query);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryUsers(QueryUsersRequest queryUsers) {
        AbstractC22676k.m65750j(queryUsers, "queryUsers");
        return this.delegate.queryUsers(queryUsers);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d rejectInvite(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.delegate.rejectInvite(channelType, channelId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final void releaseConnection() {
        this.delegate.releaseConnection();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d removeMembers(String channelType, String channelId, List<String> members, Message systemMessage, Boolean skipPush) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(members, "members");
        return this.delegate.removeMembers(channelType, channelId, members, systemMessage, skipPush);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d removePollVote(String messageId, String pollId, String voteId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(voteId, "voteId");
        return this.delegate.removePollVote(messageId, pollId, voteId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d searchMessages(FilterObject channelFilter, FilterObject messageFilter, Integer offset, Integer limit, String next, QuerySorter<Message> sort) {
        AbstractC22676k.m65750j(channelFilter, "channelFilter");
        AbstractC22676k.m65750j(messageFilter, "messageFilter");
        return this.delegate.searchMessages(channelFilter, messageFilter, offset, limit, next, sort);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendAction(SendActionRequest request) {
        AbstractC22676k.m65750j(request, "request");
        return this.delegate.sendAction(request);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendEvent(String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        return this.delegate.sendEvent(eventType, channelType, channelId, extraData);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendFile(String channelType, String channelId, File file, ProgressCallback callback) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(file, "file");
        return this.delegate.sendFile(channelType, channelId, file, callback);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendImage(String channelType, String channelId, File file, ProgressCallback callback) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(file, "file");
        return this.delegate.sendImage(channelType, channelId, file, callback);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendMessage(String channelType, String channelId, Message message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        return this.delegate.sendMessage(channelType, channelId, message);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendReaction(Reaction reaction, boolean enforceUnique, boolean skipPush) {
        AbstractC22676k.m65750j(reaction, "reaction");
        return this.delegate.sendReaction(reaction, enforceUnique, skipPush);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d setChannelPushPreference(String cid, PushPreferenceLevel level) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(level, "level");
        return this.delegate.setChannelPushPreference(cid, level);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final void setConnection(String userId, String connectionId) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(connectionId, "connectionId");
        this.delegate.setConnection(userId, connectionId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d setUserPushPreference(PushPreferenceLevel level) {
        AbstractC22676k.m65750j(level, "level");
        return this.delegate.setUserPushPreference(level);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d showChannel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.delegate.showChannel(channelType, channelId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d snoozeChannelPushNotifications(String cid, Date until) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(until, "until");
        return this.delegate.snoozeChannelPushNotifications(cid, until);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d snoozeUserPushNotifications(Date until) {
        AbstractC22676k.m65750j(until, "until");
        return this.delegate.snoozeUserPushNotifications(until);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d stopLiveLocation(Location location) {
        AbstractC22676k.m65750j(location, "location");
        return this.delegate.stopLiveLocation(location);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d stopWatching(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.delegate.stopWatching(channelType, channelId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d translate(String messageId, String language) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(language, "language");
        return this.delegate.translate(messageId, language);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d truncateChannel(String channelType, String channelId, Message systemMessage) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.delegate.truncateChannel(channelType, channelId, systemMessage);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unbanUser(String targetId, String channelType, String channelId, boolean shadow) {
        AbstractC22676k.m65750j(targetId, "targetId");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.delegate.unbanUser(targetId, channelType, channelId, shadow);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unblockUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return this.delegate.unblockUser(userId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unflagMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.delegate.unflagMessage(messageId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unflagUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return this.delegate.unflagUser(userId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unmuteChannel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.delegate.unmuteChannel(channelType, channelId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unmuteCurrentUser() {
        return this.delegate.unmuteCurrentUser();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unmuteUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return this.delegate.unmuteUser(userId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateChannel(String channelType, String channelId, Map<String, ? extends Object> extraData, Message updateMessage) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        return this.delegate.updateChannel(channelType, channelId, extraData, updateMessage);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateChannelPartial(String channelType, String channelId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.delegate.updateChannelPartial(channelType, channelId, set, unset);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateLiveLocation(Location location) {
        AbstractC22676k.m65750j(location, "location");
        return this.delegate.updateLiveLocation(location);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        return this.delegate.updateMessage(message);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updatePoll(UpdatePollRequest request) {
        AbstractC22676k.m65750j(request, "request");
        return this.delegate.updatePoll(request);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updatePollOption(String pollId, PollOption option) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(option, "option");
        return this.delegate.updatePollOption(pollId, option);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateReminder(String messageId, Date remindAt) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.delegate.updateReminder(messageId, remindAt);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateUsers(List<User> users) {
        AbstractC22676k.m65750j(users, "users");
        return this.delegate.updateUsers(users);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d uploadFile(File file, ProgressCallback progressCallback) {
        AbstractC22676k.m65750j(file, "file");
        return this.delegate.uploadFile(file, progressCallback);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d uploadImage(File file, ProgressCallback progressCallback) {
        AbstractC22676k.m65750j(file, "file");
        return this.delegate.uploadImage(file, progressCallback);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final void warmUp() {
        this.delegate.warmUp();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteFile(String channelType, String channelId, String url) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(url, "url");
        return this.delegate.deleteFile(channelType, channelId, url);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteImage(String channelType, String channelId, String url) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(url, "url");
        return this.delegate.deleteImage(channelType, channelId, url);
    }
}
