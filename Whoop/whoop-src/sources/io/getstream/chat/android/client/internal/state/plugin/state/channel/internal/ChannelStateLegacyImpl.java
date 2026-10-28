package io.getstream.chat.android.client.internal.state.plugin.state.channel.internal;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.service.network.model.UserState;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import f01.C13857f;
import gf1.C15786e;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.api2.C19054d;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.client.extensions.ChannelExtensionKt;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.MemberKt;
import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.client.extensions.internal.UserKt;
import io.getstream.chat.android.client.internal.state.utils.internal.DerivedStateFlowKt;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.extensions.MessagesExtensionsKt;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Config;
import io.getstream.chat.android.models.Location;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessagesState;
import io.getstream.chat.android.models.TypingEvent;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import xb3.AbstractC38176k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\"\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0088\u00022\u00020\u0001:\u0002\u0088\u0002Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\b0\u0005\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010\u001bJ\u0015\u0010 \u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b \u0010\u001bJ\u0015\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010\u001bJ\u0015\u0010$\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0017¢\u0006\u0004\b$\u0010\u001bJ\u0015\u0010'\u001a\u00020\u00192\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J%\u0010+\u001a\u00020\u00192\u0016\u0010*\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010%0)¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00192\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00192\u0006\u00101\u001a\u00020\r¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u0017¢\u0006\u0004\b5\u0010\u001bJ\u0015\u00108\u001a\u00020\u00192\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u001d\u0010<\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0002¢\u0006\u0004\b<\u0010=J\u0015\u0010@\u001a\u00020\u00192\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AJ\u001b\u0010D\u001a\u00020\u00192\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\n¢\u0006\u0004\bD\u0010EJ#\u0010G\u001a\u00020\u00192\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0\n2\u0006\u0010F\u001a\u00020\r¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\u00192\u0006\u0010I\u001a\u00020B¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\u00020\u00192\u0006\u0010I\u001a\u00020B¢\u0006\u0004\bL\u0010KJ\u001f\u0010Q\u001a\u00020\u00192\u0006\u0010M\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\rH\u0000¢\u0006\u0004\bO\u0010PJ\u0015\u0010S\u001a\u00020\u00192\u0006\u0010R\u001a\u00020-¢\u0006\u0004\bS\u00100J\u001b\u0010U\u001a\u00020\u00192\f\u0010T\u001a\b\u0012\u0004\u0012\u00020-0\n¢\u0006\u0004\bU\u0010EJ\u0015\u0010V\u001a\u00020\u00192\u0006\u0010R\u001a\u00020-¢\u0006\u0004\bV\u00100J#\u0010X\u001a\u00020\u00192\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010N\u001a\u00020\r¢\u0006\u0004\bX\u0010HJ#\u0010Y\u001a\u00020\u00192\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010N\u001a\u00020\r¢\u0006\u0004\bY\u0010HJ\u0015\u0010Z\u001a\u00020\u00192\u0006\u0010R\u001a\u00020-¢\u0006\u0004\bZ\u00100J\u0015\u0010[\u001a\u00020\u00192\u0006\u0010M\u001a\u00020\u0006¢\u0006\u0004\b[\u0010\\J\u001b\u0010_\u001a\u00020\u00192\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\n¢\u0006\u0004\b_\u0010EJ\u0015\u0010a\u001a\u00020\u00192\u0006\u0010`\u001a\u00020]¢\u0006\u0004\ba\u0010bJ\r\u0010c\u001a\u00020\u0017¢\u0006\u0004\bc\u0010dJ\u0015\u0010g\u001a\u00020\u00192\u0006\u0010f\u001a\u00020e¢\u0006\u0004\bg\u0010hJ\u001b\u0010k\u001a\u00020\u00192\f\u0010j\u001a\b\u0012\u0004\u0012\u00020-0i¢\u0006\u0004\bk\u0010lJ\u001b\u0010m\u001a\u00020\u00192\f\u0010T\u001a\b\u0012\u0004\u0012\u00020-0\n¢\u0006\u0004\bm\u0010EJ\u001b\u0010n\u001a\u00020\u00192\f\u0010T\u001a\b\u0012\u0004\u0012\u00020-0\n¢\u0006\u0004\bn\u0010EJ\u001b\u0010o\u001a\u00020\u00192\f\u0010T\u001a\b\u0012\u0004\u0012\u00020-0i¢\u0006\u0004\bo\u0010lJ!\u0010p\u001a\u00020\u00192\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\b¢\u0006\u0004\bp\u0010qJ\u000f\u0010t\u001a\u00020\u0019H\u0000¢\u0006\u0004\br\u0010sJ\u001b\u0010v\u001a\b\u0012\u0004\u0012\u00020-0\n2\u0006\u0010u\u001a\u00020\u0002¢\u0006\u0004\bv\u0010wJ\u0019\u0010y\u001a\u0004\u0018\u00010-2\u0006\u0010x\u001a\u00020\u0002H\u0016¢\u0006\u0004\by\u0010zJ\u000f\u0010|\u001a\u00020\u0019H\u0000¢\u0006\u0004\b{\u0010sJE\u0010~\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\n0\u00052\u0012\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0i0\u00052\u0014\b\u0002\u0010}\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00170)H\u0002¢\u0006\u0004\b~\u0010\u007fJ\u001f\u0010\u0080\u0001\u001a\u00020\u00192\f\u0010T\u001a\b\u0012\u0004\u0012\u00020-0\nH\u0002¢\u0006\u0005\b\u0080\u0001\u0010EJ?\u0010\u0082\u0001\u001a\u00020\u00192+\u0010\u0081\u0001\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\b0)H\u0082\b¢\u0006\u0005\b\u0082\u0001\u0010,J\u001a\u0010\u0083\u0001\u001a\u00020\u00172\u0006\u0010R\u001a\u00020-H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0011\u0010\u0085\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u0085\u0001\u0010sJ&\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020-0i2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020-0iH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001d\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0004\u0010\u0088\u0001\u001a\u0006\b\u008b\u0001\u0010\u008a\u0001R\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u008c\u0001R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000f\n\u0005\b\u000e\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0090\u0001R\u001f\u0010\u0091\u0001\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0088\u0001\u001a\u0006\b\u0092\u0001\u0010\u008a\u0001R\u0017\u0010\u0093\u0001\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R!\u0010\u009a\u0001\u001a\u00030\u0095\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001b\u0010\u009b\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u008d\u0001R.\u0010\u009d\u0001\u001a\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\b\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R.\u0010\u009f\u0001\u001a\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\b\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009e\u0001R\"\u0010 \u0001\u001a\u000b\u0012\u0004\u0012\u00020>\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u009e\u0001R.\u0010¡\u0001\u001a\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020]0\b\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u009e\u0001R+\u0010¢\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020]0\b0\u00058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u008c\u0001R.\u0010£\u0001\u001a\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020B0\b\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u009e\u0001R.\u0010¤\u0001\u001a\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\b\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010\u009e\u0001R\"\u0010¥\u0001\u001a\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010\u009e\u0001R\"\u0010¦\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010\u009e\u0001R\"\u0010§\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010\u009e\u0001R\"\u0010¨\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010\u009e\u0001R\"\u0010©\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010\u009e\u0001R\"\u0010ª\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u009e\u0001R$\u0010«\u0001\u001a\r\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010\u009e\u0001R$\u0010¬\u0001\u001a\r\u0012\u0006\u0012\u0004\u0018\u00010-\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u009e\u0001R5\u0010®\u0001\u001a\u001e\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\u00ad\u0001\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010\u009e\u0001R\"\u0010¯\u0001\u001a\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010\u009e\u0001R\"\u0010°\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u009e\u0001R\"\u0010±\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010\u009e\u0001R\"\u0010²\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010\u009e\u0001R\"\u0010³\u0001\u001a\u000b\u0012\u0004\u0012\u000206\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010\u009e\u0001R%\u0010´\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010\u008c\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R%\u0010·\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b·\u0001\u0010\u008c\u0001\u001a\u0006\b¸\u0001\u0010¶\u0001R%\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¹\u0001\u0010\u008c\u0001\u001a\u0006\bº\u0001\u0010¶\u0001R%\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b»\u0001\u0010\u008c\u0001\u001a\u0006\b¼\u0001\u0010¶\u0001R%\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b½\u0001\u0010\u008c\u0001\u001a\u0006\b¾\u0001\u0010¶\u0001R%\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¿\u0001\u0010\u008c\u0001\u001a\u0006\bÀ\u0001\u0010¶\u0001R%\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÁ\u0001\u0010\u008c\u0001\u001a\u0006\bÂ\u0001\u0010¶\u0001R'\u0010Ã\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÃ\u0001\u0010\u008c\u0001\u001a\u0006\bÄ\u0001\u0010¶\u0001R)\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\f\u0010\u008c\u0001\u001a\u0006\bÅ\u0001\u0010¶\u0001R*\u0010Æ\u0001\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0005\bÊ\u0001\u0010hR2\u0010Ë\u0001\u001a\u0015\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\b0\u009c\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bË\u0001\u0010\u009e\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001R(\u0010Î\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\n0\u00058\u0006¢\u0006\u0010\n\u0006\bÎ\u0001\u0010\u008c\u0001\u001a\u0006\bÏ\u0001\u0010¶\u0001R(\u0010Ð\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\n0\u00058\u0006¢\u0006\u0010\n\u0006\bÐ\u0001\u0010\u008c\u0001\u001a\u0006\bÑ\u0001\u0010¶\u0001R#\u0010Ò\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\n0\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010\u008c\u0001R#\u0010Ó\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\n0\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010\u008c\u0001R&\u0010Õ\u0001\u001a\t\u0012\u0005\u0012\u00030Ô\u00010\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÕ\u0001\u0010\u008c\u0001\u001a\u0006\bÖ\u0001\u0010¶\u0001R*\u0010×\u0001\u001a\u0004\u0018\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b×\u0001\u0010Ç\u0001\u001a\u0006\bØ\u0001\u0010É\u0001\"\u0005\bÙ\u0001\u0010hR+\u0010Ú\u0001\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÚ\u0001\u0010\u0088\u0001\u001a\u0006\bÛ\u0001\u0010\u008a\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R1\u0010Þ\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\b0\u00058\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÞ\u0001\u0010\u008c\u0001\u001a\u0006\bß\u0001\u0010¶\u0001R1\u0010à\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\b0\u00058\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bà\u0001\u0010\u008c\u0001\u001a\u0006\bá\u0001\u0010¶\u0001R(\u0010â\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\n0\u00058\u0006¢\u0006\u0010\n\u0006\bâ\u0001\u0010\u008c\u0001\u001a\u0006\bã\u0001\u0010¶\u0001R(\u0010ä\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\n0\u00058\u0006¢\u0006\u0010\n\u0006\bä\u0001\u0010\u008c\u0001\u001a\u0006\bå\u0001\u0010¶\u0001R%\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b.\u0010\u008c\u0001\u001a\u0006\bæ\u0001\u0010¶\u0001R7\u0010ç\u0001\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\b0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bç\u0001\u0010\u008c\u0001\u001a\u0006\bè\u0001\u0010¶\u0001R#\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b7\u0010\u008c\u0001\u001a\u0006\bé\u0001\u0010¶\u0001R)\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\n0\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bT\u0010\u008c\u0001\u001a\u0006\bê\u0001\u0010¶\u0001R+\u0010ë\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\n0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bë\u0001\u0010\u008c\u0001\u001a\u0006\bì\u0001\u0010¶\u0001R%\u0010í\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bí\u0001\u0010\u008c\u0001\u001a\u0006\bî\u0001\u0010¶\u0001R)\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bW\u0010\u008c\u0001\u001a\u0006\bï\u0001\u0010¶\u0001R%\u0010ð\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bð\u0001\u0010\u008c\u0001\u001a\u0006\bñ\u0001\u0010¶\u0001R)\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\n0\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b^\u0010\u008c\u0001\u001a\u0006\bò\u0001\u0010¶\u0001R%\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b`\u0010\u008c\u0001\u001a\u0006\bó\u0001\u0010¶\u0001R%\u0010ô\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bô\u0001\u0010\u008c\u0001\u001a\u0006\bõ\u0001\u0010¶\u0001R)\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\n0\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bC\u0010\u008c\u0001\u001a\u0006\bö\u0001\u0010¶\u0001R#\u0010F\u001a\b\u0012\u0004\u0012\u00020\r0\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bF\u0010\u008c\u0001\u001a\u0006\b÷\u0001\u0010¶\u0001R#\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00058\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b&\u0010\u008c\u0001\u001a\u0006\bø\u0001\u0010¶\u0001R'\u0010ù\u0001\u001a\u00020\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\bù\u0001\u0010ú\u0001\u001a\u0005\bû\u0001\u0010d\"\u0005\bü\u0001\u0010\u001bR%\u0010ý\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bý\u0001\u0010\u008c\u0001\u001a\u0006\bþ\u0001\u0010¶\u0001R'\u0010ÿ\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010e0\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÿ\u0001\u0010\u008c\u0001\u001a\u0006\b\u0080\u0002\u0010¶\u0001R \u0010\u0083\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\b8F¢\u0006\b\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002R\u001e\u0010\u0087\u0002\u001a\t\u0012\u0004\u0012\u00020\u00020\u0084\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002¨\u0006\u0089\u0002"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "", "channelType", "channelId", "Lec3/f2;", "Lio/getstream/chat/android/models/User;", "userFlow", "", "latestUsers", "", "Lio/getstream/chat/android/models/Location;", "activeLiveLocations", "", "baseMessageLimit", "Lkotlin/Function0;", "", "now", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Ljava/lang/Integer;Lc93/a;)V", "Lio/getstream/chat/android/models/Channel;", "toChannel", "()Lio/getstream/chat/android/models/Channel;", "", "isLoading", "Ll83/a0;", "setLoadingOlderMessages", "(Z)V", "setLoadingNewerMessages", "isEnd", "setEndOfNewerMessages", "setEndOfOlderMessages", "setLoading", "isHidden", "setHidden", "isMuted", "setMuted", "Lio/getstream/chat/android/models/ChannelData;", "channelData", "setChannelData", "(Lio/getstream/chat/android/models/ChannelData;)V", "Lkotlin/Function1;", "update", "updateChannelData", "(Lkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/models/Message;", "repliedMessage", "setRepliedMessage", "(Lio/getstream/chat/android/models/Message;)V", "count", "setMembersCount", "(I)V", "isInsideSearch", "setInsideSearch", "Lio/getstream/chat/android/models/Config;", "channelConfig", "setChannelConfig", "(Lio/getstream/chat/android/models/Config;)V", "quotedMessageId", "quotingMessageId", "addQuotedMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/getstream/chat/android/models/TypingEvent;", "typingEvent", "updateTypingEvent", "(Lio/getstream/chat/android/models/TypingEvent;)V", "Lio/getstream/chat/android/models/Member;", QueryChannelRequest.KEY_MEMBERS, "upsertMembers", "(Ljava/util/List;)V", "membersCount", "setMembers", "(Ljava/util/List;I)V", "member", "addMember", "(Lio/getstream/chat/android/models/Member;)V", "deleteMember", UserState.Sources.USER, "watchersCount", "deleteWatcher$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/User;I)V", "deleteWatcher", "message", "deleteMessage", "messages", "deleteMessages", "deletePinnedMessage", "watchers", "upsertWatchers", "setWatchers", "upsertMessage", "upsertUserPresence", "(Lio/getstream/chat/android/models/User;)V", "Lio/getstream/chat/android/models/ChannelUserRead;", "reads", "upsertReads", "read", "upsertDelivered", "(Lio/getstream/chat/android/models/ChannelUserRead;)V", "markChannelAsRead", "()Z", "Ljava/util/Date;", HttpHeaders.DATE, "removeMessagesBefore", "(Ljava/util/Date;)V", "", "updatedMessages", "upsertMessages", "(Ljava/util/Collection;)V", "setMessages", "setPinnedMessages", "upsertPinnedMessages", "updateCachedLatestMessages", "(Ljava/util/Map;)V", "resetMessageLimit$stream_chat_android_client_release", "()V", "resetMessageLimit", "userId", "getMessagesFromUser", "(Ljava/lang/String;)Ljava/util/List;", "id", "getMessageById", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;", "destroy$stream_chat_android_client_release", "destroy", "extraPredicate", "messagesTransformation", "(Lec3/f2;Lkotlin/jvm/functions/Function1;)Lec3/f2;", "deletePinnedMessages", "producer", "setPinned", "isMessageVisible", "(Lio/getstream/chat/android/models/Message;)Z", "cacheLatestMessages", "applyMessageLimitIfNeeded", "(Ljava/util/Collection;)Ljava/util/Collection;", "Ljava/lang/String;", "getChannelType", "()Ljava/lang/String;", "getChannelId", "Lec3/f2;", "Ljava/lang/Integer;", "getBaseMessageLimit", "()Ljava/lang/Integer;", "Lc93/a;", "cid", "getCid", "seq", "I", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "messageLimit", "Lec3/p1;", "_messages", "Lec3/p1;", "_pinnedMessages", "_typing", "_rawReads", "rawReads", "_members", "_watchers", "_watcherCount", "_endOfNewerMessages", "_endOfOlderMessages", "_loading", "_hidden", "_muted", "_channelData", "_repliedMessage", "", "_quotedMessagesMap", "_membersCount", "_insideSearch", "_loadingOlderMessages", "_loadingNewerMessages", "_channelConfig", "hidden", "getHidden", "()Lec3/f2;", "muted", "getMuted", "loading", "getLoading", "loadingOlderMessages", "getLoadingOlderMessages", "loadingNewerMessages", "getLoadingNewerMessages", "endOfOlderMessages", "getEndOfOlderMessages", "endOfNewerMessages", "getEndOfNewerMessages", "messageCount", "getMessageCount", "getActiveLiveLocations", "hideMessagesBefore", "Ljava/util/Date;", "getHideMessagesBefore", "()Ljava/util/Date;", "setHideMessagesBefore", "cachedLatestMessages", "getCachedLatestMessages$stream_chat_android_client_release", "()Lec3/p1;", "messageList", "getMessageList", "pinnedMessagesList", "getPinnedMessagesList", "sortedVisibleMessages", "sortedVisiblePinnedMessages", "Lio/getstream/chat/android/models/MessagesState;", "messagesState", "getMessagesState", "lastStartTypingEvent", "getLastStartTypingEvent", "setLastStartTypingEvent", "keystrokeParentMessageId", "getKeystrokeParentMessageId$stream_chat_android_client_release", "setKeystrokeParentMessageId$stream_chat_android_client_release", "(Ljava/lang/String;)V", "visibleMessages", "getVisibleMessages$stream_chat_android_client_release", "visiblePinnedMessages", "getVisiblePinnedMessages$stream_chat_android_client_release", "sortedMessages", "getSortedMessages", "sortedPinnedMessages", "getSortedPinnedMessages", "getRepliedMessage", "quotedMessagesMap", "getQuotedMessagesMap", "getChannelConfig", "getMessages", "pinnedMessages", "getPinnedMessages", "watcherCount", "getWatcherCount", "getWatchers", "typing", "getTyping", "getReads", "getRead", "unreadCount", "getUnreadCount", "getMembers", "getMembersCount", "getChannelData", "recoveryNeeded", "Z", "getRecoveryNeeded", "setRecoveryNeeded", "insideSearch", "getInsideSearch", "lastSentMessageDate", "getLastSentMessageDate", "getRawPinnedMessages", "()Ljava/util/Map;", "rawPinnedMessages", "", "getDeletedMessagesIds", "()Ljava/util/Set;", "deletedMessagesIds", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelStateLegacyImpl implements ChannelState {
    private static final double LIMIT_MULTIPLIER = 1.5d;
    private static final double NEUTRAL_MULTIPLIER = 1.0d;
    private static final int TRIM_BUFFER = 30;
    private InterfaceC13075p1 _channelConfig;
    private InterfaceC13075p1 _channelData;
    private InterfaceC13075p1 _endOfNewerMessages;
    private InterfaceC13075p1 _endOfOlderMessages;
    private InterfaceC13075p1 _hidden;
    private InterfaceC13075p1 _insideSearch;
    private InterfaceC13075p1 _loading;
    private InterfaceC13075p1 _loadingNewerMessages;
    private InterfaceC13075p1 _loadingOlderMessages;
    private InterfaceC13075p1 _members;
    private InterfaceC13075p1 _membersCount;
    private InterfaceC13075p1 _messages;
    private InterfaceC13075p1 _muted;
    private InterfaceC13075p1 _pinnedMessages;
    private InterfaceC13075p1 _quotedMessagesMap;
    private InterfaceC13075p1 _rawReads;
    private InterfaceC13075p1 _repliedMessage;
    private InterfaceC13075p1 _typing;
    private InterfaceC13075p1 _watcherCount;
    private InterfaceC13075p1 _watchers;
    private final InterfaceC13037f2 activeLiveLocations;
    private final Integer baseMessageLimit;
    private final InterfaceC13075p1 cachedLatestMessages;
    private final InterfaceC13037f2 channelConfig;
    private final InterfaceC13037f2 channelData;
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final InterfaceC13037f2 endOfNewerMessages;
    private final InterfaceC13037f2 endOfOlderMessages;
    private final InterfaceC13037f2 hidden;
    private Date hideMessagesBefore;
    private final InterfaceC13037f2 insideSearch;
    private String keystrokeParentMessageId;
    private final InterfaceC13037f2 lastSentMessageDate;
    private Date lastStartTypingEvent;
    private final InterfaceC13037f2 loading;
    private final InterfaceC13037f2 loadingNewerMessages;
    private final InterfaceC13037f2 loadingOlderMessages;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC13037f2 members;
    private final InterfaceC13037f2 membersCount;
    private final InterfaceC13037f2 messageCount;
    private Integer messageLimit;
    private final InterfaceC13037f2 messageList;
    private final InterfaceC13037f2 messages;
    private final InterfaceC13037f2 messagesState;
    private final InterfaceC13037f2 muted;
    private final InterfaceC4339a now;
    private final InterfaceC13037f2 pinnedMessages;
    private final InterfaceC13037f2 pinnedMessagesList;
    private final InterfaceC13037f2 quotedMessagesMap;
    private InterfaceC13037f2 rawReads;
    private final InterfaceC13037f2 read;
    private final InterfaceC13037f2 reads;
    private boolean recoveryNeeded;
    private final InterfaceC13037f2 repliedMessage;
    private final int seq;
    private final InterfaceC13037f2 sortedMessages;
    private final InterfaceC13037f2 sortedPinnedMessages;
    private final InterfaceC13037f2 sortedVisibleMessages;
    private final InterfaceC13037f2 sortedVisiblePinnedMessages;
    private final InterfaceC13037f2 typing;
    private final InterfaceC13037f2 unreadCount;
    private final InterfaceC13037f2 userFlow;
    private final InterfaceC13037f2 visibleMessages;
    private final InterfaceC13037f2 visiblePinnedMessages;
    private final InterfaceC13037f2 watcherCount;
    private final InterfaceC13037f2 watchers;
    private static final Companion Companion = new Companion();
    private static final AtomicInteger seqGenerator = new AtomicInteger();

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl$Companion;", "", "<init>", "()V", "seqGenerator", "Ljava/util/concurrent/atomic/AtomicInteger;", "TRIM_BUFFER", "", "NEUTRAL_MULTIPLIER", "", "LIMIT_MULTIPLIER", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ChannelStateLegacyImpl(String channelType, String channelId, InterfaceC13037f2 userFlow, InterfaceC13037f2 latestUsers, InterfaceC13037f2 activeLiveLocations, Integer num, InterfaceC4339a now) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(userFlow, "userFlow");
        AbstractC22676k.m65750j(latestUsers, "latestUsers");
        AbstractC22676k.m65750j(activeLiveLocations, "activeLiveLocations");
        AbstractC22676k.m65750j(now, "now");
        this.channelType = channelType;
        this.channelId = channelId;
        this.userFlow = userFlow;
        this.baseMessageLimit = num;
        this.now = now;
        this.cid = String.format("%s:%s", Arrays.copyOf(new Object[]{channelType, channelId}, 2));
        int iIncrementAndGet = seqGenerator.incrementAndGet();
        this.seq = iIncrementAndGet;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:ChannelState-" + iIncrementAndGet);
        this.messageLimit = num;
        C25272z c25272z = C25272z.f99163w;
        this._messages = AbstractC13091v.m36593c(c25272z);
        this._pinnedMessages = AbstractC13091v.m36593c(c25272z);
        this._typing = AbstractC13091v.m36593c(new TypingEvent(channelId, C25271y.f99162w));
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(c25272z);
        this._rawReads = c13045h2M36593c;
        this.rawReads = c13045h2M36593c;
        this._members = AbstractC13091v.m36593c(c25272z);
        this._watchers = AbstractC13091v.m36593c(c25272z);
        this._watcherCount = AbstractC13091v.m36593c(0);
        this._endOfNewerMessages = AbstractC13091v.m36593c(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        this._endOfOlderMessages = AbstractC13091v.m36593c(bool);
        this._loading = AbstractC13091v.m36593c(bool);
        this._hidden = AbstractC13091v.m36593c(bool);
        this._muted = AbstractC13091v.m36593c(bool);
        this._channelData = AbstractC13091v.m36593c(null);
        this._repliedMessage = AbstractC13091v.m36593c(null);
        this._quotedMessagesMap = AbstractC13091v.m36593c(new LinkedHashMap());
        this._membersCount = AbstractC13091v.m36593c(0);
        this._insideSearch = AbstractC13091v.m36593c(bool);
        this._loadingOlderMessages = AbstractC13091v.m36593c(bool);
        this._loadingNewerMessages = AbstractC13091v.m36593c(bool);
        this._channelConfig = AbstractC13091v.m36593c(new Config(null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, 0, null, null, null, null, false, false, false, 67108863, null));
        InterfaceC13075p1 interfaceC13075p1 = this._hidden;
        AbstractC22676k.m65747g(interfaceC13075p1);
        this.hidden = interfaceC13075p1;
        InterfaceC13075p1 interfaceC13075p2 = this._muted;
        AbstractC22676k.m65747g(interfaceC13075p2);
        this.muted = interfaceC13075p2;
        InterfaceC13075p1 interfaceC13075p3 = this._loading;
        AbstractC22676k.m65747g(interfaceC13075p3);
        this.loading = interfaceC13075p3;
        InterfaceC13075p1 interfaceC13075p4 = this._loadingOlderMessages;
        AbstractC22676k.m65747g(interfaceC13075p4);
        this.loadingOlderMessages = interfaceC13075p4;
        InterfaceC13075p1 interfaceC13075p5 = this._loadingNewerMessages;
        AbstractC22676k.m65747g(interfaceC13075p5);
        this.loadingNewerMessages = interfaceC13075p5;
        InterfaceC13075p1 interfaceC13075p6 = this._endOfOlderMessages;
        AbstractC22676k.m65747g(interfaceC13075p6);
        this.endOfOlderMessages = interfaceC13075p6;
        InterfaceC13075p1 interfaceC13075p7 = this._endOfNewerMessages;
        AbstractC22676k.m65747g(interfaceC13075p7);
        this.endOfNewerMessages = interfaceC13075p7;
        InterfaceC13075p1 interfaceC13075p8 = this._channelData;
        AbstractC22676k.m65747g(interfaceC13075p8);
        this.messageCount = DerivedStateFlowKt.mapState(interfaceC13075p8, new C19336c(4));
        final int i13 = 0;
        this.activeLiveLocations = DerivedStateFlowKt.mapState(activeLiveLocations, new Function1(this) { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelStateLegacyImpl f73911x;

            {
                this.f73911x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return ChannelStateLegacyImpl.m54850m(this.f73911x, (List) obj);
                    case 1:
                        return Boolean.valueOf(ChannelStateLegacyImpl.sortedVisiblePinnedMessages$lambda$9(this.f73911x, (Message) obj));
                    case 2:
                        return ChannelStateLegacyImpl.m54851n(this.f73911x, (List) obj);
                    default:
                        return ChannelStateLegacyImpl.m54840c(this.f73911x, (List) obj);
                }
            }
        });
        this.cachedLatestMessages = AbstractC13091v.m36593c(c25272z);
        InterfaceC13075p1 interfaceC13075p9 = this._messages;
        AbstractC22676k.m65747g(interfaceC13075p9);
        InterfaceC13037f2 interfaceC13037f2CombineStates = DerivedStateFlowKt.combineStates(interfaceC13075p9, latestUsers, new C19054d(14));
        this.messageList = interfaceC13037f2CombineStates;
        InterfaceC13075p1 interfaceC13075p10 = this._pinnedMessages;
        AbstractC22676k.m65747g(interfaceC13075p10);
        final int i14 = 1;
        InterfaceC13037f2 interfaceC13037f2CombineStates2 = DerivedStateFlowKt.combineStates(interfaceC13075p10, latestUsers, new InterfaceC4351m(this) { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelStateLegacyImpl f73909x;

            {
                this.f73909x = this;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i14) {
                    case 0:
                        return ChannelStateLegacyImpl.channelData$lambda$36(this.f73909x, (ChannelData) obj, (Map) obj2);
                    default:
                        return ChannelStateLegacyImpl.m54854q(this.f73909x, (Map) obj, (Map) obj2);
                }
            }
        });
        this.pinnedMessagesList = interfaceC13037f2CombineStates2;
        InterfaceC13037f2 interfaceC13037f2MessagesTransformation$default = messagesTransformation$default(this, interfaceC13037f2CombineStates, null, 2, null);
        this.sortedVisibleMessages = interfaceC13037f2MessagesTransformation$default;
        final int i15 = 1;
        InterfaceC13037f2 interfaceC13037f2MessagesTransformation = messagesTransformation(interfaceC13037f2CombineStates2, new Function1(this) { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelStateLegacyImpl f73911x;

            {
                this.f73911x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return ChannelStateLegacyImpl.m54850m(this.f73911x, (List) obj);
                    case 1:
                        return Boolean.valueOf(ChannelStateLegacyImpl.sortedVisiblePinnedMessages$lambda$9(this.f73911x, (Message) obj));
                    case 2:
                        return ChannelStateLegacyImpl.m54851n(this.f73911x, (List) obj);
                    default:
                        return ChannelStateLegacyImpl.m54840c(this.f73911x, (List) obj);
                }
            }
        });
        this.sortedVisiblePinnedMessages = interfaceC13037f2MessagesTransformation;
        this.messagesState = DerivedStateFlowKt.combineStates(interfaceC13075p3, interfaceC13037f2MessagesTransformation$default, new C19054d(15));
        final int i16 = 2;
        InterfaceC13037f2 interfaceC13037f2MapState = DerivedStateFlowKt.mapState(interfaceC13037f2CombineStates, new Function1(this) { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelStateLegacyImpl f73911x;

            {
                this.f73911x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        return ChannelStateLegacyImpl.m54850m(this.f73911x, (List) obj);
                    case 1:
                        return Boolean.valueOf(ChannelStateLegacyImpl.sortedVisiblePinnedMessages$lambda$9(this.f73911x, (Message) obj));
                    case 2:
                        return ChannelStateLegacyImpl.m54851n(this.f73911x, (List) obj);
                    default:
                        return ChannelStateLegacyImpl.m54840c(this.f73911x, (List) obj);
                }
            }
        });
        this.visibleMessages = interfaceC13037f2MapState;
        final int i17 = 3;
        InterfaceC13037f2 interfaceC13037f2MapState2 = DerivedStateFlowKt.mapState(interfaceC13037f2CombineStates2, new Function1(this) { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelStateLegacyImpl f73911x;

            {
                this.f73911x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        return ChannelStateLegacyImpl.m54850m(this.f73911x, (List) obj);
                    case 1:
                        return Boolean.valueOf(ChannelStateLegacyImpl.sortedVisiblePinnedMessages$lambda$9(this.f73911x, (Message) obj));
                    case 2:
                        return ChannelStateLegacyImpl.m54851n(this.f73911x, (List) obj);
                    default:
                        return ChannelStateLegacyImpl.m54840c(this.f73911x, (List) obj);
                }
            }
        });
        this.visiblePinnedMessages = interfaceC13037f2MapState2;
        this.sortedMessages = DerivedStateFlowKt.mapState(interfaceC13037f2MapState, new C19336c(2));
        this.sortedPinnedMessages = DerivedStateFlowKt.mapState(interfaceC13037f2MapState2, new C19336c(3));
        InterfaceC13075p1 interfaceC13075p11 = this._repliedMessage;
        AbstractC22676k.m65747g(interfaceC13075p11);
        this.repliedMessage = interfaceC13075p11;
        InterfaceC13075p1 interfaceC13075p12 = this._quotedMessagesMap;
        AbstractC22676k.m65747g(interfaceC13075p12);
        this.quotedMessagesMap = interfaceC13075p12;
        InterfaceC13075p1 interfaceC13075p13 = this._channelConfig;
        AbstractC22676k.m65747g(interfaceC13075p13);
        this.channelConfig = interfaceC13075p13;
        this.messages = interfaceC13037f2MessagesTransformation$default;
        this.pinnedMessages = interfaceC13037f2MessagesTransformation;
        InterfaceC13075p1 interfaceC13075p14 = this._watcherCount;
        AbstractC22676k.m65747g(interfaceC13075p14);
        this.watcherCount = interfaceC13075p14;
        InterfaceC13075p1 interfaceC13075p15 = this._watchers;
        AbstractC22676k.m65747g(interfaceC13075p15);
        this.watchers = DerivedStateFlowKt.mapState(DerivedStateFlowKt.combineStates(interfaceC13075p15, latestUsers, new C19054d(16)), new C19336c(5));
        InterfaceC13075p1 interfaceC13075p16 = this._typing;
        AbstractC22676k.m65747g(interfaceC13075p16);
        this.typing = interfaceC13075p16;
        this.reads = DerivedStateFlowKt.mapState(this.rawReads, new C19336c(6));
        InterfaceC13037f2 interfaceC13037f2CombineStates3 = DerivedStateFlowKt.combineStates(this.rawReads, userFlow, new C19054d(17));
        this.read = interfaceC13037f2CombineStates3;
        this.unreadCount = DerivedStateFlowKt.mapState(interfaceC13037f2CombineStates3, new C19336c(7));
        InterfaceC13075p1 interfaceC13075p17 = this._members;
        AbstractC22676k.m65747g(interfaceC13075p17);
        final int i18 = 0;
        this.members = DerivedStateFlowKt.mapState(DerivedStateFlowKt.combineStates(interfaceC13075p17, latestUsers, new C19054d(13)), new C19336c(i18));
        InterfaceC13075p1 interfaceC13075p18 = this._membersCount;
        AbstractC22676k.m65747g(interfaceC13075p18);
        this.membersCount = interfaceC13075p18;
        InterfaceC13075p1 interfaceC13075p19 = this._channelData;
        AbstractC22676k.m65747g(interfaceC13075p19);
        this.channelData = DerivedStateFlowKt.combineStates(interfaceC13075p19, latestUsers, new InterfaceC4351m(this) { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChannelStateLegacyImpl f73909x;

            {
                this.f73909x = this;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                switch (i18) {
                    case 0:
                        return ChannelStateLegacyImpl.channelData$lambda$36(this.f73909x, (ChannelData) obj, (Map) obj2);
                    default:
                        return ChannelStateLegacyImpl.m54854q(this.f73909x, (Map) obj, (Map) obj2);
                }
            }
        });
        InterfaceC13075p1 interfaceC13075p20 = this._insideSearch;
        AbstractC22676k.m65747g(interfaceC13075p20);
        this.insideSearch = interfaceC13075p20;
        this.lastSentMessageDate = DerivedStateFlowKt.combineStates(userFlow, interfaceC13075p13, interfaceC13037f2MessagesTransformation$default, new C15786e(13));
    }

    private static final List activeLiveLocations$lambda$4(ChannelStateLegacyImpl channelStateLegacyImpl, List locations) {
        AbstractC22676k.m65750j(locations, "locations");
        ArrayList arrayList = new ArrayList();
        for (Object obj : locations) {
            if (AbstractC22676k.m65745e(((Location) obj).getCid(), channelStateLegacyImpl.cid)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final Collection<Message> applyMessageLimitIfNeeded(Collection<Message> messages) {
        if (this.messageLimit == null || ((Boolean) this.loadingOlderMessages.getValue()).booleanValue()) {
            return messages;
        }
        int size = messages.size();
        Integer num = this.messageLimit;
        AbstractC22676k.m65747g(num);
        if (size <= num.intValue() + 30) {
            return messages;
        }
        List listM74152u1 = AbstractC25265s.m74152u1(messages, new C19330xe68a46e1());
        Integer num2 = this.messageLimit;
        AbstractC22676k.m65747g(num2);
        List listM74158x1 = AbstractC25265s.m74158x1(num2.intValue(), listM74152u1);
        setEndOfOlderMessages(false);
        return listM74158x1;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ LinkedHashMap m54840c(ChannelStateLegacyImpl channelStateLegacyImpl, List list) {
        return (LinkedHashMap) visiblePinnedMessages$lambda$20(channelStateLegacyImpl, list);
    }

    private final void cacheLatestMessages() {
        InterfaceC13075p1 interfaceC13075p1 = this.cachedLatestMessages;
        Iterable iterable = (Iterable) this.sortedMessages.getValue();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(iterable, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : iterable) {
            linkedHashMap.put(((Message) obj).getId(), obj);
        }
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData channelData$lambda$36(ChannelStateLegacyImpl channelStateLegacyImpl, ChannelData channelData, Map users) {
        AbstractC22676k.m65750j(users, "users");
        if (channelData != null) {
            if (!users.containsKey(channelData.getCreatedBy().getId())) {
                return channelData;
            }
            User createdBy = (User) users.get(channelData.getCreatedBy().getId());
            if (createdBy == null) {
                createdBy = channelData.getCreatedBy();
            }
            return ChannelData.copy$default(channelData, null, null, null, null, createdBy, 0, false, null, null, null, 0, null, null, null, null, null, null, null, null, null, 1048559, null);
        }
        return new ChannelData(channelStateLegacyImpl.channelId, channelStateLegacyImpl.channelType, null, null, null, 0, false, null, null, null, 0, null, null, null, null, null, null, null, null, null, 1048572, null);
    }

    private final void deletePinnedMessages(List<Message> messages) {
        Date pinExpires;
        List<Message> list = messages;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Message) it.next()).getId());
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[deletePinnedMessages] messages.ids: " + setM74103I1, null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._pinnedMessages;
        Map map = interfaceC13075p1 != null ? (Map) ((C13045h2) interfaceC13075p1).getValue() : null;
        if (map == null) {
            return;
        }
        Map mapM73992a0 = AbstractC25247g0.m73992a0(map, setM74103I1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM73992a0.entrySet()) {
            Message message = (Message) entry.getValue();
            InterfaceC4339a interfaceC4339a = this.now;
            if (message.getPinned() && !MessageUtils.isDeleted(message) && ((pinExpires = message.getPinExpires()) == null || pinExpires.getTime() >= ((Number) interfaceC4339a.invoke()).longValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8294g(map.size(), linkedHashMap.size(), "[setPinned] pinned.size: ", " => "), null);
        }
        InterfaceC13075p1 interfaceC13075p2 = this._pinnedMessages;
        if (interfaceC13075p2 != null) {
            ((C13045h2) interfaceC13075p2).m36571k(null, linkedHashMap);
        }
    }

    private final Set<String> getDeletedMessagesIds() {
        Map map;
        Collection<Message> collectionValues;
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        if (interfaceC13075p1 == null || (map = (Map) ((C13045h2) interfaceC13075p1).getValue()) == null || (collectionValues = map.values()) == null) {
            return C25235a0.f99113w;
        }
        ArrayList arrayList = new ArrayList();
        for (Message message : collectionValues) {
            if (!MessageUtils.isDeleted(message)) {
                message = null;
            }
            String id4 = message != null ? message.getId() : null;
            if (id4 != null) {
                arrayList.add(id4);
            }
        }
        return AbstractC25265s.m74103I1(arrayList);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMessageVisible(Message message) {
        Date date = this.hideMessagesBefore;
        return date == null || MessageKt.wasCreatedAfter(message, date);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ ArrayList m54848k(Map map, Map map2) {
        return (ArrayList) members$lambda$33(map, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date lastSentMessageDate$lambda$39(User user, Config config, List messages) {
        String id4;
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(messages, "messages");
        if (user == null || (id4 = user.getId()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : messages) {
            if (AbstractC22676k.m65745e(((Message) obj).getUser().getId(), id4)) {
                arrayList.add(obj);
            }
        }
        return MessagesExtensionsKt.lastMessageAt(arrayList, config.getSkipLastMsgUpdateForSystemMsgs());
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ ArrayList m54850m(ChannelStateLegacyImpl channelStateLegacyImpl, List list) {
        return (ArrayList) activeLiveLocations$lambda$4(channelStateLegacyImpl, list);
    }

    private static final Collection members$lambda$33(Map membersMap, Map usersMap) {
        AbstractC22676k.m65750j(membersMap, "membersMap");
        AbstractC22676k.m65750j(usersMap, "usersMap");
        return MemberKt.updateUsers(membersMap.values(), usersMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List members$lambda$35(Collection it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC25265s.m74152u1(it, new ChannelStateLegacyImpl$members$lambda$35$$inlined$sortedBy$1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer messageCount$lambda$2(ChannelData channelData) {
        if (channelData != null) {
            return channelData.getMessageCount();
        }
        return null;
    }

    private static final List messageList$lambda$5(Map messageMap, Map userMap) {
        AbstractC22676k.m65750j(messageMap, "messageMap");
        AbstractC22676k.m65750j(userMap, "userMap");
        return MessageKt.updateUsers((Collection<Message>) messageMap.values(), (Map<String, User>) userMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessagesState messagesState$lambda$10(boolean z4, List messages) {
        AbstractC22676k.m65750j(messages, "messages");
        if (z4) {
            return MessagesState.Loading.INSTANCE;
        }
        return messages.isEmpty() ? MessagesState.OfflineNoResults.INSTANCE : new MessagesState.Result(messages);
    }

    private final InterfaceC13037f2 messagesTransformation(InterfaceC13037f2 messages, Function1 extraPredicate) {
        return DerivedStateFlowKt.combineStates(messages, this.userFlow, new C13857f(28, this, extraPredicate));
    }

    public static /* synthetic */ InterfaceC13037f2 messagesTransformation$default(ChannelStateLegacyImpl channelStateLegacyImpl, InterfaceC13037f2 interfaceC13037f2, Function1 function1, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            function1 = new C19031a(29);
        }
        return channelStateLegacyImpl.messagesTransformation(interfaceC13037f2, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean messagesTransformation$lambda$11(Message it) {
        AbstractC22676k.m65750j(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List messagesTransformation$lambda$15(ChannelStateLegacyImpl channelStateLegacyImpl, Function1 function1, Collection messageCollection, User user) {
        AbstractC22676k.m65750j(messageCollection, "messageCollection");
        return AbstractC38176k.m122276E(AbstractC38176k.m122274C(AbstractC38176k.m122282r(AbstractC38176k.m122282r(AbstractC38176k.m122282r(AbstractC38176k.m122282r(AbstractC25265s.m74145r0(messageCollection), new C19336c(1)), new C19339f(user, 0)), new ChannelStateLegacyImpl$messagesTransformation$2$3(channelStateLegacyImpl)), function1), new C19331xb8ad2ef9()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean messagesTransformation$lambda$15$lambda$12(Message it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getParentId() == null || it.getShowInChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean messagesTransformation$lambda$15$lambda$13(User user, Message it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC22676k.m65745e(it.getUser().getId(), user != null ? user.getId() : null) || !it.getShadowed();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ LinkedHashMap m54851n(ChannelStateLegacyImpl channelStateLegacyImpl, List list) {
        return (LinkedHashMap) visibleMessages$lambda$17(channelStateLegacyImpl, list);
    }

    private static final List pinnedMessagesList$lambda$7(ChannelStateLegacyImpl channelStateLegacyImpl, Map pinnedMessagesMap, Map userMap) {
        Date pinExpires;
        AbstractC22676k.m65750j(pinnedMessagesMap, "pinnedMessagesMap");
        AbstractC22676k.m65750j(userMap, "userMap");
        Collection collectionValues = pinnedMessagesMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            Message message = (Message) obj;
            InterfaceC4339a interfaceC4339a = channelStateLegacyImpl.now;
            if (message.getPinned() && !MessageUtils.isDeleted(message) && ((pinExpires = message.getPinExpires()) == null || pinExpires.getTime() >= ((Number) interfaceC4339a.invoke()).longValue())) {
                arrayList.add(obj);
            }
        }
        return MessageKt.updateUsers(arrayList, (Map<String, User>) userMap);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ ArrayList m54854q(ChannelStateLegacyImpl channelStateLegacyImpl, Map map, Map map2) {
        return (ArrayList) pinnedMessagesList$lambda$7(channelStateLegacyImpl, map, map2);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ ArrayList m54855r(Map map, Map map2) {
        return (ArrayList) watchers$lambda$25(map, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelUserRead read$lambda$31(Map readsMap, User user) {
        String id4;
        AbstractC22676k.m65750j(readsMap, "readsMap");
        if (user == null || (id4 = user.getId()) == null) {
            return null;
        }
        return (ChannelUserRead) readsMap.get(id4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List reads$lambda$29(Map it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC25265s.m74152u1(it.values(), new ChannelStateLegacyImpl$reads$lambda$29$$inlined$sortedBy$1());
    }

    private final void setPinned(Function1 producer) {
        Date pinExpires;
        InterfaceC13075p1 interfaceC13075p1 = this._pinnedMessages;
        Map map = interfaceC13075p1 != null ? (Map) ((C13045h2) interfaceC13075p1).getValue() : null;
        if (map == null) {
            return;
        }
        Map map2 = (Map) producer.invoke(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map2.entrySet()) {
            Message message = (Message) entry.getValue();
            InterfaceC4339a interfaceC4339a = this.now;
            if (message.getPinned() && !MessageUtils.isDeleted(message) && ((pinExpires = message.getPinExpires()) == null || pinExpires.getTime() >= ((Number) interfaceC4339a.invoke()).longValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8294g(map.size(), linkedHashMap.size(), "[setPinned] pinned.size: ", " => "), null);
        }
        InterfaceC13075p1 interfaceC13075p2 = this._pinnedMessages;
        if (interfaceC13075p2 != null) {
            ((C13045h2) interfaceC13075p2).m36571k(null, linkedHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List sortedMessages$lambda$22(Map messagesMap) {
        AbstractC22676k.m65750j(messagesMap, "messagesMap");
        return AbstractC25265s.m74152u1(messagesMap.values(), new C19332xdc7a92c9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List sortedPinnedMessages$lambda$24(Map messagesMap) {
        AbstractC22676k.m65750j(messagesMap, "messagesMap");
        return AbstractC25265s.m74152u1(messagesMap.values(), new C19333x59146c43());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sortedVisiblePinnedMessages$lambda$9(ChannelStateLegacyImpl channelStateLegacyImpl, Message it) {
        AbstractC22676k.m65750j(it, "it");
        InterfaceC4339a interfaceC4339a = channelStateLegacyImpl.now;
        if (!it.getPinned() || MessageUtils.isDeleted(it)) {
            return false;
        }
        Date pinExpires = it.getPinExpires();
        return pinExpires == null || pinExpires.getTime() >= ((Number) interfaceC4339a.invoke()).longValue();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ ArrayList m54858u(Map map, Map map2) {
        return (ArrayList) messageList$lambda$5(map, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unreadCount$lambda$32(ChannelUserRead channelUserRead) {
        if (channelUserRead != null) {
            return channelUserRead.getUnreadMessages();
        }
        return 0;
    }

    private static final Map visibleMessages$lambda$17(ChannelStateLegacyImpl channelStateLegacyImpl, List messages) {
        AbstractC22676k.m65750j(messages, "messages");
        ArrayList arrayList = new ArrayList();
        for (Object obj : messages) {
            if (channelStateLegacyImpl.isMessageVisible((Message) obj)) {
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
        return linkedHashMap;
    }

    private static final Map visiblePinnedMessages$lambda$20(ChannelStateLegacyImpl channelStateLegacyImpl, List messages) {
        AbstractC22676k.m65750j(messages, "messages");
        ArrayList arrayList = new ArrayList();
        for (Object obj : messages) {
            if (channelStateLegacyImpl.isMessageVisible((Message) obj)) {
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
        return linkedHashMap;
    }

    private static final List watchers$lambda$25(Map watcherMap, Map userMap) {
        AbstractC22676k.m65750j(watcherMap, "watcherMap");
        AbstractC22676k.m65750j(userMap, "userMap");
        return UserKt.updateUsers(watcherMap.values(), userMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List watchers$lambda$27(List it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC25265s.m74152u1(it, new ChannelStateLegacyImpl$watchers$lambda$27$$inlined$sortedBy$1());
    }

    public final void addMember(Member member) {
        Map map;
        Set setKeySet;
        AbstractC22676k.m65750j(member, "member");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[addMember] member.id: ", member.getUserId()), null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._membersCount;
        if (interfaceC13075p1 != null) {
            int iIntValue = ((Number) this.membersCount.getValue()).intValue();
            Integer num = 1;
            InterfaceC13075p1 interfaceC13075p2 = this._members;
            if (interfaceC13075p2 != null && (map = (Map) ((C13045h2) interfaceC13075p2).getValue()) != null && (setKeySet = map.keySet()) != null && setKeySet.contains(member.getUserId())) {
                num = null;
            }
            ((C13045h2) interfaceC13075p1).m36571k(null, Integer.valueOf(iIntValue + (num != null ? num.intValue() : 0)));
        }
        upsertMembers(AbstractC37056f.m118958J(member));
    }

    public final void addQuotedMessage(String quotedMessageId, String quotingMessageId) {
        AbstractC22676k.m65750j(quotedMessageId, "quotedMessageId");
        AbstractC22676k.m65750j(quotingMessageId, "quotingMessageId");
        InterfaceC13075p1 interfaceC13075p1 = this._quotedMessagesMap;
        if (interfaceC13075p1 != null) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Map map = (Map) c13045h2.getValue();
            List list = (List) map.get(quotedMessageId);
            map.put(quotedMessageId, list != null ? AbstractC25265s.m74128f1(quotingMessageId, list) : AbstractC37056f.m118958J(quotingMessageId));
            c13045h2.m36571k(null, map);
        }
    }

    public final void deleteMember(Member member) {
        int i13;
        AbstractC22676k.m65750j(member, "member");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[deleteMember] member.id: ", member.getUserId()), null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._members;
        int i14 = 0;
        if (interfaceC13075p1 != null) {
            InterfaceC13075p1 interfaceC13075p2 = this._membersCount;
            if (interfaceC13075p2 != null) {
                int iIntValue = ((Number) this.membersCount.getValue()).intValue();
                Map map = (Map) ((C13045h2) interfaceC13075p1).getValue();
                if (map.isEmpty()) {
                    i13 = 0;
                } else {
                    Iterator it = map.entrySet().iterator();
                    i13 = 0;
                    while (it.hasNext()) {
                        if (AbstractC22676k.m65745e(((Map.Entry) it.next()).getKey(), member.getUserId())) {
                            i13++;
                        }
                    }
                }
                ((C13045h2) interfaceC13075p2).m36571k(null, Integer.valueOf(iIntValue - i13));
            }
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.m36571k(null, AbstractC25247g0.m73991Z(member.getUserId(), (Map) c13045h2.getValue()));
        }
        InterfaceC13075p1 interfaceC13075p3 = this._watchers;
        if (interfaceC13075p3 != null) {
            User user = member.getUser();
            int iIntValue2 = ((Number) this.watcherCount.getValue()).intValue();
            Map map2 = (Map) ((C13045h2) interfaceC13075p3).getValue();
            if (!map2.isEmpty()) {
                Iterator it3 = map2.entrySet().iterator();
                while (it3.hasNext()) {
                    if (AbstractC22676k.m65745e(((Map.Entry) it3.next()).getKey(), member.getUserId())) {
                        i14++;
                    }
                }
            }
            deleteWatcher$stream_chat_android_client_release(user, iIntValue2 - i14);
        }
    }

    public final void deleteMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[deleteMessage] message.id: ", message.getId()), null);
        }
        deleteMessages(AbstractC37056f.m118958J(message));
    }

    public final void deleteMessages(List<Message> messages) {
        AbstractC22676k.m65750j(messages, "messages");
        List<Message> list = messages;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Message) it.next()).getId());
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[deleteMessages] messages.ids: " + setM74103I1, null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        if (interfaceC13075p1 != null) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.m36571k(null, AbstractC25247g0.m73992a0((Map) c13045h2.getValue(), setM74103I1));
        }
        deletePinnedMessages(messages);
    }

    public final void deletePinnedMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC31061c.m95640p("[deletePinnedMessage] message.id=", message.getId(), ", message.text=", message.getText()), null);
        }
        deletePinnedMessages(AbstractC37056f.m118958J(message));
    }

    public final void deleteWatcher$stream_chat_android_client_release(User user, int watchersCount) {
        AbstractC22676k.m65750j(user, "user");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC25012a.m73374g(watchersCount, "[deleteWatcher] user.id: ", user.getId(), ", watchersCount: "), null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._watchers;
        if (interfaceC13075p1 != null) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.m36571k(null, AbstractC25247g0.m73991Z(user.getId(), (Map) c13045h2.getValue()));
            InterfaceC13075p1 interfaceC13075p2 = this._watcherCount;
            if (interfaceC13075p2 != null) {
                Integer numValueOf = Integer.valueOf(watchersCount);
                if (watchersCount < 0) {
                    numValueOf = null;
                }
                ((C13045h2) interfaceC13075p2).m36571k(null, Integer.valueOf(numValueOf != null ? numValueOf.intValue() : ((Map) c13045h2.getValue()).size()));
            }
        }
    }

    public final void destroy$stream_chat_android_client_release() {
        this._messages = null;
        this._pinnedMessages = null;
        this._typing = null;
        this._rawReads = null;
        this._members = null;
        this._watchers = null;
        this._watcherCount = null;
        this._endOfNewerMessages = null;
        this._endOfOlderMessages = null;
        this._loading = null;
        this._hidden = null;
        this._muted = null;
        this._channelData = null;
        this._repliedMessage = null;
        this._quotedMessagesMap = null;
        this._membersCount = null;
        this._insideSearch = null;
        this._loadingOlderMessages = null;
        this._loadingNewerMessages = null;
        this._channelConfig = null;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getActiveLiveLocations() {
        return this.activeLiveLocations;
    }

    public final Integer getBaseMessageLimit() {
        return this.baseMessageLimit;
    }

    /* JADX INFO: renamed from: getCachedLatestMessages$stream_chat_android_client_release, reason: from getter */
    public final InterfaceC13075p1 getCachedLatestMessages() {
        return this.cachedLatestMessages;
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

    public final Date getHideMessagesBefore() {
        return this.hideMessagesBefore;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getInsideSearch() {
        return this.insideSearch;
    }

    /* JADX INFO: renamed from: getKeystrokeParentMessageId$stream_chat_android_client_release, reason: from getter */
    public final String getKeystrokeParentMessageId() {
        return this.keystrokeParentMessageId;
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
        Map map;
        Map map2;
        Message message;
        AbstractC22676k.m65750j(id4, "id");
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        if (interfaceC13075p1 != null && (map2 = (Map) ((C13045h2) interfaceC13075p1).getValue()) != null && (message = (Message) map2.get(id4)) != null) {
            return message;
        }
        InterfaceC13075p1 interfaceC13075p2 = this._pinnedMessages;
        if (interfaceC13075p2 == null || (map = (Map) ((C13045h2) interfaceC13075p2).getValue()) == null) {
            return null;
        }
        return (Message) map.get(id4);
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getMessageCount() {
        return this.messageCount;
    }

    public final InterfaceC13037f2 getMessageList() {
        return this.messageList;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getMessages() {
        return this.messages;
    }

    public final List<Message> getMessagesFromUser(String userId) {
        Map map;
        Collection collectionValues;
        AbstractC22676k.m65750j(userId, "userId");
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        if (interfaceC13075p1 == null || (map = (Map) ((C13045h2) interfaceC13075p1).getValue()) == null || (collectionValues = map.values()) == null) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (AbstractC22676k.m65745e(((Message) obj).getUser().getId(), userId)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getMessagesState() {
        return this.messagesState;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getMuted() {
        return this.muted;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getPinnedMessages() {
        return this.pinnedMessages;
    }

    public final InterfaceC13037f2 getPinnedMessagesList() {
        return this.pinnedMessagesList;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getQuotedMessagesMap() {
        return this.quotedMessagesMap;
    }

    public final Map<String, Message> getRawPinnedMessages() {
        LinkedHashMap linkedHashMap;
        Map map;
        Date pinExpires;
        InterfaceC13075p1 interfaceC13075p1 = this._pinnedMessages;
        if (interfaceC13075p1 == null || (map = (Map) ((C13045h2) interfaceC13075p1).getValue()) == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                Message message = (Message) entry.getValue();
                InterfaceC4339a interfaceC4339a = this.now;
                if (message.getPinned() && !MessageUtils.isDeleted(message) && ((pinExpires = message.getPinExpires()) == null || pinExpires.getTime() >= ((Number) interfaceC4339a.invoke()).longValue())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return linkedHashMap == null ? C25272z.f99163w : linkedHashMap;
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
    /* JADX INFO: renamed from: getRecoveryNeeded, reason: from getter */
    public final boolean get_recoveryNeeded() {
        return this.recoveryNeeded;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getRepliedMessage() {
        return this.repliedMessage;
    }

    public final InterfaceC13037f2 getSortedMessages() {
        return this.sortedMessages;
    }

    public final InterfaceC13037f2 getSortedPinnedMessages() {
        return this.sortedPinnedMessages;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getTyping() {
        return this.typing;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getUnreadCount() {
        return this.unreadCount;
    }

    /* JADX INFO: renamed from: getVisibleMessages$stream_chat_android_client_release, reason: from getter */
    public final InterfaceC13037f2 getVisibleMessages() {
        return this.visibleMessages;
    }

    /* JADX INFO: renamed from: getVisiblePinnedMessages$stream_chat_android_client_release, reason: from getter */
    public final InterfaceC13037f2 getVisiblePinnedMessages() {
        return this.visiblePinnedMessages;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getWatcherCount() {
        return this.watcherCount;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final InterfaceC13037f2 getWatchers() {
        return this.watchers;
    }

    public final boolean markChannelAsRead() {
        Message message;
        Object value = this.messages.getValue();
        Boolean bool = null;
        if (!((Config) this.channelConfig.getValue()).getReadEventsEnabled()) {
            value = null;
        }
        List list = (List) value;
        if (list == null || (message = (Message) AbstractC25265s.m74114R0(list)) == null) {
            return false;
        }
        ChannelUserRead channelUserRead = (ChannelUserRead) this.read.getValue();
        if (channelUserRead == null) {
            bool = Boolean.TRUE;
        } else {
            ChannelUserRead channelUserRead2 = (!AbstractC22676k.m65745e(channelUserRead.getLastReadMessageId(), message.getId()) || channelUserRead.getUnreadMessages() > 0) ? channelUserRead : null;
            if (channelUserRead2 != null) {
                upsertReads(AbstractC37056f.m118958J(ChannelUserRead.copy$default(channelUserRead2, null, MessageExtensionsKt.getCreatedAtOrDefault(message, new Date()), 0, MessageExtensionsKt.getCreatedAtOrDefault(message, new Date()), null, null, null, 113, null)));
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void removeMessagesBefore(Date date) {
        Date pinExpires;
        AbstractC22676k.m65750j(date, "date");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[removeMessagesBefore] date: " + date, null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        if (interfaceC13075p1 != null) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Map map = (Map) c13045h2.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (MessageKt.wasCreatedAfter((Message) entry.getValue(), date)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            c13045h2.m36571k(null, linkedHashMap);
        }
        InterfaceC13075p1 interfaceC13075p2 = this._pinnedMessages;
        Map map2 = interfaceC13075p2 != null ? (Map) ((C13045h2) interfaceC13075p2).getValue() : null;
        if (map2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            if (MessageKt.wasCreatedAfter((Message) entry2.getValue(), date)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Message message = (Message) entry3.getValue();
            InterfaceC4339a interfaceC4339a = this.now;
            if (message.getPinned() && !MessageUtils.isDeleted(message) && ((pinExpires = message.getPinExpires()) == null || pinExpires.getTime() >= ((Number) interfaceC4339a.invoke()).longValue())) {
                linkedHashMap3.put(entry3.getKey(), entry3.getValue());
            }
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8294g(map2.size(), linkedHashMap3.size(), "[setPinned] pinned.size: ", " => "), null);
        }
        InterfaceC13075p1 interfaceC13075p3 = this._pinnedMessages;
        if (interfaceC13075p3 != null) {
            ((C13045h2) interfaceC13075p3).m36571k(null, linkedHashMap3);
        }
    }

    public final void resetMessageLimit$stream_chat_android_client_release() {
        this.messageLimit = this.baseMessageLimit;
    }

    public final void setChannelConfig(Config channelConfig) {
        AbstractC22676k.m65750j(channelConfig, "channelConfig");
        InterfaceC13075p1 interfaceC13075p1 = this._channelConfig;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, channelConfig);
        }
    }

    public final void setChannelData(ChannelData channelData) {
        AbstractC22676k.m65750j(channelData, "channelData");
        InterfaceC13075p1 interfaceC13075p1 = this._channelData;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, channelData);
        }
    }

    public final void setEndOfNewerMessages(boolean isEnd) {
        InterfaceC13075p1 interfaceC13075p1 = this._endOfNewerMessages;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(isEnd));
        }
    }

    public final void setEndOfOlderMessages(boolean isEnd) {
        InterfaceC13075p1 interfaceC13075p1 = this._endOfOlderMessages;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(isEnd));
        }
    }

    public final void setHidden(boolean isHidden) {
        InterfaceC13075p1 interfaceC13075p1 = this._hidden;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(isHidden));
        }
    }

    public final void setHideMessagesBefore(Date date) {
        this.hideMessagesBefore = date;
    }

    public final void setInsideSearch(boolean isInsideSearch) {
        if (isInsideSearch && !((Boolean) this.insideSearch.getValue()).booleanValue()) {
            cacheLatestMessages();
        } else if (!isInsideSearch && ((Boolean) this.insideSearch.getValue()).booleanValue()) {
            C13045h2 c13045h2 = (C13045h2) this.cachedLatestMessages;
            c13045h2.getClass();
            c13045h2.m36571k(null, C25272z.f99163w);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._insideSearch;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(isInsideSearch));
        }
    }

    public final void setKeystrokeParentMessageId$stream_chat_android_client_release(String str) {
        this.keystrokeParentMessageId = str;
    }

    public final void setLastStartTypingEvent(Date date) {
        this.lastStartTypingEvent = date;
    }

    public final void setLoading(boolean isLoading) {
        InterfaceC13075p1 interfaceC13075p1 = this._loading;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(isLoading));
        }
    }

    public final void setLoadingNewerMessages(boolean isLoading) {
        InterfaceC13075p1 interfaceC13075p1 = this._loadingNewerMessages;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(isLoading));
        }
    }

    public final void setLoadingOlderMessages(boolean isLoading) {
        Map map;
        InterfaceC13075p1 interfaceC13075p1 = this._loadingOlderMessages;
        Integer numValueOf = null;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(isLoading));
        }
        InterfaceC13075p1 interfaceC13075p2 = this._messages;
        if (interfaceC13075p2 == null || (map = (Map) ((C13045h2) interfaceC13075p2).getValue()) == null) {
            return;
        }
        int size = map.size();
        if (isLoading) {
            Integer num = this.messageLimit;
            if (num != null) {
                int iIntValue = num.intValue();
                Double dValueOf = size + 30 >= iIntValue ? Double.valueOf(LIMIT_MULTIPLIER) : null;
                numValueOf = Integer.valueOf((int) (((double) iIntValue) * (dValueOf != null ? dValueOf.doubleValue() : NEUTRAL_MULTIPLIER)));
            }
            this.messageLimit = numValueOf;
        }
    }

    public final void setMembers(List<Member> members, int membersCount) {
        AbstractC22676k.m65750j(members, "members");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            List<Member> list = members;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Member) it.next()).getUserId());
            }
            interfaceC2344j.log(enumC2341g, str, "[setMembers] member.ids: " + arrayList, null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._members;
        if (interfaceC13075p1 != null) {
            List<Member> list2 = members;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : list2) {
                linkedHashMap.put(((Member) obj).getUserId(), obj);
            }
            ((C13045h2) interfaceC13075p1).m36571k(null, linkedHashMap);
        }
        InterfaceC13075p1 interfaceC13075p2 = this._membersCount;
        if (interfaceC13075p2 != null) {
            ((C13045h2) interfaceC13075p2).m36571k(null, Integer.valueOf(membersCount));
        }
    }

    public final void setMembersCount(int count) {
        InterfaceC13075p1 interfaceC13075p1 = this._membersCount;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Integer.valueOf(count));
        }
    }

    public final void setMessages(List<Message> messages) {
        AbstractC22676k.m65750j(messages, "messages");
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        if (interfaceC13075p1 != null) {
            Collection<Message> collectionApplyMessageLimitIfNeeded = applyMessageLimitIfNeeded(messages);
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(collectionApplyMessageLimitIfNeeded, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : collectionApplyMessageLimitIfNeeded) {
                linkedHashMap.put(((Message) obj).getId(), obj);
            }
            ((C13045h2) interfaceC13075p1).m36571k(null, linkedHashMap);
        }
    }

    public final void setMuted(boolean isMuted) {
        InterfaceC13075p1 interfaceC13075p1 = this._muted;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(isMuted));
        }
    }

    public final void setPinnedMessages(List<Message> messages) {
        Date pinExpires;
        AbstractC22676k.m65750j(messages, "messages");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(messages.size(), "[setPinnedMessages] messages.size: "), null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._pinnedMessages;
        Map map = interfaceC13075p1 != null ? (Map) ((C13045h2) interfaceC13075p1).getValue() : null;
        if (map == null) {
            return;
        }
        List<Message> list = messages;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : list) {
            linkedHashMap.put(((Message) obj).getId(), obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Message message = (Message) entry.getValue();
            InterfaceC4339a interfaceC4339a = this.now;
            if (message.getPinned() && !MessageUtils.isDeleted(message) && ((pinExpires = message.getPinExpires()) == null || pinExpires.getTime() >= ((Number) interfaceC4339a.invoke()).longValue())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8294g(map.size(), linkedHashMap2.size(), "[setPinned] pinned.size: ", " => "), null);
        }
        InterfaceC13075p1 interfaceC13075p2 = this._pinnedMessages;
        if (interfaceC13075p2 != null) {
            ((C13045h2) interfaceC13075p2).m36571k(null, linkedHashMap2);
        }
    }

    public final void setRecoveryNeeded(boolean z4) {
        this.recoveryNeeded = z4;
    }

    public final void setRepliedMessage(Message repliedMessage) {
        InterfaceC13075p1 interfaceC13075p1 = this._repliedMessage;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36570j(repliedMessage);
        }
    }

    public final void setWatchers(List<User> watchers, int watchersCount) {
        AbstractC22676k.m65750j(watchers, "watchers");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            List<User> list = watchers;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((User) it.next()).getId());
            }
            interfaceC2344j.log(enumC2341g, str, "[setWatchers] watchers.ids: " + arrayList + ", watchersCount: " + watchersCount, null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._watchers;
        if (interfaceC13075p1 != null) {
            List<User> list2 = watchers;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : list2) {
                linkedHashMap.put(((User) obj).getId(), obj);
            }
            ((C13045h2) interfaceC13075p1).m36571k(null, linkedHashMap);
        }
        InterfaceC13075p1 interfaceC13075p2 = this._watcherCount;
        if (interfaceC13075p2 != null) {
            ((C13045h2) interfaceC13075p2).m36571k(null, Integer.valueOf(watchersCount));
        }
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelState
    public final Channel toChannel() {
        return ChannelExtensionKt.syncUnreadCountWithReads$default(Channel.copy$default(((ChannelData) this.channelData.getValue()).toChannel((List) this.sortedMessages.getValue(), AbstractC25265s.m74093D1(((Map) ((C13045h2) this.cachedLatestMessages).getValue()).values()), (List) this.members.getValue(), AbstractC25265s.m74093D1(((Map) this.rawReads.getValue()).values()), (List) this.watchers.getValue(), ((Number) this.watcherCount.getValue()).intValue(), ((Boolean) this.insideSearch.getValue()).booleanValue()), null, null, null, null, 0, false, null, null, null, null, 0, null, null, null, null, (Config) this.channelConfig.getValue(), null, 0, null, (Boolean) this.hidden.getValue(), null, 0, null, (List) this.sortedPinnedMessages.getValue(), null, null, null, false, null, (List) this.activeLiveLocations.getValue(), null, null, null, null, null, -545816577, 7, null), null, 1, null);
    }

    public final void updateCachedLatestMessages(Map<String, Message> messages) {
        AbstractC22676k.m65750j(messages, "messages");
        C13045h2 c13045h2 = (C13045h2) this.cachedLatestMessages;
        c13045h2.getClass();
        c13045h2.m36571k(null, messages);
    }

    public final void updateChannelData(Function1 update) {
        AbstractC22676k.m65750j(update, "update");
        InterfaceC13075p1 interfaceC13075p1 = this._channelData;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36570j(update.invoke(interfaceC13075p1 != null ? (ChannelData) ((C13045h2) interfaceC13075p1).getValue() : null));
        }
    }

    public final void updateTypingEvent(TypingEvent typingEvent) {
        AbstractC22676k.m65750j(typingEvent, "typingEvent");
        InterfaceC13075p1 interfaceC13075p1 = this._typing;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, typingEvent);
        }
    }

    public final void upsertDelivered(ChannelUserRead read) {
        ChannelUserRead channelUserReadCopy$default;
        AbstractC22676k.m65750j(read, "read");
        ChannelUserRead channelUserRead = (ChannelUserRead) ((Map) this.rawReads.getValue()).get(read.getUser().getId());
        if (channelUserRead == null || (channelUserReadCopy$default = ChannelUserRead.copy$default(channelUserRead, read.getUser(), read.getLastReceivedEventDate(), 0, null, null, read.getLastDeliveredAt(), read.getLastDeliveredMessageId(), 28, null)) == null) {
            channelUserReadCopy$default = read;
        }
        InterfaceC13075p1 interfaceC13075p1 = this._rawReads;
        if (interfaceC13075p1 != null) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.m36571k(null, AbstractC25247g0.m73995d0((Map) c13045h2.getValue(), AbstractC25247g0.m73989X(new C23465k(read.getUser().getId(), channelUserReadCopy$default))));
        }
    }

    public final void upsertMembers(List<Member> members) {
        AbstractC22676k.m65750j(members, "members");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            List<Member> list = members;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Member) it.next()).getUserId());
            }
            interfaceC2344j.log(enumC2341g, str, "[upsertMembers] member.ids: " + arrayList, null);
        }
        List<Member> list2 = members;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : list2) {
            linkedHashMap.put(((Member) obj).getUserId(), obj);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._members;
        if (interfaceC13075p1 != null) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.m36571k(null, AbstractC25247g0.m73995d0((Map) c13045h2.getValue(), linkedHashMap));
        }
    }

    public final void upsertMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        upsertMessages(AbstractC37056f.m118958J(message));
    }

    public final void upsertMessages(Collection<Message> updatedMessages) {
        Map map;
        AbstractC22676k.m65750j(updatedMessages, "updatedMessages");
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        if (interfaceC13075p1 != null) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Map map2 = (Map) c13045h2.getValue();
            Collection<Message> collection = updatedMessages;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(collection, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : collection) {
                linkedHashMap.put(((Message) obj).getId(), obj);
            }
            Collection<Message> collectionApplyMessageLimitIfNeeded = applyMessageLimitIfNeeded(AbstractC25247g0.m73995d0(map2, AbstractC25247g0.m73992a0(linkedHashMap, getDeletedMessagesIds())).values());
            int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(collectionApplyMessageLimitIfNeeded, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W2 >= 16 ? iM73988W2 : 16);
            for (Object obj2 : collectionApplyMessageLimitIfNeeded) {
                linkedHashMap2.put(((Message) obj2).getId(), obj2);
            }
            c13045h2.m36571k(null, linkedHashMap2);
        }
        InterfaceC13075p1 interfaceC13075p2 = this._pinnedMessages;
        if (interfaceC13075p2 == null || (map = (Map) ((C13045h2) interfaceC13075p2).getValue()) == null) {
            return;
        }
        Set setKeySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : updatedMessages) {
            if (setKeySet.contains(((Message) obj3).getId())) {
                arrayList.add(obj3);
            }
        }
        upsertPinnedMessages(arrayList);
    }

    public final void upsertPinnedMessages(Collection<Message> messages) {
        Date pinExpires;
        AbstractC22676k.m65750j(messages, "messages");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(messages.size(), "[upsertPinnedMessages] messages.size: "), null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._pinnedMessages;
        Map map = interfaceC13075p1 != null ? (Map) ((C13045h2) interfaceC13075p1).getValue() : null;
        if (map == null) {
            return;
        }
        Collection<Message> collection = messages;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(collection, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : collection) {
            linkedHashMap.put(((Message) obj).getId(), obj);
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(map, AbstractC25247g0.m73992a0(linkedHashMap, getDeletedMessagesIds()));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapM73995d0.entrySet()) {
            Message message = (Message) entry.getValue();
            InterfaceC4339a interfaceC4339a = this.now;
            if (message.getPinned() && !MessageUtils.isDeleted(message) && ((pinExpires = message.getPinExpires()) == null || pinExpires.getTime() >= ((Number) interfaceC4339a.invoke()).longValue())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8294g(map.size(), linkedHashMap2.size(), "[setPinned] pinned.size: ", " => "), null);
        }
        InterfaceC13075p1 interfaceC13075p2 = this._pinnedMessages;
        if (interfaceC13075p2 != null) {
            ((C13045h2) interfaceC13075p2).m36571k(null, linkedHashMap2);
        }
    }

    public final void upsertReads(List<ChannelUserRead> reads) {
        AbstractC22676k.m65750j(reads, "reads");
        InterfaceC13075p1 interfaceC13075p1 = this._rawReads;
        if (interfaceC13075p1 != null) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Map map = (Map) c13045h2.getValue();
            List<ChannelUserRead> list = reads;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : list) {
                linkedHashMap.put(((ChannelUserRead) obj).getUserId(), obj);
            }
            c13045h2.m36571k(null, AbstractC25247g0.m73995d0(map, linkedHashMap));
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x010f  */
    public final void upsertUserPresence(User user) {
        User user2;
        User user3;
        Object obj;
        ChannelData channelData;
        Map map;
        Map map2;
        Member member;
        Member memberCopy;
        AbstractC22676k.m65750j(user, "user");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[upsertUserPresence] user.id: ", user.getId()), null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._members;
        if (interfaceC13075p1 != null && (map2 = (Map) ((C13045h2) interfaceC13075p1).getValue()) != null && (member = (Member) map2.get(user.getId())) != null && (memberCopy = member.copy((32766 & 1) != 0 ? member.user : user, (32766 & 2) != 0 ? member.createdAt : null, (32766 & 4) != 0 ? member.updatedAt : null, (32766 & 8) != 0 ? member.isInvited : null, (32766 & 16) != 0 ? member.inviteAcceptedAt : null, (32766 & 32) != 0 ? member.inviteRejectedAt : null, (32766 & 64) != 0 ? member.shadowBanned : false, (32766 & 128) != 0 ? member.banned : false, (32766 & 256) != 0 ? member.channelRole : null, (32766 & 512) != 0 ? member.notificationsMuted : null, (32766 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? member.status : null, (32766 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? member.banExpires : null, (32766 & 4096) != 0 ? member.pinnedAt : null, (32766 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? member.archivedAt : null, (32766 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? member.extraData : null)) != null) {
            upsertMembers(AbstractC37056f.m118958J(memberCopy));
        }
        InterfaceC13075p1 interfaceC13075p2 = this._watchers;
        if (interfaceC13075p2 != null && (map = (Map) ((C13045h2) interfaceC13075p2).getValue()) != null && !map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (AbstractC22676k.m65745e(((Map.Entry) it.next()).getKey(), user.getId())) {
                        user2 = user;
                        break;
                    }
                } else {
                    user2 = null;
                    break;
                }
            }
        } else {
            user2 = null;
            break;
        }
        if (user2 != null) {
            upsertWatchers(AbstractC37056f.m118958J(user2), ((Number) this.watcherCount.getValue()).intValue());
        }
        InterfaceC13075p1 interfaceC13075p3 = this._channelData;
        if (interfaceC13075p3 == null || (channelData = (ChannelData) ((C13045h2) interfaceC13075p3).getValue()) == null) {
            user3 = user;
        } else {
            ChannelData channelData2 = AbstractC22676k.m65745e(channelData.getCreatedBy().getId(), user.getId()) ? channelData : null;
            if (channelData2 != null) {
                user3 = user;
                setChannelData(ChannelData.copy$default(channelData2, null, null, null, null, user, 0, false, null, null, null, 0, null, null, null, null, null, null, null, null, null, 1048559, null));
            } else {
                user3 = user;
            }
        }
        InterfaceC13075p1 interfaceC13075p4 = this._messages;
        if (interfaceC13075p4 != null) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p4;
            List<Message> listUpdateUsers = MessageKt.updateUsers((Collection<Message>) ((Map) c13045h2.getValue()).values(), (Map<String, User>) AbstractC25247g0.m73989X(new C23465k(user3.getId(), user3)));
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(listUpdateUsers, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj2 : (ArrayList) listUpdateUsers) {
                linkedHashMap.put(((Message) obj2).getId(), obj2);
            }
            obj = null;
            c13045h2.m36571k(null, linkedHashMap);
        } else {
            obj = null;
        }
        InterfaceC13075p1 interfaceC13075p5 = this._pinnedMessages;
        if (interfaceC13075p5 != null) {
            C13045h2 c13045h3 = (C13045h2) interfaceC13075p5;
            c13045h3.m36571k(obj, MessageKt.updateUsers((Map<String, Message>) c13045h3.getValue(), (Map<String, User>) AbstractC25247g0.m73989X(new C23465k(user3.getId(), user3))));
        }
    }

    public final void upsertWatchers(List<User> watchers, int watchersCount) {
        AbstractC22676k.m65750j(watchers, "watchers");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            List<User> list = watchers;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((User) it.next()).getId());
            }
            interfaceC2344j.log(enumC2341g, str, "[upsertWatchers] watchers.ids: " + arrayList + ", watchersCount: " + watchersCount, null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._watchers;
        if (interfaceC13075p1 != null) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Map map = (Map) c13045h2.getValue();
            List<User> list2 = watchers;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : list2) {
                linkedHashMap.put(((User) obj).getId(), obj);
            }
            c13045h2.m36571k(null, AbstractC25247g0.m73995d0(map, linkedHashMap));
            InterfaceC13075p1 interfaceC13075p2 = this._watcherCount;
            if (interfaceC13075p2 != null) {
                Integer numValueOf = Integer.valueOf(watchersCount);
                if (watchersCount < 0) {
                    numValueOf = null;
                }
                ((C13045h2) interfaceC13075p2).m36571k(null, Integer.valueOf(numValueOf != null ? numValueOf.intValue() : ((Map) c13045h2.getValue()).size()));
            }
        }
    }
}
