package io.getstream.chat.android.client.api.internal;

import c93.InterfaceC4339a;
import com.mapbox.maps.MapboxMap;
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
import o23.InterfaceC27474d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000À\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000f0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u001eJI\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u000e2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-Jm\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u000f0\u000e2\u0006\u0010/\u001a\u00020.2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002000#2\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u00102\u001a\u0004\u0018\u0001012\b\u00103\u001a\u0004\u0018\u0001012\b\u00104\u001a\u0004\u0018\u0001012\b\u00105\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b7\u00108J_\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\u000f0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010/\u001a\u00020.2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002090#2\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u000fH\u0016¢\u0006\u0004\b;\u0010<J-\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010*\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J \u0010D\u001a\u00020C2\u0006\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\bD\u0010EJ\u0016\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u000eH\u0096\u0001¢\u0006\u0004\bG\u0010HJ8\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010J\u001a\u00020I2\b\u0010L\u001a\u0004\u0018\u00010KH\u0097\u0001¢\u0006\u0004\bN\u0010OJ8\u0010P\u001a\b\u0012\u0004\u0012\u00020M0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010J\u001a\u00020I2\b\u0010L\u001a\u0004\u0018\u00010KH\u0097\u0001¢\u0006\u0004\bP\u0010OJ.\u0010R\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\bR\u0010SJ\u001e\u0010R\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010Q\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\bR\u0010\u001eJ.\u0010T\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\bT\u0010SJ\u001e\u0010T\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010Q\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\bT\u0010\u001eJ(\u0010V\u001a\b\u0012\u0004\u0012\u00020M0\u000e2\u0006\u0010J\u001a\u00020I2\b\u0010U\u001a\u0004\u0018\u00010KH\u0097\u0001¢\u0006\u0004\bV\u0010WJ(\u0010X\u001a\b\u0012\u0004\u0012\u00020M0\u000e2\u0006\u0010J\u001a\u00020I2\b\u0010U\u001a\u0004\u0018\u00010KH\u0097\u0001¢\u0006\u0004\bX\u0010WJ\u001e\u0010[\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010Z\u001a\u00020YH\u0097\u0001¢\u0006\u0004\b[\u0010\\J\u001e\u0010^\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010]\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b^\u0010\u001eJ\u001c\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0\u000f0\u000eH\u0097\u0001¢\u0006\u0004\b_\u0010HJ\u001e\u0010c\u001a\b\u0012\u0004\u0012\u00020b0\u000e2\u0006\u0010a\u001a\u00020`H\u0097\u0001¢\u0006\u0004\bc\u0010dJ\u001e\u0010f\u001a\b\u0012\u0004\u0012\u00020b0\u000e2\u0006\u0010e\u001a\u000201H\u0097\u0001¢\u0006\u0004\bf\u0010gJ&\u0010i\u001a\b\u0012\u0004\u0012\u00020b0\u000e2\u0006\u0010h\u001a\u00020\t2\u0006\u0010a\u001a\u00020`H\u0097\u0001¢\u0006\u0004\bi\u0010jJ&\u0010k\u001a\b\u0012\u0004\u0012\u00020b0\u000e2\u0006\u0010h\u001a\u00020\t2\u0006\u0010e\u001a\u000201H\u0097\u0001¢\u0006\u0004\bk\u0010lJT\u0010q\u001a\b\u0012\u0004\u0012\u00020p0\u000e2\u0006\u0010m\u001a\u00020.2\u0006\u0010n\u001a\u00020.2\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010o\u001a\u0004\u0018\u00010\t2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010#H\u0097\u0001¢\u0006\u0004\bq\u0010rJL\u0010t\u001a\b\u0012\u0004\u0012\u00020s0\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010o\u001a\u0004\u0018\u00010\t2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010#H\u0097\u0001¢\u0006\u0004\bt\u0010uJ.\u0010y\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010v\u001a\u00020\u001a2\u0006\u0010w\u001a\u00020\u00052\u0006\u0010x\u001a\u00020\u0005H\u0097\u0001¢\u0006\u0004\by\u0010zJ&\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010{\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b|\u0010}J1\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010~\u001a\u00020\u00052\u0006\u0010\u007f\u001a\u00020\u0005H\u0097\u0001¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J#\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0097\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J2\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0007\u0010\u0086\u0001\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J4\u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\b\u0010\u0086\u0001\u001a\u00030\u0089\u0001H\u0097\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J3\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\b\u0010\u0086\u0001\u001a\u00030\u0089\u0001H\u0097\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008b\u0001J4\u0010\u008d\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0089\u00010\u000f0\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0097\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001JE\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010\u000e2\u0006\u0010/\u001a\u00020.2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010o\u001a\u0004\u0018\u00010\t2\r\u0010$\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010#H\u0097\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J4\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\fH\u0097\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J(\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b\u0096\u0001\u0010}J\"\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\u0007\u0010\u0086\u0001\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001JP\u0010\u009e\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\n\u001a\u00020\t2\u0015\u0010\u009b\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u00012\r\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0007\u0010\u009d\u0001\u001a\u00020\u0005H\u0097\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J(\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b \u0001\u0010}J0\u0010£\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¡\u00010\u000f0\u000e2\u000e\u0010¢\u0001\u001a\t\u0012\u0005\u0012\u00030¡\u00010\u000fH\u0097\u0001¢\u0006\u0006\b£\u0001\u0010¤\u0001J!\u0010¦\u0001\u001a\t\u0012\u0005\u0012\u00030¥\u00010\u000e2\u0006\u0010A\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b¦\u0001\u0010\u001eJ \u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010A\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b§\u0001\u0010\u001eJ\u001f\u0010¨\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¥\u00010\u000f0\u000eH\u0097\u0001¢\u0006\u0005\b¨\u0001\u0010HJN\u0010©\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¡\u00010\u000f0\u000e2\u0006\u0010]\u001a\u00020\t2\u0015\u0010\u009b\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u00012\r\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0097\u0001¢\u0006\u0006\b©\u0001\u0010ª\u0001JK\u0010¬\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0015\u0010«\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u00012\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0010H\u0097\u0001¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001JO\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0015\u0010\u009b\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u00012\r\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0097\u0001¢\u0006\u0006\b®\u0001\u0010¯\u0001J1\u0010±\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0007\u0010°\u0001\u001a\u00020\fH\u0097\u0001¢\u0006\u0005\b±\u0001\u0010\u0012J(\u0010²\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b²\u0001\u0010}J\u0019\u0010´\u0001\u001a\t\u0012\u0005\u0012\u00030³\u00010\u000eH\u0096\u0001¢\u0006\u0005\b´\u0001\u0010HJ0\u0010µ\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bµ\u0001\u0010SJ(\u0010·\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\r\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0097\u0001¢\u0006\u0006\b·\u0001\u0010¤\u0001J1\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0007\u0010¸\u0001\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b¹\u0001\u0010SJI\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\t\u0010º\u0001\u001a\u0004\u0018\u0001012\t\u0010¸\u0001\u001a\u0004\u0018\u00010\tH\u0097\u0001¢\u0006\u0006\b»\u0001\u0010¼\u0001J(\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b½\u0001\u0010}J2\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0007\u0010¾\u0001\u001a\u00020\u0005H\u0097\u0001¢\u0006\u0006\b¿\u0001\u0010À\u0001J4\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\t\u0010Á\u0001\u001a\u0004\u0018\u00010\u0010H\u0097\u0001¢\u0006\u0006\bÂ\u0001\u0010\u0088\u0001J(\u0010Ã\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bÃ\u0001\u0010}J\u0019\u0010Å\u0001\u001a\t\u0012\u0005\u0012\u00030Ä\u00010\u000eH\u0097\u0001¢\u0006\u0005\bÅ\u0001\u0010HJ\u0018\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u000eH\u0097\u0001¢\u0006\u0005\bÆ\u0001\u0010HJ3\u0010Ç\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\tH\u0097\u0001¢\u0006\u0005\bÇ\u0001\u0010SJ(\u0010È\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bÈ\u0001\u0010}J\u0018\u0010É\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u000eH\u0097\u0001¢\u0006\u0005\bÉ\u0001\u0010HJ*\u0010Ì\u0001\u001a\t\u0012\u0005\u0012\u00030Ë\u00010\u000e2\u0006\u0010A\u001a\u00020\t2\u0007\u0010Ê\u0001\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bÌ\u0001\u0010}J*\u0010Î\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¡\u00010\u000f0\u000e2\b\u0010Î\u0001\u001a\u00030Í\u0001H\u0097\u0001¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001Jc\u0010Ó\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\r\u0010:\u001a\t\u0012\u0005\u0012\u00030Ð\u00010\u000f2\t\u0010Á\u0001\u001a\u0004\u0018\u00010\u00102\t\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u00052\t\u0010Ò\u0001\u001a\u0004\u0018\u0001012\b\u0010x\u001a\u0004\u0018\u00010\u0005H\u0097\u0001¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001JL\u0010Õ\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\t\u0010Á\u0001\u001a\u0004\u0018\u00010\u00102\b\u0010x\u001a\u0004\u0018\u00010\u0005H\u0097\u0001¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001JL\u0010×\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\t\u0010Á\u0001\u001a\u0004\u0018\u00010\u00102\b\u0010x\u001a\u0004\u0018\u00010\u0005H\u0097\u0001¢\u0006\u0006\b×\u0001\u0010Ö\u0001JW\u0010Ø\u0001\u001a\b\u0012\u0004\u0012\u0002090\u000e2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t2\u0015\u0010\u009b\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u00012\r\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0097\u0001¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J-\u0010Û\u0001\u001a\t\u0012\u0005\u0012\u00030Ä\u00010\u000e2\u0006\u0010A\u001a\u00020\t2\t\u0010Ú\u0001\u001a\u0004\u0018\u00010\fH\u0097\u0001¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J \u0010Ý\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010A\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bÝ\u0001\u0010\u001eJC\u0010á\u0001\u001a\t\u0012\u0005\u0012\u00030à\u00010\u000e2\u0006\u0010A\u001a\u00020\t2\t\u0010Þ\u0001\u001a\u0004\u0018\u00010\t2\u0014\u0010ß\u0001\u001a\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0099\u0001H\u0097\u0001¢\u0006\u0006\bá\u0001\u0010â\u0001J!\u0010ã\u0001\u001a\t\u0012\u0005\u0012\u00030à\u00010\u000e2\u0006\u0010A\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bã\u0001\u0010\u001eJC\u0010ä\u0001\u001a\t\u0012\u0005\u0012\u00030à\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\t\u0010Þ\u0001\u001a\u0004\u0018\u00010\t2\u0014\u0010ß\u0001\u001a\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0099\u0001H\u0097\u0001¢\u0006\u0006\bä\u0001\u0010â\u0001J!\u0010å\u0001\u001a\t\u0012\u0005\u0012\u00030à\u00010\u000e2\u0006\u0010\n\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bå\u0001\u0010\u001eJQ\u0010è\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0007\u0010æ\u0001\u001a\u00020\t2\t\u0010Ú\u0001\u001a\u0004\u0018\u00010\f2\t\u0010Þ\u0001\u001a\u0004\u0018\u00010\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0007\u0010ç\u0001\u001a\u00020\u0005H\u0097\u0001¢\u0006\u0006\bè\u0001\u0010é\u0001J;\u0010ê\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0007\u0010æ\u0001\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0007\u0010ç\u0001\u001a\u00020\u0005H\u0097\u0001¢\u0006\u0006\bê\u0001\u0010ë\u0001JK\u0010î\u0001\u001a\t\u0012\u0005\u0012\u00030í\u00010\u000e2\u0007\u0010ì\u0001\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0016\u0010«\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u009a\u0001\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u0001H\u0097\u0001¢\u0006\u0006\bî\u0001\u0010ï\u0001J)\u0010ñ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\n\u001a\u00020\t2\u0007\u0010ð\u0001\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bñ\u0001\u0010}J!\u0010ó\u0001\u001a\t\u0012\u0005\u0012\u00030ò\u00010\u000e2\u0006\u0010Q\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bó\u0001\u0010\u001eJ8\u0010ö\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030í\u00010\u000f0\u000e2\r\u0010ô\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0007\u0010õ\u0001\u001a\u00020\tH\u0097\u0001¢\u0006\u0006\bö\u0001\u0010÷\u0001J\"\u0010ú\u0001\u001a\t\u0012\u0005\u0012\u00030ù\u00010\u000e2\u0007\u0010ø\u0001\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bú\u0001\u0010\u001eJ#\u0010ý\u0001\u001a\t\u0012\u0005\u0012\u00030ü\u00010\u000e2\u0007\u0010*\u001a\u00030û\u0001H\u0097\u0001¢\u0006\u0006\bý\u0001\u0010þ\u0001J,\u0010\u0082\u0002\u001a\t\u0012\u0005\u0012\u00030\u0081\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0080\u0002\u001a\u00030ÿ\u0001H\u0097\u0001¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002JH\u0010\u0085\u0002\u001a\t\u0012\u0005\u0012\u00030\u0084\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0015\u0010\u009b\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u00012\r\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0097\u0001¢\u0006\u0006\b\u0085\u0002\u0010ª\u0001J$\u0010\u0089\u0002\u001a\t\u0012\u0005\u0012\u00030\u0088\u00020\u000e2\b\u0010\u0087\u0002\u001a\u00030\u0086\u0002H\u0097\u0001¢\u0006\u0006\b\u0089\u0002\u0010\u008a\u0002J$\u0010\u008c\u0002\u001a\t\u0012\u0005\u0012\u00030\u0088\u00020\u000e2\b\u0010\u0083\u0001\u001a\u00030\u008b\u0002H\u0097\u0001¢\u0006\u0006\b\u008c\u0002\u0010\u008d\u0002J\"\u0010\u008f\u0002\u001a\t\u0012\u0005\u0012\u00030\u0088\u00020\u000e2\u0007\u0010\u008e\u0002\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b\u008f\u0002\u0010\u001eJ-\u0010\u0092\u0002\u001a\t\u0012\u0005\u0012\u00030\u0090\u00020\u000e2\u0007\u0010\u008e\u0002\u001a\u00020\t2\b\u0010\u0091\u0002\u001a\u00030\u0090\u0002H\u0097\u0001¢\u0006\u0006\b\u0092\u0002\u0010\u0093\u0002J-\u0010\u0094\u0002\u001a\t\u0012\u0005\u0012\u00030\u0090\u00020\u000e2\u0007\u0010\u008e\u0002\u001a\u00020\t2\b\u0010\u0091\u0002\u001a\u00030\u0090\u0002H\u0097\u0001¢\u0006\u0006\b\u0094\u0002\u0010\u0093\u0002J*\u0010\u0096\u0002\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0007\u0010\u008e\u0002\u001a\u00020\t2\u0007\u0010\u0095\u0002\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b\u0096\u0002\u0010}JQ\u0010\u0099\u0002\u001a\t\u0012\u0005\u0012\u00030\u0098\u00020\u000e2\u0007\u0010\u008e\u0002\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010o\u001a\u0004\u0018\u00010\t2\u000f\u0010$\u001a\u000b\u0012\u0005\u0012\u00030\u0097\u0002\u0018\u00010#H\u0097\u0001¢\u0006\u0005\b\u0099\u0002\u0010uJI\u0010\u009b\u0002\u001a\t\u0012\u0005\u0012\u00030\u009a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010o\u001a\u0004\u0018\u00010\t2\u000f\u0010$\u001a\u000b\u0012\u0005\u0012\u00030\u0088\u0002\u0018\u00010#H\u0097\u0001¢\u0006\u0006\b\u009b\u0002\u0010\u0092\u0001J3\u0010\u009c\u0002\u001a\t\u0012\u0005\u0012\u00030\u0097\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0007\u0010\u008e\u0002\u001a\u00020\t2\u0007\u0010\u0095\u0002\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b\u009c\u0002\u0010SJ3\u0010\u009e\u0002\u001a\t\u0012\u0005\u0012\u00030\u0097\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0007\u0010\u008e\u0002\u001a\u00020\t2\u0007\u0010\u009d\u0002\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b\u009e\u0002\u0010SJ3\u0010 \u0002\u001a\t\u0012\u0005\u0012\u00030\u0097\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0007\u0010\u008e\u0002\u001a\u00020\t2\u0007\u0010\u009f\u0002\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b \u0002\u0010SJI\u0010¡\u0002\u001a\t\u0012\u0005\u0012\u00030\u0088\u00020\u000e2\u0007\u0010\u008e\u0002\u001a\u00020\t2\u0015\u0010\u009b\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u009a\u00010\u0099\u00012\r\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0097\u0001¢\u0006\u0006\b¡\u0002\u0010ª\u0001J\"\u0010¢\u0002\u001a\t\u0012\u0005\u0012\u00030\u0088\u00020\u000e2\u0007\u0010\u008e\u0002\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b¢\u0002\u0010\u001eJ!\u0010£\u0002\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0007\u0010\u008e\u0002\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b£\u0002\u0010\u001eJ,\u0010¦\u0002\u001a\t\u0012\u0005\u0012\u00030¥\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\t\u0010¤\u0002\u001a\u0004\u0018\u000101H\u0097\u0001¢\u0006\u0005\b¦\u0002\u0010lJ,\u0010§\u0002\u001a\t\u0012\u0005\u0012\u00030¥\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\t\u0010¤\u0002\u001a\u0004\u0018\u000101H\u0097\u0001¢\u0006\u0005\b§\u0002\u0010lJ \u0010¨\u0002\u001a\b\u0012\u0004\u0012\u00020C0\u000e2\u0006\u0010\n\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b¨\u0002\u0010\u001eJC\u0010ª\u0002\u001a\t\u0012\u0005\u0012\u00030©\u00020\u000e2\u0006\u0010/\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\b\u0010o\u001a\u0004\u0018\u00010\t2\r\u0010$\u001a\t\u0012\u0005\u0012\u00030¥\u00020#H\u0097\u0001¢\u0006\u0006\bª\u0002\u0010«\u0002J\u001f\u0010\u00ad\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¬\u00020\u000f0\u000eH\u0097\u0001¢\u0006\u0005\b\u00ad\u0002\u0010HJ$\u0010¯\u0002\u001a\t\u0012\u0005\u0012\u00030¬\u00020\u000e2\b\u0010®\u0002\u001a\u00030¬\u0002H\u0097\u0001¢\u0006\u0006\b¯\u0002\u0010°\u0002J$\u0010±\u0002\u001a\t\u0012\u0005\u0012\u00030¬\u00020\u000e2\b\u0010®\u0002\u001a\u00030¬\u0002H\u0097\u0001¢\u0006\u0006\b±\u0002\u0010°\u0002J\u0013\u0010²\u0002\u001a\u00020CH\u0096\u0001¢\u0006\u0006\b²\u0002\u0010³\u0002J\u0013\u0010´\u0002\u001a\u00020CH\u0096\u0001¢\u0006\u0006\b´\u0002\u0010³\u0002J\u0012\u0010µ\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0006\bµ\u0002\u0010¶\u0002R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010·\u0002R\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010¸\u0002R\u0017\u0010¹\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0002\u0010º\u0002¨\u0006»\u0002"}, m65681d2 = {"Lio/getstream/chat/android/client/api/internal/DistinctChatApiEnabler;", "Lio/getstream/chat/android/client/api/ChatApi;", "Lio/getstream/chat/android/client/api/internal/DistinctChatApi;", "distinctApi", "Lkotlin/Function0;", "", "distinctCallsEnabled", "<init>", "(Lio/getstream/chat/android/client/api/internal/DistinctChatApi;Lc93/a;)V", "", "messageId", "firstId", "", MapboxMap.QFE_LIMIT, "Lo23/d;", "", "Lio/getstream/chat/android/models/Message;", "getRepliesMore", "(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;", "getReplies", "(Ljava/lang/String;I)Lo23/d;", "parentId", "lastId", "getNewerReplies", "(Ljava/lang/String;ILjava/lang/String;)Lo23/d;", MapboxMap.QFE_OFFSET, "Lio/getstream/chat/android/models/Reaction;", "getReactions", "(Ljava/lang/String;II)Lo23/d;", "getMessage", "(Ljava/lang/String;)Lo23/d;", "Lio/getstream/chat/android/models/PendingMessage;", "getPendingMessage", "channelType", "channelId", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", "pagination", "getPinnedMessages", "(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "query", "Lio/getstream/chat/android/client/api/models/QueryChannelsResult;", "queryChannels", "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;", "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/BannedUsersSort;", "Ljava/util/Date;", "createdAtAfter", "createdAtAfterOrEqual", "createdAtBefore", "createdAtBeforeOrEqual", "Lio/getstream/chat/android/models/BannedUser;", "queryBannedUsers", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;", "Lio/getstream/chat/android/models/Member;", QueryChannelRequest.KEY_MEMBERS, "queryMembers", "(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "Lio/getstream/chat/android/models/Channel;", "queryChannel", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lo23/d;", "userId", "connectionId", "Ll83/a0;", "setConnection", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/getstream/chat/android/models/AppSettings;", "appSettings", "()Lo23/d;", "Ljava/io/File;", "file", "Lio/getstream/chat/android/client/utils/ProgressCallback;", "callback", "Lio/getstream/chat/android/models/UploadedFile;", "sendFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;", "sendImage", QueryParams.URL, "deleteFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "deleteImage", "progressCallback", "uploadFile", "(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;", "uploadImage", "Lio/getstream/chat/android/models/Device;", "device", "addDevice", "(Lio/getstream/chat/android/models/Device;)Lo23/d;", "id", "deleteDevice", "getDevices", "Lio/getstream/chat/android/models/PushPreferenceLevel;", "level", "Lio/getstream/chat/android/models/PushPreference;", "setUserPushPreference", "(Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;", "until", "snoozeUserPushNotifications", "(Ljava/util/Date;)Lo23/d;", "cid", "setChannelPushPreference", "(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;", "snoozeChannelPushNotifications", "(Ljava/lang/String;Ljava/util/Date;)Lo23/d;", "channelFilter", "messageFilter", "next", "Lio/getstream/chat/android/models/SearchMessagesResult;", "searchMessages", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "Lio/getstream/chat/android/models/QueryReactionsResult;", "queryReactions", "(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "reaction", "enforceUnique", "skipPush", "sendReaction", "(Lio/getstream/chat/android/models/Reaction;ZZ)Lo23/d;", "reactionType", "deleteReaction", "(Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "hard", "deleteForMe", "deleteMessage", "(Ljava/lang/String;ZZ)Lo23/d;", "Lio/getstream/chat/android/client/api/models/SendActionRequest;", "request", "sendAction", "(Lio/getstream/chat/android/client/api/models/SendActionRequest;)Lo23/d;", "message", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;", "Lio/getstream/chat/android/models/DraftMessage;", "createDraftMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lo23/d;", "deleteDraftMessage", "queryDraftMessages", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lo23/d;", "Lio/getstream/chat/android/models/DraftsSort;", "Lio/getstream/chat/android/models/QueryDraftsResult;", "queryDrafts", "(Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "expiration", "muteChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unmuteChannel", "updateMessage", "(Lio/getstream/chat/android/models/Message;)Lo23/d;", "", "", "set", "unset", "skipEnrichUrl", "partialUpdateMessage", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Z)Lo23/d;", "stopWatching", "Lio/getstream/chat/android/models/User;", "users", "updateUsers", "(Ljava/util/List;)Lo23/d;", "Lio/getstream/chat/android/models/UserBlock;", "blockUser", "unblockUser", "queryBlockedUsers", "partialUpdateUser", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "extraData", "updateChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Message;)Lo23/d;", "updateChannelPartial", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "cooldownTimeInSeconds", "enableSlowMode", "disableSlowMode", "Lio/getstream/chat/android/models/UnreadCounts;", "getUnreadCounts", "markRead", "messages", "markDelivered", "threadId", "markThreadRead", "messageTimestamp", "markUnread", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lo23/d;", "showChannel", "clearHistory", "hideChannel", "(Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "systemMessage", "truncateChannel", "rejectInvite", "Lio/getstream/chat/android/models/Mute;", "muteCurrentUser", "unmuteCurrentUser", "acceptInvite", "deleteChannel", "markAllRead", "userName", "Lio/getstream/chat/android/models/GuestUser;", "getGuestUser", "Lio/getstream/chat/android/client/api/models/QueryUsersRequest;", "queryUsers", "(Lio/getstream/chat/android/client/api/models/QueryUsersRequest;)Lo23/d;", "Lio/getstream/chat/android/models/MemberData;", "hideHistory", "hideHistoryBefore", "addMembers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lo23/d;", "removeMembers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;", "inviteMembers", "partialUpdateMember", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "timeout", "muteUser", "(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unmuteUser", "reason", "customData", "Lio/getstream/chat/android/models/Flag;", "flagUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;", "unflagUser", "flagMessage", "unflagMessage", "targetId", "shadow", "banUser", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "unbanUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "eventType", "Lio/getstream/chat/android/client/events/ChatEvent;", "sendEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;", "language", "translate", "Lio/getstream/chat/android/models/Attachment;", "og", "channelIds", "lastSyncAt", "getSyncHistory", "(Ljava/util/List;Ljava/lang/String;)Lo23/d;", "fileUrl", "Lud3/a1;", "downloadFile", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "Lio/getstream/chat/android/models/QueryThreadsResult;", "queryThreads", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/GetThreadOptions;", "options", "Lio/getstream/chat/android/models/Thread;", "getThread", "(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/GetThreadOptions;)Lo23/d;", "Lio/getstream/chat/android/models/ThreadInfo;", "partialUpdateThread", "Lio/getstream/chat/android/models/CreatePollParams;", "createPollParams", "Lio/getstream/chat/android/models/Poll;", "createPoll", "(Lio/getstream/chat/android/models/CreatePollParams;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/UpdatePollRequest;", "updatePoll", "(Lio/getstream/chat/android/client/api/models/UpdatePollRequest;)Lo23/d;", "pollId", "getPoll", "Lio/getstream/chat/android/models/PollOption;", "option", "createPollOption", "(Ljava/lang/String;Lio/getstream/chat/android/models/PollOption;)Lo23/d;", "updatePollOption", "optionId", "deletePollOption", "Lio/getstream/chat/android/models/Vote;", "Lio/getstream/chat/android/models/QueryPollVotesResult;", "queryPollVotes", "Lio/getstream/chat/android/models/QueryPollsResult;", "queryPolls", "castPollVote", "answer", "castPollAnswer", "voteId", "removePollVote", "partialUpdatePoll", "closePoll", "deletePoll", "remindAt", "Lio/getstream/chat/android/models/MessageReminder;", "createReminder", "updateReminder", "deleteReminder", "Lio/getstream/chat/android/models/QueryRemindersResult;", "queryReminders", "(Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "Lio/getstream/chat/android/models/Location;", "queryActiveLocations", "location", "updateLiveLocation", "(Lio/getstream/chat/android/models/Location;)Lo23/d;", "stopLiveLocation", "warmUp", "()V", "releaseConnection", "getApi", "()Lio/getstream/chat/android/client/api/ChatApi;", "Lio/getstream/chat/android/client/api/internal/DistinctChatApi;", "Lc93/a;", "originalApi", "Lio/getstream/chat/android/client/api/ChatApi;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DistinctChatApiEnabler implements ChatApi {
    private final /* synthetic */ ChatApi $$delegate_0;
    private final DistinctChatApi distinctApi;
    private final InterfaceC4339a distinctCallsEnabled;
    private final ChatApi originalApi;

    public DistinctChatApiEnabler(DistinctChatApi distinctApi, InterfaceC4339a distinctCallsEnabled) {
        AbstractC22676k.m65750j(distinctApi, "distinctApi");
        AbstractC22676k.m65750j(distinctCallsEnabled, "distinctCallsEnabled");
        this.$$delegate_0 = distinctApi.getDelegate();
        this.distinctApi = distinctApi;
        this.distinctCallsEnabled = distinctCallsEnabled;
        this.originalApi = distinctApi.getDelegate();
    }

    private final ChatApi getApi() {
        return ((Boolean) this.distinctCallsEnabled.invoke()).booleanValue() ? this.distinctApi : this.originalApi;
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d acceptInvite(String channelType, String channelId, String message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.$$delegate_0.acceptInvite(channelType, channelId, message);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d addDevice(Device device) {
        AbstractC22676k.m65750j(device, "device");
        return this.$$delegate_0.addDevice(device);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d addMembers(String channelType, String channelId, List<MemberData> members, Message systemMessage, Boolean hideHistory, Date hideHistoryBefore, Boolean skipPush) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(members, "members");
        return this.$$delegate_0.addMembers(channelType, channelId, members, systemMessage, hideHistory, hideHistoryBefore, skipPush);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d appSettings() {
        return this.$$delegate_0.appSettings();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d banUser(String targetId, Integer timeout, String reason, String channelType, String channelId, boolean shadow) {
        AbstractC22676k.m65750j(targetId, "targetId");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.$$delegate_0.banUser(targetId, timeout, reason, channelType, channelId, shadow);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d blockUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return this.$$delegate_0.blockUser(userId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d castPollAnswer(String messageId, String pollId, String answer) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(answer, "answer");
        return this.$$delegate_0.castPollAnswer(messageId, pollId, answer);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d castPollVote(String messageId, String pollId, String optionId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(optionId, "optionId");
        return this.$$delegate_0.castPollVote(messageId, pollId, optionId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d closePoll(String pollId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return this.$$delegate_0.closePoll(pollId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d createDraftMessage(String channelType, String channelId, DraftMessage message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        return this.$$delegate_0.createDraftMessage(channelType, channelId, message);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d createPoll(CreatePollParams createPollParams) {
        AbstractC22676k.m65750j(createPollParams, "createPollParams");
        return this.$$delegate_0.createPoll(createPollParams);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d createPollOption(String pollId, PollOption option) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(option, "option");
        return this.$$delegate_0.createPollOption(pollId, option);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d createReminder(String messageId, Date remindAt) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.$$delegate_0.createReminder(messageId, remindAt);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteChannel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.$$delegate_0.deleteChannel(channelType, channelId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteDevice(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        return this.$$delegate_0.deleteDevice(id4);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteDraftMessage(String channelType, String channelId, DraftMessage message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        return this.$$delegate_0.deleteDraftMessage(channelType, channelId, message);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteFile(String url) {
        AbstractC22676k.m65750j(url, "url");
        return this.$$delegate_0.deleteFile(url);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteImage(String url) {
        AbstractC22676k.m65750j(url, "url");
        return this.$$delegate_0.deleteImage(url);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteMessage(String messageId, boolean hard, boolean deleteForMe) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.$$delegate_0.deleteMessage(messageId, hard, deleteForMe);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deletePoll(String pollId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return this.$$delegate_0.deletePoll(pollId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deletePollOption(String pollId, String optionId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(optionId, "optionId");
        return this.$$delegate_0.deletePollOption(pollId, optionId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteReaction(String messageId, String reactionType) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(reactionType, "reactionType");
        return this.$$delegate_0.deleteReaction(messageId, reactionType);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteReminder(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.$$delegate_0.deleteReminder(messageId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d disableSlowMode(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.$$delegate_0.disableSlowMode(channelType, channelId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d downloadFile(String fileUrl) {
        AbstractC22676k.m65750j(fileUrl, "fileUrl");
        return this.$$delegate_0.downloadFile(fileUrl);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d enableSlowMode(String channelType, String channelId, int cooldownTimeInSeconds) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.$$delegate_0.enableSlowMode(channelType, channelId, cooldownTimeInSeconds);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d flagMessage(String messageId, String reason, Map<String, String> customData) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(customData, "customData");
        return this.$$delegate_0.flagMessage(messageId, reason, customData);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d flagUser(String userId, String reason, Map<String, String> customData) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(customData, "customData");
        return this.$$delegate_0.flagUser(userId, reason, customData);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getDevices() {
        return this.$$delegate_0.getDevices();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getGuestUser(String userId, String userName) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(userName, "userName");
        return this.$$delegate_0.getGuestUser(userId, userName);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return getApi().getMessage(messageId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getNewerReplies(String parentId, int limit, String lastId) {
        AbstractC22676k.m65750j(parentId, "parentId");
        return getApi().getNewerReplies(parentId, limit, lastId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getPendingMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return getApi().getPendingMessage(messageId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getPinnedMessages(String channelType, String channelId, int limit, QuerySorter<Message> sort, PinnedMessagesPagination pagination) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(pagination, "pagination");
        return getApi().getPinnedMessages(channelType, channelId, limit, sort, pagination);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getPoll(String pollId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return this.$$delegate_0.getPoll(pollId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getReactions(String messageId, int offset, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return getApi().getReactions(messageId, offset, limit);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getReplies(String messageId, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return getApi().getReplies(messageId, limit);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getRepliesMore(String messageId, String firstId, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(firstId, "firstId");
        return getApi().getRepliesMore(messageId, firstId, limit);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getSyncHistory(List<String> channelIds, String lastSyncAt) {
        AbstractC22676k.m65750j(channelIds, "channelIds");
        AbstractC22676k.m65750j(lastSyncAt, "lastSyncAt");
        return this.$$delegate_0.getSyncHistory(channelIds, lastSyncAt);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getThread(String messageId, GetThreadOptions options) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(options, "options");
        return this.$$delegate_0.getThread(messageId, options);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getUnreadCounts() {
        return this.$$delegate_0.getUnreadCounts();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d hideChannel(String channelType, String channelId, boolean clearHistory) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.$$delegate_0.hideChannel(channelType, channelId, clearHistory);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d inviteMembers(String channelType, String channelId, List<String> members, Message systemMessage, Boolean skipPush) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(members, "members");
        return this.$$delegate_0.inviteMembers(channelType, channelId, members, systemMessage, skipPush);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d markAllRead() {
        return this.$$delegate_0.markAllRead();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d markDelivered(List<Message> messages) {
        AbstractC22676k.m65750j(messages, "messages");
        return this.$$delegate_0.markDelivered(messages);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d markRead(String channelType, String channelId, String messageId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.$$delegate_0.markRead(channelType, channelId, messageId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d markThreadRead(String channelType, String channelId, String threadId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(threadId, "threadId");
        return this.$$delegate_0.markThreadRead(channelType, channelId, threadId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d markUnread(String channelType, String channelId, String messageId, Date messageTimestamp, String threadId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.$$delegate_0.markUnread(channelType, channelId, messageId, messageTimestamp, threadId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d muteChannel(String channelType, String channelId, Integer expiration) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.$$delegate_0.muteChannel(channelType, channelId, expiration);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d muteCurrentUser() {
        return this.$$delegate_0.muteCurrentUser();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d muteUser(String userId, Integer timeout) {
        AbstractC22676k.m65750j(userId, "userId");
        return this.$$delegate_0.muteUser(userId, timeout);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    /* JADX INFO: renamed from: og */
    public final InterfaceC27474d mo54539og(String url) {
        AbstractC22676k.m65750j(url, "url");
        return this.$$delegate_0.mo54539og(url);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdateMember(String channelType, String channelId, String userId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.$$delegate_0.partialUpdateMember(channelType, channelId, userId, set, unset);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdateMessage(String messageId, Map<String, ? extends Object> set, List<String> unset, boolean skipEnrichUrl) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.$$delegate_0.partialUpdateMessage(messageId, set, unset, skipEnrichUrl);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdatePoll(String pollId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.$$delegate_0.partialUpdatePoll(pollId, set, unset);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdateThread(String messageId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.$$delegate_0.partialUpdateThread(messageId, set, unset);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdateUser(String id4, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.$$delegate_0.partialUpdateUser(id4, set, unset);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryActiveLocations() {
        return this.$$delegate_0.queryActiveLocations();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryBannedUsers(FilterObject filter, QuerySorter<BannedUsersSort> sort, Integer offset, Integer limit, Date createdAtAfter, Date createdAtAfterOrEqual, Date createdAtBefore, Date createdAtBeforeOrEqual) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return getApi().queryBannedUsers(filter, sort, offset, limit, createdAtAfter, createdAtAfterOrEqual, createdAtBefore, createdAtBeforeOrEqual);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryBlockedUsers() {
        return this.$$delegate_0.queryBlockedUsers();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryChannel(String channelType, String channelId, QueryChannelRequest query) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(query, "query");
        return getApi().queryChannel(channelType, channelId, query);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryChannels(QueryChannelsRequest query) {
        AbstractC22676k.m65750j(query, "query");
        return getApi().queryChannels(query);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryDraftMessages(Integer offset, Integer limit) {
        return this.$$delegate_0.queryDraftMessages(offset, limit);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryDrafts(FilterObject filter, Integer limit, String next, QuerySorter<DraftsSort> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return this.$$delegate_0.queryDrafts(filter, limit, next, sort);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryMembers(String channelType, String channelId, int offset, int limit, FilterObject filter, QuerySorter<Member> sort, List<Member> members) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(members, "members");
        return getApi().queryMembers(channelType, channelId, offset, limit, filter, sort, members);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryPollVotes(String pollId, FilterObject filter, Integer limit, String next, QuerySorter<Vote> sort) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return this.$$delegate_0.queryPollVotes(pollId, filter, limit, next, sort);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryPolls(FilterObject filter, Integer limit, String next, QuerySorter<Poll> sort) {
        return this.$$delegate_0.queryPolls(filter, limit, next, sort);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryReactions(String messageId, FilterObject filter, Integer limit, String next, QuerySorter<Reaction> sort) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.$$delegate_0.queryReactions(messageId, filter, limit, next, sort);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryReminders(FilterObject filter, int limit, String next, QuerySorter<MessageReminder> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return this.$$delegate_0.queryReminders(filter, limit, next, sort);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryThreads(QueryThreadsRequest query) {
        AbstractC22676k.m65750j(query, "query");
        return this.$$delegate_0.queryThreads(query);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryUsers(QueryUsersRequest queryUsers) {
        AbstractC22676k.m65750j(queryUsers, "queryUsers");
        return this.$$delegate_0.queryUsers(queryUsers);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d rejectInvite(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.$$delegate_0.rejectInvite(channelType, channelId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final void releaseConnection() {
        this.$$delegate_0.releaseConnection();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d removeMembers(String channelType, String channelId, List<String> members, Message systemMessage, Boolean skipPush) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(members, "members");
        return this.$$delegate_0.removeMembers(channelType, channelId, members, systemMessage, skipPush);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d removePollVote(String messageId, String pollId, String voteId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(voteId, "voteId");
        return this.$$delegate_0.removePollVote(messageId, pollId, voteId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d searchMessages(FilterObject channelFilter, FilterObject messageFilter, Integer offset, Integer limit, String next, QuerySorter<Message> sort) {
        AbstractC22676k.m65750j(channelFilter, "channelFilter");
        AbstractC22676k.m65750j(messageFilter, "messageFilter");
        return this.$$delegate_0.searchMessages(channelFilter, messageFilter, offset, limit, next, sort);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendAction(SendActionRequest request) {
        AbstractC22676k.m65750j(request, "request");
        return this.$$delegate_0.sendAction(request);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendEvent(String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData) {
        AbstractC22676k.m65750j(eventType, "eventType");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        return this.$$delegate_0.sendEvent(eventType, channelType, channelId, extraData);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendFile(String channelType, String channelId, File file, ProgressCallback callback) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(file, "file");
        return this.$$delegate_0.sendFile(channelType, channelId, file, callback);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendImage(String channelType, String channelId, File file, ProgressCallback callback) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(file, "file");
        return this.$$delegate_0.sendImage(channelType, channelId, file, callback);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendMessage(String channelType, String channelId, Message message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        return this.$$delegate_0.sendMessage(channelType, channelId, message);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d sendReaction(Reaction reaction, boolean enforceUnique, boolean skipPush) {
        AbstractC22676k.m65750j(reaction, "reaction");
        return this.$$delegate_0.sendReaction(reaction, enforceUnique, skipPush);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d setChannelPushPreference(String cid, PushPreferenceLevel level) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(level, "level");
        return this.$$delegate_0.setChannelPushPreference(cid, level);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final void setConnection(String userId, String connectionId) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(connectionId, "connectionId");
        this.$$delegate_0.setConnection(userId, connectionId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d setUserPushPreference(PushPreferenceLevel level) {
        AbstractC22676k.m65750j(level, "level");
        return this.$$delegate_0.setUserPushPreference(level);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d showChannel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.$$delegate_0.showChannel(channelType, channelId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d snoozeChannelPushNotifications(String cid, Date until) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(until, "until");
        return this.$$delegate_0.snoozeChannelPushNotifications(cid, until);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d snoozeUserPushNotifications(Date until) {
        AbstractC22676k.m65750j(until, "until");
        return this.$$delegate_0.snoozeUserPushNotifications(until);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d stopLiveLocation(Location location) {
        AbstractC22676k.m65750j(location, "location");
        return this.$$delegate_0.stopLiveLocation(location);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d stopWatching(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.$$delegate_0.stopWatching(channelType, channelId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d translate(String messageId, String language) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(language, "language");
        return this.$$delegate_0.translate(messageId, language);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d truncateChannel(String channelType, String channelId, Message systemMessage) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.$$delegate_0.truncateChannel(channelType, channelId, systemMessage);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unbanUser(String targetId, String channelType, String channelId, boolean shadow) {
        AbstractC22676k.m65750j(targetId, "targetId");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.$$delegate_0.unbanUser(targetId, channelType, channelId, shadow);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unblockUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return this.$$delegate_0.unblockUser(userId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unflagMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.$$delegate_0.unflagMessage(messageId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unflagUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return this.$$delegate_0.unflagUser(userId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unmuteChannel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.$$delegate_0.unmuteChannel(channelType, channelId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unmuteCurrentUser() {
        return this.$$delegate_0.unmuteCurrentUser();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d unmuteUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        return this.$$delegate_0.unmuteUser(userId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateChannel(String channelType, String channelId, Map<String, ? extends Object> extraData, Message updateMessage) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        return this.$$delegate_0.updateChannel(channelType, channelId, extraData, updateMessage);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateChannelPartial(String channelType, String channelId, Map<String, ? extends Object> set, List<String> unset) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        return this.$$delegate_0.updateChannelPartial(channelType, channelId, set, unset);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateLiveLocation(Location location) {
        AbstractC22676k.m65750j(location, "location");
        return this.$$delegate_0.updateLiveLocation(location);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        return this.$$delegate_0.updateMessage(message);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updatePoll(UpdatePollRequest request) {
        AbstractC22676k.m65750j(request, "request");
        return this.$$delegate_0.updatePoll(request);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updatePollOption(String pollId, PollOption option) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(option, "option");
        return this.$$delegate_0.updatePollOption(pollId, option);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateReminder(String messageId, Date remindAt) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.$$delegate_0.updateReminder(messageId, remindAt);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateUsers(List<User> users) {
        AbstractC22676k.m65750j(users, "users");
        return this.$$delegate_0.updateUsers(users);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d uploadFile(File file, ProgressCallback progressCallback) {
        AbstractC22676k.m65750j(file, "file");
        return this.$$delegate_0.uploadFile(file, progressCallback);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d uploadImage(File file, ProgressCallback progressCallback) {
        AbstractC22676k.m65750j(file, "file");
        return this.$$delegate_0.uploadImage(file, progressCallback);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final void warmUp() {
        this.$$delegate_0.warmUp();
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteFile(String channelType, String channelId, String url) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(url, "url");
        return this.$$delegate_0.deleteFile(channelType, channelId, url);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d deleteImage(String channelType, String channelId, String url) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(url, "url");
        return this.$$delegate_0.deleteImage(channelType, channelId, url);
    }
}
