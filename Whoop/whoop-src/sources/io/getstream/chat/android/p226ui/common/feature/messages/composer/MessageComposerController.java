package io.getstream.chat.android.p226ui.common.feature.messages.composer;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.C1601k1;
import androidx.profileinstaller.ProfileVerifier;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import ch.C4588i;
import com.mapbox.common.location.C5432a;
import com.mapbox.maps.MapboxMap;
import com.whoop.service.network.model.UserState;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13081r1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import fc3.C14380k;
import hc3.AbstractC17176i;
import hc3.C17171d;
import ht2.C17632d;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.client.api.state.ThreadState;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.C19336c;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.ChannelCapabilities;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.Command;
import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.LinkPreview;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.Mention;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.UserLookupHandler;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.typing.TypingSuggester;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.typing.TypingSuggestionOptions;
import io.getstream.chat.android.p226ui.common.state.messages.Edit;
import io.getstream.chat.android.p226ui.common.state.messages.MessageAction;
import io.getstream.chat.android.p226ui.common.state.messages.MessageInput;
import io.getstream.chat.android.p226ui.common.state.messages.MessageMode;
import io.getstream.chat.android.p226ui.common.state.messages.Reply;
import io.getstream.chat.android.p226ui.common.state.messages.ThreadReply;
import io.getstream.chat.android.p226ui.common.state.messages.composer.CommandAvailabilityKt;
import io.getstream.chat.android.p226ui.common.state.messages.composer.MessageComposerState;
import io.getstream.chat.android.p226ui.common.state.messages.composer.MessageComposerViewEvent;
import io.getstream.chat.android.p226ui.common.state.messages.composer.MessageValidator;
import io.getstream.chat.android.p226ui.common.state.messages.composer.RecordingState;
import io.getstream.chat.android.p226ui.common.utils.extensions.StringKt;
import io.getstream.chat.android.p226ui.common.utils.typing.TypingUpdatesBuffer;
import io.getstream.chat.android.p226ui.common.utils.typing.internal.DefaultTypingUpdatesBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l83.C23454a0;
import l83.C23465k;
import l83.C23471q;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import m83.C25272z;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import no.nordicsemi.android.dfu.DfuBaseService;
import o23.AbstractC27476f;
import o23.C27478h;
import o23.C27481k;
import o23.C27485o;
import o23.InterfaceC27471a;
import o23.InterfaceC27474d;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s23.InterfaceC32094g;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39410n;
import yb3.C39412p;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\u0088\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u0093\u00022\u00020\u0001:\u0006\u0094\u0002\u0093\u0002\u0095\u0002Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u001a¢\u0006\u0004\b)\u0010*J\u001b\u0010.\u001a\u00020\u001a2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u001a2\u0006\u00100\u001a\u00020,¢\u0006\u0004\b1\u00102J\u001b\u00105\u001a\u00020\u001a2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000203¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u001a¢\u0006\u0004\b7\u0010*J1\u0010=\u001a\u00020\u001a2\u0006\u00109\u001a\u0002082\u001a\b\u0002\u0010<\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:\u0012\u0004\u0012\u00020\u001a0\r¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u001a¢\u0006\u0004\b?\u0010*JW\u0010F\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020;2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020;0A22\b\u0002\u0010E\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0D\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010C¢\u0006\u0004\bF\u0010GJ%\u0010H\u001a\u00020;2\u0006\u0010@\u001a\u00020\u00022\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\u001a¢\u0006\u0004\bJ\u0010*J\r\u0010K\u001a\u00020\u001a¢\u0006\u0004\bK\u0010*J\u0015\u0010N\u001a\u00020\u001a2\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u0015\u0010N\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bN\u0010RJ\u0015\u0010U\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020\u001a¢\u0006\u0004\bW\u0010*J\r\u0010X\u001a\u00020\u001a¢\u0006\u0004\bX\u0010*J\r\u0010Y\u001a\u00020\u001a¢\u0006\u0004\bY\u0010*J\r\u0010Z\u001a\u00020\u001a¢\u0006\u0004\bZ\u0010*J%\u0010^\u001a\u00020\u001a2\u0016\b\u0002\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\\\u0018\u00010[¢\u0006\u0004\b^\u0010_J\r\u0010`\u001a\u00020\u001a¢\u0006\u0004\b`\u0010*J\r\u0010a\u001a\u00020\u001a¢\u0006\u0004\ba\u0010*J\r\u0010b\u001a\u00020\u001a¢\u0006\u0004\bb\u0010*J\r\u0010c\u001a\u00020\u001a¢\u0006\u0004\bc\u0010*J+\u0010e\u001a\u00020\u001a2\u001c\b\u0002\u0010d\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0:\u0012\u0004\u0012\u00020\u001a\u0018\u00010\r¢\u0006\u0004\be\u0010fJ\r\u0010g\u001a\u00020\u001a¢\u0006\u0004\bg\u0010*J\u0015\u0010i\u001a\u00020\u001a2\u0006\u0010h\u001a\u00020\\¢\u0006\u0004\bi\u0010jJ\r\u0010k\u001a\u00020\u001a¢\u0006\u0004\bk\u0010*J\r\u0010l\u001a\u00020\u001a¢\u0006\u0004\bl\u0010*J\u000f\u0010m\u001a\u00020\u001aH\u0002¢\u0006\u0004\bm\u0010*J\u000f\u0010n\u001a\u00020\u001aH\u0002¢\u0006\u0004\bn\u0010*J\u000f\u0010o\u001a\u00020\u001aH\u0002¢\u0006\u0004\bo\u0010*J%\u0010p\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020;2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002¢\u0006\u0004\bp\u0010qJ\u001f\u0010t\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010s\u001a\u00020rH\u0002¢\u0006\u0004\bt\u0010uJ\u0018\u0010v\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\bx\u0010 J\u001b\u0010z\u001a\u0004\u0018\u00010S2\b\u0010y\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\bz\u0010{J\u001f\u0010~\u001a\u00020!2\u0006\u0010|\u001a\u00020\u001d2\u0006\u0010}\u001a\u00020\u001dH\u0002¢\u0006\u0004\b~\u0010\u007fJ\u001a\u0010\u0080\u0001\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0005\b\u0080\u0001\u0010wJY\u0010\u0081\u0001\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020;2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020;0A20\u0010E\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0D\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010CH\u0002¢\u0006\u0005\b\u0081\u0001\u0010GJ(\u0010\u0082\u0001\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020;2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020;0AH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J0\u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0085\u00012\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020P032\u0006\u0010@\u001a\u00020\u0002H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0011\u0010\u0088\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0005\b\u0088\u0001\u0010*J\u0011\u0010\u0089\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0005\b\u0089\u0001\u0010*J\u0011\u0010\u008a\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0005\b\u008a\u0001\u0010*J\u0012\u0010\u008b\u0001\u001a\u00020!H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0011\u0010\u008d\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0005\b\u008d\u0001\u0010*J\"\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020S0+*\b\u0012\u0004\u0012\u00020S0+H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0005\b\u0090\u0001\u0010*J\u0011\u0010\u0091\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0005\b\u0091\u0001\u0010*J\u0012\u0010\u0092\u0001\u001a\u00020!H\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u008c\u0001J!\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020S0+2\u0007\u0010\u0093\u0001\u001a\u00020\u0002H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001b\u0010\u0096\u0001\u001a\u00020!2\u0007\u0010\u0093\u0001\u001a\u00020\u0002H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J)\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u00012\u0007\u0010\u0093\u0001\u001a\u00020\u00022\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J(\u0010 \u0001\u001a\u00020\u001a2\b\u0010\u009d\u0001\u001a\u00030\u009c\u00012\n\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u0001H\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0013\u0010¢\u0001\u001a\u00020\u001aH\u0082@¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0011\u0010¤\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0005\b¤\u0001\u0010*J\u0011\u0010¥\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0005\b¥\u0001\u0010*J\u0011\u0010¦\u0001\u001a\u00020\u001aH\u0002¢\u0006\u0005\b¦\u0001\u0010*J'\u0010ª\u0001\u001a\n\u0012\u0005\u0012\u00030©\u00010¨\u0001*\u00020\u00042\u0007\u0010§\u0001\u001a\u00020\u0002H\u0002¢\u0006\u0006\bª\u0001\u0010«\u0001J\u001b\u0010\u00ad\u0001\u001a\u00030¬\u00012\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u001d\u0010¯\u0001\u001a\u0005\u0018\u00010¬\u00012\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0006\b¯\u0001\u0010®\u0001J\u0017\u0010°\u0001\u001a\u00030¬\u0001*\u00020\u001dH\u0002¢\u0006\u0006\b°\u0001\u0010®\u0001J\u001a\u0010±\u0001\u001a\u00020!2\u0006\u0010@\u001a\u00020;H\u0002¢\u0006\u0006\b±\u0001\u0010²\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010³\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010´\u0001R\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\u000f\n\u0005\b\b\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010¸\u0001R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010¹\u0001R\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010º\u0001R\u0017\u0010»\u0001\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010³\u0001R\u0017\u0010¼\u0001\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010³\u0001R\u0018\u0010¾\u0001\u001a\u00030½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001b\u0010À\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010³\u0001R\u0018\u0010Â\u0001\u001a\u00030Á\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0018\u0010Å\u0001\u001a\u00030Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0018\u0010È\u0001\u001a\u00030Ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R*\u0010Ë\u0001\u001a\u00030Ê\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bË\u0001\u0010Ì\u0001\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R#\u0010Ñ\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0002030\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010µ\u0001R\u001d\u0010Ò\u0001\u001a\b\u0012\u0004\u0012\u00020!0\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010µ\u0001R\u001d\u0010Ó\u0001\u001a\b\u0012\u0004\u0012\u00020!0\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0001\u0010µ\u0001R\u001d\u0010Ô\u0001\u001a\b\u0012\u0004\u0012\u00020!0\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010µ\u0001R+\u0010Ö\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030¬\u00010Õ\u00010\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010µ\u0001R+\u0010×\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030¬\u00010Õ\u00010\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010µ\u0001R\u001e\u0010Ù\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0Ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R#\u0010Ü\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0Û\u00018\u0006¢\u0006\u0010\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u001f\u0010à\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010Ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010Ú\u0001R$\u0010á\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010Û\u00018\u0006¢\u0006\u0010\n\u0006\bá\u0001\u0010Ý\u0001\u001a\u0006\bâ\u0001\u0010ß\u0001R<\u0010æ\u0001\u001a'\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020,0ä\u0001j\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020,`å\u00010ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R$\u0010è\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bè\u0001\u0010ç\u0001R \u0010é\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010;0ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ç\u0001R \u0010ê\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010,0ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bê\u0001\u0010ç\u0001R\u0018\u0010ì\u0001\u001a\u00030ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u001f\u0010ï\u0001\u001a\n\u0012\u0005\u0012\u00030î\u00010ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0001\u0010ç\u0001R#\u0010ð\u0001\u001a\t\u0012\u0005\u0012\u00030î\u00010\u00068\u0006¢\u0006\u0010\n\u0006\bð\u0001\u0010µ\u0001\u001a\u0006\bñ\u0001\u0010·\u0001R\u001f\u0010ó\u0001\u001a\n\u0012\u0005\u0012\u00030ò\u00010ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bó\u0001\u0010ç\u0001R#\u0010ô\u0001\u001a\t\u0012\u0005\u0012\u00030ò\u00010\u00068\u0006¢\u0006\u0010\n\u0006\bô\u0001\u0010µ\u0001\u001a\u0006\bõ\u0001\u0010·\u0001R\u001f\u0010ö\u0001\u001a\b\u0012\u0004\u0012\u00020L0+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R\u001f\u0010ø\u0001\u001a\b\u0012\u0004\u0012\u00020S0+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010÷\u0001R\u001c\u0010ú\u0001\u001a\u0005\u0018\u00010ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u001c\u0010ü\u0001\u001a\u0005\u0018\u00010ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bü\u0001\u0010û\u0001R\u001b\u0010ý\u0001\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0001\u0010³\u0001R$\u0010þ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020%030ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bþ\u0001\u0010ç\u0001R(\u0010ÿ\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%030\u00068\u0006¢\u0006\u0010\n\u0006\bÿ\u0001\u0010µ\u0001\u001a\u0006\b\u0080\u0002\u0010·\u0001R\u001e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00020P0\u0081\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0082\u0002R\u001c\u0010\u0084\u0002\u001a\u0005\u0018\u00010\u0083\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0018\u0010\u0087\u0002\u001a\u00030\u0086\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0002\u0010\u0088\u0002R\u0019\u0010\u008b\u0002\u001a\u0004\u0018\u00010%8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002R\u0017\u0010\u008c\u0002\u001a\u00020!8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0002\u0010\u008c\u0001R\u0019\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002R\u0017\u0010\u0091\u0002\u001a\u00020\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0090\u0002\u0010\u008e\u0002R\u0017\u0010\u0092\u0002\u001a\u00020!8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0092\u0002\u0010\u008c\u0001¨\u0006\u0096\u0002"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;", "", "", "channelCid", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "Lec3/f2;", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "channelState", "Ls23/g;", "mediaRecorder", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;", "userLookupHandler", "Lkotlin/Function1;", "Ljava/io/File;", "fileToUri", "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;", "config", "Lec3/l;", "Lio/getstream/chat/android/client/api/state/GlobalState;", "globalState", "Landroidx/lifecycle/k1;", "savedStateHandle", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lec3/f2;Ls23/g;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;Lec3/l;Landroidx/lifecycle/k1;)V", "value", "Ll83/a0;", "setMessageInput", "(Ljava/lang/String;)V", "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;", "messageMode", "setMessageMode", "(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)V", "", "alsoSendToChannel", "setAlsoSendToChannel", "(Z)V", "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "messageAction", "performMessageAction", "(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V", "dismissMessageActions", "()V", "", "Lio/getstream/chat/android/models/Attachment;", "attachments", "addAttachments", "(Ljava/util/List;)V", "attachment", "removeAttachment", "(Lio/getstream/chat/android/models/Attachment;)V", "", "uris", "removeAttachmentsByUris", "(Ljava/util/Set;)V", "clearAttachments", "Lio/getstream/chat/android/models/CreatePollParams;", "createPollParams", "Ln23/h;", "Lio/getstream/chat/android/models/Message;", "onResult", "createPoll", "(Lio/getstream/chat/android/models/CreatePollParams;Lkotlin/jvm/functions/Function1;)V", "clearData", "message", "Lo23/a;", "callback", "Lkotlin/Function2;", "Lq83/d;", "resolveAttachments", "sendMessage", "(Lio/getstream/chat/android/models/Message;Lo23/a;Lc93/m;)V", "buildNewMessage", "(Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/models/Message;", "leaveThread", "onCleared", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "selectMention", "(Lio/getstream/chat/android/models/User;)V", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;", "mention", "(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;)V", "Lio/getstream/chat/android/models/Command;", "command", "selectCommand", "(Lio/getstream/chat/android/models/Command;)V", "clearActiveCommand", "toggleCommandsVisibility", "dismissSuggestionsPopup", "startRecording", "Ll83/k;", "", MapboxMap.QFE_OFFSET, "holdRecording", "(Ll83/k;)V", "lockRecording", "cancelRecording", "toggleRecordingPlayback", "stopRecording", "onComplete", "completeRecording", "(Lkotlin/jvm/functions/Function1;)V", "pauseRecording", NotificationCompat.CATEGORY_PROGRESS, "seekRecordingTo", "(F)V", "sendRecording", "cancelLinkPreview", "setupComposerState", "restoreSession", "observeSessionChanges", "restoreEditMode", "(Lio/getstream/chat/android/models/Message;Ljava/util/List;)V", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;", "source", "setMessageInputInternal", "(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageInput$Source;)V", "saveDraftMessage", "(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lq83/d;)Ljava/lang/Object;", "fetchDraftMessage", "commandName", "restoreDraftCommandIfAvailable", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Command;", "old", "new", "isSameMessageMode", "(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Z", "clearDraftMessage", "enqueueEditMessage", "enqueueSendMessage", "(Lio/getstream/chat/android/models/Message;Lo23/a;)V", "selectedMentions", "", "filterMentions", "(Ljava/util/Set;Ljava/lang/String;)Ljava/util/List;", "syncAttachments", "handleValidationErrors", "stashPreCommandState", "restorePreCommandStateIfAny", "()Z", "discardCommandStash", "orderedForComposer", "(Ljava/util/List;)Ljava/util/List;", "handleMentionSuggestions", "handleCommandSuggestions", "suppressSuggestionsInEditMode", "text", "filteredSuggestionsFor", "(Ljava/lang/String;)Ljava/util/List;", "tryAutoSelectCommand", "(Ljava/lang/String;)Z", "action", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent;", "detectBlockingCommand", "(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerViewEvent;", "", "cooldownInterval", "Ljava/util/Date;", "lastSentMessageDate", "handleLastSentMessageDate", "(ILjava/util/Date;)V", "handleLinkPreview", "(Lq83/d;)Ljava/lang/Object;", "loadLatestMessagesIfNeeded", "sendKeystrokeEvent", "sendStopTypingEvent", QueryParams.URL, "Lo23/d;", "Lio/getstream/chat/android/models/LinkPreview;", "enrichPreview", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)Lo23/d;", "Lio/getstream/chat/android/models/DraftMessage;", "getDraftMessageOrEmpty", "(Lio/getstream/chat/android/ui/common/state/messages/MessageMode;)Lio/getstream/chat/android/models/DraftMessage;", "getDraftMessage", "emptyDraftMessage", "shouldSkipEnrichUrl", "(Lio/getstream/chat/android/models/Message;)Z", "Ljava/lang/String;", "Lio/getstream/chat/android/client/ChatClient;", "Lec3/f2;", "getChannelState", "()Lec3/f2;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;", "Lec3/l;", "channelType", "channelId", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;", "messageValidator", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageValidator;", "currentDraftId", "Lb23/k;", "logger", "Lb23/k;", "Lbc3/c0;", "scope", "Lbc3/c0;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;", "audioRecordingController", "Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;", "Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;", "typingUpdatesBuffer", "Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;", "getTypingUpdatesBuffer", "()Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;", "setTypingUpdatesBuffer", "(Lio/getstream/chat/android/ui/common/utils/typing/TypingUpdatesBuffer;)V", "ownCapabilities", "canSendTypingUpdates", "isSlowModeActive", "isSlowModeDisabled", "", "channelDraftMessages", "threadDraftMessages", "Lec3/o1;", "_inputFocusEvents", "Lec3/o1;", "Lec3/t1;", "inputFocusEvents", "Lec3/t1;", "getInputFocusEvents", "()Lec3/t1;", "_events", "events", "getEvents", "Lec3/p1;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "_selectedAttachments", "Lec3/p1;", "_editModeAttachments", "_editModeMessage", "_recordingAttachment", "Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;", "sessionRepository", "Lio/getstream/chat/android/ui/common/feature/messages/composer/ComposerSessionRepository;", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;", "_state", "state", "getState", "Lio/getstream/chat/android/ui/common/state/messages/MessageInput;", "_messageInput", "messageInput", "getMessageInput", "users", "Ljava/util/List;", "commands", "Lbc3/k1;", "cooldownTimerJob", "Lbc3/k1;", "linkPreviewJob", "dismissedLinkPreviewUrl", "_messageActions", "messageActions", "getMessageActions", "", "Ljava/util/Set;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;", "commandStash", "Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;", "mentionSuggester", "Lio/getstream/chat/android/ui/common/feature/messages/composer/typing/TypingSuggester;", "getActiveAction", "()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "activeAction", "isInEditMode", "getParentMessageId", "()Ljava/lang/String;", "parentMessageId", "getMessageText", "messageText", "isInThread", "Companion", "CommandStash", "Config", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageComposerController {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final C39412p LinkPattern = new C39412p("(http://|https://)?([a-zA-Z0-9]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}))(/[\\w-./?%&=]*)?");
    private static final String MENTION_START_SYMBOL = "@";
    private static final long ONE_SECOND = 1000;
    private static final long TEXT_INPUT_DEBOUNCE_TIME = 300;
    private final InterfaceC13075p1 _editModeAttachments;
    private final InterfaceC13075p1 _editModeMessage;
    private final InterfaceC13072o1 _events;
    private final InterfaceC13072o1 _inputFocusEvents;
    private final InterfaceC13075p1 _messageActions;
    private final InterfaceC13075p1 _messageInput;
    private final InterfaceC13075p1 _recordingAttachment;
    private final InterfaceC13075p1 _selectedAttachments;
    private final InterfaceC13075p1 _state;
    private final AudioRecordingController audioRecordingController;
    private final InterfaceC13037f2 canSendTypingUpdates;
    private final String channelCid;
    private final InterfaceC13037f2 channelDraftMessages;
    private final String channelId;
    private final InterfaceC13037f2 channelState;
    private final String channelType;
    private final ChatClient chatClient;
    private CommandStash commandStash;
    private List<Command> commands;
    private final Config config;
    private InterfaceC3027k1 cooldownTimerJob;
    private String currentDraftId;
    private String dismissedLinkPreviewUrl;
    private final InterfaceC13087t1 events;
    private final InterfaceC13058l globalState;
    private final InterfaceC13087t1 inputFocusEvents;
    private final InterfaceC13037f2 isSlowModeActive;
    private final InterfaceC13037f2 isSlowModeDisabled;
    private InterfaceC3027k1 linkPreviewJob;
    private final C2345k logger;
    private final TypingSuggester mentionSuggester;
    private final InterfaceC13037f2 messageActions;
    private final InterfaceC13037f2 messageInput;
    private final MessageValidator messageValidator;
    private final InterfaceC13037f2 ownCapabilities;
    private final InterfaceC2994c0 scope;
    private final Set<Mention> selectedMentions;
    private final ComposerSessionRepository sessionRepository;
    private final InterfaceC13037f2 state;
    private final InterfaceC13037f2 threadDraftMessages;
    private TypingUpdatesBuffer typingUpdatesBuffer;
    private final UserLookupHandler userLookupHandler;
    private List<User> users;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$2", m100430f = "MessageComposerController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/models/Config;", "it", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/models/Config;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195132 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C195132(InterfaceC30057d<? super C195132> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195132 c195132 = MessageComposerController.this.new C195132(interfaceC30057d);
            c195132.L$0 = obj;
            return c195132;
        }

        public final Object invoke(io.getstream.chat.android.models.Config config, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195132 c195132 = (C195132) create(config, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195132.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            io.getstream.chat.android.models.Config config = (io.getstream.chat.android.models.Config) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            MessageComposerController.this.messageValidator.setMaxMessageLength(config.getMaxMessageLength());
            MessageComposerController.this.commands = config.getCommands();
            InterfaceC13075p1 interfaceC13075p1 = MessageComposerController.this._state;
            MessageComposerState messageComposerStateCopy$default = MessageComposerState.copy$default((MessageComposerState) ((C13045h2) MessageComposerController.this._state).getValue(), null, null, null, null, null, null, null, 0, null, false, null, !MessageComposerController.this.commands.isEmpty(), null, null, config.getPollsEnabled(), false, null, null, 243711, null);
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, messageComposerStateCopy$default);
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((io.getstream.chat.android.models.Config) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$4 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$4", m100430f = "MessageComposerController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "Lio/getstream/chat/android/models/Member;", QueryChannelRequest.KEY_MEMBERS, "Ll83/a0;", "<anonymous>", "(Ljava/util/List;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195144 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C195144(InterfaceC30057d<? super C195144> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195144 c195144 = MessageComposerController.this.new C195144(interfaceC30057d);
            c195144.L$0 = obj;
            return c195144;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((List<Member>) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            MessageComposerController messageComposerController = MessageComposerController.this;
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Member) it.next()).getUser());
            }
            messageComposerController.users = arrayList;
            return C23454a0.f92919a;
        }

        public final Object invoke(List<Member> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195144 c195144 = (C195144) create(list, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195144.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$7 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$7", m100430f = "MessageComposerController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Ll83/k;", "Lio/getstream/chat/android/models/ChannelData;", "Ljava/util/Date;", "<destruct>", "Ll83/a0;", "<anonymous>", "(Ll83/k;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195157 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C195157(InterfaceC30057d<? super C195157> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195157 c195157 = MessageComposerController.this.new C195157(interfaceC30057d);
            c195157.L$0 = obj;
            return c195157;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C23465k) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C23465k c23465k = (C23465k) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ChannelData channelData = (ChannelData) c23465k.f92937w;
            MessageComposerController.this.handleLastSentMessageDate(channelData.getCooldown(), (Date) c23465k.f92938x);
            return C23454a0.f92919a;
        }

        public final Object invoke(C23465k c23465k, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195157 c195157 = (C195157) create(c23465k, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195157.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$CommandStash;", "", "input", "", "attachments", "", "Lio/getstream/chat/android/models/Attachment;", "recordingAttachment", "mentions", "", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/Mention;", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Attachment;Ljava/util/Set;)V", "getInput", "()Ljava/lang/String;", "getAttachments", "()Ljava/util/Map;", "getRecordingAttachment", "()Lio/getstream/chat/android/models/Attachment;", "getMentions", "()Ljava/util/Set;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class CommandStash {
        private final Map<String, Attachment> attachments;
        private final String input;
        private final Set<Mention> mentions;
        private final Attachment recordingAttachment;

        /* JADX WARN: Multi-variable type inference failed */
        public CommandStash(String input, Map<String, Attachment> attachments, Attachment attachment, Set<? extends Mention> mentions) {
            AbstractC22676k.m65750j(input, "input");
            AbstractC22676k.m65750j(attachments, "attachments");
            AbstractC22676k.m65750j(mentions, "mentions");
            this.input = input;
            this.attachments = attachments;
            this.recordingAttachment = attachment;
            this.mentions = mentions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CommandStash copy$default(CommandStash commandStash, String str, Map map, Attachment attachment, Set set, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = commandStash.input;
            }
            if ((i13 & 2) != 0) {
                map = commandStash.attachments;
            }
            if ((i13 & 4) != 0) {
                attachment = commandStash.recordingAttachment;
            }
            if ((i13 & 8) != 0) {
                set = commandStash.mentions;
            }
            return commandStash.copy(str, map, attachment, set);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getInput() {
            return this.input;
        }

        public final Map<String, Attachment> component2() {
            return this.attachments;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Attachment getRecordingAttachment() {
            return this.recordingAttachment;
        }

        public final Set<Mention> component4() {
            return this.mentions;
        }

        public final CommandStash copy(String input, Map<String, Attachment> attachments, Attachment recordingAttachment, Set<? extends Mention> mentions) {
            AbstractC22676k.m65750j(input, "input");
            AbstractC22676k.m65750j(attachments, "attachments");
            AbstractC22676k.m65750j(mentions, "mentions");
            return new CommandStash(input, attachments, recordingAttachment, mentions);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommandStash)) {
                return false;
            }
            CommandStash commandStash = (CommandStash) other;
            return AbstractC22676k.m65745e(this.input, commandStash.input) && AbstractC22676k.m65745e(this.attachments, commandStash.attachments) && AbstractC22676k.m65745e(this.recordingAttachment, commandStash.recordingAttachment) && AbstractC22676k.m65745e(this.mentions, commandStash.mentions);
        }

        public final Map<String, Attachment> getAttachments() {
            return this.attachments;
        }

        public final String getInput() {
            return this.input;
        }

        public final Set<Mention> getMentions() {
            return this.mentions;
        }

        public final Attachment getRecordingAttachment() {
            return this.recordingAttachment;
        }

        public final int hashCode() {
            int iM11821e = AbstractC3855a.m11821e(this.attachments, this.input.hashCode() * 31, 31);
            Attachment attachment = this.recordingAttachment;
            return this.mentions.hashCode() + ((iM11821e + (attachment == null ? 0 : attachment.hashCode())) * 31);
        }

        public final String toString() {
            String str = this.input;
            Map<String, Attachment> map = this.attachments;
            Attachment attachment = this.recordingAttachment;
            Set<Mention> set = this.mentions;
            StringBuilder sbM114686n = AbstractC36095b.m114686n("CommandStash(input=", str, ", attachments=", ", recordingAttachment=", map);
            sbM114686n.append(attachment);
            sbM114686n.append(", mentions=");
            sbM114686n.append(set);
            sbM114686n.append(")");
            return sbM114686n.toString();
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion;", "", "<init>", "()V", "Lyb3/p;", "LinkPattern", "Lyb3/p;", "getLinkPattern$stream_chat_android_ui_common_release", "()Lyb3/p;", "", "MENTION_START_SYMBOL", "Ljava/lang/String;", "", "ONE_SECOND", "J", "TEXT_INPUT_DEBOUNCE_TIME", "CommandText", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {

        @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Companion$CommandText;", "", "<init>", "()V", "Trigger", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "AutoSelectTrigger", "InlineCommand", "isTrigger", "", "text", "", "isAutoSelectTrigger", "autoSelectName", "inlineCommandName", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class CommandText {
            public static final CommandText INSTANCE = new CommandText();
            private static final Pattern Trigger = Pattern.compile("^/[a-z]*$");
            private static final Pattern AutoSelectTrigger = Pattern.compile("^/([a-z]+) $");
            private static final Pattern InlineCommand = Pattern.compile("^/([a-z]+)(?:\\s|$)");

            private CommandText() {
            }

            public final String autoSelectName(String text) {
                AbstractC22676k.m65750j(text, "text");
                Matcher matcher = AutoSelectTrigger.matcher(text);
                if (!matcher.matches()) {
                    matcher = null;
                }
                if (matcher != null) {
                    return matcher.group(1);
                }
                return null;
            }

            public final String inlineCommandName(String text) {
                AbstractC22676k.m65750j(text, "text");
                Matcher matcher = InlineCommand.matcher(text);
                if (!matcher.find()) {
                    matcher = null;
                }
                if (matcher != null) {
                    return matcher.group(1);
                }
                return null;
            }

            public final boolean isAutoSelectTrigger(String text) {
                AbstractC22676k.m65750j(text, "text");
                return AutoSelectTrigger.matcher(text).matches();
            }

            public final boolean isTrigger(String text) {
                AbstractC22676k.m65750j(text, "text");
                return Trigger.matcher(text).find();
            }
        }

        private Companion() {
        }

        public final C39412p getLinkPattern$stream_chat_android_ui_common_release() {
            return MessageComposerController.LinkPattern;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @InternalStreamChatApi
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController$Config;", "", "maxAttachmentCount", "", "linkPreviewEnabled", "", "draftMessageEnabled", "activeCommandEnabled", "<init>", "(IZZZ)V", "getMaxAttachmentCount", "()I", "getLinkPreviewEnabled", "()Z", "getDraftMessageEnabled", "getActiveCommandEnabled", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Config {
        public static final int $stable = 0;
        private final boolean activeCommandEnabled;
        private final boolean draftMessageEnabled;
        private final boolean linkPreviewEnabled;
        private final int maxAttachmentCount;

        public Config() {
            this(0, false, false, false, 15, null);
        }

        public static Config copy$default(Config config, int i13, boolean z4, boolean z13, boolean z14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = config.maxAttachmentCount;
            }
            if ((i14 & 2) != 0) {
                z4 = config.linkPreviewEnabled;
            }
            if ((i14 & 4) != 0) {
                z13 = config.draftMessageEnabled;
            }
            if ((i14 & 8) != 0) {
                z14 = config.activeCommandEnabled;
            }
            config.getClass();
            return new Config(i13, z4, z13, z14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMaxAttachmentCount() {
            return this.maxAttachmentCount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getLinkPreviewEnabled() {
            return this.linkPreviewEnabled;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getDraftMessageEnabled() {
            return this.draftMessageEnabled;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getActiveCommandEnabled() {
            return this.activeCommandEnabled;
        }

        public final Config copy(int maxAttachmentCount, boolean linkPreviewEnabled, boolean draftMessageEnabled, boolean activeCommandEnabled) {
            return new Config(maxAttachmentCount, linkPreviewEnabled, draftMessageEnabled, activeCommandEnabled);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return this.maxAttachmentCount == config.maxAttachmentCount && this.linkPreviewEnabled == config.linkPreviewEnabled && this.draftMessageEnabled == config.draftMessageEnabled && this.activeCommandEnabled == config.activeCommandEnabled;
        }

        public final boolean getActiveCommandEnabled() {
            return this.activeCommandEnabled;
        }

        public final boolean getDraftMessageEnabled() {
            return this.draftMessageEnabled;
        }

        public final boolean getLinkPreviewEnabled() {
            return this.linkPreviewEnabled;
        }

        public final int getMaxAttachmentCount() {
            return this.maxAttachmentCount;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.activeCommandEnabled) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(Integer.hashCode(this.maxAttachmentCount) * 31, 31, this.linkPreviewEnabled), 31, this.draftMessageEnabled);
        }

        public final String toString() {
            int i13 = this.maxAttachmentCount;
            boolean z4 = this.linkPreviewEnabled;
            boolean z13 = this.draftMessageEnabled;
            boolean z14 = this.activeCommandEnabled;
            StringBuilder sb4 = new StringBuilder("Config(maxAttachmentCount=");
            sb4.append(i13);
            sb4.append(", linkPreviewEnabled=");
            sb4.append(z4);
            sb4.append(", draftMessageEnabled=");
            return AbstractC36095b.m114682j(sb4, z13, ", activeCommandEnabled=", z14, ")");
        }

        public Config(int i13, boolean z4, boolean z13, boolean z14) {
            this.maxAttachmentCount = i13;
            this.linkPreviewEnabled = z4;
            this.draftMessageEnabled = z13;
            this.activeCommandEnabled = z14;
        }

        public /* synthetic */ Config(int i13, boolean z4, boolean z13, boolean z14, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? 30 : i13, (i14 & 2) != 0 ? false : z4, (i14 & 4) != 0 ? true : z13, (i14 & 8) != 0 ? false : z14);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$clearData$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$clearData$2", m100430f = "MessageComposerController.kt", m100431l = {764}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195162 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C195162(InterfaceC30057d<? super C195162> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageComposerController.this.new C195162(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195162) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MessageComposerController messageComposerController = MessageComposerController.this;
                MessageMode messageMode = ((MessageComposerState) ((C13045h2) messageComposerController._state).getValue()).getMessageMode();
                this.label = 1;
                if (messageComposerController.clearDraftMessage(messageMode, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$completeRecording$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$completeRecording$1", m100430f = "MessageComposerController.kt", m100431l = {1197, 1203}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195171 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Function1 $onComplete;
        int label;
        final /* synthetic */ MessageComposerController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195171(Function1 function1, MessageComposerController messageComposerController, InterfaceC30057d<? super C195171> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$onComplete = function1;
            this.this$0 = messageComposerController;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C195171(this.$onComplete, this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195171) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        
            if (r5 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        
            if (r5.completeRecording(r4) == r0) goto L21;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L5b
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L32
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                kotlin.jvm.functions.Function1 r5 = r4.$onComplete
                if (r5 == 0) goto L4c
                io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController r5 = r4.this$0
                io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController r5 = io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController.access$getAudioRecordingController$p(r5)
                r4.label = r3
                java.lang.Object r5 = r5.completeRecordingSync(r4)
                if (r5 != r0) goto L32
                goto L5a
            L32:
                n23.h r5 = (n23.AbstractC26205h) r5
                boolean r0 = r5 instanceof n23.C26204g
                if (r0 == 0) goto L46
                io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController r0 = r4.this$0
                r1 = r5
                n23.g r1 = (n23.C26204g) r1
                java.lang.Object r1 = r1.f103919a
                java.util.List r1 = wb3.AbstractC37056f.m118958J(r1)
                r0.addAttachments(r1)
            L46:
                kotlin.jvm.functions.Function1 r0 = r4.$onComplete
                r0.invoke(r5)
                goto L5b
            L4c:
                io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController r5 = r4.this$0
                io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController r5 = io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController.access$getAudioRecordingController$p(r5)
                r4.label = r2
                java.lang.Object r5 = r5.completeRecording(r4)
                if (r5 != r0) goto L5b
            L5a:
                return r0
            L5b:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController.C195171.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$enqueueEditMessage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$enqueueEditMessage$1", m100430f = "MessageComposerController.kt", m100431l = {852}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195181 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC27471a $callback;
        final /* synthetic */ Message $message;
        final /* synthetic */ InterfaceC4351m $resolveAttachments;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ MessageComposerController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195181(InterfaceC4351m interfaceC4351m, Message message, MessageComposerController messageComposerController, InterfaceC27471a interfaceC27471a, InterfaceC30057d<? super C195181> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$resolveAttachments = interfaceC4351m;
            this.$message = message;
            this.this$0 = messageComposerController;
            this.$callback = interfaceC27471a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C195181(this.$resolveAttachments, this.$message, this.this$0, this.$callback, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195181) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x00a4  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objInvoke;
            Message message;
            Message messageCopy;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC4351m interfaceC4351m = this.$resolveAttachments;
                if (interfaceC4351m != null) {
                    Message message2 = this.$message;
                    List<Attachment> attachments = message2.getAttachments();
                    this.L$0 = null;
                    this.L$1 = message2;
                    this.I$0 = 0;
                    this.label = 1;
                    objInvoke = interfaceC4351m.invoke(attachments, this);
                    if (objInvoke == enumC31071a) {
                        return enumC31071a;
                    }
                    message = message2;
                } else {
                    messageCopy = this.$message;
                }
                ((C27478h) this.this$0.chatClient.editMessage(this.this$0.channelType, this.this$0.channelId, messageCopy)).enqueue(this.$callback);
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Message message3 = (Message) this.L$1;
            AbstractC34132o.m107864I(obj);
            objInvoke = obj;
            message = message3;
            messageCopy = message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : (List) objInvoke, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
            if (messageCopy == null) {
                messageCopy = this.$message;
            }
            ((C27478h) this.this$0.chatClient.editMessage(this.this$0.channelType, this.this$0.channelId, messageCopy)).enqueue(this.$callback);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$enqueueSendMessage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$enqueueSendMessage$1", m100430f = "MessageComposerController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195191 extends AbstractC32275i implements Function1 {
        int label;

        public C195191(InterfaceC30057d<? super C195191> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return MessageComposerController.this.new C195191(interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC30057d<? super C23454a0>) obj);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            MessageComposerController.this.loadLatestMessagesIfNeeded();
            return C23454a0.f92919a;
        }

        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195191 c195191 = (C195191) create(interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195191.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$enqueueSendMessage$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$enqueueSendMessage$2", m100430f = "MessageComposerController.kt", m100431l = {872}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "<anonymous>", "(Ln23/h;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195202 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $channelId;
        final /* synthetic */ String $channelType;
        int I$0;
        int I$1;
        int I$2;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195202(String str, String str2, InterfaceC30057d<? super C195202> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$channelType = str;
            this.$channelId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195202 c195202 = MessageComposerController.this.new C195202(this.$channelType, this.$channelId, interfaceC30057d);
            c195202.L$0 = obj;
            return c195202;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13037f2 channelConfig;
            io.getstream.chat.android.models.Config config;
            AbstractC26205h abstractC26205h = (AbstractC26205h) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MessageComposerController messageComposerController = MessageComposerController.this;
                String str = this.$channelType;
                String str2 = this.$channelId;
                if (abstractC26205h instanceof C26204g) {
                    Message message = (Message) ((C26204g) abstractC26205h).f103919a;
                    ChannelState channelState = (ChannelState) messageComposerController.getChannelState().getValue();
                    if (channelState != null && (channelConfig = channelState.getChannelConfig()) != null && (config = (io.getstream.chat.android.models.Config) channelConfig.getValue()) != null && !config.getMarkMessagesPending()) {
                        InterfaceC27474d interfaceC27474dMarkMessageRead = messageComposerController.chatClient.markMessageRead(str, str2, message.getId());
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = abstractC26205h;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.I$2 = 0;
                        this.label = 1;
                        if (((C27481k) interfaceC27474dMarkMessageRead).await(this) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195202) create(abstractC26205h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$handleLastSentMessageDate$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$handleLastSentMessageDate$1", m100430f = "MessageComposerController.kt", m100431l = {1356}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195211 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ int $cooldownInterval;
        final /* synthetic */ long $elapsedTime;
        long J$0;
        int label;
        final /* synthetic */ MessageComposerController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195211(int i13, long j7, MessageComposerController messageComposerController, InterfaceC30057d<? super C195211> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$cooldownInterval = i13;
            this.$elapsedTime = j7;
            this.this$0 = messageComposerController;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C195211(this.$cooldownInterval, this.$elapsedTime, this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195211) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0026  */
        /* JADX WARN: Code duplicated, block: B:13:0x0038 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:14:0x0039). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r9.label
                r2 = -1
                r4 = 1
                if (r1 == 0) goto L19
                if (r1 != r4) goto L11
                long r5 = r9.J$0
                p505ts.AbstractC34132o.m107864I(r10)
                goto L39
            L11:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L19:
                p505ts.AbstractC34132o.m107864I(r10)
                int r10 = r9.$cooldownInterval
                long r5 = (long) r10
                long r7 = r9.$elapsedTime
                long r5 = r5 - r7
            L22:
                int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r10 >= 0) goto L3b
                io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController r10 = r9.this$0
                int r1 = (int) r5
                io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController.access$handleLastSentMessageDate$updateCooldownTime(r10, r1)
                r9.J$0 = r5
                r9.label = r4
                r7 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r10 = bc3.AbstractC3034m0.m8782b(r7, r9)
                if (r10 != r0) goto L39
                return r0
            L39:
                long r5 = r5 + r2
                goto L22
            L3b:
                l83.a0 r10 = l83.C23454a0.f92919a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController.C195211.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$handleLinkPreview$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController", m100430f = "MessageComposerController.kt", m100431l = {1374}, m100432m = "handleLinkPreview")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C195221 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C195221(InterfaceC30057d<? super C195221> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageComposerController.this.handleLinkPreview(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$handleMentionSuggestions$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$handleMentionSuggestions$3", m100430f = "MessageComposerController.kt", m100431l = {1248, 1252}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195233 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $inputText;
        Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$handleMentionSuggestions$3$2, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$handleMentionSuggestions$3$2", m100430f = "MessageComposerController.kt", m100431l = {}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass2 extends AbstractC32275i implements InterfaceC4351m {
            final /* synthetic */ List<User> $result;
            int label;
            final /* synthetic */ MessageComposerController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MessageComposerController messageComposerController, List<User> list, InterfaceC30057d<? super AnonymousClass2> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = messageComposerController;
                this.$result = list;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new AnonymousClass2(this.this$0, this.$result, interfaceC30057d);
            }

            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                anonymousClass2.invokeSuspend(c23454a0);
                return c23454a0;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 interfaceC13075p1 = this.this$0._state;
                List<User> list = this.$result;
                while (true) {
                    C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                    Object value = c13045h2.getValue();
                    InterfaceC13075p1 interfaceC13075p2 = interfaceC13075p1;
                    if (c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, list, null, null, 0, null, false, null, false, null, null, false, false, null, null, 262127, null))) {
                        return C23454a0.f92919a;
                    }
                    interfaceC13075p1 = interfaceC13075p2;
                }
            }

            @Override // c93.InterfaceC4351m
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195233(String str, InterfaceC30057d<? super C195233> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$inputText = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageComposerController.this.new C195233(this.$inputText, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195233) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
        
            if (r10 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
        
            if (bc3.AbstractC3006f0.m8705K(r1, r2, r9) == r0) goto L21;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r9.label
                r2 = 1
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L2a
                if (r1 == r2) goto L22
                if (r1 != r3) goto L1a
                java.lang.Object r0 = r9.L$1
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r9.L$0
                io.getstream.chat.android.ui.common.feature.messages.composer.typing.TypingSuggestion r0 = (io.getstream.chat.android.p226ui.common.feature.messages.composer.typing.TypingSuggestion) r0
                p505ts.AbstractC34132o.m107864I(r10)
                goto L95
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                java.lang.Object r1 = r9.L$0
                io.getstream.chat.android.ui.common.feature.messages.composer.typing.TypingSuggestion r1 = (io.getstream.chat.android.p226ui.common.feature.messages.composer.typing.TypingSuggestion) r1
                p505ts.AbstractC34132o.m107864I(r10)
                goto L76
            L2a:
                p505ts.AbstractC34132o.m107864I(r10)
                io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController r10 = io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController.this
                io.getstream.chat.android.ui.common.feature.messages.composer.typing.TypingSuggester r10 = io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController.access$getMentionSuggester$p(r10)
                java.lang.String r1 = r9.$inputText
                r5 = 0
                io.getstream.chat.android.ui.common.feature.messages.composer.typing.TypingSuggestion r10 = io.getstream.chat.android.p226ui.common.feature.messages.composer.typing.TypingSuggester.typingSuggestion$stream_chat_android_ui_common_release$default(r10, r1, r5, r3, r4)
                io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController r1 = io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController.this
                b23.k r1 = io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController.access$getLogger$p(r1)
                b23.e r5 = r1.f9275c
                java.lang.String r6 = r1.f9273a
                b23.g r7 = b23.EnumC2341g.VERBOSE
                boolean r5 = r5.isLoggable(r7, r6)
                if (r5 == 0) goto L5f
                b23.j r1 = r1.f9274b
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r8 = "[handleMentionSuggestions] suggestion: "
                r5.<init>(r8)
                r5.append(r10)
                java.lang.String r5 = r5.toString()
                r1.log(r7, r6, r5, r4)
            L5f:
                if (r10 == 0) goto L79
                io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController r1 = io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController.this
                io.getstream.chat.android.ui.common.feature.messages.composer.mention.UserLookupHandler r1 = io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController.access$getUserLookupHandler$p(r1)
                java.lang.String r10 = r10.getText()
                r9.L$0 = r4
                r9.label = r2
                java.lang.Object r10 = r1.handleUserLookup(r10, r9)
                if (r10 != r0) goto L76
                goto L94
            L76:
                java.util.List r10 = (java.util.List) r10
                goto L7b
            L79:
                m83.y r10 = m83.C25271y.f99162w
            L7b:
                io.getstream.chat.android.core.internal.coroutines.DispatcherProvider r1 = io.getstream.chat.android.core.internal.coroutines.DispatcherProvider.INSTANCE
                bc3.z r1 = r1.getMain()
                io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$handleMentionSuggestions$3$2 r2 = new io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$handleMentionSuggestions$3$2
                io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController r5 = io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController.this
                r2.<init>(r5, r10, r4)
                r9.L$0 = r4
                r9.L$1 = r4
                r9.label = r3
                java.lang.Object r10 = bc3.AbstractC3006f0.m8705K(r1, r2, r9)
                if (r10 != r0) goto L95
            L94:
                return r0
            L95:
                l83.a0 r10 = l83.C23454a0.f92919a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController.C195233.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$observeSessionChanges$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$observeSessionChanges$1", m100430f = "MessageComposerController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a8\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\t2\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, m65681d2 = {"Ljava/util/LinkedHashMap;", "", "Lio/getstream/chat/android/models/Attachment;", "Lkotlin/collections/LinkedHashMap;", "selected", "Lio/getstream/chat/android/models/Message;", "editMessage", "", "editAttachments", "Ll83/q;", "<anonymous>", "(Ljava/util/LinkedHashMap;Lio/getstream/chat/android/models/Message;Ljava/util/List;)Ll83/q;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195241 extends AbstractC32275i implements InterfaceC4352n {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        public C195241(InterfaceC30057d<? super C195241> interfaceC30057d) {
            super(4, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.L$0;
            Message message = (Message) this.L$1;
            List list = (List) this.L$2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C23471q(linkedHashMap, message, list);
        }

        @Override // c93.InterfaceC4352n
        public final Object invoke(LinkedHashMap<String, Attachment> linkedHashMap, Message message, List<Attachment> list, InterfaceC30057d<? super C23471q> interfaceC30057d) {
            C195241 c195241 = new C195241(4, interfaceC30057d);
            c195241.L$0 = linkedHashMap;
            c195241.L$1 = message;
            c195241.L$2 = list;
            return c195241.invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$observeSessionChanges$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$observeSessionChanges$2", m100430f = "MessageComposerController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2<\u0010\u0007\u001a8\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m65681d2 = {"Ll83/q;", "Ljava/util/LinkedHashMap;", "", "Lio/getstream/chat/android/models/Attachment;", "Lkotlin/collections/LinkedHashMap;", "Lio/getstream/chat/android/models/Message;", "", "<destruct>", "Ll83/a0;", "<anonymous>", "(Ll83/q;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195252 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C195252(InterfaceC30057d<? super C195252> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195252 c195252 = MessageComposerController.this.new C195252(interfaceC30057d);
            c195252.L$0 = obj;
            return c195252;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C23471q) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C23471q c23471q = (C23471q) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            LinkedHashMap linkedHashMap = (LinkedHashMap) c23471q.f92947w;
            Message message = (Message) c23471q.f92948x;
            List list = (List) c23471q.f92949y;
            ComposerSessionRepository composerSessionRepository = MessageComposerController.this.sessionRepository;
            Collection collectionValues = linkedHashMap.values();
            AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
            composerSessionRepository.save(AbstractC25265s.m74093D1(collectionValues), message != null ? new ComposerSessionRepository.EditMode(message, list) : null);
            return C23454a0.f92919a;
        }

        public final Object invoke(C23471q c23471q, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195252 c195252 = (C195252) create(c23471q, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195252.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$onCleared$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$onCleared$1", m100430f = "MessageComposerController.kt", m100431l = {966}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195261 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C195261(InterfaceC30057d<? super C195261> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageComposerController.this.new C195261(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195261) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MessageComposerController messageComposerController = MessageComposerController.this;
                MessageMode messageMode = ((MessageComposerState) ((C13045h2) messageComposerController._state).getValue()).getMessageMode();
                this.label = 1;
                if (messageComposerController.saveDraftMessage(messageMode, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC3006f0.m8714h(MessageComposerController.this.scope, null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$sendMessage$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$sendMessage$3", m100430f = "MessageComposerController.kt", m100431l = {837}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195273 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC27471a $callback;
        final /* synthetic */ Message $preparedMessage;
        final /* synthetic */ InterfaceC4351m $resolveAttachments;
        int label;
        final /* synthetic */ MessageComposerController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195273(InterfaceC4351m interfaceC4351m, Message message, MessageComposerController messageComposerController, InterfaceC27471a interfaceC27471a, InterfaceC30057d<? super C195273> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$resolveAttachments = interfaceC4351m;
            this.$preparedMessage = message;
            this.this$0 = messageComposerController;
            this.$callback = interfaceC27471a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C195273(this.$resolveAttachments, this.$preparedMessage, this.this$0, this.$callback, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195273) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objInvoke;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC4351m interfaceC4351m = this.$resolveAttachments;
                List<Attachment> attachments = this.$preparedMessage.getAttachments();
                this.label = 1;
                objInvoke = interfaceC4351m.invoke(attachments, this);
                if (objInvoke == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objInvoke = obj;
            }
            MessageComposerController messageComposerController = this.this$0;
            Message message = this.$preparedMessage;
            messageComposerController.enqueueSendMessage(message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : (List) objInvoke, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false), this.$callback);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$sendRecording$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$sendRecording$1", m100430f = "MessageComposerController.kt", m100431l = {1225}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195281 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C195281(InterfaceC30057d<? super C195281> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageComposerController.this.new C195281(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195281) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AudioRecordingController audioRecordingController = MessageComposerController.this.audioRecordingController;
                this.label = 1;
                obj = audioRecordingController.completeRecordingSync(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
            MessageComposerController messageComposerController = MessageComposerController.this;
            if (abstractC26205h instanceof C26204g) {
                ((C13045h2) messageComposerController._recordingAttachment).m36570j((Attachment) ((C26204g) abstractC26205h).f103919a);
                messageComposerController.syncAttachments();
                MessageComposerController.sendMessage$default(messageComposerController, messageComposerController.buildNewMessage(((MessageInput) ((C13045h2) messageComposerController._messageInput).getValue()).getText(), ((MessageComposerState) ((C13045h2) messageComposerController._state).getValue()).getAttachments()), MessageComposerController$sendRecording$1$1$1.INSTANCE, null, 4, null);
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setMessageMode$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setMessageMode$1", m100430f = "MessageComposerController.kt", m100431l = {606}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195291 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ MessageMode $messageMode;
        final /* synthetic */ MessageMode $previousMode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195291(MessageMode messageMode, MessageMode messageMode2, InterfaceC30057d<? super C195291> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$previousMode = messageMode;
            this.$messageMode = messageMode2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageComposerController.this.new C195291(this.$previousMode, this.$messageMode, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195291) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 interfaceC13075p1 = MessageComposerController.this._state;
                MessageMode messageMode = this.$messageMode;
                while (true) {
                    C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                    Object value = c13045h2.getValue();
                    InterfaceC13075p1 interfaceC13075p2 = interfaceC13075p1;
                    if (c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, null, null, 0, messageMode, false, null, false, null, null, false, false, null, null, 261887, null))) {
                        break;
                    }
                    interfaceC13075p1 = interfaceC13075p2;
                }
                MessageComposerController messageComposerController = MessageComposerController.this;
                MessageMode messageMode2 = this.$previousMode;
                this.label = 1;
                if (messageComposerController.saveDraftMessage(messageMode2, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            MessageComposerController.this.fetchDraftMessage(this.$messageMode);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$1", m100430f = "MessageComposerController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/MessageInput;", "value", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/ui/common/state/messages/MessageInput;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195301 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C195301(InterfaceC30057d<? super C195301> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195301 c195301 = MessageComposerController.this.new C195301(interfaceC30057d);
            c195301.L$0 = obj;
            return c195301;
        }

        public final Object invoke(MessageInput messageInput, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195301 c195301 = (C195301) create(messageInput, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195301.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            MessageInput messageInput = (MessageInput) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC13075p1 interfaceC13075p1 = MessageComposerController.this._state;
            MessageComposerState messageComposerStateCopy$default = MessageComposerState.copy$default((MessageComposerState) ((C13045h2) MessageComposerController.this._state).getValue(), messageInput.getText(), null, null, null, null, null, null, 0, null, false, null, false, null, null, false, false, null, null, 262142, null);
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, messageComposerStateCopy$default);
            if (((Boolean) MessageComposerController.this.canSendTypingUpdates.getValue()).booleanValue()) {
                MessageComposerController.this.getTypingUpdatesBuffer().onKeystroke(messageInput.getText());
            }
            MessageComposerController.this.handleCommandSuggestions();
            MessageComposerController.this.handleValidationErrors();
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((MessageInput) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$2", m100430f = "MessageComposerController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/MessageInput;", "it", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/ui/common/state/messages/MessageInput;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195312 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$2$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$2$1", m100430f = "MessageComposerController.kt", m100431l = {}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            int label;
            final /* synthetic */ MessageComposerController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MessageComposerController messageComposerController, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = messageComposerController;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new AnonymousClass1(this.this$0, interfaceC30057d);
            }

            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                anonymousClass1.invokeSuspend(c23454a0);
                return c23454a0;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.this$0.handleMentionSuggestions();
                return C23454a0.f92919a;
            }

            @Override // c93.InterfaceC4351m
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$2$2, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$2$2", m100430f = "MessageComposerController.kt", m100431l = {427}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass2 extends AbstractC32275i implements InterfaceC4351m {
            int label;
            final /* synthetic */ MessageComposerController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MessageComposerController messageComposerController, InterfaceC30057d<? super AnonymousClass2> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = messageComposerController;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new AnonymousClass2(this.this$0, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((AnonymousClass2) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.label;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    MessageComposerController messageComposerController = this.this$0;
                    this.label = 1;
                    if (messageComposerController.handleLinkPreview(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        public C195312(InterfaceC30057d<? super C195312> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageComposerController.this.new C195312(interfaceC30057d);
        }

        public final Object invoke(MessageInput messageInput, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195312 c195312 = (C195312) create(messageInput, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195312.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC3006f0.m8732z(MessageComposerController.this.scope, null, null, new AnonymousClass1(MessageComposerController.this, null), 3);
            InterfaceC3027k1 interfaceC3027k1 = MessageComposerController.this.linkPreviewJob;
            if (interfaceC3027k1 != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
            MessageComposerController messageComposerController = MessageComposerController.this;
            messageComposerController.linkPreviewJob = AbstractC3006f0.m8732z(messageComposerController.scope, null, null, new AnonymousClass2(MessageComposerController.this, null), 3);
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((MessageInput) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$3", m100430f = "MessageComposerController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "actions", "Ll83/a0;", "<anonymous>", "(Ljava/util/Set;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195323 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C195323(InterfaceC30057d<? super C195323> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195323 c195323 = MessageComposerController.this.new C195323(interfaceC30057d);
            c195323.L$0 = obj;
            return c195323;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Set<? extends MessageAction>) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13045h2 c13045h2;
            Object value;
            Set set = (Set) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Object obj2 = null;
            for (Object obj3 : set) {
                MessageAction messageAction = (MessageAction) obj3;
                if ((messageAction instanceof Edit) || (messageAction instanceof Reply)) {
                    obj2 = obj3;
                }
            }
            MessageAction messageAction2 = (MessageAction) obj2;
            InterfaceC13075p1 interfaceC13075p1 = MessageComposerController.this._state;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
            } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, messageAction2, null, null, null, null, 0, null, false, null, false, null, null, false, false, null, null, 262139, null)));
            MessageComposerController.this.handleCommandSuggestions();
            return C23454a0.f92919a;
        }

        public final Object invoke(Set<? extends MessageAction> set, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195323 c195323 = (C195323) create(set, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195323.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$4 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$4", m100430f = "MessageComposerController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "", "ownCapabilities", "Ll83/a0;", "<anonymous>", "(Ljava/util/Set;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195334 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C195334(InterfaceC30057d<? super C195334> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195334 c195334 = MessageComposerController.this.new C195334(interfaceC30057d);
            c195334.L$0 = obj;
            return c195334;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Set<String>) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Set set = (Set) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC13075p1 interfaceC13075p1 = MessageComposerController.this._state;
            MessageComposerState messageComposerStateCopy$default = MessageComposerState.copy$default((MessageComposerState) ((C13045h2) MessageComposerController.this._state).getValue(), null, null, null, null, null, null, null, 0, null, false, set, false, null, null, false, false, null, null, 261119, null);
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, messageComposerStateCopy$default);
            return C23454a0.f92919a;
        }

        public final Object invoke(Set<String> set, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195334 c195334 = (C195334) create(set, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195334.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$5 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$5", m100430f = "MessageComposerController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/models/User;", "currentUser", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/models/User;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195345 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C195345(InterfaceC30057d<? super C195345> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195345 c195345 = MessageComposerController.this.new C195345(interfaceC30057d);
            c195345.L$0 = obj;
            return c195345;
        }

        public final Object invoke(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195345 c195345 = (C195345) create(user, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195345.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            User user = (User) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC13075p1 interfaceC13075p1 = MessageComposerController.this._state;
            MessageComposerState messageComposerStateCopy$default = MessageComposerState.copy$default((MessageComposerState) ((C13045h2) MessageComposerController.this._state).getValue(), null, null, null, null, null, null, null, 0, null, false, null, false, user, null, false, false, null, null, 258047, null);
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, messageComposerStateCopy$default);
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((User) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$6 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$6", m100430f = "MessageComposerController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;", "recording", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195356 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C195356(InterfaceC30057d<? super C195356> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195356 c195356 = MessageComposerController.this.new C195356(interfaceC30057d);
            c195356.L$0 = obj;
            return c195356;
        }

        public final Object invoke(RecordingState recordingState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195356 c195356 = (C195356) create(recordingState, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195356.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            RecordingState recordingState = (RecordingState) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C2345k c2345k = MessageComposerController.this.logger;
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, AbstractC17176i.m48502d("[onRecordingState] recording: ", recordingState), null);
            }
            if (recordingState instanceof RecordingState.Complete) {
                ((C13045h2) MessageComposerController.this._recordingAttachment).m36570j(((RecordingState.Complete) recordingState).getAttachment());
            }
            InterfaceC13075p1 interfaceC13075p1 = MessageComposerController.this._state;
            while (true) {
                C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                Object value = c13045h2.getValue();
                RecordingState recordingState2 = recordingState;
                if (c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, null, null, 0, null, false, null, false, null, recordingState2, false, false, null, null, 253951, null))) {
                    MessageComposerController.this.syncAttachments();
                    return C23454a0.f92919a;
                }
                recordingState = recordingState2;
            }
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((RecordingState) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$7 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$7", m100430f = "MessageComposerController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"", "", "Lio/getstream/chat/android/models/DraftMessage;", "it", "Ll83/a0;", "<anonymous>", "(Ljava/util/Map;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195367 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C195367(InterfaceC30057d<? super C195367> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195367 c195367 = MessageComposerController.this.new C195367(interfaceC30057d);
            c195367.L$0 = obj;
            return c195367;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Map<String, DraftMessage>) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            Map map = (Map) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (map.get(MessageComposerController.this.channelCid) == null && (str = MessageComposerController.this.currentDraftId) != null && str.length() != 0 && (((MessageComposerState) ((C13045h2) MessageComposerController.this._state).getValue()).getMessageMode() instanceof MessageMode.Normal)) {
                MessageComposerController.this.clearData();
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(Map<String, DraftMessage> map, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195367 c195367 = (C195367) create(map, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195367.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$8 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$setupComposerState$8", m100430f = "MessageComposerController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"", "", "Lio/getstream/chat/android/models/DraftMessage;", "it", "Ll83/a0;", "<anonymous>", "(Ljava/util/Map;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195378 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C195378(InterfaceC30057d<? super C195378> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195378 c195378 = MessageComposerController.this.new C195378(interfaceC30057d);
            c195378.L$0 = obj;
            return c195378;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Map<String, DraftMessage>) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            Map map = (Map) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (map.get(MessageComposerController.this.getParentMessageId()) == null && (str = MessageComposerController.this.currentDraftId) != null && str.length() != 0 && (((MessageComposerState) ((C13045h2) MessageComposerController.this._state).getValue()).getMessageMode() instanceof MessageMode.MessageThread)) {
                MessageComposerController.this.clearData();
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(Map<String, DraftMessage> map, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195378 c195378 = (C195378) create(map, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195378.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$startRecording$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$startRecording$1", m100430f = "MessageComposerController.kt", m100431l = {1152}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195421 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C195421(InterfaceC30057d<? super C195421> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageComposerController.this.new C195421(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195421) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AudioRecordingController audioRecordingController = MessageComposerController.this.audioRecordingController;
                this.label = 1;
                if (audioRecordingController.startRecording(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$stopRecording$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$stopRecording$1", m100430f = "MessageComposerController.kt", m100431l = {1183}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195431 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C195431(InterfaceC30057d<? super C195431> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageComposerController.this.new C195431(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195431) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AudioRecordingController audioRecordingController = MessageComposerController.this.audioRecordingController;
                this.label = 1;
                if (audioRecordingController.stopRecording(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageComposerController(String channelCid, ChatClient chatClient, InterfaceC13037f2 channelState, InterfaceC32094g mediaRecorder, UserLookupHandler userLookupHandler, Function1 fileToUri, Config config, InterfaceC13058l globalState, C1601k1 savedStateHandle) {
        AbstractC22676k.m65750j(channelCid, "channelCid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(channelState, "channelState");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
        AbstractC22676k.m65750j(userLookupHandler, "userLookupHandler");
        AbstractC22676k.m65750j(fileToUri, "fileToUri");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(globalState, "globalState");
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        this.channelCid = channelCid;
        this.chatClient = chatClient;
        this.channelState = channelState;
        this.userLookupHandler = userLookupHandler;
        this.config = config;
        this.globalState = globalState;
        this.channelType = (String) StringExtensionsKt.cidToTypeAndId(channelCid).f92937w;
        this.channelId = (String) StringExtensionsKt.cidToTypeAndId(channelCid).f92938x;
        this.messageValidator = new MessageValidator(chatClient.getAppSettings(), config.getMaxAttachmentCount(), false, 0, 12, null);
        this.logger = new C2345k("Chat:MessageComposerController", C2343i.f9271c, C2343i.f9272d);
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getImmediate());
        this.scope = c17171dM8708b;
        this.audioRecordingController = new AudioRecordingController(chatClient.getAudioPlayer(), mediaRecorder, fileToUri, c17171dM8708b);
        this.typingUpdatesBuffer = new DefaultTypingUpdatesBuffer(c17171dM8708b, new MessageComposerController$typingUpdatesBuffer$1(this), new MessageComposerController$typingUpdatesBuffer$2(this));
        final C14380k c14380kM36590P = AbstractC13091v.m36590P(new C4588i(channelState, 2), new MessageComposerController$special$$inlined$flatMapLatest$1(3, null));
        InterfaceC13058l interfaceC13058l = new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$special$$inlined$map$1

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$special$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C195382<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;
                final /* synthetic */ MessageComposerController this$0;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$special$$inlined$map$1$2", m100430f = "MessageComposerController.kt", m100431l = {50}, m100432m = "emit")
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C195382.this.emit(null, this);
                    }
                }

                public C195382(InterfaceC13062m interfaceC13062m, MessageComposerController messageComposerController) {
                    this.$this_unsafeFlow = interfaceC13062m;
                    this.this$0 = messageComposerController;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        ChannelData channelData = (ChannelData) obj;
                        this.this$0.messageValidator.setCanSendLinks(channelData.getOwnCapabilities().contains(ChannelCapabilities.SEND_LINKS));
                        Set<String> ownCapabilities = channelData.getOwnCapabilities();
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(ownCapabilities, anonymousClass1) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            @Override // ec3.InterfaceC13058l
            public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = c14380kM36590P.collect(new C195382(interfaceC13062m, this), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        };
        C13021b2 c13021b2 = C13105z1.f45288a;
        final C13081r1 c13081r1M36587M = AbstractC13091v.m36587M(interfaceC13058l, c17171dM8708b, c13021b2, C25235a0.f99113w);
        this.ownCapabilities = c13081r1M36587M;
        InterfaceC13058l interfaceC13058l2 = new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$special$$inlined$map$2

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$special$$inlined$map$2$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C195392<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$special$$inlined$map$2$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$special$$inlined$map$2$2", m100430f = "MessageComposerController.kt", m100431l = {50}, m100432m = "emit")
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C195392.this.emit(null, this);
                    }
                }

                public C195392(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        Set set = (Set) obj;
                        Boolean boolValueOf = Boolean.valueOf(set.contains(ChannelCapabilities.TYPING_EVENTS) || set.contains(ChannelCapabilities.SEND_TYPING_EVENTS));
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(boolValueOf, anonymousClass1) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            @Override // ec3.InterfaceC13058l
            public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = c13081r1M36587M.collect(new C195392(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        };
        Boolean bool = Boolean.FALSE;
        this.canSendTypingUpdates = AbstractC13091v.m36587M(interfaceC13058l2, c17171dM8708b, c13021b2, bool);
        this.isSlowModeActive = AbstractC13091v.m36587M(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$special$$inlined$map$3

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$special$$inlined$map$3$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C195402<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$special$$inlined$map$3$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$special$$inlined$map$3$2", m100430f = "MessageComposerController.kt", m100431l = {50}, m100432m = "emit")
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C195402.this.emit(null, this);
                    }
                }

                public C195402(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        Boolean boolValueOf = Boolean.valueOf(((Set) obj).contains(ChannelCapabilities.SLOW_MODE));
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(boolValueOf, anonymousClass1) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            @Override // ec3.InterfaceC13058l
            public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = c13081r1M36587M.collect(new C195402(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, c17171dM8708b, c13021b2, bool);
        this.isSlowModeDisabled = AbstractC13091v.m36587M(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$special$$inlined$map$4

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$special$$inlined$map$4$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C195412<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$special$$inlined$map$4$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.MessageComposerController$special$$inlined$map$4$2", m100430f = "MessageComposerController.kt", m100431l = {50}, m100432m = "emit")
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C195412.this.emit(null, this);
                    }
                }

                public C195412(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        Boolean boolValueOf = Boolean.valueOf(((Set) obj).contains(ChannelCapabilities.SKIP_SLOW_MODE));
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(boolValueOf, anonymousClass1) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            @Override // ec3.InterfaceC13058l
            public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = c13081r1M36587M.collect(new C195412(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, c17171dM8708b, c13021b2, bool);
        C14380k c14380kM36590P2 = AbstractC13091v.m36590P(globalState, new MessageComposerController$special$$inlined$flatMapLatest$2(3, null));
        C25272z c25272z = C25272z.f99163w;
        this.channelDraftMessages = AbstractC13091v.m36587M(c14380kM36590P2, c17171dM8708b, c13021b2, c25272z);
        this.threadDraftMessages = AbstractC13091v.m36587M(AbstractC13091v.m36590P(globalState, new MessageComposerController$special$$inlined$flatMapLatest$3(3, null)), c17171dM8708b, c13021b2, c25272z);
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 1, null, 5);
        this._inputFocusEvents = c13096w1M36592b;
        this.inputFocusEvents = AbstractC13091v.m36597g(c13096w1M36592b);
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 1, null, 5);
        this._events = c13096w1M36592b2;
        this.events = AbstractC13091v.m36597g(c13096w1M36592b2);
        this._selectedAttachments = AbstractC13091v.m36593c(new LinkedHashMap());
        C25271y c25271y = C25271y.f99162w;
        this._editModeAttachments = AbstractC13091v.m36593c(c25271y);
        this._editModeMessage = AbstractC13091v.m36593c(null);
        this._recordingAttachment = AbstractC13091v.m36593c(null);
        this.sessionRepository = new ComposerSessionRepository(savedStateHandle);
        Object[] objArr = 0 == true ? 1 : 0;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new MessageComposerState(null, null, null, null, null, null, null, 0, objArr, false, null, false, null, null, false, false, null, null, 262143, null));
        this._state = c13045h2M36593c;
        this.state = AbstractC13091v.m36598h(c13045h2M36593c);
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(new MessageInput(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        this._messageInput = c13045h2M36593c2;
        this.messageInput = AbstractC13091v.m36598h(c13045h2M36593c2);
        this.users = c25271y;
        this.commands = c25271y;
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c(new LinkedHashSet());
        this._messageActions = c13045h2M36593c3;
        this.messageActions = AbstractC13091v.m36598h(c13045h2M36593c3);
        this.selectedMentions = new LinkedHashSet();
        this.mentionSuggester = new TypingSuggester(new TypingSuggestionOptions(MENTION_START_SYMBOL, false, 0, 6, 0 == true ? 1 : 0));
        int i13 = 0;
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36590P(new C4588i(channelState, 2), new MessageComposerController$special$$inlined$flatMapLatest$4(3, null)), new C195132(null), i13), c17171dM8708b);
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36590P(new C4588i(channelState, 2), new MessageComposerController$special$$inlined$flatMapLatest$5(3, null)), new C195144(null), i13), c17171dM8708b);
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36611u(AbstractC13091v.m36590P(new C4588i(channelState, 2), new MessageComposerController$special$$inlined$flatMapLatest$6(3, null)), new C19336c(19), AbstractC13091v.f45232b), new C195157(null), 0), c17171dM8708b);
        setupComposerState();
        restoreSession();
        observeSessionChanges();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date _init_$lambda$12(C23465k c23465k) {
        AbstractC22676k.m65750j(c23465k, "<destruct>");
        return (Date) c23465k.f92938x;
    }

    public static final /* synthetic */ Object access$lambda$11$lambda$10(ChannelData channelData, Date date, InterfaceC30057d interfaceC30057d) {
        return new C23465k(channelData, date);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Message buildNewMessage$default(MessageComposerController messageComposerController, String str, List list, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            list = C25271y.f99162w;
        }
        return messageComposerController.buildNewMessage(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearDraftMessage(MessageMode messageMode, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        DraftMessage draftMessage;
        boolean draftMessageEnabled = this.config.getDraftMessageEnabled();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (draftMessageEnabled && (draftMessage = getDraftMessage(messageMode)) != null) {
            Object objAwait = ((C27481k) this.chatClient.deleteDraftMessages(this.channelType, this.channelId, draftMessage)).await(interfaceC30057d);
            if (objAwait == EnumC31071a.f128113w) {
                return objAwait;
            }
        }
        return c23454a0;
    }

    public static /* synthetic */ void completeRecording$default(MessageComposerController messageComposerController, Function1 function1, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            function1 = null;
        }
        messageComposerController.completeRecording(function1);
    }

    public static /* synthetic */ void createPoll$default(MessageComposerController messageComposerController, CreatePollParams createPollParams, Function1 function1, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            function1 = new C19336c(20);
        }
        messageComposerController.createPoll(createPollParams, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 createPoll$lambda$37(AbstractC26205h it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createPoll$lambda$38(Function1 function1, AbstractC26205h it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
    }

    private final MessageComposerViewEvent detectBlockingCommand(String text, MessageAction action) {
        String strInlineCommandName;
        Object next;
        if (!this.config.getActiveCommandEnabled() || action == null || (strInlineCommandName = Companion.CommandText.INSTANCE.inlineCommandName(text)) == null) {
            return null;
        }
        Iterator<T> it = this.commands.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((Command) next).getName(), strInlineCommandName));
        Command command = (Command) next;
        if (command == null || CommandAvailabilityKt.isAvailableFor(command, action)) {
            return null;
        }
        return new MessageComposerViewEvent.CommandUnavailable(action);
    }

    private final void discardCommandStash() {
        this.commandStash = null;
    }

    private final DraftMessage emptyDraftMessage(MessageMode messageMode) {
        if (messageMode instanceof MessageMode.MessageThread) {
            return new DraftMessage(null, this.channelCid, null, ((MessageMode.MessageThread) messageMode).getParentMessage().getId(), null, null, null, false, false, null, null, null, 4085, null);
        }
        return new DraftMessage(null, this.channelCid, null, null, null, null, null, false, false, null, null, null, 4093, null);
    }

    private final void enqueueEditMessage(Message message, InterfaceC27471a callback, InterfaceC4351m resolveAttachments) {
        AbstractC3006f0.m8732z(this.scope, null, null, new C195181(resolveAttachments, message, this, callback, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueSendMessage(Message message, InterfaceC27471a callback) {
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(message.getCid());
        String str = (String) c23465kCidToTypeAndId.f92937w;
        String str2 = (String) c23465kCidToTypeAndId.f92938x;
        AbstractC27476f.m82903a(AbstractC27476f.m82904b(ChatClient.sendMessage$default(this.chatClient, str, str2, message, false, 8, null), this.scope, new C195191(null)), this.scope, new C195202(str, str2, null)).enqueue(callback);
    }

    private final InterfaceC27474d enrichPreview(ChatClient chatClient, String str) {
        return AbstractC27476f.m82909g(chatClient.enrichUrl(StringKt.addSchemeToUrlIfNeeded(str)), new C17632d(str, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkPreview enrichPreview$lambda$73(String str, Attachment it) {
        AbstractC22676k.m65750j(it, "it");
        return new LinkPreview(str, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchDraftMessage(MessageMode messageMode) {
        C13045h2 c13045h2;
        Object value;
        String text;
        if (this.config.getDraftMessageEnabled()) {
            InterfaceC13075p1 interfaceC13075p1 = this._state;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
            } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, null, null, 0, null, false, null, false, null, null, false, false, null, null, 131071, null)));
            this.commandStash = null;
            DraftMessage draftMessageOrEmpty = getDraftMessageOrEmpty(messageMode);
            this.currentDraftId = draftMessageOrEmpty.getId();
            Message replyMessage = draftMessageOrEmpty.getReplyMessage();
            if (replyMessage != null) {
                performMessageAction(new Reply(replyMessage));
            } else {
                InterfaceC13075p1 interfaceC13075p2 = this._messageActions;
                Iterable iterable = (Iterable) ((C13045h2) interfaceC13075p2).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (!(((MessageAction) obj) instanceof Reply)) {
                        arrayList.add(obj);
                    }
                }
                Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
                C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
                c13045h3.getClass();
                c13045h3.m36571k(null, setM74103I1);
            }
            if (restoreDraftCommandIfAvailable(draftMessageOrEmpty.getCommand()) == null || (text = draftMessageOrEmpty.getArgs()) == null) {
                text = draftMessageOrEmpty.getText();
            }
            setMessageInputInternal(text, MessageInput.Source.DraftMessage.INSTANCE);
            setAlsoSendToChannel(draftMessageOrEmpty.getShowInChannel());
        }
    }

    private final List<String> filterMentions(Set<? extends Mention> selectedMentions, String message) {
        C13045h2 c13045h2;
        Object value;
        ArrayList arrayList = new ArrayList();
        for (Object obj : selectedMentions) {
            if (obj instanceof Mention.User) {
                arrayList.add(obj);
            }
        }
        String lowerCase = message.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            String lowerCase2 = ((Mention.User) obj2).getDisplay().toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
            if (AbstractC39414r.m125876U(lowerCase, MENTION_START_SYMBOL.concat(lowerCase2), false)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Mention.User) it.next()).getUser().getId());
        }
        this.selectedMentions.clear();
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, null, null, 0, null, false, null, false, null, null, false, false, C25235a0.f99113w, null, 196607, null)));
        return AbstractC25265s.m74097F1(arrayList3);
    }

    private final List<Command> filteredSuggestionsFor(String text) {
        if (!Companion.CommandText.INSTANCE.isTrigger(text)) {
            return C25271y.f99162w;
        }
        String strM125898q0 = AbstractC39414r.m125898q0(text, "/");
        List<Command> list = this.commands;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (AbstractC39421y.m125930O(((Command) obj).getName(), strM125898q0, false)) {
                arrayList.add(obj);
            }
        }
        return orderedForComposer(arrayList);
    }

    private final MessageAction getActiveAction() {
        Object obj = null;
        for (Object obj2 : (Iterable) ((C13045h2) this._messageActions).getValue()) {
            MessageAction messageAction = (MessageAction) obj2;
            if ((messageAction instanceof Edit) || (messageAction instanceof Reply)) {
                obj = obj2;
            }
        }
        return (MessageAction) obj;
    }

    private final DraftMessage getDraftMessage(MessageMode messageMode) {
        return messageMode instanceof MessageMode.MessageThread ? (DraftMessage) ((Map) this.threadDraftMessages.getValue()).get(((MessageMode.MessageThread) messageMode).getParentMessage().getId()) : (DraftMessage) ((Map) this.channelDraftMessages.getValue()).get(this.channelCid);
    }

    private final DraftMessage getDraftMessageOrEmpty(MessageMode messageMode) {
        DraftMessage draftMessage = getDraftMessage(messageMode);
        return draftMessage == null ? emptyDraftMessage(messageMode) : draftMessage;
    }

    private final String getMessageText() {
        return ((MessageInput) ((C13045h2) this._messageInput).getValue()).getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getParentMessageId() {
        Message parentMessage;
        MessageMode messageMode = ((MessageComposerState) ((C13045h2) this._state).getValue()).getMessageMode();
        MessageMode.MessageThread messageThread = messageMode instanceof MessageMode.MessageThread ? (MessageMode.MessageThread) messageMode : null;
        if (messageThread == null || (parentMessage = messageThread.getParentMessage()) == null) {
            return null;
        }
        return parentMessage.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCommandSuggestions() {
        C13045h2 c13045h2;
        Object value;
        if (tryAutoSelectCommand(getMessageText()) || suppressSuggestionsInEditMode()) {
            return;
        }
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, filteredSuggestionsFor(getMessageText()), null, 0, null, false, null, false, null, null, false, false, null, null, 262111, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLastSentMessageDate(int cooldownInterval, Date lastSentMessageDate) {
        if (cooldownInterval <= 0 || !((Boolean) this.isSlowModeActive.getValue()).booleanValue() || ((Boolean) this.isSlowModeDisabled.getValue()).booleanValue() || lastSentMessageDate == null || (getActiveAction() instanceof Edit)) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - lastSentMessageDate.getTime());
        long j7 = seconds < 0 ? 0L : seconds;
        if (j7 >= cooldownInterval) {
            handleLastSentMessageDate$updateCooldownTime(this, 0);
            return;
        }
        InterfaceC3027k1 interfaceC3027k1 = this.cooldownTimerJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.cooldownTimerJob = AbstractC3006f0.m8732z(this.scope, null, null, new C195211(cooldownInterval, j7, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleLastSentMessageDate$updateCooldownTime(MessageComposerController messageComposerController, int i13) {
        C13045h2 c13045h2;
        Object value;
        InterfaceC13075p1 interfaceC13075p1 = messageComposerController._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, null, null, i13, null, false, null, false, null, null, false, false, null, null, 262015, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object handleLinkPreview(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C195221 c195221;
        LinkPreview linkPreview;
        C2345k c2345k;
        InterfaceC2339e interfaceC2339e;
        String str;
        EnumC2341g enumC2341g;
        InterfaceC13075p1 interfaceC13075p1;
        C13045h2 c13045h2;
        Object value;
        String originUrl;
        if (interfaceC30057d instanceof C195221) {
            c195221 = (C195221) interfaceC30057d;
            int i13 = c195221.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c195221.label = i13 - Integer.MIN_VALUE;
            } else {
                c195221 = new C195221(interfaceC30057d);
            }
        } else {
            c195221 = new C195221(interfaceC30057d);
        }
        Object objAwait = c195221.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c195221.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAwait);
            C39410n c39410nM125848a = LinkPattern.m125848a(getMessageText());
            String strM125845c = c39410nM125848a != null ? c39410nM125848a.m125845c() : null;
            C2345k c2345k2 = this.logger;
            InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
            String str2 = c2345k2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                c2345k2.f9274b.log(enumC2341g2, str2, AbstractC11266d.m30461o("[handleLinkPreview] url: ", strM125845c), null);
            }
            if (strM125845c != null) {
                if (!this.config.getLinkPreviewEnabled() || strM125845c.equalsIgnoreCase(this.dismissedLinkPreviewUrl)) {
                    strM125845c = null;
                }
                if (strM125845c != null) {
                    InterfaceC27474d interfaceC27474dEnrichPreview = enrichPreview(this.chatClient, strM125845c);
                    c195221.L$0 = null;
                    c195221.L$1 = null;
                    c195221.I$0 = 0;
                    c195221.label = 1;
                    objAwait = ((C27485o) interfaceC27474dEnrichPreview).await(c195221);
                    if (objAwait == enumC31071a) {
                        return enumC31071a;
                    }
                }
                c2345k = this.logger;
                interfaceC2339e = c2345k.f9275c;
                str = c2345k.f9273a;
                enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    InterfaceC2344j interfaceC2344j = c2345k.f9274b;
                    if (linkPreview != null) {
                        originUrl = linkPreview.getOriginUrl();
                    } else {
                        originUrl = null;
                    }
                    interfaceC2344j.log(enumC2341g, str, AbstractC11266d.m30461o("[handleLinkPreview] preview: ", originUrl), null);
                }
                interfaceC13075p1 = this._state;
                do {
                    c13045h2 = (C13045h2) interfaceC13075p1;
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, null, linkPreview, 0, null, false, null, false, null, null, false, false, null, null, 262079, null)));
                return C23454a0.f92919a;
            }
            linkPreview = null;
            c2345k = this.logger;
            interfaceC2339e = c2345k.f9275c;
            str = c2345k.f9273a;
            enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                InterfaceC2344j interfaceC2344j2 = c2345k.f9274b;
                if (linkPreview != null) {
                    originUrl = linkPreview.getOriginUrl();
                } else {
                    originUrl = null;
                }
                interfaceC2344j2.log(enumC2341g, str, AbstractC11266d.m30461o("[handleLinkPreview] preview: ", originUrl), null);
            }
            interfaceC13075p1 = this._state;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
            } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, null, linkPreview, 0, null, false, null, false, null, null, false, false, null, null, 262079, null)));
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objAwait);
        linkPreview = (LinkPreview) ((AbstractC26205h) objAwait).m77816b();
        c2345k = this.logger;
        interfaceC2339e = c2345k.f9275c;
        str = c2345k.f9273a;
        enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j3 = c2345k.f9274b;
            if (linkPreview != null) {
                originUrl = linkPreview.getOriginUrl();
            } else {
                originUrl = null;
            }
            interfaceC2344j3.log(enumC2341g, str, AbstractC11266d.m30461o("[handleLinkPreview] preview: ", originUrl), null);
        }
        interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, null, linkPreview, 0, null, false, null, false, null, null, false, false, null, null, 262079, null)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMentionSuggestions() {
        C13045h2 c13045h2;
        Object value;
        MessageInput messageInput = (MessageInput) ((C13045h2) this._messageInput).getValue();
        if (!AbstractC22676k.m65745e(messageInput.getSource(), MessageInput.Source.MentionSelected.INSTANCE)) {
            AbstractC3006f0.m8732z(this.scope, DispatcherProvider.INSTANCE.getIO(), null, new C195233(messageInput.getText(), null), 2);
            return;
        }
        C2345k c2345k = this.logger;
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        String str = c2345k.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, "[handleMentionSuggestions] rejected (messageInput came from mention selection)", null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, C25271y.f99162w, null, null, 0, null, false, null, false, null, null, false, false, null, null, 262127, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleValidationErrors() {
        C13045h2 c13045h2;
        Object value;
        MessageComposerState messageComposerState;
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            messageComposerState = (MessageComposerState) value;
        } while (!c13045h2.m36569i(value, MessageComposerState.copy$default(messageComposerState, null, null, null, this.messageValidator.validateMessage(((MessageInput) ((C13045h2) this._messageInput).getValue()).getText(), messageComposerState.getAttachments()), null, null, null, 0, null, false, null, false, null, null, false, false, null, null, 262135, null)));
    }

    public static /* synthetic */ void holdRecording$default(MessageComposerController messageComposerController, C23465k c23465k, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c23465k = null;
        }
        messageComposerController.holdRecording(c23465k);
    }

    private final boolean isInEditMode() {
        return getActiveAction() instanceof Edit;
    }

    private final boolean isInThread() {
        return ((MessageComposerState) ((C13045h2) this._state).getValue()).getMessageMode() instanceof MessageMode.MessageThread;
    }

    private final boolean isSameMessageMode(MessageMode old, MessageMode messageMode) {
        if ((old instanceof MessageMode.Normal) && (messageMode instanceof MessageMode.Normal)) {
            return true;
        }
        if ((old instanceof MessageMode.MessageThread) && (messageMode instanceof MessageMode.MessageThread)) {
            return AbstractC22676k.m65745e(((MessageMode.MessageThread) old).getParentMessage().getId(), ((MessageMode.MessageThread) messageMode).getParentMessage().getId());
        }
        return false;
    }

    private static final /* synthetic */ Object lambda$11$lambda$10(ChannelData channelData, Date date, InterfaceC30057d interfaceC30057d) {
        return new C23465k(channelData, date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadLatestMessagesIfNeeded() {
        InterfaceC13037f2 endOfNewerMessages;
        if (isInThread()) {
            return;
        }
        ChannelState channelState = (ChannelState) this.channelState.getValue();
        if ((channelState == null || (endOfNewerMessages = channelState.getEndOfNewerMessages()) == null) ? true : ((Boolean) endOfNewerMessages.getValue()).booleanValue()) {
            return;
        }
        C2345k c2345k = this.logger;
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        String str = c2345k.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, "[loadLatestMessagesIfNeeded] loading latest messages", null);
        }
        ((C27478h) ChatClientExtensions.loadNewestMessages$default(this.chatClient, this.channelCid, 30, false, 4, null)).enqueue();
    }

    private final void observeSessionChanges() {
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36606p(this._selectedAttachments, this._editModeMessage, this._editModeAttachments, new C195241(4, null)), new C195252(null), 0), this.scope);
    }

    private final List<Command> orderedForComposer(List<Command> list) {
        return this.config.getActiveCommandEnabled() ? CommandAvailabilityKt.sortedByAvailability(list, getActiveAction()) : list;
    }

    private final Command restoreDraftCommandIfAvailable(String commandName) {
        Object next;
        if (!this.config.getActiveCommandEnabled() || commandName == null) {
            return null;
        }
        Iterator<T> it = this.commands.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((Command) next).getName(), commandName));
        Command command = (Command) next;
        if (command == null || !CommandAvailabilityKt.isAvailableFor(command, getActiveAction())) {
            return null;
        }
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        while (true) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Object value = c13045h2.getValue();
            Command command2 = command;
            if (c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, null, null, 0, null, false, null, false, null, null, false, false, null, command2, 131071, null))) {
                return command2;
            }
            command = command2;
        }
    }

    private final void restoreEditMode(Message message, List<Attachment> attachments) {
        Message messageById;
        C13045h2 c13045h2;
        Object value;
        ChannelState channelState = (ChannelState) this.channelState.getValue();
        if (channelState == null || (messageById = channelState.getMessageById(message.getId())) == null) {
            messageById = message;
        }
        setMessageInputInternal(message.getText(), MessageInput.Source.Edit.INSTANCE);
        ((C13045h2) this._editModeMessage).m36570j(messageById);
        ((C13045h2) this._editModeAttachments).m36570j(attachments);
        InterfaceC13075p1 interfaceC13075p1 = this._messageActions;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, AbstractC12350b.m34555D(new Edit(messageById), (Set) value)));
        syncAttachments();
    }

    private final boolean restorePreCommandStateIfAny() {
        C13045h2 c13045h2;
        Object value;
        CommandStash commandStash = this.commandStash;
        if (commandStash == null) {
            return false;
        }
        this.commandStash = null;
        setMessageInputInternal(commandStash.getInput(), MessageInput.Source.Default.INSTANCE);
        InterfaceC13075p1 interfaceC13075p1 = this._selectedAttachments;
        LinkedHashMap linkedHashMap = new LinkedHashMap(commandStash.getAttachments());
        C13045h2 c13045h3 = (C13045h2) interfaceC13075p1;
        c13045h3.getClass();
        c13045h3.m36571k(null, linkedHashMap);
        ((C13045h2) this._recordingAttachment).m36570j(commandStash.getRecordingAttachment());
        this.selectedMentions.clear();
        this.selectedMentions.addAll(commandStash.getMentions());
        InterfaceC13075p1 interfaceC13075p2 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p2;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, null, null, 0, null, false, null, false, null, null, false, false, AbstractC25265s.m74103I1(this.selectedMentions), null, 196607, null)));
        syncAttachments();
        return true;
    }

    private final void restoreSession() {
        List<Attachment> listRestoreSelectedAttachments = this.sessionRepository.restoreSelectedAttachments();
        if (!listRestoreSelectedAttachments.isEmpty()) {
            addAttachments(listRestoreSelectedAttachments);
        }
        ComposerSessionRepository.EditMode editModeRestoreEditMode = this.sessionRepository.restoreEditMode();
        if (editModeRestoreEditMode != null) {
            restoreEditMode(editModeRestoreEditMode.getMessage(), editModeRestoreEditMode.getAttachments());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveDraftMessage(MessageMode messageMode, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object next;
        boolean draftMessageEnabled = this.config.getDraftMessageEnabled();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!draftMessageEnabled) {
            return c23454a0;
        }
        this.currentDraftId = null;
        String text = ((MessageInput) ((C13045h2) this._messageInput).getValue()).getText();
        Command activeCommand = ((MessageComposerState) ((C13045h2) this._state).getValue()).getActiveCommand();
        if (!this.config.getActiveCommandEnabled()) {
            activeCommand = null;
        }
        if (text.length() == 0 && activeCommand == null) {
            Object objClearDraftMessage = clearDraftMessage(messageMode, interfaceC30057d);
            return objClearDraftMessage == EnumC31071a.f128113w ? objClearDraftMessage : c23454a0;
        }
        DraftMessage draftMessageOrEmpty = getDraftMessageOrEmpty(messageMode);
        ChatClient chatClient = this.chatClient;
        String str = this.channelType;
        String str2 = this.channelId;
        String name = activeCommand != null ? activeCommand.getName() : null;
        String str3 = activeCommand != null ? text : null;
        boolean alsoSendToChannel = ((MessageComposerState) ((C13045h2) this._state).getValue()).getAlsoSendToChannel();
        Iterator it = ((Iterable) ((C13045h2) this._messageActions).getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((MessageAction) next) instanceof Reply));
        Reply reply = next instanceof Reply ? (Reply) next : null;
        Object objAwait = ((C27481k) chatClient.createDraftMessage(str, str2, DraftMessage.copy$default(draftMessageOrEmpty, null, null, text, null, null, null, null, false, alsoSendToChannel, reply != null ? reply.getMessage() : null, name, str3, 251, null))).await(interfaceC30057d);
        if (objAwait == EnumC31071a.f128113w) {
            return objAwait;
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendKeystrokeEvent() {
        this.chatClient.keystroke(this.channelType, this.channelId, getParentMessageId()).enqueue();
    }

    public static /* synthetic */ void sendMessage$default(MessageComposerController messageComposerController, Message message, InterfaceC27471a interfaceC27471a, InterfaceC4351m interfaceC4351m, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            interfaceC4351m = null;
        }
        messageComposerController.sendMessage(message, interfaceC27471a, interfaceC4351m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendStopTypingEvent() {
        this.chatClient.stopTyping(this.channelType, this.channelId, getParentMessageId()).enqueue();
    }

    private final void setMessageInputInternal(String value, MessageInput.Source source) {
        if (AbstractC22676k.m65745e(((MessageInput) ((C13045h2) this._messageInput).getValue()).getText(), value)) {
            return;
        }
        if (this.dismissedLinkPreviewUrl != null) {
            C39410n c39410nM125848a = LinkPattern.m125848a(value);
            if (!AbstractC39421y.m125921F(c39410nM125848a != null ? c39410nM125848a.m125845c() : null, this.dismissedLinkPreviewUrl, true)) {
                this.dismissedLinkPreviewUrl = null;
            }
        }
        InterfaceC13075p1 interfaceC13075p1 = this._messageInput;
        MessageInput messageInput = new MessageInput(value, source);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, messageInput);
    }

    private final void setupComposerState() {
        fetchDraftMessage(((MessageComposerState) ((C13045h2) this._state).getValue()).getMessageMode());
        int i13 = 0;
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36608r(new C13052j1(this._messageInput, new C195301(null), i13), 300L), new C195312(null), i13), this.scope);
        AbstractC13091v.m36582H(new C13052j1(this._messageActions, new C195323(null), i13), this.scope);
        AbstractC13091v.m36582H(new C13052j1(this.ownCapabilities, new C195334(null), i13), this.scope);
        AbstractC13091v.m36582H(new C13052j1(this.chatClient.getClientState().getUser(), new C195345(null), i13), this.scope);
        AbstractC13091v.m36582H(new C13052j1(this.audioRecordingController.getRecordingState(), new C195356(null), i13), this.scope);
        if (this.config.getDraftMessageEnabled()) {
            AbstractC13091v.m36582H(new C13052j1(this.channelDraftMessages, new C195367(null), 0), this.scope);
            AbstractC13091v.m36582H(new C13052j1(this.threadDraftMessages, new C195378(null), 0), this.scope);
        }
    }

    private final boolean shouldSkipEnrichUrl(Message message) {
        if (message.getSkipEnrichUrl() || this.dismissedLinkPreviewUrl != null) {
            return true;
        }
        C39412p c39412p = LinkPattern;
        String input = message.getText();
        c39412p.getClass();
        AbstractC22676k.m65750j(input, "input");
        return !c39412p.f169588w.matcher(input).find();
    }

    private final void stashPreCommandState() {
        C13045h2 c13045h2;
        Object value;
        String text = ((MessageInput) ((C13045h2) this._messageInput).getValue()).getText();
        Companion.CommandText commandText = Companion.CommandText.INSTANCE;
        if (commandText.isTrigger(text) || commandText.isAutoSelectTrigger(text)) {
            text = "";
        }
        this.commandStash = new CommandStash(text, new LinkedHashMap((Map) ((C13045h2) this._selectedAttachments).getValue()), (Attachment) ((C13045h2) this._recordingAttachment).getValue(), AbstractC25265s.m74103I1(this.selectedMentions));
        InterfaceC13075p1 interfaceC13075p1 = this._selectedAttachments;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C13045h2 c13045h3 = (C13045h2) interfaceC13075p1;
        c13045h3.getClass();
        c13045h3.m36571k(null, linkedHashMap);
        ((C13045h2) this._recordingAttachment).m36570j(null);
        this.selectedMentions.clear();
        InterfaceC13075p1 interfaceC13075p2 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p2;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, null, null, 0, null, false, null, false, null, null, false, false, C25235a0.f99113w, null, 196607, null)));
        syncAttachments();
    }

    private final boolean suppressSuggestionsInEditMode() {
        C13045h2 c13045h2;
        Object value;
        if (this.config.getActiveCommandEnabled()) {
            MessageAction activeAction = getActiveAction();
            Edit edit = activeAction instanceof Edit ? (Edit) activeAction : null;
            if (edit != null && Companion.CommandText.INSTANCE.isTrigger(getMessageText())) {
                String strM125898q0 = AbstractC39414r.m125898q0(getMessageText(), "/");
                List<Command> list = this.commands;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (AbstractC39421y.m125930O(((Command) it.next()).getName(), strM125898q0, false)) {
                            InterfaceC13075p1 interfaceC13075p1 = this._state;
                            do {
                                c13045h2 = (C13045h2) interfaceC13075p1;
                                value = c13045h2.getValue();
                            } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, C25271y.f99162w, null, 0, null, false, null, false, null, null, false, false, null, null, 262111, null)));
                            this._events.mo36564a(new MessageComposerViewEvent.CommandUnavailable(edit));
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void syncAttachments() {
        C13045h2 c13045h2;
        Object value;
        Collection collection;
        Collection collectionValues;
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            collection = (Collection) ((C13045h2) this._editModeAttachments).getValue();
            collectionValues = ((LinkedHashMap) ((C13045h2) this._selectedAttachments).getValue()).values();
            AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
        } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(collection, AbstractC25265s.m74093D1(collectionValues)), AbstractC37056f.m118960L(((C13045h2) this._recordingAttachment).getValue())), null, null, null, null, null, 0, null, false, null, false, null, null, false, false, null, null, 262141, null)));
        handleValidationErrors();
    }

    private final boolean tryAutoSelectCommand(String text) {
        String strAutoSelectName;
        Object next;
        if (!this.config.getActiveCommandEnabled() || (strAutoSelectName = Companion.CommandText.INSTANCE.autoSelectName(text)) == null) {
            return false;
        }
        Iterator<T> it = this.commands.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((Command) next).getName(), strAutoSelectName));
        Command command = (Command) next;
        if (command == null) {
            return false;
        }
        selectCommand(command);
        return true;
    }

    public final void addAttachments(List<Attachment> attachments) {
        C13045h2 c13045h2;
        Object value;
        LinkedHashMap linkedHashMap;
        AbstractC22676k.m65750j(attachments, "attachments");
        InterfaceC13075p1 interfaceC13075p1 = this._selectedAttachments;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            linkedHashMap = new LinkedHashMap((LinkedHashMap) value);
            for (Attachment attachment : attachments) {
                linkedHashMap.put(MessageComposerControllerKt.attachmentKey(attachment), attachment);
            }
        } while (!c13045h2.m36569i(value, linkedHashMap));
        syncAttachments();
    }

    public final Message buildNewMessage(String message, List<Attachment> attachments) {
        Message message2;
        Command activeCommand;
        String strM95640p;
        String message3 = message;
        AbstractC22676k.m65750j(message3, "message");
        AbstractC22676k.m65750j(attachments, "attachments");
        MessageAction activeAction = getActiveAction();
        User currentUser = this.chatClient.getCurrentUser();
        String id4 = currentUser != null ? currentUser.getId() : null;
        if (this.config.getActiveCommandEnabled() && (activeCommand = ((MessageComposerState) ((C13045h2) this._state).getValue()).getActiveCommand()) != null && (strM95640p = AbstractC31061c.m95640p("/", activeCommand.getName(), " ", message3)) != null) {
            message3 = strM95640p;
        }
        String string = AbstractC39414r.m125869O0(message3).toString();
        Message message4 = (activeAction == null || (message2 = activeAction.getMessage()) == null) ? new Message(null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, -1, 65535, null) : message2;
        Reply reply = activeAction instanceof Reply ? (Reply) activeAction : null;
        Message message5 = reply != null ? reply.getMessage() : null;
        List<String> listFilterMentions = filterMentions(this.selectedMentions, string);
        if (!(getActiveAction() instanceof Edit) || MessageUtils.isModerationError(message4, id4)) {
            return new Message(null, this.channelCid, string, null, getParentMessageId(), null, AbstractC25265s.m74097F1(attachments), listFilterMentions, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, message5, message5 != null ? message5.getId() : null, false, null, null, null, null, false, false, null, null, null, null, null, null, null, null, false, 1073741609, 65535, null);
        }
        return message4.copy(((-1) & 1) != 0 ? message4.id : null, ((-1) & 2) != 0 ? message4.cid : null, ((-1) & 4) != 0 ? message4.text : string, ((-1) & 8) != 0 ? message4.html : null, ((-1) & 16) != 0 ? message4.parentId : null, ((-1) & 32) != 0 ? message4.command : null, ((-1) & 64) != 0 ? message4.attachments : AbstractC25265s.m74097F1(attachments), ((-1) & 128) != 0 ? message4.mentionedUsersIds : listFilterMentions, ((-1) & 256) != 0 ? message4.mentionedUsers : null, ((-1) & 512) != 0 ? message4.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message4.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message4.reactionCounts : null, ((-1) & 4096) != 0 ? message4.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message4.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message4.syncStatus : null, ((-1) & 32768) != 0 ? message4.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message4.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message4.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message4.createdAt : null, ((-1) & 524288) != 0 ? message4.updatedAt : null, ((-1) & 1048576) != 0 ? message4.deletedAt : null, ((-1) & 2097152) != 0 ? message4.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message4.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message4.user : null, ((-1) & 16777216) != 0 ? message4.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message4.silent : false, ((-1) & 67108864) != 0 ? message4.shadowed : false, ((-1) & 134217728) != 0 ? message4.i18n : null, ((-1) & 268435456) != 0 ? message4.showInChannel : false, ((-1) & 536870912) != 0 ? message4.channelInfo : null, ((-1) & 1073741824) != 0 ? message4.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message4.replyMessageId : null, (65535 & 1) != 0 ? message4.pinned : false, (65535 & 2) != 0 ? message4.pinnedAt : null, (65535 & 4) != 0 ? message4.pinExpires : null, (65535 & 8) != 0 ? message4.pinnedBy : null, (65535 & 16) != 0 ? message4.threadParticipants : null, (65535 & 32) != 0 ? message4.skipPushNotification : false, (65535 & 64) != 0 ? message4.skipEnrichUrl : false, (65535 & 128) != 0 ? message4.moderationDetails : null, (65535 & 256) != 0 ? message4.moderation : null, (65535 & 512) != 0 ? message4.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message4.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message4.restrictedVisibility : null, (65535 & 4096) != 0 ? message4.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message4.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message4.channelRole : null, (65535 & 32768) != 0 ? message4.deletedForMe : false);
    }

    public final void cancelLinkPreview() {
        C13045h2 c13045h2;
        Object value;
        C2345k c2345k = this.logger;
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = c2345k.f9274b;
            C39410n c39410nM125848a = LinkPattern.m125848a(getMessageText());
            interfaceC2344j.log(enumC2341g, str, AbstractC11266d.m30461o("[cancelLinkPreview] url: ", c39410nM125848a != null ? c39410nM125848a.m125845c() : null), null);
        }
        C39410n c39410nM125848a2 = LinkPattern.m125848a(getMessageText());
        this.dismissedLinkPreviewUrl = c39410nM125848a2 != null ? c39410nM125848a2.m125845c() : null;
        InterfaceC3027k1 interfaceC3027k1 = this.linkPreviewJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, null, null, 0, null, false, null, false, null, null, false, false, null, null, 262079, null)));
    }

    public final void cancelRecording() {
        this.audioRecordingController.cancelRecording();
    }

    public final void clearActiveCommand() {
        C13045h2 c13045h2;
        Object value;
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, null, null, 0, null, false, null, false, null, null, false, false, null, null, 131071, null)));
        if (restorePreCommandStateIfAny()) {
            return;
        }
        setMessageInputInternal("", MessageInput.Source.Default.INSTANCE);
    }

    public final void clearAttachments() {
        C13045h2 c13045h2 = (C13045h2) this._editModeAttachments;
        c13045h2.getClass();
        c13045h2.m36571k(null, C25271y.f99162w);
        InterfaceC13075p1 interfaceC13075p1 = this._selectedAttachments;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C13045h2 c13045h3 = (C13045h2) interfaceC13075p1;
        c13045h3.getClass();
        c13045h3.m36571k(null, linkedHashMap);
        ((C13045h2) this._recordingAttachment).m36570j(null);
        syncAttachments();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void clearData() {
        C13045h2 c13045h2;
        Object value;
        C13045h2 c13045h3;
        Object value2;
        C2345k c2345k = this.logger;
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345k.f9273a;
        String str2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, "[clearData]", null);
        }
        dismissMessageActions();
        AbstractC3006f0.m8732z(this.scope, null, null, new C195162(null), 3);
        InterfaceC13075p1 interfaceC13075p1 = this._messageInput;
        MessageInput messageInput = new MessageInput(str2, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        C13045h2 c13045h4 = (C13045h2) interfaceC13075p1;
        c13045h4.getClass();
        c13045h4.m36571k(null, messageInput);
        clearAttachments();
        this.commandStash = null;
        clearActiveCommand();
        InterfaceC3027k1 interfaceC3027k1 = this.linkPreviewJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.dismissedLinkPreviewUrl = null;
        InterfaceC13075p1 interfaceC13075p2 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p2;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, C25271y.f99162w, null, null, null, 0, null, false, null, false, null, null, false, false, null, null, 262135, null)));
        if (isInThread()) {
            return;
        }
        InterfaceC13075p1 interfaceC13075p3 = this._state;
        do {
            c13045h3 = (C13045h2) interfaceC13075p3;
            value2 = c13045h3.getValue();
        } while (!c13045h3.m36569i(value2, MessageComposerState.copy$default((MessageComposerState) value2, null, null, null, null, null, null, null, 0, null, false, null, false, null, null, false, false, null, null, 261631, null)));
    }

    public final void completeRecording(Function1 onComplete) {
        AbstractC3006f0.m8732z(this.scope, null, null, new C195171(onComplete, this, null), 3);
    }

    public final void createPoll(CreatePollParams createPollParams, Function1 onResult) {
        AbstractC22676k.m65750j(createPollParams, "createPollParams");
        AbstractC22676k.m65750j(onResult, "onResult");
        ((C27478h) this.chatClient.sendPoll(this.channelType, this.channelId, createPollParams)).enqueue(new C5432a(onResult, 6));
    }

    public final void dismissMessageActions() {
        if (getActiveAction() instanceof Edit) {
            setMessageInputInternal("", MessageInput.Source.Default.INSTANCE);
            ((C13045h2) this._editModeMessage).m36570j(null);
            C13045h2 c13045h2 = (C13045h2) this._editModeAttachments;
            c13045h2.getClass();
            c13045h2.m36571k(null, C25271y.f99162w);
            syncAttachments();
        }
        C13045h2 c13045h3 = (C13045h2) this._messageActions;
        c13045h3.getClass();
        c13045h3.m36571k(null, C25235a0.f99113w);
    }

    public final void dismissSuggestionsPopup() {
        C13045h2 c13045h2;
        Object value;
        C25271y c25271y;
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            c25271y = C25271y.f99162w;
        } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, c25271y, c25271y, null, 0, null, false, null, false, null, null, false, false, null, null, 262095, null)));
    }

    public final InterfaceC13037f2 getChannelState() {
        return this.channelState;
    }

    public final InterfaceC13087t1 getEvents() {
        return this.events;
    }

    public final InterfaceC13087t1 getInputFocusEvents() {
        return this.inputFocusEvents;
    }

    public final InterfaceC13037f2 getMessageActions() {
        return this.messageActions;
    }

    public final InterfaceC13037f2 getMessageInput() {
        return this.messageInput;
    }

    public final InterfaceC13037f2 getState() {
        return this.state;
    }

    public final TypingUpdatesBuffer getTypingUpdatesBuffer() {
        return this.typingUpdatesBuffer;
    }

    public final void holdRecording(C23465k offset) {
        this.audioRecordingController.holdRecording(offset);
    }

    public final void leaveThread() {
        setMessageMode(MessageMode.Normal.INSTANCE);
        dismissMessageActions();
    }

    public final void lockRecording() {
        this.audioRecordingController.lockRecording();
    }

    public final void onCleared() {
        this.typingUpdatesBuffer.clear();
        this.audioRecordingController.onCleared();
        AbstractC3006f0.m8732z(this.scope, null, null, new C195261(null), 3);
    }

    public final void pauseRecording() {
        this.audioRecordingController.pauseRecording();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void performMessageAction(MessageAction messageAction) {
        C13045h2 c13045h2;
        Object value;
        AbstractC22676k.m65750j(messageAction, "messageAction");
        Command activeCommand = ((MessageComposerState) ((C13045h2) this._state).getValue()).getActiveCommand();
        if (this.config.getActiveCommandEnabled() && activeCommand != null && !CommandAvailabilityKt.isAvailableFor(activeCommand, messageAction)) {
            this._events.mo36564a(new MessageComposerViewEvent.CancelCommandRequired(messageAction));
            return;
        }
        ThreadState threadState = null;
        Object[] objArr = 0;
        if (messageAction instanceof ThreadReply) {
            setMessageMode(new MessageMode.MessageThread(((ThreadReply) messageAction).getMessage(), threadState, 2, objArr == true ? 1 : 0));
            return;
        }
        if (messageAction instanceof Reply) {
            C13045h2 c13045h3 = (C13045h2) this._messageActions;
            Iterable iterable = (Iterable) c13045h3.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!(((MessageAction) obj) instanceof Reply)) {
                    arrayList.add(obj);
                }
            }
            Set setM74103I1 = AbstractC25265s.m74103I1(AbstractC25265s.m74128f1(messageAction, arrayList));
            c13045h3.getClass();
            c13045h3.m36571k(null, setM74103I1);
            return;
        }
        if (messageAction instanceof Edit) {
            Edit edit = (Edit) messageAction;
            setMessageInputInternal(edit.getMessage().getText(), MessageInput.Source.Edit.INSTANCE);
            ((C13045h2) this._editModeMessage).m36570j(edit.getMessage());
            ((C13045h2) this._editModeAttachments).m36570j(edit.getMessage().getAttachments());
            InterfaceC13075p1 interfaceC13075p1 = this._messageActions;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
            } while (!c13045h2.m36569i(value, AbstractC12350b.m34555D(messageAction, (Set) value)));
            syncAttachments();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    public final void removeAttachment(Attachment attachment) {
        C13045h2 c13045h2;
        Object value;
        ArrayList arrayList;
        C13045h2 c13045h3;
        Object value2;
        LinkedHashMap linkedHashMap;
        AbstractC22676k.m65750j(attachment, "attachment");
        String strAttachmentKey = MessageComposerControllerKt.attachmentKey(attachment);
        if (((LinkedHashMap) ((C13045h2) this._selectedAttachments).getValue()).containsKey(strAttachmentKey)) {
            InterfaceC13075p1 interfaceC13075p1 = this._selectedAttachments;
            do {
                c13045h3 = (C13045h2) interfaceC13075p1;
                value2 = c13045h3.getValue();
                linkedHashMap = new LinkedHashMap((LinkedHashMap) value2);
                linkedHashMap.remove(strAttachmentKey);
            } while (!c13045h3.m36569i(value2, linkedHashMap));
        } else {
            Iterable iterable = (Iterable) ((C13045h2) this._editModeAttachments).getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (attachment.equals(it.next())) {
                        InterfaceC13075p1 interfaceC13075p2 = this._editModeAttachments;
                        do {
                            c13045h2 = (C13045h2) interfaceC13075p2;
                            value = c13045h2.getValue();
                            arrayList = new ArrayList();
                            for (Object obj : (List) value) {
                                if (!attachment.equals(obj)) {
                                    arrayList.add(obj);
                                }
                            }
                        } while (!c13045h2.m36569i(value, arrayList));
                    }
                }
                if (AbstractC22676k.m65745e(((C13045h2) this._recordingAttachment).getValue(), attachment)) {
                    ((C13045h2) this._recordingAttachment).m36570j(null);
                }
            } else if (AbstractC22676k.m65745e(((C13045h2) this._recordingAttachment).getValue(), attachment)) {
                ((C13045h2) this._recordingAttachment).m36570j(null);
            }
        }
        syncAttachments();
    }

    public final void removeAttachmentsByUris(Set<String> uris) {
        C13045h2 c13045h2;
        Object value;
        LinkedHashMap linkedHashMap;
        AbstractC22676k.m65750j(uris, "uris");
        if (uris.isEmpty()) {
            return;
        }
        InterfaceC13075p1 interfaceC13075p1 = this._selectedAttachments;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            linkedHashMap = new LinkedHashMap((LinkedHashMap) value);
            linkedHashMap.keySet().removeAll(uris);
        } while (!c13045h2.m36569i(value, linkedHashMap));
        syncAttachments();
    }

    public final void seekRecordingTo(float progress) {
        this.audioRecordingController.seekRecordingTo(progress);
    }

    public final void selectCommand(Command command) {
        AbstractC22676k.m65750j(command, "command");
        MessageAction activeAction = getActiveAction();
        if (this.config.getActiveCommandEnabled() && !CommandAvailabilityKt.isAvailableFor(command, activeAction)) {
            if (activeAction != null) {
                this._events.mo36564a(new MessageComposerViewEvent.CommandUnavailable(activeAction));
                return;
            }
            return;
        }
        if (this.config.getActiveCommandEnabled() && this.commandStash == null) {
            stashPreCommandState();
        }
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        while (true) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Object value = c13045h2.getValue();
            InterfaceC13075p1 interfaceC13075p2 = interfaceC13075p1;
            if (c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, null, null, 0, null, false, null, false, null, null, false, false, null, command, 131071, null))) {
                break;
            } else {
                interfaceC13075p1 = interfaceC13075p2;
            }
        }
        setMessageInputInternal(this.config.getActiveCommandEnabled() ? "" : AbstractC11895b.m31996o("/", command.getName(), " "), MessageInput.Source.CommandSelected.INSTANCE);
        this._inputFocusEvents.mo36564a(C23454a0.f92919a);
    }

    public final void selectMention(User user) {
        AbstractC22676k.m65750j(user, "user");
        selectMention(new Mention.User(user));
    }

    public final void sendMessage(Message message, InterfaceC27471a callback, InterfaceC4351m resolveAttachments) {
        Message message2;
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(callback, "callback");
        C2345k c2345k = this.logger;
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(message.getAttachments().size(), "[sendMessage] message.attachments.size: "), null);
        }
        MessageComposerViewEvent messageComposerViewEventDetectBlockingCommand = detectBlockingCommand(message.getText(), getActiveAction());
        if (messageComposerViewEventDetectBlockingCommand != null) {
            this._events.mo36564a(messageComposerViewEventDetectBlockingCommand);
            return;
        }
        MessageAction activeAction = getActiveAction();
        if (activeAction == null || (message2 = activeAction.getMessage()) == null) {
            message2 = message;
        }
        User currentUser = this.chatClient.getCurrentUser();
        String id4 = currentUser != null ? currentUser.getId() : null;
        if (!(getActiveAction() instanceof Edit) || MessageUtils.isModerationError(message2, id4)) {
            if (MessageUtils.isModerationError(message2, id4)) {
                this.chatClient.deleteMessage(message2.getId(), true).enqueue();
            }
            Message messageCopy = message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : isInThread() && ((MessageComposerState) ((C13045h2) this._state).getValue()).getAlsoSendToChannel(), ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : shouldSkipEnrichUrl(message), (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
            clearData();
            if (resolveAttachments != null) {
                AbstractC3006f0.m8732z(this.scope, null, null, new C195273(resolveAttachments, messageCopy, this, callback, null), 3);
                return;
            } else {
                enqueueSendMessage(messageCopy, callback);
                return;
            }
        }
        if (!AbstractC22676k.m65745e(message2.getText(), message.getText()) || !AbstractC22676k.m65745e(message2.getAttachments(), message.getAttachments())) {
            clearData();
            enqueueEditMessage(message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : shouldSkipEnrichUrl(message), (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false), callback, resolveAttachments);
            return;
        }
        C2345k c2345k2 = this.logger;
        InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
        String str2 = c2345k2.f9273a;
        if (interfaceC2339e2.isLoggable(enumC2341g, str2)) {
            c2345k2.f9274b.log(enumC2341g, str2, "[sendMessage] No changes in the message, skipping edit.", null);
        }
        clearData();
    }

    public final void sendRecording() {
        AbstractC3006f0.m8732z(this.scope, null, null, new C195281(null), 3);
    }

    public final void setAlsoSendToChannel(boolean alsoSendToChannel) {
        C13045h2 c13045h2;
        Object value;
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, null, null, 0, null, alsoSendToChannel, null, false, null, null, false, false, null, null, 261631, null)));
    }

    public final void setMessageInput(String value) {
        AbstractC22676k.m65750j(value, "value");
        setMessageInputInternal(value, MessageInput.Source.External.INSTANCE);
    }

    public final void setMessageMode(MessageMode messageMode) {
        AbstractC22676k.m65750j(messageMode, "messageMode");
        MessageMode messageMode2 = ((MessageComposerState) ((C13045h2) this._state).getValue()).getMessageMode();
        if (isSameMessageMode(messageMode2, messageMode)) {
            return;
        }
        AbstractC3006f0.m8732z(this.scope, null, EnumC2998d0.f12007z, new C195291(messageMode2, messageMode, null), 1);
    }

    public final void setTypingUpdatesBuffer(TypingUpdatesBuffer typingUpdatesBuffer) {
        AbstractC22676k.m65750j(typingUpdatesBuffer, "<set-?>");
        this.typingUpdatesBuffer = typingUpdatesBuffer;
    }

    public final void startRecording() {
        AbstractC3006f0.m8732z(this.scope, null, null, new C195421(null), 3);
    }

    public final void stopRecording() {
        AbstractC3006f0.m8732z(this.scope, null, null, new C195431(null), 3);
    }

    public final void toggleCommandsVisibility() {
        C13045h2 c13045h2;
        Object value;
        MessageComposerState messageComposerState;
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            messageComposerState = (MessageComposerState) value;
        } while (!c13045h2.m36569i(value, MessageComposerState.copy$default(messageComposerState, null, null, null, null, null, messageComposerState.getCommandSuggestions().isEmpty() ? orderedForComposer(this.commands) : C25271y.f99162w, null, 0, null, false, null, false, null, null, false, false, null, null, 262111, null)));
    }

    public final void toggleRecordingPlayback() {
        this.audioRecordingController.toggleRecordingPlayback();
    }

    public final void selectMention(Mention mention) {
        C13045h2 c13045h2;
        Object value;
        AbstractC22676k.m65750j(mention, "mention");
        String display = mention.getDisplay();
        String messageText = getMessageText();
        setMessageInputInternal(AbstractC11895b.m31997p(AbstractC39414r.m125865K0(messageText, MENTION_START_SYMBOL, messageText), MENTION_START_SYMBOL, display, " "), MessageInput.Source.MentionSelected.INSTANCE);
        this.selectedMentions.add(mention);
        InterfaceC13075p1 interfaceC13075p1 = this._state;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, MessageComposerState.copy$default((MessageComposerState) value, null, null, null, null, null, null, null, 0, null, false, null, false, null, null, false, false, AbstractC25265s.m74103I1(this.selectedMentions), null, 196607, null)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MessageComposerController(String str, ChatClient chatClient, InterfaceC13037f2 interfaceC13037f2, InterfaceC32094g interfaceC32094g, UserLookupHandler userLookupHandler, Function1 function1, Config config, InterfaceC13058l interfaceC13058l, C1601k1 c1601k1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        ChatClient chatClientInstance = (i13 & 2) != 0 ? ChatClient.INSTANCE.instance() : chatClient;
        this(str, chatClientInstance, interfaceC13037f2, interfaceC32094g, userLookupHandler, function1, (i13 & 64) != 0 ? new Config(0, false, false, false, 15, null) : config, (i13 & 128) != 0 ? ChatClientExtensions.getGlobalStateFlow(chatClientInstance) : interfaceC13058l, (i13 & 256) != 0 ? new C1601k1() : c1601k1);
    }
}
