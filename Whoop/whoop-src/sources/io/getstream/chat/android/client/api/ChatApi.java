package io.getstream.chat.android.client.api;

import com.mapbox.maps.MapboxMap;
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

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000¸\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H'¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H'¢\u0006\u0004\b\u0015\u0010\u0014J-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0017\u0010\u001dJ'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H'¢\u0006\u0004\b\u001e\u0010\u001cJ\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0019\u0010\u001dJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010 \u001a\u00020\u001fH'¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010#\u001a\u00020\u0002H'¢\u0006\u0004\b$\u0010\u001dJ\u001b\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0%0\bH'¢\u0006\u0004\b&\u0010\u000bJ\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\b2\u0006\u0010(\u001a\u00020'H'¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020)0\b2\u0006\u0010-\u001a\u00020,H'¢\u0006\u0004\b.\u0010/J%\u00101\u001a\b\u0012\u0004\u0012\u00020)0\b2\u0006\u00100\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H'¢\u0006\u0004\b1\u00102J%\u00103\u001a\b\u0012\u0004\u0012\u00020)0\b2\u0006\u00100\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H'¢\u0006\u0004\b3\u00104JS\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\b2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\b\u00109\u001a\u0004\u0018\u0001082\b\u0010:\u001a\u0004\u0018\u0001082\b\u0010;\u001a\u0004\u0018\u00010\u00022\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<H'¢\u0006\u0004\b@\u0010AJ3\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0%0\b2\u0006\u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u00022\u0006\u0010:\u001a\u000208H'¢\u0006\u0004\bD\u0010EJ+\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0%0\b2\u0006\u0010B\u001a\u00020\u00022\u0006\u0010:\u001a\u000208H'¢\u0006\u0004\bF\u0010GJ5\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0%0\b2\u0006\u0010H\u001a\u00020\u00022\u0006\u0010:\u001a\u0002082\b\u0010I\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\bJ\u0010KJ3\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0%0\b2\u0006\u0010B\u001a\u00020\u00022\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000208H'¢\u0006\u0004\bM\u0010NJK\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\b2\u0006\u0010B\u001a\u00020\u00022\b\u0010O\u001a\u0004\u0018\u0001052\b\u0010:\u001a\u0004\u0018\u0001082\b\u0010;\u001a\u0004\u0018\u00010\u00022\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010<H'¢\u0006\u0004\bQ\u0010RJ-\u0010W\u001a\b\u0012\u0004\u0012\u00020L0\b2\u0006\u0010S\u001a\u00020L2\u0006\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u00020TH'¢\u0006\u0004\bW\u0010XJ%\u0010Z\u001a\b\u0012\u0004\u0012\u00020=0\b2\u0006\u0010B\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u0002H'¢\u0006\u0004\bZ\u0010[J-\u0010^\u001a\b\u0012\u0004\u0012\u00020=0\b2\u0006\u0010B\u001a\u00020\u00022\u0006\u0010\\\u001a\u00020T2\u0006\u0010]\u001a\u00020TH'¢\u0006\u0004\b^\u0010_J\u001d\u0010b\u001a\b\u0012\u0004\u0012\u00020=0\b2\u0006\u0010a\u001a\u00020`H'¢\u0006\u0004\bb\u0010cJ\u001d\u0010d\u001a\b\u0012\u0004\u0012\u00020=0\b2\u0006\u0010B\u001a\u00020\u0002H'¢\u0006\u0004\bd\u0010\u001dJ\u001d\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\b2\u0006\u0010B\u001a\u00020\u0002H'¢\u0006\u0004\bf\u0010\u001dJ-\u0010h\u001a\b\u0012\u0004\u0012\u00020=0\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010g\u001a\u00020=H'¢\u0006\u0004\bh\u0010iJ-\u0010k\u001a\b\u0012\u0004\u0012\u00020j0\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010g\u001a\u00020jH'¢\u0006\u0004\bk\u0010lJ-\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010g\u001a\u00020jH'¢\u0006\u0004\bm\u0010lJ/\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0%0\b2\b\u00109\u001a\u0004\u0018\u0001082\b\u0010:\u001a\u0004\u0018\u000108H'¢\u0006\u0004\bn\u0010oJ?\u0010r\u001a\b\u0012\u0004\u0012\u00020q0\b2\u0006\u0010O\u001a\u0002052\b\u0010:\u001a\u0004\u0018\u0001082\b\u0010;\u001a\u0004\u0018\u00010\u00022\f\u0010>\u001a\b\u0012\u0004\u0012\u00020p0<H'¢\u0006\u0004\br\u0010sJ/\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\b\u0010t\u001a\u0004\u0018\u000108H'¢\u0006\u0004\bu\u0010vJ%\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\bw\u0010[J\u001d\u0010x\u001a\b\u0012\u0004\u0012\u00020=0\b2\u0006\u0010g\u001a\u00020=H'¢\u0006\u0004\bx\u0010yJI\u0010~\u001a\b\u0012\u0004\u0012\u00020=0\b2\u0006\u0010B\u001a\u00020\u00022\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010z2\f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00020%2\b\b\u0002\u0010}\u001a\u00020TH'¢\u0006\u0004\b~\u0010\u007fJ'\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H'¢\u0006\u0005\b\u0080\u0001\u0010[JN\u0010\u0083\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0%0\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010:\u001a\u0002082\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H'¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J#\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010\b2\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H'¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J/\u0010\u008c\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00010%0\b2\u000e\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010%H'¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J \u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0005\b\u008f\u0001\u0010\u001dJ\u001f\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0005\b\u0090\u0001\u0010\u001dJ\u001e\u0010\u0091\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008e\u00010%0\bH'¢\u0006\u0005\b\u0091\u0001\u0010\u000bJI\u0010\u0092\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00010%0\b2\u0006\u0010#\u001a\u00020\u00022\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010z2\f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00020%H'¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J5\u0010\u0096\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\b2\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\u0010\u0086\u0001\u001a\u00030\u0094\u0001H&¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001JH\u0010\u0099\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0013\u0010\u0098\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010z2\b\u0010x\u001a\u0004\u0018\u00010=H'¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001JK\u0010\u009b\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010z2\f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00020%H'¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J1\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u009d\u0001\u001a\u000208H'¢\u0006\u0005\b\u009e\u0001\u0010EJ(\u0010\u009f\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H'¢\u0006\u0005\b\u009f\u0001\u0010[J\u0018\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030 \u00010\bH&¢\u0006\u0005\b¡\u0001\u0010\u000bJ1\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010B\u001a\u00020\u0002H'¢\u0006\u0005\b¢\u0001\u0010\u0018J'\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\r\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020=0%H'¢\u0006\u0006\b¤\u0001\u0010\u008d\u0001J0\u0010¦\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010¥\u0001\u001a\u00020\u0002H'¢\u0006\u0005\b¦\u0001\u0010\u0018JN\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00022\u000b\b\u0002\u0010§\u0001\u001a\u0004\u0018\u00010,2\u000b\b\u0002\u0010¥\u0001\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0006\b¨\u0001\u0010©\u0001J'\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H'¢\u0006\u0005\bª\u0001\u0010[J1\u0010¬\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010«\u0001\u001a\u00020TH'¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J3\u0010¯\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\t\u0010®\u0001\u001a\u0004\u0018\u00010=H'¢\u0006\u0005\b¯\u0001\u0010iJ(\u0010°\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H'¢\u0006\u0005\b°\u0001\u0010[J\u0018\u0010²\u0001\u001a\t\u0012\u0005\u0012\u00030±\u00010\bH'¢\u0006\u0005\b²\u0001\u0010\u000bJ\u0017\u0010³\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\bH'¢\u0006\u0005\b³\u0001\u0010\u000bJ2\u0010´\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\b\u0010g\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0005\b´\u0001\u0010\u0018J(\u0010µ\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H'¢\u0006\u0005\bµ\u0001\u0010[J\u0017\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\bH'¢\u0006\u0005\b¶\u0001\u0010\u000bJ)\u0010¹\u0001\u001a\t\u0012\u0005\u0012\u00030¸\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010·\u0001\u001a\u00020\u0002H'¢\u0006\u0005\b¹\u0001\u0010[J)\u0010»\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00010%0\b2\b\u0010»\u0001\u001a\u00030º\u0001H'¢\u0006\u0006\b»\u0001\u0010¼\u0001Jd\u0010Á\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u000e\u0010¾\u0001\u001a\t\u0012\u0005\u0012\u00030½\u00010%2\t\u0010®\u0001\u001a\u0004\u0018\u00010=2\t\u0010¿\u0001\u001a\u0004\u0018\u00010T2\t\u0010À\u0001\u001a\u0004\u0018\u00010,2\b\u0010V\u001a\u0004\u0018\u00010TH'¢\u0006\u0006\bÁ\u0001\u0010Â\u0001JM\u0010Ã\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\r\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020%2\t\u0010®\u0001\u001a\u0004\u0018\u00010=2\b\u0010V\u001a\u0004\u0018\u00010TH'¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001JM\u0010Å\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\r\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020%2\t\u0010®\u0001\u001a\u0004\u0018\u00010=2\b\u0010V\u001a\u0004\u0018\u00010TH'¢\u0006\u0006\bÅ\u0001\u0010Ä\u0001JS\u0010Ç\u0001\u001a\t\u0012\u0005\u0012\u00030Æ\u00010\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010z2\f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00020%H'¢\u0006\u0006\bÇ\u0001\u0010È\u0001Jf\u0010É\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Æ\u00010%0\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u0002082\u0006\u0010O\u001a\u0002052\r\u0010>\u001a\t\u0012\u0005\u0012\u00030Æ\u00010<2\u000e\u0010¾\u0001\u001a\t\u0012\u0005\u0012\u00030Æ\u00010%H'¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J,\u0010Ì\u0001\u001a\t\u0012\u0005\u0012\u00030±\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\t\u0010Ë\u0001\u001a\u0004\u0018\u000108H'¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J\u001f\u0010Î\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0005\bÎ\u0001\u0010\u001dJA\u0010Ò\u0001\u001a\t\u0012\u0005\u0012\u00030Ñ\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\t\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00022\u0013\u0010Ð\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020zH'¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J \u0010Ô\u0001\u001a\t\u0012\u0005\u0012\u00030Ñ\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0005\bÔ\u0001\u0010\u001dJA\u0010Õ\u0001\u001a\t\u0012\u0005\u0012\u00030Ñ\u00010\b2\u0006\u0010B\u001a\u00020\u00022\t\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00022\u0013\u0010Ð\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020zH'¢\u0006\u0006\bÕ\u0001\u0010Ó\u0001J \u0010Ö\u0001\u001a\t\u0012\u0005\u0012\u00030Ñ\u00010\b2\u0006\u0010B\u001a\u00020\u0002H'¢\u0006\u0005\bÖ\u0001\u0010\u001dJP\u0010Ù\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0007\u0010×\u0001\u001a\u00020\u00022\t\u0010Ë\u0001\u001a\u0004\u0018\u0001082\t\u0010Ï\u0001\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010Ø\u0001\u001a\u00020TH'¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J:\u0010Û\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0007\u0010×\u0001\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010Ø\u0001\u001a\u00020TH'¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001Jv\u0010ã\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030â\u00010%0\b2\u0006\u0010O\u001a\u0002052\r\u0010>\u001a\t\u0012\u0005\u0012\u00030Ý\u00010<2\b\u00109\u001a\u0004\u0018\u0001082\b\u0010:\u001a\u0004\u0018\u0001082\t\u0010Þ\u0001\u001a\u0004\u0018\u00010,2\t\u0010ß\u0001\u001a\u0004\u0018\u00010,2\t\u0010à\u0001\u001a\u0004\u0018\u00010,2\t\u0010á\u0001\u001a\u0004\u0018\u00010,H'¢\u0006\u0006\bã\u0001\u0010ä\u0001JG\u0010ç\u0001\u001a\t\u0012\u0005\u0012\u00030æ\u00010\b2\u0007\u0010å\u0001\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0013\u0010\u0098\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010zH'¢\u0006\u0006\bç\u0001\u0010è\u0001J(\u0010ê\u0001\u001a\b\u0012\u0004\u0012\u00020=0\b2\u0006\u0010B\u001a\u00020\u00022\u0007\u0010é\u0001\u001a\u00020\u0002H'¢\u0006\u0005\bê\u0001\u0010[J \u0010ì\u0001\u001a\t\u0012\u0005\u0012\u00030ë\u00010\b2\u0006\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0005\bì\u0001\u0010\u001dJ7\u0010ï\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030æ\u00010%0\b2\r\u0010í\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020%2\u0007\u0010î\u0001\u001a\u00020\u0002H'¢\u0006\u0006\bï\u0001\u0010ð\u0001J!\u0010ó\u0001\u001a\t\u0012\u0005\u0012\u00030ò\u00010\b2\u0007\u0010ñ\u0001\u001a\u00020\u0002H'¢\u0006\u0005\bó\u0001\u0010\u001dJ#\u0010ö\u0001\u001a\t\u0012\u0005\u0012\u00030õ\u00010\b2\b\u0010\u0086\u0001\u001a\u00030ô\u0001H'¢\u0006\u0006\bö\u0001\u0010÷\u0001J+\u0010û\u0001\u001a\t\u0012\u0005\u0012\u00030ú\u00010\b2\u0006\u0010B\u001a\u00020\u00022\b\u0010ù\u0001\u001a\u00030ø\u0001H'¢\u0006\u0006\bû\u0001\u0010ü\u0001JC\u0010þ\u0001\u001a\t\u0012\u0005\u0012\u00030ý\u00010\b2\u0006\u0010B\u001a\u00020\u00022\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010z2\f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00020%H'¢\u0006\u0006\bþ\u0001\u0010\u0093\u0001J#\u0010\u0082\u0002\u001a\t\u0012\u0005\u0012\u00030\u0081\u00020\b2\b\u0010\u0080\u0002\u001a\u00030ÿ\u0001H'¢\u0006\u0006\b\u0082\u0002\u0010\u0083\u0002J\"\u0010\u0085\u0002\u001a\t\u0012\u0005\u0012\u00030\u0081\u00020\b2\u0007\u0010a\u001a\u00030\u0084\u0002H'¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002J!\u0010\u0088\u0002\u001a\t\u0012\u0005\u0012\u00030\u0081\u00020\b2\u0007\u0010\u0087\u0002\u001a\u00020\u0002H'¢\u0006\u0005\b\u0088\u0002\u0010\u001dJ,\u0010\u008b\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\b2\u0007\u0010\u0087\u0002\u001a\u00020\u00022\b\u0010\u008a\u0002\u001a\u00030\u0089\u0002H'¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J,\u0010\u008d\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\b2\u0007\u0010\u0087\u0002\u001a\u00020\u00022\b\u0010\u008a\u0002\u001a\u00030\u0089\u0002H'¢\u0006\u0006\b\u008d\u0002\u0010\u008c\u0002J)\u0010\u008f\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0007\u0010\u0087\u0002\u001a\u00020\u00022\u0007\u0010\u008e\u0002\u001a\u00020\u0002H'¢\u0006\u0005\b\u008f\u0002\u0010[JP\u0010\u0092\u0002\u001a\t\u0012\u0005\u0012\u00030\u0091\u00020\b2\u0007\u0010\u0087\u0002\u001a\u00020\u00022\b\u0010O\u001a\u0004\u0018\u0001052\b\u0010:\u001a\u0004\u0018\u0001082\b\u0010;\u001a\u0004\u0018\u00010\u00022\u000f\u0010>\u001a\u000b\u0012\u0005\u0012\u00030\u0090\u0002\u0018\u00010<H'¢\u0006\u0005\b\u0092\u0002\u0010RJG\u0010\u0094\u0002\u001a\t\u0012\u0005\u0012\u00030\u0093\u00020\b2\b\u0010O\u001a\u0004\u0018\u0001052\b\u0010:\u001a\u0004\u0018\u0001082\b\u0010;\u001a\u0004\u0018\u00010\u00022\u000f\u0010>\u001a\u000b\u0012\u0005\u0012\u00030\u0081\u0002\u0018\u00010<H'¢\u0006\u0005\b\u0094\u0002\u0010sJ2\u0010\u0095\u0002\u001a\t\u0012\u0005\u0012\u00030\u0090\u00020\b2\u0006\u0010B\u001a\u00020\u00022\u0007\u0010\u0087\u0002\u001a\u00020\u00022\u0007\u0010\u008e\u0002\u001a\u00020\u0002H'¢\u0006\u0005\b\u0095\u0002\u0010\u0018J2\u0010\u0097\u0002\u001a\t\u0012\u0005\u0012\u00030\u0090\u00020\b2\u0006\u0010B\u001a\u00020\u00022\u0007\u0010\u0087\u0002\u001a\u00020\u00022\u0007\u0010\u0096\u0002\u001a\u00020\u0002H'¢\u0006\u0005\b\u0097\u0002\u0010\u0018J2\u0010\u0099\u0002\u001a\t\u0012\u0005\u0012\u00030\u0090\u00020\b2\u0006\u0010B\u001a\u00020\u00022\u0007\u0010\u0087\u0002\u001a\u00020\u00022\u0007\u0010\u0098\u0002\u001a\u00020\u0002H'¢\u0006\u0005\b\u0099\u0002\u0010\u0018JD\u0010\u009a\u0002\u001a\t\u0012\u0005\u0012\u00030\u0081\u00020\b2\u0007\u0010\u0087\u0002\u001a\u00020\u00022\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010z2\f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00020%H'¢\u0006\u0006\b\u009a\u0002\u0010\u0093\u0001J!\u0010\u009b\u0002\u001a\t\u0012\u0005\u0012\u00030\u0081\u00020\b2\u0007\u0010\u0087\u0002\u001a\u00020\u0002H'¢\u0006\u0005\b\u009b\u0002\u0010\u001dJ \u0010\u009c\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0007\u0010\u0087\u0002\u001a\u00020\u0002H'¢\u0006\u0005\b\u009c\u0002\u0010\u001dJ+\u0010\u009f\u0002\u001a\t\u0012\u0005\u0012\u00030\u009e\u00020\b2\u0006\u0010B\u001a\u00020\u00022\t\u0010\u009d\u0002\u001a\u0004\u0018\u00010,H'¢\u0006\u0005\b\u009f\u0002\u00104J+\u0010 \u0002\u001a\t\u0012\u0005\u0012\u00030\u009e\u00020\b2\u0006\u0010B\u001a\u00020\u00022\t\u0010\u009d\u0002\u001a\u0004\u0018\u00010,H'¢\u0006\u0005\b \u0002\u00104J\u001f\u0010¡\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010B\u001a\u00020\u0002H'¢\u0006\u0005\b¡\u0002\u0010\u001dJB\u0010£\u0002\u001a\t\u0012\u0005\u0012\u00030¢\u00020\b2\u0006\u0010O\u001a\u0002052\u0006\u0010:\u001a\u0002082\b\u0010;\u001a\u0004\u0018\u00010\u00022\r\u0010>\u001a\t\u0012\u0005\u0012\u00030\u009e\u00020<H'¢\u0006\u0006\b£\u0002\u0010¤\u0002J\u001e\u0010¦\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¥\u00020%0\bH'¢\u0006\u0005\b¦\u0002\u0010\u000bJ#\u0010¨\u0002\u001a\t\u0012\u0005\u0012\u00030¥\u00020\b2\b\u0010§\u0002\u001a\u00030¥\u0002H'¢\u0006\u0006\b¨\u0002\u0010©\u0002J#\u0010ª\u0002\u001a\t\u0012\u0005\u0012\u00030¥\u00020\b2\b\u0010§\u0002\u001a\u00030¥\u0002H'¢\u0006\u0006\bª\u0002\u0010©\u0002J\u0012\u0010«\u0002\u001a\u00020\u0005H&¢\u0006\u0006\b«\u0002\u0010¬\u0002J\u0012\u0010\u00ad\u0002\u001a\u00020\u0005H&¢\u0006\u0006\b\u00ad\u0002\u0010¬\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006®\u0002À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api/ChatApi;", "", "", "userId", "connectionId", "Ll83/a0;", "setConnection", "(Ljava/lang/String;Ljava/lang/String;)V", "Lo23/d;", "Lio/getstream/chat/android/models/AppSettings;", "appSettings", "()Lo23/d;", "channelType", "channelId", "Ljava/io/File;", "file", "Lio/getstream/chat/android/client/utils/ProgressCallback;", "callback", "Lio/getstream/chat/android/models/UploadedFile;", "sendFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;", "sendImage", QueryParams.URL, "deleteFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "deleteImage", "progressCallback", "uploadFile", "(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;", "(Ljava/lang/String;)Lo23/d;", "uploadImage", "Lio/getstream/chat/android/models/Device;", "device", "addDevice", "(Lio/getstream/chat/android/models/Device;)Lo23/d;", "id", "deleteDevice", "", "getDevices", "Lio/getstream/chat/android/models/PushPreferenceLevel;", "level", "Lio/getstream/chat/android/models/PushPreference;", "setUserPushPreference", "(Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;", "Ljava/util/Date;", "until", "snoozeUserPushNotifications", "(Ljava/util/Date;)Lo23/d;", "cid", "setChannelPushPreference", "(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;", "snoozeChannelPushNotifications", "(Ljava/lang/String;Ljava/util/Date;)Lo23/d;", "Lio/getstream/chat/android/models/FilterObject;", "channelFilter", "messageFilter", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "next", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Message;", "sort", "Lio/getstream/chat/android/models/SearchMessagesResult;", "searchMessages", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "messageId", "firstId", "getRepliesMore", "(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;", "getReplies", "(Ljava/lang/String;I)Lo23/d;", "parentId", "lastId", "getNewerReplies", "(Ljava/lang/String;ILjava/lang/String;)Lo23/d;", "Lio/getstream/chat/android/models/Reaction;", "getReactions", "(Ljava/lang/String;II)Lo23/d;", "filter", "Lio/getstream/chat/android/models/QueryReactionsResult;", "queryReactions", "(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "reaction", "", "enforceUnique", "skipPush", "sendReaction", "(Lio/getstream/chat/android/models/Reaction;ZZ)Lo23/d;", "reactionType", "deleteReaction", "(Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "hard", "deleteForMe", "deleteMessage", "(Ljava/lang/String;ZZ)Lo23/d;", "Lio/getstream/chat/android/client/api/models/SendActionRequest;", "request", "sendAction", "(Lio/getstream/chat/android/client/api/models/SendActionRequest;)Lo23/d;", "getMessage", "Lio/getstream/chat/android/models/PendingMessage;", "getPendingMessage", "message", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;", "Lio/getstream/chat/android/models/DraftMessage;", "createDraftMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lo23/d;", "deleteDraftMessage", "queryDraftMessages", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lo23/d;", "Lio/getstream/chat/android/models/DraftsSort;", "Lio/getstream/chat/android/models/QueryDraftsResult;", "queryDrafts", "(Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "expiration", "muteChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unmuteChannel", "updateMessage", "(Lio/getstream/chat/android/models/Message;)Lo23/d;", "", "set", "unset", "skipEnrichUrl", "partialUpdateMessage", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Z)Lo23/d;", "stopWatching", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", "pagination", "getPinnedMessages", "(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "query", "Lio/getstream/chat/android/client/api/models/QueryChannelsResult;", "queryChannels", "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;", "Lio/getstream/chat/android/models/User;", "users", "updateUsers", "(Ljava/util/List;)Lo23/d;", "Lio/getstream/chat/android/models/UserBlock;", "blockUser", "unblockUser", "queryBlockedUsers", "partialUpdateUser", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "Lio/getstream/chat/android/models/Channel;", "queryChannel", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lo23/d;", "extraData", "updateChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Message;)Lo23/d;", "updateChannelPartial", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "cooldownTimeInSeconds", "enableSlowMode", "disableSlowMode", "Lio/getstream/chat/android/models/UnreadCounts;", "getUnreadCounts", "markRead", "messages", "markDelivered", "threadId", "markThreadRead", "messageTimestamp", "markUnread", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lo23/d;", "showChannel", "clearHistory", "hideChannel", "(Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "systemMessage", "truncateChannel", "rejectInvite", "Lio/getstream/chat/android/models/Mute;", "muteCurrentUser", "unmuteCurrentUser", "acceptInvite", "deleteChannel", "markAllRead", "userName", "Lio/getstream/chat/android/models/GuestUser;", "getGuestUser", "Lio/getstream/chat/android/client/api/models/QueryUsersRequest;", "queryUsers", "(Lio/getstream/chat/android/client/api/models/QueryUsersRequest;)Lo23/d;", "Lio/getstream/chat/android/models/MemberData;", QueryChannelRequest.KEY_MEMBERS, "hideHistory", "hideHistoryBefore", "addMembers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lo23/d;", "removeMembers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;", "inviteMembers", "Lio/getstream/chat/android/models/Member;", "partialUpdateMember", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "queryMembers", "(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;", "timeout", "muteUser", "(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unmuteUser", "reason", "customData", "Lio/getstream/chat/android/models/Flag;", "flagUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;", "unflagUser", "flagMessage", "unflagMessage", "targetId", "shadow", "banUser", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "unbanUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "Lio/getstream/chat/android/models/BannedUsersSort;", "createdAtAfter", "createdAtAfterOrEqual", "createdAtBefore", "createdAtBeforeOrEqual", "Lio/getstream/chat/android/models/BannedUser;", "queryBannedUsers", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;", "eventType", "Lio/getstream/chat/android/client/events/ChatEvent;", "sendEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;", "language", "translate", "Lio/getstream/chat/android/models/Attachment;", "og", "channelIds", "lastSyncAt", "getSyncHistory", "(Ljava/util/List;Ljava/lang/String;)Lo23/d;", "fileUrl", "Lud3/a1;", "downloadFile", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "Lio/getstream/chat/android/models/QueryThreadsResult;", "queryThreads", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/GetThreadOptions;", "options", "Lio/getstream/chat/android/models/Thread;", "getThread", "(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/GetThreadOptions;)Lo23/d;", "Lio/getstream/chat/android/models/ThreadInfo;", "partialUpdateThread", "Lio/getstream/chat/android/models/CreatePollParams;", "createPollParams", "Lio/getstream/chat/android/models/Poll;", "createPoll", "(Lio/getstream/chat/android/models/CreatePollParams;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/UpdatePollRequest;", "updatePoll", "(Lio/getstream/chat/android/client/api/models/UpdatePollRequest;)Lo23/d;", "pollId", "getPoll", "Lio/getstream/chat/android/models/PollOption;", "option", "createPollOption", "(Ljava/lang/String;Lio/getstream/chat/android/models/PollOption;)Lo23/d;", "updatePollOption", "optionId", "deletePollOption", "Lio/getstream/chat/android/models/Vote;", "Lio/getstream/chat/android/models/QueryPollVotesResult;", "queryPollVotes", "Lio/getstream/chat/android/models/QueryPollsResult;", "queryPolls", "castPollVote", "answer", "castPollAnswer", "voteId", "removePollVote", "partialUpdatePoll", "closePoll", "deletePoll", "remindAt", "Lio/getstream/chat/android/models/MessageReminder;", "createReminder", "updateReminder", "deleteReminder", "Lio/getstream/chat/android/models/QueryRemindersResult;", "queryReminders", "(Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "Lio/getstream/chat/android/models/Location;", "queryActiveLocations", "location", "updateLiveLocation", "(Lio/getstream/chat/android/models/Location;)Lo23/d;", "stopLiveLocation", "warmUp", "()V", "releaseConnection", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChatApi {
    static /* synthetic */ InterfaceC27474d markRead$default(ChatApi chatApi, String str, String str2, String str3, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markRead");
        }
        if ((i13 & 4) != 0) {
            str3 = "";
        }
        return chatApi.markRead(str, str2, str3);
    }

    static /* synthetic */ InterfaceC27474d markUnread$default(ChatApi chatApi, String str, String str2, String str3, Date date, String str4, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: markUnread");
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        if ((i13 & 8) != 0) {
            date = null;
        }
        if ((i13 & 16) != 0) {
            str4 = null;
        }
        return chatApi.markUnread(str, str2, str3, date, str4);
    }

    static /* synthetic */ InterfaceC27474d partialUpdateMessage$default(ChatApi chatApi, String str, Map map, List list, boolean z4, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: partialUpdateMessage");
        }
        if ((i13 & 8) != 0) {
            z4 = false;
        }
        return chatApi.partialUpdateMessage(str, map, list, z4);
    }

    static /* synthetic */ InterfaceC27474d queryChannel$default(ChatApi chatApi, String str, String str2, QueryChannelRequest queryChannelRequest, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryChannel");
        }
        if ((i13 & 2) != 0) {
            str2 = "";
        }
        return chatApi.queryChannel(str, str2, queryChannelRequest);
    }

    static /* synthetic */ InterfaceC27474d sendFile$default(ChatApi chatApi, String str, String str2, File file, ProgressCallback progressCallback, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendFile");
        }
        if ((i13 & 8) != 0) {
            progressCallback = null;
        }
        return chatApi.sendFile(str, str2, file, progressCallback);
    }

    static /* synthetic */ InterfaceC27474d sendImage$default(ChatApi chatApi, String str, String str2, File file, ProgressCallback progressCallback, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImage");
        }
        if ((i13 & 8) != 0) {
            progressCallback = null;
        }
        return chatApi.sendImage(str, str2, file, progressCallback);
    }

    InterfaceC27474d acceptInvite(String channelType, String channelId, String message);

    InterfaceC27474d addDevice(Device device);

    InterfaceC27474d addMembers(String channelType, String channelId, List<MemberData> members, Message systemMessage, Boolean hideHistory, Date hideHistoryBefore, Boolean skipPush);

    InterfaceC27474d appSettings();

    InterfaceC27474d banUser(String targetId, Integer timeout, String reason, String channelType, String channelId, boolean shadow);

    InterfaceC27474d blockUser(String userId);

    InterfaceC27474d castPollAnswer(String messageId, String pollId, String answer);

    InterfaceC27474d castPollVote(String messageId, String pollId, String optionId);

    InterfaceC27474d closePoll(String pollId);

    InterfaceC27474d createDraftMessage(String channelType, String channelId, DraftMessage message);

    InterfaceC27474d createPoll(CreatePollParams createPollParams);

    InterfaceC27474d createPollOption(String pollId, PollOption option);

    InterfaceC27474d createReminder(String messageId, Date remindAt);

    InterfaceC27474d deleteChannel(String channelType, String channelId);

    InterfaceC27474d deleteDevice(String id4);

    InterfaceC27474d deleteDraftMessage(String channelType, String channelId, DraftMessage message);

    InterfaceC27474d deleteFile(String url);

    InterfaceC27474d deleteFile(String channelType, String channelId, String url);

    InterfaceC27474d deleteImage(String url);

    InterfaceC27474d deleteImage(String channelType, String channelId, String url);

    InterfaceC27474d deleteMessage(String messageId, boolean hard, boolean deleteForMe);

    InterfaceC27474d deletePoll(String pollId);

    InterfaceC27474d deletePollOption(String pollId, String optionId);

    InterfaceC27474d deleteReaction(String messageId, String reactionType);

    InterfaceC27474d deleteReminder(String messageId);

    InterfaceC27474d disableSlowMode(String channelType, String channelId);

    InterfaceC27474d downloadFile(String fileUrl);

    InterfaceC27474d enableSlowMode(String channelType, String channelId, int cooldownTimeInSeconds);

    InterfaceC27474d flagMessage(String messageId, String reason, Map<String, String> customData);

    InterfaceC27474d flagUser(String userId, String reason, Map<String, String> customData);

    InterfaceC27474d getDevices();

    InterfaceC27474d getGuestUser(String userId, String userName);

    InterfaceC27474d getMessage(String messageId);

    InterfaceC27474d getNewerReplies(String parentId, int limit, String lastId);

    InterfaceC27474d getPendingMessage(String messageId);

    InterfaceC27474d getPinnedMessages(String channelType, String channelId, int limit, QuerySorter<Message> sort, PinnedMessagesPagination pagination);

    InterfaceC27474d getPoll(String pollId);

    InterfaceC27474d getReactions(String messageId, int offset, int limit);

    InterfaceC27474d getReplies(String messageId, int limit);

    InterfaceC27474d getRepliesMore(String messageId, String firstId, int limit);

    InterfaceC27474d getSyncHistory(List<String> channelIds, String lastSyncAt);

    InterfaceC27474d getThread(String messageId, GetThreadOptions options);

    InterfaceC27474d getUnreadCounts();

    InterfaceC27474d hideChannel(String channelType, String channelId, boolean clearHistory);

    InterfaceC27474d inviteMembers(String channelType, String channelId, List<String> members, Message systemMessage, Boolean skipPush);

    InterfaceC27474d markAllRead();

    InterfaceC27474d markDelivered(List<Message> messages);

    InterfaceC27474d markRead(String channelType, String channelId, String messageId);

    InterfaceC27474d markThreadRead(String channelType, String channelId, String threadId);

    InterfaceC27474d markUnread(String channelType, String channelId, String messageId, Date messageTimestamp, String threadId);

    InterfaceC27474d muteChannel(String channelType, String channelId, Integer expiration);

    InterfaceC27474d muteCurrentUser();

    InterfaceC27474d muteUser(String userId, Integer timeout);

    /* JADX INFO: renamed from: og */
    InterfaceC27474d mo54539og(String url);

    InterfaceC27474d partialUpdateMember(String channelType, String channelId, String userId, Map<String, ? extends Object> set, List<String> unset);

    InterfaceC27474d partialUpdateMessage(String messageId, Map<String, ? extends Object> set, List<String> unset, boolean skipEnrichUrl);

    InterfaceC27474d partialUpdatePoll(String pollId, Map<String, ? extends Object> set, List<String> unset);

    InterfaceC27474d partialUpdateThread(String messageId, Map<String, ? extends Object> set, List<String> unset);

    InterfaceC27474d partialUpdateUser(String id4, Map<String, ? extends Object> set, List<String> unset);

    InterfaceC27474d queryActiveLocations();

    InterfaceC27474d queryBannedUsers(FilterObject filter, QuerySorter<BannedUsersSort> sort, Integer offset, Integer limit, Date createdAtAfter, Date createdAtAfterOrEqual, Date createdAtBefore, Date createdAtBeforeOrEqual);

    InterfaceC27474d queryBlockedUsers();

    InterfaceC27474d queryChannel(String channelType, String channelId, QueryChannelRequest query);

    InterfaceC27474d queryChannels(QueryChannelsRequest query);

    InterfaceC27474d queryDraftMessages(Integer offset, Integer limit);

    InterfaceC27474d queryDrafts(FilterObject filter, Integer limit, String next, QuerySorter<DraftsSort> sort);

    InterfaceC27474d queryMembers(String channelType, String channelId, int offset, int limit, FilterObject filter, QuerySorter<Member> sort, List<Member> members);

    InterfaceC27474d queryPollVotes(String pollId, FilterObject filter, Integer limit, String next, QuerySorter<Vote> sort);

    InterfaceC27474d queryPolls(FilterObject filter, Integer limit, String next, QuerySorter<Poll> sort);

    InterfaceC27474d queryReactions(String messageId, FilterObject filter, Integer limit, String next, QuerySorter<Reaction> sort);

    InterfaceC27474d queryReminders(FilterObject filter, int limit, String next, QuerySorter<MessageReminder> sort);

    InterfaceC27474d queryThreads(QueryThreadsRequest query);

    InterfaceC27474d queryUsers(QueryUsersRequest queryUsers);

    InterfaceC27474d rejectInvite(String channelType, String channelId);

    void releaseConnection();

    InterfaceC27474d removeMembers(String channelType, String channelId, List<String> members, Message systemMessage, Boolean skipPush);

    InterfaceC27474d removePollVote(String messageId, String pollId, String voteId);

    InterfaceC27474d searchMessages(FilterObject channelFilter, FilterObject messageFilter, Integer offset, Integer limit, String next, QuerySorter<Message> sort);

    InterfaceC27474d sendAction(SendActionRequest request);

    InterfaceC27474d sendEvent(String eventType, String channelType, String channelId, Map<Object, ? extends Object> extraData);

    InterfaceC27474d sendFile(String channelType, String channelId, File file, ProgressCallback callback);

    InterfaceC27474d sendImage(String channelType, String channelId, File file, ProgressCallback callback);

    InterfaceC27474d sendMessage(String channelType, String channelId, Message message);

    InterfaceC27474d sendReaction(Reaction reaction, boolean enforceUnique, boolean skipPush);

    InterfaceC27474d setChannelPushPreference(String cid, PushPreferenceLevel level);

    void setConnection(String userId, String connectionId);

    InterfaceC27474d setUserPushPreference(PushPreferenceLevel level);

    InterfaceC27474d showChannel(String channelType, String channelId);

    InterfaceC27474d snoozeChannelPushNotifications(String cid, Date until);

    InterfaceC27474d snoozeUserPushNotifications(Date until);

    InterfaceC27474d stopLiveLocation(Location location);

    InterfaceC27474d stopWatching(String channelType, String channelId);

    InterfaceC27474d translate(String messageId, String language);

    InterfaceC27474d truncateChannel(String channelType, String channelId, Message systemMessage);

    InterfaceC27474d unbanUser(String targetId, String channelType, String channelId, boolean shadow);

    InterfaceC27474d unblockUser(String userId);

    InterfaceC27474d unflagMessage(String messageId);

    InterfaceC27474d unflagUser(String userId);

    InterfaceC27474d unmuteChannel(String channelType, String channelId);

    InterfaceC27474d unmuteCurrentUser();

    InterfaceC27474d unmuteUser(String userId);

    InterfaceC27474d updateChannel(String channelType, String channelId, Map<String, ? extends Object> extraData, Message updateMessage);

    InterfaceC27474d updateChannelPartial(String channelType, String channelId, Map<String, ? extends Object> set, List<String> unset);

    InterfaceC27474d updateLiveLocation(Location location);

    InterfaceC27474d updateMessage(Message message);

    InterfaceC27474d updatePoll(UpdatePollRequest request);

    InterfaceC27474d updatePollOption(String pollId, PollOption option);

    InterfaceC27474d updateReminder(String messageId, Date remindAt);

    InterfaceC27474d updateUsers(List<User> users);

    InterfaceC27474d uploadFile(File file, ProgressCallback progressCallback);

    InterfaceC27474d uploadImage(File file, ProgressCallback progressCallback);

    void warmUp();
}
