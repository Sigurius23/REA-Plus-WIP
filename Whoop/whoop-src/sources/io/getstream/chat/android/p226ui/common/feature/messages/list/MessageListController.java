package io.getstream.chat.android.p226ui.common.feature.messages.list;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import as1.C1945f;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import ch.C4588i;
import com.whoop.service.network.model.UserState;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13021b2;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13096w1;
import ec3.C13100y;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import fc3.AbstractC14371b;
import fc3.C14380k;
import hc3.AbstractC17176i;
import hc3.C17171d;
import ig0.C18468h;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.client.api.state.ThreadState;
import io.getstream.chat.android.client.audio.AudioHashKt;
import io.getstream.chat.android.client.audio.AudioPlayer;
import io.getstream.chat.android.client.audio.AudioState;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.client.errors.ChatErrorKt;
import io.getstream.chat.android.client.extensions.ChannelExtensionKt;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.C19336c;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.core.utils.Debouncer;
import io.getstream.chat.android.core.utils.date.DateUtils;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Mute;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.PollOption;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.TimeDuration;
import io.getstream.chat.android.models.TypingEvent;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.Vote;
import io.getstream.chat.android.p226ui.common.feature.messages.translations.MessageOriginalTranslationsStore;
import io.getstream.chat.android.p226ui.common.helper.ClipboardHandler;
import io.getstream.chat.android.p226ui.common.state.messages.BlockUser;
import io.getstream.chat.android.p226ui.common.state.messages.Copy;
import io.getstream.chat.android.p226ui.common.state.messages.Delete;
import io.getstream.chat.android.p226ui.common.state.messages.Flag;
import io.getstream.chat.android.p226ui.common.state.messages.MarkAsUnread;
import io.getstream.chat.android.p226ui.common.state.messages.MessageAction;
import io.getstream.chat.android.p226ui.common.state.messages.MessageMode;
import io.getstream.chat.android.p226ui.common.state.messages.MuteUser;
import io.getstream.chat.android.p226ui.common.state.messages.Pin;
import io.getstream.chat.android.p226ui.common.state.messages.React;
import io.getstream.chat.android.p226ui.common.state.messages.Reply;
import io.getstream.chat.android.p226ui.common.state.messages.Resend;
import io.getstream.chat.android.p226ui.common.state.messages.ThreadReply;
import io.getstream.chat.android.p226ui.common.state.messages.UnblockUser;
import io.getstream.chat.android.p226ui.common.state.messages.UnmuteUser;
import io.getstream.chat.android.p226ui.common.state.messages.list.CancelGiphy;
import io.getstream.chat.android.p226ui.common.state.messages.list.DateSeparatorItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.EmptyThreadPlaceholderItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.GiphyAction;
import io.getstream.chat.android.p226ui.common.state.messages.list.HasMessageListItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageFocusRemoved;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageFocused;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageFooterVisibility;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageListItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageListItemStateKt;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageListState;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageListStateKt;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessagePosition;
import io.getstream.chat.android.p226ui.common.state.messages.list.ModeratedMessageItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.MyOwn;
import io.getstream.chat.android.p226ui.common.state.messages.list.NewMessageState;
import io.getstream.chat.android.p226ui.common.state.messages.list.Other;
import io.getstream.chat.android.p226ui.common.state.messages.list.SelectedMessageFailedModerationState;
import io.getstream.chat.android.p226ui.common.state.messages.list.SelectedMessageOptionsState;
import io.getstream.chat.android.p226ui.common.state.messages.list.SelectedMessageReactionsPickerState;
import io.getstream.chat.android.p226ui.common.state.messages.list.SelectedMessageReactionsState;
import io.getstream.chat.android.p226ui.common.state.messages.list.SelectedMessageState;
import io.getstream.chat.android.p226ui.common.state.messages.list.SendGiphy;
import io.getstream.chat.android.p226ui.common.state.messages.list.ShuffleGiphy;
import io.getstream.chat.android.p226ui.common.state.messages.list.StartOfTheChannelItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.SystemMessageItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.ThreadDateSeparatorItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.Typing;
import io.getstream.chat.android.p226ui.common.state.messages.list.TypingItemState;
import io.getstream.chat.android.p226ui.common.state.messages.list.UnreadSeparatorItemState;
import io.getstream.chat.android.p226ui.common.state.messages.poll.PollSelectionType;
import io.getstream.chat.android.p226ui.common.state.messages.poll.PollState;
import io.getstream.chat.android.p226ui.common.state.messages.poll.SelectedPoll;
import io.getstream.chat.android.p226ui.common.utils.extensions.FlowKt;
import io.getstream.chat.android.p226ui.common.utils.extensions.MessageFooterVisibilityKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25239c0;
import m83.C25241d0;
import m83.C25263q;
import m83.C25271y;
import m83.C25272z;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import no.nordicsemi.android.dfu.DfuBaseService;
import o23.AbstractC27476f;
import o23.C27478h;
import o23.InterfaceC27471a;
import o23.InterfaceC27474d;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p032bc.C2953i;
import p047c9.C4312c;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000®\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 ø\u00022\u00020\u0001:\bù\u0002ú\u0002û\u0002ø\u0002Bµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020 ¢\u0006\u0004\b#\u0010\"J\r\u0010$\u001a\u00020 ¢\u0006\u0004\b$\u0010\"J%\u0010&\u001a\u00020 2\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020 0%¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020 2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b+\u0010,J\u0018\u0010/\u001a\u00020 2\u0006\u0010.\u001a\u00020-H\u0086@¢\u0006\u0004\b/\u00100J\"\u00102\u001a\u00020 2\u0006\u00101\u001a\u00020-2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020 ¢\u0006\u0004\b6\u0010\"J1\u0010:\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u00022\u001a\b\u0002\u00109\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020-08\u0012\u0004\u0012\u00020 07¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020 2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020 2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b@\u0010?J\u0017\u0010A\u001a\u00020 2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\bA\u0010?J\u0017\u0010D\u001a\u00020 2\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bD\u0010EJ%\u0010J\u001a\u00020 2\u0006\u0010G\u001a\u00020F2\u0006\u0010.\u001a\u00020-2\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ\u0018\u0010N\u001a\u00020 2\u0006\u0010M\u001a\u00020LH\u0086@¢\u0006\u0004\bN\u0010OJ\u0015\u0010P\u001a\u00020 2\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020 ¢\u0006\u0004\bR\u0010\"J\r\u0010S\u001a\u00020 ¢\u0006\u0004\bS\u0010\"J\u001f\u0010U\u001a\u00020 2\u0006\u0010.\u001a\u00020-2\b\b\u0002\u0010T\u001a\u00020\u0006¢\u0006\u0004\bU\u0010VJ\u0015\u0010W\u001a\u00020 2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\bW\u0010?J\r\u0010X\u001a\u00020 ¢\u0006\u0004\bX\u0010\"JO\u0010]\u001a\u00020 2\u0006\u0010.\u001a\u00020-2\b\u0010Y\u001a\u0004\u0018\u00010\u00022\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020Z2\u001a\b\u0002\u00109\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\08\u0012\u0004\u0012\u00020 07¢\u0006\u0004\b]\u0010^J1\u0010_\u001a\u00020 2\u0006\u0010.\u001a\u00020-2\u001a\b\u0002\u00109\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020 08\u0012\u0004\u0012\u00020 07¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020 2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\ba\u0010?J#\u0010d\u001a\u00020 2\u0006\u0010.\u001a\u00020-2\n\b\u0002\u0010c\u001a\u0004\u0018\u00010bH\u0007¢\u0006\u0004\bd\u0010eJ\u0015\u0010f\u001a\u00020 2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\bf\u0010?J\u0015\u0010g\u001a\u00020 2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\bg\u0010?J\u0015\u0010j\u001a\u00020 2\u0006\u0010i\u001a\u00020h¢\u0006\u0004\bj\u0010kJ\u0015\u0010l\u001a\u00020 2\u0006\u0010i\u001a\u00020h¢\u0006\u0004\bl\u0010kJ\u0015\u0010m\u001a\u00020 2\u0006\u0010i\u001a\u00020h¢\u0006\u0004\bm\u0010kJ%\u0010q\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010n\u001a\u00020\u00022\u0006\u0010p\u001a\u00020o¢\u0006\u0004\bq\u0010rJ%\u0010t\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010n\u001a\u00020\u00022\u0006\u0010s\u001a\u00020\u0002¢\u0006\u0004\bt\u0010uJ%\u0010x\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010n\u001a\u00020\u00022\u0006\u0010w\u001a\u00020v¢\u0006\u0004\bx\u0010yJ\u0015\u0010z\u001a\u00020 2\u0006\u0010n\u001a\u00020\u0002¢\u0006\u0004\bz\u00105J'\u0010~\u001a\u00020 2\u0006\u0010|\u001a\u00020{2\u0006\u0010.\u001a\u00020-2\b\b\u0002\u0010}\u001a\u00020\u0006¢\u0006\u0004\b~\u0010\u007fJ\u001a\u0010\u0080\u0001\u001a\u0004\u0018\u00010-2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u000f\u0010\u0082\u0001\u001a\u00020 ¢\u0006\u0005\b\u0082\u0001\u0010\"J$\u0010l\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u00022\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010\n¢\u0006\u0005\bl\u0010\u0085\u0001J\u0016\u0010m\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u0002¢\u0006\u0004\bm\u00105J2\u0010\u0086\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u00022\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u00022\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010\n¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0018\u0010\u0088\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u0002¢\u0006\u0005\b\u0088\u0001\u00105J2\u0010\u0089\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u00022\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u00022\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010\n¢\u0006\u0006\b\u0089\u0001\u0010\u0087\u0001J\u0018\u0010\u008a\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u0002¢\u0006\u0005\b\u008a\u0001\u00105J;\u0010\u008b\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u00022\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020Z¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0018\u0010\u008d\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u0002¢\u0006\u0005\b\u008d\u0001\u00105J\u0018\u0010\u008e\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u0002¢\u0006\u0005\b\u008e\u0001\u00105J\u0018\u0010\u008f\u0001\u001a\u00020 2\u0007\u0010\u0083\u0001\u001a\u00020\u0002¢\u0006\u0005\b\u008f\u0001\u00105J\u001a\u0010\u0092\u0001\u001a\u00020 2\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\"\u0010\u0096\u0001\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0018\u0010\u0098\u0001\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001a\u0010\u009a\u0001\u001a\u00020 2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001a\u0010\u009c\u0001\u001a\u00020 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017¢\u0006\u0006\b\u009c\u0001\u0010\u009b\u0001J\u0018\u0010\u009d\u0001\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0019\u0010 \u0001\u001a\u00020 2\u0007\u0010\u009f\u0001\u001a\u00020\u0006¢\u0006\u0006\b \u0001\u0010¡\u0001J\u000f\u0010¢\u0001\u001a\u00020 ¢\u0006\u0005\b¢\u0001\u0010\"J(\u0010£\u0001\u001a\u00020 2\u0006\u0010.\u001a\u00020-2\u0006\u0010G\u001a\u00020F2\u0006\u0010p\u001a\u00020o¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u0016\u0010z\u001a\u00020 2\u0006\u0010G\u001a\u00020F¢\u0006\u0005\bz\u0010¥\u0001J \u0010¦\u0001\u001a\u00020 2\u0006\u0010G\u001a\u00020F2\u0006\u0010p\u001a\u00020\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001f\u0010¦\u0001\u001a\u00020 2\u0006\u0010n\u001a\u00020\u00022\u0006\u0010p\u001a\u00020\u0002¢\u0006\u0005\b¦\u0001\u0010=J\u000f\u0010¨\u0001\u001a\u00020 ¢\u0006\u0005\b¨\u0001\u0010\"J\u0011\u0010©\u0001\u001a\u00020 H\u0002¢\u0006\u0005\b©\u0001\u0010\"J\u0011\u0010ª\u0001\u001a\u00020 H\u0002¢\u0006\u0005\bª\u0001\u0010\"J\u0013\u0010«\u0001\u001a\u00020 H\u0082@¢\u0006\u0006\b«\u0001\u0010¬\u0001J&\u0010¯\u0001\u001a\u00020 *\t\u0012\u0004\u0012\u00020-0\u00ad\u00012\u0007\u0010®\u0001\u001a\u00020\u0002H\u0002¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001c\u0010³\u0001\u001a\u00020 2\b\u0010²\u0001\u001a\u00030±\u0001H\u0002¢\u0006\u0006\b³\u0001\u0010´\u0001J\u001b\u0010¶\u0001\u001a\u00020 2\u0007\u0010µ\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b¶\u0001\u0010¡\u0001J\u001c\u0010¸\u0001\u001a\u00020 2\t\u0010·\u0001\u001a\u0004\u0018\u00010hH\u0002¢\u0006\u0005\b¸\u0001\u0010kJ\u001a\u0010º\u0001\u001a\u00020 2\u0007\u0010¹\u0001\u001a\u00020\nH\u0002¢\u0006\u0005\bº\u0001\u0010,J\u001e\u0010½\u0001\u001a\u00020 2\n\u0010¼\u0001\u001a\u0005\u0018\u00010»\u0001H\u0002¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u001b\u0010À\u0001\u001a\u00020 2\u0007\u0010¿\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\bÀ\u0001\u0010¡\u0001J\u001b\u0010Â\u0001\u001a\u00020 2\u0007\u0010Á\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\bÂ\u0001\u0010¡\u0001J\u001c\u0010Ã\u0001\u001a\u00020 2\b\u0010²\u0001\u001a\u00030±\u0001H\u0002¢\u0006\u0006\bÃ\u0001\u0010´\u0001Jn\u0010Ë\u0001\u001a\u00020 2\u0007\u0010Ä\u0001\u001a\u00020\u00022\u0014\u0010Å\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020-0\u00ad\u00010\u00102\r\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0015\u0010È\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030Ç\u00010\u00ad\u00010\u00102\u0015\u0010Ê\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030É\u00010\u00ad\u00010\u0010H\u0002¢\u0006\u0006\bË\u0001\u0010Ì\u0001JÉ\u0001\u0010Ö\u0001\u001a\n\u0012\u0005\u0012\u00030Õ\u00010\u00ad\u00012\u000e\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u00020-0\u00ad\u00012\u0007\u0010Í\u0001\u001a\u00020\u00062\u000f\u0010È\u0001\u001a\n\u0012\u0005\u0012\u00030Ç\u00010\u00ad\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u000e\u0010Î\u0001\u001a\t\u0012\u0004\u0012\u00020h0\u00ad\u00012\t\u0010Ï\u0001\u001a\u0004\u0018\u00010-2\n\u0010¼\u0001\u001a\u0005\u0018\u00010»\u00012\u000f\u0010Ê\u0001\u001a\n\u0012\u0005\u0012\u00030É\u00010\u00ad\u00012\u0007\u0010Æ\u0001\u001a\u00020\u00062\n\u0010Ñ\u0001\u001a\u0005\u0018\u00010Ð\u00012\u000e\u0010Ó\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020Ò\u00012\u000e\u0010Ô\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020Ò\u0001H\u0002¢\u0006\u0006\bÖ\u0001\u0010×\u0001J-\u0010Ù\u0001\u001a\u00020\u0006*\u00030Ç\u00012\u0014\u0010Ø\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030É\u00010ZH\u0002¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J1\u0010Û\u0001\u001a\t\u0012\u0004\u0012\u00020-0\u00ad\u00012\u000e\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u00020-0\u00ad\u00012\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J7\u0010â\u0001\u001a\u0005\u0018\u00010á\u00012\t\u0010Ý\u0001\u001a\u0004\u0018\u00010-2\t\u0010Þ\u0001\u001a\u0004\u0018\u00010-2\n\u0010à\u0001\u001a\u0005\u0018\u00010ß\u0001H\u0002¢\u0006\u0006\bâ\u0001\u0010ã\u0001J\u001b\u0010ä\u0001\u001a\u00030á\u00012\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0006\bä\u0001\u0010å\u0001J#\u0010æ\u0001\u001a\u00020 2\u0006\u0010(\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0005\bæ\u0001\u0010*J\u001c\u0010é\u0001\u001a\u00020 2\b\u0010è\u0001\u001a\u00030ç\u0001H\u0002¢\u0006\u0006\bé\u0001\u0010ê\u0001J&\u0010ë\u0001\u001a\u00020 2\b\u0010è\u0001\u001a\u00030ç\u00012\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0006\bë\u0001\u0010ì\u0001J\u001a\u0010í\u0001\u001a\u00020 2\u0006\u00101\u001a\u00020-H\u0082@¢\u0006\u0005\bí\u0001\u00100J\u001b\u0010í\u0001\u001a\u00020 2\u0006\u0010\t\u001a\u00020\u0002H\u0082@¢\u0006\u0006\bí\u0001\u0010î\u0001J#\u0010ï\u0001\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0005\bï\u0001\u0010=J\u0019\u0010ð\u0001\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0005\bð\u0001\u00105J\"\u0010ò\u0001\u001a\u00020 2\u0007\u0010ñ\u0001\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0005\bò\u0001\u0010=J\u0019\u0010ó\u0001\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0005\bó\u0001\u00105J\u001e\u0010ö\u0001\u001a\u00020 2\n\u0010õ\u0001\u001a\u0005\u0018\u00010ô\u0001H\u0002¢\u0006\u0006\bö\u0001\u0010÷\u0001J\u0019\u0010ø\u0001\u001a\u00020 2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0005\bø\u0001\u0010?J\u0011\u0010ù\u0001\u001a\u00020 H\u0002¢\u0006\u0005\bù\u0001\u0010\"J\u0011\u0010ú\u0001\u001a\u00020 H\u0002¢\u0006\u0005\bú\u0001\u0010\"J\u0011\u0010û\u0001\u001a\u00020 H\u0002¢\u0006\u0005\bû\u0001\u0010\"J\u0011\u0010ü\u0001\u001a\u00020 H\u0002¢\u0006\u0005\bü\u0001\u0010\"J\u0019\u0010ý\u0001\u001a\u00020 2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0005\bý\u0001\u0010?J\u001c\u0010\u0080\u0002\u001a\u00020 2\b\u0010ÿ\u0001\u001a\u00030þ\u0001H\u0002¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J3\u0010\u0086\u0002\u001a\u00020 2\b\u0010\u0083\u0002\u001a\u00030\u0082\u00022\u0015\u0010\u0085\u0002\u001a\u0010\u0012\u0005\u0012\u00030\u0082\u0002\u0012\u0005\u0012\u00030\u0084\u000207H\u0002¢\u0006\u0006\b\u0086\u0002\u0010\u0087\u0002R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0088\u0002R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0089\u0002R\u001a\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\b\u0007\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002R\u0017\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u0088\u0002R\u0017\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010\u0088\u0002R\u001a\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\u000f\n\u0005\b\u000b\u0010\u008d\u0002\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010\u0090\u0002R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0091\u0002R\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006¢\u0006\u000f\n\u0005\b\u0012\u0010\u0092\u0002\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002R\u0015\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u008a\u0002R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u0095\u0002R\u0015\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u008a\u0002R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010\u0096\u0002R\u0015\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u0096\u0002R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u0097\u0002R\u0015\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010\u008a\u0002R\u0015\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u008a\u0002R!\u0010\u009d\u0002\u001a\u00030\u0098\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0099\u0002\u0010\u009a\u0002\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002R\u0018\u0010\u009f\u0002\u001a\u00030\u009e\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0002\u0010 \u0002R#\u0010¢\u0002\u001a\t\u0012\u0005\u0012\u00030¡\u00020\u00108\u0006¢\u0006\u0010\n\u0006\b¢\u0002\u0010\u0092\u0002\u001a\u0006\b£\u0002\u0010\u0094\u0002R\"\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010h0\u00108\u0006¢\u0006\u000f\n\u0005\bi\u0010\u0092\u0002\u001a\u0006\b¤\u0002\u0010\u0094\u0002R&\u0010¦\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010»\u00010¥\u00028\u0006¢\u0006\u0010\n\u0006\b¦\u0002\u0010§\u0002\u001a\u0006\b¨\u0002\u0010©\u0002R\u001e\u0010«\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060ª\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0002\u0010¬\u0002R\u001b\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0002\u0010\u0088\u0002R!\u0010²\u0002\u001a\u00030®\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¯\u0002\u0010\u009a\u0002\u001a\u0006\b°\u0002\u0010±\u0002R0\u0010Ó\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00020Ò\u00010\u00108\u0006¢\u0006\u0017\n\u0006\bÓ\u0001\u0010\u0092\u0002\u0012\u0005\b´\u0002\u0010\"\u001a\u0006\b³\u0002\u0010\u0094\u0002R*\u0010Ñ\u0001\u001a\t\u0012\u0005\u0012\u00030Ð\u00010\u00108\u0006¢\u0006\u0017\n\u0006\bÑ\u0001\u0010\u0092\u0002\u0012\u0005\b¶\u0002\u0010\"\u001a\u0006\bµ\u0002\u0010\u0094\u0002R\u001f\u0010¸\u0002\u001a\n\u0012\u0005\u0012\u00030·\u00020¥\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0002\u0010§\u0002R#\u0010¹\u0002\u001a\t\u0012\u0005\u0012\u00030·\u00020\u00108\u0006¢\u0006\u0010\n\u0006\b¹\u0002\u0010\u0092\u0002\u001a\u0006\bº\u0002\u0010\u0094\u0002R\u001c\u0010»\u0002\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\b»\u0002\u0010\u008a\u0002\u001a\u0006\b»\u0002\u0010\u008c\u0002R\u001f\u0010¼\u0002\u001a\n\u0012\u0005\u0012\u00030þ\u00010ª\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0002\u0010¬\u0002R$\u0010¾\u0002\u001a\n\u0012\u0005\u0012\u00030þ\u00010½\u00028\u0006¢\u0006\u0010\n\u0006\b¾\u0002\u0010¿\u0002\u001a\u0006\bÀ\u0002\u0010Á\u0002R%\u0010Â\u0002\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0084\u00020\u00108\u0006¢\u0006\u0010\n\u0006\bÂ\u0002\u0010\u0092\u0002\u001a\u0006\bÃ\u0002\u0010\u0094\u0002R\"\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0006¢\u0006\u0010\n\u0006\b¹\u0001\u0010\u0092\u0002\u001a\u0006\bÄ\u0002\u0010\u0094\u0002R)\u0010Î\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020h0\u00ad\u00010\u00108\u0006¢\u0006\u0010\n\u0006\bÎ\u0001\u0010\u0092\u0002\u001a\u0006\bÅ\u0002\u0010\u0094\u0002R\u001f\u0010Æ\u0002\u001a\n\u0012\u0005\u0012\u00030±\u00010¥\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0002\u0010§\u0002R#\u0010Ç\u0002\u001a\t\u0012\u0005\u0012\u00030±\u00010\u00108\u0006¢\u0006\u0010\n\u0006\bÇ\u0002\u0010\u0092\u0002\u001a\u0006\bÈ\u0002\u0010\u0094\u0002R\u001f\u0010Ê\u0002\u001a\n\u0012\u0005\u0012\u00030É\u00020¥\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0002\u0010§\u0002R#\u0010Ë\u0002\u001a\t\u0012\u0005\u0012\u00030É\u00020\u00108\u0006¢\u0006\u0010\n\u0006\bË\u0002\u0010\u0092\u0002\u001a\u0006\bÌ\u0002\u0010\u0094\u0002R\u001f\u0010Í\u0002\u001a\n\u0012\u0005\u0012\u00030±\u00010¥\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0002\u0010§\u0002R#\u0010Î\u0002\u001a\t\u0012\u0005\u0012\u00030±\u00010\u00108\u0006¢\u0006\u0010\n\u0006\bÎ\u0002\u0010\u0092\u0002\u001a\u0006\bÏ\u0002\u0010\u0094\u0002R#\u0010Ð\u0002\u001a\t\u0012\u0005\u0012\u00030±\u00010\u00108\u0006¢\u0006\u0010\n\u0006\bÐ\u0002\u0010\u0092\u0002\u001a\u0006\bÑ\u0002\u0010\u0094\u0002R\u001b\u0010Þ\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010Ò\u0002R\u001b\u0010Ó\u0002\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0002\u0010Ò\u0002R%\u0010Ô\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020L0Ò\u00010¥\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0002\u0010§\u0002R)\u0010Õ\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020L0Ò\u00010\u00108\u0006¢\u0006\u0010\n\u0006\bÕ\u0002\u0010\u0092\u0002\u001a\u0006\bÖ\u0002\u0010\u0094\u0002R \u0010×\u0002\u001a\t\u0012\u0004\u0012\u00020\u001a0¥\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0002\u0010§\u0002R\u001e\u0010Ø\u0002\u001a\t\u0012\u0004\u0012\u00020\u00170¥\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0002\u0010§\u0002R\u001e\u0010Ù\u0002\u001a\t\u0012\u0004\u0012\u00020\u00170¥\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0002\u0010§\u0002R\u001e\u0010Ú\u0002\u001a\t\u0012\u0004\u0012\u00020\u00060¥\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0002\u0010§\u0002R\"\u0010Û\u0002\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006¢\u0006\u0010\n\u0006\bÛ\u0002\u0010\u0092\u0002\u001a\u0006\bÜ\u0002\u0010\u0094\u0002R\u001e\u0010Ý\u0002\u001a\t\u0012\u0004\u0012\u00020\u00140¥\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0002\u0010§\u0002R\"\u0010Þ\u0002\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108\u0006¢\u0006\u0010\n\u0006\bÞ\u0002\u0010\u0092\u0002\u001a\u0006\bß\u0002\u0010\u0094\u0002R\"\u0010Ï\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010-0¥\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010§\u0002R)\u0010â\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0005\u0012\u00030á\u0002\u0018\u00010à\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0002\u0010ã\u0002R\"\u0010ä\u0002\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006¢\u0006\u0010\n\u0006\bä\u0002\u0010\u0092\u0002\u001a\u0006\bä\u0002\u0010\u0094\u0002R\u001c\u0010å\u0002\u001a\u0005\u0018\u00010á\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0002\u0010æ\u0002R\u0018\u0010è\u0002\u001a\u00030ç\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bè\u0002\u0010é\u0002R\u0018\u0010ë\u0002\u001a\u00030ê\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0002\u0010ì\u0002R\u001b\u0010í\u0002\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0002\u0010\u0088\u0002R\u001b\u0010î\u0002\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0002\u0010\u0088\u0002R\u0014\u0010Í\u0001\u001a\u00020\u00068F¢\u0006\b\u001a\u0006\bÍ\u0001\u0010\u008c\u0002R4\u0010ô\u0002\u001a\u0004\u0018\u00010\u00022\t\u0010ï\u0002\u001a\u0004\u0018\u00010\u00028@@@X\u0081\u000e¢\u0006\u0016\u0012\u0005\bó\u0002\u0010\"\u001a\u0006\bð\u0002\u0010ñ\u0002\"\u0005\bò\u0002\u00105R\u0018\u0010÷\u0002\u001a\u00030±\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bõ\u0002\u0010ö\u0002¨\u0006ü\u0002"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;", "", "", "cid", "Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;", "clipboardHandler", "", "threadLoadOrderOlderToNewer", "messageId", "parentMessageId", "", "messageLimit", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Lec3/f2;", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "channelState", "showSystemMessages", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;", "messageFooterVisibility", "enforceUniqueReactions", "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;", "dateSeparatorHandler", "threadDateSeparatorHandler", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;", "messagePositionHandler", "showDateSeparatorInEmptyThread", "showThreadSeparatorInEmptyThread", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;ZLjava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Lec3/f2;ZLio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;ZLio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;ZZ)V", "Ll83/a0;", "disableUnreadLabelButton", "()V", "hideUnreadSeparator", "scrollToFirstUnreadMessage", "Lkotlin/Function0;", "scrollToBottom", "(ILc93/a;)V", "baseMessageId", "loadNewerMessages", "(Ljava/lang/String;I)V", "loadOlderMessages", "(I)V", "Lio/getstream/chat/android/models/Message;", "message", "openRelatedThread", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "parentMessage", "enterThreadMode", "(Lio/getstream/chat/android/models/Message;ILq83/d;)Ljava/lang/Object;", "toggleOriginalText", "(Ljava/lang/String;)V", "enterNormalMode", "Lkotlin/Function1;", "Ln23/h;", "onResult", "loadMessageById", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "scrollToMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "selectMessage", "(Lio/getstream/chat/android/models/Message;)V", "selectReactions", "selectExtendedReactions", "Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;", "selectedPoll", "displayPollMoreOptions", "(Lio/getstream/chat/android/ui/common/state/messages/poll/SelectedPoll;)V", "Lio/getstream/chat/android/models/Poll;", "poll", "Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;", "pollSelectionType", "updatePollState", "(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/poll/PollSelectionType;)V", "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "messageAction", "performMessageAction", "(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;Lq83/d;)Ljava/lang/Object;", "dismissMessageAction", "(Lio/getstream/chat/android/ui/common/state/messages/MessageAction;)V", "dismissAllMessageActions", "removeOverlay", "hard", "deleteMessage", "(Lio/getstream/chat/android/models/Message;Z)V", "updateLastSeenMessage", "markLastMessageRead", "reason", "", "customData", "Lio/getstream/chat/android/models/Flag;", "flagMessage", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "markUnread", "(Lio/getstream/chat/android/models/Message;Lkotlin/jvm/functions/Function1;)V", "updateMessagePin", "Ljava/util/Date;", "expiresAt", "pinMessage", "(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)V", "unpinMessage", "resendMessage", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "updateUserMute", "(Lio/getstream/chat/android/models/User;)V", "muteUser", "unmuteUser", "pollId", "Lio/getstream/chat/android/models/Option;", "option", "castVote", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Option;)V", "answer", "castAnswer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lio/getstream/chat/android/models/Vote;", "vote", "removeVote", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Vote;)V", "closePoll", "Lio/getstream/chat/android/models/Reaction;", "reaction", "skipPush", "reactToMessage", "(Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/Message;Z)V", "getMessageFromListStateById", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;", "clearNewMessageState", "userId", "timeout", "(Ljava/lang/String;Ljava/lang/Integer;)V", "banUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "unbanUser", "shadowBanUser", "removeShadowBanFromUser", "flagUser", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "unflagUser", "blockUser", "unblockUser", "Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;", "action", "performGiphyAction", "(Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)V", "Lio/getstream/chat/android/models/Attachment;", "attachmentToBeDeleted", "removeAttachment", "(Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;)V", "setMessagePositionHandler", "(Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;)V", "setDateSeparatorHandler", "(Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;)V", "setThreadDateSeparatorHandler", "setMessageFooterVisibility", "(Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;)V", "areSystemMessagesVisible", "setSystemMessageVisibility", "(Z)V", "onCleared", "updatePollOption", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)V", "(Lio/getstream/chat/android/models/Poll;)V", "addPollOption", "(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;)V", "pauseAudioRecordingAttachments", "observeMessagesListState", "observeUnreadLabelState", "initialFocusMessage", "(Lq83/d;)Ljava/lang/Object;", "", "lastReadMessageId", "focusUnreadMessage", "(Ljava/util/List;Ljava/lang/String;)V", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;", "newState", "updateMessageList", "(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V", "endOfOldMessagesReached", "updateEndOfOldMessagesReached", "currentUser", "updateCurrentUser", "unreadCount", "updateUnreadCount", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;", "unreadLabel", "updateUnreadLabel", "(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;)V", "isLoadingOlderMessages", "updateIsLoadingOlderMessages", "isLoadingNewerMessages", "updateIsLoadingNewerMessages", "setMessageListState", "threadId", "messages", "endOfOlderMessages", "Lio/getstream/chat/android/models/ChannelUserRead;", "reads", "Lio/getstream/chat/android/models/Member;", QueryChannelRequest.KEY_MEMBERS, "observeThreadMessagesState", "(Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;)V", "isInThread", "typingUsers", "focusedMessage", "Lio/getstream/chat/android/models/Channel;", "channel", "", "ownCapabilities", "messagesInOriginalLanguage", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;", "groupMessages", "(Ljava/util/List;ZLjava/util/List;Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;Ljava/util/List;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;Ljava/util/List;ZLio/getstream/chat/android/models/Channel;Ljava/util/Set;Ljava/util/Set;)Ljava/util/List;", "membersMap", "belongsToFreshlyAddedMember", "(Lio/getstream/chat/android/models/ChannelUserRead;Ljava/util/Map;)Z", "filterMessagesToShow", "(Ljava/util/List;Z)Ljava/util/List;", "lastMessage", "lastLoadedMessage", "Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;", "typingItemState", "Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;", "getNewMessageState", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;)Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;", "getNewMessageStateForMessage", "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;", "loadNewerChannelMessages", "Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;", "threadMode", "loadNewerMessagesInThread", "(Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;)V", "threadLoadMore", "(Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;I)V", "enterThreadSequential", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "focusMessage", "focusChannelMessage", "threadMessageId", "focusThreadMessage", "removeMessageFocus", "Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;", "selectedMessageState", "changeSelectMessageState", "(Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;)V", "copyMessage", "markLastMessageReadInternal", "markChannelAsRead", "markThreadAsRead", "showEmptyState", "pauseRunningAudioRecordings", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;", NotificationCompat.CATEGORY_EVENT, "emitEvent", "(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;)V", "Ln23/e;", "error", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "onError", "onActionResult", "(Ln23/e;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/String;", "Lio/getstream/chat/android/ui/common/helper/ClipboardHandler;", "Z", "getThreadLoadOrderOlderToNewer", "()Z", "I", "getMessageLimit", "()I", "Lio/getstream/chat/android/client/ChatClient;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lec3/f2;", "getChannelState", "()Lec3/f2;", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;", "Lio/getstream/chat/android/ui/common/feature/messages/list/DateSeparatorHandler;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessagePositionHandler;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lbc3/c0;", "scope", "Lbc3/c0;", "Lio/getstream/chat/android/models/ConnectionState;", "connectionState", "getConnectionState", "getUser", "Lec3/p1;", "unreadLabelState", "Lec3/p1;", "getUnreadLabelState", "()Lec3/p1;", "Lec3/o1;", "showUnreadButtonState", "Lec3/o1;", "lastProcessedReadMessageId", "Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;", "originalTranslationsStore$delegate", "getOriginalTranslationsStore", "()Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;", "originalTranslationsStore", "getOwnCapabilities", "getOwnCapabilities$annotations", "getChannel", "getChannel$annotations", "Lio/getstream/chat/android/ui/common/state/messages/MessageMode;", "_mode", "mode", "getMode", "isStartedForThread", "_events", "Lec3/t1;", "events", "Lec3/t1;", "getEvents", "()Lec3/t1;", "errorEvents", "getErrorEvents", "getUnreadCount", "getTypingUsers", "_messageListState", "messageListState", "getMessageListState", "Lio/getstream/chat/android/ui/common/state/messages/poll/PollState;", "_pollState", "pollState", "getPollState", "_threadListState", "threadListState", "getThreadListState", "listState", "getListState", "Lio/getstream/chat/android/models/Message;", "lastLoadedThreadMessage", "_messageActions", "messageActions", "getMessageActions", "_messagePositionHandler", "_dateSeparatorHandler", "_threadDateSeparatorHandler", "_showSystemMessagesState", "showSystemMessagesState", "getShowSystemMessagesState", "_messageFooterVisibilityState", "messageFooterVisibilityState", "getMessageFooterVisibilityState", "Ll83/k;", "Lbc3/k1;", "removeFocusedMessageJob", "Ll83/k;", "isInsideSearch", "threadJob", "Lbc3/k1;", "Lio/getstream/chat/android/core/utils/Debouncer;", "debouncer", "Lio/getstream/chat/android/core/utils/Debouncer;", "Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;", "unreadLabelCalculator", "Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;", "lastSeenChannelMessageId", "lastSeenThreadMessageId", "value", "getLastSeenMessageId$stream_chat_android_ui_common_release", "()Ljava/lang/String;", "setLastSeenMessageId$stream_chat_android_ui_common_release", "getLastSeenMessageId$stream_chat_android_ui_common_release$annotations", "lastSeenMessageId", "getMessagesState", "()Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;", "messagesState", "Companion", "Event", "ErrorEvent", "UnreadLabel", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListController {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final int DEFAULT_MESSAGES_LIMIT = 30;
    public static final long MEMBERSHIP_AND_LAST_READ_THRESHOLD_MS = 100;
    public static final long REMOVE_MESSAGE_FOCUS_DELAY = 2000;
    private final InterfaceC13075p1 _dateSeparatorHandler;
    private final InterfaceC13072o1 _events;
    private final InterfaceC13075p1 _messageActions;
    private final InterfaceC13075p1 _messageFooterVisibilityState;
    private final InterfaceC13075p1 _messageListState;
    private InterfaceC13075p1 _messagePositionHandler;
    private final InterfaceC13075p1 _mode;
    private final InterfaceC13075p1 _pollState;
    private final InterfaceC13075p1 _showSystemMessagesState;
    private final InterfaceC13075p1 _threadDateSeparatorHandler;
    private final InterfaceC13075p1 _threadListState;
    private final InterfaceC13037f2 channel;
    private final InterfaceC13037f2 channelState;
    private final ChatClient chatClient;
    private final String cid;
    private final ClientState clientState;
    private final ClipboardHandler clipboardHandler;
    private final InterfaceC13037f2 connectionState;
    private final DateSeparatorHandler dateSeparatorHandler;
    private final Debouncer debouncer;
    private final boolean enforceUniqueReactions;
    private final InterfaceC13037f2 errorEvents;
    private final InterfaceC13087t1 events;
    private InterfaceC13075p1 focusedMessage;
    private final InterfaceC13037f2 isInsideSearch;
    private final boolean isStartedForThread;
    private Message lastLoadedMessage;
    private Message lastLoadedThreadMessage;
    private String lastProcessedReadMessageId;
    private volatile String lastSeenChannelMessageId;
    private volatile String lastSeenThreadMessageId;
    private final InterfaceC13037f2 listState;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC13037f2 messageActions;
    private final MessageFooterVisibility messageFooterVisibility;
    private final InterfaceC13037f2 messageFooterVisibilityState;
    private final String messageId;
    private final int messageLimit;
    private final InterfaceC13037f2 messageListState;
    private final MessagePositionHandler messagePositionHandler;
    private final InterfaceC13037f2 mode;

    /* JADX INFO: renamed from: originalTranslationsStore$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h originalTranslationsStore;
    private final InterfaceC13037f2 ownCapabilities;
    private final String parentMessageId;
    private final InterfaceC13037f2 pollState;
    private C23465k removeFocusedMessageJob;
    private final InterfaceC2994c0 scope;
    private final boolean showDateSeparatorInEmptyThread;
    private final boolean showSystemMessages;
    private final InterfaceC13037f2 showSystemMessagesState;
    private final boolean showThreadSeparatorInEmptyThread;
    private final InterfaceC13072o1 showUnreadButtonState;
    private final DateSeparatorHandler threadDateSeparatorHandler;
    private InterfaceC3027k1 threadJob;
    private final InterfaceC13037f2 threadListState;
    private final boolean threadLoadOrderOlderToNewer;
    private final InterfaceC13037f2 typingUsers;
    private final InterfaceC13037f2 unreadCount;
    private final UnreadLabelCalculator unreadLabelCalculator;
    private final InterfaceC13075p1 unreadLabelState;
    private final InterfaceC13037f2 user;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$2", m100430f = "MessageListController.kt", m100431l = {469, 472}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195522 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C195522(InterfaceC30057d<? super C195522> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageListController.this.new C195522(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195522) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        
            if (r5.initialFocusMessage(r4) == r0) goto L17;
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
                goto L46
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L36
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                io.getstream.chat.android.ui.common.feature.messages.list.MessageListController r5 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.this
                java.lang.String r5 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.access$getParentMessageId$p(r5)
                if (r5 == 0) goto L36
                io.getstream.chat.android.ui.common.feature.messages.list.MessageListController r5 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.this
                java.lang.String r1 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.access$getParentMessageId$p(r5)
                r4.label = r3
                java.lang.Object r5 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.access$enterThreadSequential(r5, r1, r4)
                if (r5 != r0) goto L36
                goto L45
            L36:
                io.getstream.chat.android.ui.common.feature.messages.list.MessageListController r5 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.this
                io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.access$observeMessagesListState(r5)
                io.getstream.chat.android.ui.common.feature.messages.list.MessageListController r5 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.this
                r4.label = r2
                java.lang.Object r5 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.access$initialFocusMessage(r5, r4)
                if (r5 != r0) goto L46
            L45:
                return r0
            L46:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.C195522.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Companion;", "", "<init>", "()V", "DEFAULT_MESSAGES_LIMIT", "", "getDEFAULT_MESSAGES_LIMIT$annotations", "REMOVE_MESSAGE_FOCUS_DELAY", "", "MEMBERSHIP_AND_LAST_READ_THRESHOLD_MS", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @InternalStreamChatApi
        public static /* synthetic */ void getDEFAULT_MESSAGES_LIMIT$annotations() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u000e\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "Ln23/e;", "getStreamError", "()Ln23/e;", "MuteUserError", "UnmuteUserError", "FlagMessageError", "MarkUnreadError", "PollCreationError", "PollCastingVoteError", "PollRemovingVoteError", "PollClosingError", "BlockUserError", "UnblockUserError", "FlagUserError", "UnflagUserError", "PinMessageError", "UnpinMessageError", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$FlagMessageError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$FlagUserError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$MarkUnreadError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$MuteUserError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PinMessageError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollCastingVoteError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollClosingError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollCreationError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollRemovingVoteError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnblockUserError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnflagUserError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnpinMessageError;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class ErrorEvent implements Event {
        public static final int $stable = 8;
        private final AbstractC26202e streamError;

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$BlockUserError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class BlockUserError extends ErrorEvent {
            public static final int $stable = 8;
            private final AbstractC26202e streamError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BlockUserError(AbstractC26202e streamError) {
                super(streamError, null);
                AbstractC22676k.m65750j(streamError, "streamError");
                this.streamError = streamError;
            }

            public static /* synthetic */ BlockUserError copy$default(BlockUserError blockUserError, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = blockUserError.streamError;
                }
                return blockUserError.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final BlockUserError copy(AbstractC26202e streamError) {
                AbstractC22676k.m65750j(streamError, "streamError");
                return new BlockUserError(streamError);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BlockUserError) && AbstractC22676k.m65745e(this.streamError, ((BlockUserError) other).streamError);
            }

            @Override // io.getstream.chat.android.ui.common.feature.messages.list.MessageListController.ErrorEvent
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final int hashCode() {
                return this.streamError.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48503e("BlockUserError(streamError=", this.streamError, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$FlagMessageError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$FlagMessageError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class FlagMessageError extends ErrorEvent {
            public static final int $stable = 8;
            private final AbstractC26202e streamError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FlagMessageError(AbstractC26202e streamError) {
                super(streamError, null);
                AbstractC22676k.m65750j(streamError, "streamError");
                this.streamError = streamError;
            }

            public static /* synthetic */ FlagMessageError copy$default(FlagMessageError flagMessageError, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = flagMessageError.streamError;
                }
                return flagMessageError.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final FlagMessageError copy(AbstractC26202e streamError) {
                AbstractC22676k.m65750j(streamError, "streamError");
                return new FlagMessageError(streamError);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FlagMessageError) && AbstractC22676k.m65745e(this.streamError, ((FlagMessageError) other).streamError);
            }

            @Override // io.getstream.chat.android.ui.common.feature.messages.list.MessageListController.ErrorEvent
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final int hashCode() {
                return this.streamError.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48503e("FlagMessageError(streamError=", this.streamError, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$FlagUserError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$FlagUserError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class FlagUserError extends ErrorEvent {
            public static final int $stable = 8;
            private final AbstractC26202e streamError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FlagUserError(AbstractC26202e streamError) {
                super(streamError, null);
                AbstractC22676k.m65750j(streamError, "streamError");
                this.streamError = streamError;
            }

            public static /* synthetic */ FlagUserError copy$default(FlagUserError flagUserError, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = flagUserError.streamError;
                }
                return flagUserError.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final FlagUserError copy(AbstractC26202e streamError) {
                AbstractC22676k.m65750j(streamError, "streamError");
                return new FlagUserError(streamError);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FlagUserError) && AbstractC22676k.m65745e(this.streamError, ((FlagUserError) other).streamError);
            }

            @Override // io.getstream.chat.android.ui.common.feature.messages.list.MessageListController.ErrorEvent
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final int hashCode() {
                return this.streamError.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48503e("FlagUserError(streamError=", this.streamError, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$MarkUnreadError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$MarkUnreadError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class MarkUnreadError extends ErrorEvent {
            public static final int $stable = 8;
            private final AbstractC26202e streamError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MarkUnreadError(AbstractC26202e streamError) {
                super(streamError, null);
                AbstractC22676k.m65750j(streamError, "streamError");
                this.streamError = streamError;
            }

            public static /* synthetic */ MarkUnreadError copy$default(MarkUnreadError markUnreadError, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = markUnreadError.streamError;
                }
                return markUnreadError.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final MarkUnreadError copy(AbstractC26202e streamError) {
                AbstractC22676k.m65750j(streamError, "streamError");
                return new MarkUnreadError(streamError);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MarkUnreadError) && AbstractC22676k.m65745e(this.streamError, ((MarkUnreadError) other).streamError);
            }

            @Override // io.getstream.chat.android.ui.common.feature.messages.list.MessageListController.ErrorEvent
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final int hashCode() {
                return this.streamError.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48503e("MarkUnreadError(streamError=", this.streamError, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$MuteUserError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$MuteUserError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class MuteUserError extends ErrorEvent {
            public static final int $stable = 8;
            private final AbstractC26202e streamError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MuteUserError(AbstractC26202e streamError) {
                super(streamError, null);
                AbstractC22676k.m65750j(streamError, "streamError");
                this.streamError = streamError;
            }

            public static /* synthetic */ MuteUserError copy$default(MuteUserError muteUserError, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = muteUserError.streamError;
                }
                return muteUserError.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final MuteUserError copy(AbstractC26202e streamError) {
                AbstractC22676k.m65750j(streamError, "streamError");
                return new MuteUserError(streamError);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MuteUserError) && AbstractC22676k.m65745e(this.streamError, ((MuteUserError) other).streamError);
            }

            @Override // io.getstream.chat.android.ui.common.feature.messages.list.MessageListController.ErrorEvent
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final int hashCode() {
                return this.streamError.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48503e("MuteUserError(streamError=", this.streamError, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PinMessageError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PinMessageError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class PinMessageError extends ErrorEvent {
            public static final int $stable = 8;
            private final AbstractC26202e streamError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PinMessageError(AbstractC26202e streamError) {
                super(streamError, null);
                AbstractC22676k.m65750j(streamError, "streamError");
                this.streamError = streamError;
            }

            public static /* synthetic */ PinMessageError copy$default(PinMessageError pinMessageError, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = pinMessageError.streamError;
                }
                return pinMessageError.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final PinMessageError copy(AbstractC26202e streamError) {
                AbstractC22676k.m65750j(streamError, "streamError");
                return new PinMessageError(streamError);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PinMessageError) && AbstractC22676k.m65745e(this.streamError, ((PinMessageError) other).streamError);
            }

            @Override // io.getstream.chat.android.ui.common.feature.messages.list.MessageListController.ErrorEvent
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final int hashCode() {
                return this.streamError.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48503e("PinMessageError(streamError=", this.streamError, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollCastingVoteError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollCastingVoteError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class PollCastingVoteError extends ErrorEvent {
            public static final int $stable = 8;
            private final AbstractC26202e streamError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PollCastingVoteError(AbstractC26202e streamError) {
                super(streamError, null);
                AbstractC22676k.m65750j(streamError, "streamError");
                this.streamError = streamError;
            }

            public static /* synthetic */ PollCastingVoteError copy$default(PollCastingVoteError pollCastingVoteError, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = pollCastingVoteError.streamError;
                }
                return pollCastingVoteError.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final PollCastingVoteError copy(AbstractC26202e streamError) {
                AbstractC22676k.m65750j(streamError, "streamError");
                return new PollCastingVoteError(streamError);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PollCastingVoteError) && AbstractC22676k.m65745e(this.streamError, ((PollCastingVoteError) other).streamError);
            }

            @Override // io.getstream.chat.android.ui.common.feature.messages.list.MessageListController.ErrorEvent
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final int hashCode() {
                return this.streamError.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48503e("PollCastingVoteError(streamError=", this.streamError, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollClosingError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollClosingError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class PollClosingError extends ErrorEvent {
            public static final int $stable = 8;
            private final AbstractC26202e streamError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PollClosingError(AbstractC26202e streamError) {
                super(streamError, null);
                AbstractC22676k.m65750j(streamError, "streamError");
                this.streamError = streamError;
            }

            public static /* synthetic */ PollClosingError copy$default(PollClosingError pollClosingError, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = pollClosingError.streamError;
                }
                return pollClosingError.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final PollClosingError copy(AbstractC26202e streamError) {
                AbstractC22676k.m65750j(streamError, "streamError");
                return new PollClosingError(streamError);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PollClosingError) && AbstractC22676k.m65745e(this.streamError, ((PollClosingError) other).streamError);
            }

            @Override // io.getstream.chat.android.ui.common.feature.messages.list.MessageListController.ErrorEvent
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final int hashCode() {
                return this.streamError.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48503e("PollClosingError(streamError=", this.streamError, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollCreationError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollCreationError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class PollCreationError extends ErrorEvent {
            public static final int $stable = 8;
            private final AbstractC26202e streamError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PollCreationError(AbstractC26202e streamError) {
                super(streamError, null);
                AbstractC22676k.m65750j(streamError, "streamError");
                this.streamError = streamError;
            }

            public static /* synthetic */ PollCreationError copy$default(PollCreationError pollCreationError, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = pollCreationError.streamError;
                }
                return pollCreationError.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final PollCreationError copy(AbstractC26202e streamError) {
                AbstractC22676k.m65750j(streamError, "streamError");
                return new PollCreationError(streamError);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PollCreationError) && AbstractC22676k.m65745e(this.streamError, ((PollCreationError) other).streamError);
            }

            @Override // io.getstream.chat.android.ui.common.feature.messages.list.MessageListController.ErrorEvent
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final int hashCode() {
                return this.streamError.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48503e("PollCreationError(streamError=", this.streamError, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollRemovingVoteError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$PollRemovingVoteError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class PollRemovingVoteError extends ErrorEvent {
            public static final int $stable = 8;
            private final AbstractC26202e streamError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PollRemovingVoteError(AbstractC26202e streamError) {
                super(streamError, null);
                AbstractC22676k.m65750j(streamError, "streamError");
                this.streamError = streamError;
            }

            public static /* synthetic */ PollRemovingVoteError copy$default(PollRemovingVoteError pollRemovingVoteError, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = pollRemovingVoteError.streamError;
                }
                return pollRemovingVoteError.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final PollRemovingVoteError copy(AbstractC26202e streamError) {
                AbstractC22676k.m65750j(streamError, "streamError");
                return new PollRemovingVoteError(streamError);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PollRemovingVoteError) && AbstractC22676k.m65745e(this.streamError, ((PollRemovingVoteError) other).streamError);
            }

            @Override // io.getstream.chat.android.ui.common.feature.messages.list.MessageListController.ErrorEvent
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final int hashCode() {
                return this.streamError.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48503e("PollRemovingVoteError(streamError=", this.streamError, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnblockUserError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnblockUserError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class UnblockUserError extends ErrorEvent {
            public static final int $stable = 8;
            private final AbstractC26202e streamError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnblockUserError(AbstractC26202e streamError) {
                super(streamError, null);
                AbstractC22676k.m65750j(streamError, "streamError");
                this.streamError = streamError;
            }

            public static /* synthetic */ UnblockUserError copy$default(UnblockUserError unblockUserError, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = unblockUserError.streamError;
                }
                return unblockUserError.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final UnblockUserError copy(AbstractC26202e streamError) {
                AbstractC22676k.m65750j(streamError, "streamError");
                return new UnblockUserError(streamError);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnblockUserError) && AbstractC22676k.m65745e(this.streamError, ((UnblockUserError) other).streamError);
            }

            @Override // io.getstream.chat.android.ui.common.feature.messages.list.MessageListController.ErrorEvent
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final int hashCode() {
                return this.streamError.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48503e("UnblockUserError(streamError=", this.streamError, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnflagUserError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnflagUserError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class UnflagUserError extends ErrorEvent {
            public static final int $stable = 8;
            private final AbstractC26202e streamError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnflagUserError(AbstractC26202e streamError) {
                super(streamError, null);
                AbstractC22676k.m65750j(streamError, "streamError");
                this.streamError = streamError;
            }

            public static /* synthetic */ UnflagUserError copy$default(UnflagUserError unflagUserError, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = unflagUserError.streamError;
                }
                return unflagUserError.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final UnflagUserError copy(AbstractC26202e streamError) {
                AbstractC22676k.m65750j(streamError, "streamError");
                return new UnflagUserError(streamError);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnflagUserError) && AbstractC22676k.m65745e(this.streamError, ((UnflagUserError) other).streamError);
            }

            @Override // io.getstream.chat.android.ui.common.feature.messages.list.MessageListController.ErrorEvent
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final int hashCode() {
                return this.streamError.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48503e("UnflagUserError(streamError=", this.streamError, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnmuteUserError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class UnmuteUserError extends ErrorEvent {
            public static final int $stable = 8;
            private final AbstractC26202e streamError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnmuteUserError(AbstractC26202e streamError) {
                super(streamError, null);
                AbstractC22676k.m65750j(streamError, "streamError");
                this.streamError = streamError;
            }

            public static /* synthetic */ UnmuteUserError copy$default(UnmuteUserError unmuteUserError, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = unmuteUserError.streamError;
                }
                return unmuteUserError.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final UnmuteUserError copy(AbstractC26202e streamError) {
                AbstractC22676k.m65750j(streamError, "streamError");
                return new UnmuteUserError(streamError);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnmuteUserError) && AbstractC22676k.m65745e(this.streamError, ((UnmuteUserError) other).streamError);
            }

            @Override // io.getstream.chat.android.ui.common.feature.messages.list.MessageListController.ErrorEvent
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final int hashCode() {
                return this.streamError.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48503e("UnmuteUserError(streamError=", this.streamError, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnpinMessageError;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent$UnpinMessageError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class UnpinMessageError extends ErrorEvent {
            public static final int $stable = 8;
            private final AbstractC26202e streamError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnpinMessageError(AbstractC26202e streamError) {
                super(streamError, null);
                AbstractC22676k.m65750j(streamError, "streamError");
                this.streamError = streamError;
            }

            public static /* synthetic */ UnpinMessageError copy$default(UnpinMessageError unpinMessageError, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = unpinMessageError.streamError;
                }
                return unpinMessageError.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final UnpinMessageError copy(AbstractC26202e streamError) {
                AbstractC22676k.m65750j(streamError, "streamError");
                return new UnpinMessageError(streamError);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UnpinMessageError) && AbstractC22676k.m65745e(this.streamError, ((UnpinMessageError) other).streamError);
            }

            @Override // io.getstream.chat.android.ui.common.feature.messages.list.MessageListController.ErrorEvent
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final int hashCode() {
                return this.streamError.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48503e("UnpinMessageError(streamError=", this.streamError, ")");
            }
        }

        public /* synthetic */ ErrorEvent(AbstractC26202e abstractC26202e, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC26202e);
        }

        public AbstractC26202e getStreamError() {
            return this.streamError;
        }

        private ErrorEvent(AbstractC26202e abstractC26202e) {
            this.streamError = abstractC26202e;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;", "", "PollClosingSuccess", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$ErrorEvent;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event$PollClosingSuccess;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface Event {

        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event$PollClosingSuccess;", "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$Event;", "poll", "Lio/getstream/chat/android/models/Poll;", "<init>", "(Lio/getstream/chat/android/models/Poll;)V", "getPoll", "()Lio/getstream/chat/android/models/Poll;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class PollClosingSuccess implements Event {
            public static final int $stable = 0;
            private final Poll poll;

            public PollClosingSuccess(Poll poll) {
                AbstractC22676k.m65750j(poll, "poll");
                this.poll = poll;
            }

            public static /* synthetic */ PollClosingSuccess copy$default(PollClosingSuccess pollClosingSuccess, Poll poll, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    poll = pollClosingSuccess.poll;
                }
                return pollClosingSuccess.copy(poll);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Poll getPoll() {
                return this.poll;
            }

            public final PollClosingSuccess copy(Poll poll) {
                AbstractC22676k.m65750j(poll, "poll");
                return new PollClosingSuccess(poll);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PollClosingSuccess) && AbstractC22676k.m65745e(this.poll, ((PollClosingSuccess) other).poll);
            }

            public final Poll getPoll() {
                return this.poll;
            }

            public final int hashCode() {
                return this.poll.hashCode();
            }

            public final String toString() {
                return "PollClosingSuccess(poll=" + this.poll + ")";
            }
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;", "", "unreadCount", "", "lastReadMessageId", "", "buttonVisibility", "", "<init>", "(ILjava/lang/String;Z)V", "getUnreadCount", "()I", "getLastReadMessageId", "()Ljava/lang/String;", "getButtonVisibility", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnreadLabel {
        public static final int $stable = 0;
        private final boolean buttonVisibility;
        private final String lastReadMessageId;
        private final int unreadCount;

        public UnreadLabel(int i13, String lastReadMessageId, boolean z4) {
            AbstractC22676k.m65750j(lastReadMessageId, "lastReadMessageId");
            this.unreadCount = i13;
            this.lastReadMessageId = lastReadMessageId;
            this.buttonVisibility = z4;
        }

        public static /* synthetic */ UnreadLabel copy$default(UnreadLabel unreadLabel, int i13, String str, boolean z4, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = unreadLabel.unreadCount;
            }
            if ((i14 & 2) != 0) {
                str = unreadLabel.lastReadMessageId;
            }
            if ((i14 & 4) != 0) {
                z4 = unreadLabel.buttonVisibility;
            }
            return unreadLabel.copy(i13, str, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getUnreadCount() {
            return this.unreadCount;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLastReadMessageId() {
            return this.lastReadMessageId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getButtonVisibility() {
            return this.buttonVisibility;
        }

        public final UnreadLabel copy(int unreadCount, String lastReadMessageId, boolean buttonVisibility) {
            AbstractC22676k.m65750j(lastReadMessageId, "lastReadMessageId");
            return new UnreadLabel(unreadCount, lastReadMessageId, buttonVisibility);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnreadLabel)) {
                return false;
            }
            UnreadLabel unreadLabel = (UnreadLabel) other;
            return this.unreadCount == unreadLabel.unreadCount && AbstractC22676k.m65745e(this.lastReadMessageId, unreadLabel.lastReadMessageId) && this.buttonVisibility == unreadLabel.buttonVisibility;
        }

        public final boolean getButtonVisibility() {
            return this.buttonVisibility;
        }

        public final String getLastReadMessageId() {
            return this.lastReadMessageId;
        }

        public final int getUnreadCount() {
            return this.unreadCount;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.buttonVisibility) + AbstractC11266d.m30450d(Integer.hashCode(this.unreadCount) * 31, 31, this.lastReadMessageId);
        }

        public final String toString() {
            int i13 = this.unreadCount;
            String str = this.lastReadMessageId;
            return AbstractC18489d0.m53372m(AbstractC18489d0.m53373n(i13, "UnreadLabel(unreadCount=", ", lastReadMessageId=", str, ", buttonVisibility="), this.buttonVisibility, ")");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$addPollOption$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$addPollOption$1", m100430f = "MessageListController.kt", m100431l = {2447}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195531 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $option;
        final /* synthetic */ String $pollId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195531(String str, String str2, InterfaceC30057d<? super C195531> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$pollId = str;
            this.$option = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageListController.this.new C195531(this.$pollId, this.$option, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195531) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC27474d interfaceC27474dCreatePollOption = MessageListController.this.chatClient.createPollOption(this.$pollId, new PollOption(this.$option, null, 2, 0 == true ? 1 : 0));
                this.label = 1;
                if (interfaceC27474dCreatePollOption.await(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$closePoll$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$closePoll$3", m100430f = "MessageListController.kt", m100431l = {2425}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195543 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Poll $poll;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195543(Poll poll, InterfaceC30057d<? super C195543> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$poll = poll;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageListController.this.new C195543(this.$poll, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195543) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC27474d interfaceC27474dClosePoll = MessageListController.this.chatClient.closePoll(this.$poll.getId());
                this.label = 1;
                if (interfaceC27474dClosePoll.await(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$emitEvent$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$emitEvent$1", m100430f = "MessageListController.kt", m100431l = {2370}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195551 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Event $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195551(Event event, InterfaceC30057d<? super C195551> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$event = event;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageListController.this.new C195551(this.$event, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195551) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = MessageListController.this._events;
                Event event = this.$event;
                this.label = 1;
                if (interfaceC13072o1.emit(event, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$enterThreadMode$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController", m100430f = "MessageListController.kt", m100431l = {1267}, m100432m = "enterThreadMode")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C195561 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C195561(InterfaceC30057d<? super C195561> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageListController.this.enterThreadMode(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$enterThreadSequential$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController", m100430f = "MessageListController.kt", m100431l = {1301}, m100432m = "enterThreadSequential")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C195571 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C195571(InterfaceC30057d<? super C195571> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageListController.this.enterThreadSequential((Message) null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$enterThreadSequential$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController", m100430f = "MessageListController.kt", m100431l = {1327, 1331}, m100432m = "enterThreadSequential")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C195583 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C195583(InterfaceC30057d<? super C195583> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessageListController.this.enterThreadSequential((String) null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$focusThreadMessage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$focusThreadMessage$1", m100430f = "MessageListController.kt", m100431l = {1449, 1452}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195591 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $parentMessageId;
        final /* synthetic */ String $threadMessageId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195591(String str, String str2, InterfaceC30057d<? super C195591> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$parentMessageId = str;
            this.$threadMessageId = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageListController.this.new C195591(this.$parentMessageId, this.$threadMessageId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195591) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
        
            if (r8 == r0) goto L19;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r7.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r7.L$0
                io.getstream.chat.android.ui.common.state.messages.MessageMode r0 = (io.getstream.chat.android.p226ui.common.state.messages.MessageMode) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L74
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                java.lang.Object r1 = r7.L$0
                io.getstream.chat.android.ui.common.state.messages.MessageMode r1 = (io.getstream.chat.android.p226ui.common.state.messages.MessageMode) r1
                p505ts.AbstractC34132o.m107864I(r8)
                goto L5b
            L25:
                p505ts.AbstractC34132o.m107864I(r8)
                io.getstream.chat.android.ui.common.feature.messages.list.MessageListController r8 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.this
                ec3.p1 r8 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.access$get_mode$p(r8)
                ec3.h2 r8 = (ec3.C13045h2) r8
                java.lang.Object r8 = r8.getValue()
                io.getstream.chat.android.ui.common.state.messages.MessageMode r8 = (io.getstream.chat.android.p226ui.common.state.messages.MessageMode) r8
                boolean r1 = r8 instanceof io.getstream.chat.android.ui.common.state.messages.MessageMode.MessageThread
                if (r1 == 0) goto L4c
                io.getstream.chat.android.ui.common.state.messages.MessageMode$MessageThread r8 = (io.getstream.chat.android.ui.common.state.messages.MessageMode.MessageThread) r8
                io.getstream.chat.android.models.Message r8 = r8.getParentMessage()
                java.lang.String r8 = r8.getId()
                java.lang.String r1 = r7.$parentMessageId
                boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r8, r1)
                if (r8 != 0) goto L5b
            L4c:
                io.getstream.chat.android.ui.common.feature.messages.list.MessageListController r8 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.this
                java.lang.String r1 = r7.$parentMessageId
                r7.L$0 = r4
                r7.label = r3
                java.lang.Object r8 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.access$enterThreadSequential(r8, r1, r7)
                if (r8 != r0) goto L5b
                goto L73
            L5b:
                io.getstream.chat.android.ui.common.feature.messages.list.MessageListController r8 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.this
                io.getstream.chat.android.client.ChatClient r8 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.access$getChatClient$p(r8)
                java.lang.String r1 = r7.$threadMessageId
                o23.d r8 = io.getstream.chat.android.client.api.state.ChatClientExtensions.getMessageUsingCache(r8, r1)
                r7.L$0 = r4
                r7.label = r2
                o23.h r8 = (o23.C27478h) r8
                java.lang.Object r8 = r8.await(r7)
                if (r8 != r0) goto L74
            L73:
                return r0
            L74:
                n23.h r8 = (n23.AbstractC26205h) r8
                io.getstream.chat.android.ui.common.feature.messages.list.MessageListController r0 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.this
                ec3.p1 r0 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.access$getFocusedMessage$p(r0)
                boolean r1 = r8 instanceof n23.C26204g
                if (r1 == 0) goto L88
                n23.g r8 = (n23.C26204g) r8
                java.lang.Object r8 = r8.f103919a
                r4 = r8
                io.getstream.chat.android.models.Message r4 = (io.getstream.chat.android.models.Message) r4
                goto Lb3
            L88:
                boolean r1 = r8 instanceof n23.C26203f
                if (r1 == 0) goto Lbb
                io.getstream.chat.android.ui.common.feature.messages.list.MessageListController r1 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.this
                b23.k r1 = io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.access$getLogger(r1)
                b23.e r2 = r1.f9275c
                java.lang.String r3 = r1.f9273a
                b23.g r5 = b23.EnumC2341g.ERROR
                boolean r2 = r2.isLoggable(r5, r3)
                if (r2 == 0) goto Lb3
                b23.j r1 = r1.f9274b
                n23.f r8 = (n23.C26203f) r8
                n23.e r8 = r8.f103918a
                java.lang.String r8 = r8.mo77807a()
                java.lang.String r2 = "[focusThreadMessage] -> Could not focus thread parent: "
                java.lang.String r6 = "."
                java.lang.String r8 = p088dc.AbstractC11895b.m31996o(r2, r8, r6)
                r1.log(r5, r3, r8, r4)
            Lb3:
                ec3.h2 r0 = (ec3.C13045h2) r0
                r0.m36570j(r4)
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            Lbb:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController.C195591.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$initialFocusMessage$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$initialFocusMessage$2", m100430f = "MessageListController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195602 extends AbstractC32275i implements Function3 {
        int label;

        public C195602(InterfaceC30057d<? super C195602> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195602 c195602 = MessageListController.this.new C195602(interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195602.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            boolean zIsEmpty = ((MessageListState) MessageListController.this.getListState().getValue()).getMessageItems().isEmpty();
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (!zIsEmpty) {
                C2345k logger = MessageListController.this.getLogger();
                MessageListController messageListController = MessageListController.this;
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC25012a.m73375h(((C13045h2) messageListController._mode).getValue(), "[initialFocusMessage] mode: "), null);
                }
                if (((C13045h2) MessageListController.this._mode).getValue() instanceof MessageMode.Normal) {
                    MessageListController messageListController2 = MessageListController.this;
                    messageListController2.focusChannelMessage(messageListController2.messageId);
                    return c23454a0;
                }
                if ((((C13045h2) MessageListController.this._mode).getValue() instanceof MessageMode.MessageThread) && MessageListController.this.parentMessageId != null) {
                    MessageListController messageListController3 = MessageListController.this;
                    messageListController3.focusThreadMessage(messageListController3.messageId, MessageListController.this.parentMessageId);
                }
            }
            return c23454a0;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC13062m) obj, (Throwable) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$initialFocusMessage$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$initialFocusMessage$3", m100430f = "MessageListController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m65681d2 = {"<anonymous>", "", "it", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C195613 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C195613(InterfaceC30057d<? super C195613> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195613 c195613 = new C195613(2, interfaceC30057d);
            c195613.L$0 = obj;
            return c195613;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(MessageListState messageListState, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((C195613) create(messageListState, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            MessageListState messageListState = (MessageListState) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return Boolean.valueOf(!messageListState.getMessageItems().isEmpty());
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$11 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$11", m100430f = "MessageListController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(Z)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C1956611 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ boolean Z$0;
        int label;

        public C1956611(InterfaceC30057d<? super C1956611> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C1956611 c1956611 = MessageListController.this.new C1956611(interfaceC30057d);
            c1956611.Z$0 = ((Boolean) obj).booleanValue();
            return c1956611;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Boolean) obj).booleanValue(), (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4 = this.Z$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            MessageListController.this.updateIsLoadingNewerMessages(z4);
            return C23454a0.f92919a;
        }

        public final Object invoke(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C1956611 c1956611 = (C1956611) create(Boolean.valueOf(z4), interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c1956611.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$12 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C1956712 extends C22656a implements InterfaceC4351m {
        public C1956712(Object obj) {
            super(2, 4, MessageListController.class, obj, "updateUnreadLabel", "updateUnreadLabel(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;)V");
        }

        public final Object invoke(UnreadLabel unreadLabel, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            MessageListController.access$observeMessagesListState$updateUnreadLabel((MessageListController) this.receiver, unreadLabel, interfaceC30057d);
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((UnreadLabel) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$2", m100430f = "MessageListController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195682 extends AbstractC32275i implements Function3 {
        /* synthetic */ Object L$0;
        int label;

        public C195682(InterfaceC30057d<? super C195682> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195682 c195682 = MessageListController.this.new C195682(interfaceC30057d);
            c195682.L$0 = th3;
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195682.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Throwable th3 = (Throwable) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Throwable cause = th3.getCause();
            if (cause != null) {
                cause.printStackTrace();
            }
            MessageListController.this.showEmptyState();
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC13062m) obj, (Throwable) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$3", m100430f = "MessageListController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;", "newState", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195693 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C195693(InterfaceC30057d<? super C195693> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195693 c195693 = MessageListController.this.new C195693(interfaceC30057d);
            c195693.L$0 = obj;
            return c195693;
        }

        public final Object invoke(MessageListState messageListState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195693 c195693 = (C195693) create(messageListState, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195693.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            MessageListState messageListState = (MessageListState) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            MessageListController.this.updateMessageList(messageListState);
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((MessageListState) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$5 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$5", m100430f = "MessageListController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(Z)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195705 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ boolean Z$0;
        int label;

        public C195705(InterfaceC30057d<? super C195705> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195705 c195705 = MessageListController.this.new C195705(interfaceC30057d);
            c195705.Z$0 = ((Boolean) obj).booleanValue();
            return c195705;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Boolean) obj).booleanValue(), (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4 = this.Z$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            MessageListController.this.updateEndOfOldMessagesReached(z4);
            return C23454a0.f92919a;
        }

        public final Object invoke(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195705 c195705 = (C195705) create(Boolean.valueOf(z4), interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195705.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$6 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$6", m100430f = "MessageListController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/models/User;", "it", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/models/User;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195716 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C195716(InterfaceC30057d<? super C195716> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195716 c195716 = MessageListController.this.new C195716(interfaceC30057d);
            c195716.L$0 = obj;
            return c195716;
        }

        public final Object invoke(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195716 c195716 = (C195716) create(user, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195716.invokeSuspend(c23454a0);
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
            MessageListController.this.updateCurrentUser(user);
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((User) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$7 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$7", m100430f = "MessageListController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(I)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195727 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ int I$0;
        int label;

        public C195727(InterfaceC30057d<? super C195727> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195727 c195727 = MessageListController.this.new C195727(interfaceC30057d);
            c195727.I$0 = ((Number) obj).intValue();
            return c195727;
        }

        public final Object invoke(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195727 c195727 = (C195727) create(Integer.valueOf(i13), interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195727.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            int i13 = this.I$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            MessageListController.this.updateUnreadCount(i13);
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$9 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$9", m100430f = "MessageListController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(Z)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195739 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ boolean Z$0;
        int label;

        public C195739(InterfaceC30057d<? super C195739> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195739 c195739 = MessageListController.this.new C195739(interfaceC30057d);
            c195739.Z$0 = ((Boolean) obj).booleanValue();
            return c195739;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Boolean) obj).booleanValue(), (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4 = this.Z$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            MessageListController.this.updateIsLoadingOlderMessages(z4);
            return C23454a0.f92919a;
        }

        public final Object invoke(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195739 c195739 = (C195739) create(Boolean.valueOf(z4), interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195739.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeThreadMessagesState$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeThreadMessagesState$1", m100430f = "MessageListController.kt", m100431l = {852}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195751 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC13037f2 $endOfOlderMessages;
        final /* synthetic */ InterfaceC13037f2 $members;
        final /* synthetic */ InterfaceC13037f2 $messages;
        final /* synthetic */ InterfaceC13037f2 $reads;
        final /* synthetic */ String $threadId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeThreadMessagesState$1$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeThreadMessagesState$1$1", m100430f = "MessageListController.kt", m100431l = {}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/models/User;", "it", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/models/User;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MessageListController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MessageListController messageListController, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = messageListController;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC30057d);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(user, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                anonymousClass1.invokeSuspend(c23454a0);
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
                InterfaceC13075p1 interfaceC13075p1 = this.this$0._threadListState;
                MessageListState messageListStateCopy$default = MessageListState.copy$default((MessageListState) ((C13045h2) this.this$0._threadListState).getValue(), null, false, false, false, false, false, user, null, 0, null, null, null, 4031, null);
                C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                c13045h2.getClass();
                c13045h2.m36571k(null, messageListStateCopy$default);
                return C23454a0.f92919a;
            }

            @Override // c93.InterfaceC4351m
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((User) obj, (InterfaceC30057d<? super C23454a0>) obj2);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeThreadMessagesState$1$2, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeThreadMessagesState$1$2", m100430f = "MessageListController.kt", m100431l = {}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(Z)V"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass2 extends AbstractC32275i implements InterfaceC4351m {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ MessageListController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MessageListController messageListController, InterfaceC30057d<? super AnonymousClass2> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = messageListController;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, interfaceC30057d);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // c93.InterfaceC4351m
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Boolean) obj).booleanValue(), (InterfaceC30057d<? super C23454a0>) obj2);
                return C23454a0.f92919a;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                boolean z4 = this.Z$0;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 interfaceC13075p1 = this.this$0._threadListState;
                MessageListState messageListStateCopy$default = MessageListState.copy$default((MessageListState) ((C13045h2) this.this$0._threadListState).getValue(), null, false, z4, false, false, z4 ? false : ((MessageListState) ((C13045h2) this.this$0._threadListState).getValue()).isLoadingOlderMessages(), null, null, 0, null, null, null, 4059, null);
                C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                c13045h2.getClass();
                c13045h2.m36571k(null, messageListStateCopy$default);
                return C23454a0.f92919a;
            }

            public final Object invoke(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(Boolean.valueOf(z4), interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                anonymousClass2.invokeSuspend(c23454a0);
                return c23454a0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195751(InterfaceC13037f2 interfaceC13037f2, InterfaceC13037f2 interfaceC13037f3, InterfaceC13037f2 interfaceC13037f4, InterfaceC13037f2 interfaceC13037f5, String str, InterfaceC30057d<? super C195751> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$endOfOlderMessages = interfaceC13037f2;
            this.$messages = interfaceC13037f3;
            this.$reads = interfaceC13037f4;
            this.$members = interfaceC13037f5;
            this.$threadId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C23454a0 invokeSuspend$lambda$2(MessageListController messageListController, MessageListState messageListState) {
            MessageListItemState messageListItemStatePrevious;
            List<MessageListItemState> messageItems = messageListState.getMessageItems();
            ListIterator<MessageListItemState> listIterator = messageItems.listIterator(messageItems.size());
            do {
                if (!listIterator.hasPrevious()) {
                    messageListItemStatePrevious = null;
                    break;
                }
                messageListItemStatePrevious = listIterator.previous();
            } while (!(messageListItemStatePrevious instanceof MessageItemState));
            MessageItemState messageItemState = messageListItemStatePrevious instanceof MessageItemState ? (MessageItemState) messageListItemStatePrevious : null;
            messageListController.lastLoadedThreadMessage = messageItemState != null ? messageItemState.getMessage() : null;
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195751 c195751 = MessageListController.this.new C195751(this.$endOfOlderMessages, this.$messages, this.$reads, this.$members, this.$threadId, interfaceC30057d);
            c195751.L$0 = obj;
            return c195751;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195751) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                int i14 = 0;
                AbstractC13091v.m36582H(new C13052j1(MessageListController.this.getUser(), new AnonymousClass1(MessageListController.this, null), i14), interfaceC2994c0);
                AbstractC13091v.m36582H(new C13052j1(this.$endOfOlderMessages, new AnonymousClass2(MessageListController.this, null), i14), interfaceC2994c0);
                final InterfaceC13058l[] interfaceC13058lArr = {this.$messages, this.$reads, MessageListController.this._showSystemMessagesState, MessageListController.this._threadDateSeparatorHandler, MessageListController.this._messageFooterVisibilityState, MessageListController.this._messagePositionHandler, MessageListController.this.getTypingUsers(), MessageListController.this.focusedMessage, this.$members, MessageListController.this.getOwnCapabilities(), MessageListController.this.getOriginalTranslationsStore().getOriginalTextMessageIds()};
                final MessageListController messageListController = MessageListController.this;
                final String str = this.$threadId;
                InterfaceC13058l interfaceC13058lOnFirst = FlowKt.onFirst(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeThreadMessagesState$1$invokeSuspend$$inlined$combine$1

                    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeThreadMessagesState$1$invokeSuspend$$inlined$combine$1$3, reason: invalid class name */
                    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeThreadMessagesState$1$invokeSuspend$$inlined$combine$1$3", m100430f = "MessageListController.kt", m100431l = {234}, m100432m = "invokeSuspend")
                    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"R", "T", "Lec3/m;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Lkotlin/Array;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
                    public static final class AnonymousClass3 extends AbstractC32275i implements Function3 {
                        final /* synthetic */ String $threadId$inlined;
                        private /* synthetic */ Object L$0;
                        /* synthetic */ Object L$1;
                        int label;
                        final /* synthetic */ MessageListController this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(InterfaceC30057d interfaceC30057d, MessageListController messageListController, String str) {
                            super(3, interfaceC30057d);
                            this.this$0 = messageListController;
                            this.$threadId$inlined = str;
                        }

                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(InterfaceC13062m interfaceC13062m, Object[] objArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(interfaceC30057d, this.this$0, this.$threadId$inlined);
                            anonymousClass3.L$0 = interfaceC13062m;
                            anonymousClass3.L$1 = objArr;
                            return anonymousClass3.invokeSuspend(C23454a0.f92919a);
                        }

                        @Override // s83.AbstractC32267a
                        public final Object invokeSuspend(Object obj) {
                            EnumC31071a enumC31071a = EnumC31071a.f128113w;
                            int i13 = this.label;
                            if (i13 == 0) {
                                AbstractC34132o.m107864I(obj);
                                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
                                Object[] objArr = (Object[]) this.L$1;
                                Object obj2 = objArr[0];
                                AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.models.Message>");
                                Object obj3 = objArr[1];
                                AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.models.ChannelUserRead>");
                                List list = (List) obj3;
                                Object obj4 = objArr[2];
                                AbstractC22676k.m65748h(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                Object obj5 = objArr[3];
                                AbstractC22676k.m65748h(obj5, "null cannot be cast to non-null type io.getstream.chat.android.ui.common.feature.messages.list.DateSeparatorHandler");
                                DateSeparatorHandler dateSeparatorHandler = (DateSeparatorHandler) obj5;
                                Object obj6 = objArr[4];
                                AbstractC22676k.m65748h(obj6, "null cannot be cast to non-null type io.getstream.chat.android.ui.common.state.messages.list.MessageFooterVisibility");
                                MessageFooterVisibility messageFooterVisibility = (MessageFooterVisibility) obj6;
                                Object obj7 = objArr[5];
                                AbstractC22676k.m65748h(obj7, "null cannot be cast to non-null type io.getstream.chat.android.ui.common.feature.messages.list.MessagePositionHandler");
                                MessagePositionHandler messagePositionHandler = (MessagePositionHandler) obj7;
                                Object obj8 = objArr[6];
                                AbstractC22676k.m65748h(obj8, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.models.User>");
                                List list2 = (List) obj8;
                                Message message = (Message) objArr[7];
                                Object obj9 = objArr[8];
                                AbstractC22676k.m65748h(obj9, "null cannot be cast to non-null type kotlin.collections.List<io.getstream.chat.android.models.Member>");
                                List list3 = (List) obj9;
                                Object obj10 = objArr[9];
                                AbstractC22676k.m65748h(obj10, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                                Object obj11 = objArr[10];
                                AbstractC22676k.m65748h(obj11, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                                MessageListState messageListState = (MessageListState) ((C13045h2) this.this$0._threadListState).getValue();
                                MessageListController messageListController = this.this$0;
                                List listFilterMessagesToShow = messageListController.filterMessagesToShow((List) obj2, zBooleanValue);
                                MessageListState messageListStateCopy$default = MessageListState.copy$default(messageListState, messageListController.groupMessages(listFilterMessagesToShow, true, list, dateSeparatorHandler, messageFooterVisibility, messagePositionHandler, list2, message, null, list3, false, null, (Set) obj10, (Set) obj11), true, false, false, false, false, null, this.$threadId$inlined, 0, null, null, null, 3956, null);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 1;
                                if (interfaceC13062m.emit(messageListStateCopy$default, this) == enumC31071a) {
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

                    @Override // ec3.InterfaceC13058l
                    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                        final InterfaceC13058l[] interfaceC13058lArr2 = interfaceC13058lArr;
                        Object objM41038a = AbstractC14371b.m41038a(new InterfaceC4339a() { // from class: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeThreadMessagesState$1$invokeSuspend$$inlined$combine$1.2
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return new Object[interfaceC13058lArr2.length];
                            }

                            @Override // c93.InterfaceC4339a
                            public final Object[] invoke() {
                                return new Object[interfaceC13058lArr2.length];
                            }
                        }, interfaceC13062m, new AnonymousClass3(null, messageListController, str), interfaceC30057d, interfaceC13058lArr2);
                        return objM41038a == EnumC31071a.f128113w ? objM41038a : C23454a0.f92919a;
                    }
                }, new C19591g(messageListController, i14));
                final MessageListController messageListController2 = MessageListController.this;
                InterfaceC13062m interfaceC13062m = new InterfaceC13062m() { // from class: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController.observeThreadMessagesState.1.5
                    @Override // ec3.InterfaceC13062m
                    public final /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC30057d interfaceC30057d) {
                        emit((MessageListState) obj2, (InterfaceC30057d<? super C23454a0>) interfaceC30057d);
                        return C23454a0.f92919a;
                    }

                    public final Object emit(MessageListState messageListState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                        MessageListItemState messageListItemStatePrevious;
                        MessageListItemState messageListItemStatePrevious2;
                        List<MessageListItemState> messageItems = messageListState.getMessageItems();
                        ListIterator<MessageListItemState> listIterator = messageItems.listIterator(messageItems.size());
                        do {
                            if (!listIterator.hasPrevious()) {
                                messageListItemStatePrevious = null;
                                break;
                            }
                            messageListItemStatePrevious = listIterator.previous();
                        } while (!(messageListItemStatePrevious instanceof MessageItemState));
                        MessageItemState messageItemState = messageListItemStatePrevious instanceof MessageItemState ? (MessageItemState) messageListItemStatePrevious : null;
                        Message message = messageItemState != null ? messageItemState.getMessage() : null;
                        MessageListController messageListController3 = messageListController2;
                        Message message2 = messageListController3.lastLoadedThreadMessage;
                        List<MessageListItemState> messageItems2 = messageListState.getMessageItems();
                        ListIterator<MessageListItemState> listIterator2 = messageItems2.listIterator(messageItems2.size());
                        do {
                            if (!listIterator2.hasPrevious()) {
                                messageListItemStatePrevious2 = null;
                                break;
                            }
                            messageListItemStatePrevious2 = listIterator2.previous();
                        } while (!(messageListItemStatePrevious2 instanceof TypingItemState));
                        NewMessageState newMessageState = messageListController3.getNewMessageState(message, message2, (TypingItemState) messageListItemStatePrevious2);
                        InterfaceC13075p1 interfaceC13075p1 = messageListController2._threadListState;
                        MessageListState messageListStateCopy$default = MessageListState.copy$default(messageListState, null, false, false, false, false, false, null, null, 0, newMessageState, null, null, 3583, null);
                        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                        c13045h2.getClass();
                        c13045h2.m36571k(null, messageListStateCopy$default);
                        if (newMessageState != null) {
                            messageListController2.lastLoadedThreadMessage = message;
                        }
                        return C23454a0.f92919a;
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (((C13052j1) interfaceC13058lOnFirst).collect(interfaceC13062m, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeUnreadLabelState$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeUnreadLabelState$1", m100430f = "MessageListController.kt", m100431l = {603}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195781 extends AbstractC32275i implements InterfaceC4351m {
        private /* synthetic */ Object L$0;
        int label;

        public C195781(InterfaceC30057d<? super C195781> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C195781 c195781 = new C195781(2, interfaceC30057d);
            c195781.L$0 = obj;
            return c195781;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195781) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Boolean bool = Boolean.TRUE;
                this.L$0 = null;
                this.label = 1;
                if (interfaceC13062m.emit(bool, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeUnreadLabelState$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeUnreadLabelState$3", m100430f = "MessageListController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"", "shouldShowButton", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "channel", "Lio/getstream/chat/android/models/ChannelUserRead;", "read", "Ll83/a0;", "<anonymous>", "(ZLio/getstream/chat/android/client/channel/state/ChannelState;Lio/getstream/chat/android/models/ChannelUserRead;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195793 extends AbstractC32275i implements InterfaceC4352n {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ boolean Z$0;
        int label;

        public C195793(InterfaceC30057d<? super C195793> interfaceC30057d) {
            super(4, interfaceC30057d);
        }

        @Override // c93.InterfaceC4352n
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke(((Boolean) obj).booleanValue(), (ChannelState) obj2, (ChannelUserRead) obj3, (InterfaceC30057d<? super C23454a0>) obj4);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4 = this.Z$0;
            ChannelState channelState = (ChannelState) this.L$0;
            ChannelUserRead channelUserRead = (ChannelUserRead) this.L$1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (channelUserRead == null) {
                return null;
            }
            if (MessageListController.this.getIsStartedForThread()) {
                channelUserRead = null;
            }
            if (channelUserRead == null) {
                return null;
            }
            MessageListController messageListController = MessageListController.this;
            if (channelUserRead.getLastReadMessageId() == null || AbstractC22676k.m65745e(messageListController.lastProcessedReadMessageId, channelUserRead.getLastReadMessageId())) {
                channelUserRead = null;
            }
            if (channelUserRead == null) {
                return null;
            }
            MessageListController messageListController2 = MessageListController.this;
            messageListController2.lastProcessedReadMessageId = channelUserRead.getLastReadMessageId();
            UnreadLabelCalculator unreadLabelCalculator = messageListController2.unreadLabelCalculator;
            List<Message> list = (List) channelState.getMessages().getValue();
            User user = (User) ((C13045h2) messageListController2.clientState.getUser()).getValue();
            UnreadLabel unreadLabelCalculateUnreadLabel = unreadLabelCalculator.calculateUnreadLabel(channelUserRead, list, user != null ? user.getId() : null, z4);
            if (unreadLabelCalculateUnreadLabel != null) {
                C13045h2 c13045h2 = (C13045h2) messageListController2.getUnreadLabelState();
                c13045h2.getClass();
                c13045h2.m36571k(null, unreadLabelCalculateUnreadLabel);
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(boolean z4, ChannelState channelState, ChannelUserRead channelUserRead, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195793 c195793 = MessageListController.this.new C195793(interfaceC30057d);
            c195793.Z$0 = z4;
            c195793.L$0 = channelState;
            c195793.L$1 = channelUserRead;
            return c195793.invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$removeMessageFocus$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$removeMessageFocus$1", m100430f = "MessageListController.kt", m100431l = {1475}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195801 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $messageId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195801(String str, InterfaceC30057d<? super C195801> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$messageId = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessageListController.this.new C195801(this.$messageId, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195801) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.label = 1;
                if (AbstractC3034m0.m8782b(2000L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            List<MessageListItemState> messageItems = MessageListController.this.getMessagesState().getMessageItems();
            String str = this.$messageId;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(messageItems, 10));
            for (Object objCopy : messageItems) {
                if (objCopy instanceof MessageItemState) {
                    MessageItemState messageItemState = (MessageItemState) objCopy;
                    if (AbstractC22676k.m65745e(messageItemState.getMessage().getId(), str)) {
                        objCopy = messageItemState.copy((15871 & 1) != 0 ? messageItemState.message : null, (15871 & 2) != 0 ? messageItemState.parentMessageId : null, (15871 & 4) != 0 ? messageItemState.isMine : false, (15871 & 8) != 0 ? messageItemState.isInThread : false, (15871 & 16) != 0 ? messageItemState.showMessageFooter : false, (15871 & 32) != 0 ? messageItemState.currentUser : null, (15871 & 64) != 0 ? messageItemState.groupPosition : null, (15871 & 128) != 0 ? messageItemState.isMessageRead : false, (15871 & 256) != 0 ? messageItemState.isMessageDelivered : false, (15871 & 512) != 0 ? messageItemState.focusState : MessageFocusRemoved.INSTANCE, (15871 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? messageItemState.messageReadBy : null, (15871 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? messageItemState.showOriginalText : false, (15871 & 4096) != 0 ? messageItemState.ownCapabilities : null, (15871 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? messageItemState.isPreviewMode : false);
                    }
                }
                arrayList.add(objCopy);
            }
            MessageListController messageListController = MessageListController.this;
            messageListController.setMessageListState(MessageListState.copy$default((MessageListState) ((C13045h2) messageListController._messageListState).getValue(), arrayList, false, false, false, false, false, null, null, 0, null, null, null, 4094, null));
            Message message = (Message) ((C13045h2) MessageListController.this.focusedMessage).getValue();
            if (AbstractC22676k.m65745e(message != null ? message.getId() : null, this.$messageId)) {
                ((C13045h2) MessageListController.this.focusedMessage).m36570j(null);
                MessageListController.this.removeFocusedMessageJob = null;
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$updatePollOption$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$updatePollOption$1", m100430f = "MessageListController.kt", m100431l = {2414}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195841 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Message $message;
        final /* synthetic */ Option $option;
        final /* synthetic */ Poll $poll;
        int label;
        final /* synthetic */ MessageListController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195841(Poll poll, MessageListController messageListController, Message message, Option option, InterfaceC30057d<? super C195841> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$poll = poll;
            this.this$0 = messageListController;
            this.$message = message;
            this.$option = option;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C195841(this.$poll, this.this$0, this.$message, this.$option, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C195841) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0065  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object next;
            InterfaceC27474d interfaceC27474dCastPollVote;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                List<Vote> ownVotes = this.$poll.getOwnVotes();
                Option option = this.$option;
                Iterator<T> it = ownVotes.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC22676k.m65745e(((Vote) next).getOptionId(), option.getId()));
                Vote vote = (Vote) next;
                if (vote != null) {
                    interfaceC27474dCastPollVote = this.this$0.chatClient.removePollVote(this.$message.getId(), this.$poll.getId(), vote.getId());
                    if (interfaceC27474dCastPollVote == null) {
                        interfaceC27474dCastPollVote = this.this$0.chatClient.castPollVote(this.$message.getId(), this.$poll.getId(), this.$option.getId());
                    }
                } else {
                    interfaceC27474dCastPollVote = this.this$0.chatClient.castPollVote(this.$message.getId(), this.$poll.getId(), this.$option.getId());
                }
                this.label = 1;
                if (interfaceC27474dCastPollVote.await(this) == enumC31071a) {
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
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [bc3.d0, q83.d, q83.j] */
    /* JADX WARN: Type inference failed for: r14v15 */
    public MessageListController(String cid, ClipboardHandler clipboardHandler, boolean z4, String str, String str2, int i13, ChatClient chatClient, ClientState clientState, InterfaceC13037f2 channelState, boolean z13, MessageFooterVisibility messageFooterVisibility, boolean z14, DateSeparatorHandler dateSeparatorHandler, DateSeparatorHandler threadDateSeparatorHandler, MessagePositionHandler messagePositionHandler, boolean z15, boolean z16) {
        ?? r14;
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(clipboardHandler, "clipboardHandler");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(channelState, "channelState");
        AbstractC22676k.m65750j(messageFooterVisibility, "messageFooterVisibility");
        AbstractC22676k.m65750j(dateSeparatorHandler, "dateSeparatorHandler");
        AbstractC22676k.m65750j(threadDateSeparatorHandler, "threadDateSeparatorHandler");
        AbstractC22676k.m65750j(messagePositionHandler, "messagePositionHandler");
        this.cid = cid;
        this.clipboardHandler = clipboardHandler;
        this.threadLoadOrderOlderToNewer = z4;
        this.messageId = str;
        this.parentMessageId = str2;
        this.messageLimit = i13;
        this.chatClient = chatClient;
        this.clientState = clientState;
        this.channelState = channelState;
        this.showSystemMessages = z13;
        this.messageFooterVisibility = messageFooterVisibility;
        this.enforceUniqueReactions = z14;
        this.dateSeparatorHandler = dateSeparatorHandler;
        this.threadDateSeparatorHandler = threadDateSeparatorHandler;
        this.messagePositionHandler = messagePositionHandler;
        this.showDateSeparatorInEmptyThread = z15;
        this.showThreadSeparatorInEmptyThread = z16;
        this.logger = AbstractC1772c1.m5382S(this, "MessageListController");
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getImmediate());
        this.scope = c17171dM8708b;
        this.connectionState = clientState.getConnectionState();
        this.user = clientState.getUser();
        this.unreadLabelState = AbstractC13091v.m36593c(null);
        this.showUnreadButtonState = AbstractC13091v.m36592b(0, 1, null, 5);
        this.originalTranslationsStore = AbstractC30060g.m92088H(new C19586b(this, 0));
        final C14380k c14380kM36590P = AbstractC13091v.m36590P(new C4588i(channelState, 2), new MessageListController$special$$inlined$flatMapLatest$1(3, null));
        InterfaceC13058l interfaceC13058l = new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$special$$inlined$map$1

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$special$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C195822<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$special$$inlined$map$1$2", m100430f = "MessageListController.kt", m100431l = {50}, m100432m = "emit")
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
                        return C195822.this.emit(null, this);
                    }
                }

                public C195822(InterfaceC13062m interfaceC13062m) {
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
                        Set<String> ownCapabilities = ((ChannelData) obj).getOwnCapabilities();
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
                Object objCollect = c14380kM36590P.collect(new C195822(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        };
        C13021b2 c13021b2 = C13105z1.f45288a;
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.ownCapabilities = AbstractC13091v.m36587M(interfaceC13058l, c17171dM8708b, c13021b2, c25235a0);
        this.channel = AbstractC13091v.m36587M(AbstractC13091v.m36610t(new C13052j1(AbstractC13091v.m36590P(new C4588i(channelState, 2), new MessageListController$special$$inlined$flatMapLatest$2(3, null)), new MessageListController$channel$2(this, null), 0)), c17171dM8708b, c13021b2, new Channel(null, null, null, null, 0, false, null, null, null, null, 0, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -1, 7, null));
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(MessageMode.Normal.INSTANCE);
        this._mode = c13045h2M36593c;
        this.mode = c13045h2M36593c;
        this.isStartedForThread = str2 != null;
        final C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this._events = c13096w1M36592b;
        this.events = AbstractC13091v.m36597g(c13096w1M36592b);
        this.errorEvents = AbstractC13091v.m36587M(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$special$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$special$$inlined$filterIsInstance$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C195812<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$special$$inlined$filterIsInstance$1$2", m100430f = "MessageListController.kt", m100431l = {50}, m100432m = "emit")
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
                        return C195812.this.emit(null, this);
                    }
                }

                public C195812(InterfaceC13062m interfaceC13062m) {
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
                        if (obj instanceof MessageListController.ErrorEvent) {
                            anonymousClass1.L$0 = null;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.L$2 = null;
                            anonymousClass1.L$3 = null;
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (interfaceC13062m.emit(obj, anonymousClass1) == enumC31071a) {
                                return enumC31071a;
                            }
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
                Object objCollect = c13096w1M36592b.collect(new C195812(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, c17171dM8708b, c13021b2, null);
        this.unreadCount = AbstractC13091v.m36587M(AbstractC13091v.m36590P(new C4588i(channelState, 2), new MessageListController$special$$inlined$flatMapLatest$3(3, null)), c17171dM8708b, c13021b2, 0);
        final C14380k c14380kM36590P2 = AbstractC13091v.m36590P(new C4588i(channelState, 2), new MessageListController$special$$inlined$flatMapLatest$4(3, null));
        this.typingUsers = AbstractC13091v.m36587M(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$special$$inlined$map$2

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$special$$inlined$map$2$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C195832<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$special$$inlined$map$2$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$special$$inlined$map$2$2", m100430f = "MessageListController.kt", m100431l = {50}, m100432m = "emit")
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
                        return C195832.this.emit(null, this);
                    }
                }

                public C195832(InterfaceC13062m interfaceC13062m) {
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
                        List<User> users = ((TypingEvent) obj).getUsers();
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(users, anonymousClass1) == enumC31071a) {
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
                Object objCollect = c14380kM36590P2.collect(new C195832(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, c17171dM8708b, c13021b2, C25271y.f99162w);
        int i14 = 4087;
        DefaultConstructorMarker defaultConstructorMarker = null;
        List list = null;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = true;
        boolean z24 = false;
        boolean z25 = false;
        User user = null;
        String str3 = null;
        int i15 = 0;
        NewMessageState newMessageState = null;
        SelectedMessageState selectedMessageState = null;
        UnreadLabel unreadLabel = null;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(new MessageListState(list, z17, z18, z19, z24, z25, user, str3, i15, newMessageState, selectedMessageState, unreadLabel, i14, defaultConstructorMarker));
        this._messageListState = c13045h2M36593c2;
        this.messageListState = c13045h2M36593c2;
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c(new PollState(null, 1, null == true ? 1 : 0));
        this._pollState = c13045h2M36593c3;
        this.pollState = c13045h2M36593c3;
        C13045h2 c13045h2M36593c4 = AbstractC13091v.m36593c(new MessageListState(list, z17, z18, z19, z24, z25, user, str3, i15, newMessageState, selectedMessageState, unreadLabel, i14, defaultConstructorMarker));
        this._threadListState = c13045h2M36593c4;
        this.threadListState = c13045h2M36593c4;
        this.listState = AbstractC13091v.m36587M(AbstractC13091v.m36590P(c13045h2M36593c, new MessageListController$special$$inlined$flatMapLatest$5(null, this)), c17171dM8708b, c13021b2, new MessageListState(list, z17, z18, z19, z24, z25, user, str3, i15, newMessageState, selectedMessageState, unreadLabel, i14, defaultConstructorMarker));
        C13045h2 c13045h2M36593c5 = AbstractC13091v.m36593c(c25235a0);
        this._messageActions = c13045h2M36593c5;
        this.messageActions = c13045h2M36593c5;
        this._messagePositionHandler = AbstractC13091v.m36593c(messagePositionHandler);
        this._dateSeparatorHandler = AbstractC13091v.m36593c(dateSeparatorHandler);
        this._threadDateSeparatorHandler = AbstractC13091v.m36593c(threadDateSeparatorHandler);
        C13045h2 c13045h2M36593c6 = AbstractC13091v.m36593c(Boolean.valueOf(z13));
        this._showSystemMessagesState = c13045h2M36593c6;
        this.showSystemMessagesState = c13045h2M36593c6;
        C13045h2 c13045h2M36593c7 = AbstractC13091v.m36593c(messageFooterVisibility);
        this._messageFooterVisibilityState = c13045h2M36593c7;
        this.messageFooterVisibilityState = c13045h2M36593c7;
        this.focusedMessage = AbstractC13091v.m36593c(null);
        this.isInsideSearch = AbstractC13091v.m36587M(AbstractC13091v.m36590P(new C4588i(channelState, 2), new MessageListController$special$$inlined$flatMapLatest$6(3, null)), c17171dM8708b, c13021b2, Boolean.FALSE);
        this.debouncer = new Debouncer(200L, c17171dM8708b);
        this.unreadLabelCalculator = new UnreadLabelCalculator();
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str4 = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339e.isLoggable(enumC2341g, str4)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("<init> cid: ", cid, ", messageId: ", str, ", messageLimit: ");
            sbM32001t.append(i13);
            r14 = 0;
            interfaceC2344j.log(enumC2341g, str4, sbM32001t.toString(), null);
        } else {
            r14 = 0;
        }
        AbstractC3006f0.m8732z(c17171dM8708b, r14, r14, new C195522(r14), 3);
    }

    public static final /* synthetic */ Object access$observeMessagesListState$updateUnreadLabel(MessageListController messageListController, UnreadLabel unreadLabel, InterfaceC30057d interfaceC30057d) {
        observeMessagesListState$updateUnreadLabel(messageListController, unreadLabel, interfaceC30057d);
        return C23454a0.f92919a;
    }

    public static /* synthetic */ void banUser$default(MessageListController messageListController, String str, String str2, Integer num, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            num = null;
        }
        messageListController.banUser(str, str2, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 banUser$lambda$131(MessageListController messageListController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        messageListController.getClass();
        String strMo77807a = error.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        messageListController.emitEvent((ErrorEvent.BlockUserError) banUser$lambda$131$lambda$130(error));
        return C23454a0.f92919a;
    }

    private static final ErrorEvent banUser$lambda$131$lambda$130(AbstractC26202e it) {
        AbstractC22676k.m65750j(it, "it");
        return new ErrorEvent.BlockUserError(it);
    }

    private final boolean belongsToFreshlyAddedMember(ChannelUserRead channelUserRead, Map<String, Member> map) {
        Date createdAt;
        TimeDuration timeDurationDiff;
        Member member = map.get(channelUserRead.getUser().getId());
        return ((member == null || (createdAt = member.getCreatedAt()) == null || (timeDurationDiff = DateUtils.diff(createdAt, channelUserRead.getLastRead())) == null) ? Long.MAX_VALUE : timeDurationDiff.getMillis()) < 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 blockUser$lambda$143(MessageListController messageListController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        messageListController.getClass();
        String strMo77807a = error.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        messageListController.emitEvent((ErrorEvent.BlockUserError) blockUser$lambda$143$lambda$142(error));
        return C23454a0.f92919a;
    }

    private static final ErrorEvent blockUser$lambda$143$lambda$142(AbstractC26202e it) {
        AbstractC22676k.m65750j(it, "it");
        return new ErrorEvent.BlockUserError(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 castVote$lambda$113(MessageListController messageListController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        messageListController.getClass();
        String strMo77807a = error.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        messageListController.emitEvent((ErrorEvent.PollCastingVoteError) castVote$lambda$113$lambda$112(error));
        return C23454a0.f92919a;
    }

    private static final ErrorEvent castVote$lambda$113$lambda$112(AbstractC26202e it) {
        AbstractC22676k.m65750j(it, "it");
        return new ErrorEvent.PollCastingVoteError(it);
    }

    private final void changeSelectMessageState(SelectedMessageState selectedMessageState) {
        if (!isInThread()) {
            setMessageListState(MessageListState.copy$default((MessageListState) ((C13045h2) this._messageListState).getValue(), null, false, false, false, false, false, null, null, 0, null, selectedMessageState, null, 3071, null));
            return;
        }
        InterfaceC13075p1 interfaceC13075p1 = this._threadListState;
        MessageListState messageListStateCopy$default = MessageListState.copy$default((MessageListState) ((C13045h2) interfaceC13075p1).getValue(), null, false, false, false, false, false, null, null, 0, null, selectedMessageState, null, 3071, null);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, messageListStateCopy$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 closePoll$lambda$116(MessageListController messageListController, Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        messageListController.emitEvent(new Event.PollClosingSuccess(poll));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 closePoll$lambda$117(MessageListController messageListController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        messageListController.onActionResult(error, MessageListController$closePoll$2$1.INSTANCE);
        return C23454a0.f92919a;
    }

    private final void copyMessage(Message message) {
        this.clipboardHandler.copyMessage(message);
    }

    public static /* synthetic */ void deleteMessage$default(MessageListController messageListController, Message message, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        messageListController.deleteMessage(message, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteMessage$lambda$79(MessageListController messageListController, boolean z4, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            String strMo77807a = error.mo77807a();
            Throwable thExtractCause = ChatErrorKt.extractCause(error);
            StringBuilder sbM73379l = AbstractC25012a.m73379l("Could not delete message: ", strMo77807a, ", Hard: ", ". Cause: ", z4);
            sbM73379l.append(thExtractCause);
            sbM73379l.append(". If you're using OfflinePlugin, the message should be deleted in the database and it will be deleted in the backend when the SDK sync its information.");
            interfaceC2344j.log(enumC2341g, str, sbM73379l.toString(), null);
        }
        return C23454a0.f92919a;
    }

    private final void emitEvent(Event event) {
        AbstractC3006f0.m8732z(this.scope, null, null, new C195551(event, null), 3);
    }

    public static /* synthetic */ Object enterThreadMode$default(MessageListController messageListController, Message message, int i13, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = messageListController.messageLimit;
        }
        return messageListController.enterThreadMode(message, i13, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object enterThreadSequential(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C195571 c195571;
        if (interfaceC30057d instanceof C195571) {
            c195571 = (C195571) interfaceC30057d;
            int i13 = c195571.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c195571.label = i13 - Integer.MIN_VALUE;
            } else {
                c195571 = new C195571(interfaceC30057d);
            }
        } else {
            c195571 = new C195571(interfaceC30057d);
        }
        Object objAwaitRepliesAsState = c195571.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c195571.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAwaitRepliesAsState);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8300m("[enterThreadSequential] parentMessage(id: ", message.getId(), ", text: ", message.getText(), ")"), null);
            }
            ChatClient chatClient = this.chatClient;
            String id4 = message.getId();
            boolean z4 = this.threadLoadOrderOlderToNewer;
            c195571.L$0 = message;
            c195571.label = 1;
            objAwaitRepliesAsState = ChatClientExtensions.awaitRepliesAsState(chatClient, id4, 30, z4, c195571);
            if (objAwaitRepliesAsState == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            message = (Message) c195571.L$0;
            AbstractC34132o.m107864I(objAwaitRepliesAsState);
        }
        ThreadState threadState = (ThreadState) objAwaitRepliesAsState;
        ChannelState channelState = (ChannelState) this.channelState.getValue();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (channelState == null) {
            return c23454a0;
        }
        C13045h2 c13045h2 = (C13045h2) this._messageActions;
        LinkedHashSet linkedHashSetM34555D = AbstractC12350b.m34555D(new Reply(message), (Set) c13045h2.getValue());
        c13045h2.getClass();
        c13045h2.m36571k(null, linkedHashSetM34555D);
        InterfaceC13075p1 interfaceC13075p1 = this._mode;
        MessageMode.MessageThread messageThread = new MessageMode.MessageThread(message, threadState);
        C13045h2 c13045h3 = (C13045h2) interfaceC13075p1;
        c13045h3.getClass();
        c13045h3.m36571k(null, messageThread);
        observeThreadMessagesState(threadState.getParentId(), threadState.getMessages(), threadState.getEndOfOlderMessages(), channelState.getReads(), channelState.getMembers());
        return c23454a0;
    }

    /* JADX INFO: renamed from: f */
    public static void m55042f(MessageListController messageListController) {
        messageListController.markLastMessageReadInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Message> filterMessagesToShow(List<Message> messages, boolean showSystemMessages) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : messages) {
            Message message = (Message) obj;
            if ((!MessageUtils.isSystem(message) && !MessageUtils.isError(message)) || showSystemMessages) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void flagMessage$default(MessageListController messageListController, Message message, String str, Map map, Function1 function1, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            function1 = new C19336c(21);
        }
        messageListController.flagMessage(message, str, map, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 flagMessage$lambda$92(AbstractC26205h it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flagMessage$lambda$94(Function1 function1, MessageListController messageListController, AbstractC26205h response) {
        AbstractC22676k.m65750j(response, "response");
        function1.invoke(response);
        if (response instanceof C26203f) {
            AbstractC26202e abstractC26202e = ((C26203f) response).f103918a;
            messageListController.getClass();
            String strMo77807a = abstractC26202e.mo77807a();
            C2345k logger = messageListController.getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, strMo77807a, null);
            }
            messageListController.emitEvent((ErrorEvent.FlagMessageError) flagMessage$lambda$94$lambda$93(abstractC26202e));
        }
    }

    private static final ErrorEvent flagMessage$lambda$94$lambda$93(AbstractC26202e it) {
        AbstractC22676k.m65750j(it, "it");
        return new ErrorEvent.FlagMessageError(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void flagUser$default(MessageListController messageListController, String str, String str2, Map map, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            map = C25272z.f99163w;
        }
        messageListController.flagUser(str, str2, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 flagUser$lambda$139(MessageListController messageListController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        messageListController.getClass();
        String strMo77807a = error.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        messageListController.emitEvent((ErrorEvent.FlagUserError) flagUser$lambda$139$lambda$138(error));
        return C23454a0.f92919a;
    }

    private static final ErrorEvent flagUser$lambda$139$lambda$138(AbstractC26202e it) {
        AbstractC22676k.m65750j(it, "it");
        return new ErrorEvent.FlagUserError(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void focusChannelMessage(String messageId) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[focusChannelMessage] messageId: ", messageId), null);
        }
        Message messageFromListStateById = getMessageFromListStateById(messageId);
        if (messageFromListStateById == null) {
            loadMessageById(messageId, new C19591g(this, 17));
            return;
        }
        C13045h2 c13045h2 = (C13045h2) this.focusedMessage;
        c13045h2.getClass();
        c13045h2.m36571k(null, messageFromListStateById);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 focusChannelMessage$lambda$75(MessageListController messageListController, AbstractC26205h result) {
        Message message;
        AbstractC22676k.m65750j(result, "result");
        InterfaceC13075p1 interfaceC13075p1 = messageListController.focusedMessage;
        if (result instanceof C26204g) {
            message = (Message) ((C26204g) result).f103919a;
        } else {
            if (!(result instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            C2345k logger = messageListController.getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC11895b.m31996o("[focusChannelMessage] -> Could not load message: ", ((C26203f) result).f103918a.mo77807a(), "."), null);
            }
            message = null;
        }
        ((C13045h2) interfaceC13075p1).m36570j(message);
        return C23454a0.f92919a;
    }

    private final void focusMessage(String messageId, String parentMessageId) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC31061c.m95640p("[focusMessage] messageId: ", messageId, ", parentMessageId: ", parentMessageId), null);
        }
        if (parentMessageId == null) {
            focusChannelMessage(messageId);
        } else {
            focusThreadMessage(messageId, parentMessageId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void focusThreadMessage(String threadMessageId, String parentMessageId) {
        AbstractC3006f0.m8732z(this.scope, null, null, new C195591(parentMessageId, threadMessageId, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void focusUnreadMessage(List<Message> list, String str) {
        Iterator<Message> it = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (AbstractC22676k.m65745e(it.next().getId(), str)) {
                break;
            } else {
                i13++;
            }
        }
        Integer numValueOf = Integer.valueOf(i13);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            Integer num = numValueOf.intValue() < list.size() + (-1) ? numValueOf : null;
            if (num != null) {
                focusChannelMessage(list.get(num.intValue() + 1).getId());
            }
        }
    }

    public static /* synthetic */ void getChannel$annotations() {
    }

    /* JADX INFO: renamed from: getLastSeenMessageId$stream_chat_android_ui_common_release$annotations */
    public static /* synthetic */ void m55044xbe67ce1d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MessageListState getMessagesState() {
        return (MessageListState) ((C13045h2) (isInThread() ? this._threadListState : this._messageListState)).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NewMessageState getNewMessageState(Message lastMessage, Message lastLoadedMessage, TypingItemState typingItemState) {
        Date createdAtOrNull = lastLoadedMessage != null ? MessageExtensionsKt.getCreatedAtOrNull(lastLoadedMessage) : null;
        if (typingItemState != null) {
            return Typing.INSTANCE;
        }
        if (lastMessage == null) {
            return null;
        }
        if (lastLoadedMessage == null) {
            return getNewMessageStateForMessage(lastMessage);
        }
        return (!MessageKt.wasCreatedAfter(lastMessage, createdAtOrNull) || (!MessageUtils.isGiphy(lastMessage) && AbstractC22676k.m65745e(lastLoadedMessage.getId(), lastMessage.getId()))) ? getNewMessageStateForMessage(lastMessage) : getNewMessageStateForMessage(lastMessage);
    }

    private final NewMessageState getNewMessageStateForMessage(Message message) {
        User user = (User) this.user.getValue();
        if (AbstractC22676k.m65745e(message.getUser().getId(), user != null ? user.getId() : null)) {
            Date createdAtOrNull = MessageExtensionsKt.getCreatedAtOrNull(message);
            return new MyOwn(createdAtOrNull != null ? Long.valueOf(createdAtOrNull.getTime()) : null);
        }
        Date createdAt = message.getCreatedAt();
        return new Other(createdAt != null ? Long.valueOf(createdAt.getTime()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MessageOriginalTranslationsStore getOriginalTranslationsStore() {
        return (MessageOriginalTranslationsStore) this.originalTranslationsStore.getValue();
    }

    public static /* synthetic */ void getOwnCapabilities$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:112:0x0225  */
    /* JADX WARN: Code duplicated, block: B:184:0x038a  */
    /* JADX WARN: Code duplicated, block: B:204:0x038f A[SYNTHETIC] */
    public final List<MessageListItemState> groupMessages(List<Message> messages, boolean isInThread, List<ChannelUserRead> reads, DateSeparatorHandler dateSeparatorHandler, MessageFooterVisibility messageFooterVisibility, MessagePositionHandler messagePositionHandler, List<User> typingUsers, Message focusedMessage, UnreadLabel unreadLabel, List<Member> members, boolean endOfOlderMessages, Channel channel, Set<String> ownCapabilities, Set<String> messagesInOriginalLanguage) {
        boolean z4;
        boolean z13;
        ArrayList arrayList;
        Message message;
        int i13;
        Date createdAtOrNull;
        Date createdAtOrNull2;
        Message parentMessage;
        MessageListController messageListController = this;
        List<Message> list = messages;
        Object value = ((C13045h2) messageListController._mode).getValue();
        MessageMode.MessageThread messageThread = value instanceof MessageMode.MessageThread ? (MessageMode.MessageThread) value : null;
        String id4 = (messageThread == null || (parentMessage = messageThread.getParentMessage()) == null) ? null : parentMessage.getId();
        User user = (User) messageListController.user.getValue();
        ArrayList arrayList2 = new ArrayList();
        List<Member> list2 = members;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : list2) {
            linkedHashMap.put(((Member) obj).getUser().getId(), obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : reads) {
            ChannelUserRead channelUserRead = (ChannelUserRead) obj2;
            if (!AbstractC22676k.m65745e(channelUserRead.getUser().getId(), user != null ? user.getId() : null) && !messageListController.belongsToFreshlyAddedMember(channelUserRead, linkedHashMap)) {
                arrayList3.add(obj2);
            }
        }
        List<ChannelUserRead> listM74152u1 = AbstractC25265s.m74152u1(arrayList3, new MessageListController$groupMessages$$inlined$sortedBy$1());
        ChannelUserRead channelUserRead2 = (ChannelUserRead) AbstractC25265s.m74114R0(listM74152u1);
        Date lastRead = channelUserRead2 != null ? channelUserRead2.getLastRead() : null;
        List<Message> list3 = list;
        C25263q c25263qM74105J1 = AbstractC25265s.m74105J1(list3);
        int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(c25263qM74105J1, 10));
        if (iM73988W2 < 16) {
            iM73988W2 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W2);
        Iterator it = c25263qM74105J1.iterator();
        while (true) {
            C25241d0 c25241d0 = (C25241d0) it;
            if (!c25241d0.f99123x.hasNext()) {
                break;
            }
            C25239c0 c25239c0 = (C25239c0) c25241d0.next();
            linkedHashMap2.put(((Message) c25239c0.f99118b).getId(), Integer.valueOf(c25239c0.f99117a));
        }
        ArrayList arrayList4 = new ArrayList();
        for (ChannelUserRead channelUserRead3 : listM74152u1) {
            Integer num = (Integer) linkedHashMap2.get(channelUserRead3.getLastReadMessageId());
            C23465k c23465k = num != null ? new C23465k(channelUserRead3, Integer.valueOf(num.intValue())) : null;
            if (c23465k != null) {
                arrayList4.add(c23465k);
            }
        }
        boolean z14 = isInThread && list.size() == 1;
        boolean z15 = isInThread && list.size() > 1;
        boolean z16 = z14 && messageListController.showDateSeparatorInEmptyThread;
        boolean z17 = z15 || (z14 && messageListController.showThreadSeparatorInEmptyThread);
        if (endOfOlderMessages && channel != null) {
            arrayList2.add(new StartOfTheChannelItemState(channel));
        }
        int i14 = 0;
        boolean z18 = false;
        boolean zAdd = false;
        for (Object obj3 : list3) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            Message message2 = (Message) obj3;
            User user2 = message2.getUser();
            Message message3 = (Message) AbstractC25265s.m74102I0(i14 - 1, list);
            Message message4 = (Message) AbstractC25265s.m74102I0(i15, list);
            boolean zShouldAddDateSeparator = dateSeparatorHandler.shouldAddDateSeparator(message3, message2);
            MessagePosition messagePositionHandleMessagePosition = messagePositionHandler.handleMessagePosition(message3, message2, message4, zShouldAddDateSeparator, message4 != null ? dateSeparatorHandler.shouldAddDateSeparator(message2, message4) : false, isInThread);
            boolean zShouldShowMessageFooter = MessageFooterVisibilityKt.shouldShowMessageFooter(messageFooterVisibility, message2, messagePositionHandleMessagePosition == MessagePosition.BOTTOM || messagePositionHandleMessagePosition == MessagePosition.NONE, message4);
            if (zShouldAddDateSeparator && (createdAtOrNull2 = MessageExtensionsKt.getCreatedAtOrNull(message2)) != null) {
                arrayList2.add(new DateSeparatorItemState(createdAtOrNull2));
            }
            if (z18) {
                z4 = true;
            } else if (AbstractC22676k.m65745e(unreadLabel != null ? unreadLabel.getLastReadMessageId() : null, message3 != 0 ? message3.getId() : null)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (unreadLabel != null) {
                UnreadLabel unreadLabel2 = z4 ? unreadLabel : null;
                if (unreadLabel2 != null) {
                    if (zAdd) {
                        unreadLabel2 = null;
                    }
                    if (unreadLabel2 != null) {
                        if (MessageUtils.isDeleted(message2)) {
                            unreadLabel2 = null;
                        }
                        if (unreadLabel2 != null) {
                            zAdd = arrayList2.add(new UnreadSeparatorItemState(unreadLabel2.getUnreadCount()));
                        }
                    }
                }
            }
            boolean z19 = zAdd;
            if (MessageUtils.isSystem(message2)) {
                arrayList2.add(new SystemMessageItemState(message2));
            } else {
                if (!MessageUtils.isError(message2) || MessageUtils.isModerationBounce(message2)) {
                    Date createdAt = message2.getCreatedAt();
                    boolean z24 = (createdAt == null || lastRead == null || createdAt.compareTo(lastRead) > 0) ? false : true;
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : arrayList4) {
                        boolean z25 = z4;
                        if (((Number) ((C23465k) obj4).f92938x).intValue() >= i14) {
                            arrayList5.add(obj4);
                        }
                        z4 = z25;
                    }
                    z13 = z4;
                    ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(arrayList5, 10));
                    Iterator it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add((ChannelUserRead) ((C23465k) it3.next()).f92937w);
                    }
                    boolean z26 = (channel == null || ((ArrayList) ChannelExtensionKt.deliveredReadsOf(channel, message2)).isEmpty()) ? false : true;
                    boolean zM65745e = AbstractC22676k.m65745e(message2.getId(), focusedMessage != null ? focusedMessage.getId() : null);
                    if (zM65745e) {
                        messageListController.removeMessageFocus(message2.getId());
                    }
                    boolean zM65745e2 = AbstractC22676k.m65745e(user2.getId(), user != null ? user.getId() : null);
                    arrayList = arrayList4;
                    boolean z27 = z24;
                    message = message2;
                    MessageFocused messageFocused = zM65745e ? MessageFocused.INSTANCE : null;
                    i13 = i14;
                    arrayList2.add(new MessageItemState(message, id4, zM65745e2, isInThread, zShouldShowMessageFooter, user, messagePositionHandleMessagePosition, z27, z26, messageFocused, arrayList6, messagesInOriginalLanguage.contains(message2.getId()), ownCapabilities, false, DfuBaseService.ERROR_REMOTE_MASK, null));
                } else {
                    arrayList2.add(new ModeratedMessageItemState(message2));
                }
                if (i13 == 0 && z17) {
                    arrayList2.add(new ThreadDateSeparatorItemState(MessageExtensionsKt.getCreatedAtOrDefault(message, new Date()), message.getReplyCount()));
                }
                if (z16 && (createdAtOrNull = MessageExtensionsKt.getCreatedAtOrNull(message)) != null) {
                    arrayList2.add(new DateSeparatorItemState(createdAtOrNull));
                }
                if (z14) {
                    arrayList2.add(EmptyThreadPlaceholderItemState.INSTANCE);
                }
                messageListController = this;
                zAdd = z19;
                i14 = i15;
                arrayList4 = arrayList;
                z18 = z13;
                list = messages;
            }
            z13 = z4;
            i13 = i14;
            arrayList = arrayList4;
            message = message2;
            if (i13 == 0) {
                arrayList2.add(new ThreadDateSeparatorItemState(MessageExtensionsKt.getCreatedAtOrDefault(message, new Date()), message.getReplyCount()));
            }
            if (z16) {
                arrayList2.add(new DateSeparatorItemState(createdAtOrNull));
            }
            if (z14) {
                arrayList2.add(EmptyThreadPlaceholderItemState.INSTANCE);
            }
            messageListController = this;
            zAdd = z19;
            i14 = i15;
            arrayList4 = arrayList;
            z18 = z13;
            list = messages;
        }
        if (!typingUsers.isEmpty()) {
            arrayList2.add(new TypingItemState(typingUsers));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initialFocusMessage(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM36616z;
        return (this.messageId != null && (objM36616z = AbstractC13091v.m36616z(new C13100y(this.listState, new C195602(null)), new C195613(2, null), interfaceC30057d)) == EnumC31071a.f128113w) ? objM36616z : C23454a0.f92919a;
    }

    public static /* synthetic */ void loadMessageById$default(MessageListController messageListController, String str, Function1 function1, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            function1 = new C19336c(22);
        }
        messageListController.loadMessageById(str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 loadMessageById$lambda$68(AbstractC26205h it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadMessageById$lambda$71(Function1 function1, MessageListController messageListController, String str, AbstractC26205h result) {
        AbstractC22676k.m65750j(result, "result");
        function1.invoke(result);
        if (result instanceof C26203f) {
            AbstractC26202e abstractC26202e = ((C26203f) result).f103918a;
            C2345k logger = messageListController.getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str2 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                InterfaceC2344j interfaceC2344j = logger.f9274b;
                String str3 = messageListController.cid;
                Throwable thExtractCause = ChatErrorKt.extractCause(abstractC26202e);
                String strMo77807a = abstractC26202e.mo77807a();
                StringBuilder sbM32001t = AbstractC11895b.m32001t("Could not load the message with id: ", str, " inside channel: ", str3, ". Error: ");
                sbM32001t.append(thExtractCause);
                sbM32001t.append(". Message: ");
                sbM32001t.append(strMo77807a);
                interfaceC2344j.log(enumC2341g, str2, sbM32001t.toString(), null);
            }
        }
    }

    private final void loadNewerChannelMessages(String baseMessageId, int messageLimit) {
        InterfaceC13037f2 endOfNewerMessages;
        InterfaceC13037f2 endOfNewerMessages2;
        ChannelState channelState = (ChannelState) this.channelState.getValue();
        if (channelState == null || (endOfNewerMessages = channelState.getEndOfNewerMessages()) == null || !((Boolean) endOfNewerMessages.getValue()).booleanValue()) {
            ((C27478h) ChatClientExtensions.loadNewerMessages(this.chatClient, this.cid, baseMessageId, messageLimit)).enqueue();
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            ChannelState channelState2 = (ChannelState) this.channelState.getValue();
            interfaceC2344j.log(enumC2341g, str, "[loadNewerChannelMessages] rejected; endOfNewerMessages: " + ((channelState2 == null || (endOfNewerMessages2 = channelState2.getEndOfNewerMessages()) == null) ? null : (Boolean) endOfNewerMessages2.getValue()), null);
        }
    }

    public static /* synthetic */ void loadNewerChannelMessages$default(MessageListController messageListController, String str, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = messageListController.messageLimit;
        }
        messageListController.loadNewerChannelMessages(str, i13);
    }

    public static /* synthetic */ void loadNewerMessages$default(MessageListController messageListController, String str, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = messageListController.messageLimit;
        }
        messageListController.loadNewerMessages(str, i13);
    }

    private final void loadNewerMessagesInThread(MessageMode.MessageThread threadMode) {
        ThreadState threadState;
        InterfaceC13037f2 newestInThread;
        Message message;
        InterfaceC13037f2 newestInThread2;
        Message message2;
        InterfaceC13037f2 loading;
        InterfaceC13037f2 loading2;
        InterfaceC13037f2 endOfNewerMessages;
        InterfaceC13037f2 endOfNewerMessages2;
        InterfaceC13037f2 endOfNewerMessages3;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        String id4 = null;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            ThreadState threadState2 = threadMode.getThreadState();
            interfaceC2344j.log(enumC2341g, str, "[loadNewerMessagesInThread] endOfNewerMessages: " + ((threadState2 == null || (endOfNewerMessages3 = threadState2.getEndOfNewerMessages()) == null) ? null : (Boolean) endOfNewerMessages3.getValue()), null);
        }
        ThreadState threadState3 = threadMode.getThreadState();
        if ((threadState3 != null && (endOfNewerMessages2 = threadState3.getEndOfNewerMessages()) != null && ((Boolean) endOfNewerMessages2.getValue()).booleanValue()) || (((threadState = threadMode.getThreadState()) != null && (loading = threadState.getLoading()) != null && ((Boolean) loading.getValue()).booleanValue()) || !this.threadLoadOrderOlderToNewer)) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            if (interfaceC2339e2.isLoggable(enumC2341g, str2)) {
                InterfaceC2344j interfaceC2344j2 = logger2.f9274b;
                ThreadState threadState4 = threadMode.getThreadState();
                Boolean bool = (threadState4 == null || (endOfNewerMessages = threadState4.getEndOfNewerMessages()) == null) ? null : (Boolean) endOfNewerMessages.getValue();
                ThreadState threadState5 = threadMode.getThreadState();
                Boolean bool2 = (threadState5 == null || (loading2 = threadState5.getLoading()) == null) ? null : (Boolean) loading2.getValue();
                interfaceC2344j2.log(enumC2341g, str2, "[loadNewerMessagesInThread] rejected; endOfNewerMessages: " + bool + ", loading: " + bool2 + ", threadLoadOrderOlderToNewer: " + this.threadLoadOrderOlderToNewer, null);
                return;
            }
            return;
        }
        C2345k logger3 = getLogger();
        InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
        String str3 = logger3.f9273a;
        if (interfaceC2339e3.isLoggable(enumC2341g, str3)) {
            InterfaceC2344j interfaceC2344j3 = logger3.f9274b;
            String id5 = threadMode.getParentMessage().getId();
            int i13 = this.messageLimit;
            ThreadState threadState6 = threadMode.getThreadState();
            String id6 = (threadState6 == null || (newestInThread2 = threadState6.getNewestInThread()) == null || (message2 = (Message) newestInThread2.getValue()) == null) ? null : message2.getId();
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "[loadNewerMessagesInThread] loading newer messages:parentId: ", id5, ", messageLimit: ", ", lastId = ");
            sbM30467u.append(id6);
            interfaceC2344j3.log(enumC2341g, str3, sbM30467u.toString(), null);
        }
        ChatClient chatClient = this.chatClient;
        String id7 = threadMode.getParentMessage().getId();
        int i14 = this.messageLimit;
        ThreadState threadState7 = threadMode.getThreadState();
        if (threadState7 != null && (newestInThread = threadState7.getNewestInThread()) != null && (message = (Message) newestInThread.getValue()) != null) {
            id4 = message.getId();
        }
        chatClient.getNewerReplies(id7, i14, id4).enqueue();
    }

    public static /* synthetic */ void loadOlderMessages$default(MessageListController messageListController, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = messageListController.messageLimit;
        }
        messageListController.loadOlderMessages(i13);
    }

    private final void markChannelAsRead() {
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(this.cid);
        String str = (String) c23465kCidToTypeAndId.f92937w;
        String str2 = (String) c23465kCidToTypeAndId.f92938x;
        AbstractC27476f.m82906d(this.chatClient.markRead(str, str2), new C19589e(this, str2, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 markChannelAsRead$lambda$89(MessageListController messageListController, String str, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str2 = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            String strMo77807a = error.mo77807a();
            Throwable thExtractCause = ChatErrorKt.extractCause(error);
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Could not mark cid: ", str, " as read. Error message: ", strMo77807a, ". Cause: ");
            sbM32001t.append(thExtractCause);
            interfaceC2344j.log(enumC2341g, str2, sbM32001t.toString(), null);
        }
        return C23454a0.f92919a;
    }

    private static final C23454a0 markLastMessageRead$lambda$83(MessageListController messageListController) {
        messageListController.markLastMessageReadInternal();
        return C23454a0.f92919a;
    }

    private final void markLastMessageReadInternal() {
        MessageListItemState messageListItemStatePrevious;
        List<MessageListItemState> messageItems = getMessagesState().getMessageItems();
        ListIterator<MessageListItemState> listIterator = messageItems.listIterator(messageItems.size());
        do {
            if (!listIterator.hasPrevious()) {
                messageListItemStatePrevious = null;
                break;
            }
            messageListItemStatePrevious = listIterator.previous();
        } while (!(messageListItemStatePrevious instanceof HasMessageListItemState));
        HasMessageListItemState hasMessageListItemState = messageListItemStatePrevious instanceof HasMessageListItemState ? (HasMessageListItemState) messageListItemStatePrevious : null;
        Message message = hasMessageListItemState != null ? hasMessageListItemState.getMessage() : null;
        String id4 = message != null ? message.getId() : null;
        String text = message != null ? message.getText() : null;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30464r(AbstractC25012a.m73379l("[markLastMessageRead] cid: ", this.cid, ", msgId(", "): ", isInThread()), id4, ", msgText: \"", text, "\""), null);
        }
        User user = (User) ((C13045h2) this.clientState.getUser()).getValue();
        String id5 = user != null ? user.getId() : null;
        if (message != null && AbstractC22676k.m65745e(message.getUser().getId(), id5) && message.getSyncStatus() != SyncStatus.COMPLETED) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                InterfaceC2344j interfaceC2344j = logger2.f9274b;
                StringBuilder sbM73379l = AbstractC25012a.m73379l("[markLastMessageRead] cid: ", this.cid, "; rejected[", "] (own unsynced): ", isInThread());
                sbM73379l.append(id4);
                interfaceC2344j.log(enumC2341g2, str2, sbM73379l.toString(), null);
                return;
            }
            return;
        }
        if (!AbstractC22676k.m65745e(getLastSeenMessageId$stream_chat_android_ui_common_release(), id4)) {
            setLastSeenMessageId$stream_chat_android_ui_common_release(id4);
            if (isInThread()) {
                markThreadAsRead();
                return;
            } else {
                markChannelAsRead();
                return;
            }
        }
        C2345k logger3 = getLogger();
        InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
        String str3 = logger3.f9273a;
        EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
        if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
            InterfaceC2344j interfaceC2344j2 = logger3.f9274b;
            StringBuilder sbM73379l2 = AbstractC25012a.m73379l("[markLastMessageRead] cid: ", this.cid, "; rejected[", "] (already seen msgId): ", isInThread());
            sbM73379l2.append(id4);
            interfaceC2344j2.log(enumC2341g3, str3, sbM73379l2.toString(), null);
        }
    }

    private final void markThreadAsRead() {
        Message parentMessage;
        String id4;
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(this.cid);
        String str = (String) c23465kCidToTypeAndId.f92937w;
        String str2 = (String) c23465kCidToTypeAndId.f92938x;
        Object value = ((C13045h2) this._mode).getValue();
        MessageMode.MessageThread messageThread = value instanceof MessageMode.MessageThread ? (MessageMode.MessageThread) value : null;
        if (messageThread == null || (parentMessage = messageThread.getParentMessage()) == null || (id4 = parentMessage.getId()) == null) {
            return;
        }
        AbstractC27476f.m82906d(this.chatClient.markThreadRead(str, str2, id4), new C19589e(this, id4, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 markThreadAsRead$lambda$91(MessageListController messageListController, String str, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str2 = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            String strMo77807a = error.mo77807a();
            Throwable thExtractCause = ChatErrorKt.extractCause(error);
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Could not mark thread with id: ", str, " as read. Error message: ", strMo77807a, ". Cause: ");
            sbM32001t.append(thExtractCause);
            interfaceC2344j.log(enumC2341g, str2, sbM32001t.toString(), null);
        }
        return C23454a0.f92919a;
    }

    public static /* synthetic */ void markUnread$default(MessageListController messageListController, Message message, Function1 function1, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            function1 = new C19336c(23);
        }
        messageListController.markUnread(message, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 markUnread$lambda$95(AbstractC26205h it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void markUnread$lambda$98$lambda$97(Function1 function1, MessageListController messageListController, AbstractC26205h response) {
        AbstractC22676k.m65750j(response, "response");
        function1.invoke(response);
        if (!(response instanceof C26203f)) {
            messageListController.showUnreadButtonState.mo36564a(Boolean.FALSE);
            return;
        }
        AbstractC26202e abstractC26202e = ((C26203f) response).f103918a;
        messageListController.getClass();
        String strMo77807a = abstractC26202e.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        messageListController.emitEvent((ErrorEvent.MarkUnreadError) markUnread$lambda$98$lambda$97$lambda$96(abstractC26202e));
    }

    private static final ErrorEvent markUnread$lambda$98$lambda$97$lambda$96(AbstractC26202e it) {
        AbstractC22676k.m65750j(it, "it");
        return new ErrorEvent.MarkUnreadError(it);
    }

    public static /* synthetic */ void muteUser$default(MessageListController messageListController, String str, Integer num, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            num = null;
        }
        messageListController.muteUser(str, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 muteUser$lambda$109(MessageListController messageListController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        messageListController.getClass();
        String strMo77807a = error.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        messageListController.emitEvent((ErrorEvent.MuteUserError) muteUser$lambda$109$lambda$108(error));
        return C23454a0.f92919a;
    }

    private static final ErrorEvent muteUser$lambda$109$lambda$108(AbstractC26202e it) {
        AbstractC22676k.m65750j(it, "it");
        return new ErrorEvent.MuteUserError(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 muteUser$lambda$127(MessageListController messageListController, AbstractC26202e streamError) {
        AbstractC22676k.m65750j(streamError, "streamError");
        String strMo77807a = streamError.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeMessagesListState() {
        AbstractC13091v.m36582H(new C13052j1(new C13015a0(AbstractC13091v.m36590P(new C4588i(this.channelState, 2), new C19562x18ef7a90(null, this)), new C195682(null)), new C195693(null), 0), this.scope);
        int i13 = 0;
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36590P(new C4588i(this.channelState, 2), new C19563x18ef7a91(3, null)), new C195705(null), i13), this.scope);
        AbstractC13091v.m36582H(new C13052j1(this.user, new C195716(null), i13), this.scope);
        AbstractC13091v.m36582H(new C13052j1(this.unreadCount, new C195727(null), i13), this.scope);
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36590P(new C4588i(this.channelState, 2), new C19564x18ef7a92(3, null)), new C195739(null), i13), this.scope);
        int i14 = 0;
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36590P(new C4588i(this.channelState, 2), new C19565x18ef7a93(3, null)), new C1956611(null), i14), this.scope);
        observeUnreadLabelState();
        AbstractC13091v.m36582H(new C13052j1(this.unreadLabelState, new C1956712(this), i14), this.scope);
    }

    private static final /* synthetic */ Object observeMessagesListState$updateUnreadLabel(MessageListController messageListController, UnreadLabel unreadLabel, InterfaceC30057d interfaceC30057d) {
        messageListController.updateUnreadLabel(unreadLabel);
        return C23454a0.f92919a;
    }

    private final void observeThreadMessagesState(String threadId, InterfaceC13037f2 messages, InterfaceC13037f2 endOfOlderMessages, InterfaceC13037f2 reads, InterfaceC13037f2 members) {
        this.threadJob = AbstractC3006f0.m8732z(this.scope, null, null, new C195751(endOfOlderMessages, messages, reads, members, threadId, null), 3);
    }

    private final void observeUnreadLabelState() {
        C13015a0 c13015a0 = new C13015a0(new C195781(2, null), this.showUnreadButtonState);
        InterfaceC13037f2 interfaceC13037f2 = this.channelState;
        AbstractC13091v.m36582H(AbstractC13091v.m36606p(c13015a0, new C4588i(interfaceC13037f2, 2), AbstractC13091v.m36590P(new C4588i(interfaceC13037f2, 2), new C19577xcf7b98b9(3, null)), new C195793(null)), this.scope);
    }

    private final void onActionResult(AbstractC26202e error, Function1 onError) {
        String strMo77807a = error.mo77807a();
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        emitEvent((Event) onError.invoke(error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageOriginalTranslationsStore originalTranslationsStore_delegate$lambda$0(MessageListController messageListController) {
        return MessageOriginalTranslationsStore.INSTANCE.forChannel(messageListController.cid);
    }

    private final void pauseRunningAudioRecordings(Message message) {
        List<Attachment> attachments = message.getAttachments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : attachments) {
            if (AttachmentUtilsKt.isAudioRecording((Attachment) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(AudioHashKt.getAudioHash((Attachment) it.next())));
        }
        AudioPlayer audioPlayer = this.chatClient.getAudioPlayer();
        if (audioPlayer.getCurrentState() == AudioState.PLAYING && arrayList2.contains(Integer.valueOf(audioPlayer.getCurrentAudioHash()))) {
            audioPlayer.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 performGiphyAction$lambda$147(MessageListController messageListController, GiphyAction giphyAction, Message message, AbstractC26202e streamError) {
        AbstractC22676k.m65750j(streamError, "streamError");
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            String simpleName = giphyAction.getClass().getSimpleName();
            String id4 = message.getId();
            String strMo77807a = streamError.mo77807a();
            Throwable thExtractCause = ChatErrorKt.extractCause(streamError);
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Could not ", simpleName, " giphy for message id: ", id4, ". Error: ");
            sbM32001t.append(strMo77807a);
            sbM32001t.append(". Cause: ");
            sbM32001t.append(thExtractCause);
            interfaceC2344j.log(enumC2341g, str, sbM32001t.toString(), null);
        }
        return C23454a0.f92919a;
    }

    public static /* synthetic */ void pinMessage$default(MessageListController messageListController, Message message, Date date, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            date = null;
        }
        messageListController.pinMessage(message, date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 pinMessage$lambda$101(MessageListController messageListController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        messageListController.getClass();
        String strMo77807a = error.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        messageListController.emitEvent((ErrorEvent.PinMessageError) pinMessage$lambda$101$lambda$100(error));
        return C23454a0.f92919a;
    }

    private static final ErrorEvent pinMessage$lambda$101$lambda$100(AbstractC26202e it) {
        AbstractC22676k.m65750j(it, "it");
        return new ErrorEvent.PinMessageError(it);
    }

    public static /* synthetic */ void reactToMessage$default(MessageListController messageListController, Reaction reaction, Message message, boolean z4, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        messageListController.reactToMessage(reaction, message, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 reactToMessage$lambda$120(MessageListController messageListController, Reaction reaction, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            String messageId = reaction.getMessageId();
            String strMo77807a = error.mo77807a();
            Throwable thExtractCause = ChatErrorKt.extractCause(error);
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Could not delete reaction for message with id: ", messageId, " Error: ", strMo77807a, ". Cause: ");
            sbM32001t.append(thExtractCause);
            interfaceC2344j.log(enumC2341g, str, sbM32001t.toString(), null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 reactToMessage$lambda$122(MessageListController messageListController, Reaction reaction, AbstractC26202e streamError) {
        AbstractC22676k.m65750j(streamError, "streamError");
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            String messageId = reaction.getMessageId();
            String strMo77807a = streamError.mo77807a();
            Throwable thExtractCause = ChatErrorKt.extractCause(streamError);
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Could not send reaction for message with id: ", messageId, " Error: ", strMo77807a, ". Cause: ");
            sbM32001t.append(thExtractCause);
            interfaceC2344j.log(enumC2341g, str, sbM32001t.toString(), null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeAttachment$lambda$155(MessageListController messageListController, String str, Attachment attachment, AbstractC26205h result) {
        AbstractC22676k.m65750j(result, "result");
        if (!(result instanceof C26204g)) {
            if (!(result instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            C2345k logger = messageListController.getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str2 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                logger.f9274b.log(enumC2341g, str2, "Could not load message: " + ((C26203f) result).f103918a, null);
                return;
            }
            return;
        }
        Message message = (Message) ((C26204g) result).f103919a;
        List<Attachment> attachments = message.getAttachments();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = attachments.iterator();
        while (true) {
            boolean zM65745e = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Attachment attachment2 = (Attachment) next;
            String imageUrl = attachment.getImageUrl();
            String assetUrl = attachment.getAssetUrl();
            if (assetUrl != null) {
                String assetUrl2 = attachment2.getAssetUrl();
                zM65745e = AbstractC22676k.m65745e(assetUrl2 != null ? AbstractC39414r.m125863I0(assetUrl2, "?") : null, AbstractC39414r.m125863I0(assetUrl, "?"));
            } else if (imageUrl != null) {
                String imageUrl2 = attachment2.getImageUrl();
                zM65745e = AbstractC22676k.m65745e(imageUrl2 != null ? AbstractC39414r.m125863I0(imageUrl2, "?") : null, AbstractC39414r.m125863I0(imageUrl, "?"));
            }
            if (!zM65745e) {
                arrayList.add(next);
            }
        }
        Message messageCopy = message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : arrayList, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
        if (AbstractC39414r.m125890i0(messageCopy.getText()) && messageCopy.getAttachments().isEmpty()) {
            AbstractC27476f.m82906d(ChatClient.deleteMessage$default(messageListController.chatClient, str, false, 2, null), new C19591g(messageListController, 2));
        } else {
            AbstractC27476f.m82906d(messageListController.chatClient.updateMessage(messageCopy), new C19591g(messageListController, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 removeAttachment$lambda$155$lambda$151(MessageListController messageListController, AbstractC26202e streamError) {
        AbstractC22676k.m65750j(streamError, "streamError");
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "Could not remove the attachment and delete the remaining blank message: " + streamError.mo77807a() + ". Cause: " + ChatErrorKt.extractCause(streamError), null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 removeAttachment$lambda$155$lambda$153(MessageListController messageListController, AbstractC26202e streamError) {
        AbstractC22676k.m65750j(streamError, "streamError");
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "Could not edit message to remove its attachments: " + streamError.mo77807a() + ". Cause: " + ChatErrorKt.extractCause(streamError), null);
        }
        return C23454a0.f92919a;
    }

    private final void removeMessageFocus(String messageId) {
        C23465k c23465k = this.removeFocusedMessageJob;
        if (AbstractC22676k.m65745e(c23465k != null ? (String) c23465k.f92937w : null, messageId)) {
            return;
        }
        this.removeFocusedMessageJob = new C23465k(messageId, AbstractC3006f0.m8732z(this.scope, null, null, new C195801(messageId, null), 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 removeShadowBanFromUser$lambda$137(MessageListController messageListController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        messageListController.getClass();
        String strMo77807a = error.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        messageListController.emitEvent((ErrorEvent.BlockUserError) removeShadowBanFromUser$lambda$137$lambda$136(error));
        return C23454a0.f92919a;
    }

    private static final ErrorEvent removeShadowBanFromUser$lambda$137$lambda$136(AbstractC26202e it) {
        AbstractC22676k.m65750j(it, "it");
        return new ErrorEvent.BlockUserError(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 removeVote$lambda$115(MessageListController messageListController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        messageListController.getClass();
        String strMo77807a = error.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        messageListController.emitEvent((ErrorEvent.PollRemovingVoteError) removeVote$lambda$115$lambda$114(error));
        return C23454a0.f92919a;
    }

    private static final ErrorEvent removeVote$lambda$115$lambda$114(AbstractC26202e it) {
        AbstractC22676k.m65750j(it, "it");
        return new ErrorEvent.PollRemovingVoteError(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 resendMessage$lambda$106(MessageListController messageListController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "(Retry) Could not send message: " + error.mo77807a() + ". Cause: " + ChatErrorKt.extractCause(error), null);
        }
        return C23454a0.f92919a;
    }

    public static /* synthetic */ void scrollToBottom$default(MessageListController messageListController, int i13, InterfaceC4339a interfaceC4339a, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = messageListController.messageLimit;
        }
        messageListController.scrollToBottom(i13, interfaceC4339a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToBottom$lambda$55(InterfaceC4339a interfaceC4339a, MessageListController messageListController, AbstractC26205h result) {
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof C26204g) {
            interfaceC4339a.invoke();
            return;
        }
        if (!(result instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            AbstractC26202e abstractC26202e = ((C26203f) result).f103918a;
            interfaceC2344j.log(enumC2341g, str, "Could not load newest messages. Message: " + abstractC26202e.mo77807a() + ". Cause: " + ChatErrorKt.extractCause(abstractC26202e), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setDateSeparatorHandler$lambda$156(Message message, Message message2) {
        AbstractC22676k.m65750j(message2, "<unused var>");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMessageListState(MessageListState newState) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[setMessageListState] #messageList; newState: ", MessageListStateKt.stringify(newState)), null);
        }
        ((C13045h2) this._messageListState).m36570j(newState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setThreadDateSeparatorHandler$lambda$157(Message message, Message message2) {
        AbstractC22676k.m65750j(message2, "<unused var>");
        return false;
    }

    public static /* synthetic */ void shadowBanUser$default(MessageListController messageListController, String str, String str2, Integer num, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            num = null;
        }
        messageListController.shadowBanUser(str, str2, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 shadowBanUser$lambda$135(MessageListController messageListController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        messageListController.getClass();
        String strMo77807a = error.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        messageListController.emitEvent((ErrorEvent.BlockUserError) shadowBanUser$lambda$135$lambda$134(error));
        return C23454a0.f92919a;
    }

    private static final ErrorEvent shadowBanUser$lambda$135$lambda$134(AbstractC26202e it) {
        AbstractC22676k.m65750j(it, "it");
        return new ErrorEvent.BlockUserError(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEmptyState() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[showEmptyState] no args", null);
        }
        setMessageListState(MessageListState.copy$default((MessageListState) ((C13045h2) this._messageListState).getValue(), C25271y.f99162w, false, false, false, false, false, null, null, 0, null, null, null, 4086, null));
    }

    private final void threadLoadMore(MessageMode.MessageThread threadMode, int messageLimit) {
        String id4;
        InterfaceC13037f2 oldestInThread;
        if (((MessageListState) ((C13045h2) this._threadListState).getValue()).getEndOfOldMessagesReached() || ((MessageListState) ((C13045h2) this._threadListState).getValue()).isLoadingOlderMessages() || this.threadLoadOrderOlderToNewer) {
            return;
        }
        ThreadState threadState = threadMode.getThreadState();
        if (((threadState == null || (oldestInThread = threadState.getOldestInThread()) == null) ? null : (Message) oldestInThread.getValue()) == null) {
            return;
        }
        C13045h2 c13045h2 = (C13045h2) this._threadListState;
        MessageListState messageListStateCopy$default = MessageListState.copy$default((MessageListState) c13045h2.getValue(), null, false, false, false, false, true, null, null, 0, null, null, null, 4063, null);
        c13045h2.getClass();
        c13045h2.m36571k(null, messageListStateCopy$default);
        ChatClient chatClient = this.chatClient;
        String id5 = threadMode.getParentMessage().getId();
        Message message = (Message) threadMode.getThreadState().getOldestInThread().getValue();
        if (message == null || (id4 = message.getId()) == null) {
            id4 = threadMode.getParentMessage().getId();
        }
        chatClient.getRepliesMore(id5, id4, messageLimit).enqueue(new InterfaceC27471a() { // from class: io.getstream.chat.android.ui.common.feature.messages.list.c
            @Override // o23.InterfaceC27471a
            public final void onResult(AbstractC26205h abstractC26205h) {
                MessageListController.threadLoadMore$lambda$63(this.f74453w, abstractC26205h);
            }
        });
    }

    public static /* synthetic */ void threadLoadMore$default(MessageListController messageListController, MessageMode.MessageThread messageThread, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = messageListController.messageLimit;
        }
        messageListController.threadLoadMore(messageThread, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void threadLoadMore$lambda$63(MessageListController messageListController, AbstractC26205h it) {
        AbstractC22676k.m65750j(it, "it");
        InterfaceC13075p1 interfaceC13075p1 = messageListController._threadListState;
        MessageListState messageListStateCopy$default = MessageListState.copy$default((MessageListState) ((C13045h2) interfaceC13075p1).getValue(), null, false, false, false, false, false, null, null, 0, null, null, null, 4063, null);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, messageListStateCopy$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 unbanUser$lambda$133(MessageListController messageListController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        messageListController.getClass();
        String strMo77807a = error.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        messageListController.emitEvent((ErrorEvent.BlockUserError) unbanUser$lambda$133$lambda$132(error));
        return C23454a0.f92919a;
    }

    private static final ErrorEvent unbanUser$lambda$133$lambda$132(AbstractC26202e it) {
        AbstractC22676k.m65750j(it, "it");
        return new ErrorEvent.BlockUserError(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 unblockUser$lambda$145(MessageListController messageListController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        messageListController.getClass();
        String strMo77807a = error.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        messageListController.emitEvent((ErrorEvent.BlockUserError) unblockUser$lambda$145$lambda$144(error));
        return C23454a0.f92919a;
    }

    private static final ErrorEvent unblockUser$lambda$145$lambda$144(AbstractC26202e it) {
        AbstractC22676k.m65750j(it, "it");
        return new ErrorEvent.BlockUserError(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 unflagUser$lambda$141(MessageListController messageListController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        messageListController.getClass();
        String strMo77807a = error.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        messageListController.emitEvent((ErrorEvent.UnflagUserError) unflagUser$lambda$141$lambda$140(error));
        return C23454a0.f92919a;
    }

    private static final ErrorEvent unflagUser$lambda$141$lambda$140(AbstractC26202e it) {
        AbstractC22676k.m65750j(it, "it");
        return new ErrorEvent.UnflagUserError(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 unmuteUser$lambda$111(MessageListController messageListController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        messageListController.getClass();
        String strMo77807a = error.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        messageListController.emitEvent((ErrorEvent.UnmuteUserError) unmuteUser$lambda$111$lambda$110(error));
        return C23454a0.f92919a;
    }

    private static final ErrorEvent unmuteUser$lambda$111$lambda$110(AbstractC26202e it) {
        AbstractC22676k.m65750j(it, "it");
        return new ErrorEvent.UnmuteUserError(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 unmuteUser$lambda$129(MessageListController messageListController, AbstractC26202e streamError) {
        AbstractC22676k.m65750j(streamError, "streamError");
        String strMo77807a = streamError.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 unpinMessage$lambda$104(MessageListController messageListController, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        messageListController.getClass();
        String strMo77807a = error.mo77807a();
        C2345k logger = messageListController.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, strMo77807a, null);
        }
        messageListController.emitEvent((ErrorEvent.UnpinMessageError) unpinMessage$lambda$104$lambda$103(error));
        return C23454a0.f92919a;
    }

    private static final ErrorEvent unpinMessage$lambda$104$lambda$103(AbstractC26202e it) {
        AbstractC22676k.m65750j(it, "it");
        return new ErrorEvent.UnpinMessageError(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCurrentUser(User currentUser) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[updateCurrentUser] #messageList; currentUser.id: ", currentUser != null ? currentUser.getId() : null), null);
        }
        setMessageListState(MessageListState.copy$default((MessageListState) ((C13045h2) this._messageListState).getValue(), null, false, false, false, false, false, currentUser, null, 0, null, null, null, 4031, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateEndOfOldMessagesReached(boolean endOfOldMessagesReached) {
        boolean z4;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            z4 = endOfOldMessagesReached;
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30462p("[updateEndOfOldMessagesReached] #messageList; endOfOldMessagesReached: ", z4), null);
        } else {
            z4 = endOfOldMessagesReached;
        }
        setMessageListState(MessageListState.copy$default((MessageListState) ((C13045h2) this._messageListState).getValue(), null, false, z4, false, false, false, null, null, 0, null, null, null, 4091, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateIsLoadingNewerMessages(boolean isLoadingNewerMessages) {
        boolean z4;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            z4 = isLoadingNewerMessages;
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30462p("[updateIsLoadingNewerMessages] #messageList; isLoadingNewerMessages: ", z4), null);
        } else {
            z4 = isLoadingNewerMessages;
        }
        setMessageListState(MessageListState.copy$default((MessageListState) ((C13045h2) this._messageListState).getValue(), null, false, false, false, z4, false, null, null, 0, null, null, null, 4079, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateIsLoadingOlderMessages(boolean isLoadingOlderMessages) {
        boolean z4;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            z4 = isLoadingOlderMessages;
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30462p("[updateIsLoadingOlderMessages] #messageList; isLoadingOlderMessages: ", z4), null);
        } else {
            z4 = isLoadingOlderMessages;
        }
        setMessageListState(MessageListState.copy$default((MessageListState) ((C13045h2) this._messageListState).getValue(), null, false, false, false, false, z4, null, null, 0, null, null, null, 4063, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMessageList(MessageListState newState) {
        MessageListItemState messageListItemStatePrevious;
        MessageListItemState messageListItemStatePrevious2;
        MessageListItemState messageListItemStatePrevious3;
        if (((MessageListState) ((C13045h2) this._messageListState).getValue()).getMessageItems().isEmpty() && !newState.getEndOfNewMessagesReached() && this.messageId == null) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[updateMessageList] #messageList; rejected (N1)", null);
                return;
            }
            return;
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            InterfaceC2344j interfaceC2344j = logger2.f9274b;
            List<MessageListItemState> messageItems = newState.getMessageItems();
            ArrayList arrayList = new ArrayList();
            for (Object obj : messageItems) {
                if (obj instanceof HasMessageListItemState) {
                    arrayList.add(obj);
                }
            }
            HasMessageListItemState hasMessageListItemState = (HasMessageListItemState) AbstractC25265s.m74100H0(arrayList);
            String strStringify = hasMessageListItemState != null ? MessageListItemStateKt.stringify(hasMessageListItemState) : null;
            List<MessageListItemState> messageItems2 = newState.getMessageItems();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : messageItems2) {
                if (obj2 instanceof HasMessageListItemState) {
                    arrayList2.add(obj2);
                }
            }
            HasMessageListItemState hasMessageListItemState2 = (HasMessageListItemState) AbstractC25265s.m74114R0(arrayList2);
            interfaceC2344j.log(enumC2341g2, str2, AbstractC31061c.m95640p("[updateMessageList] #messageList; first: ", strStringify, ", last: ", hasMessageListItemState2 != null ? MessageListItemStateKt.stringify(hasMessageListItemState2) : null), null);
        }
        List<MessageListItemState> messageItems3 = ((MessageListState) ((C13045h2) this._messageListState).getValue()).getMessageItems();
        ListIterator<MessageListItemState> listIterator = messageItems3.listIterator(messageItems3.size());
        do {
            if (!listIterator.hasPrevious()) {
                messageListItemStatePrevious = null;
                break;
            }
            messageListItemStatePrevious = listIterator.previous();
        } while (!(messageListItemStatePrevious instanceof HasMessageListItemState));
        HasMessageListItemState hasMessageListItemState3 = (HasMessageListItemState) messageListItemStatePrevious;
        Message message = hasMessageListItemState3 != null ? hasMessageListItemState3.getMessage() : null;
        List<MessageListItemState> messageItems4 = newState.getMessageItems();
        ListIterator<MessageListItemState> listIterator2 = messageItems4.listIterator(messageItems4.size());
        do {
            if (!listIterator2.hasPrevious()) {
                messageListItemStatePrevious2 = null;
                break;
            }
            messageListItemStatePrevious2 = listIterator2.previous();
        } while (!(messageListItemStatePrevious2 instanceof HasMessageListItemState));
        HasMessageListItemState hasMessageListItemState4 = (HasMessageListItemState) messageListItemStatePrevious2;
        Message message2 = hasMessageListItemState4 != null ? hasMessageListItemState4.getMessage() : null;
        Message message3 = this.lastLoadedMessage;
        List<MessageListItemState> messageItems5 = newState.getMessageItems();
        ListIterator<MessageListItemState> listIterator3 = messageItems5.listIterator(messageItems5.size());
        do {
            if (!listIterator3.hasPrevious()) {
                messageListItemStatePrevious3 = null;
                break;
            }
            messageListItemStatePrevious3 = listIterator3.previous();
        } while (!(messageListItemStatePrevious3 instanceof TypingItemState));
        NewMessageState newMessageState = getNewMessageState(message2, message3, (TypingItemState) messageListItemStatePrevious3);
        C2345k logger3 = getLogger();
        InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
        String str3 = logger3.f9273a;
        EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
        if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
            InterfaceC2344j interfaceC2344j2 = logger3.f9274b;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[updateMessageList] #messageList; oldLastMessage: ", message != null ? message.getText() : null, ", newLastMessage: ", message2 != null ? message2.getText() : null, ", newMessageState: ");
            sbM32001t.append(newMessageState);
            interfaceC2344j2.log(enumC2341g3, str3, sbM32001t.toString(), null);
        }
        setMessageListState(MessageListState.copy$default(newState, null, false, false, false, false, false, null, null, 0, newMessageState, null, null, 3583, null));
        if (newMessageState != null) {
            this.lastLoadedMessage = message2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUnreadCount(int unreadCount) {
        int i13;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            i13 = unreadCount;
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(i13, "[updateUnreadCount] #messageList; unreadCount: "), null);
        } else {
            i13 = unreadCount;
        }
        setMessageListState(MessageListState.copy$default((MessageListState) ((C13045h2) this._messageListState).getValue(), null, false, false, false, false, false, null, null, i13, null, null, null, 3839, null));
    }

    private final void updateUnreadLabel(UnreadLabel unreadLabel) {
        UnreadLabel unreadLabel2;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            StringBuilder sb4 = new StringBuilder("[updateUnreadLabel] #messageList; unreadLabel: ");
            unreadLabel2 = unreadLabel;
            sb4.append(unreadLabel2);
            interfaceC2344j.log(enumC2341g, str, sb4.toString(), null);
        } else {
            unreadLabel2 = unreadLabel;
        }
        setMessageListState(MessageListState.copy$default((MessageListState) ((C13045h2) this._messageListState).getValue(), null, false, false, false, false, false, null, null, 0, null, null, unreadLabel2, 2047, null));
    }

    public final void addPollOption(Poll poll, String option) {
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(option, "option");
        addPollOption(poll.getId(), option);
    }

    public final void banUser(String userId, String reason, Integer timeout) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC27476f.m82906d(this.chatClient.channel(this.cid).banUser(userId, reason, timeout), new C19591g(this, 4));
    }

    public final void blockUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC27476f.m82906d(this.chatClient.blockUser(userId), new C19591g(this, 9));
    }

    public final void castAnswer(String messageId, String pollId, String answer) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(answer, "answer");
        this.chatClient.castPollAnswer(messageId, pollId, answer).enqueue();
    }

    public final void castVote(String messageId, String pollId, Option option) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(option, "option");
        AbstractC27476f.m82906d(this.chatClient.castPollVote(messageId, pollId, option.getId()), new C19591g(this, 12));
    }

    public final void clearNewMessageState() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[clearNewMessageState] no args", null);
        }
        if (getMessagesState().getEndOfNewMessagesReached()) {
            C13045h2 c13045h2 = (C13045h2) this._threadListState;
            MessageListState messageListStateCopy$default = MessageListState.copy$default((MessageListState) c13045h2.getValue(), null, false, false, false, false, false, null, null, 0, null, null, null, 3327, null);
            c13045h2.getClass();
            c13045h2.m36571k(null, messageListStateCopy$default);
            setMessageListState(MessageListState.copy$default((MessageListState) ((C13045h2) this._messageListState).getValue(), null, false, false, false, false, false, null, null, 0, null, null, null, 3327, null));
        }
    }

    public final void closePoll(String pollId) {
        AbstractC22676k.m65750j(pollId, "pollId");
        InterfaceC27474d interfaceC27474dClosePoll = this.chatClient.closePoll(pollId);
        C19591g c19591g = new C19591g(this, 13);
        C19591g c19591g2 = new C19591g(this, 14);
        AbstractC22676k.m65750j(interfaceC27474dClosePoll, "<this>");
        interfaceC27474dClosePoll.enqueue(new C4312c(23, c19591g, c19591g2));
    }

    public final void deleteMessage(Message message, boolean hard) {
        AbstractC22676k.m65750j(message, "message");
        C13045h2 c13045h2 = (C13045h2) this._messageActions;
        Set set = (Set) c13045h2.getValue();
        Iterable iterable = (Iterable) ((C13045h2) this._messageActions).getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof Delete) {
                arrayList.add(obj);
            }
        }
        Set setM34605z = AbstractC12350b.m34605z(set, AbstractC25265s.m74103I1(arrayList));
        c13045h2.getClass();
        c13045h2.m36571k(null, setM34605z);
        removeOverlay();
        pauseRunningAudioRecordings(message);
        AbstractC27476f.m82906d(this.chatClient.deleteMessage(message.getId(), hard), new C1945f(this, hard, 6));
    }

    public final void disableUnreadLabelButton() {
        UnreadLabel unreadLabel = (UnreadLabel) ((C13045h2) this.unreadLabelState).getValue();
        if (unreadLabel == null) {
            return;
        }
        this.showUnreadButtonState.mo36564a(Boolean.FALSE);
        InterfaceC13075p1 interfaceC13075p1 = this.unreadLabelState;
        UnreadLabel unreadLabelCopy$default = UnreadLabel.copy$default(unreadLabel, 0, null, false, 3, null);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, unreadLabelCopy$default);
    }

    public final void dismissAllMessageActions() {
        C13045h2 c13045h2 = (C13045h2) this._messageActions;
        c13045h2.getClass();
        c13045h2.m36571k(null, C25235a0.f99113w);
    }

    public final void dismissMessageAction(MessageAction messageAction) {
        AbstractC22676k.m65750j(messageAction, "messageAction");
        C13045h2 c13045h2 = (C13045h2) this._messageActions;
        LinkedHashSet linkedHashSetM34604y = AbstractC12350b.m34604y(messageAction, (Set) c13045h2.getValue());
        c13045h2.getClass();
        c13045h2.m36571k(null, linkedHashSetM34604y);
    }

    public final void displayPollMoreOptions(SelectedPoll selectedPoll) {
        InterfaceC13075p1 interfaceC13075p1 = this._pollState;
        ((PollState) ((C13045h2) interfaceC13075p1).getValue()).getClass();
        PollState pollState = new PollState(selectedPoll);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, pollState);
    }

    public final void enterNormalMode() {
        ((C13045h2) this._mode).m36570j(MessageMode.Normal.INSTANCE);
        InterfaceC13075p1 interfaceC13075p1 = this._threadListState;
        MessageListState messageListState = new MessageListState(null, false, false, false, false, false, null, null, 0, null, null, null, 4095, null);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, messageListState);
        this.lastLoadedThreadMessage = null;
        InterfaceC3027k1 interfaceC3027k1 = this.threadJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object enterThreadMode(Message message, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C195561 c195561;
        ChannelState channelState;
        Object repliesAsState$default;
        if (interfaceC30057d instanceof C195561) {
            c195561 = (C195561) interfaceC30057d;
            int i14 = c195561.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c195561.label = i14 - Integer.MIN_VALUE;
            } else {
                c195561 = new C195561(interfaceC30057d);
            }
        } else {
            c195561 = new C195561(interfaceC30057d);
        }
        C195561 c195562 = c195561;
        Object obj = c195562.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c195562.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            channelState = (ChannelState) this.channelState.getValue();
            if (channelState == null) {
                return c23454a0;
            }
            C13045h2 c13045h2 = (C13045h2) this._messageActions;
            LinkedHashSet linkedHashSetM34555D = AbstractC12350b.m34555D(new Reply(message), (Set) c13045h2.getValue());
            c13045h2.getClass();
            c13045h2.m36571k(null, linkedHashSetM34555D);
            ChatClient chatClient = this.chatClient;
            String id4 = message.getId();
            boolean z4 = this.threadLoadOrderOlderToNewer;
            c195562.L$0 = message;
            c195562.L$1 = channelState;
            c195562.I$0 = i13;
            c195562.label = 1;
            repliesAsState$default = ChatClientExtensions.getRepliesAsState$default(chatClient, id4, i13, z4, null, c195562, 8, null);
            if (repliesAsState$default == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChannelState channelState2 = (ChannelState) c195562.L$1;
            Message message2 = (Message) c195562.L$0;
            AbstractC34132o.m107864I(obj);
            channelState = channelState2;
            message = message2;
            repliesAsState$default = obj;
        }
        ThreadState threadState = (ThreadState) repliesAsState$default;
        InterfaceC13075p1 interfaceC13075p1 = this._mode;
        MessageMode.MessageThread messageThread = new MessageMode.MessageThread(message, threadState);
        C13045h2 c13045h3 = (C13045h2) interfaceC13075p1;
        c13045h3.getClass();
        c13045h3.m36571k(null, messageThread);
        observeThreadMessagesState(threadState.getParentId(), threadState.getMessages(), threadState.getEndOfOlderMessages(), channelState.getReads(), channelState.getMembers());
        return c23454a0;
    }

    public final void flagMessage(Message message, String reason, Map<String, String> customData, Function1 onResult) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(customData, "customData");
        AbstractC22676k.m65750j(onResult, "onResult");
        C13045h2 c13045h2 = (C13045h2) this._messageActions;
        Set set = (Set) c13045h2.getValue();
        Iterable iterable = (Iterable) ((C13045h2) this._messageActions).getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof Flag) {
                arrayList.add(obj);
            }
        }
        Set setM34605z = AbstractC12350b.m34605z(set, AbstractC25265s.m74103I1(arrayList));
        c13045h2.getClass();
        c13045h2.m36571k(null, setM34605z);
        this.chatClient.flagMessage(message.getId(), reason, customData).enqueue(new C19590f(onResult, this, 0));
    }

    public final void flagUser(String userId, String reason, Map<String, String> customData) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(customData, "customData");
        AbstractC27476f.m82906d(this.chatClient.flagUser(userId, reason, customData), new C19591g(this, 6));
    }

    public final InterfaceC13037f2 getChannel() {
        return this.channel;
    }

    public final InterfaceC13037f2 getChannelState() {
        return this.channelState;
    }

    public final InterfaceC13037f2 getConnectionState() {
        return this.connectionState;
    }

    public final InterfaceC13037f2 getErrorEvents() {
        return this.errorEvents;
    }

    public final InterfaceC13087t1 getEvents() {
        return this.events;
    }

    public final String getLastSeenMessageId$stream_chat_android_ui_common_release() {
        return isInThread() ? this.lastSeenThreadMessageId : this.lastSeenChannelMessageId;
    }

    public final InterfaceC13037f2 getListState() {
        return this.listState;
    }

    public final InterfaceC13037f2 getMessageActions() {
        return this.messageActions;
    }

    public final InterfaceC13037f2 getMessageFooterVisibilityState() {
        return this.messageFooterVisibilityState;
    }

    public final Message getMessageFromListStateById(String messageId) {
        Object next;
        AbstractC22676k.m65750j(messageId, "messageId");
        Iterator<T> it = ((MessageListState) this.listState.getValue()).getMessageItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            MessageListItemState messageListItemState = (MessageListItemState) next;
            if ((messageListItemState instanceof MessageItemState) && AbstractC22676k.m65745e(((MessageItemState) messageListItemState).getMessage().getId(), messageId)) {
                break;
            }
        }
        MessageItemState messageItemState = next instanceof MessageItemState ? (MessageItemState) next : null;
        if (messageItemState != null) {
            return messageItemState.getMessage();
        }
        return null;
    }

    public final int getMessageLimit() {
        return this.messageLimit;
    }

    public final InterfaceC13037f2 getMessageListState() {
        return this.messageListState;
    }

    public final InterfaceC13037f2 getMode() {
        return this.mode;
    }

    public final InterfaceC13037f2 getOwnCapabilities() {
        return this.ownCapabilities;
    }

    public final InterfaceC13037f2 getPollState() {
        return this.pollState;
    }

    public final InterfaceC13037f2 getShowSystemMessagesState() {
        return this.showSystemMessagesState;
    }

    public final InterfaceC13037f2 getThreadListState() {
        return this.threadListState;
    }

    public final boolean getThreadLoadOrderOlderToNewer() {
        return this.threadLoadOrderOlderToNewer;
    }

    public final InterfaceC13037f2 getTypingUsers() {
        return this.typingUsers;
    }

    public final InterfaceC13037f2 getUnreadCount() {
        return this.unreadCount;
    }

    public final InterfaceC13075p1 getUnreadLabelState() {
        return this.unreadLabelState;
    }

    public final InterfaceC13037f2 getUser() {
        return this.user;
    }

    public final void hideUnreadSeparator() {
        ((C13045h2) this.unreadLabelState).m36570j(null);
    }

    public final boolean isInThread() {
        return ((C13045h2) this._mode).getValue() instanceof MessageMode.MessageThread;
    }

    /* JADX INFO: renamed from: isInsideSearch, reason: from getter */
    public final InterfaceC13037f2 getIsInsideSearch() {
        return this.isInsideSearch;
    }

    /* JADX INFO: renamed from: isStartedForThread, reason: from getter */
    public final boolean getIsStartedForThread() {
        return this.isStartedForThread;
    }

    public final void loadMessageById(String messageId, Function1 onResult) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(onResult, "onResult");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[loadMessageById] messageId: ".concat(messageId), null);
        }
        ((C27478h) ChatClientExtensions.loadMessageById(this.chatClient, this.cid, messageId)).enqueue(new C2953i(onResult, this, messageId, 4));
    }

    public final void loadNewerMessages(String baseMessageId, int messageLimit) {
        AbstractC22676k.m65750j(baseMessageId, "baseMessageId");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC25012a.m73374g(messageLimit, "[loadNewerMessages] baseMessageId: ", baseMessageId, ", messageLimit: "), null);
        }
        if (this.clientState.isOffline()) {
            return;
        }
        MessageMode messageMode = (MessageMode) ((C13045h2) this._mode).getValue();
        if (messageMode instanceof MessageMode.Normal) {
            loadNewerChannelMessages(baseMessageId, messageLimit);
        } else {
            if (!(messageMode instanceof MessageMode.MessageThread)) {
                throw new NoWhenBranchMatchedException();
            }
            loadNewerMessagesInThread((MessageMode.MessageThread) messageMode);
        }
    }

    public final void loadOlderMessages(int messageLimit) {
        InterfaceC13037f2 loadingOlderMessages;
        InterfaceC13037f2 endOfOlderMessages;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(messageLimit, "[loadOlderMessages] messageLimit: "), null);
        }
        if (this.clientState.isOffline()) {
            return;
        }
        MessageMode messageMode = (MessageMode) ((C13045h2) this._mode).getValue();
        boolean z4 = false;
        if (!(messageMode instanceof MessageMode.Normal)) {
            if (!(messageMode instanceof MessageMode.MessageThread)) {
                throw new NoWhenBranchMatchedException();
            }
            threadLoadMore$default(this, (MessageMode.MessageThread) messageMode, 0, 2, null);
            return;
        }
        ChannelState channelState = (ChannelState) this.channelState.getValue();
        boolean z13 = (channelState == null || (endOfOlderMessages = channelState.getEndOfOlderMessages()) == null || !((Boolean) endOfOlderMessages.getValue()).booleanValue()) ? false : true;
        ChannelState channelState2 = (ChannelState) this.channelState.getValue();
        if (channelState2 != null && (loadingOlderMessages = channelState2.getLoadingOlderMessages()) != null && ((Boolean) loadingOlderMessages.getValue()).booleanValue()) {
            z4 = true;
        }
        if (z13 || z4) {
            return;
        }
        ((C27478h) ChatClientExtensions.loadOlderMessages(this.chatClient, this.cid, messageLimit)).enqueue();
    }

    public final void markLastMessageRead() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[markLastMessageRead] cid: ", this.cid), null);
        }
        this.debouncer.submit(new C19586b(this, 1));
    }

    public final void markUnread(Message message, Function1 onResult) {
        InterfaceC27474d interfaceC27474dMarkThreadUnread;
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(onResult, "onResult");
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(this.cid);
        String str = (String) c23465kCidToTypeAndId.f92937w;
        String str2 = (String) c23465kCidToTypeAndId.f92938x;
        MessageMode messageMode = (MessageMode) this.mode.getValue();
        if (messageMode instanceof MessageMode.Normal) {
            interfaceC27474dMarkThreadUnread = this.chatClient.markUnread(str, str2, message.getId());
        } else {
            if (!(messageMode instanceof MessageMode.MessageThread)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC27474dMarkThreadUnread = this.chatClient.markThreadUnread(str, str2, ((MessageMode.MessageThread) messageMode).getParentMessage().getId());
        }
        interfaceC27474dMarkThreadUnread.enqueue(new C19590f(onResult, this, 1));
    }

    public final void muteUser(User user) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC27476f.m82906d(ChatClient.muteUser$default(this.chatClient, user.getId(), null, 2, null), new C19591g(this, 22));
    }

    public final void onCleared() {
        getOriginalTranslationsStore().clear();
        AbstractC3006f0.m8714h(this.scope, null);
    }

    public final Object openRelatedThread(Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objEnterThreadSequential;
        boolean zIsThreadStart = MessageUtils.isThreadStart(message);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zIsThreadStart) {
            Object objEnterThreadMode$default = enterThreadMode$default(this, message, 0, interfaceC30057d, 2, null);
            return objEnterThreadMode$default == EnumC31071a.f128113w ? objEnterThreadMode$default : c23454a0;
        }
        String parentId = message.getParentId();
        return (parentId == null || (objEnterThreadSequential = enterThreadSequential(parentId, interfaceC30057d)) != EnumC31071a.f128113w) ? c23454a0 : objEnterThreadSequential;
    }

    public final void pauseAudioRecordingAttachments() {
        this.chatClient.getAudioPlayer().pause();
    }

    public final void performGiphyAction(GiphyAction action) {
        InterfaceC27474d interfaceC27474dCancelEphemeralMessage;
        AbstractC22676k.m65750j(action, "action");
        Message message = action.getMessage();
        if (action instanceof SendGiphy) {
            interfaceC27474dCancelEphemeralMessage = this.chatClient.sendGiphy(message);
        } else if (action instanceof ShuffleGiphy) {
            interfaceC27474dCancelEphemeralMessage = this.chatClient.shuffleGiphy(message);
        } else {
            if (!(action instanceof CancelGiphy)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC27474dCancelEphemeralMessage = ChatClientExtensions.cancelEphemeralMessage(this.chatClient, message);
        }
        AbstractC27476f.m82906d(interfaceC27474dCancelEphemeralMessage, new C18468h(this, action, message, 17));
    }

    public final Object performMessageAction(MessageAction messageAction, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        removeOverlay();
        boolean z4 = messageAction instanceof Resend;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (z4) {
            resendMessage(((Resend) messageAction).getMessage());
            return c23454a0;
        }
        if (messageAction instanceof ThreadReply) {
            Object objEnterThreadMode$default = enterThreadMode$default(this, ((ThreadReply) messageAction).getMessage(), 0, interfaceC30057d, 2, null);
            if (objEnterThreadMode$default == EnumC31071a.f128113w) {
                return objEnterThreadMode$default;
            }
        } else {
            if ((messageAction instanceof Delete) || (messageAction instanceof Flag)) {
                C13045h2 c13045h2 = (C13045h2) this._messageActions;
                LinkedHashSet linkedHashSetM34555D = AbstractC12350b.m34555D(messageAction, (Set) c13045h2.getValue());
                c13045h2.getClass();
                c13045h2.m36571k(null, linkedHashSetM34555D);
                return c23454a0;
            }
            if (messageAction instanceof MuteUser) {
                muteUser(((MuteUser) messageAction).getMessage().getUser());
                return c23454a0;
            }
            if (messageAction instanceof UnmuteUser) {
                unmuteUser(((UnmuteUser) messageAction).getMessage().getUser());
                return c23454a0;
            }
            if (messageAction instanceof BlockUser) {
                blockUser(((BlockUser) messageAction).getMessage().getUser().getId());
                return c23454a0;
            }
            if (messageAction instanceof UnblockUser) {
                unblockUser(((UnblockUser) messageAction).getMessage().getUser().getId());
                return c23454a0;
            }
            if (messageAction instanceof Copy) {
                copyMessage(((Copy) messageAction).getMessage());
                return c23454a0;
            }
            if (messageAction instanceof React) {
                React react = (React) messageAction;
                reactToMessage(react.getReaction(), react.getMessage(), react.getSkipPush());
                return c23454a0;
            }
            if (messageAction instanceof Pin) {
                updateMessagePin(((Pin) messageAction).getMessage());
                return c23454a0;
            }
            if (messageAction instanceof MarkAsUnread) {
                markUnread$default(this, ((MarkAsUnread) messageAction).getMessage(), null, 2, null);
            }
        }
        return c23454a0;
    }

    public final void pinMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        pinMessage(message, null);
    }

    public final void reactToMessage(final Reaction reaction, Message message, boolean skipPush) {
        AbstractC22676k.m65750j(reaction, "reaction");
        AbstractC22676k.m65750j(message, "message");
        List<Reaction> ownReactions = message.getOwnReactions();
        if (!(ownReactions instanceof Collection) || !ownReactions.isEmpty()) {
            Iterator<T> it = ownReactions.iterator();
            while (it.hasNext()) {
                if (AbstractC22676k.m65745e(((Reaction) it.next()).getType(), reaction.getType())) {
                    final int i13 = 0;
                    AbstractC27476f.m82906d(this.chatClient.deleteReaction(message.getId(), reaction.getType(), this.cid), new Function1(this) { // from class: io.getstream.chat.android.ui.common.feature.messages.list.d

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ MessageListController f74455x;

                        {
                            this.f74455x = this;
                        }

                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i13) {
                                case 0:
                                    MessageListController.reactToMessage$lambda$120(this.f74455x, reaction, (AbstractC26202e) obj);
                                    break;
                                default:
                                    MessageListController.reactToMessage$lambda$122(this.f74455x, reaction, (AbstractC26202e) obj);
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    });
                    return;
                }
            }
        }
        final int i14 = 1;
        AbstractC27476f.m82906d(this.chatClient.sendReaction(reaction, this.enforceUniqueReactions, this.cid, skipPush), new Function1(this) { // from class: io.getstream.chat.android.ui.common.feature.messages.list.d

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MessageListController f74455x;

            {
                this.f74455x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        MessageListController.reactToMessage$lambda$120(this.f74455x, reaction, (AbstractC26202e) obj);
                        break;
                    default:
                        MessageListController.reactToMessage$lambda$122(this.f74455x, reaction, (AbstractC26202e) obj);
                        break;
                }
                return C23454a0.f92919a;
            }
        });
    }

    public final void removeAttachment(String messageId, Attachment attachmentToBeDeleted) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(attachmentToBeDeleted, "attachmentToBeDeleted");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[removeAttachment] messageId: " + messageId + ", attachmentToBeDeleted: " + attachmentToBeDeleted, null);
        }
        ((C27478h) ChatClientExtensions.loadMessageById(this.chatClient, this.cid, messageId)).enqueue(new C2953i(this, messageId, attachmentToBeDeleted, 3));
    }

    public final void removeOverlay() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[removeOverlay] no args", null);
        }
        C13045h2 c13045h2 = (C13045h2) this._threadListState;
        MessageListState messageListStateCopy$default = MessageListState.copy$default((MessageListState) c13045h2.getValue(), null, false, false, false, false, false, null, null, 0, null, null, null, 3071, null);
        c13045h2.getClass();
        c13045h2.m36571k(null, messageListStateCopy$default);
        setMessageListState(MessageListState.copy$default((MessageListState) ((C13045h2) this._messageListState).getValue(), null, false, false, false, false, false, null, null, 0, null, null, null, 3071, null));
    }

    public final void removeShadowBanFromUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC27476f.m82906d(this.chatClient.channel(this.cid).removeShadowBan(userId), new C19591g(this, 11));
    }

    public final void removeVote(String messageId, String pollId, Vote vote) {
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(vote, "vote");
        AbstractC27476f.m82906d(this.chatClient.removePollVote(messageId, pollId, vote.getId()), new C19591g(this, 15));
    }

    public final void resendMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(message.getCid());
        AbstractC27476f.m82906d(ChatClient.sendMessage$default(this.chatClient, (String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x, message, false, 8, null), new C19591g(this, 8));
    }

    public final void scrollToBottom(int messageLimit, InterfaceC4339a scrollToBottom) {
        ChannelState channelState;
        InterfaceC13037f2 endOfNewerMessages;
        AbstractC22676k.m65750j(scrollToBottom, "scrollToBottom");
        if (isInThread() || !((channelState = (ChannelState) this.channelState.getValue()) == null || (endOfNewerMessages = channelState.getEndOfNewerMessages()) == null || !((Boolean) endOfNewerMessages.getValue()).booleanValue())) {
            scrollToBottom.invoke();
        } else {
            ((C27478h) ChatClientExtensions.loadNewestMessages$default(this.chatClient, this.cid, messageLimit, false, 4, null)).enqueue(new C4312c(5, scrollToBottom, this));
        }
    }

    public final void scrollToFirstUnreadMessage() {
        Object next;
        UnreadLabel unreadLabel = (UnreadLabel) ((C13045h2) this.unreadLabelState).getValue();
        if (unreadLabel != null) {
            List<MessageListItemState> messageItems = getMessagesState().getMessageItems();
            ArrayList arrayList = new ArrayList();
            for (Object obj : messageItems) {
                if (obj instanceof MessageItemState) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((MessageItemState) it.next()).getMessage());
            }
            Iterator it3 = arrayList2.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!AbstractC22676k.m65745e(((Message) next).getId(), unreadLabel.getLastReadMessageId()));
            Message message = (Message) next;
            if (message != null) {
                focusUnreadMessage(arrayList2, message.getId());
            } else {
                AbstractC3006f0.m8732z(this.scope, null, null, new MessageListController$scrollToFirstUnreadMessage$1$3$1(this, unreadLabel, null), 3);
            }
        }
        disableUnreadLabelButton();
    }

    public final void scrollToMessage(String messageId, String parentMessageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        focusMessage(messageId, parentMessageId);
    }

    public final void selectExtendedReactions(Message message) {
        if (message != null) {
            changeSelectMessageState(new SelectedMessageReactionsPickerState(message, (Channel) this.channel.getValue()));
        }
    }

    public final void selectMessage(Message message) {
        SelectedMessageState selectedMessageFailedModerationState = null;
        if (message != null) {
            User currentUser = this.chatClient.getCurrentUser();
            selectedMessageFailedModerationState = MessageUtils.isModerationError(message, currentUser != null ? currentUser.getId() : null) ? new SelectedMessageFailedModerationState(message, (Channel) this.channel.getValue()) : new SelectedMessageOptionsState(message, (Channel) this.channel.getValue());
        }
        changeSelectMessageState(selectedMessageFailedModerationState);
    }

    public final void selectReactions(Message message) {
        if (message != null) {
            changeSelectMessageState(new SelectedMessageReactionsState(message, (Channel) this.channel.getValue()));
        }
    }

    public final void setDateSeparatorHandler(DateSeparatorHandler dateSeparatorHandler) {
        InterfaceC13075p1 interfaceC13075p1 = this._dateSeparatorHandler;
        if (dateSeparatorHandler == null) {
            dateSeparatorHandler = new C19585a(2);
        }
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, dateSeparatorHandler);
    }

    public final void setLastSeenMessageId$stream_chat_android_ui_common_release(String str) {
        if (isInThread()) {
            this.lastSeenThreadMessageId = str;
        } else {
            this.lastSeenChannelMessageId = str;
        }
    }

    public final void setMessageFooterVisibility(MessageFooterVisibility messageFooterVisibility) {
        AbstractC22676k.m65750j(messageFooterVisibility, "messageFooterVisibility");
        C13045h2 c13045h2 = (C13045h2) this._messageFooterVisibilityState;
        c13045h2.getClass();
        c13045h2.m36571k(null, messageFooterVisibility);
    }

    public final void setMessagePositionHandler(MessagePositionHandler messagePositionHandler) {
        AbstractC22676k.m65750j(messagePositionHandler, "messagePositionHandler");
        C13045h2 c13045h2 = (C13045h2) this._messagePositionHandler;
        c13045h2.getClass();
        c13045h2.m36571k(null, messagePositionHandler);
    }

    public final void setSystemMessageVisibility(boolean areSystemMessagesVisible) {
        InterfaceC13075p1 interfaceC13075p1 = this._showSystemMessagesState;
        Boolean boolValueOf = Boolean.valueOf(areSystemMessagesVisible);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, boolValueOf);
    }

    public final void setThreadDateSeparatorHandler(DateSeparatorHandler threadDateSeparatorHandler) {
        InterfaceC13075p1 interfaceC13075p1 = this._threadDateSeparatorHandler;
        if (threadDateSeparatorHandler == null) {
            threadDateSeparatorHandler = new C19585a(3);
        }
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, threadDateSeparatorHandler);
    }

    public final void shadowBanUser(String userId, String reason, Integer timeout) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC27476f.m82906d(this.chatClient.channel(this.cid).shadowBanUser(userId, reason, timeout), new C19591g(this, 19));
    }

    public final void toggleOriginalText(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        getOriginalTranslationsStore().toggleOriginalText(messageId);
    }

    public final void unbanUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC27476f.m82906d(this.chatClient.channel(this.cid).unbanUser(userId), new C19591g(this, 7));
    }

    public final void unblockUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC27476f.m82906d(this.chatClient.unblockUser(userId), new C19591g(this, 1));
    }

    public final void unflagUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC27476f.m82906d(this.chatClient.unflagUser(userId), new C19591g(this, 21));
    }

    public final void unmuteUser(User user) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC27476f.m82906d(this.chatClient.unmuteUser(user.getId()), new C19591g(this, 20));
    }

    public final void unpinMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC31061c.m95640p("[unpinMessage] message.id: ", message.getId(), ", message.text: ", message.getText()), null);
        }
        AbstractC27476f.m82906d(this.chatClient.unpinMessage(message), new C19591g(this, 5));
    }

    public final void updateLastSeenMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        Message message2 = isInThread() ? this.lastLoadedThreadMessage : this.lastLoadedMessage;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            boolean zIsInThread = isInThread();
            String id4 = message.getId();
            String text = message.getText();
            String id5 = message2 != null ? message2.getId() : null;
            String text2 = message2 != null ? message2.getText() : null;
            StringBuilder sbM38567n = AbstractC13673n.m38567n("[updateLastSeenMessage] isInThread: ", ", message: ", id4, "('", zIsInThread);
            AbstractC11266d.m30444B(sbM38567n, text, "'), lastLoadedMessage: ", id5, "('");
            interfaceC2344j.log(enumC2341g, str, AbstractC25012a.m73376i(text2, "')", sbM38567n), null);
        }
        if (AbstractC22676k.m65745e(message.getId(), message2 != null ? message2.getId() : null)) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, AbstractC3855a.m11827k("[updateLastSeenMessage] matched(isInThread: ", ")", isInThread()), null);
            }
            markLastMessageRead();
        }
    }

    public final void updateMessagePin(Message message) {
        AbstractC22676k.m65750j(message, "message");
        if (message.getPinned()) {
            unpinMessage(message);
        } else {
            pinMessage(message, null);
        }
    }

    public final void updatePollOption(Message message, Poll poll, Option option) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(option, "option");
        AbstractC3006f0.m8732z(this.scope, null, null, new C195841(poll, this, message, option, null), 3);
    }

    public final void updatePollState(Poll poll, Message message, PollSelectionType pollSelectionType) {
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(pollSelectionType, "pollSelectionType");
        InterfaceC13075p1 interfaceC13075p1 = this._pollState;
        PollState pollState = (PollState) ((C13045h2) interfaceC13075p1).getValue();
        SelectedPoll selectedPoll = new SelectedPoll(poll, message, pollSelectionType);
        pollState.getClass();
        PollState pollState2 = new PollState(selectedPoll);
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, pollState2);
    }

    public final void updateUserMute(User user) {
        AbstractC22676k.m65750j(user, "user");
        Iterable iterable = (Iterable) ChatClientExtensions.getGlobalState(this.chatClient).getMuted().getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                User target = ((Mute) it.next()).getTarget();
                if (AbstractC22676k.m65745e(target != null ? target.getId() : null, user.getId())) {
                    unmuteUser(user);
                    return;
                }
            }
        }
        muteUser(user);
    }

    public final void addPollOption(String pollId, String option) {
        AbstractC22676k.m65750j(pollId, "pollId");
        AbstractC22676k.m65750j(option, "option");
        AbstractC3006f0.m8732z(this.scope, null, null, new C195531(pollId, option, null), 3);
    }

    public final void muteUser(String userId, Integer timeout) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC27476f.m82906d(this.chatClient.muteUser(userId, timeout), new C19591g(this, 10));
    }

    public final void pinMessage(Message message, Date expiresAt) {
        AbstractC22676k.m65750j(message, "message");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[pinMessage] message.id: ", message.getId(), ", message.text: ", message.getText(), ", expiresAt: ");
            sbM32001t.append(expiresAt);
            interfaceC2344j.log(enumC2341g, str, sbM32001t.toString(), null);
        }
        AbstractC27476f.m82906d(this.chatClient.pinMessage(message, expiresAt), new C19591g(this, 18));
    }

    public final void unmuteUser(String userId) {
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC27476f.m82906d(this.chatClient.unmuteUser(userId), new C19591g(this, 16));
    }

    public final void closePoll(Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        AbstractC3006f0.m8732z(this.scope, null, null, new C195543(poll, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object enterThreadSequential(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C195583 c195583;
        if (interfaceC30057d instanceof C195583) {
            c195583 = (C195583) interfaceC30057d;
            int i13 = c195583.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c195583.label = i13 - Integer.MIN_VALUE;
            } else {
                c195583 = new C195583(interfaceC30057d);
            }
        } else {
            c195583 = new C195583(interfaceC30057d);
        }
        Object objAwait = c195583.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c195583.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAwait);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str2 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                logger.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[enterThreadSequential] parentMessageId: ", str), null);
            }
            InterfaceC27474d messageUsingCache = ChatClientExtensions.getMessageUsingCache(this.chatClient, str);
            c195583.L$0 = null;
            c195583.label = 1;
            objAwait = ((C27478h) messageUsingCache).await(c195583);
            if (objAwait != obj) {
            }
            return obj;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objAwait);
            return c23454a0;
        }
        AbstractC34132o.m107864I(objAwait);
        AbstractC26205h abstractC26205h = (AbstractC26205h) objAwait;
        if (abstractC26205h instanceof C26204g) {
            Message message = (Message) ((C26204g) abstractC26205h).f103919a;
            c195583.L$0 = null;
            c195583.L$1 = null;
            c195583.label = 2;
            if (enterThreadSequential(message, c195583) == obj) {
                return obj;
            }
        } else if (abstractC26205h instanceof C26203f) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str3 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str3)) {
                logger2.f9274b.log(enumC2341g2, str3, AbstractC11895b.m31996o("[enterThreadSequential] -> Could not get message: ", ((C26203f) abstractC26205h).f103918a.mo77807a(), "."), null);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return c23454a0;
    }

    public MessageListController(String str, ClipboardHandler clipboardHandler, boolean z4, String str2, String str3, int i13, ChatClient chatClient, ClientState clientState, InterfaceC13037f2 interfaceC13037f2, boolean z13, MessageFooterVisibility messageFooterVisibility, boolean z14, DateSeparatorHandler dateSeparatorHandler, DateSeparatorHandler dateSeparatorHandler2, MessagePositionHandler messagePositionHandler, boolean z15, boolean z16, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        DateSeparatorHandler c19585a;
        String str4 = (i14 & 8) != 0 ? null : str2;
        String str5 = (i14 & 16) != 0 ? null : str3;
        int i15 = (i14 & 32) != 0 ? 30 : i13;
        ChatClient chatClientInstance = (i14 & 64) != 0 ? ChatClient.INSTANCE.instance() : chatClient;
        ClientState clientState2 = (i14 & 128) != 0 ? chatClientInstance.getClientState() : clientState;
        boolean z17 = (i14 & 512) != 0 ? true : z13;
        MessageFooterVisibility messageFooterVisibility2 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? MessageFooterVisibility.LastInGroup.INSTANCE : messageFooterVisibility;
        boolean z18 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z14;
        DateSeparatorHandler defaultDateSeparatorHandler = (i14 & 4096) != 0 ? DateSeparatorHandler.INSTANCE.getDefaultDateSeparatorHandler() : dateSeparatorHandler;
        if ((i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
            DateSeparatorHandler.INSTANCE.getClass();
            c19585a = new C19585a(1);
        } else {
            c19585a = dateSeparatorHandler2;
        }
        this(str, clipboardHandler, z4, str4, str5, i15, chatClientInstance, clientState2, interfaceC13037f2, z17, messageFooterVisibility2, z18, defaultDateSeparatorHandler, c19585a, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? MessagePositionHandler.Companion.defaultHandler$default(MessagePositionHandler.INSTANCE, 0L, 1, null) : messagePositionHandler, (32768 & i14) != 0 ? false : z15, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? false : z16);
    }
}
