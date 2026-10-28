package io.getstream.chat.android.client.api;

import bc3.InterfaceC2994c0;
import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.api.models.GetThreadOptions;
import io.getstream.chat.android.client.api.models.PinnedMessagesPagination;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.models.QueryThreadsRequest;
import io.getstream.chat.android.client.api.models.QueryUsersRequest;
import io.getstream.chat.android.client.api.models.SendActionRequest;
import io.getstream.chat.android.client.api.models.UpdatePollRequest;
import io.getstream.chat.android.client.interceptor.SendMessageInterceptor;
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
import o23.C27478h;
import o23.InterfaceC27474d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000Ð\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eH\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0097\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0097\u0001¢\u0006\u0004\b \u0010\u001fJ.\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\"\u0010#J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010!\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\"\u0010$J.\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b%\u0010#J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010!\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b%\u0010$J(\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010\u001bH\u0097\u0001¢\u0006\u0004\b'\u0010(J(\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010\u001bH\u0097\u0001¢\u0006\u0004\b)\u0010(J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010+\u001a\u00020*H\u0097\u0001¢\u0006\u0004\b,\u0010-J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010.\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b/\u0010$J\u001c\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*000\u000eH\u0097\u0001¢\u0006\u0004\b1\u0010\u0018J\u001e\u00105\u001a\b\u0012\u0004\u0012\u0002040\u000e2\u0006\u00103\u001a\u000202H\u0097\u0001¢\u0006\u0004\b5\u00106J\u001e\u00109\u001a\b\u0012\u0004\u0012\u0002040\u000e2\u0006\u00108\u001a\u000207H\u0097\u0001¢\u0006\u0004\b9\u0010:J&\u0010<\u001a\b\u0012\u0004\u0012\u0002040\u000e2\u0006\u0010;\u001a\u00020\t2\u0006\u00103\u001a\u000202H\u0097\u0001¢\u0006\u0004\b<\u0010=J&\u0010>\u001a\b\u0012\u0004\u0012\u0002040\u000e2\u0006\u0010;\u001a\u00020\t2\u0006\u00108\u001a\u000207H\u0097\u0001¢\u0006\u0004\b>\u0010?JT\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u000e2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020@2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010E\u001a\u0004\u0018\u00010C2\b\u0010F\u001a\u0004\u0018\u00010\t2\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010GH\u0097\u0001¢\u0006\u0004\bJ\u0010KJ4\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f000\u000e2\u0006\u0010L\u001a\u00020\t2\u0006\u0010M\u001a\u00020\t2\u0006\u0010E\u001a\u00020CH\u0097\u0001¢\u0006\u0004\bN\u0010OJ,\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f000\u000e2\u0006\u0010L\u001a\u00020\t2\u0006\u0010E\u001a\u00020CH\u0097\u0001¢\u0006\u0004\bP\u0010QJ6\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f000\u000e2\u0006\u0010R\u001a\u00020\t2\u0006\u0010E\u001a\u00020C2\b\u0010S\u001a\u0004\u0018\u00010\tH\u0097\u0001¢\u0006\u0004\bT\u0010UJ4\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V000\u000e2\u0006\u0010L\u001a\u00020\t2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020CH\u0097\u0001¢\u0006\u0004\bW\u0010XJL\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0\u000e2\u0006\u0010L\u001a\u00020\t2\b\u0010Y\u001a\u0004\u0018\u00010@2\b\u0010E\u001a\u0004\u0018\u00010C2\b\u0010F\u001a\u0004\u0018\u00010\t2\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010GH\u0097\u0001¢\u0006\u0004\b[\u0010\\J.\u0010a\u001a\b\u0012\u0004\u0012\u00020V0\u000e2\u0006\u0010]\u001a\u00020V2\u0006\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020^H\u0097\u0001¢\u0006\u0004\ba\u0010bJ&\u0010d\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010L\u001a\u00020\t2\u0006\u0010c\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\bd\u0010eJ.\u0010h\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010L\u001a\u00020\t2\u0006\u0010f\u001a\u00020^2\u0006\u0010g\u001a\u00020^H\u0097\u0001¢\u0006\u0004\bh\u0010iJ\u001e\u0010l\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010k\u001a\u00020jH\u0097\u0001¢\u0006\u0004\bl\u0010mJ\u001e\u0010n\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010L\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\bn\u0010$J\u001e\u0010p\u001a\b\u0012\u0004\u0012\u00020o0\u000e2\u0006\u0010L\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\bp\u0010$J.\u0010r\u001a\b\u0012\u0004\u0012\u00020q0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020qH\u0097\u0001¢\u0006\u0004\br\u0010sJ.\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020qH\u0097\u0001¢\u0006\u0004\bt\u0010sJ0\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020q000\u000e2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010E\u001a\u0004\u0018\u00010CH\u0097\u0001¢\u0006\u0004\bu\u0010vJ@\u0010y\u001a\b\u0012\u0004\u0012\u00020x0\u000e2\u0006\u0010Y\u001a\u00020@2\b\u0010E\u001a\u0004\u0018\u00010C2\b\u0010F\u001a\u0004\u0018\u00010\t2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020w0GH\u0097\u0001¢\u0006\u0004\by\u0010zJ0\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010{\u001a\u0004\u0018\u00010CH\u0097\u0001¢\u0006\u0004\b|\u0010}J&\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b~\u0010eJ\u001f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0097\u0001¢\u0006\u0005\b\u007f\u0010\u0080\u0001JP\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010L\u001a\u00020\t2\u0015\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00012\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\t002\u0007\u0010\u0085\u0001\u001a\u00020^H\u0097\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J(\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b\u0088\u0001\u0010eJO\u0010\u008b\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f000\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010E\u001a\u00020C2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\f0G2\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0097\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J$\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u000e2\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0097\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J0\u0010\u0094\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0092\u0001000\u000e2\u000e\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0092\u000100H\u0097\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J!\u0010\u0097\u0001\u001a\t\u0012\u0005\u0012\u00030\u0096\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b\u0097\u0001\u0010$J \u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b\u0098\u0001\u0010$J\u001f\u0010\u0099\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0096\u0001000\u000eH\u0097\u0001¢\u0006\u0005\b\u0099\u0001\u0010\u0018JN\u0010\u009a\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0092\u0001000\u000e2\u0006\u0010.\u001a\u00020\t2\u0015\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00012\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\t00H\u0097\u0001¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J4\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u008e\u0001\u001a\u00030\u009c\u0001H\u0096\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001JK\u0010¡\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0015\u0010 \u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00012\b\u0010\u007f\u001a\u0004\u0018\u00010\fH\u0097\u0001¢\u0006\u0006\b¡\u0001\u0010¢\u0001JP\u0010£\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0015\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00012\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\t00H\u0097\u0001¢\u0006\u0006\b£\u0001\u0010¤\u0001J2\u0010¦\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0007\u0010¥\u0001\u001a\u00020CH\u0097\u0001¢\u0006\u0005\b¦\u0001\u0010OJ)\u0010§\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b§\u0001\u0010eJ\u0019\u0010©\u0001\u001a\t\u0012\u0005\u0012\u00030¨\u00010\u000eH\u0096\u0001¢\u0006\u0005\b©\u0001\u0010\u0018J0\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010L\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bª\u0001\u0010#J(\u0010¬\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\r\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\f00H\u0097\u0001¢\u0006\u0006\b¬\u0001\u0010\u0095\u0001J1\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0007\u0010\u00ad\u0001\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b®\u0001\u0010#JI\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010L\u001a\u0004\u0018\u00010\t2\t\u0010¯\u0001\u001a\u0004\u0018\u0001072\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\tH\u0097\u0001¢\u0006\u0006\b°\u0001\u0010±\u0001J(\u0010²\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b²\u0001\u0010eJ2\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0007\u0010³\u0001\u001a\u00020^H\u0097\u0001¢\u0006\u0006\b´\u0001\u0010µ\u0001J4\u0010·\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\t\u0010¶\u0001\u001a\u0004\u0018\u00010\fH\u0097\u0001¢\u0006\u0005\b·\u0001\u0010\u0010J)\u0010¸\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b¸\u0001\u0010eJ\u0019\u0010º\u0001\u001a\t\u0012\u0005\u0012\u00030¹\u00010\u000eH\u0097\u0001¢\u0006\u0005\bº\u0001\u0010\u0018J\u0018\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eH\u0097\u0001¢\u0006\u0005\b»\u0001\u0010\u0018J3\u0010¼\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0097\u0001¢\u0006\u0005\b¼\u0001\u0010#J)\u0010½\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b½\u0001\u0010eJ\u0018\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eH\u0097\u0001¢\u0006\u0005\b¾\u0001\u0010\u0018J*\u0010Á\u0001\u001a\t\u0012\u0005\u0012\u00030À\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0007\u0010¿\u0001\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bÁ\u0001\u0010eJ*\u0010Ã\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0092\u0001000\u000e2\b\u0010Ã\u0001\u001a\u00030Â\u0001H\u0097\u0001¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001Je\u0010É\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u000e\u0010Æ\u0001\u001a\t\u0012\u0005\u0012\u00030Å\u0001002\t\u0010¶\u0001\u001a\u0004\u0018\u00010\f2\t\u0010Ç\u0001\u001a\u0004\u0018\u00010^2\t\u0010È\u0001\u001a\u0004\u0018\u0001072\b\u0010`\u001a\u0004\u0018\u00010^H\u0097\u0001¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001JN\u0010Ë\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\r\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020\t002\t\u0010¶\u0001\u001a\u0004\u0018\u00010\f2\b\u0010`\u001a\u0004\u0018\u00010^H\u0097\u0001¢\u0006\u0006\bË\u0001\u0010Ì\u0001JN\u0010Í\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\r\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020\t002\t\u0010¶\u0001\u001a\u0004\u0018\u00010\f2\b\u0010`\u001a\u0004\u0018\u00010^H\u0097\u0001¢\u0006\u0006\bÍ\u0001\u0010Ì\u0001JX\u0010Ï\u0001\u001a\t\u0012\u0005\u0012\u00030Î\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0015\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00012\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\t00H\u0097\u0001¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001Jg\u0010Ñ\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030Î\u0001000\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020C2\u0006\u0010Y\u001a\u00020@2\r\u0010H\u001a\t\u0012\u0005\u0012\u00030Î\u00010G2\u000e\u0010Æ\u0001\u001a\t\u0012\u0005\u0012\u00030Î\u000100H\u0097\u0001¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J-\u0010Ô\u0001\u001a\t\u0012\u0005\u0012\u00030¹\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\t2\t\u0010Ó\u0001\u001a\u0004\u0018\u00010CH\u0097\u0001¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J \u0010Ö\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bÖ\u0001\u0010$JC\u0010Ú\u0001\u001a\t\u0012\u0005\u0012\u00030Ù\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\t2\t\u0010×\u0001\u001a\u0004\u0018\u00010\t2\u0014\u0010Ø\u0001\u001a\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0081\u0001H\u0097\u0001¢\u0006\u0006\bÚ\u0001\u0010Û\u0001J!\u0010Ü\u0001\u001a\t\u0012\u0005\u0012\u00030Ù\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bÜ\u0001\u0010$JC\u0010Ý\u0001\u001a\t\u0012\u0005\u0012\u00030Ù\u00010\u000e2\u0006\u0010L\u001a\u00020\t2\t\u0010×\u0001\u001a\u0004\u0018\u00010\t2\u0014\u0010Ø\u0001\u001a\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0081\u0001H\u0097\u0001¢\u0006\u0006\bÝ\u0001\u0010Û\u0001J!\u0010Þ\u0001\u001a\t\u0012\u0005\u0012\u00030Ù\u00010\u000e2\u0006\u0010L\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bÞ\u0001\u0010$JQ\u0010á\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0007\u0010ß\u0001\u001a\u00020\t2\t\u0010Ó\u0001\u001a\u0004\u0018\u00010C2\t\u0010×\u0001\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0007\u0010à\u0001\u001a\u00020^H\u0097\u0001¢\u0006\u0006\bá\u0001\u0010â\u0001J;\u0010ã\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0007\u0010ß\u0001\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0007\u0010à\u0001\u001a\u00020^H\u0097\u0001¢\u0006\u0006\bã\u0001\u0010ä\u0001Jw\u0010ë\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ê\u0001000\u000e2\u0006\u0010Y\u001a\u00020@2\r\u0010H\u001a\t\u0012\u0005\u0012\u00030å\u00010G2\b\u0010D\u001a\u0004\u0018\u00010C2\b\u0010E\u001a\u0004\u0018\u00010C2\t\u0010æ\u0001\u001a\u0004\u0018\u0001072\t\u0010ç\u0001\u001a\u0004\u0018\u0001072\t\u0010è\u0001\u001a\u0004\u0018\u0001072\t\u0010é\u0001\u001a\u0004\u0018\u000107H\u0097\u0001¢\u0006\u0006\bë\u0001\u0010ì\u0001JK\u0010ï\u0001\u001a\t\u0012\u0005\u0012\u00030î\u00010\u000e2\u0007\u0010í\u0001\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0016\u0010 \u0001\u001a\u0011\u0012\u0005\u0012\u00030\u0082\u0001\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u0001H\u0097\u0001¢\u0006\u0006\bï\u0001\u0010ð\u0001J)\u0010ò\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010L\u001a\u00020\t2\u0007\u0010ñ\u0001\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bò\u0001\u0010eJ!\u0010ô\u0001\u001a\t\u0012\u0005\u0012\u00030ó\u00010\u000e2\u0006\u0010!\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bô\u0001\u0010$J8\u0010÷\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030î\u0001000\u000e2\r\u0010õ\u0001\u001a\b\u0012\u0004\u0012\u00020\t002\u0007\u0010ö\u0001\u001a\u00020\tH\u0097\u0001¢\u0006\u0006\b÷\u0001\u0010ø\u0001J\"\u0010û\u0001\u001a\t\u0012\u0005\u0012\u00030ú\u00010\u000e2\u0007\u0010ù\u0001\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\bû\u0001\u0010$J$\u0010þ\u0001\u001a\t\u0012\u0005\u0012\u00030ý\u00010\u000e2\b\u0010\u008e\u0001\u001a\u00030ü\u0001H\u0097\u0001¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001J,\u0010\u0083\u0002\u001a\t\u0012\u0005\u0012\u00030\u0082\u00020\u000e2\u0006\u0010L\u001a\u00020\t2\b\u0010\u0081\u0002\u001a\u00030\u0080\u0002H\u0097\u0001¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002JH\u0010\u0086\u0002\u001a\t\u0012\u0005\u0012\u00030\u0085\u00020\u000e2\u0006\u0010L\u001a\u00020\t2\u0015\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00012\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\t00H\u0097\u0001¢\u0006\u0006\b\u0086\u0002\u0010\u009b\u0001J$\u0010\u008a\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\u000e2\b\u0010\u0088\u0002\u001a\u00030\u0087\u0002H\u0097\u0001¢\u0006\u0006\b\u008a\u0002\u0010\u008b\u0002J#\u0010\u008d\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\u000e2\u0007\u0010k\u001a\u00030\u008c\u0002H\u0097\u0001¢\u0006\u0006\b\u008d\u0002\u0010\u008e\u0002J\"\u0010\u0090\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\u000e2\u0007\u0010\u008f\u0002\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b\u0090\u0002\u0010$J-\u0010\u0093\u0002\u001a\t\u0012\u0005\u0012\u00030\u0091\u00020\u000e2\u0007\u0010\u008f\u0002\u001a\u00020\t2\b\u0010\u0092\u0002\u001a\u00030\u0091\u0002H\u0097\u0001¢\u0006\u0006\b\u0093\u0002\u0010\u0094\u0002J-\u0010\u0095\u0002\u001a\t\u0012\u0005\u0012\u00030\u0091\u00020\u000e2\u0007\u0010\u008f\u0002\u001a\u00020\t2\b\u0010\u0092\u0002\u001a\u00030\u0091\u0002H\u0097\u0001¢\u0006\u0006\b\u0095\u0002\u0010\u0094\u0002J*\u0010\u0097\u0002\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0007\u0010\u008f\u0002\u001a\u00020\t2\u0007\u0010\u0096\u0002\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b\u0097\u0002\u0010eJQ\u0010\u009a\u0002\u001a\t\u0012\u0005\u0012\u00030\u0099\u00020\u000e2\u0007\u0010\u008f\u0002\u001a\u00020\t2\b\u0010Y\u001a\u0004\u0018\u00010@2\b\u0010E\u001a\u0004\u0018\u00010C2\b\u0010F\u001a\u0004\u0018\u00010\t2\u000f\u0010H\u001a\u000b\u0012\u0005\u0012\u00030\u0098\u0002\u0018\u00010GH\u0097\u0001¢\u0006\u0005\b\u009a\u0002\u0010\\JH\u0010\u009c\u0002\u001a\t\u0012\u0005\u0012\u00030\u009b\u00020\u000e2\b\u0010Y\u001a\u0004\u0018\u00010@2\b\u0010E\u001a\u0004\u0018\u00010C2\b\u0010F\u001a\u0004\u0018\u00010\t2\u000f\u0010H\u001a\u000b\u0012\u0005\u0012\u00030\u0089\u0002\u0018\u00010GH\u0097\u0001¢\u0006\u0005\b\u009c\u0002\u0010zJ3\u0010\u009d\u0002\u001a\t\u0012\u0005\u0012\u00030\u0098\u00020\u000e2\u0006\u0010L\u001a\u00020\t2\u0007\u0010\u008f\u0002\u001a\u00020\t2\u0007\u0010\u0096\u0002\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b\u009d\u0002\u0010#J3\u0010\u009f\u0002\u001a\t\u0012\u0005\u0012\u00030\u0098\u00020\u000e2\u0006\u0010L\u001a\u00020\t2\u0007\u0010\u008f\u0002\u001a\u00020\t2\u0007\u0010\u009e\u0002\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b\u009f\u0002\u0010#J3\u0010¡\u0002\u001a\t\u0012\u0005\u0012\u00030\u0098\u00020\u000e2\u0006\u0010L\u001a\u00020\t2\u0007\u0010\u008f\u0002\u001a\u00020\t2\u0007\u0010 \u0002\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b¡\u0002\u0010#JI\u0010¢\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\u000e2\u0007\u0010\u008f\u0002\u001a\u00020\t2\u0015\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00012\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\t00H\u0097\u0001¢\u0006\u0006\b¢\u0002\u0010\u009b\u0001J\"\u0010£\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\u000e2\u0007\u0010\u008f\u0002\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b£\u0002\u0010$J!\u0010¤\u0002\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0007\u0010\u008f\u0002\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b¤\u0002\u0010$J,\u0010§\u0002\u001a\t\u0012\u0005\u0012\u00030¦\u00020\u000e2\u0006\u0010L\u001a\u00020\t2\t\u0010¥\u0002\u001a\u0004\u0018\u000107H\u0097\u0001¢\u0006\u0005\b§\u0002\u0010?J,\u0010¨\u0002\u001a\t\u0012\u0005\u0012\u00030¦\u00020\u000e2\u0006\u0010L\u001a\u00020\t2\t\u0010¥\u0002\u001a\u0004\u0018\u000107H\u0097\u0001¢\u0006\u0005\b¨\u0002\u0010?J \u0010©\u0002\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010L\u001a\u00020\tH\u0097\u0001¢\u0006\u0005\b©\u0002\u0010$JC\u0010«\u0002\u001a\t\u0012\u0005\u0012\u00030ª\u00020\u000e2\u0006\u0010Y\u001a\u00020@2\u0006\u0010E\u001a\u00020C2\b\u0010F\u001a\u0004\u0018\u00010\t2\r\u0010H\u001a\t\u0012\u0005\u0012\u00030¦\u00020GH\u0097\u0001¢\u0006\u0006\b«\u0002\u0010¬\u0002J\u001f\u0010®\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00ad\u0002000\u000eH\u0097\u0001¢\u0006\u0005\b®\u0002\u0010\u0018J$\u0010°\u0002\u001a\t\u0012\u0005\u0012\u00030\u00ad\u00020\u000e2\b\u0010¯\u0002\u001a\u00030\u00ad\u0002H\u0097\u0001¢\u0006\u0006\b°\u0002\u0010±\u0002J$\u0010²\u0002\u001a\t\u0012\u0005\u0012\u00030\u00ad\u00020\u000e2\b\u0010¯\u0002\u001a\u00030\u00ad\u0002H\u0097\u0001¢\u0006\u0006\b²\u0002\u0010±\u0002J\u0013\u0010³\u0002\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0006\b³\u0002\u0010´\u0002J\u0013\u0010µ\u0002\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0006\bµ\u0002\u0010´\u0002R\u0015\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0002\u0010¶\u0002R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010·\u0002R\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010¸\u0002¨\u0006¹\u0002"}, m65681d2 = {"Lio/getstream/chat/android/client/api/ProxyChatApi;", "Lio/getstream/chat/android/client/api/ChatApi;", "delegate", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;", "sendMessageInterceptor", "<init>", "(Lio/getstream/chat/android/client/api/ChatApi;Lbc3/c0;Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;)V", "", "channelType", "channelId", "Lio/getstream/chat/android/models/Message;", "message", "Lo23/d;", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;", "userId", "connectionId", "Ll83/a0;", "setConnection", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/getstream/chat/android/models/AppSettings;", "appSettings", "()Lo23/d;", "Ljava/io/File;", "file", "Lio/getstream/chat/android/client/utils/ProgressCallback;", "callback", "Lio/getstream/chat/android/models/UploadedFile;", "sendFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;", "sendImage", QueryParams.URL, "deleteFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "(Ljava/lang/String;)Lo23/d;", "deleteImage", "progressCallback", "uploadFile", "(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;", "uploadImage", "Lio/getstream/chat/android/models/Device;", "device", "addDevice", "(Lio/getstream/chat/android/models/Device;)Lo23/d;", "id", "deleteDevice", "", "getDevices", "Lio/getstream/chat/android/models/PushPreferenceLevel;", "level", "Lio/getstream/chat/android/models/PushPreference;", "setUserPushPreference", "(Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;", "Ljava/util/Date;", "until", "snoozeUserPushNotifications", "(Ljava/util/Date;)Lo23/d;", "cid", "setChannelPushPreference", "(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;", "snoozeChannelPushNotifications", "(Ljava/lang/String;Ljava/util/Date;)Lo23/d;", "Lio/getstream/chat/android/models/FilterObject;", "channelFilter", "messageFilter", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "next", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", "Lio/getstream/chat/android/models/SearchMessagesResult;", "searchMessages", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "messageId", "firstId", "getRepliesMore", "(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;", "getReplies", "(Ljava/lang/String;I)Lo23/d;", "parentId", "lastId", "getNewerReplies", "(Ljava/lang/String;ILjava/lang/String;)Lo23/d;", "Lio/getstream/chat/android/models/Reaction;", "getReactions", "(Ljava/lang/String;II)Lo23/d;", "filter", "Lio/getstream/chat/android/models/QueryReactionsResult;", "queryReactions", "(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "reaction", "", "enforceUnique", "skipPush", "sendReaction", "(Lio/getstream/chat/android/models/Reaction;ZZ)Lo23/d;", "reactionType", "deleteReaction", "(Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "hard", "deleteForMe", "deleteMessage", "(Ljava/lang/String;ZZ)Lo23/d;", "Lio/getstream/chat/android/client/api/models/SendActionRequest;", "request", "sendAction", "(Lio/getstream/chat/android/client/api/models/SendActionRequest;)Lo23/d;", "getMessage", "Lio/getstream/chat/android/models/PendingMessage;", "getPendingMessage", "Lio/getstream/chat/android/models/DraftMessage;", "createDraftMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lo23/d;", "deleteDraftMessage", "queryDraftMessages", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lo23/d;", "Lio/getstream/chat/android/models/DraftsSort;", "Lio/getstream/chat/android/models/QueryDraftsResult;", "queryDrafts", "(Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "expiration", "muteChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unmuteChannel", "updateMessage", "(Lio/getstream/chat/android/models/Message;)Lo23/d;", "", "", "set", "unset", "skipEnrichUrl", "partialUpdateMessage", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Z)Lo23/d;", "stopWatching", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", "pagination", "getPinnedMessages", "(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "query", "Lio/getstream/chat/android/client/api/models/QueryChannelsResult;", "queryChannels", "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;", "Lio/getstream/chat/android/models/User;", "users", "updateUsers", "(Ljava/util/List;)Lo23/d;", "Lio/getstream/chat/android/models/UserBlock;", "blockUser", "unblockUser", "queryBlockedUsers", "partialUpdateUser", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "Lio/getstream/chat/android/models/Channel;", "queryChannel", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lo23/d;", "extraData", "updateChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Message;)Lo23/d;", "updateChannelPartial", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "cooldownTimeInSeconds", "enableSlowMode", "disableSlowMode", "Lio/getstream/chat/android/models/UnreadCounts;", "getUnreadCounts", "markRead", "messages", "markDelivered", "threadId", "markThreadRead", "messageTimestamp", "markUnread", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lo23/d;", "showChannel", "clearHistory", "hideChannel", "(Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "systemMessage", "truncateChannel", "rejectInvite", "Lio/getstream/chat/android/models/Mute;", "muteCurrentUser", "unmuteCurrentUser", "acceptInvite", "deleteChannel", "markAllRead", "userName", "Lio/getstream/chat/android/models/GuestUser;", "getGuestUser", "Lio/getstream/chat/android/client/api/models/QueryUsersRequest;", "queryUsers", "(Lio/getstream/chat/android/client/api/models/QueryUsersRequest;)Lo23/d;", "Lio/getstream/chat/android/models/MemberData;", QueryChannelRequest.KEY_MEMBERS, "hideHistory", "hideHistoryBefore", "addMembers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lo23/d;", "removeMembers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;", "inviteMembers", "Lio/getstream/chat/android/models/Member;", "partialUpdateMember", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "queryMembers", "(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;", "timeout", "muteUser", "(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unmuteUser", "reason", "customData", "Lio/getstream/chat/android/models/Flag;", "flagUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;", "unflagUser", "flagMessage", "unflagMessage", "targetId", "shadow", "banUser", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "unbanUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "Lio/getstream/chat/android/models/BannedUsersSort;", "createdAtAfter", "createdAtAfterOrEqual", "createdAtBefore", "createdAtBeforeOrEqual", "Lio/getstream/chat/android/models/BannedUser;", "queryBannedUsers", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;", "eventType", "Lio/getstream/chat/android/client/events/ChatEvent;", "sendEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;", "language", "translate", "Lio/getstream/chat/android/models/Attachment;", "og", "channelIds", "lastSyncAt", "getSyncHistory", "(Ljava/util/List;Ljava/lang/String;)Lo23/d;", "fileUrl", "Lud3/a1;", "downloadFile", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "Lio/getstream/chat/android/models/QueryThreadsResult;", "queryThreads", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/GetThreadOptions;", "options", "Lio/getstream/chat/android/models/Thread;", "getThread", "(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/GetThreadOptions;)Lo23/d;", "Lio/getstream/chat/android/models/ThreadInfo;", "partialUpdateThread", "Lio/getstream/chat/android/models/CreatePollParams;", "createPollParams", "Lio/getstream/chat/android/models/Poll;", "createPoll", "(Lio/getstream/chat/android/models/CreatePollParams;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/UpdatePollRequest;", "updatePoll", "(Lio/getstream/chat/android/client/api/models/UpdatePollRequest;)Lo23/d;", "pollId", "getPoll", "Lio/getstream/chat/android/models/PollOption;", "option", "createPollOption", "(Ljava/lang/String;Lio/getstream/chat/android/models/PollOption;)Lo23/d;", "updatePollOption", "optionId", "deletePollOption", "Lio/getstream/chat/android/models/Vote;", "Lio/getstream/chat/android/models/QueryPollVotesResult;", "queryPollVotes", "Lio/getstream/chat/android/models/QueryPollsResult;", "queryPolls", "castPollVote", "answer", "castPollAnswer", "voteId", "removePollVote", "partialUpdatePoll", "closePoll", "deletePoll", "remindAt", "Lio/getstream/chat/android/models/MessageReminder;", "createReminder", "updateReminder", "deleteReminder", "Lio/getstream/chat/android/models/QueryRemindersResult;", "queryReminders", "(Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "Lio/getstream/chat/android/models/Location;", "queryActiveLocations", "location", "updateLiveLocation", "(Lio/getstream/chat/android/models/Location;)Lo23/d;", "stopLiveLocation", "warmUp", "()V", "releaseConnection", "Lio/getstream/chat/android/client/api/ChatApi;", "Lbc3/c0;", "Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ProxyChatApi implements ChatApi {
    private final ChatApi delegate;
    private final InterfaceC2994c0 scope;
    private final SendMessageInterceptor sendMessageInterceptor;

    public ProxyChatApi(ChatApi delegate, InterfaceC2994c0 scope, SendMessageInterceptor sendMessageInterceptor) {
        AbstractC22676k.m65750j(delegate, "delegate");
        AbstractC22676k.m65750j(scope, "scope");
        this.delegate = delegate;
        this.scope = scope;
        this.sendMessageInterceptor = sendMessageInterceptor;
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
        return this.delegate.getMessage(messageId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getNewerReplies(String parentId, int limit, String lastId) {
        AbstractC22676k.m65750j(parentId, "parentId");
        return this.delegate.getNewerReplies(parentId, limit, lastId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getPendingMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.delegate.getPendingMessage(messageId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getPinnedMessages(String channelType, String channelId, int limit, QuerySorter<Message> sort, PinnedMessagesPagination pagination) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(pagination, "pagination");
        return this.delegate.getPinnedMessages(channelType, channelId, limit, sort, pagination);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getPoll(String pollId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        return this.delegate.getPoll(pollId);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getReactions(String messageId, int offset, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.delegate.getReactions(messageId, offset, limit);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getReplies(String messageId, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.delegate.getReplies(messageId, limit);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d getRepliesMore(String messageId, String firstId, int limit) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(firstId, "firstId");
        return this.delegate.getRepliesMore(messageId, firstId, limit);
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
        return this.delegate.queryBannedUsers(filter, sort, offset, limit, createdAtAfter, createdAtAfterOrEqual, createdAtBefore, createdAtBeforeOrEqual);
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
        return this.delegate.queryChannel(channelType, channelId, query);
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d queryChannels(QueryChannelsRequest query) {
        AbstractC22676k.m65750j(query, "query");
        return this.delegate.queryChannels(query);
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
    public final InterfaceC27474d queryMembers(String channelType, String channelId, int offset, int limit, FilterObject filter, QuerySorter<Member> sort, List<Member> members) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(members, "members");
        return this.delegate.queryMembers(channelType, channelId, offset, limit, filter, sort, members);
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
        SendMessageInterceptor sendMessageInterceptor = this.sendMessageInterceptor;
        return sendMessageInterceptor != null ? new C27478h(this.scope, new ProxyChatApi$sendMessage$1$1(sendMessageInterceptor, channelType, channelId, message, null)) : this.delegate.sendMessage(channelType, channelId, message);
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
