package io.getstream.chat.android.client.api.internal;

import androidx.core.app.NotificationCompat;
import bc3.InterfaceC2994c0;
import com.mapbox.maps.MapboxMap;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api.ChatApi;
import io.getstream.chat.android.client.api.ErrorCall;
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
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.models.CustomObject;
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
import io.getstream.chat.android.models.UserEntity;
import io.getstream.chat.android.models.Vote;
import io.getstream.chat.android.models.querysort.QuerySorter;
import j93.InterfaceC21461d;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import n23.C26198a;
import o23.InterfaceC27474d;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000Ú\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 Ì\u00022\u00020\u0001:\u0002Ì\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006JC\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JG\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0019JG\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00140\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0014H\u0016¢\u0006\u0004\b!\u0010\"JE\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00140\u000f2\u0006\u0010#\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0016¢\u0006\u0004\b$\u0010%J[\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00142\b\u0010(\u001a\u0004\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\u001b2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010,\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b-\u0010.JO\u00101\u001a\b\u0012\u0004\u0012\u0002000\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0016¢\u0006\u0004\b1\u00102J \u00105\u001a\u0002042\u0006\u0010/\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b5\u00106J\u0016\u00108\u001a\b\u0012\u0004\u0012\u0002070\u000fH\u0096\u0001¢\u0006\u0004\b8\u00109J8\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010;\u001a\u00020:2\b\u0010=\u001a\u0004\u0018\u00010<H\u0097\u0001¢\u0006\u0004\b?\u0010@J8\u0010A\u001a\b\u0012\u0004\u0012\u00020>0\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010;\u001a\u00020:2\b\u0010=\u001a\u0004\u0018\u00010<H\u0097\u0001¢\u0006\u0004\bA\u0010@J.\u0010C\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\bC\u0010DJ\u001e\u0010C\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010B\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\bC\u0010EJ.\u0010F\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\bF\u0010DJ\u001e\u0010F\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010B\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\bF\u0010EJ(\u0010H\u001a\b\u0012\u0004\u0012\u00020>0\u000f2\u0006\u0010;\u001a\u00020:2\b\u0010G\u001a\u0004\u0018\u00010<H\u0097\u0001¢\u0006\u0004\bH\u0010IJ(\u0010J\u001a\b\u0012\u0004\u0012\u00020>0\u000f2\u0006\u0010;\u001a\u00020:2\b\u0010G\u001a\u0004\u0018\u00010<H\u0097\u0001¢\u0006\u0004\bJ\u0010IJ\u001e\u0010M\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010L\u001a\u00020KH\u0097\u0001¢\u0006\u0004\bM\u0010NJ\u001e\u0010O\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010#\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\bO\u0010EJ\u001c\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\u00140\u000fH\u0097\u0001¢\u0006\u0004\bP\u00109J\u001e\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u000f2\u0006\u0010R\u001a\u00020QH\u0097\u0001¢\u0006\u0004\bT\u0010UJ\u001e\u0010W\u001a\b\u0012\u0004\u0012\u00020S0\u000f2\u0006\u0010V\u001a\u00020*H\u0097\u0001¢\u0006\u0004\bW\u0010XJ&\u0010Z\u001a\b\u0012\u0004\u0012\u00020S0\u000f2\u0006\u0010Y\u001a\u00020\u00072\u0006\u0010R\u001a\u00020QH\u0097\u0001¢\u0006\u0004\bZ\u0010[J&\u0010\\\u001a\b\u0012\u0004\u0012\u00020S0\u000f2\u0006\u0010Y\u001a\u00020\u00072\u0006\u0010V\u001a\u00020*H\u0097\u0001¢\u0006\u0004\b\\\u0010]JT\u0010h\u001a\b\u0012\u0004\u0012\u00020g0\u000f2\u0006\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020^2\b\u0010b\u001a\u0004\u0018\u00010a2\b\u0010c\u001a\u0004\u0018\u00010a2\b\u0010d\u001a\u0004\u0018\u00010\u00072\u000e\u0010f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010eH\u0097\u0001¢\u0006\u0004\bh\u0010iJ4\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00140\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010j\u001a\u00020\u00072\u0006\u0010c\u001a\u00020aH\u0097\u0001¢\u0006\u0004\bk\u0010lJ,\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00140\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010c\u001a\u00020aH\u0097\u0001¢\u0006\u0004\bm\u0010nJ6\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00140\u000f2\u0006\u0010o\u001a\u00020\u00072\u0006\u0010c\u001a\u00020a2\b\u0010p\u001a\u0004\u0018\u00010\u0007H\u0097\u0001¢\u0006\u0004\bq\u0010rJ4\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020s0\u00140\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010b\u001a\u00020a2\u0006\u0010c\u001a\u00020aH\u0097\u0001¢\u0006\u0004\bt\u0010uJL\u0010x\u001a\b\u0012\u0004\u0012\u00020w0\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\b\u0010v\u001a\u0004\u0018\u00010^2\b\u0010c\u001a\u0004\u0018\u00010a2\b\u0010d\u001a\u0004\u0018\u00010\u00072\u000e\u0010f\u001a\n\u0012\u0004\u0012\u00020s\u0018\u00010eH\u0097\u0001¢\u0006\u0004\bx\u0010yJ.\u0010|\u001a\b\u0012\u0004\u0012\u00020s0\u000f2\u0006\u0010z\u001a\u00020s2\u0006\u0010{\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001bH\u0097\u0001¢\u0006\u0004\b|\u0010}J'\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010~\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b\u007f\u0010\u0080\u0001J3\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\u0007\u0010\u0081\u0001\u001a\u00020\u001b2\u0007\u0010\u0082\u0001\u001a\u00020\u001bH\u0097\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J#\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0097\u0001¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J \u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b\u0089\u0001\u0010EJ!\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b\u008b\u0001\u0010EJ1\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\rH\u0097\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J3\u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0007\u0010\u0018\u001a\u00030\u008e\u0001H\u0097\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J2\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0007\u0010\u0018\u001a\u00030\u008e\u0001H\u0097\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0090\u0001J4\u0010\u0092\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008e\u00010\u00140\u000f2\b\u0010b\u001a\u0004\u0018\u00010a2\b\u0010c\u001a\u0004\u0018\u00010aH\u0097\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001JE\u0010\u0096\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u000f2\u0006\u0010v\u001a\u00020^2\b\u0010c\u001a\u0004\u0018\u00010a2\b\u0010d\u001a\u0004\u0018\u00010\u00072\r\u0010f\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010eH\u0097\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J4\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010aH\u0097\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J)\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u0080\u0001J)\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u0080\u0001JO\u0010\u009f\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00140\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010c\u001a\u00020a2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\r0e2\b\u0010\u009e\u0001\u001a\u00030\u009d\u0001H\u0097\u0001¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J$\u0010¤\u0001\u001a\t\u0012\u0005\u0012\u00030£\u00010\u000f2\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0097\u0001¢\u0006\u0006\b¤\u0001\u0010¥\u0001J!\u0010§\u0001\u001a\t\u0012\u0005\u0012\u00030¦\u00010\u000f2\u0006\u0010/\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b§\u0001\u0010EJ \u0010¨\u0001\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010/\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b¨\u0001\u0010EJ\u001f\u0010©\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¦\u00010\u00140\u000fH\u0097\u0001¢\u0006\u0005\b©\u0001\u00109J3\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010¢\u0001\u001a\u00030ª\u0001H\u0096\u0001¢\u0006\u0006\b«\u0001\u0010¬\u0001J1\u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0007\u0010\u00ad\u0001\u001a\u00020aH\u0097\u0001¢\u0006\u0005\b®\u0001\u0010lJ)\u0010¯\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0006\b¯\u0001\u0010\u0080\u0001J\u0019\u0010±\u0001\u001a\t\u0012\u0005\u0012\u00030°\u00010\u000fH\u0096\u0001¢\u0006\u0005\b±\u0001\u00109J0\u0010²\u0001\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b²\u0001\u0010DJ'\u0010´\u0001\u001a\b\u0012\u0004\u0012\u0002040\u000f2\r\u0010³\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0097\u0001¢\u0006\u0005\b´\u0001\u0010\"J1\u0010¶\u0001\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0007\u0010µ\u0001\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b¶\u0001\u0010DJI\u0010¸\u0001\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\t\u0010·\u0001\u001a\u0004\u0018\u00010*2\t\u0010µ\u0001\u001a\u0004\u0018\u00010\u0007H\u0097\u0001¢\u0006\u0006\b¸\u0001\u0010¹\u0001J)\u0010º\u0001\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0006\bº\u0001\u0010\u0080\u0001J2\u0010¼\u0001\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0007\u0010»\u0001\u001a\u00020\u001bH\u0097\u0001¢\u0006\u0006\b¼\u0001\u0010½\u0001J3\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\rH\u0097\u0001¢\u0006\u0006\b¾\u0001\u0010\u008d\u0001J)\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0006\b¿\u0001\u0010\u0080\u0001J\u0019\u0010Á\u0001\u001a\t\u0012\u0005\u0012\u00030À\u00010\u000fH\u0097\u0001¢\u0006\u0005\bÁ\u0001\u00109J\u0018\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u0002040\u000fH\u0097\u0001¢\u0006\u0005\bÂ\u0001\u00109J2\u0010Ã\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0097\u0001¢\u0006\u0005\bÃ\u0001\u0010DJ)\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0006\bÄ\u0001\u0010\u0080\u0001J\u0018\u0010Å\u0001\u001a\b\u0012\u0004\u0012\u0002040\u000fH\u0097\u0001¢\u0006\u0005\bÅ\u0001\u00109J+\u0010È\u0001\u001a\t\u0012\u0005\u0012\u00030Ç\u00010\u000f2\u0006\u0010/\u001a\u00020\u00072\u0007\u0010Æ\u0001\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0006\bÈ\u0001\u0010\u0080\u0001J)\u0010Ê\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00140\u000f2\b\u0010Ê\u0001\u001a\u00030É\u0001H\u0097\u0001¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001JK\u0010Ì\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\b\u0010(\u001a\u0004\u0018\u00010\r2\b\u0010,\u001a\u0004\u0018\u00010\u001bH\u0097\u0001¢\u0006\u0006\bÌ\u0001\u0010Í\u0001JK\u0010Î\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\b\u0010(\u001a\u0004\u0018\u00010\r2\b\u0010,\u001a\u0004\u0018\u00010\u001bH\u0097\u0001¢\u0006\u0006\bÎ\u0001\u0010Í\u0001Jc\u0010Ï\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00140\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010b\u001a\u00020a2\u0006\u0010c\u001a\u00020a2\u0006\u0010v\u001a\u00020^2\f\u0010f\u001a\b\u0012\u0004\u0012\u0002000e2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002000\u0014H\u0097\u0001¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J-\u0010Ò\u0001\u001a\t\u0012\u0005\u0012\u00030À\u00010\u000f2\u0006\u0010/\u001a\u00020\u00072\t\u0010Ñ\u0001\u001a\u0004\u0018\u00010aH\u0097\u0001¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J \u0010Ô\u0001\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010/\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\bÔ\u0001\u0010EJB\u0010Ø\u0001\u001a\t\u0012\u0005\u0012\u00030×\u00010\u000f2\u0006\u0010/\u001a\u00020\u00072\t\u0010Õ\u0001\u001a\u0004\u0018\u00010\u00072\u0013\u0010Ö\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\nH\u0097\u0001¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J!\u0010Ú\u0001\u001a\t\u0012\u0005\u0012\u00030×\u00010\u000f2\u0006\u0010/\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\bÚ\u0001\u0010EJB\u0010Û\u0001\u001a\t\u0012\u0005\u0012\u00030×\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\t\u0010Õ\u0001\u001a\u0004\u0018\u00010\u00072\u0013\u0010Ö\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\nH\u0097\u0001¢\u0006\u0006\bÛ\u0001\u0010Ù\u0001J!\u0010Ü\u0001\u001a\t\u0012\u0005\u0012\u00030×\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\bÜ\u0001\u0010EJQ\u0010ß\u0001\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0007\u0010Ý\u0001\u001a\u00020\u00072\t\u0010Ñ\u0001\u001a\u0004\u0018\u00010a2\t\u0010Õ\u0001\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0007\u0010Þ\u0001\u001a\u00020\u001bH\u0097\u0001¢\u0006\u0006\bß\u0001\u0010à\u0001J;\u0010á\u0001\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0007\u0010Ý\u0001\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0007\u0010Þ\u0001\u001a\u00020\u001bH\u0097\u0001¢\u0006\u0006\bá\u0001\u0010â\u0001Jw\u0010é\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030è\u00010\u00140\u000f2\u0006\u0010v\u001a\u00020^2\r\u0010f\u001a\t\u0012\u0005\u0012\u00030ã\u00010e2\b\u0010b\u001a\u0004\u0018\u00010a2\b\u0010c\u001a\u0004\u0018\u00010a2\t\u0010ä\u0001\u001a\u0004\u0018\u00010*2\t\u0010å\u0001\u001a\u0004\u0018\u00010*2\t\u0010æ\u0001\u001a\u0004\u0018\u00010*2\t\u0010ç\u0001\u001a\u0004\u0018\u00010*H\u0097\u0001¢\u0006\u0006\bé\u0001\u0010ê\u0001JG\u0010í\u0001\u001a\t\u0012\u0005\u0012\u00030ì\u00010\u000f2\u0007\u0010ë\u0001\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0097\u0001¢\u0006\u0006\bí\u0001\u0010î\u0001J*\u0010ð\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\u0007\u0010ï\u0001\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0006\bð\u0001\u0010\u0080\u0001J!\u0010ò\u0001\u001a\t\u0012\u0005\u0012\u00030ñ\u00010\u000f2\u0006\u0010B\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\bò\u0001\u0010EJ8\u0010õ\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030ì\u00010\u00140\u000f2\r\u0010ó\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u0007\u0010ô\u0001\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0006\bõ\u0001\u0010ö\u0001J\"\u0010ù\u0001\u001a\t\u0012\u0005\u0012\u00030ø\u00010\u000f2\u0007\u0010÷\u0001\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\bù\u0001\u0010EJ$\u0010ü\u0001\u001a\t\u0012\u0005\u0012\u00030û\u00010\u000f2\b\u0010¢\u0001\u001a\u00030ú\u0001H\u0097\u0001¢\u0006\u0006\bü\u0001\u0010ý\u0001J,\u0010\u0081\u0002\u001a\t\u0012\u0005\u0012\u00030\u0080\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\b\u0010ÿ\u0001\u001a\u00030þ\u0001H\u0097\u0001¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002JC\u0010\u0084\u0002\u001a\t\u0012\u0005\u0012\u00030\u0083\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0097\u0001¢\u0006\u0005\b\u0084\u0002\u0010%J$\u0010\u0088\u0002\u001a\t\u0012\u0005\u0012\u00030\u0087\u00020\u000f2\b\u0010\u0086\u0002\u001a\u00030\u0085\u0002H\u0097\u0001¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002J$\u0010\u008b\u0002\u001a\t\u0012\u0005\u0012\u00030\u0087\u00020\u000f2\b\u0010\u0086\u0001\u001a\u00030\u008a\u0002H\u0097\u0001¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J\"\u0010\u008e\u0002\u001a\t\u0012\u0005\u0012\u00030\u0087\u00020\u000f2\u0007\u0010\u008d\u0002\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b\u008e\u0002\u0010EJ-\u0010\u0091\u0002\u001a\t\u0012\u0005\u0012\u00030\u008f\u00020\u000f2\u0007\u0010\u008d\u0002\u001a\u00020\u00072\b\u0010\u0090\u0002\u001a\u00030\u008f\u0002H\u0097\u0001¢\u0006\u0006\b\u0091\u0002\u0010\u0092\u0002J-\u0010\u0093\u0002\u001a\t\u0012\u0005\u0012\u00030\u008f\u00020\u000f2\u0007\u0010\u008d\u0002\u001a\u00020\u00072\b\u0010\u0090\u0002\u001a\u00030\u008f\u0002H\u0097\u0001¢\u0006\u0006\b\u0093\u0002\u0010\u0092\u0002J+\u0010\u0095\u0002\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0007\u0010\u008d\u0002\u001a\u00020\u00072\u0007\u0010\u0094\u0002\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0006\b\u0095\u0002\u0010\u0080\u0001JQ\u0010\u0098\u0002\u001a\t\u0012\u0005\u0012\u00030\u0097\u00020\u000f2\u0007\u0010\u008d\u0002\u001a\u00020\u00072\b\u0010v\u001a\u0004\u0018\u00010^2\b\u0010c\u001a\u0004\u0018\u00010a2\b\u0010d\u001a\u0004\u0018\u00010\u00072\u000f\u0010f\u001a\u000b\u0012\u0005\u0012\u00030\u0096\u0002\u0018\u00010eH\u0097\u0001¢\u0006\u0005\b\u0098\u0002\u0010yJI\u0010\u009a\u0002\u001a\t\u0012\u0005\u0012\u00030\u0099\u00020\u000f2\b\u0010v\u001a\u0004\u0018\u00010^2\b\u0010c\u001a\u0004\u0018\u00010a2\b\u0010d\u001a\u0004\u0018\u00010\u00072\u000f\u0010f\u001a\u000b\u0012\u0005\u0012\u00030\u0087\u0002\u0018\u00010eH\u0097\u0001¢\u0006\u0006\b\u009a\u0002\u0010\u0097\u0001J3\u0010\u009b\u0002\u001a\t\u0012\u0005\u0012\u00030\u0096\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\u0007\u0010\u008d\u0002\u001a\u00020\u00072\u0007\u0010\u0094\u0002\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b\u009b\u0002\u0010DJ3\u0010\u009d\u0002\u001a\t\u0012\u0005\u0012\u00030\u0096\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\u0007\u0010\u008d\u0002\u001a\u00020\u00072\u0007\u0010\u009c\u0002\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b\u009d\u0002\u0010DJ3\u0010\u009f\u0002\u001a\t\u0012\u0005\u0012\u00030\u0096\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\u0007\u0010\u008d\u0002\u001a\u00020\u00072\u0007\u0010\u009e\u0002\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b\u009f\u0002\u0010DJD\u0010 \u0002\u001a\t\u0012\u0005\u0012\u00030\u0087\u00020\u000f2\u0007\u0010\u008d\u0002\u001a\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0097\u0001¢\u0006\u0005\b \u0002\u0010%J\"\u0010¡\u0002\u001a\t\u0012\u0005\u0012\u00030\u0087\u00020\u000f2\u0007\u0010\u008d\u0002\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b¡\u0002\u0010EJ!\u0010¢\u0002\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0007\u0010\u008d\u0002\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b¢\u0002\u0010EJ,\u0010¥\u0002\u001a\t\u0012\u0005\u0012\u00030¤\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\t\u0010£\u0002\u001a\u0004\u0018\u00010*H\u0097\u0001¢\u0006\u0005\b¥\u0002\u0010]J,\u0010¦\u0002\u001a\t\u0012\u0005\u0012\u00030¤\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\t\u0010£\u0002\u001a\u0004\u0018\u00010*H\u0097\u0001¢\u0006\u0005\b¦\u0002\u0010]J \u0010§\u0002\u001a\b\u0012\u0004\u0012\u0002040\u000f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0005\b§\u0002\u0010EJC\u0010©\u0002\u001a\t\u0012\u0005\u0012\u00030¨\u00020\u000f2\u0006\u0010v\u001a\u00020^2\u0006\u0010c\u001a\u00020a2\b\u0010d\u001a\u0004\u0018\u00010\u00072\r\u0010f\u001a\t\u0012\u0005\u0012\u00030¤\u00020eH\u0097\u0001¢\u0006\u0006\b©\u0002\u0010ª\u0002J\u001f\u0010¬\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030«\u00020\u00140\u000fH\u0097\u0001¢\u0006\u0005\b¬\u0002\u00109J$\u0010®\u0002\u001a\t\u0012\u0005\u0012\u00030«\u00020\u000f2\b\u0010\u00ad\u0002\u001a\u00030«\u0002H\u0097\u0001¢\u0006\u0006\b®\u0002\u0010¯\u0002J$\u0010°\u0002\u001a\t\u0012\u0005\u0012\u00030«\u00020\u000f2\b\u0010\u00ad\u0002\u001a\u00030«\u0002H\u0097\u0001¢\u0006\u0006\b°\u0002\u0010¯\u0002J\u0013\u0010±\u0002\u001a\u000204H\u0096\u0001¢\u0006\u0006\b±\u0002\u0010²\u0002J\u0013\u0010³\u0002\u001a\u000204H\u0096\u0001¢\u0006\u0006\b³\u0002\u0010²\u0002JI\u0010·\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000f\"\n\b\u0000\u0010µ\u0002*\u00030´\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000f2\r\u0010¶\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002¢\u0006\u0006\b·\u0002\u0010¸\u0002JE\u0010·\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\n\b\u0000\u0010µ\u0002*\u00030´\u0002\"\n\b\u0001\u0010¹\u0002*\u00030´\u0002*\b\u0012\u0004\u0012\u00028\u00000\u000f2\t\u0010º\u0002\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0006\b·\u0002\u0010»\u0002J0\u0010¼\u0002\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0014H\u0002¢\u0006\u0006\b¼\u0002\u0010¸\u0002JE\u0010·\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\f\b\u0000\u0010µ\u0002\u0018\u0001*\u00030´\u0002*\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b¢\u0006\u0006\b·\u0002\u0010½\u0002JQ\u0010¾\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000f\"\f\b\u0000\u0010µ\u0002\u0018\u0001*\u00030´\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000f2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b¢\u0006\u0006\b¾\u0002\u0010½\u0002J?\u0010À\u0002\u001a\u0019\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00140¿\u0002\"\n\b\u0000\u0010µ\u0002*\u00030´\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002¢\u0006\u0006\bÀ\u0002\u0010Á\u0002J\u001d\u0010À\u0002\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014*\u00030´\u0002H\u0002¢\u0006\u0006\bÀ\u0002\u0010Â\u0002J7\u0010À\u0002\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\"\f\b\u0000\u0010µ\u0002\u0018\u0001*\u00030´\u0002*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b¢\u0006\u0006\bÀ\u0002\u0010Ã\u0002J3\u0010Å\u0002\u001a\u00020\u0007\"\n\b\u0000\u0010µ\u0002*\u00030´\u0002*\u0004\u0018\u00018\u00002\r\u0010Ä\u0002\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0002¢\u0006\u0006\bÅ\u0002\u0010Æ\u0002J$\u0010Ç\u0002\u001a\u00020\u0007\"\n\b\u0000\u0010µ\u0002*\u00030´\u0002*\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0006\bÇ\u0002\u0010È\u0002J$\u0010É\u0002\u001a\u00020\u0007\"\n\b\u0000\u0010µ\u0002*\u00030´\u0002*\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0006\bÉ\u0002\u0010È\u0002R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010Ê\u0002R\u0015\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010Ë\u0002¨\u0006Í\u0002"}, m65681d2 = {"Lio/getstream/chat/android/client/api/internal/ExtraDataValidator;", "Lio/getstream/chat/android/client/api/ChatApi;", "Lbc3/c0;", "scope", "delegate", "<init>", "(Lbc3/c0;Lio/getstream/chat/android/client/api/ChatApi;)V", "", "channelType", "channelId", "", "", "extraData", "Lio/getstream/chat/android/models/Message;", "updateMessage", "Lo23/d;", "Lio/getstream/chat/android/models/Channel;", "updateChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Message;)Lo23/d;", "set", "", "unset", "updateChannelPartial", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "message", "(Lio/getstream/chat/android/models/Message;)Lo23/d;", "messageId", "", "skipEnrichUrl", "partialUpdateMessage", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Z)Lo23/d;", "Lio/getstream/chat/android/models/User;", "users", "updateUsers", "(Ljava/util/List;)Lo23/d;", "id", "partialUpdateUser", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "Lio/getstream/chat/android/models/MemberData;", QueryChannelRequest.KEY_MEMBERS, "systemMessage", "hideHistory", "Ljava/util/Date;", "hideHistoryBefore", "skipPush", "addMembers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lo23/d;", "userId", "Lio/getstream/chat/android/models/Member;", "partialUpdateMember", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;", "connectionId", "Ll83/a0;", "setConnection", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/getstream/chat/android/models/AppSettings;", "appSettings", "()Lo23/d;", "Ljava/io/File;", "file", "Lio/getstream/chat/android/client/utils/ProgressCallback;", "callback", "Lio/getstream/chat/android/models/UploadedFile;", "sendFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;", "sendImage", QueryParams.URL, "deleteFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "(Ljava/lang/String;)Lo23/d;", "deleteImage", "progressCallback", "uploadFile", "(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;", "uploadImage", "Lio/getstream/chat/android/models/Device;", "device", "addDevice", "(Lio/getstream/chat/android/models/Device;)Lo23/d;", "deleteDevice", "getDevices", "Lio/getstream/chat/android/models/PushPreferenceLevel;", "level", "Lio/getstream/chat/android/models/PushPreference;", "setUserPushPreference", "(Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;", "until", "snoozeUserPushNotifications", "(Ljava/util/Date;)Lo23/d;", "cid", "setChannelPushPreference", "(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;", "snoozeChannelPushNotifications", "(Ljava/lang/String;Ljava/util/Date;)Lo23/d;", "Lio/getstream/chat/android/models/FilterObject;", "channelFilter", "messageFilter", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "next", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", "Lio/getstream/chat/android/models/SearchMessagesResult;", "searchMessages", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "firstId", "getRepliesMore", "(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;", "getReplies", "(Ljava/lang/String;I)Lo23/d;", "parentId", "lastId", "getNewerReplies", "(Ljava/lang/String;ILjava/lang/String;)Lo23/d;", "Lio/getstream/chat/android/models/Reaction;", "getReactions", "(Ljava/lang/String;II)Lo23/d;", "filter", "Lio/getstream/chat/android/models/QueryReactionsResult;", "queryReactions", "(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "reaction", "enforceUnique", "sendReaction", "(Lio/getstream/chat/android/models/Reaction;ZZ)Lo23/d;", "reactionType", "deleteReaction", "(Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "hard", "deleteForMe", "deleteMessage", "(Ljava/lang/String;ZZ)Lo23/d;", "Lio/getstream/chat/android/client/api/models/SendActionRequest;", "request", "sendAction", "(Lio/getstream/chat/android/client/api/models/SendActionRequest;)Lo23/d;", "getMessage", "Lio/getstream/chat/android/models/PendingMessage;", "getPendingMessage", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;", "Lio/getstream/chat/android/models/DraftMessage;", "createDraftMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lo23/d;", "deleteDraftMessage", "queryDraftMessages", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lo23/d;", "Lio/getstream/chat/android/models/DraftsSort;", "Lio/getstream/chat/android/models/QueryDraftsResult;", "queryDrafts", "(Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "expiration", "muteChannel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unmuteChannel", "stopWatching", "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;", "pagination", "getPinnedMessages", "(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "query", "Lio/getstream/chat/android/client/api/models/QueryChannelsResult;", "queryChannels", "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;", "Lio/getstream/chat/android/models/UserBlock;", "blockUser", "unblockUser", "queryBlockedUsers", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "queryChannel", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lo23/d;", "cooldownTimeInSeconds", "enableSlowMode", "disableSlowMode", "Lio/getstream/chat/android/models/UnreadCounts;", "getUnreadCounts", "markRead", "messages", "markDelivered", "threadId", "markThreadRead", "messageTimestamp", "markUnread", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lo23/d;", "showChannel", "clearHistory", "hideChannel", "(Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "truncateChannel", "rejectInvite", "Lio/getstream/chat/android/models/Mute;", "muteCurrentUser", "unmuteCurrentUser", "acceptInvite", "deleteChannel", "markAllRead", "userName", "Lio/getstream/chat/android/models/GuestUser;", "getGuestUser", "Lio/getstream/chat/android/client/api/models/QueryUsersRequest;", "queryUsers", "(Lio/getstream/chat/android/client/api/models/QueryUsersRequest;)Lo23/d;", "removeMembers", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;", "inviteMembers", "queryMembers", "(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;", "timeout", "muteUser", "(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;", "unmuteUser", "reason", "customData", "Lio/getstream/chat/android/models/Flag;", "flagUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;", "unflagUser", "flagMessage", "unflagMessage", "targetId", "shadow", "banUser", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "unbanUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;", "Lio/getstream/chat/android/models/BannedUsersSort;", "createdAtAfter", "createdAtAfterOrEqual", "createdAtBefore", "createdAtBeforeOrEqual", "Lio/getstream/chat/android/models/BannedUser;", "queryBannedUsers", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;", "eventType", "Lio/getstream/chat/android/client/events/ChatEvent;", "sendEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;", "language", "translate", "Lio/getstream/chat/android/models/Attachment;", "og", "channelIds", "lastSyncAt", "getSyncHistory", "(Ljava/util/List;Ljava/lang/String;)Lo23/d;", "fileUrl", "Lud3/a1;", "downloadFile", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "Lio/getstream/chat/android/models/QueryThreadsResult;", "queryThreads", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/GetThreadOptions;", "options", "Lio/getstream/chat/android/models/Thread;", "getThread", "(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/GetThreadOptions;)Lo23/d;", "Lio/getstream/chat/android/models/ThreadInfo;", "partialUpdateThread", "Lio/getstream/chat/android/models/CreatePollParams;", "createPollParams", "Lio/getstream/chat/android/models/Poll;", "createPoll", "(Lio/getstream/chat/android/models/CreatePollParams;)Lo23/d;", "Lio/getstream/chat/android/client/api/models/UpdatePollRequest;", "updatePoll", "(Lio/getstream/chat/android/client/api/models/UpdatePollRequest;)Lo23/d;", "pollId", "getPoll", "Lio/getstream/chat/android/models/PollOption;", "option", "createPollOption", "(Ljava/lang/String;Lio/getstream/chat/android/models/PollOption;)Lo23/d;", "updatePollOption", "optionId", "deletePollOption", "Lio/getstream/chat/android/models/Vote;", "Lio/getstream/chat/android/models/QueryPollVotesResult;", "queryPollVotes", "Lio/getstream/chat/android/models/QueryPollsResult;", "queryPolls", "castPollVote", "answer", "castPollAnswer", "voteId", "removePollVote", "partialUpdatePoll", "closePoll", "deletePoll", "remindAt", "Lio/getstream/chat/android/models/MessageReminder;", "createReminder", "updateReminder", "deleteReminder", "Lio/getstream/chat/android/models/QueryRemindersResult;", "queryReminders", "(Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;", "Lio/getstream/chat/android/models/Location;", "queryActiveLocations", "location", "updateLiveLocation", "(Lio/getstream/chat/android/models/Location;)Lo23/d;", "stopLiveLocation", "warmUp", "()V", "releaseConnection", "Lio/getstream/chat/android/models/CustomObject;", "T", "objects", "withExtraDataValidation", "(Lo23/d;Ljava/util/List;)Lo23/d;", "K", "obj", "(Lo23/d;Lio/getstream/chat/android/models/CustomObject;)Lo23/d;", "validateMembersExtraData", "(Lo23/d;Ljava/util/Map;)Lo23/d;", "withExtraDataValidationOnList", "Ll83/k;", "findReserved", "(Ljava/util/List;)Ll83/k;", "(Lio/getstream/chat/android/models/CustomObject;)Ljava/util/List;", "(Ljava/util/Map;)Ljava/util/List;", "reserved", "composeErrorMessage", "(Lio/getstream/chat/android/models/CustomObject;Ljava/util/List;)Ljava/lang/String;", "resolveName", "(Lio/getstream/chat/android/models/CustomObject;)Ljava/lang/String;", "resolveId", "Lbc3/c0;", "Lio/getstream/chat/android/client/api/ChatApi;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ExtraDataValidator implements ChatApi {
    private static final Companion Companion = new Companion();
    private static final String[] reservedInChannel;
    private static final Function1 reservedInChannelPredicate;
    private static final Set<String> reservedInMember;
    private static final Function1 reservedInMemberPredicate;
    private static final String[] reservedInMessage;
    private static final Function1 reservedInMessagePredicate;
    private static final String[] reservedInUser;
    private static final Function1 reservedInUserPredicate;
    private final ChatApi delegate;
    private final InterfaceC2994c0 scope;

    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/api/internal/ExtraDataValidator$Companion;", "", "<init>", "()V", "reservedInChannel", "", "", "[Ljava/lang/String;", "reservedInMessage", "reservedInUser", "reservedInMember", "", "reservedInChannelPredicate", "Lkotlin/Function1;", "", "reservedInMessagePredicate", "reservedInUserPredicate", "reservedInMemberPredicate", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        String[] strArr = {"cid", "id", "type", "created_at", "deleted_at", "updated_at", "member_count", "created_by", "last_message_at", "own_capabilities", "config"};
        reservedInChannel = strArr;
        String[] strArr2 = {"id", "cid", "created_at", "updated_at", "deleted_at"};
        reservedInMessage = strArr2;
        String[] strArr3 = {"id", "cid", "created_at", "updated_at"};
        reservedInUser = strArr3;
        Set<String> setM74059b1 = AbstractC25260n.m74059b1(new String[]{"user_id", UserState.Sources.USER, "created_at", "updated_at", "deleted_at", "invited", "invite_accepted_at", "invite_rejected_at", "shadow_banned", "banned", "notifications_muted", NotificationCompat.CATEGORY_STATUS, "ban_expires", "pinned_at", "archived_at"});
        reservedInMember = setM74059b1;
        reservedInChannelPredicate = new ExtraDataValidator$Companion$reservedInChannelPredicate$1(strArr);
        reservedInMessagePredicate = new ExtraDataValidator$Companion$reservedInMessagePredicate$1(strArr2);
        reservedInUserPredicate = new ExtraDataValidator$Companion$reservedInUserPredicate$1(strArr3);
        reservedInMemberPredicate = new ExtraDataValidator$Companion$reservedInMemberPredicate$1(setM74059b1);
    }

    public ExtraDataValidator(InterfaceC2994c0 scope, ChatApi delegate) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(delegate, "delegate");
        this.scope = scope;
        this.delegate = delegate;
    }

    private final <T extends CustomObject> String composeErrorMessage(T t14, List<String> list) {
        String strResolveName = resolveName(t14);
        String strResolveId = resolveId(t14);
        String strM74110N0 = AbstractC25265s.m74110N0(list, null, null, null, null, 63);
        StringBuilder sbM32001t = AbstractC11895b.m32001t("'", strResolveName, "(id=", strResolveId, ").extraData' contains reserved keys: ");
        sbM32001t.append(strM74110N0);
        return sbM32001t.toString();
    }

    private final <T extends CustomObject> C23465k findReserved(List<? extends T> list) {
        for (T t14 : list) {
            List<String> listFindReserved = findReserved(t14);
            if (!listFindReserved.isEmpty()) {
                return new C23465k(t14, listFindReserved);
            }
        }
        return new C23465k(null, null);
    }

    private final <T extends CustomObject> String resolveId(T t14) {
        if (t14 instanceof Channel) {
            return ((Channel) t14).getId();
        }
        if (t14 instanceof Message) {
            return ((Message) t14).getId();
        }
        if (t14 instanceof User) {
            return ((User) t14).getId();
        }
        if (t14 instanceof Member) {
            return ((UserEntity) t14).getUserId();
        }
        return t14 instanceof MemberData ? ((MemberData) t14).getUserId() : "";
    }

    private final <T extends CustomObject> String resolveName(T t14) {
        if (t14 instanceof Channel) {
            return "channel";
        }
        if (t14 instanceof Message) {
            return "message";
        }
        if (t14 instanceof User) {
            return UserState.Sources.USER;
        }
        return ((t14 instanceof Member) || (t14 instanceof MemberData)) ? "member" : "";
    }

    private final InterfaceC27474d validateMembersExtraData(InterfaceC27474d interfaceC27474d, List<MemberData> list) {
        C23465k c23465kFindReserved = findReserved(list);
        MemberData memberData = (MemberData) c23465kFindReserved.f92937w;
        List<String> list2 = (List) c23465kFindReserved.f92938x;
        return (memberData == null || list2 == null) ? interfaceC27474d : new ErrorCall(this.scope, new C26198a(composeErrorMessage(memberData, list2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends CustomObject> InterfaceC27474d withExtraDataValidation(InterfaceC27474d interfaceC27474d, List<? extends T> list) {
        C23465k c23465kFindReserved = findReserved(list);
        CustomObject customObject = (CustomObject) c23465kFindReserved.f92937w;
        List list2 = (List) c23465kFindReserved.f92938x;
        return (customObject == null || list2 == null) ? interfaceC27474d : new ErrorCall(this.scope, new C26198a(composeErrorMessage(customObject, list2)));
    }

    private final <T extends CustomObject> InterfaceC27474d withExtraDataValidationOnList(InterfaceC27474d interfaceC27474d, Map<String, ? extends Object> map) {
        AbstractC22676k.m65756p();
        throw null;
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
        return validateMembersExtraData(withExtraDataValidation(this.delegate.addMembers(channelType, channelId, members, systemMessage, hideHistory, hideHistoryBefore, skipPush), systemMessage), members);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdateMember(String channelType, String channelId, String userId, Map<String, ? extends Object> set, List<String> unset) {
        ?? arrayList;
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        InterfaceC27474d interfaceC27474dPartialUpdateMember = this.delegate.partialUpdateMember(channelType, channelId, userId, set, unset);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Member.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Channel.class))) {
            Set<String> setKeySet = set.keySet();
            Function1 function1 = reservedInChannelPredicate;
            arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (((Boolean) function1.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Message.class))) {
            Set<String> setKeySet2 = set.keySet();
            Function1 function2 = reservedInMessagePredicate;
            arrayList = new ArrayList();
            for (Object obj2 : setKeySet2) {
                if (((Boolean) function2.invoke(obj2)).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(User.class))) {
            Set<String> setKeySet3 = set.keySet();
            Function1 function3 = reservedInUserPredicate;
            arrayList = new ArrayList();
            for (Object obj3 : setKeySet3) {
                if (((Boolean) function3.invoke(obj3)).booleanValue()) {
                    arrayList.add(obj3);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Member.class))) {
            Set<String> setKeySet4 = set.keySet();
            Function1 function4 = reservedInMemberPredicate;
            arrayList = new ArrayList();
            for (Object obj4 : setKeySet4) {
                if (((Boolean) function4.invoke(obj4)).booleanValue()) {
                    arrayList.add(obj4);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(MemberData.class))) {
            Set<String> setKeySet5 = set.keySet();
            Function1 function5 = reservedInMemberPredicate;
            arrayList = new ArrayList();
            for (Object obj5 : setKeySet5) {
                if (((Boolean) function5.invoke(obj5)).booleanValue()) {
                    arrayList.add(obj5);
                }
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        return arrayList.isEmpty() ? interfaceC27474dPartialUpdateMember : new ErrorCall(this.scope, new C26198a(AbstractC11266d.m30461o("'extraData' contains reserved keys: ", AbstractC25265s.m74110N0((Iterable) arrayList, null, null, null, null, 63))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r10v11, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.util.ArrayList] */
    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdateMessage(String messageId, Map<String, ? extends Object> set, List<String> unset, boolean skipEnrichUrl) {
        ?? arrayList;
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        InterfaceC27474d interfaceC27474dPartialUpdateMessage = this.delegate.partialUpdateMessage(messageId, set, unset, skipEnrichUrl);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Message.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Channel.class))) {
            Set<String> setKeySet = set.keySet();
            Function1 function1 = reservedInChannelPredicate;
            arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (((Boolean) function1.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Message.class))) {
            Set<String> setKeySet2 = set.keySet();
            Function1 function2 = reservedInMessagePredicate;
            arrayList = new ArrayList();
            for (Object obj2 : setKeySet2) {
                if (((Boolean) function2.invoke(obj2)).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(User.class))) {
            Set<String> setKeySet3 = set.keySet();
            Function1 function3 = reservedInUserPredicate;
            arrayList = new ArrayList();
            for (Object obj3 : setKeySet3) {
                if (((Boolean) function3.invoke(obj3)).booleanValue()) {
                    arrayList.add(obj3);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Member.class))) {
            Set<String> setKeySet4 = set.keySet();
            Function1 function4 = reservedInMemberPredicate;
            arrayList = new ArrayList();
            for (Object obj4 : setKeySet4) {
                if (((Boolean) function4.invoke(obj4)).booleanValue()) {
                    arrayList.add(obj4);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(MemberData.class))) {
            Set<String> setKeySet5 = set.keySet();
            Function1 function5 = reservedInMemberPredicate;
            arrayList = new ArrayList();
            for (Object obj5 : setKeySet5) {
                if (((Boolean) function5.invoke(obj5)).booleanValue()) {
                    arrayList.add(obj5);
                }
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        return arrayList.isEmpty() ? interfaceC27474dPartialUpdateMessage : new ErrorCall(this.scope, new C26198a(AbstractC11266d.m30461o("'extraData' contains reserved keys: ", AbstractC25265s.m74110N0((Iterable) arrayList, null, null, null, null, 63))));
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d partialUpdateUser(String id4, Map<String, ? extends Object> set, List<String> unset) {
        ?? arrayList;
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        InterfaceC27474d interfaceC27474dPartialUpdateUser = this.delegate.partialUpdateUser(id4, set, unset);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(User.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Channel.class))) {
            Set<String> setKeySet = set.keySet();
            Function1 function1 = reservedInChannelPredicate;
            arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (((Boolean) function1.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Message.class))) {
            Set<String> setKeySet2 = set.keySet();
            Function1 function2 = reservedInMessagePredicate;
            arrayList = new ArrayList();
            for (Object obj2 : setKeySet2) {
                if (((Boolean) function2.invoke(obj2)).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(User.class))) {
            Set<String> setKeySet3 = set.keySet();
            Function1 function3 = reservedInUserPredicate;
            arrayList = new ArrayList();
            for (Object obj3 : setKeySet3) {
                if (((Boolean) function3.invoke(obj3)).booleanValue()) {
                    arrayList.add(obj3);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Member.class))) {
            Set<String> setKeySet4 = set.keySet();
            Function1 function4 = reservedInMemberPredicate;
            arrayList = new ArrayList();
            for (Object obj4 : setKeySet4) {
                if (((Boolean) function4.invoke(obj4)).booleanValue()) {
                    arrayList.add(obj4);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(MemberData.class))) {
            Set<String> setKeySet5 = set.keySet();
            Function1 function5 = reservedInMemberPredicate;
            arrayList = new ArrayList();
            for (Object obj5 : setKeySet5) {
                if (((Boolean) function5.invoke(obj5)).booleanValue()) {
                    arrayList.add(obj5);
                }
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        return arrayList.isEmpty() ? interfaceC27474dPartialUpdateUser : new ErrorCall(this.scope, new C26198a(AbstractC11266d.m30461o("'extraData' contains reserved keys: ", AbstractC25265s.m74110N0((Iterable) arrayList, null, null, null, null, 63))));
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateChannel(String channelType, String channelId, Map<String, ? extends Object> extraData, Message updateMessage) {
        ?? arrayList;
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(extraData, "extraData");
        InterfaceC27474d interfaceC27474dUpdateChannel = this.delegate.updateChannel(channelType, channelId, extraData, updateMessage);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Channel.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Channel.class))) {
            Set<String> setKeySet = extraData.keySet();
            Function1 function1 = reservedInChannelPredicate;
            arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (((Boolean) function1.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Message.class))) {
            Set<String> setKeySet2 = extraData.keySet();
            Function1 function2 = reservedInMessagePredicate;
            arrayList = new ArrayList();
            for (Object obj2 : setKeySet2) {
                if (((Boolean) function2.invoke(obj2)).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(User.class))) {
            Set<String> setKeySet3 = extraData.keySet();
            Function1 function3 = reservedInUserPredicate;
            arrayList = new ArrayList();
            for (Object obj3 : setKeySet3) {
                if (((Boolean) function3.invoke(obj3)).booleanValue()) {
                    arrayList.add(obj3);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Member.class))) {
            Set<String> setKeySet4 = extraData.keySet();
            Function1 function4 = reservedInMemberPredicate;
            arrayList = new ArrayList();
            for (Object obj4 : setKeySet4) {
                if (((Boolean) function4.invoke(obj4)).booleanValue()) {
                    arrayList.add(obj4);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(MemberData.class))) {
            Set<String> setKeySet5 = extraData.keySet();
            Function1 function5 = reservedInMemberPredicate;
            arrayList = new ArrayList();
            for (Object obj5 : setKeySet5) {
                if (((Boolean) function5.invoke(obj5)).booleanValue()) {
                    arrayList.add(obj5);
                }
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        if (!arrayList.isEmpty()) {
            interfaceC27474dUpdateChannel = new ErrorCall(this.scope, new C26198a(AbstractC11266d.m30461o("'extraData' contains reserved keys: ", AbstractC25265s.m74110N0((Iterable) arrayList, null, null, null, null, 63))));
        }
        return withExtraDataValidation(interfaceC27474dUpdateChannel, updateMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r10v14, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.util.ArrayList] */
    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateChannelPartial(String channelType, String channelId, Map<String, ? extends Object> set, List<String> unset) {
        ?? arrayList;
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(unset, "unset");
        InterfaceC27474d interfaceC27474dUpdateChannelPartial = this.delegate.updateChannelPartial(channelType, channelId, set, unset);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Channel.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Channel.class))) {
            Set<String> setKeySet = set.keySet();
            Function1 function1 = reservedInChannelPredicate;
            arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (((Boolean) function1.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Message.class))) {
            Set<String> setKeySet2 = set.keySet();
            Function1 function2 = reservedInMessagePredicate;
            arrayList = new ArrayList();
            for (Object obj2 : setKeySet2) {
                if (((Boolean) function2.invoke(obj2)).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(User.class))) {
            Set<String> setKeySet3 = set.keySet();
            Function1 function3 = reservedInUserPredicate;
            arrayList = new ArrayList();
            for (Object obj3 : setKeySet3) {
                if (((Boolean) function3.invoke(obj3)).booleanValue()) {
                    arrayList.add(obj3);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Member.class))) {
            Set<String> setKeySet4 = set.keySet();
            Function1 function4 = reservedInMemberPredicate;
            arrayList = new ArrayList();
            for (Object obj4 : setKeySet4) {
                if (((Boolean) function4.invoke(obj4)).booleanValue()) {
                    arrayList.add(obj4);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(MemberData.class))) {
            Set<String> setKeySet5 = set.keySet();
            Function1 function5 = reservedInMemberPredicate;
            arrayList = new ArrayList();
            for (Object obj5 : setKeySet5) {
                if (((Boolean) function5.invoke(obj5)).booleanValue()) {
                    arrayList.add(obj5);
                }
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        return arrayList.isEmpty() ? interfaceC27474dUpdateChannelPartial : new ErrorCall(this.scope, new C26198a(AbstractC11266d.m30461o("'extraData' contains reserved keys: ", AbstractC25265s.m74110N0((Iterable) arrayList, null, null, null, null, 63))));
    }

    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateLiveLocation(Location location) {
        AbstractC22676k.m65750j(location, "location");
        return this.delegate.updateLiveLocation(location);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // io.getstream.chat.android.client.api.ChatApi
    public final InterfaceC27474d updateMessage(Message message) {
        ?? arrayList;
        AbstractC22676k.m65750j(message, "message");
        InterfaceC27474d interfaceC27474dUpdateMessage = this.delegate.updateMessage(message);
        Map<String, Object> extraData = message.getExtraData();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Message.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Channel.class))) {
            Set<String> setKeySet = extraData.keySet();
            Function1 function1 = reservedInChannelPredicate;
            arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (((Boolean) function1.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Message.class))) {
            Set<String> setKeySet2 = extraData.keySet();
            Function1 function2 = reservedInMessagePredicate;
            arrayList = new ArrayList();
            for (Object obj2 : setKeySet2) {
                if (((Boolean) function2.invoke(obj2)).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(User.class))) {
            Set<String> setKeySet3 = extraData.keySet();
            Function1 function3 = reservedInUserPredicate;
            arrayList = new ArrayList();
            for (Object obj3 : setKeySet3) {
                if (((Boolean) function3.invoke(obj3)).booleanValue()) {
                    arrayList.add(obj3);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Member.class))) {
            Set<String> setKeySet4 = extraData.keySet();
            Function1 function4 = reservedInMemberPredicate;
            arrayList = new ArrayList();
            for (Object obj4 : setKeySet4) {
                if (((Boolean) function4.invoke(obj4)).booleanValue()) {
                    arrayList.add(obj4);
                }
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(MemberData.class))) {
            Set<String> setKeySet5 = extraData.keySet();
            Function1 function5 = reservedInMemberPredicate;
            arrayList = new ArrayList();
            for (Object obj5 : setKeySet5) {
                if (((Boolean) function5.invoke(obj5)).booleanValue()) {
                    arrayList.add(obj5);
                }
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        return arrayList.isEmpty() ? interfaceC27474dUpdateMessage : new ErrorCall(this.scope, new C26198a(AbstractC11266d.m30461o("'extraData' contains reserved keys: ", AbstractC25265s.m74110N0((Iterable) arrayList, null, null, null, null, 63))));
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
        return withExtraDataValidation(this.delegate.updateUsers(users), users);
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

    private final List<String> findReserved(CustomObject customObject) {
        if (customObject instanceof Channel) {
            Set<String> setKeySet = ((Channel) customObject).getExtraData().keySet();
            Function1 function1 = reservedInChannelPredicate;
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (((Boolean) function1.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        if (customObject instanceof Message) {
            Set<String> setKeySet2 = ((Message) customObject).getExtraData().keySet();
            Function1 function2 = reservedInChannelPredicate;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : setKeySet2) {
                if (((Boolean) function2.invoke(obj2)).booleanValue()) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
        if (customObject instanceof User) {
            Set<String> setKeySet3 = ((User) customObject).getExtraData().keySet();
            Function1 function3 = reservedInChannelPredicate;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : setKeySet3) {
                if (((Boolean) function3.invoke(obj3)).booleanValue()) {
                    arrayList3.add(obj3);
                }
            }
            return arrayList3;
        }
        if (customObject instanceof Member) {
            Set<String> setKeySet4 = ((Member) customObject).getExtraData().keySet();
            Function1 function4 = reservedInMemberPredicate;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : setKeySet4) {
                if (((Boolean) function4.invoke(obj4)).booleanValue()) {
                    arrayList4.add(obj4);
                }
            }
            return arrayList4;
        }
        if (customObject instanceof MemberData) {
            Set<String> setKeySet5 = ((MemberData) customObject).getExtraData().keySet();
            Function1 function5 = reservedInMemberPredicate;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : setKeySet5) {
                if (((Boolean) function5.invoke(obj5)).booleanValue()) {
                    arrayList5.add(obj5);
                }
            }
            return arrayList5;
        }
        return C25271y.f99162w;
    }

    private final <T extends CustomObject, K extends CustomObject> InterfaceC27474d withExtraDataValidation(InterfaceC27474d interfaceC27474d, K k5) {
        List<String> listFindReserved = k5 != null ? findReserved(k5) : C25271y.f99162w;
        return listFindReserved.isEmpty() ? interfaceC27474d : new ErrorCall(this.scope, new C26198a(composeErrorMessage(k5, listFindReserved)));
    }

    private final <T extends CustomObject> InterfaceC27474d withExtraDataValidation(InterfaceC27474d interfaceC27474d, Map<String, ? extends Object> map) {
        AbstractC22676k.m65756p();
        throw null;
    }

    private final <T extends CustomObject> List<String> findReserved(Map<String, ? extends Object> map) {
        AbstractC22676k.m65756p();
        throw null;
    }
}
