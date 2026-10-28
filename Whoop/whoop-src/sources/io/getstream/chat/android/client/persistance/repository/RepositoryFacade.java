package io.getstream.chat.android.client.persistance.repository;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import com.mapbox.maps.MapboxMap;
import com.whoop.service.network.model.UserState;
import ec3.InterfaceC13037f2;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.internal.state.plugin.QueryChannelsIdentifier;
import io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory;
import io.getstream.chat.android.client.query.QueryChannelsSpec;
import io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest;
import io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequestKt;
import io.getstream.chat.android.client.sync.SyncState;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelConfig;
import io.getstream.chat.android.models.Config;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25272z;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 É\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0002É\u0001BY\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0086@¢\u0006\u0004\b\u001b\u0010 J5\u0010$\u001a\u00020\u001a*\u00020\u001a2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00170!2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b$\u0010%J\u0018\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b(\u0010)J\u001e\u0010,\u001a\u00020'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0*H\u0096@¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020'2\u0006\u0010.\u001a\u00020\"H\u0096@¢\u0006\u0004\b/\u00100J\u001e\u00102\u001a\u00020'2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\"0\u0017H\u0096@¢\u0006\u0004\b2\u0010\u001cJ \u00106\u001a\u00020'2\u0006\u00103\u001a\u00020\u00182\u0006\u00105\u001a\u000204H\u0096@¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\u00020'2\u0006\u0010.\u001a\u00020\"H\u0096@¢\u0006\u0004\b8\u00100J\u0018\u00109\u001a\u00020'2\u0006\u0010.\u001a\u00020\"H\u0087@¢\u0006\u0004\b9\u00100J\u0018\u0010<\u001a\u00020'2\u0006\u0010;\u001a\u00020:H\u0096@¢\u0006\u0004\b<\u0010=J&\u0010@\u001a\u00020'2\u0006\u00103\u001a\u00020\u00182\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0017H\u0096@¢\u0006\u0004\b@\u0010AJ\u001e\u0010B\u001a\u00020'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0*H\u0086@¢\u0006\u0004\bB\u0010-J\u0018\u0010C\u001a\u00020'2\u0006\u00103\u001a\u00020\u0018H\u0096@¢\u0006\u0004\bC\u0010DJ(\u0010G\u001a\u00020'2\u0006\u00103\u001a\u00020\u00182\u0006\u0010F\u001a\u00020E2\u0006\u00105\u001a\u000204H\u0096@¢\u0006\u0004\bG\u0010HJ \u0010G\u001a\u00020'2\u0006\u00103\u001a\u00020\u00182\u0006\u0010F\u001a\u00020EH\u0096@¢\u0006\u0004\bG\u0010IJ\u001e\u0010L\u001a\u00020'2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u0017H\u0096@¢\u0006\u0004\bL\u0010\u001cJ\u0018\u0010M\u001a\u00020'2\u0006\u0010&\u001a\u00020\u001aH\u0086@¢\u0006\u0004\bM\u0010)J\u0010\u0010N\u001a\u00020'H\u0096@¢\u0006\u0004\bN\u0010OJ\u001e\u0010R\u001a\u00020'2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0*H\u0096A¢\u0006\u0004\bR\u0010-J\u0018\u0010T\u001a\u00020'2\u0006\u0010S\u001a\u00020PH\u0096A¢\u0006\u0004\bT\u0010UJ\u0018\u0010V\u001a\u00020'2\u0006\u0010S\u001a\u00020PH\u0096A¢\u0006\u0004\bV\u0010UJ\u001a\u0010X\u001a\u0004\u0018\u00010P2\u0006\u0010W\u001a\u00020\u0018H\u0096A¢\u0006\u0004\bX\u0010DJ$\u0010Z\u001a\b\u0012\u0004\u0012\u00020P0\u00172\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0096A¢\u0006\u0004\bZ\u0010\u001cJ\"\u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020P0!0[H\u0096\u0001¢\u0006\u0004\b\\\u0010]J\"\u0010^\u001a\u00020'2\b\u00103\u001a\u0004\u0018\u00010\u00182\u0006\u0010W\u001a\u00020\u0018H\u0096A¢\u0006\u0004\b^\u0010_J\u0018\u0010`\u001a\u00020'2\u0006\u0010.\u001a\u00020\"H\u0096A¢\u0006\u0004\b`\u00100J\u0016\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0096A¢\u0006\u0004\ba\u0010OJ\u001a\u0010b\u001a\u0004\u0018\u00010\u001a2\u0006\u00103\u001a\u00020\u0018H\u0096A¢\u0006\u0004\bb\u0010DJ\u001e\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010d\u001a\u00020cH\u0096A¢\u0006\u0004\be\u0010fJ\u001e\u0010g\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\u0006\u0010d\u001a\u00020cH\u0096A¢\u0006\u0004\bg\u0010fJ \u0010i\u001a\u00020'2\u0006\u00103\u001a\u00020\u00182\u0006\u0010h\u001a\u000204H\u0096A¢\u0006\u0004\bi\u00107J\u001e\u0010j\u001a\b\u0012\u0004\u0012\u00020>0\u00172\u0006\u00103\u001a\u00020\u0018H\u0096A¢\u0006\u0004\bj\u0010DJ \u0010l\u001a\u00020'2\u0006\u00103\u001a\u00020\u00182\u0006\u0010k\u001a\u00020\"H\u0096A¢\u0006\u0004\bl\u0010mJ\u0018\u0010n\u001a\u00020'2\u0006\u00103\u001a\u00020\u0018H\u0096A¢\u0006\u0004\bn\u0010DJ(\u0010p\u001a\u00020'2\u0006\u0010W\u001a\u00020\u00182\u0006\u0010o\u001a\u00020\u00182\u0006\u0010h\u001a\u000204H\u0096A¢\u0006\u0004\bp\u0010qJ\u001a\u0010s\u001a\u0004\u0018\u00010:2\u0006\u0010r\u001a\u00020cH\u0096A¢\u0006\u0004\bs\u0010fJ$\u0010t\u001a\b\u0012\u0004\u0012\u00020:0\u00172\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020c0\u0017H\u0096A¢\u0006\u0004\bt\u0010\u001cJ\u001e\u0010w\u001a\b\u0012\u0004\u0012\u00020c0\u00172\u0006\u0010v\u001a\u00020uH\u0096A¢\u0006\u0004\bw\u0010xJ\u001e\u0010y\u001a\b\u0012\u0004\u0012\u00020:0\u00172\u0006\u0010v\u001a\u00020uH\u0096A¢\u0006\u0004\by\u0010xJ*\u0010{\u001a\u0004\u0018\u00010:2\u0006\u0010z\u001a\u00020\u00182\u0006\u0010o\u001a\u00020\u00182\u0006\u0010W\u001a\u00020\u0018H\u0096A¢\u0006\u0004\b{\u0010|J&\u0010}\u001a\b\u0012\u0004\u0012\u00020:0\u00172\u0006\u0010o\u001a\u00020\u00182\u0006\u0010W\u001a\u00020\u0018H\u0096A¢\u0006\u0004\b}\u0010_J\u0018\u0010~\u001a\u00020'2\u0006\u0010;\u001a\u00020:H\u0096A¢\u0006\u0004\b~\u0010=J)\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\"0\u00172\u0006\u00103\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096A¢\u0006\u0005\b\u007f\u0010\u0080\u0001J)\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u00172\u0006\u0010o\u001a\u00020\u00182\u0006\u0010d\u001a\u00020cH\u0096A¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J \u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u00172\u0006\u0010W\u001a\u00020\u0018H\u0096A¢\u0006\u0005\b\u0083\u0001\u0010DJ(\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u00172\u0006\u00103\u001a\u00020\u00182\u0006\u0010W\u001a\u00020\u0018H\u0096A¢\u0006\u0005\b\u0084\u0001\u0010_J'\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u00172\r\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0096A¢\u0006\u0005\b\u0086\u0001\u0010\u001cJ\u001c\u0010\u0087\u0001\u001a\u0004\u0018\u00010\"2\u0006\u0010o\u001a\u00020\u0018H\u0096A¢\u0006\u0005\b\u0087\u0001\u0010DJ!\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u00172\u0007\u0010\u0088\u0001\u001a\u00020\u0018H\u0096A¢\u0006\u0005\b\u0089\u0001\u0010DJ\u001a\u0010\u008a\u0001\u001a\u00020'2\u0006\u00103\u001a\u00020\u0018H\u0096A¢\u0006\u0005\b\u008a\u0001\u0010DJ \u0010\u008b\u0001\u001a\u00020'2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\"0\u0017H\u0096A¢\u0006\u0005\b\u008b\u0001\u0010\u001cJ \u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010v\u001a\u00020uH\u0096A¢\u0006\u0005\b\u008c\u0001\u0010xJ \u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u00172\u0006\u0010v\u001a\u00020uH\u0096A¢\u0006\u0005\b\u008d\u0001\u0010xJ\u001c\u0010\u008f\u0001\u001a\u00020'2\u0007\u0010.\u001a\u00030\u008e\u0001H\u0096A¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0019\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010\u0017H\u0096A¢\u0006\u0005\b\u0091\u0001\u0010OJ\u001d\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008e\u00012\u0006\u00103\u001a\u00020\u0018H\u0096A¢\u0006\u0005\b\u0092\u0001\u0010DJ\u001e\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u008e\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u0018H\u0096A¢\u0006\u0005\b\u0094\u0001\u0010DJ\u001c\u0010\u0095\u0001\u001a\u00020'2\u0007\u0010.\u001a\u00030\u008e\u0001H\u0096A¢\u0006\u0006\b\u0095\u0001\u0010\u0090\u0001J\u0012\u0010\u0096\u0001\u001a\u00020'H\u0096A¢\u0006\u0005\b\u0096\u0001\u0010OJ\u001a\u0010\u0097\u0001\u001a\u00020'2\u0006\u0010o\u001a\u00020\u0018H\u0096A¢\u0006\u0005\b\u0097\u0001\u0010DJ\u001b\u0010\u0098\u0001\u001a\u00020'2\u0007\u0010\u0088\u0001\u001a\u00020\u0018H\u0096A¢\u0006\u0005\b\u0098\u0001\u0010DJ \u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u00172\u0006\u00103\u001a\u00020\u0018H\u0096A¢\u0006\u0005\b\u0099\u0001\u0010DJ\u0012\u0010\u009a\u0001\u001a\u00020'H\u0096A¢\u0006\u0005\b\u009a\u0001\u0010OJ\u001f\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u00012\u0007\u0010\u009b\u0001\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\"\u0010 \u0001\u001a\u00020'2\u000e\u0010\u009f\u0001\u001a\t\u0012\u0005\u0012\u00030\u009c\u00010*H\u0096A¢\u0006\u0005\b \u0001\u0010-J\u001d\u0010¢\u0001\u001a\u00020'2\b\u0010¡\u0001\u001a\u00030\u009c\u0001H\u0096A¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001d\u0010¦\u0001\u001a\u00020'2\b\u0010¥\u0001\u001a\u00030¤\u0001H\u0096A¢\u0006\u0006\b¦\u0001\u0010§\u0001J \u0010ª\u0001\u001a\u0005\u0018\u00010¤\u00012\b\u0010©\u0001\u001a\u00030¨\u0001H\u0096A¢\u0006\u0006\bª\u0001\u0010«\u0001J)\u0010\u00ad\u0001\u001a\u00020'2\u0006\u0010r\u001a\u00020\u00182\r\u0010¬\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0096A¢\u0006\u0005\b\u00ad\u0001\u0010AJ \u0010®\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010r\u001a\u00020\u0018H\u0096A¢\u0006\u0005\b®\u0001\u0010DJ\u001a\u0010¯\u0001\u001a\u00020'2\u0006\u0010.\u001a\u00020\"H\u0096A¢\u0006\u0005\b¯\u0001\u00100J \u0010°\u0001\u001a\u00020'2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\"0\u0017H\u0096A¢\u0006\u0005\b°\u0001\u0010\u001cJ\u001c\u0010±\u0001\u001a\u0004\u0018\u00010J2\u0006\u0010r\u001a\u00020\u0018H\u0096A¢\u0006\u0005\b±\u0001\u0010DJ&\u0010²\u0001\u001a\b\u0012\u0004\u0012\u00020J0\u00172\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0096A¢\u0006\u0005\b²\u0001\u0010\u001cJ\u001a\u0010³\u0001\u001a\u00020'2\u0006\u00103\u001a\u00020\u0018H\u0096A¢\u0006\u0005\b³\u0001\u0010DJ\u001d\u0010¶\u0001\u001a\u00020'2\b\u0010µ\u0001\u001a\u00030´\u0001H\u0096A¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u001d\u0010¸\u0001\u001a\u0005\u0018\u00010´\u00012\u0006\u0010W\u001a\u00020\u0018H\u0096A¢\u0006\u0005\b¸\u0001\u0010DR\u0015\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010¹\u0001R\u0015\u0010\n\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010º\u0001R\u0015\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010»\u0001R\u0015\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010¼\u0001R\u0015\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010½\u0001R\u0015\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010¾\u0001R\u0015\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010¿\u0001R\u0015\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010À\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010Á\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010Â\u0001R!\u0010È\u0001\u001a\u00030Ã\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001¨\u0006Ê\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;", "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;", "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;", "Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;", "userRepository", "configsRepository", "channelsRepository", "queryChannelsRepository", "threadsRepository", "messageRepository", "reactionsRepository", "syncStateRepository", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/models/Config;", "defaultConfig", "<init>", "(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;Lbc3/c0;Lio/getstream/chat/android/models/Config;)V", "", "", "channelCIDs", "Lio/getstream/chat/android/models/Channel;", "selectChannels", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "channelIds", "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;", "pagination", "(Ljava/util/List;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;", "", "Lio/getstream/chat/android/models/Message;", "messageMap", "enrichChannel", "(Lio/getstream/chat/android/models/Channel;Ljava/util/Map;Lio/getstream/chat/android/models/Config;)Lio/getstream/chat/android/models/Channel;", "channel", "Ll83/a0;", "insertChannel", "(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;", "", "channels", "insertChannels", "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;", "message", "insertMessage", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "messages", "insertMessages", "cid", "Ljava/util/Date;", "hideMessagesBefore", "deleteChannelMessagesBefore", "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "deleteChannelMessage", "markMessageAsDeleted", "Lio/getstream/chat/android/models/Reaction;", "reaction", "insertReaction", "(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Member;", QueryChannelRequest.KEY_MEMBERS, "updateMembersForChannel", "(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "storeStateForChannels", "deleteChannel", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "hidden", "setHiddenForChannel", "(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Thread;", "threads", "insertThreads", "storeStateForChannel", "clear", "(Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/User;", "users", "insertUsers", UserState.Sources.USER, "insertUser", "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "insertCurrentUser", "userId", "selectUser", "ids", "selectUsers", "Lec3/f2;", "observeLatestUsers", "()Lec3/f2;", "deleteAllChannelUserMessages", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "updateChannelMessage", "selectAllCids", "selectChannel", "", MapboxMap.QFE_LIMIT, "selectChannelCidsBySyncNeeded", "(ILq83/d;)Ljava/lang/Object;", "selectChannelsSyncNeeded", "deletedAt", "setChannelDeletedAt", "selectMembersForChannel", "lastMessage", "updateLastMessageForChannel", "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "evictChannel", "messageId", "updateReactionsForMessageByDeletedDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "id", "selectReactionById", "selectReactionsByIds", "Lio/getstream/chat/android/models/SyncStatus;", "syncStatus", "selectReactionIdsBySyncStatus", "(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;", "selectReactionsBySyncStatus", "reactionType", "selectUserReactionToMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "selectUserReactionsToMessage", "deleteReaction", "selectMessagesForChannel", "(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;", "selectMessagesForThread", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "selectAllUserMessages", "selectAllChannelUserMessages", "messageIds", "selectMessages", "selectMessage", "pollId", "selectMessagesWithPoll", "deleteChannelMessages", "deleteMessages", "selectMessageIdsBySyncState", "selectMessageBySyncState", "Lio/getstream/chat/android/models/DraftMessage;", "insertDraftMessage", "(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;", "selectDraftMessages", "selectDraftMessagesByCid", "parentId", "selectDraftMessageByParentId", "deleteDraftMessage", "evictMessages", "evictMessage", "deletePoll", "selectLocalOnlyMessagesForChannel", "cacheChannelConfigs", "channelType", "Lio/getstream/chat/android/models/ChannelConfig;", "selectChannelConfig", "(Ljava/lang/String;)Lio/getstream/chat/android/models/ChannelConfig;", "configs", "insertChannelConfigs", "config", "insertChannelConfig", "(Lio/getstream/chat/android/models/ChannelConfig;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/query/QueryChannelsSpec;", "queryChannelsSpec", "insertQueryChannels", "(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "identifier", "selectBy", "(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lq83/d;)Ljava/lang/Object;", "order", "insertThreadOrder", "selectThreadOrder", "upsertMessageInThread", "upsertMessagesInThread", "selectThread", "selectThreads", "deleteChannelThreads", "Lio/getstream/chat/android/client/sync/SyncState;", "syncState", "insertSyncState", "(Lio/getstream/chat/android/client/sync/SyncState;Lq83/d;)Ljava/lang/Object;", "selectSyncState", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;", "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;", "Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;", "Lbc3/c0;", "Lio/getstream/chat/android/models/Config;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class RepositoryFacade implements UserRepository, ChannelRepository, ReactionRepository, MessageRepository, ChannelConfigRepository, QueryChannelsRepository, ThreadsRepository, SyncStateRepository {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final ChannelRepository channelsRepository;
    private final ChannelConfigRepository configsRepository;
    private final Config defaultConfig;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final MessageRepository messageRepository;
    private final QueryChannelsRepository queryChannelsRepository;
    private final ReactionRepository reactionsRepository;
    private final InterfaceC2994c0 scope;
    private final SyncStateRepository syncStateRepository;
    private final ThreadsRepository threadsRepository;
    private final UserRepository userRepository;

    @InternalStreamChatApi
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion;", "", "<init>", "()V", "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;", "factory", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/models/Config;", "defaultConfig", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "create", "(Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;Lbc3/c0;Lio/getstream/chat/android/models/Config;)Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ RepositoryFacade create$default(Companion companion, RepositoryFactory repositoryFactory, InterfaceC2994c0 interfaceC2994c0, Config config, int i13, Object obj) {
            Config config2;
            if ((i13 & 4) != 0) {
                config2 = new Config(null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, 0, null, null, null, null, false, false, false, 67108863, null);
            } else {
                config2 = config;
            }
            return companion.create(repositoryFactory, interfaceC2994c0, config2);
        }

        @InternalStreamChatApi
        public final RepositoryFacade create(RepositoryFactory factory, InterfaceC2994c0 scope, Config defaultConfig) {
            AbstractC22676k.m65750j(factory, "factory");
            AbstractC22676k.m65750j(scope, "scope");
            AbstractC22676k.m65750j(defaultConfig, "defaultConfig");
            UserRepository userRepositoryCreateUserRepository = factory.createUserRepository();
            RepositoryFacade$Companion$create$getUser$1 repositoryFacade$Companion$create$getUser$1 = new RepositoryFacade$Companion$create$getUser$1(userRepositoryCreateUserRepository, null);
            MessageRepository messageRepositoryCreateMessageRepository = factory.createMessageRepository(repositoryFacade$Companion$create$getUser$1);
            RepositoryFacade$Companion$create$getMessage$1 repositoryFacade$Companion$create$getMessage$1 = new RepositoryFacade$Companion$create$getMessage$1(messageRepositoryCreateMessageRepository);
            ChannelRepository channelRepositoryCreateChannelRepository = factory.createChannelRepository(repositoryFacade$Companion$create$getUser$1, repositoryFacade$Companion$create$getMessage$1);
            return new RepositoryFacade(userRepositoryCreateUserRepository, factory.createChannelConfigRepository(), channelRepositoryCreateChannelRepository, factory.createQueryChannelsRepository(), factory.createThreadsRepository(repositoryFacade$Companion$create$getUser$1, repositoryFacade$Companion$create$getMessage$1, new RepositoryFacade$Companion$create$getChannel$1(channelRepositoryCreateChannelRepository)), messageRepositoryCreateMessageRepository, factory.createReactionRepository(repositoryFacade$Companion$create$getUser$1), factory.createSyncStateRepository(), scope, defaultConfig, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.persistance.repository.RepositoryFacade$clear$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade", m100430f = "RepositoryFacade.kt", m100431l = {217, 218, 219, 220, 221, 222, 223, 224}, m100432m = "clear")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194011 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C194011(InterfaceC30057d<? super C194011> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryFacade.this.clear(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.persistance.repository.RepositoryFacade$deleteChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade", m100430f = "RepositoryFacade.kt", m100431l = {185, 186, 187}, m100432m = "deleteChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194021 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C194021(InterfaceC30057d<? super C194021> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryFacade.this.deleteChannel(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.persistance.repository.RepositoryFacade$deleteChannelMessage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade", m100430f = "RepositoryFacade.kt", m100431l = {134, 135}, m100432m = "deleteChannelMessage")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194031 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C194031(InterfaceC30057d<? super C194031> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryFacade.this.deleteChannelMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.persistance.repository.RepositoryFacade$insertChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade", m100430f = "RepositoryFacade.kt", m100431l = {103, 104, 105}, m100432m = "insertChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194041 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C194041(InterfaceC30057d<? super C194041> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryFacade.this.insertChannel(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.persistance.repository.RepositoryFacade$insertChannels$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade", m100430f = "RepositoryFacade.kt", m100431l = {109, 110, 111}, m100432m = "insertChannels")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194051 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C194051(InterfaceC30057d<? super C194051> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryFacade.this.insertChannels(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.persistance.repository.RepositoryFacade$insertMessage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade", m100430f = "RepositoryFacade.kt", m100431l = {115, 116, 117}, m100432m = "insertMessage")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194061 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C194061(InterfaceC30057d<? super C194061> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryFacade.this.insertMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.persistance.repository.RepositoryFacade$insertMessages$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade", m100430f = "RepositoryFacade.kt", m100431l = {121, 122, 123}, m100432m = "insertMessages")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194071 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C194071(InterfaceC30057d<? super C194071> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryFacade.this.insertMessages(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.persistance.repository.RepositoryFacade$insertReaction$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade", m100430f = "RepositoryFacade.kt", m100431l = {156, 161, 162}, m100432m = "insertReaction")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194081 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C194081(InterfaceC30057d<? super C194081> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryFacade.this.insertReaction(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.persistance.repository.RepositoryFacade$insertThreads$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade", m100430f = "RepositoryFacade.kt", m100431l = {206, 207, 208, 209}, m100432m = "insertThreads")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194091 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C194091(InterfaceC30057d<? super C194091> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryFacade.this.insertThreads(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.persistance.repository.RepositoryFacade$markMessageAsDeleted$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade", m100430f = "RepositoryFacade.kt", m100431l = {140, 141, 142}, m100432m = "markMessageAsDeleted")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194101 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C194101(InterfaceC30057d<? super C194101> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryFacade.this.markMessageAsDeleted(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.persistance.repository.RepositoryFacade$selectChannels$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade", m100430f = "RepositoryFacade.kt", m100431l = {72, 81}, m100432m = "selectChannels")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194112 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C194112(InterfaceC30057d<? super C194112> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryFacade.this.selectChannels(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.persistance.repository.RepositoryFacade$setHiddenForChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade", m100430f = "RepositoryFacade.kt", m100431l = {191, 192}, m100432m = "setHiddenForChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194121 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C194121(InterfaceC30057d<? super C194121> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryFacade.this.setHiddenForChannel(null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.persistance.repository.RepositoryFacade$setHiddenForChannel$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade", m100430f = "RepositoryFacade.kt", m100431l = {196, 197}, m100432m = "setHiddenForChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194132 extends AbstractC32269c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C194132(InterfaceC30057d<? super C194132> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryFacade.this.setHiddenForChannel(null, false, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.persistance.repository.RepositoryFacade$storeStateForChannels$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade", m100430f = "RepositoryFacade.kt", m100431l = {171, 172, 173}, m100432m = "storeStateForChannels")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194141 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C194141(InterfaceC30057d<? super C194141> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryFacade.this.storeStateForChannels(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.persistance.repository.RepositoryFacade$updateMembersForChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.persistance.repository.RepositoryFacade", m100430f = "RepositoryFacade.kt", m100431l = {166, 167}, m100432m = "updateMembersForChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194151 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C194151(InterfaceC30057d<? super C194151> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryFacade.this.updateMembersForChannel(null, null, this);
        }
    }

    public /* synthetic */ RepositoryFacade(UserRepository userRepository, ChannelConfigRepository channelConfigRepository, ChannelRepository channelRepository, QueryChannelsRepository queryChannelsRepository, ThreadsRepository threadsRepository, MessageRepository messageRepository, ReactionRepository reactionRepository, SyncStateRepository syncStateRepository, InterfaceC2994c0 interfaceC2994c0, Config config, DefaultConstructorMarker defaultConstructorMarker) {
        this(userRepository, channelConfigRepository, channelRepository, queryChannelsRepository, threadsRepository, messageRepository, reactionRepository, syncStateRepository, interfaceC2994c0, config);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository
    public final Object cacheChannelConfigs(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.configsRepository.cacheChannelConfigs(interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
    
        if (r5.clear(r0) == r1) goto L43;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clear(q83.InterfaceC30057d<? super l83.C23454a0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194011
            if (r0 == 0) goto L13
            r0 = r5
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$clear$1 r0 = (io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194011) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$clear$1 r0 = new io.getstream.chat.android.client.persistance.repository.RepositoryFacade$clear$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            switch(r2) {
                case 0: goto L4b;
                case 1: goto L47;
                case 2: goto L43;
                case 3: goto L3f;
                case 4: goto L3b;
                case 5: goto L37;
                case 6: goto L33;
                case 7: goto L2e;
                case 8: goto L29;
                default: goto L21;
            }
        L21:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L29:
            p505ts.AbstractC34132o.m107864I(r5)
            goto Laf
        L2e:
            p505ts.AbstractC34132o.m107864I(r5)
            goto La2
        L33:
            p505ts.AbstractC34132o.m107864I(r5)
            goto L96
        L37:
            p505ts.AbstractC34132o.m107864I(r5)
            goto L8a
        L3b:
            p505ts.AbstractC34132o.m107864I(r5)
            goto L7e
        L3f:
            p505ts.AbstractC34132o.m107864I(r5)
            goto L72
        L43:
            p505ts.AbstractC34132o.m107864I(r5)
            goto L66
        L47:
            p505ts.AbstractC34132o.m107864I(r5)
            goto L5a
        L4b:
            p505ts.AbstractC34132o.m107864I(r5)
            io.getstream.chat.android.client.persistance.repository.UserRepository r5 = r4.userRepository
            r2 = 1
            r0.label = r2
            java.lang.Object r5 = r5.clear(r0)
            if (r5 != r1) goto L5a
            goto Lae
        L5a:
            io.getstream.chat.android.client.persistance.repository.ChannelRepository r5 = r4.channelsRepository
            r2 = 2
            r0.label = r2
            java.lang.Object r5 = r5.clear(r0)
            if (r5 != r1) goto L66
            goto Lae
        L66:
            io.getstream.chat.android.client.persistance.repository.ReactionRepository r5 = r4.reactionsRepository
            r2 = 3
            r0.label = r2
            java.lang.Object r5 = r5.clear(r0)
            if (r5 != r1) goto L72
            goto Lae
        L72:
            io.getstream.chat.android.client.persistance.repository.MessageRepository r5 = r4.messageRepository
            r2 = 4
            r0.label = r2
            java.lang.Object r5 = r5.clear(r0)
            if (r5 != r1) goto L7e
            goto Lae
        L7e:
            io.getstream.chat.android.client.persistance.repository.ThreadsRepository r5 = r4.threadsRepository
            r2 = 5
            r0.label = r2
            java.lang.Object r5 = r5.clear(r0)
            if (r5 != r1) goto L8a
            goto Lae
        L8a:
            io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository r5 = r4.configsRepository
            r2 = 6
            r0.label = r2
            java.lang.Object r5 = r5.clear(r0)
            if (r5 != r1) goto L96
            goto Lae
        L96:
            io.getstream.chat.android.client.persistance.repository.QueryChannelsRepository r5 = r4.queryChannelsRepository
            r2 = 7
            r0.label = r2
            java.lang.Object r5 = r5.clear(r0)
            if (r5 != r1) goto La2
            goto Lae
        La2:
            io.getstream.chat.android.client.persistance.repository.SyncStateRepository r5 = r4.syncStateRepository
            r2 = 8
            r0.label = r2
            java.lang.Object r5 = r5.clear(r0)
            if (r5 != r1) goto Laf
        Lae:
            return r1
        Laf:
            l83.a0 r5 = l83.C23454a0.f92919a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.persistance.repository.RepositoryFacade.clear(q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object deleteAllChannelUserMessages(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.channelsRepository.deleteAllChannelUserMessages(str, str2, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r8.deleteChannelMessages(r7, r0) == r1) goto L26;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleteChannel(java.lang.String r7, q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194021
            if (r0 == 0) goto L13
            r0 = r8
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$deleteChannel$1 r0 = (io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194021) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$deleteChannel$1 r0 = new io.getstream.chat.android.client.persistance.repository.RepositoryFacade$deleteChannel$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L74
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L66
        L41:
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L59
        L49:
            p505ts.AbstractC34132o.m107864I(r8)
            io.getstream.chat.android.client.persistance.repository.ThreadsRepository r8 = r6.threadsRepository
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.deleteChannelThreads(r7, r0)
            if (r8 != r1) goto L59
            goto L73
        L59:
            io.getstream.chat.android.client.persistance.repository.ChannelRepository r8 = r6.channelsRepository
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.deleteChannel(r7, r0)
            if (r8 != r1) goto L66
            goto L73
        L66:
            io.getstream.chat.android.client.persistance.repository.MessageRepository r8 = r6.messageRepository
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r8.deleteChannelMessages(r7, r0)
            if (r7 != r1) goto L74
        L73:
            return r1
        L74:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.persistance.repository.RepositoryFacade.deleteChannel(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r7.deleteChannelMessage(r6, r0) == r1) goto L21;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleteChannelMessage(io.getstream.chat.android.models.Message r6, q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194031
            if (r0 == 0) goto L13
            r0 = r7
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$deleteChannelMessage$1 r0 = (io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194031) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$deleteChannelMessage$1 r0 = new io.getstream.chat.android.client.persistance.repository.RepositoryFacade$deleteChannelMessage$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            io.getstream.chat.android.models.Message r6 = (io.getstream.chat.android.models.Message) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L5c
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.L$0
            io.getstream.chat.android.models.Message r6 = (io.getstream.chat.android.models.Message) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L4e
        L3e:
            p505ts.AbstractC34132o.m107864I(r7)
            io.getstream.chat.android.client.persistance.repository.MessageRepository r7 = r5.messageRepository
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.deleteChannelMessage(r6, r0)
            if (r7 != r1) goto L4e
            goto L5b
        L4e:
            io.getstream.chat.android.client.persistance.repository.ChannelRepository r7 = r5.channelsRepository
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r7.deleteChannelMessage(r6, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.persistance.repository.RepositoryFacade.deleteChannelMessage(io.getstream.chat.android.models.Message, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deleteChannelMessages(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.messageRepository.deleteChannelMessages(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deleteChannelMessagesBefore(String str, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objDeleteChannelMessagesBefore = this.messageRepository.deleteChannelMessagesBefore(str, date, interfaceC30057d);
        return objDeleteChannelMessagesBefore == EnumC31071a.f128113w ? objDeleteChannelMessagesBefore : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object deleteChannelThreads(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.threadsRepository.deleteChannelThreads(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deleteDraftMessage(DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.messageRepository.deleteDraftMessage(draftMessage, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deleteMessages(List<Message> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.messageRepository.deleteMessages(list, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object deletePoll(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.messageRepository.deletePoll(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object deleteReaction(Reaction reaction, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.reactionsRepository.deleteReaction(reaction, interfaceC30057d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public final Channel enrichChannel(Channel channel, Map<String, ? extends List<Message>> messageMap, Config defaultConfig) {
        ?? messages;
        Config config;
        AbstractC22676k.m65750j(channel, "<this>");
        AbstractC22676k.m65750j(messageMap, "messageMap");
        AbstractC22676k.m65750j(defaultConfig, "defaultConfig");
        ChannelConfig channelConfigSelectChannelConfig = selectChannelConfig(channel.getType());
        Config config2 = (channelConfigSelectChannelConfig == null || (config = channelConfigSelectChannelConfig.getConfig()) == null) ? defaultConfig : config;
        if (messageMap.containsKey(channel.getCid())) {
            List<Message> list = messageMap.get(channel.getCid());
            if (list == null) {
                throw new IllegalStateException("Messages must be in the map");
            }
            ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(list, channel.getMessages());
            HashSet hashSet = new HashSet();
            messages = new ArrayList();
            for (Object obj : arrayListM74129g1) {
                if (hashSet.add(((Message) obj).getId())) {
                    messages.add(obj);
                }
            }
        } else {
            messages = channel.getMessages();
        }
        return Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, messages, null, null, null, config2, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -34817, 7, null);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object evictChannel(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.channelsRepository.evictChannel(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object evictMessage(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.messageRepository.evictMessage(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object evictMessages(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.messageRepository.evictMessages(interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007a A[PHI: r8
      0x007a: PHI (r8v2 io.getstream.chat.android.models.Channel) = 
      (r8v1 io.getstream.chat.android.models.Channel)
      (r8v1 io.getstream.chat.android.models.Channel)
      (r8v10 io.getstream.chat.android.models.Channel)
     binds: [B:22:0x0066, B:24:0x0077, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r9.insertChannel(r8, r0) == r1) goto L28;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object insertChannel(io.getstream.chat.android.models.Channel r8, q83.InterfaceC30057d<? super l83.C23454a0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194041
            if (r0 == 0) goto L13
            r0 = r9
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$insertChannel$1 r0 = (io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194041) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$insertChannel$1 r0 = new io.getstream.chat.android.client.persistance.repository.RepositoryFacade$insertChannel$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4e
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.L$0
            io.getstream.chat.android.models.Channel r8 = (io.getstream.chat.android.models.Channel) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L89
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            java.lang.Object r8 = r0.L$1
            io.getstream.chat.android.models.DraftMessage r8 = (io.getstream.chat.android.models.DraftMessage) r8
            java.lang.Object r8 = r0.L$0
            io.getstream.chat.android.models.Channel r8 = (io.getstream.chat.android.models.Channel) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L7a
        L46:
            java.lang.Object r8 = r0.L$0
            io.getstream.chat.android.models.Channel r8 = (io.getstream.chat.android.models.Channel) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L62
        L4e:
            p505ts.AbstractC34132o.m107864I(r9)
            java.util.List r9 = io.getstream.chat.android.client.extensions.internal.ChannelKt.users(r8)
            r0.L$0 = r8
            r0.label = r5
            io.getstream.chat.android.client.persistance.repository.UserRepository r2 = r7.userRepository
            java.lang.Object r9 = r2.insertUsers(r9, r0)
            if (r9 != r1) goto L62
            goto L88
        L62:
            io.getstream.chat.android.models.DraftMessage r9 = r8.getDraftMessage()
            if (r9 == 0) goto L7a
            r0.L$0 = r8
            r0.L$1 = r6
            r2 = 0
            r0.I$0 = r2
            r0.label = r4
            io.getstream.chat.android.client.persistance.repository.MessageRepository r2 = r7.messageRepository
            java.lang.Object r9 = r2.insertDraftMessage(r9, r0)
            if (r9 != r1) goto L7a
            goto L88
        L7a:
            io.getstream.chat.android.client.persistance.repository.ChannelRepository r9 = r7.channelsRepository
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = r9.insertChannel(r8, r0)
            if (r8 != r1) goto L89
        L88:
            return r1
        L89:
            l83.a0 r8 = l83.C23454a0.f92919a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.persistance.repository.RepositoryFacade.insertChannel(io.getstream.chat.android.models.Channel, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository
    public final Object insertChannelConfig(ChannelConfig channelConfig, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.configsRepository.insertChannelConfig(channelConfig, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository
    public final Object insertChannelConfigs(Collection<ChannelConfig> collection, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.configsRepository.insertChannelConfigs(collection, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r8.userRepository.insertUsers(r2, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
    
        if (r9.insertChannels(r5, r0) == r1) goto L35;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object insertChannels(java.util.Collection<io.getstream.chat.android.models.Channel> r9, q83.InterfaceC30057d<? super l83.C23454a0> r10) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.persistance.repository.RepositoryFacade.insertChannels(java.util.Collection, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final Object insertCurrentUser(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.userRepository.insertCurrentUser(user, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object insertDraftMessage(DraftMessage draftMessage, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.messageRepository.insertDraftMessage(draftMessage, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r8.upsertMessageInThread(r7, r0) == r1) goto L26;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object insertMessage(io.getstream.chat.android.models.Message r7, q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194061
            if (r0 == 0) goto L13
            r0 = r8
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$insertMessage$1 r0 = (io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194061) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$insertMessage$1 r0 = new io.getstream.chat.android.client.persistance.repository.RepositoryFacade$insertMessage$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.L$0
            io.getstream.chat.android.models.Message r7 = (io.getstream.chat.android.models.Message) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L78
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.L$0
            io.getstream.chat.android.models.Message r7 = (io.getstream.chat.android.models.Message) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L6a
        L41:
            java.lang.Object r7 = r0.L$0
            io.getstream.chat.android.models.Message r7 = (io.getstream.chat.android.models.Message) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L5d
        L49:
            p505ts.AbstractC34132o.m107864I(r8)
            java.util.List r8 = io.getstream.chat.android.client.extensions.internal.MessageKt.users(r7)
            r0.L$0 = r7
            r0.label = r5
            io.getstream.chat.android.client.persistance.repository.UserRepository r2 = r6.userRepository
            java.lang.Object r8 = r2.insertUsers(r8, r0)
            if (r8 != r1) goto L5d
            goto L77
        L5d:
            io.getstream.chat.android.client.persistance.repository.MessageRepository r8 = r6.messageRepository
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.insertMessage(r7, r0)
            if (r8 != r1) goto L6a
            goto L77
        L6a:
            io.getstream.chat.android.client.persistance.repository.ThreadsRepository r8 = r6.threadsRepository
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r8.upsertMessageInThread(r7, r0)
            if (r7 != r1) goto L78
        L77:
            return r1
        L78:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.persistance.repository.RepositoryFacade.insertMessage(io.getstream.chat.android.models.Message, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (r9.upsertMessagesInThread(r8, r0) == r1) goto L30;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object insertMessages(java.util.List<io.getstream.chat.android.models.Message> r8, q83.InterfaceC30057d<? super l83.C23454a0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194071
            if (r0 == 0) goto L13
            r0 = r9
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$insertMessages$1 r0 = (io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194071) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$insertMessages$1 r0 = new io.getstream.chat.android.client.persistance.repository.RepositoryFacade$insertMessages$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.L$0
            java.util.List r8 = (java.util.List) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L94
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.L$0
            java.util.List r8 = (java.util.List) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L86
        L41:
            java.lang.Object r8 = r0.L$0
            java.util.List r8 = (java.util.List) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L79
        L49:
            p505ts.AbstractC34132o.m107864I(r9)
            r9 = r8
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L58:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L6c
            java.lang.Object r6 = r9.next()
            io.getstream.chat.android.models.Message r6 = (io.getstream.chat.android.models.Message) r6
            java.util.List r6 = io.getstream.chat.android.client.extensions.internal.MessageKt.users(r6)
            m83.AbstractC25265s.m74141p0(r2, r6)
            goto L58
        L6c:
            r0.L$0 = r8
            r0.label = r5
            io.getstream.chat.android.client.persistance.repository.UserRepository r9 = r7.userRepository
            java.lang.Object r9 = r9.insertUsers(r2, r0)
            if (r9 != r1) goto L79
            goto L93
        L79:
            io.getstream.chat.android.client.persistance.repository.MessageRepository r9 = r7.messageRepository
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r9 = r9.insertMessages(r8, r0)
            if (r9 != r1) goto L86
            goto L93
        L86:
            io.getstream.chat.android.client.persistance.repository.ThreadsRepository r9 = r7.threadsRepository
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r8 = r9.upsertMessagesInThread(r8, r0)
            if (r8 != r1) goto L94
        L93:
            return r1
        L94:
            l83.a0 r8 = l83.C23454a0.f92919a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.persistance.repository.RepositoryFacade.insertMessages(java.util.List, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.QueryChannelsRepository
    public final Object insertQueryChannels(QueryChannelsSpec queryChannelsSpec, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.queryChannelsRepository.insertQueryChannels(queryChannelsSpec, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object insertReaction(Reaction reaction, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C194081 c194081;
        User user;
        String str;
        Reaction reaction2;
        Reaction reaction3;
        if (interfaceC30057d instanceof C194081) {
            c194081 = (C194081) interfaceC30057d;
            int i13 = c194081.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c194081.label = i13 - Integer.MIN_VALUE;
            } else {
                c194081 = new C194081(interfaceC30057d);
            }
        } else {
            c194081 = new C194081(interfaceC30057d);
        }
        Object obj = c194081.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c194081.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 != 0) {
            if (i14 == 1) {
                user = (User) c194081.L$2;
                str = (String) c194081.L$1;
                reaction2 = (Reaction) c194081.L$0;
                AbstractC34132o.m107864I(obj);
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                reaction3 = (Reaction) c194081.L$0;
                AbstractC34132o.m107864I(obj);
            }
            ReactionRepository reactionRepository = this.reactionsRepository;
            c194081.L$0 = null;
            c194081.L$1 = null;
            c194081.L$2 = null;
            c194081.label = 3;
            return reactionRepository.insertReaction(reaction3, c194081) == enumC31071a ? enumC31071a : c23454a0;
        }
        AbstractC34132o.m107864I(obj);
        String messageId = reaction.getMessageId();
        if (messageId.length() == 0) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str2 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                logger.f9274b.log(enumC2341g, str2, "[insertReaction] rejected (message id cannot be empty)", null);
                return c23454a0;
            }
        } else {
            user = reaction.getUser();
            if (user != null) {
                MessageRepository messageRepository = this.messageRepository;
                c194081.L$0 = reaction;
                c194081.L$1 = messageId;
                c194081.L$2 = user;
                c194081.label = 1;
                Object objSelectMessage = messageRepository.selectMessage(messageId, c194081);
                if (objSelectMessage != enumC31071a) {
                    str = messageId;
                    obj = objSelectMessage;
                    reaction2 = reaction;
                }
            }
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str3 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str3)) {
                logger2.f9274b.log(enumC2341g2, str3, "[insertReaction] rejected (user cannot be null)", null);
                return c23454a0;
            }
        }
        if (obj != null) {
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
            String str4 = logger3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str4)) {
                logger3.f9274b.log(enumC2341g3, str4, AbstractC31061c.m95640p("[insertReaction] reaction: ", reaction2.getType(), ", messageId: ", str), null);
            }
            c194081.L$0 = reaction2;
            c194081.L$1 = null;
            c194081.L$2 = null;
            c194081.label = 2;
            if (this.userRepository.insertUser(user, c194081) != enumC31071a) {
                reaction3 = reaction2;
                ReactionRepository reactionRepository2 = this.reactionsRepository;
                c194081.L$0 = null;
                c194081.L$1 = null;
                c194081.L$2 = null;
                c194081.label = 3;
                if (reactionRepository2.insertReaction(reaction3, c194081) == enumC31071a) {
                }
            }
        }
        C2345k logger4 = getLogger();
        InterfaceC2339e interfaceC2339e4 = logger4.f9275c;
        String str5 = logger4.f9273a;
        EnumC2341g enumC2341g4 = EnumC2341g.WARN;
        if (interfaceC2339e4.isLoggable(enumC2341g4, str5)) {
            logger4.f9274b.log(enumC2341g4, str5, "[insertReaction] rejected (message cannot be found in local DB)", null);
            return c23454a0;
        }
    }

    @Override // io.getstream.chat.android.client.persistance.repository.SyncStateRepository
    public final Object insertSyncState(SyncState syncState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.syncStateRepository.insertSyncState(syncState, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object insertThreadOrder(String str, List<String> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.threadsRepository.insertThreadOrder(str, list, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0173  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x01cc A[PHI: r14
      0x01cc: PHI (r14v6 java.util.List<io.getstream.chat.android.models.Thread>) = 
      (r14v2 java.util.List<io.getstream.chat.android.models.Thread>)
      (r14v28 java.util.List<io.getstream.chat.android.models.Thread>)
     binds: [B:52:0x01c9, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[LOOP:0: B:42:0x016d->B:62:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01a6 -> B:50:0x01a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final java.lang.Object insertThreads(java.util.List<io.getstream.chat.android.models.Thread> r14, q83.InterfaceC30057d<? super l83.C23454a0> r15) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.persistance.repository.RepositoryFacade.insertThreads(java.util.List, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final Object insertUser(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.userRepository.insertUser(user, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final Object insertUsers(Collection<User> collection, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.userRepository.insertUsers(collection, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r8.updateChannelMessage(r7, r0) == r1) goto L26;
     */
    @io.getstream.chat.android.core.internal.InternalStreamChatApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object markMessageAsDeleted(io.getstream.chat.android.models.Message r7, q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194101
            if (r0 == 0) goto L13
            r0 = r8
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$markMessageAsDeleted$1 r0 = (io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194101) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$markMessageAsDeleted$1 r0 = new io.getstream.chat.android.client.persistance.repository.RepositoryFacade$markMessageAsDeleted$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.L$0
            io.getstream.chat.android.models.Message r7 = (io.getstream.chat.android.models.Message) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L78
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.L$0
            io.getstream.chat.android.models.Message r7 = (io.getstream.chat.android.models.Message) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L6a
        L41:
            java.lang.Object r7 = r0.L$0
            io.getstream.chat.android.models.Message r7 = (io.getstream.chat.android.models.Message) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L59
        L49:
            p505ts.AbstractC34132o.m107864I(r8)
            io.getstream.chat.android.client.persistance.repository.MessageRepository r8 = r6.messageRepository
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.insertMessage(r7, r0)
            if (r8 != r1) goto L59
            goto L77
        L59:
            io.getstream.chat.android.client.persistance.repository.MessageRepository r8 = r6.messageRepository
            java.lang.String r2 = r7.getId()
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.evictMessage(r2, r0)
            if (r8 != r1) goto L6a
            goto L77
        L6a:
            io.getstream.chat.android.client.persistance.repository.ChannelRepository r8 = r6.channelsRepository
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r7 = r8.updateChannelMessage(r7, r0)
            if (r7 != r1) goto L78
        L77:
            return r1
        L78:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.persistance.repository.RepositoryFacade.markMessageAsDeleted(io.getstream.chat.android.models.Message, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final InterfaceC13037f2 observeLatestUsers() {
        return this.userRepository.observeLatestUsers();
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectAllChannelUserMessages(String str, String str2, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return this.messageRepository.selectAllChannelUserMessages(str, str2, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object selectAllCids(InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return this.channelsRepository.selectAllCids(interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectAllUserMessages(String str, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return this.messageRepository.selectAllUserMessages(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.QueryChannelsRepository
    public final Object selectBy(QueryChannelsIdentifier queryChannelsIdentifier, InterfaceC30057d<? super QueryChannelsSpec> interfaceC30057d) {
        return this.queryChannelsRepository.selectBy(queryChannelsIdentifier, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object selectChannel(String str, InterfaceC30057d<? super Channel> interfaceC30057d) {
        return this.channelsRepository.selectChannel(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object selectChannelCidsBySyncNeeded(int i13, InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return this.channelsRepository.selectChannelCidsBySyncNeeded(i13, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository
    public final ChannelConfig selectChannelConfig(String channelType) {
        AbstractC22676k.m65750j(channelType, "channelType");
        return this.configsRepository.selectChannelConfig(channelType);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object selectChannels(List<String> list, InterfaceC30057d<? super List<Channel>> interfaceC30057d) {
        return selectChannels(list, null, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object selectChannelsSyncNeeded(int i13, InterfaceC30057d<? super List<Channel>> interfaceC30057d) {
        return this.channelsRepository.selectChannelsSyncNeeded(i13, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectDraftMessageByParentId(String str, InterfaceC30057d<? super DraftMessage> interfaceC30057d) {
        return this.messageRepository.selectDraftMessageByParentId(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectDraftMessages(InterfaceC30057d<? super List<DraftMessage>> interfaceC30057d) {
        return this.messageRepository.selectDraftMessages(interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectDraftMessagesByCid(String str, InterfaceC30057d<? super DraftMessage> interfaceC30057d) {
        return this.messageRepository.selectDraftMessagesByCid(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectLocalOnlyMessagesForChannel(String str, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return this.messageRepository.selectLocalOnlyMessagesForChannel(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object selectMembersForChannel(String str, InterfaceC30057d<? super List<Member>> interfaceC30057d) {
        return this.channelsRepository.selectMembersForChannel(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessage(String str, InterfaceC30057d<? super Message> interfaceC30057d) {
        return this.messageRepository.selectMessage(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessageBySyncState(SyncStatus syncStatus, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return this.messageRepository.selectMessageBySyncState(syncStatus, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessageIdsBySyncState(SyncStatus syncStatus, InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return this.messageRepository.selectMessageIdsBySyncState(syncStatus, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessages(List<String> list, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return this.messageRepository.selectMessages(list, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessagesForChannel(String str, AnyChannelPaginationRequest anyChannelPaginationRequest, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return this.messageRepository.selectMessagesForChannel(str, anyChannelPaginationRequest, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessagesForThread(String str, int i13, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return this.messageRepository.selectMessagesForThread(str, i13, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.MessageRepository
    public final Object selectMessagesWithPoll(String str, InterfaceC30057d<? super List<Message>> interfaceC30057d) {
        return this.messageRepository.selectMessagesWithPoll(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object selectReactionById(int i13, InterfaceC30057d<? super Reaction> interfaceC30057d) {
        return this.reactionsRepository.selectReactionById(i13, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object selectReactionIdsBySyncStatus(SyncStatus syncStatus, InterfaceC30057d<? super List<Integer>> interfaceC30057d) {
        return this.reactionsRepository.selectReactionIdsBySyncStatus(syncStatus, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object selectReactionsByIds(List<Integer> list, InterfaceC30057d<? super List<Reaction>> interfaceC30057d) {
        return this.reactionsRepository.selectReactionsByIds(list, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object selectReactionsBySyncStatus(SyncStatus syncStatus, InterfaceC30057d<? super List<Reaction>> interfaceC30057d) {
        return this.reactionsRepository.selectReactionsBySyncStatus(syncStatus, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.SyncStateRepository
    public final Object selectSyncState(String str, InterfaceC30057d<? super SyncState> interfaceC30057d) {
        return this.syncStateRepository.selectSyncState(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object selectThread(String str, InterfaceC30057d<? super Thread> interfaceC30057d) {
        return this.threadsRepository.selectThread(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object selectThreadOrder(String str, InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return this.threadsRepository.selectThreadOrder(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object selectThreads(List<String> list, InterfaceC30057d<? super List<Thread>> interfaceC30057d) {
        return this.threadsRepository.selectThreads(list, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final Object selectUser(String str, InterfaceC30057d<? super User> interfaceC30057d) {
        return this.userRepository.selectUser(str, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object selectUserReactionToMessage(String str, String str2, String str3, InterfaceC30057d<? super Reaction> interfaceC30057d) {
        return this.reactionsRepository.selectUserReactionToMessage(str, str2, str3, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object selectUserReactionsToMessage(String str, String str2, InterfaceC30057d<? super List<Reaction>> interfaceC30057d) {
        return this.reactionsRepository.selectUserReactionsToMessage(str, str2, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.UserRepository
    public final Object selectUsers(List<String> list, InterfaceC30057d<? super List<User>> interfaceC30057d) {
        return this.userRepository.selectUsers(list, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object setChannelDeletedAt(String str, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.channelsRepository.setChannelDeletedAt(str, date, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r7.evictMessages(r0) == r1) goto L21;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setHiddenForChannel(java.lang.String r7, boolean r8, java.util.Date r9, q83.InterfaceC30057d<? super l83.C23454a0> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194121
            if (r0 == 0) goto L13
            r0 = r10
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$setHiddenForChannel$1 r0 = (io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194121) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$setHiddenForChannel$1 r0 = new io.getstream.chat.android.client.persistance.repository.RepositoryFacade$setHiddenForChannel$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.L$1
            java.util.Date r7 = (java.util.Date) r7
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r10)
            goto L6e
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            boolean r8 = r0.Z$0
            java.lang.Object r7 = r0.L$1
            java.util.Date r7 = (java.util.Date) r7
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r10)
            goto L5d
        L49:
            p505ts.AbstractC34132o.m107864I(r10)
            io.getstream.chat.android.client.persistance.repository.ChannelRepository r10 = r6.channelsRepository
            r0.L$0 = r5
            r0.L$1 = r5
            r0.Z$0 = r8
            r0.label = r4
            java.lang.Object r7 = r10.setHiddenForChannel(r7, r8, r9, r0)
            if (r7 != r1) goto L5d
            goto L6d
        L5d:
            io.getstream.chat.android.client.persistance.repository.MessageRepository r7 = r6.messageRepository
            r0.L$0 = r5
            r0.L$1 = r5
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r7 = r7.evictMessages(r0)
            if (r7 != r1) goto L6e
        L6d:
            return r1
        L6e:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.persistance.repository.RepositoryFacade.setHiddenForChannel(java.lang.String, boolean, java.util.Date, q83.d):java.lang.Object");
    }

    public final Object storeStateForChannel(Channel channel, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objStoreStateForChannels = storeStateForChannels(AbstractC37056f.m118958J(channel), interfaceC30057d);
        return objStoreStateForChannels == EnumC31071a.f128113w ? objStoreStateForChannels : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c6 A[LOOP:1: B:32:0x00c0->B:34:0x00c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f1 A[LOOP:2: B:36:0x00eb->B:38:0x00f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0118, code lost:
    
        if (insertMessages(r12, r0) == r1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object storeStateForChannels(java.util.Collection<io.getstream.chat.android.models.Channel> r11, q83.InterfaceC30057d<? super l83.C23454a0> r12) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.persistance.repository.RepositoryFacade.storeStateForChannels(java.util.Collection, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object updateChannelMessage(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.channelsRepository.updateChannelMessage(message, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    public final Object updateLastMessageForChannel(String str, Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.channelsRepository.updateLastMessageForChannel(str, message, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r9.updateMembersForChannel(r7, r8, r0) == r1) goto L25;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateMembersForChannel(java.lang.String r7, java.util.List<io.getstream.chat.android.models.Member> r8, q83.InterfaceC30057d<? super l83.C23454a0> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194151
            if (r0 == 0) goto L13
            r0 = r9
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$updateMembersForChannel$1 r0 = (io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194151) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$updateMembersForChannel$1 r0 = new io.getstream.chat.android.client.persistance.repository.RepositoryFacade$updateMembersForChannel$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r9)
            goto L8f
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r9)
            goto L7f
        L47:
            p505ts.AbstractC34132o.m107864I(r9)
            r9 = r8
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = m83.AbstractC25267u.m74163i0(r9, r5)
            r2.<init>(r5)
            java.util.Iterator r9 = r9.iterator()
        L5c:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L70
            java.lang.Object r5 = r9.next()
            io.getstream.chat.android.models.Member r5 = (io.getstream.chat.android.models.Member) r5
            io.getstream.chat.android.models.User r5 = r5.getUser()
            r2.add(r5)
            goto L5c
        L70:
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            io.getstream.chat.android.client.persistance.repository.UserRepository r9 = r6.userRepository
            java.lang.Object r9 = r9.insertUsers(r2, r0)
            if (r9 != r1) goto L7f
            goto L8e
        L7f:
            io.getstream.chat.android.client.persistance.repository.ChannelRepository r9 = r6.channelsRepository
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r9.updateMembersForChannel(r7, r8, r0)
            if (r7 != r1) goto L8f
        L8e:
            return r1
        L8f:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.persistance.repository.RepositoryFacade.updateMembersForChannel(java.lang.String, java.util.List, q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ReactionRepository
    public final Object updateReactionsForMessageByDeletedDate(String str, String str2, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.reactionsRepository.updateReactionsForMessageByDeletedDate(str, str2, date, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object upsertMessageInThread(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.threadsRepository.upsertMessageInThread(message, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.persistance.repository.ThreadsRepository
    public final Object upsertMessagesInThread(List<Message> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return this.threadsRepository.upsertMessagesInThread(list, interfaceC30057d);
    }

    private RepositoryFacade(UserRepository userRepository, ChannelConfigRepository channelConfigRepository, ChannelRepository channelRepository, QueryChannelsRepository queryChannelsRepository, ThreadsRepository threadsRepository, MessageRepository messageRepository, ReactionRepository reactionRepository, SyncStateRepository syncStateRepository, InterfaceC2994c0 interfaceC2994c0, Config config) {
        this.userRepository = userRepository;
        this.configsRepository = channelConfigRepository;
        this.channelsRepository = channelRepository;
        this.queryChannelsRepository = queryChannelsRepository;
        this.threadsRepository = threadsRepository;
        this.messageRepository = messageRepository;
        this.reactionsRepository = reactionRepository;
        this.syncStateRepository = syncStateRepository;
        this.scope = interfaceC2994c0;
        this.defaultConfig = config;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:RepositoryFacade");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c8 A[LOOP:0: B:34:0x00c2->B:36:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object selectChannels(List<String> list, AnyChannelPaginationRequest anyChannelPaginationRequest, InterfaceC30057d<? super List<Channel>> interfaceC30057d) {
        C194112 c194112;
        List list2;
        List list3;
        Map<String, ? extends List<Message>> map;
        ArrayList arrayList;
        Iterator it;
        if (interfaceC30057d instanceof C194112) {
            c194112 = (C194112) interfaceC30057d;
            int i13 = c194112.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c194112.label = i13 - Integer.MIN_VALUE;
            } else {
                c194112 = new C194112(interfaceC30057d);
            }
        } else {
            c194112 = new C194112(interfaceC30057d);
        }
        Object objSelectChannels = c194112.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c194112.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectChannels);
            ChannelRepository channelRepository = this.channelsRepository;
            c194112.L$0 = list;
            c194112.L$1 = anyChannelPaginationRequest;
            c194112.label = 1;
            objSelectChannels = channelRepository.selectChannels(list, c194112);
            if (objSelectChannels != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            anyChannelPaginationRequest = (AnyChannelPaginationRequest) c194112.L$1;
            list = (List) c194112.L$0;
            AbstractC34132o.m107864I(objSelectChannels);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list3 = (List) c194112.L$2;
            AbstractC34132o.m107864I(objSelectChannels);
        }
        Map<String, ? extends List<Message>> mapM74000i0 = AbstractC25247g0.m74000i0((Iterable) objSelectChannels);
        list2 = list3;
        map = mapM74000i0;
        List list4 = list2;
        arrayList = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
        it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(enrichChannel((Channel) it.next(), map, this.defaultConfig));
        }
        return arrayList;
        list2 = (List) objSelectChannels;
        if (anyChannelPaginationRequest == null || AnyChannelPaginationRequestKt.isRequestingMoreThanLastMessage(anyChannelPaginationRequest)) {
            List<String> list5 = list;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
            Iterator<T> it3 = list5.iterator();
            while (it3.hasNext()) {
                arrayList2.add(AbstractC3006f0.m8711e(this.scope, null, new RepositoryFacade$selectChannels$messagesMap$1$1((String) it3.next(), this, anyChannelPaginationRequest, null), 3));
            }
            c194112.L$0 = null;
            c194112.L$1 = null;
            c194112.L$2 = list2;
            c194112.label = 2;
            Object objM8712f = AbstractC3006f0.m8712f(arrayList2, c194112);
            if (objM8712f != enumC31071a) {
                objSelectChannels = objM8712f;
                list3 = list2;
                Map<String, ? extends List<Message>> mapM74000i1 = AbstractC25247g0.m74000i0((Iterable) objSelectChannels);
                list2 = list3;
                map = mapM74000i1;
            }
            return enumC31071a;
        }
        map = C25272z.f99163w;
        List list6 = list2;
        arrayList = new ArrayList(AbstractC25267u.m74163i0(list6, 10));
        it = list6.iterator();
        while (it.hasNext()) {
            arrayList.add(enrichChannel((Channel) it.next(), map, this.defaultConfig));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r7.evictMessages(r0) == r1) goto L21;
     */
    @Override // io.getstream.chat.android.client.persistance.repository.ChannelRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setHiddenForChannel(java.lang.String r7, boolean r8, q83.InterfaceC30057d<? super l83.C23454a0> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194132
            if (r0 == 0) goto L13
            r0 = r9
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$setHiddenForChannel$2 r0 = (io.getstream.chat.android.client.persistance.repository.RepositoryFacade.C194132) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.persistance.repository.RepositoryFacade$setHiddenForChannel$2 r0 = new io.getstream.chat.android.client.persistance.repository.RepositoryFacade$setHiddenForChannel$2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r9)
            goto L62
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            boolean r8 = r0.Z$0
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            p505ts.AbstractC34132o.m107864I(r9)
            goto L53
        L41:
            p505ts.AbstractC34132o.m107864I(r9)
            io.getstream.chat.android.client.persistance.repository.ChannelRepository r9 = r6.channelsRepository
            r0.L$0 = r3
            r0.Z$0 = r8
            r0.label = r5
            java.lang.Object r7 = r9.setHiddenForChannel(r7, r8, r0)
            if (r7 != r1) goto L53
            goto L61
        L53:
            io.getstream.chat.android.client.persistance.repository.MessageRepository r7 = r6.messageRepository
            r0.L$0 = r3
            r0.Z$0 = r8
            r0.label = r4
            java.lang.Object r7 = r7.evictMessages(r0)
            if (r7 != r1) goto L62
        L61:
            return r1
        L62:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.persistance.repository.RepositoryFacade.setHiddenForChannel(java.lang.String, boolean, q83.d):java.lang.Object");
    }
}
